package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b;

import android.os.Bundle;
import com.android.p256b.C5033s;
import com.android.recurrencepicker.C5486j;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33232j;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52397qf;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.b.r */
/* compiled from: PG */
public final class C33259r extends C5486j {

    /* renamed from: b */
    public static final String f88929b = "r";

    /* renamed from: c */
    public C33258q f88930c;

    /* renamed from: d */
    public C33257p f88931d;

    /* renamed from: b */
    public static C33259r m61672b(String str, C52397qf qfVar, boolean z, C33257p pVar) {
        C33258q qVar = new C33258q(str, qfVar, z);
        C33259r rVar = new C33259r();
        rVar.mo38637d(qVar, pVar);
        return rVar;
    }

    /* renamed from: c */
    public static C33259r m61673c(String str, C52393qb qbVar, boolean z, C33257p pVar) {
        C33258q qVar = new C33258q(str, qbVar, z);
        C33259r rVar = new C33259r();
        rVar.mo38637d(qVar, pVar);
        return rVar;
    }

    /* renamed from: d */
    public final void mo38637d(C33258q qVar, C33257p pVar) {
        this.f88930c = qVar;
        Bundle bundle = new Bundle();
        bundle.putLong("bundle_event_start_time", qVar.f88927c);
        bundle.putString("bundle_event_time_zone", qVar.f88925a);
        bundle.putBoolean("bundle_event_is_weekly_only", qVar.f88928d);
        Optional d = C33232j.m61630d(qVar.f88926b);
        bundle.putString("bundle_event_rrule", d.isPresent() ? ((C5033s) d.get()).toString() : BuildConfig.FLAVOR);
        setArguments(bundle);
        this.f88931d = pVar;
        this.f16628a.f16587k = new C33256o(this);
    }
}
