package com.google.android.apps.gsa.staticplugins.bisto.p7485c;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import androidx.core.content.C1882h;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95646a;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95651ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94641e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.c.m */
/* compiled from: PG */
public final class C95237m {

    /* renamed from: a */
    public boolean f266443a;

    /* renamed from: b */
    public final PhoneStateListener f266444b;

    /* renamed from: c */
    final /* synthetic */ C95239o f266445c;

    /* renamed from: d */
    private boolean f266446d;

    public C95237m(C95239o oVar) {
        this.f266445c = oVar;
        C95236l lVar = new C95236l(this);
        this.f266444b = lVar;
        TelephonyManager telephonyManager = (TelephonyManager) oVar.f266448b.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                if (C1882h.m5137c(oVar.f266448b, "android.permission.READ_PHONE_STATE") != 0) {
                    C59104x b = C95239o.f266447a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "BistoAudioController");
                    ((C59052c) ((C59052c) b).mo56372aa(14679)).mo56386p("Calling telephoneManager.listen() when we do not have phone state read permissions");
                    return;
                }
                telephonyManager.listen(lVar, 32);
            } catch (SecurityException e) {
                C59104x d = C95239o.f266447a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "BistoAudioController");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(14680)).mo56387q("SecurityException establishing phone call listener for event=%d", 32);
            }
        } else {
            C59104x c = C95239o.f266447a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoAudioController");
            ((C59052c) ((C59052c) c).mo56372aa(14681)).mo56386p("telephonyManager is null");
        }
    }

    /* renamed from: c */
    private final void m157413c(boolean z) {
        boolean z2 = this.f266446d;
        if (z2 != this.f266443a) {
            C94641e eVar = null;
            if (z2) {
                C58976aa aaVar = C58975e.f156826a;
                if (!z) {
                    this.f266445c.mo89162j(4);
                }
                this.f266443a = true;
                C95239o oVar = this.f266445c;
                oVar.f266452f = null;
                C95646a aVar = oVar.f266456j;
                if (aVar != null) {
                    aVar.f267697e.set((C94641e) aVar.f267696d.get());
                    return;
                }
                return;
            }
            C58976aa aaVar2 = C58975e.f156826a;
            C95239o oVar2 = this.f266445c;
            C94641e eVar2 = oVar2.f266453g;
            oVar2.mo89154c();
            this.f266443a = false;
            C95646a aVar2 = this.f266445c.f266456j;
            if (aVar2 != null) {
                C95214aa aaVar3 = (C95214aa) aVar2.f267698f.get();
                if (z && aaVar3 != null && aaVar3.mo89122a() == aVar2.f267700h) {
                    eVar = (C94641e) aVar2.f267697e.getAndSet((Object) null);
                }
                aVar2.f267696d.set(eVar);
            }
            this.f266445c.f266452f = eVar;
            if (eVar2 != null) {
                eVar2.mo88588g(3);
            }
            if (eVar != null) {
                this.f266445c.mo89160h();
                return;
            }
            C95646a aVar3 = this.f266445c.f266456j;
            if (aVar3 != null) {
                C95651ae aeVar = (C95651ae) aVar3.f267695c.get();
                if (aeVar == null || !aeVar.mo89622f()) {
                    C59104x b = C95646a.f267693a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "AudControlInteractor");
                    ((C59052c) ((C59052c) b).mo56372aa(16396)).mo56386p("Completed, end interaction");
                    aVar3.mo89613a();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo89148a(boolean z) {
        this.f266446d = true;
        m157413c(z);
    }

    /* renamed from: b */
    public final void mo89149b(boolean z) {
        this.f266446d = false;
        m157413c(z);
    }
}
