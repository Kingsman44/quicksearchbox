package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import com.google.android.libraries.p579ar.faceviewer.p580a.p581a.C10565a;
import com.google.android.libraries.p579ar.faceviewer.p580a.p581a.C10566b;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10650a;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10653d;
import com.google.common.base.C58872ci;
import com.google.mediapipe.framework.TextureFrame;
import com.google.mediapipe.p4722a.C62709k;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.ac */
/* compiled from: PG */
public final /* synthetic */ class C10582ac implements C62709k {

    /* renamed from: a */
    public final /* synthetic */ C10587ah f35403a;

    public /* synthetic */ C10582ac(C10587ah ahVar) {
        this.f35403a = ahVar;
    }

    /* renamed from: a */
    public final void mo18643a(TextureFrame textureFrame) {
        C10587ah ahVar = this.f35403a;
        TextureFrame textureFrame2 = (TextureFrame) ahVar.f35409c.f169312g.getAndSet(textureFrame);
        if (!(textureFrame2 == null || textureFrame2 == textureFrame)) {
            textureFrame2.release();
        }
        ahVar.f35408b.requestRender();
        C10653d dVar = ahVar.f35413g;
        if (dVar != null) {
            C10565a aVar = ((C10650a) dVar).f35549e.f35543b;
            C58872ci ciVar = aVar.f35346a;
            if (!ciVar.f156708a) {
                for (int i = 0; i < Math.min(1800, aVar.f35349d); i++) {
                    aVar.f35348c.set(i, 0);
                }
                aVar.f35349d = 0;
                C10566b bVar = aVar.f35347b;
                bVar.f35351b = 0;
                bVar.f35352c = 0;
                bVar.f35353d = 0;
                bVar.f35354e = 0;
                for (int i2 = 0; i2 < 60; i2++) {
                    bVar.f35350a.set(i2, 0);
                }
                aVar.f35346a.mo56161f();
                return;
            }
            int a = (int) ciVar.mo56158a(TimeUnit.MILLISECONDS);
            aVar.f35346a.mo56160e();
            aVar.f35346a.mo56161f();
            ArrayList arrayList = aVar.f35348c;
            int i3 = aVar.f35349d;
            Integer valueOf = Integer.valueOf(a);
            arrayList.set(i3 % 1800, valueOf);
            aVar.f35349d++;
            C10566b bVar2 = aVar.f35347b;
            if (bVar2.f35353d == bVar2.f35354e && bVar2.f35351b > 0) {
                bVar2.mo18629a();
            }
            bVar2.f35350a.set(bVar2.f35353d, valueOf);
            bVar2.f35351b++;
            bVar2.f35352c += a;
            bVar2.f35353d = (bVar2.f35353d + 1) % 60;
            while (bVar2.f35352c > 2000) {
                bVar2.mo18629a();
            }
        }
    }
}
