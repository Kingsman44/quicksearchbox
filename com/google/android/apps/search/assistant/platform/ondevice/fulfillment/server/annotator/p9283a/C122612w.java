package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61758t;
import com.google.protos.p4850an.C63624h;
import com.google.protos.p4850an.p4851a.p4852a.C63318b;
import com.google.protos.p4883as.p4884a.C63772a;
import com.google.protos.p4883as.p4884a.C63775d;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.a.w */
/* compiled from: PG */
public final /* synthetic */ class C122612w implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C122612w f339783a = new C122612w();

    private /* synthetic */ C122612w() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C61758t tVar;
        C63624h hVar;
        C63318b bVar = (C63318b) obj;
        if (bVar.f171129c.equals(C122605p.m202015b(C80080z.APP))) {
            float f = bVar.f171132f;
            C61748j jVar = bVar.f171128b;
            if (jVar == null) {
                jVar = C61748j.f166800d;
            }
            if (jVar.f166802a == 15) {
                hVar = (C63624h) jVar.f166803b;
            } else {
                hVar = C63624h.f172070b;
            }
            return (C58485gu) Collection.EL.stream(hVar.f172072a).map(new C122606q(f)).collect(C58370cn.f155946a);
        }
        C61748j jVar2 = bVar.f171128b;
        if (jVar2 == null) {
            jVar2 = C61748j.f166800d;
        }
        if (jVar2.f166802a == 3) {
            tVar = (C61758t) jVar2.f166803b;
        } else {
            tVar = C61758t.f166824c;
        }
        String str = tVar.f166826a == 1 ? (String) tVar.f166827b : BuildConfig.FLAVOR;
        float f2 = bVar.f171132f;
        if (str.isEmpty()) {
            return C58485gu.m89845m();
        }
        C63772a aVar = (C63772a) C63775d.f172518h.createBuilder();
        aVar.copyOnWrite();
        C63775d dVar = (C63775d) aVar.instance;
        str.getClass();
        dVar.f172520a |= 64;
        dVar.f172526g = str;
        return C58485gu.m89846n(C122585ae.m201997a((C63775d) aVar.build(), f2, true));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
