package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8460k;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d;
import com.google.android.gms.reminders.model.C145822ab;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.k.e */
/* compiled from: PG */
public final /* synthetic */ class C110720e implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C110722g f308504a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f308505b;

    public /* synthetic */ C110720e(C110722g gVar, SettableFuture settableFuture) {
        this.f308504a = gVar;
        this.f308505b = settableFuture;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        long j;
        long j2;
        C110722g gVar = this.f308504a;
        SettableFuture settableFuture = this.f308505b;
        C58485gu guVar = (C58485gu) obj;
        C58976aa aaVar = C58975e.f156826a;
        long b = gVar.f308513g.mo26870b();
        int size = guVar.size();
        Task task = null;
        for (int i = 0; i < size; i++) {
            Task task2 = (Task) guVar.get(i);
            if (task2.mo122063C() != null) {
                if (task2.mo122063C().longValue() >= (gVar.f308513g.mo26870b() - gVar.mo98862a()) + C110722g.f308510d) {
                    long longValue = task2.mo122063C().longValue();
                    long longValue2 = task2.mo122062B().longValue();
                    if (task == null || longValue < task.mo122063C().longValue() || (longValue == task.mo122063C().longValue() && longValue2 > task.mo122062B().longValue())) {
                        task = task2;
                    }
                }
            }
        }
        if (task == null) {
            gVar.mo98863b(b + C110722g.f308509c);
            task = new C145822ab().mo122169a();
        } else {
            long b2 = gVar.f308513g.mo26870b();
            long longValue3 = task.mo122063C().longValue();
            if (gVar.f308515i.mo77157A()) {
                j = TimeUnit.MINUTES.toMillis(gVar.f308515i.mo77168d());
            } else {
                j = TimeUnit.SECONDS.toMillis(C131179d.f358774j);
            }
            if (longValue3 - b2 > j) {
                j2 = longValue3 - j;
            } else {
                j2 = longValue3 + gVar.mo98862a();
            }
            task.mo122067G();
            gVar.mo98863b(j2);
        }
        gVar.f308516j.mo78853f(new TaskEntity(task)).mo4106b(new C110718c(settableFuture), C60826bg.f164896a);
    }
}
