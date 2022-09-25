package com.google.android.apps.search.pronunciationlearning.p10628a;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63088z;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.google.android.apps.search.pronunciationlearning.a.a */
/* compiled from: PG */
public final /* synthetic */ class C141294a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C141305l f383596a;

    /* renamed from: b */
    public final /* synthetic */ int f383597b;

    /* renamed from: c */
    public final /* synthetic */ int f383598c;

    public /* synthetic */ C141294a(C141305l lVar, int i, int i2) {
        this.f383596a = lVar;
        this.f383597b = i;
        this.f383598c = i2;
    }

    public final C60870cx apply(Object obj) {
        C141305l lVar = this.f383596a;
        int i = this.f383597b;
        int i2 = this.f383598c;
        byte[] N = C63088z.m96144F((InputStream) obj).mo59174N();
        return (i >= i2 || i < 0 || i2 > N.length) ? lVar.mo116334c(N) : lVar.mo116334c(Arrays.copyOfRange(N, i, i2));
    }
}
