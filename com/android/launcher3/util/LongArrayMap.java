package com.android.launcher3.util;

import android.util.LongSparseArray;
import java.util.Iterator;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* compiled from: PG */
public final class LongArrayMap extends LongSparseArray implements Iterable {

    /* compiled from: PG */
    public final class ValueIterator implements Iterator, p3186j$.util.Iterator {
        private int mNextIndex = 0;

        public ValueIterator() {
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final boolean hasNext() {
            return this.mNextIndex < LongArrayMap.this.size();
        }

        public final Object next() {
            LongArrayMap longArrayMap = LongArrayMap.this;
            int i = this.mNextIndex;
            this.mNextIndex = i + 1;
            return longArrayMap.valueAt(i);
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean containsKey(long j) {
        return indexOfKey(j) >= 0;
    }

    public final boolean isEmpty() {
        return size() <= 0;
    }

    public final java.util.Iterator iterator() {
        return new ValueIterator();
    }

    public final LongArrayMap clone() {
        return (LongArrayMap) super.clone();
    }
}
