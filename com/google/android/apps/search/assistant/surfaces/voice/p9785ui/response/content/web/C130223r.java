package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.content.web;

import android.net.Uri;
import android.support.p031v4.app.C0154a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.base.C43255f;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.contrib.p3372e.C43505c;
import com.google.android.libraries.web.contrib.p3372e.C43506d;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.p3420k.C43864j;
import com.google.assistant.p3897e.p3921j.p3926e.C51968fu;
import com.google.assistant.p3897e.p3921j.p3926e.C51971fx;
import com.google.common.base.C58852bp;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.content.web.r */
/* compiled from: PG */
public final /* synthetic */ class C130223r implements C58852bp {

    /* renamed from: a */
    public final /* synthetic */ C130230y f356993a;

    public /* synthetic */ C130223r(C130230y yVar) {
        this.f356993a = yVar;
    }

    /* renamed from: a */
    public final void mo40846a(Object obj) {
        String str;
        C130230y yVar = this.f356993a;
        C130216k kVar = (C130216k) obj;
        C43255f n = C43257h.m76307n();
        Uri.Builder path = new Uri.Builder().scheme("https").authority("www.google.com").path("/search");
        C51971fx fxVar = kVar.f356982b;
        if (fxVar == null) {
            fxVar = C51971fx.f136380g;
        }
        String str2 = fxVar.f136383b;
        if (str2 == null) {
            str = null;
        } else {
            str = str2.replace("'", "%27");
        }
        n.mo46349j(path.appendQueryParameter("q", str).build().toString());
        C51971fx fxVar2 = kVar.f356982b;
        if (fxVar2 == null) {
            fxVar2 = C51971fx.f136380g;
        }
        C51968fu fuVar = fxVar2.f136385d;
        if (fuVar == null) {
            fuVar = C51968fu.f136374d;
        }
        C43505c.m76763a(n, new C43506d(fuVar.f136377b.mo59041m(), yVar.f357003d));
        yVar.f357009j.mo46333b(n.mo46365k());
        if (((C43861g) yVar.f357007h.getChildFragmentManager().f634a.mo671c("web_content_fragment")) == null) {
            C43861g b = C43864j.m77436b(yVar.f357001b);
            C0154a aVar = new C0154a(yVar.f357007h.getChildFragmentManager());
            aVar.mo511h(R.id.assistant_web_content_fragment, b, "web_content_fragment", 1);
            aVar.mo509f();
        }
    }
}
