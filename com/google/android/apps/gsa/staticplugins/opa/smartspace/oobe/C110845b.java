package com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.b */
/* compiled from: PG */
public final /* synthetic */ class C110845b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SmartspaceOOBEActivity f308831a;

    /* renamed from: b */
    public final /* synthetic */ TextView f308832b;

    public /* synthetic */ C110845b(SmartspaceOOBEActivity smartspaceOOBEActivity, TextView textView) {
        this.f308831a = smartspaceOOBEActivity;
        this.f308832b = textView;
    }

    public final void onClick(View view) {
        SmartspaceOOBEActivity smartspaceOOBEActivity = this.f308831a;
        smartspaceOOBEActivity.f308825q.mo86704i(this.f308832b);
        if (!smartspaceOOBEActivity.f308819k.mo79746e(C90017bw.f247903aR)) {
            C58976aa aaVar = C58975e.f156826a;
            smartspaceOOBEActivity.finish();
            return;
        }
        C60870cx a = smartspaceOOBEActivity.f308822n.a();
        C110848e eVar = new C110848e(smartspaceOOBEActivity);
        C60856cj.m92911t(a, C47810es.m84974n(eVar), smartspaceOOBEActivity.f308823o);
    }
}
