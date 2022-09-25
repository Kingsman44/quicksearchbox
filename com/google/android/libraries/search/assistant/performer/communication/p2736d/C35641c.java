package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a.C35606g;
import com.google.assistant.p3897e.p3921j.aeq;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.c */
/* compiled from: PG */
public final class C35641c extends C35662w {

    /* renamed from: a */
    public C35606g f93501a;

    /* renamed from: b */
    public C35665z f93502b;

    /* renamed from: c */
    private aeq f93503c;

    /* renamed from: a */
    public final C35663x mo39768a() {
        C35665z zVar;
        aeq aeq;
        C35606g gVar = this.f93501a;
        if (gVar != null && (zVar = this.f93502b) != null && (aeq = this.f93503c) != null) {
            return new C35643d(gVar, zVar, aeq);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f93501a == null) {
            sb.append(" messageSnapshotCache");
        }
        if (this.f93502b == null) {
            sb.append(" markAsReadSender");
        }
        if (this.f93503c == null) {
            sb.append(" markNotificationAsReadArgs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo39769b(aeq aeq) {
        if (aeq != null) {
            this.f93503c = aeq;
            return;
        }
        throw new NullPointerException("Null markNotificationAsReadArgs");
    }
}
