package com.google.android.apps.gsa.staticplugins.save.p8694a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6662co.C85167c;
import com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116424c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60870cx;
import com.google.p381aj.p382a.p383a.p384a.C8213ab;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57567ak;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57590bg;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57642de;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57643df;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57658s;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57659t;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57660u;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57661v;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57662w;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57663x;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57665z;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p5146w.p5147a.p5148a.C65928f;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;
import com.google.protos.p5146w.p5147a.p5148a.C65937o;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.a.z */
/* compiled from: PG */
public final class C116420z {

    /* renamed from: a */
    public final C85167c f322810a;

    /* renamed from: b */
    public final C22871g f322811b;

    /* renamed from: c */
    public final C68214a f322812c;

    /* renamed from: d */
    private final C68214a f322813d;

    public C116420z(C85167c cVar, C22871g gVar, C68214a aVar, C68214a aVar2) {
        this.f322810a = cVar;
        this.f322811b = gVar;
        this.f322812c = aVar;
        this.f322813d = aVar2;
    }

    /* renamed from: h */
    public static C57663x m193089h(C57590bg bgVar) {
        C57662w wVar = (C57662w) C57663x.f153984d.createBuilder();
        C57665z zVar = C57665z.PLACE;
        wVar.copyOnWrite();
        ((C57663x) wVar.instance).f153988c = zVar.getNumber();
        C8242v vVar = bgVar.f153859a;
        if (vVar != null) {
            wVar.copyOnWrite();
            C57663x xVar = (C57663x) wVar.instance;
            xVar.f153987b = vVar;
            xVar.f153986a = 2;
        } else {
            C8213ab abVar = bgVar.f153860b;
            if (abVar == null) {
                abVar = C8213ab.f28837d;
            }
            wVar.copyOnWrite();
            C57663x xVar2 = (C57663x) wVar.instance;
            abVar.getClass();
            xVar2.f153987b = abVar;
            xVar2.f153986a = 3;
        }
        return (C57663x) wVar.build();
    }

    /* renamed from: j */
    public static String m193090j(String str) {
        return str.replaceAll(":$", BuildConfig.FLAVOR);
    }

    /* renamed from: a */
    public final C60870cx mo102683a(String str) {
        return this.f322811b.mo28205e(this.f322810a.mo78748c(str, mo102690i()), "Log list creation failure", Exception.class, new C116416v(this));
    }

    /* renamed from: b */
    public final C60870cx mo102684b(C57663x xVar) {
        return this.f322811b.mo28210j(this.f322810a.mo78750e(xVar, mo102690i()), "transformToUnsaveResponse", C116400f.f322778a);
    }

    /* renamed from: c */
    public final C60870cx mo102685c(C116424c cVar, C57663x xVar) {
        return this.f322811b.mo28205e(this.f322810a.mo78751f(C116371ab.m193011b(cVar), new C58759qy(xVar), mo102690i()), "Log removal failure during move", Exception.class, new C116404j(this));
    }

    /* renamed from: d */
    public final C60870cx mo102686d(C57569am amVar, C57566aj ajVar, C58833ax axVar) {
        return this.f322810a.mo78746a(ajVar, amVar, axVar, mo102690i());
    }

    /* renamed from: e */
    public final C60870cx mo102687e(C57569am amVar, C116424c cVar, boolean z, C58833ax axVar) {
        if (z) {
            return this.f322811b.mo28210j(mo102683a(cVar.f322820d), "Add item after list creation", new C116413s(this, amVar, axVar));
        }
        return this.f322811b.mo28209i(mo102686d(amVar, C116371ab.m193011b(cVar), axVar), "Transform response", C116414t.f322802a);
    }

    /* renamed from: f */
    public final C60870cx mo102688f(String str, C58833ax axVar, C116424c cVar, boolean z) {
        C57567ak akVar = (C57567ak) C57569am.f153797f.createBuilder();
        C57642de deVar = (C57642de) C57643df.f153945e.createBuilder();
        deVar.copyOnWrite();
        str.getClass();
        ((C57643df) deVar.instance).f153947a = str;
        akVar.copyOnWrite();
        C57569am amVar = (C57569am) akVar.instance;
        C57643df dfVar = (C57643df) deVar.build();
        dfVar.getClass();
        amVar.f153800b = dfVar;
        amVar.f153799a = 9;
        if (axVar.mo56113h()) {
            String str2 = (String) axVar.mo56107c();
            akVar.copyOnWrite();
            str2.getClass();
            ((C57569am) akVar.instance).f153802d = str2;
        }
        return mo102687e((C57569am) akVar.build(), cVar, z, C58836b.f156633a);
    }

