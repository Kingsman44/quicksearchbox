package com.google.common.base;

import java.security.SecureRandom;
import java.util.Random;

/* renamed from: com.google.common.base.bo */
/* compiled from: PG */
public final class C58851bo {

    /* renamed from: a */
    public static final Random f156649a = new C58849bm();

    /* renamed from: b */
    public static final SecureRandom f156650b = m90912a();

    /* renamed from: c */
    public static final ThreadLocal f156651c = new C58848bl();

    static {
        new C58850bn();
    }

    /* renamed from: a */
    public static SecureRandom m90912a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
