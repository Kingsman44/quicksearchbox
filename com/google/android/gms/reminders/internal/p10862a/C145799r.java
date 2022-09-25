package com.google.android.gms.reminders.internal.p10862a;

import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.reminders.internal.C145809f;
import com.google.android.gms.reminders.internal.C145812i;
import com.google.android.gms.reminders.internal.C145813j;
import com.google.android.gms.reminders.model.TaskId;
import com.google.android.gms.reminders.model.TaskIdEntity;

/* renamed from: com.google.android.gms.reminders.internal.a.r */
/* compiled from: PG */
public final class C145799r extends C145782a {

    /* renamed from: a */
    final /* synthetic */ TaskId f394172a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145799r(C143851w wVar, TaskId taskId) {
        super(wVar);
        this.f394172a = taskId;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C143711ad mo117683c(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ void mo117681h(C143717b bVar) {
        C145813j jVar = (C145813j) bVar;
        TaskId taskId = this.f394172a;
        C143919bh.m233958a(taskId);
        C143919bh.m233969l(jVar.f394182a.mo119476a());
        C143919bh.m233958a(taskId.mo122058h());
        ((C145809f) jVar.mo119451G()).mo121962g(new C145812i(this), new TaskIdEntity(taskId));
    }
}
