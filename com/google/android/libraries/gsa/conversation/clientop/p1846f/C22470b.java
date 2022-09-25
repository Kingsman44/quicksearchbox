package com.google.android.libraries.gsa.conversation.clientop.p1846f;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62961ch;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.f.b */
/* compiled from: PG */
public final class C22470b extends C22538o {

    /* renamed from: a */
    private final C22459a f62037a;

    public C22470b(C22459a aVar) {
        this.f62037a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        Intent intent;
        C52397qf qfVar;
        C52397qf qfVar2;
        int i;
        C52397qf qfVar3;
        C52397qf qfVar4;
        String str;
        if (dyVar.f135936b.equals("alarm.CREATE_ALARM")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C51527l lVar = (C51527l) m41992m(dwVar, "alarm_params", C51527l.f134273f.getParserForType());
            C22459a aVar = this.f62037a;
            C22459a.m41904a(lVar.f134276b.size() > 0);
            C51473j jVar = (C51473j) lVar.f134276b.get(0);
            C52403ql qlVar = jVar.f134096e;
            if (qlVar == null) {
                qlVar = C52403ql.f137512f;
            }
            int i2 = qlVar.f137515b;
            C22459a.m41904a(i2 >= 0 && i2 < 24);
            int i3 = qlVar.f137516c;
            C22459a.m41904a(i3 >= 0 && i3 < 60);
            String str2 = lVar.f134279e;
            if (str2.equals("com.google.android.deskclock")) {
                ((C59052c) ((C59052c) C22459a.f62020a.mo56224b()).mo56372aa(48292)).mo56386p("Setting the alarm using Google Clock app.");
                Uri.Builder appendPath = C22459a.f62021b.buildUpon().appendPath("create");
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
                        int intValue2 = intValue.intValue();
                        C22459a.m41904a(intValue2 >= 0);
                        C22459a.m41904a(intValue2 <= 6);
                        switch (intValue2) {
                            case 0:
                                str = "Sunday";
                                break;
                            case 1:
                                str = "Monday";
                                break;
                            case 2:
                                str = "Tuesday";
                                break;
                            case 3:
                                str = "Wednesday";
                                break;
                            case 4:
                                str = "Thursday";
                                break;
                            case 5:
                                str = "Friday";
                                break;
                            case 6:
                                str = "Saturday";
                                break;
                            default:
                                throw new C22534k();
                        }
                        appendQueryParameter2.appendQueryParameter("dayOfWeek", str);
                    }
                }
                if ((jVar.f134092a & 64) != 0) {
                    appendQueryParameter2.appendQueryParameter("message", jVar.f134099h);
                }
                intent = new Intent().setData(appendQueryParameter2.build()).setPackage(C22459a.f62021b.getHost());
            } else {
                ((C59052c) ((C59052c) C22459a.f62020a.mo56224b()).mo56372aa(48291)).mo56389s("Setting an alarm using public Clock API on %s", str2);
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
                    for (Integer intValue3 : chVar) {
                        int intValue4 = intValue3.intValue();
                        C22459a.m41904a(intValue4 >= 0);
                        C22459a.m41904a(intValue4 <= 6);
                        switch (intValue4) {
                            case 0:
                                i = 1;
                                break;
                            case 1:
                                i = 2;
                                break;
                            case 2:
                                i = 3;
                                break;
                            case 3:
                                i = 4;
                                break;
                            case 4:
                                i = 5;
                                break;
                            case 5:
                                i = 6;
                                break;
                            case 6:
                                i = 7;
                                break;
                            default:
                                throw new C22534k();
                        }
                        arrayList.add(Integer.valueOf(i));
                    }
                    intent2.putIntegerArrayListExtra("android.intent.extra.alarm.DAYS", arrayList);
                }
                if ((jVar.f134092a & 64) != 0) {
                    intent2.putExtra("android.intent.extra.alarm.MESSAGE", jVar.f134099h);
                }
                if (!TextUtils.isEmpty(str2)) {
                    intent2.setPackage(str2);
                }
                intent = intent2;
            }
            if (aVar.f62022c.mo27807a(intent)) {
                ((C59052c) ((C59052c) C22459a.f62020a.mo56224b()).mo56372aa(48294)).mo56386p("ClientOpResult: OK");
                return C60856cj.m92900i(C22402a.f61893a);
            }
            ((C59052c) ((C59052c) C22459a.f62020a.mo56224b()).mo56372aa(48293)).mo56386p("ClientOpResult: Error");
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.INTERNAL, (String) null));
        }
        throw new C22428d(dyVar);
    }
}
