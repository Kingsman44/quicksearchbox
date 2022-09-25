package com.google.android.apps.gsa.speech.p7311n;

import android.content.Context;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.p5294a.C68220f;

/* renamed from: com.google.android.apps.gsa.speech.n.h */
/* compiled from: PG */
public final class C92540h implements C68220f {
    /* renamed from: a */
    public static C92541i m152352a(Context context, C86338r rVar) {
        boolean z;
        C92541i iVar = new C92541i(context, rVar);
        C58976aa aaVar = C58975e.f156826a;
        synchronized (iVar.f258269b) {
            if (!iVar.f258272e) {
                synchronized (iVar.f258269b) {
                    iVar.f258270c = C92541i.m152354c(iVar.f258268a.mo80079e("voice_search_configuration_data", (byte[]) null));
                    iVar.f258271d = C92541i.m152354c(iVar.f258268a.mo80079e("voice_search_configuration_override", (byte[]) null));
                }
                if (!C92541i.m152355f(iVar.f258270c)) {
                    iVar.f258270c = iVar.mo87317b();
                    z = true;
                } else {
                    z = false;
                }
                iVar.mo87318d();
                if (z) {
                    iVar.mo87319e();
                }
                iVar.f258272e = true;
            }
        }
        return iVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
