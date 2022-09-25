package com.google.android.libraries.search.assistant.performer.p2766i;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36186h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36187i;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62961ch;
import java.util.ArrayList;
import java.util.Map;
import p3186j$.time.DateTimeException;
import p3186j$.time.LocalTime;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.e */
/* compiled from: PG */
public final class C36157e implements C35472h {

    /* renamed from: a */
    private static final C59071e f94504a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.i.e");

    /* renamed from: b */
    private static final Uri f94505b = Uri.parse("clock-app://com.google.android.deskclock/alarm");

    /* renamed from: c */
    private final C36186h f94506c;

    /* renamed from: d */
    private final C36158f f94507d = new C36121a(C58729pv.f156485a);

    public C36157e(C36187i iVar, C35470f fVar) {
        this.f94506c = iVar.mo40004a(fVar);
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        return C36128ag.m64534b(dyVar, "alarm.CREATE_ALARM", new C36156d(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo39995b(C51527l lVar) {
        Intent intent;
        C52397qf qfVar;
        C52397qf qfVar2;
        C52397qf qfVar3;
        C52397qf qfVar4;
        C36128ag.m64537e(lVar.f134276b.size() > 0, "Alarm count is 0 or negative. No alarms to create");
        C51473j jVar = (C51473j) lVar.f134276b.get(0);
        C52403ql qlVar = jVar.f134096e;
        if (qlVar == null) {
            qlVar = C52403ql.f137512f;
        }
        try {
            LocalTime.m71211of(qlVar.f137515b, qlVar.f137516c);
            String str = lVar.f134279e;
            if (str.equals("com.google.android.deskclock")) {
                C36158f fVar = this.f94507d;
                ((C59052c) ((C59052c) f94504a.mo56224b()).mo56372aa(52184)).mo56386p("Setting the alarm using Google Clock app.");
                Uri.Builder appendPath = f94505b.buildUpon().appendPath("create");
                C52403ql qlVar2 = jVar.f134096e;
                if (qlVar2 == null) {
                    qlVar2 = C52403ql.f137512f;
                }
                Uri.Builder appendQueryParameter = appendPath.appendQueryParameter("hour", Integer.toString(qlVar2.f137515b));
                C52403ql qlVar3 = jVar.f134096e;
                if (qlVar3 == null) {
                    qlVar3 = C52403ql.f137512f;
                }
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("minute", Integer.toString(qlVar3.f137516c));
                C58800sl lA = ((C36121a) fVar).f94458a.entrySet().iterator();
                while (lA.hasNext()) {
                    Map.Entry entry = (Map.Entry) lA.next();
                    appendQueryParameter2.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                if ((jVar.f134092a & 1) != 0) {
                    appendQueryParameter2.appendQueryParameter("uuid", jVar.f134095d);
                }
                if (jVar.f134093b == 4) {
                    qfVar3 = (C52397qf) jVar.f134094c;
                } else {
                    qfVar3 = C52397qf.f137491j;
                }
                if (qfVar3.f137496d.size() > 0) {
                    if (jVar.f134093b == 4) {
                        qfVar4 = (C52397qf) jVar.f134094c;
                    } else {
                        qfVar4 = C52397qf.f137491j;
                    }
                    for (Integer intValue : qfVar4.f137496d) {
                        appendQueryParameter2.appendQueryParameter("dayOfWeek", C36128ag.m64536d(intValue.intValue()));
                    }
                }
                if ((jVar.f134092a & 64) != 0) {
                    appendQueryParameter2.appendQueryParameter("message", jVar.f134099h);
                }
                intent = new Intent().setData(appendQueryParameter2.build()).setPackage(f94505b.getHost());
            } else {
                ((C59052c) ((C59052c) f94504a.mo56224b()).mo56372aa(52183)).mo56389s("Setting an alarm using public Clock API on %s", str);
                Intent intent2 = new Intent("android.intent.action.SET_ALARM");
                C52403ql qlVar4 = jVar.f134096e;
                if (qlVar4 == null) {
                    qlVar4 = C52403ql.f137512f;
                }
                intent2.putExtra("android.intent.extra.alarm.HOUR", qlVar4.f137515b);
                C52403ql qlVar5 = jVar.f134096e;
                if (qlVar5 == null) {
                    qlVar5 = C52403ql.f137512f;
                }
                intent2.putExtra("android.intent.extra.alarm.MINUTES", qlVar5.f137516c);
                intent2.putExtra("android.intent.extra.alarm.SKIP_UI", true);
                if (jVar.f134093b == 4) {
                    qfVar = (C52397qf) jVar.f134094c;
                } else {
                    qfVar = C52397qf.f137491j;
                }
                if (qfVar.f137496d.size() > 0) {
                    if (jVar.f134093b == 4) {
                        qfVar2 = (C52397qf) jVar.f134094c;
                    } else {
                        qfVar2 = C52397qf.f137491j;
                    }
                    C62961ch<Integer> chVar = qfVar2.f137496d;
                    ArrayList arrayList = new ArrayList();
                    for (Integer num : chVar) {
                        C36128ag.m64538f(num.intValue());
                        arrayList.add(Integer.valueOf(num.intValue() + 1));
                    }
                    intent2.putIntegerArrayListExtra("android.intent.extra.alarm.DAYS", arrayList);
                }
                if ((jVar.f134092a & 64) != 0) {
                    intent2.putExtra("android.intent.extra.alarm.MESSAGE", jVar.f134099h);
                }
                if (!TextUtils.isEmpty(str)) {
                    intent2.setPackage(str);
                }
                intent = intent2;
            }
            return this.f94506c.mo40003a(intent);
        } catch (DateTimeException e) {
            throw new C35471g((Throwable) e);
        }
    }
}
