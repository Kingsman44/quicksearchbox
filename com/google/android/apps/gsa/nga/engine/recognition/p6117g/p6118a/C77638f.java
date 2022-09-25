package com.google.android.apps.gsa.nga.engine.recognition.p6117g.p6118a;

import android.util.Base64;
import com.google.android.apps.gsa.nga.engine.recognition.C77548aa;
import com.google.android.apps.gsa.nga.engine.recognition.C77892x;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80557b;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80558c;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80559d;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80561f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.common.base.C58889cz;
import com.google.common.p4520a.C58206am;
import com.google.common.p4520a.C58247c;
import com.google.common.p4520a.C58254i;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.g.a.f */
/* compiled from: PG */
public final class C77638f implements C77892x, C90991b {

    /* renamed from: a */
    private static final C58974d f213856a = C58974d.m91136j();

    /* renamed from: b */
    private final C58247c f213857b;

    public C77638f(C58889cz czVar) {
        C58254i iVar = new C58254i();
        iVar.mo54823g(10);
        iVar.mo54824h(czVar);
        iVar.mo54821e(24, TimeUnit.HOURS);
        this.f213857b = iVar.mo54817a();
    }

    /* renamed from: b */
    private final void m124597b(C80561f fVar, Function function) {
        try {
            Objects.requireNonNull(function);
            DesugarAtomicReference.updateAndGet((AtomicReference) this.f213857b.mo54712b(fVar, new C77635c(fVar)), new C77636d(function));
        } catch (ExecutionException e) {
            ((C58970a) ((C58970a) ((C58970a) f213856a.mo56226d()).mo56382g(e)).mo56372aa(4337)).mo56386p("Failed updating audio report cache");
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo72712a(C77548aa aaVar) {
    }

    /* renamed from: g */
    public final void mo72713g(C80561f fVar, C37514du duVar) {
        m124597b(fVar, new C77634b(duVar));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        if (!fVar.mo85296v()) {
            fVar.mo85291r("APA Speech");
            C80558c cVar = (C80558c) C80559d.f221121b.createBuilder();
            for (AtomicReference atomicReference : ((C58206am) this.f213857b).f155647a.values()) {
                C80557b bVar = (C80557b) atomicReference.get();
                cVar.copyOnWrite();
                C80559d dVar = (C80559d) cVar.instance;
                bVar.getClass();
                C62971cq cqVar = dVar.f221123a;
                if (!cqVar.mo58948c()) {
                    dVar.f221123a = C62942bv.mutableCopy(cqVar);
                }
                dVar.f221123a.add(bVar);
            }
            fVar.mo85293t("audio_reports(%s)", C90752i.m148229c(Base64.encodeToString(cVar.build().toByteArray(), 2)));
        }
    }

    /* renamed from: h */
    public final /* synthetic */ void mo72715h(Optional optional) {
    }

    /* renamed from: i */
    public final void mo72716i(C80561f fVar, C37561eb ebVar) {
        m124597b(fVar, new C77633a(ebVar));
    }

    /* renamed from: j */
    public final void mo72717j(C80561f fVar, int i) {
        m124597b(fVar, new C77637e(i));
    }

    /* renamed from: k */
    public final /* synthetic */ void mo72718k(C77548aa aaVar) {
    }

    /* renamed from: l */
    public final /* synthetic */ void mo72719l(C77548aa aaVar) {
    }
}
