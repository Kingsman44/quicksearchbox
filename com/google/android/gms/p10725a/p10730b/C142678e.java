package com.google.android.gms.p10725a.p10730b;

import android.util.Log;
import com.google.android.gms.libs.p10836d.p10838b.C144858b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.android.gms.a.b.e */
/* compiled from: PG */
public final class C142678e {
    /* renamed from: a */
    public static final void m231502a(String str) {
        HttpURLConnection httpURLConnection;
        try {
            C144857a aVar = C144858b.f391708a;
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                Log.w("HttpUrlPinger", "Received non-success response code " + responseCode + " from pinging URL: " + str);
            }
            httpURLConnection.disconnect();
            C144857a aVar2 = C144858b.f391708a;
        } catch (IndexOutOfBoundsException e) {
            String message = e.getMessage();
            Log.w("HttpUrlPinger", "Error while parsing ping URL: " + str + ". " + message, e);
            C144857a aVar3 = C144858b.f391708a;
        } catch (IOException | RuntimeException e2) {
            try {
                String message2 = e2.getMessage();
                Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + message2, e2);
            } finally {
                C144857a aVar4 = C144858b.f391708a;
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
