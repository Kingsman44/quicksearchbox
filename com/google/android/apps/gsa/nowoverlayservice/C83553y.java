package com.google.android.apps.gsa.nowoverlayservice;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0395p;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;
import androidx.core.graphics.C1924a;
import androidx.p119j.p120a.p121a.C2300b;
import androidx.p119j.p120a.p121a.C2302d;
import androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.adb;
import com.google.android.apps.gsa.binaries.satin.app.add;
import com.google.android.apps.gsa.monet.a.a.a;
import com.google.android.apps.gsa.nowoverlayservice.p6426d.C83520c;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.shared.overlay.C87653b;
import com.google.android.apps.gsa.search.shared.overlay.C87661j;
import com.google.android.apps.gsa.search.shared.overlay.C87662k;
import com.google.android.apps.gsa.search.shared.overlay.OverlaySearchPlateContainer;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87676ad;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87691a;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87718b;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87745c;
import com.google.android.apps.gsa.searchnow.C88863ao;
import com.google.android.apps.gsa.searchnow.C88864ap;
import com.google.android.apps.gsa.searchplate.C88890a;
import com.google.android.apps.gsa.searchplate.SearchPlate;
import com.google.android.apps.gsa.shared.logger.C89838ab;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.monet.C90160aa;
import com.google.android.apps.gsa.shared.monet.C90164ae;
import com.google.android.apps.gsa.shared.monet.C90165af;
import com.google.android.apps.gsa.shared.monet.C90347r;
import com.google.android.apps.gsa.shared.monet.p7070b.p7093l.C90251a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7093l.p7094a.C90252a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7093l.p7094a.C90253b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90277f;
import com.google.android.apps.gsa.shared.monet.p7113e.C90318b;
import com.google.android.apps.gsa.shared.monet.p7113e.C90319c;
import com.google.android.apps.gsa.shared.monet.p7113e.C90321e;
import com.google.android.apps.gsa.shared.p6999at.C89289a;
import com.google.android.apps.gsa.shared.p7008az.C89332a;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.p7066m.C90138q;
import com.google.android.apps.gsa.shared.p7129r.C90460b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7148ui.FitsSystemWindowsNotifierFrameLayout;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7162d.C90962a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.shared.util.permissions.C91079f;
import com.google.android.apps.gsa.shared.util.permissions.ProxyPermissionsRequester;
import com.google.android.apps.gsa.sidekick.shared.p7241j.C91748d;
import com.google.android.apps.search.googleapp.pixelsuggest.C136895e;
import com.google.android.apps.search.lens.p10547a.C139921f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.internal.p1887a.C22998v;
import com.google.android.libraries.gsa.monet.shared.InitializationData;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1859d.p1861b.C22749a;
import com.google.android.libraries.gsa.p1859d.p1861b.C22754ad;
import com.google.android.libraries.gsa.p1859d.p1861b.C22757c;
import com.google.android.libraries.gsa.p1859d.p1861b.C22760f;
import com.google.android.libraries.gsa.p1859d.p1861b.C22762h;
import com.google.android.libraries.gsa.p1859d.p1861b.C22768n;
import com.google.android.libraries.gsa.p1859d.p1861b.C22769o;
import com.google.android.libraries.gsa.p1859d.p1861b.p1862a.C22750a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60547ty;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protobuf.C62940bt;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68225k;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import org.chromium.net.PrivateKeyType;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.y */
/* compiled from: PG */
public final class C83553y extends C22768n implements C88863ao, C90991b {

    /* renamed from: a */
    public static final C59071e f227783a = C59071e.m91332i("com.google.android.apps.gsa.nowoverlayservice.y");

    /* renamed from: b */
    static final C60547ty f227784b = C60547ty.ACETONE_ACTIVITY;

    /* renamed from: A */
    boolean f227785A;

    /* renamed from: B */
    boolean f227786B;

    /* renamed from: C */
    int f227787C;

    /* renamed from: D */
    int f227788D;

    /* renamed from: E */
    final int f227789E;

    /* renamed from: F */
    public ViewSwitcher f227790F;

    /* renamed from: G */
    ViewSwitcher f227791G;

    /* renamed from: H */
    FitsSystemWindowsNotifierFrameLayout f227792H;

    /* renamed from: I */
    public C90347r f227793I;

    /* renamed from: J */
    final Interpolator f227794J = new C2300b();

    /* renamed from: K */
    View f227795K;

    /* renamed from: L */
    RecyclerView f227796L;

    /* renamed from: M */
    C83532e f227797M;

    /* renamed from: N */
    public View f227798N;

    /* renamed from: O */
    FrameLayout f227799O;

    /* renamed from: P */
    View f227800P;

    /* renamed from: Q */
    public Rect f227801Q;

    /* renamed from: R */
    public Bitmap f227802R;

    /* renamed from: S */
    public String f227803S;

    /* renamed from: T */
    public C90277f f227804T;

    /* renamed from: U */
    public boolean f227805U = false;

    /* renamed from: V */
    public boolean f227806V;

    /* renamed from: W */
    public boolean f227807W = false;

    /* renamed from: X */
    public int f227808X = 1;

    /* renamed from: Y */
    public a f227809Y;

    /* renamed from: Z */
    public C84486a f227810Z;

    /* renamed from: aD */
    private final int f227811aD;

    /* renamed from: aE */
    private final int f227812aE;

    /* renamed from: aF */
    private final C58881cr f227813aF;

    /* renamed from: aG */
    private final C0658ft f227814aG = new C83545r(this);

    /* renamed from: aH */
    private final SharedPreferences.OnSharedPreferenceChangeListener f227815aH = new C83548t(this);

    /* renamed from: aI */
    private boolean f227816aI;

    /* renamed from: aJ */
    private boolean f227817aJ;

    /* renamed from: aK */
    private boolean f227818aK;

    /* renamed from: aL */
    private boolean f227819aL;

    /* renamed from: aM */
    private boolean f227820aM;

    /* renamed from: aN */
    private boolean f227821aN;

    /* renamed from: aO */
    private final Context f227822aO;

    /* renamed from: aP */
    private final boolean f227823aP;

    /* renamed from: aQ */
    private C83426aa f227824aQ;

    /* renamed from: aR */
    private IntentFilter f227825aR;

    /* renamed from: aS */
    private C83428ac f227826aS;

    /* renamed from: aT */
    private IntentFilter f227827aT;

    /* renamed from: aU */
    private boolean f227828aU;

    /* renamed from: aV */
    private String f227829aV;

    /* renamed from: aW */
    private float f227830aW;

    /* renamed from: aX */
    private final C83546s f227831aX = new C83546s(this);

    /* renamed from: c */
    public final boolean f227832c;

    /* renamed from: d */
    public final C58881cr f227833d;

    /* renamed from: e */
    public final C58881cr f227834e;

    /* renamed from: f */
    public C91097g f227835f;

    /* renamed from: g */
    public C91079f f227836g;

    /* renamed from: h */
    public C91142g f227837h;

    /* renamed from: i */
    public C90165af f227838i;

    /* renamed from: j */
    public C58833ax f227839j;

    /* renamed from: k */
    public C68214a f227840k;

    /* renamed from: l */
    public C83468bb f227841l;

    /* renamed from: m */
    public C91022f f227842m;

    /* renamed from: n */
    public C68214a f227843n;

    /* renamed from: o */
    public C90476a f227844o;

    /* renamed from: p */
    public C89289a f227845p;

    /* renamed from: q */
    public C68214a f227846q;

    /* renamed from: r */
    public C22750a f227847r;

    /* renamed from: s */
    public C136895e f227848s;

    /* renamed from: t */
    public C87661j f227849t;

    /* renamed from: u */
    C88864ap f227850u;

    /* renamed from: v */
    C87676ad f227851v;

    /* renamed from: w */
    public C88890a f227852w;

    /* renamed from: x */
    public boolean f227853x;

    /* renamed from: y */
    public boolean f227854y;

    /* renamed from: z */
    public boolean f227855z;

    /* renamed from: com.google.android.apps.gsa.nowoverlayservice.y$a */
    /* compiled from: PG */
    public interface C83554a {
        /* renamed from: rO */
        adb mo76888rO();
    }

    public C83553y(Context context, int i, int i2, boolean z, Bundle bundle, String str, C118827a aVar) {
        super(context, 2132150880, 2132150861, str);
        int i3;
        this.f227822aO = context;
        this.f227811aD = i;
        this.f227812aE = i2;
        if (C89429a.m145461s(C89429a.m145447e(context))) {
            i3 = context.getResources().getColor(R.color.momo_background_protection);
        } else {
            i3 = context.getResources().getColor(R.color.momo_background_protection_non_pixel);
        }
        this.f227789E = i3;
        this.f227787C = i3;
        this.f227788D = i3;
        this.f227832c = z;
        this.f227823aP = C90962a.m148577a(context);
        Bitmap bitmap = (Bitmap) bundle.getParcelable("partner_overlay_icon");
        if (bitmap != null) {
            this.f227802R = bitmap;
        }
        this.f227803S = bundle.getString("partner_overlay_product_name", BuildConfig.FLAVOR);
        this.f62665am = bundle.getString("internal_request_id", BuildConfig.FLAVOR);
        this.f227833d = C58886cw.m90973a(new C83542o(aVar));
        this.f227834e = C58886cw.m90973a(new C83543p(aVar));
        this.f227813aF = C58886cw.m90973a(new C83544q(aVar));
        this.f227806V = bundle.getBoolean("google_overlay_is_default", true);
    }

