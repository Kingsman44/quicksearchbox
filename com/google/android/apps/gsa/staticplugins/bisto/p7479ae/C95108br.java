package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.service.OnTranscriptionUpdateEventParcelable;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88302wq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88304ws;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.speech.Hypothesis;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95294af;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95457c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.br */
/* compiled from: PG */
public final /* synthetic */ class C95108br implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95109bs f266077a;

    /* renamed from: b */
    public final /* synthetic */ ServiceEventData f266078b;

    public /* synthetic */ C95108br(C95109bs bsVar, ServiceEventData serviceEventData) {
        this.f266077a = bsVar;
        this.f266078b = serviceEventData;
    }

    public final void run() {
        String str;
        C95109bs bsVar = this.f266077a;
        ServiceEventData serviceEventData = this.f266078b;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        int ordinal = a.ordinal();
        if (ordinal == 46) {
            int i = ((C88304ws) serviceEventData.mo81918e(C88302wq.f238816a)).f238820b;
            if (i == 9) {
                C59104x b = C95109bs.f266079a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
                ((C59052c) ((C59052c) b).mo56372aa(18075)).mo56386p("STATE_DONE");
                bsVar.mo89037f();
                if (bsVar.f266091l) {
                    C95127t tVar = bsVar.f266095p;
                    tVar.getClass();
                    tVar.mo89050d();
                }
                if (bsVar.f266089j) {
                    bsVar.f266089j = false;
                    String str2 = bsVar.f266094o;
                    if (str2 == null || str2.length() == 0) {
                        str = bsVar.f266081b.getString(R.string.transcript_failure);
                    } else {
                        Integer g = bsVar.f266082c.mo89215g(14);
                        if (g != null) {
                            String g2 = C58837ba.m90858g(bsVar.f266082c.mo89216i(bsVar.f266081b, 21));
                            str = bsVar.f266081b.getString(g.intValue(), new Object[]{str2, g2});
                        } else {
                            C89655j.m145957a("No education prompt");
                            str = BuildConfig.FLAVOR;
                        }
                    }
                    C95119l lVar = new C95119l(new C95118k(bsVar.f266081b, bsVar.f266082c, str, str2, bsVar.f266084e.mo89024c(), bsVar, bsVar.f266085f, bsVar.f266086g), bsVar);
                    bsVar.f266092m = lVar;
                    if (!bsVar.f266087h.mo89170r(lVar)) {
                        bsVar.mo89009b(6, false);
                        return;
                    }
                    return;
                }
                return;
            }
            C59104x b2 = C95109bs.f266079a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
            ((C59052c) ((C59052c) b2).mo56372aa(18074)).mo56387q("State: %d", i);
        } else if (ordinal != 52) {
            C59104x b3 = C95109bs.f266079a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
            C59052c cVar = (C59052c) ((C59052c) b3).mo56372aa(18073);
            C88244um a2 = C88244um.m142794a(serviceEventData.f236959a.f238699b);
            if (a2 == null) {
                a2 = C88244um.ATTACH_WEBVIEW;
            }
            cVar.mo56389s("Unhandled service event id: %s", a2);
        } else {
            C59104x b4 = C95109bs.f266079a.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
            ((C59052c) ((C59052c) b4).mo56372aa(18076)).mo56386p("ON_TRANSCRIPTION_UPDATE");
            List list = ((OnTranscriptionUpdateEventParcelable) serviceEventData.mo81912b(OnTranscriptionUpdateEventParcelable.class)).f236958b;
            C59104x b5 = C95109bs.f266079a.mo56224b();
            b5.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
            ((C59052c) ((C59052c) b5).mo56372aa(18082)).mo56389s("transcriptUpdate %b", Boolean.valueOf(bsVar.f266089j));
            if (bsVar.f266089j) {
                bsVar.f266094o = ((Hypothesis) list.get(0)).f253055a;
                C95294af afVar = bsVar.f266093n;
                if (afVar != null) {
                    afVar.mo89220a(C95457c.f267106f);
                    bsVar.f266093n = null;
                }
            }
        }
    }
}
