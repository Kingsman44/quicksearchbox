package com.google.p5238v.p5239a.p5243b.p5244a;

import java.util.logging.Level;

/* renamed from: com.google.v.a.b.a.a */
/* compiled from: PG */
public final class C67543a {
    /* renamed from: a */
    public static boolean m97645a(int i) {
        Boolean bool;
        if (i - 1 == 0) {
            return !C67544b.m97646a();
        }
        if (C67544b.m97646a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke((Object) null, new Object[0]);
            } catch (Exception unused) {
                C67544b.f183461a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                bool = false;
            }
            return bool.booleanValue();
        }
    }
}
