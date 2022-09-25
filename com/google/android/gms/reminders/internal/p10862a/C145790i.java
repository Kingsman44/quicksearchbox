package com.google.android.gms.reminders.internal.p10862a;

import android.app.Activity;
import android.content.Context;
import androidx.p060c.C0977g;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144015o;
import com.google.android.gms.reminders.C145780i;
import com.google.android.gms.reminders.C145816j;
import com.google.android.gms.reminders.CreateReminderOptionsInternal;
import com.google.android.gms.reminders.LoadRemindersOptions;
import com.google.android.gms.reminders.model.DateTimeEntity;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.gms.reminders.model.TaskId;
import com.google.android.gms.reminders.model.TaskIdEntity;
import com.google.android.gms.tasks.C146006ab;

/* renamed from: com.google.android.gms.reminders.internal.a.i */
/* compiled from: PG */
public final class C145790i extends C143847s implements C145780i {

    /* renamed from: a */
    public static final /* synthetic */ int f394155a = 0;

    /* renamed from: b */
    private static final C143840l f394156b;

    /* renamed from: c */
    private static final C143707a f394157c;

    /* renamed from: d */
    private static final C143841m f394158d;

    static {
        new C0977g();
        C143840l lVar = new C143840l();
        f394156b = lVar;
        C145787f fVar = new C145787f();
        f394157c = fVar;
        f394158d = new C143841m("Reminders.API", fVar, lVar);
    }

    public C145790i(Context context, C145816j jVar) {
        super(context, (Activity) null, f394158d, jVar, C143846r.f389923a);
    }

    /* renamed from: a */
    public final C146006ab mo121951a(String str, Recurrence recurrence, Task task) {
        boolean z = true;
        C143919bh.m233960c(!C144015o.m234195a(str), "Must provide recurrenceId on create");
        TaskEntity taskEntity = (TaskEntity) task;
        C143919bh.m233971n(taskEntity.f394311b, "Must provide task list on create");
        C143919bh.m233960c(!Boolean.TRUE.equals(taskEntity.f394316g), "Task.deleted field is readonly.");
        C143919bh.m233960c(taskEntity.f394320k == null, "Cannot set due_date on recurring reminder");
        if (taskEntity.f394322m != null) {
            z = false;
        }
        C143919bh.m233960c(z, "Cannot set location on recurring reminder");
        C145804w.m237120g(str);
        C145804w.m237121h(recurrence);
        C145804w.m237123j(task);
        Task e = C145804w.m237118e(C145804w.m237117d(task, str, recurrence).mo122169a());
        C143919bh.m233958a(e);
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145785d(e);
        dcVar.f389863d = 20108;
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: b */
    public final C146006ab mo121952b(Task task) {
        TaskEntity taskEntity = (TaskEntity) task;
        C143919bh.m233971n(taskEntity.f394311b, "Must provide task list on create");
        boolean z = true;
        C143919bh.m233960c(!Boolean.TRUE.equals(taskEntity.f394316g), "Task.deleted field is readonly.");
        C143919bh.m233960c(taskEntity.f394326q == null, "Task recurrence info field is readonly.");
        DateTimeEntity dateTimeEntity = taskEntity.f394320k;
        if (dateTimeEntity != null) {
            C145804w.m237119f(dateTimeEntity);
            if (!(taskEntity.f394322m == null && taskEntity.f394323n == null)) {
                z = false;
            }
            C143919bh.m233960c(z, "Cannot snooze to both location and time.");
        }
        C145804w.m237122i(taskEntity.f394322m);
        Task e = C145804w.m237118e(task);
        CreateReminderOptionsInternal createReminderOptionsInternal = CreateReminderOptionsInternal.f394109a;
        C143919bh.m233958a(e);
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145786e(e, createReminderOptionsInternal);
        dcVar.f389863d = 20103;
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: c */
    public final C146006ab mo121953c(TaskId taskId) {
        C143919bh.m233958a(((TaskIdEntity) taskId).f394332a);
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145783b(taskId);
        dcVar.f389863d = 20105;
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: d */
    public final C146006ab mo121954d(LoadRemindersOptions loadRemindersOptions) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145784c(loadRemindersOptions);
        dcVar.f389863d = 20101;
        return super.mo119290u(0, dcVar.mo119260a());
    }
}
