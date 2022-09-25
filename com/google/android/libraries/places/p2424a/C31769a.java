package com.google.android.libraries.places.p2424a;

import android.content.pm.Signature;
import android.util.Log;
import com.google.common.p4541l.C59326i;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.libraries.places.a.a */
/* compiled from: PG */
public final class C31769a {
    /* renamed from: a */
    public static String m59119a(Signature signature) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-1").digest(signature.toByteArray());
            return C59326i.f157519g.mo56837l(digest, digest.length);
        } catch (NoSuchAlgorithmException e) {
            Log.e("CredentialsHelper", "Unable to get certificate fingerprint.", e);
            return null;
        }
    }
}
