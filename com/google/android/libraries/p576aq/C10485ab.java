package com.google.android.libraries.p576aq;

import android.os.Handler;
import android.os.Looper;
import com.google.common.base.C58893dc;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: com.google.android.libraries.aq.ab */
/* compiled from: PG */
public final class C10485ab {

    /* renamed from: a */
    private static int f35254a;

    /* renamed from: b */
    private static final Deque f35255b = new ArrayDeque();

    /* renamed from: c */
    private static final C10485ab f35256c = new C10485ab(C58485gu.m89845m(), "BASE");

    /* renamed from: d */
    private static final Handler f35257d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private final C58485gu f35258e;

    /* renamed from: f */
    private final String f35259f;

    /* renamed from: g */
    private final Runnable f35260g;

    private C10485ab(C58485gu guVar, String str) {
        this.f35258e = guVar;
        this.f35259f = str;
        f35254a++;
        this.f35260g = new C10484aa(str);
    }

    /* renamed from: a */
    public static C10485ab m25462a(String str) {
        m25464e();
        C10485ab b = m25463b();
        C58480gp gpVar = new C58480gp(4);
        gpVar.mo55396h(b.f35258e);
        gpVar.mo55395g(b);
        return new C10485ab(gpVar.mo55394f(), str);
    }

    /* renamed from: b */
    static C10485ab m25463b() {
        m25464e();
        C10485ab abVar = (C10485ab) f35255b.peek();
        C58893dc.m90996a(abVar);
        return abVar;
    }

    /* renamed from: e */
    private static void m25464e() {
        Deque deque = f35255b;
        if (deque.isEmpty()) {
            deque.push(f35256c);
        }
    }

    /* renamed from: c */
    public final void mo18521c() {
        C10485ab abVar = (C10485ab) f35255b.pop();
        if (abVar == this) {
            f35257d.removeCallbacks(this.f35260g);
            return;
        }
        String str = this.f35259f;
        String str2 = abVar.f35259f;
        throw new IllegalStateException("Unbalanced calls to start and end. Expected \"" + str + "\" but got \"" + str2 + "\"");
    }

    /* renamed from: d */
    public final void mo18522d() {
        Deque deque = f35255b;
        if (!deque.contains(this)) {
            deque.push(this);
            f35257d.postDelayed(this.f35260g, 500);
            return;
        }
        throw new IllegalStateException("The SourceGroup is already started");
    }
}
