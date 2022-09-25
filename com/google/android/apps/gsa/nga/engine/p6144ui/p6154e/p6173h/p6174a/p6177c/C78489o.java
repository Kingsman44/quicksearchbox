package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80696by;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80734di;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.o */
/* compiled from: PG */
final class C78489o extends C78390bm {

    /* renamed from: a */
    public Optional f216153a = Optional.empty();

    /* renamed from: b */
    public int f216154b;

    /* renamed from: c */
    private C78393bp f216155c;

    /* renamed from: d */
    private C80734di f216156d;

    /* renamed from: e */
    private C80696by f216157e;

    public C78489o() {
    }

    /* renamed from: a */
    public final C78391bn mo73338a() {
        if (this.f216155c != null && this.f216156d != null && this.f216157e != null && this.f216154b != 0) {
            return new C78490p(this.f216155c, this.f216156d, this.f216157e, this.f216154b, this.f216153a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f216155c == null) {
            sb.append(" content");
        }
        if (this.f216156d == null) {
            sb.append(" heroChip");
        }
        if (this.f216157e == null) {
            sb.append(" blueBar");
        }
        if (this.f216154b == 0) {
            sb.append(" inputPlateType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo73339b(C80696by byVar) {
        if (byVar != null) {
            this.f216157e = byVar;
            return;
        }
        throw new NullPointerException("Null blueBar");
    }

    /* renamed from: c */
    public final void mo73340c(C78393bp bpVar) {
        if (bpVar != null) {
            this.f216155c = bpVar;
            return;
        }
        throw new NullPointerException("Null content");
    }

    /* renamed from: d */
    public final void mo73341d(C80734di diVar) {
        if (diVar != null) {
            this.f216156d = diVar;
            return;
        }
        throw new NullPointerException("Null heroChip");
    }

    /* renamed from: e */
    public final void mo73342e(Optional optional) {
        if (optional != null) {
            this.f216153a = optional;
            return;
        }
        throw new NullPointerException("Null tactileContentKey");
    }

    public C78489o(C78391bn bnVar) {
        C78490p pVar = (C78490p) bnVar;
        this.f216155c = pVar.f216158a;
        this.f216156d = pVar.f216159b;
        this.f216157e = pVar.f216160c;
        this.f216154b = pVar.f216162e;
        this.f216153a = pVar.f216161d;
    }
}
