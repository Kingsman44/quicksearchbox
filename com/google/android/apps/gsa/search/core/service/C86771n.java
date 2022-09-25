package com.google.android.apps.gsa.search.core.service;

import android.os.RemoteException;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.core.service.p6848e.C86684f;
import com.google.android.apps.gsa.search.core.service.p6848e.p6849a.C86676a;
import com.google.android.apps.gsa.search.core.service.p6848e.p6849a.C86678c;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88498s;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.util.C90757ba;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.EnumMap;

/* renamed from: com.google.android.apps.gsa.search.core.service.n */
/* compiled from: PG */
public final class C86771n implements C90757ba, C87682aj {

    /* renamed from: a */
    public final C88498s f234370a;

    /* renamed from: b */
    final /* synthetic */ C86775r f234371b;

    /* renamed from: c */
    private boolean f234372c = true;

    public C86771n(C86775r rVar, C88498s sVar) {
        this.f234371b = rVar;
        this.f234370a = sVar;
        sVar.asBinder().linkToDeath(rVar.f234380b, 0);
    }

    /* renamed from: f */
    private final void m139808f(String str, Exception exc) {
        C59104x c = C86775r.f234377a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AttachedClient");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(8349)).mo56354G("%s: failed callback %s", this.f234371b, str);
        this.f234371b.mo80389k();
    }

    /* renamed from: b */
    public final void mo80379b(ServiceEventData serviceEventData) {
        C86775r rVar = this.f234371b;
        if (rVar.f234401w) {
            rVar.f234402x.mo28212l("onGenericEventSync", new C86770m(this, serviceEventData));
        } else {
            mo80380d(serviceEventData);
        }
    }

    /* renamed from: d */
    public final void mo80380d(ServiceEventData serviceEventData) {
        C86684f fVar = this.f234371b.f234397s;
        if (fVar != null) {
            fVar.mo80289a("#onSendServiceEvent");
            fVar.mo80290b("#onSendServiceEvent");
            C86678c cVar = fVar.f234161d;
            EnumMap enumMap = cVar.f234153b;
            C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
            if (a == null) {
                a = C88244um.ATTACH_WEBVIEW;
            }
            if (enumMap.get(a) != null) {
                if (C22872h.m42744d(C86593a.class)) {
                    cVar.mo80282a(serviceEventData);
                } else {
                    cVar.f234154c.mo28212l("#onSendServiceEvent for ServiceEventSnooper listeners", new C86676a(cVar, serviceEventData));
                }
            }
        }
        try {
            this.f234370a.mo82016e(serviceEventData);
        } catch (RemoteException e) {
            m139808f("onGenericEvent()", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo80381e() {
        if (this.f234372c) {
            this.f234372c = false;
            this.f234370a.asBinder().unlinkToDeath(this.f234371b.f234380b, 0);
            return;
        }
        C59104x c = C86775r.f234377a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AttachedClient");
        ((C59052c) ((C59052c) c).mo56372aa(8350)).mo56386p("AttachedClientUiAdapter#unlinkToDeath called multiple times.");
        ((C89911f) this.f234371b.f234385g.mo27525b()).mo83755a((Throwable) null, 26636648, 29).mo83721a();
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        mo80379b(serviceEventData);
    }

    /* renamed from: fN */
    public final void mo77682fN(int i) {
        try {
            this.f234370a.mo82017f(i);
        } catch (RemoteException e) {
            m139808f("updateSpeechLevel()", e);
        }
    }
}
