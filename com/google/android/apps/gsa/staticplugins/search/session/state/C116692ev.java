package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.view.WindowManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.k.b.am;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ev */
/* compiled from: PG */
public final /* synthetic */ class C116692ev implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116703ff f323618a;

    /* renamed from: b */
    public final /* synthetic */ String f323619b;

    public /* synthetic */ C116692ev(C116703ff ffVar, String str) {
        this.f323618a = ffVar;
        this.f323619b = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116703ff ffVar = this.f323618a;
        String str = this.f323619b;
        am amVar = (am) obj;
        if (amVar == null) {
            ffVar.mo102836j(C89849ae.OPA_GROWTH_NUDGE_UI_CREATION_FAILED);
            return;
        }
        ffVar.f323643k = amVar;
        am amVar2 = ffVar.f323643k;
        amVar2.b = ffVar.f323642j;
        if (amVar2 != null) {
            try {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2038, 263208, -3);
                layoutParams.gravity = 80;
                ((WindowManager) ffVar.f323639g.mo6453a()).addView(amVar2.a, layoutParams);
            } catch (RuntimeException e) {
                ((C59052c) ((C59052c) ((C59052c) C116703ff.f323633a.mo56224b()).mo56382g(e)).mo56372aa(32096)).mo56386p("Exception while showing the nudge");
                ffVar.mo102835i(C89849ae.OPA_GROWTH_NUDGE_UI_DISPLAY_FAILED, str);
                ffVar.f323643k = null;
                return;
            }
        }
        String str2 = amVar.c;
        amVar.a.requestFocus();
        if (str2 == null || str2.isEmpty()) {
            ffVar.f323634b.mo78582f(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0);
        } else {
            ffVar.f323634b.mo78582f(str, str2, 300);
        }
        ffVar.mo102837k(str);
        ffVar.mo102836j(C89849ae.OPA_GROWTH_NUDGE_UI_DISPLAYED);
        ffVar.mo102833e(str);
    }
}
