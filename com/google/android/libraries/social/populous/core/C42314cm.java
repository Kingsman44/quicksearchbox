package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.social.populous.core.cm */
/* compiled from: PG */
public final class C42314cm implements C42313cl {

    /* renamed from: a */
    private final C42311cj f110966a;

    /* renamed from: b */
    private final String f110967b;

    /* renamed from: c */
    private final C58833ax f110968c;

    /* renamed from: d */
    private final C58833ax f110969d;

    /* renamed from: e */
    private final C58833ax f110970e;

    /* renamed from: f */
    private final boolean f110971f;

    public C42314cm(C42313cl clVar) {
        C42306ce ceVar = (C42306ce) clVar;
        C42305cd cdVar = ceVar.f110944f;
        this.f110966a = cdVar == null ? null : new C42311cj(cdVar);
        this.f110967b = ceVar.f110939a;
        this.f110968c = ceVar.f110940b;
        this.f110969d = ceVar.f110941c;
        this.f110970e = ceVar.f110942d;
        this.f110971f = ceVar.f110943e;
    }

    /* renamed from: a */
    public final C42310ci mo45275a() {
        return this.f110966a;
    }

    /* renamed from: b */
    public final C42313cl mo45276b() {
        return this;
    }

    /* renamed from: c */
    public final C58833ax mo45277c() {
        return this.f110968c;
    }

    /* renamed from: d */
    public final C58833ax mo45278d() {
        return this.f110969d;
    }

    /* renamed from: e */
    public final C58833ax mo45279e() {
        return this.f110970e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42313cl) {
            C42313cl clVar = (C42313cl) obj;
            return C58832aw.m90831a(this.f110966a, clVar.mo45275a()) && C58832aw.m90831a(this.f110967b, clVar.mo45281f()) && C58832aw.m90831a(this.f110968c, clVar.mo45277c()) && C58832aw.m90831a(this.f110969d, clVar.mo45278d()) && C58832aw.m90831a(this.f110970e, clVar.mo45279e()) && this.f110971f == clVar.mo45282g();
        }
    }

    /* renamed from: f */
    public final String mo45281f() {
        return this.f110967b;
    }

    /* renamed from: g */
    public final boolean mo45282g() {
        return this.f110971f;
    }

    /* renamed from: h */
    public final /* synthetic */ boolean mo45283h() {
        return C42312ck.m74509a(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f110966a, this.f110967b, this.f110968c, this.f110969d, this.f110970e, Boolean.valueOf(this.f110971f)});
    }

    /* renamed from: j */
    public final C42306ce mo45286j() {
        return new C42306ce(this);
    }
}
