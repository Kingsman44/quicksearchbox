package com.google.android.libraries.lens.view.p2113h.p2115b.p2117b;

import android.graphics.SurfaceTexture;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26736ae;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26758j;
import com.google.android.libraries.lens.view.p2113h.p2122e.C26778ac;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.h.b.b.i */
/* compiled from: PG */
public final /* synthetic */ class C26690i implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a */
    public final /* synthetic */ C26701t f72768a;

    public /* synthetic */ C26690i(C26701t tVar) {
        this.f72768a = tVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C26701t tVar = this.f72768a;
        C26736ae aeVar = tVar.f72799l;
        if (aeVar != null && surfaceTexture == aeVar) {
            if (!tVar.f72802o) {
                tVar.f72812y.f72689b.mo19974a(C37194a.f98629h);
                tVar.f72802o = true;
            }
            C26758j jVar = new C26758j();
            C58833ax axVar = tVar.f72803p;
            if (axVar != null) {
                jVar.f72909a = axVar;
                jVar.mo32046b(tVar.f72804q);
                C58833ax axVar2 = tVar.f72806s;
                if (axVar2 != null) {
                    jVar.f72910b = axVar2;
                    C58833ax axVar3 = tVar.f72809v;
                    if (axVar3 != null) {
                        jVar.f72911c = axVar3;
                        jVar.f72915g = C58833ax.m90834k(Float.valueOf(tVar.f72807t));
                        jVar.f72916h = C58833ax.m90834k(Float.valueOf(tVar.f72808u));
                        C26778ac acVar = tVar.f72813z;
                        if (acVar != null) {
                            acVar.mo32145a(jVar);
                        } else {
                            tVar.f72796i = jVar;
                        }
                    } else {
                        throw new NullPointerException("Null exposureDurationNs");
                    }
                } else {
                    throw new NullPointerException("Null isExposureConverged");
                }
            } else {
                throw new NullPointerException("Null isFocused");
            }
        }
    }
}
