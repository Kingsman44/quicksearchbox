package com.google.android.apps.gsa.staticplugins.opa.tapas.p8573r.p8576c;

import android.content.Context;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.assistant.shared.p.h;
import com.google.android.apps.gsa.binaries.satin.app.atu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8544h.C112070f;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8573r.p8575b.C113231d;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8573r.p8575b.C113232e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113383dx;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.r.c.b */
/* compiled from: PG */
public final class C113235b implements C113231d {

    /* renamed from: a */
    private final Optional f313566a;

    /* renamed from: b */
    private final C2391v f313567b;

    /* renamed from: c */
    private final Context f313568c;

    /* renamed from: d */
    private final C22871g f313569d;

    public C113235b(Optional optional, C2391v vVar, Context context, C22871g gVar) {
        this.f313566a = optional;
        this.f313567b = vVar;
        this.f313568c = context;
        this.f313569d = gVar;
    }

    /* renamed from: a */
    public final Optional mo99916a(h hVar) {
        if (this.f313566a.isEmpty()) {
            return Optional.empty();
        }
        C113381dv f = C113383dx.m187615f();
        atu atu = (atu) this.f313566a.get();
        atu.f204103a = C113383dx.m187611b();
        atu.f204104b = C113383dx.m187610a();
        atu.f204105c = C113383dx.m187612c();
        atu.f204107e = this.f313567b;
        atu.f204108f = f;
        atu.f204109g = f;
        atu.f204110h = C113383dx.m187614e();
        Context context = this.f313568c;
        context.getClass();
        atu.f204111i = context;
        atu.f204106d = hVar;
        atu.f204113k = new C113232e();
        atu.f204103a = C113383dx.m187611b();
        atu.f204110h = C113383dx.m187614e();
        atu.f204112j = C113383dx.m187613d();
        atu.f204104b = C113383dx.m187610a();
        atu.f204105c = C113383dx.m187612c();
        atu.mo68679b(C48674ai.ASSISTANT);
        C112070f a = atu.mo68678a();
        this.f313569d.mo28212l("drive LifecycleOwner and TapasLifecycleController state", new C113234a(hVar));
        return Optional.m71637of(a);
    }
}
