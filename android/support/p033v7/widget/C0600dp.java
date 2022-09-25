package android.support.p033v7.widget;

import android.view.View;
import java.util.List;

/* renamed from: android.support.v7.widget.dp */
/* compiled from: PG */
final class C0600dp {

    /* renamed from: a */
    boolean f2320a = true;

    /* renamed from: b */
    int f2321b;

    /* renamed from: c */
    int f2322c;

    /* renamed from: d */
    int f2323d;

    /* renamed from: e */
    int f2324e;

    /* renamed from: f */
    int f2325f;

    /* renamed from: g */
    int f2326g;

    /* renamed from: h */
    int f2327h = 0;

    /* renamed from: i */
    int f2328i = 0;

    /* renamed from: j */
    boolean f2329j = false;

    /* renamed from: k */
    int f2330k;

    /* renamed from: l */
    List f2331l = null;

    /* renamed from: m */
    boolean f2332m;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo2788a(C0661fw fwVar) {
        List list = this.f2331l;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((C0673gh) this.f2331l.get(i)).itemView;
                C0654fp fpVar = (C0654fp) view.getLayoutParams();
                if (!fpVar.f2420c.isRemoved() && this.f2323d == fpVar.f2420c.getLayoutPosition()) {
                    mo2789b(view);
                    return view;
                }
            }
            return null;
        }
        View p = fwVar.mo3039p(this.f2323d);
        this.f2323d += this.f2324e;
        return p;
    }

    /* renamed from: b */
    public final void mo2789b(View view) {
        int layoutPosition;
        int size = this.f2331l.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            View view3 = ((C0673gh) this.f2331l.get(i2)).itemView;
            C0654fp fpVar = (C0654fp) view3.getLayoutParams();
            if (view3 != view && !fpVar.f2420c.isRemoved() && (layoutPosition = (fpVar.f2420c.getLayoutPosition() - this.f2323d) * this.f2324e) >= 0 && layoutPosition < i) {
                if (layoutPosition == 0) {
                    view2 = view3;
                    break;
                } else {
                    view2 = view3;
                    i = layoutPosition;
                }
            }
            i2++;
        }
        if (view2 == null) {
            this.f2323d = -1;
        } else {
            this.f2323d = ((C0654fp) view2.getLayoutParams()).f2420c.getLayoutPosition();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo2790c(C0670ge geVar) {
        int i = this.f2323d;
        return i >= 0 && i < geVar.mo3052a();
    }
}
