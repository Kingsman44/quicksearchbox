package com.google.android.libraries.lens.view.srpx.p2170a;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.lens.p4694a.C62097cv;

/* renamed from: com.google.android.libraries.lens.view.srpx.a.d */
/* compiled from: PG */
public abstract class C28033d {
    /* renamed from: h */
    public static C28032c m52240h(int i) {
        C28030a aVar = new C28030a();
        aVar.f76296g = i;
        aVar.f76297h = 1;
        return aVar;
    }

    /* renamed from: i */
    public static C28032c m52241i(C62097cv cvVar) {
        C58833ax axVar;
        C58833ax axVar2;
        C58833ax axVar3;
        C58833ax axVar4;
        C58833ax axVar5;
        C28032c h = m52240h(90588);
        C28030a aVar = (C28030a) h;
        aVar.f76290a = C58833ax.m90834k(cvVar.f167707b);
        if ((cvVar.f167706a & 2) != 0) {
            axVar = C58833ax.m90834k(cvVar.f167708c);
        } else {
            axVar = C58836b.f156633a;
        }
        aVar.f76292c = axVar;
        if ((cvVar.f167706a & 8) != 0) {
            axVar2 = C58833ax.m90834k(cvVar.f167709d);
        } else {
            axVar2 = C58836b.f156633a;
        }
        aVar.f76293d = axVar2;
        if ((cvVar.f167706a & 64) != 0) {
            axVar3 = C58833ax.m90834k(cvVar.f167712g);
        } else {
            axVar3 = C58836b.f156633a;
        }
        aVar.f76295f = axVar3;
        if ((cvVar.f167706a & 16) != 0) {
            axVar4 = C58833ax.m90834k(cvVar.f167710e);
        } else {
            axVar4 = C58836b.f156633a;
        }
        aVar.f76291b = axVar4;
        if ((cvVar.f167706a & 32) != 0) {
            axVar5 = C58833ax.m90834k(Integer.valueOf(cvVar.f167711f));
        } else {
            axVar5 = C58836b.f156633a;
        }
        aVar.f76294e = axVar5;
        return h;
    }

    /* renamed from: a */
    public abstract int mo33487a();

    /* renamed from: b */
    public abstract C58833ax mo33488b();

    /* renamed from: c */
    public abstract C58833ax mo33489c();

    /* renamed from: d */
    public abstract C58833ax mo33490d();

    /* renamed from: e */
    public abstract C58833ax mo33491e();

    /* renamed from: f */
    public abstract C58833ax mo33493f();

    /* renamed from: g */
    public abstract C58833ax mo33494g();

    public final String toString() {
        return String.format("SrpModel: %s", new Object[]{mo33490d().mo56109e("null")});
    }
}
