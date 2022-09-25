package com.google.android.gms.reminders.internal.p10862a;

import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.reminders.CreateReminderOptionsInternal;
import com.google.android.gms.reminders.internal.C145809f;
import com.google.android.gms.reminders.internal.C145811h;
import com.google.android.gms.reminders.internal.C145813j;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskEntity;

/* renamed from: com.google.android.gms.reminders.internal.a.p */
/* compiled from: PG */
public final class C145797p extends C145782a {

    /* renamed from: a */
    final /* synthetic */ Task f394170a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145797p(C143851w wVar, Task task) {
        super(wVar);
        this.f394170a = task;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C143711ad mo117683c(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ void mo117681h(C143717b bVar) {
        C145813j jVar = (C145813j) bVar;
        Task task = this.f394170a;
        CreateReminderOptionsInternal createReminderOptionsInternal = CreateReminderOptionsInternal.f394109a;
        C143919bh.m233969l(jVar.f394182a.mo119476a());
        C143919bh.m233958a(task);
        ((C145809f) jVar.mo119451G()).mo121961f(new C145811h(this), new TaskEntity(task), createReminderOptionsInternal);
    }
}
