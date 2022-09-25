package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i;

import android.content.Context;
import com.google.android.libraries.search.assistant.notification.p2709a.C34837a;
import com.google.android.libraries.search.assistant.p2786t.p2787a.C36456g;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35599a;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35609ab;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35657r;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a.C35606g;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2738b.C35635f;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2738b.C35636g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35469e;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.aet;
import com.google.assistant.p3897e.p3921j.aeu;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62974ct;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.i.c */
/* compiled from: PG */
final class C128325c implements C35472h {

    /* renamed from: a */
    public static final C59071e f352926a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.m.i.c");

    /* renamed from: b */
    public final Context f352927b;

    /* renamed from: c */
    public final C37215b f352928c;

    /* renamed from: d */
    private final C60887da f352929d;

    /* renamed from: e */
    private final C35606g f352930e;

    /* renamed from: f */
    private final C35609ab f352931f;

    /* renamed from: g */
    private final C35635f f352932g;

    /* renamed from: h */
    private final C34837a f352933h;

    /* renamed from: i */
    private final C35657r f352934i;

    public C128325c(Context context, C60887da daVar, C35606g gVar, C35609ab abVar, C35636g gVar2, C34837a aVar, C35657r rVar, C37215b bVar) {
        this.f352927b = context;
        this.f352929d = daVar;
        this.f352930e = gVar;
        this.f352931f = abVar;
        C39226b bVar2 = C39226b.TAG_ASSISTANT_MOBILE_ASSISTANT;
        C36456g gVar3 = (C36456g) gVar2.f93493a.mo17428b();
        gVar3.getClass();
        Executor executor = (Executor) gVar2.f93494b.mo17428b();
        executor.getClass();
        bVar2.getClass();
        this.f352932g = new C35635f(gVar3, executor, bVar2);
        this.f352933h = aVar;
        this.f352934i = rVar;
        this.f352928c = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        if (!dyVar.f135936b.equals("notification.FETCH")) {
            return C60856cj.m92899h(new C35469e("notification.FETCH"));
        }
        try {
            Optional c = C36183e.m64585c(dyVar, "notification_fetch_args", aeu.f134959h.getParserForType());
            if (c.isEmpty()) {
                return C60856cj.m92899h(new C35471g("Failed to parse NotificationFetchArgs"));
            }
            aeu aeu = (aeu) c.get();
            aet a = aet.m86300a(aeu.f134963c);
            if (a == null) {
                a = aet.DEFAULT;
            }
            if (a != aet.DEFAULT) {
                C52235kf kfVar = C52235kf.INVALID_ARGUMENT;
                aet a2 = aet.m86300a(aeu.f134963c);
                if (a2 == null) {
                    a2 = aet.DEFAULT;
                }
                return C60856cj.m92900i(C36180b.m64579c(kfVar, "Unsupported notification source: ".concat(String.valueOf(a2.name()))));
            }
            this.f352928c.mo19974a(C37176a.f96816N.mo40815i(C62722b.OK));
            if (C36619a.m65147c(this.f352927b)) {
                C58976aa aaVar = C58975e.f156826a;
            }
            C35657r rVar = this.f352934i;
            C35599a aVar = new C35599a();
            C35606g gVar = this.f352930e;
            if (gVar != null) {
                aVar.f93435a = gVar;
                aVar.f93436b = this.f352932g;
                aVar.mo39731b(aeu);
                aVar.f93437c = C58833ax.m90834k(this.f352931f);
                C34837a aVar2 = this.f352933h;
                if (aVar2 != null) {
                    aVar.f93438d = aVar2;
                    C60870cx a3 = rVar.mo39782a(aVar.mo39730a());
                    C128324b bVar = new C128324b(this);
                    return C60922j.m93044g(a3, C47810es.m84963c(bVar), this.f352929d);
                }
                throw new NullPointerException("Null messageNotificationConverter");
            }
            throw new NullPointerException("Null messageSnapshotCache");
        } catch (C62974ct e) {
            return C60856cj.m92899h(new C35471g((Throwable) e));
        }
    }
}
