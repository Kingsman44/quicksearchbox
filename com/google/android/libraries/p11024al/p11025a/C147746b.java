package com.google.android.libraries.p11024al.p11025a;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143824m;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.reminders.C145778g;
import com.google.android.gms.reminders.UpdateRecurrenceOptions;
import com.google.android.gms.reminders.internal.p10862a.C145792k;
import com.google.android.gms.reminders.internal.p10862a.C145799r;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskId;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.al.a.b */
/* compiled from: PG */
public final class C147746b implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C143851w f398684a;

    public C147746b(C143851w wVar) {
        this.f398684a = wVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C143824m mVar;
        Task task = (Task) obj;
        if (task == null) {
            return new Status(1, 0, (String) null, (PendingIntent) null, (ConnectionResult) null);
        }
        C143840l lVar = C145778g.f394144a;
        C143851w wVar = this.f398684a;
        if (C147753i.m240808c(task)) {
            String k = task.mo122076m().mo122042k();
            UpdateRecurrenceOptions updateRecurrenceOptions = UpdateRecurrenceOptions.f394129a;
            C143919bh.m233971n(k, "Must provide client-assigned recurrence id.");
            C143919bh.m233971n(updateRecurrenceOptions, "updateRecurrenceOption required");
            mVar = wVar.mo119159d(new C145792k(wVar, k, updateRecurrenceOptions));
        } else {
            TaskId n = task.mo122077n();
            C143919bh.m233971n(n, "Task id required on delete.");
            mVar = wVar.mo119159d(new C145799r(wVar, n));
        }
        return (Status) mVar.mo117316a();
    }
}
