package com.google.android.apps.gsa.staticplugins.opa.p8295aq;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109790aj;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.p8314a.C107640a;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.ThinkingIndicator;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aq.g */
/* compiled from: PG */
public final class C107383g {

    /* renamed from: a */
    public final Context f298864a;

    /* renamed from: b */
    public final C108230ba f298865b;

    /* renamed from: c */
    public final ViewGroup f298866c;

    /* renamed from: d */
    public final ThinkingIndicator f298867d;

    /* renamed from: e */
    public final SharedPreferences f298868e;

    /* renamed from: f */
    public final C109790aj f298869f;

    /* renamed from: g */
    public final C86054o f298870g;

    /* renamed from: h */
    public final C2332ag f298871h;

    public C107383g(ViewStub viewStub, C107640a aVar, C108230ba baVar, SharedPreferences sharedPreferences, C109790aj ajVar, C86054o oVar, Context context, C2391v vVar) {
        C2332ag agVar = new C2332ag();
        this.f298871h = agVar;
        agVar.mo5708l(C107382f.READY_TO_RENDER);
        this.f298864a = context;
        viewStub.setLayoutResource(R.layout.proactive_overlay);
        ViewGroup viewGroup = (ViewGroup) viewStub.inflate();
        this.f298866c = viewGroup;
        this.f298867d = (ThinkingIndicator) viewGroup.findViewById(R.id.thinking_indicator);
        this.f298868e = sharedPreferences;
        this.f298869f = ajVar;
        this.f298870g = oVar;
        this.f298865b = baVar;
        baVar.mo95376R(false);
        aVar.mo96082j().mo5704e(vVar, new C107380d(this));
    }

    /* renamed from: a */
    public final C107382f mo95997a() {
        C107382f fVar = (C107382f) this.f298871h.mo3842a();
        fVar.getClass();
        return fVar;
    }

    /* renamed from: b */
    public final void mo95998b(TextView textView) {
        textView.setText(Html.fromHtml(this.f298864a.getString(R.string.tos_and_pp_string)));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setVisibility(0);
    }
}
