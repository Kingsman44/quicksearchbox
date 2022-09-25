package com.google.android.apps.search.googleapp.settingsui;

import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.googleapp.settingsui.p10483b.C139177d;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.bi */
/* compiled from: PG */
final class C139186bi implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C139183bf f378541a;

    public C139186bi(C139183bf bfVar) {
        this.f378541a = bfVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C139183bf bfVar = this.f378541a;
        C69664n.m101061g((C139177d) bVar, "event");
        if (!(bfVar.mo114805a() instanceof SettingsSearchFragment)) {
            C0154a aVar = new C0154a(bfVar.f378535a.getChildFragmentManager());
            aVar.mo689v(R.id.googleapp_settings_preference_content_fragment, SettingsSearchFragment.m226058b(bfVar.f378536b), (String) null);
            aVar.mo686s((String) null);
            aVar.mo505b(false);
            bfVar.f378535a.getChildFragmentManager().mo467ah();
        }
        return C47392e.f123115a;
    }
}
