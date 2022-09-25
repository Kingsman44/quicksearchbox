package com.google.android.apps.gsa.sidekick.shared.monet.p7250f;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.f.f */
/* compiled from: PG */
final class C91829f implements C91826c {

    /* renamed from: a */
    final /* synthetic */ C91830g f256097a;

    public C91829f(C91830g gVar) {
        this.f256097a = gVar;
    }

    /* renamed from: g */
    public final void mo86306g(String str, int i, int i2) {
        if (this.f256097a.f256100c.mo28316z() && ((String) this.f256097a.f256101d.mo6453a()).equals(str)) {
            C91830g gVar = this.f256097a;
            boolean z = true;
            int i3 = 0;
            if (gVar.f256102e) {
                if (i != 0) {
                    if (i <= 0) {
                        z = false;
                    }
                } else {
                    return;
                }
            } else if (i2 != 0) {
                if (i2 <= 0) {
                    z = false;
                }
                i = i2;
            } else {
                return;
            }
            boolean z2 = z;
            C91828e eVar = gVar.f256105h;
            if (eVar != null && eVar.f256093a == z2) {
                i3 = eVar.f256094b;
                gVar.f256098a.mo85149n(eVar);
            }
            C91830g gVar2 = this.f256097a;
            gVar2.f256105h = new C91828e(gVar2, z2, i + i3, gVar2.f256104g.mo26870b());
            C91830g gVar3 = this.f256097a;
            gVar3.f256098a.mo85150o(gVar3.f256105h, 200);
        }
    }

    /* renamed from: h */
    public final /* synthetic */ void mo86307h(View view, String str, int i) {
    }
}
