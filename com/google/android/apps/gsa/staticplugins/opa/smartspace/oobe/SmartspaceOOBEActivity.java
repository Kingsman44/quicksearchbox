package com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe;

import android.content.Context;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p033v7.app.C0395p;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.settings.features.d.u;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.binaries.satin.app.ass;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.opa.smartspace.C83793i;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.p8839t.p8840a.C118339a;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.preferences.C86341u;
import com.google.android.apps.gsa.search.core.preferences.C86346z;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.C110849f;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.bottomsheet.C44565p;
import com.google.apps.tiktok.inject.C47266f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60888db;
import dagger.p5294a.C68225k;
import java.util.ArrayList;

/* compiled from: PG */
public class SmartspaceOOBEActivity extends C0395p {

    /* renamed from: j */
    public static final C59071e f308818j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.SmartspaceOOBEActivity");

    /* renamed from: k */
    public C90021c f308819k;

    /* renamed from: l */
    public C86127w f308820l;

    /* renamed from: m */
    public C83793i f308821m;

    /* renamed from: n */
    public u f308822n;

    /* renamed from: o */
    public C60888db f308823o;

    /* renamed from: p */
    public C118339a f308824p;

    /* renamed from: q */
    public C92125t f308825q;

    /* renamed from: r */
    private boolean f308826r = false;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.aC);
        super.onCreate(bundle);
        C110849f fVar = new C110849f(this);
        if (fVar.f308838b == null) {
            ((C110849f.C110850a) C47266f.m84076a(fVar.f308837a, C110849f.C110850a.class)).mo98901qK(fVar);
        }
        ass ass = fVar.f308838b;
        ass.f203977b = this;
        ass.f203978c = this;
        ass.f203979d = this;
        C68225k.m98529a(ass.f203977b, Context.class);
        C68225k.m98529a(ass.f203978c, C0395p.class);
        C68225k.m98529a(ass.f203979d, C0167am.class);
        aqy aqy = ass.f203976a;
        this.f308819k = (C90021c) aqy.a.f202006C.mo17428b();
        this.f308820l = (C86127w) aqy.a.f203497r.mo17428b();
        this.f308821m = (C83793i) aqy.a.f202814eF.mo17428b();
        this.f308822n = (u) aqy.a.f202829eU.mo17428b();
        this.f308823o = (C60888db) aqy.hG.mo17428b();
        this.f308824p = (C118339a) aqy.a.f202855eu.mo17428b();
        this.f308825q = (C92125t) aqy.a.f202834eZ.mo17428b();
        setContentView((int) R.layout.smartspace_intro_activity);
        C44565p pVar = new C44565p(this, R.style.ssIntroBottomSheetDialog);
        pVar.setContentView((int) R.layout.smartspace_intro_content);
        pVar.setCancelable(true);
        pVar.setCanceledOnTouchOutside(true);
        View e = pVar.mo1197b().mo1177e(R.id.design_bottom_sheet);
        if (e != null) {
            e.setBackgroundColor(getResources().getColor(17170445));
        }
        pVar.setOnCancelListener(new C110844a(this));
        String string = getResources().getString(R.string.learn_more);
        String string2 = getResources().getString(R.string.smartspace_privacy_instruction);
        SpannableString spannableString = new SpannableString(string2 + " " + string);
        C110847d dVar = new C110847d(this);
        spannableString.setSpan(dVar, spannableString.length() - string.length(), spannableString.length(), 17);
        this.f308825q.mo86712q(dVar, 108860);
        TextView textView = (TextView) pVar.mo1197b().mo1177e(R.id.smartspace_setting_description);
        if (textView != null) {
            textView.setContentDescription(spannableString);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(spannableString);
        }
        TextView textView2 = (TextView) pVar.mo1197b().mo1177e(R.id.example_text);
        if (textView2 != null) {
            textView2.setText(getResources().getQuantityString(R.plurals.smartspace_example_event, 20, new Object[]{20}));
        }
        TextView textView3 = (TextView) pVar.mo1197b().mo1177e(R.id.got_it_button);
        this.f308825q.mo86712q(textView3, 108861);
        if (textView3 != null) {
            textView3.setOnClickListener(new C110845b(this, textView3));
        }
        TextView textView4 = (TextView) pVar.mo1197b().mo1177e(R.id.secondary_button);
        this.f308825q.mo86712q(textView4, 108862);
        if (textView4 != null) {
            textView4.setOnClickListener(new C110846c(this, textView4));
        }
        pVar.show();
        this.f308825q.mo86706k(dVar, textView3, textView4);
        C86341u uVar = new C86341u((C86346z) this.f308820l.f232790a.mo79722a());
        uVar.mo80085k("smartspace_oobe_dismissed", true);
        uVar.mo80086l(false);
        this.f308821m.mo77153i(true, false);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        if (this.f308819k.mo79746e(C90017bw.f247967bc) && !this.f308826r) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(9);
            if (this.f308819k.mo79746e(C90017bw.f248023cw)) {
                arrayList.add(10);
            }
            this.f308824p.mo90815e(C53306j.AMBIENT_ASSISTANT, C58485gu.m89842j(arrayList), true, C123777f.f341922a);
            this.f308826r = true;
        }
    }
}
