package android.support.p033v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.p033v7.p034a.C0338a;
import android.support.p033v7.view.C0435c;
import android.support.p033v7.view.C0442j;
import android.support.p033v7.view.menu.C0475o;
import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.widget.ActionBarContextView;
import android.support.p033v7.widget.C0506ad;
import android.support.p033v7.widget.C0555by;
import android.support.p033v7.widget.C0735ip;
import android.support.p033v7.widget.C0763jq;
import android.support.p033v7.widget.ContentFrameLayout;
import android.support.p033v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.core.app.C1829p;
import androidx.core.p094f.C1897j;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2058bx;
import androidx.p043a.p044a.C0782b;
import androidx.p060c.C0984n;
import com.google.android.googlequicksearchbox.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Locale;

/* renamed from: android.support.v7.app.aq */
/* compiled from: PG */
public final class C0356aq extends C0401v implements LayoutInflater.Factory2, C0475o {

    /* renamed from: M */
    private static final C0984n f1172M = new C0984n(0);

    /* renamed from: N */
    private static final int[] f1173N = {16842836};

    /* renamed from: i */
    public static final boolean f1174i = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: j */
    public static final boolean f1175j = true;

    /* renamed from: A */
    boolean f1176A;

    /* renamed from: B */
    boolean f1177B;

    /* renamed from: C */
    boolean f1178C;

    /* renamed from: D */
    boolean f1179D;

    /* renamed from: E */
    public C0354ao f1180E;

    /* renamed from: F */
    public boolean f1181F;

    /* renamed from: G */
    boolean f1182G;

    /* renamed from: H */
    public int f1183H;

    /* renamed from: I */
    boolean f1184I;

    /* renamed from: J */
    int f1185J;

    /* renamed from: K */
    public Rect f1186K;

    /* renamed from: L */
    public Rect f1187L;

    /* renamed from: O */
    private C0348ai f1188O;

    /* renamed from: P */
    private CharSequence f1189P;

    /* renamed from: Q */
    private C0342ac f1190Q;

    /* renamed from: R */
    private C0355ap f1191R;

    /* renamed from: S */
    private boolean f1192S;

    /* renamed from: T */
    private TextView f1193T;

    /* renamed from: U */
    private boolean f1194U;

    /* renamed from: V */
    private boolean f1195V;

    /* renamed from: W */
    private boolean f1196W;

    /* renamed from: X */
    private C0354ao[] f1197X;

    /* renamed from: Y */
    private boolean f1198Y;

    /* renamed from: Z */
    private boolean f1199Z;

    /* renamed from: aa */
    private Configuration f1200aa;

    /* renamed from: ab */
    private int f1201ab = -100;

    /* renamed from: ac */
    private int f1202ac;

    /* renamed from: ad */
    private boolean f1203ad;

    /* renamed from: ae */
    private C0351al f1204ae;

    /* renamed from: af */
    private C0351al f1205af;

    /* renamed from: ag */
    private final Runnable f1206ag = new C0402w(this);

    /* renamed from: ah */
    private boolean f1207ah;

    /* renamed from: ai */
    private AppCompatViewInflater f1208ai;

    /* renamed from: aj */
    private OnBackInvokedDispatcher f1209aj;

    /* renamed from: ak */
    private OnBackInvokedCallback f1210ak;

    /* renamed from: k */
    final Object f1211k;

    /* renamed from: l */
    final Context f1212l;

    /* renamed from: m */
    public Window f1213m;

    /* renamed from: n */
    final C0396q f1214n;

    /* renamed from: o */
    public C0383d f1215o;

    /* renamed from: p */
    MenuInflater f1216p;

    /* renamed from: q */
    public C0555by f1217q;

    /* renamed from: r */
    C0435c f1218r;

    /* renamed from: s */
    ActionBarContextView f1219s;

    /* renamed from: t */
    public PopupWindow f1220t;

    /* renamed from: u */
    public Runnable f1221u;

    /* renamed from: v */
    C2058bx f1222v = null;

    /* renamed from: w */
    public boolean f1223w = true;

    /* renamed from: x */
    ViewGroup f1224x;

    /* renamed from: y */
    public View f1225y;

    /* renamed from: z */
    boolean f1226z;

