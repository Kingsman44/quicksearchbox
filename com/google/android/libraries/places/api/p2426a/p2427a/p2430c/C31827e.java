package com.google.android.libraries.places.api.p2426a.p2427a.p2430c;

import android.app.PendingIntent;
import com.android.p275j.C5170a;
import com.android.p275j.C5201m;
import com.android.p275j.C5202n;
import com.android.p275j.C5204p;
import com.android.p275j.C5209u;
import com.android.p275j.C5211w;
import com.android.p275j.C5212x;
import com.android.p275j.C5213y;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C146004a;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146010af;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.C31801i;
import com.google.android.libraries.places.p2424a.p2425a.C31775f;
import com.google.p386ak.C8406v;
import java.util.Map;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.places.api.a.a.c.e */
/* compiled from: PG */
public final class C31827e {

    /* renamed from: a */
    private final C5209u f85441a;

    /* renamed from: b */
    private final C31801i f85442b;

    public C31827e(C5209u uVar, C31801i iVar) {
        this.f85441a = uVar;
        this.f85442b = iVar;
    }

    /* renamed from: c */
    public static /* synthetic */ void m59188c(C146010af afVar, C5213y yVar) {
        int i;
        try {
            if (yVar instanceof C5201m) {
                i = 7;
            } else if (yVar instanceof C5212x) {
                i = 15;
            } else {
                if (!(yVar instanceof C5211w)) {
                    if (!(yVar instanceof C5204p)) {
                        i = yVar instanceof C5170a ? 9011 : 13;
                    }
                }
                i = 8;
            }
            C5202n nVar = yVar.f16541a;
            afVar.f394698a.mo122509w(new C143842n(new Status(1, i, String.format("Unexpected server error (HTTP Code: %s. Message: %s.)", new Object[]{nVar == null ? "N/A" : String.valueOf(nVar.f16505a), yVar}), (PendingIntent) null, (ConnectionResult) null)));
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    /* renamed from: a */
    public final C146006ab mo37392a(C31828f fVar, Class cls) {
        C146010af afVar;
        String a = fVar.mo37389a();
        Map b = fVar.mo37390b();
        C146004a a2 = fVar.f85443a.mo37404a();
        if (a2 != null) {
            afVar = new C146010af(a2);
        } else {
            afVar = new C146010af();
        }
        C31826d dVar = new C31826d(a, new C31787a(this, cls, afVar), new C31824b(afVar), b);
        if (a2 != null) {
            Objects.requireNonNull(dVar);
            a2.mo122481b(new C31825c(dVar));
        }
        C5209u uVar = this.f85441a;
        dVar.f16518f = uVar;
        synchronized (uVar.f16527b) {
            uVar.f16527b.add(dVar);
        }
        dVar.f16517e = Integer.valueOf(uVar.f16526a.incrementAndGet());
        dVar.mo10293c("add-to-queue");
        uVar.mo10304a();
        uVar.f16528c.add(dVar);
        return afVar.f394698a;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo37393b(Class cls, C146010af afVar, JSONObject jSONObject) {
        try {
            C31801i iVar = this.f85442b;
            afVar.f394698a.mo122510x((C31829g) iVar.f85420a.mo17146d(jSONObject.toString(), cls));
        } catch (C8406v unused) {
            String name = cls.getName();
            throw new C31830h("Could not convert JSON string to " + name + " due to syntax errors.");
        } catch (C31830h e) {
            try {
                afVar.f394698a.mo122509w(new C143842n(new Status(1, 8, e.getMessage(), (PendingIntent) null, (ConnectionResult) null)));
            } catch (Error | RuntimeException e2) {
                C31775f.m59130a(e2);
                throw e2;
            }
        }
    }
}
