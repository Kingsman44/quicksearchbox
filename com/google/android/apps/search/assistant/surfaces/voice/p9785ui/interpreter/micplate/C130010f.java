package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.micplate;

import android.widget.RelativeLayout;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129918b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129966q;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129967r;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.micplate.f */
/* compiled from: PG */
final /* synthetic */ class C130010f implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C130019o f356534a;

    public C130010f(C130019o oVar) {
        this.f356534a = oVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo20961j(Object obj) {
        RelativeLayout relativeLayout;
        C129966q qVar = (C129966q) obj;
        C130019o oVar = this.f356534a;
        if (qVar == null || (qVar.f356469b == 2 && C129967r.m212141b(qVar))) {
            oVar.mo109409a().setVisibility(4);
            oVar.mo109410b().setVisibility(4);
            oVar.mo109411c().setVisibility(4);
            oVar.mo109412d().setVisibility(4);
            return;
        }
        oVar.mo109412d().mo104345e(qVar.f356476i, false);
        String str = qVar.f356471d;
        C69664n.m101060f(str, "state.sourceLocale");
        oVar.f356555m = str;
        String str2 = qVar.f356472e;
        C69664n.m101060f(str2, "state.targetLocale");
        oVar.f356556n = str2;
        int i = qVar.f356469b;
        if (i == 1 || i == 6) {
            oVar.mo109412d().setVisibility(4);
            C129918b a = C129918b.m212112a(qVar.f356473f);
            if (a == null) {
                a = C129918b.UNRECOGNIZED;
            }
            int ordinal = a.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    oVar.mo109420l(oVar.mo109410b());
                    oVar.mo109420l(oVar.mo109411c());
                    oVar.mo109419k(oVar.mo109409a());
                    return;
                } else if (ordinal == 2) {
                    String str3 = qVar.f356474g;
                    C69664n.m101060f(str3, "state.sourceLanguage");
                    String str4 = qVar.f356475h;
                    C69664n.m101060f(str4, "state.targetLanguage");
                    oVar.mo109416h().mo109393b(str3);
                    oVar.mo109417i().mo109393b(str4);
                    oVar.mo109420l(oVar.mo109409a());
                    oVar.mo109420l(oVar.mo109410b());
                    oVar.mo109419k(oVar.mo109411c());
                    return;
                } else if (ordinal == 3) {
                    String str5 = qVar.f356474g;
                    C69664n.m101060f(str5, "state.sourceLanguage");
                    String str6 = qVar.f356475h;
                    C69664n.m101060f(str6, "state.targetLanguage");
                    oVar.mo109413e().mo109390b(str5);
                    oVar.mo109414f().mo109390b(str6);
                    oVar.mo109419k(oVar.mo109410b());
                    oVar.mo109420l(oVar.mo109409a());
                    oVar.mo109420l(oVar.mo109411c());
                    return;
                } else if (ordinal != 4) {
                    return;
                }
            }
            C59052c cVar = (C59052c) C130019o.f356543a.mo56226d();
            cVar.mo56379ah(new C59094n(38616));
            cVar.mo56386p("Ignoring State changes as invalid mode found.");
            return;
        }
        if (oVar.mo109409a().getVisibility() == 0) {
            relativeLayout = oVar.mo109409a();
        } else if (oVar.mo109410b().getVisibility() == 0) {
            relativeLayout = oVar.mo109410b();
        } else {
            relativeLayout = oVar.mo109411c().getVisibility() == 0 ? oVar.mo109411c() : null;
        }
        if (relativeLayout != null) {
            oVar.mo109420l(relativeLayout);
        }
        oVar.mo109412d().setVisibility(0);
    }
}
