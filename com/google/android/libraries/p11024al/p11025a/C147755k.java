package com.google.android.libraries.p11024al.p11025a;

import android.text.TextUtils;
import android.text.format.Time;
import com.android.p256b.C5033s;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.reminders.model.C145822ab;
import com.google.android.gms.reminders.model.C145826af;
import com.google.android.gms.reminders.model.C145828ah;
import com.google.android.gms.reminders.model.C145832d;
import com.google.android.gms.reminders.model.C145834f;
import com.google.android.gms.reminders.model.C145841m;
import com.google.android.gms.reminders.model.C145843o;
import com.google.android.gms.reminders.model.C145845q;
import com.google.android.gms.reminders.model.C145849u;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.DateTimeEntity;
import com.google.android.gms.reminders.model.Location;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.RecurrenceInfo;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskId;
import com.google.android.gms.reminders.model.TimeEntity;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import java.util.Calendar;

/* renamed from: com.google.android.libraries.al.a.k */
/* compiled from: PG */
public final class C147755k {

    /* renamed from: a */
    private static final C58495hd f398698a;

    /* renamed from: b */
    private static final C58495hd f398699b;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(4, 0);
        gzVar.mo55429h(5, 1);
        gzVar.mo55429h(6, 2);
        gzVar.mo55429h(7, 3);
        f398698a = gzVar.mo55427f(true);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(2, 1);
        gzVar2.mo55429h(3, 2);
        gzVar2.mo55429h(4, 3);
        gzVar2.mo55429h(5, 4);
        gzVar2.mo55429h(6, 5);
        gzVar2.mo55429h(7, 6);
        gzVar2.mo55429h(1, 7);
        f398699b = gzVar2.mo55427f(true);
    }

    /* renamed from: a */
    public static Recurrence m240817a(C5033s sVar, DateTime dateTime) {
        Integer num;
        Long c = C147754j.m240815c(dateTime);
        c.getClass();
        C145843o oVar = new C145843o();
        Integer num2 = (Integer) f398698a.get(Integer.valueOf(sVar.f15889d));
        num2.getClass();
        oVar.mo122217b(num2);
        int i = sVar.f15892g;
        if (i > 0) {
            oVar.f394386a = Integer.valueOf(i);
        }
        C145849u uVar = new C145849u();
        uVar.f394397a = dateTime;
        oVar.f394387b = uVar.mo122226a();
        if (sVar.f15891f > 0 || !TextUtils.isEmpty(sVar.f15890e)) {
            int i2 = sVar.f15891f;
            DateTime dateTime2 = null;
            if (i2 > 0) {
                num = Integer.valueOf(i2);
            } else if (!TextUtils.isEmpty(sVar.f15890e)) {
                Time time = new Time();
                time.parse(sVar.f15890e);
                C145834f fVar = new C145834f();
                fVar.f394369c = Integer.valueOf(time.monthDay);
                fVar.f394368b = Integer.valueOf(time.month + 1);
                fVar.f394367a = Integer.valueOf(time.year);
                fVar.f394370d = new TimeEntity(Integer.valueOf(time.hour), Integer.valueOf(time.minute), Integer.valueOf(time.second));
                DateTime a = fVar.mo122198a();
                C145845q.m237595a(a, (Integer) null);
                dateTime2 = a;
                num = null;
            } else {
                num = null;
            }
            oVar.f394388c = C145845q.m237595a(dateTime2, num);
        }
        DateTimeEntity dateTimeEntity = (DateTimeEntity) dateTime;
        if (!(dateTimeEntity.f394264d == null && dateTimeEntity.f394265e == null) && !dateTimeEntity.f394269i.booleanValue()) {
            C145832d dVar = new C145832d();
            Integer num3 = dateTimeEntity.f394265e;
            C143919bh.m233960c(num3 == null || num3.intValue() == 1 || num3.intValue() == 2 || num3.intValue() == 3 || num3.intValue() == 4, "Invalid constant for Period. Use value in ModelConstants");
            dVar.f394364a = num3;
            dVar.f394365b = dateTimeEntity.f394269i;
            dVar.mo122195b(dateTimeEntity.f394264d);
            oVar.f394389d = dVar.mo122194a();
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(c.longValue());
        int i3 = sVar.f15889d;
        if (i3 != 5) {
            if (i3 == 6) {
                int i4 = sVar.f15902q;
                if (i4 > 0 || sVar.f15904s > 0) {
                    C145841m mVar = new C145841m();
                    if (i4 > 0) {
                        Integer num4 = (Integer) f398699b.get(Integer.valueOf(C5033s.m13827b(sVar.f15900o[0])));
                        num4.getClass();
                        mVar.mo122213c(num4);
                        mVar.f394383a = Integer.valueOf(sVar.f15901p[0]);
                    } else {
                        for (int i5 = 0; i5 < sVar.f15904s; i5++) {
                            mVar.mo122212b(Integer.valueOf(sVar.f15903r[i5]));
                        }
                    }
                    oVar.f394391f = mVar.mo122211a();
                } else {
                    C145841m mVar2 = new C145841m();
                    mVar2.mo122212b(Integer.valueOf(instance.get(5)));
                    oVar.f394391f = mVar2.mo122211a();
                }
            } else if (i3 == 7) {
                C145828ah ahVar = new C145828ah();
                ahVar.mo122187b(Integer.valueOf(instance.get(2) + 1));
                C145841m mVar3 = new C145841m();
                mVar3.mo122212b(Integer.valueOf(instance.get(5)));
                ahVar.f394362a = mVar3.mo122211a();
                oVar.f394392g = ahVar.mo122186a();
            }
        } else if (sVar.f15902q <= 0) {
            Integer num5 = (Integer) f398699b.get(Integer.valueOf(instance.get(7)));
            num5.getClass();
            C145826af afVar = new C145826af();
            afVar.mo122183b(num5);
            oVar.f394390e = afVar.mo122182a();
        } else {
            C145826af afVar2 = new C145826af();
            for (int i6 = 0; i6 < sVar.f15902q; i6++) {
                Integer num6 = (Integer) f398699b.get(Integer.valueOf(C5033s.m13827b(sVar.f15900o[i6])));
                num6.getClass();
                afVar2.mo122183b(num6);
            }
            oVar.f394390e = afVar2.mo122182a();
        }
        return oVar.mo122216a();
    }

    /* renamed from: b */
    public static Task m240818b(Task task) {
        C145822ab abVar = new C145822ab(task);
        abVar.mo122170b((DateTime) null);
        abVar.mo122174f((TaskId) null);
        abVar.mo122173e((RecurrenceInfo) null);
        abVar.mo122171c((Location) null);
        return abVar.mo122169a();
    }
}
