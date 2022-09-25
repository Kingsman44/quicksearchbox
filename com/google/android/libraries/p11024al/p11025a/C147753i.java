package com.google.android.libraries.p11024al.p11025a;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.C143854z;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.reminders.C145775d;
import com.google.android.gms.reminders.C145779h;
import com.google.android.gms.reminders.LoadRemindersOptions;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskId;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.al.a.i */
/* compiled from: PG */
public final class C147753i {
    /* renamed from: c */
    public static final boolean m240808c(Task task) {
        return Boolean.TRUE.equals(task.mo122082x()) && task.mo122076m() != null && task.mo122076m().mo122041j().booleanValue();
    }

    /* renamed from: d */
    public static final C60870cx m240809d(C143854z zVar) {
        SettableFuture settableFuture = new SettableFuture();
        Objects.requireNonNull(settableFuture);
        zVar.mo117321f(new C147745a(settableFuture));
        return settableFuture;
    }

    /* renamed from: e */
    public static final C60870cx m240810e(C145779h hVar, C143851w wVar, LoadRemindersOptions loadRemindersOptions, int i) {
        return C60922j.m93044g(m240809d(hVar.mo121949b(wVar, loadRemindersOptions)), new C147751g(i), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo124430a(C145779h hVar, C143851w wVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            return C60922j.m93044g(mo124431b(hVar, wVar, Collections.singletonList(str)), new C147750f(), C60826bg.f164896a);
        }
        Log.e("CommonRemindersUtils", "loadReminderById found empty clientAssignedId, returning");
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final C60870cx mo124431b(C145779h hVar, C143851w wVar, Collection collection) {
        if (collection.isEmpty()) {
            Log.e("CommonRemindersUtils", "loadRemindersByIds found empty clientAssignedIds, returning");
            return C60866ct.f164955a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(C147756l.m240819a((String) it.next()));
        }
        C145775d dVar = new C145775d();
        TaskId[] taskIdArr = (TaskId[]) arrayList.toArray(new TaskId[arrayList.size()]);
        dVar.f394134a = taskIdArr;
        for (TaskId taskId : taskIdArr) {
            C143919bh.m233971n(taskId, "Cannot pass in null taskId");
            C143919bh.m233960c(!TextUtils.isEmpty(taskId.mo122058h()), "Cannot pass in empty client assigned id");
        }
        return m240810e(hVar, wVar, dVar.mo121943a(), arrayList.size());
    }
}
