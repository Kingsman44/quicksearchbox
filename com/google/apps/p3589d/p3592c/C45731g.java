package com.google.apps.p3589d.p3592c;

import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3593d.C45763v;
import com.google.apps.p3589d.p3600k.C45945j;
import java.util.Iterator;

/* renamed from: com.google.apps.d.c.g */
/* compiled from: PG */
public abstract class C45731g implements Iterable {
    /* renamed from: e */
    public static final C45731g m81513e(C45763v vVar, int i, int i2, boolean z) {
        int min = Math.min(i2, vVar.f120342a.f120220a.size());
        boolean z2 = false;
        if (i >= 0 && i <= min) {
            z2 = true;
        }
        C45945j.m82040b(z2, "false");
        return new C45725a(vVar, i, min - i, z);
    }

    /* renamed from: l */
    public static final C45731g m81514l(C45763v vVar) {
        return m81513e(vVar, 0, vVar.f120342a.f120220a.size(), true);
    }

    /* renamed from: a */
    public abstract int mo49836a();

    /* renamed from: b */
    public abstract int mo49837b();

    /* renamed from: c */
    public abstract C45763v mo49838c();

    /* renamed from: d */
    public abstract boolean mo49839d();

    /* renamed from: f */
    public final C45731g mo49851f(int i, int i2) {
        return mo49852g(mo49837b() + i, mo49837b() + i2);
    }

    /* renamed from: g */
    public final C45731g mo49852g(int i, int i2) {
        boolean z = true;
        C45945j.m82040b(mo49837b() <= i && i <= i2, "false");
        if (!mo49839d() && i2 >= mo49837b() + mo49836a()) {
            z = false;
        }
        return m81513e(mo49838c(), i, i2, z);
    }

    /* renamed from: h */
    public final C45755n mo49853h() {
        if (mo49857k()) {
            return null;
        }
        return mo49856j(mo49837b());
    }

    /* renamed from: i */
    public final C45755n mo49854i(int i) {
        boolean z = false;
        if (i >= 0 && i < mo49836a()) {
            z = true;
        }
        C45945j.m82041c(z);
        return mo49856j(mo49837b() + i);
    }

    public final Iterator iterator() {
        return new C45730f(this);
    }

    /* renamed from: j */
    public final C45755n mo49856j(int i) {
        C45755n a = mo49838c().mo49895a(i);
        return (i + 1 != mo49837b() + mo49836a() || mo49839d()) ? a : a.mo49886b((C45763v) null, (C45763v) null);
    }

    /* renamed from: k */
    public final boolean mo49857k() {
        return mo49836a() == 0;
    }
}
