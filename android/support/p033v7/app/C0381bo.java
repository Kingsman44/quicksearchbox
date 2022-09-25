package android.support.p033v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0167am;
import android.support.p033v7.p034a.C0338a;
import android.support.p033v7.view.C0433a;
import android.support.p033v7.view.C0434b;
import android.support.p033v7.view.C0435c;
import android.support.p033v7.view.C0444l;
import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.widget.ActionBarContainer;
import android.support.p033v7.widget.ActionBarContextView;
import android.support.p033v7.widget.ActionBarOverlayLayout;
import android.support.p033v7.widget.C0556bz;
import android.support.p033v7.widget.C0596dl;
import android.support.p033v7.widget.C0683gr;
import android.support.p033v7.widget.C0685gt;
import android.support.p033v7.widget.C0687gv;
import android.support.p033v7.widget.C0692h;
import android.support.p033v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.Spinner;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2058bx;
import androidx.core.p098j.C2059by;
import com.google.android.apps.gsa.languagepack.p;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.bo */
/* compiled from: PG */
public final class C0381bo extends C0383d implements C0692h {

    /* renamed from: t */
    private static final Interpolator f1278t = new AccelerateInterpolator();

    /* renamed from: u */
    private static final Interpolator f1279u = new DecelerateInterpolator();

    /* renamed from: A */
    private boolean f1280A;

    /* renamed from: B */
    private boolean f1281B;

    /* renamed from: C */
    private final ArrayList f1282C = new ArrayList();

    /* renamed from: D */
    private boolean f1283D;

    /* renamed from: E */
    private boolean f1284E;

    /* renamed from: F */
    private boolean f1285F = true;

    /* renamed from: G */
    private boolean f1286G;

    /* renamed from: a */
    Context f1287a;

    /* renamed from: b */
    ActionBarOverlayLayout f1288b;

    /* renamed from: c */
    public ActionBarContainer f1289c;

    /* renamed from: d */
    C0556bz f1290d;

    /* renamed from: e */
    ActionBarContextView f1291e;

    /* renamed from: f */
    View f1292f;

    /* renamed from: g */
    C0687gv f1293g;

    /* renamed from: h */
    C0379bm f1294h;

    /* renamed from: i */
    C0435c f1295i;

    /* renamed from: j */
    C0434b f1296j;

    /* renamed from: k */
    public int f1297k = 0;

    /* renamed from: l */
    public boolean f1298l = true;

    /* renamed from: m */
    boolean f1299m;

    /* renamed from: n */
    public boolean f1300n;

    /* renamed from: o */
    public C0444l f1301o;

    /* renamed from: p */
    boolean f1302p;

    /* renamed from: q */
    final C2059by f1303q = new C0376bj(this);

    /* renamed from: r */
    final C2059by f1304r = new C0377bk(this);

    /* renamed from: s */
    final C0378bl f1305s = new C0378bl(this);

    /* renamed from: v */
    private Context f1306v;

    /* renamed from: w */
    private Activity f1307w;

    /* renamed from: x */
    private final ArrayList f1308x = new ArrayList();

    /* renamed from: y */
    private C0380bn f1309y;

    /* renamed from: z */
    private int f1310z = -1;

    public C0381bo(Activity activity, boolean z) {
        this.f1307w = activity;
        View decorView = activity.getWindow().getDecorView();
        m1213N(decorView);
        if (!z) {
            this.f1292f = decorView.findViewById(16908290);
        }
    }

