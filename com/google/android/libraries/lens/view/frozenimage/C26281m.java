package com.google.android.libraries.lens.view.frozenimage;

import androidx.lifecycle.C2333ah;
import com.google.android.libraries.lens.view.gallery.p2112e.C26416i;
import com.google.android.libraries.lens.view.p2078at.C25518ax;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.frozenimage.m */
/* compiled from: PG */
public final /* synthetic */ class C26281m implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C26285q f71421a;

    public /* synthetic */ C26281m(C26285q qVar) {
        this.f71421a = qVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C26285q qVar = this.f71421a;
        C58833ax axVar = (C58833ax) obj;
        C25518ax.m46997e(axVar, qVar.f71430f);
        qVar.mo31484b();
        if (qVar.f71432h != null && axVar.mo56113h()) {
            C26416i iVar = qVar.f71432h;
            iVar.getClass();
            C25518ax axVar2 = (C25518ax) axVar.mo56107c();
            iVar.f71881l = ((float) iVar.f71875f.left) + (((float) iVar.f71875f.width()) * axVar2.f69479a.x);
            float height = ((float) iVar.f71875f.top) + (((float) iVar.f71875f.height()) * axVar2.f69479a.y);
            iVar.f71882m = height;
            float f = axVar2.f69480b;
            iVar.f71880k = f;
            if (iVar.f71883n == 1.0f) {
                iVar.mo31622f(iVar.f71881l, height, f);
            }
        }
    }
}
