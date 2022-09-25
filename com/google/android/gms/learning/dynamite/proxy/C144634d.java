package com.google.android.gms.learning.dynamite.proxy;

/* renamed from: com.google.android.gms.learning.dynamite.proxy.d */
/* compiled from: PG */
public final /* synthetic */ class C144634d {

    /* renamed from: a */
    public final /* synthetic */ C144635e f391348a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f391349b;

    /* renamed from: c */
    public final /* synthetic */ long f391350c;

    public /* synthetic */ C144634d(C144635e eVar, byte[] bArr, long j) {
        this.f391348a = eVar;
        this.f391349b = bArr;
        this.f391350c = j;
    }

    /* renamed from: a */
    public final void mo120091a(byte[] bArr, boolean z) {
        boolean z2 = z;
        C144635e eVar = this.f391348a;
        byte[] bArr2 = this.f391349b;
        long j = this.f391350c;
        long addAndGet = eVar.f391354d.addAndGet(eVar.f391352b.mo26884a() - eVar.f391353c.get());
        C144642l lVar = eVar.f391351a;
        if (true != z2) {
            bArr2 = null;
        }
        byte[] bArr3 = bArr2;
        long j2 = 0;
        long j3 = true != z2 ? 0 : j;
        if (true == z2) {
            j2 = addAndGet;
        }
        lVar.mo120096e(bArr, z, bArr3, j3, j2);
        if (!z2) {
            eVar.f391353c.set(eVar.f391352b.mo26884a());
        }
    }
}
