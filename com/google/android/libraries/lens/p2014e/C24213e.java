package com.google.android.libraries.lens.p2014e;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56226ag;

/* renamed from: com.google.android.libraries.lens.e.e */
/* compiled from: PG */
public final class C24213e extends C24230v {

    /* renamed from: a */
    public C24231w f66184a;

    /* renamed from: b */
    public C58833ax f66185b;

    /* renamed from: c */
    public C58833ax f66186c;

    /* renamed from: d */
    public C58833ax f66187d;

    /* renamed from: e */
    public C58833ax f66188e;

    /* renamed from: f */
    public C58833ax f66189f;

    /* renamed from: g */
    public C58485gu f66190g;

    /* renamed from: h */
    public C58833ax f66191h;

    /* renamed from: i */
    public boolean f66192i;

    /* renamed from: j */
    public C56226ag f66193j;

    /* renamed from: k */
    public C58833ax f66194k;

    /* renamed from: l */
    public byte f66195l;

    /* renamed from: m */
    public int f66196m;

    /* renamed from: n */
    public int f66197n;

    /* renamed from: o */
    public int f66198o;

    /* renamed from: p */
    public int f66199p;

    public C24213e() {
        C58836b bVar = C58836b.f156633a;
        this.f66185b = bVar;
        this.f66186c = bVar;
        this.f66187d = bVar;
        this.f66188e = bVar;
        this.f66189f = bVar;
        this.f66191h = bVar;
        this.f66194k = bVar;
    }

    /* renamed from: a */
    public final void mo29750a(C56226ag agVar) {
        if (agVar != null) {
            this.f66193j = agVar;
            return;
        }
        throw new NullPointerException("Null clientTextSelection");
    }

    /* renamed from: b */
    public final void mo29751b(boolean z) {
        this.f66192i = z;
        this.f66195l = 1;
    }

    /* renamed from: c */
    public final void mo29752c(C24231w wVar) {
        if (wVar != null) {
            this.f66184a = wVar;
            return;
        }
        throw new NullPointerException("Null origin");
    }

    /* renamed from: d */
    public final void mo29753d(int i) {
        if (i != 0) {
            this.f66196m = i;
            return;
        }
        throw new NullPointerException("Null selectionType");
    }

    /* renamed from: e */
    public final void mo29754e(C58485gu guVar) {
        if (guVar != null) {
            this.f66190g = guVar;
            return;
        }
        throw new NullPointerException("Null tappedObjects");
    }

    /* renamed from: f */
    public final void mo29755f(int i) {
        if (i != 0) {
            this.f66197n = i;
            return;
        }
        throw new NullPointerException("Null autoTextSelectionMode");
    }
}
