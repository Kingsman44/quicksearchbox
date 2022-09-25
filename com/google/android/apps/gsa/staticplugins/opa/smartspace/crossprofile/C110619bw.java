package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import android.content.Context;
import com.google.android.enterprise.connectedapps.C142563c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.bw */
/* compiled from: PG */
public final class C110619bw {

    /* renamed from: a */
    public static final C59071e f308288a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.bw");

    /* renamed from: b */
    private final C110633ci f308289b;

    public C110619bw(C110633ci ciVar) {
        this.f308289b = ciVar;
    }

    /* renamed from: a */
    public final C60870cx mo98817a() {
        C110629ce ceVar;
        C110633ci ciVar = this.f308289b;
        if (ciVar.f308299a.mo117178i().mo117185a().mo117171a()) {
            Context context = ((C142563c) ciVar.f308299a).f386843a;
            C110627cc ccVar = C110627cc.f308292a;
            ceVar = new C110625ca(C110627cc.m184311a(((C142563c) ciVar.f308299a).f386843a));
        } else {
            ceVar = new C110628cd(ciVar.f308299a);
        }
        C60870cx a = ceVar.mo98821a();
        C60856cj.m92911t(a, new C110618bv(), C60826bg.f164896a);
        return a;
    }
}
