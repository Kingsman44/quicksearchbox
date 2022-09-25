package com.google.android.apps.gsa.nga.shared.p6352l.p6353a;

import android.os.Bundle;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.l.a.a */
/* compiled from: PG */
public final class C81344a {

    /* renamed from: a */
    public Bundle f222639a;

    /* renamed from: b */
    public Optional f222640b = Optional.empty();

    /* renamed from: c */
    public int f222641c;

    /* renamed from: d */
    private int f222642d;

    /* renamed from: e */
    private C58485gu f222643e;

    /* renamed from: f */
    private int f222644f;

    /* renamed from: g */
    private C58485gu f222645g;

    /* renamed from: h */
    private boolean f222646h;

    /* renamed from: i */
    private boolean f222647i;

    /* renamed from: j */
    private byte f222648j;

    /* renamed from: a */
    public final C81374h mo75011a() {
        Bundle bundle;
        C58485gu guVar;
        C58485gu guVar2;
        int i;
        if (this.f222648j == 15 && (bundle = this.f222639a) != null && (guVar = this.f222643e) != null && (guVar2 = this.f222645g) != null && (i = this.f222641c) != 0) {
            return new C81354b(bundle, this.f222642d, guVar, this.f222644f, guVar2, i, this.f222646h, this.f222640b, this.f222647i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f222639a == null) {
            sb.append(" flowBundle");
        }
        if ((this.f222648j & 1) == 0) {
            sb.append(" titleId");
        }
        if (this.f222643e == null) {
            sb.append(" titleArgs");
        }
        if ((this.f222648j & 2) == 0) {
            sb.append(" descriptionId");
        }
        if (this.f222645g == null) {
            sb.append(" descriptionArgs");
        }
        if (this.f222641c == 0) {
            sb.append(" triggerSource");
        }
        if ((this.f222648j & 4) == 0) {
            sb.append(" isCounterfactual");
        }
        if ((this.f222648j & 8) == 0) {
            sb.append(" skipNotificationEligibilityCheckAndCount");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo75012b(C58485gu guVar) {
        if (guVar != null) {
            this.f222645g = guVar;
            return;
        }
        throw new NullPointerException("Null descriptionArgs");
    }

    /* renamed from: c */
    public final void mo75013c(int i) {
        this.f222644f = i;
        this.f222648j = (byte) (this.f222648j | 2);
    }

    /* renamed from: d */
    public final void mo75014d(boolean z) {
        this.f222646h = z;
        this.f222648j = (byte) (this.f222648j | 4);
    }

    /* renamed from: e */
    public final void mo75015e(boolean z) {
        this.f222647i = z;
        this.f222648j = (byte) (this.f222648j | 8);
    }

    /* renamed from: f */
    public final void mo75016f(C58485gu guVar) {
        if (guVar != null) {
            this.f222643e = guVar;
            return;
        }
        throw new NullPointerException("Null titleArgs");
    }

    /* renamed from: g */
    public final void mo75017g(int i) {
        this.f222642d = i;
        this.f222648j = (byte) (this.f222648j | 1);
    }
}