    /* renamed from: g */
    public final C60870cx mo102689g(C57590bg bgVar, String str, C116424c cVar, boolean z) {
        C57567ak akVar = (C57567ak) C57569am.f153797f.createBuilder();
        akVar.copyOnWrite();
        C57569am amVar = (C57569am) akVar.instance;
        bgVar.getClass();
        amVar.f153800b = bgVar;
        amVar.f153799a = 2;
        akVar.copyOnWrite();
        str.getClass();
        ((C57569am) akVar.instance).f153802d = str;
        return mo102687e((C57569am) akVar.build(), cVar, z, C58836b.f156633a);
    }

    /* renamed from: i */
    public final String mo102690i() {
        String F = ((C86054o) this.f322813d.mo27525b()).mo79659F();
        if (F != null) {
            return F;
        }
        throw new IllegalStateException("User not signed in");
    }

    /* renamed from: k */
    public final C60870cx mo102691k(C65930h hVar, C116424c cVar, boolean z) {
        Object obj;
        C57567ak akVar = (C57567ak) C57569am.f153797f.createBuilder();
        C57660u uVar = (C57660u) C57661v.f153979d.createBuilder();
        C65928f fVar = hVar.f179305d;
        if (fVar == null) {
            fVar = C65928f.f179293f;
        }
        String str = fVar.f179296b;
        uVar.copyOnWrite();
        str.getClass();
        ((C57661v) uVar.instance).f153981a = str;
        C65928f fVar2 = hVar.f179305d;
        if (fVar2 == null) {
            fVar2 = C65928f.f179293f;
        }
        int i = fVar2.f179298d;
        uVar.copyOnWrite();
        ((C57661v) uVar.instance).f153982b = i;
        C65928f fVar3 = hVar.f179305d;
        if (fVar3 == null) {
            fVar3 = C65928f.f179293f;
        }
        int i2 = fVar3.f179297c;
        uVar.copyOnWrite();
        ((C57661v) uVar.instance).f153983c = i2;
        akVar.copyOnWrite();
        C57661v vVar = (C57661v) uVar.build();
        vVar.getClass();
        ((C57569am) akVar.instance).f153803e = vVar;
        C57658s sVar = (C57658s) C57659t.f153975c.createBuilder();
        String j = m193090j(hVar.f179303b);
        sVar.copyOnWrite();
        j.getClass();
        ((C57659t) sVar.instance).f153978b = j;
        C62940bt r2 = C62942bv.checkIsLite(C65937o.f179333l);
        hVar.mo58887l(r2);
        if (hVar.f169962ag.mo58857o(r2.f169971d)) {
            C62940bt r22 = C62942bv.checkIsLite(C65937o.f179333l);
            hVar.mo58887l(r22);
            Object l = hVar.f169962ag.mo58854l(r22.f169971d);
            if (l == null) {
                obj = r22.f169969b;
            } else {
                obj = r22.mo58889c(l);
            }
            C65937o oVar = (C65937o) obj;
            C57642de deVar = (C57642de) C57643df.f153945e.createBuilder();
            String str2 = oVar.f179337c;
            deVar.copyOnWrite();
            str2.getClass();
            ((C57643df) deVar.instance).f153948b = str2;
            String str3 = oVar.f179338d;
            deVar.copyOnWrite();
            str3.getClass();
            ((C57643df) deVar.instance).f153947a = str3;
            String str4 = oVar.f179343i;
            deVar.copyOnWrite();
            str4.getClass();
            ((C57643df) deVar.instance).f153949c = str4;
            sVar.copyOnWrite();
            C57643df dfVar = (C57643df) deVar.build();
            dfVar.getClass();
            ((C57659t) sVar.instance).f153977a = dfVar;
            String str5 = oVar.f179339e;
            akVar.copyOnWrite();
            str5.getClass();
            ((C57569am) akVar.instance).f153802d = str5;
        }
        akVar.copyOnWrite();
        C57569am amVar = (C57569am) akVar.instance;
        C57659t tVar = (C57659t) sVar.build();
        tVar.getClass();
        amVar.f153800b = tVar;
        amVar.f153799a = 10;
        return mo102687e((C57569am) akVar.build(), cVar, z, C58836b.f156633a);
    }

    /* renamed from: l */
    public final C60870cx mo102692l(C57566aj ajVar, String str, C58833ax axVar, int i) {
        return this.f322811b.mo28209i(this.f322810a.mo78755j(ajVar, str, axVar, mo102690i(), i), "Transform save item response", C116412r.f322798a);
    }
}
