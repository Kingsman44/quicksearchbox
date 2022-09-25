package com.google.android.gms.p10815k.p10816a;

import com.google.android.gms.common.api.internal.C143783cd;
import com.google.android.gms.p10815k.C144411k;
import com.google.android.gms.p10815k.C144418r;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Collections;

/* renamed from: com.google.android.gms.k.a.ac */
/* compiled from: PG */
final class C144361ac implements C143783cd {

    /* renamed from: a */
    final /* synthetic */ byte[] f390941a;

    public C144361ac(byte[] bArr) {
        this.f390941a = bArr;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo118340b(Object obj) {
        C144418r rVar = (C144418r) obj;
        try {
            rVar.mo36159a(Collections.unmodifiableMap(((C144411k) C62942bv.parseFrom((C62942bv) C144411k.f390997b, this.f390941a, C62921ba.m95368a())).f390999a));
        } catch (C62974ct e) {
            throw new IllegalStateException("Failed parsing account alerts proto", e);
        }
    }

    /* renamed from: c */
    public final void mo118341c() {
    }
}
