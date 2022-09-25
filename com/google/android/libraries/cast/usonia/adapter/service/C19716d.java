package com.google.android.libraries.cast.usonia.adapter.service;

import com.evernote.android.state.BuildConfig;
import com.google.android.gms.usonia.auth.internal.C146145r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p427am.p438d.p439a.C8769cp;
import com.google.p427am.p438d.p439a.C8770cq;
import com.google.p427am.p438d.p439a.C8771cr;
import com.google.p427am.p438d.p439a.C8773ct;
import com.google.p427am.p438d.p439a.C8803dw;
import com.google.p427am.p438d.p439a.C8804dx;
import com.google.p427am.p438d.p439a.C8806dz;
import com.google.p427am.p438d.p439a.C8808ea;
import com.google.p427am.p438d.p439a.C8809eb;
import com.google.p427am.p438d.p439a.C8811ed;
import com.google.p427am.p438d.p439a.C8816j;
import com.google.p427am.p438d.p439a.C8818l;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import java.io.ByteArrayInputStream;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71590q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69586p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.cast.usonia.adapter.service.d */
/* compiled from: PG */
public final class C19716d extends C8816j {

    /* renamed from: a */
    public static final C59071e f54751a = C59071e.m91331h();

    /* renamed from: b */
    public final C146145r f54752b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19716d(C146145r rVar) {
        super(C69586p.f185991a);
        C69664n.m101061g(rVar, "internalAuthClient");
        this.f54752b = rVar;
    }

    /* renamed from: b */
    public final C71587n mo17242b(C8818l lVar) {
        C69664n.m101061g(lVar, "request");
        return C71590q.m104504a(new C19715c(this, (C69577g) null));
    }

    /* renamed from: c */
    public final Object mo17243c(C8769cp cpVar) {
        String str;
        C8770cq cqVar = (C8770cq) C8771cr.f30135c.createBuilder();
        C69664n.m101060f(cqVar, "newBuilder()");
        C8773ct a = C69664n.m101061g(cqVar, "builder");
        C8770cq cqVar2 = a.f30139a;
        cqVar2.copyOnWrite();
        int i = 2;
        ((C8771cr) cqVar2.instance).f30137a = 2;
        C8771cr a2 = a.mo17230a();
        int i2 = cpVar.f30134b;
        if (i2 != 0) {
            i = i2 != 513 ? i2 != 515 ? i2 != 1025 ? i2 != 1027 ? i2 != 1283 ? i2 != 1539 ? 0 : 1541 : 1285 : 1029 : 1027 : 517 : 515;
        }
        if (i == 0) {
            i = 1;
        }
        int i3 = i - 2;
        if (i3 == 513) {
            str = "SHA1withRSA";
        } else if (i3 == 515) {
            str = "SHA1withECDSA";
        } else if (i3 == 1025) {
            str = "SHA256withRSA";
        } else if (i3 == 1027) {
            str = "SHA256withECDSA";
        } else if (i3 != 1283) {
            str = i3 != 1539 ? BuildConfig.FLAVOR : "SHA512withECDSA";
        } else {
            str = "SHA384withECDSA";
        }
        if (str.length() == 0) {
            return a2;
        }
        try {
            byte[] f = this.f54752b.f394893c.mo122678f(cpVar.f30133a.mo59174N(), str);
            C8770cq cqVar3 = (C8770cq) C8771cr.f30135c.createBuilder();
            C69664n.m101060f(cqVar3, "newBuilder()");
            C8773ct a3 = C69664n.m101061g(cqVar3, "builder");
            C63088z A = C63088z.m96139A(f);
            C8770cq cqVar4 = a3.f30139a;
            cqVar4.copyOnWrite();
            ((C8771cr) cqVar4.instance).f30138b = A;
            C8770cq cqVar5 = a3.f30139a;
            cqVar5.copyOnWrite();
            ((C8771cr) cqVar5.instance).f30137a = 0;
            return a3.mo17230a();
        } catch (SignatureException e) {
            C59052c cVar = (C59052c) ((C59052c) f54751a.mo56226d()).mo56382g(e);
            cVar.mo56379ah(new C59094n(47906));
            cVar.mo56386p(BuildConfig.FLAVOR);
            return a2;
        }
    }

