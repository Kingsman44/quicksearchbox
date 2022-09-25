package com.google.android.gms.reminders.internal.p10862a;

import android.os.Parcel;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.reminders.UpdateRecurrenceOptions;
import com.google.android.gms.reminders.internal.C145809f;
import com.google.android.gms.reminders.internal.C145812i;
import com.google.android.gms.reminders.internal.C145813j;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.reminders.internal.a.l */
/* compiled from: PG */
public final class C145793l extends C145782a {

    /* renamed from: a */
    final /* synthetic */ String f394162a;

    /* renamed from: d */
    final /* synthetic */ Task f394163d;

    /* renamed from: e */
    final /* synthetic */ UpdateRecurrenceOptions f394164e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145793l(C143851w wVar, String str, Task task, UpdateRecurrenceOptions updateRecurrenceOptions) {
        super(wVar);
        this.f394162a = str;
        this.f394163d = task;
        this.f394164e = updateRecurrenceOptions;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C143711ad mo117683c(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        C145813j jVar = (C145813j) bVar;
        String str = this.f394162a;
        Task task = this.f394163d;
        UpdateRecurrenceOptions updateRecurrenceOptions = this.f394164e;
        C143919bh.m233969l(jVar.f394182a.mo119476a());
        C145809f fVar = (C145809f) jVar.mo119451G();
        C145812i iVar = new C145812i(this);
        TaskEntity taskEntity = new TaskEntity(task);
        Parcel gA = fVar.mo17260gA();
        C8850c.m23499h(gA, iVar);
        gA.writeString(str);
        C8850c.m23497f(gA, taskEntity);
        C8850c.m23497f(gA, updateRecurrenceOptions);
        fVar.mo17262he(11, gA);
    }
}
