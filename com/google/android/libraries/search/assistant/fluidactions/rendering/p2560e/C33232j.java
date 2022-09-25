package com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.format.Time;
import com.android.p256b.C5033s;
import com.android.recurrencepicker.C5487k;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.C52392qa;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52396qe;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import p3186j$.util.DesugarTimeZone;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.e.j */
/* compiled from: PG */
public final class C33232j {

    /* renamed from: a */
    private static final C59071e f88866a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.e.j");

    /* renamed from: b */
    private static final SimpleDateFormat f88867b = new SimpleDateFormat("yyyyMMdd", Locale.US);

    /* renamed from: a */
    public static int m61627a(int i) {
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
        ((C59052c) ((C59052c) f88866a.mo56225c()).mo56372aa(51181)).mo56387q("This eventRecurrenceWeekday does not fall within the enum: %d", i);
        return -1;
    }

    /* renamed from: b */
    public static int m61628b(int i) {
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
                ((C59052c) ((C59052c) f88866a.mo56225c()).mo56372aa(51182)).mo56386p("The weekDay in the weekly pattern from the Recurrence proto is not within the range of 0 to 6.");
                return 0;
        }
    }

    /* renamed from: c */
    public static long m61629c(C52393qb qbVar, String str) {
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
    public static Optional m61630d(Optional optional) {
        if (!optional.isPresent()) {
            return Optional.empty();
        }
        C52397qf qfVar = (C52397qf) optional.get();
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
                        int b = m61628b(qfVar.f137496d.mo58914d(i));
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
                sVar.f15900o = new int[]{m61628b(qfVar.f137496d.mo58914d(0))};
                sVar.f15902q = 1;
                sVar.f15901p = new int[]{qfVar.f137498f.mo58914d(0)};
            } else if (qfVar.f137499g.size() <= 0 || qfVar.f137497e.size() <= 0) {
                return Optional.empty();
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
            sVar.f15890e = f88867b.format(instance.getTime());
        } else if (i2 == 8) {
            sVar.f15891f = ((Integer) qfVar.f137495c).intValue();
        }
        return Optional.m71637of(sVar);
    }

    /* renamed from: e */
    public static Optional m61631e(Optional optional, long j) {
        C52396qe qeVar = (C52396qe) C52397qf.f137491j.createBuilder();
        if (!optional.isPresent()) {
            return Optional.empty();
        }
        C5033s sVar = (C5033s) optional.get();
        int i = sVar.f15889d;
        if (i == 4) {
            qeVar.mo53850a(Arrays.asList(new Integer[]{0, 1, 2, 3, 4, 5, 6}));
        } else if (i == 5) {
            if (sVar.f15900o.length == 0) {
                return Optional.empty();
            }
            ArrayList arrayList = new ArrayList();
            for (int a : sVar.f15900o) {
                arrayList.add(Integer.valueOf(m61627a(a)));
            }
            qeVar.mo53850a(arrayList);
        } else if (i == 6) {
            if (sVar.f15904s > 0) {
                qeVar.mo53851b(sVar.f15903r[0]);
            } else if (sVar.f15902q > 0) {
                int[] iArr = sVar.f15901p;
                if (iArr.length > 0) {
                    qeVar.mo53854e(iArr[0]);
                    qeVar.mo53852c(m61627a(sVar.f15900o[0]));
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
                time = f88867b.parse(sVar.f15890e);
            } catch (ParseException e) {
                ((C59052c) ((C59052c) ((C59052c) f88866a.mo56225c()).mo56382g(e)).mo56372aa(51183)).mo56386p("eventRecurrence.util is not valid, and cannot be parsed by SimpleDateFormat('yyyyMMdd')");
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
        return Optional.m71637of((C52397qf) qeVar.build());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d A[RETURN] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m61632f(com.google.assistant.p3897e.p3902c.p3907c.C51125hh r2, android.content.res.Resources r3) {
        /*
            int r0 = r2.f133079a
            r0 = r0 & 2
            if (r0 == 0) goto L_0x002c
            if (r0 == 0) goto L_0x0013
            com.google.assistant.e.j.qf r2 = r2.f133081c
            if (r2 != 0) goto L_0x000e
            com.google.assistant.e.j.qf r2 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
        L_0x000e:
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)
            goto L_0x0017
        L_0x0013:
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
        L_0x0017:
            j$.util.Optional r2 = m61630d(r2)
            boolean r0 = r2.isPresent()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r2 = r2.get()
            com.android.b.s r2 = (com.android.p256b.C5033s) r2
            java.lang.String r2 = r2.toString()
            goto L_0x002e
        L_0x002c:
            java.lang.String r2 = ""
        L_0x002e:
            java.lang.String r2 = m61633g(r2, r3)
            r0 = 2132086680(0x7f150f98, float:1.9813594E38)
            java.lang.String r0 = r3.getString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x004d
            r1 = 2132086681(0x7f150f99, float:1.9813596E38)
            java.lang.String r3 = r3.getString(r1)
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x004d
            return r2
        L_0x004d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33232j.m61632f(com.google.assistant.e.c.c.hh, android.content.res.Resources):java.lang.String");
    }

    /* renamed from: g */
    public static String m61633g(String str, Resources resources) {
        Optional optional;
        if (str == null || str.isEmpty()) {
            optional = Optional.empty();
        } else {
            C5033s sVar = new C5033s();
            sVar.mo9970e(str);
            if (sVar.f15892g <= 0) {
                sVar.f15892g = 1;
            }
            optional = Optional.m71637of(sVar);
        }
        if (!optional.isPresent()) {
            return resources.getString(R.string.fa_recurrence_none);
        }
        String a = C5487k.m14198a(resources, (C5033s) optional.get());
        if (a == null) {
            return resources.getString(R.string.fa_recurrence_custom);
        }
        return a;
    }

    /* renamed from: h */
    public static String m61634h(C52397qf qfVar, Context context) {
        Optional d = m61630d(Optional.m71637of(qfVar));
        return d.isPresent() ? m61633g(((C5033s) d.get()).toString(), context.getResources()) : BuildConfig.FLAVOR;
    }
}
