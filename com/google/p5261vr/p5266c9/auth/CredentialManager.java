package com.google.p5261vr.p5266c9.auth;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.vr.c9.auth.CredentialManager */
/* compiled from: PG */
public class CredentialManager {

    /* renamed from: a */
    private static final AtomicReference f184149a = new AtomicReference();

    /* renamed from: b */
    private static final AtomicReference f184150b = new AtomicReference();

    public static String getEmail() {
        return (String) f184149a.get();
    }

    public static String getToken() {
        return (String) f184150b.get();
    }
}
