package com.google.android.apps.gsa.staticplugins.opa.p8410s.p8411a;

import android.app.Activity;
import android.content.pm.PackageManager;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.protobuf.C62917ay;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4917a.p4918a.C64165f;
import com.google.protos.youtube.elements.C66059au;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.s.a.m */
/* compiled from: PG */
public final class C109972m implements C21312s {

    /* renamed from: a */
    public final PackageManager f306425a;

    /* renamed from: b */
    public final C21232ab f306426b;

    public C109972m(Activity activity, C21232ab abVar) {
        this.f306425a = activity.getPackageManager();
        this.f306426b = abVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C64165f.f173482e;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C64165f fVar = (C64165f) obj;
        int i = fVar.f173484a;
        if ((i & 1) != 0 && (i & 2) != 0) {
            return C69794a.m101255g(new C109971l(this, fVar));
        }
        C69794a aVar = C69874i.f186267a;
        C69822d dVar = C70101a.f186847o;
        return aVar;
    }
}
