package com.google.android.apps.gsa.staticplugins.avocado;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84021p;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83973o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.eo */
/* compiled from: PG */
public final class C94290eo extends C84021p {

    /* renamed from: e */
    private static final C59071e f263480e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.eo");

    /* renamed from: b */
    public C22871g f263481b;

    /* renamed from: c */
    public C68214a f263482c;

    /* renamed from: d */
    public C86124t f263483d;

    /* renamed from: f */
    private C83973o f263484f;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final void mo77485e() {
        C83973o oVar = this.f263484f;
        if (oVar != null) {
            oVar.mo77406g();
        }
        super.mo77485e();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C59104x b = f263480e.mo56224b();
        b.mo56378ag(C58975e.f156826a, "updateFragment");
        ((C59052c) ((C59052c) b).mo56372aa(14419)).mo56386p("#onCreateView");
        View inflate = layoutInflater.inflate(R.layout.enrollment_update, (ViewGroup) null);
        OpaPageLayout opaPageLayout = (OpaPageLayout) inflate.findViewById(R.id.opa_page_layout);
        HeaderLayout headerLayout = (HeaderLayout) opaPageLayout.findViewById(R.id.opa_header);
        C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.model_creating_loading_screen_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.model_creating_loading_screen_message, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        C83973o oVar = new C83973o(opaPageLayout.findViewById(R.id.enroll_update_animation_container), (LottieAnimationView) opaPageLayout.findViewById(R.id.enroll_update_animation), new C94289en());
        oVar.mo77402c();
        oVar.mo77403d();
        this.f263484f = oVar;
        C28295m.m52919e(inflate, new C28292j(62531));
        long a = this.f263483d.mo79743a(C90082eg.f249907aW);
        getActivity().getWindow().addFlags(128);
        this.f263481b.mo28213m("Remove LayoutParams.FLAG_KEEP_SCREEN_ON", ((long) ((int) a)) * 1000, new C94287el(this));
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        if (getActivity().isFinishing()) {
            ((C89859i) this.f263482c.mo27525b()).mo83702b(C89849ae.FACE_MATCH_DEVICE_ENROLLMENT_EXIT);
            ((C89859i) this.f263482c.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_FM_EXIT);
            ((C89859i) this.f263482c.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_EXIT);
            return;
        }
        ((C89859i) this.f263482c.mo27525b()).mo83702b(C89849ae.FACE_MATCH_DEVICE_ENROLLMENT_SUCCESS);
    }

    public final void onDestroyView() {
        C59104x b = f263480e.mo56224b();
        b.mo56378ag(C58975e.f156826a, "updateFragment");
        ((C59052c) ((C59052c) b).mo56372aa(14420)).mo56386p("#onDestroyView");
        super.onDestroyView();
        C83973o oVar = this.f263484f;
        if (oVar != null) {
            oVar.mo77406g();
        }
    }
}
