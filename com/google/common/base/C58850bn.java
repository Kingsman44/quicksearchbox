package com.google.common.base;

import java.security.SecureRandom;
import java.util.Random;

/* renamed from: com.google.common.base.bn */
/* compiled from: PG */
final class C58850bn extends Random {

    /* renamed from: a */
    private final boolean f156648a = true;

    /* renamed from: a */
    static final SecureRandom m90911a() {
        return (SecureRandom) C58851bo.f156651c.get();
    }

    /* access modifiers changed from: protected */
    public final int next(int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean nextBoolean() {
        return m90911a().nextBoolean();
    }

    public final void nextBytes(byte[] bArr) {
        m90911a().nextBytes(bArr);
    }

    public final double nextDouble() {
        return m90911a().nextDouble();
    }

    public final float nextFloat() {
        return m90911a().nextFloat();
    }

    public final double nextGaussian() {
        return m90911a().nextGaussian();
    }

    public final int nextInt() {
        return m90911a().nextInt();
    }

    public final long nextLong() {
        return m90911a().nextLong();
    }

    public final void setSeed(long j) {
        if (!this.f156648a) {
            super.setSeed(j);
            return;
        }
        throw new UnsupportedOperationException("Setting the seed on a thread-local Random object is not permitted");
    }

    public final int nextInt(int i) {
        return m90911a().nextInt(i);
    }
}
