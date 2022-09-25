package com.google.android.apps.gsa.staticplugins.chime;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.notifications.C30007h;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.p2305m.C30054a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56967c;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56968d;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.x */
/* compiled from: PG */
public final /* synthetic */ class C97742x implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C97744z f272913a;

    /* renamed from: b */
    public final /* synthetic */ C56968d f272914b;

    /* renamed from: c */
    public final /* synthetic */ C29820k f272915c;

    /* renamed from: d */
    public final /* synthetic */ C29827r f272916d;

    public /* synthetic */ C97742x(C97744z zVar, C56968d dVar, C29820k kVar, C29827r rVar) {
        this.f272913a = zVar;
        this.f272914b = dVar;
        this.f272915c = kVar;
        this.f272916d = rVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C97744z zVar = this.f272913a;
        C56968d dVar = this.f272914b;
        C29820k kVar = this.f272915c;
        C29827r rVar = this.f272916d;
        byte[] bArr = (byte[]) obj;
        if (bArr == null) {
            C59104x d = C97744z.f272918a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ChimeCustomNotifsHelper");
            ((C59052c) ((C59052c) d).mo56372aa(18965)).mo56386p("Image could not be downloaded.");
            return;
        }
        C63088z A = C63088z.m96139A(bArr);
        if (A.mo59173M()) {
            C59104x d2 = C97744z.f272918a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "ChimeCustomNotifsHelper");
            ((C59052c) ((C59052c) d2).mo56372aa(18964)).mo56386p("Downloaded image is empty");
            return;
        }
        C56967c cVar = (C56967c) C56968d.f152036t.createBuilder(dVar);
        cVar.copyOnWrite();
        C56968d dVar2 = (C56968d) cVar.instance;
        dVar2.f152038a |= 256;
        dVar2.f152047j = A;
        String j = rVar.mo35063j();
        C30007h d3 = C30007h.m55637d();
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        C63088z byteString = ((C56968d) cVar.build()).toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        ((C30054a) zVar.f272920c.mo17428b()).mo35394c(kVar, j, d3, (C63070h) gVar.build());
    }
}
