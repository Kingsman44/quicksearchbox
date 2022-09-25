package com.google.android.apps.gsa.staticplugins.deeplink.p7792d;

import com.google.android.libraries.search.p2998g.p2999a.C38370k;
import com.google.android.libraries.search.p2998g.p2999a.C38384y;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.deeplink.d.b */
/* compiled from: PG */
public final class C99498b {

    /* renamed from: a */
    private static final C59071e f278424a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.deeplink.d.b");

    /* renamed from: a */
    public static Optional m165020a(Optional optional) {
        C58976aa aaVar = C58975e.f156826a;
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        C63088z zVar = ((C38384y) optional.get()).f101631c;
        try {
            return Optional.m71637of((C38370k) C62942bv.parseFrom((C62942bv) C38370k.f101593f, zVar, C62921ba.m95368a()));
        } catch (C62974ct e) {
            C59104x c = f278424a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DeeplinkProtoUtils");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(19236)).mo56389s("Invalid Deeplink proto in a SignedDeeplink proto. This should never happen: %s", zVar);
            return Optional.empty();
        }
    }
}
