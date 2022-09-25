package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a.C35606g;
import com.google.assistant.p3897e.p3921j.afb;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.g */
/* compiled from: PG */
public final class C35646g extends C35622ao {

    /* renamed from: a */
    public C35606g f93519a;

    /* renamed from: b */
    public C35625ar f93520b;

    /* renamed from: c */
    private afb f93521c;

    /* renamed from: a */
    public final C35623ap mo39751a() {
        C35625ar arVar;
        afb afb;
        C35606g gVar = this.f93519a;
        if (gVar != null && (arVar = this.f93520b) != null && (afb = this.f93521c) != null) {
            return new C35647h(gVar, arVar, afb);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f93519a == null) {
            sb.append(" messageSnapshotCache");
        }
        if (this.f93520b == null) {
            sb.append(" replySenderProducer");
        }
        if (this.f93521c == null) {
            sb.append(" notificationReplyArgs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo39752b(afb afb) {
        if (afb != null) {
            this.f93521c = afb;
            return;
        }
        throw new NullPointerException("Null notificationReplyArgs");
    }
}
