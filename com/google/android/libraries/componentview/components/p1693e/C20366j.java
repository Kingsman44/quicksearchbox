package com.google.android.libraries.componentview.components.p1693e;

import androidx.viewpager.widget.C4277j;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;

/* renamed from: com.google.android.libraries.componentview.components.e.j */
/* compiled from: PG */
final class C20366j implements C4277j {

    /* renamed from: a */
    final /* synthetic */ C20369m f57256a;

    public C20366j(C20369m mVar) {
        this.f57256a = mVar;
    }

    /* renamed from: a */
    public final void mo9182a(int i) {
    }

    /* renamed from: c */
    public final void mo9183c(int i, float f, int i2) {
    }

    /* renamed from: e */
    public final void mo9184e(int i) {
        C56429h hVar;
        C56429h H = ((C20470a) this.f57256a.f56324d.get(i)).mo25419H();
        if (H != null) {
            C20369m mVar = this.f57256a;
            C56425d dVar = mVar.f57588z;
            if ((dVar.f150539a & 4) != 0) {
                hVar = dVar.f150542d;
                if (hVar == null) {
                    hVar = C56429h.f150547k;
                }
            } else {
                hVar = null;
            }
            mVar.mo25381m(H, hVar);
        }
        C20369m mVar2 = this.f57256a;
        if (!mVar2.f57264g[i]) {
            mVar2.f57261a.execute(new C20365i(this, mVar2.f57267j, C19742a.IMAGE_LOADING_ERROR, i));
            this.f57256a.f57264g[i] = true;
        }
    }
}
