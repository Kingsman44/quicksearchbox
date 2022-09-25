package com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.p8122a;

import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.gsa.sidekick.shared.monet.p7245a.C91764a;
import com.google.android.apps.gsa.sidekick.shared.monet.p7250f.C91826c;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91877a;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91882f;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91883g;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91884h;
import com.google.common.base.C58833ax;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.i.b.a.e */
/* compiled from: PG */
public final class C105004e implements C91764a, C91826c {

    /* renamed from: a */
    public final C58833ax f292560a;

    /* renamed from: b */
    public final C58833ax f292561b;

    /* renamed from: c */
    public final Set f292562c = new HashSet();

    /* renamed from: d */
    public final Map f292563d = new ConcurrentHashMap();

    /* renamed from: e */
    public boolean f292564e;

    /* renamed from: f */
    public int f292565f = 2;

    /* renamed from: g */
    private final C91883g f292566g;

    /* renamed from: h */
    private boolean f292567h;

    /* renamed from: i */
    private boolean f292568i;

    /* renamed from: j */
    private boolean f292569j;

    /* renamed from: k */
    private boolean f292570k;

    /* renamed from: l */
    private boolean f292571l;

    public C105004e(C58833ax axVar, C58833ax axVar2, C91883g gVar) {
        this.f292560a = axVar;
        this.f292561b = axVar2;
        this.f292566g = gVar;
    }

    /* renamed from: i */
    private final void m174122i() {
        if (this.f292569j) {
            this.f292569j = false;
            for (C91882f b : this.f292562c) {
                b.mo86422b(this);
            }
        }
        if (this.f292570k) {
            this.f292570k = false;
            for (C91882f a : this.f292562c) {
                a.mo86421a(this);
            }
        }
        if (this.f292571l) {
            this.f292571l = false;
            for (C91882f c : this.f292562c) {
                c.mo86423c();
            }
        }
    }

    /* renamed from: j */
    private final void m174123j() {
        C91884h hVar;
        for (View view : this.f292563d.keySet()) {
            if (!view.isAttachedToWindow() || !this.f292568i || this.f292567h) {
                hVar = C91884h.INVISIBLE;
            } else {
                Rect rect = new Rect();
                if (!view.getGlobalVisibleRect(rect)) {
                    hVar = C91884h.INVISIBLE;
                } else {
                    int width = view.getWidth() * view.getHeight();
                    int width2 = rect.width() * rect.height();
                    if (width2 == width) {
                        hVar = C91884h.FULLY_VISIBLE;
                    } else if ((width2 * 100) / width >= ((C91877a) this.f292566g).f256199a) {
                        hVar = C91884h.PARTIALLY_VISIBLE;
                    } else {
                        hVar = C91884h.PARTIALLY_INVISIBLE;
                    }
                }
            }
            if (hVar != this.f292563d.get(view)) {
                this.f292569j = true;
                this.f292563d.put(view, hVar);
            }
        }
    }

    /* renamed from: k */
    private final void m174124k(int i) {
        if (this.f292565f != i) {
            this.f292565f = i;
            this.f292570k = true;
        }
    }

    /* renamed from: a */
    public final void mo86255a() {
        this.f292567h = true;
        m174123j();
        m174122i();
    }

    /* renamed from: b */
    public final void mo86256b() {
        this.f292567h = false;
        m174123j();
        m174122i();
    }

    /* renamed from: c */
    public final void mo86257c() {
        this.f292571l = true;
        m174122i();
    }

    /* renamed from: d */
    public final void mo86258d() {
        this.f292571l = false;
    }

    /* renamed from: e */
    public final void mo86259e() {
        this.f292568i = true;
        m174123j();
        m174122i();
    }

    /* renamed from: f */
    public final void mo86260f() {
        this.f292568i = false;
        m174123j();
        m174122i();
    }

    /* renamed from: g */
    public final void mo86306g(String str, int i, int i2) {
        int i3;
        m174123j();
        if (i == 0 && i2 == 0) {
            i3 = 2;
        } else {
            i3 = Math.abs(i2) >= 5 ? 4 : 3;
        }
        m174124k(i3);
        m174122i();
    }

    /* renamed from: h */
    public final void mo86307h(View view, String str, int i) {
        if (i == 0) {
            m174123j();
            m174124k(2);
            m174122i();
        }
    }
}
