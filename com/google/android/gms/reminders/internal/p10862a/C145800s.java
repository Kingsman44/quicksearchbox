package com.google.android.gms.reminders.internal.p10862a;

import android.os.Parcel;
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
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.reminders.internal.a.s */
/* compiled from: PG */
public final class C145800s extends C145782a {

    /* renamed from: a */
    final /* synthetic */ TaskId f394173a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145800s(C143851w wVar, TaskId taskId) {
        super(wVar);
        this.f394173a = taskId;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C143711ad mo117683c(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ void mo117681h(C143717b bVar) {
        C145813j jVar = (C145813j) bVar;
        TaskId taskId = this.f394173a;
        C143919bh.m233969l(jVar.f394182a.mo119476a());
        C143919bh.m233958a(((TaskIdEntity) taskId).f394332a);
        C145809f fVar = (C145809f) jVar.mo119451G();
        C145812i iVar = new C145812i(this);
        TaskIdEntity taskIdEntity = new TaskIdEntity(taskId);
        Parcel gA = fVar.mo17260gA();
        C8850c.m23499h(gA, iVar);
        C8850c.m23497f(gA, taskIdEntity);
        fVar.mo17262he(6, gA);
    }
}
