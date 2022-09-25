package com.google.android.apps.gsa.shared.p7122o;

import com.facebook.litho.C6411u;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21270bm;
import com.google.android.libraries.elements.interfaces.C21310q;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.logging.C28294l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.aqr;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62917ay;

/* renamed from: com.google.android.apps.gsa.shared.o.e */
/* compiled from: PG */
public final class C90441e implements C21270bm {

    /* renamed from: a */
    public static final C59071e f252657a = C59071e.m91332i("com.google.android.apps.gsa.shared.o.e");

    /* renamed from: b */
    public final C87680ah f252658b;

    public C90441e(C87680ah ahVar) {
        this.f252658b = ahVar;
    }

    /* renamed from: a */
    public final C62917ay mo25837a() {
        return C57696b.f154138m;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo25838b(C6411u uVar, C21319z zVar, String str, Object obj, C21248ar arVar, C21310q qVar) {
        String str2;
        C57696b bVar = (C57696b) obj;
        if ((bVar.f154140a & 2) != 0) {
            C60214n nVar = bVar.f154142c;
            if (nVar == null) {
                nVar = C60214n.f162914g;
            }
            str2 = C28294l.m52913c(nVar);
        } else {
            ((C59052c) ((C59052c) f252657a.mo56226d()).mo56372aa(10575)).mo56389s("String ved %s in ClientLoggingProperties is deprecated, use ClickTrackingCGI instead.", bVar.f154141b);
            str2 = bVar.f154141b;
        }
        if (bVar.f154145f) {
            arVar.mo25943q(new C90439c(this, str2, bVar));
        }
        int b = aqr.m92462b(bVar.f154143d);
        if (b != 0 && b == 2) {
            arVar.mo25939m(new C90440d(this, str2, bVar));
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo25839c(C21248ar arVar) {
        throw null;
    }
}
