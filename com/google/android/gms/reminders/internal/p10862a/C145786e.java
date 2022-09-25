package com.google.android.gms.reminders.internal.p10862a;

import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.reminders.CreateReminderOptionsInternal;
import com.google.android.gms.reminders.internal.C145809f;
import com.google.android.gms.reminders.internal.C145813j;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.reminders.internal.a.e */
/* compiled from: PG */
public final /* synthetic */ class C145786e implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ Task f394151a;

    /* renamed from: b */
    public final /* synthetic */ CreateReminderOptionsInternal f394152b;

    public /* synthetic */ C145786e(Task task, CreateReminderOptionsInternal createReminderOptionsInternal) {
        this.f394151a = task;
        this.f394152b = createReminderOptionsInternal;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        Task task = this.f394151a;
        CreateReminderOptionsInternal createReminderOptionsInternal = this.f394152b;
        int i = C145790i.f394155a;
        ((C145809f) ((C145813j) obj).mo119451G()).mo121961f(new C145789h((C146010af) obj2), new TaskEntity(task), createReminderOptionsInternal);
    }
}
