package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.frameworks.client.data.android.C61366ah;
import com.google.p4283bv.p4284a.p4286b.C56608b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.w */
/* compiled from: PG */
public final /* synthetic */ class C138991w implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C138991w f377993a = new C138991w();

    private /* synthetic */ C138991w() {
    }

    public final Object apply(Object obj) {
        try {
            return (C56608b) C62942bv.parseFrom((C62942bv) C56608b.f151135d, ((C61366ah) obj).f165946b, C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) C138994z.f377996a.mo56226d()).mo56382g(e)).mo56372aa(41330)).mo56386p("Could not parse doodle schedule response");
            return C56608b.f151135d;
        }
    }
}
