package com.google.android.apps.gsa.staticplugins.opa.util;

import android.os.Bundle;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.v */
/* compiled from: PG */
final class C113891v extends C113858cm {

    /* renamed from: a */
    private final CharSequence f315333a;

    /* renamed from: b */
    private final QueryTriggerType f315334b;

    /* renamed from: c */
    private final Bundle f315335c;

    /* renamed from: d */
    private final C58833ax f315336d;

    /* renamed from: e */
    private final C58833ax f315337e;

    /* renamed from: f */
    private final boolean f315338f;

    /* renamed from: g */
    private final boolean f315339g;

    /* renamed from: h */
    private final C58833ax f315340h;

    /* renamed from: i */
    private final C58833ax f315341i;

    /* renamed from: j */
    private final C58833ax f315342j;

    public C113891v(CharSequence charSequence, QueryTriggerType queryTriggerType, Bundle bundle, C58833ax axVar, C58833ax axVar2, boolean z, boolean z2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5) {
        this.f315333a = charSequence;
        this.f315334b = queryTriggerType;
        this.f315335c = bundle;
        this.f315336d = axVar;
        this.f315337e = axVar2;
        this.f315338f = z;
        this.f315339g = z2;
        this.f315340h = axVar3;
        this.f315341i = axVar4;
        this.f315342j = axVar5;
    }

    /* renamed from: a */
    public final Bundle mo100711a() {
        return this.f315335c;
    }

    /* renamed from: b */
    public final QueryTriggerType mo100712b() {
        return this.f315334b;
    }

    /* renamed from: c */
    public final C58833ax mo100713c() {
        return this.f315341i;
    }

    /* renamed from: d */
    public final C58833ax mo100714d() {
        return this.f315337e;
    }

    /* renamed from: e */
    public final C58833ax mo100715e() {
        return this.f315336d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C113858cm) {
            C113858cm cmVar = (C113858cm) obj;
            return this.f315333a.equals(cmVar.mo100718h()) && this.f315334b.equals(cmVar.mo100712b()) && this.f315335c.equals(cmVar.mo100711a()) && this.f315336d.equals(cmVar.mo100715e()) && this.f315337e.equals(cmVar.mo100714d()) && this.f315338f == cmVar.mo100720j() && this.f315339g == cmVar.mo100719i() && this.f315340h.equals(cmVar.mo100716f()) && this.f315341i.equals(cmVar.mo100713c()) && this.f315342j.equals(cmVar.mo100717g());
        }
    }

    /* renamed from: f */
    public final C58833ax mo100716f() {
        return this.f315340h;
    }

    /* renamed from: g */
    public final C58833ax mo100717g() {
        return this.f315342j;
    }

    /* renamed from: h */
    public final CharSequence mo100718h() {
        return this.f315333a;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((this.f315333a.hashCode() ^ 1000003) * 1000003) ^ this.f315334b.hashCode()) * 1000003) ^ this.f315335c.hashCode()) * 1000003) ^ this.f315336d.hashCode()) * 1000003) ^ this.f315337e.hashCode()) * 1000003) ^ (true != this.f315338f ? 1237 : 1231)) * 1000003;
        if (true == this.f315339g) {
            i = 1231;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f315340h.hashCode()) * 1000003) ^ this.f315341i.hashCode()) * 1000003) ^ this.f315342j.hashCode();
    }

    /* renamed from: i */
    public final boolean mo100719i() {
        return this.f315339g;
    }

    /* renamed from: j */
    public final boolean mo100720j() {
        return this.f315338f;
    }

    public final String toString() {
        String obj = this.f315333a.toString();
        String obj2 = this.f315334b.toString();
        String obj3 = this.f315335c.toString();
        String valueOf = String.valueOf(this.f315336d);
        String valueOf2 = String.valueOf(this.f315337e);
        boolean z = this.f315338f;
        boolean z2 = this.f315339g;
        String valueOf3 = String.valueOf(this.f315340h);
        String valueOf4 = String.valueOf(this.f315341i);
        String valueOf5 = String.valueOf(this.f315342j);
        return "OpaTextQuery{queryText=" + obj + ", queryTriggerType=" + obj2 + ", queryExtras=" + obj3 + ", interactionInfo=" + valueOf + ", autocompleteUiStats=" + valueOf2 + ", trustUserIfOnTrustedDevice=" + z + ", addUserSession=" + z2 + ", suggestionProcessingParams=" + valueOf3 + ", assistantTextQueryInfo=" + valueOf4 + ", tapasClientSession=" + valueOf5 + "}";
    }
}
