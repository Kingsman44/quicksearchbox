package com.google.android.apps.gsa.staticplugins.hotwordenrollment.deeplink;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83973o;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.deeplink.i */
/* compiled from: PG */
public final class C101793i extends C83907bm {

    /* renamed from: d */
    private static final C59071e f283932d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.deeplink.i");

    /* renamed from: b */
    public C83893b f283933b;

    /* renamed from: c */
    public C86054o f283934c;

    /* renamed from: e */
    private C83973o f283935e;

    /* renamed from: f */
    private OpaPageLayout f283936f;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Integer valueOf = Integer.valueOf(i2);
        super.onActivityResult(i, i2, intent);
        if (i == 456) {
            if (i2 == -1) {
                String stringExtra = intent.getStringExtra("authAccount");
                this.f283934c.mo79680n();
                Account w = this.f283934c.mo79689w(stringExtra);
                if (w != null) {
                    this.f283933b.mo77279b(w);
                    C18509a c = C18522b.m35986c();
                    C18523c cVar = (C18523c) c;
                    cVar.f52492a = "speaker_id_enrollment";
                    c.mo24025g("device_discovery_fdl");
                    c.mo24023e("opa");
                    cVar.f52494c = ((Account) this.f283933b.mo77278a().mo56107c()).name;
                    startActivityForResult(c.mo24020b().mo24031a(), 1200);
                    return;
                }
                return;
            }
            ((C59052c) ((C59052c) f283932d.mo56225c()).mo56372aa(20265)).mo56359L("Error from account selector requestCode: %d, intent: %s, resultCode %d", 456, intent, valueOf);
        } else if (i == 1200) {
            mo77318iT().mo77313b();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f283936f = (OpaPageLayout) layoutInflater.inflate(R.layout.voice_match_deeplink_welcome, (ViewGroup) null);
        C58838bb.m90883r(this.f283933b.mo77281d());
        HeaderLayout headerLayout = (HeaderLayout) this.f283936f.f228728c.findViewById(R.id.opa_header);
        C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.voice_match_deeplink_welcome_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.voice_match_deeplink_welcome_explanation, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        C83973o oVar = new C83973o(this.f283936f.findViewById(R.id.omni_animation_container), (LottieAnimationView) this.f283936f.findViewById(R.id.omni_animation), new C101792h());
        oVar.mo77402c();
        oVar.mo77403d();
        this.f283935e = oVar;
        FooterLayout footerLayout = this.f283936f.f228726a;
        footerLayout.mo77362c(2);
        Button a = footerLayout.mo77360a();
        a.setText(R.string.voice_match_deeplink_welcome_action_button);
        a.setOnClickListener(new C89943l(new C101789e(this)));
        Button b = footerLayout.mo77361b();
        b.setText(R.string.voice_match_deeplink_welcome_cancel_button);
        b.setOnClickListener(new C89943l(new C101790f(this)));
        return this.f283936f;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C83973o oVar = this.f283935e;
        if (oVar != null) {
            oVar.mo77406g();
        }
    }
}
