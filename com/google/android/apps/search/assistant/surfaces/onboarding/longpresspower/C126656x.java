package com.google.android.apps.search.assistant.surfaces.onboarding.longpresspower;

import android.content.Context;
import android.content.Intent;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.setupdesign.p3558f.C45311e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.longpresspower.x */
/* compiled from: PG */
public final class C126656x {

    /* renamed from: a */
    public static final C59071e f348786a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.onboarding.longpresspower.x");

    /* renamed from: b */
    public final Context f348787b;

    /* renamed from: c */
    public final C126652t f348788c;

    /* renamed from: d */
    public final C28306ab f348789d;

    /* renamed from: e */
    public final C28310af f348790e;

    /* renamed from: f */
    public final C28443m f348791f;

    public C126656x(C126652t tVar, C28306ab abVar, C28310af afVar, C28443m mVar) {
        this.f348787b = tVar.getContext();
        this.f348788c = tVar;
        this.f348789d = abVar;
        this.f348790e = afVar;
        this.f348791f = mVar;
    }

    /* renamed from: a */
    public final void mo107663a() {
        Intent intent = new Intent(C45311e.m80759c(this.f348787b, R.string.assistant_long_press_power_first_time_edu_settings_intent_action));
        intent.addFlags(268468224);
        if (intent.resolveActivity(this.f348787b.getPackageManager()) == null) {
            ((C59052c) ((C59052c) f348786a.mo56226d()).mo56372aa(37079)).mo56386p("Cannot resolve intent, opening android default settings");
            C47810es.m84979s(this.f348787b, new Intent("android.settings.SETTINGS").addFlags(268468224));
            return;
        }
        C47810es.m84979s(this.f348787b, intent);
    }
}
