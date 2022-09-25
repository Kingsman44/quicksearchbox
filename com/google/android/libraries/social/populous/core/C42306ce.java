package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.social.populous.core.ce */
/* compiled from: PG */
public final class C42306ce implements C42313cl {

    /* renamed from: a */
    public String f110939a;

    /* renamed from: b */
    public C58833ax f110940b;

    /* renamed from: c */
    public C58833ax f110941c;

    /* renamed from: d */
    public final C58833ax f110942d;

    /* renamed from: e */
    public boolean f110943e;

    /* renamed from: f */
    public C42305cd f110944f;

    public C42306ce() {
        this.f110944f = null;
        this.f110939a = null;
        C58836b bVar = C58836b.f156633a;
        this.f110940b = bVar;
        this.f110941c = bVar;
        this.f110942d = bVar;
        this.f110943e = false;
    }

    public C42306ce(C42313cl clVar) {
        C42305cd cdVar;
        C42310ci a = clVar.mo45275a();
        if (a == null) {
            cdVar = null;
        } else {
            cdVar = a.mo45273g();
        }
        this.f110944f = cdVar;
        this.f110939a = clVar.mo45281f();
        this.f110940b = clVar.mo45277c();
        this.f110941c = clVar.mo45278d();
        this.f110942d = clVar.mo45279e();
        this.f110943e = clVar.mo45282g();
    }

    /* renamed from: a */
    public final /* synthetic */ C42310ci mo45275a() {
        return this.f110944f;
    }

    /* renamed from: b */
    public final C42313cl mo45276b() {
        return new C42314cm(this);
    }

    /* renamed from: c */
    public final C58833ax mo45277c() {
        return this.f110940b;
    }

    /* renamed from: d */
    public final C58833ax mo45278d() {
        return this.f110941c;
    }

    /* renamed from: e */
    public final C58833ax mo45279e() {
        return this.f110942d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42313cl) {
            C42313cl clVar = (C42313cl) obj;
            return C58832aw.m90831a(this.f110944f, clVar.mo45275a()) && C58832aw.m90831a(this.f110939a, clVar.mo45281f()) && C58832aw.m90831a(this.f110940b, clVar.mo45277c()) && C58832aw.m90831a(this.f110941c, clVar.mo45278d()) && C58832aw.m90831a(this.f110942d, clVar.mo45279e()) && this.f110943e == clVar.mo45282g();
        }
    }

    /* renamed from: f */
    public final String mo45281f() {
        return this.f110939a;
    }

    /* renamed from: g */
    public final boolean mo45282g() {
        return this.f110943e;
    }

    /* renamed from: h */
    public final /* synthetic */ boolean mo45283h() {
        return C42312ck.m74509a(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f110944f, this.f110939a, this.f110940b, this.f110941c, this.f110942d, Boolean.valueOf(this.f110943e)});
    }

    /* renamed from: i */
    public final C42305cd mo45285i() {
        if (this.f110944f == null) {
            this.f110944f = new C42305cd();
        }
        return this.f110944f;
    }

    /* renamed from: j */
    public final C42306ce mo45286j() {
        return new C42306ce(this);
    }
}
