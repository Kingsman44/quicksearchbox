package com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8133c.p8134a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.b.c.a.h */
/* compiled from: PG */
public final /* synthetic */ class C105162h implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C105164j f293160a;

    public /* synthetic */ C105162h(C105164j jVar) {
        this.f293160a = jVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C105164j jVar = this.f293160a;
        Boolean bool = (Boolean) obj;
        jVar.mo94592g();
        View findViewById = jVar.mo28297il().findViewById(R.id.header_toolbar);
        ((ViewGroup) findViewById.getParent()).removeView(findViewById);
        LayoutInflater.from(jVar.f293165d).inflate(R.layout.second_screen_app_bar_layout, jVar.f293169h, true);
        jVar.mo94591e();
    }
}
