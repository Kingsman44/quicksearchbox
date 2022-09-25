package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import android.util.Size;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10650a;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10653d;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10654e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.mediapipe.p4722a.C62706h;
import com.google.mediapipe.p4722a.C62707i;
import com.google.mediapipe.p4722a.C62709k;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.g */
/* compiled from: PG */
public final /* synthetic */ class C10606g implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C10610k f35452a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f35453b;

    public /* synthetic */ C10606g(C10610k kVar, Runnable runnable) {
        this.f35452a = kVar;
        this.f35453b = runnable;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        Size size;
        C10610k kVar = this.f35452a;
        Runnable runnable = this.f35453b;
        if (kVar.f35460e.mo18713c()) {
            return C60866ct.f164955a;
        }
        runnable.run();
        if (!kVar.f35468m || (size = kVar.f35465j) == null || kVar.f35467l == -1) {
            return C60866ct.f164955a;
        }
        if (kVar.f35469n) {
            if (size.equals(kVar.f35464i)) {
                int i = kVar.f35467l;
                if (i != kVar.f35466k) {
                    kVar.f35463h.f169304a.f169295f.f169342j = i;
                    kVar.f35466k = i;
                }
                return C60866ct.f164955a;
            }
            kVar.mo18657b();
        }
        kVar.f35463h = new C62707i(kVar.f35458c.f169321c);
        C62707i iVar = kVar.f35463h;
        int i2 = kVar.f35467l;
        C62706h hVar = iVar.f169304a;
        hVar.f169295f.f169342j = i2;
        kVar.f35466k = i2;
        C62709k kVar2 = kVar.f35462g;
        if (kVar2 != null) {
            hVar.mo58588e(kVar2);
        }
        C10653d dVar = ((C10600au) kVar.f35459d).f35441k;
        if (dVar != null) {
            ((C10650a) dVar).f35549e.f35542a.mo18638g(C10654e.CAMERA_INIT);
        }
        kVar.f35464i = kVar.f35465j;
        kVar.f35469n = true;
        return kVar.f35457b.mo18676a(kVar.f35464i);
    }
}
