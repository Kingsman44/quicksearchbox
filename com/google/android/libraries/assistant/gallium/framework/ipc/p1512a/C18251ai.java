package com.google.android.libraries.assistant.gallium.framework.ipc.p1512a;

import com.google.common.base.C58894dd;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p5127o.C65692r;
import com.google.protos.p5127o.C65693s;
import java.io.IOException;
import java.io.InputStream;
import p5488io.grpc.C70336dg;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.a.ai */
/* compiled from: PG */
public final class C18251ai implements C70336dg {

    /* renamed from: a */
    private final String f51816a;

    public C18251ai(String str) {
        this.f51816a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InputStream mo23738a(Object obj) {
        C63070h hVar = ((C65693s) obj).f178489b;
        if (hVar == null) {
            hVar = C63070h.f170215c;
        }
        return hVar.f170218b.mo59041m();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo23739b(InputStream inputStream) {
        try {
            C65692r rVar = (C65692r) C65693s.f178486d.createBuilder();
            C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
            C63088z F = C63088z.m96144F(inputStream);
            gVar.copyOnWrite();
            F.getClass();
            ((C63070h) gVar.instance).f170218b = F;
            gVar.copyOnWrite();
            ((C63070h) gVar.instance).f170217a = "type.googleapis.com/" + this.f51816a;
            rVar.copyOnWrite();
            C65693s sVar = (C65693s) rVar.instance;
            C63070h hVar = (C63070h) gVar.build();
            hVar.getClass();
            sVar.f178489b = hVar;
            sVar.f178488a |= 1;
            return (C65693s) rVar.build();
        } catch (IOException e) {
            throw new C58894dd("IOException during stream read.", e);
        }
    }
}