    public C0356aq(Context context, Window window, C0396q qVar, Object obj) {
        C0395p pVar = null;
        this.f1212l = context;
        this.f1214n = qVar;
        this.f1211k = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof C0395p)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        pVar = (C0395p) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (pVar != null) {
                this.f1201ab = ((C0356aq) pVar.mo1322k()).f1201ab;
            }
        }
        if (this.f1201ab == -100) {
            C0984n nVar = f1172M;
            Integer num = (Integer) nVar.get(this.f1211k.getClass().getName());
            if (num != null) {
                this.f1201ab = num.intValue();
                nVar.remove(this.f1211k.getClass().getName());
            }
        }
        if (window != null) {
            m1083af(window);
        }
        C0506ad.m1896f();
    }

    /* renamed from: X */
    static final C1897j m1079X(Context context) {
        C1897j jVar;
        C1897j jVar2;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 33 || (jVar = C0401v.f1357c) == null) {
            return null;
        }
        C1897j a = C0345af.m1060a(context.getApplicationContext().getResources().getConfiguration());
        if (jVar.f5774b.f5775a.isEmpty()) {
            jVar2 = C1897j.f5773a;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i = 0; i < jVar.f5774b.f5775a.size() + a.f5774b.f5775a.size(); i++) {
                if (i < jVar.f5774b.f5775a.size()) {
                    locale = jVar.f5774b.f5775a.get(i);
                } else {
                    locale = a.f5774b.f5775a.get(i - jVar.f5774b.f5775a.size());
                }
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
            }
            jVar2 = C1897j.m5164a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return jVar2.f5774b.f5775a.isEmpty() ? a : jVar2;
    }

    /* renamed from: Y */
    public static final Configuration m1080Y(Context context, int i, C1897j jVar, Configuration configuration, boolean z) {
        int i2;
        if (i != 1) {
            i2 = i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        if (jVar != null) {
            C0345af.m1063d(configuration2, jVar);
        }
        return configuration2;
    }

    /* renamed from: ad */
    private final C0351al m1081ad(Context context) {
        if (this.f1205af == null) {
            this.f1205af = new C0349aj(this, context);
        }
        return this.f1205af;
    }

    /* renamed from: ae */
    private final C0351al m1082ae(Context context) {
        if (this.f1204ae == null) {
            if (C0375bi.f1261a == null) {
                Context applicationContext = context.getApplicationContext();
                C0375bi.f1261a = new C0375bi(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f1204ae = new C0352am(this, C0375bi.f1261a);
        }
        return this.f1204ae;
    }

    /* renamed from: af */
    private final void m1083af(Window window) {
        if (this.f1213m == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0348ai)) {
                C0348ai aiVar = new C0348ai(this, callback);
                this.f1188O = aiVar;
                window.setCallback(aiVar);
                C0735ip e = C0735ip.m2472e(this.f1212l, (AttributeSet) null, f1173N);
                Drawable c = e.mo3247c(0);
                if (c != null) {
                    window.setBackgroundDrawable(c);
                }
                e.f2596b.recycle();
                this.f1213m = window;
                if (Build.VERSION.SDK_INT >= 33 && this.f1209aj == null) {
                    Object obj = this.f1211k;
                    if (!(obj instanceof Activity) || ((Activity) obj).getWindow() == null) {
                        this.f1209aj = null;
                    } else {
                        this.f1209aj = C0347ah.m1065b((Activity) this.f1211k);
                    }
                    mo1165R();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: ag */
    private final void m1084ag() {
        if (this.f1213m == null) {
            Object obj = this.f1211k;
            if (obj instanceof Activity) {
                m1083af(((Activity) obj).getWindow());
            }
        }
        if (this.f1213m == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: ah */
    private final void m1085ah(int i) {
        this.f1185J = (1 << i) | this.f1185J;
        if (!this.f1184I) {
            C2043bi.m5520N(this.f1213m.getDecorView(), this.f1206ag);
            this.f1184I = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0155, code lost:
        if (r13.f1160f != null) goto L_0x0157;
     */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: ai */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m1086ai(android.support.p033v7.app.C0354ao r13, android.view.KeyEvent r14) {
        /*
            r12 = this;
            boolean r0 = r13.f1167m
            if (r0 != 0) goto L_0x01d2
            boolean r0 = r12.f1182G
            if (r0 == 0) goto L_0x000a
            goto L_0x01d2
        L_0x000a:
            int r0 = r13.f1155a
            if (r0 != 0) goto L_0x0021
            android.content.Context r0 = r12.f1212l
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r1 = 4
            if (r0 == r1) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            return
        L_0x0021:
            android.view.Window r0 = r12.f1213m
            android.view.Window$Callback r0 = r0.getCallback()
            r1 = 1
            if (r0 == 0) goto L_0x0039
            int r2 = r13.f1155a
            android.support.v7.view.menu.q r3 = r13.f1162h
            boolean r0 = r0.onMenuOpened(r2, r3)
            if (r0 == 0) goto L_0x0035
            goto L_0x0039
        L_0x0035:
            r12.mo1159L(r13, r1)
            return
        L_0x0039:
            android.content.Context r0 = r12.f1212l
            java.lang.String r2 = "window"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0046
            return
        L_0x0046:
            boolean r14 = r12.mo1169V(r13, r14)
            if (r14 != 0) goto L_0x004d
            return
        L_0x004d:
            android.view.ViewGroup r14 = r13.f1159e
            r2 = 0
            r3 = -2
            if (r14 == 0) goto L_0x006d
            boolean r4 = r13.f1168n
            if (r4 == 0) goto L_0x0058
            goto L_0x006d
        L_0x0058:
            android.view.View r14 = r13.f1161g
            if (r14 == 0) goto L_0x006a
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            if (r14 == 0) goto L_0x006a
            int r14 = r14.width
            r4 = -1
            if (r14 != r4) goto L_0x006a
            r5 = -1
            goto L_0x01a9
        L_0x006a:
            r5 = -2
            goto L_0x01a9
        L_0x006d:
            if (r14 != 0) goto L_0x00e4
            android.content.Context r14 = r12.mo1153F()
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources r5 = r14.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            android.content.res.Resources$Theme r6 = r14.getTheme()
            r5.setTo(r6)
            r6 = 2130968612(0x7f040024, float:1.7545883E38)
            r5.resolveAttribute(r6, r4, r1)
            int r6 = r4.resourceId
            if (r6 == 0) goto L_0x0096
            int r6 = r4.resourceId
            r5.applyStyle(r6, r1)
        L_0x0096:
            r6 = 2130970762(0x7f04088a, float:1.7550243E38)
            r5.resolveAttribute(r6, r4, r1)
            int r6 = r4.resourceId
            if (r6 == 0) goto L_0x00a6
            int r4 = r4.resourceId
            r5.applyStyle(r4, r1)
            goto L_0x00ac
        L_0x00a6:
            r4 = 2132150582(0x7f160936, float:1.9943203E38)
            r5.applyStyle(r4, r1)
        L_0x00ac:
            androidx.a.a.b r4 = new androidx.a.a.b
            r4.<init>((android.content.Context) r14, (int) r2)
            android.content.res.Resources$Theme r14 = r4.getTheme()
            r14.setTo(r5)
            r13.f1164j = r4
            int[] r14 = android.support.p033v7.p034a.C0338a.f1074j
            android.content.res.TypedArray r14 = r4.obtainStyledAttributes(r14)
            r4 = 86
            int r4 = r14.getResourceId(r4, r2)
            r13.f1156b = r4
            int r4 = r14.getResourceId(r1, r2)
            r13.f1158d = r4
            r14.recycle()
            android.support.v7.app.an r14 = new android.support.v7.app.an
            android.content.Context r4 = r13.f1164j
            r14.<init>(r12, r4)
            r13.f1159e = r14
            r14 = 81
            r13.f1157c = r14
            android.view.ViewGroup r14 = r13.f1159e
            if (r14 == 0) goto L_0x00e3
            goto L_0x00f3
        L_0x00e3:
            return
        L_0x00e4:
            boolean r4 = r13.f1168n
            if (r4 == 0) goto L_0x00f3
            int r14 = r14.getChildCount()
            if (r14 <= 0) goto L_0x00f3
            android.view.ViewGroup r14 = r13.f1159e
            r14.removeAllViews()
        L_0x00f3:
            android.view.View r14 = r13.f1161g
            if (r14 == 0) goto L_0x00fa
            r13.f1160f = r14
            goto L_0x0157
        L_0x00fa:
            android.support.v7.view.menu.q r14 = r13.f1162h
            if (r14 == 0) goto L_0x01d0
            android.support.v7.app.ap r14 = r12.f1191R
            if (r14 != 0) goto L_0x0109
            android.support.v7.app.ap r14 = new android.support.v7.app.ap
            r14.<init>(r12)
            r12.f1191R = r14
        L_0x0109:
            android.support.v7.app.ap r14 = r12.f1191R
            android.support.v7.view.menu.m r4 = r13.f1163i
            if (r4 != 0) goto L_0x0123
            android.support.v7.view.menu.m r4 = new android.support.v7.view.menu.m
            android.content.Context r5 = r13.f1164j
            r4.<init>(r5)
            r13.f1163i = r4
            android.support.v7.view.menu.m r4 = r13.f1163i
            r4.f1641e = r14
            android.support.v7.view.menu.q r14 = r13.f1162h
            android.content.Context r5 = r14.f1650a
            r14.mo1655f(r4, r5)
        L_0x0123:
            android.support.v7.view.menu.m r14 = r13.f1163i
            android.view.ViewGroup r4 = r13.f1159e
            android.support.v7.view.menu.ExpandedMenuView r5 = r14.f1640d
            if (r5 != 0) goto L_0x014f
            android.view.LayoutInflater r5 = r14.f1638b
            r6 = 2131623975(0x7f0e0027, float:1.8875117E38)
            android.view.View r4 = r5.inflate(r6, r4, r2)
            android.support.v7.view.menu.ExpandedMenuView r4 = (android.support.p033v7.view.menu.ExpandedMenuView) r4
            r14.f1640d = r4
            android.support.v7.view.menu.l r4 = r14.f1642f
            if (r4 != 0) goto L_0x0143
            android.support.v7.view.menu.l r4 = new android.support.v7.view.menu.l
            r4.<init>(r14)
            r14.f1642f = r4
        L_0x0143:
            android.support.v7.view.menu.ExpandedMenuView r4 = r14.f1640d
            android.support.v7.view.menu.l r5 = r14.f1642f
            r4.setAdapter(r5)
            android.support.v7.view.menu.ExpandedMenuView r4 = r14.f1640d
            r4.setOnItemClickListener(r14)
        L_0x014f:
            android.support.v7.view.menu.ExpandedMenuView r14 = r14.f1640d
            r13.f1160f = r14
            android.view.View r14 = r13.f1160f
            if (r14 == 0) goto L_0x01d0
        L_0x0157:
            android.view.View r14 = r13.f1160f
            if (r14 != 0) goto L_0x015d
            goto L_0x01d0
        L_0x015d:
            android.view.View r14 = r13.f1161g
            if (r14 == 0) goto L_0x0162
            goto L_0x016e
        L_0x0162:
            android.support.v7.view.menu.m r14 = r13.f1163i
            android.widget.ListAdapter r14 = r14.mo1629k()
            int r14 = r14.getCount()
            if (r14 <= 0) goto L_0x01d0
        L_0x016e:
            android.view.View r14 = r13.f1160f
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            if (r14 != 0) goto L_0x017b
            android.view.ViewGroup$LayoutParams r14 = new android.view.ViewGroup$LayoutParams
            r14.<init>(r3, r3)
        L_0x017b:
            int r4 = r13.f1156b
            android.view.ViewGroup r5 = r13.f1159e
            r5.setBackgroundResource(r4)
            android.view.View r4 = r13.f1160f
            android.view.ViewParent r4 = r4.getParent()
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x0193
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r5 = r13.f1160f
            r4.removeView(r5)
        L_0x0193:
            android.view.ViewGroup r4 = r13.f1159e
            android.view.View r5 = r13.f1160f
            r4.addView(r5, r14)
            android.view.View r14 = r13.f1160f
            boolean r14 = r14.hasFocus()
            if (r14 != 0) goto L_0x006a
            android.view.View r14 = r13.f1160f
            r14.requestFocus()
            goto L_0x006a
        L_0x01a9:
            r13.f1166l = r2
            android.view.WindowManager$LayoutParams r14 = new android.view.WindowManager$LayoutParams
            r6 = -2
            r7 = 0
            r8 = 0
            r9 = 1002(0x3ea, float:1.404E-42)
            r10 = 8519680(0x820000, float:1.1938615E-38)
            r11 = -3
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            int r2 = r13.f1157c
            r14.gravity = r2
            int r2 = r13.f1158d
            r14.windowAnimations = r2
            android.view.ViewGroup r2 = r13.f1159e
            r0.addView(r2, r14)
            r13.f1167m = r1
            int r13 = r13.f1155a
            if (r13 != 0) goto L_0x01cf
            r12.mo1165R()
        L_0x01cf:
            return
        L_0x01d0:
            r13.f1168n = r1
        L_0x01d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.app.C0356aq.m1086ai(android.support.v7.app.ao, android.view.KeyEvent):void");
    }

    /* renamed from: aj */
    private final void m1087aj() {
        if (this.f1192S) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: A */
    public final void mo1149A() {
        String str;
        this.f1181F = true;
        mo1175ac(false, true);
        m1084ag();
        Object obj = this.f1211k;
        if (obj instanceof Activity) {
            try {
                str = C1829p.m5012c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                C0383d dVar = this.f1215o;
                if (dVar == null) {
                    this.f1207ah = true;
                } else {
                    dVar.mo1238i(true);
                }
            }
            synchronized (C0401v.f1362h) {
                C0401v.m1325o(this);
                C0401v.f1361g.add(new WeakReference(this));
            }
        }
        this.f1200aa = new Configuration(this.f1212l.getResources().getConfiguration());
        this.f1199Z = true;
    }

    /* renamed from: B */
    public final void mo1150B(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (!this.f1179D || i != 108) {
            if (this.f1226z && i == 1) {
                this.f1226z = false;
            }
            if (i == 1) {
                m1087aj();
                this.f1179D = true;
            } else if (i == 2) {
                m1087aj();
                this.f1194U = true;
            } else if (i == 5) {
                m1087aj();
                this.f1195V = true;
            } else if (i == 10) {
                m1087aj();
                this.f1177B = true;
            } else if (i == 108) {
                m1087aj();
                this.f1226z = true;
            } else if (i != 109) {
                this.f1213m.requestFeature(i);
            } else {
                m1087aj();
                this.f1176A = true;
            }
        }
    }

    /* renamed from: D */
    public final int mo1151D() {
        int i = this.f1201ab;
        return i != -100 ? i : C0401v.f1356b;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0122 A[RETURN] */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo1152E(android.content.Context r22, int r23) {
        /*
            r21 = this;
            r0 = r23
            r1 = -100
            r2 = -1
            if (r0 == r1) goto L_0x0126
            if (r0 == r2) goto L_0x0125
            r1 = 2
            r3 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 == r3) goto L_0x0125
            if (r0 == r1) goto L_0x0125
            r2 = 3
            if (r0 != r2) goto L_0x0024
            android.support.v7.app.al r0 = r21.m1081ad(r22)
            android.support.v7.app.aj r0 = (android.support.p033v7.app.C0349aj) r0
            android.os.PowerManager r0 = r0.f1147a
            boolean r0 = r0.isPowerSaveMode()
            if (r0 == 0) goto L_0x0023
            return r1
        L_0x0023:
            return r3
        L_0x0024:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."
            r0.<init>(r1)
            throw r0
        L_0x002c:
            android.content.Context r0 = r22.getApplicationContext()
            java.lang.String r4 = "uimode"
            java.lang.Object r0 = r0.getSystemService(r4)
            android.app.UiModeManager r0 = (android.app.UiModeManager) r0
            int r0 = r0.getNightMode()
            if (r0 == 0) goto L_0x0124
            android.support.v7.app.al r0 = r21.m1082ae(r22)
            android.support.v7.app.am r0 = (android.support.p033v7.app.C0352am) r0
            android.support.v7.app.bi r0 = r0.f1152a
            android.support.v7.app.bh r2 = r0.f1263c
            long r4 = r2.f1260b
            long r6 = java.lang.System.currentTimeMillis()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0056
            boolean r0 = r2.f1259a
            goto L_0x0105
        L_0x0056:
            android.content.Context r4 = r0.f1262b
            java.lang.String r5 = "android.permission.ACCESS_COARSE_LOCATION"
            int r4 = androidx.core.content.C1885k.m5142a(r4, r5)
            r5 = 0
            if (r4 != 0) goto L_0x0068
            java.lang.String r4 = "network"
            android.location.Location r4 = r0.mo1257a(r4)
            goto L_0x0069
        L_0x0068:
            r4 = r5
        L_0x0069:
            android.content.Context r6 = r0.f1262b
            java.lang.String r7 = "android.permission.ACCESS_FINE_LOCATION"
            int r6 = androidx.core.content.C1885k.m5142a(r6, r7)
            if (r6 != 0) goto L_0x0079
            java.lang.String r5 = "gps"
            android.location.Location r5 = r0.mo1257a(r5)
        L_0x0079:
            if (r5 == 0) goto L_0x008a
            if (r4 == 0) goto L_0x008a
            long r6 = r5.getTime()
            long r8 = r4.getTime()
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x008d
            goto L_0x008c
        L_0x008a:
            if (r5 == 0) goto L_0x008d
        L_0x008c:
            r4 = r5
        L_0x008d:
            if (r4 == 0) goto L_0x0109
            android.support.v7.app.bh r0 = r0.f1263c
            long r12 = java.lang.System.currentTimeMillis()
            android.support.v7.app.bg r5 = android.support.p033v7.app.C0373bg.f1255a
            if (r5 != 0) goto L_0x00a0
            android.support.v7.app.bg r5 = new android.support.v7.app.bg
            r5.<init>()
            android.support.p033v7.app.C0373bg.f1255a = r5
        L_0x00a0:
            android.support.v7.app.bg r10 = android.support.p033v7.app.C0373bg.f1255a
            r5 = -86400000(0xfffffffffad9a400, double:NaN)
            long r15 = r12 + r5
            double r17 = r4.getLatitude()
            double r19 = r4.getLongitude()
            r14 = r10
            r14.mo1256a(r15, r17, r19)
            double r8 = r4.getLatitude()
            double r14 = r4.getLongitude()
            r5 = r10
            r6 = r12
            r1 = r10
            r10 = r14
            r5.mo1256a(r6, r8, r10)
            int r5 = r1.f1258d
            long r6 = r1.f1257c
            long r8 = r1.f1256b
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            long r15 = r12 + r10
            double r17 = r4.getLatitude()
            double r19 = r4.getLongitude()
            r14 = r1
            r14.mo1256a(r15, r17, r19)
            long r10 = r1.f1257c
            r14 = -1
            int r1 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x00f6
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x00e6
            goto L_0x00f6
        L_0x00e6:
            int r1 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x00ec
            r6 = r10
            goto L_0x00f1
        L_0x00ec:
            int r1 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x00f1
            r6 = r8
        L_0x00f1:
            r8 = 60000(0xea60, double:2.9644E-319)
            long r6 = r6 + r8
            goto L_0x00fa
        L_0x00f6:
            r6 = 43200000(0x2932e00, double:2.1343636E-316)
            long r6 = r6 + r12
        L_0x00fa:
            if (r3 == r5) goto L_0x00fe
            r1 = 0
            goto L_0x00ff
        L_0x00fe:
            r1 = 1
        L_0x00ff:
            r0.f1259a = r1
            r0.f1260b = r6
            boolean r0 = r2.f1259a
        L_0x0105:
            if (r0 == 0) goto L_0x0122
        L_0x0107:
            r0 = 2
            goto L_0x0123
        L_0x0109:
            java.lang.String r0 = "TwilightManager"
            java.lang.String r1 = "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."
            android.util.Log.i(r0, r1)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 11
            int r0 = r0.get(r1)
            r1 = 6
            if (r0 < r1) goto L_0x0107
            r1 = 22
            if (r0 < r1) goto L_0x0122
            goto L_0x0107
        L_0x0122:
            return r3
        L_0x0123:
            return r0
        L_0x0124:
            return r2
        L_0x0125:
            return r0
        L_0x0126:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.app.C0356aq.mo1152E(android.content.Context, int):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final Context mo1153F() {
        mo1163P();
        C0383d dVar = this.f1215o;
        Context b = dVar != null ? dVar.mo1232b() : null;
        return b == null ? this.f1212l : b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final C0354ao mo1154G(Menu menu) {
        C0354ao[] aoVarArr = this.f1197X;
        int length = aoVarArr != null ? aoVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0354ao aoVar = aoVarArr[i];
            if (aoVar != null && aoVar.f1162h == menu) {
                return aoVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0020  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.support.p033v7.view.C0435c mo1155H(android.support.p033v7.view.C0434b r8) {
        /*
            r7 = this;
            r7.mo1161N()
            android.support.v7.view.c r0 = r7.f1218r
            if (r0 == 0) goto L_0x000a
            r0.mo1263f()
        L_0x000a:
            android.support.v7.app.q r0 = r7.f1214n
            r1 = 0
            if (r0 == 0) goto L_0x0019
            boolean r2 = r7.f1182G
            if (r2 != 0) goto L_0x0019
            android.support.v7.view.c r0 = r0.mo1207p()     // Catch:{ AbstractMethodError -> 0x0018 }
            goto L_0x001a
        L_0x0018:
        L_0x0019:
            r0 = r1
        L_0x001a:
            if (r0 == 0) goto L_0x0020
            r7.f1218r = r0
            goto L_0x014b
        L_0x0020:
            android.support.v7.widget.ActionBarContextView r0 = r7.f1219s
            r2 = 0
            if (r0 != 0) goto L_0x00cd
            boolean r0 = r7.f1178C
            if (r0 == 0) goto L_0x00ae
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r3 = r7.f1212l
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r4 = 2130968619(0x7f04002b, float:1.7545897E38)
            r5 = 1
            r3.resolveAttribute(r4, r0, r5)
            int r4 = r0.resourceId
            if (r4 == 0) goto L_0x0060
            android.content.Context r4 = r7.f1212l
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Resources$Theme r4 = r4.newTheme()
            r4.setTo(r3)
            int r3 = r0.resourceId
            r4.applyStyle(r3, r5)
            androidx.a.a.b r3 = new androidx.a.a.b
            android.content.Context r6 = r7.f1212l
            r3.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r3.getTheme()
            r6.setTo(r4)
            goto L_0x0062
        L_0x0060:
            android.content.Context r3 = r7.f1212l
        L_0x0062:
            android.support.v7.widget.ActionBarContextView r4 = new android.support.v7.widget.ActionBarContextView
            r4.<init>(r3)
            r7.f1219s = r4
            android.widget.PopupWindow r4 = new android.widget.PopupWindow
            r6 = 2130968635(0x7f04003b, float:1.754593E38)
            r4.<init>(r3, r1, r6)
            r7.f1220t = r4
            r6 = 2
            androidx.core.widget.C2132s.m5904c(r4, r6)
            android.widget.PopupWindow r4 = r7.f1220t
            android.support.v7.widget.ActionBarContextView r6 = r7.f1219s
            r4.setContentView(r6)
            android.widget.PopupWindow r4 = r7.f1220t
            r6 = -1
            r4.setWidth(r6)
            android.content.res.Resources$Theme r4 = r3.getTheme()
            r6 = 2130968613(0x7f040025, float:1.7545885E38)
            r4.resolveAttribute(r6, r0, r5)
            int r0 = r0.data
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r3)
            android.support.v7.widget.ActionBarContextView r3 = r7.f1219s
            r3.f2093e = r0
            android.widget.PopupWindow r0 = r7.f1220t
            r3 = -2
            r0.setHeight(r3)
            android.support.v7.app.aa r0 = new android.support.v7.app.aa
            r0.<init>(r7)
            r7.f1221u = r0
            goto L_0x00cd
        L_0x00ae:
            android.view.ViewGroup r0 = r7.f1224x
            r3 = 2131427525(0x7f0b00c5, float:1.8476669E38)
            android.view.View r0 = r0.findViewById(r3)
            android.support.v7.widget.ViewStubCompat r0 = (android.support.p033v7.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00cd
            android.content.Context r3 = r7.mo1153F()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r0.f1969a = r3
            android.view.View r0 = r0.mo2426a()
            android.support.v7.widget.ActionBarContextView r0 = (android.support.p033v7.widget.ActionBarContextView) r0
            r7.f1219s = r0
        L_0x00cd:
            android.support.v7.widget.ActionBarContextView r0 = r7.f1219s
            if (r0 == 0) goto L_0x014b
            r7.mo1161N()
            android.support.v7.widget.ActionBarContextView r0 = r7.f1219s
            r0.mo1835j()
            android.support.v7.view.e r0 = new android.support.v7.view.e
            android.support.v7.widget.ActionBarContextView r3 = r7.f1219s
            android.content.Context r3 = r3.getContext()
            android.support.v7.widget.ActionBarContextView r4 = r7.f1219s
            r0.<init>(r3, r4, r8)
            android.support.v7.view.menu.q r3 = r0.f1444a
            boolean r8 = r8.mo1125c(r0, r3)
            if (r8 == 0) goto L_0x0149
            r0.mo1264g()
            android.support.v7.widget.ActionBarContextView r8 = r7.f1219s
            r8.mo1833h(r0)
            r7.f1218r = r0
            boolean r8 = r7.mo1170W()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x011a
            android.support.v7.widget.ActionBarContextView r8 = r7.f1219s
            r1 = 0
            r8.setAlpha(r1)
            android.support.v7.widget.ActionBarContextView r8 = r7.f1219s
            androidx.core.j.bx r8 = androidx.core.p098j.C2043bi.m5595x(r8)
            r8.mo5201c(r0)
            r7.f1222v = r8
            android.support.v7.app.ab r0 = new android.support.v7.app.ab
            r0.<init>(r7)
            r8.mo5203e(r0)
            goto L_0x0139
        L_0x011a:
            android.support.v7.widget.ActionBarContextView r8 = r7.f1219s
            r8.setAlpha(r0)
            android.support.v7.widget.ActionBarContextView r8 = r7.f1219s
            r8.setVisibility(r2)
            android.support.v7.widget.ActionBarContextView r8 = r7.f1219s
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0139
            android.support.v7.widget.ActionBarContextView r8 = r7.f1219s
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            androidx.core.p098j.C2043bi.m5524R(r8)
        L_0x0139:
            android.widget.PopupWindow r8 = r7.f1220t
            if (r8 == 0) goto L_0x014b
            android.view.Window r8 = r7.f1213m
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f1221u
            r8.post(r0)
            goto L_0x014b
        L_0x0149:
            r7.f1218r = r1
        L_0x014b:
            android.support.v7.view.c r8 = r7.f1218r
            if (r8 == 0) goto L_0x0156
            android.support.v7.app.q r8 = r7.f1214n
            if (r8 == 0) goto L_0x0156
            r8.mo1208r()
        L_0x0156:
            r7.mo1165R()
            android.support.v7.view.c r8 = r7.f1218r
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.app.C0356aq.mo1155H(android.support.v7.view.b):android.support.v7.view.c");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final CharSequence mo1156I() {
        Object obj = this.f1211k;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f1189P;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo1157J(int i, C0354ao aoVar, Menu menu) {
        if (menu == null) {
            menu = aoVar.f1162h;
        }
        if (aoVar.f1167m && !this.f1182G) {
            C0348ai aiVar = this.f1188O;
            Window.Callback callback = this.f1213m.getCallback();
            try {
                aiVar.f1143b = true;
                callback.onPanelClosed(i, menu);
                aiVar.f1143b = false;
            } catch (Throwable th) {
                aiVar.f1143b = false;
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo1158K(C0477q qVar) {
        if (!this.f1196W) {
            this.f1196W = true;
            this.f1217q.mo1844a();
            Window.Callback callback = this.f1213m.getCallback();
            if (callback != null && !this.f1182G) {
                callback.onPanelClosed(108, qVar);
            }
            this.f1196W = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo1159L(C0354ao aoVar, boolean z) {
        ViewGroup viewGroup;
        C0555by byVar;
        if (!z || aoVar.f1155a != 0 || (byVar = this.f1217q) == null || !byVar.mo1882s()) {
            WindowManager windowManager = (WindowManager) this.f1212l.getSystemService("window");
            if (!(windowManager == null || !aoVar.f1167m || (viewGroup = aoVar.f1159e) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo1157J(aoVar.f1155a, aoVar, (Menu) null);
                }
            }
            aoVar.f1165k = false;
            aoVar.f1166l = false;
            aoVar.f1167m = false;
            aoVar.f1160f = null;
            aoVar.f1168n = true;
            if (this.f1180E == aoVar) {
                this.f1180E = null;
            }
            if (aoVar.f1155a == 0) {
                mo1165R();
                return;
            }
            return;
        }
        mo1158K(aoVar.f1162h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final void mo1160M(int i) {
        C0354ao aa = mo1173aa(i);
        if (aa.f1162h != null) {
            Bundle bundle = new Bundle();
            aa.f1162h.mo1668o(bundle);
            if (bundle.size() > 0) {
                aa.f1170p = bundle;
            }
            aa.f1162h.mo1675s();
            aa.f1162h.clear();
        }
        aa.f1169o = true;
        aa.f1168n = true;
        if ((i == 108 || i == 0) && this.f1217q != null) {
            C0354ao aa2 = mo1173aa(0);
            aa2.f1165k = false;
            mo1169V(aa2, (KeyEvent) null);
        }
    }

    /* renamed from: N */
    public final void mo1161N() {
        C2058bx bxVar = this.f1222v;
        if (bxVar != null) {
            bxVar.mo5199a();
        }
    }

    /* renamed from: O */
    public final void mo1162O() {
        ViewGroup viewGroup;
        Context context;
        if (!this.f1192S) {
            TypedArray obtainStyledAttributes = this.f1212l.obtainStyledAttributes(C0338a.f1074j);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    mo1150B(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    mo1150B(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    mo1150B(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    mo1150B(10);
                }
                this.f1178C = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                m1084ag();
                this.f1213m.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.f1212l);
                if (this.f1179D) {
                    viewGroup = this.f1177B ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
                } else if (this.f1178C) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.f1176A = false;
                    this.f1226z = false;
                } else if (this.f1226z) {
                    TypedValue typedValue = new TypedValue();
                    this.f1212l.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new C0782b(this.f1212l, typedValue.resourceId);
                    } else {
                        context = this.f1212l;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                    C0555by byVar = (C0555by) viewGroup.findViewById(R.id.decor_content_parent);
                    this.f1217q = byVar;
                    byVar.mo1863n(this.f1213m.getCallback());
                    if (this.f1176A) {
                        this.f1217q.mo1846c(109);
                    }
                    if (this.f1194U) {
                        this.f1217q.mo1846c(2);
                    }
                    if (this.f1195V) {
                        this.f1217q.mo1846c(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    C2043bi.m5555ai(viewGroup, new C0403x(this));
                    if (this.f1217q == null) {
                        this.f1193T = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    C0763jq.m2569a(viewGroup);
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f1213m.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.f1213m.setContentView(viewGroup);
                    contentFrameLayout.f1827i = new C0404y(this);
                    this.f1224x = viewGroup;
                    CharSequence I = mo1156I();
                    if (!TextUtils.isEmpty(I)) {
                        C0555by byVar2 = this.f1217q;
                        if (byVar2 != null) {
                            byVar2.mo1864o(I);
                        } else {
                            C0383d dVar = this.f1215o;
                            if (dVar != null) {
                                dVar.mo1245p(I);
                            } else {
                                TextView textView = this.f1193T;
                                if (textView != null) {
                                    textView.setText(I);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f1224x.findViewById(16908290);
                    View decorView = this.f1213m.getDecorView();
                    contentFrameLayout2.f1826h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (C2043bi.m5570ax(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.f1212l.obtainStyledAttributes(C0338a.f1074j);
                    if (contentFrameLayout2.f1820b == null) {
                        contentFrameLayout2.f1820b = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.f1820b);
                    if (contentFrameLayout2.f1821c == null) {
                        contentFrameLayout2.f1821c = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.f1821c);
                    if (obtainStyledAttributes2.hasValue(122)) {
                        if (contentFrameLayout2.f1822d == null) {
                            contentFrameLayout2.f1822d = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.f1822d);
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        if (contentFrameLayout2.f1823e == null) {
                            contentFrameLayout2.f1823e = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.f1823e);
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        if (contentFrameLayout2.f1824f == null) {
                            contentFrameLayout2.f1824f = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.f1824f);
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        if (contentFrameLayout2.f1825g == null) {
                            contentFrameLayout2.f1825g = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.f1825g);
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.f1192S = true;
                    C0354ao aa = mo1173aa(0);
                    if (!this.f1182G && aa.f1162h == null) {
                        m1085ah(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f1226z + ", windowActionBarOverlay: " + this.f1176A + ", android:windowIsFloating: " + this.f1178C + ", windowActionModeOverlay: " + this.f1177B + ", windowNoTitle: " + this.f1179D + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    /* renamed from: P */
    public final void mo1163P() {
        mo1162O();
        if (this.f1226z && this.f1215o == null) {
            Object obj = this.f1211k;
            if (obj instanceof Activity) {
                this.f1215o = new C0381bo((Activity) this.f1211k, this.f1176A);
            } else if (obj instanceof Dialog) {
                this.f1215o = new C0381bo((Dialog) this.f1211k);
            }
            C0383d dVar = this.f1215o;
            if (dVar != null) {
                dVar.mo1238i(this.f1207ah);
            }
        }
    }

    /* renamed from: Q */
    public final void mo1164Q(C0477q qVar) {
        C0555by byVar = this.f1217q;
        if (byVar == null || !byVar.mo1879p() || (ViewConfiguration.get(this.f1212l).hasPermanentMenuKey() && !this.f1217q.mo1881r())) {
            C0354ao aa = mo1173aa(0);
            aa.f1168n = true;
            mo1159L(aa, false);
            m1086ai(aa, (KeyEvent) null);
            return;
        }
        Window.Callback callback = this.f1213m.getCallback();
        if (this.f1217q.mo1882s()) {
            this.f1217q.mo1880q();
            if (!this.f1182G) {
                callback.onPanelClosed(108, mo1173aa(0).f1162h);
            }
        } else if (callback != null && !this.f1182G) {
            if (this.f1184I && (1 & this.f1185J) != 0) {
                this.f1213m.getDecorView().removeCallbacks(this.f1206ag);
                this.f1206ag.run();
            }
            C0354ao aa2 = mo1173aa(0);
            C0477q qVar2 = aa2.f1162h;
            if (qVar2 != null && !aa2.f1169o && callback.onPreparePanel(0, aa2.f1161g, qVar2)) {
                callback.onMenuOpened(108, aa2.f1162h);
                this.f1217q.mo1885u();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c5, code lost:
        if (mo1169V(r0, r7) != false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00cf, code lost:
        if (r7 != false) goto L_0x00d1;
     */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1166S(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f1211k
            boolean r1 = r0 instanceof androidx.core.p098j.C2102q
            if (r1 != 0) goto L_0x000a
            boolean r0 = r0 instanceof android.support.p033v7.app.C0358as
            if (r0 == 0) goto L_0x0014
        L_0x000a:
            android.view.Window r0 = r6.f1213m
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x0014
            int[] r0 = androidx.core.p098j.C2043bi.f5944a
        L_0x0014:
            int r0 = r7.getKeyCode()
            r1 = 82
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0036
            android.support.v7.app.ai r0 = r6.f1188O
            android.view.Window r4 = r6.f1213m
            android.view.Window$Callback r4 = r4.getCallback()
            r0.f1142a = r3     // Catch:{ all -> 0x0032 }
            boolean r4 = r4.dispatchKeyEvent(r7)     // Catch:{ all -> 0x0032 }
            r0.f1142a = r2
            if (r4 != 0) goto L_0x0031
            goto L_0x0036
        L_0x0031:
            return r3
        L_0x0032:
            r7 = move-exception
            r0.f1142a = r2
            throw r7
        L_0x0036:
            int r0 = r7.getKeyCode()
            int r4 = r7.getAction()
            r5 = 4
            if (r4 != 0) goto L_0x0068
            if (r0 == r5) goto L_0x005a
            if (r0 == r1) goto L_0x0047
            goto L_0x00f4
        L_0x0047:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x00f3
            android.support.v7.app.ao r0 = r6.mo1173aa(r2)
            boolean r1 = r0.f1167m
            if (r1 != 0) goto L_0x00f3
            r6.mo1169V(r0, r7)
            goto L_0x00f3
        L_0x005a:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r3 = 0
        L_0x0064:
            r6.f1198Y = r3
            goto L_0x00f4
        L_0x0068:
            if (r0 == r5) goto L_0x00ed
            if (r0 == r1) goto L_0x006e
            goto L_0x00f4
        L_0x006e:
            android.support.v7.view.c r0 = r6.f1218r
            if (r0 == 0) goto L_0x0074
            goto L_0x00f3
        L_0x0074:
            android.support.v7.app.ao r0 = r6.mo1173aa(r2)
            android.support.v7.widget.by r1 = r6.f1217q
            if (r1 == 0) goto L_0x00ae
            boolean r1 = r1.mo1879p()
            if (r1 == 0) goto L_0x00ae
            android.content.Context r1 = r6.f1212l
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            boolean r1 = r1.hasPermanentMenuKey()
            if (r1 != 0) goto L_0x00ae
            android.support.v7.widget.by r1 = r6.f1217q
            boolean r1 = r1.mo1882s()
            if (r1 != 0) goto L_0x00a7
            boolean r1 = r6.f1182G
            if (r1 != 0) goto L_0x00f3
            boolean r7 = r6.mo1169V(r0, r7)
            if (r7 == 0) goto L_0x00f3
            android.support.v7.widget.by r7 = r6.f1217q
            boolean r7 = r7.mo1885u()
            goto L_0x00cf
        L_0x00a7:
            android.support.v7.widget.by r7 = r6.f1217q
            boolean r7 = r7.mo1880q()
            goto L_0x00cf
        L_0x00ae:
            boolean r1 = r0.f1167m
            if (r1 != 0) goto L_0x00cb
            boolean r4 = r0.f1166l
            if (r4 == 0) goto L_0x00b7
            goto L_0x00cb
        L_0x00b7:
            boolean r1 = r0.f1165k
            if (r1 == 0) goto L_0x00f3
            boolean r1 = r0.f1169o
            if (r1 == 0) goto L_0x00c7
            r0.f1165k = r2
            boolean r1 = r6.mo1169V(r0, r7)
            if (r1 == 0) goto L_0x00f3
        L_0x00c7:
            r6.m1086ai(r0, r7)
            goto L_0x00d1
        L_0x00cb:
            r6.mo1159L(r0, r3)
            r7 = r1
        L_0x00cf:
            if (r7 == 0) goto L_0x00f3
        L_0x00d1:
            android.content.Context r7 = r6.f1212l
            android.content.Context r7 = r7.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x00e5
            r7.playSoundEffect(r2)
            goto L_0x00f3
        L_0x00e5:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
            goto L_0x00f3
        L_0x00ed:
            boolean r7 = r6.mo1167T()
            if (r7 == 0) goto L_0x00f4
        L_0x00f3:
            r2 = 1
        L_0x00f4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.app.C0356aq.mo1166S(android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final boolean mo1167T() {
        boolean z = this.f1198Y;
        this.f1198Y = false;
        C0354ao aa = mo1173aa(0);
        if (aa.f1167m) {
            if (!z) {
                mo1159L(aa, true);
            }
            return true;
        }
        C0435c cVar = this.f1218r;
        if (cVar == null) {
            mo1163P();
            C0383d dVar = this.f1215o;
            return dVar != null && dVar.mo1248s();
        }
        cVar.mo1263f();
        return true;
    }

    /* renamed from: U */
    public final boolean mo1168U(C0477q qVar, MenuItem menuItem) {
        C0354ao G;
        Window.Callback callback = this.f1213m.getCallback();
        if (callback == null || this.f1182G || (G = mo1154G(qVar.mo1583a())) == null) {
            return false;
        }
        return callback.onMenuItemSelected(G.f1155a, menuItem);
    }

    /* renamed from: V */
    public final boolean mo1169V(C0354ao aoVar, KeyEvent keyEvent) {
        C0555by byVar;
        C0555by byVar2;
        C0555by byVar3;
        Resources.Theme theme;
        C0555by byVar4;
        if (this.f1182G) {
            return false;
        }
        if (aoVar.f1165k) {
            return true;
        }
        C0354ao aoVar2 = this.f1180E;
        if (!(aoVar2 == null || aoVar2 == aoVar)) {
            mo1159L(aoVar2, false);
        }
        Window.Callback callback = this.f1213m.getCallback();
        if (callback != null) {
            aoVar.f1161g = callback.onCreatePanelView(aoVar.f1155a);
        }
        int i = aoVar.f1155a;
        boolean z = i == 0 || i == 108;
        if (z && (byVar4 = this.f1217q) != null) {
            byVar4.mo1862m();
        }
        if (aoVar.f1161g == null && (!z || !(this.f1215o instanceof C0372bf))) {
            C0477q qVar = aoVar.f1162h;
            if (qVar == null || aoVar.f1169o) {
                if (qVar == null) {
                    Context context = this.f1212l;
                    int i2 = aoVar.f1155a;
                    if ((i2 == 0 || i2 == 108) && this.f1217q != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            C0782b bVar = new C0782b(context, 0);
                            bVar.getTheme().setTo(theme);
                            context = bVar;
                        }
                    }
                    C0477q qVar2 = new C0477q(context);
                    qVar2.f1651b = this;
                    aoVar.mo1148a(qVar2);
                    if (aoVar.f1162h == null) {
                        return false;
                    }
                }
                if (z && (byVar3 = this.f1217q) != null) {
                    if (this.f1190Q == null) {
                        this.f1190Q = new C0342ac(this);
                    }
                    byVar3.mo1861l(aoVar.f1162h, this.f1190Q);
                }
                aoVar.f1162h.mo1675s();
                if (!callback.onCreatePanelMenu(aoVar.f1155a, aoVar.f1162h)) {
                    aoVar.mo1148a((C0477q) null);
                    if (z && (byVar2 = this.f1217q) != null) {
                        byVar2.mo1861l((Menu) null, this.f1190Q);
                    }
                    return false;
                }
                aoVar.f1169o = false;
            }
            aoVar.f1162h.mo1675s();
            Bundle bundle = aoVar.f1170p;
            if (bundle != null) {
                aoVar.f1162h.mo1667n(bundle);
                aoVar.f1170p = null;
            }
            if (!callback.onPreparePanel(0, aoVar.f1161g, aoVar.f1162h)) {
                if (z && (byVar = this.f1217q) != null) {
                    byVar.mo1861l((Menu) null, this.f1190Q);
                }
                aoVar.f1162h.mo1672r();
                return false;
            }
            aoVar.f1162h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            aoVar.f1162h.mo1672r();
        }
        aoVar.f1165k = true;
        aoVar.f1166l = false;
        this.f1180E = aoVar;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f1224x;
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1170W() {
        /*
            r1 = this;
            boolean r0 = r1.f1192S
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f1224x
            if (r0 == 0) goto L_0x0010
            boolean r0 = androidx.core.p098j.C2043bi.m5570ax(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.app.C0356aq.mo1170W():boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e3, code lost:
        if (r9.equals("Spinner") != false) goto L_0x0127;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01da  */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo1171Z(java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r8 = this;
            android.support.v7.app.AppCompatViewInflater r0 = r8.f1208ai
            r1 = 0
            if (r0 != 0) goto L_0x0058
            android.content.Context r0 = r8.f1212l
            int[] r2 = android.support.p033v7.p034a.C0338a.f1074j
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            r2 = 116(0x74, float:1.63E-43)
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L_0x001d
            android.support.v7.app.AppCompatViewInflater r0 = new android.support.v7.app.AppCompatViewInflater
            r0.<init>()
            r8.f1208ai = r0
            goto L_0x0058
        L_0x001d:
            android.content.Context r2 = r8.f1212l     // Catch:{ all -> 0x0038 }
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ all -> 0x0038 }
            java.lang.Class r2 = r2.loadClass(r0)     // Catch:{ all -> 0x0038 }
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0038 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ all -> 0x0038 }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x0038 }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ all -> 0x0038 }
            android.support.v7.app.AppCompatViewInflater r2 = (android.support.p033v7.app.AppCompatViewInflater) r2     // Catch:{ all -> 0x0038 }
            r8.f1208ai = r2     // Catch:{ all -> 0x0038 }
            goto L_0x0058
        L_0x0038:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to instantiate custom view inflater "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ". Falling back to default."
            r3.append(r0)
            java.lang.String r0 = "AppCompatDelegate"
            java.lang.String r3 = r3.toString()
            android.util.Log.i(r0, r3, r2)
            android.support.v7.app.AppCompatViewInflater r0 = new android.support.v7.app.AppCompatViewInflater
            r0.<init>()
            r8.f1208ai = r0
        L_0x0058:
            android.support.v7.app.AppCompatViewInflater r0 = r8.f1208ai
            int[] r2 = android.support.p033v7.p034a.C0338a.f1062A
            android.content.res.TypedArray r2 = r10.obtainStyledAttributes(r11, r2, r1, r1)
            r3 = 4
            int r4 = r2.getResourceId(r3, r1)
            if (r4 == 0) goto L_0x006e
            java.lang.String r5 = "AppCompatViewInflater"
            java.lang.String r6 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r5, r6)
        L_0x006e:
            r2.recycle()
            if (r4 == 0) goto L_0x0084
            boolean r2 = r10 instanceof androidx.p043a.p044a.C0782b
            if (r2 == 0) goto L_0x007e
            r2 = r10
            androidx.a.a.b r2 = (androidx.p043a.p044a.C0782b) r2
            int r2 = r2.f2693a
            if (r2 == r4) goto L_0x0084
        L_0x007e:
            androidx.a.a.b r2 = new androidx.a.a.b
            r2.<init>((android.content.Context) r10, (int) r4)
            goto L_0x0085
        L_0x0084:
            r2 = r10
        L_0x0085:
            int r4 = r9.hashCode()
            r5 = 3
            r6 = -1
            r7 = 1
            switch(r4) {
                case -1946472170: goto L_0x011b;
                case -1455429095: goto L_0x0110;
                case -1346021293: goto L_0x0105;
                case -938935918: goto L_0x00fb;
                case -937446323: goto L_0x00f1;
                case -658531749: goto L_0x00e6;
                case -339785223: goto L_0x00dd;
                case 776382189: goto L_0x00d3;
                case 799298502: goto L_0x00c8;
                case 1125864064: goto L_0x00be;
                case 1413872058: goto L_0x00b2;
                case 1601505219: goto L_0x00a7;
                case 1666676343: goto L_0x009c;
                case 2001146706: goto L_0x0091;
                default: goto L_0x008f;
            }
        L_0x008f:
            goto L_0x0126
        L_0x0091:
            java.lang.String r3 = "Button"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0126
            r3 = 2
            goto L_0x0127
        L_0x009c:
            java.lang.String r3 = "EditText"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0126
            r3 = 3
            goto L_0x0127
        L_0x00a7:
            java.lang.String r3 = "CheckBox"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0126
            r3 = 6
            goto L_0x0127
        L_0x00b2:
            java.lang.String r3 = "AutoCompleteTextView"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0126
            r3 = 9
            goto L_0x0127
        L_0x00be:
            java.lang.String r3 = "ImageView"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0126
            r3 = 1
            goto L_0x0127
        L_0x00c8:
            java.lang.String r3 = "ToggleButton"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0126
            r3 = 13
            goto L_0x0127
        L_0x00d3:
            java.lang.String r3 = "RadioButton"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0126
            r3 = 7
            goto L_0x0127
        L_0x00dd:
            java.lang.String r4 = "Spinner"
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L_0x0126
            goto L_0x0127
        L_0x00e6:
            java.lang.String r3 = "SeekBar"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0126
            r3 = 12
            goto L_0x0127
        L_0x00f1:
            java.lang.String r3 = "ImageButton"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0126
            r3 = 5
            goto L_0x0127
        L_0x00fb:
            java.lang.String r3 = "TextView"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0126
            r3 = 0
            goto L_0x0127
        L_0x0105:
            java.lang.String r3 = "MultiAutoCompleteTextView"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0126
            r3 = 10
            goto L_0x0127
        L_0x0110:
            java.lang.String r3 = "CheckedTextView"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0126
            r3 = 8
            goto L_0x0127
        L_0x011b:
            java.lang.String r3 = "RatingBar"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0126
            r3 = 11
            goto L_0x0127
        L_0x0126:
            r3 = -1
        L_0x0127:
            r4 = 0
            switch(r3) {
                case 0: goto L_0x0177;
                case 1: goto L_0x0171;
                case 2: goto L_0x016c;
                case 3: goto L_0x0166;
                case 4: goto L_0x0160;
                case 5: goto L_0x015a;
                case 6: goto L_0x0155;
                case 7: goto L_0x0150;
                case 8: goto L_0x014a;
                case 9: goto L_0x0145;
                case 10: goto L_0x013f;
                case 11: goto L_0x0139;
                case 12: goto L_0x0133;
                case 13: goto L_0x012d;
                default: goto L_0x012b;
            }
        L_0x012b:
            r3 = r4
            goto L_0x017e
        L_0x012d:
            android.support.v7.widget.br r3 = new android.support.v7.widget.br
            r3.<init>(r2, r11)
            goto L_0x017e
        L_0x0133:
            android.support.v7.widget.aq r3 = new android.support.v7.widget.aq
            r3.<init>(r2, r11)
            goto L_0x017e
        L_0x0139:
            android.support.v7.widget.ao r3 = new android.support.v7.widget.ao
            r3.<init>(r2, r11)
            goto L_0x017e
        L_0x013f:
            android.support.v7.widget.ak r3 = new android.support.v7.widget.ak
            r3.<init>(r2, r11)
            goto L_0x017e
        L_0x0145:
            android.support.v7.widget.x r3 = r0.mo1111a(r2, r11)
            goto L_0x017b
        L_0x014a:
            android.support.v7.widget.z r3 = new android.support.v7.widget.z
            r3.<init>(r2, r11)
            goto L_0x017e
        L_0x0150:
            android.support.v7.widget.an r3 = r0.mo1114d(r2, r11)
            goto L_0x017b
        L_0x0155:
            android.support.v7.widget.AppCompatCheckBox r3 = r0.mo1113c(r2, r11)
            goto L_0x017b
        L_0x015a:
            android.support.v7.widget.AppCompatImageButton r3 = new android.support.v7.widget.AppCompatImageButton
            r3.<init>(r2, r11)
            goto L_0x017e
        L_0x0160:
            android.support.v7.widget.AppCompatSpinner r3 = new android.support.v7.widget.AppCompatSpinner
            r3.<init>((android.content.Context) r2, (android.util.AttributeSet) r11)
            goto L_0x017e
        L_0x0166:
            android.support.v7.widget.af r3 = new android.support.v7.widget.af
            r3.<init>(r2, r11)
            goto L_0x017e
        L_0x016c:
            android.support.v7.widget.AppCompatButton r3 = r0.mo1112b(r2, r11)
            goto L_0x017b
        L_0x0171:
            android.support.v7.widget.AppCompatImageView r3 = new android.support.v7.widget.AppCompatImageView
            r3.<init>(r2, r11)
            goto L_0x017e
        L_0x0177:
            android.support.v7.widget.AppCompatTextView r3 = r0.mo1115e(r2, r11)
        L_0x017b:
            r0.mo1117g(r3, r9)
        L_0x017e:
            if (r3 != 0) goto L_0x01d7
            if (r10 == r2) goto L_0x01d7
            java.lang.String r10 = "view"
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x0190
            java.lang.String r9 = "class"
            java.lang.String r9 = r11.getAttributeValue(r4, r9)
        L_0x0190:
            java.lang.Object[] r10 = r0.f1133c     // Catch:{ Exception -> 0x01d0, all -> 0x01c8 }
            r10[r1] = r2     // Catch:{ Exception -> 0x01d0, all -> 0x01c8 }
            r10[r7] = r11     // Catch:{ Exception -> 0x01d0, all -> 0x01c8 }
            r10 = 46
            int r10 = r9.indexOf(r10)     // Catch:{ Exception -> 0x01d0, all -> 0x01c8 }
            if (r10 != r6) goto L_0x01bc
            r10 = 0
        L_0x019f:
            if (r10 >= r5) goto L_0x01b5
            java.lang.String[] r3 = android.support.p033v7.app.AppCompatViewInflater.f1130b     // Catch:{ Exception -> 0x01d0, all -> 0x01c8 }
            r3 = r3[r10]     // Catch:{ Exception -> 0x01d0, all -> 0x01c8 }
            android.view.View r3 = r0.mo1116f(r2, r9, r3)     // Catch:{ Exception -> 0x01d0, all -> 0x01c8 }
            if (r3 == 0) goto L_0x01b2
            java.lang.Object[] r9 = r0.f1133c
            r9[r1] = r4
            r9[r7] = r4
            goto L_0x01d7
        L_0x01b2:
            int r10 = r10 + 1
            goto L_0x019f
        L_0x01b5:
            java.lang.Object[] r9 = r0.f1133c
            r9[r1] = r4
            r9[r7] = r4
            goto L_0x01d8
        L_0x01bc:
            android.view.View r9 = r0.mo1116f(r2, r9, r4)     // Catch:{ Exception -> 0x01d0, all -> 0x01c8 }
            java.lang.Object[] r10 = r0.f1133c
            r10[r1] = r4
            r10[r7] = r4
            r4 = r9
            goto L_0x01d8
        L_0x01c8:
            r9 = move-exception
            java.lang.Object[] r10 = r0.f1133c
            r10[r1] = r4
            r10[r7] = r4
            throw r9
        L_0x01d0:
            java.lang.Object[] r9 = r0.f1133c
            r9[r1] = r4
            r9[r7] = r4
            goto L_0x01d8
        L_0x01d7:
            r4 = r3
        L_0x01d8:
            if (r4 == 0) goto L_0x0200
            android.content.Context r9 = r4.getContext()
            boolean r10 = r9 instanceof android.content.ContextWrapper
            if (r10 == 0) goto L_0x0200
            boolean r10 = androidx.core.p098j.C2043bi.m5566at(r4)
            if (r10 != 0) goto L_0x01e9
            goto L_0x0200
        L_0x01e9:
            int[] r10 = android.support.p033v7.app.AppCompatViewInflater.f1129a
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r11, r10)
            java.lang.String r10 = r9.getString(r1)
            if (r10 == 0) goto L_0x01fd
            android.support.v7.app.au r11 = new android.support.v7.app.au
            r11.<init>(r4, r10)
            r4.setOnClickListener(r11)
        L_0x01fd:
            r9.recycle()
        L_0x0200:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.app.C0356aq.mo1171Z(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* renamed from: a */
    public final Context mo1172a() {
        return this.f1212l;
    }

    /* renamed from: aa */
    public final C0354ao mo1173aa(int i) {
        C0354ao[] aoVarArr = this.f1197X;
        if (aoVarArr == null || aoVarArr.length <= i) {
            C0354ao[] aoVarArr2 = new C0354ao[(i + 1)];
            if (aoVarArr != null) {
                System.arraycopy(aoVarArr, 0, aoVarArr2, 0, aoVarArr.length);
            }
            this.f1197X = aoVarArr2;
            aoVarArr = aoVarArr2;
        }
        C0354ao aoVar = aoVarArr[i];
        if (aoVar != null) {
            return aoVar;
        }
        C0354ao aoVar2 = new C0354ao(i);
        aoVarArr[i] = aoVar2;
        return aoVar2;
    }

    /* renamed from: ab */
    public final boolean mo1174ab(C0354ao aoVar, int i, KeyEvent keyEvent) {
        C0477q qVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((aoVar.f1165k || mo1169V(aoVar, keyEvent)) && (qVar = aoVar.f1162h) != null) {
            return qVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x013a, code lost:
        if (r3 == false) goto L_0x0156;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0099  */
    /* renamed from: ac */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1175ac(boolean r10, boolean r11) {
        /*
            r9 = this;
            boolean r0 = r9.f1182G
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r9.mo1151D()
            android.content.Context r1 = r9.f1212l
            int r1 = r9.mo1152E(r1, r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            r4 = 0
            if (r2 >= r3) goto L_0x001d
            android.content.Context r2 = r9.f1212l
            androidx.core.f.j r2 = m1079X(r2)
            goto L_0x001e
        L_0x001d:
            r2 = r4
        L_0x001e:
            if (r11 != 0) goto L_0x0030
            if (r2 == 0) goto L_0x0030
            android.content.Context r11 = r9.f1212l
            android.content.res.Resources r11 = r11.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            androidx.core.f.j r2 = android.support.p033v7.app.C0345af.m1060a(r11)
        L_0x0030:
            android.content.Context r11 = r9.f1212l
            r3 = 0
            android.content.res.Configuration r11 = m1080Y(r11, r1, r2, r4, r3)
            android.content.Context r1 = r9.f1212l
            boolean r5 = r9.f1203ad
            r6 = 1
            if (r5 != 0) goto L_0x006e
            java.lang.Object r5 = r9.f1211k
            boolean r5 = r5 instanceof android.app.Activity
            if (r5 == 0) goto L_0x006e
            android.content.pm.PackageManager r5 = r1.getPackageManager()
            if (r5 != 0) goto L_0x004c
            r1 = 0
            goto L_0x0072
        L_0x004c:
            android.content.ComponentName r7 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0064 }
            java.lang.Object r8 = r9.f1211k     // Catch:{ NameNotFoundException -> 0x0064 }
            java.lang.Class r8 = r8.getClass()     // Catch:{ NameNotFoundException -> 0x0064 }
            r7.<init>(r1, r8)     // Catch:{ NameNotFoundException -> 0x0064 }
            r1 = 269221888(0x100c0000, float:2.7610132E-29)
            android.content.pm.ActivityInfo r1 = r5.getActivityInfo(r7, r1)     // Catch:{ NameNotFoundException -> 0x0064 }
            if (r1 == 0) goto L_0x006e
            int r1 = r1.configChanges     // Catch:{ NameNotFoundException -> 0x0064 }
            r9.f1202ac = r1     // Catch:{ NameNotFoundException -> 0x0064 }
            goto L_0x006e
        L_0x0064:
            r1 = move-exception
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r7 = "Exception while getting ActivityInfo"
            android.util.Log.d(r5, r7, r1)
            r9.f1202ac = r3
        L_0x006e:
            r9.f1203ad = r6
            int r1 = r9.f1202ac
        L_0x0072:
            android.content.res.Configuration r5 = r9.f1200aa
            if (r5 != 0) goto L_0x0080
            android.content.Context r5 = r9.f1212l
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
        L_0x0080:
            int r7 = r5.uiMode
            r7 = r7 & 48
            int r8 = r11.uiMode
            r8 = r8 & 48
            androidx.core.f.j r5 = android.support.p033v7.app.C0345af.m1060a(r5)
            if (r2 != 0) goto L_0x0090
            r11 = r4
            goto L_0x0094
        L_0x0090:
            androidx.core.f.j r11 = android.support.p033v7.app.C0345af.m1060a(r11)
        L_0x0094:
            if (r7 == r8) goto L_0x0099
            r2 = 512(0x200, float:7.175E-43)
            goto L_0x009a
        L_0x0099:
            r2 = 0
        L_0x009a:
            if (r11 == 0) goto L_0x00a4
            boolean r5 = r5.equals(r11)
            if (r5 != 0) goto L_0x00a4
            r2 = r2 | 8196(0x2004, float:1.1485E-41)
        L_0x00a4:
            r5 = r1 ^ -1
            r5 = r5 & r2
            if (r5 == 0) goto L_0x00cd
            if (r10 == 0) goto L_0x00cd
            boolean r10 = r9.f1181F
            if (r10 == 0) goto L_0x00cd
            boolean r10 = f1174i
            if (r10 != 0) goto L_0x00b7
            boolean r10 = r9.f1199Z
            if (r10 == 0) goto L_0x00cd
        L_0x00b7:
            java.lang.Object r10 = r9.f1211k
            boolean r5 = r10 instanceof android.app.Activity
            if (r5 == 0) goto L_0x00cd
            android.app.Activity r10 = (android.app.Activity) r10
            boolean r10 = r10.isChild()
            if (r10 != 0) goto L_0x00cd
            java.lang.Object r10 = r9.f1211k
            android.app.Activity r10 = (android.app.Activity) r10
            r10.recreate()
            r3 = 1
        L_0x00cd:
            if (r3 != 0) goto L_0x013a
            if (r2 == 0) goto L_0x013a
            r10 = r2 & r1
            android.content.Context r1 = r9.f1212l
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r3 = new android.content.res.Configuration
            android.content.res.Configuration r5 = r1.getConfiguration()
            r3.<init>(r5)
            android.content.res.Configuration r5 = r1.getConfiguration()
            int r5 = r5.uiMode
            r5 = r5 & -49
            r5 = r5 | r8
            r3.uiMode = r5
            if (r11 == 0) goto L_0x00f2
            android.support.p033v7.app.C0345af.m1063d(r3, r11)
        L_0x00f2:
            r1.updateConfiguration(r3, r4)
            int r1 = r9.f1183H
            if (r1 == 0) goto L_0x0109
            android.content.Context r4 = r9.f1212l
            r4.setTheme(r1)
            android.content.Context r1 = r9.f1212l
            android.content.res.Resources$Theme r1 = r1.getTheme()
            int r4 = r9.f1183H
            r1.applyStyle(r4, r6)
        L_0x0109:
            if (r10 != r2) goto L_0x013c
            java.lang.Object r10 = r9.f1211k
            boolean r1 = r10 instanceof android.app.Activity
            if (r1 == 0) goto L_0x013c
            android.app.Activity r10 = (android.app.Activity) r10
            boolean r1 = r10 instanceof androidx.lifecycle.C2391v
            if (r1 == 0) goto L_0x012e
            r1 = r10
            androidx.lifecycle.v r1 = (androidx.lifecycle.C2391v) r1
            androidx.lifecycle.o r1 = r1.getLifecycle()
            androidx.lifecycle.n r1 = r1.mo5789a()
            androidx.lifecycle.n r4 = androidx.lifecycle.C2383n.CREATED
            boolean r1 = r1.mo5788a(r4)
            if (r1 == 0) goto L_0x013c
            r10.onConfigurationChanged(r3)
            goto L_0x013c
        L_0x012e:
            boolean r1 = r9.f1199Z
            if (r1 == 0) goto L_0x013c
            boolean r1 = r9.f1182G
            if (r1 != 0) goto L_0x013c
            r10.onConfigurationChanged(r3)
            goto L_0x013c
        L_0x013a:
            if (r3 == 0) goto L_0x0156
        L_0x013c:
            java.lang.Object r10 = r9.f1211k
            boolean r1 = r10 instanceof android.support.p033v7.app.C0395p
            if (r1 == 0) goto L_0x0156
            r1 = r2 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x014b
            android.support.v7.app.p r10 = (android.support.p033v7.app.C0395p) r10
            r10.mo1324o()
        L_0x014b:
            r10 = r2 & 4
            if (r10 == 0) goto L_0x0156
            java.lang.Object r10 = r9.f1211k
            android.support.v7.app.p r10 = (android.support.p033v7.app.C0395p) r10
            r10.mo1321jA()
        L_0x0156:
            if (r11 == 0) goto L_0x0169
            android.content.Context r10 = r9.f1212l
            android.content.res.Resources r10 = r10.getResources()
            android.content.res.Configuration r10 = r10.getConfiguration()
            androidx.core.f.j r10 = android.support.p033v7.app.C0345af.m1060a(r10)
            android.support.p033v7.app.C0345af.m1062c(r10)
        L_0x0169:
            if (r0 != 0) goto L_0x0175
            android.content.Context r10 = r9.f1212l
            android.support.v7.app.al r10 = r9.m1082ae(r10)
            r10.mo1144d()
            goto L_0x0189
        L_0x0175:
            android.support.v7.app.al r10 = r9.f1204ae
            if (r10 == 0) goto L_0x017c
            r10.mo1143c()
        L_0x017c:
            r10 = 3
            if (r0 != r10) goto L_0x0189
            android.content.Context r10 = r9.f1212l
            android.support.v7.app.al r10 = r9.m1081ad(r10)
            r10.mo1144d()
            return
        L_0x0189:
            android.support.v7.app.al r10 = r9.f1205af
            if (r10 == 0) goto L_0x0190
            r10.mo1143c()
        L_0x0190:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.app.C0356aq.mo1175ac(boolean, boolean):void");
    }

    /* renamed from: d */
    public final MenuInflater mo1176d() {
        if (this.f1216p == null) {
            mo1163P();
            C0383d dVar = this.f1215o;
            this.f1216p = new C0442j(dVar != null ? dVar.mo1232b() : this.f1212l);
        }
        return this.f1216p;
    }

    /* renamed from: e */
    public final View mo1177e(int i) {
        mo1162O();
        return this.f1213m.findViewById(i);
    }

    /* renamed from: g */
    public final void mo1178g(View view, ViewGroup.LayoutParams layoutParams) {
        mo1162O();
        ((ViewGroup) this.f1224x.findViewById(16908290)).addView(view, layoutParams);
        this.f1188O.mo1128a(this.f1213m.getCallback());
    }

    /* renamed from: h */
    public final void mo1179h() {
        LayoutInflater from = LayoutInflater.from(this.f1212l);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof C0356aq)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: i */
    public final void mo1180i() {
        if (this.f1215o != null) {
            mo1163P();
            if (!this.f1215o.mo1249t()) {
                m1085ah(0);
            }
        }
    }

    /* renamed from: j */
    public final void mo1181j(Configuration configuration) {
        if (this.f1226z && this.f1192S) {
            mo1163P();
            C0383d dVar = this.f1215o;
            if (dVar != null) {
                dVar.mo1253x();
            }
        }
        C0506ad.m1895d().mo2478e(this.f1212l);
        this.f1200aa = new Configuration(this.f1212l.getResources().getConfiguration());
        mo1175ac(false, false);
        configuration.updateFrom(this.f1212l.getResources().getConfiguration());
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1182k() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1211k
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = android.support.p033v7.app.C0401v.f1362h
            monitor-enter(r0)
            android.support.p033v7.app.C0401v.m1325o(r3)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r1
        L_0x0011:
            boolean r0 = r3.f1184I
            if (r0 == 0) goto L_0x0020
            android.view.Window r0 = r3.f1213m
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f1206ag
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 1
            r3.f1182G = r0
            int r0 = r3.f1201ab
            r1 = -100
            if (r0 == r1) goto L_0x004d
            java.lang.Object r0 = r3.f1211k
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x004d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x004d
            androidx.c.n r0 = f1172M
            java.lang.Object r1 = r3.f1211k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f1201ab
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x005c
        L_0x004d:
            androidx.c.n r0 = f1172M
            java.lang.Object r1 = r3.f1211k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x005c:
            android.support.v7.app.d r0 = r3.f1215o
            if (r0 == 0) goto L_0x0063
            r0.mo1237h()
        L_0x0063:
            android.support.v7.app.al r0 = r3.f1204ae
            if (r0 == 0) goto L_0x006a
            r0.mo1143c()
        L_0x006a:
            android.support.v7.app.al r0 = r3.f1205af
            if (r0 == 0) goto L_0x0071
            r0.mo1143c()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.app.C0356aq.mo1182k():void");
    }

    /* renamed from: l */
    public final void mo1183l() {
        mo1163P();
        C0383d dVar = this.f1215o;
        if (dVar != null) {
            dVar.mo1243n(true);
        }
    }

    /* renamed from: m */
    public final void mo1184m() {
        mo1175ac(true, false);
    }

    /* renamed from: n */
    public final void mo1185n() {
        mo1163P();
        C0383d dVar = this.f1215o;
        if (dVar != null) {
            dVar.mo1243n(false);
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo1171Z(str, context, attributeSet);
    }

    /* renamed from: p */
    public final void mo1188p(int i) {
        mo1162O();
        ViewGroup viewGroup = (ViewGroup) this.f1224x.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1212l).inflate(i, viewGroup);
        this.f1188O.mo1128a(this.f1213m.getCallback());
    }

    /* renamed from: q */
    public final void mo1189q(View view) {
        mo1162O();
        ViewGroup viewGroup = (ViewGroup) this.f1224x.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1188O.mo1128a(this.f1213m.getCallback());
    }

    /* renamed from: r */
    public final void mo1190r(View view, ViewGroup.LayoutParams layoutParams) {
        mo1162O();
        ViewGroup viewGroup = (ViewGroup) this.f1224x.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1188O.mo1128a(this.f1213m.getCallback());
    }

    /* renamed from: s */
    public final void mo1191s(int i) {
        if (this.f1201ab != i) {
            this.f1201ab = i;
            if (this.f1181F) {
                mo1175ac(true, true);
            }
        }
    }

    /* renamed from: t */
    public final void mo1192t(Toolbar toolbar) {
        if (this.f1211k instanceof Activity) {
            mo1163P();
            C0383d dVar = this.f1215o;
            if (!(dVar instanceof C0381bo)) {
                this.f1216p = null;
                if (dVar != null) {
                    dVar.mo1237h();
                }
                this.f1215o = null;
                if (toolbar != null) {
                    C0372bf bfVar = new C0372bf(toolbar, mo1156I(), this.f1188O);
                    this.f1215o = bfVar;
                    this.f1188O.f1145d = bfVar.f1249d;
                    if (!toolbar.f1922A) {
                        toolbar.f1922A = true;
                        toolbar.mo2425z();
                    }
                } else {
                    this.f1188O.f1145d = null;
                }
                mo1180i();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* renamed from: u */
    public final void mo1193u(CharSequence charSequence) {
        this.f1189P = charSequence;
        C0555by byVar = this.f1217q;
        if (byVar == null) {
            C0383d dVar = this.f1215o;
            if (dVar != null) {
                dVar.mo1245p(charSequence);
                return;
            }
            TextView textView = this.f1193T;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        byVar.mo1864o(charSequence);
    }

    /* renamed from: x */
    public final void mo1194x() {
        C1897j jVar;
        if (m1327w(this.f1212l) && (jVar = C0401v.f1357c) != null && !jVar.equals(C0401v.f1358d)) {
            C0401v.f1355a.execute(new C0397r(this.f1212l));
        }
        mo1175ac(true, true);
    }

    /* renamed from: y */
    public final void mo1195y() {
        mo1175ac(true, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final void mo1165R() {
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f1209aj == null || (!mo1173aa(0).f1167m && this.f1218r == null)) {
            OnBackInvokedCallback onBackInvokedCallback = this.f1210ak;
            if (onBackInvokedCallback != null) {
                C0347ah.m1066c(this.f1209aj, onBackInvokedCallback);
            }
        } else if (this.f1210ak == null) {
            this.f1210ak = C0347ah.m1064a(this.f1209aj, this);
        }
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return mo1171Z(str, context, attributeSet);
    }
}
