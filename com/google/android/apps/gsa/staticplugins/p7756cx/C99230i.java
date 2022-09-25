package com.google.android.apps.gsa.staticplugins.p7756cx;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.sidekick.shared.p7243l.C91757c;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.internal.C143824m;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144015o;
import com.google.android.gms.reminders.C145778g;
import com.google.android.gms.reminders.internal.p10862a.C145797p;
import com.google.android.gms.reminders.internal.p10862a.C145801t;
import com.google.android.gms.reminders.internal.p10862a.C145804w;
import com.google.android.gms.reminders.model.C145822ab;
import com.google.android.gms.reminders.model.DateTimeEntity;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.gms.reminders.model.TaskIdEntity;
import com.google.android.libraries.p11024al.p11025a.C147752h;
import com.google.android.libraries.p11024al.p11025a.C147753i;
import com.google.android.libraries.p11024al.p11025a.C147755k;
import com.google.android.libraries.p11024al.p11025a.C147756l;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.cx.i */
/* compiled from: PG */
public final /* synthetic */ class C99230i implements C91757c {

    /* renamed from: a */
    public final /* synthetic */ Task f277598a;

    public /* synthetic */ C99230i(Task task) {
        this.f277598a = task;
    }

    /* renamed from: a */
    public final Object mo86253a(C143851w wVar) {
        C143824m mVar;
        String str;
        Task task = this.f277598a;
        C143840l lVar = C145778g.f394144a;
        boolean z = false;
        if (C147753i.m240808c(task)) {
            String b = C147756l.m240820b();
            str = C147756l.m240821c(b);
            Recurrence h = ((TaskEntity) task).f394326q.mo122039h();
            Task b2 = C147755k.m240818b(task);
            C143919bh.m233960c(!C144015o.m234195a(b), "Must provide recurrenceId on create");
            C143919bh.m233971n(h, "Must provide recurrence rule on create.");
            TaskEntity taskEntity = (TaskEntity) b2;
            C143919bh.m233971n(taskEntity.f394311b, "Must provide task list on create");
            C143919bh.m233960c(!Boolean.TRUE.equals(taskEntity.f394316g), "Task.deleted field is readonly.");
            C143919bh.m233960c(taskEntity.f394320k == null, "Cannot set due_date on recurring reminder");
            if (taskEntity.f394322m == null) {
                z = true;
            }
            C143919bh.m233960c(z, "Cannot set location on recurring reminder");
            C145804w.m237120g(b);
            C145804w.m237121h(h);
            C145804w.m237123j(b2);
            mVar = wVar.mo119159d(new C145801t(wVar, C145804w.m237118e(C145804w.m237117d(b2, b, h).mo122169a())));
        } else {
            C145822ab abVar = new C145822ab(task);
            abVar.mo122174f(new TaskIdEntity(C147756l.m240820b(), (String) null));
            Task a = abVar.mo122169a();
            TaskEntity taskEntity2 = (TaskEntity) a;
            C143919bh.m233971n(taskEntity2.f394311b, "Must provide task list on create");
            C143919bh.m233960c(!Boolean.TRUE.equals(taskEntity2.f394316g), "Task.deleted field is readonly.");
            C143919bh.m233960c(taskEntity2.f394326q == null, "Task recurrence info field is readonly.");
            DateTimeEntity dateTimeEntity = taskEntity2.f394320k;
            if (dateTimeEntity != null) {
                C145804w.m237119f(dateTimeEntity);
                if (taskEntity2.f394322m == null && taskEntity2.f394323n == null) {
                    z = true;
                }
                C143919bh.m233960c(z, "Cannot snooze to both location and time.");
            }
            C145804w.m237122i(taskEntity2.f394322m);
            mVar = wVar.mo119159d(new C145797p(wVar, C145804w.m237118e(a)));
            str = taskEntity2.f394310a.mo122058h();
        }
        return (String) C90877ak.m148472f(C60922j.m93044g(C147753i.m240809d(mVar), new C147752h(str), C60826bg.f164896a));
    }
}
