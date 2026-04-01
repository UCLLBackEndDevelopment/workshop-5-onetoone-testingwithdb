package be.ucll.unit.repository;

import be.ucll.model.Profile;
import be.ucll.repository.ProfileRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ProfileRepositoryStub implements ProfileRepository {

    @Override
    public void deleteInBatch(Iterable<Profile> entities) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public void flush() {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public <S extends Profile> S saveAndFlush(S entity) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public <S extends Profile> List<S> saveAllAndFlush(Iterable<S> entities) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public void deleteAllInBatch(Iterable<Profile> entities) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public void deleteAllInBatch() {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public Profile getOne(Long aLong) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public Profile getById(Long aLong) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public Profile getReferenceById(Long aLong) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public <S extends Profile> List<S> findAll(Example<S> example) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public <S extends Profile> List<S> findAll(Example<S> example, Sort sort) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public <S extends Profile> List<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public List<Profile> findAll() {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public List<Profile> findAllById(Iterable<Long> longs) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public <S extends Profile> S save(S entity) {
        return entity;
    }

    @Override
    public Optional<Profile> findById(Long aLong) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public boolean existsById(Long aLong) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public void deleteById(Long aLong) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public void delete(Profile entity) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public void deleteAll(Iterable<? extends Profile> entities) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public List<Profile> findAll(Sort sort) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public Page<Profile> findAll(Pageable pageable) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public <S extends Profile> Optional<S> findOne(Example<S> example) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public <S extends Profile> Page<S> findAll(Example<S> example, Pageable pageable) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public <S extends Profile> long count(Example<S> example) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public <S extends Profile> boolean exists(Example<S> example) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public <S extends Profile, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        throw new UnsupportedOperationException("Unimplemented method");
    }
}
