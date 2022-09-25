package com.google.android.libraries.cast.usonia.adapter.service;

import com.google.android.gms.usonia.PeerAddress;
import com.google.android.gms.usonia.directory.C146209c;
import com.google.android.libraries.cast.usonia.adapter.p1674a.C19702a;
import com.google.android.libraries.cast.usonia.adapter.p1674a.C19703b;
import com.google.common.p4526f.C59071e;
import com.google.p427am.p438d.p439a.C8751by;
import com.google.p427am.p438d.p439a.C8786df;
import com.google.p427am.p438d.p439a.C8787dg;
import com.google.p427am.p438d.p439a.C8788dh;
import com.google.p427am.p438d.p439a.C8790dj;
import com.google.p427am.p438d.p439a.C8792dl;
import com.google.p427am.p438d.p439a.C8794dn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.p5573a.C71367au;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.cast.usonia.adapter.service.l */
/* compiled from: PG */
public final class C19724l extends C146209c {

    /* renamed from: a */
    private final C71367au f54771a;

    public C19724l(C71367au auVar) {
        C69664n.m101061g(auVar, "sendChannel");
        this.f54771a = auVar;
    }

    /* renamed from: a */
    public final void mo25090a(String str, PeerAddress peerAddress) {
        C69664n.m101061g(str, "serviceName");
        C69664n.m101061g(peerAddress, "address");
        C71367au auVar = this.f54771a;
        C59071e eVar = C19710ab.f54740a;
        C8786df dfVar = (C8786df) C8790dj.f30166b.createBuilder();
        C69664n.m101060f(dfVar, "newBuilder()");
        C8794dn a = C69664n.m101061g(dfVar, "builder");
        a.mo17237c();
        C8787dg dgVar = (C8787dg) C8788dh.f30161c.createBuilder();
        C69664n.m101060f(dgVar, "newBuilder()");
        C8792dl a2 = C69664n.m101061g(dgVar, "builder");
        List unmodifiableList = Collections.unmodifiableList(((C8788dh) a2.f30169a.instance).f30163a);
        C69664n.m101060f(unmodifiableList, "_builder.getPeersAddedList()");
        new C62883b(unmodifiableList);
        C8751by c = C19703b.m37520c(peerAddress);
        C69664n.m101061g(c, "value");
        C8787dg dgVar2 = a2.f30169a;
        dgVar2.copyOnWrite();
        C8788dh dhVar = (C8788dh) dgVar2.instance;
        c.getClass();
        C62971cq cqVar = dhVar.f30163a;
        if (!cqVar.mo58948c()) {
            dhVar.f30163a = C62942bv.mutableCopy(cqVar);
        }
        dhVar.f30163a.add(c);
        a.mo17236b(str, a2.mo17234a());
        C19702a.m37517a(auVar, eVar, a.mo17235a());
    }

    /* renamed from: b */
    public final void mo25091b(String str, PeerAddress peerAddress) {
        C69664n.m101061g(str, "serviceName");
        C69664n.m101061g(peerAddress, "address");
        C71367au auVar = this.f54771a;
        C59071e eVar = C19710ab.f54740a;
        C8786df dfVar = (C8786df) C8790dj.f30166b.createBuilder();
        C69664n.m101060f(dfVar, "newBuilder()");
        C8794dn a = C69664n.m101061g(dfVar, "builder");
        a.mo17237c();
        C8787dg dgVar = (C8787dg) C8788dh.f30161c.createBuilder();
        C69664n.m101060f(dgVar, "newBuilder()");
        C8792dl a2 = C69664n.m101061g(dgVar, "builder");
        List unmodifiableList = Collections.unmodifiableList(((C8788dh) a2.f30169a.instance).f30164b);
        C69664n.m101060f(unmodifiableList, "_builder.getPeersRemovedList()");
        new C62883b(unmodifiableList);
        C8751by c = C19703b.m37520c(peerAddress);
        C69664n.m101061g(c, "value");
        C8787dg dgVar2 = a2.f30169a;
        dgVar2.copyOnWrite();
        C8788dh dhVar = (C8788dh) dgVar2.instance;
        c.getClass();
        C62971cq cqVar = dhVar.f30164b;
        if (!cqVar.mo58948c()) {
            dhVar.f30164b = C62942bv.mutableCopy(cqVar);
        }
        dhVar.f30164b.add(c);
        a.mo17236b(str, a2.mo17234a());
        C19702a.m37517a(auVar, eVar, a.mo17235a());
    }
}
