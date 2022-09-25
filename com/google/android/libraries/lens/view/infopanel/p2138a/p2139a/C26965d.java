package com.google.android.libraries.lens.view.infopanel.p2138a.p2139a;

import com.evernote.android.state.BuildConfig;
import com.google.p4017at.p4056g.p4057a.p4058a.C53967ab;
import com.google.p4017at.p4056g.p4057a.p4058a.C53968ac;
import com.google.p4017at.p4056g.p4057a.p4058a.C54073y;

/* renamed from: com.google.android.libraries.lens.view.infopanel.a.a.d */
/* compiled from: PG */
public abstract class C26965d {
    /* renamed from: e */
    public static C26964c m50009e() {
        C26962a aVar = new C26962a();
        aVar.f73522a = BuildConfig.FLAVOR;
        aVar.f73523b = BuildConfig.FLAVOR;
        aVar.mo32401c(C53967ab.f141600b);
        aVar.mo32400b(C54073y.f141880b);
        return aVar;
    }

    /* renamed from: f */
    public static C26965d m50010f(C53968ac acVar) {
        C54073y yVar;
        C26964c e = m50009e();
        e.mo32402d(acVar.f141607c);
        String str = acVar.f141608d;
        if (str != null) {
            ((C26962a) e).f73523b = str;
            C53967ab abVar = acVar.f141609e;
            if (abVar == null) {
                abVar = C53967ab.f141600b;
            }
            e.mo32401c(abVar);
            if (acVar.f141605a == 12) {
                yVar = (C54073y) acVar.f141606b;
            } else {
                yVar = C54073y.f141880b;
            }
            e.mo32400b(yVar);
            return e.mo32399a();
        }
        throw new NullPointerException("Null subtitle");
    }

    /* renamed from: g */
    public static C26965d m50011g() {
        C26964c e = m50009e();
        ((C26962a) e).f73522a = BuildConfig.FLAVOR;
        return e.mo32399a();
    }

    /* renamed from: a */
    public abstract C54073y mo32403a();

    /* renamed from: b */
    public abstract C53967ab mo32404b();

    /* renamed from: c */
    public abstract String mo32405c();

    /* renamed from: d */
    public abstract String mo32406d();

    /* renamed from: h */
    public final boolean mo32410h() {
        return mo32406d().equals(BuildConfig.FLAVOR);
    }
}
