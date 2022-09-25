package com.google.android.gms.cast.framework.internal;

import android.os.Handler;
import androidx.mediarouter.p175a.C3685au;
import androidx.p104d.p105a.C2164c;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.C143415aw;
import com.google.android.gms.cast.framework.C143466m;
import com.google.android.gms.cast.framework.media.C143468aa;
import com.google.android.gms.cast.framework.media.C143469ab;
import com.google.android.gms.cast.framework.media.C143500bf;
import com.google.android.gms.cast.framework.p10772a.p10773a.C143390i;
import com.google.android.gms.cast.internal.C143568ag;
import com.google.android.gms.cast.internal.C143570ai;
import com.google.android.gms.cast.internal.C143572ak;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.tasks.C146013ai;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.gms.tasks.C146021aq;
import com.google.common.p4552o.p4557d.p4558a.C59715c;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.framework.internal.s */
/* compiled from: PG */
public final /* synthetic */ class C143455s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143457u f388994a;

    /* renamed from: b */
    public final /* synthetic */ C3685au f388995b;

    /* renamed from: c */
    public final /* synthetic */ C3685au f388996c;

    /* renamed from: d */
    public final /* synthetic */ C2164c f388997d;

    public /* synthetic */ C143455s(C143457u uVar, C3685au auVar, C3685au auVar2, C2164c cVar) {
        this.f388994a = uVar;
        this.f388995b = auVar;
        this.f388996c = auVar2;
        this.f388997d = cVar;
    }

    public final void run() {
        C143466m mVar;
        Object obj;
        Object obj2;
        C143457u uVar = this.f388994a;
        C3685au auVar = this.f388995b;
        C3685au auVar2 = this.f388996c;
        C2164c cVar = this.f388997d;
        C143437ac acVar = uVar.f389002b;
        if (new HashSet(acVar.f388968b).isEmpty()) {
            C143437ac.f388967a.mo118884b("No need to prepare transfer without any callback", new Object[0]);
            cVar.mo5437b((Object) null);
        } else if (auVar.f11870j == 1 && auVar2.f11870j == 0) {
            if (acVar.f388972f == null) {
                C143437ac.f388967a.mo118884b("skip attaching as sessionManager is null", new Object[0]);
                mVar = null;
            } else {
                C143437ac.f388967a.mo118884b("attach to CastSession for transfer notification", new Object[0]);
                mVar = acVar.f388972f.mo118621a();
                if (mVar != null) {
                    mVar.mo118721d(acVar);
                }
            }
            if (mVar == null) {
                C143437ac.f388967a.mo118884b("No need to prepare transfer when there is no Cast session", new Object[0]);
                cVar.mo5437b((Object) null);
                return;
            }
            C143500bf c = mVar.mo118720c();
            if (c == null || !c.mo118793u()) {
                C143437ac.f388967a.mo118884b("No need to prepare transfer when there is no media session", new Object[0]);
                acVar.mo118640a();
                cVar.mo5437b((Object) null);
                return;
            }
            C143437ac.f388967a.mo118884b("Prepare route transfer for changing endpoint", new Object[0]);
            acVar.f388971e = 1;
            acVar.f388973g = cVar;
            C143437ac.f388967a.mo118884b("notify transferring with type = %d", 1);
            for (C143415aw b : new HashSet(acVar.f388968b)) {
                b.mo118549b(acVar.f388971e);
            }
            acVar.f388974h = null;
            C143919bh.m233964g("Must be called from the main thread.");
            if (!c.mo118792t()) {
                obj = C146021aq.m237849c(new C143570ai());
            } else {
                c.f389130e = new C146010af();
                MediaStatus i = c.mo118781i();
                if (i == null || !i.mo118438e(262144)) {
                    c.mo118788p();
                } else {
                    C143572ak akVar = c.f389129d;
                    JSONObject jSONObject = new JSONObject();
                    long c2 = akVar.mo118916c();
                    try {
                        jSONObject.put("requestId", c2);
                        jSONObject.put("type", "STORE_SESSION");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("assistant_supported", true);
                        jSONObject2.put("display_supported", true);
                        jSONObject2.put("is_group", false);
                        jSONObject.put("targetDeviceCapabilities", jSONObject2);
                    } catch (JSONException e) {
                        akVar.f389318b.mo118890h(e, "store session failed to create JSON message", new Object[0]);
                    }
                    try {
                        akVar.mo118917d(jSONObject.toString(), c2);
                        akVar.f389276C.mo118905a(c2, new C143568ag(akVar));
                        akVar.f389277D = new C146010af();
                        obj2 = akVar.f389277D.f394698a;
                    } catch (IllegalStateException e2) {
                        obj2 = C146021aq.m237849c(e2);
                    }
                    C146014aj ajVar = (C146014aj) obj2;
                    ajVar.mo122495n(C146013ai.f394700a, new C143468aa(c));
                    ajVar.mo122494m(C146013ai.f394700a, new C143469ab(c));
                }
                obj = c.f389130e.f394698a;
            }
            C146014aj ajVar2 = (C146014aj) obj;
            ajVar2.mo122495n(C146013ai.f394700a, new C143435aa(acVar));
            ajVar2.mo122494m(C146013ai.f394700a, new C143436ab(acVar));
            Handler handler = acVar.f388969c;
            Runnable runnable = acVar.f388970d;
            C143919bh.m233958a(runnable);
            handler.postDelayed(runnable, 10000);
            C143390i.m232669e(C59715c.CAST_TRANSFER_TO_LOCAL_USED);
        } else {
            C143437ac.f388967a.mo118884b("No need to prepare transfer for non cast-to-phone case", new Object[0]);
            cVar.mo5437b((Object) null);
        }
    }
}
