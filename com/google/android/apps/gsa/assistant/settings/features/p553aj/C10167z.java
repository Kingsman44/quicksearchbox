package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.features.at.c;
import com.google.android.apps.gsa.assistant.settings.features.av.bg;
import com.google.android.apps.gsa.assistant.settings.features.av.bh;
import com.google.android.apps.gsa.assistant.settings.features.p5698at.C72856b;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.z */
/* compiled from: PG */
public final class C10167z {
    /* renamed from: a */
    public static Fragment m25031a(Bundle bundle) {
        C10166y yVar = new C10166y();
        yVar.setArguments(bundle);
        return yVar;
    }

    /* renamed from: b */
    public static C72856b m25032b(Bundle bundle) {
        c d = C72856b.m107584d();
        c cVar = d;
        cVar.d = 2;
        String string = bundle.getString("assistant_settings_feature_action", BuildConfig.FLAVOR);
        String string2 = bundle.getString("assistant_settings_feature_secondary_action", BuildConfig.FLAVOR);
        bg createBuilder = bh.c.createBuilder();
        if (string.equals("structure_settings")) {
            createBuilder.copyOnWrite();
            bh bhVar = createBuilder.instance;
            string2.getClass();
            bhVar.a = 2;
            bhVar.b = string2;
        } else if (string.equals("device_settings")) {
            createBuilder.copyOnWrite();
            bh bhVar2 = createBuilder.instance;
            string2.getClass();
            bhVar2.a = 1;
            bhVar2.b = string2;
        }
        C10122az azVar = new C10122az();
        C68324h.m98669f(azVar);
        C47243l.m84039a(azVar, createBuilder.build());
        cVar.b = Optional.m71637of(azVar);
        return d.a();
    }
}
