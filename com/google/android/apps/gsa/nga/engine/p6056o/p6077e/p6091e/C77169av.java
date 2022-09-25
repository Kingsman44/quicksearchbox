package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6307af.C80595f;
import com.google.android.apps.gsa.nga.shared.p6307af.C80600k;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80590x;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.assistant.p3897e.p3917i.p3918a.C51500k;
import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4538j.C59302a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import p3186j$.time.LocalTime;
import p3186j$.time.format.DateTimeFormatter;
import p3186j$.time.format.FormatStyle;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.av */
/* compiled from: PG */
public final /* synthetic */ class C77169av implements C77186bl {

    /* renamed from: a */
    public final /* synthetic */ C77170aw f212964a;

    public /* synthetic */ C77169av(C77170aw awVar) {
        this.f212964a = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo72466a(C76590bg bgVar, C74965n nVar, C58485gu guVar) {
        String str;
        C77170aw awVar = this.f212964a;
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.mo74319k(23108);
        if (guVar.size() <= 1 || nVar.mo71328c().mo71266e()) {
            C51500k kVar = (C51500k) C51527l.f134273f.createBuilder();
            kVar.mo53630b(guVar);
            C81442m.m129557s(lVar, t.i("alarm.REMOVE_ALARM", (C51527l) kVar.build()));
            Locale q = nVar.mo71342q();
            if (guVar.size() != 1) {
                C81515c cVar = awVar.f212965a;
                str = cVar.mo75121a(q).getString(R.string.nga_productivity_delete_alarm_multiple_response, new Object[]{Integer.valueOf(guVar.size())});
            } else {
                C51473j jVar = (C51473j) guVar.get(0);
                C52403ql qlVar = jVar.f134096e;
                if (qlVar == null) {
                    qlVar = C52403ql.f137512f;
                }
                String format = LocalTime.m71211of(qlVar.f137515b, qlVar.f137516c).format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(q));
                Object[] objArr = {format};
                String string = awVar.f212965a.mo75121a(q).getString(R.string.nga_productivity_delete_alarm_time_response, objArr);
                if (!jVar.f134099h.isEmpty()) {
                    String a = C59302a.f157435a.mo56216a(jVar.f134099h);
                    Object[] objArr2 = {a, format};
                    str = awVar.f212965a.mo75121a(q).getString(R.string.nga_productivity_delete_alarm_label_response, objArr2);
                } else {
                    str = string;
                }
            }
            C81442m.m129557s(lVar, t.r(str));
            C80595f f = C80595f.m128216f(C80590x.CLIENT_OP_SUGGESTION_ON_DEVICE, awVar.f212965a.mo75121a(q).getString(R.string.nga_productivity_show_alarms_suggestion, new Object[0]));
            f.mo74361h(27105);
            C81442m.m129557s(lVar, t.n(C80600k.m128226a(f.mo74357a(new Intent("android.intent.action.SHOW_ALARMS")).mo74356a())));
            return C60856cj.m92900i((C80401n) lVar.build());
        }
        awVar.f212968d.mo76648a(nVar.mo71336k(), C82835ce.SUPPORTED_APPLICATION_NOT_FOUND, C83044e.f226656a);
        return C81442m.f222851a;
    }
}