    /* renamed from: L */
    static boolean m1211L(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: M */
    private final void m1212M() {
        if (this.f1293g == null) {
            C0687gv gvVar = new C0687gv(this.f1287a);
            if (this.f1283D) {
                gvVar.setVisibility(0);
                this.f1290d.mo2650m(gvVar);
            } else {
                if (mo1281G() == 2) {
                    gvVar.setVisibility(0);
                    ActionBarOverlayLayout actionBarOverlayLayout = this.f1288b;
                    if (actionBarOverlayLayout != null) {
                        C2043bi.m5524R(actionBarOverlayLayout);
                    }
                } else {
                    gvVar.setVisibility(8);
                }
                this.f1289c.mo1816a(gvVar);
            }
            this.f1293g = gvVar;
        }
    }

    /* renamed from: N */
    private final void m1213N(View view) {
        C0556bz bzVar;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f1288b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.f1750h = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                ((C0381bo) actionBarOverlayLayout.f1750h).f1297k = actionBarOverlayLayout.f1744b;
                int i = actionBarOverlayLayout.f1749g;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    C2043bi.m5524R(actionBarOverlayLayout);
                }
            }
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof C0556bz) {
            bzVar = (C0556bz) findViewById;
        } else if (findViewById instanceof Toolbar) {
            bzVar = ((Toolbar) findViewById).mo2392f();
        } else {
            StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
            sb.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(sb.toString());
        }
        this.f1290d = bzVar;
        this.f1291e = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f1289c = actionBarContainer;
        C0556bz bzVar2 = this.f1290d;
        if (bzVar2 == null || this.f1291e == null || actionBarContainer == null) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with a compatible window decor layout"));
        }
        this.f1287a = bzVar2.mo2641d();
        if ((this.f1290d.mo2638a() & 4) != 0) {
            this.f1280A = true;
        }
        Context context = this.f1287a;
        int i2 = context.getApplicationInfo().targetSdkVersion;
        mo1228F();
        m1214O(C0433a.m1395d(context));
        TypedArray obtainStyledAttributes = this.f1287a.obtainStyledAttributes((AttributeSet) null, C0338a.f1065a, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1288b;
            if (actionBarOverlayLayout2.f1746d) {
                this.f1302p = true;
                actionBarOverlayLayout2.mo1860k(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            C2043bi.m5548ab(this.f1289c, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: O */
    private final void m1214O(boolean z) {
        this.f1283D = z;
        if (!z) {
            this.f1290d.mo2650m((C0687gv) null);
            this.f1289c.mo1816a(this.f1293g);
        } else {
            this.f1289c.mo1816a((C0687gv) null);
            this.f1290d.mo2650m(this.f1293g);
        }
        boolean z2 = true;
        boolean z3 = mo1281G() == 2;
        C0687gv gvVar = this.f1293g;
        if (gvVar != null) {
            if (z3) {
                gvVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1288b;
                if (actionBarOverlayLayout != null) {
                    C2043bi.m5524R(actionBarOverlayLayout);
                }
            } else {
                gvVar.setVisibility(8);
            }
        }
        this.f1290d.mo2648k(!this.f1283D && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1288b;
        if (this.f1283D || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.f1747e = z2;
    }

    /* renamed from: A */
    public final void mo1223A() {
        this.f1290d.mo2637E();
    }

    /* renamed from: B */
    public final void mo1224B() {
        this.f1290d.mo2634B();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r4 = r6.f1309y;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1225C() {
        /*
            r6 = this;
            android.support.v7.widget.bz r0 = r6.f1290d
            int r0 = r0.mo2640c()
            r1 = 1
            r2 = -1
            r3 = 2
            if (r0 == r3) goto L_0x000c
            goto L_0x0032
        L_0x000c:
            android.support.v7.widget.bz r4 = r6.f1290d
            int r4 = r4.mo2640c()
            if (r4 == r1) goto L_0x001f
            if (r4 == r3) goto L_0x0018
        L_0x0016:
            r4 = -1
            goto L_0x0025
        L_0x0018:
            android.support.v7.app.bn r4 = r6.f1309y
            if (r4 == 0) goto L_0x0016
            int r4 = r4.f1274b
            goto L_0x0025
        L_0x001f:
            android.support.v7.widget.bz r4 = r6.f1290d
            int r4 = r4.mo2639b()
        L_0x0025:
            r6.f1310z = r4
            r4 = 0
            r6.mo1283I(r4)
            android.support.v7.widget.gv r4 = r6.f1293g
            r5 = 8
            r4.setVisibility(r5)
        L_0x0032:
            if (r0 == r3) goto L_0x003f
            boolean r0 = r6.f1283D
            if (r0 != 0) goto L_0x003f
            android.support.v7.widget.ActionBarOverlayLayout r0 = r6.f1288b
            if (r0 == 0) goto L_0x003f
            androidx.core.p098j.C2043bi.m5524R(r0)
        L_0x003f:
            android.support.v7.widget.bz r0 = r6.f1290d
            r0.mo2635C()
            r6.m1212M()
            android.support.v7.widget.gv r0 = r6.f1293g
            r3 = 0
            r0.setVisibility(r3)
            int r0 = r6.f1310z
            if (r0 == r2) goto L_0x0056
            r6.mo1242m(r0)
            r6.f1310z = r2
        L_0x0056:
            android.support.v7.widget.bz r0 = r6.f1290d
            boolean r2 = r6.f1283D
            r2 = r2 ^ r1
            r0.mo2648k(r2)
            android.support.v7.widget.ActionBarOverlayLayout r0 = r6.f1288b
            boolean r2 = r6.f1283D
            r1 = r1 ^ r2
            r0.f1747e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.app.C0381bo.mo1225C():void");
    }

    /* renamed from: D */
    public final void mo1226D() {
        mo1244o(this.f1287a.getString(R.string.language_pack_installer_title));
    }

    /* renamed from: E */
    public final void mo1227E() {
        C2043bi.m5548ab(this.f1289c, 0.0f);
    }

    /* renamed from: F */
    public final void mo1228F() {
        this.f1290d.mo2633A();
    }

    /* renamed from: G */
    public final int mo1281G() {
        return this.f1290d.mo2640c();
    }

    /* renamed from: H */
    public final void mo1282H(boolean z) {
        C2058bx bxVar;
        C2058bx bxVar2;
        if (z) {
            if (!this.f1284E) {
                this.f1284E = true;
                mo1285K(false);
            }
        } else if (this.f1284E) {
            this.f1284E = false;
            mo1285K(false);
        }
        if (C2043bi.m5570ax(this.f1289c)) {
            if (z) {
                bxVar = this.f1290d.mo2643f(4, 100);
                bxVar2 = this.f1291e.mo2556b(0, 200);
            } else {
                bxVar2 = this.f1290d.mo2643f(0, 200);
                bxVar = this.f1291e.mo2556b(8, 100);
            }
            C0444l lVar = new C0444l();
            lVar.f1500a.add(bxVar);
            View view = (View) bxVar.f5964a.get();
            long duration = view != null ? view.animate().getDuration() : 0;
            View view2 = (View) bxVar2.f5964a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            lVar.f1500a.add(bxVar2);
            lVar.mo1436b();
        } else if (z) {
            this.f1290d.mo2655r(4);
            this.f1291e.setVisibility(0);
        } else {
            this.f1290d.mo2655r(0);
            this.f1291e.setVisibility(8);
        }
    }

    /* renamed from: I */
    public final void mo1283I(C0382c cVar) {
        int i = -1;
        if (mo1281G() != 2) {
            if (cVar != null) {
                i = cVar.mo1272a();
            }
            this.f1310z = i;
            return;
        }
        C0154a aVar = null;
        if ((this.f1307w instanceof C0167am) && !this.f1290d.mo2642e().isInEditMode()) {
            aVar = new C0154a(((C0167am) this.f1307w).mo545jw());
            aVar.mo688u();
        }
        C0380bn bnVar = this.f1309y;
        if (bnVar != cVar) {
            C0687gv gvVar = this.f1293g;
            if (cVar != null) {
                i = cVar.mo1272a();
            }
            gvVar.mo3165c(i);
            C0380bn bnVar2 = (C0380bn) cVar;
            this.f1309y = bnVar2;
            if (bnVar2 != null) {
                p pVar = bnVar2.f1276d;
                Object obj = bnVar2.f1273a;
                for (int i2 = 0; i2 < pVar.d.size(); i2++) {
                    if (pVar.d.get(i2) == obj) {
                        pVar.c.mo9147l(i2);
                    }
                }
            }
        } else if (bnVar != null) {
            this.f1293g.mo3164b(cVar.mo1272a());
        }
        if (aVar != null && !aVar.f809e.isEmpty()) {
            aVar.mo505b(false);
        }
    }

    /* renamed from: J */
    public final void mo1284J(int i, int i2) {
        int a = this.f1290d.mo2638a();
        if ((i2 & 4) != 0) {
            this.f1280A = true;
        }
        this.f1290d.mo2649l((i & i2) | ((i2 ^ -1) & a));
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1285K(boolean r7) {
        /*
            r6 = this;
            boolean r0 = r6.f1299m
            boolean r1 = r6.f1300n
            boolean r2 = r6.f1284E
            boolean r0 = m1211L(r0, r1, r2)
            r1 = 2
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x00b4
            boolean r0 = r6.f1285F
            if (r0 != 0) goto L_0x012e
            r6.f1285F = r5
            android.support.v7.view.l r0 = r6.f1301o
            if (r0 == 0) goto L_0x001f
            r0.mo1435a()
        L_0x001f:
            android.support.v7.widget.ActionBarContainer r0 = r6.f1289c
            r0.setVisibility(r4)
            int r0 = r6.f1297k
            r4 = 0
            if (r0 != 0) goto L_0x0092
            boolean r0 = r6.f1286G
            if (r0 != 0) goto L_0x0030
            if (r7 == 0) goto L_0x0092
            r7 = 1
        L_0x0030:
            android.support.v7.widget.ActionBarContainer r0 = r6.f1289c
            r0.setTranslationY(r4)
            android.support.v7.widget.ActionBarContainer r0 = r6.f1289c
            int r0 = r0.getHeight()
            int r0 = -r0
            float r0 = (float) r0
            if (r7 == 0) goto L_0x004d
            int[] r7 = new int[r1]
            r7 = {0, 0} // fill-array
            android.support.v7.widget.ActionBarContainer r1 = r6.f1289c
            r1.getLocationInWindow(r7)
            r7 = r7[r5]
            float r7 = (float) r7
            float r0 = r0 - r7
        L_0x004d:
            android.support.v7.widget.ActionBarContainer r7 = r6.f1289c
            r7.setTranslationY(r0)
            android.support.v7.view.l r7 = new android.support.v7.view.l
            r7.<init>()
            android.support.v7.widget.ActionBarContainer r1 = r6.f1289c
            androidx.core.j.bx r1 = androidx.core.p098j.C2043bi.m5595x(r1)
            r1.mo5205g(r4)
            android.support.v7.app.bl r2 = r6.f1305s
            r1.mo5204f(r2)
            r7.mo1437c(r1)
            boolean r1 = r6.f1298l
            if (r1 == 0) goto L_0x007f
            android.view.View r1 = r6.f1292f
            if (r1 == 0) goto L_0x007f
            r1.setTranslationY(r0)
            android.view.View r0 = r6.f1292f
            androidx.core.j.bx r0 = androidx.core.p098j.C2043bi.m5595x(r0)
            r0.mo5205g(r4)
            r7.mo1437c(r0)
        L_0x007f:
            android.view.animation.Interpolator r0 = f1279u
            r7.mo1439e(r0)
            r7.mo1438d()
            androidx.core.j.by r0 = r6.f1304r
            r7.mo1440f(r0)
            r6.f1301o = r7
            r7.mo1436b()
            goto L_0x00ac
        L_0x0092:
            android.support.v7.widget.ActionBarContainer r7 = r6.f1289c
            r7.setAlpha(r2)
            android.support.v7.widget.ActionBarContainer r7 = r6.f1289c
            r7.setTranslationY(r4)
            boolean r7 = r6.f1298l
            if (r7 == 0) goto L_0x00a7
            android.view.View r7 = r6.f1292f
            if (r7 == 0) goto L_0x00a7
            r7.setTranslationY(r4)
        L_0x00a7:
            androidx.core.j.by r7 = r6.f1304r
            r7.mo1119a(r3)
        L_0x00ac:
            android.support.v7.widget.ActionBarOverlayLayout r7 = r6.f1288b
            if (r7 == 0) goto L_0x012e
            androidx.core.p098j.C2043bi.m5524R(r7)
            return
        L_0x00b4:
            boolean r0 = r6.f1285F
            if (r0 == 0) goto L_0x012e
            r6.f1285F = r4
            android.support.v7.view.l r0 = r6.f1301o
            if (r0 == 0) goto L_0x00c1
            r0.mo1435a()
        L_0x00c1:
            int r0 = r6.f1297k
            if (r0 != 0) goto L_0x0129
            boolean r0 = r6.f1286G
            if (r0 != 0) goto L_0x00cc
            if (r7 == 0) goto L_0x0129
            r7 = 1
        L_0x00cc:
            android.support.v7.widget.ActionBarContainer r0 = r6.f1289c
            r0.setAlpha(r2)
            android.support.v7.widget.ActionBarContainer r0 = r6.f1289c
            r0.mo1817b(r5)
            android.support.v7.view.l r0 = new android.support.v7.view.l
            r0.<init>()
            android.support.v7.widget.ActionBarContainer r2 = r6.f1289c
            int r2 = r2.getHeight()
            int r2 = -r2
            float r2 = (float) r2
            if (r7 == 0) goto L_0x00f3
            int[] r7 = new int[r1]
            r7 = {0, 0} // fill-array
            android.support.v7.widget.ActionBarContainer r1 = r6.f1289c
            r1.getLocationInWindow(r7)
            r7 = r7[r5]
            float r7 = (float) r7
            float r2 = r2 - r7
        L_0x00f3:
            android.support.v7.widget.ActionBarContainer r7 = r6.f1289c
            androidx.core.j.bx r7 = androidx.core.p098j.C2043bi.m5595x(r7)
            r7.mo5205g(r2)
            android.support.v7.app.bl r1 = r6.f1305s
            r7.mo5204f(r1)
            r0.mo1437c(r7)
            boolean r7 = r6.f1298l
            if (r7 == 0) goto L_0x0116
            android.view.View r7 = r6.f1292f
            if (r7 == 0) goto L_0x0116
            androidx.core.j.bx r7 = androidx.core.p098j.C2043bi.m5595x(r7)
            r7.mo5205g(r2)
            r0.mo1437c(r7)
        L_0x0116:
            android.view.animation.Interpolator r7 = f1278t
            r0.mo1439e(r7)
            r0.mo1438d()
            androidx.core.j.by r7 = r6.f1303q
            r0.mo1440f(r7)
            r6.f1301o = r0
            r0.mo1436b()
            return
        L_0x0129:
            androidx.core.j.by r7 = r6.f1303q
            r7.mo1119a(r3)
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.app.C0381bo.mo1285K(boolean):void");
    }

    /* renamed from: a */
    public final int mo1231a() {
        return this.f1290d.mo2638a();
    }

    /* renamed from: b */
    public final Context mo1232b() {
        if (this.f1306v == null) {
            TypedValue typedValue = new TypedValue();
            this.f1287a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f1306v = new ContextThemeWrapper(this.f1287a, i);
            } else {
                this.f1306v = this.f1287a;
            }
        }
        return this.f1306v;
    }

    /* renamed from: c */
    public final C0382c mo1233c() {
        return new C0380bn(this);
    }

    /* renamed from: d */
    public final C0435c mo1286d(C0434b bVar) {
        C0379bm bmVar = this.f1294h;
        if (bmVar != null) {
            bmVar.mo1263f();
        }
        this.f1288b.mo1860k(false);
        this.f1291e.mo1835j();
        C0379bm bmVar2 = new C0379bm(this, this.f1291e.getContext(), bVar);
        bmVar2.f1268a.mo1675s();
        try {
            if (!bmVar2.f1269b.mo1125c(bmVar2, bmVar2.f1268a)) {
                return null;
            }
            this.f1294h = bmVar2;
            bmVar2.mo1264g();
            this.f1291e.mo1833h(bmVar2);
            mo1282H(true);
            return bmVar2;
        } finally {
            bmVar2.f1268a.mo1672r();
        }
    }

    /* renamed from: e */
    public final void mo1234e(C0382c cVar) {
        boolean isEmpty = this.f1308x.isEmpty();
        m1212M();
        C0687gv gvVar = this.f1293g;
        C0685gt a = gvVar.mo3163a(cVar, false);
        gvVar.f2513b.addView(a, new C0596dl());
        Spinner spinner = gvVar.f2514c;
        if (spinner != null) {
            ((C0683gr) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (isEmpty) {
            a.setSelected(true);
        }
        if (gvVar.f2515d) {
            gvVar.requestLayout();
        }
        int size = this.f1308x.size();
        C0380bn bnVar = (C0380bn) cVar;
        if (bnVar.f1276d != null) {
            bnVar.f1274b = size;
            this.f1308x.add(size, bnVar);
            int size2 = this.f1308x.size();
            for (int i = size + 1; i < size2; i++) {
                ((C0380bn) this.f1308x.get(i)).f1274b = i;
            }
            if (isEmpty) {
                mo1283I(cVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Action Bar Tab must have a Callback");
    }

    /* renamed from: f */
    public final void mo1235f(boolean z) {
        if (z != this.f1281B) {
            this.f1281B = z;
            int size = this.f1282C.size();
            for (int i = 0; i < size; i++) {
                ((C0366b) this.f1282C.get(i)).mo1220a();
            }
        }
    }

    /* renamed from: g */
    public final void mo1236g() {
        if (!this.f1299m) {
            this.f1299m = true;
            mo1285K(false);
        }
    }

    /* renamed from: i */
    public final void mo1238i(boolean z) {
        if (!this.f1280A) {
            mo1239j(z);
        }
    }

    /* renamed from: j */
    public final void mo1239j(boolean z) {
        mo1284J(true != z ? 0 : 4, 4);
    }

    /* renamed from: k */
    public final void mo1240k(boolean z) {
        mo1284J(true != z ? 0 : 2, 2);
    }

    /* renamed from: l */
    public final void mo1241l(Drawable drawable) {
        this.f1290d.mo2653p(drawable);
    }

    /* renamed from: m */
    public final void mo1242m(int i) {
        int c = this.f1290d.mo2640c();
        if (c == 1) {
            this.f1290d.mo2636D();
        } else if (c == 2) {
            mo1283I((C0382c) this.f1308x.get(i));
        } else {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
    }

    /* renamed from: n */
    public final void mo1243n(boolean z) {
        C0444l lVar;
        this.f1286G = z;
        if (!z && (lVar = this.f1301o) != null) {
            lVar.mo1435a();
        }
    }

    /* renamed from: o */
    public final void mo1244o(CharSequence charSequence) {
        this.f1290d.mo2654q(charSequence);
    }

    /* renamed from: p */
    public final void mo1245p(CharSequence charSequence) {
        this.f1290d.mo2657t(charSequence);
    }

    /* renamed from: q */
    public final void mo1246q() {
        if (this.f1299m) {
            this.f1299m = false;
            mo1285K(false);
        }
    }

    /* renamed from: s */
    public final boolean mo1248s() {
        C0556bz bzVar = this.f1290d;
        if (bzVar == null || !bzVar.mo2659v()) {
            return false;
        }
        bzVar.mo2644g();
        return true;
    }

    /* renamed from: u */
    public final boolean mo1250u(int i, KeyEvent keyEvent) {
        C0379bm bmVar = this.f1294h;
        if (bmVar == null) {
            return false;
        }
        C0477q qVar = bmVar.f1268a;
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        qVar.setQwertyMode(z);
        return qVar.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: x */
    public final void mo1253x() {
        m1214O(C0433a.m1395d(this.f1287a));
    }

    /* renamed from: y */
    public final void mo1254y() {
        this.f1280A = true;
        this.f1290d.mo2649l(14);
    }

    /* renamed from: z */
    public final void mo1255z() {
        mo1284J(8, 8);
    }

    public C0381bo(Dialog dialog) {
        m1213N(dialog.getWindow().getDecorView());
    }
}
