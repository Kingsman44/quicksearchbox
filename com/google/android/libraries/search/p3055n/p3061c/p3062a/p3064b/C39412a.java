package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3064b;

import com.google.android.libraries.search.p3055n.C39767h;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39393ai;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39411b;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39425bb;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.search.n.c.a.b.a */
/* compiled from: PG */
public final class C39412a extends C39418g {

    /* renamed from: a */
    public C39425bb f103759a;

    /* renamed from: b */
    public C39767h f103760b;

    /* renamed from: c */
    public C58833ax f103761c = C58836b.f156633a;

    /* renamed from: d */
    public boolean f103762d;

    /* renamed from: e */
    public boolean f103763e;

    /* renamed from: f */
    public boolean f103764f;

    /* renamed from: g */
    public C39393ai f103765g;

    /* renamed from: h */
    public boolean f103766h;

    /* renamed from: i */
    public byte f103767i;

    /* renamed from: j */
    private boolean f103768j;

    /* renamed from: k */
    private C39411b f103769k;

    public C39412a() {
    }

    public C39412a(C39419h hVar) {
        C39413b bVar = (C39413b) hVar;
        this.f103759a = bVar.f103770a;
        this.f103760b = bVar.f103771b;
        this.f103761c = bVar.f103772c;
        this.f103762d = bVar.f103773d;
        this.f103768j = bVar.f103774e;
        this.f103763e = bVar.f103775f;
        this.f103769k = bVar.f103776g;
        this.f103764f = bVar.f103777h;
        this.f103765g = bVar.f103778i;
        this.f103766h = bVar.f103779j;
        this.f103767i = 31;
    }

    /* renamed from: a */
    public final C39419h mo41822a() {
        C39425bb bbVar;
        C39767h hVar;
        C39411b bVar;
        if (this.f103767i == 31 && (bbVar = this.f103759a) != null && (hVar = this.f103760b) != null && (bVar = this.f103769k) != null) {
            return new C39413b(bbVar, hVar, this.f103761c, this.f103762d, this.f103768j, this.f103763e, bVar, this.f103764f, this.f103765g, this.f103766h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f103759a == null) {
            sb.append(" internalHotwordConfig");
        }
        if (this.f103760b == null) {
            sb.append(" hotwordConfig");
        }
        if ((this.f103767i & 1) == 0) {
            sb.append(" dspAvailable");
        }
        if ((this.f103767i & 2) == 0) {
            sb.append(" hotwordRunning");
        }
        if ((this.f103767i & 4) == 0) {
            sb.append(" voiceMatchEnabled");
        }
        if (this.f103769k == null) {
            sb.append(" actionRequestInfo");
        }
        if ((this.f103767i & 8) == 0) {
            sb.append(" voiceMatchEnforced");
        }
        if ((this.f103767i & 16) == 0) {
            sb.append(" isScreenOn");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo41823b(C39411b bVar) {
        if (bVar != null) {
            this.f103769k = bVar;
            return;
        }
        throw new NullPointerException("Null actionRequestInfo");
    }

    /* renamed from: c */
    public final void mo41824c(Boolean bool) {
        if (bool != null) {
            this.f103768j = bool.booleanValue();
            this.f103767i = (byte) (this.f103767i | 2);
            return;
        }
        throw new NullPointerException("Null hotwordRunning");
    }
}
