package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.am.l.a.i;
import com.google.android.apps.gsa.nga.engine.p5913am.p5926l.p5927a.C74927h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80317bl;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80348e;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18101b;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18102c;
import com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a.C18129c;
import com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a.C18141o;
import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52802d;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.aq */
/* compiled from: PG */
final class C76306aq implements C18101b {

    /* renamed from: a */
    private final i f211352a;

    public C76306aq(C80317bl blVar) {
        this.f211352a = new i(blVar);
    }

    /* renamed from: a */
    public final /* synthetic */ Bundle mo23502a(Object obj) {
        C80348e eVar = ((C80317bl) obj).f220403b;
        if (eVar == null) {
            eVar = C80348e.f220469b;
        }
        return C74927h.m121137a(eVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo23503b(Bundle bundle) {
        try {
            return (Boolean) C18129c.m35313b(this.f211352a.a.f220402a).mo23624d(C18129c.m35314e(C18141o.m35332b("success"))).mo23622a().mo23503b(bundle);
        } catch (C52802d e) {
            ((C58970a) ((C58970a) ((C58970a) C76307ar.f211353a.mo56225c()).mo56382g(e)).mo56372aa(3526)).mo56386p("Error deserializing results bundle");
            return false;
        }
    }

    /* renamed from: c */
    public final String mo23504c() {
        return this.f211352a.a.f220402a;
    }

    /* renamed from: d */
    public final boolean mo23505d(C18102c cVar) {
        return this.f211352a.d(cVar);
    }
}
