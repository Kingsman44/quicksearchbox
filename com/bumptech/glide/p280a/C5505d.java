package com.bumptech.glide.p280a;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.bumptech.glide.a.d */
/* compiled from: PG */
public final class C5505d {

    /* renamed from: a */
    public final String f16655a;

    /* renamed from: b */
    public final long[] f16656b;

    /* renamed from: c */
    public File[] f16657c;

    /* renamed from: d */
    public File[] f16658d;

    /* renamed from: e */
    public boolean f16659e;

    /* renamed from: f */
    public C5504c f16660f;

    /* renamed from: g */
    final /* synthetic */ C5507f f16661g;

    public C5505d(C5507f fVar, String str) {
        this.f16661g = fVar;
        this.f16655a = str;
        int i = fVar.f16666d;
        this.f16656b = new long[i];
        this.f16657c = new File[i];
        this.f16658d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < fVar.f16666d; i2 = 1) {
            sb.append(0);
            this.f16657c[0] = new File(fVar.f16663a, sb.toString());
            sb.append(".tmp");
            this.f16658d[0] = new File(fVar.f16663a, sb.toString());
            sb.setLength(length);
        }
    }

    /* renamed from: b */
    public static final IOException m14232b(String[] strArr) {
        throw new IOException("unexpected journal line: ".concat(String.valueOf(Arrays.toString(strArr))));
    }

    /* renamed from: a */
    public final String mo11844a() {
        StringBuilder sb = new StringBuilder();
        long[] jArr = this.f16656b;
        int length = jArr.length;
        for (int i = 0; i < length; i = 1) {
            long j = jArr[0];
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
