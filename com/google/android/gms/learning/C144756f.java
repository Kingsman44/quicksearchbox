package com.google.android.gms.learning;

import com.google.android.gms.learning.internal.C144772d;
import com.google.android.gms.learning.internal.C144781m;
import com.google.android.gms.learning.internal.C144783o;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.gms.p10793f.C144166k;
import com.google.p3728as.p3729a.p3730a.C48030j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.gms.learning.f */
/* compiled from: PG */
final class C144756f extends C144783o {

    /* renamed from: a */
    final /* synthetic */ C144757g f391604a;

    public C144756f(C144757g gVar) {
        this.f391604a = gVar;
    }

    /* renamed from: a */
    public final void mo120186a(String str, C144165j jVar, C144165j jVar2, C144781m mVar) {
        C144772d dVar = new C144772d(mVar);
        C48030j jVar3 = C48030j.f124314b;
        this.f391604a.mo92057a(str, (byte[]) C144166k.m234388a(jVar), (byte[]) C144166k.m234388a(jVar2), dVar);
    }

    /* renamed from: b */
    public final void mo120187b(String str, C144165j jVar, C144165j jVar2, C144781m mVar, C144165j jVar3) {
        C48030j jVar4 = C48030j.f124314b;
        byte[] bArr = (byte[]) C144166k.m234388a(jVar3);
        if (bArr != null) {
            try {
                C48030j jVar5 = (C48030j) C62942bv.parseFrom((C62942bv) C48030j.f124314b, bArr, C62921ba.m95368a());
            } catch (C62974ct e) {
                new C144772d(mVar).mo120205b(e.getMessage());
                return;
            }
        }
        this.f391604a.mo92057a(str, (byte[]) C144166k.m234388a(jVar), (byte[]) C144166k.m234388a(jVar2), new C144772d(mVar));
    }

    /* renamed from: c */
    public final boolean mo120188c() {
        return true;
    }
}
