package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8455f;

import android.app.NotificationChannel;
import android.content.Context;
import android.text.format.DateFormat;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83785c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.proactive.C36221aq;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3994s.p3995a.C53175ed;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60948g;
import com.google.common.p4580v.C60950i;
import p3186j$.time.Instant;
import p3186j$.time.ZoneId;
import p3186j$.time.ZonedDateTime;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.f.o */
/* compiled from: PG */
public final class C110681o {

    /* renamed from: a */
    public static final C59071e f308412a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.smartspace.f.o");

    /* renamed from: b */
    public final Context f308413b;

    /* renamed from: c */
    public final C86124t f308414c;

    /* renamed from: d */
    public final C83785c f308415d;

    /* renamed from: e */
    public final C36221aq f308416e;

    /* renamed from: f */
    public final C60950i f308417f;

    /* renamed from: g */
    public final ZoneId f308418g;

    public C110681o(Context context, C86124t tVar, C83785c cVar, C36221aq aqVar, C60950i iVar, ZoneId zoneId) {
        this.f308413b = context;
        this.f308414c = tVar;
        this.f308415d = cVar;
        this.f308416e = aqVar;
        this.f308417f = iVar;
        this.f308418g = zoneId;
    }

    /* renamed from: c */
    private static String m184377c(C51473j jVar, Context context) {
        String str = true != DateFormat.is24HourFormat(context) ? "h:mm" : "HH:mm";
        C60948g gVar = C60948g.f165068a;
        ZonedDateTime atZone = Instant.now().atZone(ZoneId.systemDefault());
        C52403ql qlVar = jVar.f134096e;
        if (qlVar == null) {
            qlVar = C52403ql.f137512f;
        }
        ZonedDateTime withHour = atZone.withHour(qlVar.f137515b);
        C52403ql qlVar2 = jVar.f134096e;
        if (qlVar2 == null) {
            qlVar2 = C52403ql.f137512f;
        }
        return DateFormat.format(str, withHour.withMinute(qlVar2.f137516c).toInstant().toEpochMilli()).toString();
    }

    /* renamed from: a */
    public final Optional mo98850a(C58485gu guVar, C53175ed edVar) {
        if (guVar.isEmpty()) {
            C59104x c = f308412a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "EvtSuggsProducer");
            ((C59052c) ((C59052c) c).mo56372aa(26649)).mo56386p("No alarms found.");
            return Optional.empty();
        }
        C51473j jVar = (C51473j) guVar.get(0);
        C52403ql qlVar = jVar.f134096e;
        if (qlVar == null) {
            qlVar = C52403ql.f137512f;
        }
        if ((qlVar.f137514a & 1) == 0) {
            C59104x c2 = f308412a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "EvtSuggsProducer");
            ((C59052c) ((C59052c) c2).mo56372aa(26648)).mo56386p("Invalid alarm.");
            return Optional.empty();
        } else if (!C110684r.m184383b(edVar)) {
            return Optional.empty();
        } else {
            String a = C110684r.m184382a(edVar);
            C58976aa aaVar = C58975e.f156826a;
            m184377c(jVar, this.f308413b);
            return Optional.m71637of(new C110667a(a, this.f308413b.getResources().getString(R.string.tomorrow_holiday_text, new Object[]{a}), this.f308413b.getResources().getQuantityString(R.plurals.holiday_alarms_notification_content_text, guVar.size(), new Object[]{m184377c(jVar, this.f308413b)})));
        }
    }

    /* renamed from: b */
    public final void mo98851b(String str, String str2) {
        NotificationChannel notificationChannel = new NotificationChannel("com.google.android.apps.gsa.staticplugins.opa.smartspace.HOLIDAY_ALARMS_NOTIFICATION_CHANNEL_ID", str, 4);
        notificationChannel.setDescription(str2);
        C58976aa aaVar = C58975e.f156826a;
        this.f308416e.mo40032d(notificationChannel);
    }
}
