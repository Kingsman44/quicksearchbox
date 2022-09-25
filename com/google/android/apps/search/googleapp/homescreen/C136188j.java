package com.google.android.apps.search.googleapp.homescreen;

import com.google.android.apps.gsa.h.p.i;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.j */
/* compiled from: PG */
public final class C136188j implements C46440f {

    /* renamed from: a */
    final /* synthetic */ C136193o f370881a;

    public C136188j(C136193o oVar) {
        this.f370881a = oVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
        Void voidR = (Void) obj;
        this.f370881a.f370903P = false;
        C59052c cVar = (C59052c) C136193o.f370887a.mo56225c();
        cVar.mo56378ag(C38505d.f101864b, 160765908);
        C59052c cVar2 = (C59052c) cVar.mo56382g(th);
        cVar2.mo56379ah(new C59094n(40691));
        cVar2.mo56386p("Failed to create an intent");
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
        Void voidR = (Void) obj;
        ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj2;
        C69664n.m101061g(parcelableProto, "options");
        this.f370881a.f370909d.mo41490e(parcelableProto.mo58938a(i.f, C62921ba.m95368a()));
        this.f370881a.f370903P = false;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
        Void voidR = (Void) obj;
    }
}
