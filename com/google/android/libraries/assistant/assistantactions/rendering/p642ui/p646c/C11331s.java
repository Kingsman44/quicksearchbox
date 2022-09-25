package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c;

import android.os.Bundle;
import com.android.p256b.C5033s;
import com.android.recurrencepicker.C5485i;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11306d;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.c.s */
/* compiled from: PG */
public final class C11331s extends C5485i {

    /* renamed from: b */
    public C11330r f36809b;

    /* renamed from: c */
    public C11329q f36810c;

    /* renamed from: b */
    public static C11331s m26942b(String str, C52393qb qbVar, boolean z, C11329q qVar) {
        C11330r rVar = new C11330r(str, qbVar, z);
        C11331s sVar = new C11331s();
        sVar.mo19763c(rVar, qVar);
        return sVar;
    }

    /* renamed from: c */
    public final void mo19763c(C11330r rVar, C11329q qVar) {
        this.f36809b = rVar;
        Bundle bundle = new Bundle();
        bundle.putLong("bundle_event_start_time", rVar.f36807c);
        bundle.putString("bundle_event_time_zone", rVar.f36805a);
        bundle.putBoolean("bundle_event_is_weekly_only", rVar.f36808d);
        C58833ax d = C11306d.m26904d(rVar.f36806b);
        bundle.putString("bundle_event_rrule", d.mo56113h() ? ((C5033s) d.mo56107c()).toString() : BuildConfig.FLAVOR);
        setArguments(bundle);
        this.f36810c = qVar;
        this.f16626a.f16587k = new C11328p(this);
    }
}
