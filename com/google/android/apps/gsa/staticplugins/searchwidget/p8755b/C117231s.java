package com.google.android.apps.gsa.staticplugins.searchwidget.p8755b;

import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.b.s */
/* compiled from: PG */
public final class C117231s {

    /* renamed from: a */
    private static final C59071e f325421a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchwidget.b.s");

    /* renamed from: b */
    private final Context f325422b;

    public C117231s(Context context) {
        this.f325422b = context;
    }

    /* renamed from: a */
    public final Optional mo103202a() {
        int i = Settings.Global.getInt(this.f325422b.getContentResolver(), "power_button_long_press", -1);
        if (i == -1) {
            int identifier = Resources.getSystem().getIdentifier("config_longPressOnPowerBehavior", "integer", "android");
            if (identifier == 0) {
                ((C59052c) ((C59052c) f325421a.mo56226d()).mo56372aa(32795)).mo56386p("Couldn't load resource ID for default LPP setting value");
                return Optional.empty();
            }
            try {
                i = this.f325422b.getResources().getInteger(identifier);
            } catch (Resources.NotFoundException e) {
                ((C59052c) ((C59052c) ((C59052c) f325421a.mo56226d()).mo56382g(e)).mo56372aa(32794)).mo56386p("Couldn't determine default LPP setting value");
                return Optional.empty();
            }
        }
        return Optional.m71637of(Boolean.valueOf(i == 5));
    }
}
