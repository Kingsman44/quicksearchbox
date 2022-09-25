package com.google.firebase.iid;

import android.util.Base64;
import com.google.android.gms.cloudmessaging.C143696w;
import com.google.firebase.C61204g;
import com.google.firebase.installations.C61256h;
import com.google.firebase.p4611d.C61174a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.firebase.iid.j */
/* compiled from: PG */
public final class C61218j {

    /* renamed from: a */
    public final C61204g f165595a;

    /* renamed from: b */
    public final C61220l f165596b;

    /* renamed from: c */
    public final C143696w f165597c;

    /* renamed from: d */
    public final C61174a f165598d;

    /* renamed from: e */
    public final C61174a f165599e;

    /* renamed from: f */
    public final C61256h f165600f;

    public C61218j(C61204g gVar, C61220l lVar, C61174a aVar, C61174a aVar2, C61256h hVar) {
        gVar.mo57770f();
        C143696w wVar = new C143696w(gVar.f165555c);
        this.f165595a = gVar;
        this.f165596b = lVar;
        this.f165597c = wVar;
        this.f165598d = aVar;
        this.f165599e = aVar2;
        this.f165600f = hVar;
    }

    /* renamed from: a */
    public final String mo57788a() {
        C61204g gVar = this.f165595a;
        gVar.mo57770f();
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar.f165556d.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }
}
