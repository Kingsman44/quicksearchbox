package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i;

import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128544a;
import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.android.libraries.search.assistant.notification.data.C34890k;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35624aq;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35626as;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35646g;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a.C35606g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35469e;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.afb;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62974ct;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.i.r */
/* compiled from: PG */
final class C128340r implements C35472h {

    /* renamed from: a */
    public static final Duration f352975a = Duration.ofSeconds(30);

    /* renamed from: b */
    public final C35626as f352976b;

    /* renamed from: c */
    public final C128544a f352977c;

    /* renamed from: d */
    private final C60887da f352978d;

    /* renamed from: e */
    private final C35606g f352979e;

    /* renamed from: f */
    private final C35624aq f352980f;

    public C128340r(C60887da daVar, C35606g gVar, C35626as asVar, C35624aq aqVar, C128544a aVar) {
        this.f352978d = daVar;
        this.f352979e = gVar;
        this.f352976b = asVar;
        this.f352980f = aqVar;
        this.f352977c = aVar;
    }

    /* renamed from: b */
    static /* synthetic */ BundledMessageNotification m209441b(int i, C58833ax axVar) {
        try {
            if (axVar.mo56113h()) {
                return (BundledMessageNotification) ((C34890k) axVar.mo56107c()).mo39602a().get(i);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
        return null;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        if (!dyVar.f135936b.equals("notification.REPLY")) {
            return C60856cj.m92899h(new C35469e("notification.REPLY"));
        }
        try {
            Optional c = C36183e.m64585c(dyVar, "notification_reply_args", afb.f134984e.getParserForType());
            if (c.isEmpty()) {
                return C60856cj.m92899h(new C35471g("Failed to parse NotificationReplyArgs"));
            }
            afb afb = (afb) c.get();
            if (!afb.f134989d) {
                return C60856cj.m92900i(C36180b.m64579c(C52235kf.INVALID_ARGUMENT, "MA does not support alternative way to reply to notification"));
            }
            C35624aq aqVar = this.f352980f;
            C35646g gVar = new C35646g();
            gVar.mo39752b(afb);
            gVar.f93520b = new C128338p(this);
            C35606g gVar2 = this.f352979e;
            if (gVar2 != null) {
                gVar.f93519a = gVar2;
                C60870cx b = aqVar.mo39757b(aqVar.mo39756a(gVar.mo39751a()));
                int i = afb.f134987b;
                C60870cx a = this.f352979e.mo39738a();
                C128337o oVar = new C128337o(i);
                C60870cx g = C60922j.m93044g(a, C47810es.m84963c(oVar), this.f352978d);
                return C47638k.m84751b(b, g).mo51520a(new C128339q(this, b, g, afb), this.f352978d);
            }
            throw new NullPointerException("Null messageSnapshotCache");
        } catch (C62974ct e) {
            return C60856cj.m92899h(new C35471g((Throwable) e));
        }
    }
}
