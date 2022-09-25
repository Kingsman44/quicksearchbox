package com.google.p5261vr.p5262a.p5263a.p5264a;

import android.content.Context;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.internal.C143750ay;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143785cf;
import com.google.android.gms.usagereporting.p10876a.C146082h;
import java.util.Queue;

/* renamed from: com.google.vr.a.a.a.g */
/* compiled from: PG */
public final class C67918g implements C67923l {

    /* renamed from: a */
    public final C67923l f184094a;

    /* renamed from: b */
    public final Queue f184095b = new C67917f();

    /* renamed from: c */
    public C67920i f184096c;

    /* renamed from: d */
    public final Object f184097d = new Object();

    /* renamed from: e */
    private final C67912a f184098e;

    /* JADX INFO: finally extract failed */
    public C67918g(Context context, C67923l lVar) {
        C67927p pVar = new C67927p(context);
        this.f184094a = lVar;
        this.f184098e = pVar;
        C67916e eVar = new C67916e(this);
        synchronized (pVar.f184088a) {
            pVar.f184089b = eVar;
        }
        C67927p pVar2 = pVar;
        pVar.mo60061b();
        if (!pVar.f184105d) {
            C67925n nVar = new C67925n(pVar);
            C143851w wVar = pVar.f184104c;
            C143750ay ayVar = (C143750ay) wVar;
            ayVar.f389698b.lock();
            try {
                C143785cf cfVar = ((C143750ay) wVar).f389708l;
                C143784ce b = C143785cf.m233680b(nVar, ((C143750ay) wVar).f389700d, "NO_TYPE");
                cfVar.f389808a.add(b);
                ayVar.f389698b.unlock();
                wVar.mo119159d(new C146082h(wVar, b)).mo117321f(new C67924m());
                pVar.f184105d = true;
            } catch (Throwable th) {
                ayVar.f389698b.unlock();
                throw th;
            }
        }
    }

    /* renamed from: c */
    public static void m98194c(C67923l lVar, C67920i iVar, C67922k kVar) {
        if (((C67913b) iVar).f184090a) {
            lVar.mo18730a(kVar);
        }
    }

    /* renamed from: a */
    public final void mo18730a(C67922k kVar) {
        synchronized (this.f184097d) {
            C67920i iVar = this.f184096c;
            if (iVar == null) {
                ((C67917f) this.f184095b).add(kVar);
            } else {
                m98194c(this.f184094a, iVar, kVar);
            }
        }
    }

    /* renamed from: b */
    public final int mo18731b() {
        C67920i iVar;
        synchronized (this.f184097d) {
            iVar = this.f184096c;
        }
        if (iVar == null) {
            return 0;
        }
        if (((C67913b) iVar).f184090a) {
            return ((C67919h) this.f184094a).f184099a;
        }
        return 2;
    }
}
