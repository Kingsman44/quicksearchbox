package com.google.android.libraries.gsa.conversation.clientop.p1846f;

import android.content.Intent;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.assistant.p3897e.p3899b.p3901b.C50875b;
import com.google.assistant.p3897e.p3917i.p3918a.C51419h;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.f.j */
/* compiled from: PG */
public final class C22478j extends C22538o {

    /* renamed from: a */
    private final C22477i f62051a;

    public C22478j(C22477i iVar) {
        this.f62051a = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        String str;
        if (dyVar.f135936b.equals("alarm.MUTATE_ALARM")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C50875b bVar = (C50875b) m41992m(dwVar, "mutate_alarm_args", C50875b.f132463h.getParserForType());
            C22477i iVar = this.f62051a;
            boolean z = true;
            C22477i.m41927a(1 == (bVar.f132465a & 1));
            String str2 = bVar.f132468d;
            C22695ah ahVar = iVar.f62050a;
            Uri parse = Uri.parse(str2);
            if (Boolean.valueOf((parse.getHost() == null || !parse.getScheme().equals("clock-app") || parse.getLastPathSegment() == null) ? false : true).booleanValue()) {
                Uri.Builder appendPath = parse.buildUpon().appendPath("edit");
                if ((bVar.f132465a & 8) != 0) {
                    C52403ql qlVar = bVar.f132470f;
                    if (qlVar == null) {
                        qlVar = C52403ql.f137512f;
                    }
                    int i = qlVar.f137515b;
                    C22477i.m41927a(i >= 0 && i < 24);
                    int i2 = qlVar.f137516c;
                    if (i2 < 0 || i2 >= 60) {
                        z = false;
                    }
                    C22477i.m41927a(z);
                    appendPath.appendQueryParameter("hour", Integer.toString(i));
                    appendPath.appendQueryParameter("minute", Integer.toString(i2));
                }
                int i3 = bVar.f132466b;
                if (i3 == 6) {
                    for (Integer intValue : ((C52397qf) bVar.f132467c).f137496d) {
                        switch (intValue.intValue()) {
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
                                str = BuildConfig.FLAVOR;
                                break;
                        }
                        appendPath.appendQueryParameter("dayOfWeek", str);
                    }
                } else if (i3 == 5) {
                    appendPath.appendQueryParameter("dayOfWeek", BuildConfig.FLAVOR);
                }
                if ((bVar.f132465a & 4) != 0) {
                    appendPath.appendQueryParameter("message", bVar.f132469e);
                }
                if ((bVar.f132465a & 64) != 0) {
                    C51419h a = C51419h.m86180a(bVar.f132471g);
                    if (a == null) {
                        a = C51419h.UNKNOWN_ALARM_STATUS;
                    }
                    if (a.equals(C51419h.DISABLED)) {
                        appendPath.appendQueryParameter("enabled", "false");
                    } else {
                        C51419h a2 = C51419h.m86180a(bVar.f132471g);
                        if (a2 == null) {
                            a2 = C51419h.UNKNOWN_ALARM_STATUS;
                        }
                        if (a2.equals(C51419h.SCHEDULED)) {
                            appendPath.appendQueryParameter("enabled", "true");
                        } else {
                            C51419h a3 = C51419h.m86180a(bVar.f132471g);
                            if (a3 == null) {
                                a3 = C51419h.UNKNOWN_ALARM_STATUS;
                            }
                            throw new IllegalArgumentException("Invalid alarm_status_mutation ".concat(String.valueOf(a3.name())));
                        }
                    }
                }
                if (!ahVar.mo27807a(new Intent().setAction("android.intent.action.VIEW").setData(appendPath.build()).setPackage(parse.getHost()))) {
                    return C60856cj.m92900i(C22402a.m41822b(C52235kf.INTERNAL, "fails to start activity"));
                }
                return C60856cj.m92900i(C22402a.f61893a);
            }
            throw new IllegalArgumentException("Invalid alarm id ".concat(String.valueOf(str2)));
        }
        throw new C22428d(dyVar);
    }
}
