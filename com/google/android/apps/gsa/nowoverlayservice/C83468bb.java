package com.google.android.apps.gsa.nowoverlayservice;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.p119j.p120a.p121a.C2300b;
import com.google.android.apps.gsa.nowoverlayservice.p6423b.C83458f;
import com.google.android.apps.gsa.nowoverlayservice.p6423b.C83464l;
import com.google.android.apps.gsa.search.shared.overlay.C87620a;
import com.google.android.apps.gsa.search.shared.overlay.C87653b;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88169rs;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88170rt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88171ru;
import com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.C88686i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C89974am;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7162d.C90962a;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.search.lens.p10547a.C139921f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.bb */
/* compiled from: PG */
public final class C83468bb implements C87620a, C83473bg, C90991b {

    /* renamed from: M */
    private static final C59071e f227534M = C59071e.m91332i("com.google.android.apps.gsa.nowoverlayservice.bb");

    /* renamed from: A */
    public int f227535A;

    /* renamed from: B */
    LauncherPreviewBitmapView f227536B;

    /* renamed from: C */
    public Bitmap f227537C;

    /* renamed from: D */
    public boolean f227538D;

    /* renamed from: E */
    int f227539E;

    /* renamed from: F */
    public int f227540F;

    /* renamed from: G */
    public int f227541G = -1;

    /* renamed from: H */
    boolean f227542H;

    /* renamed from: I */
    boolean f227543I;

    /* renamed from: J */
    boolean f227544J;

    /* renamed from: K */
    boolean f227545K;

    /* renamed from: L */
    public C83552x f227546L;

    /* renamed from: N */
    private final C22871g f227547N;

    /* renamed from: O */
    private final C91142g f227548O;

    /* renamed from: P */
    private boolean f227549P;

    /* renamed from: a */
    public final C21370a f227550a;

    /* renamed from: b */
    public final Context f227551b;

    /* renamed from: c */
    public final C139921f f227552c;

    /* renamed from: d */
    public C87653b f227553d;

    /* renamed from: e */
    public C83471be f227554e;

    /* renamed from: f */
    public boolean f227555f;

    /* renamed from: g */
    public boolean f227556g;

    /* renamed from: h */
    public boolean f227557h;

    /* renamed from: i */
    public boolean f227558i;

    /* renamed from: j */
    public boolean f227559j;

    /* renamed from: k */
    public boolean f227560k;

    /* renamed from: l */
    public boolean f227561l;

    /* renamed from: m */
    public boolean f227562m;

    /* renamed from: n */
    public Rect f227563n;

    /* renamed from: o */
    public Point f227564o;

    /* renamed from: p */
    public LinearLayout f227565p;

    /* renamed from: q */
    public Point f227566q;

    /* renamed from: r */
    public float f227567r;

    /* renamed from: s */
    public Runnable f227568s;

    /* renamed from: t */
    C83475bi f227569t;

    /* renamed from: u */
    public ObjectAnimator f227570u;

    /* renamed from: v */
    public ObjectAnimator f227571v;

    /* renamed from: w */
    public View.OnTouchListener f227572w;

    /* renamed from: x */
    public View f227573x;

    /* renamed from: y */
    public View f227574y;

    /* renamed from: z */
    public int f227575z;

    public C83468bb(Context context, C22871g gVar, C91142g gVar2, C139921f fVar, C21370a aVar) {
        this.f227550a = aVar;
        this.f227551b = context;
        this.f227547N = gVar;
        this.f227548O = gVar2;
        this.f227552c = fVar;
    }

    /* renamed from: l */
    private final void m132866l() {
        this.f227556g = false;
        this.f227557h = false;
        this.f227558i = false;
        this.f227555f = false;
    }

