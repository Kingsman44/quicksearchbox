package androidx.viewpager2.widget;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0642fd;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.p099a.C1981aa;
import androidx.core.p098j.p099a.C1988h;
import androidx.core.p098j.p099a.C1989i;
import androidx.core.p098j.p099a.C1990j;
import androidx.core.p098j.p099a.C1991k;

/* renamed from: androidx.viewpager2.widget.t */
/* compiled from: PG */
final class C4317t extends C4309l {

    /* renamed from: a */
    final /* synthetic */ ViewPager2 f13939a;

    /* renamed from: b */
    private final C1981aa f13940b = new C4314q(this);

    /* renamed from: c */
    private final C1981aa f13941c = new C4315r(this);

    /* renamed from: d */
    private C0642fd f13942d;

    public C4317t(ViewPager2 viewPager2) {
        this.f13939a = viewPager2;
    }

    /* renamed from: b */
    public final String mo9241b() {
        return "androidx.viewpager.widget.ViewPager";
    }

    /* renamed from: c */
    public final void mo9242c(C0640fb fbVar) {
        mo9261v();
        if (fbVar != null) {
            fbVar.mObservable.registerObserver(this.f13942d);
        }
    }

    /* renamed from: d */
    public final void mo9243d(C0640fb fbVar) {
        if (fbVar != null) {
            fbVar.mObservable.unregisterObserver(this.f13942d);
        }
    }

    /* renamed from: e */
    public final void mo9244e(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        int itemCount;
        C1991k kVar = new C1991k(accessibilityNodeInfo);
        ViewPager2 viewPager2 = this.f13939a;
        if (viewPager2.f13896f.mAdapter == null) {
            i = 0;
            i2 = 0;
        } else if (viewPager2.mo9209a() == 1) {
            i = this.f13939a.f13896f.mAdapter.getItemCount();
            i2 = 1;
        } else {
            i2 = this.f13939a.f13896f.mAdapter.getItemCount();
            i = 1;
        }
        kVar.mo5154c(C1989i.m5331a(i, i2, false, 0));
        C0640fb fbVar = this.f13939a.f13896f.mAdapter;
        if (fbVar != null && (itemCount = fbVar.getItemCount()) != 0) {
            ViewPager2 viewPager22 = this.f13939a;
            if (viewPager22.f13899i) {
                if (viewPager22.f13893c > 0) {
                    kVar.f5921a.addAction(8192);
                }
                if (this.f13939a.f13893c < itemCount - 1) {
                    kVar.f5921a.addAction(4096);
                }
                kVar.f5921a.setScrollable(true);
            }
        }
    }

    /* renamed from: g */
    public final void mo9246g(View view, C1991k kVar) {
        kVar.mo5155d(C1990j.m5333a(this.f13939a.mo9209a() == 1 ? this.f13939a.f13895e.getPosition(view) : 0, 1, this.f13939a.mo9209a() == 0 ? this.f13939a.f13895e.getPosition(view) : 0, 1, false, false));
    }

    /* renamed from: h */
    public final void mo9247h() {
        mo9261v();
    }

    /* renamed from: i */
    public final void mo9248i(AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setSource(this.f13939a);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    /* renamed from: j */
    public final void mo9249j() {
        mo9261v();
    }

    /* renamed from: k */
    public final void mo9250k() {
        mo9261v();
    }

    /* renamed from: l */
    public final void mo9251l() {
        mo9261v();
    }

    /* renamed from: m */
    public final void mo9252m() {
        mo9261v();
    }

    /* renamed from: n */
    public final boolean mo9253n() {
        return true;
    }

    /* renamed from: r */
    public final boolean mo9257r(int i) {
        return i == 8192 || i == 4096;
    }

    /* renamed from: s */
    public final void mo9258s(RecyclerView recyclerView) {
        C2043bi.m5551ae(recyclerView, 2);
        this.f13942d = new C4316s(this);
        if (C2043bi.m5575d(this.f13939a) == 0) {
            C2043bi.m5551ae(this.f13939a, 1);
        }
    }

    /* renamed from: t */
    public final boolean mo9259t(int i) {
        int i2;
        if (mo9257r(i)) {
            if (i == 8192) {
                i2 = this.f13939a.f13893c - 1;
            } else {
                i2 = this.f13939a.f13893c + 1;
            }
            mo9260u(i2);
            return true;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo9260u(int i) {
        ViewPager2 viewPager2 = this.f13939a;
        if (viewPager2.f13899i) {
            viewPager2.mo9214d(i, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo9261v() {
        int itemCount;
        ViewPager2 viewPager2 = this.f13939a;
        int i = 16908360;
        C2043bi.m5522P(viewPager2, 16908360);
        C2043bi.m5522P(viewPager2, 16908361);
        C2043bi.m5522P(viewPager2, 16908358);
        C2043bi.m5522P(viewPager2, 16908359);
        C0640fb fbVar = this.f13939a.f13896f.mAdapter;
        if (fbVar != null && (itemCount = fbVar.getItemCount()) != 0) {
            ViewPager2 viewPager22 = this.f13939a;
            if (viewPager22.f13899i) {
                if (viewPager22.mo9209a() == 0) {
                    boolean i2 = this.f13939a.mo9221i();
                    int i3 = true != i2 ? 16908361 : 16908360;
                    if (true == i2) {
                        i = 16908361;
                    }
                    if (this.f13939a.f13893c < itemCount - 1) {
                        C2043bi.m5523Q(viewPager2, new C1988h((Object) null, i3, (CharSequence) null, (C1981aa) null, (Class) null), (CharSequence) null, this.f13940b);
                    }
                    if (this.f13939a.f13893c > 0) {
                        C2043bi.m5523Q(viewPager2, new C1988h((Object) null, i, (CharSequence) null, (C1981aa) null, (Class) null), (CharSequence) null, this.f13941c);
                        return;
                    }
                    return;
                }
                if (this.f13939a.f13893c < itemCount - 1) {
                    C2043bi.m5523Q(viewPager2, new C1988h((Object) null, 16908359, (CharSequence) null, (C1981aa) null, (Class) null), (CharSequence) null, this.f13940b);
                }
                if (this.f13939a.f13893c > 0) {
                    C2043bi.m5523Q(viewPager2, new C1988h((Object) null, 16908358, (CharSequence) null, (C1981aa) null, (Class) null), (CharSequence) null, this.f13941c);
                }
            }
        }
    }
}
