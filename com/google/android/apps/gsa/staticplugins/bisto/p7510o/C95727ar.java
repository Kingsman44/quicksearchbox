package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.ar */
/* compiled from: PG */
public final /* synthetic */ class C95727ar implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95728as f268006a;

    /* renamed from: b */
    public final /* synthetic */ ByteBuffer f268007b;

    /* renamed from: c */
    public final /* synthetic */ int f268008c;

    /* renamed from: d */
    public final /* synthetic */ int f268009d;

    /* renamed from: e */
    public final /* synthetic */ boolean f268010e;

    /* renamed from: f */
    public final /* synthetic */ C95723an f268011f;

    public /* synthetic */ C95727ar(C95728as asVar, ByteBuffer byteBuffer, int i, int i2, boolean z, C95723an anVar) {
        this.f268006a = asVar;
        this.f268007b = byteBuffer;
        this.f268008c = i;
        this.f268009d = i2;
        this.f268010e = z;
        this.f268011f = anVar;
    }

    public final void run() {
        C95728as asVar = this.f268006a;
        ByteBuffer byteBuffer = this.f268007b;
        int i = this.f268008c;
        int i2 = this.f268009d;
        boolean z = this.f268010e;
        C95723an anVar = this.f268011f;
        byte[] copyOfRange = Arrays.copyOfRange(byteBuffer.array(), i, i2 + i);
        if (z) {
            asVar.f268012a.mo89700z(copyOfRange);
        } else {
            anVar.mo89679b(copyOfRange);
        }
    }
}
