package com.google.android.libraries.componentview.services.application;

import com.google.common.base.C58817ah;
import com.google.common.base.C58894dd;
import com.google.protobuf.C62893aa;
import com.google.protobuf.C62897ae;
import com.google.protobuf.C62921ba;
import com.google.protobuf.MessageLite;
import java.io.IOException;

/* renamed from: com.google.android.libraries.componentview.services.application.cd */
/* compiled from: PG */
public final /* synthetic */ class C20604cd implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C20606cf f57808a;

    public /* synthetic */ C20604cd(C20606cf cfVar) {
        this.f57808a = cfVar;
    }

    public final Object apply(Object obj) {
        String str;
        C20606cf cfVar = this.f57808a;
        C20578be beVar = (C20578be) obj;
        byte[] bArr = beVar.f57758b;
        if (bArr != null) {
            try {
                if (beVar.f57759c && beVar.f57760d < 300) {
                    C62897ae O = C62897ae.m95112O(bArr, 0, bArr.length);
                    return (MessageLite) cfVar.f57812d.getParserForType().mo59015n(((C62893aa) O).mo58665H(((C62893aa) O).mo58675j()), C62921ba.m95368a());
                }
            } catch (IOException e) {
                throw new C58894dd((Throwable) e);
            }
        }
        if (bArr == null) {
            str = "Empty response.";
        } else {
            str = "Request failed: " + String.valueOf(beVar.f57761e);
        }
        throw new IOException(str);
    }
}
