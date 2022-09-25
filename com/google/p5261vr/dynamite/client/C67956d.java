package com.google.p5261vr.dynamite.client;

/* renamed from: com.google.vr.dynamite.client.d */
/* compiled from: PG */
public final class C67956d extends Exception {

    /* renamed from: a */
    private final int f184162a = 1;

    public final String getMessage() {
        String str = this.f184162a != 1 ? "Unknown error" : "Package not available";
        return "LoaderException{" + str + "}";
    }
}
