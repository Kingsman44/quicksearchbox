package com.google.android.libraries.cast.usonia.adapter.service;

import com.google.android.gms.usonia.DeviceInfo;
import com.google.android.gms.usonia.directory.C146208b;
import com.google.android.libraries.cast.usonia.adapter.p1674a.C19702a;
import com.google.android.libraries.cast.usonia.adapter.p1674a.C19703b;
import com.google.common.p4526f.C59071e;
import com.google.p427am.p438d.p439a.C8774cu;
import com.google.p427am.p438d.p439a.C8775cv;
import com.google.p427am.p438d.p439a.C8777cx;
import com.google.p427am.p438d.p439a.C8799ds;
import com.google.p427am.p438d.p439a.C8800dt;
import com.google.p427am.p438d.p439a.C8802dv;
import com.google.protobuf.C63088z;
import com.google.protobuf.p4746a.C62882a;
import kotlinx.coroutines.p5573a.C71367au;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.cast.usonia.adapter.service.e */
/* compiled from: PG */
public final class C19717e extends C146208b {

    /* renamed from: a */
    private final C71367au f54753a;

    public C19717e(C71367au auVar) {
        C69664n.m101061g(auVar, "sendChannel");
        this.f54753a = auVar;
    }

    /* renamed from: a */
    public final void mo25087a(DeviceInfo deviceInfo) {
        C69664n.m101061g(deviceInfo, "device");
        C71367au auVar = this.f54753a;
        C59071e eVar = C19723k.f54768a;
        C8799ds dsVar = (C8799ds) C8800dt.f30177b.createBuilder();
        C69664n.m101060f(dsVar, "newBuilder()");
        C8802dv a = C69664n.m101061g(dsVar, "builder");
        a.mo17240c();
        C8774cu cuVar = (C8774cu) C8775cv.f30140g.createBuilder();
        C69664n.m101060f(cuVar, "newBuilder()");
        C8777cx a2 = C69664n.m101061g(cuVar, "builder");
        a2.mo17232b(C19703b.m37519b(deviceInfo));
        C8774cu cuVar2 = a2.f30148a;
        cuVar2.copyOnWrite();
        ((C8775cv) cuVar2.instance).f30146e = true;
        a.mo17239b(a2.mo17231a());
        C19702a.m37517a(auVar, eVar, a.mo17238a());
    }

    /* renamed from: b */
    public final void mo25088b(DeviceInfo deviceInfo, String str, byte[] bArr, boolean z) {
        C69664n.m101061g(deviceInfo, "device");
        C69664n.m101061g(str, "type");
        C69664n.m101061g(bArr, "stateData");
        C71367au auVar = this.f54753a;
        C59071e eVar = C19723k.f54768a;
        C8799ds dsVar = (C8799ds) C8800dt.f30177b.createBuilder();
        C69664n.m101060f(dsVar, "newBuilder()");
        C8802dv a = C69664n.m101061g(dsVar, "builder");
        a.mo17240c();
        C8774cu cuVar = (C8774cu) C8775cv.f30140g.createBuilder();
        C69664n.m101060f(cuVar, "newBuilder()");
        C8777cx a2 = C69664n.m101061g(cuVar, "builder");
        a2.mo17232b(C19703b.m37519b(deviceInfo));
        a2.mo17233c(str);
        C63088z a3 = C62882a.m94955a(bArr);
        C8774cu cuVar2 = a2.f30148a;
        cuVar2.copyOnWrite();
        ((C8775cv) cuVar2.instance).f30144c = a3;
        C8774cu cuVar3 = a2.f30148a;
        cuVar3.copyOnWrite();
        ((C8775cv) cuVar3.instance).f30147f = z;
        a.mo17239b(a2.mo17231a());
        C19702a.m37517a(auVar, eVar, a.mo17238a());
    }

    /* renamed from: c */
    public final void mo25089c(String str) {
        C69664n.m101061g(str, "type");
        C71367au auVar = this.f54753a;
        C59071e eVar = C19723k.f54768a;
        C8799ds dsVar = (C8799ds) C8800dt.f30177b.createBuilder();
        C69664n.m101060f(dsVar, "newBuilder()");
        C8802dv a = C69664n.m101061g(dsVar, "builder");
        a.mo17240c();
        C8774cu cuVar = (C8774cu) C8775cv.f30140g.createBuilder();
        C69664n.m101060f(cuVar, "newBuilder()");
        C8777cx a2 = C69664n.m101061g(cuVar, "builder");
        a2.mo17233c(str);
        C8774cu cuVar2 = a2.f30148a;
        cuVar2.copyOnWrite();
        ((C8775cv) cuVar2.instance).f30145d = true;
        a.mo17239b(a2.mo17231a());
        C19702a.m37517a(auVar, eVar, a.mo17238a());
    }
}
