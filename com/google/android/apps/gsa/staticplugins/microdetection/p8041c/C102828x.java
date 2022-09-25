package com.google.android.apps.gsa.staticplugins.microdetection.p8041c;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6560at.C84734a;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92494f;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92495g;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.c.x */
/* compiled from: PG */
public final class C102828x implements C118549h {

    /* renamed from: a */
    private final C86338r f287135a;

    /* renamed from: b */
    private final C84734a f287136b;

    public C102828x(C86338r rVar, C84734a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        C90584f fVar = C90584f.UNKNOWN;
        this.f287135a = rVar;
        this.f287136b = aVar;
    }

    /* renamed from: b */
    public static void m170539b(C86338r rVar, C84734a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        boolean z = rVar.getBoolean("download_hotword_model_upgrade", false);
        C86337q b = rVar.mo80076b();
        b.mo80075j("download_hotword_model_upgrade");
        b.apply();
        aVar.mo78452e();
        if (!z) {
            aVar.mo78451d();
        }
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C92495g.f258128a);
        akVar.mo58887l(r0);
        if (akVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C92495g.f258128a);
            akVar.mo58887l(r02);
            Object l = akVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            int i = ((C92494f) obj).f258125b;
            C90584f fVar = C90584f.UNKNOWN;
        }
        m170539b(this.f287135a, this.f287136b);
        return C118826c.f331423b;
    }
}
