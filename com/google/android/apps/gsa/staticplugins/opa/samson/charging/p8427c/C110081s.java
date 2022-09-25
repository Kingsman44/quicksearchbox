package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8427c;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108924e;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110402b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.c.s */
/* compiled from: PG */
public final class C110081s extends C84036z {

    /* renamed from: a */
    private final C110076n f306698a;

    /* renamed from: b */
    private final C110087y f306699b;

    /* renamed from: c */
    private final C108924e f306700c;

    /* renamed from: d */
    private final C110402b f306701d;

    public C110081s(C108924e eVar, C110076n nVar, C110087y yVar, C110402b bVar) {
        this.f306700c = eVar;
        this.f306698a = nVar;
        this.f306699b = yVar;
        this.f306701d = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        if (!this.f306701d.mo98629a()) {
            return C58485gu.m89845m();
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_track_opt_out", true);
        C110076n nVar = this.f306698a;
        nVar.f306685a = bundle;
        return C58485gu.m89848p(this.f306700c, nVar, C83875ai.m133537b(this.f306699b));
    }
}
