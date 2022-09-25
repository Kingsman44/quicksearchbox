package android.support.p033v7.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.fh */
/* compiled from: PG */
public abstract class C0646fh {

    /* renamed from: a */
    private final ArrayList f2407a = new ArrayList();

    /* renamed from: h */
    public long f2408h = 120;

    /* renamed from: i */
    public long f2409i = 120;

    /* renamed from: j */
    public long f2410j = 250;

    /* renamed from: k */
    public long f2411k = 250;

    /* renamed from: l */
    public C0647fi f2412l = null;

    /* renamed from: w */
    static void m2290w(C0673gh ghVar) {
        int i = ghVar.mFlags;
        if (!ghVar.isInvalid() && (i & 4) == 0) {
            int i2 = ghVar.mOldPosition;
            ghVar.getAbsoluteAdapterPosition();
        }
    }

    /* renamed from: c */
    public abstract void mo2687c(C0673gh ghVar);

    /* renamed from: d */
    public abstract void mo2688d();

    /* renamed from: e */
    public abstract void mo2689e();

    /* renamed from: j */
    public boolean mo2694j(C0673gh ghVar, List list) {
        return mo2895s(ghVar);
    }

    /* renamed from: k */
    public abstract boolean mo2695k();

    /* renamed from: m */
    public final void mo2889m(C0673gh ghVar) {
        C0647fi fiVar = this.f2412l;
        if (fiVar != null) {
            boolean z = true;
            ghVar.setIsRecyclable(true);
            if (ghVar.mShadowedHolder != null && ghVar.mShadowingHolder == null) {
                ghVar.mShadowedHolder = null;
            }
            ghVar.mShadowingHolder = null;
            if ((ghVar.mFlags & 16) == 0) {
                RecyclerView recyclerView = fiVar.f2413a;
                View view = ghVar.itemView;
                recyclerView.startInterceptRequestLayout();
                C0550bt btVar = recyclerView.mChildHelper;
                int indexOfChild = btVar.f2143c.f2402a.indexOfChild(view);
                if (indexOfChild == -1) {
                    btVar.mo2612l(view);
                } else if (btVar.f2141a.mo2598f(indexOfChild)) {
                    btVar.f2141a.mo2599g(indexOfChild);
                    btVar.mo2612l(view);
                    btVar.f2143c.mo2863b(indexOfChild);
                } else {
                    z = false;
                }
                if (z) {
                    C0673gh childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                    recyclerView.mRecycler.mo3037n(childViewHolderInt);
                    recyclerView.mRecycler.mo3034k(childViewHolderInt);
                }
                recyclerView.stopInterceptRequestLayout(!z);
                if (!z && ghVar.isTmpDetached()) {
                    fiVar.f2413a.removeDetachedView(ghVar.itemView, false);
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo2890n() {
        int size = this.f2407a.size();
        for (int i = 0; i < size; i++) {
            ((C0644ff) this.f2407a.get(i)).mo2887a();
        }
        this.f2407a.clear();
    }

    /* renamed from: o */
    public abstract boolean mo2891o(C0673gh ghVar, C0645fg fgVar, C0645fg fgVar2);

    /* renamed from: p */
    public abstract boolean mo2892p(C0673gh ghVar, C0673gh ghVar2, C0645fg fgVar, C0645fg fgVar2);

    /* renamed from: q */
    public abstract boolean mo2893q(C0673gh ghVar, C0645fg fgVar, C0645fg fgVar2);

    /* renamed from: r */
    public abstract boolean mo2894r(C0673gh ghVar, C0645fg fgVar, C0645fg fgVar2);

    /* renamed from: s */
    public boolean mo2895s(C0673gh ghVar) {
        throw null;
    }

    /* renamed from: t */
    public final boolean mo2896t(C0644ff ffVar) {
        boolean k = mo2695k();
        if (ffVar != null) {
            if (!k) {
                ffVar.mo2887a();
            } else {
                this.f2407a.add(ffVar);
            }
        }
        return k;
    }

    /* renamed from: u */
    public C0645fg mo2897u(C0673gh ghVar) {
        C0645fg fgVar = new C0645fg();
        fgVar.mo2888a(ghVar);
        return fgVar;
    }

    /* renamed from: v */
    public C0645fg mo2898v(C0673gh ghVar) {
        C0645fg fgVar = new C0645fg();
        fgVar.mo2888a(ghVar);
        return fgVar;
    }
}
