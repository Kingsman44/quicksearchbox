package android.support.p033v7.widget;

import android.content.Context;
import android.support.p033v7.view.menu.C0474n;
import android.support.p033v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* renamed from: android.support.v7.widget.eg */
/* compiled from: PG */
public final class C0618eg extends C0578cu {

    /* renamed from: c */
    final int f2373c;

    /* renamed from: d */
    final int f2374d;

    /* renamed from: e */
    public C0614ec f2375e;

    /* renamed from: f */
    private MenuItem f2376f;

    public C0618eg(Context context, boolean z) {
        super(context, z);
        if (C0617ef.m2194a(context.getResources().getConfiguration()) == 1) {
            this.f2373c = 21;
            this.f2374d = 22;
            return;
        }
        this.f2373c = 22;
        this.f2374d = 21;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: android.support.v7.view.menu.j} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r3 = (r3 = pointToPosition((int) r9.getX(), (int) r9.getY())) - r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onHoverEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            android.support.v7.widget.ec r0 = r8.f2375e
            if (r0 == 0) goto L_0x00bd
            android.widget.ListAdapter r0 = r8.getAdapter()
            boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
            r2 = 0
            if (r1 == 0) goto L_0x001a
            android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
            int r1 = r0.getHeadersCount()
            android.widget.ListAdapter r0 = r0.getWrappedAdapter()
            android.support.v7.view.menu.n r0 = (android.support.p033v7.view.menu.C0474n) r0
            goto L_0x001d
        L_0x001a:
            android.support.v7.view.menu.n r0 = (android.support.p033v7.view.menu.C0474n) r0
            r1 = 0
        L_0x001d:
            int r3 = r9.getAction()
            r4 = 10
            r5 = -1
            r6 = 0
            if (r3 == r4) goto L_0x0045
            float r3 = r9.getX()
            int r3 = (int) r3
            float r4 = r9.getY()
            int r4 = (int) r4
            int r3 = r8.pointToPosition(r3, r4)
            if (r3 == r5) goto L_0x0045
            int r3 = r3 - r1
            if (r3 < 0) goto L_0x0045
            int r1 = r0.getCount()
            if (r3 >= r1) goto L_0x0045
            android.support.v7.view.menu.t r1 = r0.getItem(r3)
            goto L_0x0046
        L_0x0045:
            r1 = r6
        L_0x0046:
            android.view.MenuItem r3 = r8.f2376f
            if (r3 == r1) goto L_0x00bd
            android.support.v7.view.menu.q r0 = r0.f1643a
            if (r3 == 0) goto L_0x005f
            android.support.v7.widget.ec r3 = r8.f2375e
            android.support.v7.widget.eh r3 = (android.support.p033v7.widget.C0619eh) r3
            android.support.v7.widget.ec r3 = r3.f2377a
            if (r3 == 0) goto L_0x005f
            android.support.v7.view.menu.i r3 = (android.support.p033v7.view.menu.C0469i) r3
            android.support.v7.view.menu.k r3 = r3.f1606a
            android.os.Handler r3 = r3.f1610a
            r3.removeCallbacksAndMessages(r0)
        L_0x005f:
            r8.f2376f = r1
            if (r1 == 0) goto L_0x00bd
            android.support.v7.widget.ec r3 = r8.f2375e
            android.support.v7.widget.eh r3 = (android.support.p033v7.widget.C0619eh) r3
            android.support.v7.widget.ec r3 = r3.f2377a
            if (r3 == 0) goto L_0x00bd
            android.support.v7.view.menu.i r3 = (android.support.p033v7.view.menu.C0469i) r3
            android.support.v7.view.menu.k r4 = r3.f1606a
            android.os.Handler r4 = r4.f1610a
            r4.removeCallbacksAndMessages(r6)
            android.support.v7.view.menu.k r4 = r3.f1606a
            java.util.List r4 = r4.f1611b
            int r4 = r4.size()
        L_0x007c:
            if (r2 >= r4) goto L_0x008f
            android.support.v7.view.menu.k r7 = r3.f1606a
            java.util.List r7 = r7.f1611b
            java.lang.Object r7 = r7.get(r2)
            android.support.v7.view.menu.j r7 = (android.support.p033v7.view.menu.C0470j) r7
            android.support.v7.view.menu.q r7 = r7.f1608b
            if (r0 == r7) goto L_0x0090
            int r2 = r2 + 1
            goto L_0x007c
        L_0x008f:
            r2 = -1
        L_0x0090:
            if (r2 != r5) goto L_0x0093
            goto L_0x00bd
        L_0x0093:
            int r2 = r2 + 1
            android.support.v7.view.menu.k r4 = r3.f1606a
            java.util.List r4 = r4.f1611b
            int r4 = r4.size()
            if (r2 >= r4) goto L_0x00aa
            android.support.v7.view.menu.k r4 = r3.f1606a
            java.util.List r4 = r4.f1611b
            java.lang.Object r2 = r4.get(r2)
            r6 = r2
            android.support.v7.view.menu.j r6 = (android.support.p033v7.view.menu.C0470j) r6
        L_0x00aa:
            android.support.v7.view.menu.h r2 = new android.support.v7.view.menu.h
            r2.<init>(r3, r6, r1, r0)
            long r4 = android.os.SystemClock.uptimeMillis()
            android.support.v7.view.menu.k r1 = r3.f1606a
            android.os.Handler r1 = r1.f1610a
            r6 = 200(0xc8, double:9.9E-322)
            long r4 = r4 + r6
            r1.postAtTime(r2, r0, r4)
        L_0x00bd:
            boolean r9 = super.onHoverEvent(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0618eg.onHoverEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C0474n nVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f2373c) {
            if (listMenuItemView.isEnabled() && listMenuItemView.f1518a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.f2374d) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                nVar = (C0474n) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                nVar = (C0474n) adapter;
            }
            nVar.f1643a.mo1657g(false);
            return true;
        }
    }
}
