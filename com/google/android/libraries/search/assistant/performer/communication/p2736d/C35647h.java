package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a.C35606g;
import com.google.assistant.p3897e.p3921j.afb;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.h */
/* compiled from: PG */
final class C35647h extends C35623ap {

    /* renamed from: a */
    private final C35606g f93522a;

    /* renamed from: b */
    private final C35625ar f93523b;

    /* renamed from: c */
    private final afb f93524c;

    public C35647h(C35606g gVar, C35625ar arVar, afb afb) {
        this.f93522a = gVar;
        this.f93523b = arVar;
        this.f93524c = afb;
    }

    /* renamed from: a */
    public final C35625ar mo39753a() {
        return this.f93523b;
    }

    /* renamed from: b */
    public final C35606g mo39754b() {
        return this.f93522a;
    }

    /* renamed from: c */
    public final afb mo39755c() {
        return this.f93524c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C35623ap) {
            C35623ap apVar = (C35623ap) obj;
            return this.f93522a.equals(apVar.mo39754b()) && this.f93523b.equals(apVar.mo39753a()) && this.f93524c.equals(apVar.mo39755c());
        }
    }

    public final int hashCode() {
        return ((((this.f93522a.hashCode() ^ 1000003) * 1000003) ^ this.f93523b.hashCode()) * 1000003) ^ this.f93524c.hashCode();
    }

    public final String toString() {
        String obj = this.f93522a.toString();
        String obj2 = this.f93523b.toString();
        String obj3 = this.f93524c.toString();
        return "ReplyConfig{messageSnapshotCache=" + obj + ", replySenderProducer=" + obj2 + ", notificationReplyArgs=" + obj3 + "}";
    }
}
