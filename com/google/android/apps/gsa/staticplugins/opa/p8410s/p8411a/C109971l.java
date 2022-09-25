package com.google.android.apps.gsa.staticplugins.opa.p8410s.p8411a;

import android.content.pm.PackageManager;
import com.google.p395al.p398b.p399a.p402b.p403a.p404a.C8429b;
import com.google.p395al.p398b.p399a.p402b.p403a.p404a.C8431d;
import com.google.p4283bv.p4380j.p4381a.p4382a.p4383a.C57673a;
import com.google.p4283bv.p4380j.p4381a.p4382a.p4383a.C57674b;
import com.google.p4283bv.p4380j.p4381a.p4382a.p4383a.C57676d;
import com.google.p4283bv.p4380j.p4381a.p4382a.p4384b.C57678b;
import com.google.p4283bv.p4380j.p4381a.p4382a.p4384b.C57680d;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4917a.p4918a.C64165f;
import p5488io.p5490b.p5496d.C69819a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.s.a.l */
/* compiled from: PG */
public final /* synthetic */ class C109971l implements C69819a {

    /* renamed from: a */
    public final /* synthetic */ C109972m f306423a;

    /* renamed from: b */
    public final /* synthetic */ C64165f f306424b;

    public /* synthetic */ C109971l(C109972m mVar, C64165f fVar) {
        this.f306423a = mVar;
        this.f306424b = fVar;
    }

    /* renamed from: a */
    public final void mo25795a() {
        C109972m mVar = this.f306423a;
        C64165f fVar = this.f306424b;
        C57673a aVar = (C57673a) C57674b.f154054b.createBuilder();
        C57674b bVar = fVar.f173485b;
        if (bVar == null) {
            bVar = C57674b.f154054b;
        }
        for (C57676d dVar : bVar.f154056a) {
            try {
                C57680d dVar2 = dVar.f154060a;
                if (dVar2 == null) {
                    dVar2 = C57680d.f154068b;
                }
                C8431d dVar3 = ((C57678b) dVar2.f154070a.get(0)).f154065a;
                if (dVar3 == null) {
                    dVar3 = C8431d.f29316b;
                }
                C8429b bVar2 = dVar3.f29318a;
                if (bVar2 == null) {
                    bVar2 = C8429b.f29312c;
                }
                if ((bVar2.f29314a & 1) != 0) {
                    PackageManager packageManager = mVar.f306425a;
                    C57680d dVar4 = dVar.f154060a;
                    if (dVar4 == null) {
                        dVar4 = C57680d.f154068b;
                    }
                    C8431d dVar5 = ((C57678b) dVar4.f154070a.get(0)).f154065a;
                    if (dVar5 == null) {
                        dVar5 = C8431d.f29316b;
                    }
                    C8429b bVar3 = dVar5.f29318a;
                    if (bVar3 == null) {
                        bVar3 = C8429b.f29312c;
                    }
                    packageManager.getApplicationInfo(bVar3.f29315b, 0);
                }
                aVar.mo54523a(dVar);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        mVar.f306426b.mo26140c(fVar.f173486c, ((C57674b) aVar.build()).toByteArray());
    }
}