    /* renamed from: a */
    public final Bitmap mo76793a(Bitmap bitmap) {
        int height = bitmap.getHeight();
        int i = this.f227540F;
        if (height - i > 0) {
            return Bitmap.createBitmap(bitmap, 0, i, bitmap.getWidth(), bitmap.getHeight() - this.f227540F);
        }
        C59104x c = f227534M.mo56225c();
        c.mo56378ag(C58975e.f156826a, "PSAC");
        ((C59052c) ((C59052c) c).mo56372aa(6721)).mo56387q("Bitmap height %d is less than first row height for pixel search", bitmap.getHeight());
        return bitmap;
    }

    /* renamed from: b */
    public final C60555uf mo76794b(int i) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        int i2 = this.f227575z;
        if (!(i2 == Integer.MAX_VALUE || i2 == 0)) {
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164253h |= C89885b.HTTP_VALUE;
            ufVar2.f164152bF = i2;
        }
        int i3 = this.f227535A;
        if (!(i3 == Integer.MAX_VALUE || i3 == 0)) {
            tzVar.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar.instance;
            ufVar3.f164253h |= 524288;
            ufVar3.f164153bG = i3;
        }
        return (C60555uf) tzVar.build();
    }

    /* renamed from: c */
    public final void mo76795c(C83458f fVar, boolean z) {
        int a;
        C88489j jVar = new C88489j(C87739bu.PIXEL_HOMESCREEN_QSB_TAPPED);
        if ((fVar.f227501a & 32768) != 0) {
            C88170rt rtVar = (C88170rt) C88171ru.f238350e.createBuilder();
            boolean z2 = fVar.f227517q;
            rtVar.copyOnWrite();
            C88171ru ruVar = (C88171ru) rtVar.instance;
            boolean z3 = true;
            ruVar.f238352a |= 1;
            ruVar.f238353b = z2;
            int a2 = C83464l.m132860a(fVar.f227518r);
            if (a2 == 0) {
                a2 = 1;
            }
            rtVar.copyOnWrite();
            C88171ru ruVar2 = (C88171ru) rtVar.instance;
            ruVar2.f238352a |= 2;
            ruVar2.f238354c = a2 - 1;
            if (!z || (((a = C83464l.m132860a(fVar.f227518r)) == 0 || a != 2) && !this.f227548O.mo85405j(C89974am.f246588b))) {
                z3 = false;
            }
            rtVar.copyOnWrite();
            C88171ru ruVar3 = (C88171ru) rtVar.instance;
            ruVar3.f238352a |= 4;
            ruVar3.f238355d = z3;
            jVar.mo82014b(C88169rs.f238349a, (C88171ru) rtVar.build());
        }
        this.f227554e.f236773C.mo81937i(jVar.mo82013a());
    }

    /* renamed from: e */
    public final void mo76796e() {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f227544J) {
            m132866l();
            this.f227542H = false;
            if (this.f227553d != null) {
                this.f227554e.mo81820p(false);
                if (this.f227549P) {
                    C83444as asVar = (C83444as) this.f227553d;
                    if (!asVar.f227446J && asVar.f227447K) {
                        asVar.f227446J = true;
                        if (asVar.f227449M == 2) {
                            asVar.mo76776a(0, 0, 0, 400, true);
                            asVar.f227452c.setAlpha(1.0f);
                            asVar.f227452c.animate().alpha(0.0f).setDuration(150);
                        } else {
                            asVar.mo76777b();
                            asVar.f227459j.set(asVar.f227437A);
                            asVar.f227461l.setInterpolator(new C2300b());
                            asVar.f227461l.reverse();
                            asVar.mo76776a(0, 0, asVar.f227473x, asVar.f227474y, true);
                            asVar.f227453d.setTranslationX(0.0f);
                            asVar.f227453d.animate().translationX((float) asVar.f227471v).setDuration(200);
                            asVar.f227445I.reverse();
                            if (asVar.f227440D != null) {
                                asVar.f227454e.setTranslationX(0.0f);
                                asVar.f227454e.animate().translationX((float) asVar.f227472w).setDuration(200);
                            }
                        }
                        asVar.f227444H.reverse();
                    }
                    this.f227546L.mo76874a();
                    return;
                }
                mo76799h(true);
            }
        }
    }

    /* renamed from: g */
    public final void mo76798g(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f227559j && this.f227560k) {
            mo76799h(z);
            this.f227559j = false;
            this.f227560k = false;
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r("PixelSearchAnimationController");
        e.mo85279c("context.getClass()").mo85276a(C90752i.m148231e(this.f227551b.getClass()));
        e.mo85279c("isDarkModeEnabledInContext(context)").mo85276a(C90752i.m148228b(Boolean.valueOf(C90962a.m148577a(this.f227551b))));
        if (this.f227541G != -1) {
            e.mo85279c("overlayBackgroundColor").mo85276a(C90752i.m148229c("0x".concat(String.valueOf(Integer.toHexString(this.f227541G)))));
        }
    }

    /* renamed from: h */
    public final void mo76799h(boolean z) {
        this.f227544J = false;
        this.f227554e.mo81817m(false);
        if (z) {
            C83552x xVar = this.f227546L;
            xVar.f227782a.mo28042ab(false);
            new Handler().post(new C83551w(xVar));
            new Handler().post(new C83448aw(this));
        }
    }

    /* renamed from: i */
    public final void mo76800i(View view) {
        C58976aa aaVar = C58975e.f156826a;
        this.f227555f = true;
        this.f227558i = false;
        this.f227549P = true;
        this.f227554e.mo81820p(true);
        this.f227547N.mo28213m("PixelSearchAnimationController.prepareAnimation", (long) this.f227554e.f236848ay, new C83446au(this));
        view.getViewTreeObserver().addOnPreDrawListener(new C83451az(this, view));
    }

    /* renamed from: j */
    public final void mo76801j() {
        this.f227549P = false;
        this.f227554e.mo81820p(true);
        this.f227546L.mo76875b();
    }

    /* renamed from: k */
    public final void mo76802k() {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f227542H || this.f227554e.f227589k) {
            mo76796e();
            this.f227554e.f227589k = false;
        } else if (!this.f227544J) {
            this.f227544J = true;
            C83475bi biVar = this.f227569t;
            biVar.getClass();
            biVar.mo76817c(true, true);
            this.f227546L.mo76874a();
            C83471be beVar = this.f227554e;
            int i = this.f227539E;
            boolean z = this.f227538D;
            C88686i iVar = beVar.f236787Q;
            if (iVar != null && iVar.mo82303E()) {
                iVar.mo82304F(i, z);
            }
            this.f227562m = true;
            if (this.f227536B != null) {
                if (!TextUtils.isEmpty(this.f227554e.f236844au.mo84352bk()) || !this.f227538D) {
                    LauncherPreviewBitmapView launcherPreviewBitmapView = this.f227536B;
                    launcherPreviewBitmapView.getClass();
                    launcherPreviewBitmapView.f227397a = this.f227537C;
                    launcherPreviewBitmapView.invalidate();
                } else {
                    Bitmap a = mo76793a(this.f227537C);
                    LauncherPreviewBitmapView launcherPreviewBitmapView2 = this.f227536B;
                    launcherPreviewBitmapView2.getClass();
                    launcherPreviewBitmapView2.f227397a = a;
                    launcherPreviewBitmapView2.invalidate();
                }
                this.f227536B.setVisibility(0);
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this.f227536B, View.ALPHA, new float[]{1.0f}));
                if (this.f227570u != null) {
                    arrayList.add(this.f227571v);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether((ObjectAnimator[]) arrayList.toArray(new ObjectAnimator[arrayList.size()]));
                animatorSet.setDuration(250);
                animatorSet.addListener(new C83450ay(this));
                animatorSet.start();
            }
        }
    }

    /* renamed from: f */
    public final void mo76797f() {
        long j;
        if (!this.f227555f) {
            return;
        }
        if ((this.f227556g && this.f227557h) || this.f227558i) {
            if (this.f227542H) {
                C58976aa aaVar = C58975e.f156826a;
                this.f227544J = true;
                this.f227546L.mo76875b();
                C83475bi biVar = this.f227569t;
                biVar.getClass();
                biVar.mo76816b();
                if (this.f227573x != null) {
                    C83475bi biVar2 = this.f227569t;
                    biVar2.getClass();
                    biVar2.mo76817c(true, false);
                }
                C83471be beVar = this.f227554e;
                int i = this.f227539E;
                boolean z = this.f227538D;
                C88686i iVar = beVar.f236787Q;
                if (iVar != null && iVar.mo82303E()) {
                    iVar.mo82306H(i, z);
                }
                if (this.f227536B != null) {
                    ArrayList arrayList = new ArrayList();
                    if (!this.f227558i) {
                        this.f227536B.setAlpha(1.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f227536B, View.ALPHA, new float[]{0.0f}));
                    }
                    ObjectAnimator objectAnimator = this.f227570u;
                    if (objectAnimator != null) {
                        arrayList.add(objectAnimator);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether((ObjectAnimator[]) arrayList.toArray(new ObjectAnimator[arrayList.size()]));
                    animatorSet.setDuration(250);
                    animatorSet.addListener(new C83449ax(this));
                    animatorSet.start();
                }
            } else {
                C58976aa aaVar2 = C58975e.f156826a;
                this.f227553d.getClass();
                this.f227544J = true;
                this.f227554e.mo81817m(true);
                this.f227546L.mo76875b();
                Rect rect = this.f227563n;
                if (rect != null) {
                    C87653b bVar = this.f227553d;
                    Point point = this.f227564o;
                    Point point2 = this.f227566q;
                    float f = this.f227567r;
                    C83444as asVar = (C83444as) bVar;
                    asVar.f227438B = rect;
                    asVar.f227439C = point;
                    asVar.f227440D = point2;
                    asVar.f227441E = f;
                    asVar.f227442F = ((float) asVar.f227438B.height()) / 2.0f;
                    asVar.f227462m = asVar.f227456g.getMeasuredHeight();
                    asVar.f227443G = asVar.f227457h.getBackground();
                    asVar.f227445I = ObjectAnimator.ofInt(asVar.f227454e, "alpha", new int[]{(int) (asVar.f227441E * 255.0f), 255});
                    asVar.f227445I.setDuration(200);
                    Resources resources = asVar.f227450a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier > 0) {
                        asVar.f227463n = resources.getDimensionPixelSize(identifier);
                    }
                    asVar.f227464o = resources.getDimensionPixelSize(R.dimen.core_suggestion_height) * resources.getInteger(R.integer.max_web_suggestions);
                    int[] iArr = new int[2];
                    asVar.f227453d.getLocationInWindow(iArr);
                    int[] iArr2 = new int[2];
                    asVar.f227454e.getLocationInWindow(iArr2);
                    int[] iArr3 = new int[2];
                    asVar.f227456g.getLocationInWindow(iArr3);
                    int[] iArr4 = new int[2];
                    asVar.f227457h.getLocationInWindow(iArr4);
                    int i2 = iArr[0];
                    int measuredWidth = asVar.f227453d.getMeasuredWidth();
                    asVar.f227467r = iArr[1] + (asVar.f227453d.getHeight() / 2);
                    asVar.f227468s = (i2 + (measuredWidth / 2)) - iArr3[0];
                    int i3 = iArr2[0];
                    int measuredWidth2 = asVar.f227454e.getMeasuredWidth();
                    int i4 = iArr3[0];
                    asVar.f227470u = (i3 + (measuredWidth2 / 2)) - i4;
                    asVar.f227465p = i4 - iArr4[0];
                    int[] iArr5 = new int[2];
                    asVar.f227456g.getLocationInWindow(iArr5);
                    if (asVar.f227452c.getLayoutDirection() == 1) {
                        asVar.f227466q = (asVar.f227450a.getResources().getDisplayMetrics().widthPixels - iArr5[0]) - asVar.f227468s;
                        asVar.f227469t = (asVar.f227450a.getResources().getDisplayMetrics().widthPixels - iArr5[0]) - asVar.f227470u;
                        int i5 = asVar.f227466q;
                        int width = asVar.f227438B.width();
                        int i6 = asVar.f227468s;
                        float f2 = (float) asVar.f227467r;
                        float f3 = asVar.f227442F;
                        asVar.f227475z = new Rect(i5 - (width - i6), (int) (f2 - f3), asVar.f227466q + i6, (int) (f2 + f3));
                        asVar.f227473x = asVar.f227438B.right - (asVar.f227466q + asVar.f227468s);
                        asVar.f227474y = (asVar.f227438B.top + asVar.f227439C.y) - asVar.f227467r;
                        int i7 = asVar.f227438B.left;
                        int i8 = asVar.f227439C.x;
                        asVar.f227471v = ((i7 + i8) - asVar.f227466q) - asVar.f227473x;
                        if (asVar.f227440D != null) {
                            int i9 = asVar.f227438B.left;
                            int i10 = asVar.f227440D.x;
                            asVar.f227472w = ((i9 + i10) - asVar.f227469t) - asVar.f227473x;
                        }
                    } else {
                        int i11 = iArr5[0];
                        int i12 = asVar.f227468s;
                        int i13 = i11 + i12;
                        asVar.f227466q = i13;
                        asVar.f227469t = i11 + asVar.f227470u;
                        asVar.f227475z = new Rect(i13 - i12, (int) (((float) asVar.f227467r) - asVar.f227442F), i13 + (asVar.f227438B.width() - asVar.f227468s), (int) (((float) asVar.f227467r) + asVar.f227442F));
                        asVar.f227473x = asVar.f227438B.left - (asVar.f227466q - asVar.f227468s);
                        asVar.f227474y = (asVar.f227438B.top + asVar.f227439C.y) - asVar.f227467r;
                        int i14 = asVar.f227438B.left;
                        int i15 = asVar.f227439C.x;
                        asVar.f227471v = ((i14 + i15) - asVar.f227466q) - asVar.f227473x;
                        if (asVar.f227440D != null) {
                            int i16 = asVar.f227438B.left;
                            int i17 = asVar.f227440D.x;
                            asVar.f227472w = ((i16 + i17) - asVar.f227469t) - asVar.f227473x;
                        }
                    }
                    int i18 = iArr5[0];
                    asVar.f227437A = new Rect(i18, iArr3[1], asVar.f227456g.getMeasuredWidth() + i18, asVar.f227465p + asVar.f227463n + asVar.f227462m + asVar.f227464o);
                    asVar.f227447K = true;
                }
                C83444as asVar2 = (C83444as) this.f227553d;
                if (!asVar2.f227446J && asVar2.f227447K) {
                    asVar2.f227446J = true;
                    if (asVar2.f227449M == 2) {
                        asVar2.mo76776a(0, 400, 0, 0, false);
                        asVar2.f227452c.setAlpha(0.0f);
                        asVar2.f227452c.animate().alpha(1.0f).setDuration(267);
                        asVar2.f227444H.setDuration(150);
                    } else {
                        asVar2.mo76777b();
                        asVar2.f227459j.set(asVar2.f227475z);
                        asVar2.f227461l.setInterpolator(new C2300b());
                        asVar2.f227461l.start();
                        asVar2.mo76776a(asVar2.f227473x, asVar2.f227474y, 0, 0, false);
                        asVar2.f227453d.setTranslationX((float) asVar2.f227471v);
                        asVar2.f227453d.animate().translationX(0.0f).setDuration(200);
                        asVar2.f227454e.setAlpha(asVar2.f227441E);
                        asVar2.f227445I.start();
                        if (asVar2.f227440D != null) {
                            asVar2.f227454e.setTranslationX((float) asVar2.f227472w);
                            j = 200;
                            asVar2.f227454e.animate().translationX(0.0f).setDuration(200);
                        } else {
                            j = 200;
                        }
                        asVar2.f227444H.setDuration(j);
                    }
                    asVar2.f227444H.start();
                }
            }
            m132866l();
        }
    }
}
