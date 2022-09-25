package com.google.android.apps.search.googleapp.stampviewer.webview.p10505f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.apps.tiktok.tracing.C47591co;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.f.l */
/* compiled from: PG */
final class C139597l extends C46756m {

    /* renamed from: a */
    final /* synthetic */ C139598m f379488a;

    public C139597l(C139598m mVar) {
        this.f379488a = mVar;
    }

    /* renamed from: a */
    public final View mo18113a(ViewGroup viewGroup) {
        return LayoutInflater.from(this.f379488a.f379489a).inflate(R.layout.googleapp_overflow_menu_item, viewGroup, false);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18114b(View view, Object obj) {
        C139604s sVar = (C139604s) obj;
        view.setId(sVar.mo115076b());
        ((TextView) view.findViewById(R.id.googleapp_label)).setText(sVar.mo115077c());
        ((ImageView) view.findViewById(R.id.googleapp_icon)).setImageResource(sVar.mo115075a());
        view.setOnClickListener(new C47591co(this.f379488a.f379491c, "STAMP Viewer OverflowMenuItem onClick()", new C139596k(this, sVar, view)));
    }
}
