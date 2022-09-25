package com.google.android.gms.learning.p10821b;

import com.google.common.p4552o.p4554b.p4555a.C59628h;
import java.io.Closeable;

/* renamed from: com.google.android.gms.learning.b.a */
/* compiled from: PG */
public final /* synthetic */ class C144574a implements Closeable {

    /* renamed from: a */
    public final /* synthetic */ C144576c f391215a;

    /* renamed from: b */
    public final /* synthetic */ String f391216b;

    /* renamed from: c */
    public final /* synthetic */ C59628h f391217c;

    /* renamed from: d */
    public final /* synthetic */ long f391218d;

    public /* synthetic */ C144574a(C144576c cVar, String str, C59628h hVar, long j) {
        this.f391215a = cVar;
        this.f391216b = str;
        this.f391217c = hVar;
        this.f391218d = j;
    }

    public final void close() {
        byte[] bArr;
        C144576c cVar = this.f391215a;
        String str = this.f391216b;
        C59628h hVar = this.f391217c;
        long j = this.f391218d;
        if (hVar == null) {
            bArr = null;
        } else {
            bArr = hVar.toByteArray();
        }
        cVar.mo120059l(str, bArr, cVar.f391222b.mo34860b() - j);
    }
}
