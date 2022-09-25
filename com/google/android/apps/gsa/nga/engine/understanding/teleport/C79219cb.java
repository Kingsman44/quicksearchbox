package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.ag.c;
import com.google.android.apps.gsa.nga.engine.cortex.CortexWrapper;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79879a;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79881c;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79882d;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79885g;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79890l;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79891m;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79892n;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79893o;
import com.google.android.apps.gsa.nga.engine.understanding.p6231a.p6232a.C78930l;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.cb */
/* compiled from: PG */
public final class C79219cb {

    /* renamed from: a */
    private static final C58974d f217683a = C58974d.m91136j();

    /* renamed from: b */
    private final CortexWrapper f217684b;

    /* renamed from: c */
    private final c f217685c;

    /* renamed from: d */
    private final Optional f217686d;

    /* renamed from: e */
    private final Set f217687e;

    /* renamed from: f */
    private final C91142g f217688f;

    public C79219cb(CortexWrapper cortexWrapper, c cVar, C78930l lVar, C91142g gVar, Set set) {
        this.f217684b = cortexWrapper;
        this.f217685c = cVar;
        Optional ofNullable = Optional.ofNullable(lVar);
        this.f217686d = ofNullable;
        this.f217687e = set;
        this.f217688f = gVar;
        ofNullable.ifPresent(C79218ca.f217682a);
    }

    /* renamed from: c */
    private static Optional m127177c(String str) {
        Optional empty = Optional.empty();
        if (str.startsWith("https://") || str.startsWith("http://")) {
            return Optional.m71637of(Uri.parse(str));
        }
        return empty;
    }

    /* renamed from: d */
    private final void m127178d(C79298f fVar, String str, C79891m mVar, C79326x xVar) {
        xVar.mo73900a(String.format("%s TeleportQueryClassifier Query %s. Score: %f, Threshold: %f.", new Object[]{str, fVar.mo73864j(), Float.valueOf(((C79890l) mVar.f218978b.get(0)).f218972c), Double.valueOf(0.5d)}));
        Collection.EL.stream(this.f217687e).forEach(new C79216bz());
    }

    /* renamed from: a */
    public final boolean mo73843a(C79298f fVar, String str) {
        C79326x a = new C79326x(Optional.m71637of(f217683a)).mo73900a("\nTeleportQueryClassifier");
        Optional c = m127177c(str);
        String str2 = true != c.isPresent() ? str : "com.android.chrome";
        if (!mo73844b(str)) {
            a.mo73900a("ClassifyQuery").mo73900a(fVar.mo73864j());
            CortexWrapper cortexWrapper = this.f217684b;
            C79892n nVar = (C79892n) C79893o.f218982d.createBuilder();
            String j = fVar.mo73864j();
            nVar.copyOnWrite();
            C79893o oVar = (C79893o) nVar.instance;
            j.getClass();
            oVar.f218984a |= 1;
            oVar.f218985b = j;
            nVar.mo74272a(fVar.mo73862h());
            C79893o oVar2 = (C79893o) nVar.build();
            C79882d dVar = (C79882d) C79885g.f218957h.createBuilder();
            dVar.copyOnWrite();
            C79885g gVar = (C79885g) dVar.instance;
            oVar2.getClass();
            gVar.f218960b = oVar2;
            gVar.f218959a |= 1;
            C79879a aVar = (C79879a) C79881c.f218947d.createBuilder();
            aVar.copyOnWrite();
            C79881c cVar = (C79881c) aVar.instance;
            cVar.f218950b = 2;
            cVar.f218949a |= 1;
            dVar.copyOnWrite();
            C79885g gVar2 = (C79885g) dVar.instance;
            C79881c cVar2 = (C79881c) aVar.build();
            cVar2.getClass();
            gVar2.f218963e = cVar2;
            gVar2.f218959a |= 8;
            this.f217685c.d().ifPresent(new C79215by(dVar));
            C79891m a2 = cortexWrapper.a((C79885g) dVar.build());
            if (a2 == null) {
                a.mo73900a("Classifier response is null.");
            } else if (a2.f218978b.isEmpty()) {
                a.mo73900a("Classifier response did not contain a result.");
            } else if (((double) ((C79890l) a2.f218978b.get(0)).f218972c) > 0.5d) {
                m127178d(fVar, "PASSED", a2, a);
                return true;
            } else {
                m127178d(fVar, "REJECTED", a2, a);
            }
            return false;
        }
        a.mo73900a("Run AssistedBrowse model.");
        return ((C78930l) this.f217686d.get()).mo73696b(fVar.mo73864j(), fVar.mo73862h(), str2, c).isPresent();
    }

    /* renamed from: b */
    public final boolean mo73844b(String str) {
        Optional c = m127177c(str);
        if (true == c.isPresent()) {
            str = "com.android.chrome";
        }
        if (!this.f217688f.mo85405j(C90126fx.f251039bL) || !this.f217688f.mo85405j(C90126fx.f251800z) || !this.f217686d.isPresent() || (!((C78930l) this.f217686d.get()).mo73703j(str) && !((C78930l) this.f217686d.get()).mo73704k(c))) {
            return false;
        }
        return true;
    }
}
