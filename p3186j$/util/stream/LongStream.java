package p3186j$.util.stream;

import p3186j$.util.OptionalLong;
import p3186j$.util.function.LongConsumer;

/* renamed from: j$.util.stream.LongStream */
public interface LongStream extends BaseStream<Long, LongStream> {
    void forEachOrdered(LongConsumer longConsumer);

    OptionalLong max();

    long sum();

    long[] toArray();
}
