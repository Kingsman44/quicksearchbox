package com.google.android.gms.reminders.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.reminders.CreateReminderOptionsInternal;
import com.google.android.gms.reminders.LoadRemindersOptions;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.gms.reminders.model.TaskIdEntity;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.reminders.internal.f */
/* compiled from: PG */
public final class C145809f extends C8848a implements IInterface {
    public C145809f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.reminders.internal.IRemindersService");
    }

    /* renamed from: e */
    public final void mo121960e(C145806c cVar, TaskEntity taskEntity) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, cVar);
        C8850c.m23497f(gA, taskEntity);
        mo17262he(8, gA);
    }

    /* renamed from: f */
    public final void mo121961f(C145806c cVar, TaskEntity taskEntity, CreateReminderOptionsInternal createReminderOptionsInternal) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, cVar);
        C8850c.m23497f(gA, taskEntity);
        C8850c.m23497f(gA, createReminderOptionsInternal);
        mo17262he(16, gA);
    }

    /* renamed from: g */
    public final void mo121962g(C145806c cVar, TaskIdEntity taskIdEntity) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, cVar);
        C8850c.m23497f(gA, taskIdEntity);
        mo17262he(5, gA);
    }

    /* renamed from: h */
    public final void mo121963h(C145806c cVar, LoadRemindersOptions loadRemindersOptions) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, cVar);
        C8850c.m23497f(gA, loadRemindersOptions);
        mo17262he(1, gA);
    }
}
