package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b.p9797b;

import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.android.libraries.search.assistant.notification.p2709a.C34837a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.b.b.i */
/* compiled from: PG */
public final /* synthetic */ class C129121i implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C129123k f354712a;

    /* renamed from: b */
    public final /* synthetic */ C129124l f354713b;

    public /* synthetic */ C129121i(C129123k kVar, C129124l lVar) {
        this.f354712a = kVar;
        this.f354713b = lVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C129123k kVar = this.f354712a;
        C129124l lVar = this.f354713b;
        C58976aa aaVar = C58975e.f156826a;
        if (!lVar.f354724d.equals(C52235kf.OK)) {
            C59104x b = C129123k.f354714a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "FAReadNotiAdapter");
            ((C59052c) ((C59052c) b).mo56372aa(38214)).mo56389s("Skip handling failed ReplyResult: %s", lVar);
            cxVar = C60856cj.m92900i(false);
        } else {
            C34837a aVar = kVar.f354717d;
            BundledMessageNotification bundledMessageNotification = lVar.f354722b;
            bundledMessageNotification.getClass();
            C60870cx a = aVar.mo20103a(bundledMessageNotification, lVar.f354721a, true);
            C129115c cVar = new C129115c(kVar);
            C60870cx g = C60922j.m93044g(a, C47810es.m84963c(cVar), kVar.f354715b);
            C129116d dVar = new C129116d(kVar, lVar);
            cxVar = C60922j.m93044g(g, C47810es.m84963c(dVar), kVar.f354715b);
        }
        C129113a aVar2 = new C129113a(kVar);
        return C60922j.m93044g(cxVar, C47810es.m84963c(aVar2), kVar.f354715b);
    }
}
