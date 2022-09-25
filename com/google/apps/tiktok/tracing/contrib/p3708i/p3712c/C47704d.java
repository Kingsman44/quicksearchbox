package com.google.apps.tiktok.tracing.contrib.p3708i.p3712c;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.C4268a;
import com.google.android.apps.search.googleapp.stampviewer.viewpager.C139491b;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47562bm;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.tracing.contrib.i.c.d */
/* compiled from: PG */
public final class C47704d extends C4268a {

    /* renamed from: c */
    final /* synthetic */ C4268a f123663c;

    /* renamed from: d */
    final /* synthetic */ String f123664d = "StampViewerFragmentPeer StampViewerViewPagerAdapter";

    /* renamed from: e */
    final /* synthetic */ C47707g f123665e;

    public C47704d(C47707g gVar, C4268a aVar) {
        this.f123665e = gVar;
        this.f123663c = aVar;
        aVar.f13843a.registerObserver(new C47703c(this));
    }

    /* renamed from: b */
    public final void mo51558b() {
        super.mo9178n();
    }

    /* renamed from: d */
    public final void mo646d(ViewGroup viewGroup, int i, Object obj) {
        if (C47831fm.m85027v()) {
            this.f123663c.mo646d(viewGroup, i, obj);
            return;
        }
        C47538ax e = this.f123665e.f123669a.mo51615e(this.f123664d.concat(":destroyItem"), C47562bm.f123426a);
        try {
            this.f123663c.mo646d(viewGroup, i, obj);
            if (e != null) {
                e.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47702b.m84841a(th, th);
        }
        throw th;
    }

    /* renamed from: g */
    public final void mo647g(ViewGroup viewGroup, int i, Object obj) {
        if (C47831fm.m85027v()) {
            this.f123663c.mo647g(viewGroup, i, obj);
            return;
        }
        C47538ax e = this.f123665e.f123669a.mo51615e(this.f123664d.concat(":setPrimaryItem"), C47562bm.f123426a);
        try {
            this.f123663c.mo647g(viewGroup, i, obj);
            if (e != null) {
                e.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47702b.m84841a(th, th);
        }
        throw th;
    }

    /* renamed from: gv */
    public final Parcelable mo648gv() {
        return this.f123663c.mo648gv();
    }

    /* renamed from: gw */
    public final Object mo649gw(ViewGroup viewGroup, int i) {
        if (C47831fm.m85027v()) {
            return this.f123663c.mo649gw(viewGroup, i);
        }
        C47538ax e = this.f123665e.f123669a.mo51615e(this.f123664d.concat(":instantiateItem"), C47562bm.f123426a);
        try {
            Object gw = this.f123663c.mo649gw(viewGroup, i);
            if (e != null) {
                e.close();
            }
            return gw;
        } catch (Throwable th) {
            C47702b.m84841a(th, th);
        }
        throw th;
    }

    /* renamed from: gx */
    public final void mo650gx(ViewGroup viewGroup) {
        if (C47831fm.m85027v()) {
            this.f123663c.mo650gx(viewGroup);
            return;
        }
        C47538ax e = this.f123665e.f123669a.mo51615e(this.f123664d.concat(":finishUpdate"), C47562bm.f123426a);
        try {
            this.f123663c.mo650gx(viewGroup);
            if (e != null) {
                e.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47702b.m84841a(th, th);
        }
        throw th;
    }

    /* renamed from: h */
    public final void mo651h(ViewGroup viewGroup) {
        if (C47831fm.m85027v()) {
            this.f123663c.mo651h(viewGroup);
            return;
        }
        C47538ax e = this.f123665e.f123669a.mo51615e(this.f123664d.concat(":startUpdate"), C47562bm.f123426a);
        try {
            this.f123663c.mo651h(viewGroup);
            if (e != null) {
                e.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47702b.m84841a(th, th);
        }
        throw th;
    }

    /* renamed from: i */
    public final boolean mo652i(View view, Object obj) {
        return this.f123663c.mo652i(view, obj);
    }

    /* renamed from: j */
    public final float mo9174j(int i) {
        return 1.0f;
    }

    /* renamed from: jT */
    public final void mo653jT(Parcelable parcelable, ClassLoader classLoader) {
        this.f123663c.mo653jT(parcelable, classLoader);
    }

    /* renamed from: k */
    public final int mo9175k() {
        return ((C139491b) this.f123663c).f379275c.mo114890a();
    }

    /* renamed from: l */
    public final int mo9176l(Object obj) {
        return -1;
    }

    /* renamed from: m */
    public final CharSequence mo9177m(int i) {
        return null;
    }

    /* renamed from: n */
    public final void mo9178n() {
        this.f123663c.mo9178n();
    }
}
