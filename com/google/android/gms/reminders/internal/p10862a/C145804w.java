package com.google.android.gms.reminders.internal.p10862a;

import android.text.TextUtils;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.C143854z;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.reminders.C145779h;
import com.google.android.gms.reminders.LoadRemindersOptions;
import com.google.android.gms.reminders.UpdateRecurrenceOptions;
import com.google.android.gms.reminders.model.C145822ab;
import com.google.android.gms.reminders.model.C145847s;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.Location;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.RecurrenceEnd;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.gms.reminders.model.Time;
import com.google.common.base.C58837ba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.reminders.internal.a.w */
/* compiled from: PG */
public final class C145804w implements C145779h {

    /* renamed from: a */
    private static final String[] f394180a = {"/", " ", "(", ")", "{", "}", "&", "|", "\"", "\t", "\r", "\n", "\u0000", ".", "-"};

    /* renamed from: d */
    public static C145822ab m237117d(Task task, String str, Recurrence recurrence) {
        C145822ab abVar = new C145822ab(task);
        C145847s sVar = new C145847s();
        sVar.f394394a = str;
        sVar.mo122223b(recurrence);
        abVar.mo122173e(sVar.mo122222a());
        return abVar;
    }

    /* renamed from: e */
    public static Task m237118e(Task task) {
        if ((!Boolean.TRUE.equals(task.mo122082x()) && !Boolean.TRUE.equals(task.mo122080q())) || (!Boolean.TRUE.equals(task.mo122078o()) && !Boolean.TRUE.equals(task.mo122079p()))) {
            return task;
        }
        C145822ab abVar = new C145822ab(task);
        abVar.f394343c = false;
        abVar.f394344d = false;
        return abVar.mo122169a();
    }

    /* renamed from: f */
    public static void m237119f(DateTime dateTime) {
        boolean z = true;
        boolean z2 = (dateTime.mo121999o() == null || dateTime.mo121997m() == null || dateTime.mo121996l() == null) ? false : true;
        C143919bh.m233960c(z2 || (dateTime.mo121999o() == null && dateTime.mo121997m() == null && dateTime.mo121996l() == null), "Invalid DateTime, year/month/day must all be set or unset together.");
        if (z2) {
            boolean z3 = dateTime.mo121997m().intValue() > 0 && dateTime.mo121997m().intValue() <= 12;
            Integer m = dateTime.mo121997m();
            C143919bh.m233960c(z3, "Invalid month " + m + ", should be in range [1, 12]");
            boolean z4 = dateTime.mo121996l().intValue() > 0;
            Integer l = dateTime.mo121996l();
            C143919bh.m233960c(z4, "Invalid day " + l + ", should be >=1");
        }
        C143919bh.m233960c(dateTime.mo122000p() != null || Boolean.TRUE.equals(dateTime.mo121994j()) || z2, "Invalid DateTime, must either contain an absolute time, a year/month/day, or be set to an unspecified future time.");
        C143919bh.m233960c(!Boolean.TRUE.equals(dateTime.mo121994j()) || (dateTime.mo122000p() == null && !z2), "Invalid DateTime, unspecified_future_time cannot be set together with absolute_time or year/month/day");
        Time h = dateTime.mo121992h();
        if (h != null) {
            boolean z5 = h.mo122086h().intValue() >= 0 && h.mo122086h().intValue() < 24;
            Integer h2 = h.mo122086h();
            new StringBuilder("Invalid hour:").append(h2);
            C143919bh.m233960c(z5, "Invalid hour:".concat(String.valueOf(h2)));
            boolean z6 = h.mo122087i().intValue() >= 0 && h.mo122087i().intValue() < 60;
            Integer i = h.mo122087i();
            new StringBuilder("Invalid minute:").append(i);
            C143919bh.m233960c(z6, "Invalid minute:".concat(String.valueOf(i)));
            if (h.mo122088j().intValue() < 0 || h.mo122088j().intValue() >= 60) {
                z = false;
            }
            Integer j = h.mo122088j();
            new StringBuilder("Invalid second:").append(j);
            C143919bh.m233960c(z, "Invalid second:".concat(String.valueOf(j)));
        }
    }

