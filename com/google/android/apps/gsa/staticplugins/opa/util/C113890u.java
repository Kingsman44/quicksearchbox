package com.google.android.apps.gsa.staticplugins.opa.util;

import android.os.Bundle;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.u */
/* compiled from: PG */
public final class C113890u extends C113855cj {

    /* renamed from: a */
    public CharSequence f315322a;

    /* renamed from: b */
    public Bundle f315323b;

    /* renamed from: c */
    public C58833ax f315324c;

    /* renamed from: d */
    public C58833ax f315325d;

    /* renamed from: e */
    public C58833ax f315326e;

    /* renamed from: f */
    public C58833ax f315327f;

    /* renamed from: g */
    public C58833ax f315328g;

    /* renamed from: h */
    private QueryTriggerType f315329h;

    /* renamed from: i */
    private boolean f315330i;

    /* renamed from: j */
    private boolean f315331j;

    /* renamed from: k */
    private byte f315332k;

    public C113890u() {
        C58836b bVar = C58836b.f156633a;
        this.f315324c = bVar;
        this.f315325d = bVar;
        this.f315326e = bVar;
        this.f315327f = bVar;
        this.f315328g = bVar;
    }

    /* renamed from: a */
    public final C113858cm mo100703a() {
        CharSequence charSequence;
        QueryTriggerType queryTriggerType;
        Bundle bundle;
        if (this.f315332k == 3 && (charSequence = this.f315322a) != null && (queryTriggerType = this.f315329h) != null && (bundle = this.f315323b) != null) {
            return new C113891v(charSequence, queryTriggerType, bundle, this.f315324c, this.f315325d, this.f315330i, this.f315331j, this.f315326e, this.f315327f, this.f315328g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f315322a == null) {
            sb.append(" queryText");
        }
        if (this.f315329h == null) {
            sb.append(" queryTriggerType");
        }
        if (this.f315323b == null) {
            sb.append(" queryExtras");
        }
        if ((this.f315332k & 1) == 0) {
            sb.append(" trustUserIfOnTrustedDevice");
        }
        if ((this.f315332k & 2) == 0) {
            sb.append(" addUserSession");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo100704b(boolean z) {
        this.f315331j = z;
        this.f315332k = (byte) (this.f315332k | 2);
    }

    /* renamed from: c */
    public final void mo100705c(CharSequence charSequence) {
        if (charSequence != null) {
            this.f315322a = charSequence;
            return;
        }
        throw new NullPointerException("Null queryText");
    }

    /* renamed from: d */
    public final void mo100706d(QueryTriggerType queryTriggerType) {
        if (queryTriggerType != null) {
            this.f315329h = queryTriggerType;
            return;
        }
        throw new NullPointerException("Null queryTriggerType");
    }

    /* renamed from: e */
    public final void mo100707e(boolean z) {
        this.f315330i = z;
        this.f315332k = (byte) (this.f315332k | 1);
    }
}
