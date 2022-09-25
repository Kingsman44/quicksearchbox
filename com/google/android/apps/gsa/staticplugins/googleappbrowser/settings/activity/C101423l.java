package com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.activity;

import android.support.p033v7.app.C0392m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.profile.C44069d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import java.util.EnumSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.activity.l */
/* compiled from: PG */
public final /* synthetic */ class C101423l implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C101424m f282974a;

    public /* synthetic */ C101423l(C101424m mVar) {
        this.f282974a = mVar;
    }

    public final void onClick(View view) {
        C101424m mVar = this.f282974a;
        EnumSet<E> noneOf = EnumSet.noneOf(C44069d.class);
        if (mVar.f282982h.f282961c) {
            noneOf.add(C44069d.COOKIES_AND_SITE_DATA);
        }
        if (mVar.f282982h.f282960b) {
            noneOf.add(C44069d.CACHE);
        }
        C46439e eVar = mVar.f282980f;
        C46438d b = C46438d.m82810b(mVar.f282979e.mo46483a(noneOf));
        eVar.mo50428h(b.f121541a, (Object) null, mVar.f282984j);
        C0392m mVar2 = mVar.f282987m;
        mVar2.getClass();
        mVar2.setContentView(LayoutInflater.from(mVar.f282981g.requireContext()).inflate(R.layout.google_app_browser_clearing_in_progress, (ViewGroup) null));
    }
}
