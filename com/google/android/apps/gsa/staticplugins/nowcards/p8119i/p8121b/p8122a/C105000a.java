package com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.p8122a;

import android.view.ViewGroup;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91887k;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91890n;
import com.google.android.apps.p489g.p494d.C9215cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.i.b.a.a */
/* compiled from: PG */
final class C105000a extends C105008i {

    /* renamed from: a */
    public ViewGroup f292535a;

    /* renamed from: b */
    public C9215cx f292536b;

    /* renamed from: c */
    public long f292537c;

    /* renamed from: d */
    public C91890n f292538d;

    /* renamed from: e */
    public Optional f292539e = Optional.empty();

    /* renamed from: f */
    public Optional f292540f = Optional.empty();

    /* renamed from: g */
    public byte f292541g;

    /* renamed from: h */
    private boolean f292542h;

    public C105000a() {
    }

    /* renamed from: a */
    public final C105009j mo94443a() {
        ViewGroup viewGroup;
        C9215cx cxVar;
        C91890n nVar;
        if (this.f292541g == 3 && (viewGroup = this.f292535a) != null && (cxVar = this.f292536b) != null && (nVar = this.f292538d) != null) {
            return new C105001b(viewGroup, cxVar, this.f292537c, nVar, this.f292539e, this.f292540f, this.f292542h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f292535a == null) {
            sb.append(" videoContainer");
        }
        if (this.f292536b == null) {
            sb.append(" playVideoAction");
        }
        if ((this.f292541g & 1) == 0) {
            sb.append(" entryUpdateId");
        }
        if (this.f292538d == null) {
            sb.append(" videoUiManager");
        }
        if ((this.f292541g & 2) == 0) {
            sb.append(" impressionLogged");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo94444b(boolean z) {
        this.f292542h = z;
        this.f292541g = (byte) (this.f292541g | 2);
    }

    /* renamed from: c */
    public final void mo94445c(C91887k kVar) {
        this.f292540f = Optional.m71637of(kVar);
    }

    /* renamed from: d */
    public final void mo94446d(Optional optional) {
        if (optional != null) {
            this.f292540f = optional;
            return;
        }
        throw new NullPointerException("Null videoAutoplayer");
    }

    public C105000a(C105009j jVar) {
        C105001b bVar = (C105001b) jVar;
        this.f292535a = bVar.f292543a;
        this.f292536b = bVar.f292544b;
        this.f292537c = bVar.f292545c;
        this.f292538d = bVar.f292546d;
        this.f292539e = bVar.f292547e;
        this.f292540f = bVar.f292548f;
        this.f292542h = bVar.f292549g;
        this.f292541g = 3;
    }
}
