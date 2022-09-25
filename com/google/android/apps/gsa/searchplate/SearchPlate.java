package com.google.android.apps.gsa.searchplate;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.text.Editable;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchplate.p6963a.C88893c;
import com.google.android.apps.gsa.searchplate.p6963a.C88895e;
import com.google.android.apps.gsa.searchplate.p6963a.C88897g;
import com.google.android.apps.gsa.searchplate.p6965c.C88927a;
import com.google.android.apps.gsa.searchplate.p6966d.C88936h;
import com.google.android.apps.gsa.searchplate.p6966d.C88939k;
import com.google.android.apps.gsa.searchplate.widget.AudioProgressRenderer;
import com.google.android.apps.gsa.searchplate.widget.HintTextView;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p6975af.C89103b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C90740ax;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
public class SearchPlate extends RelativeLayout implements View.OnClickListener {

    /* renamed from: P */
    private static final C59071e f240680P = C59071e.m91332i("com.google.android.apps.gsa.searchplate.SearchPlate");

    /* renamed from: A */
    public boolean f240681A;

    /* renamed from: B */
    public boolean f240682B;

    /* renamed from: C */
    public boolean f240683C;

    /* renamed from: D */
    public boolean f240684D;

    /* renamed from: E */
    public int f240685E;

    /* renamed from: F */
    int f240686F;

    /* renamed from: G */
    public int f240687G;

    /* renamed from: H */
    public String f240688H;

    /* renamed from: I */
    public C88901ac f240689I;

    /* renamed from: J */
    boolean f240690J;

    /* renamed from: K */
    public int f240691K;

    /* renamed from: L */
    public int f240692L;

    /* renamed from: M */
    public double f240693M;

    /* renamed from: N */
    public boolean f240694N;

    /* renamed from: O */
    public boolean f240695O;

    /* renamed from: Q */
    private final int f240696Q;

    /* renamed from: R */
    private final InputMethodManager f240697R;

    /* renamed from: S */
    private final Set f240698S;

    /* renamed from: T */
    private final Runnable f240699T;

    /* renamed from: U */
    private Runnable f240700U;

    /* renamed from: V */
    private final AtomicBoolean f240701V;

    /* renamed from: W */
    private final AtomicReference f240702W;

    /* renamed from: a */
    public final C89103b f240703a;

    /* renamed from: aa */
    private Set f240704aa;

    /* renamed from: ab */
    private LottieAnimationView f240705ab;

    /* renamed from: ac */
    private View f240706ac;

    /* renamed from: ad */
    private ImageView f240707ad;

    /* renamed from: ae */
    private ImageView f240708ae;

    /* renamed from: af */
    private C88943f f240709af;

    /* renamed from: ag */
    private String f240710ag;

    /* renamed from: ah */
    private boolean f240711ah;

    /* renamed from: ai */
    private boolean f240712ai;

    /* renamed from: aj */
    private boolean f240713aj;

    /* renamed from: ak */
    private View f240714ak;

    /* renamed from: al */
    private int f240715al;

    /* renamed from: am */
    private int f240716am;

    /* renamed from: an */
    private int f240717an;

    /* renamed from: ao */
    private int f240718ao;

    /* renamed from: ap */
    private int f240719ap;

    /* renamed from: aq */
    private int f240720aq;

    /* renamed from: ar */
    private LinearLayout f240721ar;

    /* renamed from: as */
    private boolean f240722as;

    /* renamed from: at */
    private C90740ax f240723at;

    /* renamed from: au */
    private boolean f240724au;

    /* renamed from: av */
    private boolean f240725av;

    /* renamed from: aw */
    private boolean f240726aw;

    /* renamed from: ax */
    private boolean f240727ax;

    /* renamed from: ay */
    private boolean f240728ay;

    /* renamed from: b */
    public final C89103b f240729b;

    /* renamed from: c */
    public final Set f240730c;

    /* renamed from: d */
    public Runnable f240731d;

    /* renamed from: e */
    public final Set f240732e;

    /* renamed from: f */
    public final List f240733f;

    /* renamed from: g */
    public TextContainer f240734g;

    /* renamed from: h */
    public SimpleSearchText f240735h;

    /* renamed from: i */
    protected C88895e f240736i;

    /* renamed from: j */
    public ClearOrVoiceButton f240737j;

    /* renamed from: k */
    AudioProgressRenderer f240738k;

    /* renamed from: l */
    public ImageView f240739l;

    /* renamed from: m */
    public C88951n f240740m;

    /* renamed from: n */
    HintTextView f240741n;

    /* renamed from: o */
    public View f240742o;

    /* renamed from: p */
    boolean f240743p;

    /* renamed from: q */
    C88926c f240744q;

    /* renamed from: r */
    ImageView f240745r;

    /* renamed from: s */
    ImageView f240746s;

    /* renamed from: t */
    public LinearLayout f240747t;

    /* renamed from: u */
    public C88904af f240748u;

    /* renamed from: v */
    public boolean f240749v;

    /* renamed from: w */
    public boolean f240750w;

    /* renamed from: x */
    public boolean f240751x;

    /* renamed from: y */
    public C88893c f240752y;

    /* renamed from: z */
    ImageButton f240753z;

    public SearchPlate(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    static boolean m144343A(int i) {
        return (i & 1048576) != 0;
    }

    /* renamed from: C */
    private static int m144344C(int i, int i2) {
        if (i2 <= 0 || i <= i2) {
            return i;
        }
        return -1;
    }

    /* renamed from: D */
    private final AudioProgressRenderer m144345D() {
        if (this.f240738k == null) {
            ViewStub viewStub = (ViewStub) findViewById(R.id.audio_progress_renderer_stub);
            viewStub.getClass();
            AudioProgressRenderer audioProgressRenderer = (AudioProgressRenderer) viewStub.inflate().findViewById(R.id.audio_progress_renderer);
            this.f240738k = audioProgressRenderer;
            C90740ax axVar = this.f240723at;
            if (axVar != null) {
                audioProgressRenderer.f241116a = axVar;
            }
        }
        return this.f240738k;
    }

    /* renamed from: E */
    private final void m144346E() {
        LottieAnimationView lottieAnimationView = this.f240705ab;
        if (lottieAnimationView != null) {
            lottieAnimationView.mo9692c();
            this.f240705ab.setVisibility(8);
        }
    }

    /* renamed from: F */
    private static void m144347F(View view) {
        if (view != null && view.getVisibility() != 8) {
            C58976aa aaVar = C58975e.f156826a;
            view.setVisibility(8);
            C28292j a = C28295m.m52915a(view);
            if (a != null) {
                a.mo33794h(2);
            }
        }
    }

    /* renamed from: H */
    private final void m144349H() {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f240690J) {
            post(this.f240699T);
            this.f240690J = true;
        }
    }

    /* renamed from: I */
    private final void m144350I(View view) {
        view.setOnClickListener(new C88985z(this));
    }

    /* renamed from: J */
    private final void m144351J() {
        this.f240734g.mo82725j(getResources().getText(R.string.welcome_string5));
    }

