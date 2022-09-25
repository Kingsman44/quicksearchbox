package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import android.content.Context;
import com.google.android.libraries.search.p3055n.C39272av;
import com.google.android.libraries.search.p3055n.C39276az;
import com.google.android.libraries.search.p3055n.C39373bv;
import com.google.android.libraries.search.p3055n.C39374bw;
import com.google.android.libraries.search.p3055n.C39666ct;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.C66964g;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.n.b.b.g */
/* compiled from: PG */
public final /* synthetic */ class C39332g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C39280aa f103595a;

    /* renamed from: b */
    public final /* synthetic */ C39666ct f103596b;

    /* renamed from: c */
    public final /* synthetic */ Context f103597c;

    /* renamed from: d */
    public final /* synthetic */ boolean f103598d;

    public /* synthetic */ C39332g(C39280aa aaVar, C39666ct ctVar, Context context, boolean z) {
        this.f103595a = aaVar;
        this.f103596b = ctVar;
        this.f103597c = context;
        this.f103598d = z;
    }

    public final Object apply(Object obj) {
        boolean z;
        Object obj2;
        C39280aa aaVar = this.f103595a;
        C39666ct ctVar = this.f103596b;
        Context context = this.f103597c;
        boolean z2 = this.f103598d;
        Optional optional = (Optional) obj;
        if (aaVar.f103476g == null) {
            C39373bv bvVar = (C39373bv) C39374bw.f103686d.createBuilder();
            C39276az azVar = ctVar.f104421d;
            if (azVar == null) {
                azVar = C39276az.f103456b;
            }
            bvVar.copyOnWrite();
            C39374bw bwVar = (C39374bw) bvVar.instance;
            azVar.getClass();
            bwVar.f103690b = azVar;
            bwVar.f103689a |= 1;
            C66964g gVar = C66964g.DEFAULT_ONESHOT;
            bvVar.copyOnWrite();
            C39374bw bwVar2 = (C39374bw) bvVar.instance;
            bwVar2.f103691c = gVar.f182026k;
            bwVar2.f103689a |= 2;
            if (C39280aa.m68696b((C39374bw) bvVar.build(), optional).f104369b) {
                aaVar.f103477h = Optional.empty();
                C39276az azVar2 = ctVar.f104421d;
                if (azVar2 == null) {
                    azVar2 = C39276az.f103456b;
                }
                Duration duration = aaVar.f103484o;
                C66964g gVar2 = C66964g.DEFAULT_ONESHOT;
                C62940bt r0 = C62942bv.checkIsLite(C39272av.f103448d);
                ctVar.mo58887l(r0);
                if (ctVar.f169962ag.mo58857o(r0.f169971d)) {
                    C62940bt r02 = C62942bv.checkIsLite(C39272av.f103448d);
                    ctVar.mo58887l(r02);
                    Object l = ctVar.f169962ag.mo58854l(r02.f169971d);
                    if (l == null) {
                        obj2 = r02.f169969b;
                    } else {
                        obj2 = r02.mo58889c(l);
                    }
                    if (((C39272av) obj2).f103450a) {
                        z = true;
                        aaVar.mo41761i(context, aaVar.mo41756a(context, azVar2, optional, false, z2, duration, gVar2, z), C39333h.f103599a);
                    }
                }
                z = false;
                aaVar.mo41761i(context, aaVar.mo41756a(context, azVar2, optional, false, z2, duration, gVar2, z), C39333h.f103599a);
            } else {
                ((C59052c) ((C59052c) C39280aa.f103467a.mo56226d()).mo56372aa(53436)).mo56386p("#backgroundUpdate compatibility check failed.");
                throw new IllegalStateException("#backgroundUpdate compatibility check failed.");
            }
        } else {
            ((C59052c) ((C59052c) C39280aa.f103467a.mo56224b()).mo56372aa(53435)).mo56386p("#backgroundUpdate using the existing ASR soda instance.");
        }
        aaVar.mo41765m(ctVar);
        return null;
    }
}
