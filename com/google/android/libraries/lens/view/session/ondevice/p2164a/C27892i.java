package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.android.libraries.lens.common.text.C24129e;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24277c;
import com.google.android.libraries.lens.ondevice.p2037n.C24779al;
import com.google.android.libraries.lens.ondevice.p2037n.C24781an;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.view.p2159q.C27628bv;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.C27830m;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.p2166a.C27800b;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.p2166a.C27804f;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.p2166a.C27806h;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.p2166a.C27808j;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.p2166a.C27811m;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58723pp;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4701g.C62331d;
import com.google.lens.p4709l.p4710a.C62614b;
import com.google.lens.p4709l.p4710a.C62616d;
import com.google.lens.p4709l.p4710a.C62623k;
import com.google.p4172bg.C55694ab;
import com.google.p4172bg.C55695ac;
import com.google.p4172bg.C55696ad;
import com.google.p4172bg.C55707ao;
import com.google.p4172bg.C55708ap;
import com.google.p4172bg.C55765z;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63238k;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63240m;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.i */
/* compiled from: PG */
public final class C27892i {

    /* renamed from: a */
    private static final C58974d f76002a = C58974d.m91135i("CascadeConfigurationFactory");

    /* renamed from: b */
    private final C58495hd f76003b;

    public C27892i(C27811m mVar, C27808j jVar, C27800b bVar, C27804f fVar) {
        this.f76003b = C58495hd.m89903q(C62614b.LOTS_FEATURE_TEXT, mVar, C62614b.LOTS_FEATURE_OFFLINE_TRANSLATE, jVar, C62614b.LOTS_FEATURE_HYBRID_GANSLATE, bVar, C62614b.LOTS_FEATURE_HYBRID_TRANSLATE, fVar);
    }

