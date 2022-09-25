package com.google.android.libraries.assistant.assistantactions.rendering.p641d;

import android.content.res.Resources;
import android.text.TextUtils;
import android.text.format.Time;
import com.android.p256b.C5033s;
import com.android.recurrencepicker.C5487k;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.C52392qa;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52396qe;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import p3186j$.util.DesugarTimeZone;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.d.d */
/* compiled from: PG */
public final class C11306d {

    /* renamed from: a */
    private static final C59071e f36748a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.d.d");

    /* renamed from: b */
    private static final SimpleDateFormat f36749b = new SimpleDateFormat("yyyyMMdd");

    /* renamed from: a */
    public static int m26901a(int i) {
        if (i == 65536) {
            return 0;
        }
        if (i == 131072) {
            return 1;
        }
        if (i == 262144) {
            return 2;
        }
        if (i == 524288) {
            return 3;
        }
        if (i == 1048576) {
            return 4;
        }
        if (i == 2097152) {
            return 5;
        }
        if (i == 4194304) {
            return 6;
        }
        ((C59052c) ((C59052c) f36748a.mo56225c()).mo56372aa(43299)).mo56387q("This eventRecurrenceWeekday does not fall within the enum: %d", i);
        return -1;
    }

    /* renamed from: b */
    public static int m26902b(int i) {
        switch (i) {
            case 0:
                return 65536;
            case 1:
                return C89885b.S3REQUEST_VALUE;
            case 2:
                return C89885b.HTTP_VALUE;
            case 3:
                return 524288;
            case 4:
                return 1048576;
            case 5:
                return C89885b.NOW_VALUE;
            case 6:
                return 4194304;
            default:
                ((C59052c) ((C59052c) f36748a.mo56225c()).mo56372aa(43300)).mo56386p("The weekDay in the weekly pattern from the Recurrence proto is not within the range of 0 to 6.");
                return 0;
        }
    }

    /* renamed from: c */
    public static long m26903c(C52393qb qbVar, String str) {
        Calendar instance = Calendar.getInstance();
        instance.set(1, qbVar.f137482b);
        instance.set(2, qbVar.f137483c - 1);
        instance.set(5, qbVar.f137484d);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(DesugarTimeZone.getTimeZone(str));
        return instance.getTimeInMillis();
    }

    /* renamed from: d */
    public static C58833ax m26904d(C58833ax axVar) {
        if (!axVar.mo56113h()) {
            return C58836b.f156633a;
        }
        C52397qf qfVar = (C52397qf) axVar.mo56107c();
        C5033s sVar = new C5033s();
        sVar.f15892g = 1;
        if (qfVar.f137496d.size() == 7) {
            sVar.f15889d = 4;
        } else {
            if (qfVar.f137496d.size() > 0 && qfVar.f137498f.size() == 0) {
                sVar.f15889d = 5;
                if (!(qfVar == null || qfVar.f137496d.size() == 0)) {
                    int size = qfVar.f137496d.size();
                    sVar.f15902q = size;
                    sVar.f15900o = new int[size];
                    sVar.f15901p = new int[size];
                    for (int i = 0; i < qfVar.f137496d.size(); i++) {
                        int b = m26902b(qfVar.f137496d.mo58914d(i));
                        if (b > 0) {
                            sVar.f15900o[i] = b;
                        }
                    }
                }
            } else if (qfVar.f137497e.size() != 0 && qfVar.f137499g.size() == 0) {
                sVar.f15889d = 6;
                sVar.f15903r = new int[]{qfVar.f137497e.mo58914d(0)};
                sVar.f15904s = 1;
            } else if (qfVar.f137496d.size() > 0 && qfVar.f137498f.size() > 0 && qfVar.f137499g.size() == 0) {
                sVar.f15889d = 6;
                sVar.f15900o = new int[]{m26902b(qfVar.f137496d.mo58914d(0))};
                sVar.f15902q = 1;
                sVar.f15901p = new int[]{qfVar.f137498f.mo58914d(0)};
            } else if (qfVar.f137499g.size() <= 0 || qfVar.f137497e.size() <= 0) {
                return C58836b.f156633a;
            } else {
                sVar.f15889d = 7;
            }
        }
        sVar.f15892g = qfVar.f137500h;
        int i2 = qfVar.f137494b;
        if (i2 == 7) {
            C52393qb qbVar = (C52393qb) qfVar.f137495c;
            Calendar instance = Calendar.getInstance();
            instance.set(qbVar.f137482b, qbVar.f137483c - 1, qbVar.f137484d);
            sVar.f15890e = f36749b.format(instance.getTime());
        } else if (i2 == 8) {
            sVar.f15891f = ((Integer) qfVar.f137495c).intValue();
        }
        return C58833ax.m90834k(sVar);
    }

