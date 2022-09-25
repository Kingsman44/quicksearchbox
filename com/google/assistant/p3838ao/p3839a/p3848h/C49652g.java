package com.google.assistant.p3838ao.p3839a.p3848h;

import com.google.assistant.p3838ao.p3839a.p3845e.C49575ce;
import com.google.assistant.p3838ao.p3839a.p3845e.C49611dn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.assistant.ao.a.h.g */
/* compiled from: PG */
final class C49652g extends C49661p {

    /* renamed from: a */
    private final boolean f128153a;

    /* renamed from: b */
    private final C49659n f128154b;

    /* renamed from: c */
    private final C49648c f128155c;

    /* renamed from: d */
    private final C49667v f128156d;

    /* renamed from: e */
    private final C49575ce f128157e;

    /* renamed from: f */
    private final C49666u f128158f;

    /* renamed from: g */
    private final C58528ij f128159g;

    /* renamed from: h */
    private final C58485gu f128160h;

    /* renamed from: i */
    private final C49611dn f128161i;

    public C49652g(boolean z, C49659n nVar, C49648c cVar, C49667v vVar, C49575ce ceVar, C49666u uVar, C58528ij ijVar, C58485gu guVar, C49611dn dnVar) {
        this.f128153a = z;
        this.f128154b = nVar;
        this.f128155c = cVar;
        this.f128156d = vVar;
        this.f128157e = ceVar;
        this.f128158f = uVar;
        this.f128159g = ijVar;
        this.f128160h = guVar;
        this.f128161i = dnVar;
    }

    /* renamed from: a */
    public final C49575ce mo53303a() {
        return this.f128157e;
    }

    /* renamed from: b */
    public final C49611dn mo53304b() {
        return this.f128161i;
    }

    /* renamed from: c */
    public final C49648c mo53305c() {
        return this.f128155c;
    }

    /* renamed from: d */
    public final C49659n mo53306d() {
        return this.f128154b;
    }

    /* renamed from: e */
    public final C49666u mo53307e() {
        return this.f128158f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C49661p) {
            C49661p pVar = (C49661p) obj;
            return this.f128153a == pVar.mo53313i() && this.f128154b.equals(pVar.mo53306d()) && this.f128155c.equals(pVar.mo53305c()) && this.f128156d.equals(pVar.mo53309f()) && this.f128157e.equals(pVar.mo53303a()) && this.f128158f.equals(pVar.mo53307e()) && this.f128159g.equals(pVar.mo53311h()) && C58597ky.m90218i(this.f128160h, pVar.mo53310g()) && this.f128161i.equals(pVar.mo53304b());
        }
    }

    /* renamed from: f */
    public final C49667v mo53309f() {
        return this.f128156d;
    }

    /* renamed from: g */
    public final C58485gu mo53310g() {
        return this.f128160h;
    }

    /* renamed from: h */
    public final C58528ij mo53311h() {
        return this.f128159g;
    }

    public final int hashCode() {
        return (((((((((((((((((true != this.f128153a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f128154b.hashCode()) * 1000003) ^ this.f128155c.hashCode()) * 1000003) ^ this.f128156d.hashCode()) * 1000003) ^ this.f128157e.hashCode()) * 1000003) ^ this.f128158f.hashCode()) * 1000003) ^ this.f128159g.hashCode()) * 1000003) ^ this.f128160h.hashCode()) * 1000003) ^ this.f128161i.hashCode();
    }

    /* renamed from: i */
    public final boolean mo53313i() {
        return this.f128153a;
    }

    public final String toString() {
        boolean z = this.f128153a;
        String obj = this.f128154b.toString();
        String obj2 = this.f128155c.toString();
        String obj3 = this.f128156d.toString();
        String obj4 = this.f128157e.toString();
        String obj5 = this.f128158f.toString();
        String obj6 = this.f128159g.toString();
        String obj7 = this.f128160h.toString();
        String obj8 = this.f128161i.toString();
        return "SuggestStateSnapshot{torchEnabled=" + z + ", screenState=" + obj + ", appState=" + obj2 + ", userQueryHistory=" + obj3 + ", photoProfile=" + obj4 + ", userProfileHandler=" + obj5 + ", connectedDevices=" + obj6 + ", bluetoothHistory=" + obj7 + ", userInteractionStateTransition=" + obj8 + "}";
    }
}
