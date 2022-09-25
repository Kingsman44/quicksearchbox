package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79890l;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79891m;
import com.google.assistant.p3817aj.p3818a.p3819a.C49190b;
import com.google.assistant.p3817aj.p3818a.p3819a.C49192d;
import com.google.assistant.p3817aj.p3818a.p3819a.C49200l;
import com.google.common.base.C58817ah;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.o */
/* compiled from: PG */
public final /* synthetic */ class C123509o implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C123510p f341307a;

    /* renamed from: b */
    public final /* synthetic */ float f341308b;

    /* renamed from: c */
    public final /* synthetic */ C49192d f341309c;

    /* renamed from: d */
    public final /* synthetic */ String f341310d;

    /* renamed from: e */
    public final /* synthetic */ C58485gu f341311e;

    public /* synthetic */ C123509o(C123510p pVar, float f, C49192d dVar, String str, C58485gu guVar) {
        this.f341307a = pVar;
        this.f341308b = f;
        this.f341309c = dVar;
        this.f341310d = str;
        this.f341311e = guVar;
    }

    public final Object apply(Object obj) {
        Optional optional;
        Optional optional2;
        Optional optional3;
        Object obj2;
        C123510p pVar = this.f341307a;
        float f = this.f341308b;
        C49192d dVar = this.f341309c;
        String str = this.f341310d;
        C58485gu guVar = this.f341311e;
        C79891m mVar = (C79891m) obj;
        if (!mVar.f218979c.isEmpty()) {
            String str2 = mVar.f218979c;
            return Optional.empty();
        } else if (mVar.f218978b.size() != 1) {
            mVar.f218978b.size();
            return Optional.empty();
        } else {
            C79890l lVar = (C79890l) mVar.f218978b.get(0);
            C62940bt r5 = C62942bv.checkIsLite(C49200l.f127215c);
            lVar.mo58887l(r5);
            if (lVar.f169962ag.mo58857o(r5.f169971d)) {
                C62940bt r52 = C62942bv.checkIsLite(C49200l.f127215c);
                lVar.mo58887l(r52);
                Object l = lVar.f169962ag.mo58854l(r52.f169971d);
                if (l == null) {
                    obj2 = r52.f169969b;
                } else {
                    obj2 = r52.mo58889c(l);
                }
                optional = Optional.m71637of(((C49200l) obj2).f127217a);
            } else {
                optional = Optional.empty();
            }
            if (optional.isEmpty()) {
                return Optional.empty();
            }
            if (lVar.f218972c < f) {
                return Optional.empty();
            }
            C58528ij ijVar = C123510p.f341313b;
            C49190b a = C49190b.m85387a(dVar.f127202b);
            if (a == null) {
                a = C49190b.OTHER;
            }
            boolean contains = ijVar.contains(a);
            String str3 = dVar.f127203c;
            String str4 = dVar.f127204d;
            if (contains || !C58837ba.m90859h(str4)) {
                optional2 = Optional.m71637of(new C123308ap(str4));
            } else if (!C58837ba.m90859h(str3)) {
                optional2 = Optional.m71637of(new C123307ao(str3));
            } else {
                optional2 = Optional.empty();
            }
            if (optional2.isEmpty()) {
                C49190b a2 = C49190b.m85387a(dVar.f127202b);
                if (a2 == null) {
                    a2 = C49190b.OTHER;
                }
                a2.name();
                return Optional.empty();
            }
            C58528ij ijVar2 = C123510p.f341313b;
            C49190b a3 = C49190b.m85387a(dVar.f127202b);
            if (a3 == null) {
                a3 = C49190b.OTHER;
            }
            boolean contains2 = ijVar2.contains(a3);
            String str5 = dVar.f127203c;
            String str6 = dVar.f127204d;
            if (contains2 || !C58837ba.m90859h(str6)) {
                optional3 = Optional.m71637of(pVar.f341315d.mo105912b(str6, str, guVar));
            } else if (!C58837ba.m90859h(str5)) {
                optional3 = Optional.m71637of(pVar.f341315d.mo105912b(str5, str, guVar));
            } else {
                optional3 = Optional.empty();
            }
            if (optional3.isEmpty()) {
                C49190b a4 = C49190b.m85387a(dVar.f127202b);
                if (a4 == null) {
                    a4 = C49190b.OTHER;
                }
                a4.name();
                return Optional.empty();
            }
            String str7 = (String) optional3.get();
            if (str7 != null) {
                C123506l lVar2 = (C123506l) optional2.get();
                if (lVar2 != null) {
                    return Optional.m71637of(new C123306an(str7, lVar2));
                }
                throw new NullPointerException("Null target");
            }
            throw new NullPointerException("Null query");
        }
    }
}
