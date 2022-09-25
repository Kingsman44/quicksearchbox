package com.google.android.libraries.onegoogle.p2378b.p2379a;

import com.bumptech.glide.load.C5955n;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.p2378b.C30833j;
import java.security.MessageDigest;

/* renamed from: com.google.android.libraries.onegoogle.b.a.j */
/* compiled from: PG */
public abstract class C30821j implements C5955n {
    /* renamed from: c */
    public static C30821j m57556c(Object obj, C30158c cVar) {
        return new C30812a(C30833j.m57584g(obj, cVar));
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        messageDigest.update(mo36519b().mo36521a().getBytes(f17613a));
    }

    /* renamed from: b */
    public abstract C30833j mo36519b();

    public final String toString() {
        String obj = super.toString();
        return "j:" + obj;
    }
}
