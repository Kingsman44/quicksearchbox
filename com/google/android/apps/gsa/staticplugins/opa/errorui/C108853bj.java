package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.opaonboarding.HotwordTrainingConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.staticplugins.opa.util.C113760ac;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.bj */
/* compiled from: PG */
public final class C108853bj extends C84036z {

    /* renamed from: a */
    public final HotwordTrainingConfig f302666a;

    /* renamed from: b */
    public final C86124t f302667b;

    /* renamed from: c */
    public final C113760ac f302668c;

    /* renamed from: d */
    public final C89994f f302669d;

    /* renamed from: e */
    private final SharedPreferences f302670e;

    public C108853bj(HotwordTrainingConfig hotwordTrainingConfig, C86124t tVar, C113760ac acVar, C89994f fVar, SharedPreferences sharedPreferences) {
        this.f302666a = hotwordTrainingConfig;
        this.f302667b = tVar;
        this.f302668c = acVar;
        this.f302669d = fVar;
        this.f302670e = sharedPreferences;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        this.f302670e.edit().putBoolean("opa_hotword_training_force_seen", false).apply();
        if (this.f302666a.mo77193a() == 66) {
            return C58485gu.m89847o(new C108850bg(this), new C108851bh(this));
        }
        return C58485gu.m89847o(new C108851bh(this), new C108852bi(this));
    }
}
