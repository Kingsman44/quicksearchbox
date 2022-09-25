package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Intent;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.protos.p4892au.C63826d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.cd */
/* compiled from: PG */
public class C108260cd extends C108229b {

    /* renamed from: a */
    private final String f301158a;

    /* renamed from: b */
    private final C63826d f301159b;

    public C108260cd(C63826d dVar, int i, String str, String str2) {
        super(i, str);
        this.f301159b = dVar;
        this.f301158a = str2;
    }

    /* renamed from: a */
    public final Intent mo96600a() {
        Intent x = C87566i.m142325x(this.f301159b.f172618e);
        C63826d dVar = this.f301159b;
        if ((dVar.f172614a & 2) != 0) {
            x.setPackage(dVar.f172616c);
        }
        return x;
    }

    /* renamed from: b */
    public final String mo96697b() {
        C63826d dVar = this.f301159b;
        return (dVar.f172614a & 16) != 0 ? dVar.f172619f : this.f301158a;
    }

    /* renamed from: f */
    public final String mo96708f() {
        C63826d dVar = this.f301159b;
        return (dVar.f172614a & 4) != 0 ? dVar.f172617d : this.f301598e;
    }
}