    /* renamed from: a */
    public final C58833ax mo33368a(C27830m mVar, C62614b bVar, C58833ax axVar, C58833ax axVar2, boolean z) {
        C58833ax a = mVar.mo33321a(bVar);
        if (a.mo56113h()) {
            C27806h hVar = (C27806h) this.f76003b.get(bVar);
            C58838bb.m90862C(hVar, "LotsModelFeatureConfigurator for LotsFeature=%s not registered", bVar.f169058f);
            if (z || hVar.mo33317b(mVar, axVar, axVar2)) {
                C58833ax a2 = hVar.mo33316a(mVar, axVar, axVar2);
                if (!a2.mo56113h()) {
                    ((C58970a) ((C58970a) f76002a.mo56226d()).mo56372aa(50014)).mo56387q("Could not create cascade load config for lotsFeature=%d.", bVar.f169058f);
                    return C58836b.f156633a;
                }
                C63238k kVar = (C63238k) C63240m.f170859b.createBuilder();
                if (mVar.f75897e.mo56113h()) {
                    String a3 = C27628bv.m51418a(mVar.f75895c, mVar.f75896d);
                    long longValue = ((Long) mVar.f75897e.mo56107c()).longValue();
                    a3.getClass();
                    kVar.copyOnWrite();
                    ((C63240m) kVar.instance).mo59199a().put(a3, Long.valueOf(longValue));
                }
                C27890g f = C27891h.m51941f();
                C62331d a4 = C62331d.m94767a(((C62616d) a.mo56107c()).f169063c);
                if (a4 == null) {
                    a4 = C62331d.UNKNOWN;
                }
                f.mo33310b(a4);
                f.mo33311c((C24795f) a2.mo56107c());
                C24779al alVar = (C24779al) C24781an.f67714d.createBuilder();
                C55765z zVar = (C55765z) C55694ab.f146930c.createBuilder();
                int a5 = C62623k.m94815a(mVar.f75894b.f169078h);
                if (a5 == 0) {
                    a5 = 2;
                }
                int i = a5 - 1;
                if (i != 2) {
                    if (i == 3) {
                        C58833ax axVar3 = C58836b.f156633a;
                        if (axVar.mo56113h() && !((String) axVar.mo56107c()).equals("auto")) {
                            axVar3 = C24129e.m44828b((String) axVar.mo56107c());
                        }
                        C58833ax j = axVar3.mo56113h() ? C58833ax.m90833j((String) ((C58723pp) C24129e.f65885a).f156468c.get(axVar3.mo56107c())) : C58836b.f156633a;
                        C55707ao aoVar = (C55707ao) C55708ap.f146960d.createBuilder();
                        if (!j.mo56113h()) {
                            aoVar.copyOnWrite();
                            ((C55708ap) aoVar.instance).f146963b = true;
                        } else if ("latin".equals(C24129e.f65885a.get(j.mo56107c()))) {
                            aoVar.copyOnWrite();
                            ((C55708ap) aoVar.instance).f146964c = "und-".concat(String.valueOf((String) j.mo56107c()));
                        } else {
                            String concat = "und-".concat(String.valueOf((String) j.mo56107c()));
                            aoVar.copyOnWrite();
                            C55708ap apVar = (C55708ap) aoVar.instance;
                            C62971cq cqVar = apVar.f146962a;
                            if (!cqVar.mo58948c()) {
                                apVar.f146962a = C62942bv.mutableCopy(cqVar);
                            }
                            apVar.f146962a.add(concat);
                        }
                        C55695ac acVar = (C55695ac) C55696ad.f146934b.createBuilder();
                        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
                        gVar.copyOnWrite();
                        ((C63070h) gVar.instance).f170217a = "type.googleapis.com/google_ocr.PhotoOcrScriptIdentificationMutatorRuntimeOptions";
                        C63088z byteString = ((C55708ap) aoVar.build()).toByteString();
                        gVar.copyOnWrite();
                        byteString.getClass();
                        ((C63070h) gVar.instance).f170218b = byteString;
                        acVar.copyOnWrite();
                        C63070h hVar2 = (C63070h) gVar.build();
                        hVar2.getClass();
                        ((C55696ad) acVar.instance).f146936a = hVar2;
                        C55696ad adVar = (C55696ad) acVar.build();
                        adVar.getClass();
                        zVar.copyOnWrite();
                        C55694ab abVar = (C55694ab) zVar.instance;
                        C62995dn dnVar = abVar.f146932a;
                        if (!dnVar.f170058b) {
                            abVar.f146932a = dnVar.mo58980a();
                        }
                        abVar.f146932a.put("script_detector", adVar);
                    }
                } else if (axVar.mo56113h() && !((String) axVar.mo56107c()).equals("auto")) {
                    String str = (String) axVar.mo56107c();
                    zVar.copyOnWrite();
                    str.getClass();
                    ((C55694ab) zVar.instance).f146933b = str;
                }
                C24277c cVar = new C24277c();
                alVar.copyOnWrite();
                C24781an anVar = (C24781an) alVar.instance;
                C55694ab abVar2 = (C55694ab) zVar.build();
                abVar2.getClass();
                anVar.f67717b = abVar2;
                anVar.f67716a |= 1;
                cVar.f66329a = C58833ax.m90833j((C24781an) alVar.build());
                f.mo33313e(cVar.mo29818a());
                f.mo33312d((C63240m) kVar.build());
                return C58833ax.m90834k(f.mo33309a());
            }
            ((C58970a) ((C58970a) f76002a.mo56224b()).mo56372aa(50015)).mo56395y("lotsFeature=%d for variant='%s' is not eligible.", bVar.f169058f, mVar.f75896d);
            return C58836b.f156633a;
        }
        ((C58970a) ((C58970a) f76002a.mo56226d()).mo56372aa(50016)).mo56352E("Could not force variant='%s' for lotsFeature=%d. No feature config for is supported.", mVar.f75896d, bVar.f169058f);
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final C58833ax mo33369b(C58833ax axVar, C62614b bVar, C58833ax axVar2, C58833ax axVar3, boolean z) {
        if (!axVar.mo56113h()) {
            return C58836b.f156633a;
        }
        return mo33368a((C27830m) axVar.mo56107c(), bVar, axVar2, axVar3, z);
    }
}
