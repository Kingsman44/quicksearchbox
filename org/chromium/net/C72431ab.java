package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import org.chromium.base.C72387m;

/* renamed from: org.chromium.net.ab */
/* compiled from: PG */
final class C72431ab extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if ("android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction()) || "android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction()) || ("android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) && !intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false))) {
            try {
                X509Util.reloadDefaultTrustManager();
            } catch (CertificateException e) {
                C72387m.m107041b("X509Util", "Unable to reload the default TrustManager", e);
            } catch (KeyStoreException e2) {
                C72387m.m107041b("X509Util", "Unable to reload the default TrustManager", e2);
            } catch (NoSuchAlgorithmException e3) {
                C72387m.m107041b("X509Util", "Unable to reload the default TrustManager", e3);
            }
        }
    }
}
