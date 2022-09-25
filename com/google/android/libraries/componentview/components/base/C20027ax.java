package com.google.android.libraries.componentview.components.base;

import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.componentview.p1697d.C20477h;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4271bq.C56425d;

/* renamed from: com.google.android.libraries.componentview.components.base.ax */
/* compiled from: PG */
final class C20027ax implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C20028ay f56139a;

    public C20027ax(C20028ay ayVar) {
        this.f56139a = ayVar;
    }

    public final void onClick(View view) {
        String str;
        this.f56139a.mo25421J(4, (C20477h) null);
        C20028ay ayVar = this.f56139a;
        C19983f fVar = ayVar.f56143d;
        if (fVar != null) {
            ayVar.f56140a.mo25440b(fVar, ayVar.f56141b);
            C20028ay ayVar2 = this.f56139a;
            C56425d dVar = ayVar2.f57588z;
            if ((dVar.f150539a & 8) != 0) {
                String str2 = dVar.f150544f;
                C60214n nVar = ayVar2.f56141b.f150550b;
                if (nVar == null) {
                    nVar = C60214n.f162914g;
                }
                if ((nVar.f162916a & 8) != 0) {
                    C60214n nVar2 = this.f56139a.f56141b.f150550b;
                    if (nVar2 == null) {
                        nVar2 = C60214n.f162914g;
                    }
                    str = String.valueOf(nVar2.f162918c);
                } else {
                    str = BuildConfig.FLAVOR;
                }
                this.f56139a.f56142c.mo25491a("LinkClickAction", C58495hd.m89901o("CardId", str2, "ContainerVeId", str));
            }
        }
    }
}
