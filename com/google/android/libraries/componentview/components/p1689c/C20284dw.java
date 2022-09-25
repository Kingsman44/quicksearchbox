package com.google.android.libraries.componentview.components.p1689c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.components.base.C20028ay;
import com.google.android.libraries.componentview.components.base.p1687a.C19953c;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20144bn;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20145bo;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20614e;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60845bz;
import com.google.p395al.p398b.p399a.p400a.p401a.C8417b;
import com.google.p395al.p398b.p399a.p402b.p403a.p407d.C8441b;
import com.google.p395al.p417d.p418a.C8577d;
import com.google.p4017at.p4060h.p4061a.p4062a.C54144d;
import com.google.p4017at.p4060h.p4061a.p4062a.p4064b.C54132d;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.componentview.components.c.dw */
/* compiled from: PG */
final class C20284dw implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C20285dx f56939a;

    /* renamed from: b */
    final /* synthetic */ int f56940b;

    public C20284dw(C20285dx dxVar, int i) {
        this.f56939a = dxVar;
        this.f56940b = i;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException)) {
            C20614e eVar = new C20614e();
            eVar.f57822b = "Fetch failed.";
            eVar.f57821a = th;
            eVar.mo25535e(C19742a.NETWORK_ERROR);
            C20520h.m38498c("TranslateWidgetComponent", eVar.mo25531a(), this.f56939a.f56308s, new Object[0]);
            C20285dx dxVar = this.f56939a;
            dxVar.f56968k = BuildConfig.FLAVOR;
            dxVar.f56960c.mo25242n(dxVar.f56967j);
            this.f56939a.f56960c.mo25243o(-16777216);
            this.f56939a.f56961d.mo25242n(BuildConfig.FLAVOR);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C19983f fVar;
        C54132d dVar = (C54132d) obj;
        C8417b bVar = dVar.f142053b;
        if (bVar == null) {
            bVar = C8417b.f29273g;
        }
        if ((dVar.f142052a & 1) == 0 || bVar.f29275a.isEmpty()) {
            C20614e eVar = new C20614e();
            eVar.f57822b = "Empty fetch shortened Url response.";
            eVar.mo25535e(C19742a.NETWORK_ERROR);
            C20520h.m38498c("TranslateWidgetComponent", eVar.mo25531a(), this.f56939a.f56308s, new Object[0]);
            return;
        }
        if (bVar.f29278d) {
            C20285dx dxVar = this.f56939a;
            if (dxVar.f56970m.f56490b.equals(dxVar.f56958a.f56490b)) {
                C20285dx dxVar2 = this.f56939a;
                C20144bn bnVar = (C20144bn) C20145bo.f56487d.createBuilder();
                String str = bVar.f29279e;
                bnVar.copyOnWrite();
                C20145bo boVar = (C20145bo) bnVar.instance;
                str.getClass();
                boVar.f56489a |= 1;
                boVar.f56490b = str;
                String str2 = bVar.f29277c;
                bnVar.copyOnWrite();
                C20145bo boVar2 = (C20145bo) bnVar.instance;
                str2.getClass();
                boVar2.f56489a |= 2;
                boVar2.f56491c = str2;
                dxVar2.mo25326m((C20145bo) bnVar.build());
            } else {
                return;
            }
        } else if (this.f56939a.f56970m.f56490b.equals(bVar.f29279e)) {
            this.f56939a.mo25326m((C20145bo) null);
        } else {
            return;
        }
        C20285dx dxVar3 = this.f56939a;
        dxVar3.f56968k = bVar.f29275a;
        dxVar3.f56960c.mo25242n(dxVar3.f56968k);
        this.f56939a.f56960c.mo25243o(-16777216);
        this.f56939a.f56961d.mo25242n(bVar.f29276b);
        C20028ay ayVar = this.f56939a.f56964g;
        if (!(ayVar == null || (fVar = ayVar.f56143d) == null)) {
            C19953c cVar = (C19953c) fVar.toBuilder();
            C20028ay ayVar2 = this.f56939a.f56964g;
            C8441b bVar2 = bVar.f29280f;
            if (bVar2 == null) {
                bVar2 = C8441b.f29337b;
            }
            String str3 = bVar2.f29339a;
            cVar.copyOnWrite();
            C19983f fVar2 = (C19983f) cVar.instance;
            str3.getClass();
            fVar2.f56004a |= 1;
            fVar2.f56005b = str3;
            ayVar2.f56143d = (C19983f) cVar.build();
        }
        C54144d dVar2 = dVar.f142054c;
        if (dVar2 == null) {
            dVar2 = C54144d.f142090b;
        }
        C8577d dVar3 = dVar2.f142092a;
        if (dVar3 == null) {
            dVar3 = C8577d.f29698b;
        }
        this.f56939a.f56308s.mo25489d((String) null, (String) null, dVar3.f29700a, C58495hd.m89900n("sqi", String.valueOf(this.f56940b - 1)));
    }
}
