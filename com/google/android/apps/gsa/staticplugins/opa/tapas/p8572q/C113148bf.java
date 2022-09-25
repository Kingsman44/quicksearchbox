package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import com.google.assistant.p3781ad.p3789d.C48575ai;
import com.google.assistant.p3781ad.p3789d.C48576aj;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.assistant.p3781ad.p3789d.C48755m;
import com.google.assistant.p3781ad.p3789d.C48763u;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.bf */
/* compiled from: PG */
public final class C113148bf {
    /* renamed from: a */
    public static C58495hd m187154a(C48578al alVar) {
        return (C58495hd) m187161h(alVar).findFirst().map(C113139ax.f313454a).orElse(C58729pv.f156485a);
    }

    /* renamed from: b */
    public static Optional m187155b(C48578al alVar) {
        if (alVar.f125509c.size() == 0) {
            return Optional.empty();
        }
        Optional e = m187158e((C48576aj) alVar.f125509c.get(0));
        if (e.isPresent()) {
            C48763u uVar = (C48763u) e.get();
            if ((uVar.f126174a & 512) != 0) {
                C48755m mVar = uVar.f126178e;
                if (mVar == null) {
                    mVar = C48755m.f126152c;
                }
                return Optional.m71637of(mVar);
            }
        }
        return Optional.empty();
    }

    /* renamed from: c */
    public static Optional m187156c(C48578al alVar) {
        return Collection.EL.stream(alVar.f125509c).filter(C113133ar.f313448a).findFirst().map(C113138aw.f313453a);
    }

    /* renamed from: d */
    public static Optional m187157d(C48578al alVar) {
        return m187161h(alVar).filter(C113144bb.f313461a).map(C113145bc.f313462a).findFirst();
    }

    /* renamed from: e */
    public static Optional m187158e(C48576aj ajVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C48763u.f126172j);
        ajVar.mo58887l(r0);
        if (!ajVar.f169962ag.mo58857o(r0.f169971d)) {
            return Optional.empty();
        }
        C62940bt r02 = C62942bv.checkIsLite(C48763u.f126172j);
        ajVar.mo58887l(r02);
        Object l = ajVar.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        return Optional.m71637of((C48763u) obj);
    }

    /* renamed from: f */
    public static Optional m187159f(C48578al alVar) {
        return Collection.EL.stream(alVar.f125509c).map(C113146bd.f313463a).max(Comparator.CC.naturalOrder());
    }

    /* renamed from: g */
    public static Optional m187160g(C48578al alVar) {
        return m187161h(alVar).filter(C113140ay.f313455a).map(C113141az.f313456a).findFirst();
    }

    /* renamed from: h */
    public static Stream m187161h(C48578al alVar) {
        return Collection.EL.stream(alVar.f125509c).map(C113135at.f313450a).filter(C113136au.f313451a).map(C113137av.f313452a);
    }

    /* renamed from: i */
    public static boolean m187162i(C48578al alVar) {
        Stream map = Collection.EL.stream(alVar.f125509c).map(C113147be.f313464a);
        C48575ai aiVar = C48575ai.PRIVATE;
        Objects.requireNonNull(aiVar);
        return map.anyMatch(new C113134as(aiVar));
    }
}
