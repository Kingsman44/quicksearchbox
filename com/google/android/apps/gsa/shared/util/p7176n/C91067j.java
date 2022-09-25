package com.google.android.apps.gsa.shared.util.p7176n;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.shared.p7066m.C90102f;
import com.google.android.apps.gsa.shared.p7066m.C90129h;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter.p9651a.C127842a;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50637am;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.protobuf.MessageLite;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.shared.util.n.j */
/* compiled from: PG */
public final class C91067j {

    /* renamed from: a */
    public static final /* synthetic */ int f254329a = 0;

    /* renamed from: b */
    private static final C58495hd f254330b;

    /* renamed from: c */
    private static final C58495hd f254331c = C58495hd.m89900n(C90037cp.f248488bP, "olc.grpc_request_timeout_in_ms");

    /* renamed from: d */
    private static final C58495hd f254332d = C58495hd.m89900n(C90037cp.f248489bQ, "olc.module_order");

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C90037cp.f248492bT, "olc.use_prefetched_data");
        gzVar.mo55429h(C90037cp.f248490bR, "olc.use_grpc");
        gzVar.mo55429h(C90037cp.f248491bS, "olc.use_grpc_with_parallel_loading");
        gzVar.mo55429h(C90037cp.f248493bU, "olc.use_spinner");
        gzVar.mo55429h(C90037cp.f248486bN, "olc.enable_direct_query_issue");
        gzVar.mo55429h(C90037cp.f248487bO, "olc.grpc_enable_response_compression");
        f254330b = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public static Intent m148769a(Context context) {
        Intent className = new Intent().setClassName(context, "com.google.android.apps.gsa.staticplugins.opa.hq.OpaHqActivity");
        C50637am amVar = (C50637am) C50638an.f131726h.createBuilder();
        amVar.copyOnWrite();
        C50638an anVar = (C50638an) amVar.instance;
        anVar.f131728a |= 1;
        anVar.f131733f = true;
        Intent putExtra = className.putExtra("updates_center_queue", new ProtoLiteParcelable((MessageLite) amVar.build())).putExtra("entry_point_origin", 2);
        putExtra.addFlags(335544320);
        return putExtra;
    }

    /* renamed from: b */
    public static Intent m148770b(Context context) {
        Intent className = new Intent().setClassName(context, "com.google.android.apps.gsa.staticplugins.opa.hq.OpaHqActivity");
        className.addFlags(335544320);
        return className;
    }

    /* renamed from: c */
    public static Intent m148771c(C86124t tVar) {
        Objects.requireNonNull(tVar);
        C91061d dVar = new C91061d(tVar);
        Objects.requireNonNull(tVar);
        C91062e eVar = new C91062e(tVar);
        Objects.requireNonNull(tVar);
        return C127842a.m208888a(m148773e(dVar, eVar, new C91063f(tVar)));
    }

    /* renamed from: d */
    public static Intent m148772d(C91142g gVar) {
        Objects.requireNonNull(gVar);
        C91058a aVar = new C91058a(gVar);
        Objects.requireNonNull(gVar);
        C91059b bVar = new C91059b(gVar);
        Objects.requireNonNull(gVar);
        return C127842a.m208888a(m148773e(aVar, bVar, new C91060c(gVar)));
    }

    /* renamed from: e */
    private static Bundle m148773e(C91064g gVar, C91065h hVar, C91066i iVar) {
        Bundle bundle = new Bundle();
        C58800sl lA = f254330b.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            bundle.putBoolean((String) entry.getValue(), gVar.mo85334a((C90048d) entry.getKey()));
        }
        C58800sl lA2 = f254331c.entrySet().iterator();
        while (lA2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) lA2.next();
            bundle.putLong((String) entry2.getValue(), hVar.mo85335a((C90102f) entry2.getKey()));
        }
        C58800sl lA3 = f254332d.entrySet().iterator();
        while (lA3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) lA3.next();
            bundle.putString((String) entry3.getValue(), iVar.mo85336a((C90129h) entry3.getKey()));
        }
        return bundle;
    }
}
