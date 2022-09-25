package com.google.android.apps.gsa.sidekick.main.p7205h.p7206a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.sidekick.main.p7226r.C91602c;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91863e;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91866h;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.apps.gsa.sidekick.shared.util.WrappedExecutedUserAction;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7709ha;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7751ip;
import com.google.p375ai.p378b.C7752iq;
import com.google.p375ai.p378b.C8142xb;
import com.google.p375ai.p378b.C8178yk;
import com.google.p4283bv.p4354e.p4356b.C57057b;
import java.util.TimeZone;

/* renamed from: com.google.android.apps.gsa.sidekick.main.h.a.a */
/* compiled from: PG */
public final class C91402a {

    /* renamed from: a */
    private static final C59071e f254981a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.h.a.a");

    /* renamed from: b */
    private final C91602c f254982b;

    /* renamed from: c */
    private final C21370a f254983c;

    /* renamed from: d */
    private final C91863e f254984d;

    /* renamed from: e */
    private final C91866h f254985e;

    /* renamed from: f */
    private final C86124t f254986f;

    public C91402a(C91602c cVar, C21370a aVar, C91863e eVar, C91866h hVar, C86124t tVar) {
        this.f254982b = cVar;
        this.f254983c = aVar;
        this.f254984d = eVar;
        this.f254985e = hVar;
        this.f254986f = tVar;
    }

    /* renamed from: a */
    public final void mo85739a(C7718hj hjVar, C7681g gVar, String str, C8142xb xbVar, boolean z, boolean z2) {
        C7718hj hjVar2 = hjVar;
        C7681g gVar2 = gVar;
        String str2 = str;
        C7708h c = C91978bb.m150937c(hjVar, gVar2, new C7681g[0]);
        if (c == null) {
            C59104x d = f254981a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CASLogger");
            ((C59052c) ((C59052c) d).mo56372aa(11579)).mo56353F("No Action.Type %s found on entry %d.", gVar2, hjVar2.f26969j);
            return;
        }
        C8178yk ykVar = null;
        if (z2) {
            C7751ip ipVar = (C7751ip) C7752iq.f27124E.createBuilder();
            ipVar.copyOnWrite();
            C7752iq iqVar = (C7752iq) ipVar.instance;
            iqVar.f27133c = c;
            iqVar.f27132b = 1;
            ipVar.copyOnWrite();
            C7752iq iqVar2 = (C7752iq) ipVar.instance;
            iqVar2.f27135e = hjVar2;
            iqVar2.f27134d = 2;
            long b = this.f254983c.mo26870b();
            ipVar.copyOnWrite();
            C7752iq iqVar3 = (C7752iq) ipVar.instance;
            iqVar3.f27131a |= 16;
            iqVar3.f27140j = b / 1000;
            int offset = TimeZone.getDefault().getOffset(b);
            ipVar.copyOnWrite();
            C7752iq iqVar4 = (C7752iq) ipVar.instance;
            iqVar4.f27131a |= 32;
            iqVar4.f27141k = (int) (((long) offset) / 1000);
            this.f254982b.mo85965a(C58485gu.m89846n(new WrappedExecutedUserAction((C7752iq) ipVar.build(), (C7709ha) null, false)));
        }
        C8178yk a = this.f254985e.mo86388a(c, hjVar);
        if (a != null) {
            if ((hjVar2.f26955a & 256) != 0) {
                C91866h hVar = this.f254985e;
                C8178yk ykVar2 = hjVar2.f26974o;
                if (ykVar2 == null) {
                    ykVar2 = C8178yk.f28736g;
                }
                C7709ha haVar = hjVar2.f26972m;
                if (haVar == null) {
                    haVar = C7709ha.f26910f;
                }
                ykVar = hVar.mo86389b(ykVar2, haVar);
            }
            C57057b c2 = this.f254985e.mo86390c(hjVar, xbVar, this.f254986f);
            if (z2) {
                this.f254984d.mo86386c(a, str2, c2, false);
            }
            if (ykVar == null) {
                return;
            }
            if (z) {
                this.f254984d.mo86387d(ykVar, str2, c2, false);
            } else {
                this.f254984d.mo86385b(ykVar, str2, c2, false);
            }
        }
    }
}
