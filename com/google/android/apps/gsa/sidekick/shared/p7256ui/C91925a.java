package com.google.android.apps.gsa.sidekick.shared.p7256ui;

import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91667f;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91857e;
import com.google.android.apps.gsa.sidekick.shared.p7231b.C91647a;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.ui.a */
/* compiled from: PG */
public final class C91925a extends C91934j {

    /* renamed from: a */
    public C91647a f256363a;

    /* renamed from: b */
    public C91857e f256364b;

    /* renamed from: c */
    private C7718hj f256365c;

    /* renamed from: d */
    private C9141ad f256366d;

    /* renamed from: e */
    private C7681g f256367e;

    /* renamed from: f */
    private boolean f256368f;

    /* renamed from: g */
    private C7526an f256369g;

    /* renamed from: h */
    private C9277u f256370h;

    /* renamed from: i */
    private C91667f f256371i;

    /* renamed from: j */
    private byte f256372j;

    /* renamed from: a */
    public final C91935k mo86609a() {
        C7718hj hjVar;
        C7681g gVar;
        C91647a aVar;
        if (this.f256372j == 1 && (hjVar = this.f256365c) != null && (gVar = this.f256367e) != null && (aVar = this.f256363a) != null) {
            return new C91926b(hjVar, this.f256366d, gVar, this.f256368f, this.f256369g, this.f256370h, aVar, this.f256371i, this.f256364b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f256365c == null) {
            sb.append(" entry");
        }
        if (this.f256367e == null) {
            sb.append(" actionType");
        }
        if (this.f256372j == 0) {
            sb.append(" logAction");
        }
        if (this.f256363a == null) {
            sb.append(" actionLogger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo86610b(C7681g gVar) {
        if (gVar != null) {
            this.f256367e = gVar;
            return;
        }
        throw new NullPointerException("Null actionType");
    }

    /* renamed from: c */
    public final void mo86611c(C91667f fVar) {
        this.f256371i = fVar;
    }

    /* renamed from: d */
    public final void mo86612d(C7526an anVar) {
        this.f256369g = anVar;
    }

    /* renamed from: e */
    public final void mo86613e(C9141ad adVar) {
        this.f256366d = adVar;
    }

    /* renamed from: f */
    public final void mo86614f(C7718hj hjVar) {
        if (hjVar != null) {
            this.f256365c = hjVar;
            return;
        }
        throw new NullPointerException("Null entry");
    }

    /* renamed from: g */
    public final void mo86615g(boolean z) {
        this.f256368f = z;
        this.f256372j = 1;
    }

    /* renamed from: h */
    public final void mo86616h(C9277u uVar) {
        this.f256370h = uVar;
    }

    /* renamed from: i */
    public final void mo86617i(C91857e eVar) {
        this.f256364b = eVar;
    }
}
