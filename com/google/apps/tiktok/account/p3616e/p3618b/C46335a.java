package com.google.apps.tiktok.account.p3616e.p3618b;

import com.bumptech.glide.load.C5955n;
import com.google.apps.tiktok.account.data.C46215j;
import java.security.MessageDigest;

/* renamed from: com.google.apps.tiktok.account.e.b.a */
/* compiled from: PG */
public abstract class C46335a implements C5955n {
    /* renamed from: b */
    public abstract C46215j mo50319b();

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        if ((mo50319b().f121156a & 32) != 0) {
            messageDigest.update(mo50319b().f121162g.getBytes(f17613a));
        } else {
            messageDigest.update(mo50319b().f121157b.getBytes(f17613a));
        }
    }
}
