package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9840i.p9841a;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.i.a.e */
/* compiled from: PG */
public final /* synthetic */ class C129698e implements C69819a {

    /* renamed from: a */
    public final /* synthetic */ C129699f f355922a;

    /* renamed from: b */
    public final /* synthetic */ C64165f f355923b;

    public /* synthetic */ C129698e(C129699f fVar, C64165f fVar2) {
        this.f355922a = fVar;
        this.f355923b = fVar2;
    }

    /* renamed from: a */
    public final void mo25795a() {
        C129699f fVar = this.f355922a;
        C64165f fVar2 = this.f355923b;
        C57673a aVar = (C57673a) C57674b.f154054b.createBuilder();
        C57674b bVar = fVar2.f173485b;
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
                    PackageManager packageManager = fVar.f355924a;
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
        fVar.f355925b.mo26140c(fVar2.f173486c, ((C57674b) aVar.build()).toByteArray());
    }
}
