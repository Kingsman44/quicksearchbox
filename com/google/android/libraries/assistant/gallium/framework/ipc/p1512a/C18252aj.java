package com.google.android.libraries.assistant.gallium.framework.ipc.p1512a;

import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p5127o.C65696v;
import com.google.protos.p5127o.C65697w;
import com.google.protos.p5127o.C65699y;
import java.io.IOException;
import java.io.InputStream;
import p5488io.grpc.C70336dg;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.a.aj */
/* compiled from: PG */
public final class C18252aj implements C70336dg {

    /* renamed from: a */
    private final String f51817a;

    public C18252aj(String str) {
        this.f51817a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InputStream mo23738a(Object obj) {
        C63070h hVar;
        C65697w wVar = (C65697w) obj;
        if (wVar.f178497a == 1) {
            hVar = (C63070h) wVar.f178498b;
        } else {
            hVar = C63070h.f170215c;
        }
        return hVar.f170218b.mo59041m();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo23739b(InputStream inputStream) {
        C18218av avVar;
        try {
            C65696v vVar = (C65696v) C65697w.f178495c.createBuilder();
            C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
            C63088z F = C63088z.m96144F(inputStream);
            gVar.copyOnWrite();
            F.getClass();
            ((C63070h) gVar.instance).f170218b = F;
            gVar.copyOnWrite();
            ((C63070h) gVar.instance).f170217a = "type.googleapis.com/" + this.f51817a;
            vVar.copyOnWrite();
            C65697w wVar = (C65697w) vVar.instance;
            C63070h hVar = (C63070h) gVar.build();
            hVar.getClass();
            wVar.f178498b = hVar;
            wVar.f178497a = 1;
            return (C65697w) vVar.build();
        } catch (IOException e) {
            C65696v vVar2 = (C65696v) C65697w.f178495c.createBuilder();
            if (e.getCause() instanceof C18218av) {
                avVar = (C18218av) e.getCause();
            } else {
                avVar = C18218av.m35481d(e);
            }
            C65699y yVar = avVar.f51741a;
            vVar2.copyOnWrite();
            C65697w wVar2 = (C65697w) vVar2.instance;
            yVar.getClass();
            wVar2.f178498b = yVar;
            wVar2.f178497a = 2;
            return (C65697w) vVar2.build();
        }
    }
}
