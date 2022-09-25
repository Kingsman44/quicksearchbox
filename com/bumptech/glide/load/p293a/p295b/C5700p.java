package com.bumptech.glide.load.p293a.p295b;

import com.bumptech.glide.p291h.p292a.C5608d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.bumptech.glide.load.a.b.p */
/* compiled from: PG */
final class C5700p implements C5608d {
    /* renamed from: b */
    public static final C5701q m14778b() {
        try {
            return new C5701q(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12054a() {
        return m14778b();
    }
}
