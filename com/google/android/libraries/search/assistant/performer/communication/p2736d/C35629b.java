package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.google.android.libraries.search.assistant.notification.p2709a.C34837a;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a.C35606g;
import com.google.assistant.p3897e.p3921j.aeu;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.b */
/* compiled from: PG */
final class C35629b extends C35656q {

    /* renamed from: a */
    private final C35606g f93477a;

    /* renamed from: b */
    private final C35648i f93478b;

    /* renamed from: c */
    private final aeu f93479c;

    /* renamed from: d */
    private final C58833ax f93480d;

    /* renamed from: e */
    private final C34837a f93481e;

    public C35629b(C35606g gVar, C35648i iVar, aeu aeu, C58833ax axVar, C34837a aVar) {
        this.f93477a = gVar;
        this.f93478b = iVar;
        this.f93479c = aeu;
        this.f93480d = axVar;
        this.f93481e = aVar;
    }

    /* renamed from: a */
    public final C34837a mo39758a() {
        return this.f93481e;
    }

    /* renamed from: b */
    public final C35648i mo39759b() {
        return this.f93478b;
    }

    /* renamed from: c */
    public final C35606g mo39760c() {
        return this.f93477a;
    }

    /* renamed from: d */
    public final aeu mo39761d() {
        return this.f93479c;
    }

    /* renamed from: e */
    public final C58833ax mo39762e() {
        return this.f93480d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C35656q) {
            C35656q qVar = (C35656q) obj;
            return this.f93477a.equals(qVar.mo39760c()) && this.f93478b.equals(qVar.mo39759b()) && this.f93479c.equals(qVar.mo39761d()) && this.f93480d.equals(qVar.mo39762e()) && this.f93481e.equals(qVar.mo39758a());
        }
    }

    public final int hashCode() {
        return ((((((((this.f93477a.hashCode() ^ 1000003) * 1000003) ^ this.f93478b.hashCode()) * 1000003) ^ this.f93479c.hashCode()) * 1000003) ^ this.f93480d.hashCode()) * 1000003) ^ this.f93481e.hashCode();
    }

    public final String toString() {
        String obj = this.f93477a.toString();
        String obj2 = this.f93478b.toString();
        String obj3 = this.f93479c.toString();
        String valueOf = String.valueOf(this.f93480d);
        String obj4 = this.f93481e.toString();
        return "FetchConfig{messageSnapshotCache=" + obj + ", bundledMessageProvider=" + obj2 + ", notificationFetchArgs=" + obj3 + ", notificationPermissionRequester=" + valueOf + ", messageNotificationConverter=" + obj4 + "}";
    }
}
