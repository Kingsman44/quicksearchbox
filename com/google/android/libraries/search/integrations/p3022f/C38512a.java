package com.google.android.libraries.search.integrations.p3022f;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.p10747b.p10748a.C142954b;
import com.google.android.gms.p10747b.p10748a.C142967o;
import com.google.android.gms.p10747b.p10748a.C142969q;
import com.google.android.libraries.appdoctor.C10462b;
import com.google.android.libraries.appdoctor.C10468c;
import com.google.android.libraries.appdoctor.C10476d;
import com.google.android.libraries.appdoctor.C10479g;
import com.google.android.libraries.appdoctor.p573a.C10448e;
import com.google.android.libraries.appdoctor.p573a.C10452i;
import com.google.android.libraries.appdoctor.p573a.C10453j;
import com.google.android.libraries.appdoctor.p573a.C10454k;
import com.google.android.libraries.appdoctor.p573a.C10459p;
import com.google.android.libraries.appdoctor.p573a.C10460q;
import com.google.android.libraries.p11012aj.C147607f;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4552o.p4566l.C60223w;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.search.integrations.f.a */
/* compiled from: PG */
public final /* synthetic */ class C38512a implements C147607f {

    /* renamed from: a */
    public final /* synthetic */ Context f101873a;

    public /* synthetic */ C38512a(Context context) {
        this.f101873a = context;
    }

    /* renamed from: a */
    public final void mo41448a() {
        Context context = this.f101873a;
        C10476d a = new C10468c(new C10479g(context)).mo18507a();
        boolean g = a.mo18513g(context, C60223w.STARTUP);
        if (!a.f35242b.isEmpty()) {
            C10453j jVar = new C10453j();
            jVar.f35196b = context;
            jVar.f35195a = C60223w.STARTUP;
            jVar.f35197c = a.f35241a;
            C10454k a2 = jVar.mo18496a();
            C58495hd b = a.mo18509b();
            C10460q qVar = new C10460q((C10462b) null);
            C58800sl lA = a.f35242b.iterator();
            while (lA.hasNext()) {
                C142954b bVar = (C142954b) lA.next();
                if (!b.containsKey(bVar)) {
                    a.mo18512f(a2.f35203b, bVar, a2.f35202a);
                } else {
                    C58833ax a3 = C10476d.m25449a((Class) b.get(bVar));
                    if (!a3.mo56113h()) {
                        a.mo18510d(a2.f35203b, bVar, a2.f35202a);
                    } else {
                        int number = bVar.getNumber();
                        qVar.mo18504b(new C10452i("startup_" + number, bVar, (C142967o) null, (C10448e) a3.mo56107c(), C10452i.f35186a));
                    }
                }
            }
            C10459p a4 = qVar.mo18503a(a2);
            try {
                a4.f35216b.get();
            } catch (InterruptedException | RuntimeException | ExecutionException unused) {
                a.mo18511e(context, C142969q.f387920d, C60223w.STARTUP);
            }
            if (!g && !a4.f35215a) {
                return;
            }
        } else if (!g) {
            return;
        }
        Log.i("TNG:SA", "Ran some fixes.");
    }
}
