package com.google.android.apps.gsa.search.core.p6491a;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.apps.gsa.search.core.a.k */
/* compiled from: PG */
final class C84365k extends C84369o {

    /* renamed from: a */
    private final int f229617a;

    /* renamed from: b */
    private final C84380z f229618b;

    /* renamed from: c */
    private final C58495hd f229619c;

    /* renamed from: d */
    private final C58833ax f229620d;

    /* renamed from: e */
    private final C58833ax f229621e;

    /* renamed from: f */
    private final C58833ax f229622f;

    /* renamed from: g */
    private final C58833ax f229623g;

    /* renamed from: h */
    private final C58833ax f229624h;

    public C84365k(int i, C84380z zVar, C58495hd hdVar, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5) {
        this.f229617a = i;
        this.f229618b = zVar;
        this.f229619c = hdVar;
        this.f229620d = axVar;
        this.f229621e = axVar2;
        this.f229622f = axVar3;
        this.f229623g = axVar4;
        this.f229624h = axVar5;
    }

    /* renamed from: a */
    public final int mo77908a() {
        return this.f229617a;
    }

    /* renamed from: b */
    public final C84380z mo77909b() {
        return this.f229618b;
    }

    /* renamed from: c */
    public final C58833ax mo77910c() {
        return this.f229623g;
    }

    /* renamed from: d */
    public final C58833ax mo77911d() {
        return this.f229622f;
    }

    /* renamed from: e */
    public final C58833ax mo77912e() {
        return this.f229620d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C84369o) {
            C84369o oVar = (C84369o) obj;
            return this.f229617a == oVar.mo77908a() && this.f229618b.equals(oVar.mo77909b()) && this.f229619c.equals(oVar.mo77916h()) && this.f229620d.equals(oVar.mo77912e()) && this.f229621e.equals(oVar.mo77914f()) && this.f229622f.equals(oVar.mo77911d()) && this.f229623g.equals(oVar.mo77910c()) && this.f229624h.equals(oVar.mo77915g());
        }
    }

    /* renamed from: f */
    public final C58833ax mo77914f() {
        return this.f229621e;
    }

    /* renamed from: g */
    public final C58833ax mo77915g() {
        return this.f229624h;
    }

    /* renamed from: h */
    public final C58495hd mo77916h() {
        return this.f229619c;
    }

    public final int hashCode() {
        return ((((((((((((((this.f229617a ^ 1000003) * 1000003) ^ this.f229618b.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f229619c.entrySet())) * 1000003) ^ this.f229620d.hashCode()) * 1000003) ^ this.f229621e.hashCode()) * 1000003) ^ this.f229622f.hashCode()) * 1000003) ^ this.f229623g.hashCode()) * 1000003) ^ this.f229624h.hashCode();
    }

    public final String toString() {
        int i = this.f229617a;
        String obj = this.f229618b.toString();
        String obj2 = this.f229619c.toString();
        String valueOf = String.valueOf(this.f229620d);
        String valueOf2 = String.valueOf(this.f229621e);
        String valueOf3 = String.valueOf(this.f229622f);
        String valueOf4 = String.valueOf(this.f229623g);
        String valueOf5 = String.valueOf(this.f229624h);
        return "ConversationClientConfig{clientType=" + i + ", legacyResponseCallbacks=" + obj + ", customPerformers=" + obj2 + ", customConversationSurface=" + valueOf + ", customIntentStarter=" + valueOf2 + ", conversationDeltaTransformer=" + valueOf3 + ", conversationDeltaSender=" + valueOf4 + ", serviceEventSender=" + valueOf5 + "}";
    }
}
