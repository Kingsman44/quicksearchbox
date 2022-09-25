package com.google.android.libraries.onegoogle.account.particle;

import androidx.lifecycle.C2391v;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.onegoogle.account.particle.h */
/* compiled from: PG */
public final class C30234h extends C30232f {

    /* renamed from: a */
    public C2391v f81729a;

    /* renamed from: b */
    public C58833ax f81730b;

    /* renamed from: c */
    public C58833ax f81731c;

    /* renamed from: d */
    public C58833ax f81732d;

    public C30234h() {
        C58836b bVar = C58836b.f156633a;
        this.f81730b = bVar;
        this.f81731c = bVar;
        this.f81732d = bVar;
    }

    public C30234h(C30233g gVar) {
        C58836b bVar = C58836b.f156633a;
        this.f81730b = bVar;
        this.f81731c = bVar;
        this.f81732d = bVar;
        C30235i iVar = (C30235i) gVar;
        this.f81729a = iVar.f81733a;
        this.f81730b = iVar.f81734b;
        this.f81731c = iVar.f81735c;
        this.f81732d = iVar.f81736d;
    }

    /* renamed from: a */
    public final C30233g mo35704a() {
        C2391v vVar = this.f81729a;
        if (vVar != null) {
            return new C30235i(vVar, this.f81730b, this.f81731c, this.f81732d);
        }
        throw new IllegalStateException("Missing required properties: lifecycleOwner");
    }

    /* renamed from: b */
    public final void mo35705b(C58833ax axVar) {
        this.f81730b = axVar;
    }
}
