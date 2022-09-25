package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.google.android.libraries.search.assistant.notification.p2709a.C34837a;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a.C35606g;
import com.google.assistant.p3897e.p3921j.aeu;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.a */
/* compiled from: PG */
public final class C35599a extends C35655p {

    /* renamed from: a */
    public C35606g f93435a;

    /* renamed from: b */
    public C35648i f93436b;

    /* renamed from: c */
    public C58833ax f93437c = C58836b.f156633a;

    /* renamed from: d */
    public C34837a f93438d;

    /* renamed from: e */
    private aeu f93439e;

    /* renamed from: a */
    public final C35656q mo39730a() {
        C35648i iVar;
        aeu aeu;
        C34837a aVar;
        C35606g gVar = this.f93435a;
        if (gVar != null && (iVar = this.f93436b) != null && (aeu = this.f93439e) != null && (aVar = this.f93438d) != null) {
            return new C35629b(gVar, iVar, aeu, this.f93437c, aVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f93435a == null) {
            sb.append(" messageSnapshotCache");
        }
        if (this.f93436b == null) {
            sb.append(" bundledMessageProvider");
        }
        if (this.f93439e == null) {
            sb.append(" notificationFetchArgs");
        }
        if (this.f93438d == null) {
            sb.append(" messageNotificationConverter");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo39731b(aeu aeu) {
        if (aeu != null) {
            this.f93439e = aeu;
            return;
        }
        throw new NullPointerException("Null notificationFetchArgs");
    }
}
