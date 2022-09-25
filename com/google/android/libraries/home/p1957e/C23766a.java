package com.google.android.libraries.home.p1957e;

import android.content.Context;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* renamed from: com.google.android.libraries.home.e.a */
/* compiled from: PG */
public final class C23766a {

    /* renamed from: a */
    private static final C59071e f65134a = C59071e.m91332i("com.google.android.libraries.home.e.a");

    /* renamed from: b */
    private final Context f65135b;

    /* renamed from: c */
    private CertificateFactory f65136c;

    public C23766a(Context context) {
        this.f65135b = context;
        try {
            this.f65136c = CertificateFactory.getInstance("X.509");
        } catch (CertificateException e) {
            ((C59052c) ((C59052c) ((C59052c) f65134a.mo56226d()).mo56382g(e)).mo56372aa(48674)).mo56386p("Failed to create certificate factory");
        }
    }

    /* renamed from: b */
    private final X509Certificate m44265b(String str) {
        if (this.f65136c != null) {
            InputStream open = this.f65135b.getAssets().open(str);
            try {
                X509Certificate x509Certificate = (X509Certificate) this.f65136c.generateCertificate(open);
                if (open != null) {
                    open.close();
                }
                return x509Certificate;
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        } else {
            throw new CertificateException("Cert factory is null");
        }
        throw th;
    }

    /* renamed from: a */
    public final X509Certificate mo29118a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return m44265b("certs/chromecast_ca.crt");
        }
        if (i2 == 1) {
            return m44265b("certs/cast_root_ca.crt");
        }
        if (i2 == 2) {
            return m44265b("certs/cast_root_ca_s.crt");
        }
        if (i2 != 3) {
            return m44265b("certs/chromecast_gen1_ica.crt");
        }
        return m44265b("certs/vorlon_root_ca.crt");
    }
}
