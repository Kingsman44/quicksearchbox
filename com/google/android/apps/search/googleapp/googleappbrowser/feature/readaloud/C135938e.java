package com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4541l.C59326i;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.e */
/* compiled from: PG */
public final class C135938e {
    /* renamed from: a */
    public static String m220590a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            if (!(packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length == 0)) {
                if (packageInfo.signatures[0] != null) {
                    byte[] digest = MessageDigest.getInstance("SHA1").digest(packageInfo.signatures[0].toByteArray());
                    return C59326i.f157519g.mo56825e().mo56837l(digest, digest.length);
                }
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
        }
        return BuildConfig.FLAVOR;
    }
}