    /* renamed from: g */
    public static void m237120g(String str) {
        C143919bh.m233960c(!TextUtils.isEmpty(str), "empty recurrence id");
        String[] strArr = f394180a;
        for (int i = 0; i < 15; i++) {
            String str2 = strArr[i];
            Object[] objArr = {str2};
            C143919bh.m233961d(!str.contains(str2), "recurrence id must not contain %s", objArr);
        }
    }

    /* renamed from: h */
    public static void m237121h(Recurrence recurrence) {
        C143919bh.m233971n(recurrence.mo122052o(), "Must provide Recurrence.frequency on create");
        C143919bh.m233971n(recurrence.mo122048k(), "Must provide Recurrence.recurrence_start on create");
        C143919bh.m233971n(recurrence.mo122048k().mo122055h(), "Must provide RecurrenceStart.start_date_time on create");
        m237119f(recurrence.mo122048k().mo122055h());
        if (recurrence.mo122047j() != null) {
            RecurrenceEnd j = recurrence.mo122047j();
            boolean z = true;
            C143919bh.m233960c(j.mo122035j() == null, "RecurrenceEnd.auto_renew is readonly");
            C143919bh.m233960c(j.mo122033h() == null, "RecurrenceEnd.auto_renew_until is readonly");
            if (j.mo122036k() != null) {
                if (j.mo122036k().intValue() > 1000) {
                    z = false;
                }
                C143919bh.m233960c(z, "RecurrenceEnd.num_occurrences must be <= 1000");
            } else if (j.mo122034i() != null) {
                m237119f(j.mo122034i());
            }
        }
    }

    /* renamed from: i */
    public static void m237122i(Location location) {
        if (location != null && location.mo122021l() != null) {
            boolean z = false;
            if (location.mo122019j() == null && location.mo122020k() == null && C58837ba.m90859h(location.mo122023n()) && (location.mo122018i() == null || (location.mo122018i().mo122007h().longValue() == 0 && location.mo122018i().mo122008i().longValue() == 0))) {
                z = true;
            }
            C143919bh.m233960c(z, "If providing a locationType you cannot provide lat/lng, address, or any other location identifying attributes.");
        }
    }

    /* renamed from: j */
    public static void m237123j(Task task) {
        TaskEntity taskEntity = (TaskEntity) task;
        boolean z = true;
        C143919bh.m233960c(taskEntity.f394320k == null, "task.due_date is determined by recurrence and should not be set");
        C143919bh.m233960c(taskEntity.f394310a == null, "task.task_id field is readonly");
        C143919bh.m233960c(taskEntity.f394326q == null, "task.recurrence_info field is readonly");
        if (taskEntity.f394322m != null) {
            z = false;
        }
        C143919bh.m233960c(z, "task.location not supported for recurrences.");
    }

    /* renamed from: a */
    public final C143854z mo121948a(C143851w wVar, List list) {
        C143919bh.m233971n(list, "New tasks required on update.");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Task task = (Task) it.next();
            C143919bh.m233971n(task, "New task required on update.");
            C143919bh.m233971n(task.mo122077n(), "Task id required on update.");
            if (task.mo122074k() != null) {
                m237122i(task.mo122074k());
            }
            if (task.mo122071h() != null) {
                m237119f(task.mo122071h());
                boolean z = false;
                if (task.mo122074k() == null && task.mo122075l() == null) {
                    z = true;
                }
                C143919bh.m233960c(z, "Cannot snooze to both location and time.");
            }
            arrayList.add(m237118e(task));
        }
        return wVar.mo119159d(new C145798q(wVar, arrayList));
    }

    /* renamed from: b */
    public final C143854z mo121949b(C143851w wVar, LoadRemindersOptions loadRemindersOptions) {
        return wVar.mo119159d(new C145796o(wVar, loadRemindersOptions));
    }

    /* renamed from: c */
    public final C143854z mo121950c(C143851w wVar, String str, Task task, UpdateRecurrenceOptions updateRecurrenceOptions) {
        C143919bh.m233971n(str, "Must provide client-assigned recurrence id.");
        C143919bh.m233971n(task, "Must provide new task template");
        C143919bh.m233971n(updateRecurrenceOptions, "updateRecurrenceOption required");
        return wVar.mo119159d(new C145802u(wVar, str, m237118e(task), updateRecurrenceOptions));
    }
}