    /* renamed from: e */
    public static C58833ax m26905e(C58833ax axVar, long j) {
        C52396qe qeVar = (C52396qe) C52397qf.f137491j.createBuilder();
        if (!axVar.mo56113h()) {
            return C58836b.f156633a;
        }
        C5033s sVar = (C5033s) axVar.mo56107c();
        int i = sVar.f15889d;
        if (i == 4) {
            qeVar.mo53850a(Arrays.asList(new Integer[]{0, 1, 2, 3, 4, 5, 6}));
        } else if (i == 5) {
            if (sVar.f15900o.length == 0) {
                return C58836b.f156633a;
            }
            ArrayList arrayList = new ArrayList();
            for (int a : sVar.f15900o) {
                arrayList.add(Integer.valueOf(m26901a(a)));
            }
            qeVar.mo53850a(arrayList);
        } else if (i == 6) {
            if (sVar.f15904s > 0) {
                qeVar.mo53851b(sVar.f15903r[0]);
            } else if (sVar.f15902q > 0) {
                int[] iArr = sVar.f15901p;
                if (iArr.length > 0) {
                    qeVar.mo53854e(iArr[0]);
                    qeVar.mo53852c(m26901a(sVar.f15900o[0]));
                }
            }
        } else if (i == 7) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            qeVar.mo53853d(instance.get(2) + 1);
            qeVar.mo53851b(instance.get(5));
        }
        int i2 = sVar.f15892g;
        qeVar.copyOnWrite();
        C52397qf qfVar = (C52397qf) qeVar.instance;
        qfVar.f137493a |= 1;
        qfVar.f137500h = i2;
        if (!TextUtils.isEmpty(sVar.f15890e)) {
            Calendar instance2 = Calendar.getInstance();
            Date time = instance2.getTime();
            try {
                time = f36749b.parse(sVar.f15890e);
            } catch (ParseException e) {
                ((C59052c) ((C59052c) ((C59052c) f36748a.mo56225c()).mo56382g(e)).mo56372aa(43301)).mo56386p("eventRecurrence.util is not valid, and cannot be parsed by SimpleDateFormat('yyyyMMdd')");
            }
            instance2.setTime(time);
            C52392qa qaVar = (C52392qa) C52393qb.f137479e.createBuilder();
            int i3 = instance2.get(1);
            qaVar.copyOnWrite();
            C52393qb qbVar = (C52393qb) qaVar.instance;
            qbVar.f137481a |= 1;
            qbVar.f137482b = i3;
            int i4 = instance2.get(2);
            qaVar.copyOnWrite();
            C52393qb qbVar2 = (C52393qb) qaVar.instance;
            qbVar2.f137481a = 2 | qbVar2.f137481a;
            qbVar2.f137483c = i4 + 1;
            int i5 = instance2.get(5);
            qaVar.copyOnWrite();
            C52393qb qbVar3 = (C52393qb) qaVar.instance;
            qbVar3.f137481a |= 4;
            qbVar3.f137484d = i5;
            C52393qb qbVar4 = (C52393qb) qaVar.build();
            qeVar.copyOnWrite();
            C52397qf qfVar2 = (C52397qf) qeVar.instance;
            qbVar4.getClass();
            qfVar2.f137495c = qbVar4;
            qfVar2.f137494b = 7;
        } else {
            int i6 = sVar.f15891f;
            if (i6 > 0) {
                qeVar.copyOnWrite();
                C52397qf qfVar3 = (C52397qf) qeVar.instance;
                qfVar3.f137494b = 8;
                qfVar3.f137495c = Integer.valueOf(i6);
            }
        }
        Time time2 = sVar.f15888c;
        return C58833ax.m90834k((C52397qf) qeVar.build());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b A[RETURN] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m26906f(com.google.assistant.p3897e.p3902c.p3907c.C51125hh r2, android.content.res.Resources r3) {
        /*
            int r0 = r2.f133079a
            r0 = r0 & 2
            if (r0 == 0) goto L_0x002a
            if (r0 == 0) goto L_0x0013
            com.google.assistant.e.j.qf r2 = r2.f133081c
            if (r2 != 0) goto L_0x000e
            com.google.assistant.e.j.qf r2 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
        L_0x000e:
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x0015
        L_0x0013:
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
        L_0x0015:
            com.google.common.base.ax r2 = m26904d(r2)
            boolean r0 = r2.mo56113h()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r2 = r2.mo56107c()
            com.android.b.s r2 = (com.android.p256b.C5033s) r2
            java.lang.String r2 = r2.toString()
            goto L_0x002c
        L_0x002a:
            java.lang.String r2 = ""
        L_0x002c:
            java.lang.String r2 = m26907g(r2, r3)
            r0 = 2132085223(0x7f1509e7, float:1.9810639E38)
            java.lang.String r0 = r3.getString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x004b
            r1 = 2132085228(0x7f1509ec, float:1.9810649E38)
            java.lang.String r3 = r3.getString(r1)
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x004b
            return r2
        L_0x004b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11306d.m26906f(com.google.assistant.e.c.c.hh, android.content.res.Resources):java.lang.String");
    }

    /* renamed from: g */
    public static String m26907g(String str, Resources resources) {
        C58833ax axVar;
        if (str == null || str.isEmpty()) {
            axVar = C58836b.f156633a;
        } else {
            C5033s sVar = new C5033s();
            sVar.mo9970e(str);
            if (sVar.f15892g <= 0) {
                sVar.f15892g = 1;
            }
            axVar = C58833ax.m90834k(sVar);
        }
        if (!axVar.mo56113h()) {
            return resources.getString(R.string.assistantactions_none);
        }
        String a = C5487k.m14198a(resources, (C5033s) axVar.mo56107c());
        if (a == null) {
            return resources.getString(R.string.assistantactions_custom);
        }
        return a;
    }
}
