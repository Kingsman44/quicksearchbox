package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6184j.p6185a;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.lens.sdk.avs.data.C24877l;
import com.google.android.libraries.lens.sdk.avs.data.RenderableGleam;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4707j.C62441br;
import com.google.lens.p4707j.C62445bv;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.j.a.l */
/* compiled from: PG */
public final /* synthetic */ class C78596l implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C78583aa f216395a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f216396b;

    public /* synthetic */ C78596l(C78583aa aaVar, C60870cx cxVar) {
        this.f216395a = aaVar;
        this.f216396b = cxVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C78583aa aaVar = this.f216395a;
        C24877l lVar = (C24877l) obj;
        Bitmap bitmap = (Bitmap) C60856cj.m92909r(this.f216396b);
        if (!lVar.mo30092a()) {
            C58976aa aaVar2 = C58975e.f156826a;
            return C58485gu.m89845m();
        }
        C89859i iVar = aaVar.f216353m;
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.ASSISTANT_AVS_GLEAMS_DETECTED;
        iVar.mo74236a(fVar.mo83699a());
        C58480gp gpVar = new C58480gp(4);
        RenderableGleam[] b = lVar.mo30093b();
        b.getClass();
        for (RenderableGleam renderableGleam : b) {
            C62445bv bvVar = renderableGleam.f67924b.f68847h;
            if (bvVar == null) {
                bvVar = C62445bv.f168618e;
            }
            C62441br brVar = bvVar.f168621b;
            if (brVar == null) {
                brVar = C62441br.f168608h;
            }
            float f = brVar.f168611b;
            float f2 = brVar.f168613d;
            float f3 = f - (f2 / 2.0f);
            float f4 = brVar.f168612c;
            float f5 = brVar.f168614e;
            float f6 = f4 - (f5 / 2.0f);
            gpVar.mo55395g(new RectF(f3, f6, f2 + f3, f5 + f6));
        }
        return gpVar.mo55394f();
    }
}
