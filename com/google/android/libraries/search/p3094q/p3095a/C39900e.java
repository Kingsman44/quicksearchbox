package com.google.android.libraries.search.p3094q.p3095a;

import android.util.Base64;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.C61366ah;
import com.google.p395al.p417d.p418a.C8539as;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.nio.ByteBuffer;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.libraries.search.q.a.e */
/* compiled from: PG */
public final /* synthetic */ class C39900e implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C39900e f104910a = new C39900e();

    private /* synthetic */ C39900e() {
    }

    public final C60870cx apply(Object obj) {
        C61366ah ahVar = (C61366ah) obj;
        if (ahVar.f165947c != 200) {
            ((C59052c) ((C59052c) C39904i.f104914a.mo56226d()).mo56372aa(53885)).mo56386p("Unable to get user prefs");
            return C47633f.m84733g(C60856cj.m92899h(new C39897b("Request to get prefs failed")));
        }
        ByteBuffer byteBuffer = ahVar.f165946b;
        if (byteBuffer == null || !byteBuffer.hasArray()) {
            ((C59052c) ((C59052c) C39904i.f104914a.mo56226d()).mo56372aa(53882)).mo56386p("Successful response has no body.");
            return C47633f.m84733g(C60856cj.m92899h(new C39897b("Successful response has no body.")));
        }
        try {
            try {
                return C47633f.m84733g(C60856cj.m92900i((C8539as) C62942bv.parseFrom((C62942bv) C8539as.f29624f, Base64.decode(StandardCharsets.UTF_8.decode(ahVar.f165946b).toString().getBytes(), 8), C62921ba.m95368a())));
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) C39904i.f104914a.mo56226d()).mo56372aa(53883)).mo56386p("Unable to parse proto from base64 decoded bytes");
                return C47633f.m84733g(C60856cj.m92899h(e));
            }
        } catch (IllegalArgumentException e2) {
            ((C59052c) ((C59052c) C39904i.f104914a.mo56226d()).mo56372aa(53884)).mo56386p("Unable to base64 decode the UTF8 response.");
            return C47633f.m84733g(C60856cj.m92899h(e2));
        }
    }
}
