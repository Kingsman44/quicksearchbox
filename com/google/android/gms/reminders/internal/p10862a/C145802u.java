package com.google.android.gms.reminders.internal.p10862a;

import android.os.Parcel;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.reminders.UpdateRecurrenceOptions;
import com.google.android.gms.reminders.internal.C145809f;
import com.google.android.gms.reminders.internal.C145812i;
import com.google.android.gms.reminders.internal.C145813j;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.reminders.internal.a.u */
/* compiled from: PG */
final class C145802u extends C145782a {

    /* renamed from: a */
    final /* synthetic */ String f394175a;

    /* renamed from: d */
    final /* synthetic */ Task f394176d;

    /* renamed from: e */
    final /* synthetic */ UpdateRecurrenceOptions f394177e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145802u(C143851w wVar, String str, Task task, UpdateRecurrenceOptions updateRecurrenceOptions) {
        super(wVar);
        this.f394175a = str;
        this.f394176d = task;
        this.f394177e = updateRecurrenceOptions;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C143711ad mo117683c(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        String str = this.f394175a;
        Task task = this.f394176d;
        UpdateRecurrenceOptions updateRecurrenceOptions = this.f394177e;
        C145809f fVar = (C145809f) ((C145813j) bVar).mo119451G();
        C145812i iVar = new C145812i(this);
        TaskEntity taskEntity = new TaskEntity(task);
        Parcel gA = fVar.mo17260gA();
        C8850c.m23499h(gA, iVar);
        gA.writeString(str);
        C8850c.m23497f(gA, taskEntity);
        C8850c.m23497f(gA, updateRecurrenceOptions);
        fVar.mo17262he(9, gA);
    }
}
