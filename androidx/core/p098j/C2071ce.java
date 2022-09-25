package androidx.core.p098j;

import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.C1926c;

/* renamed from: androidx.core.j.ce */
/* compiled from: PG */
public class C2071ce extends C2073cg {

    /* renamed from: a */
    final WindowInsets.Builder f5973a;

    public C2071ce() {
        this.f5973a = new WindowInsets.Builder();
    }

    /* renamed from: a */
    public C2082cp mo5208a() {
        mo5215h();
        C2082cp h = C2082cp.m5717h(this.f5973a.build(), (View) null);
        h.f5994b.mo5223g(this.f5975b);
        return h;
    }

    /* renamed from: b */
    public void mo5209b(C1926c cVar) {
        this.f5973a.setMandatorySystemGestureInsets(cVar.mo5069a());
    }

    /* renamed from: c */
    public void mo5210c(C1926c cVar) {
        this.f5973a.setStableInsets(cVar.mo5069a());
    }

    /* renamed from: d */
    public void mo5211d(C1926c cVar) {
        this.f5973a.setSystemGestureInsets(cVar.mo5069a());
    }

    /* renamed from: e */
    public void mo5212e(C1926c cVar) {
        this.f5973a.setSystemWindowInsets(cVar.mo5069a());
    }

    /* renamed from: f */
    public void mo5213f(C1926c cVar) {
        this.f5973a.setTappableElementInsets(cVar.mo5069a());
    }

    public C2071ce(C2082cp cpVar) {
        super(cpVar);
        WindowInsets.Builder builder;
        WindowInsets e = cpVar.mo5243e();
        if (e != null) {
            builder = new WindowInsets.Builder(e);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.f5973a = builder;
    }
}
