package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b;

import com.google.android.apps.gsa.assistant.shared.l.e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.e.b.f */
/* compiled from: PG */
public final class C78247f extends C78242a {

    /* renamed from: a */
    public Optional f215383a = Optional.empty();

    /* renamed from: b */
    public Optional f215384b = Optional.empty();

    /* renamed from: c */
    public int f215385c;

    /* renamed from: d */
    public int f215386d;

    /* renamed from: e */
    public int f215387e;

    /* renamed from: f */
    private e f215388f;

    /* renamed from: g */
    private boolean f215389g;

    /* renamed from: h */
    private byte f215390h;

    /* renamed from: a */
    public final C78243b mo73166a() {
        int i;
        int i2;
        e eVar;
        int i3;
        if (this.f215390h == 1 && (i = this.f215387e) != 0 && (i2 = this.f215385c) != 0 && (eVar = this.f215388f) != null && (i3 = this.f215386d) != 0) {
            return new C78248g(i, i2, this.f215383a, this.f215384b, eVar, i3, this.f215389g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f215387e == 0) {
            sb.append(" state");
        }
        if (this.f215385c == 0) {
            sb.append(" cause");
        }
        if (this.f215388f == null) {
            sb.append(" opaTriggerType");
        }
        if (this.f215386d == 0) {
            sb.append(" uiType");
        }
        if (this.f215390h == 0) {
            sb.append(" isOptimizedOnShowInvcation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo73167b(boolean z) {
        this.f215389g = z;
        this.f215390h = 1;
    }

    /* renamed from: c */
    public final void mo73168c(e eVar) {
        if (eVar != null) {
            this.f215388f = eVar;
            return;
        }
        throw new NullPointerException("Null opaTriggerType");
    }
}
