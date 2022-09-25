package com.google.android.apps.search.assistant.verticals.reminders.p10075b;

import android.accounts.Account;
import com.google.android.apps.search.assistant.verticals.reminders.p10076c.p10077a.C132545c;
import com.google.android.apps.search.assistant.verticals.reminders.p10076c.p10077a.C132549g;
import com.google.android.gms.reminders.C145773b;
import com.google.android.gms.reminders.C145775d;
import com.google.android.gms.reminders.C145778g;
import com.google.android.gms.reminders.C145780i;
import com.google.android.libraries.p3339v.C43205e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3863av.p3875f.C50569b;
import com.google.assistant.p3863av.p3875f.C50572e;
import com.google.assistant.p3863av.p3875f.C50578k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.assistant.verticals.reminders.b.b */
/* compiled from: PG */
public final class C132542b implements C50572e {

    /* renamed from: a */
    public static final /* synthetic */ int f361719a = 0;

    /* renamed from: c */
    private final C132549g f361720c;

    public C132542b(C132549g gVar) {
        this.f361720c = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo53409a(C50569b bVar) {
        C132549g gVar = this.f361720c;
        C50578k kVar = bVar.f131606a;
        if (kVar == null) {
            kVar = C50578k.f131618b;
        }
        C145780i a = C145778g.m237071a(gVar.f361728b, new C145773b(new Account(kVar.f131620a, "com.google")));
        C145775d dVar = new C145775d();
        dVar.f394140g = 1;
        dVar.f394139f = false;
        return C60922j.m93044g(C47633f.m84733g(C43205e.m76192b(a.mo121954d(dVar.mo121943a()))).mo51515h(C132545c.f361723a, gVar.f361727a), C132541a.f361718a, C60826bg.f164896a);
    }
}
