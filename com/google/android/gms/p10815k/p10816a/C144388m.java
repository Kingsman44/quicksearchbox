package com.google.android.gms.p10815k.p10816a;

import com.google.android.gms.common.api.internal.C143783cd;
import com.google.android.gms.p10815k.C144406f;
import com.google.android.gms.p10815k.C144417q;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Collections;

/* renamed from: com.google.android.gms.k.a.m */
/* compiled from: PG */
final class C144388m implements C143783cd {

    /* renamed from: a */
    final /* synthetic */ byte[] f390966a;

    public C144388m(byte[] bArr) {
        this.f390966a = bArr;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo118340b(Object obj) {
        C144417q qVar = (C144417q) obj;
        try {
            qVar.mo36195a(Collections.unmodifiableMap(((C144406f) C62942bv.parseFrom((C62942bv) C144406f.f390987b, this.f390966a, C62921ba.m95368a())).f390989a));
        } catch (C62974ct e) {
            throw new IllegalStateException("Failed parsing account alerts proto", e);
        }
    }

    /* renamed from: c */
    public final void mo118341c() {
    }
}
