package com.google.android.libraries.lens.ondevice.p2034k;

import android.content.Context;
import com.google.android.libraries.lens.ondevice.nativeapi.LodeResourceHolder;
import com.google.android.libraries.lens.ondevice.p2017a.C24266a;
import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24271c;
import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24272d;
import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24273e;
import com.google.android.libraries.lens.ondevice.p2026f.p2029b.C24473a;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.android.libraries.lens.view.flags.C26242ac;
import com.google.android.libraries.lens.view.flags.C26243ad;
import com.google.common.base.C58833ax;
import com.google.lens.p4701g.C62252ab;
import com.google.lens.p4701g.C62253ac;
import com.google.lens.p4701g.C62350m;
import com.google.lens.p4701g.C62351n;
import java.io.File;

@C24266a(mo29795a = "InpaintingEngine")
/* renamed from: com.google.android.libraries.lens.ondevice.k.ac */
/* compiled from: PG */
public final class C24538ac implements C24650eg {

    /* renamed from: a */
    public static final /* synthetic */ int f67206a = 0;

    /* renamed from: b */
    private static final String f67207b = C24657en.m45762b(C24538ac.class);

    /* renamed from: c */
    private final C24551ap f67208c;

    /* renamed from: d */
    private final C26243ad f67209d;

    public C24538ac(C24551ap apVar, C26243ad adVar) {
        this.f67208c = apVar;
        this.f67209d = adVar;
    }

    /* renamed from: a */
    public final C58833ax mo29949a(C24795f fVar) {
        C62253ac acVar = fVar.f67757i;
        if (acVar == null) {
            acVar = C62253ac.f168064l;
        }
        if (acVar.f168071f) {
            return C58833ax.m90834k(C24473a.m45543b("inpainting_v0_fixed_shape_batch_size_8", 0));
        }
        if (this.f67209d.mo31464k(C26242ac.ENABLE_GDD_LENS_TEXT_GELLER_SYNC)) {
            return C58833ax.m90834k(C24473a.m45544c("inpainting_fixed_shape_batch_size_8", "GddLensText"));
        }
        return C58833ax.m90834k(C24473a.m45543b("inpainting_v3_fixed_shape_batch_size_8", 0));
    }

    /* renamed from: b */
    public final void mo29950b(Context context, LodeResourceHolder lodeResourceHolder, C24803n nVar, C24795f fVar) {
        String f = C24473a.m45547f(nVar, true != this.f67209d.mo31464k(C26242ac.ENABLE_GDD_LENS_TEXT_GELLER_SYNC) ? "inpainting_v3_fixed_shape_batch_size_8" : "inpainting_fixed_shape_batch_size_8");
        if (f != null) {
            String str = f + File.separator + "model.tflite";
            C62253ac acVar = fVar.f67757i;
            if (acVar == null) {
                acVar = C62253ac.f168064l;
            }
            C62252ab abVar = (C62252ab) C62253ac.f168064l.createBuilder(acVar);
            abVar.copyOnWrite();
            C62253ac acVar2 = (C62253ac) abVar.instance;
            acVar2.f168066a = 1 | acVar2.f168066a;
            acVar2.f168067b = str;
            C62253ac acVar3 = (C62253ac) abVar.build();
            try {
                C24551ap apVar = this.f67208c;
                apVar.f67232b = acVar3;
                C62350m mVar = (C62350m) C62351n.f168321c.createBuilder();
                mVar.copyOnWrite();
                C62351n nVar2 = (C62351n) mVar.instance;
                acVar3.getClass();
                nVar2.f168324b = acVar3;
                nVar2.f168323a = 10;
                apVar.f67231a.mo30015f(context, (C62351n) mVar.build());
            } catch (C24273e e) {
                throw new C24271c(f67207b, e);
            }
        } else {
            throw new C24272d("Inpainting model is missing.");
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo29951c() {
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo29952d(C24795f fVar) {
        return false;
    }
}
