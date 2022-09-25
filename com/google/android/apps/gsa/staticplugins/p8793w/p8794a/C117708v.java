package com.google.android.apps.gsa.staticplugins.p8793w.p8794a;

import android.util.Base64;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.assistant.p3897e.p3917i.p3918a.C51239ai;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4541l.C59315ac;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.p4486ci.p4487a.C58097b;
import com.google.p4486ci.p4487a.C58100e;
import com.google.p4486ci.p4487a.C58114s;
import com.google.p4486ci.p4487a.C58119x;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import p001a.p007b.p008a.p009a.p010a.C0005a;
import p001a.p007b.p008a.p009a.p010a.C0007c;
import p001a.p007b.p008a.p009a.p010a.C0009e;
import p001a.p007b.p008a.p009a.p010a.C0010f;
import p001a.p007b.p008a.p009a.p010a.C0011g;
import p001a.p007b.p008a.p009a.p010a.C0012h;
import p001a.p007b.p008a.p009a.p010a.C0013i;
import p001a.p007b.p008a.p009a.p010a.C0014j;
import p001a.p007b.p008a.p009a.p010a.C0015k;
import p001a.p007b.p008a.p009a.p010a.C0024t;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.a.v */
/* compiled from: PG */
public final /* synthetic */ class C117708v implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C117687ai f326702a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f326703b;

    /* renamed from: c */
    public final /* synthetic */ C58097b f326704c;

    /* renamed from: d */
    public final /* synthetic */ File f326705d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f326706e;

    /* renamed from: f */
    public final /* synthetic */ String f326707f;

    /* renamed from: g */
    public final /* synthetic */ String f326708g;

    public /* synthetic */ C117708v(C117687ai aiVar, C60870cx cxVar, C58097b bVar, File file, C60870cx cxVar2, String str, String str2) {
        this.f326702a = aiVar;
        this.f326703b = cxVar;
        this.f326704c = bVar;
        this.f326705d = file;
        this.f326706e = cxVar2;
        this.f326707f = str;
        this.f326708g = str2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C117687ai aiVar = this.f326702a;
        C60870cx cxVar = this.f326703b;
        C58097b bVar = this.f326704c;
        File file = this.f326705d;
        C60870cx cxVar2 = this.f326706e;
        String str = this.f326707f;
        String str2 = this.f326708g;
        C0024t tVar = (C0024t) C60856cj.m92909r(cxVar);
        if (tVar == null) {
            aiVar.mo103432c(bVar, file, (C60870cx) null);
            return C60856cj.m92899h(new Exception("Empty Test Drive Metadata"));
        }
        C51239ai aiVar2 = (C51239ai) ((C58833ax) C60856cj.m92909r(cxVar2)).mo56106b(C117692f.f326668a).mo56109e(C51239ai.f133399g);
        C0011g gVar = tVar.f73e;
        if (gVar == null) {
            gVar = C0011g.f14f;
        }
        C0010f fVar = (C0010f) gVar.toBuilder();
        String str3 = aiVar2.f133404d;
        fVar.copyOnWrite();
        C0011g gVar2 = (C0011g) fVar.instance;
        str3.getClass();
        gVar2.f16a |= 1;
        gVar2.f17b = str3;
        fVar.copyOnWrite();
        C0011g gVar3 = (C0011g) fVar.instance;
        str.getClass();
        gVar3.f16a |= 2;
        gVar3.f18c = str;
        fVar.copyOnWrite();
        C0011g gVar4 = (C0011g) fVar.instance;
        gVar4.f16a |= 4;
        gVar4.f19d = "UNKNOWN";
        fVar.copyOnWrite();
        C0011g gVar5 = (C0011g) fVar.instance;
        gVar5.f16a |= 16;
        gVar5.f20e = false;
        C0011g gVar6 = (C0011g) fVar.build();
        C0007c cVar = tVar.f72d;
        if (cVar == null) {
            cVar = C0007c.f9c;
        }
        C0005a aVar = (C0005a) cVar.toBuilder();
        aVar.copyOnWrite();
        C0007c cVar2 = (C0007c) aVar.instance;
        cVar2.f12b = 4;
        cVar2.f11a |= 1;
        C0007c cVar3 = (C0007c) aVar.build();
        C0013i iVar = tVar.f71c;
        if (iVar == null) {
            iVar = C0013i.f21e;
        }
        C0012h hVar = (C0012h) iVar.toBuilder();
        hVar.copyOnWrite();
        C0013i iVar2 = (C0013i) hVar.instance;
        iVar2.f24b = 1;
        iVar2.f23a |= 1;
        hVar.copyOnWrite();
        C0013i iVar3 = (C0013i) hVar.instance;
        iVar3.f23a |= 2;
        iVar3.f25c = 16000.0f;
        hVar.copyOnWrite();
        C0013i iVar4 = (C0013i) hVar.instance;
        iVar4.f23a |= 4;
        iVar4.f26d = 2;
        C0013i iVar5 = (C0013i) hVar.build();
        try {
            C0015k kVar = tVar.f70b;
            if (kVar == null) {
                kVar = C0015k.f27g;
            }
            C0014j jVar = (C0014j) kVar.toBuilder();
            long nanos = Duration.ofMillis(aiVar.f326648e.mo26870b()).toNanos();
            jVar.copyOnWrite();
            C0015k kVar2 = (C0015k) jVar.instance;
            kVar2.f29a |= 1;
            kVar2.f30b = nanos;
            jVar.copyOnWrite();
            ((C0015k) jVar.instance).f31c = C62942bv.emptyProtobufList();
            jVar.mo3a(aiVar.f326649f.mo79343a());
            C63088z A = C63088z.m96139A(new C59315ac(file).mo56803a());
            jVar.copyOnWrite();
            C0015k kVar3 = (C0015k) jVar.instance;
            kVar3.f29a |= 2;
            kVar3.f32d = A;
            String x = aiVar.f326650g.mo79758x(C90086ek.f250487e);
            jVar.copyOnWrite();
            C0015k kVar4 = (C0015k) jVar.instance;
            x.getClass();
            kVar4.f29a |= 4;
            kVar4.f33e = x;
            C0015k kVar5 = (C0015k) jVar.build();
            C0009e eVar = (C0009e) tVar.toBuilder();
            eVar.copyOnWrite();
            C0024t tVar2 = (C0024t) eVar.instance;
            kVar5.getClass();
            tVar2.f70b = kVar5;
            tVar2.f69a |= 1;
            eVar.copyOnWrite();
            C0024t tVar3 = (C0024t) eVar.instance;
            gVar6.getClass();
            tVar3.f73e = gVar6;
            tVar3.f69a |= 8;
            eVar.copyOnWrite();
            C0024t tVar4 = (C0024t) eVar.instance;
            cVar3.getClass();
            tVar4.f72d = cVar3;
            tVar4.f69a |= 4;
            eVar.copyOnWrite();
            C0024t tVar5 = (C0024t) eVar.instance;
            iVar5.getClass();
            tVar5.f71c = iVar5;
            tVar5.f69a |= 2;
            tVar = (C0024t) eVar.build();
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) C117687ai.f326644a.mo56225c()).mo56382g(e)).mo56372aa(18590)).mo56386p("Can't read audio data from file");
        }
        String concat = "https://assistant.google.com/testdrive/".concat(true != aiVar.f326650g.mo79746e(C90086ek.f250308ag) ? "upload_test" : "upload");
        long length = file.length();
        C58100e eVar2 = new C58100e();
        if (str2 != null) {
            eVar2.mo54653d("Authorization", "Bearer ".concat(str2));
        }
        eVar2.mo54653d("X-Goog-Upload-Header-Content-Length", String.valueOf(length));
        C58114s a = C58119x.m88920a(concat, eVar2, bVar, Base64.encodeToString(tVar.toByteArray(), 11));
        C60870cx d = aiVar.f326645b.mo28204d("Upload timeout", 600000, new C117700n(aiVar, bVar, file));
        aiVar.f326657n = new C117683ae(aiVar, bVar, file, d);
        a.mo54663f(aiVar.f326657n, 1048576);
        C90873ag b = C90875ai.m148465b(C117701o.f326685a, d, aiVar.f326645b, "10 minutes timeout");
        b.mo85225c(CancellationException.class, C117702p.f326686a);
        b.mo85223a(new C117703q(aiVar, bVar, file));
        return a.mo54658a();
    }
}
