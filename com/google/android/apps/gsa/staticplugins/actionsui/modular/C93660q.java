package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.text.format.Time;
import android.view.ContextThemeWrapper;
import com.android.datetimepicker.date.C5085h;
import com.android.datetimepicker.time.C5112h;
import com.android.datetimepicker.time.C5113i;
import com.android.p256b.C5033s;
import com.android.recurrencepicker.C5485i;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87440d;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.DateArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.DeviceSettingsArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.GroupArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.MediaControlArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.RecurrenceArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeDurationArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeOfDayArgument;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88519m;
import com.google.common.base.C58838bb;
import com.google.p4152bb.p4153a.C55200jo;
import com.google.p4152bb.p4153a.C55296nc;
import com.google.p4152bb.p4153a.C55347p;
import com.google.p4152bb.p4153a.C55374q;
import com.google.p4152bb.p4153a.C55401r;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.q */
/* compiled from: PG */
public final class C93660q implements C87440d {

    /* renamed from: a */
    public final C93602cz f261430a;

    /* renamed from: b */
    private final Context f261431b;

    /* renamed from: c */
    private final C93545aw f261432c;

    public C93660q(C93602cz czVar, Context context, C93545aw awVar) {
        this.f261430a = czVar;
        this.f261431b = new ContextThemeWrapper(context, 2132150729);
        this.f261432c = awVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo81354a(DateArgument dateArgument) {
        int i;
        int i2;
        int i3;
        if (!dateArgument.mo81263C()) {
            Calendar instance = Calendar.getInstance();
            i2 = instance.get(1);
            i = instance.get(2);
            i3 = instance.get(5);
        } else {
            C58838bb.m90883r(dateArgument.mo81263C());
            i2 = ((C55347p) dateArgument.f236203n).f145827b;
            C58838bb.m90883r(dateArgument.mo81263C());
            i = ((C55347p) dateArgument.f236203n).f145828c - 1;
            C58838bb.m90883r(dateArgument.mo81263C());
            i3 = ((C55347p) dateArgument.f236203n).f145829d;
        }
        C5085h hVar = new C5085h(new C93656m(dateArgument));
        hVar.mo10091a(i2, i, i3);
        return hVar.f16238d;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo81355b(DeviceSettingsArgument deviceSettingsArgument) {
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo81356c(EntityArgument entityArgument) {
        return null;
    }

    /* renamed from: d */
    public final /* synthetic */ Object mo81357d(GroupArgument groupArgument) {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo81358e(com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument r5) {
        /*
            r4 = this;
            com.google.bb.a.gh r5 = r5.mo81312g()
            r0 = 0
            if (r5 == 0) goto L_0x0025
            com.google.bb.a.gd r1 = r5.f145032n
            if (r1 != 0) goto L_0x000d
            com.google.bb.a.gd r1 = com.google.p4152bb.p4153a.C55108gd.f145008d
        L_0x000d:
            int r1 = r1.f145010a
            r1 = r1 & 2
            if (r1 == 0) goto L_0x001c
            com.google.bb.a.gd r5 = r5.f145032n
            if (r5 != 0) goto L_0x0019
            com.google.bb.a.gd r5 = com.google.p4152bb.p4153a.C55108gd.f145008d
        L_0x0019:
            java.lang.String r5 = r5.f145012c
            goto L_0x0026
        L_0x001c:
            int r1 = r5.f145019a
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0025
            java.lang.String r5 = r5.f145021c
            goto L_0x0026
        L_0x0025:
            r5 = r0
        L_0x0026:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.aw r1 = r4.f261432c
            android.content.Context r2 = r4.f261431b
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r3 = r4.f261430a
            dagger.a r3 = r3.f261318e
            if (r3 == 0) goto L_0x0036
            java.lang.Object r0 = r3.mo27525b()
            com.google.android.apps.gsa.sidekick.main.s.h r0 = (com.google.android.apps.gsa.sidekick.main.p7227s.C91619h) r0
        L_0x0036:
            java.lang.String r3 = "custom_location_tag"
            com.google.android.apps.gsa.sidekick.main.s.b r0 = com.google.android.apps.gsa.staticplugins.actionsui.modular.C93570bu.m154337a(r3, r1, r2, r0)
            r1 = 2132086445(0x7f150ead, float:1.9813117E38)
            com.google.android.apps.gsa.sidekick.main.s.c r5 = com.google.android.apps.gsa.sidekick.main.p7227s.C91614c.m149881a(r0, r5, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actionsui.modular.C93660q.mo81358e(com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument):java.lang.Object");
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo81359f(MediaControlArgument mediaControlArgument) {
        return null;
    }

    /* renamed from: g */
    public final /* synthetic */ Object mo81360g(PersonArgument personArgument) {
        return null;
    }

    /* renamed from: h */
    public final /* synthetic */ Object mo81361h(ProviderArgument providerArgument) {
        return null;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ Object mo81362i(RecurrenceArgument recurrenceArgument) {
        Bundle bundle = new Bundle();
        bundle.putLong("bundle_event_start_time", recurrenceArgument.mo81328a());
        bundle.putString("bundle_event_time_zone", Time.getCurrentTimezone());
        Object obj = recurrenceArgument.f236203n;
        bundle.putString("bundle_event_rrule", obj != null ? ((C5033s) obj).toString() : null);
        C5485i iVar = new C5485i();
        iVar.setArguments(bundle);
        iVar.f16626a.f16587k = new C93657n(recurrenceArgument);
        if (recurrenceArgument.mo81327O()) {
            iVar.f16626a.f16588l = true;
        }
        return iVar;
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Object mo81363j(TimeDurationArgument timeDurationArgument) {
        int i;
        int i2;
        int i3;
        if (timeDurationArgument.mo81263C()) {
            int M = (int) timeDurationArgument.mo81336M();
            int minutes = (int) TimeUnit.SECONDS.toMinutes((long) M);
            i = (int) TimeUnit.MINUTES.toHours((long) minutes);
            i2 = minutes - (i * 60);
            i3 = M - (minutes * 60);
        } else {
            i = 0;
            i2 = 1;
            i3 = 0;
        }
        return new C88519m(new C93658o(this, timeDurationArgument), i, i2, i3);
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ Object mo81364k(TimeOfDayArgument timeOfDayArgument) {
        C55374q qVar;
        int i;
        if (timeOfDayArgument.mo81263C()) {
            C55296nc ncVar = (C55296nc) timeOfDayArgument.f236203n;
            if ((ncVar.f145665a & 1) != 0) {
                C55401r rVar = ncVar.f145666b;
                if (rVar == null) {
                    rVar = C55401r.f145976e;
                }
                qVar = (C55374q) rVar.toBuilder();
                C55401r rVar2 = (C55401r) qVar.instance;
                int i2 = rVar2.f145979b;
                int i3 = rVar2.f145980c;
                C93659p pVar = new C93659p(timeOfDayArgument);
                boolean is24HourFormat = DateFormat.is24HourFormat(this.f261431b);
                C5112h hVar = new C5112h();
                Bundle bundle = new Bundle(3);
                bundle.putInt("hour", i2);
                bundle.putInt("minute", i3);
                bundle.putBoolean("24hour", is24HourFormat);
                hVar.setArguments(bundle);
                hVar.f16303a = new C5113i(pVar);
                return hVar;
            }
        }
        Calendar instance = Calendar.getInstance();
        C55374q qVar2 = (C55374q) C55401r.f145976e.createBuilder();
        int i4 = instance.get(11);
        qVar2.copyOnWrite();
        C55401r rVar3 = (C55401r) qVar2.instance;
        rVar3.f145978a |= 1;
        rVar3.f145979b = i4;
        int i5 = instance.get(12);
        qVar2.copyOnWrite();
        C55401r rVar4 = (C55401r) qVar2.instance;
        rVar4.f145978a |= 2;
        rVar4.f145980c = i5;
        C55200jo joVar = timeOfDayArgument.f236207i;
        if (joVar == null) {
            i = 30;
        } else {
            i = joVar.f145286a;
        }
        int i6 = (rVar4.f145979b * 60) + i5;
        int i7 = i6 % i;
        if (i7 != 0) {
            int i8 = (i6 + i) - i7;
            qVar2.copyOnWrite();
            C55401r rVar5 = (C55401r) qVar2.instance;
            rVar5.f145978a |= 2;
            rVar5.f145980c = i8 % 60;
            qVar2.copyOnWrite();
            C55401r rVar6 = (C55401r) qVar2.instance;
            rVar6.f145978a |= 1;
            rVar6.f145979b = (i8 / 60) % 24;
        }
        qVar = qVar2;
        C55401r rVar22 = (C55401r) qVar.instance;
        int i22 = rVar22.f145979b;
        int i32 = rVar22.f145980c;
        C93659p pVar2 = new C93659p(timeOfDayArgument);
        boolean is24HourFormat2 = DateFormat.is24HourFormat(this.f261431b);
        C5112h hVar2 = new C5112h();
        Bundle bundle2 = new Bundle(3);
        bundle2.putInt("hour", i22);
        bundle2.putInt("minute", i32);
        bundle2.putBoolean("24hour", is24HourFormat2);
        hVar2.setArguments(bundle2);
        hVar2.f16303a = new C5113i(pVar2);
        return hVar2;
    }

    /* renamed from: l */
    public final /* synthetic */ Object mo81365l() {
        return null;
    }

    /* renamed from: m */
    public final /* synthetic */ Object mo81366m() {
        return null;
    }

    /* renamed from: n */
    public final /* synthetic */ Object mo81367n() {
        return null;
    }
}
