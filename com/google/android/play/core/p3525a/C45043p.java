package com.google.android.play.core.p3525a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.p3529c.C45053a;
import com.google.android.play.core.p3533e.C45079k;
import com.google.android.play.core.p3542h.C45192a;
import com.google.android.play.core.p3542h.C45195d;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.google.android.play.core.a.p */
/* compiled from: PG */
final class C45043p {

    /* renamed from: a */
    public static final C45053a f117671a = new C45053a("AppUpdateService");

    /* renamed from: f */
    private static final Intent f117672f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: b */
    C45079k f117673b;

    /* renamed from: c */
    public final String f117674c;

    /* renamed from: d */
    public final Context f117675d;

    /* renamed from: e */
    public final C45045r f117676e;

    public C45043p(Context context, C45045r rVar) {
        this.f117674c = context.getPackageName();
        this.f117675d = context;
        this.f117676e = rVar;
        if (C45195d.m80473a(context)) {
            this.f117673b = new C45079k(C45192a.m80471a(context), f117671a, "AppUpdateService", f117672f, C45039l.f117663a);
        }
    }

    /* renamed from: a */
    public static int m80191a(Bundle bundle) {
        return bundle.getInt("error.code", -2);
    }

    /* renamed from: b */
    public static HashSet m80192b(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }
}
