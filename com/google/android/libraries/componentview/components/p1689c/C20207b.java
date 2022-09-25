package com.google.android.libraries.componentview.components.p1689c;

import com.google.android.libraries.componentview.components.base.p1687a.C19953c;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20130b;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.p1699f.C20524l;
import com.google.android.libraries.componentview.services.application.C20578be;
import com.google.common.util.concurrent.C60845bz;
import java.nio.charset.Charset;

/* renamed from: com.google.android.libraries.componentview.components.c.b */
/* compiled from: PG */
final class C20207b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C20234c f56734a;

    public C20207b(C20234c cVar) {
        this.f56734a = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C20520h.m38497b(6, "AdsDcmComponent", (Throwable) null, "Error while waiting for DCM callback: ".concat(String.valueOf(th.getMessage())), new Object[0]);
        C20234c cVar = this.f56734a;
        C20130b bVar = cVar.f56831k;
        if ((bVar.f56429a & 4) != 0) {
            C20524l lVar = cVar.f56826a;
            C19983f fVar = bVar.f56432d;
            if (fVar == null) {
                fVar = C19983f.f56002g;
            }
            lVar.mo25440b(fVar, this.f56734a.f56830j);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        String str;
        C20578be beVar = (C20578be) obj;
        Charset charset = beVar.f57757a;
        if (charset != null) {
            str = new String(beVar.f57758b, charset);
        } else {
            str = new String(beVar.f57758b);
        }
        if (str.startsWith("tel:")) {
            C19953c cVar = (C19953c) C19983f.f56002g.createBuilder();
            cVar.copyOnWrite();
            C19983f fVar = (C19983f) cVar.instance;
            fVar.f56004a |= 1;
            fVar.f56005b = str;
            C20130b bVar = this.f56734a.f56831k;
            if ((bVar.f56429a & 4) != 0) {
                C19983f fVar2 = bVar.f56432d;
                if (((fVar2 == null ? C19983f.f56002g : fVar2).f56004a & 16) != 0) {
                    if (fVar2 == null) {
                        fVar2 = C19983f.f56002g;
                    }
                    String str2 = fVar2.f56008e;
                    cVar.copyOnWrite();
                    C19983f fVar3 = (C19983f) cVar.instance;
                    str2.getClass();
                    fVar3.f56004a |= 16;
                    fVar3.f56008e = str2;
                }
            }
            this.f56734a.f56826a.mo25440b((C19983f) cVar.build(), this.f56734a.f56830j);
            return;
        }
        mo17910gl(new RuntimeException("Expected tel: link, got ".concat(str)));
    }
}
