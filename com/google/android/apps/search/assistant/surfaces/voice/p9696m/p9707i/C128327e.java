package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i;

import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35641c;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35664y;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35665z;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a.C35606g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35469e;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.aeq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62974ct;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.i.e */
/* compiled from: PG */
final class C128327e implements C35472h {

    /* renamed from: a */
    private final C35606g f352935a;

    /* renamed from: b */
    private final C35665z f352936b;

    /* renamed from: c */
    private final C35664y f352937c;

    public C128327e(C35606g gVar, C35665z zVar, C35664y yVar) {
        this.f352935a = gVar;
        this.f352936b = zVar;
        this.f352937c = yVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        if (!dyVar.f135936b.equals("notification.MARK_AS_READ")) {
            return C60856cj.m92899h(new C35469e("notification.MARK_AS_READ"));
        }
        try {
            Optional c = C36183e.m64585c(dyVar, "mark_notification_as_read_args", aeq.f134947f.getParserForType());
            if (c.isEmpty()) {
                return C60856cj.m92899h(new C35471g("Failed to parse MarkNotificationAsReadArgs"));
            }
            C35664y yVar = this.f352937c;
            C35641c cVar = new C35641c();
            cVar.mo39769b((aeq) c.get());
            cVar.f93502b = this.f352936b;
            C35606g gVar = this.f352935a;
            if (gVar != null) {
                cVar.f93501a = gVar;
                return yVar.mo39783a(cVar.mo39768a());
            }
            throw new NullPointerException("Null messageSnapshotCache");
        } catch (C62974ct e) {
            return C60856cj.m92899h(new C35471g((Throwable) e));
        }
    }
}
