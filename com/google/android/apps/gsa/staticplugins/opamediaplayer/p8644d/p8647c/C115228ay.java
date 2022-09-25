package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import android.net.Uri;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90125fw;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.assistant.p3897e.p3921j.C52577wx;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.ay */
/* compiled from: PG */
public final /* synthetic */ class C115228ay implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C115274cq f319769a;

    public /* synthetic */ C115228ay(C115274cq cqVar) {
        this.f319769a = cqVar;
    }

    public final void run() {
        String queryParameter;
        C115274cq cqVar = this.f319769a;
        C115314ec a = cqVar.f319853g.mo101954a();
        String str = a.mo101947a().f136895b;
        Uri parse = Uri.parse(str);
        if (cqVar.f319852f.mo79746e(C90125fw.f250898O) && "chrome-distiller".equals(parse.getScheme()) && (queryParameter = parse.getQueryParameter("url")) != null) {
            str = queryParameter;
        }
        if (cqVar.f319852f.mo79746e(C90125fw.f250894K) && cqVar.f319861o.mo79422b(Uri.parse(str))) {
            C58833ax a2 = cqVar.f319861o.mo79421a(str);
            if (a2.mo56113h()) {
                str = (String) a2.mo56107c();
            }
        }
        C59104x b = C115274cq.f319847a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageC");
        ((C59052c) ((C59052c) b).mo56372aa(29805)).mo56389s("Loading URL in webview: %s", str);
        ((C23251a) cqVar.f319849c.mo102020x()).mo28730f(str, false);
        ((C23251a) cqVar.f319849c.mo102015s()).mo28730f(Boolean.valueOf(cqVar.mo101926J(a)), false);
        C23251a aVar = (C23251a) cqVar.f319849c.mo102002f();
        boolean z = true;
        if (!(C115387w.m191343d(a.f319951a) == C52577wx.READ_IT_LATER || C115387w.m191343d(a.f319951a) == C52577wx.READ_IT_NOW_PLAYLIST)) {
            z = false;
        }
        aVar.mo28730f(Boolean.valueOf(z), false);
        ((C23251a) cqVar.f319849c.mo102003g()).mo28730f(Boolean.valueOf(a.mo101950d()), false);
        cqVar.f319854h.mo83702b(C89849ae.SPEAKR_WEB_PAGE_LOADING_STARTED);
    }
}
