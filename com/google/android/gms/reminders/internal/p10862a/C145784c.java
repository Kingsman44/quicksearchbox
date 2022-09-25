package com.google.android.gms.reminders.internal.p10862a;

import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.reminders.LoadRemindersOptions;
import com.google.android.gms.reminders.internal.C145809f;
import com.google.android.gms.reminders.internal.C145813j;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.reminders.internal.a.c */
/* compiled from: PG */
public final /* synthetic */ class C145784c implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ LoadRemindersOptions f394149a;

    public /* synthetic */ C145784c(LoadRemindersOptions loadRemindersOptions) {
        this.f394149a = loadRemindersOptions;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        LoadRemindersOptions loadRemindersOptions = this.f394149a;
        C145788g gVar = new C145788g((C146010af) obj2);
        C145809f fVar = (C145809f) ((C145813j) obj).mo119451G();
        if (loadRemindersOptions == null) {
            loadRemindersOptions = LoadRemindersOptions.f394113a;
        }
        fVar.mo121963h(gVar, loadRemindersOptions);
    }
}
