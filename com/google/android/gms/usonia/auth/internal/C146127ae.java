package com.google.android.gms.usonia.auth.internal;

import com.google.android.gms.usonia.p10877a.C146110c;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.p4715m.p4716a.p4717a.p4718a.C62650c;
import com.google.p4715m.p4716a.p4717a.p4718a.C62656i;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import org.p5623b.p5624a.C72060bm;
import org.p5623b.p5624a.p5628c.C72076b;
import org.p5623b.p5624a.p5628c.C72077c;
import org.p5623b.p5629b.C72131f;

/* renamed from: com.google.android.gms.usonia.auth.internal.ae */
/* compiled from: PG */
public final class C146127ae {

    /* renamed from: a */
    public static final C59071e f394872a = C59071e.m91332i("com.google.android.gms.usonia.auth.internal.ae");

    /* renamed from: b */
    public final C146148u f394873b = new C146148u();

    /* renamed from: c */
    private final C62656i f394874c;

    /* renamed from: d */
    private final C146126ad f394875d;

    public C146127ae(C146110c cVar) {
        C146126ad adVar = new C146126ad();
        this.f394875d = adVar;
        C58485gu guVar = C62656i.f169165a;
        this.f394874c = C62650c.m94890a(adVar, false, 7);
    }

    /* renamed from: a */
    public final String mo122666a(X509Certificate[] x509CertificateArr) {
        if (r0 == 0) {
            throw new CertificateException("Certificate malformed.");
        } else if (r0 == 1) {
            return this.f394873b.mo122699b(x509CertificateArr[0]);
        } else {
            ArrayList arrayList = new ArrayList();
            for (X509Certificate encoded : x509CertificateArr) {
                arrayList.add(encoded.getEncoded());
            }
            if (!this.f394874c.mo58574b(arrayList, System.currentTimeMillis() / 1000).mo56113h()) {
                C146126ad adVar = this.f394875d;
                if (adVar.f394870a != null) {
                    String str = adVar.f394871b;
                    if (str == null) {
                        throw null;
                    }
                    throw new CertificateException(str, adVar.f394870a);
                }
                throw new AssertionError("Certificate did not verify, but no callback present");
            } else if (x509CertificateArr.length == 1) {
                return this.f394873b.mo122699b(x509CertificateArr[0]);
            } else {
                C72077c a = C72076b.m105518a(x509CertificateArr[0].getEncoded()).f191872b.f191890j.mo63262a(C146147t.f394903a);
                if (a != null) {
                    return C72131f.m105664b(C72060bm.m105466i(a.f191876d.mo63236k()).f191857a);
                }
                throw new CertificateException("Device certificate has no device ID");
            }
        }
    }
}
