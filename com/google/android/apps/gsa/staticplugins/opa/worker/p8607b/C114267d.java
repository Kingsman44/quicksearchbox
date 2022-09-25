package com.google.android.apps.gsa.staticplugins.opa.worker.p8607b;

import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36265d;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.b.d */
/* compiled from: PG */
public final /* synthetic */ class C114267d implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C114274k f316857a;

    /* renamed from: b */
    public final /* synthetic */ C73812a f316858b;

    /* renamed from: c */
    public final /* synthetic */ C36265d f316859c;

    public /* synthetic */ C114267d(C114274k kVar, C73812a aVar, C36265d dVar) {
        this.f316857a = kVar;
        this.f316858b = aVar;
        this.f316859c = dVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C90456c cVar;
        C114274k kVar = this.f316857a;
        C73812a aVar = this.f316858b;
        C36265d dVar = this.f316859c;
        Exception exc = (Exception) obj;
        ((C59052c) ((C59052c) ((C59052c) C114274k.f316869a.mo56225c()).mo56382g(exc)).mo56372aa(28895)).mo56386p("Failed to create shortcut");
        aVar.mo65294a(C89849ae.APP_ACTIONS_NOTIFICATION_SHORTCUT_SAVE_RESPONSE_CLIENT_ERROR);
        C89911f fVar = (C89911f) kVar.f316876i.mo27525b();
        if (exc instanceof C90456c) {
            cVar = (C90456c) exc;
        } else {
            cVar = new C90452a(exc, 211, C89885b.OPA_APP_ACTIONS_SHORTCUTS_NOTIFICATION_SAVE_FAILED_VALUE);
        }
        C89886e b = fVar.mo83756b(cVar);
        b.f246282c = 166608251;
        b.mo83721a();
        kVar.mo101294k(dVar, true);
    }
}
