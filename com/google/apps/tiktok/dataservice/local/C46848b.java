package com.google.apps.tiktok.dataservice.local;

import com.google.common.base.C58833ax;

/* renamed from: com.google.apps.tiktok.dataservice.local.b */
/* compiled from: PG */
final class C46848b extends C46839an {

    /* renamed from: a */
    private final C58833ax f122279a;

    /* renamed from: b */
    private final C58833ax f122280b;

    /* renamed from: c */
    private final C58833ax f122281c;

    /* renamed from: d */
    private final C58833ax f122282d;

    public C46848b(C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4) {
        if (axVar != null) {
            this.f122279a = axVar;
            if (axVar2 != null) {
                this.f122280b = axVar2;
                if (axVar3 != null) {
                    this.f122281c = axVar3;
                    if (axVar4 != null) {
                        this.f122282d = axVar4;
                        return;
                    }
                    throw new NullPointerException("Null publishedTopicResult");
                }
                throw new NullPointerException("Null pendingTopicResult");
            }
            throw new NullPointerException("Null executingLoad");
        }
        throw new NullPointerException("Null maybeLocalDataSource");
    }

    /* renamed from: a */
    public final C58833ax mo50844a() {
        return this.f122280b;
    }

    /* renamed from: b */
    public final C58833ax mo50845b() {
        return this.f122279a;
    }

    /* renamed from: c */
    public final C58833ax mo50846c() {
        return this.f122281c;
    }

    /* renamed from: d */
    public final C58833ax mo50847d() {
        return this.f122282d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46839an) {
            C46839an anVar = (C46839an) obj;
            return this.f122279a.equals(anVar.mo50845b()) && this.f122280b.equals(anVar.mo50844a()) && this.f122281c.equals(anVar.mo50846c()) && this.f122282d.equals(anVar.mo50847d());
        }
    }

    public final int hashCode() {
        return ((((((this.f122279a.hashCode() ^ 1000003) * 1000003) ^ this.f122280b.hashCode()) * 1000003) ^ this.f122281c.hashCode()) * 1000003) ^ this.f122282d.hashCode();
    }

    public final String toString() {
        String obj = this.f122279a.toString();
        String obj2 = this.f122280b.toString();
        String obj3 = this.f122281c.toString();
        String obj4 = this.f122282d.toString();
        return "LocalSubscriptionState{maybeLocalDataSource=" + obj + ", executingLoad=" + obj2 + ", pendingTopicResult=" + obj3 + ", publishedTopicResult=" + obj4 + "}";
    }
}
