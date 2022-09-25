package com.google.android.libraries.elements.interfaces;

import android.support.p033v7.widget.C0657fs;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.facebook.litho.p329g.p331b.C6308j;
import com.google.android.libraries.elements.p1708c.p1710b.C20747a;
import com.google.common.p4522b.C58485gu;
import com.google.protos.youtube.elements.C66192df;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.p5497e.p5498a.C69826b;

/* renamed from: com.google.android.libraries.elements.interfaces.z */
/* compiled from: PG */
public abstract class C21319z {

    /* renamed from: u */
    public static final C21319z f59680u = m40292B().mo26839p();

    /* renamed from: B */
    public static C21318y m40292B() {
        C21284c cVar = new C21284c();
        cVar.mo26779b(true);
        cVar.f59611i = (byte) (cVar.f59611i | 4);
        cVar.mo26841r(true);
        cVar.f59604b = C21290cf.f59626b;
        cVar.f59606d = new StringBuilder();
        cVar.f59611i = (byte) (1 | cVar.f59611i);
        cVar.mo26779b(false);
        cVar.mo26790m(false);
        cVar.f59608f = BuildConfig.FLAVOR;
        cVar.mo26782e(0);
        cVar.f59607e = BuildConfig.FLAVOR;
        return cVar;
    }

    /* renamed from: A */
    public abstract C20747a mo26797A();

    /* renamed from: C */
    public final C21261bd mo26842C() {
        C21256az h = mo26806h();
        return h != null ? h.mo26722c() : mo26808i();
    }

    /* renamed from: D */
    public final C58485gu mo26843D() {
        C21256az h = mo26806h();
        return h != null ? h.mo26724e() : mo26810k();
    }

    /* renamed from: E */
    public final C66192df mo26844E() {
        if (mo26819t() == null) {
            return null;
        }
        return (C66192df) mo26819t().get();
    }

    /* renamed from: F */
    public final synchronized String mo26845F(String str) {
        StringBuilder s = mo26818s();
        if (s == null) {
            return str;
        }
        return s.toString();
    }

    /* renamed from: G */
    public final synchronized void mo26846G(String... strArr) {
        StringBuilder s = mo26818s();
        if (s != null) {
            for (int i = 0; i < 2; i++) {
                s.append(strArr[i]);
            }
        }
    }

    /* renamed from: H */
    public final boolean mo26847H() {
        C21256az h = mo26806h();
        return h != null ? h.mo26729j() : mo26825y();
    }

    /* renamed from: a */
    public abstract float mo26798a();

    /* renamed from: b */
    public abstract int mo26799b();

    /* renamed from: c */
    public abstract C0657fs mo26800c();

    /* renamed from: d */
    public abstract View mo26801d();

    @Deprecated
    /* renamed from: e */
    public abstract C6308j mo26802e();

    /* renamed from: f */
    public abstract C21318y mo26804f();

    /* renamed from: g */
    public abstract C21238ah mo26805g();

    /* renamed from: h */
    public abstract C21256az mo26806h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C21261bd mo26808i();

    /* renamed from: j */
    public abstract C21290cf mo26809j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract C58485gu mo26810k();

    /* renamed from: l */
    public abstract C69826b mo26811l();

    /* renamed from: m */
    public abstract Integer mo26812m();

    /* renamed from: n */
    public abstract Integer mo26813n();

    /* renamed from: o */
    public abstract String mo26814o();

    /* renamed from: p */
    public abstract String mo26815p();

    /* renamed from: q */
    public abstract String mo26816q();

    /* renamed from: r */
    public abstract String mo26817r();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract StringBuilder mo26818s();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract WeakReference mo26819t();

    /* renamed from: u */
    public abstract WeakReference mo26821u();

    /* renamed from: v */
    public abstract AtomicReference mo26822v();

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract boolean mo26823w();

    /* renamed from: x */
    public abstract boolean mo26824x();

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract boolean mo26825y();

    /* renamed from: z */
    public abstract boolean mo26826z();
}
