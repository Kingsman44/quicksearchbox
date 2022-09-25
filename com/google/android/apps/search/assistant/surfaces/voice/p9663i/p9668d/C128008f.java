package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d;

import java.util.Random;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.f */
/* compiled from: PG */
public final /* synthetic */ class C128008f implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ Random f352282a;

    public /* synthetic */ C128008f(Random random) {
        this.f352282a = random;
    }

    public final Object get() {
        long nextLong = this.f352282a.nextLong();
        if (nextLong == 0) {
            return "0";
        }
        if (nextLong > 0) {
            return Long.toString(nextLong, 16);
        }
        int i = 64;
        char[] cArr = new char[64];
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(16);
        do {
            i--;
            cArr[i] = Character.forDigit(((int) nextLong) & 15, 16);
            nextLong >>>= numberOfTrailingZeros;
        } while (nextLong != 0);
        return new String(cArr, i, 64 - i);
    }
}
