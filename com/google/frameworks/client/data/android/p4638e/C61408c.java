package com.google.frameworks.client.data.android.p4638e;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.common.p4541l.C59326i;
import com.google.frameworks.client.data.android.p4641h.C61485f;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;

/* renamed from: com.google.frameworks.client.data.android.e.c */
/* compiled from: PG */
public final class C61408c extends C61410e {

    /* renamed from: a */
    static final C70297cz f166065a = new C70290cs("X-Goog-Api-Key", C70334de.f187481c);

    /* renamed from: b */
    static final C70297cz f166066b = new C70290cs("X-Android-Package", C70334de.f187481c);

    /* renamed from: c */
    static final C70297cz f166067c = new C70290cs("X-Android-Cert", C70334de.f187481c);

    /* renamed from: d */
    public static volatile C46423aj f166068d = null;

    /* renamed from: e */
    public final String f166069e;

    /* renamed from: f */
    public final boolean f166070f;

    public C61408c(String str, boolean z) {
        this.f166069e = str;
        this.f166070f = z;
    }

    /* renamed from: b */
    public static String m93986b(PackageManager packageManager, String str) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return "signature_for_test";
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length == 0 || packageInfo.signatures[0] == null) {
                throw new IllegalStateException("Found no signatures");
            }
            byte[] digest = MessageDigest.getInstance("SHA1").digest(packageInfo.signatures[0].toByteArray());
            return C59326i.f157519g.mo56825e().mo56837l(digest, digest.length);
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException e) {
            throw new RuntimeException("Could not get application signature", e);
        }
    }

    /* renamed from: a */
    public final C61485f mo39490a() {
        return new C61407b(this);
    }
}
