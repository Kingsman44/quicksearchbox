package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import android.app.KeyguardManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.h.a;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73870b;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73872d;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.opa.smartspace.C83793i;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g.C107061a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8274i.p8275a.C107081c;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.C110112j;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.C110113k;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3886c.C50701am;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public class AmbientAssistantDetailsActivity extends C106431z implements C110112j, C106429x, C73870b {

    /* renamed from: r */
    private static final C59071e f296760r = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ambient.activity.AmbientAssistantDetailsActivity");

    /* renamed from: j */
    public a f296761j;

    /* renamed from: k */
    public C87673aa f296762k;

    /* renamed from: l */
    public C110113k f296763l;

    /* renamed from: m */
    public C90021c f296764m;

    /* renamed from: n */
    public C92125t f296765n;

    /* renamed from: o */
    public bm f296766o;

    /* renamed from: p */
    public ViewGroup f296767p;

    /* renamed from: y */
    private final void m177188y() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.layoutInDisplayCutoutMode = 1;
        getWindow().setAttributes(attributes);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        if (((KeyguardManager) getSystemService("keyguard")).isKeyguardLocked()) {
            C58976aa aaVar = C58975e.f156826a;
            getWindow().addFlags(C89885b.ACETONE_ATTACH_BAD_TOKEN_ERROR_VALUE);
            getWindow().addFlags(1024);
        }
    }

    /* renamed from: z */
    private final void m177189z() {
        if (!this.f296762k.mo81951w()) {
            this.f296762k.mo81932c();
        }
        if (!this.f296762k.mo81953y()) {
            this.f296762k.mo81947s((Bundle) null);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m177188y();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.ak);
        super.onCreate(bundle);
        if (!C107061a.m177776a(this.f296764m)) {
            finish();
            return;
        }
        m177188y();
        setContentView((int) R.layout.aa_details_activity);
        this.f296767p = (ViewGroup) findViewById(R.id.root_container);
        overridePendingTransition(R.anim.slide_in_top, 0);
        C2043bi.m5555ai(this.f296767p, new C106399a(this));
        Intent intent = getIntent();
        C50701am f = C107081c.m177811e(intent).mo95784f();
        if (f == null || f == C50701am.UNKNOWN) {
            C59104x c = f296760r.mo56225c();
            c.mo56378ag(C58975e.f156826a, "CcgLAct");
            ((C59052c) ((C59052c) c).mo56372aa(23043)).mo56386p("No chip type, no interaction logging.");
        } else {
            this.f296765n.mo86702g(f, C83793i.m133413a(intent), this.f296766o.u() && this.f296766o.w());
        }
        m177189z();
        Intent intent2 = getIntent();
        C0154a aVar = new C0154a(mo545jw());
        C106410h hVar = new C106410h();
        hVar.f296827l = intent2;
        hVar.f296828m = C107081c.m177811e(intent2);
        aVar.mo689v(R.id.root_container, hVar, (String) null);
        aVar.mo505b(false);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        if (this.f296762k.mo81953y()) {
            this.f296762k.mo81948t(false);
        }
        if (this.f296762k.mo81951w()) {
            this.f296762k.mo81933e();
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        if (isFinishing()) {
            overridePendingTransition(0, R.anim.slide_out_bottom);
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        m177189z();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        this.f296763l.mo98389a();
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C110113k kVar = this.f296763l;
        C58976aa aaVar = C58975e.f156826a;
        kVar.f306831a = z;
    }

    /* renamed from: v */
    public final void mo95502v() {
        C58976aa aaVar = C58975e.f156826a;
        finish();
    }

    /* renamed from: w */
    public final C73872d mo65346w() {
        return this.f296761j;
    }
}
