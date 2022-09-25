package com.google.android.play.core.p3534f.p3535a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.play.core.p3534f.C45097e;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* renamed from: com.google.android.play.core.f.a.e */
/* compiled from: PG */
public final class C45086e {

    /* renamed from: a */
    public final C45097e f117748a;

    /* renamed from: b */
    public final C45085d f117749b;

    /* renamed from: c */
    private final Context f117750c;

    /* renamed from: d */
    private PackageInfo f117751d;

    public C45086e(Context context, C45097e eVar) {
        C45085d dVar = new C45085d();
        this.f117748a = eVar;
        this.f117750c = context;
        this.f117749b = dVar;
    }

    /* renamed from: b */
    public static X509Certificate m80250b(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e) {
            Log.e("SplitCompat", "Cannot decode certificate.", e);
            return null;
        }
    }

    /* renamed from: a */
    public final PackageInfo mo48918a() {
        if (this.f117751d == null) {
            try {
                this.f117751d = this.f117750c.getPackageManager().getPackageInfo(this.f117750c.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.f117751d;
    }
}
