package com.google.android.apps.search.weather.suggestions.p10696c;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.frameworks.client.data.android.C61366ah;
import com.google.p4017at.p4060h.p4073d.p4074a.C54229ar;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.search.weather.suggestions.c.d */
/* compiled from: PG */
public final /* synthetic */ class C142138d implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C142138d f385594a = new C142138d();

    private /* synthetic */ C142138d() {
    }

    public final Object apply(Object obj) {
        try {
            return (C54229ar) C62942bv.parseFrom((C62942bv) C54229ar.f142352d, ((C61366ah) obj).f165946b, C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) C142140f.f385596a.mo56226d()).mo56382g(e)).mo56372aa(42037)).mo56386p("Exception while parsing data from HttpResponse");
            return C54229ar.f142352d;
        }
    }
}
