package com.google.common.base;

import java.util.Random;

/* renamed from: com.google.common.base.bm */
/* compiled from: PG */
final class C58849bm extends Random {
    private static final long serialVersionUID = 898001275432099254L;

    /* renamed from: a */
    private final boolean f156647a = true;

    public final void setSeed(long j) {
        if (!this.f156647a) {
            super.setSeed(j);
            return;
        }
        throw new UnsupportedOperationException("Setting the seed on the shared Random object is not permitted");
    }
}