    /* renamed from: d */
    public final Object mo17244d(C8806dz dzVar) {
        C8808ea eaVar = (C8808ea) C8809eb.f30193d.createBuilder();
        C69664n.m101060f(eaVar, "newBuilder()");
        C8811ed a = C69664n.m101061g(eaVar, "builder");
        C8808ea eaVar2 = a.f30198a;
        eaVar2.copyOnWrite();
        ((C8809eb) eaVar2.instance).f30195a = 1;
        C8808ea eaVar3 = a.f30198a;
        eaVar3.copyOnWrite();
        ((C8809eb) eaVar3.instance).f30196b = 42;
        C8809eb a2 = a.mo17241a();
        ArrayList arrayList = new ArrayList();
        for (C63088z N : dzVar.f30186a) {
            try {
                Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(N.mo59174N()));
                C69664n.m101059e(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) generateCertificate);
            } catch (CertificateException e) {
                C59052c cVar = (C59052c) ((C59052c) f54751a.mo56226d()).mo56382g(e);
                cVar.mo56379ah(new C59094n(47908));
                cVar.mo56386p(BuildConfig.FLAVOR);
                return a2;
            }
        }
        try {
            C146145r rVar = this.f54752b;
            Object[] array = arrayList.toArray(new X509Certificate[0]);
            C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            X509Certificate[] x509CertificateArr = (X509Certificate[]) array;
            C8804dx dxVar = dzVar.f30187b;
            if (dxVar == null) {
                dxVar = C8804dx.f30181b;
            }
            String str = dxVar.f30183a;
            String a3 = rVar.f394892b.mo122666a(x509CertificateArr);
            if (!a3.isEmpty()) {
                if (!str.isEmpty()) {
                    if (!str.equals(a3)) {
                        throw new CertificateException("The authenticated device ID does not match the expected device ID.");
                    }
                }
                C8808ea eaVar4 = (C8808ea) C8809eb.f30193d.createBuilder();
                C69664n.m101060f(eaVar4, "newBuilder()");
                C8811ed a4 = C69664n.m101061g(eaVar4, "builder");
                C8808ea eaVar5 = a4.f30198a;
                eaVar5.copyOnWrite();
                ((C8809eb) eaVar5.instance).f30195a = 0;
                C8808ea eaVar6 = a4.f30198a;
                eaVar6.copyOnWrite();
                ((C8809eb) eaVar6.instance).f30196b = 0;
                C8803dw dwVar = (C8803dw) C8804dx.f30181b.createBuilder();
                C69664n.m101060f(dwVar, "newBuilder()");
                C69664n.m101061g(dwVar, "builder");
                C69664n.m101060f(a3, "peerDeviceId");
                C69664n.m101061g(a3, "value");
                dwVar.copyOnWrite();
                a3.getClass();
                ((C8804dx) dwVar.instance).f30183a = a3;
                C62942bv build = dwVar.build();
                C69664n.m101060f(build, "_builder.build()");
                C8804dx dxVar2 = (C8804dx) build;
                C69664n.m101061g(dxVar2, "value");
                C8808ea eaVar7 = a4.f30198a;
                eaVar7.copyOnWrite();
                dxVar2.getClass();
                ((C8809eb) eaVar7.instance).f30197c = dxVar2;
                return a4.mo17241a();
            }
            throw new CertificateException("The authenticated device ID is empty.");
        } catch (CertificateException e2) {
            C59052c cVar2 = (C59052c) ((C59052c) f54751a.mo56226d()).mo56382g(e2);
            cVar2.mo56379ah(new C59094n(47907));
            cVar2.mo56386p(BuildConfig.FLAVOR);
            return a2;
        }
    }
}
