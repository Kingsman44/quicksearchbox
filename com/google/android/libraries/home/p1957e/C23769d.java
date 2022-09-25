package com.google.android.libraries.home.p1957e;

import androidx.p060c.C0979i;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4715m.p4716a.p4717a.p4718a.C62650c;
import com.google.p4715m.p4716a.p4717a.p4718a.C62656i;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.libraries.home.e.d */
/* compiled from: PG */
public final class C23769d {

    /* renamed from: a */
    public static final C59071e f65138a = C59071e.m91332i("com.google.android.libraries.home.e.d");

    /* renamed from: b */
    public static C23769d f65139b;

    /* renamed from: h */
    private static boolean f65140h;

    /* renamed from: c */
    public final CertPathValidator f65141c = m44273f();

    /* renamed from: d */
    public final Set f65142d;

    /* renamed from: e */
    public final Supplier f65143e;

    /* renamed from: f */
    public final C23770e f65144f;

    /* renamed from: g */
    public final C23772g f65145g;

    /* renamed from: i */
    private final List f65146i = m44274g();

    /* renamed from: j */
    private final X509Certificate f65147j;

    /* renamed from: k */
    private final X509Certificate f65148k;

    /* renamed from: l */
    private final X509Certificate f65149l;

    /* renamed from: m */
    private final X509Certificate f65150m;

    /* renamed from: n */
    private final X509Certificate f65151n;

    private C23769d(Supplier supplier, C23766a aVar, C23770e eVar, C23772g gVar) {
        C0979i iVar = new C0979i(0);
        this.f65142d = iVar;
        this.f65143e = supplier;
        this.f65144f = eVar;
        this.f65145g = gVar;
        System.getProperties().setProperty("org.bouncycastle.asn1.allow_unsafe_integer", "true");
        X509Certificate a = aVar.mo29118a(1);
        this.f65147j = a;
        X509Certificate a2 = aVar.mo29118a(2);
        this.f65148k = a2;
        X509Certificate a3 = aVar.mo29118a(3);
        this.f65149l = a3;
        X509Certificate a4 = aVar.mo29118a(4);
        this.f65150m = a4;
        this.f65151n = aVar.mo29118a(5);
        iVar.add(new TrustAnchor(a, (byte[]) null));
        iVar.add(new TrustAnchor(a2, (byte[]) null));
        iVar.add(new TrustAnchor(a3, (byte[]) null));
        iVar.add(new TrustAnchor(a4, (byte[]) null));
    }

    /* renamed from: a */
    public static synchronized C23769d m44269a() {
        C23769d dVar;
        synchronized (C23769d.class) {
            dVar = f65139b;
        }
        return dVar;
    }

    /* renamed from: b */
    public static C23772g m44270b() {
        C23768c cVar = new C23768c();
        C58485gu guVar = C62656i.f169165a;
        return new C23772g(C62650c.m94890a(cVar, true, 1));
    }

    /* renamed from: d */
    public static synchronized void m44271d(Supplier supplier, C23766a aVar, C23770e eVar, C23772g gVar) {
        synchronized (C23769d.class) {
            if (!f65140h) {
                try {
                    f65139b = new C23769d(supplier, aVar, eVar, gVar);
                } catch (CertificateException e) {
                    e = e;
                } catch (IOException e2) {
                    e = e2;
                } catch (IllegalArgumentException e3) {
                    ((C59052c) ((C59052c) ((C59052c) f65138a.mo56226d()).mo56382g(e3)).mo56372aa(48689)).mo56386p("Error loading certs");
                }
                f65140h = true;
            }
            return;
        }
        ((C59052c) ((C59052c) ((C59052c) f65138a.mo56226d()).mo56382g(e)).mo56372aa(48688)).mo56386p("Failed to create certificate validator");
        f65140h = true;
    }

    /* renamed from: e */
    private final CertPath m44272e(List list) {
        for (CertificateFactory certificateFactory : this.f65146i) {
            try {
                return certificateFactory.generateCertPath(list);
            } catch (CertificateException e) {
                ((C59052c) ((C59052c) ((C59052c) f65138a.mo56225c()).mo56382g(e)).mo56372aa(48678)).mo56389s("Certificate exception using provider %s", certificateFactory.getProvider().getName());
            }
        }
        ((C59052c) ((C59052c) f65138a.mo56225c()).mo56372aa(48677)).mo56386p("Certificate path is invalid!");
        throw new CertificateException("Certificate path is invalid!");
    }

    /* renamed from: f */
    private static CertPathValidator m44273f() {
        if (Security.getProvider("BC") != null) {
            try {
                return CertPathValidator.getInstance("PKIX", "BC");
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) f65138a.mo56225c()).mo56382g(e)).mo56372aa(48679)).mo56386p("Error acquiring certificate path validator for provider BC!");
            }
        }
        try {
            return CertPathValidator.getInstance("PKIX");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static List m44274g() {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            if (Security.getProvider(str) != null) {
                try {
                    arrayList.add(CertificateFactory.getInstance("X.509", str));
                } catch (Exception e) {
                    ((C59052c) ((C59052c) ((C59052c) f65138a.mo56226d()).mo56382g(e)).mo56372aa(48684)).mo56389s("Error acquiring certificate factory for provider %s!", str);
                }
            }
        }
        if (arrayList.isEmpty()) {
            try {
                arrayList.add(CertificateFactory.getInstance("X.509"));
            } catch (CertificateException e2) {
                ((C59052c) ((C59052c) ((C59052c) f65138a.mo56225c()).mo56382g(e2)).mo56372aa(48683)).mo56386p("Error loading the default certificate factory.");
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final CertPath mo29124c(X509Certificate x509Certificate, Collection collection) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(x509Certificate);
        if (!collection.isEmpty()) {
            arrayList.addAll(collection);
        } else {
            arrayList.add(this.f65151n);
        }
        return m44272e(arrayList);
    }
}
