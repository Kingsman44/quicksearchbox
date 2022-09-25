package com.google.android.apps.gsa.staticplugins.p7756cx;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.sidekick.shared.p7243l.C91757c;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.reminders.C145778g;
import com.google.android.gms.reminders.C145779h;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.libraries.p11024al.p11025a.C147747c;
import com.google.android.libraries.p11024al.p11025a.C147753i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.cx.e */
/* compiled from: PG */
public final /* synthetic */ class C99226e implements C91757c {

    /* renamed from: a */
    public final /* synthetic */ C99233l f277590a;

    /* renamed from: b */
    public final /* synthetic */ String f277591b;

    /* renamed from: c */
    public final /* synthetic */ Task f277592c;

    public /* synthetic */ C99226e(C99233l lVar, String str, Task task) {
        this.f277590a = lVar;
        this.f277591b = str;
        this.f277592c = task;
    }

    /* renamed from: a */
    public final Object mo86253a(C143851w wVar) {
        C99233l lVar = this.f277590a;
        String str = this.f277591b;
        Task task = this.f277592c;
        C147753i iVar = lVar.f277608f;
        C145779h hVar = C145778g.f394146c;
        TaskEntity taskEntity = (TaskEntity) task;
        return (String) C90877ak.m148472f(C60922j.m93045h(iVar.mo124430a(hVar, wVar, str), new C147747c(taskEntity.f394312c, taskEntity.f394320k, taskEntity.f394322m, taskEntity.f394323n, taskEntity.f394326q, hVar, wVar), C60826bg.f164896a));
    }
}
