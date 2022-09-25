package com.google.android.libraries.lens.view.p2087ay;

import android.os.Trace;
import com.google.android.libraries.lens.view.gleam.C26504ci;
import com.google.android.libraries.lens.view.gleam.C26515ct;
import com.google.android.libraries.lens.view.gleam.C26516cu;
import com.google.android.libraries.lens.view.gleam.C26525dc;
import com.google.android.libraries.lens.view.gleam.C26526dd;
import com.google.android.libraries.lens.view.p2069am.C25310ar;
import com.google.android.libraries.lens.view.p2069am.C25311as;
import com.google.android.libraries.lens.view.p2069am.C25312at;
import com.google.android.libraries.lens.view.p2078at.C25497ac;
import com.google.android.libraries.lens.view.p2173u.C28097c;
import com.google.android.libraries.lens.view.vision.C28179u;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.lens.view.ay.as */
/* compiled from: PG */
public final /* synthetic */ class C25636as implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C28097c f69735a;

    /* renamed from: b */
    public final /* synthetic */ C25663x f69736b;

    public /* synthetic */ C25636as(C25663x xVar, C28097c cVar) {
        this.f69736b = xVar;
        this.f69735a = cVar;
    }

    public final void run() {
        C25312at atVar;
        C25663x xVar = this.f69736b;
        C28097c cVar = this.f69735a;
        int i = C25637at.f69737g;
        C58974d dVar = C25664y.f69785a;
        C25646g gVar = xVar.f69784a.f69796l;
        if (gVar.f69765b.mo56113h()) {
            C25648i iVar = (C25648i) gVar.f69765b.mo56107c();
            if (cVar.mo33558a().f76482f && cVar.f76491i.mo56113h()) {
                long millis = TimeUnit.MICROSECONDS.toMillis(cVar.f76484b);
                C25654o oVar = (C25654o) iVar.f69766a.get();
                if (oVar == null) {
                    iVar.f69766a.clear();
                } else {
                    if (((Float) cVar.f76491i.mo56107c()).floatValue() > 10.0f) {
                        C25619ab abVar = iVar.f69767b;
                        abVar.f69694a.addLast(Long.valueOf(millis));
                    }
                    iVar.f69767b.mo30731a(Long.valueOf(millis - 500));
                    if (iVar.f69767b.f69694a.size() >= 10) {
                        oVar.mo30766a();
                    }
                }
            }
        }
        C25664y yVar = xVar.f69784a;
        C58495hd hdVar = cVar.f76493k;
        hdVar.getClass();
        C58528ij ijVar = cVar.f76494l;
        ijVar.getClass();
        yVar.f69787c = cVar.f76484b;
        Trace.beginSection("GM:updateTrackedObjects");
        C58485gu f = yVar.mo30772f();
        int size = f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C26504ci ciVar = (C26504ci) f.get(i2);
            if (ciVar.f72213g) {
                Integer valueOf = Integer.valueOf(ciVar.f72214h.mo33664h());
                if (ijVar.contains(valueOf)) {
                    yVar.mo30776j(ciVar);
                } else {
                    if (hdVar.containsKey(valueOf)) {
                        C28179u uVar = (C28179u) hdVar.get(valueOf);
                        uVar.getClass();
                        ciVar.mo31762f(uVar);
                    }
                    C28179u uVar2 = ciVar.f72215i;
                    if (uVar2.mo33697E()) {
                        C58485gu u = uVar2.mo33679u();
                        if (uVar2.mo33662f() <= 0.0f || uVar2.mo33662f() >= ((float) ciVar.f72218l.getWidth()) || uVar2.mo33663g() <= 0.0f || uVar2.mo33663g() >= ((float) ciVar.f72218l.getHeight())) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= u.size()) {
                                    break;
                                }
                                if (((Float) u.get(i3)).floatValue() > 0.0f && ((Float) u.get(i3)).floatValue() < 1.0f) {
                                    int i4 = i3 + 1;
                                    if (((Float) u.get(i4)).floatValue() > 0.0f && ((Float) u.get(i4)).floatValue() < 1.0f) {
                                        break;
                                    }
                                }
                                i3 += 2;
                            }
                        }
                    } else {
                        float d = uVar2.mo33659d() / 2.0f;
                        float e = uVar2.mo33660e() / 2.0f;
                        if (uVar2.mo33662f() + d >= 0.0f && uVar2.mo33663g() + e >= 0.0f && uVar2.mo33662f() - d <= ((float) ciVar.f72218l.getWidth()) && uVar2.mo33663g() - e <= ((float) ciVar.f72218l.getHeight())) {
                        }
                    }
                    ciVar.f72214h.mo33664h();
                    yVar.mo30776j(ciVar);
                }
            }
        }
        boolean g = yVar.f69798n.mo30747g(yVar.mo30772f(), yVar.f69787c);
        if (yVar.f69800p) {
            C25311as asVar = (C25311as) C25312at.f68870c.createBuilder();
            C25310ar b = yVar.mo30768b(cVar.f76484b);
            asVar.copyOnWrite();
            b.getClass();
            ((C25312at) asVar.instance).f68872a = b;
            atVar = (C25312at) asVar.build();
        } else {
            atVar = C25312at.f68870c;
        }
        cVar.f76498p = atVar;
        for (C26525dc dcVar : yVar.f69789e) {
            long j = yVar.f69802r;
            C26526dd ddVar = dcVar.f72275a;
            if (!((C25497ac) ddVar.f72311u.mo3842a()).mo30525b()) {
                Trace.beginSection("GleamController:onTrackedObjectsUpdated");
                C25310ar arVar = cVar.mo33559b().f68872a;
                if (arVar == null) {
                    arVar = C25310ar.f68865c;
                }
                C25312at n = ddVar.mo31795n(arVar);
                cVar.f76498p = n;
                ddVar.f72292b.execute(C47810es.m84977q(new C26516cu(ddVar, n, cVar)));
                ddVar.f72293c.execute(C47810es.m84977q(new C26515ct(ddVar, j, g)));
                Trace.endSection();
            }
        }
        Trace.endSection();
    }
}
