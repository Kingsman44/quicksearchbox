package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8115f;

import android.graphics.Rect;
import android.view.View;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.sidekick.shared.monet.p7245a.C91764a;
import com.google.android.apps.gsa.sidekick.shared.monet.p7248d.C91820a;
import com.google.android.apps.gsa.sidekick.shared.monet.p7250f.C91825b;
import com.google.android.apps.gsa.sidekick.shared.monet.p7250f.C91826c;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.C105419b;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.f.d */
/* compiled from: PG */
public final class C104855d implements View.OnAttachStateChangeListener, C91764a, C91826c {

    /* renamed from: a */
    public static final C59071e f292196a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.e.f.d");

    /* renamed from: b */
    public final View f292197b;

    /* renamed from: c */
    public boolean f292198c;

    /* renamed from: d */
    public boolean f292199d;

    /* renamed from: e */
    public boolean f292200e;

    /* renamed from: f */
    public boolean f292201f;

    /* renamed from: g */
    public boolean f292202g;

    /* renamed from: h */
    private final C91820a f292203h;

    /* renamed from: i */
    private final C104854c f292204i;

    /* renamed from: j */
    private final float f292205j;

    /* renamed from: k */
    private final Rect f292206k = new Rect();

    /* renamed from: l */
    private final Rect f292207l = new Rect();

    /* renamed from: m */
    private final Rect f292208m = new Rect();

    /* renamed from: n */
    private int f292209n = -1;

    /* renamed from: o */
    private int f292210o = -1;

    /* renamed from: p */
    private final C91825b f292211p;

    /* renamed from: q */
    private final C105419b f292212q;

    public C104855d(View view, C104854c cVar, C105419b bVar, C91825b bVar2, C91820a aVar, float f) {
        this.f292197b = view;
        this.f292204i = cVar;
        this.f292212q = bVar;
        this.f292211p = bVar2;
        this.f292203h = aVar;
        this.f292205j = (f < 0.0f || f > 1.0f) ? 1.0f : f;
    }

    /* renamed from: k */
    public static boolean m173817k(int i) {
        return i != 0;
    }

    /* renamed from: l */
    private final void m173818l() {
        int[] iArr = new int[2];
        this.f292203h.mo86292q(iArr);
        Rect rect = this.f292207l;
        boolean z = false;
        int i = iArr[0];
        rect.set(i, iArr[1], this.f292203h.mo86288l() + i, iArr[1] + this.f292203h.mo86285i());
        int[] iArr2 = new int[2];
        this.f292197b.getLocationOnScreen(iArr2);
        Rect rect2 = this.f292206k;
        int i2 = iArr2[0];
        rect2.set(i2, iArr2[1], this.f292197b.getWidth() + i2, iArr2[1] + this.f292197b.getHeight());
        this.f292209n = (int) (this.f292205j * ((float) this.f292197b.getHeight()));
        this.f292210o = (int) (this.f292205j * ((float) this.f292197b.getWidth()));
        if (C2043bi.m5569aw(this.f292197b) && this.f292199d && !this.f292200e && this.f292206k.width() != 0 && this.f292206k.height() != 0 && this.f292208m.setIntersect(this.f292207l, this.f292206k) && this.f292208m.width() >= this.f292210o && this.f292208m.height() >= this.f292209n) {
            z = true;
        }
        if (this.f292201f != z) {
            this.f292201f = z;
            this.f292204i.mo94369e(z);
        }
    }

    /* renamed from: a */
    public final void mo86255a() {
        this.f292200e = true;
        m173818l();
    }

    /* renamed from: b */
    public final void mo86256b() {
        this.f292200e = false;
        m173818l();
    }

    /* renamed from: c */
    public final void mo86257c() {
    }

    /* renamed from: d */
    public final void mo86258d() {
    }

    /* renamed from: e */
    public final void mo86259e() {
        this.f292199d = true;
        m173818l();
    }

    /* renamed from: f */
    public final void mo86260f() {
        this.f292199d = false;
        m173818l();
    }

    /* renamed from: g */
    public final void mo86306g(String str, int i, int i2) {
        m173818l();
    }

    /* renamed from: h */
    public final void mo86307h(View view, String str, int i) {
        boolean k = m173817k(i);
        if (this.f292202g != k) {
            mo94376i(k);
        }
    }

    /* renamed from: i */
    public final void mo94376i(boolean z) {
        this.f292202g = z;
        this.f292204i.mo94368d(z);
    }

    /* renamed from: j */
    public final void mo94377j() {
        if (this.f292198c) {
            this.f292212q.mo94781c(this);
            this.f292211p.mo86304c(this);
        }
    }

    public final void onViewAttachedToWindow(View view) {
        this.f292212q.mo94779a(this);
        this.f292211p.mo86302a(this);
        m173818l();
    }

    public final void onViewDetachedFromWindow(View view) {
        mo94377j();
        m173818l();
    }
}
