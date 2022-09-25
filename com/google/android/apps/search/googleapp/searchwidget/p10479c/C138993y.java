package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.base.C58817ah;
import com.google.frameworks.client.data.android.C61366ah;
import com.google.p337aa.C6617d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.y */
/* compiled from: PG */
public final /* synthetic */ class C138993y implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C138993y f377995a = new C138993y();

    private /* synthetic */ C138993y() {
    }

    public final Object apply(Object obj) {
        try {
            return (C6617d) C62942bv.parseFrom((C62942bv) C6617d.f19649y, ((C61366ah) obj).f165946b, C62921ba.m95368a());
        } catch (C62974ct e) {
            C95883aa.m158984e(C138994z.f377996a.mo56226d(), "Could not parse doodle data response", 41329, C38505d.f101864b, 149815953, e);
            return C6617d.f19649y;
        }
    }
}
