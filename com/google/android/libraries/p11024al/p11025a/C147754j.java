package com.google.android.libraries.p11024al.p11025a;

import android.util.Log;
import com.google.android.gms.reminders.model.C145834f;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.Time;
import com.google.android.gms.reminders.model.TimeEntity;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import java.util.Calendar;

/* renamed from: com.google.android.libraries.al.a.j */
/* compiled from: PG */
public final class C147754j {

    /* renamed from: a */
    private static final C58495hd f398697a;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(1, 8);
        gzVar.mo55429h(2, 13);
        gzVar.mo55429h(3, 18);
        gzVar.mo55429h(4, 20);
        f398697a = gzVar.mo55427f(true);
    }

    /* renamed from: a */
    public static DateTime m240813a(Calendar calendar, boolean z, Integer num) {
        C145834f fVar = new C145834f();
        fVar.f394367a = Integer.valueOf(calendar.get(1));
        fVar.f394368b = Integer.valueOf(calendar.get(2) + 1);
        fVar.f394369c = Integer.valueOf(calendar.get(5));
        if (z) {
            fVar.f394374h = true;
            return fVar.mo122198a();
        }
        if (m240816d(num)) {
            fVar.f394372f = Long.valueOf(calendar.getTimeInMillis());
        }
        fVar.f394370d = new TimeEntity(Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)));
        return fVar.mo122198a();
    }

    /* renamed from: b */
    public static Long m240814b(Task task) {
        Long C = task.mo122063C();
        if (C != null) {
            return C;
        }
        DateTime h = task.mo122071h();
        if (h == null) {
            return null;
        }
        return m240815c(h);
    }

    /* renamed from: c */
    public static Long m240815c(DateTime dateTime) {
        int i;
        int i2;
        if (dateTime.mo121994j() != null && dateTime.mo121994j().booleanValue()) {
            return null;
        }
        Long p = dateTime.mo122000p();
        if (p != null) {
            return p;
        }
        Time h = dateTime.mo121992h();
        if (h != null) {
            int intValue = h.mo122086h().intValue();
            i = h.mo122087i().intValue();
            i2 = intValue;
        } else {
            if (dateTime.mo121998n() != null) {
                Log.w("RemindersUtilDateTime", "Date time with only period field set.");
                Integer num = (Integer) f398697a.get(dateTime.mo121998n());
                num.getClass();
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            i = 0;
        }
        Calendar instance = Calendar.getInstance();
        instance.clear();
        instance.set(dateTime.mo121999o().intValue(), dateTime.mo121997m().intValue() - 1, dateTime.mo121996l().intValue(), i2, i);
        return Long.valueOf(instance.getTimeInMillis());
    }

    /* renamed from: d */
    public static boolean m240816d(Integer num) {
        if (num.intValue() == 1 || num.intValue() == 8) {
            return true;
        }
        return false;
    }
}
