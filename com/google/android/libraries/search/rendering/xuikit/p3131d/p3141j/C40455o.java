package com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import java.io.IOException;
import p5591n.p5594b.p5595a.p5596a.p5597a.p5598a.p5599a.p5600a.p5601a.C71859d;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.j.o */
/* compiled from: PG */
public final /* synthetic */ class C40455o implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C40455o f106177a = new C40455o();

    private /* synthetic */ C40455o() {
    }

    public final Object apply(Object obj) {
        String str;
        C40450j jVar = (C40450j) obj;
        int i = C40456p.f106179b;
        C63088z b = jVar.mo42443b();
        if (b != null) {
            try {
                if (jVar.mo42448f()) {
                    return (C71859d) C62942bv.parseFrom((C62942bv) C71859d.f191403c, b, C62921ba.m95368a());
                }
            } catch (IOException e) {
                throw new IllegalArgumentException(e);
            }
        }
        if (b == null) {
            str = "Empty response.";
        } else {
            str = "Request failed: " + String.valueOf(jVar.mo42445d());
        }
        throw new IOException(str);
    }
}
