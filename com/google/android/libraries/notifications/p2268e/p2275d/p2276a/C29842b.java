package com.google.android.libraries.notifications.p2268e.p2275d.p2276a;

import android.os.Bundle;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.p2298k.C30035a;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2318f.p2322b.C30123b;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.notifications.internal.periodic.impl.ChimePeriodicTaskManagerImpl$scheduleChimeTask$1", mo61344c = "ChimePeriodicTaskManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {64})
/* renamed from: com.google.android.libraries.notifications.e.d.a.b */
/* compiled from: PG */
public final class C29842b extends C69572j implements C69630p {

    /* renamed from: a */
    int f80908a;

    /* renamed from: b */
    final /* synthetic */ C29844d f80909b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29842b(C29844d dVar, C69577g gVar) {
        super(2, gVar);
        this.f80909b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C29842b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f80908a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Exception e) {
                C30058b.m55797i("ChimePeriodicTaskManagerImpl", e, "Failed to cancel periodic job scheduled with GNP", new Object[0]);
            }
        } else {
            C69714l.m101134b(obj);
            int a = this.f80909b.f80915d.mo35373a();
            this.f80908a = 1;
            if (((C30123b) this.f80909b.f80913b.mo27525b()).mo35519a(a, this) == aVar) {
                return aVar;
            }
        }
        if (this.f80909b.f80912a.mo35372d()) {
            C30058b.m55794f("ChimePeriodicTaskManagerImpl", "Periodic Task already scheduled.", new Object[0]);
            return C69788q.f186170a;
        }
        try {
            C29844d dVar = this.f80909b;
            dVar.f80912a.mo35370b((C29820k) null, 7, dVar.f80914c, new Bundle());
        } catch (C30035a e2) {
            C30058b.m55795g("ChimePeriodicTaskManagerImpl", e2, "Unable to schedule periodic task.", new Object[0]);
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C29842b(this.f80909b, gVar);
    }
}
