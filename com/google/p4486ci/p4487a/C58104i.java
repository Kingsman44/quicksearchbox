package com.google.p4486ci.p4487a;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.google.ci.a.i */
/* compiled from: PG */
public final class C58104i {
    /* renamed from: a */
    public static final C58114s m88864a(String str, String str2, C58100e eVar, C58097b bVar) {
        try {
            return new C58103h((HttpURLConnection) new URL(str).openConnection(), str2, eVar, bVar);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Url is malformed.", e);
        } catch (IOException e2) {
            throw new IllegalStateException("Http connection could not be created.", e2);
        }
    }
}
