package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.p6816p.C86254i;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.p4459c.C58000d;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.ag */
/* compiled from: PG */
final class C103471ag {

    /* renamed from: a */
    public static final /* synthetic */ int f288344a = 0;

    /* renamed from: b */
    private static final C59071e f288345b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nga.r.a.ag");

    /* renamed from: c */
    private static final C58485gu f288346c = C58485gu.m89850r("media.STOP", "media.PAUSE", "media.PREVIOUS", "media.NEXT", "alarm.SNOOZE_ALARM");

    /* renamed from: a */
    static C60870cx m171407a(C86232bo boVar) {
        if (boVar instanceof C86254i) {
            C58976aa aaVar = C58975e.f156826a;
            return ((C86254i) boVar).mo79949a();
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* renamed from: b */
    static C60870cx m171408b(C86232bo boVar) {
        if (boVar instanceof C86254i) {
            C58976aa aaVar = C58975e.f156826a;
            return ((C86254i) boVar).mo79950b();
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* renamed from: c */
    static C60870cx m171409c(C58833ax axVar, C58833ax axVar2) {
        if (((Boolean) axVar.mo56106b(C103467ac.f288340a).mo56109e(false)).booleanValue()) {
            return C60856cj.m92900i(axVar);
        }
        if (axVar2.mo56113h()) {
            return C58000d.m88748a((C57981b) axVar2.mo56107c(), C103468ad.f288341a);
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* renamed from: d */
    public static boolean m171410d(C51195j jVar) {
        C58833ax axVar;
        C52076ei eiVar;
        C52076ei eiVar2;
        C52081en enVar = jVar.f133275j;
        if (enVar == null) {
            enVar = C52081en.f136679i;
        }
        if (enVar.f136684d.size() == 0) {
            C58976aa aaVar = C58975e.f156826a;
            axVar = C58836b.f156633a;
        } else {
            C52083ep epVar = (C52083ep) enVar.f136684d.get(0);
            if (epVar.f136692b == 4) {
                eiVar = (C52076ei) epVar.f136693c;
            } else {
                eiVar = C52076ei.f136664f;
            }
            if ((eiVar.f136666a & 32) != 0) {
                C58976aa aaVar2 = C58975e.f156826a;
                if (epVar.f136692b == 4) {
                    eiVar2 = (C52076ei) epVar.f136693c;
                } else {
                    eiVar2 = C52076ei.f136664f;
                }
                C51809dy dyVar = eiVar2.f136668c;
                if (dyVar == null) {
                    dyVar = C51809dy.f135933f;
                }
                axVar = C58833ax.m90834k(dyVar);
            } else {
                C58976aa aaVar3 = C58975e.f156826a;
                axVar = C58836b.f156633a;
            }
        }
        if (f288346c.contains((String) axVar.mo56106b(C103470af.f288343a).mo56109e(BuildConfig.FLAVOR))) {
            return true;
        }
        if (((String) axVar.mo56106b(C103470af.f288343a).mo56109e(BuildConfig.FLAVOR)).equals("device.MODIFY_SETTING")) {
            C51809dy dyVar2 = (C51809dy) axVar.mo56107c();
            C63010eb parserForType = C52115fu.f136753n.getParserForType();
            C51807dw dwVar = dyVar2.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C58833ax c = C58557jl.m90122c(dwVar.f135932a, new C103469ae());
            MessageLite messageLite = null;
            if (!c.mo56113h()) {
                C59104x d = f288345b.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AudioFocusPM");
                ((C59052c) ((C59052c) d).mo56372aa(21566)).mo56354G("Failed to find %s argument in %s client op", "modify_setting_args", dyVar2.f135936b);
            } else {
                try {
                    C52230ka kaVar = ((C52232kc) c.mo56107c()).f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    messageLite = (MessageLite) parserForType.mo59008g(kaVar.f137061c);
                } catch (C62974ct unused) {
                    C59104x c2 = f288345b.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "AudioFocusPM");
                    ((C59052c) ((C59052c) c2).mo56372aa(21565)).mo56354G("Failed to parse %s argument from %s client op", "modify_setting_args", dyVar2.f135936b);
                }
            }
            C52115fu fuVar = (C52115fu) messageLite;
            if (fuVar == null || !C63490p.VOLUME_LEVEL.name().equals(fuVar.f136760f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: e */
    static boolean m171411e(C58833ax axVar) {
        return axVar.mo56113h();
    }
}
