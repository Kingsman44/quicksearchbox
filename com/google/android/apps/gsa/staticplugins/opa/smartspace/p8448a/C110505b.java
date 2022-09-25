package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8448a;

import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
import android.text.format.DateUtils;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6690db.C85299b;
import com.google.android.apps.gsa.smartspace.C92114j;
import com.google.android.apps.gsa.smartspace.C92117m;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8465p.C110891p;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.a.b */
/* compiled from: PG */
public final class C110505b {

    /* renamed from: a */
    public static final C59071e f308087a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.smartspace.a.b");

    /* renamed from: b */
    public final Context f308088b;

    /* renamed from: c */
    public final C83794j f308089c;

    /* renamed from: d */
    public final C110891p f308090d;

    /* renamed from: e */
    public final C110504a f308091e = new C110504a(this);

    /* renamed from: f */
    public final C118561t f308092f;

    /* renamed from: g */
    private final C85299b f308093g;

    /* renamed from: h */
    private final C68214a f308094h;

    public C110505b(Context context, C85299b bVar, C68214a aVar, C83794j jVar, C110891p pVar, C118561t tVar) {
        this.f308088b = context;
        this.f308093g = bVar;
        this.f308094h = aVar;
        this.f308089c = jVar;
        this.f308090d = pVar;
        this.f308092f = tVar;
    }

    /* renamed from: b */
    private final void m184096b(C92114j jVar) {
        String string = this.f308088b.getResources().getString(R.string.no_alarm_title);
        jVar.copyOnWrite();
        C92117m mVar = (C92117m) jVar.instance;
        C92117m mVar2 = C92117m.f256824i;
        string.getClass();
        mVar.f256826a |= 1;
        mVar.f256827b = string;
        String string2 = this.f308088b.getResources().getString(R.string.no_alarm_subtitle);
        jVar.copyOnWrite();
        C92117m mVar3 = (C92117m) jVar.instance;
        string2.getClass();
        mVar3.f256826a |= 2;
        mVar3.f256828c = string2;
    }

    /* renamed from: a */
    public final void mo98747a() {
        if (!this.f308090d.mo98919c()) {
            C58976aa aaVar = C58975e.f156826a;
            C118826c cVar = C118826c.f331422a;
            return;
        }
        C92114j jVar = (C92114j) C92117m.f256824i.createBuilder();
        jVar.copyOnWrite();
        C92117m mVar = (C92117m) jVar.instance;
        mVar.f256832g = 10;
        mVar.f256826a |= 64;
        String uri = new Intent("android.intent.action.SHOW_ALARMS").toUri(1);
        jVar.copyOnWrite();
        C92117m mVar2 = (C92117m) jVar.instance;
        uri.getClass();
        mVar2.f256826a |= 128;
        mVar2.f256833h = uri;
        C110891p pVar = this.f308090d;
        int a = pVar.mo98917a();
        long b = a < 2 ? pVar.mo98918b(2, false) : a >= 21 ? pVar.mo98918b(2, true) : pVar.f308928a.mo26870b();
        jVar.copyOnWrite();
        C92117m mVar3 = (C92117m) jVar.instance;
        mVar3.f256826a |= 32;
        mVar3.f256831f = b;
        AlarmManager.AlarmClockInfo nextAlarmClock = ((AlarmManager) this.f308094h.mo27525b()).getNextAlarmClock();
        if (nextAlarmClock == null) {
            C58976aa aaVar2 = C58975e.f156826a;
            m184096b(jVar);
        } else {
            long triggerTime = nextAlarmClock.getTriggerTime();
            C110891p pVar2 = this.f308090d;
            boolean z = triggerTime >= pVar2.mo98918b(4, false) && triggerTime <= pVar2.mo98918b(10, false);
            boolean z2 = triggerTime >= pVar2.mo98918b(4, true) && triggerTime <= pVar2.mo98918b(10, true);
            if (z || z2) {
                String string = this.f308088b.getResources().getString(R.string.has_alarm_title, new Object[]{DateUtils.formatDateTime(this.f308088b, nextAlarmClock.getTriggerTime(), 32771)});
                jVar.copyOnWrite();
                C92117m mVar4 = (C92117m) jVar.instance;
                string.getClass();
                mVar4.f256826a |= 1;
                mVar4.f256827b = string;
                String formatDateTime = DateUtils.formatDateTime(this.f308088b, nextAlarmClock.getTriggerTime(), 1);
                jVar.copyOnWrite();
                C92117m mVar5 = (C92117m) jVar.instance;
                formatDateTime.getClass();
                mVar5.f256826a |= 2;
                mVar5.f256828c = formatDateTime;
            } else {
                C58976aa aaVar3 = C58975e.f156826a;
                m184096b(jVar);
            }
        }
        this.f308093g.mo78853f(jVar.build());
    }
}