    /* renamed from: K */
    private final void m144352K(boolean z) {
        ImageView imageView;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            boolean contains = this.f240698S.contains(childAt);
            if (!(contains != z || childAt == this.f240734g || childAt == this.f240742o)) {
                View view = this.f240740m.f240980b;
                if (childAt == view) {
                    if (!contains) {
                        C58976aa aaVar = C58975e.f156826a;
                        this.f240740m.mo82836l(0, false);
                        m144347F(this.f240740m.f240980b);
                    } else if (view.getVisibility() != 0) {
                        C58976aa aaVar2 = C58975e.f156826a;
                        m144359R(this.f240740m.f240980b);
                    }
                } else if (this.f240736i == null || childAt != ((C88948k) mo82668b()).f240958a) {
                    if (contains) {
                        m144359R(childAt);
                    } else {
                        m144347F(childAt);
                    }
                } else if (!contains) {
                    m144347F(childAt);
                } else if (this.f240685E == 2) {
                    this.f240748u.mo82771a(childAt, 0);
                    m144359R(childAt);
                } else {
                    this.f240748u.mo82771a(childAt, 7);
                    m144359R(childAt);
                }
            }
        }
        if (this.f240712ai && (imageView = this.f240708ae) != null && imageView.getVisibility() != 8 && !this.f240711ah) {
            this.f240708ae.setVisibility(4);
        }
    }

    /* renamed from: L */
    private final void m144353L(int i, boolean z) {
        if (!C88927a.m144531f(this.f240685E) || C88927a.m144531f(i)) {
            this.f240687G = 0;
        } else {
            mo82692s(6, z);
        }
    }

    /* renamed from: M */
    private final void m144354M() {
        int i;
        if (this.f240685E == 5) {
            if (this.f240735h.mo82702g()) {
                m144359R(this.f240721ar);
                m144359R(this.f240714ak);
            } else {
                m144347F(this.f240721ar);
                m144347F(this.f240714ak);
            }
        }
        ClearOrVoiceButton clearOrVoiceButton = this.f240737j;
        boolean z = true;
        if (clearOrVoiceButton.f240671e && this.f240695O) {
            if (this.f240685E == 0) {
                clearOrVoiceButton.f240674h = false;
            } else {
                clearOrVoiceButton.f240674h = true;
            }
        }
        int i2 = this.f240685E;
        if (!(i2 == 5 || i2 == 6 || this.f240735h.mo82702g() || this.f240685E == 8)) {
            z = false;
        }
        clearOrVoiceButton.mo82661e(z);
        if (this.f240721ar.getVisibility() == 0 && this.f240737j.f240671e) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f240721ar.getLayoutParams();
            if ((!this.f240695O || this.f240737j.f240675i) && !this.f240737j.f240669c && (this.f240735h.hasFocus() || this.f240735h.mo82702g())) {
                C91115n.m148873e(marginLayoutParams, marginLayoutParams.leftMargin, marginLayoutParams.topMargin, (int) getResources().getDimension(R.dimen.voice_search_container_updated_right_margin), marginLayoutParams.bottomMargin);
            } else {
                C91115n.m148873e(marginLayoutParams, 0, 0, 0, 0);
            }
            requestLayout();
        }
        if (this.f240721ar.getVisibility() == 0 && !this.f240737j.f240671e) {
            int a = mo82667a(R.dimen.clear_button_padding);
            if (this.f240685E == 5) {
                C88939k.m144552h(this.f240737j, 0, a, 0, a);
                i = mo82667a(R.dimen.clear_button_voice_results_width);
            } else {
                C88939k.m144552h(this.f240737j, a, a, a, a);
                i = mo82667a(R.dimen.clear_button_size);
            }
            ViewGroup.LayoutParams layoutParams = this.f240737j.getLayoutParams();
            if (layoutParams.width != i) {
                layoutParams.width = i;
                requestLayout();
            }
        }
        this.f240735h.postInvalidate();
    }

    /* renamed from: N */
    private final void m144355N() {
        C28292j jVar = new C28292j(this.f240685E == 0 ? 99068 : 121154);
        jVar.mo33795i(5);
        jVar.f76976d = true;
        if (this.f240753z.getVisibility() == 0) {
            mo82672f(this.f240753z, jVar);
        } else if (this.f240753z.getVisibility() == 4) {
            jVar.mo33794h(2);
            mo82672f(this.f240753z, jVar);
        } else {
            C28295m.m52918d(this.f240753z);
        }
    }

    /* renamed from: O */
    private final boolean m144356O() {
        return getResources().getConfiguration().orientation == 1;
    }

    /* renamed from: P */
    private final boolean m144357P() {
        return this.f240684D && ((String) this.f240702W.get()).equals("web.isch");
    }

    /* renamed from: Q */
    private final boolean m144358Q(int i) {
        if (i == 0) {
            return this.f240682B || this.f240681A;
        }
        if (i == 1) {
            return (this.f240681A || m144357P() || this.f240683C) && !this.f240735h.mo82702g();
        }
        if (i == 4 || i == 5) {
            return this.f240681A || m144357P();
        }
        return false;
    }

    /* renamed from: R */
    private static void m144359R(View view) {
        if (view != null && view.getVisibility() != 0) {
            C58976aa aaVar = C58975e.f156826a;
            view.setVisibility(0);
            C28292j a = C28295m.m52915a(view);
            if (a != null) {
                a.mo33794h(1);
            }
        }
    }

    /* renamed from: v */
    static boolean m144360v(int i) {
        return ((i & 16) == 0 || (i & 128) == 0) ? false : true;
    }

    /* renamed from: w */
    static boolean m144361w(int i) {
        return (i & 16384) != 0;
    }

    /* renamed from: x */
    static boolean m144362x(int i) {
        return (i & 16) == 0 && (i & 128) != 0;
    }

    /* renamed from: y */
    static boolean m144363y(int i) {
        return (i & 16777216) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final /* synthetic */ void mo82666B() {
        C88893c cVar = this.f240752y;
        if (cVar != null) {
            cVar.mo17632b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo82667a(int i) {
        return getContext().getResources().getDimensionPixelSize(i);
    }

    /* renamed from: b */
    public final C88895e mo82668b() {
        if (this.f240736i == null) {
            LogoView logoView = (LogoView) ((ViewStub) findViewById(R.id.logo_view_stub)).inflate();
            C88948k kVar = new C88948k(logoView);
            C58976aa aaVar = C58975e.f156826a;
            this.f240748u.mo82771a(logoView, 7);
            mo82675h(kVar);
            this.f240736i = kVar;
        }
        return this.f240736i;
    }

    /* renamed from: d */
    public final void mo82670d(boolean z) {
        if (z) {
            this.f240735h.requestFocus();
            m144354M();
            C90476a aVar = C91018d.f254254a;
            this.f240697R.showSoftInput(this.f240735h, 0);
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        this.f240689I.mo82756b();
    }

    /* renamed from: f */
    public final void mo82672f(View view, C28292j jVar) {
        if (this.f240750w) {
            C28295m.m52919e(view, jVar);
            this.f240730c.add(view);
        }
    }

    public final void focusableViewAvailable(View view) {
        if (view != this.f240735h) {
            super.focusableViewAvailable(view);
        }
    }

    /* renamed from: g */
    public final void mo82674g() {
        this.f240734g.mo82721e();
        String str = this.f240688H;
        if (str != null) {
            this.f240734g.mo82725j(str);
        }
    }

    /* renamed from: h */
    public final void mo82675h(C88895e eVar) {
        List list = this.f240733f;
        eVar.getClass();
        list.add(eVar);
        mo82669c(eVar);
        C90740ax axVar = this.f240723at;
        if (axVar != null) {
            eVar.mo82749h(axVar);
        }
        C88893c cVar = this.f240752y;
        if (cVar != null) {
            eVar.mo82744c(cVar);
        }
        eVar.mo81837a(this.f240685E, this.f240686F, true);
        eVar.mo82747f(this.f240722as);
        eVar.mo82746e(this.f240693M);
    }

    /* renamed from: i */
    public final void mo82676i(C88893c cVar) {
        this.f240752y = cVar;
        for (C88895e c : this.f240733f) {
            c.mo82744c(cVar);
        }
        ClearOrVoiceButton clearOrVoiceButton = this.f240737j;
        C88900ab abVar = new C88900ab(this);
        if (this.f240750w) {
            C28292j jVar = new C28292j(42616);
            jVar.mo33795i(5);
            C28295m.m52919e(clearOrVoiceButton, jVar);
        }
        clearOrVoiceButton.f240668b = new C89943l(abVar);
    }

    /* renamed from: j */
    public final void mo82677j(String str) {
        this.f240735h.setHintTextColor(Color.parseColor(str));
        this.f240741n.setTextColor(Color.parseColor(str));
    }

    /* renamed from: k */
    public final void mo82678k(String str) {
        if (this.f240744q == null) {
            View findViewById = findViewById(R.id.navigation_viewport);
            findViewById.getClass();
            C88926c cVar = new C88926c(findViewById, this.f240746s);
            this.f240744q = cVar;
            mo82675h(cVar);
        }
        if (str != null) {
            C88926c cVar2 = this.f240744q;
            cVar2.f240897b.setImageURI(Uri.parse(str));
            if (cVar2.f240897b.getDrawable() != null) {
                this.f240743p = true;
                mo82680m(this.f240685E, 2, true, true);
            }
        }
        this.f240743p = false;
        mo82680m(this.f240685E, 2, true, true);
    }

    /* renamed from: l */
    public final void mo82679l(int i, String str, String str2, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        ClearOrVoiceButton clearOrVoiceButton = this.f240737j;
        boolean z2 = true;
        boolean z3 = clearOrVoiceButton.f240670d && !clearOrVoiceButton.f240669c;
        clearOrVoiceButton.mo82660d();
        if (z3) {
            clearOrVoiceButton.mo82659c();
        } else {
            clearOrVoiceButton.mo82658b();
        }
        this.f240711ah = (524288 & i) != 0;
        boolean z4 = (1048576 & i) != 0;
        this.f240712ai = z4;
        boolean z5 = (i & 1024) != 0;
        TextContainer textContainer = this.f240734g;
        textContainer.f240777i = z4;
        textContainer.f240778j = z5;
        this.f240728ay = (16777216 & i) != 0;
        this.f240713aj = (i & 64) != 0;
        this.f240726aw = (i & 256) != 0;
        this.f240725av = (i & 2048) != 0;
        if ((268435456 & i) == 0) {
            z2 = false;
        }
        this.f240751x = z2;
        if ((i & 8) != 0) {
            textContainer.mo82719d().f241133c = false;
        }
        if (z) {
            for (C88895e eVar : this.f240733f) {
                if (eVar != this.f240740m) {
                    eVar.mo82745d(i, str, str2);
                }
            }
            if ((i & 16) != 0 && this.f240685E == 8) {
                this.f240734g.mo82729n(this.f240710ag);
            }
            this.f240735h.setPrivateImeOptions("nm");
            return;
        }
        this.f240689I.mo82757c(i, str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04a9, code lost:
        r14.setBackgroundResource(17170445);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x05ff, code lost:
        r14.f240770b.mo82700e();
        r14.setLayoutParams(r14.f240781m);
        r14.mo82724i();
        r14.setBackgroundResource(com.google.android.googlequicksearchbox.R.drawable.search_box_click);
        com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r14.f240771c, true);
        com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r14.f240772d, true);
        com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r14.f240773e, true);
        com.google.android.apps.gsa.searchplate.TextContainer.m144397p(r14.f240770b, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0648, code lost:
        m144352K(false);
        m144352K(true);
        m144355N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0653, code lost:
        if (r11.f240750w == false) goto L_0x068e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x065d, code lost:
        if (r11.f240698S.equals(r11.f240704aa) == false) goto L_0x0660;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0660, code lost:
        r11.f240704aa = com.google.common.p4522b.C58758qx.m90648f(r11.f240698S);
        r14 = r11.f240698S.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0672, code lost:
        if (r14.hasNext() == false) goto L_0x068e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0674, code lost:
        r2 = com.google.android.libraries.logging.C28295m.m52915a((android.view.View) r14.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x067e, code lost:
        if (r2 == null) goto L_0x066e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0682, code lost:
        if (r2.f76977e != 1) goto L_0x066e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0684, code lost:
        com.google.android.apps.gsa.shared.logger.C89949q.m146521e(com.google.android.libraries.logging.C28285c.m52874a(r11, 75282), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x068e, code lost:
        r14 = r11.f240732e.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0698, code lost:
        if (r14.hasNext() == false) goto L_0x06b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x069a, code lost:
        ((com.google.android.apps.gsa.searchplate.p6963a.C88897g) r14.next()).mo81837a(r12, r13, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a9, code lost:
        if (r5 != 8) goto L_0x0142;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x05fe  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0624  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01b2  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82680m(int r12, int r13, boolean r14, boolean r15) {
        /*
            r11 = this;
            android.content.Context r0 = r11.getContext()
            boolean r0 = com.google.android.apps.gsa.shared.util.C90772bp.m148283J(r0)
            r15 = r15 | r0
            r14 = r14 | r0
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0 = 1
            r1 = 0
            if (r15 == 0) goto L_0x0018
            com.google.android.apps.gsa.searchplate.ac r2 = r11.f240689I
            r2.mo82765j(r1)
            r11.m144353L(r12, r0)
        L_0x0018:
            if (r14 == 0) goto L_0x06a4
            int r14 = r11.f240685E
            if (r12 != r14) goto L_0x0022
            r2 = r13 & 2
            if (r2 == 0) goto L_0x06b8
        L_0x0022:
            r11.f240685E = r12
            r11.f240686F = r13
            com.google.android.apps.gsa.searchplate.ac r2 = r11.f240689I
            boolean r2 = r2.f240807f
            r2 = r2 ^ r0
            r3 = 5
            r4 = 6
            if (r14 != r4) goto L_0x0038
            if (r12 != r3) goto L_0x0035
            r14 = 6
            r2 = 1
            r5 = 5
            goto L_0x0039
        L_0x0035:
            r5 = r12
            r14 = 6
            goto L_0x0039
        L_0x0038:
            r5 = r12
        L_0x0039:
            boolean r6 = r11.f240726aw
            r7 = -1
            r8 = 2
            if (r6 == 0) goto L_0x0099
            if (r14 == r8) goto L_0x0047
            if (r5 == r8) goto L_0x0044
            goto L_0x0099
        L_0x0044:
            r5 = 2
            r6 = 2
            goto L_0x0048
        L_0x0047:
            r6 = r5
        L_0x0048:
            r9 = r13 & 64
            if (r9 == 0) goto L_0x0057
            boolean r9 = r11.f240727ax
            if (r9 != 0) goto L_0x0057
            if (r14 != r8) goto L_0x0057
            if (r5 == r8) goto L_0x0057
            r11.f240727ax = r0
            goto L_0x0098
        L_0x0057:
            boolean r14 = r11.m144356O()
            if (r14 == 0) goto L_0x0068
            android.content.res.Resources r14 = r11.getResources()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            int r14 = r14.widthPixels
            goto L_0x0072
        L_0x0068:
            android.content.res.Resources r14 = r11.getResources()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            int r14 = r14.heightPixels
        L_0x0072:
            r9 = 2131170252(0x7f0713cc, float:1.7954857E38)
            int r9 = r11.mo82667a(r9)
            if (r14 >= r9) goto L_0x0098
            android.content.Context r14 = r11.getContext()
            android.app.Activity r14 = (android.app.Activity) r14
            if (r5 != r8) goto L_0x008d
            int r9 = r14.getRequestedOrientation()
            if (r9 == r0) goto L_0x008d
            com.google.android.apps.gsa.shared.util.C90779c.m148334a(r14, r0)
            goto L_0x0098
        L_0x008d:
            if (r5 == r8) goto L_0x0098
            int r5 = r14.getRequestedOrientation()
            if (r5 == r7) goto L_0x0098
            com.google.android.apps.gsa.shared.util.C90779c.m148334a(r14, r7)
        L_0x0098:
            r5 = r6
        L_0x0099:
            int r14 = r11.f240715al
            r6 = 8
            r9 = 3
            if (r5 == r8) goto L_0x00b1
            if (r5 == r9) goto L_0x00b1
            if (r5 == r3) goto L_0x00ad
            if (r5 == r4) goto L_0x00ad
            r3 = 7
            if (r5 == r3) goto L_0x00b1
            if (r5 == r6) goto L_0x00ad
            goto L_0x0142
        L_0x00ad:
            int r14 = r11.f240720aq
            goto L_0x0142
        L_0x00b1:
            boolean r14 = m144361w(r13)
            if (r14 == 0) goto L_0x00c8
            boolean r14 = r11.m144356O()
            if (r14 == 0) goto L_0x00c8
            android.content.res.Resources r14 = r11.getResources()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            int r14 = r14.heightPixels
            goto L_0x0105
        L_0x00c8:
            boolean r14 = m144360v(r13)
            if (r14 == 0) goto L_0x00fa
            boolean r14 = r11.m144356O()
            if (r14 == 0) goto L_0x00fa
            int r14 = r11.f240717an
            boolean r3 = r11.m144356O()
            if (r3 == 0) goto L_0x0105
            android.widget.ImageView r3 = r11.f240708ae
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
            r4 = 14
            r3.addRule(r4)
            r4 = 2131165905(0x7f0702d1, float:1.794604E38)
            int r4 = r11.mo82667a(r4)
            r3.topMargin = r4
            r3.bottomMargin = r1
            android.widget.ImageView r4 = r11.f240708ae
            r4.setLayoutParams(r3)
            goto L_0x0105
        L_0x00fa:
            boolean r14 = m144362x(r13)
            if (r14 == 0) goto L_0x0103
            int r14 = r11.f240718ao
            goto L_0x0105
        L_0x0103:
            int r14 = r11.f240716am
        L_0x0105:
            boolean r3 = r11.mo82695z()
            if (r3 == 0) goto L_0x0142
            android.content.res.Resources r3 = r11.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.heightPixels
            if (r14 == r7) goto L_0x011f
            if (r3 <= 0) goto L_0x011f
            int r4 = r11.f240719ap
            int r4 = r4 + r14
            if (r4 > r3) goto L_0x011f
            r14 = r4
        L_0x011f:
            r3 = r13 & 16
            if (r3 == 0) goto L_0x0142
            android.widget.ImageView r3 = r11.f240708ae
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
            r4 = 10
            r3.addRule(r4, r1)
            r4 = 2097152(0x200000, float:2.938736E-39)
            r4 = r4 & r13
            if (r4 == 0) goto L_0x013c
            r4 = 2131432680(0x7f0b14e8, float:1.8487124E38)
            r3.addRule(r9, r4)
            goto L_0x0142
        L_0x013c:
            r4 = 2131436979(0x7f0b25b3, float:1.8495844E38)
            r3.addRule(r9, r4)
        L_0x0142:
            android.content.res.Resources r3 = r11.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.heightPixels
            if (r3 <= 0) goto L_0x0164
            android.content.res.Resources r3 = r11.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.heightPixels
            if (r14 <= r3) goto L_0x0164
            android.content.res.Resources r14 = r11.getResources()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            int r14 = r14.heightPixels
        L_0x0164:
            android.view.ViewGroup$LayoutParams r3 = r11.getLayoutParams()
            if (r3 == 0) goto L_0x018c
            android.view.ViewGroup$LayoutParams r3 = r11.getLayoutParams()
            int r3 = r3.height
            if (r14 == r3) goto L_0x018c
            android.view.ViewGroup$LayoutParams r3 = r11.getLayoutParams()
            r3.getClass()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            r3.height = r14
            r3.bottomMargin = r1
            r11.setLayoutParams(r3)
            com.google.android.apps.gsa.searchplate.SimpleSearchText r3 = r11.f240735h
            r3.setScrollX(r1)
            com.google.android.apps.gsa.searchplate.SimpleSearchText r3 = r11.f240735h
            r3.setScrollY(r1)
        L_0x018c:
            com.google.android.apps.gsa.shared.af.b r3 = r11.f240703a
            int r4 = r11.f240696Q
            int r4 = r4 + r14
            r3.mo83075c(r4)
            com.google.android.apps.gsa.shared.af.b r3 = r11.f240729b
            r3.mo83075c(r14)
            r11.m144354M()
            r11.mo82694u()
            boolean r14 = com.google.android.apps.gsa.searchplate.p6965c.C88927a.m144527b(r5)
            if (r14 != 0) goto L_0x01a8
            r11.mo82690r(r1)
        L_0x01a8:
            java.util.Set r14 = r11.f240698S
            r14.clear()
            switch(r5) {
                case 0: goto L_0x033a;
                case 1: goto L_0x0303;
                case 2: goto L_0x0236;
                case 3: goto L_0x020d;
                case 4: goto L_0x01f5;
                case 5: goto L_0x01e1;
                case 6: goto L_0x01e1;
                case 7: goto L_0x01c8;
                case 8: goto L_0x01b2;
                default: goto L_0x01b0;
            }
        L_0x01b0:
            goto L_0x0372
        L_0x01b2:
            boolean r3 = r11.f240712ai
            if (r3 == 0) goto L_0x01bb
            android.widget.ImageView r3 = r11.f240708ae
            r14.add(r3)
        L_0x01bb:
            com.google.android.apps.gsa.searchplate.a.e r3 = r11.mo82668b()
            com.google.android.apps.gsa.searchplate.k r3 = (com.google.android.apps.gsa.searchplate.C88948k) r3
            com.google.android.libraries.gsa.logoview.LogoView r3 = r3.f240958a
            r14.add(r3)
            goto L_0x0372
        L_0x01c8:
            boolean r3 = r11.f240712ai
            if (r3 == 0) goto L_0x01d1
            android.widget.ImageView r3 = r11.f240708ae
            r14.add(r3)
        L_0x01d1:
            r11.mo82674g()
            com.google.android.apps.gsa.searchplate.a.e r3 = r11.mo82668b()
            com.google.android.apps.gsa.searchplate.k r3 = (com.google.android.apps.gsa.searchplate.C88948k) r3
            com.google.android.libraries.gsa.logoview.LogoView r3 = r3.f240958a
            r14.add(r3)
            goto L_0x0372
        L_0x01e1:
            com.google.android.apps.gsa.searchplate.n r3 = r11.f240740m
            android.view.View r3 = r3.f240980b
            r14.add(r3)
            com.google.android.apps.gsa.searchplate.a.e r3 = r11.mo82668b()
            com.google.android.apps.gsa.searchplate.k r3 = (com.google.android.apps.gsa.searchplate.C88948k) r3
            com.google.android.libraries.gsa.logoview.LogoView r3 = r3.f240958a
            r14.add(r3)
            goto L_0x0372
        L_0x01f5:
            com.google.android.apps.gsa.searchplate.n r3 = r11.f240740m
            android.view.View r3 = r3.f240980b
            r14.add(r3)
            android.widget.LinearLayout r3 = r11.f240721ar
            r14.add(r3)
            com.google.android.apps.gsa.searchplate.ClearOrVoiceButton r3 = r11.f240737j
            r14.add(r3)
            android.view.View r3 = r11.f240714ak
            r14.add(r3)
            goto L_0x0372
        L_0x020d:
            com.google.android.apps.gsa.searchplate.widget.AudioProgressRenderer r3 = r11.m144345D()
            android.view.ViewParent r3 = r3.getParent()
            android.view.View r3 = (android.view.View) r3
            r14.add(r3)
            android.widget.ImageView r3 = r11.f240707ad
            if (r3 != 0) goto L_0x022f
            r3 = 2131436014(0x7f0b21ee, float:1.8493886E38)
            android.view.View r3 = r11.findViewById(r3)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            android.view.View r3 = r3.inflate()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r11.f240707ad = r3
        L_0x022f:
            android.widget.ImageView r3 = r11.f240707ad
            r14.add(r3)
            goto L_0x0372
        L_0x0236:
            com.google.android.apps.gsa.searchplate.TextContainer r3 = r11.f240734g
            android.widget.TextView r3 = r3.mo82717b()
            boolean r3 = r3.hasOnClickListeners()
            if (r3 == 0) goto L_0x024e
            com.google.android.apps.gsa.searchplate.TextContainer r3 = r11.f240734g
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r3 = r3.mo82719d()
            boolean r3 = r3.hasOnClickListeners()
            if (r3 != 0) goto L_0x0260
        L_0x024e:
            com.google.android.apps.gsa.searchplate.TextContainer r3 = r11.f240734g
            android.widget.TextView r3 = r3.mo82717b()
            r11.m144350I(r3)
            com.google.android.apps.gsa.searchplate.TextContainer r3 = r11.f240734g
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r3 = r3.mo82719d()
            r11.m144350I(r3)
        L_0x0260:
            boolean r3 = r11.f240712ai
            if (r3 == 0) goto L_0x0269
            android.widget.ImageView r3 = r11.f240708ae
            r14.add(r3)
        L_0x0269:
            com.google.android.apps.gsa.searchplate.a.e r3 = r11.mo82668b()
            com.google.android.apps.gsa.searchplate.k r3 = (com.google.android.apps.gsa.searchplate.C88948k) r3
            com.google.android.libraries.gsa.logoview.LogoView r3 = r3.f240958a
            r14.add(r3)
            boolean r3 = r11.f240726aw
            if (r3 == 0) goto L_0x0288
            com.google.android.apps.gsa.searchplate.TextContainer r3 = r11.f240734g
            r3.f240779k = r0
            com.airbnb.lottie.LottieAnimationView r3 = r11.f240705ab
            if (r3 == 0) goto L_0x0288
            r11.m144348G()
            com.airbnb.lottie.LottieAnimationView r3 = r11.f240705ab
            r14.add(r3)
        L_0x0288:
            boolean r3 = r11.mo82695z()
            if (r3 == 0) goto L_0x0293
            android.widget.LinearLayout r3 = r11.f240747t
            r14.add(r3)
        L_0x0293:
            boolean r3 = r11.f240725av
            if (r3 == 0) goto L_0x0372
            android.view.View r3 = r11.f240706ac
            if (r3 != 0) goto L_0x02b5
            r3 = 2131435533(0x7f0b200d, float:1.849291E38)
            android.view.View r3 = r11.findViewById(r3)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            r3.getClass()
            android.view.View r3 = r3.inflate()
            com.google.android.apps.gsa.searchplate.aa r4 = new com.google.android.apps.gsa.searchplate.aa
            r4.<init>(r11)
            r3.setOnClickListener(r4)
            r11.f240706ac = r3
        L_0x02b5:
            boolean r3 = m144362x(r13)
            if (r3 != 0) goto L_0x02c7
            boolean r3 = m144360v(r13)
            if (r3 == 0) goto L_0x02fa
            boolean r3 = r11.m144356O()
            if (r3 == 0) goto L_0x02fa
        L_0x02c7:
            android.view.View r3 = r11.f240706ac
            if (r3 == 0) goto L_0x02fa
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
            int r4 = r11.f240686F
            boolean r4 = m144361w(r4)
            if (r4 == 0) goto L_0x02e9
            boolean r4 = r11.m144356O()
            if (r4 == 0) goto L_0x02e9
            r4 = 2131167938(0x7f070ac2, float:1.7950164E38)
            int r4 = r11.mo82667a(r4)
            r3.bottomMargin = r4
            goto L_0x02f2
        L_0x02e9:
            r4 = 2131168881(0x7f070e71, float:1.7952076E38)
            int r4 = r11.mo82667a(r4)
            r3.bottomMargin = r4
        L_0x02f2:
            android.view.View r4 = r11.f240706ac
            r4.getClass()
            r4.setLayoutParams(r3)
        L_0x02fa:
            android.view.View r3 = r11.f240706ac
            r3.getClass()
            r14.add(r3)
            goto L_0x0372
        L_0x0303:
            boolean r3 = r11.f240743p
            if (r3 == 0) goto L_0x0319
            com.google.android.apps.gsa.searchplate.c r3 = r11.f240744q
            android.view.View r3 = r3.f240896a
            r14.add(r3)
            android.widget.ImageView r3 = r11.f240746s
            r3.setVisibility(r1)
            android.widget.ImageView r3 = r11.f240745r
            r3.setVisibility(r6)
            goto L_0x032a
        L_0x0319:
            com.google.android.apps.gsa.searchplate.n r3 = r11.f240740m
            android.view.View r3 = r3.f240980b
            r14.add(r3)
            android.widget.ImageView r3 = r11.f240746s
            r3.setVisibility(r6)
            android.widget.ImageView r3 = r11.f240745r
            r3.setVisibility(r1)
        L_0x032a:
            android.widget.LinearLayout r3 = r11.f240721ar
            r14.add(r3)
            com.google.android.apps.gsa.searchplate.ClearOrVoiceButton r3 = r11.f240737j
            r14.add(r3)
            android.view.View r3 = r11.f240714ak
            r14.add(r3)
            goto L_0x0372
        L_0x033a:
            com.google.android.apps.gsa.searchplate.widget.HintTextView r3 = r11.f240741n
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
            r4 = 2131433515(0x7f0b182b, float:1.8488818E38)
            r3.addRule(r0, r4)
            com.google.android.apps.gsa.searchplate.n r4 = r11.f240740m
            android.view.View r4 = r4.f240980b
            r14.add(r4)
            android.widget.ImageView r4 = r11.f240745r
            r4.setVisibility(r1)
            com.google.android.apps.gsa.searchplate.n r4 = r11.f240740m
            r4.mo82836l(r8, r0)
            com.google.android.apps.gsa.searchplate.widget.HintTextView r4 = r11.f240741n
            r4.setLayoutParams(r3)
            com.google.android.apps.gsa.searchplate.widget.HintTextView r3 = r11.f240741n
            r14.add(r3)
            android.widget.LinearLayout r3 = r11.f240721ar
            r14.add(r3)
            com.google.android.apps.gsa.searchplate.ClearOrVoiceButton r3 = r11.f240737j
            r14.add(r3)
            android.view.View r3 = r11.f240714ak
            r14.add(r3)
        L_0x0372:
            boolean r3 = r11.m144358Q(r5)
            if (r3 == 0) goto L_0x037d
            android.widget.ImageButton r3 = r11.f240753z
            r14.add(r3)
        L_0x037d:
            com.google.android.apps.gsa.searchplate.TextContainer r14 = r11.f240734g
            r14.f240774f = r5
            r14.mo82730o(r1)
            r3 = 100
            r6 = 2131235371(0x7f08122b, float:1.8086934E38)
            r7 = 17170445(0x106000d, float:2.461195E-38)
            r8 = 16
            switch(r5) {
                case 0: goto L_0x0624;
                case 1: goto L_0x05fe;
                case 2: goto L_0x04ae;
                case 3: goto L_0x047b;
                case 4: goto L_0x05ff;
                case 5: goto L_0x0452;
                case 6: goto L_0x03d5;
                case 7: goto L_0x0393;
                case 8: goto L_0x03d5;
                default: goto L_0x0391;
            }
        L_0x0391:
            goto L_0x0648
        L_0x0393:
            r14.mo82721e()
            android.widget.TextView r2 = r14.mo82717b()
            r3 = r13 & 32
            if (r3 == 0) goto L_0x03a0
            r3 = 1
            goto L_0x03a1
        L_0x03a0:
            r3 = 0
        L_0x03a1:
            com.google.android.apps.gsa.searchplate.TextContainer.m144397p(r2, r3, r8)
            com.google.android.apps.gsa.searchplate.SimpleSearchText r2 = r14.f240770b
            com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r2, r1)
            android.widget.TextView r2 = r14.f240772d
            com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r2, r0)
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r2 = r14.mo82719d()
            com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r2, r0)
            boolean r2 = r14.mo82733r(r13)
            if (r2 == 0) goto L_0x03c3
            boolean r2 = m144361w(r13)
            r14.mo82727l(r2)
            goto L_0x03d0
        L_0x03c3:
            boolean r2 = r14.f240777i
            if (r2 == 0) goto L_0x03cb
            r14.mo82728m()
            goto L_0x03d0
        L_0x03cb:
            android.widget.RelativeLayout$LayoutParams r2 = r14.f240780l
            r14.setLayoutParams(r2)
        L_0x03d0:
            com.google.android.apps.gsa.searchplate.p6966d.C88939k.m144552h(r14, r1, r1, r1, r1)
            goto L_0x04a9
        L_0x03d5:
            com.google.android.apps.gsa.searchplate.SimpleSearchText r2 = r14.f240770b
            r2.mo82701f()
            android.widget.TextView r2 = r14.f240771c
            com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r2, r0)
            android.widget.TextView r2 = r14.f240772d
            com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r2, r0)
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r2 = r14.mo82719d()
            r2.mo82922a()
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r2 = r14.mo82719d()
            android.content.Context r3 = r14.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131173056(0x7f071ec0, float:1.7960544E38)
            float r3 = r3.getDimension(r4)
            r2.setTextSize(r1, r3)
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r2 = r14.mo82719d()
            android.content.Context r3 = r14.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131103894(0x7f061096, float:1.7820267E38)
            int r3 = r3.getColor(r4)
            r2.setTextColor(r3)
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r2 = r14.mo82719d()
            com.google.android.apps.gsa.searchplate.TextContainer.m144397p(r2, r0, r8)
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r2 = r14.mo82719d()
            com.google.android.apps.gsa.searchplate.p6966d.C88939k.m144552h(r2, r1, r1, r1, r1)
            com.google.android.apps.gsa.searchplate.SimpleSearchText r2 = r14.f240770b
            com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r2, r1)
            android.widget.RelativeLayout$LayoutParams r2 = r14.f240783o
            r14.setLayoutParams(r2)
            com.google.android.apps.gsa.searchplate.p6966d.C88939k.m144552h(r14, r1, r1, r1, r1)
            r14.setBackgroundResource(r7)
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r2 = r14.mo82719d()
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            r4 = 17
            r3.gravity = r4
            r2.setLayoutParams(r3)
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r14 = r14.mo82719d()
            r2 = 8388627(0x800013, float:1.175497E-38)
            r14.setGravity(r2)
            goto L_0x0648
        L_0x0452:
            r14.mo82730o(r0)
            com.google.android.apps.gsa.searchplate.SimpleSearchText r5 = r14.f240770b
            r5.mo82701f()
            android.widget.RelativeLayout$LayoutParams r5 = r14.f240781m
            r14.setLayoutParams(r5)
            r14.mo82724i()
            r14.setBackgroundResource(r6)
            android.widget.TextView r5 = r14.f240771c
            com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r5, r0)
            android.widget.TextView r5 = r14.f240772d
            com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r5, r0)
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r5 = r14.f240773e
            com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r5, r0)
            com.google.android.apps.gsa.searchplate.SimpleSearchText r14 = r14.f240770b
            com.google.android.apps.gsa.searchplate.TextContainer.m144397p(r14, r2, r3)
            goto L_0x0648
        L_0x047b:
            android.widget.TextView r2 = r14.mo82717b()
            java.lang.String r3 = ""
            r2.setText(r3)
            android.widget.TextView r2 = r14.mo82717b()
            r3 = r13 & 32
            if (r3 == 0) goto L_0x048e
            r3 = 1
            goto L_0x048f
        L_0x048e:
            r3 = 0
        L_0x048f:
            com.google.android.apps.gsa.searchplate.TextContainer.m144397p(r2, r3, r8)
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r2 = r14.f240773e
            com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r2, r0)
            com.google.android.apps.gsa.searchplate.SimpleSearchText r2 = r14.f240770b
            com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r2, r1)
            android.widget.TextView r2 = r14.f240772d
            com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r2, r0)
            android.widget.RelativeLayout$LayoutParams r2 = r14.f240782n
            r14.setLayoutParams(r2)
            com.google.android.apps.gsa.searchplate.p6966d.C88939k.m144552h(r14, r1, r1, r1, r1)
        L_0x04a9:
            r14.setBackgroundResource(r7)
            goto L_0x0648
        L_0x04ae:
            com.google.android.apps.gsa.searchplate.SimpleSearchText r2 = r14.f240770b
            r2.mo82700e()
            boolean r2 = r14.f240779k
            if (r2 == 0) goto L_0x04c1
            android.widget.TextView r2 = r14.mo82717b()
            r3 = 2132093718(0x7f152b16, float:1.9827869E38)
            r2.setText(r3)
        L_0x04c1:
            boolean r2 = r14.f240777i
            r3 = 2131167631(0x7f07098f, float:1.7949541E38)
            r4 = 8388659(0x800033, float:1.1755015E-38)
            r5 = 49
            if (r2 != 0) goto L_0x04dc
            boolean r2 = m144343A(r13)
            if (r2 == 0) goto L_0x04d4
            goto L_0x04dc
        L_0x04d4:
            android.widget.TextView r2 = r14.mo82717b()
            r2.setGravity(r4)
            goto L_0x0518
        L_0x04dc:
            android.widget.TextView r2 = r14.mo82717b()
            r2.setGravity(r5)
            boolean r2 = r14.mo82734s()
            if (r2 == 0) goto L_0x0518
            android.content.Context r2 = r14.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r6 = 2131167395(0x7f0708a3, float:1.7949062E38)
            int r2 = r2.getDimensionPixelSize(r6)
            boolean r6 = m144343A(r13)
            if (r6 == 0) goto L_0x050b
            android.content.Context r6 = r14.getContext()
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getDimensionPixelSize(r3)
            int r2 = r2 + r6
        L_0x050b:
            android.widget.TextView r6 = r14.mo82717b()
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            com.google.android.apps.gsa.searchplate.p6966d.C88939k.m144551g(r6, r1, r2, r1, r1)
        L_0x0518:
            android.widget.TextView r2 = r14.mo82717b()
            r6 = r13 & 32
            if (r6 == 0) goto L_0x0522
            r6 = 1
            goto L_0x0523
        L_0x0522:
            r6 = 0
        L_0x0523:
            com.google.android.apps.gsa.searchplate.TextContainer.m144397p(r2, r6, r8)
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r2 = r14.mo82719d()
            r2.mo82922a()
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r2 = r14.mo82719d()
            android.content.Context r6 = r14.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r10 = 2131172262(0x7f071ba6, float:1.7958934E38)
            float r6 = r6.getDimension(r10)
            r2.setTextSize(r1, r6)
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r2 = r14.mo82719d()
            android.content.Context r6 = r14.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r10 = 2131099776(0x7f060080, float:1.7811915E38)
            int r6 = r6.getColor(r10)
            r2.setTextColor(r6)
            boolean r2 = r14.f240777i
            if (r2 != 0) goto L_0x056c
            boolean r2 = m144343A(r13)
            if (r2 == 0) goto L_0x0564
            goto L_0x056c
        L_0x0564:
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r2 = r14.mo82719d()
            r2.setGravity(r4)
            goto L_0x05a8
        L_0x056c:
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r2 = r14.mo82719d()
            r2.setGravity(r5)
            boolean r2 = r14.mo82734s()
            if (r2 == 0) goto L_0x05a8
            android.content.Context r2 = r14.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r4 = 2131172263(0x7f071ba7, float:1.7958936E38)
            int r2 = r2.getDimensionPixelSize(r4)
            boolean r4 = m144343A(r13)
            if (r4 == 0) goto L_0x059b
            android.content.Context r4 = r14.getContext()
            android.content.res.Resources r4 = r4.getResources()
            int r3 = r4.getDimensionPixelSize(r3)
            int r2 = r2 + r3
        L_0x059b:
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r3 = r14.mo82719d()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            com.google.android.apps.gsa.searchplate.p6966d.C88939k.m144551g(r3, r1, r2, r1, r1)
        L_0x05a8:
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r2 = r14.mo82719d()
            com.google.android.apps.gsa.searchplate.p6966d.C88939k.m144552h(r2, r1, r1, r1, r1)
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r2 = r14.mo82719d()
            com.google.android.apps.gsa.searchplate.TextContainer.m144397p(r2, r0, r8)
            com.google.android.apps.gsa.searchplate.SimpleSearchText r2 = r14.f240770b
            com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r2, r1)
            android.widget.TextView r2 = r14.f240772d
            com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r2, r0)
            android.widget.RelativeLayout$LayoutParams r2 = r14.f240780l
            r3 = 2131173074(0x7f071ed2, float:1.796058E38)
            int r4 = r14.mo82716a(r3)
            r5 = 2131173077(0x7f071ed5, float:1.7960587E38)
            int r5 = r14.mo82716a(r5)
            int r3 = r14.mo82716a(r3)
            com.google.android.apps.gsa.searchplate.p6966d.C88939k.m144551g(r2, r4, r5, r3, r1)
            boolean r2 = r14.mo82733r(r13)
            if (r2 == 0) goto L_0x05e5
            boolean r2 = m144361w(r13)
            r14.mo82727l(r2)
            goto L_0x05f9
        L_0x05e5:
            boolean r2 = r14.f240777i
            if (r2 != 0) goto L_0x05f6
            boolean r2 = m144343A(r13)
            if (r2 == 0) goto L_0x05f0
            goto L_0x05f6
        L_0x05f0:
            android.widget.RelativeLayout$LayoutParams r2 = r14.f240780l
            r14.setLayoutParams(r2)
            goto L_0x05f9
        L_0x05f6:
            r14.mo82728m()
        L_0x05f9:
            com.google.android.apps.gsa.searchplate.p6966d.C88939k.m144552h(r14, r1, r1, r1, r1)
            goto L_0x04a9
        L_0x05fe:
            r3 = r8
        L_0x05ff:
            com.google.android.apps.gsa.searchplate.SimpleSearchText r5 = r14.f240770b
            r5.mo82700e()
            android.widget.RelativeLayout$LayoutParams r5 = r14.f240781m
            r14.setLayoutParams(r5)
            r14.mo82724i()
            r14.setBackgroundResource(r6)
            android.widget.TextView r5 = r14.f240771c
            com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r5, r0)
            android.widget.TextView r5 = r14.f240772d
            com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r5, r0)
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r5 = r14.f240773e
            com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r5, r0)
            com.google.android.apps.gsa.searchplate.SimpleSearchText r14 = r14.f240770b
            com.google.android.apps.gsa.searchplate.TextContainer.m144397p(r14, r2, r3)
            goto L_0x0648
        L_0x0624:
            android.widget.TextView r2 = r14.f240771c
            com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r2, r0)
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r2 = r14.f240773e
            com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r2, r0)
            com.google.android.apps.gsa.searchplate.SimpleSearchText r2 = r14.f240770b
            com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r2, r1)
            android.widget.TextView r2 = r14.f240772d
            com.google.android.apps.gsa.searchplate.TextContainer.m144396g(r2, r0)
            android.widget.RelativeLayout$LayoutParams r2 = r14.f240781m
            r14.setLayoutParams(r2)
            r14.mo82724i()
            r14.setBackgroundResource(r6)
            com.google.android.apps.gsa.searchplate.SimpleSearchText r14 = r14.f240770b
            r14.mo82700e()
        L_0x0648:
            r11.m144352K(r1)
            r11.m144352K(r0)
            r11.m144355N()
            boolean r14 = r11.f240750w
            if (r14 == 0) goto L_0x068e
            java.util.Set r14 = r11.f240698S
            java.util.Set r2 = r11.f240704aa
            boolean r14 = r14.equals(r2)
            if (r14 == 0) goto L_0x0660
            goto L_0x068e
        L_0x0660:
            java.util.Set r14 = r11.f240698S
            java.util.HashSet r14 = com.google.common.p4522b.C58758qx.m90648f(r14)
            r11.f240704aa = r14
            java.util.Set r14 = r11.f240698S
            java.util.Iterator r14 = r14.iterator()
        L_0x066e:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x068e
            java.lang.Object r2 = r14.next()
            android.view.View r2 = (android.view.View) r2
            com.google.android.libraries.logging.j r2 = com.google.android.libraries.logging.C28295m.m52915a(r2)
            if (r2 == 0) goto L_0x066e
            int r2 = r2.f76977e
            if (r2 != r0) goto L_0x066e
            r14 = 75282(0x12612, float:1.05493E-40)
            com.google.common.o.oe r14 = com.google.android.libraries.logging.C28285c.m52874a(r11, r14)
            com.google.android.apps.gsa.shared.logger.C89949q.m146521e(r14, r1)
        L_0x068e:
            java.util.Set r14 = r11.f240732e
            java.util.Iterator r14 = r14.iterator()
        L_0x0694:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x06b8
            java.lang.Object r0 = r14.next()
            com.google.android.apps.gsa.searchplate.a.g r0 = (com.google.android.apps.gsa.searchplate.p6963a.C88897g) r0
            r0.mo81837a(r12, r13, r15)
            goto L_0x0694
        L_0x06a4:
            com.google.android.apps.gsa.searchplate.ac r14 = r11.f240689I
            int r14 = r14.mo82755a()
            if (r12 != r14) goto L_0x06b0
            r14 = r13 & 2
            if (r14 == 0) goto L_0x06b8
        L_0x06b0:
            r11.m144353L(r12, r1)
            com.google.android.apps.gsa.searchplate.ac r14 = r11.f240689I
            r14.mo82759e(r12, r13, r15)
        L_0x06b8:
            if (r15 == 0) goto L_0x06bd
            r11.requestLayout()
        L_0x06bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchplate.SearchPlate.mo82680m(int, int, boolean, boolean):void");
    }

    /* renamed from: n */
    public final void mo82681n(C88936h hVar, boolean z) {
        int i;
        C88936h hVar2 = hVar;
        if (z) {
            C58976aa aaVar = C58975e.f156826a;
            if (!hVar.mo82817a().isEmpty() || !((i = this.f240685E) == 6 || i == 8)) {
                this.f240702W.set(C58837ba.m90858g(hVar2.f240925c.toString()));
                if ((hVar2.f240923a & 16) != 0) {
                    this.f240734g.f240770b.mo82696a();
                    this.f240735h.mo82697b(getContext().getString(R.string.search_box_hint));
                    this.f240694N = true;
                } else {
                    TextContainer textContainer = this.f240734g;
                    Editable text = textContainer.f240770b.getText();
                    String a = hVar.mo82817a();
                    if ((hVar2.f240923a & 1) == 0 || TextUtils.isEmpty(text) || TextUtils.isEmpty(a) || TextUtils.equals(text, a) || !textContainer.f240770b.isShown() || textContainer.f240770b.getLayout() == null) {
                        textContainer.f240770b.mo82698c(hVar2);
                    } else if (textContainer.f240775g) {
                        ((C59052c) ((C59052c) TextContainer.f240769a.mo56226d()).mo56372aa(10113)).mo56386p("animateQuery was called while still animating.");
                        textContainer.f240770b.mo82698c(hVar2);
                        textContainer.mo82723h();
                    } else {
                        textContainer.f240775g = true;
                        C88913ao aoVar = new C88913ao(textContainer, hVar2);
                        int totalPaddingTop = textContainer.f240770b.getTotalPaddingTop();
                        Editable text2 = textContainer.f240770b.getText();
                        String obj = text2 != null ? text2.toString() : BuildConfig.FLAVOR;
                        C88954q t = textContainer.mo82735t();
                        Layout layout = textContainer.f240770b.getLayout();
                        TextPaint paint = textContainer.f240770b.getPaint();
                        t.f240991e = obj.split(" ");
                        t.f240992f = paint;
                        t.f240993g = aoVar;
                        String[] strArr = t.f240991e;
                        int i2 = 0;
                        for (String str : strArr) {
                            int indexOf = obj.indexOf(str, i2);
                            C88912an b = t.mo82845b(String.valueOf(str).concat(" "), layout.getLineForOffset(indexOf) == 0);
                            b.setTranslationX(layout.getPrimaryHorizontal(indexOf));
                            b.setTranslationY((float) (layout.getLineTop(layout.getLineForOffset(indexOf)) + totalPaddingTop));
                            t.addView(b);
                            i2 = indexOf + str.length();
                        }
                        C88913ao aoVar2 = t.f240993g;
                        if (aoVar2 != null) {
                            aoVar2.f240866b.f240770b.setAlpha(0.0f);
                            aoVar2.f240866b.f240770b.mo82698c(aoVar2.f240865a);
                            C88954q t2 = aoVar2.f240866b.mo82735t();
                            String a2 = aoVar2.f240865a.mo82817a();
                            Layout layout2 = aoVar2.f240866b.f240770b.getLayout();
                            int totalPaddingTop2 = aoVar2.f240866b.f240770b.getTotalPaddingTop();
                            String[] split = a2.split(" ");
                            int length = t2.f240991e.length;
                            boolean[] zArr = new boolean[length];
                            int length2 = split.length;
                            boolean[] zArr2 = new boolean[length2];
                            int[] iArr = new int[length];
                            int[] iArr2 = new int[length2];
                            int i3 = 0;
                            for (int i4 = 0; i4 < split.length; i4++) {
                                int indexOf2 = a2.indexOf(split[i4], i3);
                                iArr2[i4] = indexOf2;
                                i3 = indexOf2 + split[i4].length();
                            }
                            for (int i5 = 0; i5 < t2.f240991e.length; i5++) {
                                int i6 = 0;
                                while (true) {
                                    if (i6 < split.length) {
                                        if (t2.f240991e[i5].equalsIgnoreCase(split[i6]) && !zArr2[i6]) {
                                            zArr[i5] = true;
                                            zArr2[i6] = true;
                                            iArr[i5] = iArr2[i6];
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        break;
                                    }
                                }
                            }
                            for (int i7 = 0; i7 < length; i7++) {
                                if (!zArr[i7]) {
                                    t2.getChildAt(i7).animate().alpha(0.0f).setDuration((long) t2.f240987a);
                                }
                            }
                            for (int i8 = 0; i8 < length; i8++) {
                                if (zArr[i8]) {
                                    C88912an anVar = (C88912an) t2.getChildAt(i8);
                                    boolean z2 = layout2.getLineForOffset(iArr[i8]) == 0;
                                    if (z2 != anVar.f240864b) {
                                        anVar.f240863a = t2.mo82844a(anVar.f240863a.getText(), z2);
                                        anVar.f240864b = z2;
                                    }
                                    anVar.animate().translationX(layout2.getPrimaryHorizontal(iArr[i8])).translationY((float) (layout2.getLineTop(layout2.getLineForOffset(iArr[i8])) + totalPaddingTop2)).setDuration((long) t2.f240988b).setStartDelay(0);
                                }
                            }
                            int i9 = 0;
                            C88912an anVar2 = null;
                            for (int i10 = 0; i10 < split.length; i10++) {
                                if (!zArr2[i10]) {
                                    i9 = a2.indexOf(split[i10], i9);
                                    C88912an b2 = t2.mo82845b(String.valueOf(split[i10]).concat(" "), layout2.getLineForOffset(i9) == 0);
                                    b2.setAlpha(0.0f);
                                    b2.setTranslationX(layout2.getPrimaryHorizontal(i9));
                                    b2.setTranslationY((float) (layout2.getLineTop(layout2.getLineForOffset(i9)) + totalPaddingTop2));
                                    t2.addView(b2);
                                    if (anVar2 != null) {
                                        anVar2.animate().alpha(1.0f).setDuration((long) t2.f240990d).setStartDelay((long) t2.f240989c);
                                    }
                                    anVar2 = b2;
                                }
                                i9 += split[i10].length();
                            }
                            if (anVar2 != null) {
                                anVar2.animate().alpha(1.0f).setDuration((long) t2.f240990d).setStartDelay((long) t2.f240989c).setListener(new C88952o(t2));
                            } else {
                                new Handler().postDelayed(new C88953p(t2), (long) t2.f240989c);
                            }
                        }
                    }
                    this.f240694N = false;
                }
                m144354M();
                if (this.f240753z != null) {
                    if (m144358Q(this.f240685E) && this.f240753z.getVisibility() != 0) {
                        m144359R(this.f240753z);
                        this.f240735h.postInvalidate();
                        m144355N();
                        ImageButton imageButton = this.f240753z;
                        if (imageButton == null) {
                            C59104x c = f240680P.mo56225c();
                            c.mo56378ag(C58975e.f156826a, "SearchPlate");
                            ((C59052c) ((C59052c) c).mo56372aa(10092)).mo56386p("Lens button was unexpectedly null.");
                        } else {
                            C28292j a3 = C28295m.m52915a(imageButton);
                            if (!this.f240701V.getAndSet(true) && a3 != null && a3.f76977e == 1) {
                                C89949q.m146521e(C28285c.m52874a(this, 99172), false);
                            }
                        }
                    } else if (!m144358Q(this.f240685E) && this.f240753z.getVisibility() != 8) {
                        m144347F(this.f240753z);
                        this.f240735h.postInvalidate();
                    }
                }
                this.f240689I.f240802a = null;
                return;
            }
            return;
        }
        this.f240689I.mo82758d(hVar2);
    }

    /* renamed from: o */
    public final void mo82682o(C90740ax axVar) {
        this.f240723at = axVar;
        for (C88895e h : this.f240733f) {
            h.mo82749h(this.f240723at);
        }
        AudioProgressRenderer audioProgressRenderer = this.f240738k;
        if (audioProgressRenderer != null) {
            audioProgressRenderer.f241116a = axVar;
        }
    }

    public final void onClick(View view) {
        C88893c cVar;
        if (this.f240752y != null) {
            C58976aa aaVar = C58975e.f156826a;
            int i = this.f240685E;
            if (i == 2) {
                mo82671e();
            } else if ((i == 4 || i == 0) && (cVar = this.f240752y) != null) {
                cVar.mo17641k();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C58976aa aaVar = C58975e.f156826a;
        Runnable runnable = this.f240700U;
        if (runnable != null) {
            post(runnable);
            this.f240700U = null;
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        C28292j jVar = new C28292j(75283);
        jVar.mo33795i(5);
        mo82672f(this, jVar);
        TextContainer textContainer = (TextContainer) findViewById(R.id.text_container);
        textContainer.getClass();
        this.f240734g = textContainer;
        SimpleSearchText simpleSearchText = (SimpleSearchText) findViewById(R.id.search_box);
        simpleSearchText.getClass();
        this.f240735h = simpleSearchText;
        ClearOrVoiceButton clearOrVoiceButton = (ClearOrVoiceButton) findViewById(R.id.clear_or_voice_button);
        clearOrVoiceButton.getClass();
        this.f240737j = clearOrVoiceButton;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.progress_or_clear_or_voice);
        linearLayout.getClass();
        this.f240721ar = linearLayout;
        HintTextView hintTextView = (HintTextView) findViewById(R.id.say_ok_google);
        hintTextView.getClass();
        this.f240741n = hintTextView;
        View findViewById = findViewById(R.id.search_plate_separator);
        findViewById.getClass();
        this.f240742o = findViewById;
        ImageButton imageButton = (ImageButton) findViewById(R.id.lens_button);
        imageButton.getClass();
        this.f240753z = imageButton;
        m144355N();
        View findViewById2 = findViewById(R.id.button_margin_separator);
        findViewById2.getClass();
        this.f240714ak = findViewById2;
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.voice_search_language_spinner_container);
        linearLayout2.getClass();
        this.f240747t = linearLayout2;
        C28292j jVar2 = new C28292j(117047);
        jVar2.mo33795i(5);
        jVar2.mo33794h(2);
        mo82672f(linearLayout2, jVar2);
        C88901ac acVar = new C88901ac(this, this);
        this.f240689I = acVar;
        this.f240734g.f240776h = acVar;
        if (!getContext().getPackageManager().hasSystemFeature("android.hardware.microphone")) {
            this.f240737j.mo82657a();
        }
        this.f240739l = (ImageView) findViewById(R.id.launcher_search_button);
        this.f240708ae = (ImageView) findViewById(R.id.opa_assistant_logo);
        View findViewById3 = findViewById(R.id.navigation_viewport);
        findViewById3.getClass();
        ImageView imageView = (ImageView) findViewById(R.id.navigation_button);
        imageView.getClass();
        this.f240745r = imageView;
        this.f240740m = new C88951n(findViewById3, this.f240745r);
        ImageView imageView2 = (ImageView) findViewById(R.id.dynamic_icon_button);
        imageView2.getClass();
        this.f240746s = imageView2;
        this.f240689I.mo82765j(true);
        getLayoutTransition().setStartDelay(1, 0);
        getLayoutTransition().setStartDelay(2, 0);
        C88904af afVar = new C88904af(true);
        this.f240748u = afVar;
        afVar.mo82771a(this.f240740m.f240980b, 6);
        int i = 0;
        this.f240748u.mo82771a(this.f240739l, 0);
        this.f240748u.mo82771a(this.f240741n, 0);
        C88904af afVar2 = new C88904af(false);
        afVar2.mo82771a(this.f240740m.f240980b, 4);
        afVar2.mo82771a(this.f240739l, 0);
        afVar2.mo82771a(this.f240741n, 0);
        getLayoutTransition().setAnimator(2, this.f240748u);
        getLayoutTransition().setAnimator(3, afVar2);
        getLayoutTransition().setAnimateParentHierarchy(false);
        getLayoutTransition().setDuration(100);
        this.f240715al = mo82667a(R.dimen.text_search_plate_height);
        int i2 = getResources().getDisplayMetrics().heightPixels;
        this.f240716am = m144344C(mo82667a(R.dimen.taller_voice_plate_height), i2);
        this.f240718ao = mo82667a(R.dimen.classic_plate_with_animation_voice_plate_height);
        if (!m144356O()) {
            this.f240718ao = -1;
        } else if (i2 > 0) {
            float f = ((float) i2) * 0.9f;
            if (this.f240718ao > Math.round(f)) {
                int round = Math.round(f);
                if (getRootWindowInsets() == null) {
                    int identifier = getContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier != 0) {
                        i = getContext().getResources().getDimensionPixelSize(identifier);
                    }
                } else {
                    i = getRootWindowInsets().getSystemWindowInsetTop();
                }
                this.f240718ao = round - i;
            }
        }
        this.f240717an = m144344C(mo82667a(R.dimen.assistant_styled_with_animation_voice_plate_height), i2);
        this.f240719ap = mo82667a(R.dimen.extra_height_of_voice_plate_due_to_language_switcher);
        this.f240720aq = mo82667a(R.dimen.follow_on_search_plate_height);
        setOnClickListener(this);
        C88984y yVar = new C88984y(this);
        SimpleSearchText simpleSearchText2 = this.f240735h;
        simpleSearchText2.f240759f = yVar;
        simpleSearchText2.setOnEditorActionListener(new C88955r(this));
        this.f240735h.setOnClickListener(new C88975s(this));
        this.f240735h.setOnKeyListener(new C88976t(this));
        ClearOrVoiceButton clearOrVoiceButton2 = this.f240737j;
        clearOrVoiceButton2.f240667a = new C88977u(this);
        this.f240721ar.setOnClickListener(clearOrVoiceButton2);
        this.f240753z.setOnClickListener(new C89943l(new C88978v(this)));
        mo82675h(this.f240740m);
        C88943f fVar = new C88943f(this.f240741n);
        this.f240709af = fVar;
        mo82675h(fVar);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SearchPlate.class.getCanonicalName());
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C58976aa aaVar = C58975e.f156826a;
        super.onLayout(z, i, i2, i3, i4);
        C88901ac acVar = this.f240689I;
        if (!acVar.f240807f) {
            acVar.mo82765j(true);
        }
        int measuredWidth = this.f240734g.getMeasuredWidth();
        int i5 = (this.f240685E == 0 && this.f240740m.f240980b.getVisibility() != 0 && getContext().getResources().getConfiguration().orientation == 1) ? measuredWidth : -1;
        C88943f fVar = this.f240709af;
        if (measuredWidth != -1) {
            fVar.f240950c = measuredWidth;
        }
        if (i5 != -1) {
            fVar.f240951d = i5;
        }
        if (fVar.f240949b.getVisibility() != 8) {
            float measureText = fVar.f240949b.getPaint().measureText(fVar.f240949b.getText().toString());
            if (measureText > ((float) fVar.f240951d) && measureText > ((float) fVar.f240950c)) {
                fVar.f240949b.post(fVar.f240952e);
            } else if (fVar.f240948a) {
                fVar.f240949b.post(fVar.f240953f);
            }
        }
        m144349H();
    }

    /* renamed from: p */
    public final void mo82688p(String str) {
        this.f240710ag = str;
        if (TextUtils.isEmpty(str)) {
            this.f240734g.mo82722f();
        }
    }

    /* renamed from: q */
    public final void mo82689q(Spanned spanned, boolean z) {
        if (z) {
            this.f240735h.mo82699d(spanned);
        } else {
            this.f240689I.mo82761f(spanned);
        }
    }

    /* renamed from: r */
    public final void mo82690r(boolean z) {
        this.f240722as = z;
        for (C88895e f : this.f240733f) {
            f.mo82747f(z);
        }
    }

    public final boolean requestFocus(int i, Rect rect) {
        return false;
    }

    /* renamed from: s */
    public final void mo82692s(int i, boolean z) {
        int i2;
        if (!z) {
            this.f240689I.mo82762g(i);
        } else if (i == this.f240687G || !((i2 = this.f240685E) == 2 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 4)) {
            m144349H();
        } else {
            C58976aa aaVar = C58975e.f156826a;
            this.f240687G = i;
            for (C88895e g : this.f240733f) {
                g.mo82748g(i);
            }
            switch (i) {
                case 1:
                    this.f240724au = false;
                    this.f240735h.mo82697b(BuildConfig.FLAVOR);
                    this.f240734g.f240770b.mo82696a();
                    this.f240734g.mo82719d().mo82922a();
                    m144351J();
                    if (this.f240726aw) {
                        m144348G();
                        return;
                    }
                    return;
                case 2:
                    int i3 = this.f240685E;
                    if (i3 == 3) {
                        m144359R(m144345D());
                        this.f240738k.mo82911a();
                        this.f240734g.mo82725j(getResources().getText(R.string.listening_for_music_status));
                        return;
                    } else if (i3 == 2 || i3 == 6) {
                        m144351J();
                        m144348G();
                        this.f240734g.mo82719d().mo82922a();
                        return;
                    } else {
                        return;
                    }
                case 4:
                    int i4 = this.f240685E;
                    if (i4 == 2) {
                        if (this.f240728ay) {
                            m144346E();
                            this.f240734g.mo82725j(getResources().getText(R.string.waiting_to_load_results));
                            return;
                        }
                    } else if (i4 == 8) {
                        return;
                    }
                    if (this.f240724au) {
                        this.f240734g.mo82725j(getResources().getText(R.string.streaming_text_recognizing));
                        return;
                    }
                    return;
                case 5:
                    int i5 = this.f240685E;
                    if (i5 == 3) {
                        m144345D().mo82912b();
                        return;
                    } else if (i5 == 2) {
                        this.f240734g.mo82725j(getResources().getText(R.string.tap_the_mic_then_speak_into_your_phone_for_quick_answers));
                        TextContainer textContainer = this.f240734g;
                        textContainer.mo82717b().setAlpha(1.0f);
                        textContainer.mo82717b().setVisibility(0);
                        textContainer.mo82719d().mo82922a();
                        m144346E();
                        return;
                    } else if (i5 == 6) {
                        this.f240734g.mo82721e();
                        return;
                    } else if (i5 == 8) {
                        this.f240734g.mo82721e();
                        TextContainer.m144397p(this.f240734g.mo82718c(), true, 0);
                        this.f240734g.mo82729n(this.f240710ag);
                        return;
                    } else {
                        return;
                    }
                case 6:
                    this.f240734g.mo82725j(BuildConfig.FLAVOR);
                    m144346E();
                    return;
                case 7:
                    if (this.f240685E == 3) {
                        m144347F(this.f240738k);
                    }
                    m144346E();
                    return;
                case 9:
                    if (this.f240685E == 3) {
                        this.f240734g.mo82725j(BuildConfig.FLAVOR);
                    }
                    m144346E();
                    return;
                case 10:
                    this.f240724au = true;
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: t */
    public final void mo82693t(boolean z) {
        this.f240735h.clearFocus();
        if (z) {
            m144354M();
            C90476a aVar = C91018d.f254254a;
            this.f240697R.hideSoftInputFromWindow(this.f240735h.getWindowToken(), 2);
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        this.f240689I.mo82763h();
    }

    /* renamed from: u */
    public final void mo82694u() {
        if (this.f240685E == 1) {
            int id = this.f240735h.getId();
            int i = this.f240691K;
            if (i == -1) {
                i = id;
            }
            int i2 = this.f240692L;
            if (i2 == -1) {
                i2 = id;
            }
            this.f240735h.setNextFocusLeftId(id);
            this.f240735h.setNextFocusRightId(id);
            this.f240735h.setNextFocusUpId(id);
            this.f240735h.setNextFocusDownId(i);
            this.f240735h.setNextFocusForwardId(i2);
            return;
        }
        this.f240735h.setNextFocusLeftId(-1);
        this.f240735h.setNextFocusRightId(-1);
        this.f240735h.setNextFocusUpId(-1);
        this.f240735h.setNextFocusDownId(-1);
        this.f240735h.setNextFocusForwardId(-1);
    }

    /* renamed from: z */
    public final boolean mo82695z() {
        return this.f240749v && m144343A(this.f240686F);
    }

    public SearchPlate(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public final void mo82669c(C88897g gVar) {
        gVar.getClass();
        this.f240732e.add(gVar);
    }

    public SearchPlate(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f240698S = new HashSet();
        this.f240730c = new HashSet();
        this.f240699T = new C88979w(this);
        this.f240700U = new C88983x(this);
        this.f240732e = new HashSet();
        this.f240733f = new ArrayList();
        this.f240701V = new AtomicBoolean(false);
        this.f240702W = new AtomicReference(BuildConfig.FLAVOR);
        this.f240704aa = new HashSet();
        this.f240749v = false;
        this.f240750w = true;
        this.f240751x = false;
        this.f240681A = false;
        this.f240682B = false;
        this.f240683C = false;
        this.f240684D = false;
        this.f240691K = -1;
        this.f240692L = -1;
        this.f240727ax = false;
        this.f240695O = false;
        this.f240728ay = false;
        this.f240697R = (InputMethodManager) context.getSystemService("input_method");
        this.f240729b = new C89103b("SearchPlateHeight");
        this.f240703a = new C89103b("SearchPlateHeightWithMargins");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.search_bg_9_baked_margin);
        this.f240696Q = dimensionPixelSize + dimensionPixelSize;
    }

    /* renamed from: e */
    public final void mo82671e() {
        C88893c cVar;
        C88893c cVar2;
        C88893c cVar3;
        if (this.f240685E == 2) {
            int i = this.f240687G;
            if (!(i == 1 || i == 2)) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 10 && !this.f240713aj && (cVar3 = this.f240752y) != null) {
                            cVar3.mo17640j();
                            return;
                        }
                        return;
                    }
                } else if (!m144363y(this.f240686F) && (cVar2 = this.f240752y) != null) {
                    cVar2.mo17640j();
                    return;
                } else {
                    return;
                }
            }
            if (!m144363y(this.f240686F) && (cVar = this.f240752y) != null) {
                cVar.mo17631a();
            }
        }
    }

    /* renamed from: G */
    private final void m144348G() {
        ViewStub viewStub;
        if (this.f240705ab == null) {
            if ((this.f240686F & 128) != 0 && getResources().getDisplayMetrics().heightPixels >= mo82667a(R.dimen.min_height_required_for_visual_aid) && m144356O()) {
                int bottom = this.f240734g.getBottom();
                int a = mo82667a(R.dimen.visual_aid_animation_margin_top);
                int bottom2 = getBottom();
                View view = this.f240706ac;
                if (!(view == null || view.getTop() == 0)) {
                    bottom2 = this.f240706ac.getTop();
                }
                if ((bottom2 - bottom) - a >= mo82667a(R.dimen.visual_aid_animation_min_height) && (viewStub = (ViewStub) findViewById(R.id.voice_search_visual_aid_stub)) != null) {
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) viewStub.inflate();
                    this.f240705ab = lottieAnimationView;
                    if (lottieAnimationView != null) {
                        int bottom3 = this.f240734g.getBottom();
                        int a2 = mo82667a(R.dimen.visual_aid_animation_margin_top);
                        int bottom4 = getBottom();
                        View view2 = this.f240706ac;
                        if (!(view2 == null || view2.getTop() == 0)) {
                            bottom4 = this.f240706ac.getTop();
                        }
                        int i = (bottom4 - bottom3) - a2;
                        if (i >= mo82667a(R.dimen.visual_aid_animation_max_height)) {
                            i = mo82667a(R.dimen.visual_aid_animation_max_height);
                        }
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f240705ab.getLayoutParams();
                        layoutParams.height = i;
                        this.f240705ab.setLayoutParams(layoutParams);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        LottieAnimationView lottieAnimationView2 = this.f240705ab;
        if (lottieAnimationView2 != null && lottieAnimationView2.getVisibility() != 0) {
            LottieAnimationView lottieAnimationView3 = this.f240705ab;
            lottieAnimationView3.getClass();
            lottieAnimationView3.f15138d.mo9773j(0.0f);
            LottieAnimationView lottieAnimationView4 = this.f240705ab;
            lottieAnimationView4.getClass();
            lottieAnimationView4.mo9695f();
            LottieAnimationView lottieAnimationView5 = this.f240705ab;
            lottieAnimationView5.getClass();
            lottieAnimationView5.setVisibility(0);
        }
    }
}
