package com.google.android.libraries.p10923ac.p10925b.p10934e.p10936b;

import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146805b;
import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;
import com.google.protos.p4895aw.p4902b.C63975al;
import com.google.protos.p4895aw.p4902b.C64085en;
import com.google.protos.p4895aw.p4902b.C64086eo;

/* renamed from: com.google.android.libraries.ac.b.e.b.z */
/* compiled from: PG */
public final /* synthetic */ class C146897z implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C146897z f396522a = new C146897z();

    private /* synthetic */ C146897z() {
    }

    public final Object apply(Object obj) {
        C63975al alVar;
        C64086eo eoVar = (C64086eo) obj;
        C64085en a = C64085en.m96348a(eoVar.f173256c);
        if (a == null) {
            a = C64085en.UNKNOWN;
        }
        boolean z = false;
        boolean z2 = a != C64085en.UNKNOWN;
        C64085en a2 = C64085en.m96348a(eoVar.f173256c);
        if (a2 == null) {
            a2 = C64085en.UNKNOWN;
        }
        C58838bb.m90873h(z2, "Invalid change result status %s!", a2);
        C64085en a3 = C64085en.m96348a(eoVar.f173256c);
        if (a3 == null) {
            a3 = C64085en.UNKNOWN;
        }
        if (a3 == C64085en.ACCEPTED) {
            z = true;
        }
        if (eoVar.f173254a == 2) {
            alVar = (C63975al) eoVar.f173255b;
        } else {
            alVar = C63975al.f173015c;
        }
        return new C146805b(z, (alVar.f173017a & 1) != 0 ? Long.valueOf(alVar.f173018b) : null);
    }
}
