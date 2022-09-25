package android.support.p033v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.p098j.C2043bi;

/* renamed from: android.support.v7.view.menu.ad */
/* compiled from: PG */
public class C0450ad {

    /* renamed from: a */
    public View f1553a;

    /* renamed from: b */
    public int f1554b = 8388611;

    /* renamed from: c */
    public PopupWindow.OnDismissListener f1555c;

    /* renamed from: d */
    private final Context f1556d;

    /* renamed from: e */
    private final C0477q f1557e;

    /* renamed from: f */
    private final boolean f1558f;

    /* renamed from: g */
    private final int f1559g;

    /* renamed from: h */
    private boolean f1560h;

    /* renamed from: i */
    private C0451ae f1561i;

    /* renamed from: j */
    private C0447aa f1562j;

    /* renamed from: k */
    private final PopupWindow.OnDismissListener f1563k = new C0448ab(this);

    public C0450ad(Context context, C0477q qVar, View view, boolean z, int i) {
        this.f1556d = context;
        this.f1557e = qVar;
        this.f1553a = view;
        this.f1558f = z;
        this.f1559g = i;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [android.support.v7.view.menu.k] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.support.p033v7.view.menu.C0447aa mo1534a() {
        /*
            r11 = this;
            android.support.v7.view.menu.aa r0 = r11.f1562j
            if (r0 != 0) goto L_0x006f
            android.content.Context r0 = r11.f1556d
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            android.support.p033v7.view.menu.C0449ac.m1489a(r0, r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r11.f1556d
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165256(0x7f070048, float:1.7944724E38)
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x003f
            android.support.v7.view.menu.k r0 = new android.support.v7.view.menu.k
            android.content.Context r1 = r11.f1556d
            android.view.View r2 = r11.f1553a
            int r3 = r11.f1559g
            boolean r4 = r11.f1558f
            r0.<init>(r1, r2, r3, r4)
            goto L_0x004f
        L_0x003f:
            android.support.v7.view.menu.am r0 = new android.support.v7.view.menu.am
            android.content.Context r6 = r11.f1556d
            android.support.v7.view.menu.q r7 = r11.f1557e
            android.view.View r8 = r11.f1553a
            int r9 = r11.f1559g
            boolean r10 = r11.f1558f
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x004f:
            android.support.v7.view.menu.q r1 = r11.f1557e
            r0.mo1523l(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r11.f1563k
            r0.mo1529s(r1)
            android.view.View r1 = r11.f1553a
            r0.mo1524o(r1)
            android.support.v7.view.menu.ae r1 = r11.f1561i
            r0.mo1544e(r1)
            boolean r1 = r11.f1560h
            r0.mo1526p(r1)
            int r1 = r11.f1554b
            r0.mo1527q(r1)
            r11.f1562j = r0
        L_0x006f:
            android.support.v7.view.menu.aa r0 = r11.f1562j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.view.menu.C0450ad.mo1534a():android.support.v7.view.menu.aa");
    }

    /* renamed from: b */
    public final void mo1535b() {
        if (mo1541h()) {
            this.f1562j.mo1575m();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo1536c() {
        this.f1562j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1555c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: d */
    public final void mo1537d(boolean z) {
        this.f1560h = z;
        C0447aa aaVar = this.f1562j;
        if (aaVar != null) {
            aaVar.mo1526p(z);
        }
    }

    /* renamed from: e */
    public final void mo1538e(C0451ae aeVar) {
        this.f1561i = aeVar;
        C0447aa aaVar = this.f1562j;
        if (aaVar != null) {
            aaVar.mo1544e(aeVar);
        }
    }

    /* renamed from: f */
    public final void mo1539f() {
        if (!mo1542i()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: g */
    public final void mo1540g(int i, int i2, boolean z, boolean z2) {
        C0447aa a = mo1534a();
        a.mo1530t(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f1554b, C2043bi.m5577f(this.f1553a)) & 7) == 5) {
                i -= this.f1553a.getWidth();
            }
            a.mo1528r(i);
            a.mo1531u(i2);
            int i3 = (int) ((this.f1556d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.f1551g = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a.mo1576v();
    }

    /* renamed from: h */
    public final boolean mo1541h() {
        C0447aa aaVar = this.f1562j;
        return aaVar != null && aaVar.mo1577x();
    }

    /* renamed from: i */
    public final boolean mo1542i() {
        if (mo1541h()) {
            return true;
        }
        if (this.f1553a == null) {
            return false;
        }
        mo1540g(0, 0, false, false);
        return true;
    }
}
