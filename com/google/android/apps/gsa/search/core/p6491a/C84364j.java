package com.google.android.apps.gsa.search.core.p6491a;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58495hd;

/* renamed from: com.google.android.apps.gsa.search.core.a.j */
/* compiled from: PG */
public final class C84364j extends C84368n {

    /* renamed from: a */
    public C84380z f229608a;

    /* renamed from: b */
    public C58495hd f229609b;

    /* renamed from: c */
    public C58833ax f229610c;

    /* renamed from: d */
    public C58833ax f229611d;

    /* renamed from: e */
    public C58833ax f229612e;

    /* renamed from: f */
    public C58833ax f229613f;

    /* renamed from: g */
    public C58833ax f229614g;

    /* renamed from: h */
    private int f229615h;

    /* renamed from: i */
    private byte f229616i;

    public C84364j() {
        C58836b bVar = C58836b.f156633a;
        this.f229610c = bVar;
        this.f229611d = bVar;
        this.f229612e = bVar;
        this.f229613f = bVar;
        this.f229614g = bVar;
    }

    /* renamed from: a */
    public final C84369o mo77905a() {
        C84380z zVar;
        C58495hd hdVar;
        if (this.f229616i == 1 && (zVar = this.f229608a) != null && (hdVar = this.f229609b) != null) {
            return new C84365k(this.f229615h, zVar, hdVar, this.f229610c, this.f229611d, this.f229612e, this.f229613f, this.f229614g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f229616i == 0) {
            sb.append(" clientType");
        }
        if (this.f229608a == null) {
            sb.append(" legacyResponseCallbacks");
        }
        if (this.f229609b == null) {
            sb.append(" customPerformers");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo77906b(int i) {
        this.f229615h = i;
        this.f229616i = 1;
    }

    /* renamed from: c */
    public final void mo77907c(C84380z zVar) {
        if (zVar != null) {
            this.f229608a = zVar;
            return;
        }
        throw new NullPointerException("Null legacyResponseCallbacks");
    }
}
