package com.google.android.apps.gsa.staticplugins.opa.ambient.p8263g;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b.C9685m;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83784b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.C106973d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8260d.C106990ap;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.g.a */
/* compiled from: PG */
public final class C107041a implements C9685m {

    /* renamed from: a */
    private final C106973d f298078a;

    /* renamed from: b */
    private final C106990ap f298079b;

    /* renamed from: c */
    private final C83794j f298080c;

    /* renamed from: d */
    private final C83784b f298081d;

    /* renamed from: e */
    private final Context f298082e;

    public C107041a(C106990ap apVar, C106973d dVar, C83794j jVar, C83784b bVar, Context context) {
        this.f298079b = apVar;
        this.f298078a = dVar;
        this.f298080c = jVar;
        this.f298081d = bVar;
        this.f298082e = context;
    }

    /* renamed from: a */
    public final void mo17961a(String str, boolean z) {
        if (this.f298080c.mo77174l()) {
            this.f298081d.mo77117c();
        }
        this.f298078a.mo95725a(this.f298079b.mo95727a());
        Intent intent = new Intent("com.google.android.googlequicksearchbox.AA_ACTION_REFRESH");
        intent.putExtra("ss-opt-in-changed", true);
        intent.setPackage(this.f298082e.getPackageName());
        this.f298082e.sendBroadcast(intent);
    }
}
