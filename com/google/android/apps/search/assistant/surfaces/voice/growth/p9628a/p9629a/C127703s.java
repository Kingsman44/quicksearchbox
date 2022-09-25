package com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a;

import com.google.assistant.p4008y.p4009a.C53616y;
import com.google.assistant.p4008y.p4009a.C53617z;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.s */
/* compiled from: PG */
public final /* synthetic */ class C127703s implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C127678aa f351580a;

    /* renamed from: b */
    public final /* synthetic */ int f351581b;

    public /* synthetic */ C127703s(C127678aa aaVar, int i) {
        this.f351580a = aaVar;
        this.f351581b = i;
    }

    public final Object call() {
        C127678aa aaVar = this.f351580a;
        int i = this.f351581b;
        C58976aa aaVar2 = C58975e.f156826a;
        ArrayList arrayList = new ArrayList();
        try {
            InputStream openRawResource = aaVar.f351517e.f351530m.getResources().openRawResource(i);
            C62921ba a = C62921ba.m95368a();
            C53616y yVar = (C53616y) C53617z.f140728c.createBuilder();
            C63088z byteString = ((C54201r) C62942bv.parseFrom((C62942bv) C54201r.f142243f, openRawResource, a)).toByteString();
            yVar.copyOnWrite();
            C53617z zVar = (C53617z) yVar.instance;
            byteString.getClass();
            zVar.f140730a |= 1;
            zVar.f140731b = byteString;
            arrayList.add((C53617z) yVar.build());
        } catch (IOException | NullPointerException e) {
            C59104x c = C127679ab.f351518a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GrpcWpfOlcDataService");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(37600)).mo56386p("Error while loading OLC data.");
        }
        return arrayList;
    }
}
