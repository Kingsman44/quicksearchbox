package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p870d.p871a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12093d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p804b.C12425a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.d.a.z */
/* compiled from: PG */
public final /* synthetic */ class C12956z implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C12914ak f40323a;

    /* renamed from: b */
    public final /* synthetic */ C12986d f40324b;

    public /* synthetic */ C12956z(C12914ak akVar, C12986d dVar) {
        this.f40323a = akVar;
        this.f40324b = dVar;
    }

    public final Object call() {
        C12914ak akVar = this.f40323a;
        C12986d dVar = this.f40324b;
        C60870cx i = C60856cj.m92900i(C58836b.f156633a);
        if (dVar != null) {
            C12093d dVar2 = akVar.f40191c;
            if (dVar2 != null) {
                C12953w wVar = akVar.f40206r;
                if (wVar != null) {
                    i = wVar.f40315b.f40318a;
                    if (i == null) {
                        throw new NullPointerException("Null lastInteractionState");
                    }
                } else {
                    C60870cx cxVar = akVar.f40205q;
                    if (cxVar != null) {
                        i = cxVar;
                    }
                }
                akVar.f40206r = new C12953w(akVar.f40193e.mo20601a(new C12425a(dVar2, dVar, i)), akVar.f40190b, akVar.f40195g);
                return akVar.f40206r;
            }
            throw new NullPointerException("Null audioClient");
        }
        throw new NullPointerException("Null request");
    }
}
