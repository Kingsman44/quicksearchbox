package com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d;

import com.google.common.p4552o.p4553a.C59496bt;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.i.c.b.d.u */
/* compiled from: PG */
public final class C121455u extends C121437c {

    /* renamed from: a */
    public Optional f337109a = Optional.empty();

    /* renamed from: b */
    public Optional f337110b = Optional.empty();

    /* renamed from: c */
    private C59496bt f337111c;

    public C121455u() {
    }

    /* renamed from: a */
    public final C121438d mo105146a() {
        if (this.f337111c != null) {
            return new C121456v(this.f337111c, this.f337109a, this.f337110b);
        }
        throw new IllegalStateException("Missing required properties: adjusterEventLog");
    }

    /* renamed from: b */
    public final void mo105147b(C59496bt btVar) {
        if (btVar != null) {
            this.f337111c = btVar;
            return;
        }
        throw new NullPointerException("Null adjusterEventLog");
    }

    public C121455u(C121438d dVar) {
        C121456v vVar = (C121456v) dVar;
        this.f337111c = vVar.f337112b;
        this.f337109a = vVar.f337113c;
        this.f337110b = vVar.f337114d;
    }
}
