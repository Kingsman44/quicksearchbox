package com.google.android.apps.gsa.staticplugins.opa.p8307au;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90024cc;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.au.n */
/* compiled from: PG */
public final /* synthetic */ class C107603n implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C107606q f299343a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f299344b;

    public /* synthetic */ C107603n(C107606q qVar, ViewGroup viewGroup) {
        this.f299343a = qVar;
        this.f299344b = viewGroup;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C107606q qVar = this.f299343a;
        ViewGroup viewGroup = this.f299344b;
        View view = (View) obj;
        qVar.f299362m = (ViewGroup) viewGroup.findViewById(R.id.opa_rich_input_container);
        qVar.f299363n = (ViewGroup) viewGroup.findViewById(R.id.suggestion_container);
        ViewGroup viewGroup2 = qVar.f299362m;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            qVar.f299362m.addView(view);
            qVar.f299362m.setVisibility(0);
            qVar.f299365p = true;
            qVar.mo96067b();
            if (qVar.f299352c.mo79746e(C90024cc.f248132c) && !qVar.f299356g) {
                ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.valyrian_container);
                if (viewGroup3 != null) {
                    ViewGroup viewGroup4 = qVar.f299362m;
                    viewGroup4.getClass();
                    viewGroup3.removeView(viewGroup4);
                }
                ViewGroup viewGroup5 = (ViewGroup) viewGroup.findViewById(R.id.search_container);
                if (viewGroup5 != null) {
                    ViewGroup viewGroup6 = qVar.f299362m;
                    viewGroup6.getClass();
                    viewGroup5.addView(viewGroup6, 0);
                }
                ViewGroup viewGroup7 = qVar.f299362m;
                viewGroup7.getClass();
                viewGroup7.findViewById(R.id.rich_input_content).setBackgroundColor(qVar.f299351b.getResources().getColor(17170445));
                ((TextView) viewGroup.findViewById(R.id.chatui_text)).setText(((C73841bf) qVar.f299358i.mo27525b()).mo65322a().getString(R.string.opa_citadel_greeting_bubble_text));
            }
        }
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.OPA_ANDROID_RICH_INPUT_DRAW_COMPLETE;
        ((C89859i) qVar.f299353d.mo27525b()).mo74236a(fVar.mo83699a());
    }
}
