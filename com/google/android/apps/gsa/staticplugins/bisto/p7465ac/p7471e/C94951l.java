package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7471e;

import android.net.Uri;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b.C94928z;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C95001s;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C95005w;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C95007y;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7477k.C95023e;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95455a;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96500t;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.assistant.p3739a.p3740a.C48090bx;
import com.google.assistant.p3739a.p3740a.C48098ce;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.e.l */
/* compiled from: PG */
public final /* synthetic */ class C94951l implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C94961v f265610a;

    /* renamed from: b */
    public final /* synthetic */ C94928z f265611b;

    /* renamed from: c */
    public final /* synthetic */ boolean f265612c;

    /* renamed from: d */
    public final /* synthetic */ boolean f265613d;

    /* renamed from: e */
    public final /* synthetic */ C124548d f265614e;

    /* renamed from: f */
    public final /* synthetic */ C48090bx f265615f;

    public /* synthetic */ C94951l(C94961v vVar, C94928z zVar, boolean z, boolean z2, C124548d dVar, C48090bx bxVar) {
        this.f265610a = vVar;
        this.f265611b = zVar;
        this.f265612c = z;
        this.f265613d = z2;
        this.f265614e = dVar;
        this.f265615f = bxVar;
    }

    public final void run() {
        C94961v vVar = this.f265610a;
        C94928z zVar = this.f265611b;
        boolean z = this.f265612c;
        boolean z2 = this.f265613d;
        C124548d dVar = this.f265614e;
        C48090bx bxVar = this.f265615f;
        if (vVar.f265637j != null) {
            C59104x c = C94961v.f265628a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VoiceInputListener");
            ((C59052c) ((C59052c) c).mo56372aa(17697)).mo56386p("Already decoding!");
            return;
        }
        int b = zVar.mo88788b();
        int c2 = zVar.mo88789c();
        Integer valueOf = Integer.valueOf(zVar.mo88787a());
        vVar.f265637j = valueOf;
        if (valueOf.intValue() == 1) {
            vVar.f265635h.mo89796a(c2, b);
        }
        if (valueOf.intValue() == 3) {
            C59104x b2 = C94961v.f265628a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "VoiceInputListener");
            ((C59052c) ((C59052c) b2).mo56372aa(17711)).mo56386p("Open phone mic for PHONE_MIC request");
            vVar.mo88862a();
            vVar.f265638k = new C96500t(vVar.f265629b, vVar.f265634g, "local", new C94952m(vVar));
            vVar.f265638k.mo90182c();
        }
        if (z) {
            C94948i iVar = vVar.f265631d;
            C95007y yVar = vVar.f265632e;
            boolean e = zVar.mo88791e();
            int c3 = zVar.mo88789c();
            C94960u uVar = vVar.f265646s;
            C58976aa aaVar = C58975e.f156826a;
            iVar.f265605e.get();
            Uri a = iVar.mo88856a();
            if (a == null) {
                yVar.mo88815f(C48098ce.QUERY_FAILED);
            } else {
                C95005w wVar = iVar.f265602b;
                wVar.f265807a.execute(new C95001s(wVar, new C95455a(a, z2, iVar.f265603c.mo26870b()), yVar, e, c3, uVar));
                iVar.f265605e.set(true);
            }
        } else {
            vVar.f265631d.mo88858c(vVar.f265632e, z2, zVar.mo88791e(), dVar, zVar.mo88789c(), bxVar, false, C58836b.f156633a, vVar.f265646s);
        }
        vVar.f265633f.mo88936a(C95023e.RAW);
    }
}
