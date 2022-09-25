package com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j;

import com.google.common.base.C58817ah;
import com.google.p4017at.p4060h.p4061a.p4062a.p4067e.C54179d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import java.io.IOException;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.j.m */
/* compiled from: PG */
public final /* synthetic */ class C40453m implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C40453m f106175a = new C40453m();

    private /* synthetic */ C40453m() {
    }

    public final Object apply(Object obj) {
        String str;
        C40450j jVar = (C40450j) obj;
        int i = C40456p.f106179b;
        C63088z b = jVar.mo42443b();
        if (b != null) {
            try {
                if (jVar.mo42448f()) {
                    return (C54179d) C62942bv.parseFrom((C62942bv) C54179d.f142190b, b.mo59040l().mo58664G(), C62921ba.m95368a());
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