    /* renamed from: ah */
    private static int m133019ah(int i, double d) {
        double alpha = (double) Color.alpha(i);
        Double.isNaN(alpha);
        return Color.argb((int) (alpha * d), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: ai */
    private final int m133020ai() {
        if (this.f227807W) {
            return 243;
        }
        return !this.f227823aP ? 235 : 230;
    }

    /* renamed from: aj */
    private static int m133021aj(int i, double d) {
        double d2 = 1.0d - d;
        double d3 = 255.0d * d;
        double red = (double) Color.red(i);
        Double.isNaN(red);
        int i2 = (int) ((red * d2) + d3);
        double green = (double) Color.green(i);
        Double.isNaN(green);
        double blue = (double) Color.blue(i);
        Double.isNaN(blue);
        return Color.argb((int) ((d * 20.0d) + 235.0d), i2, (int) ((green * d2) + d3), (int) ((blue * d2) + d3));
    }

    /* renamed from: ak */
    private final int m133022ak(boolean z) {
        return getResources().getColor(true != z ? R.color.momo_light_status_nav_bar_protection : R.color.momo_dark_status_nav_bar_protection);
    }

    /* renamed from: al */
    private final void m133023al() {
        FrameLayout frameLayout = this.f227799O;
        if (frameLayout != null) {
            Window window = this.f62639aa;
            ((C83520c) this.f227846q.mo27525b()).mo76845q(this, window, frameLayout, window.findViewById(16908290), this.f227831aX);
        }
    }

    /* renamed from: am */
    private final void m133024am(C87739bu buVar) {
        C87673aa i = this.f227849t.mo81813i();
        if (i != null) {
            i.mo81937i(new C88489j(buVar).mo82013a());
        }
    }

    /* renamed from: an */
    private final void m133025an() {
        if (this.f227832c) {
            boolean z = false;
            if (this.f227853x && this.f227816aI) {
                z = true;
            }
            if (z != this.f227818aK) {
                this.f227818aK = z;
                if (z) {
                    if (!this.f227854y) {
                        if (this.f227820aM && !this.f227785A) {
                            ((C83520c) this.f227846q.mo27525b()).mo76835g();
                        }
                        C90347r rVar = this.f227793I;
                        if (rVar != null && !this.f227785A) {
                            rVar.mo84041l();
                        }
                        m133024am(C87739bu.ACETONE_LOG_USER_EVENT_MINUS_ONE_SWIPE_IN);
                    }
                    if (this.f227793I != null) {
                        this.f62639aa.getDecorView().sendAccessibilityEvent(4194304);
                    }
                } else if (!this.f227854y) {
                    if (this.f227820aM && !this.f227785A) {
                        ((C83520c) this.f227846q.mo27525b()).mo76834f();
                    }
                    C90347r rVar2 = this.f227793I;
                    if (rVar2 != null && !this.f227785A) {
                        rVar2.mo84038i();
                    }
                }
            }
        }
    }

    /* renamed from: ao */
    private final void m133026ao(float f, float f2) {
        FrameLayout frameLayout;
        View view;
        mo76881H();
        View view2 = this.f227795K;
        if (view2 != null && this.f227796L == null) {
            if (!this.f227820aM || (frameLayout = this.f227799O) == null) {
                this.f227796L = (RecyclerView) view2.findViewById(R.id.recycler_view);
            } else {
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.add(frameLayout);
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        view = null;
                        break;
                    }
                    view = (View) arrayDeque.poll();
                    if (RecyclerView.class.isInstance(view)) {
                        break;
                    } else if (view instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view;
                        int childCount = viewGroup.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            arrayDeque.offer(viewGroup.getChildAt(i));
                        }
                    }
                }
                this.f227796L = (RecyclerView) view;
            }
            RecyclerView recyclerView = this.f227796L;
            if (recyclerView != null) {
                recyclerView.addOnScrollListener(this.f227814aG);
            }
        }
        RecyclerView recyclerView2 = this.f227796L;
        if (recyclerView2 == null) {
            this.f62639aa.setStatusBarColor(0);
        } else if (((double) f) < 0.9999990000000025d) {
            this.f62639aa.setStatusBarColor(m133019ah(mo76882a(recyclerView2), (double) f2));
        }
    }

    /* renamed from: ap */
    private final boolean m133027ap() {
        return this.f227822aO.getPackageManager().isPackageSuspended();
    }

    /* renamed from: aq */
    private final boolean m133028aq() {
        String str = this.f227829aV;
        String b = str != null ? this.f227845p.mo83230b(this.f227822aO, str) : null;
        if (this.f227802R == null || !this.f227837h.mo85405j(C90138q.f251834h)) {
            return false;
        }
        if (b == null || !this.f227837h.mo85405j(C90138q.f251835i) || !this.f227837h.mo85405j(C90138q.f251839m)) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public final void mo76876A(double d) {
        int ai = m133020ai();
        int i = 255 - ai;
        if (!this.f227785A) {
            double d2 = (double) i;
            Double.isNaN(d2);
            double d3 = (double) ai;
            Double.isNaN(d3);
            ai = (int) ((d2 * d) + d3);
        }
        if (!this.f227823aP) {
            this.f227787C = m133021aj(this.f227787C, d);
            this.f227788D = m133021aj(this.f227788D, d);
        }
        this.f227787C = C1924a.m5189h(this.f227787C, ai);
        int h = C1924a.m5189h(this.f227788D, ai);
        this.f227788D = h;
        C83532e eVar = this.f227797M;
        if (eVar != null) {
            eVar.mo76854a(this.f227787C, h);
        }
    }

    /* renamed from: B */
    public final void mo76877B() {
        startActivity(new C89332a("empty-activity", "com.google.android.apps.gsa.velour.dynamichosts.TransparentVelvetDynamicHostActivity").mo83277a(new Intent()));
        ((C118831d) this.f227813aF.mo6453a()).mo104025g(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0169  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28022C(com.google.android.libraries.gsa.p1859d.p1861b.C22766l r14) {
        /*
            r13 = this;
            boolean r0 = r13.f227854y
            if (r0 == 0) goto L_0x0007
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return
        L_0x0007:
            com.google.android.apps.gsa.search.core.ag.b.a r0 = r13.f227810Z
            boolean r1 = r0.mo78207n()
            r2 = 1
            if (r1 == 0) goto L_0x0183
            dagger.a r1 = r0.f229939a
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.ag.a.e r1 = (com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e) r1
            boolean r1 = r1.mo78095ai()
            boolean r0 = r0.mo78197c(r1)
            if (r0 == 0) goto L_0x0183
            r13.f227854y = r2
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            r3 = 0
            if (r14 == 0) goto L_0x0138
            byte[] r4 = r14.f62649a
            if (r4 == 0) goto L_0x0138
            com.google.protobuf.ba r5 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0123 }
            com.google.android.apps.gsa.nowoverlayservice.b.h r6 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83460h.f227521d     // Catch:{ ct -> 0x0123 }
            com.google.protobuf.bv r4 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (byte[]) r4, (com.google.protobuf.C62921ba) r5)     // Catch:{ ct -> 0x0123 }
            com.google.android.apps.gsa.nowoverlayservice.b.h r4 = (com.google.android.apps.gsa.nowoverlayservice.p6423b.C83460h) r4     // Catch:{ ct -> 0x0123 }
            com.google.android.apps.gsa.nowoverlayservice.b.f r4 = r4.f227524b     // Catch:{ ct -> 0x0123 }
            if (r4 != 0) goto L_0x0043
            com.google.android.apps.gsa.nowoverlayservice.b.f r4 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83458f.f227499u     // Catch:{ ct -> 0x0123 }
        L_0x0043:
            int r5 = r4.f227501a     // Catch:{ ct -> 0x0123 }
            r6 = 131072(0x20000, float:1.83671E-40)
            r5 = r5 & r6
            r6 = 2
            if (r5 == 0) goto L_0x0075
            int r5 = r4.f227520t     // Catch:{ ct -> 0x0123 }
            int r5 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83462j.m132859a(r5)     // Catch:{ ct -> 0x0123 }
            if (r5 != 0) goto L_0x0054
            r5 = 1
        L_0x0054:
            int r5 = r5 + -1
            if (r5 == r2) goto L_0x006e
            if (r5 == r6) goto L_0x0067
            r7 = 3
            if (r5 == r7) goto L_0x0060
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a     // Catch:{ ct -> 0x0123 }
            goto L_0x0077
        L_0x0060:
            java.lang.String r5 = "and.gsa.launcher.shelf.appssearch"
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r5)     // Catch:{ ct -> 0x0123 }
            goto L_0x0077
        L_0x0067:
            java.lang.String r5 = "and.gsa.launcher.allapps.appssearch"
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r5)     // Catch:{ ct -> 0x0123 }
            goto L_0x0077
        L_0x006e:
            java.lang.String r5 = "and.gsa.launcher.homescreen.appssearch"
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r5)     // Catch:{ ct -> 0x0123 }
            goto L_0x0077
        L_0x0075:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a     // Catch:{ ct -> 0x0123 }
        L_0x0077:
            com.google.android.apps.search.googleapp.h.p r5 = com.google.android.apps.search.googleapp.p10310h.C136135p.f370764b     // Catch:{ ct -> 0x0123 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ ct -> 0x0123 }
            com.google.android.apps.search.googleapp.h.o r5 = (com.google.android.apps.search.googleapp.p10310h.C136134o) r5     // Catch:{ ct -> 0x0123 }
            com.google.protobuf.cq r7 = r4.f227509i     // Catch:{ ct -> 0x0123 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ ct -> 0x0123 }
        L_0x0085:
            boolean r8 = r7.hasNext()     // Catch:{ ct -> 0x0123 }
            if (r8 == 0) goto L_0x00d7
            java.lang.Object r8 = r7.next()     // Catch:{ ct -> 0x0123 }
            com.google.android.apps.gsa.nowoverlayservice.b.d r8 = (com.google.android.apps.gsa.nowoverlayservice.p6423b.C83456d) r8     // Catch:{ ct -> 0x0123 }
            com.google.android.apps.search.googleapp.h.n r9 = com.google.android.apps.search.googleapp.p10310h.C136133n.f370758e     // Catch:{ ct -> 0x0123 }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ ct -> 0x0123 }
            com.google.android.apps.search.googleapp.h.m r9 = (com.google.android.apps.search.googleapp.p10310h.C136132m) r9     // Catch:{ ct -> 0x0123 }
            java.lang.String r10 = r8.f227497d     // Catch:{ ct -> 0x0123 }
            r9.copyOnWrite()     // Catch:{ ct -> 0x0123 }
            com.google.protobuf.bv r11 = r9.instance     // Catch:{ ct -> 0x0123 }
            com.google.android.apps.search.googleapp.h.n r11 = (com.google.android.apps.search.googleapp.p10310h.C136133n) r11     // Catch:{ ct -> 0x0123 }
            r10.getClass()     // Catch:{ ct -> 0x0123 }
            int r12 = r11.f370760a     // Catch:{ ct -> 0x0123 }
            r12 = r12 | r2
            r11.f370760a = r12     // Catch:{ ct -> 0x0123 }
            r11.f370761b = r10     // Catch:{ ct -> 0x0123 }
            java.lang.String r10 = r8.f227494a     // Catch:{ ct -> 0x0123 }
            r9.copyOnWrite()     // Catch:{ ct -> 0x0123 }
            com.google.protobuf.bv r11 = r9.instance     // Catch:{ ct -> 0x0123 }
            com.google.android.apps.search.googleapp.h.n r11 = (com.google.android.apps.search.googleapp.p10310h.C136133n) r11     // Catch:{ ct -> 0x0123 }
            r10.getClass()     // Catch:{ ct -> 0x0123 }
            int r12 = r11.f370760a     // Catch:{ ct -> 0x0123 }
            r12 = r12 | r6
            r11.f370760a = r12     // Catch:{ ct -> 0x0123 }
            r11.f370762c = r10     // Catch:{ ct -> 0x0123 }
            java.lang.String r8 = r8.f227495b     // Catch:{ ct -> 0x0123 }
            r9.copyOnWrite()     // Catch:{ ct -> 0x0123 }
            com.google.protobuf.bv r10 = r9.instance     // Catch:{ ct -> 0x0123 }
            com.google.android.apps.search.googleapp.h.n r10 = (com.google.android.apps.search.googleapp.p10310h.C136133n) r10     // Catch:{ ct -> 0x0123 }
            r8.getClass()     // Catch:{ ct -> 0x0123 }
            int r11 = r10.f370760a     // Catch:{ ct -> 0x0123 }
            r11 = r11 | 4
            r10.f370760a = r11     // Catch:{ ct -> 0x0123 }
            r10.f370763d = r8     // Catch:{ ct -> 0x0123 }
            r5.mo112791a(r9)     // Catch:{ ct -> 0x0123 }
            goto L_0x0085
        L_0x00d7:
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ ct -> 0x0123 }
            com.google.android.apps.search.googleapp.h.p r5 = (com.google.android.apps.search.googleapp.p10310h.C136135p) r5     // Catch:{ ct -> 0x0123 }
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r5)     // Catch:{ ct -> 0x0123 }
            com.google.android.apps.search.googleapp.pixelsuggest.f r5 = new com.google.android.apps.search.googleapp.pixelsuggest.f     // Catch:{ ct -> 0x0123 }
            com.google.android.apps.gsa.nowoverlayservice.b.b r6 = r4.f227506f     // Catch:{ ct -> 0x0123 }
            if (r6 != 0) goto L_0x00e9
            com.google.android.apps.gsa.nowoverlayservice.b.b r6 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ ct -> 0x0123 }
        L_0x00e9:
            int r6 = r6.f227490d     // Catch:{ ct -> 0x0123 }
            r5.<init>(r6)     // Catch:{ ct -> 0x0123 }
            boolean r6 = r4.f227516p     // Catch:{ ct -> 0x0123 }
            if (r6 == 0) goto L_0x0119
            android.os.Bundle r14 = r14.f62650b     // Catch:{ ct -> 0x0123 }
            if (r14 == 0) goto L_0x0119
            java.lang.String r6 = "preview_bitmap"
            android.os.Parcelable r14 = r14.getParcelable(r6)     // Catch:{ ct -> 0x0123 }
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14     // Catch:{ ct -> 0x0123 }
            if (r14 == 0) goto L_0x0119
            com.google.android.apps.search.googleapp.pixelsuggest.e r6 = r13.f227848s     // Catch:{ ct -> 0x0123 }
            r6.f372595b = r14     // Catch:{ ct -> 0x0123 }
            com.google.android.apps.gsa.nowoverlayservice.b.b r14 = r4.f227515o     // Catch:{ ct -> 0x0123 }
            if (r14 != 0) goto L_0x010a
            com.google.android.apps.gsa.nowoverlayservice.b.b r14 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ ct -> 0x0123 }
        L_0x010a:
            int r14 = r14.f227488b     // Catch:{ ct -> 0x0123 }
            r5.f372598b = r14     // Catch:{ ct -> 0x0123 }
            com.google.android.apps.gsa.nowoverlayservice.b.b r14 = r4.f227510j     // Catch:{ ct -> 0x0123 }
            if (r14 != 0) goto L_0x0114
            com.google.android.apps.gsa.nowoverlayservice.b.b r14 = com.google.android.apps.gsa.nowoverlayservice.p6423b.C83454b.f227485e     // Catch:{ ct -> 0x0123 }
        L_0x0114:
            int r14 = r14.f227488b     // Catch:{ ct -> 0x0123 }
            r5.f372599c = r14     // Catch:{ ct -> 0x0123 }
            goto L_0x011a
        L_0x0119:
            r2 = 0
        L_0x011a:
            com.google.android.apps.search.googleapp.pixelsuggest.e r14 = r13.f227848s     // Catch:{ ct -> 0x0120 }
            r14.f372594a = r5     // Catch:{ ct -> 0x0120 }
            r3 = r2
            goto L_0x0138
        L_0x0120:
            r14 = move-exception
            r3 = r2
            goto L_0x0124
        L_0x0123:
            r14 = move-exception
        L_0x0124:
            com.google.common.f.e r2 = f227783a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "GLCOC"
            r2.mo56378ag(r4, r5)
            java.lang.String r4 = "Bad config in startSearchParams"
            r5 = 6709(0x1a35, float:9.401E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r14)).mo56372aa(r5)).mo56386p(r4)
        L_0x0138:
            android.content.Intent r14 = new android.content.Intent
            r14.<init>()
            com.google.android.apps.search.googleapp.h.i r2 = com.google.android.apps.search.googleapp.p10310h.C136129j.m221208l()
            com.google.android.apps.search.googleapp.u.t r4 = com.google.android.apps.search.googleapp.p10527u.C139779t.SEARCH
            r2.mo112776k(r4)
            r2.mo112773h(r0)
            com.google.android.apps.search.googleapp.h.j r0 = r2.mo112766a()
            com.google.android.apps.search.googleapp.p10310h.C136127h.m221196a(r14, r0)
            r0 = 268468224(0x10008000, float:2.5342157E-29)
            r14.setFlags(r0)
            boolean r0 = r1.mo56113h()
            if (r0 == 0) goto L_0x0167
            java.lang.Object r0 = r1.mo56107c()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "source"
            r14.putExtra(r1, r0)
        L_0x0167:
            if (r3 == 0) goto L_0x016e
            r0 = 65536(0x10000, float:9.18355E-41)
            r14.addFlags(r0)
        L_0x016e:
            com.google.android.apps.gsa.shared.util.t.g r0 = r13.f227835f
            r0.mo65089a(r14)
            android.widget.ViewSwitcher r14 = r13.f227790F
            r14.getClass()
            com.google.android.apps.gsa.nowoverlayservice.l r0 = new com.google.android.apps.gsa.nowoverlayservice.l
            r0.<init>(r13)
            r1 = 250(0xfa, double:1.235E-321)
            r14.postDelayed(r0, r1)
            return
        L_0x0183:
            int r0 = r13.f62656aC
            if (r0 != r2) goto L_0x01a2
            r13.f227854y = r2
            r13.f227855z = r2
            com.google.android.apps.gsa.nowoverlayservice.bb r0 = r13.f227841l
            r0.f227561l = r2
            android.widget.ViewSwitcher r0 = r13.f227790F
            r0.getClass()
            r0.setDisplayedChild(r2)
            com.google.android.apps.gsa.nowoverlayservice.n r1 = new com.google.android.apps.gsa.nowoverlayservice.n
            r1.<init>(r13, r14)
            r0.post(r1)
            r13.mo76881H()
        L_0x01a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nowoverlayservice.C83553y.mo28022C(com.google.android.libraries.gsa.d.b.l):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final void mo76878D() {
        boolean z;
        ViewSwitcher viewSwitcher;
        if (this.f227837h.mo85405j(C90138q.f251832f) && m133027ap() != (z = this.f227785A) && (viewSwitcher = this.f227791G) != null) {
            this.f227785A = !z;
            C0395p pVar = this.f62664al;
            Objects.requireNonNull(viewSwitcher);
            pVar.runOnUiThread(new C83540m(viewSwitcher));
            if (this.f227785A) {
                C90347r rVar = this.f227793I;
                if (rVar != null) {
                    rVar.mo84038i();
                }
                if (this.f227820aM) {
                    ((C83520c) this.f227846q.mo27525b()).mo76834f();
                }
            }
            if (this.f227853x && !this.f227854y && this.f227785A) {
                mo76877B();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final void mo28023E(Bundle bundle) {
        Bitmap bitmap = (Bitmap) bundle.getParcelable("partner_overlay_icon");
        if (bitmap != null) {
            mo76879F(bitmap);
        }
        mo76880G(bundle.getString("partner_overlay_product_name", BuildConfig.FLAVOR));
    }

    /* renamed from: F */
    public final void mo76879F(Bitmap bitmap) {
        C90277f fVar;
        if (bitmap != null && (fVar = this.f227804T) != null) {
            fVar.mo83982b(bitmap);
            this.f227802R = bitmap;
        }
    }

    /* renamed from: G */
    public final void mo76880G(String str) {
        if (this.f227804T != null && !BuildConfig.FLAVOR.equals(str)) {
            this.f227804T.mo83983c(str);
            this.f227803S = str;
        }
    }

    /* renamed from: I */
    public final boolean mo28024I() {
        return this.f227786B;
    }

    /* renamed from: J */
    public final boolean mo28025J() {
        C68214a aVar;
        if (this.f227820aM && (aVar = this.f227846q) != null) {
            return ((C83520c) aVar.mo27525b()).mo76843o();
        }
        C90347r rVar = this.f227793I;
        if (rVar != null) {
            C90318b bVar = (C90318b) rVar.f252316j.mo27525b();
            bVar.f252245a.mo28328a();
            return !bVar.f252246b.isEmpty();
        }
        C87661j jVar = this.f227849t;
        return jVar != null && jVar.mo81830z();
    }

    /* renamed from: K */
    public final boolean mo28026K() {
        return this.f227837h.mo85405j(C90138q.f251848v);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final boolean mo28027L() {
        return this.f227828aU;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final boolean mo28028M() {
        return this.f227837h.mo85405j(C90138q.f251850x);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final boolean mo28029N() {
        return this.f227837h.mo85405j(C90138q.f251849w);
    }

    /* renamed from: O */
    public final boolean mo28030O() {
        return this.f227837h.mo85405j(C90138q.f251852z);
    }

    /* renamed from: P */
    public final void mo28031P(int i) {
        this.f227847r.mo27917D(this.f62659ag, this.f62678az, this.f62655aB);
        this.f227847r.mo27918G(this.f62659ag, i);
    }

    /* renamed from: Q */
    public final void mo28032Q(int i) {
        this.f227806V = true;
        this.f227847r.mo27917D(this.f62659ag, this.f62678az, this.f62655aB);
        this.f227847r.mo27919H(this.f62659ag, i);
    }

    /* renamed from: R */
    public final void mo28033R(int i) {
        boolean z = this.f227853x;
        boolean z2 = false;
        boolean z3 = i == 1;
        if (mo28045ae()) {
            this.f227853x = true;
            this.f227830aW = 1.0f;
            C58976aa aaVar = C58975e.f156826a;
        } else if (z3) {
            this.f227853x = false;
            this.f227830aW = 0.0f;
            C58976aa aaVar2 = C58975e.f156826a;
        }
        if (!this.f227854y && i != 2) {
            if (z3 && z) {
                m133024am(C87739bu.ACETONE_LOG_USER_EVENT_MINUS_ONE_CLOSE);
            } else if (z3 != z) {
                m133024am(C87739bu.ACETONE_LOG_USER_EVENT_MINUS_ONE_SWIPE_FAILED);
            }
        }
        m133025an();
        if (this.f227820aM) {
            ((C83520c) this.f227846q.mo27525b()).mo76831b(i == 2);
        }
        C90347r rVar = this.f227793I;
        if (rVar != null) {
            if (i == 2) {
                z2 = true;
            }
            C90319c cVar = (C90319c) rVar.f252317k.mo27525b();
            cVar.f252247a.mo28328a();
            if (cVar.f252249c != z2) {
                C58976aa aaVar3 = C58975e.f156826a;
                cVar.f252249c = z2;
                for (C90321e eVar : cVar.f252248b) {
                    if (cVar.f252249c) {
                        eVar.mo84002a();
                    } else {
                        eVar.mo84003b();
                    }
                }
            }
        }
        if (this.f227853x && !z && !this.f227854y && this.f227785A) {
            mo76877B();
        }
    }

    /* renamed from: S */
    public final void mo28034S(PrintWriter printWriter) {
        int i = this.f62660ah;
        printWriter.println("      mWindowShift: " + i);
        boolean z = this.f62673au;
        printWriter.println("      mAcceptExternalMove: " + z);
        int i2 = this.f62656aC;
        printWriter.println("      mDrawerState: ".concat(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "OPEN_AS_LAYER" : "OPEN_AS_DRAWER" : "DRAGGING" : "CLOSED"));
        int i3 = this.f62654aA;
        printWriter.println("      mActivityStateFlags: " + i3);
        String valueOf = String.valueOf(this.f62669aq);
        printWriter.println("      mWrapperView: " + valueOf);
        String str = this.f62662aj;
        printWriter.println("      sourcePackage: " + str);
        int i4 = this.f62663ak;
        printWriter.println("      sourceServiceVersion: " + i4);
        String str2 = this.f62665am;
        printWriter.println("      attachRequestId: " + str2);
        C22754ad adVar = this.f62669aq;
        String concat = "      ".concat("  ");
        float f = adVar.f62615f;
        printWriter.println(concat + "mPanelPositionRatio: " + f);
        float f2 = adVar.f62617h;
        printWriter.println(concat + "mDownX: " + f2);
        float f3 = adVar.f62618i;
        printWriter.println(concat + "mDownY: " + f3);
        int i5 = adVar.f62623n;
        printWriter.println(concat + "mActivePointerId: " + i5);
        int i6 = adVar.f62624o;
        printWriter.println(concat + "mTouchState: " + i6);
        boolean z2 = adVar.f62628s;
        printWriter.println(concat + "mIsPanelOpen: " + z2);
        boolean z3 = adVar.f62629t;
        printWriter.println(concat + "mIsPageMoving: " + z3);
        boolean z4 = adVar.f62606C;
        printWriter.println(concat + "mSettling: " + z4);
        boolean z5 = adVar.f62630u;
        printWriter.println(concat + "mForceDrag: " + z5);
        adVar.f62627r.mo28124d(concat, printWriter);
        ((C22769o) adVar).f62680a.mo28124d(concat, printWriter);
        this.f62657ae.mo28124d("      ", printWriter);
        boolean aq = m133028aq();
        printWriter.println("      isSharedOverlayEnabled: " + aq);
        C91006f f4 = C91006f.m148645f(this.f227844o);
        f4.mo85286m(this);
        f4.mo85295u(printWriter, "      ");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo76882a(RecyclerView recyclerView) {
        int i;
        C0653fo foVar = recyclerView.mLayout;
        if (foVar instanceof LinearLayoutManager) {
            i = ((LinearLayoutManager) foVar).findFirstVisibleItemPosition();
        } else if (foVar instanceof DiscoverStaggeredGridLayoutManager) {
            int i2 = -1;
            for (int i3 : ((DiscoverStaggeredGridLayoutManager) foVar).mo8517o((int[]) null)) {
                if (i3 != -1 && (i2 == -1 || i3 < i2)) {
                    i2 = i3;
                }
            }
            i = i2;
        } else {
            if (foVar != null) {
                String name = foVar.getClass().getName();
                C59104x d = f227783a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "GLCOC");
                ((C59052c) ((C59052c) d).mo56372aa(6685)).mo56389s("Expected a LinearLayoutManager or a DiscoverStaggeredGridLayoutManager but layoutManager type was %s", name);
            }
            i = 0;
        }
        int ak = m133022ak(this.f227823aP);
        if (foVar == null || i != 0) {
            mo76876A(1.0d);
            return ak;
        }
        View findViewByPosition = foVar.findViewByPosition(0);
        double bottom = (double) findViewByPosition.getBottom();
        double height = (double) findViewByPosition.getHeight();
        Double.isNaN(bottom);
        Double.isNaN(height);
        double d2 = 1.0d - (bottom / height);
        int ah = m133019ah(ak, d2);
        mo76876A(d2);
        return ah;
    }

    /* renamed from: b */
    public final C88890a mo76883b() {
        C88890a aVar = new C88890a(getResources().getColor(R.color.search_scrim), getResources().getColor(R.color.activity_background), getResources().getColor(R.color.status_bar_background), getResources().getDimensionPixelSize(getResources().getIdentifier("status_bar_height", "dimen", "android")));
        aVar.mo82738c(0);
        aVar.mo82737b(true);
        aVar.f240792d = true;
        aVar.invalidateSelf();
        aVar.setAlpha(PrivateKeyType.INVALID);
        return aVar;
    }

    /* renamed from: e */
    public final void mo28048e(C22749a aVar) {
        if (this.f227854y) {
            this.f227841l.mo76796e();
            return;
        }
        this.f227849t.mo81817m(true);
        this.f227849t.mo17500a();
        this.f227849t.mo81817m(false);
        super.mo28048e(aVar);
    }

    /* renamed from: f */
    public final void mo76884f() {
    }

    /* renamed from: g */
    public final void mo28049g(Bundle bundle) {
        this.f227787C = bundle.getInt("background_color_hint", this.f227789E);
        int i = bundle.getInt("background_secondary_color_hint", this.f227789E);
        this.f227788D = i;
        C83532e eVar = this.f227797M;
        if (eVar != null) {
            eVar.mo76854a(this.f227787C, i);
        }
    }

    /* JADX WARNING: type inference failed for: r0v74, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: gS */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17602gS(com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f r6) {
        /*
            r5 = this;
            java.lang.String r0 = "GsaLauncherClientOverlayController"
            r6.mo85291r(r0)
            java.lang.String r0 = "started"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            boolean r1 = r5.f227817aJ
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r1)
            r0.mo85276a(r1)
            java.lang.String r0 = "resumed"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            boolean r1 = r5.f227816aI
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r1)
            r0.mo85276a(r1)
            java.lang.String r0 = "drawerIsOpen"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            boolean r1 = r5.f227853x
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r1)
            r0.mo85276a(r1)
            java.lang.String r0 = "overlayShown"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            boolean r1 = r5.f227818aK
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r1)
            r0.mo85276a(r1)
            java.lang.String r0 = "isUsingMonet"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            r1 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            com.google.android.apps.gsa.shared.util.b.i r2 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r2)
            r0.mo85276a(r2)
            java.lang.String r0 = "enableTng"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            boolean r2 = r5.f227820aM
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.google.android.apps.gsa.shared.util.b.i r2 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r2)
            r0.mo85276a(r2)
            java.lang.String r0 = "isGoogleOverlayEnabled"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            boolean r2 = r5.f227806V
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.google.android.apps.gsa.shared.util.b.i r2 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r2)
            r0.mo85276a(r2)
            java.lang.String r0 = "isPackageSuspended"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            boolean r2 = r5.m133027ap()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.google.android.apps.gsa.shared.util.b.i r2 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r2)
            r0.mo85276a(r2)
            java.lang.String r0 = "tngInitializationState"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            int r2 = r5.f227808X
            if (r2 == r1) goto L_0x00bd
            r1 = 2
            if (r2 == r1) goto L_0x00ba
            r1 = 3
            if (r2 == r1) goto L_0x00b7
            r1 = 4
            if (r2 == r1) goto L_0x00b4
            java.lang.String r1 = "null"
            goto L_0x00bf
        L_0x00b4:
            java.lang.String r1 = "RETRYABLE_FAILURE"
            goto L_0x00bf
        L_0x00b7:
            java.lang.String r1 = "FAILED"
            goto L_0x00bf
        L_0x00ba:
            java.lang.String r1 = "INITIALIZED"
            goto L_0x00bf
        L_0x00bd:
            java.lang.String r1 = "UNINITIALIZED"
        L_0x00bf:
            r3 = 0
            if (r2 == 0) goto L_0x033d
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148229c(r1)
            r0.mo85276a(r1)
            java.lang.String r0 = "isInSearchMode"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            boolean r1 = r5.f227854y
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r1)
            r0.mo85276a(r1)
            java.lang.String r0 = "isDarkTheme"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            boolean r1 = r5.f227823aP
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r1)
            r0.mo85276a(r1)
            java.lang.String r0 = "isSystemUsingLightStatusNavBar"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            boolean r1 = r5.f227819aL
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r1)
            r0.mo85276a(r1)
            java.lang.String r0 = "extractedWallpaperColor"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            int r1 = r5.f227787C
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "0x"
            java.lang.String r1 = r2.concat(r1)
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148229c(r1)
            r0.mo85276a(r1)
            java.lang.String r0 = "secondaryExtractedWallpaperColor"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            int r1 = r5.f227788D
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r2.concat(r1)
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148229c(r1)
            r0.mo85276a(r1)
            java.lang.String r0 = r5.f227829aV
            if (r0 == 0) goto L_0x014d
            java.lang.String r0 = "partnerPackageName"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            java.lang.String r1 = r5.f227829aV
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148233g(r1)
            r0.mo85276a(r1)
        L_0x014d:
            android.content.Context r0 = r5.f227822aO
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            java.lang.String r1 = "window widthPixels"
            com.google.android.apps.gsa.shared.util.debug.a.e r1 = r6.mo85279c(r1)
            int r4 = r0.widthPixels
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.google.android.apps.gsa.shared.util.b.i r4 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148230d(r4)
            r1.mo85276a(r4)
            java.lang.String r1 = "window heightPixels"
            com.google.android.apps.gsa.shared.util.debug.a.e r1 = r6.mo85279c(r1)
            int r0 = r0.heightPixels
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.google.android.apps.gsa.shared.util.b.i r0 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148230d(r0)
            r1.mo85276a(r0)
            com.google.android.apps.gsa.shared.ui.FitsSystemWindowsNotifierFrameLayout r0 = r5.f227792H
            if (r0 == 0) goto L_0x01af
            java.lang.String r0 = "windowRootLayoutForMonet.getWidth()"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            com.google.android.apps.gsa.shared.ui.FitsSystemWindowsNotifierFrameLayout r1 = r5.f227792H
            int r1 = r1.getWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148230d(r1)
            r0.mo85276a(r1)
            java.lang.String r0 = "windowRootLayoutForMonet.getHeight()"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            com.google.android.apps.gsa.shared.ui.FitsSystemWindowsNotifierFrameLayout r1 = r5.f227792H
            int r1 = r1.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148230d(r1)
            r0.mo85276a(r1)
        L_0x01af:
            android.view.View r0 = r5.f227798N
            if (r0 == 0) goto L_0x0224
            java.lang.String r0 = "snoRootLayout.getWidth()"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            android.view.View r1 = r5.f227798N
            int r1 = r1.getWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148230d(r1)
            r0.mo85276a(r1)
            java.lang.String r0 = "snoRootLayout.getHeight()"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            android.view.View r1 = r5.f227798N
            int r1 = r1.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148230d(r1)
            r0.mo85276a(r1)
            android.view.View r0 = r5.f227798N
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r1 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r1 == 0) goto L_0x020b
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            int r0 = r0.getColor()
            java.lang.String r1 = "snoRootLayout.getBackground().getColor()"
            com.google.android.apps.gsa.shared.util.debug.a.e r1 = r6.mo85279c(r1)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r2.concat(r0)
            com.google.android.apps.gsa.shared.util.b.i r0 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148229c(r0)
            r1.mo85276a(r0)
            goto L_0x0218
        L_0x020b:
            java.lang.String r1 = "snoRootLayout.getBackground()"
            com.google.android.apps.gsa.shared.util.debug.a.e r1 = r6.mo85279c(r1)
            com.google.android.apps.gsa.shared.util.b.i r0 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148231e(r0)
            r1.mo85276a(r0)
        L_0x0218:
            android.view.View r0 = r5.f227798N
            r1 = 2131435537(0x7f0b2011, float:1.8492919E38)
            android.view.View r0 = r0.findViewById(r1)
            r3 = r0
            android.widget.EditText r3 = (android.widget.EditText) r3
        L_0x0224:
            if (r3 == 0) goto L_0x0275
            java.lang.String r0 = "queryTextView.getContext().getClass()"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            android.content.Context r1 = r3.getContext()
            java.lang.Class r1 = r1.getClass()
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148231e(r1)
            r0.mo85276a(r1)
            java.lang.String r0 = "isDarkModeEnabledInContext(queryTextView.getContext())"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            android.content.Context r1 = r3.getContext()
            boolean r1 = com.google.android.apps.gsa.shared.util.p7162d.C90962a.m148577a(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r1)
            r0.mo85276a(r1)
            android.content.res.ColorStateList r0 = r3.getTextColors()
            int r0 = r0.getDefaultColor()
            java.lang.String r1 = "queryTextView.getTextColors()"
            com.google.android.apps.gsa.shared.util.debug.a.e r1 = r6.mo85279c(r1)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r2.concat(r0)
            com.google.android.apps.gsa.shared.util.b.i r0 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148229c(r0)
            r1.mo85276a(r0)
        L_0x0275:
            android.graphics.Rect r0 = r5.f227801Q
            if (r0 == 0) goto L_0x02c5
            java.lang.String r1 = "monetInsets top"
            com.google.android.apps.gsa.shared.util.debug.a.e r1 = r6.mo85279c(r1)
            int r2 = r0.top
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.apps.gsa.shared.util.b.i r2 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148230d(r2)
            r1.mo85276a(r2)
            java.lang.String r1 = "monetInsets bottom"
            com.google.android.apps.gsa.shared.util.debug.a.e r1 = r6.mo85279c(r1)
            int r2 = r0.bottom
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.apps.gsa.shared.util.b.i r2 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148230d(r2)
            r1.mo85276a(r2)
            java.lang.String r1 = "monetInsets left"
            com.google.android.apps.gsa.shared.util.debug.a.e r1 = r6.mo85279c(r1)
            int r2 = r0.left
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.apps.gsa.shared.util.b.i r2 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148230d(r2)
            r1.mo85276a(r2)
            java.lang.String r1 = "monetInsets right"
            com.google.android.apps.gsa.shared.util.debug.a.e r1 = r6.mo85279c(r1)
            int r0 = r0.right
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.google.android.apps.gsa.shared.util.b.i r0 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148230d(r0)
            r1.mo85276a(r0)
        L_0x02c5:
            java.lang.String r0 = "parentContext.getClass()"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            android.content.Context r1 = r5.f227822aO
            java.lang.Class r1 = r1.getClass()
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148231e(r1)
            r0.mo85276a(r1)
            java.lang.String r0 = "isDarkModeEnabledInContext(parentContext)"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            android.content.Context r1 = r5.f227822aO
            boolean r1 = com.google.android.apps.gsa.shared.util.p7162d.C90962a.m148577a(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r1)
            r0.mo85276a(r1)
            java.lang.String r0 = "isDarkModeEnabledInContext(this)"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            boolean r1 = com.google.android.apps.gsa.shared.util.p7162d.C90962a.m148577a(r5)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r1)
            r0.mo85276a(r1)
            java.lang.String r0 = "isDarkModeEnabledInContext(getApplicationContext())"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r6.mo85279c(r0)
            android.content.Context r1 = r5.getApplicationContext()
            boolean r1 = com.google.android.apps.gsa.shared.util.p7162d.C90962a.m148577a(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r1)
            r0.mo85276a(r1)
            com.google.android.apps.gsa.nowoverlayservice.bb r0 = r5.f227841l
            r6.mo85286m(r0)
            com.google.android.apps.gsa.shared.monet.r r0 = r5.f227793I
            r6.mo85286m(r0)
            com.google.android.apps.gsa.search.shared.overlay.j r0 = r5.f227849t
            r6.mo85286m(r0)
            com.google.android.apps.gsa.searchnow.ap r0 = r5.f227850u
            r6.mo85286m(r0)
            dagger.a r0 = r5.f227846q
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.util.debug.a.b r0 = (com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b) r0
            r6.mo85286m(r0)
            return
        L_0x033d:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nowoverlayservice.C83553y.mo17602gS(com.google.android.apps.gsa.shared.util.debug.a.f):void");
    }

    /* renamed from: h */
    public final void mo76885h() {
        C90277f fVar = this.f227804T;
        if (fVar == null) {
            return;
        }
        if (this.f227853x) {
            fVar.mo83981a(new C83534g(this));
        } else {
            fVar.mo83981a(C83535h.f227761a);
        }
    }

    /* renamed from: j */
    public final void mo76886j(int i) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        int i2 = this.f227811aD;
        if (!(i2 == Integer.MAX_VALUE || i2 == 0)) {
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164253h |= C89885b.HTTP_VALUE;
            ufVar2.f164152bF = i2;
        }
        int i3 = this.f227812aE;
        if (!(i3 == Integer.MAX_VALUE || i3 == 0)) {
            tzVar.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar.instance;
            ufVar3.f164253h |= 524288;
            ufVar3.f164153bG = i3;
        }
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo28052k() {
        Bitmap bitmap;
        if (this.f227805U && this.f62675aw != null && this.f62663ak >= 10) {
            if (this.f227823aP) {
                bitmap = BitmapFactory.decodeResource(this.f227822aO.getResources(), R.drawable.partner_to_google_switch_dark_mode_button);
            } else {
                bitmap = BitmapFactory.decodeResource(this.f227822aO.getResources(), R.drawable.partner_to_google_switch_light_mode_button);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("google_overlay_icon", bitmap);
            try {
                this.f62675aw.mo28130c(bundle);
            } catch (RemoteException e) {
                C59104x c = f227783a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GLCOC");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(6687)).mo56386p("Failed to execute the callback overlayStatusChanged2");
            }
        }
    }

    /* renamed from: l */
    public final void mo76887l() {
        if (!this.f227820aM) {
            return;
        }
        if (this.f227817aJ) {
            Window window = this.f62639aa;
            FitsSystemWindowsNotifierFrameLayout fitsSystemWindowsNotifierFrameLayout = this.f227792H;
            fitsSystemWindowsNotifierFrameLayout.getClass();
            ((C83520c) this.f227846q.mo27525b()).mo76844p(window, fitsSystemWindowsNotifierFrameLayout.findViewById(R.id.tng_container), this.f62639aa.findViewById(16908290), this.f227831aX);
            return;
        }
        this.f227821aN = true;
    }

    /* renamed from: m */
    public final void mo27993m() {
        if (this.f227854y) {
            this.f227841l.mo76802k();
        } else if (!this.f227849t.mo81807an()) {
            m133024am(C87739bu.ACETONE_LOG_USER_EVENT_MINUS_ONE_TAP_BACK_BUTTON);
            mo28048e(new C22757c(2, 0));
        }
    }

    /* renamed from: n */
    public final void mo28053n(Bundle bundle, Bundle bundle2) {
        String str;
        boolean z;
        IntentFilter intentFilter;
        C90347r rVar;
        FrameLayout frameLayout;
        Bundle bundle3 = bundle;
        Bundle bundle4 = bundle2;
        C58976aa aaVar = C58975e.f156826a;
        adb rO = ((C83554a) C47266f.m84076a(this, C83554a.class)).mo76888rO();
        rO.f195476b = this;
        C68225k.m98529a(rO.f195476b, C83553y.class);
        add add = new add(rO.f195475a, rO.f195476b);
        this.f227835f = (C91097g) add.f195479c.mo17428b();
        this.f227836g = new ProxyPermissionsRequester((C91097g) add.f195479c.mo17428b(), add.f195477a);
        this.f227837h = (C91142g) add.f195478b.bq.mo17428b();
        this.f227809Y = (a) add.f195478b.b.f200493kd.mo17428b();
        this.f227838i = (C90165af) add.f195480d.mo17428b();
        this.f227839j = (C58833ax) add.f195481e.mo17428b();
        C91748d dVar = (C91748d) add.f195478b.a.f202707cE.mo17428b();
        this.f227840k = C68219e.m98518a(add.f195489m);
        this.f227841l = new C83468bb(add.f195477a, (C22871g) add.f195478b.aT.mo17428b(), (C91142g) add.f195478b.bq.mo17428b(), (C139921f) add.f195478b.ff.mo17428b(), (C21370a) add.f195478b.i.mo17428b());
        this.f227842m = (C91022f) add.f195478b.a.f202649b.mo17428b();
        this.f227843n = C68219e.m98518a(add.f195490n);
        this.f227844o = (C90476a) add.f195478b.r.mo17428b();
        this.f227845p = (C89289a) add.f195491o.mo17428b();
        this.f227846q = C68219e.m98518a(add.f195478b.b.f200494ke);
        this.f227847r = (C22750a) add.f195478b.b.f200495kf.mo17428b();
        this.f227810Z = (C84486a) add.f195478b.a.f202660bK.mo17428b();
        this.f227848s = (C136895e) add.f195478b.b.f200496kg.mo17428b();
        C22762h hVar = (C22762h) this.f62664al;
        hVar.f62646k.mo573d((Fragment) null);
        hVar.f62646k.mo576g();
        this.f62676ax = this.f227837h.mo85405j(C90138q.f251838l);
        C83427ab abVar = new C83427ab(this);
        C90164ae a = this.f227838i.mo83913a("MINUS_ONE_HEADER_RENDERER");
        a.f251927a = abVar;
        a.mo83912a();
        C89838ab.m146260d(this.f62664al, f227784b, 0);
        C89838ab.m146263g();
        boolean aq = m133028aq();
        this.f227805U = aq;
        if (aq) {
            this.f227847r.mo27915A(this.f62665am);
        }
        this.f227847r.mo27930o(this.f62665am);
        this.f227787C = bundle3.getInt("background_color_hint", this.f227789E);
        this.f227788D = bundle3.getInt("background_secondary_color_hint", this.f227789E);
        float[] fArr = new float[3];
        Color.colorToHSV(this.f227787C, fArr);
        float[] fArr2 = new float[3];
        Color.colorToHSV(this.f227788D, fArr2);
        int ai = m133020ai();
        if (this.f227823aP) {
            fArr[2] = 0.12f;
            fArr2[2] = 0.12f;
            int HSVToColor = Color.HSVToColor(fArr);
            this.f227787C = HSVToColor;
            this.f227787C = C1924a.m5189h(HSVToColor, ai);
            int HSVToColor2 = Color.HSVToColor(fArr2);
            this.f227788D = HSVToColor2;
            this.f227788D = C1924a.m5189h(HSVToColor2, ai);
        } else {
            fArr[1] = 0.005f;
            fArr2[1] = 0.005f;
            fArr[2] = 0.995f;
            fArr2[2] = 0.995f;
            int HSVToColor3 = Color.HSVToColor(fArr);
            this.f227787C = HSVToColor3;
            this.f227787C = C1924a.m5189h(HSVToColor3, ai);
            int HSVToColor4 = Color.HSVToColor(fArr2);
            this.f227788D = HSVToColor4;
            this.f227788D = C1924a.m5189h(HSVToColor4, ai);
        }
        ResolveInfo a2 = this.f227845p.mo83229a(this.f227822aO);
        if (a2 == null) {
            str = null;
        } else {
            str = a2.serviceInfo.applicationInfo.packageName;
        }
        if (str != null && this.f227837h.mo85405j(C90138q.f251835i)) {
            this.f227829aV = str;
        }
        this.f227786B = this.f227837h.mo85406k("GsaPrefs.AgsaNow__enable_restore_on_minus_one", false);
        this.f227820aM = this.f227810Z.mo78206m();
        this.f227792H = new FitsSystemWindowsNotifierFrameLayout(this);
        this.f227798N = LayoutInflater.from(this).inflate(R.layout.launcher_client_search_container, this.f227792H, false);
        C88890a b = mo76883b();
        this.f227852w = b;
        this.f227798N.setBackground(b);
        this.f227849t = (C87661j) this.f227840k.mo27525b();
        C83468bb bbVar = this.f227841l;
        bbVar.f227565p = (LinearLayout) this.f227798N.findViewById(R.id.search_suggestions_linear);
        bbVar.f227554e = (C83471be) this.f227849t;
        SearchPlate searchPlate = bbVar.f227554e.f236778H;
        searchPlate.f240748u.mo82771a(searchPlate.f240740m.f240980b, 0);
        bbVar.f227554e.mo81769B(new C83467ba(bbVar));
        bbVar.f227574y = bbVar.f227554e.f236879u;
        OverlaySearchPlateContainer overlaySearchPlateContainer = (OverlaySearchPlateContainer) bbVar.f227574y.findViewById(R.id.search_plate_container);
        bbVar.f227569t = new C83475bi(bbVar.f227551b, overlaySearchPlateContainer.findViewById(R.id.navigation_button), overlaySearchPlateContainer.findViewById(R.id.clear_or_voice_button), overlaySearchPlateContainer.findViewById(R.id.search_box), overlaySearchPlateContainer);
        bbVar.f227569t.f227606i = bbVar;
        bbVar.f227572w = new C83447av(bbVar);
        bbVar.f227574y.setOnTouchListener(bbVar.f227572w);
        C83468bb bbVar2 = this.f227841l;
        bbVar2.f227546L = new C83552x(this);
        int i = this.f227811aD;
        int i2 = this.f227812aE;
        bbVar2.f227575z = i;
        bbVar2.f227535A = i2;
        this.f227850u = (C88864ap) this.f227843n.mo27525b();
        C83444as asVar = new C83444as(this.f227822aO);
        C83468bb bbVar3 = this.f227841l;
        bbVar3.f227553d = asVar;
        ((C83444as) bbVar3.f227553d).f227448L = bbVar3;
        Bundle bundle5 = (bundle4 == null || !this.f227786B) ? null : bundle4.getBundle("MONET_CLIENT_STATE");
        a aVar = this.f227809Y;
        C87673aa i3 = this.f227849t.mo81813i();
        i3.getClass();
        C118575h hVar2 = C118575h.RENDER_SEARCH_NOW_OVERLAY;
        C90252a aVar2 = (C90252a) C90253b.f252103g.createBuilder();
        boolean z2 = this.f227823aP;
        aVar2.copyOnWrite();
        C90253b bVar = (C90253b) aVar2.instance;
        bVar.f252105a |= 1;
        bVar.f252106b = z2;
        boolean z3 = this.f227832c && !this.f227820aM;
        aVar2.copyOnWrite();
        C90253b bVar2 = (C90253b) aVar2.instance;
        bVar2.f252105a |= 4;
        bVar2.f252108d = z3;
        boolean z4 = this.f227805U;
        aVar2.copyOnWrite();
        C90253b bVar3 = (C90253b) aVar2.instance;
        bVar3.f252105a |= 16;
        bVar3.f252110f = z4;
        String str2 = this.f227829aV;
        if (str2 != null) {
            aVar2.copyOnWrite();
            C90253b bVar4 = (C90253b) aVar2.instance;
            bVar4.f252105a = 2 | bVar4.f252105a;
            bVar4.f252107c = str2;
        }
        String str3 = this.f62662aj;
        if (str3 != null) {
            aVar2.copyOnWrite();
            C90253b bVar5 = (C90253b) aVar2.instance;
            bVar5.f252105a |= 8;
            bVar5.f252109e = str3;
        }
        Bundle bundle6 = bundle5;
        C90347r a3 = aVar.a(this, i3, "PixelLauncher", hVar2, new InitializationData(C90251a.f252102a, C23245b.m43556a((C90253b) aVar2.build()), (Intent) null), true, bundle5, new C90160aa(this.f227835f), this.f227836g, C58833ax.m90834k(this.f227838i), this.f227839j, C90460b.f252688a);
        this.f227793I = a3;
        this.f227792H.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f227792H.f253358a = new C83537j(this);
        this.f227824aQ = new C83426aa(this);
        this.f227825aR = new IntentFilter("com.google.nexuslauncher.FAST_TEXT_SEARCH");
        FrameLayout frameLayout2 = new FrameLayout(this.f227822aO);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout2.addView(this.f227798N);
        ViewSwitcher viewSwitcher = new ViewSwitcher(this.f227822aO);
        if (this.f227837h.mo85405j(C90138q.f251832f)) {
            z = false;
            View inflate = LayoutInflater.from(this).inflate(R.layout.suspended_view_container, this.f227792H, false);
            this.f227800P = inflate;
            ((ImageView) inflate.findViewById(R.id.google_search_launcher_icon)).setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.213f, 0.715f, 0.072f, 0.0f, 40.0f, 0.213f, 0.715f, 0.072f, 0.0f, 40.0f, 0.213f, 0.715f, 0.072f, 0.0f, 40.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
            View view = this.f227800P;
            if (view != null) {
                view.setOnClickListener(new C83533f(this));
            }
            this.f227826aS = new C83428ac(this);
            IntentFilter intentFilter2 = new IntentFilter();
            this.f227827aT = intentFilter2;
            intentFilter2.addAction("android.intent.action.MY_PACKAGE_SUSPENDED");
            this.f227827aT.addAction("android.intent.action.MY_PACKAGE_UNSUSPENDED");
        } else {
            z = false;
        }
        if (this.f227820aM) {
            this.f227799O = (FrameLayout) LayoutInflater.from(new ContextThemeWrapper(this, 2132150662)).inflate(R.layout.tng_container, this.f227792H, z);
        }
        if (!this.f227832c || (rVar = this.f227793I) == null) {
            viewSwitcher.addView(frameLayout2, z ? 1 : 0);
        } else {
            View c = rVar.mo84033c();
            this.f227795K = c;
            if (this.f227820aM && (frameLayout = this.f227799O) != null) {
                c = frameLayout;
            }
            View view2 = this.f227800P;
            if (view2 != null) {
                ViewSwitcher viewSwitcher2 = new ViewSwitcher(this.f227822aO);
                viewSwitcher2.addView(c, z);
                viewSwitcher2.addView(view2, 1);
                viewSwitcher2.setDisplayedChild(z);
                this.f227785A = z;
                this.f227791G = viewSwitcher2;
                viewSwitcher.addView(viewSwitcher2, z);
            } else {
                viewSwitcher.addView(c, z);
            }
            viewSwitcher.addView(frameLayout2, 1);
            viewSwitcher.setDisplayedChild(z);
        }
        this.f227790F = viewSwitcher;
        if (this.f227820aM) {
            if (a3 != null && this.f227837h.mo85405j(C90138q.f251828b)) {
                ((C83520c) this.f227846q.mo27525b()).mo76842n(true);
                ((C22998v) a3.f252320n.mo27525b()).f63262a.add(new C83549u(this, a3));
            }
            m133023al();
            ((C83520c) this.f227846q.mo27525b()).mo76832c(bundle6);
        }
        this.f227841l.f227568s = new C83538k(viewSwitcher);
        this.f227792H.addView(this.f227790F);
        this.f62670ar.addView(this.f227792H);
        this.f62639aa.setTitle(getResources().getString(R.string.now_cards));
        C83532e eVar = new C83532e(this.f227822aO);
        this.f227797M = eVar;
        eVar.mo76854a(this.f227787C, this.f227788D);
        this.f62669aq.mo27968j(this.f227797M);
        this.f227849t.mo81787T((Bundle) null);
        if (!this.f227832c || this.f227793I == null) {
            this.f227847r.mo27916B(this.f62665am);
        }
        this.f227842m.mo85301a(this);
        C87673aa i4 = this.f227849t.mo81813i();
        i4.getClass();
        C87676ad adVar = new C87676ad(i4, this.f227835f, C58836b.f156633a);
        this.f227851v = adVar;
        adVar.mo81956b();
        Bundle bundle7 = bundle;
        if (bundle7 == null || !bundle7.containsKey("system_ui_visibility")) {
            this.f227819aL = z;
        } else {
            this.f227819aL = (bundle7.getInt("system_ui_visibility") & 8192) != 0;
        }
        this.f227828aU = this.f227837h.mo85405j(C90138q.f251842p);
        C91142g gVar = this.f227837h;
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = this.f227815aH;
        C90476a aVar3 = C91018d.f254254a;
        gVar.mo85400e().registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        C83428ac acVar = this.f227826aS;
        if (!(acVar == null || (intentFilter = this.f227827aT) == null)) {
            this.f227822aO.registerReceiver(acVar, intentFilter);
        }
        mo76878D();
    }

    /* renamed from: o */
    public final void mo28054o() {
        this.f62639aa.setNavigationBarContrastEnforced(false);
        this.f62639aa.setStatusBarContrastEnforced(false);
        m133026ao(0.0f, 0.0f);
    }

    public final void onWindowFocusChanged(boolean z) {
        Build.VERSION.CODENAME.equals("Q");
        if (mo28046af()) {
            mo28063x(z);
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f227849t.mo81792Y(z);
        this.f227850u.mo82655a(1, this.f227837h.mo85406k("GSAPrefs.hotword_enabled", true));
        this.f227850u.mo82655a(4, z);
    }

    /* renamed from: p */
    public final void mo28055p() {
        ((C22762h) this.f62664al).f62646k.mo577h();
        this.f227847r.mo27931p(this.f62665am);
        C87676ad adVar = this.f227851v;
        adVar.getClass();
        adVar.mo81957c();
        this.f227842m.mo85302b(this);
        C90347r rVar = this.f227793I;
        if (rVar != null) {
            rVar.mo84037h();
        }
        RecyclerView recyclerView = this.f227796L;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.f227814aG);
        }
        if (this.f227820aM) {
            ((C83520c) this.f227846q.mo27525b()).mo76833e();
        }
        C83468bb bbVar = this.f227841l;
        C87653b bVar = bbVar.f227553d;
        if (bVar != null) {
            ((C83444as) bVar).f227448L = null;
        }
        C83475bi biVar = bbVar.f227569t;
        if (biVar != null) {
            biVar.f227606i = null;
        }
        bbVar.f227554e.mo81769B((C87662k) null);
        bbVar.f227574y.setOnTouchListener((View.OnTouchListener) null);
        this.f227849t.mo81809ap();
        C91142g gVar = this.f227837h;
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = this.f227815aH;
        C90476a aVar = C91018d.f254254a;
        gVar.mo85400e().unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        C83428ac acVar = this.f227826aS;
        if (acVar != null) {
            this.f227822aO.unregisterReceiver(acVar);
        }
    }

    /* renamed from: q */
    public final void mo28056q() {
        m133024am(C87739bu.ACETONE_LOG_USER_EVENT_MINUS_ONE_SWIPE_OUT);
        C58976aa aaVar = C58975e.f156826a;
        this.f227847r.mo27917D(this.f62659ag, this.f62678az, this.f62655aB);
        this.f227847r.mo27918G(this.f62659ag, 2);
    }

    /* renamed from: r */
    public final void mo28057r(float f) {
        this.f227830aW = f;
        float a = C2302d.m6236a(C2300b.f6448a, f);
        this.f227797M.setAlpha(a);
        this.f62639aa.setNavigationBarColor(m133019ah(m133022ak(this.f227823aP), (double) a));
        C58976aa aaVar = C58975e.f156826a;
        m133026ao(f, a);
        if (this.f227820aM) {
            ((C83520c) this.f227846q.mo27525b()).mo76836h(f);
        }
    }

    /* renamed from: s */
    public final void mo28058s() {
        C58976aa aaVar = C58975e.f156826a;
        C0395p pVar = this.f62664al;
        if (pVar != null) {
            ((C22762h) pVar).f62646k.mo579j();
        }
        this.f227816aI = false;
        C83426aa aaVar2 = this.f227824aQ;
        if (aaVar2 != null) {
            this.f227822aO.unregisterReceiver(aaVar2);
        }
        m133025an();
        C90347r rVar = this.f227793I;
        if (rVar != null) {
            rVar.mo84039j();
        }
        if (this.f227820aM) {
            ((C83520c) this.f227846q.mo27525b()).mo76837i();
        }
        this.f227850u.mo82655a(2, false);
        this.f227849t.mo81808ao();
        this.f227847r.mo27932q(this.f62665am);
    }

    /* renamed from: t */
    public final void mo28059t() {
        IntentFilter intentFilter;
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f227816aI) {
            C0395p pVar = this.f62664al;
            if (pVar != null) {
                ((C22760f) pVar).onResume();
            }
            this.f227816aI = true;
            if (this.f227820aM) {
                ((C83520c) this.f227846q.mo27525b()).mo76838j();
            }
            C87673aa i = this.f227849t.mo81813i();
            if (i != null) {
                C88489j jVar = new C88489j(C87739bu.ACETONE_LOG_STATE);
                C62940bt btVar = C87691a.f237045a;
                C87718b bVar = (C87718b) C87745c.f237486f.createBuilder();
                int i2 = this.f227811aD;
                bVar.copyOnWrite();
                C87745c cVar = (C87745c) bVar.instance;
                cVar.f237488a |= 1;
                cVar.f237489b = i2;
                int i3 = this.f227812aE;
                bVar.copyOnWrite();
                C87745c cVar2 = (C87745c) bVar.instance;
                cVar2.f237488a |= 2;
                cVar2.f237490c = i3;
                boolean z = this.f227805U;
                bVar.copyOnWrite();
                C87745c cVar3 = (C87745c) bVar.instance;
                cVar3.f237488a |= 4;
                cVar3.f237491d = z;
                boolean z2 = this.f227806V;
                bVar.copyOnWrite();
                C87745c cVar4 = (C87745c) bVar.instance;
                cVar4.f237488a |= 8;
                cVar4.f237492e = z2;
                jVar.mo82014b(btVar, (C87745c) bVar.build());
                i.mo81937i(jVar.mo82013a());
            }
            C90347r rVar = this.f227793I;
            if (!(rVar == null || i == null)) {
                rVar.mo84040k();
            }
            C83426aa aaVar2 = this.f227824aQ;
            if (!(aaVar2 == null || (intentFilter = this.f227825aR) == null)) {
                this.f227822aO.registerReceiver(aaVar2, intentFilter, (String) null, (Handler) null);
            }
            this.f227849t.mo81788U();
            this.f227850u.mo82655a(2, true);
            m133025an();
            this.f227847r.mo27933r(this.f62665am);
        }
    }

    /* renamed from: u */
    public final void mo28060u(Bundle bundle) {
        C90347r rVar;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f227786B && (rVar = this.f227793I) != null) {
            bundle.putBundle("MONET_CLIENT_STATE", rVar.mo84032b());
        }
        if (this.f227820aM) {
            ((C83520c) this.f227846q.mo27525b()).mo76839k(bundle);
        }
    }

    /* renamed from: v */
    public final void mo28061v() {
        C58976aa aaVar = C58975e.f156826a;
        C0395p pVar = this.f62664al;
        if (pVar != null) {
            ((C22760f) pVar).onStart();
        }
        this.f227817aJ = true;
        C90347r rVar = this.f227793I;
        if (rVar != null) {
            rVar.mo84042m();
        }
        if (this.f227820aM) {
            if (this.f227808X == 4) {
                m133023al();
            }
            if (this.f227821aN) {
                this.f227821aN = false;
                mo76887l();
            }
            ((C83520c) this.f227846q.mo27525b()).mo76840l();
        }
        this.f227849t.mo81790W();
        mo28057r(this.f227830aW);
        this.f227847r.mo27934s(this.f62665am);
    }

    /* renamed from: w */
    public final void mo28062w() {
        C58976aa aaVar = C58975e.f156826a;
        C0395p pVar = this.f62664al;
        if (pVar != null) {
            ((C22762h) pVar).f62646k.mo582m();
        }
        this.f227817aJ = false;
        C90347r rVar = this.f227793I;
        if (rVar != null) {
            rVar.mo84043n();
            RecyclerView recyclerView = this.f227796L;
            if (recyclerView != null) {
                recyclerView.removeOnScrollListener(this.f227814aG);
                this.f227796L = null;
            }
        }
        if (this.f227820aM) {
            ((C83520c) this.f227846q.mo27525b()).mo76841m();
        }
        if (this.f227854y) {
            this.f227841l.mo76802k();
        }
        this.f227849t.mo81791X(false);
        this.f227847r.mo27935t(this.f62665am);
    }

    /* renamed from: x */
    public final void mo28063x(boolean z) {
        C90347r rVar;
        C90347r rVar2;
        C58976aa aaVar = C58975e.f156826a;
        Build.VERSION.CODENAME.equals("Q");
        C0395p pVar = this.f62664al;
        if (pVar != null) {
            ((C22760f) pVar).onTopResumedActivityChanged(z);
        }
        boolean z2 = true;
        boolean z3 = this.f227793I != null && z && this.f227849t.mo81829y();
        if (!this.f227818aK || this.f227854y || this.f227785A) {
            z2 = false;
        }
        if (z3 && (rVar2 = this.f227793I) != null) {
            if (z2) {
                rVar2.mo84038i();
            }
            this.f227793I.mo84039j();
            this.f227793I.mo84043n();
        }
        this.f227849t.mo76808e(z);
        if (z3 && (rVar = this.f227793I) != null) {
            rVar.mo84042m();
            this.f227793I.mo84040k();
            if (z2) {
                this.f227793I.mo84041l();
            }
        }
    }

    /* renamed from: y */
    public final void mo28064y(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C88864ap apVar = this.f227850u;
        if (apVar != null) {
            apVar.mo82655a(8, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo28065z() {
        mo76885h();
        int i = this.f62656aC;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            this.f227847r.mo27917D(this.f62659ag, this.f62678az, this.f62655aB);
            this.f227847r.mo27938w(this.f62659ag);
        } else if (i2 == 2) {
            this.f227847r.mo27917D(this.f62659ag, this.f62678az, this.f62655aB);
            if (this.f227820aM) {
                this.f227847r.mo27920c(this.f62659ag, ((C83520c) this.f227846q.mo27525b()).mo76830a());
            }
            this.f227847r.mo27939x(this.f62659ag, true);
        } else if (i2 != 3) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            this.f227847r.mo27917D(this.f62659ag, this.f62678az, this.f62655aB);
            this.f227847r.mo27939x(this.f62659ag, false);
        }
    }

    /* renamed from: H */
    public final void mo76881H() {
        if (this.f227830aW >= 0.5f || this.f227854y ? !this.f227823aP : this.f227819aL) {
            C58976aa aaVar = C58975e.f156826a;
            C83532e eVar = this.f227797M;
            Window window = this.f62639aa;
            if (Build.VERSION.SDK_INT >= 30) {
                WindowInsetsController insetsController = window.getInsetsController();
                if (insetsController != null) {
                    insetsController.setSystemBarsAppearance(8, 8);
                    insetsController.setSystemBarsAppearance(16, 16);
                    return;
                }
                return;
            }
            eVar.setSystemUiVisibility(eVar.getSystemUiVisibility() | 8208);
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C83532e eVar2 = this.f227797M;
        Window window2 = this.f62639aa;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsController insetsController2 = window2.getInsetsController();
            if (insetsController2 != null) {
                insetsController2.setSystemBarsAppearance(0, 8);
                insetsController2.setSystemBarsAppearance(0, 16);
                return;
            }
            return;
        }
        eVar2.setSystemUiVisibility(eVar2.getSystemUiVisibility() & -8209);
    }
}
