package com.google.android.apps.gsa.staticplugins.opa.p8307au;

import android.view.View;
import com.google.android.libraries.logging.C28292j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.au.a */
/* compiled from: PG */
final class C107581a extends C107607r {

    /* renamed from: a */
    public C58833ax f299301a;

    /* renamed from: b */
    public C28292j f299302b;

    /* renamed from: c */
    public C58833ax f299303c;

    /* renamed from: d */
    public C58833ax f299304d;

    /* renamed from: e */
    private View f299305e;

    public C107581a() {
        C58836b bVar = C58836b.f156633a;
        this.f299301a = bVar;
        this.f299303c = bVar;
        this.f299304d = bVar;
    }

    /* renamed from: a */
    public final C107608s mo96046a() {
        C28292j jVar;
        View view = this.f299305e;
        if (view != null && (jVar = this.f299302b) != null) {
            return new C107588b(view, this.f299301a, jVar, this.f299303c, this.f299304d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f299305e == null) {
            sb.append(" contentView");
        }
        if (this.f299302b == null) {
            sb.append(" ve");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo96047b(View view) {
        if (view != null) {
            this.f299305e = view;
            return;
        }
        throw new NullPointerException("Null contentView");
    }
}
