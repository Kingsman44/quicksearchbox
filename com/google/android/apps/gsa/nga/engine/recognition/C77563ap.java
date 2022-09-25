package com.google.android.apps.gsa.nga.engine.recognition;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82958gt;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82960gv;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82961gw;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.ap */
/* compiled from: PG */
public abstract class C77563ap {
    /* renamed from: e */
    public static C77561an m124450e() {
        C77875o oVar = new C77875o();
        oVar.mo72666d(false);
        oVar.mo72665c(C58485gu.m89845m());
        return oVar;
    }

    /* renamed from: a */
    public abstract C58485gu mo72668a();

    /* renamed from: b */
    public abstract Optional mo72669b();

    /* renamed from: c */
    public abstract Optional mo72670c();

    /* renamed from: d */
    public abstract boolean mo72671d();

    /* renamed from: f */
    public final C82961gw mo72672f() {
        if (!mo72671d() && mo72668a().isEmpty() && mo72669b().isEmpty()) {
            return C82961gw.f226336e;
        }
        C82958gt gtVar = (C82958gt) C82961gw.f226336e.createBuilder();
        boolean d = mo72671d();
        gtVar.copyOnWrite();
        C82961gw gwVar = (C82961gw) gtVar.instance;
        gwVar.f226338a |= 8;
        gwVar.f226341d = d;
        Iterable<C82960gv> iterable = (Iterable) Collection.EL.stream(mo72668a()).map(C77558ak.f213699a).collect(C58370cn.f155946a);
        gtVar.copyOnWrite();
        C82961gw gwVar2 = (C82961gw) gtVar.instance;
        C62961ch chVar = gwVar2.f226339b;
        if (!chVar.mo58948c()) {
            gwVar2.f226339b = C62942bv.mutableCopy(chVar);
        }
        for (C82960gv gvVar : iterable) {
            gwVar2.f226339b.mo58916g(gvVar.f226335f);
        }
        Optional map = mo72669b().map(C77559al.f213700a);
        Objects.requireNonNull(gtVar);
        map.ifPresent(new C77560am(gtVar));
        return (C82961gw) gtVar.build();
    }
}
