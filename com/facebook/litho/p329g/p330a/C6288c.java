package com.facebook.litho.p329g.p330a;

import android.support.p033v7.p040e.C0422d;
import com.facebook.litho.C6154cb;
import com.facebook.litho.p329g.C6336o;
import java.util.List;

/* renamed from: com.facebook.litho.g.a.c */
/* compiled from: PG */
final class C6288c extends C0422d {

    /* renamed from: a */
    private final List f18560a;

    /* renamed from: b */
    private final List f18561b;

    /* renamed from: c */
    private final C6336o f18562c;

    /* renamed from: d */
    private final C6154cb f18563d;

    /* renamed from: e */
    private final C6154cb f18564e;

    public C6288c(C6336o oVar, List list, List list2) {
        C6154cb cbVar;
        this.f18562c = oVar;
        int i = C6287b.f18554r;
        C6154cb cbVar2 = null;
        if (oVar.mo13351n() == null) {
            cbVar = null;
        } else {
            cbVar = ((C6287b) oVar.mo13351n()).f18558p;
        }
        this.f18563d = cbVar;
        this.f18564e = oVar.mo13351n() != null ? ((C6287b) oVar.mo13351n()).f18557o : cbVar2;
        this.f18560a = list;
        this.f18561b = list2;
    }

    /* renamed from: a */
    public final int mo1379a() {
        List list = this.f18561b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: b */
    public final int mo1380b() {
        List list = this.f18560a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: d */
    public final boolean mo1382d(int i, int i2) {
        Object obj = this.f18560a.get(i);
        Object obj2 = this.f18561b.get(i2);
        if (obj == obj2) {
            return true;
        }
        C6154cb cbVar = this.f18564e;
        if (cbVar == null) {
            return obj.equals(obj2);
        }
        C6291f fVar = new C6291f();
        fVar.f18567a = obj;
        fVar.f18568b = obj2;
        return ((Boolean) cbVar.f18197b.mo13127l().mo12795N(cbVar, fVar)).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo1383e(int i, int i2) {
        return mo13293f(this.f18560a.get(i), this.f18561b.get(i2));
    }

    /* renamed from: f */
    public final boolean mo13293f(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        C6154cb cbVar = this.f18563d;
        if (cbVar == null) {
            return obj.equals(obj2);
        }
        C6292g gVar = new C6292g();
        gVar.f18569a = obj;
        gVar.f18570b = obj2;
        return ((Boolean) cbVar.f18197b.mo13127l().mo12795N(cbVar, gVar)).booleanValue();
    }
}
