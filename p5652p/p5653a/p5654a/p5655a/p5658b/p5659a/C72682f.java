package p5652p.p5653a.p5654a.p5655a.p5658b.p5659a;

import android.support.p033v7.widget.C0628eq;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;

/* renamed from: p.a.a.a.b.a.f */
/* compiled from: PG */
final class C72682f extends C0628eq {

    /* renamed from: b */
    public LinearLayoutManager f193280b;

    /* renamed from: c */
    public C72683g f193281c;

    /* renamed from: d */
    public int f193282d = -1;

    /* renamed from: e */
    public int f193283e = -1;

    /* renamed from: f */
    private int f193284f = -1;

    /* JADX WARNING: Removed duplicated region for block: B:33:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x004f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo2802a(android.support.p033v7.widget.C0653fo r6, int r7, int r8) {
        /*
            r5 = this;
            r0 = -1
            r5.f193284f = r0
            int r1 = r6.getItemCount()
            if (r1 != 0) goto L_0x000a
            return r0
        L_0x000a:
            android.view.View r2 = r5.mo2803b(r6)
            if (r2 != 0) goto L_0x0011
            return r0
        L_0x0011:
            int r2 = r6.getPosition(r2)
            if (r2 != r0) goto L_0x0018
            return r0
        L_0x0018:
            int r3 = r5.f193283e
            if (r3 == r0) goto L_0x0020
            if (r2 != r3) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            return r2
        L_0x0020:
            boolean r6 = r6.canScrollHorizontally()
            r3 = 0
            r4 = 1
            if (r6 == 0) goto L_0x002b
            if (r7 <= 0) goto L_0x002e
            goto L_0x002d
        L_0x002b:
            if (r8 <= 0) goto L_0x002e
        L_0x002d:
            r3 = 1
        L_0x002e:
            android.support.v7.widget.LinearLayoutManager r6 = r5.f193280b
            boolean r6 = r6.getReverseLayout()
            r6 = r6 ^ r3
            if (r4 == r6) goto L_0x0039
            r6 = -1
            goto L_0x003a
        L_0x0039:
            r6 = 1
        L_0x003a:
            if (r2 != 0) goto L_0x003f
            if (r6 == r0) goto L_0x0048
            r6 = 1
        L_0x003f:
            int r7 = r1 + -1
            if (r2 != r7) goto L_0x0047
            if (r6 != r4) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r6 = -1
        L_0x0047:
            int r2 = r2 + r6
        L_0x0048:
            if (r2 == 0) goto L_0x004f
            int r1 = r1 + r0
            if (r2 != r1) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            return r2
        L_0x004f:
            r5.f193284f = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p5652p.p5653a.p5654a.p5655a.p5658b.p5659a.C72682f.mo2802a(android.support.v7.widget.fo, int, int):int");
    }

    /* renamed from: b */
    public final View mo2803b(C0653fo foVar) {
        int i = this.f193284f;
        if (i != -1) {
            return foVar.findViewByPosition(i);
        }
        return super.mo2803b(foVar);
    }

    /* renamed from: g */
    public final void mo3197g(RecyclerView recyclerView) {
        super.mo3197g(recyclerView);
        if (recyclerView != null) {
            this.f193280b = (LinearLayoutManager) recyclerView.mLayout;
            recyclerView.addOnScrollListener(new C72681e(this));
        }
    }
}
