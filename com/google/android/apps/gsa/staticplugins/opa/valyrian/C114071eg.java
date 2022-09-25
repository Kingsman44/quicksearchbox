package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.p033v7.widget.C0568ck;
import android.support.p033v7.widget.C0646fh;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0669gd;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.C1773f;
import androidx.core.p098j.C2100o;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2333ah;
import androidx.viewpager.widget.C4277j;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.assistant.shared.l.g;
import com.google.android.apps.gsa.assistant.shared.p5827q.C73904j;
import com.google.android.apps.gsa.assistant.shared.p5829r.C73906a;
import com.google.android.apps.gsa.assistant.shared.p5830s.C73909r;
import com.google.android.apps.gsa.assistant.shared.q.a;
import com.google.android.apps.gsa.assistant.shared.q.h;
import com.google.android.apps.gsa.assistant.shared.q.m;
import com.google.android.apps.gsa.nga.api.a.bf;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6370a.C81517a;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6405b.C82193a;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6406c.C82194a;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6928f.C87546b;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88191sn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88192so;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89143o;
import com.google.android.apps.gsa.shared.p6983ah.C89150g;
import com.google.android.apps.gsa.shared.p6983ah.C89157n;
import com.google.android.apps.gsa.shared.p6983ah.C89158o;
import com.google.android.apps.gsa.shared.p6983ah.C89160q;
import com.google.android.apps.gsa.shared.p7003av.C89295c;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.p7066m.C90080ee;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.C90730an;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.C109037fg;
import com.google.android.apps.gsa.staticplugins.opa.C109040fj;
import com.google.android.apps.gsa.staticplugins.opa.chathead.C108135a;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108204ab;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108228az;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108234be;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108235bf;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108237bh;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108241bl;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108249bt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108252bw;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108259cc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108269cm;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108271co;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108273cq;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108276ct;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108277cu;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108278cv;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108279cw;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108287dd;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108300dq;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108303dt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108308dy;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108325en;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108328eq;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108339fa;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108395hc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108397he;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108398hf;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108412ht;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108423id;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108425if;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108426ig;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108430ik;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108436iq;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108457jk;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108473k;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108474ka;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108484s;
import com.google.android.apps.gsa.staticplugins.opa.chatui.OpaAppWidgetCard;
import com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106171l;
import com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107379c;
import com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107382f;
import com.google.android.apps.gsa.staticplugins.opa.p8307au.C107606q;
import com.google.android.apps.gsa.staticplugins.opa.p8311aw.C107623a;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8344bk.C108093b;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109230d;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109247u;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109248v;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.C113732s;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.MoveUpwardBehavior;
import com.google.android.apps.gsa.staticplugins.opa.p8621x.C114524l;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8415a.p8417b.C110014a;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.android.apps.gsa.staticplugins.opa.util.C113793bi;
import com.google.android.apps.gsa.staticplugins.opa.util.C113798bn;
import com.google.android.apps.gsa.staticplugins.opa.util.C113799bo;
import com.google.android.apps.gsa.staticplugins.opa.util.C113863cr;
import com.google.android.apps.gsa.staticplugins.opa.util.C113868cw;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8596a.C113923a;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8596a.C113924b;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8597b.C113954b;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113983b;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113985d;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113990i;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d.C114034q;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8600e.C114062a;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8600e.C114064c;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114095a;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114096aa;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114097ab;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114104ai;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114105aj;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114106ak;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114108am;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114109an;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114111ap;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114116au;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114117av;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114119ax;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114132bj;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114138h;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114142l;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114143m;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114150t;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114153w;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.ValyrianDynamicResponseLayerView;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.ValyrianRecyclerView;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.ValyrianViewPager;
import com.google.android.apps.gsa.staticplugins.opa.webview.OpaWebView;
import com.google.android.apps.gsa.staticplugins.opa.webview.p8604b.C114215c;
import com.google.android.apps.gsa.staticplugins.opa.widget.impl.C114250c;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114742l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114748b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114754h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.gsa.conversation.p1855h.C22717u;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.logging.p2185ve.p2199f.C28421h;
import com.google.android.libraries.material.p2206b.C28505a;
import com.google.android.libraries.p1649b.p1653d.C19623a;
import com.google.android.libraries.p1649b.p1655f.C19629c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.material.snackbar.Snackbar;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50637am;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an;
import com.google.assistant.p3897e.p3921j.p3922a.C51655m;
import com.google.assistant.p3897e.p3921j.p3922a.C51656n;
import com.google.assistant.p3994s.p3995a.C53282ic;
import com.google.assistant.p3994s.p3995a.C53286ig;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58373cq;
import com.google.common.p4522b.C58374cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.p4552o.C60321oe;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.p5633c.p5634a.C72290n;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.eg */
/* compiled from: PG */
public final class C114071eg implements C108230ba, C113989h, C113985d, C113983b, C113990i, C87682aj, C113988g, C90991b {

    /* renamed from: bA */
    private static final Interpolator f315781bA = C91107f.m148859b(0.0f, 0.0f, 0.2f, 1.0f);

    /* renamed from: bB */
    private static final Interpolator f315782bB = C91107f.m148859b(0.8f, 0.0f, 1.0f, 1.0f);

    /* renamed from: bC */
    private static final Interpolator f315783bC = C91107f.m148859b(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: bD */
    private static final long f315784bD = Duration.ofMinutes(5).toMillis();

    /* renamed from: bv */
    private static final Interpolator f315785bv = C91107f.m148859b(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: bw */
    private static final Interpolator f315786bw = C91107f.m148859b(0.0f, 0.0f, 0.0f, 1.0f);

    /* renamed from: bx */
    private static final Interpolator f315787bx = C91107f.m148859b(0.0f, 0.0f, 0.2f, 1.0f);

    /* renamed from: by */
    private static final Interpolator f315788by = C91107f.m148859b(0.8f, 0.0f, 1.0f, 1.0f);

    /* renamed from: bz */
    private static final Interpolator f315789bz = C91107f.m148859b(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: j */
    public static final C59071e f315790j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.valyrian.eg");

    /* renamed from: A */
    public TextView f315791A;

    /* renamed from: B */
    TextView f315792B;

    /* renamed from: C */
    View f315793C;

    /* renamed from: D */
    View f315794D;

    /* renamed from: E */
    Animator f315795E;

    /* renamed from: F */
    ObjectAnimator f315796F;

    /* renamed from: G */
    ObjectAnimator f315797G;

    /* renamed from: H */
    Animator f315798H;

    /* renamed from: I */
    public final C91097g f315799I;

    /* renamed from: J */
    public final C82194a f315800J;

    /* renamed from: K */
    public final C114076el f315801K;

    /* renamed from: L */
    final Animator f315802L;

    /* renamed from: M */
    final Animator f315803M;

    /* renamed from: N */
    public final C109248v f315804N;

    /* renamed from: O */
    C114066eb f315805O = new C114066eb();

    /* renamed from: P */
    boolean f315806P;

    /* renamed from: Q */
    boolean f315807Q;

    /* renamed from: R */
    public final View f315808R;

    /* renamed from: S */
    public final View f315809S;

    /* renamed from: T */
    final View f315810T;

    /* renamed from: U */
    public final View f315811U;

    /* renamed from: V */
    final View f315812V;

    /* renamed from: W */
    View f315813W;

    /* renamed from: X */
    public final C21370a f315814X;

    /* renamed from: Y */
    public final C22871g f315815Y;

    /* renamed from: Z */
    public final C22871g f315816Z;

    /* renamed from: aA */
    Animator f315817aA;

    /* renamed from: aB */
    public ViewGroup f315818aB;

    /* renamed from: aC */
    public C108303dt f315819aC;

    /* renamed from: aD */
    public C114754h f315820aD;

    /* renamed from: aE */
    final C114153w f315821aE;

    /* renamed from: aF */
    public int f315822aF = 0;

    /* renamed from: aG */
    boolean f315823aG = true;

    /* renamed from: aH */
    public OpaWebView f315824aH;

    /* renamed from: aI */
    public int f315825aI;

    /* renamed from: aJ */
    public ValueAnimator f315826aJ;

    /* renamed from: aK */
    public boolean f315827aK;

    /* renamed from: aL */
    public boolean f315828aL;

    /* renamed from: aM */
    public int f315829aM;

    /* renamed from: aN */
    boolean f315830aN = false;

    /* renamed from: aO */
    public boolean f315831aO = false;

    /* renamed from: aP */
    public boolean f315832aP;

    /* renamed from: aQ */
    public final Activity f315833aQ;

    /* renamed from: aR */
    final View f315834aR;

    /* renamed from: aS */
    public final C108093b f315835aS;

    /* renamed from: aT */
    final C50637am f315836aT = ((C50637am) C50638an.f131726h.createBuilder());

    /* renamed from: aU */
    public final C107698i f315837aU;

    /* renamed from: aV */
    public final Query f315838aV;

    /* renamed from: aW */
    C114059dy f315839aW;

    /* renamed from: aX */
    public final LinkedHashMap f315840aX;

    /* renamed from: aY */
    public final LinkedHashMap f315841aY;

    /* renamed from: aZ */
    public boolean f315842aZ = false;

    /* renamed from: aa */
    public final boolean f315843aa;

    /* renamed from: ab */
    public final boolean f315844ab;

    /* renamed from: ac */
    public boolean f315845ac;

    /* renamed from: ad */
    View f315846ad;

    /* renamed from: ae */
    public final C114106ak f315847ae;

    /* renamed from: af */
    public C114150t f315848af;

    /* renamed from: ag */
    final C113863cr f315849ag;

    /* renamed from: ah */
    final C108423id f315850ah;

    /* renamed from: ai */
    final C108395hc f315851ai;

    /* renamed from: aj */
    final C108397he f315852aj;

    /* renamed from: ak */
    public final C113926aa f315853ak;

    /* renamed from: al */
    final C28421h f315854al;

    /* renamed from: am */
    ValyrianViewPager f315855am;

    /* renamed from: an */
    public C114132bj f315856an;

    /* renamed from: ao */
    C114109an f315857ao;

    /* renamed from: ap */
    public final C108269cm f315858ap;

    /* renamed from: aq */
    public C114095a f315859aq;

    /* renamed from: ar */
    final C4277j f315860ar;

    /* renamed from: as */
    final C2332ag f315861as;

    /* renamed from: at */
    final C2332ag f315862at;

    /* renamed from: au */
    final C113924b f315863au;

    /* renamed from: av */
    public C108237bh f315864av;

    /* renamed from: aw */
    public ValyrianDynamicResponseLayerView f315865aw;

    /* renamed from: ax */
    public ValyrianRecyclerView f315866ax;

    /* renamed from: ay */
    LinearLayoutManager f315867ay;

    /* renamed from: az */
    Animator f315868az;

    /* renamed from: bE */
    private boolean f315869bE;

    /* renamed from: bF */
    private boolean f315870bF;

    /* renamed from: bG */
    private CharSequence f315871bG = BuildConfig.FLAVOR;

    /* renamed from: bH */
    private boolean f315872bH = false;

    /* renamed from: bI */
    private boolean f315873bI = true;

    /* renamed from: bJ */
    private boolean f315874bJ = false;

    /* renamed from: bK */
    private final C0669gd f315875bK;

    /* renamed from: bL */
    private final LayoutInflater f315876bL;

    /* renamed from: bM */
    private final C114075ek f315877bM;

    /* renamed from: bN */
    private final C68214a f315878bN;

    /* renamed from: bO */
    private final ViewGroup f315879bO;

    /* renamed from: bP */
    private int f315880bP = 0;

    /* renamed from: bQ */
    private FrameLayout f315881bQ;

    /* renamed from: bR */
    private LogoView f315882bR;

    /* renamed from: bS */
    private final List f315883bS;

    /* renamed from: bT */
    private final List f315884bT;

    /* renamed from: bU */
    private final C113954b f315885bU;

    /* renamed from: bV */
    private final C58881cr f315886bV;

    /* renamed from: bW */
    private final C58881cr f315887bW;

    /* renamed from: bX */
    private final C58833ax f315888bX;

    /* renamed from: bY */
    private final boolean f315889bY;

    /* renamed from: bZ */
    private boolean f315890bZ;

    /* renamed from: ba */
    public C58833ax f315891ba;

    /* renamed from: bb */
    public C58833ax f315892bb = C58836b.f156633a;

    /* renamed from: bc */
    public final C68214a f315893bc;

    /* renamed from: bd */
    public h f315894bd;

    /* renamed from: be */
    public final List f315895be = new ArrayList();

    /* renamed from: bf */
    public int f315896bf = 0;

    /* renamed from: bg */
    public int f315897bg = 0;

    /* renamed from: bh */
    public int f315898bh = 0;

    /* renamed from: bi */
    C60870cx f315899bi;

    /* renamed from: bj */
    public C114096aa f315900bj;

    /* renamed from: bk */
    public boolean f315901bk = false;

    /* renamed from: bl */
    public boolean f315902bl;

    /* renamed from: bm */
    final Queue f315903bm = new ArrayDeque();

    /* renamed from: bn */
    C88192so f315904bn = null;

    /* renamed from: bo */
    CharSequence f315905bo = BuildConfig.FLAVOR;

    /* renamed from: bp */
    public int f315906bp = 1;

    /* renamed from: bq */
    C113973bs f315907bq;

    /* renamed from: br */
    C113974bt f315908br;

    /* renamed from: bs */
    int f315909bs = 1;

    /* renamed from: bt */
    int f315910bt = 1;

    /* renamed from: bu */
    public C109037fg f315911bu;

    /* renamed from: cA */
    private int f315912cA = 0;

    /* renamed from: cB */
    private C58528ij f315913cB = C58733pz.f156496a;

    /* renamed from: cC */
    private final C68214a f315914cC;

    /* renamed from: cD */
    private final C113868cw f315915cD;

    /* renamed from: cE */
    private final C68214a f315916cE;

    /* renamed from: cF */
    private final bm f315917cF;

    /* renamed from: cG */
    private final C86054o f315918cG;

    /* renamed from: cH */
    private final C89295c f315919cH;

    /* renamed from: cI */
    private final C108426ig f315920cI;

    /* renamed from: cJ */
    private final List f315921cJ = new ArrayList();

    /* renamed from: cK */
    private final List f315922cK = new ArrayList();

    /* renamed from: cL */
    private final List f315923cL = new ArrayList();

    /* renamed from: cM */
    private final List f315924cM = new ArrayList();

    /* renamed from: cN */
    private final int f315925cN;

    /* renamed from: cO */
    private final C58528ij f315926cO;

    /* renamed from: cP */
    private final C58528ij f315927cP;

    /* renamed from: cQ */
    private final C91022f f315928cQ;

    /* renamed from: cR */
    private final C114524l f315929cR;

    /* renamed from: cS */
    private final float f315930cS;

    /* renamed from: cT */
    private final C83363m f315931cT = new C83363m();

    /* renamed from: cU */
    private final C83363m f315932cU = new C83363m();

    /* renamed from: cV */
    private final C83357g f315933cV;

    /* renamed from: cW */
    private final C73909r f315934cW;

    /* renamed from: cX */
    private final C89143o f315935cX;

    /* renamed from: cY */
    private String f315936cY = BuildConfig.FLAVOR;

    /* renamed from: cZ */
    private String f315937cZ = BuildConfig.FLAVOR;

    /* renamed from: ca */
    private final C114056dv f315938ca;

    /* renamed from: cb */
    private final C68214a f315939cb;

    /* renamed from: cc */
    private final boolean f315940cc;

    /* renamed from: cd */
    private final boolean f315941cd;

    /* renamed from: ce */
    private C113984c f315942ce;

    /* renamed from: cf */
    private boolean f315943cf;

    /* renamed from: cg */
    private boolean f315944cg;

    /* renamed from: ch */
    private View f315945ch;

    /* renamed from: ci */
    private View.OnLayoutChangeListener f315946ci;

    /* renamed from: cj */
    private boolean f315947cj = false;

    /* renamed from: ck */
    private boolean f315948ck = false;

    /* renamed from: cl */
    private final C2100o f315949cl;

    /* renamed from: cm */
    private final C114748b f315950cm;

    /* renamed from: cn */
    private final C68214a f315951cn;

    /* renamed from: co */
    private C60870cx f315952co = null;

    /* renamed from: cp */
    private final C114742l f315953cp;

    /* renamed from: cq */
    private final C68214a f315954cq;

    /* renamed from: cr */
    private final C73906a f315955cr;

    /* renamed from: cs */
    private final boolean f315956cs;

    /* renamed from: ct */
    private final C89150g f315957ct;

    /* renamed from: cu */
    private final C68214a f315958cu;

    /* renamed from: cv */
    private final C2333ah f315959cv;

    /* renamed from: cw */
    private final C108135a f315960cw;

    /* renamed from: cx */
    private final C58528ij f315961cx;

    /* renamed from: cy */
    private final C58528ij f315962cy;

    /* renamed from: cz */
    private String f315963cz = BuildConfig.FLAVOR;

    /* renamed from: da */
    private String f315964da = BuildConfig.FLAVOR;

    /* renamed from: db */
    private String f315965db = BuildConfig.FLAVOR;

    /* renamed from: dc */
    private final m f315966dc;

    /* renamed from: dd */
    private final C114215c f315967dd;

    /* renamed from: de */
    private final ContextThemeWrapper f315968de;

    /* renamed from: df */
    private boolean f315969df;

    /* renamed from: dg */
    private boolean f315970dg;

    /* renamed from: dh */
    private boolean f315971dh;

    /* renamed from: di */
    private C58833ax f315972di = C58836b.f156633a;

    /* renamed from: dj */
    private final C104149a f315973dj;

    /* renamed from: dk */
    private final C107379c f315974dk;

    /* renamed from: k */
    public final NgaInteractionContainer f315975k;

    /* renamed from: l */
    boolean f315976l = false;

    /* renamed from: m */
    boolean f315977m = false;

    /* renamed from: n */
    boolean f315978n = false;

    /* renamed from: o */
    boolean f315979o;

    /* renamed from: p */
    public int f315980p = -1;

    /* renamed from: q */
    public final Context f315981q;

    /* renamed from: r */
    public final C86124t f315982r;

    /* renamed from: s */
    public final C108226ax f315983s;

    /* renamed from: t */
    public final ViewGroup f315984t;

    /* renamed from: u */
    public final FrameLayout f315985u;

    /* renamed from: v */
    final LinearLayout f315986v;

    /* renamed from: w */
    public final C113799bo f315987w;

    /* renamed from: x */
    public final ViewGroup f315988x;

    /* renamed from: y */
    final Animator f315989y;

    /* renamed from: z */
    final Animator f315990z;

    /* JADX WARNING: type inference failed for: r8v19, types: [android.os.Handler, androidx.viewpager.widget.j, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r8v35 */
    /* JADX WARNING: type inference failed for: r8v36 */
    /* JADX WARNING: type inference failed for: r8v37 */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0ac7, code lost:
        if (r2 == false) goto L_0x0ac9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x067d, code lost:
        if (r1.mo79746e(com.google.android.apps.gsa.shared.p7066m.C90014bt.f247159br) != false) goto L_0x06e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x07c5  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0806  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x08ec  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0909  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0989  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x09b8  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0a31  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0a41  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0afe  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0b00  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0b41  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0bcd  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0c05  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0c58  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0c86  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0ca0  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0d6a  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0d97  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x053c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0668  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x066c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x068b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0726  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0778  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x077f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C114071eg(com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax r30, com.google.android.apps.gsa.staticplugins.opa.chatui.C108321ej r31, com.google.android.apps.gsa.staticplugins.opa.searchbox.C110426a r32, com.google.android.apps.gsa.staticplugins.opa.chatui.C108237bh r33, com.google.android.apps.gsa.shared.util.p7184t.C91097g r34, com.google.common.base.C58881cr r35, com.google.common.base.C58881cr r36, android.content.Context r37, com.google.android.apps.gsa.search.core.p6805i.C86124t r38, com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a r39, com.google.android.apps.gsa.staticplugins.opa.valyrian.C114075ek r40, com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u r41, com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114105aj r42, com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114143m r43, com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114110ao r44, com.google.android.apps.gsa.staticplugins.opa.valyrian.p8596a.C113925c r45, com.google.android.apps.gsa.staticplugins.opa.chatui.C108270cn r46, com.google.android.apps.gsa.staticplugins.opa.chatui.C108424ie r47, com.google.android.apps.gsa.staticplugins.opa.chatui.C108396hd r48, dagger.C68214a r49, com.google.common.base.C58833ax r50, com.google.android.apps.gsa.staticplugins.opa.valyrian.C113927ab r51, com.google.android.apps.gsa.staticplugins.opa.valyrian.C113932ag r52, com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114118aw r53, com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114112aq r54, com.google.android.apps.gsa.staticplugins.opa.util.C113863cr r55, com.google.android.apps.gsa.staticplugins.opa.valyrian.p8597b.C113954b r56, com.google.common.base.C58833ax r57, com.google.android.libraries.gsa.p1876k.C22871g r58, com.google.android.libraries.gsa.p1876k.C22871g r59, com.google.android.apps.gsa.opa.C83580ak r60, com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109248v r61, com.google.android.apps.gsa.assistant.shared.bm r62, com.google.android.apps.gsa.staticplugins.opa.util.C113799bo r63, dagger.C68214a r64, com.google.android.libraries.p1730f.C21370a r65, androidx.lifecycle.C2391v r66, com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a r67, com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114106ak r68, android.app.Activity r69, com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114748b r70, dagger.C68214a r71, com.google.android.apps.gsa.staticplugins.opa.p8344bk.C108093b r72, com.google.android.apps.gsa.staticplugins.opa.chatui.C108324em r73, com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114742l r74, dagger.C68214a r75, com.google.android.apps.gsa.assistant.shared.p5829r.C73906a r76, com.google.android.apps.gsa.nga.shared.p6369ui.p6406c.C82195b r77, com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107379c r78, boolean r79, boolean r80, com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114151u r81, com.google.android.apps.gsa.shared.p6983ah.C89150g r82, dagger.C68214a r83, com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i r84, com.google.android.apps.gsa.staticplugins.opa.chathead.C108135a r85, com.google.android.apps.gsa.shared.search.Query r86, com.google.android.apps.gsa.shared.util.debug.C91022f r87, dagger.C68214a r88, com.google.android.apps.gsa.staticplugins.opa.util.C113868cw r89, dagger.C68214a r90, com.google.android.apps.gsa.search.core.google.gaia.C86054o r91, com.google.android.apps.gsa.shared.p7003av.C89295c r92, com.google.android.apps.gsa.staticplugins.opa.chatui.C108426ig r93, com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8202d.p8203a.C106318a r94, dagger.C68214a r95, com.google.android.apps.gsa.staticplugins.opa.p8621x.C114524l r96, com.google.android.apps.gsa.assistant.shared.q.m r97, com.google.android.apps.gsa.staticplugins.opa.webview.p8604b.C114215c r98, com.google.android.apps.gsa.assistant.shared.p5830s.C73909r r99, com.google.android.libraries.logging.p2185ve.p2199f.C28421h r100, com.google.android.apps.gsa.shared.p6976ag.p6982e.C89143o r101) {
        /*
            r29 = this;
            r14 = r29
            r15 = r30
            r13 = r31
            r12 = r33
            r11 = r37
            r10 = r38
            r9 = r39
            r8 = r41
            r0 = r44
            r7 = r45
            r6 = r48
            r5 = r52
            r4 = r53
            r3 = r54
            r2 = r58
            r1 = r68
            r13 = r69
            r29.<init>()
            r8 = 0
            r14.f315976l = r8
            r14.f315977m = r8
            r14.f315978n = r8
            java.lang.String r1 = ""
            r14.f315871bG = r1
            r14.f315872bH = r8
            r7 = 1
            r14.f315873bI = r7
            r14.f315874bJ = r8
            r7 = -1
            r14.f315980p = r7
            r14.f315880bP = r8
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eb r7 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.eb
            r7.<init>()
            r14.f315805O = r7
            r7 = 1
            r14.f315906bp = r7
            r14.f315909bs = r7
            r14.f315822aF = r8
            r14.f315910bt = r7
            r14.f315823aG = r7
            r14.f315830aN = r8
            r14.f315831aO = r8
            r14.f315947cj = r8
            r14.f315948ck = r8
            r8 = 0
            r14.f315952co = r8
            com.google.assistant.b.a.a.a.an r17 = com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an.f131726h
            com.google.protobuf.bn r17 = r17.createBuilder()
            r7 = r17
            com.google.assistant.b.a.a.a.am r7 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50637am) r7
            r14.f315836aT = r7
            r7 = 0
            r14.f315842aZ = r7
            r14.f315963cz = r1
            r14.f315912cA = r7
            com.google.common.b.pz r7 = com.google.common.p4522b.C58733pz.f156496a
            r14.f315913cB = r7
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            r14.f315892bb = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r14.f315921cJ = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r14.f315922cK = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r14.f315923cL = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r14.f315924cM = r7
            com.google.android.apps.gsa.nga.shared.x.m r7 = new com.google.android.apps.gsa.nga.shared.x.m
            r7.<init>()
            r14.f315931cT = r7
            com.google.android.apps.gsa.nga.shared.x.m r7 = new com.google.android.apps.gsa.nga.shared.x.m
            r7.<init>()
            r14.f315932cU = r7
            r14.f315936cY = r1
            r14.f315937cZ = r1
            r14.f315964da = r1
            r14.f315965db = r1
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r14.f315895be = r7
            r7 = 0
            r14.f315896bf = r7
            r14.f315897bg = r7
            r14.f315898bh = r7
            r14.f315901bk = r7
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            r14.f315972di = r7
            java.util.ArrayDeque r7 = new java.util.ArrayDeque
            r7.<init>()
            r14.f315903bm = r7
            r14.f315904bn = r8
            r14.f315905bo = r1
            r14.f315981q = r11
            r14.f315982r = r10
            r14.f315973dj = r9
            r14.f315983s = r15
            r1 = r63
            r14.f315987w = r1
            r1 = r40
            r14.f315877bM = r1
            r14.f315864av = r12
            r7 = r34
            r14.f315799I = r7
            r1 = r77
            com.google.android.apps.gsa.nga.shared.ui.c.a r1 = r1.mo75537a(r13)
            r14.f315800J = r1
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.an r1 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.an
            r34.getClass()
            r35.getClass()
            r36.getClass()
            g.a.a r8 = r0.f316271a
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.libraries.f.a r8 = (com.google.android.libraries.p1730f.C21370a) r8
            r8.getClass()
            g.a.a r2 = r0.f316272b
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.apps.gsa.shared.s.a.a r2 = (com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a) r2
            r2.getClass()
            g.a.a r2 = r0.f316273c
            dagger.a.l r2 = (dagger.p5294a.C68226l) r2
            g.a.a r2 = r2.f184585a
            dagger.a r2 = dagger.p5294a.C68219e.m98518a(r2)
            r2.getClass()
            g.a.a r2 = r0.f316274d
            java.lang.Object r2 = r2.mo17428b()
            r19 = r2
            android.app.Activity r19 = (android.app.Activity) r19
            r19.getClass()
            g.a.a r2 = r0.f316275e
            java.lang.Object r2 = r2.mo17428b()
            r20 = r2
            com.google.android.apps.gsa.search.core.i.t r20 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r20
            r20.getClass()
            g.a.a r2 = r0.f316276f
            java.lang.Object r2 = r2.mo17428b()
            r21 = r2
            com.google.android.apps.gsa.staticplugins.nga.ui.b.a r21 = (com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a) r21
            r21.getClass()
            g.a.a r2 = r0.f316277g
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.libraries.gsa.k.g r2 = (com.google.android.libraries.gsa.p1876k.C22871g) r2
            r2.getClass()
            g.a.a r2 = r0.f316278h
            java.lang.Object r2 = r2.mo17428b()
            r22 = r2
            com.google.android.apps.gsa.staticplugins.opa.valyrian.b.b r22 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8597b.C113954b) r22
            r22.getClass()
            g.a.a r2 = r0.f316279i
            java.lang.Object r2 = r2.mo17428b()
            r23 = r2
            com.google.common.base.ax r23 = (com.google.common.base.C58833ax) r23
            r23.getClass()
            g.a.a r2 = r0.f316280j
            java.lang.Object r2 = r2.mo17428b()
            r24 = r2
            com.google.android.apps.gsa.assistant.shared.r.a r24 = (com.google.android.apps.gsa.assistant.shared.p5829r.C73906a) r24
            r24.getClass()
            g.a.a r2 = r0.f316281k
            java.lang.Object r2 = r2.mo17428b()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r2.getClass()
            boolean r25 = r2.booleanValue()
            g.a.a r0 = r0.f316282l
            java.lang.Object r0 = r0.mo17428b()
            r26 = r0
            com.google.android.libraries.logging.ve.f.h r26 = (com.google.android.libraries.logging.p2185ve.p2199f.C28421h) r26
            r0 = r1
            r2 = r68
            r15 = r1
            r1 = r34
            r2 = r29
            r3 = r35
            r4 = r36
            r5 = r8
            r8 = r6
            r6 = r19
            r16 = 0
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r13 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.f315857ao = r15
            r6 = r49
            r14.f315878bN = r6
            r0 = r74
            r14.f315953cp = r0
            r0 = r75
            r14.f315954cq = r0
            r0 = r76
            r14.f315955cr = r0
            r0 = r78
            r14.f315974dk = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r14.f315883bS = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r14.f315884bT = r0
            r0 = r55
            r14.f315849ag = r0
            r0 = r61
            r14.f315804N = r0
            r12 = r72
            r14.f315835aS = r12
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247614kV
            r13 = r38
            boolean r0 = r13.mo79746e(r0)
            if (r0 == 0) goto L_0x01ec
            boolean r0 = r62.v()
            if (r0 == 0) goto L_0x01ec
            r15 = r80
            if (r15 != 0) goto L_0x01ee
            r8 = 1
            goto L_0x01ef
        L_0x01ec:
            r15 = r80
        L_0x01ee:
            r8 = 0
        L_0x01ef:
            r14.f315889bY = r8
            r11 = r79
            if (r11 == 0) goto L_0x01ff
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247420gn
            boolean r0 = r13.mo79746e(r0)
            if (r0 == 0) goto L_0x01ff
            r8 = 1
            goto L_0x0200
        L_0x01ff:
            r8 = 0
        L_0x0200:
            r14.f315956cs = r8
            r0 = r56
            r14.f315885bU = r0
            r0 = r35
            r14.f315886bV = r0
            r0 = r36
            r14.f315887bW = r0
            r5 = r57
            r14.f315888bX = r5
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.w r0 = m188869eD(r69)
            r14.f315821aE = r0
            r10 = 1
            r0.f316465a = r10
            com.google.android.apps.gsa.staticplugins.opa.valyrian.dv r0 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.dv
            r0.<init>(r14)
            r14.f315938ca = r0
            r0 = r64
            r14.f315939cb = r0
            r0 = r65
            r14.f315814X = r0
            r9 = r58
            r14.f315815Y = r9
            r0 = r59
            r14.f315816Z = r0
            androidx.lifecycle.ag r0 = new androidx.lifecycle.ag
            r0.<init>()
            r14.f315861as = r0
            androidx.lifecycle.ag r1 = new androidx.lifecycle.ag
            r1.<init>()
            r14.f315862at = r1
            r14.f315844ab = r11
            r14.f315940cc = r15
            r2 = r85
            r14.f315960cw = r2
            r8 = r82
            r14.f315957ct = r8
            r2 = r83
            r14.f315958cu = r2
            r2 = r86
            r14.f315838aV = r2
            com.google.android.apps.gsa.staticplugins.opa.valyrian.dy r2 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.dy
            r2.<init>(r14)
            r14.f315839aW = r2
            r2 = r95
            r14.f315893bc = r2
            r2 = r96
            r14.f315929cR = r2
            r2 = r99
            r14.f315934cW = r2
            r2 = r101
            r14.f315935cX = r2
            com.google.android.apps.gsa.staticplugins.opa.chatui.az r2 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108228az.UNINITIALIZED
            r1.mo5708l(r2)
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247769nR
            boolean r1 = r13.mo79746e(r1)
            r14.f315843aa = r1
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247211cq
            boolean r1 = r13.mo79746e(r1)
            r14.f315941cd = r1
            com.google.android.apps.gsa.shared.m.h r1 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248280bn
            com.google.common.b.gu r1 = r13.mo79745c(r1)
            com.google.common.b.ij r1 = com.google.common.p4522b.C58528ij.m90006F(r1)
            r14.f315961cx = r1
            com.google.android.apps.gsa.staticplugins.opa.valyrian.bd r1 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.bd
            r1.<init>(r14)
            r2 = r66
            r0.mo5704e(r2, r1)
            r7 = r68
            r14.f315847ae = r7
            r4 = r69
            r14.f315833aQ = r4
            android.content.Intent r0 = r69.getIntent()
            if (r0 == 0) goto L_0x02ae
            android.os.Bundle r0 = r0.getExtras()
            boolean r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142258aF(r0)
            r14.f315832aP = r0
        L_0x02ae:
            boolean r0 = r14.f315832aP
            if (r0 == 0) goto L_0x02c3
            android.view.Window r0 = r69.getWindow()
            android.view.View r0 = r0.getDecorView()
            int r1 = r0.getSystemUiVisibility()
            r1 = r1 & -1025(0xfffffffffffffbff, float:NaN)
            r0.setSystemUiVisibility(r1)
        L_0x02c3:
            r3 = r70
            r14.f315950cm = r3
            r0 = r71
            r14.f315951cn = r0
            r0 = r84
            r14.f315837aU = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r14.f315840aX = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r14.f315841aY = r0
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248288c
            boolean r0 = r13.mo79746e(r0)
            if (r0 == 0) goto L_0x02f0
            com.google.android.apps.gsa.shared.m.h r0 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248271be
            com.google.common.b.gu r0 = r13.mo79745c(r0)
            com.google.common.b.ij r0 = com.google.common.p4522b.C58528ij.m90006F(r0)
            goto L_0x02f2
        L_0x02f0:
            com.google.common.b.pz r0 = com.google.common.p4522b.C58733pz.f156496a
        L_0x02f2:
            r14.f315962cy = r0
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            r14.f315891ba = r0
            r0 = r88
            r14.f315914cC = r0
            r0 = r89
            r14.f315915cD = r0
            r0 = r90
            r14.f315916cE = r0
            r0 = r62
            r14.f315917cF = r0
            r0 = r91
            r14.f315918cG = r0
            r0 = r92
            r14.f315919cH = r0
            r0 = r93
            r14.f315920cI = r0
            com.google.android.apps.gsa.shared.m.f r0 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248289d
            long r0 = r13.mo79743a(r0)
            int r1 = (int) r0
            r14.f315925cN = r1
            com.google.android.apps.gsa.shared.m.h r0 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248193G
            com.google.common.b.gu r0 = r13.mo79745c(r0)
            com.google.common.b.ij r0 = com.google.common.p4522b.C58528ij.m90006F(r0)
            r14.f315926cO = r0
            com.google.android.apps.gsa.shared.m.h r0 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248269bc
            com.google.common.b.gu r0 = r13.mo79749o(r0)
            com.google.common.b.ij r0 = com.google.common.p4522b.C58528ij.m90006F(r0)
            r14.f315927cP = r0
            r2 = r87
            r14.f315928cQ = r2
            r0 = r97
            r14.f315966dc = r0
            r0 = r98
            r14.f315967dd = r0
            r0 = r100
            r14.f315854al = r0
            boolean r0 = r29.mo100907df()
            r14.f315869bE = r0
            com.google.android.apps.gsa.staticplugins.opa.valyrian.cs r0 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.cs
            r1 = r37
            r0.<init>(r1)
            r14.f315875bK = r0
            r0 = r39
            android.view.ContextThemeWrapper r10 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108435ip.m180256a(r0, r4)
            r14.f315968de = r10
            com.google.android.apps.gsa.shared.m.h r0 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248189C
            com.google.common.b.gu r0 = r13.mo79745c(r0)
            com.google.android.apps.gsa.shared.m.h r2 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248191E
            com.google.common.b.gu r2 = r13.mo79745c(r2)
            com.google.android.apps.gsa.shared.m.h r3 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248188B
            com.google.common.b.gu r3 = r13.mo79745c(r3)
            com.google.android.apps.gsa.shared.m.h r4 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248190D
            com.google.common.b.gu r4 = r13.mo79745c(r4)
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248192F
            boolean r5 = r13.mo79746e(r5)
            if (r5 == 0) goto L_0x03ce
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x03ce
            int r5 = r0.size()
            int r6 = r2.size()
            if (r5 != r6) goto L_0x03ce
            int r5 = r0.size()
            int r6 = r3.size()
            if (r5 != r6) goto L_0x03ce
            int r5 = r0.size()
            int r6 = r4.size()
            if (r5 != r6) goto L_0x03ce
            java.util.Random r5 = new java.util.Random
            r5.<init>()
            int r6 = r0.size()
            int r5 = r5.nextInt(r6)
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            r14.f315936cY = r0
            java.lang.Object r0 = r2.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            r14.f315937cZ = r0
            java.lang.Object r0 = r3.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            r14.f315964da = r0
            java.lang.Object r0 = r4.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            r14.f315965db = r0
            goto L_0x040d
        L_0x03ce:
            boolean r0 = r39.mo93970a()
            if (r0 == 0) goto L_0x03ed
            java.lang.String r0 = m188850dO(r10)
            r14.f315936cY = r0
            java.lang.String r0 = m188851dP(r10)
            r14.f315937cZ = r0
            java.lang.String r0 = m188850dO(r10)
            r14.f315964da = r0
            java.lang.String r0 = m188851dP(r10)
            r14.f315965db = r0
            goto L_0x040d
        L_0x03ed:
            com.google.android.apps.gsa.shared.m.h r0 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248308w
            java.lang.String r0 = r13.mo79758x(r0)
            r14.f315936cY = r0
            com.google.android.apps.gsa.shared.m.h r0 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248311z
            java.lang.String r0 = r13.mo79758x(r0)
            r14.f315937cZ = r0
            com.google.android.apps.gsa.shared.m.h r0 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248307v
            java.lang.String r0 = r13.mo79758x(r0)
            r14.f315964da = r0
            com.google.android.apps.gsa.shared.m.h r0 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248310y
            java.lang.String r0 = r13.mo79758x(r0)
            r14.f315965db = r0
        L_0x040d:
            java.util.List r0 = r14.f315895be
            android.content.res.Resources r2 = r37.getResources()
            r3 = 2132090634(0x7f151f0a, float:1.9821614E38)
            java.lang.String r2 = r2.getString(r3)
            r0.add(r2)
            java.util.List r0 = r14.f315895be
            android.content.res.Resources r2 = r37.getResources()
            r3 = 2132090635(0x7f151f0b, float:1.9821616E38)
            java.lang.String r2 = r2.getString(r3)
            r0.add(r2)
            java.util.List r0 = r14.f315895be
            android.content.res.Resources r2 = r37.getResources()
            r3 = 2132090636(0x7f151f0c, float:1.9821618E38)
            java.lang.String r2 = r2.getString(r3)
            r0.add(r2)
            java.util.List r0 = r14.f315895be
            android.content.res.Resources r2 = r37.getResources()
            r3 = 2132090637(0x7f151f0d, float:1.982162E38)
            java.lang.String r2 = r2.getString(r3)
            r0.add(r2)
            com.google.android.apps.gsa.shared.m.f r0 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248227aN
            long r2 = r13.mo79743a(r0)
            int r0 = (int) r2
            float r0 = (float) r0
            float r0 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r0, r1)
            r14.f315930cS = r0
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r10)
            r14.f315876bL = r0
            r2 = 2131626237(0x7f0e08fd, float:1.8879705E38)
            r10 = 0
            android.view.View r2 = r0.inflate(r2, r10)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r14.f315984t = r2
            r2.getClass()
            com.google.android.libraries.logging.j r3 = new com.google.android.libraries.logging.j
            r4 = 29382(0x72c6, float:4.1173E-41)
            r3.<init>(r4)
            com.google.android.libraries.logging.C28295m.m52919e(r2, r3)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.el r3 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.el
            com.google.android.apps.gsa.staticplugins.opa.valyrian.bp r4 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.bp
            r4.<init>(r14, r13)
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r5 = r14.f315864av
            r61 = r3
            r62 = r0
            r63 = r37
            r64 = r4
            r65 = r5
            r66 = r39
            r61.<init>(r62, r63, r64, r65, r66)
            r14.f315801K = r3
            android.view.View r4 = r3.f316068a
            android.animation.Animator r4 = r14.m188844dI(r4)
            r14.f315803M = r4
            android.view.View r4 = r3.f316068a
            android.animation.Animator r4 = r14.m188845dJ(r4)
            r14.f315802L = r4
            r4 = 2131436548(0x7f0b2404, float:1.849497E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            android.view.View r3 = r3.f316068a
            r4.addView(r3)
            boolean r3 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f.m188690a(r38)
            r6 = 8
            if (r3 == 0) goto L_0x04c4
            r3 = 2131434089(0x7f0b1a69, float:1.8489982E38)
            android.view.View r3 = r2.findViewById(r3)
            r3.setVisibility(r6)
        L_0x04c4:
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r3 = r14.f315864av
            r5 = r30
            r4 = r47
            com.google.android.apps.gsa.staticplugins.opa.chatui.id r4 = r4.mo96870a(r3, r5, r10)
            r14.f315850ah = r4
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ak r3 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ak
            r3.<init>(r14)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.al r6 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.al
            r6.<init>(r5)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.am r10 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.am
            r10.<init>(r14)
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r7 = r14.f315864av
            boolean r27 = r29.mo100907df()
            r19 = r51
            r20 = r3
            r21 = r6
            r22 = r10
            r23 = r7
            r24 = r4
            r25 = r32
            r26 = r34
            com.google.android.apps.gsa.staticplugins.opa.valyrian.aa r3 = r19.mo100803a(r20, r21, r22, r23, r24, r25, r26, r27)
            r14.f315853ak = r3
            r3 = 2131434086(0x7f0b1a66, float:1.8489976E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r14.f315985u = r3
            r29.mo101004bP()
            boolean r6 = r30.mo96407t()
            if (r6 == 0) goto L_0x052e
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 30
            if (r6 < r7) goto L_0x052e
            com.google.android.apps.gsa.staticplugins.opa.valyrian.an r6 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.an
            r6.<init>(r14, r5)
            r2.setOnApplyWindowInsetsListener(r6)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ao r6 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ao
            r6.<init>(r14)
            r3.setOnApplyWindowInsetsListener(r6)
            android.widget.FrameLayout r6 = r29.mo100996aZ()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ap r7 = com.google.android.apps.gsa.staticplugins.opa.valyrian.C113941ap.f315563a
            r6.setOnApplyWindowInsetsListener(r7)
        L_0x052e:
            r10 = 1
            r3.setClickable(r10)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.de r6 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.de
            r6.<init>(r14)
            r3.addOnAttachStateChangeListener(r6)
            if (r3 == 0) goto L_0x0562
            android.view.ViewTreeObserver r6 = r3.getViewTreeObserver()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.dn r7 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.dn
            r61 = r7
            r62 = r29
            r63 = r38
            r64 = r60
            r65 = r69
            r66 = r79
            r67 = r37
            r61.<init>(r62, r63, r64, r65, r66, r67)
            r6.addOnGlobalLayoutListener(r7)
            android.view.ViewTreeObserver r6 = r3.getViewTreeObserver()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.do r7 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.do
            r7.<init>(r14)
            r6.addOnGlobalLayoutListener(r7)
        L_0x0562:
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r6 = r14.f315864av
            com.google.android.apps.gsa.staticplugins.opa.chatui.hc r7 = new com.google.android.apps.gsa.staticplugins.opa.chatui.hc
            r6.getClass()
            r30.getClass()
            r10 = r48
            r36 = r4
            g.a.a r4 = r10.f301501a
            java.lang.Object r4 = r4.mo17428b()
            android.app.Activity r4 = (android.app.Activity) r4
            r4.getClass()
            g.a.a r5 = r10.f301502b
            java.lang.Object r5 = r5.mo17428b()
            com.google.android.apps.gsa.search.core.i.t r5 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r5
            r5.getClass()
            g.a.a r8 = r10.f301503c
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.apps.gsa.staticplugins.nga.ui.b.a r8 = (com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a) r8
            r8.getClass()
            g.a.a r9 = r10.f301504d
            java.lang.Object r9 = r9.mo17428b()
            com.google.android.libraries.gsa.k.g r9 = (com.google.android.libraries.gsa.p1876k.C22871g) r9
            r9.getClass()
            g.a.a r10 = r10.f301505e
            java.lang.Object r10 = r10.mo17428b()
            com.google.common.base.ax r10 = (com.google.common.base.C58833ax) r10
            r10.getClass()
            r59 = r7
            r60 = r6
            r61 = r30
            r62 = r4
            r63 = r5
            r64 = r8
            r65 = r9
            r66 = r10
            r59.<init>(r60, r61, r62, r63, r64, r65, r66)
            r14.f315851ai = r7
            com.google.android.apps.gsa.staticplugins.opa.chatui.he r4 = new com.google.android.apps.gsa.staticplugins.opa.chatui.he
            r4.<init>(r7)
            r14.f315852aj = r4
            r4 = r33
            r5 = r42
            r6 = r43
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r4 = r14.m188848dM(r6, r5, r4)
            r14.f315859aq = r4
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r4 = r14.f315859aq
            com.google.android.apps.gsa.staticplugins.opa.valyrian.dp r5 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.dp
            r5.<init>(r14, r13)
            r4.mo101118D(r5)
            r4 = 2131434064(0x7f0b1a50, float:1.8489931E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            com.google.android.apps.gsa.staticplugins.opa.valyrian.dq r4 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.dq
            r4.<init>(r2)
            r2.addOnAttachStateChangeListener(r4)
            androidx.core.j.o r2 = new androidx.core.j.o
            com.google.android.apps.gsa.staticplugins.opa.valyrian.dz r4 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.dz
            r4.<init>(r14)
            r10 = 0
            r2.<init>(r1, r4, r10)
            r14.f315949cl = r2
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ec r9 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ec
            r9.<init>(r2)
            r2 = 2131627171(0x7f0e0ca3, float:1.8881599E38)
            android.view.View r0 = r0.inflate(r2, r10)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianViewPager r0 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.ValyrianViewPager) r0
            r14.f315855am = r0
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r8 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianViewPager r2 = r14.f315855am
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r4 = r14.f315859aq
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.an r5 = r14.f315857ao
            boolean r7 = r14.f315832aP
            boolean r16 = r29.m188897ex()
            com.google.android.apps.gsa.staticplugins.opa.util.co r6 = new com.google.android.apps.gsa.staticplugins.opa.util.co
            r6.<init>(r3)
            r0 = r8
            r3 = r1
            r1 = r37
            r12 = r87
            r15 = r70
            r12 = r3
            r3 = r4
            r12 = r36
            r4 = r5
            r12 = r30
            r5 = r57
            r17 = r6
            r6 = r49
            r18 = r7
            r7 = r38
            r12 = r8
            r8 = r18
            r28 = r9
            r9 = r79
            r13 = 1
            r10 = r16
            r11 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r14.f315856an = r12
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianRecyclerView r0 = r12.f316351m
            r1 = 3
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ax r1 = r14.m188870eE(r1)
            r0.addOnScrollListener(r1)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r14.f315856an
            android.support.v7.widget.RecyclerView r0 = r0.f316352n
            r1 = 2
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ax r1 = r14.m188870eE(r1)
            r0.addOnScrollListener(r1)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r0 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.UNKNOWN
            com.google.android.apps.gsa.search.shared.service.b.um r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
            com.google.assistant.s.a.j r0 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN
            com.google.assistant.s.a.j r0 = r15.f318449b
            int r0 = r0.ordinal()
            if (r0 == r13) goto L_0x066c
            r1 = r38
            r2 = 1
            goto L_0x0680
        L_0x066c:
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247287eM
            r1 = r38
            r2 = 1
            boolean r0 = r1.mo79746e(r0)
            if (r0 == 0) goto L_0x0680
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247159br
            boolean r0 = r1.mo79746e(r0)
            if (r0 == 0) goto L_0x0680
            goto L_0x06e9
        L_0x0680:
            r0 = 4
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ax r0 = r14.m188870eE(r0)
            boolean r3 = r50.mo56113h()
            if (r3 == 0) goto L_0x06e9
            android.content.Intent r3 = r69.getIntent()
            android.os.Bundle r4 = r3.getExtras()
            java.lang.String r4 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142246U(r4)
            if (r4 == 0) goto L_0x069b
            r15.f318451d = r4
        L_0x069b:
            java.lang.Object r4 = r50.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.i r4 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114755i) r4
            if (r3 == 0) goto L_0x06b1
            android.os.Bundle r3 = r3.getExtras()
            boolean r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142255aC(r3)
            if (r3 == 0) goto L_0x06b1
            r3 = r30
            r8 = 1
            goto L_0x06b4
        L_0x06b1:
            r3 = r30
            r8 = 0
        L_0x06b4:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.h r0 = r4.mo101437a(r3, r8, r0)
            r14.f315820aD = r0
            com.google.android.apps.gsa.staticplugins.opa.valyrian.cn r4 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.cn
            r4.<init>(r14)
            r0.mo101431u(r4)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r14.f315856an
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.h r4 = r14.f315820aD
            android.view.ViewGroup r4 = r4.mo101411a()
            r0.f316353o = r4
            r0.mo101169o()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r14.f315856an
            r0.mo9178n()
            com.google.android.apps.gsa.search.core.i.t r0 = r14.f315982r
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247346fS
            boolean r0 = r0.mo79746e(r4)
            if (r0 == 0) goto L_0x06eb
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.h r0 = r14.f315820aD
            r0.getClass()
            r4 = r28
            r0.mo101421k(r4)
            goto L_0x06ed
        L_0x06e9:
            r3 = r30
        L_0x06eb:
            r4 = r28
        L_0x06ed:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r14.f315856an
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianRecyclerView r5 = r0.f316351m
            r6 = r36
            r6.f301564k = r5
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.an r5 = r14.f315857ao
            android.support.v7.widget.RecyclerView r0 = r0.f316352n
            com.google.android.apps.gsa.staticplugins.opa.valyrian.a.b r6 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.a.b
            r5.getClass()
            r0.getClass()
            r7 = r45
            g.a.a r8 = r7.f315483a
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.libraries.gsa.k.g r8 = (com.google.android.libraries.gsa.p1876k.C22871g) r8
            r8.getClass()
            g.a.a r7 = r7.f315484b
            java.lang.Object r7 = r7.mo17428b()
            com.google.android.apps.gsa.staticplugins.opa.chatui.dt r7 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108303dt) r7
            r7.getClass()
            r6.<init>(r5, r0, r8, r7)
            r14.f315863au = r6
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianViewPager r0 = r14.f315855am
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r5 = r14.f315856an
            androidx.viewpager.widget.a r6 = r0.f316158e
            if (r6 == 0) goto L_0x0778
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bg r7 = r0.f316163j
            android.database.DataSetObservable r6 = r6.f13843a
            r6.unregisterObserver(r7)
            androidx.viewpager.widget.a r6 = r0.f316158e
            r8 = 0
        L_0x0730:
            java.util.ArrayList r6 = r0.f316157d
            int r6 = r6.size()
            if (r8 >= r6) goto L_0x074e
            java.util.ArrayList r6 = r0.f316157d
            java.lang.Object r6 = r6.get(r8)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r6 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114126bd) r6
            androidx.viewpager.widget.a r7 = r0.f316158e
            int r7 = r6.f316325b
            java.lang.Object r6 = r6.f316324a
            android.view.View r6 = (android.view.View) r6
            r0.removeView(r6)
            int r8 = r8 + 1
            goto L_0x0730
        L_0x074e:
            androidx.viewpager.widget.a r6 = r0.f316158e
            java.util.ArrayList r6 = r0.f316157d
            r6.clear()
            r8 = 0
        L_0x0756:
            int r6 = r0.getChildCount()
            if (r8 >= r6) goto L_0x0771
            android.view.View r6 = r0.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.be r6 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114127be) r6
            boolean r6 = r6.f316329a
            if (r6 != 0) goto L_0x076f
            r0.removeViewAt(r8)
            int r8 = r8 + -1
        L_0x076f:
            int r8 = r8 + r2
            goto L_0x0756
        L_0x0771:
            r6 = 0
            r0.f316159f = r6
            r0.scrollTo(r6, r6)
            goto L_0x0779
        L_0x0778:
            r6 = 0
        L_0x0779:
            r0.f316158e = r5
            r0.f316155b = r6
            if (r5 == 0) goto L_0x07c5
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bg r5 = r0.f316163j
            if (r5 != 0) goto L_0x078a
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bg r5 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bg
            r5.<init>(r0)
            r0.f316163j = r5
        L_0x078a:
            androidx.viewpager.widget.a r5 = r0.f316158e
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bg r7 = r0.f316163j
            android.database.DataSetObservable r5 = r5.f13843a
            r5.registerObserver(r7)
            r0.f316165l = r6
            boolean r5 = r0.f316167n
            r0.f316167n = r2
            androidx.viewpager.widget.a r7 = r0.f316158e
            int r7 = r7.mo9175k()
            r0.f316155b = r7
            int r7 = r0.f316160g
            if (r7 < 0) goto L_0x07b7
            androidx.viewpager.widget.a r5 = r0.f316158e
            android.os.Parcelable r5 = r0.f316161h
            java.lang.ClassLoader r5 = r0.f316162i
            r0.mo101092i(r7, r6, r2, r6)
            r7 = -1
            r0.f316160g = r7
            r8 = 0
            r0.f316161h = r8
            r0.f316162i = r8
            goto L_0x07c7
        L_0x07b7:
            r7 = -1
            r8 = 0
            if (r5 != 0) goto L_0x07c1
            int r5 = r0.f316159f
            r0.mo101085f(r5)
            goto L_0x07c7
        L_0x07c1:
            r0.requestLayout()
            goto L_0x07c7
        L_0x07c5:
            r7 = -1
            r8 = 0
        L_0x07c7:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianViewPager r0 = r14.f315855am
            com.google.android.apps.gsa.shared.m.f r5 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247466hg
            long r9 = r1.mo79743a(r5)
            int r5 = (int) r9
            float r5 = (float) r5
            android.content.Context r9 = r0.getContext()
            android.content.res.Resources r9 = r9.getResources()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r5 = r5 * r9
            int r5 = (int) r5
            r0.f316166m = r5
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r14.f315856an
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianRecyclerView r0 = r0.f316351m
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ec r5 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ec
            androidx.core.j.o r9 = new androidx.core.j.o
            com.google.android.apps.gsa.staticplugins.opa.valyrian.dw r10 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.dw
            r10.<init>(r14)
            r11 = r37
            r9.<init>(r11, r10, r8)
            r5.<init>(r9)
            java.util.ArrayList r0 = r0.mOnItemTouchListeners
            r0.add(r5)
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247346fS
            boolean r0 = r1.mo79746e(r0)
            if (r0 == 0) goto L_0x0818
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r14.f315856an
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianRecyclerView r0 = r0.f316351m
            java.util.ArrayList r0 = r0.mOnItemTouchListeners
            r0.add(r4)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r14.f315856an
            android.support.v7.widget.RecyclerView r0 = r0.f316352n
            java.util.ArrayList r0 = r0.mOnItemTouchListeners
            r0.add(r4)
        L_0x0818:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.dr r0 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.dr
            r59 = r0
            r60 = r29
            r61 = r38
            r62 = r72
            r63 = r32
            r64 = r70
            r65 = r68
            r66 = r79
            r59.<init>(r60, r61, r62, r63, r64, r65, r66)
            r14.f315860ar = r0
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianViewPager r4 = r14.f315855am
            r4.f316168o = r0
            com.google.android.apps.gsa.staticplugins.opa.valyrian.aa r0 = r14.f315853ak
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ds r4 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ds
            r4.<init>(r14)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.by r5 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.by
            r5.<init>(r14)
            boolean r9 = r29.m188897ex()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.av r10 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.av
            r32.getClass()
            r0.getClass()
            r12 = r53
            g.a.a r13 = r12.f316313a
            java.lang.Object r13 = r13.mo17428b()
            android.content.Context r13 = (android.content.Context) r13
            r13.getClass()
            g.a.a r15 = r12.f316314b
            java.lang.Object r15 = r15.mo17428b()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            r15.getClass()
            boolean r15 = r15.booleanValue()
            g.a.a r12 = r12.f316315c
            java.lang.Object r12 = r12.mo17428b()
            com.google.android.apps.gsa.search.core.i.t r12 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r12
            r12.getClass()
            r59 = r10
            r60 = r32
            r61 = r0
            r62 = r4
            r63 = r5
            r64 = r9
            r65 = r13
            r66 = r15
            r67 = r12
            r59.<init>(r60, r61, r62, r63, r64, r65, r66, r67)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.bz r0 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.bz
            r0.<init>(r14)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ca r4 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ca
            r4.<init>(r14, r11)
            boolean r5 = r14.f315832aP
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ap r9 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ap
            r12 = r54
            g.a.a r13 = r12.f316289a
            java.lang.Object r13 = r13.mo17428b()
            android.content.Context r13 = (android.content.Context) r13
            r13.getClass()
            g.a.a r15 = r12.f316290b
            java.lang.Object r15 = r15.mo17428b()
            com.google.android.apps.gsa.search.core.i.t r15 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r15
            r15.getClass()
            g.a.a r15 = r12.f316291c
            java.lang.Object r15 = r15.mo17428b()
            com.google.android.apps.gsa.staticplugins.nga.ui.b.a r15 = (com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a) r15
            r15.getClass()
            g.a.a r12 = r12.f316292d
            java.lang.Object r12 = r12.mo17428b()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            r12.getClass()
            boolean r12 = r12.booleanValue()
            r59 = r9
            r60 = r0
            r61 = r4
            r62 = r5
            r63 = r13
            r64 = r15
            r65 = r12
            r59.<init>(r60, r61, r62, r63, r64, r65)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r14.f315856an
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianRecyclerView r0 = r0.f316351m
            r0.addItemDecoration$ar$ds(r10)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r14.f315856an
            android.support.v7.widget.RecyclerView r0 = r0.f316352n
            r0.addItemDecoration$ar$ds(r10)
            boolean r0 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f.m188692c(r38)
            if (r0 == 0) goto L_0x08fa
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r14.f315856an
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianRecyclerView r0 = r0.f316351m
            r0.addItemDecoration$ar$ds(r9)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r14.f315856an
            android.support.v7.widget.RecyclerView r0 = r0.f316352n
            r0.addItemDecoration$ar$ds(r9)
        L_0x08fa:
            android.view.ViewGroup r0 = r14.f315984t
            r4 = 2131436854(0x7f0b2536, float:1.849559E38)
            android.view.View r0 = r0.findViewById(r4)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r14.f315986v = r0
            if (r79 == 0) goto L_0x0989
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianViewPager r4 = r14.f315855am
            r4.f316168o = r8
            r14.m188873eH(r9, r10)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianDynamicResponseLayerView r4 = r14.f315865aw
            r4.getClass()
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            int r9 = r29.m188843dH()
            r5.<init>(r7, r9)
            r0.addView(r4, r5)
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247786ni
            boolean r4 = r1.mo79746e(r4)
            if (r4 == 0) goto L_0x0980
            android.view.ViewGroup r4 = r14.f315984t
            android.widget.FrameLayout r5 = r14.f315985u
            int r9 = r14.mo100986aI(r6)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.t r10 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.t
            r4.getClass()
            r5.getClass()
            r12 = r81
            g.a.a r13 = r12.f316460a
            java.lang.Object r13 = r13.mo17428b()
            android.content.Context r13 = (android.content.Context) r13
            r13.getClass()
            g.a.a r15 = r12.f316461b
            java.lang.Object r15 = r15.mo17428b()
            com.google.android.apps.gsa.search.core.i.t r15 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r15
            r15.getClass()
            g.a.a r6 = r12.f316462c
            dagger.a.g r6 = (dagger.p5294a.C68221g) r6
            java.lang.Object r6 = r6.f184583a
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.a r6 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113982a) r6
            r6.getClass()
            g.a.a r12 = r12.f316463d
            dagger.a.l r12 = (dagger.p5294a.C68226l) r12
            g.a.a r12 = r12.f184585a
            dagger.a r12 = dagger.p5294a.C68219e.m98518a(r12)
            r12.getClass()
            r59 = r10
            r60 = r4
            r61 = r5
            r62 = r29
            r63 = r9
            r64 = r13
            r65 = r15
            r66 = r6
            r67 = r12
            r59.<init>(r60, r61, r62, r63, r64, r65, r66, r67)
            r14.f315848af = r10
        L_0x0980:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.cb r4 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.cb
            r4.<init>(r14)
            r0.addOnLayoutChangeListener(r4)
            goto L_0x0993
        L_0x0989:
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r7, r7)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianViewPager r5 = r14.f315855am
            r0.addView(r5, r4)
        L_0x0993:
            r4 = r94
            com.google.android.apps.gsa.nga.shared.x.g r5 = r4.f296619a
            com.google.android.apps.gsa.nga.shared.x.k r5 = (com.google.android.apps.gsa.nga.shared.p6417x.C83361k) r5
            java.util.concurrent.atomic.AtomicReference r5 = r5.f227199b
            java.lang.Object r5 = r5.get()
            com.google.android.apps.gsa.nga.api.a.bf r5 = (com.google.android.apps.gsa.nga.api.a.bf) r5
            int r5 = r14.mo100991aO(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.google.android.apps.gsa.nga.shared.x.k r6 = new com.google.android.apps.gsa.nga.shared.x.k
            java.lang.Class<androidx.annotation.b> r9 = androidx.annotation.C0826b.class
            r6.<init>(r5, r9)
            r14.f315933cV = r6
            boolean r5 = r29.m188897ex()
            if (r5 == 0) goto L_0x09e3
            com.google.android.apps.gsa.nga.shared.x.m r5 = r14.f315932cU
            com.google.android.apps.gsa.nga.shared.x.g r4 = r4.f296619a
            com.google.android.apps.gsa.staticplugins.opa.valyrian.aq r9 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.aq
            r9.<init>(r14)
            com.google.android.apps.gsa.nga.shared.x.h r4 = com.google.android.apps.gsa.nga.shared.p6417x.C83349aj.m132658m(r4, r9)
            p3186j$.util.Objects.requireNonNull(r6)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ar r9 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ar
            r9.<init>(r6)
            com.google.android.apps.gsa.nga.shared.x.s r10 = new com.google.android.apps.gsa.nga.shared.x.s
            java.lang.String r12 = "initialPlateHeightReceiver"
            r13 = r58
            r10.<init>(r13, r12, r9)
            r5.mo76662b(r4, r10)
            com.google.android.apps.gsa.nga.shared.x.m r4 = r14.f315931cT
            com.google.android.apps.gsa.staticplugins.opa.valyrian.as r5 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.as
            r5.<init>(r14)
            r4.mo76663c(r6, r5)
        L_0x09e3:
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r4 = r14.f315864av
            int r4 = r4.mo96647T()
            r14.m188878ee(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r5 = -2
            r4.<init>(r7, r5)
            android.view.LayoutInflater r5 = r14.f315876bL
            r6 = 2131627175(0x7f0e0ca7, float:1.8881607E38)
            android.view.View r5 = r5.inflate(r6, r8)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            boolean r6 = r14.f315832aP
            r6 = r6 ^ r2
            r5.setClickable(r6)
            r6 = 2131429226(0x7f0b076a, float:1.8480119E38)
            android.view.View r7 = r5.findViewById(r6)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.bh r9 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.bh
            r9.<init>(r14)
            r7.setOnClickListener(r9)
            com.google.android.apps.gsa.shared.av.c r7 = r14.f315919cH
            dagger.a r9 = r14.f315914cC
            java.lang.Object r9 = r9.mo27525b()
            android.content.SharedPreferences r9 = (android.content.SharedPreferences) r9
            com.google.android.apps.gsa.search.core.google.gaia.o r10 = r14.f315918cG
            java.lang.String r10 = r10.mo79659F()
            com.google.android.apps.gsa.assistant.shared.bm r12 = r14.f315917cF
            java.lang.String r12 = r12.b()
            boolean r7 = r7.mo83233a(r9, r10, r12)
            r9 = 2131437274(0x7f0b26da, float:1.8496442E38)
            if (r7 == 0) goto L_0x0a39
            android.view.View r7 = r5.findViewById(r9)
            r10 = 0
            r7.setVisibility(r10)
        L_0x0a39:
            com.google.android.apps.gsa.search.core.i.t r7 = r14.f315982r
            boolean r7 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f.m188690a(r7)
            if (r7 == 0) goto L_0x0ace
            r7 = 2131435002(0x7f0b1dfa, float:1.8491834E38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r10 = 2131435706(0x7f0b20ba, float:1.8493262E38)
            android.view.View r10 = r5.findViewById(r10)
            com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc r10 = (com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc) r10
            com.google.android.apps.gsa.search.core.i.t r12 = r14.f315982r
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90059dk.f249130bn
            boolean r12 = r12.mo79746e(r13)
            if (r12 == 0) goto L_0x0a84
            android.app.Activity r12 = r14.f315833aQ
            com.google.common.base.ax r13 = r14.f315888bX
            com.google.android.apps.gsa.staticplugins.opa.valyrian.bi r15 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.bi
            r15.<init>(r14)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.b.b r8 = r14.f315885bU
            com.google.android.apps.gsa.shared.util.t.g r2 = r14.f315799I
            com.google.android.apps.gsa.search.core.i.t r9 = r14.f315982r
            com.google.android.libraries.logging.ve.f.h r6 = r14.f315854al
            r53 = r7
            r54 = r10
            r55 = r12
            r56 = r13
            r57 = r15
            r58 = r8
            r59 = r2
            r60 = r9
            r61 = r6
            com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d.C114034q.m188818n(r53, r54, r55, r56, r57, r58, r59, r60, r61)
            goto L_0x0aad
        L_0x0a84:
            android.app.Activity r2 = r14.f315833aQ
            com.google.common.base.cr r6 = r14.f315886bV
            java.lang.Object r6 = r6.mo6453a()
            android.widget.PopupMenu$OnMenuItemClickListener r6 = (android.widget.PopupMenu.OnMenuItemClickListener) r6
            com.google.common.base.cr r8 = r14.f315887bW
            java.lang.Object r8 = r8.mo6453a()
            com.google.android.apps.gsa.staticplugins.opa.util.ak r8 = (com.google.android.apps.gsa.staticplugins.opa.util.C113768ak) r8
            com.google.common.base.ax r9 = r14.f315888bX
            com.google.android.apps.gsa.assistant.shared.r.a r10 = r14.f315955cr
            com.google.android.apps.gsa.shared.util.t.g r12 = r14.f315799I
            r53 = r2
            r54 = r7
            r55 = r6
            r56 = r8
            r57 = r9
            r58 = r10
            r59 = r12
            com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d.C114034q.m188813i(r53, r54, r55, r56, r57, r58, r59)
        L_0x0aad:
            com.google.common.base.ax r2 = r14.f315888bX
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x0ac9
            com.google.common.base.ax r2 = r14.f315888bX
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.ah.l r2 = (com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106171l) r2
            com.google.android.apps.gsa.search.core.aj.aa r2 = r2.f296304b
            android.app.KeyguardManager r2 = r2.f230023b
            boolean r2 = r2.isDeviceLocked()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r2 != 0) goto L_0x0ace
        L_0x0ac9:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.b.b r2 = r14.f315885bU
            com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d.C114034q.m188819o(r7, r2)
        L_0x0ace:
            r14.f315988x = r5
            r2 = 2131436861(0x7f0b253d, float:1.8495604E38)
            android.view.View r2 = r5.findViewById(r2)
            r14.f315834aR = r2
            r6 = 2131436856(0x7f0b2538, float:1.8495594E38)
            android.view.View r6 = r5.findViewById(r6)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r14.f315879bO = r6
            r7 = 2131434087(0x7f0b1a67, float:1.8489978E38)
            android.view.View r7 = r5.findViewById(r7)
            r14.f315808R = r7
            r8 = 2131429226(0x7f0b076a, float:1.8480119E38)
            android.view.View r8 = r5.findViewById(r8)
            r14.f315809S = r8
            boolean r8 = r14.f315940cc
            if (r8 == 0) goto L_0x0b00
            boolean r8 = r14.f315832aP
            if (r8 != 0) goto L_0x0b00
            r8 = 0
            goto L_0x0b07
        L_0x0b00:
            r8 = 2131437266(0x7f0b26d2, float:1.8496426E38)
            android.view.View r8 = r5.findViewById(r8)
        L_0x0b07:
            r14.f315810T = r8
            r9 = 2131437267(0x7f0b26d3, float:1.8496428E38)
            android.view.View r9 = r5.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r10 = r14.f315864av
            int r10 = r10.mo96648U()
            r9.setImageResource(r10)
            r9 = 2131437274(0x7f0b26da, float:1.8496442E38)
            android.view.View r9 = r5.findViewById(r9)
            r14.f315811U = r9
            r9 = 2131435003(0x7f0b1dfb, float:1.8491836E38)
            android.view.View r9 = r5.findViewById(r9)
            r14.f315812V = r9
            android.animation.Animator r10 = r14.m188844dI(r5)
            r14.f315990z = r10
            android.animation.Animator r10 = r14.m188845dJ(r5)
            r14.f315989y = r10
            r10 = 0
            r0.addView(r5, r10, r4)
            boolean r0 = r14.f315832aP
            if (r0 == 0) goto L_0x0bc7
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            android.content.res.Resources r4 = r37.getResources()
            r10 = 2131167407(0x7f0708af, float:1.7949087E38)
            int r4 = r4.getDimensionPixelSize(r10)
            r0.height = r4
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.content.res.Resources r4 = r37.getResources()
            int r4 = r4.getDimensionPixelSize(r10)
            r0.height = r4
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            android.content.res.Resources r4 = r37.getResources()
            r6 = 2131167403(0x7f0708ab, float:1.7949079E38)
            int r4 = r4.getDimensionPixelSize(r6)
            r0.height = r4
            int r0 = r7.getPaddingLeft()
            android.content.res.Resources r4 = r37.getResources()
            r6 = 2131167405(0x7f0708ad, float:1.7949083E38)
            int r4 = r4.getDimensionPixelSize(r6)
            int r6 = r7.getPaddingRight()
            android.content.res.Resources r10 = r37.getResources()
            r12 = 2131167404(0x7f0708ac, float:1.794908E38)
            int r10 = r10.getDimensionPixelSize(r12)
            r7.setPadding(r0, r4, r6, r10)
            if (r8 == 0) goto L_0x0ba5
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            android.content.res.Resources r4 = r37.getResources()
            r6 = 2131167408(0x7f0708b0, float:1.7949089E38)
            int r4 = r4.getDimensionPixelSize(r6)
            r0.height = r4
        L_0x0ba5:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            android.content.res.Resources r4 = r37.getResources()
            r6 = 2131167406(0x7f0708ae, float:1.7949085E38)
            int r4 = r4.getDimensionPixelSize(r6)
            r0.height = r4
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            android.content.res.Resources r2 = r37.getResources()
            r4 = 2131167402(0x7f0708aa, float:1.7949077E38)
            int r2 = r2.getDimensionPixelSize(r4)
            r0.height = r2
        L_0x0bc7:
            boolean r0 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f.m188692c(r38)
            if (r0 == 0) goto L_0x0bd2
            r0 = 8
            r7.setVisibility(r0)
        L_0x0bd2:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r14.f315856an
            r0.getClass()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.h r2 = r14.f315820aD
            r4 = r68
            r4.f316243c = r0
            r4.f316244d = r2
            com.google.android.apps.gsa.staticplugins.opa.valyrian.el r0 = r14.f315801K
            android.view.View r0 = r0.f316068a
            r4.f316241a = r5
            r4.f316242b = r0
            r0 = 1
            com.google.android.apps.gsa.search.shared.service.b.um[] r2 = new com.google.android.apps.gsa.search.shared.service.p6935b.C88244um[r0]
            com.google.android.apps.gsa.search.shared.service.b.um r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
            r5 = 0
            r2[r5] = r4
            r4 = r41
            r4.mo96220c(r14, r2)
            com.google.android.apps.gsa.search.shared.service.b.um[] r2 = new com.google.android.apps.gsa.search.shared.service.p6935b.C88244um[r0]
            com.google.android.apps.gsa.search.shared.service.b.um r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.CONVERSATION_PARAMS_RECEIVED
            r2[r5] = r6
            r4.mo96220c(r14, r2)
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90045cx.f248752a
            boolean r2 = r1.mo79746e(r2)
            if (r2 == 0) goto L_0x0c0e
            com.google.android.apps.gsa.search.shared.service.b.um[] r2 = new com.google.android.apps.gsa.search.shared.service.p6935b.C88244um[r0]
            com.google.android.apps.gsa.search.shared.service.b.um r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ASSISTANT_REQUEST_ID
            r2[r5] = r6
            r4.mo96220c(r14, r2)
        L_0x0c0e:
            com.google.android.apps.gsa.search.shared.service.b.um[] r2 = new com.google.android.apps.gsa.search.shared.service.p6935b.C88244um[r0]
            com.google.android.apps.gsa.search.shared.service.b.um r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.OPA_DELETE_HISTORY_ENTRIES
            r2[r5] = r6
            r4.mo96220c(r14, r2)
            com.google.android.apps.gsa.search.shared.service.b.um[] r2 = new com.google.android.apps.gsa.search.shared.service.p6935b.C88244um[r0]
            com.google.android.apps.gsa.search.shared.service.b.um r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.NOTIFY_ASSISTANT_CONVERSATION_ONGOING
            r2[r5] = r6
            r4.mo96220c(r14, r2)
            com.google.android.apps.gsa.search.shared.service.b.um[] r2 = new com.google.android.apps.gsa.search.shared.service.p6935b.C88244um[r0]
            com.google.android.apps.gsa.search.shared.service.b.um r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.OPA_SESSION_SERVICE_EVENT
            r2[r5] = r6
            r4.mo96220c(r14, r2)
            com.google.android.apps.gsa.search.shared.service.b.um[] r2 = new com.google.android.apps.gsa.search.shared.service.p6935b.C88244um[r0]
            com.google.android.apps.gsa.search.shared.service.b.um r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.QUERY_OPAQUE_TOKEN
            r2[r5] = r0
            r4.mo96220c(r14, r2)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.an r0 = r14.f315857ao
            com.google.android.apps.gsa.staticplugins.opa.chatui.cm r2 = new com.google.android.apps.gsa.staticplugins.opa.chatui.cm
            r0.getClass()
            r4 = r46
            g.a.a r4 = r4.f301217a
            java.lang.Object r4 = r4.mo17428b()
            com.google.android.apps.gsa.staticplugins.opa.az.i r4 = (com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i) r4
            r4.getClass()
            r2.<init>(r0, r4)
            r14.f315858ap = r2
            r0 = r31
            r2 = 1
            r0.f301324d = r2
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247588jw
            boolean r2 = r1.mo79746e(r2)
            if (r2 == 0) goto L_0x0c79
            com.google.android.apps.gsa.staticplugins.opa.valyrian.bs r2 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.bs
            r2.<init>(r14)
            r14.f315907bq = r2
            com.google.android.apps.gsa.staticplugins.opa.valyrian.bt r2 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.bt
            r2.<init>(r14)
            r14.f315908br = r2
            com.google.android.apps.gsa.staticplugins.opa.valyrian.bs r2 = r14.f315907bq
            r0.f301326f = r2
            com.google.android.apps.gsa.staticplugins.opa.valyrian.bu r2 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.bu
            r2.<init>(r14)
            r0.f301327g = r2
            com.google.android.apps.gsa.staticplugins.opa.valyrian.bt r2 = r14.f315908br
            r0.f301328h = r2
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.an r2 = r14.f315857ao
            r2.f316254c = r0
        L_0x0c79:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r2 = r14.f315859aq
            r2.mo101116B(r0)
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247770nS
            boolean r0 = r1.mo79746e(r0)
            if (r0 == 0) goto L_0x0c98
            com.google.android.apps.gsa.staticplugins.opa.valyrian.bv r0 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.bv
            r0.<init>(r14)
            r1 = r73
            r1.f301331a = r0
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.an r0 = r14.f315857ao
            r0.f316255d = r1
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r0 = r14.f315859aq
            r0.mo101117C(r1)
        L_0x0c98:
            com.google.android.apps.gsa.search.core.i.t r0 = r14.f315982r
            boolean r0 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f.m188690a(r0)
            if (r0 == 0) goto L_0x0cdf
            com.google.android.apps.gsa.staticplugins.nga.ui.b.a r0 = r14.f315973dj
            boolean r0 = r0.mo93971b()
            if (r0 == 0) goto L_0x0cbb
            android.app.Activity r0 = r14.f315833aQ
            android.view.Window r0 = r0.getWindow()
            android.app.Activity r1 = r14.f315833aQ
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            int r1 = com.google.android.libraries.assistant.p1614t.C19391a.m36980a(r1, r2)
            r0.setNavigationBarDividerColor(r1)
            goto L_0x0cdf
        L_0x0cbb:
            android.app.Activity r0 = r14.f315833aQ
            android.view.Window r0 = r0.getWindow()
            android.content.Context r1 = r14.f315981q
            android.content.res.Resources r1 = r1.getResources()
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r2 = r14.f315864av
            boolean r2 = r2.mo96655aa()
            r4 = 1
            if (r4 == r2) goto L_0x0cd4
            r2 = 17170443(0x106000b, float:2.4611944E-38)
            goto L_0x0cd7
        L_0x0cd4:
            r2 = 2131100245(0x7f060255, float:1.7812866E38)
        L_0x0cd7:
            r4 = 0
            int r1 = r1.getColor(r2, r4)
            r0.setNavigationBarDividerColor(r1)
        L_0x0cdf:
            android.widget.FrameLayout r0 = r29.mo100996aZ()
            p3186j$.util.Objects.requireNonNull(r30)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.bw r1 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.bw
            r1.<init>(r3)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.bx r2 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.bx
            r2.<init>(r3)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.NgaInteractionContainer r3 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.NgaInteractionContainer
            r0.getClass()
            r4 = r52
            g.a.a r5 = r4.f315549a
            java.lang.Object r5 = r5.mo17428b()
            android.app.Activity r5 = (android.app.Activity) r5
            r5.getClass()
            g.a.a r6 = r4.f315550b
            java.lang.Object r6 = r6.mo17428b()
            com.google.android.apps.gsa.nga.shared.ui.c.b r6 = (com.google.android.apps.gsa.nga.shared.p6369ui.p6406c.C82195b) r6
            r6.getClass()
            g.a.a r7 = r4.f315551c
            java.lang.Object r7 = r7.mo17428b()
            com.google.android.apps.gsa.search.core.i.t r7 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r7
            r7.getClass()
            g.a.a r8 = r4.f315552d
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.apps.gsa.staticplugins.opa.ak.d.a.a r8 = (com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8202d.p8203a.C106318a) r8
            r8.getClass()
            g.a.a r9 = r4.f315553e
            java.lang.Object r9 = r9.mo17428b()
            com.google.android.libraries.gsa.k.g r9 = (com.google.android.libraries.gsa.p1876k.C22871g) r9
            r9.getClass()
            g.a.a r10 = r4.f315554f
            java.lang.Object r10 = r10.mo17428b()
            com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.migration.impl.d r10 = (com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.migration.impl.C128650d) r10
            r10.getClass()
            g.a.a r4 = r4.f315555g
            java.lang.Object r4 = r4.mo17428b()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.getClass()
            boolean r4 = r4.booleanValue()
            r30 = r3
            r31 = r0
            r32 = r1
            r33 = r2
            r34 = r5
            r35 = r6
            r36 = r7
            r37 = r8
            r38 = r9
            r39 = r4
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r14.f315975k = r3
            com.google.android.apps.gsa.staticplugins.opa.valyrian.cc r0 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.cc
            r0.<init>(r14)
            r14.f315959cv = r0
            if (r80 == 0) goto L_0x0d71
            r1 = r82
            androidx.lifecycle.ag r1 = r1.f241687c
            r1.mo5705f(r0)
        L_0x0d71:
            android.view.LayoutInflater r0 = r14.f315876bL
            r1 = 2131625695(0x7f0e06df, float:1.8878605E38)
            android.view.ViewGroup r2 = r14.f315984t
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r2, r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r14.f315792B = r0
            android.view.ViewGroup r1 = r14.f315984t
            r0.getClass()
            r1.addView(r0)
            com.google.android.apps.gsa.search.core.i.t r0 = r14.f315982r
            com.google.android.apps.gsa.shared.m.h r1 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248226aM
            java.lang.String r0 = r0.mo79758x(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0d9c
            android.widget.TextView r1 = r14.f315792B
            r1.setText(r0)
        L_0x0d9c:
            android.widget.TextView r0 = r14.f315792B
            r0.getClass()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.coordinatorlayout.widget.f r0 = (androidx.coordinatorlayout.widget.C1773f) r0
            android.widget.FrameLayout r1 = r14.f315985u
            int r1 = r1.getId()
            r2 = 0
            r0.f5534l = r2
            r0.f5533k = r2
            r0.f5528f = r1
            r1 = 1
            r0.f5526d = r1
            r0 = r87
            r0.mo85301a(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.C114071eg.<init>(com.google.android.apps.gsa.staticplugins.opa.chatui.ax, com.google.android.apps.gsa.staticplugins.opa.chatui.ej, com.google.android.apps.gsa.staticplugins.opa.searchbox.a, com.google.android.apps.gsa.staticplugins.opa.chatui.bh, com.google.android.apps.gsa.shared.util.t.g, com.google.common.base.cr, com.google.common.base.cr, android.content.Context, com.google.android.apps.gsa.search.core.i.t, com.google.android.apps.gsa.staticplugins.nga.ui.b.a, com.google.android.apps.gsa.staticplugins.opa.valyrian.ek, com.google.android.apps.gsa.staticplugins.opa.az.u, com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.aj, com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.m, com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ao, com.google.android.apps.gsa.staticplugins.opa.valyrian.a.c, com.google.android.apps.gsa.staticplugins.opa.chatui.cn, com.google.android.apps.gsa.staticplugins.opa.chatui.ie, com.google.android.apps.gsa.staticplugins.opa.chatui.hd, dagger.a, com.google.common.base.ax, com.google.android.apps.gsa.staticplugins.opa.valyrian.ab, com.google.android.apps.gsa.staticplugins.opa.valyrian.ag, com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.aw, com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.aq, com.google.android.apps.gsa.staticplugins.opa.util.cr, com.google.android.apps.gsa.staticplugins.opa.valyrian.b.b, com.google.common.base.ax, com.google.android.libraries.gsa.k.g, com.google.android.libraries.gsa.k.g, com.google.android.apps.gsa.opa.ak, com.google.android.apps.gsa.staticplugins.opa.hq.v, com.google.android.apps.gsa.assistant.shared.bm, com.google.android.apps.gsa.staticplugins.opa.util.bo, dagger.a, com.google.android.libraries.f.a, androidx.lifecycle.v, com.google.android.apps.gsa.shared.s.a.a, com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ak, android.app.Activity, com.google.android.apps.gsa.staticplugins.opa.zerostate.h.b, dagger.a, com.google.android.apps.gsa.staticplugins.opa.bk.b, com.google.android.apps.gsa.staticplugins.opa.chatui.em, com.google.android.apps.gsa.staticplugins.opa.zerostate.f.l, dagger.a, com.google.android.apps.gsa.assistant.shared.r.a, com.google.android.apps.gsa.nga.shared.ui.c.b, com.google.android.apps.gsa.staticplugins.opa.aq.c, boolean, boolean, com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.u, com.google.android.apps.gsa.shared.ah.g, dagger.a, com.google.android.apps.gsa.staticplugins.opa.az.i, com.google.android.apps.gsa.staticplugins.opa.chathead.a, com.google.android.apps.gsa.shared.search.Query, com.google.android.apps.gsa.shared.util.debug.f, dagger.a, com.google.android.apps.gsa.staticplugins.opa.util.cw, dagger.a, com.google.android.apps.gsa.search.core.google.gaia.o, com.google.android.apps.gsa.shared.av.c, com.google.android.apps.gsa.staticplugins.opa.chatui.ig, com.google.android.apps.gsa.staticplugins.opa.ak.d.a.a, dagger.a, com.google.android.apps.gsa.staticplugins.opa.x.l, com.google.android.apps.gsa.assistant.shared.q.m, com.google.android.apps.gsa.staticplugins.opa.webview.b.c, com.google.android.apps.gsa.assistant.shared.s.r, com.google.android.libraries.logging.ve.f.h, com.google.android.apps.gsa.shared.ag.e.o):void");
    }

    /* renamed from: aM */
    public static int m188842aM(int i) {
        return i == 0 ? R.dimen.opa_search_plate_height_v2 : R.dimen.opa_search_plate_height;
    }

    /* renamed from: dH */
    private final int m188843dH() {
        return (!mo101039dm() || !this.f315983s.mo96407t()) ? -2 : -1;
    }

    /* renamed from: dI */
    private final Animator m188844dI(View view) {
        int dimensionPixelSize = this.f315981q.getResources().getDimensionPixelSize(R.dimen.header_slide_down_distance);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{(float) (-dimensionPixelSize), 0.0f});
        ofFloat.setDuration(320);
        ofFloat.setInterpolator(f315787bx);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat2.setDuration(160);
        ofFloat2.setInterpolator(f315789bz);
        ofFloat2.setStartDelay(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.addListener(new C114036db(view));
        return animatorSet;
    }

    /* renamed from: dJ */
    private final Animator m188845dJ(View view) {
        int dimensionPixelSize = this.f315981q.getResources().getDimensionPixelSize(R.dimen.header_slide_up_distance);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{0.0f, (float) (-dimensionPixelSize)});
        ofFloat.setDuration(240);
        ofFloat.setInterpolator(f315788by);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat2.setDuration(140);
        ofFloat2.setInterpolator(f315789bz);
        ofFloat2.setStartDelay(100);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.addListener(new C114037dc(view));
        return animatorSet;
    }

    /* renamed from: dK */
    private final Animator m188846dK(int i) {
        if (this.f315791A == null) {
            return null;
        }
        int i2 = -i;
        TextView textView = this.f315791A;
        textView.getClass();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{(float) (this.f315981q.getResources().getDimensionPixelSize(R.dimen.zero_state_slide_up_distance) + i2), (float) i2});
        ofFloat.setDuration(320);
        ofFloat.setInterpolator(f315786bw);
        TextView textView2 = this.f315791A;
        textView2.getClass();
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat2.setDuration(320);
        ofFloat2.setInterpolator(f315785bv);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.addListener(new C114035da(this));
        return animatorSet;
    }

    /* renamed from: dL */
    private final View m188847dL() {
        if (this.f315945ch == null) {
            this.f315945ch = this.f315985u.findViewById(R.id.opa_search_plate);
        }
        return this.f315945ch;
    }

    /* renamed from: dM */
    private final C114095a m188848dM(C114143m mVar, C114105aj ajVar, C108237bh bhVar) {
        C114143m mVar2 = mVar;
        C114105aj ajVar2 = ajVar;
        if ((!this.f315844ab || !this.f315982r.mo79746e(C90029ch.f248250ak)) && (this.f315844ab || !this.f315982r.mo79746e(C90029ch.f248251al))) {
            C91097g gVar = this.f315799I;
            C108226ax axVar = this.f315983s;
            C108423id idVar = this.f315850ah;
            C58881cr crVar = this.f315886bV;
            C58881cr crVar2 = this.f315887bW;
            gVar.getClass();
            axVar.getClass();
            bhVar.getClass();
            idVar.getClass();
            crVar.getClass();
            crVar2.getClass();
            ((C90476a) ajVar2.f316228a.mo17428b()).getClass();
            C21370a aVar = (C21370a) ajVar2.f316229b.mo17428b();
            C21370a aVar2 = aVar;
            aVar.getClass();
            C108328eq eqVar = (C108328eq) ajVar2.f316230c.mo17428b();
            C108328eq eqVar2 = eqVar;
            eqVar.getClass();
            Activity activity = (Activity) ajVar2.f316231d.mo17428b();
            Activity activity2 = activity;
            activity.getClass();
            C86124t tVar = (C86124t) ajVar2.f316232e.mo17428b();
            C86124t tVar2 = tVar;
            tVar.getClass();
            C104149a aVar3 = (C104149a) ajVar2.f316233f.mo17428b();
            C104149a aVar4 = aVar3;
            aVar3.getClass();
            C81517a aVar5 = (C81517a) ajVar2.f316234g.mo17428b();
            C81517a aVar6 = aVar5;
            aVar5.getClass();
            C22871g gVar2 = (C22871g) ajVar2.f316235h.mo17428b();
            C22871g gVar3 = gVar2;
            gVar2.getClass();
            C114106ak akVar = (C114106ak) ajVar2.f316236i.mo17428b();
            C114106ak akVar2 = akVar;
            akVar.getClass();
            C113954b bVar = (C113954b) ajVar2.f316237j.mo17428b();
            C113954b bVar2 = bVar;
            bVar.getClass();
            C58833ax axVar2 = (C58833ax) ajVar2.f316238k.mo17428b();
            C58833ax axVar3 = axVar2;
            axVar2.getClass();
            C73906a aVar7 = (C73906a) ajVar2.f316239l.mo17428b();
            aVar7.getClass();
            return new C114104ai(gVar, axVar, bhVar, idVar, crVar, crVar2, aVar2, eqVar2, activity2, tVar2, aVar4, aVar6, gVar3, akVar2, bVar2, axVar3, aVar7, (C28421h) ajVar2.f316240m.mo17428b());
        }
        C91097g gVar4 = this.f315799I;
        C108226ax axVar4 = this.f315983s;
        C108423id idVar2 = this.f315850ah;
        C58881cr crVar3 = this.f315886bV;
        C58881cr crVar4 = this.f315887bW;
        gVar4.getClass();
        axVar4.getClass();
        bhVar.getClass();
        idVar2.getClass();
        crVar3.getClass();
        crVar4.getClass();
        ((C90476a) mVar2.f316424a.mo17428b()).getClass();
        Activity activity3 = (Activity) mVar2.f316425b.mo17428b();
        activity3.getClass();
        C86124t tVar3 = (C86124t) mVar2.f316426c.mo17428b();
        tVar3.getClass();
        C81517a aVar8 = (C81517a) mVar2.f316427d.mo17428b();
        aVar8.getClass();
        C114138h hVar = (C114138h) mVar2.f316428e.mo17428b();
        hVar.getClass();
        return new C114142l(gVar4, axVar4, bhVar, idVar2, crVar3, crVar4, activity3, tVar3, aVar8, hVar);
    }

    /* renamed from: dN */
    private final String m188849dN(boolean z) {
        return C82193a.m130503a(this.f315833aQ) ? z ? this.f315964da : this.f315965db : z ? this.f315936cY : this.f315937cZ;
    }

    /* renamed from: dO */
    private static String m188850dO(ContextThemeWrapper contextThemeWrapper) {
        return String.format("#%06X", new Object[]{Integer.valueOf(C19391a.m36980a(contextThemeWrapper, R.attr.colorOnSurface) & 16777215)});
    }

    /* renamed from: dP */
    private static String m188851dP(ContextThemeWrapper contextThemeWrapper) {
        return String.format("#%06X", new Object[]{Integer.valueOf(C19391a.m36980a(contextThemeWrapper, R.attr.colorOnSurfaceVariant) & 16777215)});
    }

    /* renamed from: dQ */
    private final void m188852dQ(List list, C108232bc bcVar) {
        if (this.f315844ab && this.f315982r.mo79746e(C90029ch.f248290e) && this.f315925cN > 0 && bcVar.mo95830h() != -3 && bcVar.mo95830h() != -2) {
            if ((bcVar instanceof C108451je) && !((C108451je) bcVar).f301664f) {
                return;
            }
            if (bcVar instanceof C108457jk) {
                C91097g gVar = this.f315799I;
                C108457jk jkVar = new C108457jk(gVar, C58833ax.m90834k(this.f315967dd.mo101265a(gVar)), 3, ((C108457jk) bcVar).f301683a);
                jkVar.f301034p = 1;
                jkVar.f301025B = bcVar.f301025B;
                list.add(jkVar);
                return;
            }
            list.add(bcVar);
        }
    }

    /* renamed from: dR */
    private final void m188853dR() {
        C60870cx cxVar = this.f315899bi;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f315899bi = null;
        }
    }

    /* renamed from: dS */
    private final void m188854dS(C108232bc bcVar) {
        boolean z = true;
        if (!mo100907df() || (!m188888eo(bcVar) && ((!(bcVar instanceof C108262cf) || !mo101036de((C108262cf) bcVar)) && !this.f315835aS.f300678a))) {
            this.f315970dg = false;
            if (this.f315983s.mo96407t()) {
                this.f315853ak.mo100783g(true);
            }
            if (bcVar instanceof C108451je) {
                C108451je jeVar = (C108451je) bcVar;
                String c = jeVar.mo96890c();
                if (c != null) {
                    if (TextUtils.isEmpty(this.f315905bo)) {
                        this.f315905bo = this.f315853ak.f315537z;
                    }
                    this.f315853ak.mo100793q(c);
                } else {
                    C113926aa aaVar = this.f315853ak;
                    String str = jeVar.f301660b;
                    String str2 = jeVar.f301661c;
                    aaVar.f315536y = false;
                    aaVar.mo100785i();
                    if (aaVar.f315533v && aaVar.f315518g.getTextSize() != 20.0f) {
                        aaVar.f315518g.setTextSize(20.0f);
                    }
                    aaVar.f315518g.mo82923b(str, str2);
                }
                if (jeVar.mo96575b()) {
                    if ((m188867eB() && !mo95399aj()) || m188868eC() || mo100907df()) {
                        z = false;
                    }
                    jeVar.f301664f = z;
                    if (!mo100907df() && (this.f315856an.mo101172s() == 3 || (!this.f315982r.mo79746e(C90014bt.f247353fZ) && this.f315982r.mo79746e(C90014bt.f247407ga) && this.f315856an.mo101172s() == 4))) {
                        this.f315853ak.mo100789m();
                        if (!this.f315982r.mo79746e(C90014bt.f247206cl) || !mo101037dg()) {
                            m188855dT();
                        }
                    } else if (!this.f315845ac && !mo100907df()) {
                        m188884ek();
                    }
                } else {
                    jeVar.f301664f = false;
                    if (!this.f315845ac && !mo100907df() && !this.f315982r.mo79746e(C90014bt.f247744mt)) {
                        m188884ek();
                    }
                }
            } else if (!m188898ey(bcVar) && !mo100907df()) {
                this.f315853ak.mo100789m();
            }
        } else {
            this.f315970dg = true;
            this.f315853ak.mo100783g(false);
            if (m188862dh(bcVar)) {
                ((C108451je) bcVar).f301664f = false;
            }
            int e = this.f315859aq.mo101122e(C108230ba.f301014b);
            if (e >= 0) {
                C108232bc b = this.f315859aq.mo95352b(e);
                if (b instanceof C108451je) {
                    C108451je jeVar2 = (C108451je) b;
                    if (!jeVar2.f301664f) {
                        jeVar2.f301664f = true;
                        mo101018cR();
                        this.f315859aq.mo95354d(e);
                    }
                }
            }
        }
    }

    /* renamed from: dT */
    private final void m188855dT() {
        if (this.f315940cc) {
            this.f315853ak.mo100782f(false);
        } else {
            C113926aa aaVar = this.f315853ak;
            aaVar.mo100788l();
            aaVar.mo100784h();
        }
        mo95365G();
    }

    /* renamed from: dU */
    private final void m188856dU(C108232bc bcVar) {
        View.OnLayoutChangeListener onLayoutChangeListener;
        if (bcVar instanceof C108474ka) {
            if (this.f315946ci == null) {
                this.f315946ci = new C114007cq(this);
            }
            C108241bl m = bcVar.mo96603m();
            if (m != null && (onLayoutChangeListener = this.f315946ci) != null) {
                m.itemView.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        }
    }

    /* renamed from: dV */
    private final void m188857dV(String str, View view) {
        C108262cf cfVar;
        C108212aj ajVar = new C108212aj(view, 3);
        ajVar.f301033o = false;
        if (!C58837ba.m90859h(str)) {
            cfVar = new C108262cf();
            cfVar.f301174d = str;
            cfVar.f301033o = false;
            m188876ec(cfVar);
        } else {
            cfVar = null;
        }
        if (!mo100907df()) {
            this.f315853ak.mo100789m();
        }
        if (!this.f315830aN) {
            mo101014cD(false, true);
        }
        mo100866bu();
        this.f315853ak.mo100786j(false);
        C114056dv dvVar = this.f315938ca;
        if (dvVar.f315758a) {
            dvVar.f315758a = false;
            int e = dvVar.f315759b.f315859aq.mo101122e(C108230ba.f301013a);
            if (e >= 0) {
                dvVar.f315759b.mo101011bt(e);
            } else {
                dvVar.f315759b.mo100864bq();
            }
            dvVar.f315759b.f315859aq.mo101136s(cfVar, ajVar);
            return;
        }
        this.f315859aq.mo101136s(cfVar, ajVar);
        if (m188868eC()) {
            mo101010br();
        }
    }

    /* renamed from: dW */
    private final void m188858dW(int i) {
        if (mo101037dg()) {
            ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView = this.f315865aw;
            valyrianDynamicResponseLayerView.getClass();
            valyrianDynamicResponseLayerView.mo101053a(i);
        }
    }

    /* renamed from: dX */
    private final void m188859dX(String str) {
        if (this.f315819aC != null) {
            ArrayList<C108232bc> arrayList = new ArrayList<>();
            if (this.f315859aq.mo95351a() > 0) {
                arrayList.addAll(this.f315883bS);
                this.f315883bS.clear();
            }
            for (int i = 0; i < this.f315859aq.mo95351a(); i++) {
                C108232bc b = this.f315859aq.mo95352b(i);
                if (b != null && m188866eA(b)) {
                    for (C108232bc add : b.mo96604n()) {
                        arrayList.add(add);
                    }
                }
            }
            C108412ht m = this.f315859aq.mo101130m();
            if (m != null && !mo100906dc()) {
                arrayList.add(m);
            }
            C108303dt dtVar = this.f315819aC;
            dtVar.getClass();
            if (dtVar.f301292w == null) {
                C59104x d = C108303dt.f301260a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "HistoryManager");
                ((C59052c) ((C59052c) d).mo56372aa(23989)).mo56386p("#save() cannot be called until HistoryManager is initialized.");
                return;
            }
            dtVar.f301291v++;
            C108484s sVar = new C108484s();
            for (C108232bc bcVar : arrayList) {
                if (bcVar.mo96602l() == 0) {
                    bcVar.mo96607q(1);
                    bcVar.f301037s = str;
                    C60870cx h = dtVar.mo96745h(bcVar);
                    if (h != null) {
                        sVar.mo96734d(bcVar, h);
                    } else {
                        C58976aa aaVar = C58975e.f156826a;
                    }
                }
            }
            C108300dq a = sVar.mo96731a();
            if (str != null) {
                dtVar.f301279j.remove(str);
            }
            new C90873ag(C108303dt.m180009g(a), dtVar.f301272c, "Collect HistoryEntries", new C108278cv(dtVar, str, a)).mo85223a(new C108279cw(dtVar, str));
        }
    }

    /* renamed from: dY */
    private final void m188860dY() {
        if (this.f315982r.mo79746e(C90014bt.f247677lf) && this.f315824aH != null) {
            this.f315827aK = false;
            this.f315828aL = false;
            ViewGroup aY = mo100995aY();
            OpaWebView opaWebView = this.f315824aH;
            opaWebView.getClass();
            aY.removeView(opaWebView);
            m188880eg(true);
            mo100994aT().setTranslationY(0.0f);
            mo101027cn();
            mo100994aT().setVisibility(0);
            mo101000bL();
            m188877ed();
            mo101025ck(true);
            OpaWebView opaWebView2 = this.f315824aH;
            opaWebView2.getClass();
            opaWebView2.f316501j.clear();
            OpaWebView opaWebView3 = this.f315824aH;
            opaWebView3.getClass();
            opaWebView3.f316505n = null;
            this.f315847ae.f316245e = null;
            this.f315824aH = null;
            ValueAnimator valueAnimator = this.f315826aJ;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f315826aJ.cancel();
                this.f315826aJ = null;
            }
            if (mo101037dg() && !this.f315978n) {
                mo100995aY().setMinimumHeight(0);
                this.f315825aI = 0;
                int aI = mo100986aI(false);
                if (this.f315911bu == null || !mo101043dx()) {
                    mo101040dt(0, aI);
                    return;
                }
                C109037fg fgVar = this.f315911bu;
                fgVar.getClass();
                mo101040dt(0, aI - fgVar.mo97408a());
            }
        }
    }

    /* renamed from: dZ */
    private final void m188861dZ(C108232bc bcVar) {
        if (this.f315844ab && bcVar != null) {
            if (bcVar.f301026C != 3) {
                int aN = mo100990aN();
                int aI = mo100986aI(false);
                if (this.f315982r.mo79746e(C90029ch.f248209W)) {
                    if (!m188889ep() && bcVar.mo96610t()) {
                        mo101040dt(aN, aN);
                    } else if (m188889ep() && !bcVar.mo96610t()) {
                        mo101040dt(0, aI);
                    }
                } else if (this.f315982r.mo79746e(C90029ch.f248208V)) {
                    if (m188889ep() || !bcVar.mo96610t()) {
                        if (!m188889ep() || bcVar.mo96610t()) {
                            if (m188889ep() && bcVar.mo96610t() && mo100906dc() && !mo100909dl() && !C87566i.m142287ak(this.f315833aQ.getIntent().getExtras())) {
                                mo101040dt(aI, aI);
                            }
                        } else if (this.f315911bu == null || !mo101043dx()) {
                            mo101040dt(0, aI);
                        } else {
                            C109037fg fgVar = this.f315911bu;
                            fgVar.getClass();
                            mo101040dt(0, aI - fgVar.mo97408a());
                        }
                    } else if (C87566i.m142287ak(this.f315833aQ.getIntent().getExtras()) || mo100909dl()) {
                        mo101040dt(aN, aN);
                    } else if (this.f315911bu == null || !mo101043dx()) {
                        mo101040dt(aN, aI);
                    } else {
                        C109037fg fgVar2 = this.f315911bu;
                        fgVar2.getClass();
                        mo101040dt(aN, aI - fgVar2.mo97408a());
                    }
                } else if (this.f315982r.mo79746e(C90029ch.f248281bo)) {
                    if (!m188889ep() && bcVar.mo96610t()) {
                        mo101040dt(aI, aI);
                    } else if (m188889ep() && !bcVar.mo96610t()) {
                        mo101040dt(0, mo100986aI(false));
                    }
                } else if (this.f315982r.mo79746e(C90029ch.f248306u) && this.f315926cO.contains(C58837ba.m90858g(bcVar.f301044z)) && !this.f315927cP.contains(Integer.valueOf(bcVar.f301024A))) {
                    mo101029cq();
                }
            } else {
                int aI2 = mo100986aI(true);
                mo101040dt(aI2, aI2);
            }
        }
    }

    /* renamed from: dh */
    public static boolean m188862dh(C108232bc bcVar) {
        return (bcVar.mo95830h() == 0 || bcVar.mo95830h() == 25) && ((C108451je) bcVar).mo96575b();
    }

    /* renamed from: di */
    static boolean m188863di(C108232bc bcVar) {
        return bcVar.mo95830h() == 1 && ((C108262cf) bcVar).f301170K == 1;
    }

    /* renamed from: do */
    public static boolean m188864do(int i) {
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 10;
    }

    /* renamed from: dz */
    public static final void m188865dz(FrameLayout frameLayout) {
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams instanceof C1773f) {
            ((C1773f) layoutParams).mo4974a(new MoveUpwardBehavior());
        }
    }

    /* renamed from: eA */
    private final boolean m188866eA(C108232bc bcVar) {
        return bcVar instanceof C108262cf ? !this.f315807Q : bcVar.mo95830h() != 32;
    }

    /* renamed from: eB */
    private final boolean m188867eB() {
        return C113987f.m188691b(this.f315982r) && !this.f315982r.mo79746e(C90014bt.f247342fO);
    }

    /* renamed from: eC */
    private final boolean m188868eC() {
        if (!this.f315956cs || !mo101037dg()) {
            return false;
        }
        C109037fg fgVar = this.f315911bu;
        fgVar.getClass();
        return !fgVar.f303205a.mo97494bD();
    }

    /* renamed from: eD */
    private static C114153w m188869eD(Activity activity) {
        C53287ih d = C87571n.m142340d(C87566i.m142246U(activity.getIntent().getExtras()));
        if (d != null) {
            C113984c cVar = C113984c.UNKNOWN;
            C88244um umVar = C88244um.ATTACH_WEBVIEW;
            C53306j jVar = C53306j.UNKNOWNN;
            int a = C53282ic.m86805a(d.f139702h);
            int i = 1;
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            if (i2 == 1) {
                int b = C53286ig.m86808b(d.f139703i);
                if (b == 0) {
                    b = 1;
                }
                if (b - 1 == 1) {
                    return new C114153w(11);
                }
            } else if (i2 == 2) {
                return new C114153w(6);
            } else {
                if (i2 == 3) {
                    return new C114153w(7);
                }
                if (i2 == 10) {
                    int b2 = C53286ig.m86808b(d.f139703i);
                    if (b2 != 0) {
                        i = b2;
                    }
                    int i3 = i - 1;
                    if (i3 == 20) {
                        return new C114153w(10);
                    }
                    if (i3 == 38) {
                        return new C114153w(9);
                    }
                } else if (i2 == 13) {
                    return new C114153w(8);
                } else {
                    if (i2 == 16) {
                        return new C114153w(12);
                    }
                }
            }
        }
        return new C114153w(3);
    }

    /* renamed from: eE */
    private final C114119ax m188870eE(int i) {
        return new C114119ax(this.f315856an, this.f315847ae, i);
    }

    /* renamed from: eF */
    private static void m188871eF(ViewGroup viewGroup, int i) {
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null && layoutParams.height != i) {
                int i2 = layoutParams.height;
                layoutParams.height = i;
                viewGroup.setLayoutParams(layoutParams);
                viewGroup.requestLayout();
                return;
            }
            return;
        }
        C59081b.m91349a(C58979ad.MEDIUM, "stack size");
    }

    /* renamed from: eG */
    private final int m188872eG() {
        C113984c cVar = C113984c.UNKNOWN;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C53306j jVar = C53306j.UNKNOWNN;
        int i = this.f315821aE.f316466b;
        int i2 = i - 1;
        if (i != 0) {
            switch (i2) {
                case 0:
                case 3:
                    return 2;
                case 1:
                    return 3;
                case 2:
                    return 4;
                case 4:
                    return 5;
                case 5:
                    return 6;
                case 6:
                    return 7;
                case 7:
                    return 8;
                case 8:
                    return 11;
                case 9:
                    return 9;
                case 10:
                    return 10;
                case 11:
                    return 12;
                default:
                    return 1;
            }
        } else {
            throw null;
        }
    }

    /* renamed from: eH */
    private final void m188873eH(C114111ap apVar, C114117av avVar) {
        ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView = (ValyrianDynamicResponseLayerView) this.f315876bL.inflate(R.layout.valyrian_dynamic_response_layer, (ViewGroup) null);
        this.f315865aw = valyrianDynamicResponseLayerView;
        valyrianDynamicResponseLayerView.getClass();
        ValyrianRecyclerView valyrianRecyclerView = (ValyrianRecyclerView) valyrianDynamicResponseLayerView.findViewById(R.id.dynamic_response_container);
        this.f315866ax = valyrianRecyclerView;
        m188871eF(valyrianRecyclerView, m188843dH());
        ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView2 = this.f315865aw;
        valyrianDynamicResponseLayerView2.getClass();
        valyrianDynamicResponseLayerView2.mo101053a(m188843dH() == -1 ? 2 : 1);
        if (m188843dH() == -2) {
            int aI = mo100986aI(false);
            ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView3 = this.f315865aw;
            valyrianDynamicResponseLayerView3.getClass();
            C58976aa aaVar = C58975e.f156826a;
            valyrianDynamicResponseLayerView3.f316102c = aI;
            valyrianDynamicResponseLayerView3.requestLayout();
            m188858dW(1);
            ValyrianRecyclerView valyrianRecyclerView2 = this.f315866ax;
            valyrianRecyclerView2.getClass();
            valyrianRecyclerView2.f316112b = aI;
        } else {
            m188858dW(2);
        }
        if (m188897ex()) {
            ((C89859i) this.f315951cn.mo27525b()).mo83702b(C89849ae.OPA_ANDROID_ANIMATOR_TYPE_TACTILE_VALYRIAN_ITEM_ANIMATOR);
            ((C59052c) ((C59052c) f315790j.mo56224b()).mo56372aa(28542)).mo56386p("ValyrianChatUi: Current item animator is TactileValyrianItemAnimator.");
            C114097ab abVar = new C114097ab();
            ValyrianRecyclerView valyrianRecyclerView3 = this.f315866ax;
            valyrianRecyclerView3.getClass();
            valyrianRecyclerView3.setItemAnimator(abVar);
            ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView4 = this.f315865aw;
            valyrianDynamicResponseLayerView4.getClass();
            ViewTreeObserver viewTreeObserver = valyrianDynamicResponseLayerView4.getViewTreeObserver();
            ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView5 = this.f315865aw;
            valyrianDynamicResponseLayerView5.getClass();
            ValyrianRecyclerView valyrianRecyclerView4 = this.f315866ax;
            valyrianRecyclerView4.getClass();
            viewTreeObserver.addOnPreDrawListener(C114034q.m188810f(valyrianDynamicResponseLayerView5, valyrianRecyclerView4, new C113994cd(this), new C113995ce(this), this.f315814X, this.f315982r, this.f315815Y));
        } else if (this.f315941cd) {
            ((C89859i) this.f315951cn.mo27525b()).mo83702b(C89849ae.OPA_ANDROID_ANIMATOR_TYPE_NULL);
            ((C59052c) ((C59052c) f315790j.mo56224b()).mo56372aa(28541)).mo56386p("ValyrianChatUi: Current item animator is NULL.");
            ValyrianRecyclerView valyrianRecyclerView5 = this.f315866ax;
            valyrianRecyclerView5.getClass();
            valyrianRecyclerView5.setItemAnimator((C0646fh) null);
            ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView6 = this.f315865aw;
            valyrianDynamicResponseLayerView6.getClass();
            ViewTreeObserver viewTreeObserver2 = valyrianDynamicResponseLayerView6.getViewTreeObserver();
            ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView7 = this.f315865aw;
            valyrianDynamicResponseLayerView7.getClass();
            ValyrianRecyclerView valyrianRecyclerView6 = this.f315866ax;
            valyrianRecyclerView6.getClass();
            viewTreeObserver2.addOnPreDrawListener(C114034q.m188809e(valyrianDynamicResponseLayerView7, valyrianRecyclerView6, new C113996cf(this), new C113997cg(this), this.f315814X, this.f315982r, this.f315815Y));
        } else if (this.f315982r.mo79746e(C90029ch.f248249aj)) {
            ((C59052c) ((C59052c) f315790j.mo56224b()).mo56372aa(28540)).mo56386p("ValyrianChatUi: Current item animator is DefaultItemAnimator, supportsChangeAnimations: true.");
            ValyrianRecyclerView valyrianRecyclerView7 = this.f315866ax;
            valyrianRecyclerView7.getClass();
            valyrianRecyclerView7.setItemAnimator(new C0568ck());
        } else {
            ((C89859i) this.f315951cn.mo27525b()).mo83702b(C89849ae.OPA_ANDROID_ANIMATOR_TYPE_VALYRIAN_ITEM_ANIMATOR);
            ((C59052c) ((C59052c) f315790j.mo56224b()).mo56372aa(28539)).mo56386p("ValyrianChatUi: Current item animator is ValyrianItemAnimator.");
            ValyrianRecyclerView valyrianRecyclerView8 = this.f315866ax;
            valyrianRecyclerView8.getClass();
            valyrianRecyclerView8.setItemAnimator(new C114116au(this.f315981q, this.f315982r));
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f315981q, 1, false);
        this.f315867ay = linearLayoutManager;
        linearLayoutManager.setStackFromEnd(false);
        LinearLayoutManager linearLayoutManager2 = this.f315867ay;
        linearLayoutManager2.getClass();
        linearLayoutManager2.setSmoothScrollbarEnabled(false);
        ValyrianRecyclerView valyrianRecyclerView9 = this.f315866ax;
        valyrianRecyclerView9.getClass();
        valyrianRecyclerView9.setLayoutManager(this.f315867ay);
        ValyrianRecyclerView valyrianRecyclerView10 = this.f315866ax;
        valyrianRecyclerView10.getClass();
        valyrianRecyclerView10.addItemDecoration$ar$ds(apVar);
        ValyrianRecyclerView valyrianRecyclerView11 = this.f315866ax;
        valyrianRecyclerView11.getClass();
        valyrianRecyclerView11.addItemDecoration$ar$ds(avVar);
        ValyrianRecyclerView valyrianRecyclerView12 = this.f315866ax;
        valyrianRecyclerView12.getClass();
        valyrianRecyclerView12.mo101064a(this.f315859aq);
        if (this.f315982r.mo79746e(C90014bt.f247793np) && this.f315982r.mo79746e(C90029ch.f248223aJ) && this.f315844ab && this.f315940cc) {
            ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView8 = this.f315865aw;
            valyrianDynamicResponseLayerView8.getClass();
            ViewGroup viewGroup = (ViewGroup) valyrianDynamicResponseLayerView8.findViewById(R.id.handle_bar);
            this.f315818aB = viewGroup;
            viewGroup.setVisibility(0);
            ViewGroup viewGroup2 = this.f315818aB;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup2, View.TRANSLATION_Y, new float[]{0.0f});
            ofFloat.setDuration(320);
            ofFloat.setInterpolator(f315781bA);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewGroup2, View.ALPHA, new float[]{0.0f, 1.0f});
            ofFloat2.setDuration(160);
            ofFloat2.setInterpolator(f315783bC);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
            animatorSet.addListener(new C114040df(viewGroup2));
            this.f315817aA = animatorSet;
            ViewGroup viewGroup3 = this.f315818aB;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(viewGroup3, View.TRANSLATION_Y, new float[]{(float) (-this.f315981q.getResources().getDimensionPixelSize(R.dimen.drl_handle_bar_height))});
            ofFloat3.setDuration(240);
            Interpolator interpolator = f315782bB;
            ofFloat3.setInterpolator(interpolator);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(viewGroup3, View.ALPHA, new float[]{1.0f, 0.0f});
            ofFloat4.setDuration(140);
            ofFloat4.setInterpolator(interpolator);
            ofFloat4.setStartDelay(100);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(new Animator[]{ofFloat3, ofFloat4});
            animatorSet2.addListener(new C114041dg(viewGroup3));
            this.f315868az = animatorSet2;
            ValyrianRecyclerView valyrianRecyclerView13 = this.f315866ax;
            valyrianRecyclerView13.getClass();
            valyrianRecyclerView13.addOnScrollListener(new C113998ch(this));
        }
    }

    /* renamed from: ea */
    private final void m188874ea() {
        View view = this.f315794D;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: eb */
    private final void m188875eb(boolean z) {
        if (this.f315793C != null) {
            ObjectAnimator objectAnimator = this.f315796F;
            if (objectAnimator != null && objectAnimator.isStarted()) {
                ObjectAnimator objectAnimator2 = this.f315796F;
                objectAnimator2.getClass();
                objectAnimator2.cancel();
            }
            if (z) {
                ObjectAnimator objectAnimator3 = this.f315797G;
                if (objectAnimator3 != null && objectAnimator3.isStarted()) {
                    ObjectAnimator objectAnimator4 = this.f315797G;
                    objectAnimator4.getClass();
                    objectAnimator4.cancel();
                }
                View view = this.f315793C;
                view.getClass();
                view.setVisibility(8);
                View view2 = this.f315793C;
                view2.getClass();
                view2.setAlpha(0.0f);
                return;
            }
            View view3 = this.f315793C;
            view3.getClass();
            if (view3.getVisibility() == 0) {
                ObjectAnimator objectAnimator5 = this.f315797G;
                objectAnimator5.getClass();
                if (!objectAnimator5.isStarted()) {
                    ObjectAnimator objectAnimator6 = this.f315797G;
                    objectAnimator6.getClass();
                    View view4 = this.f315793C;
                    view4.getClass();
                    objectAnimator6.setFloatValues(new float[]{view4.getAlpha(), 0.0f});
                    ObjectAnimator objectAnimator7 = this.f315797G;
                    objectAnimator7.getClass();
                    objectAnimator7.start();
                    return;
                }
            }
            View view5 = this.f315793C;
            view5.getClass();
            view5.setVisibility(8);
        }
    }

    /* renamed from: ec */
    private final void m188876ec(C108262cf cfVar) {
        if (this.f315982r.mo79746e(C90014bt.f247761nJ)) {
            C108232bc c = this.f315859aq.mo95353c();
            if (!(c instanceof C108262cf)) {
                return;
            }
            if (c.mo96576jz(cfVar.f301029k) == 2) {
                cfVar.f301175e = ((C108262cf) c).f301175e;
            } else if (!((C108262cf) c).mo96710A()) {
                cfVar.f301175e = true;
            }
        }
    }

    /* renamed from: ed */
    private final void m188877ed() {
        if (m188886em()) {
            this.f315853ak.mo100794r();
            this.f315853ak.mo100796t(true);
            mo101022ce();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r4.f315822aF == 1) goto L_0x000c;
     */
    /* renamed from: ee */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m188878ee(int r5) {
        /*
            r4 = this;
            boolean r0 = r4.f315940cc
            r1 = 0
            if (r0 == 0) goto L_0x000b
            int r2 = r4.f315822aF
            r3 = 1
            if (r2 != r3) goto L_0x000b
            goto L_0x000c
        L_0x000b:
            r3 = 0
        L_0x000c:
            if (r0 == 0) goto L_0x0011
            if (r3 != 0) goto L_0x0011
            r5 = 0
        L_0x0011:
            android.widget.LinearLayout r0 = r4.f315986v
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r0.bottomMargin = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.C114071eg.m188878ee(int):void");
    }

    /* renamed from: ef */
    private static void m188879ef(View view) {
        view.animate().cancel();
        if (view.getAlpha() != 1.0f) {
            view.setAlpha(1.0f);
        }
        view.setVisibility(0);
    }

    /* renamed from: eg */
    private final void m188880eg(boolean z) {
        if (mo101037dg()) {
            RecyclerView aT = mo100994aT();
            if (aT instanceof ValyrianRecyclerView) {
                ((ValyrianRecyclerView) aT).f316111a = z;
            }
        }
        this.f315856an.f316351m.f316111a = z;
    }

    /* renamed from: ei */
    private final void m188882ei() {
        if (this.f315940cc) {
            this.f315853ak.mo100782f(this.f315869bE);
        } else {
            this.f315853ak.mo100794r();
        }
        mo95365G();
    }

    /* renamed from: ej */
    private final void m188883ej() {
        if (mo101037dg()) {
            OpaWebView opaWebView = this.f315824aH;
            if (opaWebView != null) {
                opaWebView.f316500i = true;
                ViewParent parent = opaWebView.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f315824aH);
                }
                ViewGroup viewGroup = this.f315856an.f316350l;
                OpaWebView opaWebView2 = this.f315824aH;
                opaWebView2.getClass();
                viewGroup.addView(opaWebView2, 0);
                OpaWebView opaWebView3 = this.f315824aH;
                opaWebView3.getClass();
                opaWebView3.mo101228g(viewGroup);
                OpaWebView opaWebView4 = this.f315824aH;
                opaWebView4.getClass();
                opaWebView4.setOverScrollMode(1);
            }
            ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView = this.f315865aw;
            valyrianDynamicResponseLayerView.getClass();
            valyrianDynamicResponseLayerView.setVisibility(8);
            LinearLayout linearLayout = this.f315986v;
            ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView2 = this.f315865aw;
            valyrianDynamicResponseLayerView2.getClass();
            linearLayout.removeView(valyrianDynamicResponseLayerView2);
            this.f315986v.addView(this.f315855am, new FrameLayout.LayoutParams(-1, -1));
            this.f315855am.f316168o = this.f315860ar;
            m188875eb(false);
            ViewGroup viewGroup2 = this.f315818aB;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
                mo101001bM();
            }
            if (this.f315827aK) {
                mo100994aT().setVisibility(8);
            }
        }
    }

    /* renamed from: ek */
    private final void m188884ek() {
        m188855dT();
        C113926aa aaVar = this.f315853ak;
        C114034q.m188817m(aaVar.f315518g, aaVar.f315529r, aaVar.f315530s);
        aaVar.mo100795s();
        this.f315853ak.mo100796t(true);
    }

    /* renamed from: el */
    private final void m188885el(boolean z) {
        C108451je jeVar;
        int e = this.f315859aq.mo101122e(C108230ba.f301014b);
        if (e >= 0 && (jeVar = (C108451je) this.f315859aq.mo95352b(e)) != null) {
            jeVar.f301650D = z;
            this.f315859aq.mo101143z(e, jeVar);
        }
    }

    /* renamed from: em */
    private final boolean m188886em() {
        C108412ht m = this.f315859aq.mo101130m();
        boolean z = m != null && m.f301530b.mo96859b() > 0 && !this.f315943cf;
        C108395hc hcVar = this.f315851ai;
        return (z || (hcVar != null && !C58485gu.m89842j(hcVar.f301488a).isEmpty() && !this.f315943cf) || (this.f315982r.mo79746e(C90014bt.f247609kQ) && this.f315853ak.f315519h != null && !this.f315944cg) || (mo100907df() && !TextUtils.isEmpty(this.f315853ak.f315537z))) && !this.f315845ac;
    }

    /* renamed from: en */
    private final boolean m188887en() {
        if (this.f315982r.mo79746e(C90014bt.f247289eO) && this.f315856an.mo101172s() == 4) {
            return false;
        }
        if (C113987f.m188692c(this.f315982r)) {
            if ((this.f315834aR.getVisibility() != 0 || this.f315832aP) && ((this.f315834aR.getVisibility() != 0 || this.f315856an.mo101172s() == 4) && (this.f315832aP || this.f315856an.mo101172s() != 4))) {
                return false;
            }
        } else if (!this.f315832aP || this.f315856an.mo101172s() != 4) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    /* renamed from: eo */
    private final boolean m188888eo(C108232bc bcVar) {
        String str;
        if (!this.f315982r.mo79746e(C90029ch.f248194H)) {
            return false;
        }
        if (bcVar instanceof C108451je) {
            if (this.f315973dj.mo93970a()) {
                ((C108451je) bcVar).f301654H = m188851dP(this.f315968de);
            }
            if (!mo101036de((C108262cf) this.f315859aq.mo101127j(C108230ba.f301015c))) {
                return false;
            }
            C108451je jeVar = (C108451je) bcVar;
            if (C82193a.m130503a(this.f315833aQ)) {
                str = this.f315965db;
            } else {
                str = this.f315937cZ;
            }
            jeVar.f301654H = str;
            jeVar.f301655I = (int) this.f315982r.mo79743a(C90029ch.f248187A);
            return true;
        } else if (!this.f315926cO.contains(C58837ba.m90858g(bcVar.f301044z)) || this.f315927cP.contains(Integer.valueOf(bcVar.f301024A))) {
            mo101030ct();
            return false;
        } else {
            C108232bc k = this.f315859aq.mo101128k();
            if (k == null) {
                return false;
            }
            if (C58837ba.m90858g(k.f301044z).equals(C58837ba.m90858g(bcVar.f301044z)) && k.f301024A == bcVar.f301024A) {
                mo101029cq();
                return true;
            } else if (!this.f315982r.mo79746e(C90029ch.f248306u) || !this.f315926cO.contains(C58837ba.m90858g(bcVar.f301044z)) || this.f315927cP.contains(Integer.valueOf(bcVar.f301024A))) {
                mo101030ct();
                return false;
            } else {
                mo101029cq();
                return false;
            }
        }
    }

    /* renamed from: ep */
    private final boolean m188889ep() {
        ValyrianRecyclerView valyrianRecyclerView = this.f315866ax;
        if (valyrianRecyclerView == null) {
            return false;
        }
        int minimumHeight = valyrianRecyclerView.getMinimumHeight();
        if (minimumHeight == mo100990aN() || minimumHeight == mo100986aI(false)) {
            return true;
        }
        return false;
    }

    /* renamed from: eq */
    private static boolean m188890eq(C108232bc bcVar) {
        return m188863di(bcVar) && TextUtils.isEmpty(((C108262cf) bcVar).f301174d);
    }

    /* renamed from: er */
    private static boolean m188891er(C108232bc bcVar) {
        return (bcVar instanceof C108262cf) && ((C108262cf) bcVar).mo96717x();
    }

    /* renamed from: es */
    private final boolean m188892es() {
        int identifier = this.f315981q.getResources().getIdentifier("config_navBarInteractionMode", "integer", "android");
        if (identifier != 0) {
            int integer = this.f315981q.getResources().getInteger(identifier);
            return integer == 2 || integer == 3;
        }
        C59071e eVar = f315790j;
        ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(28603)).mo56386p("Failed to get navigation mode resource id.");
        int identifier2 = this.f315981q.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier2 == 0) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(28605)).mo56386p("Failed to get navigation bar height resource id.");
        } else if (((long) ((int) (((float) this.f315981q.getResources().getDimensionPixelSize(identifier2)) / this.f315981q.getResources().getDisplayMetrics().density))) < this.f315982r.mo79743a(C90051dc.f248886bo)) {
            return true;
        }
        return false;
    }

    /* renamed from: et */
    private static boolean m188893et(C108232bc bcVar) {
        if (bcVar.mo95830h() != 1 || !((C108262cf) bcVar).mo96717x()) {
            return false;
        }
        return true;
    }

    /* renamed from: eu */
    private static boolean m188894eu(C108232bc bcVar) {
        return bcVar != null && bcVar.mo95830h() == 17;
    }

    /* renamed from: ev */
    private static boolean m188895ev(C108232bc bcVar) {
        if (bcVar.mo95830h() != 1 || !((C108262cf) bcVar).mo96719z()) {
            return false;
        }
        return true;
    }

    /* renamed from: ew */
    private final boolean m188896ew() {
        String str = Build.MODEL;
        return str.startsWith("Pixel") || this.f315982r.mo79745c(C90014bt.f247552jM).contains(str);
    }

    /* renamed from: ex */
    private final boolean m188897ex() {
        return C87566i.m142290an(this.f315833aQ.getIntent().getExtras());
    }

    /* renamed from: ey */
    private static boolean m188898ey(C108232bc bcVar) {
        if (bcVar.mo95830h() != 1 || !((C108262cf) bcVar).mo96710A()) {
            return false;
        }
        return true;
    }

    /* renamed from: ez */
    private final boolean m188899ez(float f, boolean z) {
        if (z) {
            if (f > this.f315930cS) {
                LinearLayoutManager linearLayoutManager = this.f315867ay;
                linearLayoutManager.getClass();
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                return findLastVisibleItemPosition >= 0 && findLastVisibleItemPosition <= mo100989aL() && this.f315851ai.mo96835a() > 0 && !mo100909dl() && findLastVisibleItemPosition == mo100989aL();
            }
        }
        if (f < (-this.f315930cS)) {
            LinearLayoutManager linearLayoutManager2 = this.f315867ay;
            linearLayoutManager2.getClass();
            int findFirstVisibleItemPosition = linearLayoutManager2.findFirstVisibleItemPosition();
            LinearLayoutManager linearLayoutManager3 = this.f315867ay;
            linearLayoutManager3.getClass();
            int findLastVisibleItemPosition2 = linearLayoutManager3.findLastVisibleItemPosition();
            if (findFirstVisibleItemPosition >= 0 && findLastVisibleItemPosition2 >= 0 && findFirstVisibleItemPosition <= mo100989aL() && findLastVisibleItemPosition2 <= mo100989aL()) {
                return mo100909dl() && (findFirstVisibleItemPosition == this.f315859aq.mo101124g() || findLastVisibleItemPosition2 < this.f315859aq.mo101122e(C108230ba.f301020h) + 1);
            }
        }
    }

    /* renamed from: A */
    public final void mo95359A(Context context, C51656n nVar) {
        boolean z;
        boolean z2;
        Context context2 = context;
        C51656n nVar2 = nVar;
        if (mo100907df()) {
            CharSequence charSequence = this.f315853ak.f315537z;
            if (charSequence != null && charSequence.toString().equals(nVar2.f134600b)) {
                C113926aa aaVar = this.f315853ak;
                aaVar.f315513b = nVar2;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(nVar2.f134600b);
                aaVar.f315537z = spannableStringBuilder;
                boolean isEmpty = nVar2.f134601c.isEmpty();
                for (C51655m mVar : nVar2.f134601c) {
                    int i = mVar.f134591a;
                    if (!((i & 1) == 0 || (i & 2) == 0)) {
                        int i2 = mVar.f134592b;
                        int min = Math.min(mVar.f134593c, spannableStringBuilder.length());
                        if (!TextUtils.isEmpty(aaVar.f315537z)) {
                            if (min <= i2) {
                                ((C59052c) ((C59052c) C113926aa.f315486a.mo56226d()).mo56372aa(28473)).mo56386p("#setHighlightSpan: Range is empty or negative.");
                            } else {
                                boolean isWhitespace = Character.isWhitespace(aaVar.f315537z.charAt(i2));
                                int i3 = i2 + 1;
                                while (i3 < min) {
                                    if (isWhitespace != Character.isWhitespace(aaVar.f315537z.charAt(i3))) {
                                        aaVar.mo100792p(spannableStringBuilder, i2, i3, mVar);
                                        isWhitespace = !isWhitespace;
                                        i2 = i3;
                                    }
                                    i3++;
                                }
                                if (i2 < i3) {
                                    aaVar.mo100792p(spannableStringBuilder, i2, i3, mVar);
                                }
                                z2 = true;
                                isEmpty |= z2;
                            }
                        }
                        z2 = false;
                        isEmpty |= z2;
                    }
                }
                if (nVar2.f134602d && isEmpty) {
                    aaVar.f315522k.ifPresent(C114084m.f316090a);
                    aaVar.f315536y = true;
                    if (aaVar.f315518g.isShown()) {
                        aaVar.mo100795s();
                    }
                }
                aaVar.mo100799w();
                return;
            }
            return;
        }
        int e = this.f315859aq.mo101122e(C108230ba.f301013a);
        C108232bc b = e >= 0 ? this.f315859aq.mo95352b(e) : null;
        if (b == null) {
            return;
        }
        if (b instanceof C108451je) {
            C108451je jeVar = (C108451je) b;
            String c = jeVar.mo96890c();
            if (c != null && c.toString().equals(nVar2.f134600b)) {
                jeVar.f301652F = true;
                jeVar.f301653G = nVar2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(nVar2.f134600b);
                jeVar.f301663e = spannableStringBuilder2;
                boolean isEmpty2 = nVar2.f134601c.isEmpty();
                for (C51655m mVar2 : nVar2.f134601c) {
                    int i4 = mVar2.f134591a;
                    if (!((i4 & 1) == 0 || (i4 & 2) == 0)) {
                        int i5 = mVar2.f134592b;
                        int min2 = Math.min(mVar2.f134593c, spannableStringBuilder2.length());
                        if (!TextUtils.isEmpty(jeVar.f301663e)) {
                            if (min2 <= i5) {
                                ((C59052c) ((C59052c) C108451je.f301649a.mo56226d()).mo56372aa(24057)).mo56386p("#setHighlightSpan: Range is empty or negative.");
                            } else {
                                boolean isWhitespace2 = Character.isWhitespace(jeVar.f301663e.charAt(i5));
                                int i6 = i5 + 1;
                                while (i6 < min2) {
                                    if (isWhitespace2 != Character.isWhitespace(jeVar.f301663e.charAt(i6))) {
                                        C108451je.m180274v(context2, spannableStringBuilder2, i5, i6, mVar2);
                                        isWhitespace2 = !isWhitespace2;
                                        i5 = i6;
                                    }
                                    i6++;
                                }
                                if (i5 < i6) {
                                    C108451je.m180274v(context2, spannableStringBuilder2, i5, i6, mVar2);
                                }
                                z = true;
                                isEmpty2 |= z;
                            }
                        }
                        z = false;
                        isEmpty2 |= z;
                    }
                }
                if (nVar2.f134602d && isEmpty2) {
                    jeVar.f301650D = true;
                }
                this.f315859aq.mo95354d(e);
                return;
            }
            return;
        }
        ((C59052c) ((C59052c) f315790j.mo56225c()).mo56372aa(28537)).mo56386p("Queried chatUiElement is not UserBubble - this should never occur.");
        throw new IllegalStateException();
    }

    /* renamed from: B */
    public final void mo95360B() {
        mo95424m().mo96864h();
    }

    /* renamed from: C */
    public final void mo95361C(List list) {
        if (!this.f315845ac) {
            C108426ig igVar = this.f315920cI;
            if (!mo95399aj() && igVar.f301584c) {
                list = C58485gu.m89845m();
            } else {
                C108426ig igVar2 = this.f315920cI;
                C58833ax j = C58833ax.m90833j(C87566i.m142238M(this.f315833aQ.getIntent().getExtras()));
                if (igVar2.f301583b.mo79746e(C90014bt.f247192cX) && j.mo56113h()) {
                    Iterator it = C58869cf.m90938d(",").mo56153g(igVar2.f301583b.mo79758x(C90014bt.f247082aT)).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals(j.mo56107c())) {
                                C58485gu guVar = (C58485gu) Collection.EL.stream(list).filter(C108425if.f301581a).collect(C58370cn.f155946a);
                                C59104x b = C108426ig.f301582a.mo56224b();
                                b.mo56378ag(C58975e.f156826a, "ValyrianSuggFilter");
                                ((C59052c) ((C59052c) b).mo56372aa(24049)).mo56393w("Non-COCA suggestions suppressed due to experiment [%d vs %d]", guVar.size(), list.size());
                                list = guVar;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            if (!this.f315835aS.f300678a) {
                C114095a aVar = this.f315859aq;
                boolean z = false;
                C108232bc b2 = aVar.mo95351a() > 0 ? aVar.mo95352b(0) : null;
                C108412ht m = this.f315859aq.mo101130m();
                boolean z2 = m188891er(b2) || m188894eu(b2);
                if (aVar.mo95351a() == 0 && m != null) {
                    z = true;
                }
                if (this.f315982r.mo79746e(C90014bt.f247788nk)) {
                    mo95406aq(list, true, 2, true);
                } else if ((aVar.mo95351a() == 0 && m == null) || ((z && m.f301034p != 2) || (aVar.mo95351a() == 1 && z2))) {
                    mo95406aq(list, true, 2, true);
                }
            }
        }
    }

    /* renamed from: D */
    public final void mo95362D() {
        if (this.f315851ai.mo96835a() <= 0) {
            C108412ht m = this.f315859aq.mo101130m();
            if (m != null) {
                for (C108430ik ikVar : Collections.unmodifiableList(m.f301530b.f301554a)) {
                    if (!(ikVar instanceof C108249bt)) {
                    }
                }
                return;
            }
            return;
        }
        mo100866bu();
    }

    /* renamed from: E */
    public final void mo95363E() {
    }

    /* renamed from: F */
    public final void mo95364F(boolean z) {
        C108303dt dtVar = this.f315819aC;
        if (dtVar != null && !dtVar.f301288s) {
            dtVar.f301285p = new C113967bm(this, z);
            dtVar.mo96755r();
        }
    }

    /* renamed from: G */
    public final void mo95365G() {
        ValyrianRecyclerView valyrianRecyclerView;
        C114132bj bjVar = this.f315856an;
        RecyclerView recyclerView = bjVar.f316352n;
        ValyrianRecyclerView valyrianRecyclerView2 = bjVar.f316351m;
        if (recyclerView != null) {
            recyclerView.post(new C113964bj(this));
        }
        if (this.f315844ab && (valyrianRecyclerView = this.f315866ax) != null) {
            valyrianRecyclerView.post(new C113965bk(this));
        } else if (valyrianRecyclerView2 != null) {
            valyrianRecyclerView2.post(new C113966bl(this));
        }
    }

    /* renamed from: H */
    public final void mo95366H() {
        C114754h hVar = this.f315820aD;
        if (hVar != null) {
            hVar.mo101423m();
        }
        this.f315957ct.f241687c.mo5679j(this.f315959cv);
        this.f315928cQ.mo85302b(this);
        this.f315931cT.mo76661a();
        this.f315932cU.mo76661a();
    }

    /* renamed from: I */
    public final void mo95367I() {
        C109037fg fgVar = this.f315911bu;
        if (fgVar != null) {
            fgVar.f303205a.f303341bv = false;
        }
    }

    /* renamed from: J */
    public final void mo95368J(long j, String str, String str2) {
        if (this.f315844ab) {
            LinearLayout linearLayout = this.f315986v;
            linearLayout.getClass();
            int i = linearLayout.getHeight() >= mo100986aI(false) ? 122846 : 122847;
            LinearLayout linearLayout2 = this.f315986v;
            linearLayout2.getClass();
            C28292j jVar = new C28292j(i);
            jVar.f76976d = true;
            C28295m.m52919e(linearLayout2, jVar);
            LinearLayout linearLayout3 = this.f315986v;
            linearLayout3.getClass();
            C89949q.m146521e(C28285c.m52874a(linearLayout3, i), false);
        }
        m188859dX(str);
        this.f315983s.mo96409v(j, str2);
        this.f315978n = false;
        this.f315963cz = BuildConfig.FLAVOR;
        this.f315912cA = 0;
        this.f315913cB = C58733pz.f156496a;
    }

    /* renamed from: K */
    public final void mo95369K(boolean z, long j, C58833ax axVar) {
        m188859dX(C22717u.m42330d(axVar));
        if (z && !this.f315830aN) {
            mo101014cD(false, true);
            if (!this.f315938ca.f315758a && m188868eC() && this.f315805O.f315775b != 3) {
                mo101010br();
            }
            if (mo100907df() && !this.f315835aS.f300678a && this.f315801K.f316068a.getVisibility() != 0 && this.f315805O.f315775b != 3) {
                mo100997bF();
            }
        }
        C60870cx cxVar = this.f315952co;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f315952co = null;
        }
        this.f315952co = this.f315815Y.mo28208h("onUiUpdated", 500, new C114002cl(this, j, axVar));
        C114150t tVar = this.f315848af;
        if (tVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            if (!tVar.mo101200j()) {
                tVar.mo101195e();
            }
        }
        this.f315957ct.mo83145s(C58836b.f156633a, 3);
    }

    /* renamed from: L */
    public final void mo95370L() {
        FrameLayout frameLayout = (FrameLayout) this.f315986v.findViewById(R.id.valyrian_chat_ui_root);
        if (frameLayout != null && this.f315866ax != null) {
            frameLayout.getLayoutParams().height = -1;
            ValyrianRecyclerView valyrianRecyclerView = this.f315866ax;
            valyrianRecyclerView.getClass();
            valyrianRecyclerView.getLayoutParams().height = -1;
        }
    }

    /* renamed from: M */
    public final void mo95371M(C2333ah ahVar) {
        this.f315862at.mo5705f(ahVar);
    }

    /* renamed from: N */
    public final void mo95372N(C108232bc bcVar) {
        this.f315859aq.mo101140w(bcVar);
    }

    /* renamed from: O */
    public final void mo95373O(List list) {
        C108412ht m = this.f315859aq.mo101130m();
        if (m != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C108430ik ikVar = (C108430ik) it.next();
                C108423id idVar = m.f301530b;
                int lastIndexOf = idVar.f301554a.lastIndexOf(ikVar);
                if (lastIndexOf >= 0) {
                    idVar.f301554a.remove(lastIndexOf);
                    idVar.notifyItemRemoved(lastIndexOf);
                    idVar.mo96865i();
                }
                if (ikVar instanceof C108249bt) {
                    m.f301529a.remove(((C108249bt) ikVar).f301136a);
                }
            }
            if (m.f301530b.mo96859b() == 0) {
                mo100866bu();
            }
        }
    }

    /* renamed from: P */
    public final void mo95374P() {
        mo100994aT().addOnScrollListener(((C113798bn) this.f315878bN.mo27525b()).mo24927i());
        if (this.f315982r.mo79746e(C90014bt.f247393gM) && this.f315888bX.mo56113h()) {
            boolean isDeviceLocked = ((C106171l) this.f315888bX.mo56107c()).f296304b.f230023b.isDeviceLocked();
            C58976aa aaVar = C58975e.f156826a;
            if (isDeviceLocked && !((C106171l) this.f315888bX.mo56107c()).mo95342f()) {
                this.f315856an.mo101173t(3);
                mo100864bq();
                mo100866bu();
                return;
            }
        }
        this.f315856an.f316352n.addOnScrollListener(((C113798bn) this.f315878bN.mo27525b()).mo24927i());
    }

    /* renamed from: Q */
    public final void mo95375Q(boolean z) {
        if (z) {
            mo100994aT().smoothScrollToPosition(mo100989aL());
            return;
        }
        mo100993aS().scrollToPositionWithOffset(this.f315859aq.mo95351a(), this.f315981q.getResources().getDimensionPixelOffset(R.dimen.suggestion_carousel_padding_top) + this.f315981q.getResources().getDimensionPixelOffset(R.dimen.interaction_container_min_height));
    }

    /* renamed from: R */
    public final void mo95376R(boolean z) {
        int i = 1;
        if (true != z) {
            i = 4;
        }
        mo100994aT().setImportantForAccessibility(i);
        this.f315986v.setImportantForAccessibility(i);
    }

    /* renamed from: S */
    public final void mo95377S() {
        this.f315947cj = true;
    }

    /* renamed from: T */
    public final void mo95378T() {
    }

    /* renamed from: U */
    public final void mo95379U(C108303dt dtVar) {
        this.f315819aC = dtVar;
        this.f315858ap.f301215b = dtVar;
        C114109an anVar = this.f315857ao;
        anVar.f316253b = this.f315819aC;
        C108308dy dyVar = anVar.f316252a;
        C108303dt dtVar2 = anVar.f316253b;
        if (dtVar2 != null) {
            dtVar2.f301284o = new C114108am(anVar);
        }
        if (dtVar != null && this.f315844ab && this.f315982r.mo79746e(C90014bt.f247617kY)) {
            if (!this.f315940cc || this.f315982r.mo79746e(C90029ch.f248257ar)) {
                dtVar.f301284o = new C114000cj(this, dtVar);
            }
        }
    }

    /* renamed from: V */
    public final void mo95380V(boolean z) {
        this.f315861as.mo5708l(Boolean.valueOf(z));
    }

    /* renamed from: W */
    public final void mo95381W(C58485gu guVar) {
        Optional optional = this.f315853ak.f315520i;
        if (optional.isPresent() && mo100906dc()) {
            C108395hc hcVar = this.f315851ai;
            hcVar.mo96838d();
            hcVar.f301488a.addAll(guVar);
            mo95431t(new C108398hf(this.f315851ai));
            this.f315851ai.mo96837c((ViewGroup) optional.get(), true);
            this.f315853ak.mo100797u();
            C113926aa aaVar = this.f315853ak;
            aaVar.mo100788l();
            aaVar.mo100784h();
        }
    }

    /* renamed from: X */
    public final void mo95382X(boolean z) {
        this.f315807Q = z;
    }

    /* renamed from: Y */
    public final void mo95383Y(boolean z) {
        this.f315890bZ = z;
    }

    /* renamed from: Z */
    public final void mo95384Z(boolean z) {
        C114066eb ebVar = this.f315805O;
        if (!ebVar.f315774a && z) {
            int i = ebVar.f315775b;
            if (i == 1) {
                ebVar.f315775b = 2;
            } else if (i == 2) {
                ebVar.f315775b = 3;
            }
        }
        if (!z) {
            ebVar.f315775b = 1;
        }
        ebVar.f315774a = z;
    }

    /* renamed from: a */
    public final void mo82032a(String str, View view, long j, String str2) {
        if (this.f315911bu != null) {
            this.f315862at.mo5708l(C108228az.IS_NOT_THINKING);
            m188857dV(str, view);
            C109037fg fgVar = this.f315911bu;
            if (fgVar != null) {
                C59071e eVar = C109040fj.f303210a;
                C58976aa aaVar = C58975e.f156826a;
                ((C113793bi) fgVar.f303205a.f303325bf.mo27525b()).mo100643c(fgVar.f303205a.f303449n, false);
                if (fgVar.f303205a.f303455t.mo79746e(C90014bt.f247760nI)) {
                    if (fgVar.f303205a.f303234T.mo95358d() != 3) {
                        fgVar.f303205a.mo97498bH(false, false, false, 2);
                    } else {
                        C110014a aVar = fgVar.f303205a.f303265aY;
                        if (aVar != null) {
                            aVar.mo98291a();
                        }
                    }
                    if (str2 != null) {
                        ((C113798bn) fgVar.f303205a.f303258aR.mo27525b()).mo24921c(new C19623a(7), new C19629c(str2));
                        C60321oe p = fgVar.f303205a.f303450o.mo95427p(C109040fj.m181410j(str2));
                        C109040fj fjVar = fgVar.f303205a;
                        fjVar.f303445j.mo100721a(j, fjVar.f303235U, p);
                        fgVar.f303205a.mo97436X(false);
                    }
                }
                fgVar.f303205a.mo97487aw();
            }
            if (this.f315982r.mo79746e(C90014bt.f247181cM)) {
                mo101018cR();
            }
        }
    }

    /* renamed from: aA */
    public final void mo95385aA() {
    }

    /* renamed from: aB */
    public final void mo95386aB() {
    }

    /* renamed from: aC */
    public final void mo95387aC() {
    }

    /* renamed from: aD */
    public final void mo95388aD() {
    }

    /* renamed from: aE */
    public final void mo95389aE() {
        this.f315850ah.mo96859b();
        boolean z = true;
        this.f315901bk = true;
        C114066eb ebVar = this.f315805O;
        if (!ebVar.f315774a) {
            ebVar.f315775b = 1;
        }
        ebVar.f315774a = false;
        this.f315806P = false;
        this.f315890bZ = false;
        this.f315807Q = false;
        this.f315862at.mo5708l(C108228az.IS_NOT_THINKING);
        this.f315904bn = null;
        if (this.f315982r.mo79746e(C90029ch.f248230aQ)) {
            m188853dR();
            int i = this.f315897bg;
            if (i != 0) {
                mo101040dt(this.f315896bf, i);
            }
            this.f315896bf = 0;
            this.f315897bg = 0;
            this.f315898bh = 0;
            C108262cf cfVar = (C108262cf) this.f315859aq.mo101127j(C108230ba.f301015c);
            if (cfVar != null && cfVar.f301168I) {
                this.f315859aq.mo101140w(cfVar);
            }
            if (this.f315982r.mo79746e(C90029ch.f248233aT)) {
                C114096aa aaVar = this.f315900bj;
                if (aaVar != null) {
                    aaVar.f316181c = true;
                    AnimatorSet animatorSet = aaVar.f316180b;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    for (View alpha : aaVar.f316184f) {
                        alpha.setAlpha(1.0f);
                    }
                    C60870cx cxVar = aaVar.f316185g;
                    if (cxVar != null) {
                        cxVar.cancel(false);
                        aaVar.f316185g = null;
                    }
                    this.f315900bj = null;
                }
                for (int a = this.f315859aq.mo95351a() - 1; a >= 0; a--) {
                    C108232bc b = this.f315859aq.mo95352b(a);
                    if (b instanceof C108325en) {
                        this.f315859aq.mo101140w(b);
                    }
                }
            }
        }
        if (mo101037dg() && !mo101038dk()) {
            ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView = this.f315865aw;
            valyrianDynamicResponseLayerView.getClass();
            int i2 = valyrianDynamicResponseLayerView.f316102c;
            if (i2 > mo100990aN()) {
                i2 = mo100986aI(false);
            }
            ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView2 = this.f315865aw;
            valyrianDynamicResponseLayerView2.getClass();
            C58976aa aaVar2 = C58975e.f156826a;
            valyrianDynamicResponseLayerView2.f316102c = i2;
            valyrianDynamicResponseLayerView2.requestLayout();
            ValyrianRecyclerView valyrianRecyclerView = this.f315866ax;
            valyrianRecyclerView.getClass();
            valyrianRecyclerView.f316112b = i2;
            FrameLayout frameLayout = (FrameLayout) this.f315986v.findViewById(R.id.valyrian_chat_ui_root);
            if (frameLayout != null && this.f315866ax != null && this.f315982r.mo79746e(C90029ch.f248275bi) && frameLayout.getLayoutParams().height == -1) {
                ValyrianRecyclerView valyrianRecyclerView2 = this.f315866ax;
                valyrianRecyclerView2.getClass();
                if (valyrianRecyclerView2.getLayoutParams().height == -1) {
                    frameLayout.getLayoutParams().height = -2;
                }
            }
        }
        if (this.f315848af != null && m188843dH() == -2) {
            C114150t tVar = this.f315848af;
            tVar.getClass();
            C58976aa aaVar3 = C58975e.f156826a;
            tVar.mo101192b();
            if (!tVar.mo101200j()) {
                ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView3 = tVar.f316435b;
                if (!(valyrianDynamicResponseLayerView3 == null || tVar.f316436c == null)) {
                    valyrianDynamicResponseLayerView3.getLayoutParams().height = -2;
                    View view = tVar.f316436c;
                    view.getClass();
                    view.getLayoutParams().height = -2;
                    ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView4 = tVar.f316435b;
                    valyrianDynamicResponseLayerView4.getClass();
                    valyrianDynamicResponseLayerView4.requestLayout();
                    ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView5 = tVar.f316435b;
                    valyrianDynamicResponseLayerView5.getClass();
                    valyrianDynamicResponseLayerView5.mo101053a(1);
                }
                tVar.mo101195e();
                tVar.f316450q = 0;
                tVar.mo101195e();
            }
        }
        if (m188897ex()) {
            this.f315932cU.mo76661a();
            this.f315933cV.mo76660b(0);
        }
        if (mo100906dc()) {
            mo100862bo(true);
        }
        C108423id idVar = this.f315850ah;
        if (idVar.mo96859b() <= 0) {
            z = false;
        }
        idVar.f301563j = z;
        C58976aa aaVar4 = C58975e.f156826a;
        idVar.mo96859b();
    }

    /* renamed from: aF */
    public final int mo100984aF() {
        return C91115n.m148871c(this.f315833aQ).width() - ((int) C91115n.m148870b((float) ((int) this.f315982r.mo79743a(C90029ch.f248228aO)), this.f315981q));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aG */
    public final int mo100985aG() {
        int i;
        if (!this.f315844ab) {
            i = C113987f.m188692c(this.f315982r) ? this.f315981q.getResources().getDimensionPixelSize(R.dimen.initial_position_placeholder_height) : this.f315988x.getHeight();
        } else {
            i = 0;
        }
        ViewGroup viewGroup = this.f315818aB;
        if (viewGroup != null) {
            i += viewGroup.getVisibility() == 0 ? this.f315818aB.getHeight() : 0;
        }
        for (int i2 = 0; i2 < this.f315859aq.mo95351a(); i2++) {
            C108232bc b = this.f315859aq.mo95352b(i2);
            if (b != null) {
                C108241bl m = b.mo96603m();
                i += m != null ? m.itemView.getHeight() : 0;
            }
        }
        C114076el elVar = this.f315801K;
        return (elVar == null || elVar.f316068a.getVisibility() != 0) ? i : i + this.f315801K.f316068a.getHeight();
    }

    /* renamed from: aH */
    public final int mo100835aH() {
        return mo100986aI(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01bd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01be A[RETURN] */
    /* renamed from: aI */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo100986aI(boolean r8) {
        /*
            r7 = this;
            boolean r0 = r7.f315940cc
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0065
            com.google.android.apps.gsa.search.core.i.t r0 = r7.f315982r
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247446hM
            boolean r0 = r0.mo79746e(r3)
            if (r0 == 0) goto L_0x0065
            dagger.a r0 = r7.f315958cu
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.bc r0 = (com.google.android.apps.gsa.staticplugins.opa.util.C113787bc) r0
            boolean r0 = r0.mo100629i(r2)
            if (r0 == 0) goto L_0x0065
            com.google.android.apps.gsa.search.core.i.t r0 = r7.f315982r
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247689lr
            long r3 = r0.mo79743a(r3)
            int r0 = (int) r3
            r3 = 2
            if (r0 != r3) goto L_0x0065
            int r0 = r7.f315880bP
            if (r0 != 0) goto L_0x0066
            android.view.LayoutInflater r0 = r7.f315876bL
            r3 = 2131626230(0x7f0e08f6, float:1.887969E38)
            android.view.View r0 = r0.inflate(r3, r1)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            r0.measure(r4, r3)
            int r0 = r0.getMeasuredHeight()
            android.content.Context r3 = r7.f315981q
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131171014(0x7f0716c6, float:1.7956403E38)
            int r3 = r3.getDimensionPixelSize(r4)
            int r0 = r0 + r3
            android.content.Context r3 = r7.f315981q
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131171015(0x7f0716c7, float:1.7956405E38)
            int r3 = r3.getDimensionPixelSize(r4)
            int r0 = r0 + r3
            r7.f315880bP = r0
            goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            com.google.android.apps.gsa.staticplugins.opa.fg r3 = r7.f315911bu
            if (r3 == 0) goto L_0x0079
            boolean r3 = r7.mo101043dx()
            if (r3 == 0) goto L_0x0079
            com.google.android.apps.gsa.staticplugins.opa.fg r0 = r7.f315911bu
            r0.getClass()
            int r0 = r0.mo97408a()
        L_0x0079:
            android.content.Context r3 = r7.f315981q
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131166633(0x7f0705a9, float:1.7947517E38)
            int r3 = r3.getDimensionPixelSize(r4)
            int r0 = java.lang.Math.max(r0, r3)
            if (r8 == 0) goto L_0x009d
            android.view.ViewGroup r8 = r7.f315988x
            if (r8 == 0) goto L_0x009d
            int r8 = r8.getVisibility()
            if (r8 != 0) goto L_0x009d
            android.view.ViewGroup r8 = r7.f315988x
            int r8 = r8.getHeight()
            int r0 = r0 + r8
        L_0x009d:
            com.google.android.apps.gsa.search.core.i.t r8 = r7.f315982r
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248276bj
            boolean r8 = r8.mo79746e(r3)
            r3 = 2131166634(0x7f0705aa, float:1.7947519E38)
            if (r8 == 0) goto L_0x0114
            android.view.ViewGroup r8 = r7.f315984t
            if (r8 == 0) goto L_0x00b5
            r1 = 2131434006(0x7f0b1a16, float:1.8489814E38)
            android.view.View r1 = r8.findViewById(r1)
        L_0x00b5:
            android.widget.FrameLayout r8 = r7.f315985u
            if (r8 == 0) goto L_0x0114
            if (r1 == 0) goto L_0x0114
            android.view.ViewGroup r8 = r7.f315984t
            int r8 = r8.getHeight()
            if (r8 != 0) goto L_0x00c4
            goto L_0x0114
        L_0x00c4:
            android.content.Context r8 = r7.f315981q
            android.content.res.Resources r8 = r8.getResources()
            int r8 = r8.getDimensionPixelSize(r3)
            int r4 = r1.getHeight()
            android.widget.FrameLayout r5 = r7.f315985u
            int r5 = r5.getPaddingBottom()
            int r4 = r4 - r5
            int r4 = r4 - r0
            android.view.View r5 = r7.m188847dL()
            if (r5 == 0) goto L_0x00fa
            android.view.View r5 = r7.m188847dL()
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L_0x00fa
            android.view.View r5 = r7.m188847dL()
            int r5 = r5.getHeight()
            int r4 = r4 - r5
            android.view.View r5 = r7.m188847dL()
            r5.getHeight()
        L_0x00fa:
            int r8 = java.lang.Math.min(r8, r4)
            com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148878j(r1)
            r1.getHeight()
            android.widget.FrameLayout r1 = r7.f315985u
            com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148878j(r1)
            android.widget.FrameLayout r1 = r7.f315985u
            r1.getHeight()
            android.widget.FrameLayout r1 = r7.f315985u
            r1.getPaddingBottom()
            goto L_0x0115
        L_0x0114:
            r8 = 0
        L_0x0115:
            boolean r1 = r7.f315979o
            if (r1 != 0) goto L_0x011e
            if (r8 == 0) goto L_0x011d
            goto L_0x01b7
        L_0x011d:
            r8 = 0
        L_0x011e:
            com.google.android.apps.gsa.staticplugins.opa.util.bo r1 = r7.f315987w
            android.util.DisplayMetrics r4 = new android.util.DisplayMetrics
            r4.<init>()
            android.content.Context r1 = r1.f315169a
            android.view.Display r1 = com.google.android.apps.gsa.staticplugins.opa.util.C113799bo.m188385b(r1)
            if (r1 == 0) goto L_0x0130
            r1.getRealMetrics(r4)
        L_0x0130:
            int r1 = r4.heightPixels
            int r1 = r1 - r0
            android.view.View r0 = r7.m188847dL()
            if (r0 == 0) goto L_0x014c
            android.view.View r0 = r7.m188847dL()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x014c
            android.view.View r0 = r7.m188847dL()
            int r0 = r0.getHeight()
            int r1 = r1 - r0
        L_0x014c:
            android.widget.FrameLayout r0 = r7.f315985u
            if (r0 == 0) goto L_0x0155
            int r0 = r0.getPaddingBottom()
            int r1 = r1 - r0
        L_0x0155:
            android.content.Context r0 = r7.f315981q
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r4 = "status_bar_height"
            java.lang.String r5 = "dimen"
            java.lang.String r6 = "android"
            int r0 = r0.getIdentifier(r4, r5, r6)
            if (r0 <= 0) goto L_0x0172
            android.content.Context r4 = r7.f315981q
            android.content.res.Resources r4 = r4.getResources()
            int r0 = r4.getDimensionPixelSize(r0)
            goto L_0x0173
        L_0x0172:
            r0 = 0
        L_0x0173:
            int r1 = r1 - r0
            android.content.Context r0 = r7.f315981q
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r4 = "navigation_bar_height"
            int r4 = r0.getIdentifier(r4, r5, r6)
            if (r4 <= 0) goto L_0x0186
            int r2 = r0.getDimensionPixelSize(r4)
        L_0x0186:
            android.content.Context r0 = r7.f315981q
            android.content.res.Resources r4 = r0.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.smallestScreenWidthDp
            android.util.DisplayMetrics r5 = com.google.android.apps.gsa.staticplugins.opa.util.C113799bo.m188384a(r0)
            int r5 = r5.widthPixels
            android.util.DisplayMetrics r0 = com.google.android.apps.gsa.staticplugins.opa.util.C113799bo.m188384a(r0)
            int r0 = r0.heightPixels
            if (r5 == r0) goto L_0x01a5
            r6 = 600(0x258, float:8.41E-43)
            if (r4 < r6) goto L_0x01a5
            goto L_0x01a8
        L_0x01a5:
            if (r5 < r0) goto L_0x01a8
            goto L_0x01a9
        L_0x01a8:
            int r1 = r1 - r2
        L_0x01a9:
            android.content.Context r0 = r7.f315981q
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getDimensionPixelSize(r3)
            int r2 = java.lang.Math.min(r1, r0)
        L_0x01b7:
            if (r8 <= 0) goto L_0x01be
            boolean r0 = r7.f315979o
            if (r0 != 0) goto L_0x01be
            return r8
        L_0x01be:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.C114071eg.mo100986aI(boolean):int");
    }

    /* renamed from: aJ */
    public final int mo100987aJ() {
        return C109230d.m181787a(this.f315982r.mo79743a(C90014bt.f247294eT)).f304164k;
    }

    /* renamed from: aK */
    public final int mo100988aK() {
        int i = 0;
        if (this.f315853ak.mo100574c() && (this.f315853ak.mo100802z() || this.f315853ak.f315517f.isShown() || mo100907df())) {
            i = this.f315853ak.mo100573b();
        }
        C108473k kVar = this.f315853ak.f315519h;
        return (!this.f315982r.mo79746e(C90014bt.f247609kQ) || i == 0 || kVar == null || !kVar.f301711e) ? i : this.f315981q.getResources().getDimensionPixelOffset(R.dimen.interaction_container_min_height_with_app_search_carousel);
    }

    /* renamed from: aL */
    public final int mo100989aL() {
        return this.f315859aq.mo101125h();
    }

    /* renamed from: aN */
    public final int mo100990aN() {
        return mo100986aI(false) + Math.max((!this.f315940cc || !this.f315982r.mo79746e(C90014bt.f247446hM) || !((C113787bc) this.f315958cu.mo27525b()).mo100629i(false) || this.f315982r.mo79743a(C90014bt.f247689lr) != 2) ? 0 : this.f315880bP, this.f315981q.getResources().getDimensionPixelSize(R.dimen.chatui_dynamic_response_layer_full_height_top_margin));
    }

    /* renamed from: aO */
    public final int mo100991aO(bf bfVar) {
        return bfVar.h - this.f315800J.mo75535a();
    }

    /* renamed from: aP */
    public final AnimatorSet mo100836aP() {
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder play = animatorSet.play(this.f315801K.mo101044m(this.f315808R));
        View view = this.f315813W;
        if (view != null) {
            play.with(this.f315801K.mo101044m(view));
        }
        View view2 = this.f315810T;
        if (view2 != null) {
            play.with(this.f315801K.mo101044m(view2));
        }
        View view3 = this.f315812V;
        if (view3 != null) {
            play.with(this.f315801K.mo101044m(view3));
        }
        return animatorSet;
    }

    /* renamed from: aQ */
    public final AnimatorSet mo100837aQ() {
        View view;
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.f315988x.getVisibility() != 0) {
            return animatorSet;
        }
        C114076el elVar = this.f315801K;
        if (this.f315808R.getVisibility() == 0 || !this.f315832aP) {
            view = this.f315808R;
        } else {
            view = this.f315809S;
        }
        AnimatorSet.Builder play = animatorSet.play(elVar.mo101045n(view));
        View view2 = this.f315813W;
        if (view2 != null) {
            play.with(this.f315801K.mo101045n(view2));
        }
        View view3 = this.f315810T;
        if (view3 != null) {
            play.with(this.f315801K.mo101045n(view3));
        }
        View view4 = this.f315812V;
        if (view4 != null) {
            play.with(this.f315801K.mo101045n(view4));
        }
        return animatorSet;
    }

    /* renamed from: aR */
    public final ValueAnimator mo100992aR(View view, int i, Animator.AnimatorListener animatorListener) {
        int max = Math.max(0, view.getHeight());
        ObjectAnimator ofInt = ObjectAnimator.ofInt(view, "minimumHeight", new int[]{max, this.f315825aI});
        ofInt.addListener(animatorListener);
        ofInt.setDuration((long) ((Math.abs(max - i) * 600) / C113799bo.m188384a(this.f315981q).heightPixels));
        ofInt.start();
        return ofInt;
    }

    /* renamed from: aS */
    public final LinearLayoutManager mo100993aS() {
        if (!mo101037dg()) {
            return this.f315856an.f316343e;
        }
        LinearLayoutManager linearLayoutManager = this.f315867ay;
        linearLayoutManager.getClass();
        return linearLayoutManager;
    }

    /* renamed from: aT */
    public final RecyclerView mo100994aT() {
        FrameLayout frameLayout = (FrameLayout) this.f315986v.findViewById(R.id.valyrian_chat_ui_root);
        return frameLayout != null ? (RecyclerView) frameLayout.findViewById(R.id.dynamic_response_container) : this.f315856an.f316351m;
    }

    /* renamed from: aU */
    public final View mo100838aU() {
        if (!this.f315889bY) {
            return null;
        }
        View view = this.f315813W;
        if (view == null) {
            C109248v vVar = this.f315804N;
            if (vVar.f304208a.mo79746e(C90014bt.f247298eX)) {
                C90730an.m148190c(vVar.f304209b, C109247u.f304207a);
            }
            view = this.f315876bL.inflate(R.layout.valyrian_explore_icon_view, this.f315879bO, false);
            ImageView imageView = (ImageView) view.findViewById(R.id.explore_icon);
            this.f315836aT.clear();
            mo101031cu(imageView);
            view.setOnClickListener(new C89943l(new C113948aw(this, imageView)));
            view.setOnTouchListener(new C113960bf(imageView));
            view.setTag("EXPLORE_ICON_TAG");
            this.f315879bO.addView(view);
            if (this.f315832aP) {
                view.getLayoutParams().height = this.f315981q.getResources().getDimensionPixelSize(R.dimen.dm_explore_icon_container_height);
            }
            this.f315984t.findViewById(R.id.opa_menu).setVisibility(8);
            view.getClass();
            C28292j jVar = new C28292j(59039);
            jVar.mo33795i(5);
            C28295m.m52919e(view, jVar);
            this.f315813W = view;
        }
        return view;
    }

    /* renamed from: aV */
    public final View mo100839aV() {
        return this.f315876bL.inflate(R.layout.search_plate_shadow, (ViewGroup) null);
    }

    /* renamed from: aW */
    public final View mo100840aW() {
        return this.f315810T;
    }

    /* renamed from: aX */
    public final /* synthetic */ ViewGroup mo100841aX() {
        return this.f315856an.f316352n;
    }

    /* renamed from: aY */
    public final ViewGroup mo100995aY() {
        FrameLayout frameLayout = (FrameLayout) this.f315986v.findViewById(R.id.valyrian_chat_ui_root);
        return frameLayout != null ? frameLayout : this.f315856an.f316350l;
    }

    /* renamed from: aZ */
    public final FrameLayout mo100996aZ() {
        if (this.f315881bQ == null) {
            this.f315881bQ = (FrameLayout) this.f315984t.findViewById(R.id.opa_nga_container);
        }
        return this.f315881bQ;
    }

    /* renamed from: aa */
    public final void mo95390aa(boolean z) {
        this.f315806P = z;
    }

    /* renamed from: ab */
    public final void mo95391ab(C108237bh bhVar) {
        this.f315864av = bhVar;
        this.f315850ah.f301555b = bhVar;
        this.f315859aq.mo101115A(this.f315864av);
        C114076el elVar = this.f315801K;
        if (C114076el.m189143o(elVar.f316073f)) {
            elVar.f316068a.setBackgroundColor(bhVar.mo96643P());
        }
    }

    /* renamed from: ac */
    public final void mo95392ac(C108228az azVar) {
        this.f315862at.mo5708l(azVar);
    }

    /* renamed from: ad */
    public final void mo95393ad() {
        C108303dt dtVar = this.f315819aC;
        if (dtVar != null) {
            this.f315830aN = false;
            new C90873ag(dtVar.f301286q, this.f315815Y, "ValyrianChatUi:showDrlChatHistory", new C113951az(this)).mo85223a(C113955ba.f315585a);
        }
    }

    /* renamed from: ae */
    public final void mo95394ae(String str) {
        View view = this.f315846ad;
        if (view == null) {
            this.f315846ad = ((ViewStub) this.f315984t.findViewById(R.id.opa_snackbar_view_stub)).inflate();
        } else {
            view.setVisibility(0);
        }
        this.f315846ad.bringToFront();
        try {
            Snackbar q = Snackbar.m79661q((Context) null, this.f315846ad.findViewById(R.id.opa_snackbar_indicator), str, -1);
            ((TextView) q.f117089j.findViewById(R.id.snackbar_text)).setTextAlignment(4);
            q.mo48343h();
        } catch (IllegalArgumentException e) {
            ((C59052c) ((C59052c) ((C59052c) f315790j.mo56225c()).mo56382g(e)).mo56372aa(28595)).mo56386p("Failed to show snackbar, suitable parent view is missing.");
        }
    }

    /* renamed from: af */
    public final void mo95395af() {
        C113926aa aaVar = this.f315853ak;
        aaVar.f315523l.ifPresent(new C114017d(aaVar));
    }

    /* renamed from: ag */
    public final void mo95396ag() {
        mo100994aT().stopScroll();
    }

    /* renamed from: ah */
    public final void mo95397ah(long j, String str) {
        C108395hc hcVar = this.f315851ai;
        hcVar.f301493f = j;
        hcVar.f301492e = str;
    }

    /* renamed from: ai */
    public final boolean mo95398ai() {
        ValyrianRecyclerView valyrianRecyclerView = this.f315866ax;
        if (valyrianRecyclerView == null) {
            return false;
        }
        int minimumHeight = valyrianRecyclerView.getMinimumHeight();
        int aI = mo100986aI(true);
        return minimumHeight == aI || minimumHeight == aI - this.f315988x.getHeight();
    }

    /* renamed from: aj */
    public final boolean mo95399aj() {
        return this.f315985u.getLayoutParams().height == -1;
    }

    /* renamed from: ak */
    public final boolean mo95400ak() {
        Boolean bool = (Boolean) this.f315861as.mo3842a();
        return bool != null && bool.booleanValue();
    }

    /* renamed from: al */
    public final boolean mo95401al() {
        return false;
    }

    /* renamed from: am */
    public final boolean mo95402am() {
        return false;
    }

    /* renamed from: an */
    public final boolean mo95403an(C108262cf cfVar) {
        if (!this.f315806P) {
            return false;
        }
        int e = this.f315859aq.mo101122e(C108230ba.f301015c);
        C108232bc b = e >= 0 ? this.f315859aq.mo95352b(e) : null;
        if (!(b instanceof C108262cf) || ((C108262cf) b).mo96717x()) {
            return false;
        }
        this.f315859aq.mo101143z(e, cfVar);
        m188854dS(cfVar);
        mo101018cR();
        return true;
    }

    /* renamed from: ao */
    public final boolean mo95404ao() {
        return this.f315890bZ;
    }

    /* renamed from: ap */
    public final boolean mo95405ap() {
        return false;
    }

    /* renamed from: aq */
    public final C108412ht mo95406aq(List list, boolean z, int i, boolean z2) {
        C108412ht l = this.f315859aq.mo101129l(list, z, z2);
        this.f315853ak.f315516e.mLayout.scrollToPosition(0);
        if (this.f315856an.mo101172s() == 3 || this.f315856an.f316355q == 2) {
            if (mo100907df()) {
                mo101013cB();
            } else {
                C113926aa aaVar = this.f315853ak;
                aaVar.f315530s.addListener(new C114003cm(this));
                C114034q.m188811g(aaVar.f315518g, aaVar.f315529r, aaVar.f315530s);
                aaVar.mo100785i();
            }
        }
        this.f315983s.mo96412y(i);
        this.f315850ah.mo96867m(false);
        C108423id idVar = this.f315850ah;
        idVar.f301563j = false;
        C58976aa aaVar2 = C58975e.f156826a;
        idVar.mo96859b();
        return l;
    }

    /* renamed from: ar */
    public final void mo95407ar() {
    }

    /* renamed from: as */
    public final void mo95408as(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C108430ik ikVar = (C108430ik) it.next();
            if (ikVar.f301618y) {
                if (this.f315982r.mo79746e(C90029ch.f248241ab)) {
                    ikVar.f301614u = true;
                    ikVar.f301597d.mo33794h(3);
                }
                arrayList.add(ikVar);
            }
        }
        if (mo100907df() && this.f315982r.mo79746e(C90029ch.f248243ad)) {
            if (!arrayList.isEmpty()) {
                C108430ik ikVar2 = (C108430ik) arrayList.get(0);
                C113926aa aaVar = this.f315853ak;
                if (aaVar.f315532u && aaVar.f315520i.isPresent()) {
                    ikVar2.f301604k = e.u;
                    ikVar2.f301605l = QueryTriggerType.OPA_CORRECTION_CHIP;
                    if (aaVar.f315521j.isEmpty()) {
                        ViewGroup viewGroup = (ViewGroup) aaVar.f315520i.get();
                        ViewGroup viewGroup2 = (ViewGroup) aaVar.f315525n.inflate(R.layout.opa_correction_container, viewGroup, false);
                        aaVar.f315521j = Optional.m71637of(viewGroup2);
                        viewGroup.addView(viewGroup2, 0);
                        if (aaVar.f315532u) {
                            aaVar.f315521j.ifPresent(new C114061e(aaVar));
                        }
                    }
                    C89949q.m146521e(C28285c.m52874a((View) aaVar.f315521j.get(), 129794), false);
                    TextView textView = (TextView) ((ViewGroup) aaVar.f315521j.get()).findViewById(R.id.correction_content);
                    String f = ikVar2.mo96708f();
                    if (!TextUtils.isEmpty(f)) {
                        textView.setText(f);
                        C28292j jVar = ikVar2.f301597d;
                        jVar.mo33795i(5);
                        C28295m.m52919e(textView, jVar);
                        textView.setOnClickListener(new C89943l(new C113981c(aaVar, ikVar2)));
                        textView.setAlpha(1.0f);
                        textView.setClickable(true);
                    }
                }
                this.f315853ak.mo100797u();
                C113926aa aaVar2 = this.f315853ak;
                aaVar2.mo100788l();
                aaVar2.mo100784h();
            }
            list.removeAll(arrayList);
        }
        mo95406aq(list, false, 3, false);
    }

    /* renamed from: at */
    public final C108232bc mo95409at() {
        return null;
    }

    /* renamed from: au */
    public final void mo95410au() {
        C108232bc b;
        int e = this.f315859aq.mo101122e(C108230ba.f301018f);
        if (e >= 0 && (b = this.f315859aq.mo95352b(e)) != null) {
            this.f315859aq.mo101140w(b);
        }
    }

    /* renamed from: av */
    public final void mo95411av() {
    }

    /* renamed from: aw */
    public final void mo95412aw() {
    }

    /* renamed from: ax */
    public final void mo95413ax() {
    }

    /* renamed from: ay */
    public final void mo95414ay() {
    }

    /* renamed from: az */
    public final void mo95415az() {
    }

    /* renamed from: b */
    public final void mo82033b(String str, View view, long j, String str2) {
        if (this.f315856an.mo101172s() == 3 && this.f315911bu != null) {
            m188857dV(str, view);
            C109037fg fgVar = this.f315911bu;
            if (fgVar != null) {
                C59071e eVar = C109040fj.f303210a;
                C58976aa aaVar = C58975e.f156826a;
                if (fgVar.f303205a.f303455t.mo79746e(C90014bt.f247760nI) && str2 != null) {
                    C60321oe p = fgVar.f303205a.f303450o.mo95427p(C109040fj.m181410j(str2));
                    C109040fj fjVar = fgVar.f303205a;
                    fjVar.f303445j.mo100721a(j, fjVar.f303235U, p);
                    fgVar.f303205a.mo97436X(false);
                }
            }
        }
    }

    /* renamed from: bA */
    public final void mo100842bA() {
        if (!this.f315982r.mo79746e(C90063do.f249383cW) || this.f315983s.mo96406s() || !mo101037dg()) {
            this.f315986v.setVisibility(8);
        } else {
            OpaWebView opaWebView = this.f315824aH;
            if (opaWebView != null) {
                opaWebView.setVisibility(8);
            }
            ValyrianRecyclerView valyrianRecyclerView = this.f315866ax;
            valyrianRecyclerView.getClass();
            valyrianRecyclerView.setVisibility(8);
        }
        this.f315853ak.mo100786j(true);
    }

    /* renamed from: bB */
    public final void mo100843bB() {
        this.f315853ak.mo100789m();
    }

    /* renamed from: bC */
    public final void mo100844bC(boolean z) {
        TextView textView = this.f315791A;
        if (textView != null && textView.getVisibility() == 0) {
            Animator animator = this.f315798H;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f315795E;
            animator2.getClass();
            if (!animator2.isStarted()) {
                if (z) {
                    TextView textView2 = this.f315791A;
                    textView2.getClass();
                    textView2.setVisibility(8);
                    return;
                }
                Animator animator3 = this.f315795E;
                animator3.getClass();
                animator3.start();
            }
        }
    }

    /* renamed from: bD */
    public final void mo100845bD() {
        ObjectAnimator objectAnimator;
        if (this.f315791A == null) {
            this.f315791A = (TextView) this.f315876bL.inflate(R.layout.zero_state_discovery_text_hint, this.f315984t, false);
            if (this.f315982r.mo79746e(C90080ee.f249813l)) {
                TextView textView = this.f315791A;
                textView.getClass();
                textView.setText(R.string.snapshot_hint_text);
            }
            ViewGroup viewGroup = this.f315984t;
            TextView textView2 = this.f315791A;
            textView2.getClass();
            viewGroup.addView(textView2);
            TextView textView3 = this.f315791A;
            if (textView3 == null) {
                objectAnimator = null;
            } else {
                objectAnimator = ObjectAnimator.ofFloat(textView3, View.ALPHA, new float[]{1.0f, 0.0f});
                objectAnimator.setDuration(80);
                objectAnimator.setInterpolator(f315785bv);
                objectAnimator.addListener(new C114016cz(this));
            }
            this.f315795E = objectAnimator;
        }
    }

    /* renamed from: bE */
    public final void mo100846bE(String str) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (this.f315793C == null) {
            View inflate = this.f315876bL.inflate(R.layout.opa_finish_setup_bar_v2, this.f315984t, false);
            this.f315793C = inflate;
            this.f315984t.addView(inflate);
            View view = this.f315793C;
            view.getClass();
            C1773f fVar = (C1773f) view.getLayoutParams();
            int id = this.f315985u.getId();
            fVar.f5534l = null;
            fVar.f5533k = null;
            fVar.f5528f = id;
            fVar.f5526d = 1;
            View view2 = this.f315793C;
            view2.getClass();
            C28292j jVar = new C28292j(111814);
            jVar.mo33795i(5);
            C28295m.m52919e(view2, jVar);
            C89949q.m146521e(C28285c.m52874a(this.f315793C, 1226), false);
            View view3 = this.f315793C;
            view3.getClass();
            view3.setOnClickListener(new C89943l(new C113971bq(this)));
            if (this.f315940cc) {
                mo101019cT(str);
            } else {
                this.f315816Z.mo28212l("Check if entry point promo is available", new C113972br(this, str));
            }
        }
        View view4 = this.f315793C;
        if (view4 == null) {
            objectAnimator = null;
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view4, View.ALPHA, new float[]{1.0f});
            objectAnimator.addListener(new C114011cu(this));
        }
        this.f315796F = objectAnimator;
        View view5 = this.f315793C;
        if (view5 != null) {
            objectAnimator2 = ObjectAnimator.ofFloat(view5, View.ALPHA, new float[]{0.0f});
            objectAnimator2.addListener(new C114012cv(this));
        }
        this.f315797G = objectAnimator2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bF */
    public final void mo100997bF() {
        C108232bc bcVar = null;
        for (int i = 0; i < this.f315859aq.mo95351a(); i++) {
            bcVar = this.f315859aq.mo95352b(i);
            if (!(bcVar instanceof C108451je) || ((C108451je) bcVar).f301664f) {
                break;
            }
        }
        if (bcVar == null || !m188863di(bcVar)) {
            C108262cf cfVar = new C108262cf(1, 4);
            cfVar.f301176f = true;
            cfVar.mo96712f();
            cfVar.f301177g = true;
            cfVar.mo96714u();
            this.f315859aq.mo101134q(cfVar, 0);
        }
    }

    /* renamed from: bG */
    public final void mo100998bG(int i) {
        if (!this.f315982r.mo79746e(C90014bt.f247212cr)) {
            mo100995aY().setMinimumHeight(i);
        } else if (this.f315825aI != i || this.f315826aJ == null) {
            this.f315825aI = i;
            ValueAnimator valueAnimator = this.f315826aJ;
            if (valueAnimator == null || !valueAnimator.isStarted()) {
                ViewGroup aY = mo100995aY();
                int i2 = this.f315825aI;
                this.f315826aJ = mo100992aR(aY, i2, new C114070ef(this, i2));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0 = r5.f315801K;
     */
    /* renamed from: bH */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo100847bH() {
        /*
            r5 = this;
            com.google.android.apps.gsa.staticplugins.nga.ui.b.a r0 = r5.f315973dj
            boolean r0 = r0.mo93971b()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.el r0 = r5.f315801K
            android.view.View r1 = r0.f316069b
            if (r1 != 0) goto L_0x0010
            return
        L_0x0010:
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            android.widget.RelativeLayout r2 = r0.f316072e
            if (r2 == 0) goto L_0x006a
            com.google.android.apps.gsa.now.shared.ui.WebImageView r2 = r0.f316070c
            if (r2 == 0) goto L_0x006a
            android.widget.TextView r0 = r0.f316071d
            if (r0 != 0) goto L_0x001f
            goto L_0x006a
        L_0x001f:
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.app.Activity r2 = r5.f315833aQ
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r3 = 16842801(0x1010031, float:2.3693695E-38)
            r4 = 1
            r2.resolveAttribute(r3, r0, r4)
            int r2 = r0.type
            r3 = 28
            if (r2 < r3) goto L_0x006a
            int r2 = r0.type
            r3 = 31
            if (r2 > r3) goto L_0x006a
            int r0 = r0.data
            com.google.android.apps.gsa.staticplugins.opa.valyrian.el r2 = r5.f315801K
            android.widget.RelativeLayout r2 = r2.f316072e
            r2.setBackgroundColor(r0)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.el r2 = r5.f315801K
            com.google.android.apps.gsa.now.shared.ui.WebImageView r2 = r2.f316070c
            r2.setBackgroundColor(r0)
            r1.setBackgroundColor(r0)
            android.app.Activity r0 = r5.f315833aQ
            r2 = 2130969128(0x7f040228, float:1.754693E38)
            int r0 = com.google.android.libraries.assistant.p1614t.C19391a.m36980a(r0, r2)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.el r2 = r5.f315801K
            android.widget.TextView r2 = r2.f316071d
            r2.setTextColor(r0)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.el r2 = r5.f315801K
            com.google.android.apps.gsa.now.shared.ui.WebImageView r2 = r2.f316070c
            r2.setColorFilter(r0)
            r1.setColorFilter(r0)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.C114071eg.mo100847bH():void");
    }

    /* renamed from: bI */
    public final void mo100999bI() {
        Animator animator;
        if (this.f315818aB != null && (animator = this.f315868az) != null && this.f315817aA != null) {
            animator.cancel();
            if (!this.f315817aA.isStarted() && !this.f315818aB.isShown()) {
                this.f315817aA.start();
            }
        }
    }

    /* renamed from: bJ */
    public final void mo100848bJ(boolean z) {
        if (m188886em()) {
            this.f315853ak.mo100796t(z);
            mo101022ce();
        }
    }

    /* renamed from: bK */
    public final void mo100849bK(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent != null && motionEvent2 != null && mo100906dc()) {
            if (motionEvent2.getActionMasked() == 3 || motionEvent2.getActionMasked() == 1) {
                this.f315874bJ = false;
                this.f315873bI = true;
            } else if (!this.f315874bJ) {
                if (this.f315873bI) {
                    this.f315873bI = false;
                    if (Math.abs(f2) < Math.abs(f)) {
                        this.f315874bJ = true;
                        return;
                    }
                }
                float y = motionEvent.getY() - motionEvent2.getY();
                if (m188899ez(y, true)) {
                    mo101032dC(true);
                } else if (m188899ez(y, false)) {
                    mo101032dC(false);
                }
            }
        }
    }

    /* renamed from: bL */
    public final void mo101000bL() {
        if ((this.f315856an.mo101172s() == 3 || !this.f315832aP) && !this.f315844ab) {
            this.f315856an.mo101173t(4);
        }
    }

    /* renamed from: bM */
    public final void mo101001bM() {
        ValyrianRecyclerView valyrianRecyclerView;
        C114132bj bjVar = this.f315856an;
        RecyclerView recyclerView = bjVar.f316352n;
        ValyrianRecyclerView valyrianRecyclerView2 = bjVar.f316351m;
        if (recyclerView != null) {
            recyclerView.post(new C113935aj(this));
        }
        if (this.f315844ab && (valyrianRecyclerView = this.f315866ax) != null) {
            valyrianRecyclerView.post(new C113946au(this));
        } else if (valyrianRecyclerView2 != null) {
            valyrianRecyclerView2.post(new C113959be(this));
        }
    }

    /* renamed from: bN */
    public final void mo101002bN(boolean z) {
        int e;
        if (z && mo100907df()) {
            return;
        }
        if ((C113987f.m188691b(this.f315982r) || m188868eC()) && (e = this.f315859aq.mo101122e(C108230ba.f301014b)) >= 0) {
            C108232bc b = this.f315859aq.mo95352b(e);
            if (b instanceof C108451je) {
                C108451je jeVar = (C108451je) b;
                if (jeVar.f301664f != z) {
                    jeVar.f301664f = z;
                    mo101018cR();
                    this.f315859aq.mo95354d(e);
                    mo100994aT().getViewTreeObserver().addOnGlobalLayoutListener(new C113999ci(this));
                }
            }
        }
    }

    /* renamed from: bO */
    public final void mo101003bO() {
        if (this.f315794D != null && !this.f315983s.mo96407t()) {
            View view = this.f315794D;
            view.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int height = this.f315985u.getHeight() + this.f315981q.getResources().getDimensionPixelSize(R.dimen.opa_finish_setup_bar_v2_margin_bottom);
            View view2 = this.f315794D;
            view2.getClass();
            if (view2.getHeight() + height >= this.f315984t.getHeight()) {
                m188874ea();
                return;
            }
            marginLayoutParams.bottomMargin = height;
            View view3 = this.f315794D;
            view3.getClass();
            view3.requestLayout();
            m188881eh();
        }
    }

    /* renamed from: bP */
    public final void mo101004bP() {
        if (this.f315940cc) {
            if (this.f315983s.mo96407t()) {
                this.f315985u.requestApplyInsets();
                return;
            }
            int a = mo101041du() ? this.f315800J.mo75535a() : 0;
            if (a != this.f315985u.getPaddingBottom()) {
                FrameLayout frameLayout = this.f315985u;
                frameLayout.setPadding(frameLayout.getPaddingLeft(), this.f315985u.getPaddingTop(), this.f315985u.getPaddingRight(), a);
            }
        }
    }

    /* renamed from: bQ */
    public final void mo100850bQ(int i) {
        TextView textView = this.f315791A;
        if (textView != null) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = i;
            textView.requestLayout();
        }
    }

    /* renamed from: bR */
    public final void mo100851bR() {
        mo101034dE(this.f315856an.mo101172s());
    }

    /* renamed from: bS */
    public final void mo101005bS(C108451je jeVar) {
        if (mo100907df()) {
            jeVar.f301664f = false;
            C114095a aVar = this.f315859aq;
            aVar.mo95354d(aVar.mo101122e(C108230ba.f301013a));
            mo100997bF();
            String c = jeVar.mo96890c();
            C113926aa aaVar = this.f315853ak;
            this.f315905bo = aaVar.f315537z;
            aaVar.mo100793q(C58837ba.m90858g(c));
        }
    }

    /* renamed from: bT */
    public final void mo100852bT(Configuration configuration) {
        this.f315979o = true;
        if (this.f315844ab) {
            if (this.f315983s.mo96407t()) {
                this.f315859aq.mo101138u();
                int dH = m188843dH();
                if (!mo101039dm()) {
                    this.f315984t.setPaddingRelative(0, 0, 0, 0);
                } else {
                    int aF = mo100984aF();
                    if (aF > 0 && dH == -1) {
                        this.f315984t.setPaddingRelative(aF, 0, 0, 0);
                        if (this.f315853ak.mo100802z()) {
                            this.f315853ak.f315516e.mLayout.scrollToPosition(0);
                        }
                    }
                }
                m188871eF((ViewGroup) this.f315985u.findViewById(R.id.dynamic_response_container), dH);
                m188871eF((ViewGroup) this.f315985u.findViewById(R.id.valyrian_chat_ui_root), dH);
                m188871eF(this.f315986v, dH);
                m188871eF(this.f315985u, dH);
                if (dH == -2) {
                    int aI = mo100986aI(false);
                    ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView = this.f315865aw;
                    valyrianDynamicResponseLayerView.getClass();
                    C58976aa aaVar = C58975e.f156826a;
                    valyrianDynamicResponseLayerView.f316102c = aI;
                    valyrianDynamicResponseLayerView.requestLayout();
                    m188858dW(1);
                    ValyrianRecyclerView valyrianRecyclerView = this.f315866ax;
                    valyrianRecyclerView.getClass();
                    valyrianRecyclerView.f316112b = aI;
                    if (mo100910dn()) {
                        mo100995aY().setMinimumHeight(aI);
                    }
                } else {
                    m188858dW(2);
                    mo100916dy(2);
                }
                if (dH == -2) {
                    int aI2 = mo100986aI(false);
                    ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView2 = this.f315865aw;
                    valyrianDynamicResponseLayerView2.getClass();
                    C58976aa aaVar2 = C58975e.f156826a;
                    valyrianDynamicResponseLayerView2.f316102c = aI2;
                    valyrianDynamicResponseLayerView2.requestLayout();
                    m188858dW(1);
                    ValyrianRecyclerView valyrianRecyclerView2 = this.f315866ax;
                    valyrianRecyclerView2.getClass();
                    valyrianRecyclerView2.f316112b = aI2;
                    if (mo100910dn()) {
                        mo100995aY().setMinimumHeight(aI2);
                    }
                } else {
                    m188858dW(2);
                    mo100916dy(2);
                }
            } else {
                int aI3 = mo100986aI(false);
                ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView3 = this.f315865aw;
                valyrianDynamicResponseLayerView3.getClass();
                C58976aa aaVar3 = C58975e.f156826a;
                valyrianDynamicResponseLayerView3.f316102c = aI3;
                valyrianDynamicResponseLayerView3.requestLayout();
                ValyrianRecyclerView valyrianRecyclerView3 = this.f315866ax;
                valyrianRecyclerView3.getClass();
                valyrianRecyclerView3.f316112b = aI3;
                if (mo100910dn()) {
                    mo100995aY().setMinimumHeight(aI3);
                }
            }
        }
        this.f315979o = false;
        NgaInteractionContainer ngaInteractionContainer = this.f315975k;
        if (ngaInteractionContainer.f315463c) {
            ngaInteractionContainer.f315467g.f353664b.mo51131u(configuration);
        }
    }

    /* renamed from: bU */
    public final void mo100853bU() {
        this.f315850ah.mo96859b();
        int e = this.f315859aq.mo101122e(C108230ba.f301014b);
        if (e >= 0 && m188868eC()) {
            C108232bc b = this.f315859aq.mo95352b(e);
            if ((b instanceof C108451je) && !((C108451je) b).f301664f && !this.f315983s.mo96407t()) {
                mo101024ch();
            }
        }
    }

    /* renamed from: bV */
    public final void mo100854bV() {
        this.f315948ck = true;
    }

    /* renamed from: bW */
    public final void mo100855bW() {
        mo100864bq();
        if (!this.f315982r.mo79746e(C90014bt.f247779nb) || !mo101037dg()) {
            mo100858bZ();
        }
        this.f315835aS.f300678a = true;
        mo100862bo(false);
        if (C113987f.m188690a(this.f315982r)) {
            View view = this.f315810T;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.f315813W;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        if (C113987f.m188692c(this.f315982r)) {
            for (int i = 0; i < this.f315859aq.mo95351a(); i++) {
                C108232bc b = this.f315859aq.mo95352b(i);
                if (b instanceof C108262cf) {
                    C108262cf cfVar = (C108262cf) b;
                    if (!cfVar.f301175e) {
                        cfVar.f301176f = !this.f315835aS.f300678a;
                        cfVar.mo96712f();
                    }
                }
            }
        }
    }

    /* renamed from: bX */
    public final void mo100856bX() {
        this.f315835aS.f300678a = false;
        if (C113987f.m188690a(this.f315982r)) {
            View view = this.f315810T;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.f315813W;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        m188858dW(1);
    }

    /* renamed from: bY */
    public final void mo100857bY() {
        this.f315872bH = true;
    }

    /* renamed from: bZ */
    public final void mo100858bZ() {
        View view;
        if (this.f315844ab) {
            m188883ej();
        }
        if (this.f315982r.mo79746e(C90014bt.f247800nw) && (view = this.f315813W) != null) {
            mo101031cu((ImageView) view.findViewById(R.id.explore_icon));
        }
    }

    /* renamed from: ba */
    public final WebImageView mo100859ba() {
        return this.f315801K.f316070c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bb */
    public final LogoView mo101006bb() {
        if (this.f315882bR == null) {
            LogoView logoView = (LogoView) this.f315876bL.inflate(R.layout.opa_drl_mic, this.f315984t, false);
            if (logoView == null) {
                return null;
            }
            logoView.mo28223c(52.8704f, 38.3944f);
            FrameLayout aZ = mo100996aZ();
            C82194a aVar = this.f315800J;
            aVar.f224654b.mo74350a();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(aVar.f224653a.getResources().getDimensionPixelOffset(R.dimen.nga_assist_logo_icon_width), aVar.f224653a.getResources().getDimensionPixelOffset(R.dimen.nga_assist_logo_icon_height), 81);
            layoutParams.bottomMargin = aVar.f224653a.getResources().getDimensionPixelOffset(R.dimen.assist_layer_any_nav_logo_bottom_margin);
            aZ.addView(logoView, layoutParams);
            logoView.setVisibility(8);
            logoView.mo28225e(7, true);
            this.f315882bR = logoView;
        }
        return this.f315882bR;
    }

    /* renamed from: bc */
    public final C58833ax mo100830bc() {
        return C58833ax.m90834k(this);
    }

    /* renamed from: bd */
    public final C58833ax mo100831bd() {
        return C58833ax.m90834k(this);
    }

    /* renamed from: be */
    public final C58833ax mo100832be() {
        return C58833ax.m90834k(this);
    }

    /* renamed from: bf */
    public final C58833ax mo100833bf() {
        return C58833ax.m90834k(this);
    }

    /* renamed from: bg */
    public final C58833ax mo100834bg() {
        return C58833ax.m90834k(this);
    }

    /* renamed from: bh */
    public final Boolean mo100860bh() {
        boolean z = false;
        if (this.f315793C != null && this.f315870bF) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: bi */
    public final String mo101007bi(boolean z, String str) {
        if (z) {
            this.f315983s.mo96392e();
        }
        StringBuilder sb = new StringBuilder();
        C108269cm cmVar = this.f315858ap;
        ArrayList<C108232bc> arrayList = new ArrayList<>();
        C108308dy dyVar = ((C114109an) cmVar.f301214a).f316252a;
        int a = dyVar.mo95351a();
        while (true) {
            a--;
            if (a < 0) {
                break;
            }
            C108232bc b = dyVar.mo95352b(a);
            if (b != null && !TextUtils.isEmpty(str) && TextUtils.equals(str, b.f301037s)) {
                arrayList.add(b);
            }
        }
        C108303dt dtVar = cmVar.f301215b;
        if (dtVar != null) {
            arrayList.addAll(new C58373cq(C58374cr.m89410b(dtVar.f301280k.mo3692f().values(), new C108276ct(str)), C108277cu.f301227a));
        }
        for (C108232bc bcVar : arrayList) {
            if (bcVar.f301031m != z) {
                bcVar.f301031m = z;
                bcVar.mo96609s(z);
            }
            if (z && (bcVar instanceof C108451je)) {
                sb.append(((C108451je) bcVar).mo96890c());
            }
        }
        return sb.toString();
    }

    /* renamed from: bj */
    public final void mo100828bj(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new C113732s(viewGroup, new C114006cp(this)));
        }
    }

    /* renamed from: bk */
    public final void mo100829bk(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = this.f315853ak.f315515d;
        if (viewGroup.getId() == R.id.search_container) {
            viewGroup.addView(viewGroup2, viewGroup.indexOfChild(viewGroup.findViewById(R.id.search_plate_top_shadow)) + 1);
            C113926aa aaVar = this.f315853ak;
            View findViewById = viewGroup.findViewById(R.id.search_plate_top_shadow);
            findViewById.getClass();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{aaVar.f315527p, aaVar.mo100781e(findViewById)});
            animatorSet.addListener(new C114092u(findViewById));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(new Animator[]{aaVar.f315528q, aaVar.mo100780d(findViewById)});
            animatorSet2.addListener(new C114157v(findViewById));
            aaVar.f315527p = animatorSet;
            aaVar.f315528q = animatorSet2;
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        viewGroup.addView(viewGroup2, layoutParams);
    }

    /* renamed from: bl */
    public final void mo101008bl(C108232bc bcVar) {
        String c = ((C108451je) bcVar).mo96890c();
        if (!C58837ba.m90859h(c)) {
            if (this.f315841aY.containsKey(c) && bcVar.f301035q <= ((Long) this.f315841aY.get(c)).longValue()) {
                return;
            }
            if (!this.f315840aX.containsKey(c)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(bcVar);
                this.f315840aX.put(c, arrayList);
                return;
            }
            ((ArrayList) this.f315840aX.get(c)).add(bcVar);
        }
    }

    /* renamed from: bm */
    public final void mo100861bm() {
        if (!this.f315982r.mo79746e(C90063do.f249383cW) || this.f315983s.mo96406s() || !mo101037dg()) {
            mo101009bn(this.f315986v, new C114043di(this));
        } else {
            OpaWebView opaWebView = this.f315824aH;
            if (opaWebView != null && this.f315980p == -1) {
                mo101009bn(opaWebView, new C114045dk(this));
            }
            ValyrianRecyclerView valyrianRecyclerView = this.f315866ax;
            valyrianRecyclerView.getClass();
            mo101009bn(valyrianRecyclerView, new C114042dh());
        }
        this.f315853ak.mo100786j(true);
    }

    /* renamed from: bn */
    public final void mo101009bn(View view, AnimatorListenerAdapter animatorListenerAdapter) {
        if (view.getAlpha() == 1.0f) {
            view.animate().cancel();
            view.animate().alpha(0.0f).setDuration(this.f315982r.mo79743a(C90063do.f249599ga)).setListener(new C114044dj(view, animatorListenerAdapter)).start();
        }
    }

    /* renamed from: bo */
    public final void mo100862bo(boolean z) {
        TextView textView;
        if (!this.f315982r.mo79746e(C90029ch.f248224aK)) {
            return;
        }
        if (!z || mo100860bh().booleanValue() || (((textView = this.f315791A) != null && textView.getVisibility() == 0) || this.f315851ai.mo96835a() <= this.f315851ai.f301488a.size())) {
            this.f315792B.setVisibility(8);
        } else {
            this.f315792B.setVisibility(0);
        }
    }

    /* renamed from: bp */
    public final void mo100863bp(boolean z) {
        RecyclerView recyclerView;
        this.f315869bE = z;
        int i = 0;
        if (this.f315940cc && !z && mo100909dl()) {
            mo101032dC(false);
        }
        this.f315853ak.mo100782f(this.f315869bE);
        mo101022ce();
        if (this.f315940cc && this.f315942ce == C113984c.TRY_BEFORE_YOU_BUY_SUGGESTION && this.f315982r.mo79746e(C90126fx.f251208eV) && (recyclerView = this.f315850ah.f301565l) != null) {
            if (true != z) {
                i = 8;
            }
            recyclerView.setVisibility(i);
        }
    }

    /* renamed from: bq */
    public final void mo100864bq() {
        mo101011bt(this.f315859aq.mo95351a());
        mo101027cn();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        r1 = r0 - 1;
     */
    /* renamed from: br */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101010br() {
        /*
            r3 = this;
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r0 = r3.f315859aq
            com.google.common.base.bc r1 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba.f301014b
            int r0 = r0.mo101122e(r1)
            boolean r1 = r3.mo100907df()
            if (r1 == 0) goto L_0x0025
            if (r0 <= 0) goto L_0x0025
            int r1 = r0 + -1
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r2 = r3.f315859aq
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r2 = r2.mo95352b(r1)
            if (r2 == 0) goto L_0x0025
            boolean r2 = m188890eq(r2)
            if (r2 != 0) goto L_0x0021
            goto L_0x0025
        L_0x0021:
            r3.mo101011bt(r1)
            return
        L_0x0025:
            if (r0 < 0) goto L_0x002a
            r3.mo101011bt(r0)
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.C114071eg.mo101010br():void");
    }

    /* renamed from: bs */
    public final void mo100865bs() {
        this.f315853ak.f315520i.ifPresent(new C113945at(this));
    }

    /* renamed from: bt */
    public final void mo101011bt(int i) {
        C60870cx cxVar;
        List list;
        int i2 = i;
        ((C59052c) ((C59052c) f315790j.mo56224b()).mo56372aa(28524)).mo56359L("#clearSessionToHistoryState(): numElements=%d ElementCount=%d, isExpectingWebView=%b", Integer.valueOf(i), Integer.valueOf(this.f315859aq.mo95351a()), Boolean.valueOf(this.f315978n));
        mo100994aT().stopScroll();
        if (!this.f315884bT.isEmpty()) {
            for (C108232bc c : this.f315884bT) {
                this.f315857ao.mo101153c(c);
            }
            this.f315884bT.clear();
        }
        if (i2 != 0) {
            ArrayList<C108232bc> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < i2; i3++) {
                C108232bc b = this.f315859aq.mo95352b(i3);
                if (b != null && b.f301033o && !(b instanceof C108412ht) && !(b instanceof C108397he)) {
                    if (b instanceof C108262cf) {
                        C108262cf cfVar = (C108262cf) b;
                        if (!cfVar.mo96717x()) {
                            if (!cfVar.mo96710A()) {
                                if (this.f315807Q) {
                                }
                            }
                        }
                    } else if ((b instanceof C108451je) && !((C108451je) b).mo96575b()) {
                    }
                    if (this.f315982r.mo79746e(C90014bt.f247774nW)) {
                        for (C108232bc bcVar : b.mo96605o()) {
                            arrayList.add(bcVar);
                            m188852dQ(arrayList2, bcVar);
                        }
                    } else {
                        for (C108232bc bcVar2 : b.mo96605o()) {
                            this.f315857ao.mo101153c(bcVar2);
                            m188852dQ(arrayList2, bcVar2);
                        }
                        mo101028co();
                    }
                    if (b.mo96602l() == 0 && m188866eA(b)) {
                        for (C108232bc bcVar3 : b.mo96604n()) {
                            this.f315883bS.add(bcVar3);
                            m188852dQ(arrayList2, bcVar3);
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (!m188890eq((C108232bc) it.next())) {
                        if (this.f315925cN > 0) {
                            if (this.f315921cJ.size() >= this.f315925cN) {
                                this.f315921cJ.remove(0);
                            }
                            C58485gu j = C58485gu.m89842j(this.f315922cK);
                            C58485gu j2 = C58485gu.m89842j(this.f315923cL);
                            C58485gu j3 = C58485gu.m89842j(this.f315924cM);
                            long j4 = ((C108232bc) C58557jl.m90131l(arrayList2)).f301025B;
                            List list2 = this.f315921cJ;
                            CharSequence charSequence = this.f315905bo;
                            C63088z zVar = null;
                            long j5 = 0;
                            if (j4 != 0) {
                                while (true) {
                                    if (this.f315903bm.isEmpty()) {
                                        list = list2;
                                        break;
                                    }
                                    C88192so soVar = (C88192so) this.f315903bm.poll();
                                    if (soVar != null) {
                                        list = list2;
                                        if (soVar.f238407c == j4) {
                                            zVar = soVar.f238406b;
                                            break;
                                        }
                                        list2 = list;
                                    }
                                }
                                j5 = j4;
                            } else {
                                list = list2;
                            }
                            C114054dt dtVar = r3;
                            C114054dt dtVar2 = new C114054dt(charSequence, arrayList2, j, j2, j3, j5, zVar, this.f315814X.mo26870b());
                            list.add(dtVar);
                            this.f315905bo = BuildConfig.FLAVOR;
                            if (((int) this.f315982r.mo79743a(C90029ch.f248299n)) > 0) {
                                a x = C73904j.m108523x();
                                a aVar = x;
                                aVar.i = 3;
                                aVar.f = Integer.valueOf((int) this.f315982r.mo79743a(C90029ch.f248299n));
                                aVar.g = Integer.valueOf((int) this.f315982r.mo79743a(C90029ch.f248300o));
                                View findViewById = this.f315984t.findViewById(R.id.zero_state_brick_icon);
                                if (findViewById != null) {
                                    aVar.a = findViewById;
                                    x.e();
                                    if (m188892es()) {
                                        x.f(this.f315981q.getResources().getString(R.string.opa_back_navigation_tooltip_back_gesture_text));
                                        x.i((int) this.f315982r.mo79743a(C90029ch.f248297l));
                                        x.j((int) this.f315982r.mo79743a(C90029ch.f248298m));
                                        x.c(0);
                                        x.b(0);
                                    } else {
                                        x.f(this.f315981q.getResources().getString(R.string.opa_back_navigation_tooltip_back_button_text));
                                        if (!m188896ew()) {
                                            x.i((int) this.f315982r.mo79743a(C90029ch.f248295j));
                                            x.j((int) this.f315982r.mo79743a(C90029ch.f248296k));
                                            x.c(0);
                                            x.b(0);
                                        } else {
                                            x.i((int) this.f315982r.mo79743a(C90029ch.f248293h));
                                            x.j((int) this.f315982r.mo79743a(C90029ch.f248294i));
                                            x.h((int) this.f315982r.mo79743a(C90029ch.f248301p));
                                        }
                                    }
                                    if (!m188896ew() || m188892es()) {
                                        x.c(0);
                                        x.b(0);
                                        x.h(0);
                                    }
                                    h a = this.f315966dc.a(x.a());
                                    this.f315894bd = a;
                                    if (a != null) {
                                        new C90873ag(a.f.a(), this.f315815Y, "isThrottlingConditionMetFuture", new C113956bb(this)).mo85223a(C113957bc.f315587a);
                                    }
                                } else {
                                    throw new NullPointerException("Null targetView");
                                }
                            }
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                C113924b bVar = this.f315863au;
                C108303dt dtVar3 = bVar.f315482e;
                if (arrayList.isEmpty()) {
                    cxVar = C60856cj.m92900i(C58485gu.m89845m());
                } else {
                    C108484s sVar = new C108484s();
                    for (C108232bc bcVar4 : arrayList) {
                        C60870cx h = dtVar3.mo96745h(bcVar4);
                        if (h != null) {
                            sVar.mo96734d(bcVar4, h);
                        }
                    }
                    cxVar = C60922j.m93044g(C108303dt.m180009g(sVar.mo96731a()), new C108287dd(dtVar3), C60826bg.f164896a);
                    C90476a aVar2 = C91018d.f254254a;
                }
                bVar.f315481d.mo28211k(cxVar, "Append elements to history", new C113923a(bVar));
            }
            if ((!this.f315978n || !mo101037dg()) && !this.f315872bH) {
                m188860dY();
            }
            if (this.f315872bH) {
                this.f315872bH = false;
            }
            this.f315859aq.mo101141x(i2);
            if (this.f315982r.mo79746e(C90014bt.f247181cM)) {
                mo101018cR();
            }
        }
    }

    /* renamed from: bu */
    public final void mo100866bu() {
        this.f315859aq.mo101137t();
        C108395hc hcVar = this.f315851ai;
        hcVar.mo96838d();
        hcVar.mo96839e();
        this.f315853ak.mo100791o();
        this.f315859aq.mo101140w(this.f315852aj);
        this.f315850ah.mo96866j(true);
        m188855dT();
        mo101022ce();
    }

    /* renamed from: bv */
    public final void mo100867bv() {
        this.f315850ah.mo96866j(false);
    }

    /* renamed from: bw */
    public final void mo100868bw(boolean z) {
        C108473k kVar = this.f315853ak.f315519h;
        if (kVar != null) {
            kVar.f301711e = z;
        }
        m188882ei();
        mo101022ce();
    }

    /* renamed from: bx */
    public final void mo100869bx() {
        this.f315850ah.mo96866j(true);
        m188882ei();
        mo101022ce();
    }

    /* renamed from: by */
    public final void mo101012by() {
        boolean z = true;
        boolean z2 = mo95399aj() || mo101037dg();
        if (mo100993aS().findLastVisibleItemPosition() != mo100989aL() || this.f315835aS.f300678a) {
            z = false;
        }
        if (z2 && !z) {
            mo95375Q(false);
        }
    }

    /* renamed from: bz */
    public final void mo100870bz() {
        C113926aa aaVar = this.f315853ak;
        aaVar.mo100788l();
        aaVar.mo100784h();
    }

    /* renamed from: cA */
    public final void mo100871cA(Boolean bool) {
        if (bool.booleanValue()) {
            this.f315834aR.setVisibility(0);
        } else {
            this.f315834aR.setVisibility(8);
        }
        if (!C113987f.m188692c(this.f315982r)) {
            return;
        }
        if (bool.booleanValue()) {
            if (!this.f315832aP && m188887en()) {
                this.f315988x.setVisibility(0);
                if (this.f315835aS.f300678a) {
                    this.f315801K.f316068a.setVisibility(0);
                }
                mo101001bM();
            }
        } else if (this.f315856an.mo101172s() != 4 && !this.f315835aS.f300678a) {
            this.f315988x.setVisibility(8);
            if (this.f315835aS.f300678a) {
                this.f315801K.f316068a.setVisibility(8);
            }
            mo101001bM();
        }
    }

    /* renamed from: cB */
    public final void mo101013cB() {
        if (!this.f315828aL && !this.f315845ac && !this.f315943cf) {
            m188882ei();
            this.f315853ak.mo100796t(true);
            mo101022ce();
        }
    }

    /* renamed from: cC */
    public final void mo100872cC() {
        if (!this.f315982r.mo79746e(C90063do.f249383cW) || !mo101037dg()) {
            m188879ef(this.f315986v);
            if (this.f315892bb.mo56113h()) {
                this.f315985u.getLayoutParams().height = ((Integer) this.f315892bb.mo56107c()).intValue();
                this.f315892bb = C58836b.f156633a;
            }
        } else {
            ValyrianRecyclerView valyrianRecyclerView = this.f315866ax;
            valyrianRecyclerView.getClass();
            m188879ef(valyrianRecyclerView);
            OpaWebView opaWebView = this.f315824aH;
            if (!(opaWebView == null || this.f315980p == -1)) {
                m188879ef(opaWebView);
                mo100995aY().setMinimumHeight(this.f315980p);
                mo100995aY().getLayoutParams().height = this.f315980p;
                mo100995aY().requestLayout();
                this.f315980p = -1;
            }
        }
        if (this.f315856an.mo101172s() != 4) {
            mo100848bJ(true);
        }
    }

    /* renamed from: cD */
    public final void mo101014cD(boolean z, boolean z2) {
        this.f315976l = z;
        C114132bj bjVar = this.f315856an;
        C58976aa aaVar = C58975e.f156826a;
        ViewGroup viewGroup = bjVar.f316350l;
        int i = 3;
        bjVar.f316354p = bjVar.mo101171r(bjVar.mo101172s(), 3);
        if (!bjVar.f316344f.mo79746e(C90014bt.f247393gM) || !bjVar.f316349k.mo56113h() || !((C106171l) bjVar.f316349k.mo56107c()).f296304b.f230023b.isDeviceLocked() || ((C106171l) bjVar.f316349k.mo56107c()).mo95342f()) {
            if (bjVar.mo101172s() != 3) {
                i = 6;
            } else if (!bjVar.f316346h && !bjVar.f316348j) {
                i = 4;
            }
        }
        bjVar.mo101173t(i);
        int l = bjVar.mo9176l(bjVar.f316350l);
        if (l >= 0) {
            bjVar.f316341c.mo101091h(l, z2);
            boolean z3 = true;
            if (C113987f.m188691b(bjVar.f316344f) && bjVar.f316347i.mo100572a() != -1) {
                z3 = false;
            }
            bjVar.f316341c.f316156c = z3;
        }
    }

    /* renamed from: cE */
    public final void mo101015cE() {
        if (!this.f315842aZ) {
            C113926aa aaVar = this.f315853ak;
            aaVar.mo100788l();
            aaVar.mo100784h();
            this.f315985u.getLayoutParams().height = -2;
            C108252bw bwVar = new C108252bw((byte[]) null);
            bwVar.f301174d = this.f315981q.getResources().getString(R.string.opa_drl_history_title);
            int i = 0;
            bwVar.f301033o = false;
            mo95430s(bwVar);
            for (Map.Entry entry : this.f315840aX.entrySet()) {
                if (i >= 5) {
                    break;
                }
                C108259cc ccVar = new C108259cc(this.f315799I, this.f315981q, this.f315833aQ, this.f315839aW);
                ccVar.f301153a = (CharSequence) entry.getKey();
                this.f315859aq.mo101133p(ccVar);
                i++;
            }
            if (this.f315891ba.mo56113h()) {
                String string = this.f315981q.getResources().getString(R.string.history_carousel_background_text);
                C91097g gVar = this.f315799I;
                gVar.getClass();
                C108204ab abVar = new C108204ab(string, gVar);
                abVar.f301034p = 2;
                abVar.f300965c = 24;
                mo95430s(abVar);
                mo95430s((C108232bc) this.f315891ba.mo56107c());
            }
            C91097g gVar2 = this.f315799I;
            gVar2.getClass();
            mo95430s(new C108273cq(gVar2));
            this.f315842aZ = true;
        }
    }

    /* renamed from: cF */
    public final void mo101016cF(boolean z) {
        this.f315976l = z;
        C114132bj bjVar = this.f315856an;
        C58976aa aaVar = C58975e.f156826a;
        int l = bjVar.mo9176l(bjVar.f316352n);
        if (l >= 0) {
            bjVar.f316341c.mo101091h(l, true);
            bjVar.f316341c.f316156c = true;
        }
    }

    /* renamed from: cG */
    public final void mo100873cG(int i) {
        if (this.f315856an.mo101172s() == 3) {
            boolean z = m188864do(this.f315829aM);
            boolean z2 = m188864do(i);
            if (this.f315828aL && z2 != z) {
                mo101025ck(z2);
            }
        }
        this.f315829aM = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cH */
    public final void mo101017cH(int i) {
        if (!this.f315895be.isEmpty() && i < this.f315895be.size() && !C58837ba.m90859h((String) this.f315895be.get(i)) && this.f315862at.mo3842a() == C108228az.IS_THINKING) {
            C108262cf cfVar = new C108262cf();
            cfVar.f301174d = (CharSequence) this.f315895be.get(i);
            cfVar.f301033o = false;
            cfVar.f301168I = true;
            cfVar.f301170K = 1;
            cfVar.f301176f = false;
            cfVar.mo96712f();
            cfVar.f301177g = false;
            cfVar.mo96714u();
            cfVar.mo96611b(false);
            if (i == 0) {
                cfVar.f301164E = 131182;
                i = 0;
            }
            int e = this.f315859aq.mo101122e(C108230ba.f301015c);
            if (e >= 0) {
                C108262cf cfVar2 = (C108262cf) this.f315859aq.mo95352b(e);
                cfVar2.getClass();
                if (cfVar2.f301168I) {
                    this.f315859aq.mo101143z(e, cfVar);
                    mo101018cR();
                    m188853dR();
                    this.f315899bi = this.f315815Y.mo28208h("onStatusIndicatorDelayedShow", this.f315982r.mo79743a(C90029ch.f248231aR), new C114047dm(this, i));
                }
            }
            this.f315859aq.mo101133p(cfVar);
            mo101018cR();
            m188853dR();
            this.f315899bi = this.f315815Y.mo28208h("onStatusIndicatorDelayedShow", this.f315982r.mo79743a(C90029ch.f248231aR), new C114047dm(this, i));
        }
    }

    /* renamed from: cI */
    public final void mo100917cI() {
        int i = this.f315909bs;
        if (this.f315982r.mo79746e(C90014bt.f247290eP) && mo101037dg()) {
            m188883ej();
            this.f315983s.mo96397j();
        }
        this.f315856an.mo101170q();
        C114754h hVar = this.f315820aD;
        if (hVar != null && i != 1) {
            hVar.mo101424n();
        }
    }

    /* renamed from: cJ */
    public final void mo100918cJ() {
        this.f315977m = true;
        mo100917cI();
        this.f315855am.getViewTreeObserver().addOnPreDrawListener(new C114005co(this));
    }

    /* renamed from: cK */
    public final void mo100874cK(boolean z) {
        TextView textView;
        TextView textView2 = this.f315791A;
        if (textView2 != null) {
            boolean z2 = false;
            if (!z) {
                boolean z3 = !this.f315948ck;
                if (mo95399aj() || (textView = this.f315791A) == null || textView.getTranslationY() != 0.0f) {
                    z2 = true;
                }
                if (!z3 && !z2) {
                    Animator animator = this.f315798H;
                    if (animator != null) {
                        animator.cancel();
                    }
                    Animator dK = m188846dK(this.f315985u.getHeight());
                    this.f315798H = dK;
                    if (dK != null) {
                        dK.addListener(new C114015cy(this));
                        Animator animator2 = this.f315798H;
                        animator2.getClass();
                        animator2.start();
                        return;
                    }
                    return;
                }
                return;
            }
            textView2.setVisibility(0);
        }
    }

    /* renamed from: cL */
    public final void mo100875cL() {
        LinearLayoutManager linearLayoutManager;
        int e = this.f315859aq.mo101122e(C108230ba.f301020h);
        if (e >= 0 && e < this.f315859aq.mo95351a() && (linearLayoutManager = this.f315867ay) != null) {
            C0669gd gdVar = this.f315875bK;
            gdVar.f2449g = e + 1;
            linearLayoutManager.startSmoothScroll(gdVar);
        }
    }

    /* renamed from: cM */
    public final void mo100876cM() {
        C114056dv dvVar = this.f315938ca;
        if (dvVar.f315758a) {
            dvVar.mo100968a();
        }
    }

    /* renamed from: cN */
    public final void mo100877cN(boolean z, boolean z2) {
        this.f315870bF = z;
        if (this.f315793C == null) {
            if (z) {
                mo100846bE((String) null);
            } else {
                return;
            }
        }
        this.f315985u.getViewTreeObserver().addOnGlobalLayoutListener(new C114010ct(this, z2));
    }

    /* renamed from: cO */
    public final void mo100878cO(boolean z) {
        mo101032dC(z);
    }

    /* renamed from: cP */
    public final void mo100879cP() {
        int e = this.f315859aq.mo101122e(C108230ba.f301019g);
        if (e >= 0) {
            this.f315859aq.mo95354d(e);
        }
    }

    /* renamed from: cQ */
    public final void mo100880cQ(boolean z) {
        if (z) {
            m188881eh();
            this.f315985u.getViewTreeObserver().addOnGlobalLayoutListener(new C114013cw(this));
            return;
        }
        m188874ea();
    }

    /* renamed from: cR */
    public final void mo101018cR() {
        if (this.f315982r.mo79746e(C90014bt.f247181cM)) {
            boolean df = mo100907df();
            boolean z = this.f315824aH != null;
            C108093b bVar = this.f315835aS;
            C114062a aVar = new C114062a(df, z, bVar.f300678a, this.f315801K.f316068a.getVisibility() == 0, bVar.f300679b);
            boolean z2 = false;
            boolean z3 = false;
            for (int i = 0; i < this.f315859aq.mo95351a(); i++) {
                C108232bc b = this.f315859aq.mo95352b(i);
                if (b instanceof C108262cf) {
                    C108262cf cfVar = (C108262cf) b;
                    int i2 = cfVar.f301170K;
                    boolean z4 = i2 == 1 || i2 == 2;
                    ((C59052c) ((C59052c) C114064c.f315772a.mo56224b()).mo56372aa(28768)).mo56359L("Google bubble: seenStableGoogleBubble %b, seenFinalUserBubble %b, isStableGoogleBubble %b", Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4));
                    if ((aVar.mo100974b() || !aVar.mo100977e()) && !aVar.mo100975c() && !aVar.mo100976d()) {
                        boolean z5 = !z2 && !z3 && z4;
                        cfVar.f301176f = z5;
                        cfVar.mo96712f();
                        cfVar.f301177g = z5;
                        cfVar.mo96714u();
                        cfVar.mo96711e(aVar.mo100973a());
                    } else {
                        cfVar.f301176f = false;
                        cfVar.mo96712f();
                        cfVar.f301177g = false;
                        cfVar.mo96714u();
                        cfVar.mo96711e((Drawable) null);
                    }
                    if (z4) {
                        z2 = true;
                    }
                } else if (b instanceof C108451je) {
                    C108451je jeVar = (C108451je) b;
                    ((C59052c) ((C59052c) C114064c.f315772a.mo56224b()).mo56372aa(28769)).mo56358K("User bubble: %b, %b", z2, z3);
                    if (aVar.mo100977e()) {
                        jeVar.mo96891f(true);
                        jeVar.f301665g = true;
                        jeVar.mo96893w();
                    } else if (aVar.mo100975c() || aVar.mo100976d()) {
                        jeVar.mo96891f(false);
                        jeVar.f301665g = false;
                        jeVar.mo96893w();
                        jeVar.mo96892u((Drawable) null);
                    } else {
                        boolean z6 = !z2 && !z3 && jeVar.mo96575b();
                        jeVar.mo96891f(z6);
                        jeVar.f301665g = z6;
                        jeVar.mo96893w();
                        jeVar.mo96892u(aVar.mo100973a());
                    }
                    if (jeVar.mo96575b() && jeVar.f301664f) {
                        z3 = true;
                    }
                }
            }
        }
    }

    /* renamed from: cS */
    public final void mo100881cS() {
        int e = this.f315859aq.mo101122e(C108230ba.f301020h);
        if (e > 0 && e < this.f315859aq.mo95351a()) {
            this.f315859aq.mo95354d(e);
        }
    }

    /* renamed from: cT */
    public final void mo101019cT(String str) {
        if (this.f315982r.mo79746e(C90037cp.f248583da) && ((long) ((SharedPreferences) this.f315914cC.mo27525b()).getInt("opa_add_shortcut_screen_seen_count", 0)) < this.f315982r.mo79743a(C90037cp.f248572cu) && !this.f315915cD.mo100727a() && !((C114250c) this.f315916cE.mo27525b()).mo101288a()) {
            str = this.f315981q.getResources().getString(R.string.opa_finish_setup_bar_description_add_shortcut);
        } else if (this.f315960cw.mo96478k()) {
            str = this.f315982r.mo79758x(C90037cp.f248615k);
            C108135a aVar = this.f315960cw;
            View view = this.f315793C;
            view.getClass();
            C108226ax axVar = this.f315983s;
            Objects.requireNonNull(axVar);
            aVar.mo96475h(view, new C113968bn(axVar));
        } else if (TextUtils.isEmpty(str)) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f315940cc) {
            View view2 = this.f315793C;
            view2.getClass();
            ((TextView) view2).setText(str);
            return;
        }
        this.f315815Y.mo28212l("Update blue pill text for Entry Promo", new C113969bo(this, str));
    }

    /* renamed from: cU */
    public final void mo101020cU(boolean z) {
        if (this.f315793C != null) {
            if (!this.f315870bF) {
                m188875eb(z);
                return;
            }
            int height = this.f315985u.getHeight();
            int dimensionPixelSize = this.f315981q.getResources().getDimensionPixelSize(R.dimen.opa_finish_setup_bar_v2_margin_bottom);
            View view = this.f315793C;
            view.getClass();
            if (height + dimensionPixelSize + view.getHeight() >= this.f315984t.getHeight()) {
                m188875eb(z);
                return;
            }
            View view2 = this.f315793C;
            view2.getClass();
            view2.setTranslationY((float) (-dimensionPixelSize));
            C114150t tVar = this.f315848af;
            if (tVar != null && tVar.mo101199i()) {
                View view3 = this.f315793C;
                view3.getClass();
                if (view3.getVisibility() == 0) {
                    View view4 = this.f315793C;
                    view4.getClass();
                    if (view4.getAlpha() == 1.0f) {
                        return;
                    }
                }
            }
            if (this.f315793C != null) {
                ObjectAnimator objectAnimator = this.f315797G;
                if (objectAnimator != null && objectAnimator.isStarted()) {
                    ObjectAnimator objectAnimator2 = this.f315797G;
                    objectAnimator2.getClass();
                    objectAnimator2.cancel();
                }
                if (z) {
                    ObjectAnimator objectAnimator3 = this.f315796F;
                    if (objectAnimator3 != null && objectAnimator3.isStarted()) {
                        ObjectAnimator objectAnimator4 = this.f315796F;
                        objectAnimator4.getClass();
                        objectAnimator4.cancel();
                    }
                    View view5 = this.f315793C;
                    view5.getClass();
                    view5.setVisibility(0);
                    View view6 = this.f315793C;
                    view6.getClass();
                    view6.setAlpha(1.0f);
                    return;
                }
                ObjectAnimator objectAnimator5 = this.f315796F;
                if (objectAnimator5 != null && !objectAnimator5.isStarted()) {
                    ObjectAnimator objectAnimator6 = this.f315796F;
                    objectAnimator6.getClass();
                    View view7 = this.f315793C;
                    view7.getClass();
                    objectAnimator6.setFloatValues(new float[]{view7.getAlpha(), 1.0f});
                    ObjectAnimator objectAnimator7 = this.f315796F;
                    objectAnimator7.getClass();
                    objectAnimator7.start();
                }
            }
        }
    }

    /* renamed from: cV */
    public final void mo100882cV(String str) {
        if (mo100907df()) {
            C113926aa aaVar = this.f315853ak;
            this.f315905bo = aaVar.f315537z;
            aaVar.mo100793q(C58837ba.m90858g(str));
            return;
        }
        C108232bc j = this.f315859aq.mo101127j(C108230ba.f301013a);
        if (j instanceof C108451je) {
            ((C108451je) j).f301663e = str;
        } else {
            ((C59052c) ((C59052c) f315790j.mo56225c()).mo56372aa(28602)).mo56386p("#updateUserQueryText missing UserBubble");
        }
    }

    /* renamed from: cW */
    public final void mo101021cW(OpaWebView opaWebView) {
        int aG = mo100985aG();
        int aK = mo100988aK();
        int i = (int) (((float) aG) / opaWebView.getContext().getResources().getDisplayMetrics().density);
        if (i != opaWebView.f316493b || opaWebView.f316503l) {
            opaWebView.f316493b = i;
            if (opaWebView.f316498g) {
                opaWebView.mo101226e((ValueCallback) null);
            }
        }
        if (aK != opaWebView.f316494c) {
            opaWebView.f316494c = aK;
            opaWebView.mo101229h();
        }
    }

    /* renamed from: cX */
    public final void mo100883cX(int i) {
        if (this.f315791A != null && !mo95399aj()) {
            TextView textView = this.f315791A;
            textView.getClass();
            if (textView.getVisibility() == 0) {
                Animator animator = this.f315795E;
                animator.getClass();
                if (!animator.isStarted()) {
                    Animator animator2 = this.f315798H;
                    if (animator2 != null) {
                        animator2.cancel();
                    }
                    Animator dK = m188846dK(i);
                    this.f315798H = dK;
                    dK.getClass();
                    dK.start();
                }
            }
        }
    }

    /* renamed from: cY */
    public final boolean mo100884cY() {
        if (!mo101037dg()) {
            return false;
        }
        OpaWebView opaWebView = this.f315824aH;
        if (opaWebView != null) {
            return opaWebView.mo101231j();
        }
        ValyrianRecyclerView valyrianRecyclerView = this.f315866ax;
        if (valyrianRecyclerView != null) {
            return valyrianRecyclerView.canScrollVertically(1);
        }
        return false;
    }

    /* renamed from: cZ */
    public final boolean mo100885cZ() {
        OpaWebView opaWebView = this.f315824aH;
        if (opaWebView != null) {
            return opaWebView.mo101232k();
        }
        LinearLayoutManager aS = mo100993aS();
        int findFirstVisibleItemPosition = aS.findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition < 0) {
            return false;
        }
        if (findFirstVisibleItemPosition > 0 || aS.findViewByPosition(0).getTop() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: ca */
    public final void mo100886ca() {
        this.f315986v.getLayoutParams().height = -1;
    }

    /* renamed from: cb */
    public final void mo100887cb(C113984c cVar) {
        C113984c cVar2 = C113984c.UNKNOWN;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C53306j jVar = C53306j.UNKNOWNN;
        switch (cVar.ordinal()) {
            case 1:
                this.f315943cf = true;
                this.f315944cg = true;
                return;
            case 2:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                this.f315853ak.mo100786j(true);
                this.f315845ac = true;
                this.f315942ce = cVar;
                if (m188887en()) {
                    this.f315988x.setVisibility(8);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: cc */
    public final void mo100888cc(C113984c cVar, boolean z) {
        C113984c cVar2 = C113984c.UNKNOWN;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C53306j jVar = C53306j.UNKNOWNN;
        switch (cVar.ordinal()) {
            case 1:
                this.f315943cf = false;
                if (z) {
                    m188877ed();
                }
                if (this.f315982r.mo79746e(C90014bt.f247609kQ)) {
                    this.f315944cg = false;
                    return;
                }
                return;
            case 2:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                this.f315853ak.mo100796t(true);
                this.f315845ac = false;
                if (m188887en()) {
                    this.f315988x.setVisibility(0);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: cd */
    public final void mo100889cd(int i) {
        this.f315822aF = i;
        m188878ee(this.f315981q.getResources().getDimensionPixelSize(m188842aM(i)));
        mo101004bP();
        boolean z = true;
        if (!mo101037dg() && this.f315856an.mo101172s() == 4 && i != 0) {
            if (mo100911dp()) {
                mo101016cF(false);
            } else {
                mo101014cD(false, true);
            }
        }
        NgaInteractionContainer ngaInteractionContainer = this.f315975k;
        if (i != 0) {
            z = false;
        }
        ngaInteractionContainer.f315464d = z;
        if (ngaInteractionContainer.mo100778i()) {
            ngaInteractionContainer.mo100776g((bf) ((C83361k) ngaInteractionContainer.f315466f.f296619a).f227199b.get());
        } else if (ngaInteractionContainer.f315463c) {
            ngaInteractionContainer.mo100777h();
        }
    }

    /* renamed from: ce */
    public final void mo101022ce() {
        OpaWebView opaWebView = this.f315824aH;
        if (opaWebView != null) {
            mo101021cW(opaWebView);
        }
        if (!mo95399aj()) {
            return;
        }
        if ((this.f315853ak.mo100802z() || this.f315853ak.f315517f.isShown()) && this.f315938ca.f315758a) {
            mo95375Q(false);
        }
    }

    /* renamed from: cf */
    public final void mo100890cf() {
        if (this.f315856an.mo101172s() == 4) {
            this.f315831aO = true;
            if (!mo100911dp() || this.f315832aP || this.f315844ab) {
                mo101014cD(false, true);
            } else {
                mo101016cF(false);
            }
        }
    }

    /* renamed from: cg */
    public final void mo101023cg() {
        mo95365G();
        OpaWebView opaWebView = this.f315824aH;
        if (opaWebView != null) {
            mo101021cW(opaWebView);
        }
    }

    /* renamed from: ch */
    public final void mo101024ch() {
        this.f315850ah.mo96859b();
        if (m188868eC()) {
            mo101002bN(true);
        }
        C114150t tVar = this.f315848af;
        if (tVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            tVar.mo101192b();
        }
        if (mo100906dc()) {
            mo100862bo(true);
        }
        if (this.f315982r.mo79746e(C90014bt.f247181cM)) {
            mo101018cR();
        }
        if (this.f315911bu != null && (this.f315969df || !this.f315983s.mo96407t())) {
            C109037fg fgVar = this.f315911bu;
            fgVar.getClass();
            fgVar.f303205a.mo97553z();
            fgVar.f303205a.mo97470af();
            C107606q qVar = fgVar.f303205a.f303239Y;
            if (qVar != null) {
                qVar.mo96068c();
            }
            C109040fj fjVar = fgVar.f303205a;
            if (fjVar.f303373ce) {
                fjVar.f303444i.mo95152c((int) C72290n.m106815f(fjVar.f303455t.mo79743a(C90014bt.f247488iB)).f191964b);
            }
            if (C87566i.m142268aP(fgVar.f303205a.f303442g) && fgVar.f303205a.f303238X.mo96131aD()) {
                fgVar.f303205a.f303238X.mo96151ac(false);
                fgVar.f303205a.f303238X.mo96163ao(0);
            }
            C109040fj fjVar2 = fgVar.f303205a;
            fjVar2.f303298bE = true;
            fjVar2.f303297bD = true;
            if (!fjVar2.f303450o.mo95399aj()) {
                C109040fj fjVar3 = fgVar.f303205a;
                if (fjVar3.f303370cb && fjVar3.mo97492bB()) {
                    fgVar.f303205a.f303450o.mo95420i().getLayoutParams().height = -2;
                }
                C109040fj fjVar4 = fgVar.f303205a;
                int b = (int) (C91115n.m148870b((float) fjVar4.f303455t.mo79743a(C90029ch.f248268bb), fjVar4.f303346c) + 0.5f);
                if (fjVar4.f303370cb && fjVar4.f303298bE && b > 0) {
                    fjVar4.f303450o.mo95420i().setMinimumHeight(b);
                    View findViewById = fjVar4.f303450o.mo95419h().findViewById(R.id.valyrian_container);
                    if (findViewById != null) {
                        findViewById.getLayoutParams().height = -1;
                    }
                }
            }
        }
        this.f315957ct.mo83145s(C58836b.f156633a, 5);
    }

    /* renamed from: ci */
    public final void mo100891ci() {
        mo101014cD(false, true);
    }

    /* renamed from: cj */
    public final void mo100892cj(String str, String str2) {
        C108271co coVar = new C108271co(str, str2, this.f315939cb);
        this.f315884bT.add(coVar);
        C21370a aVar = this.f315814X;
        C28292j jVar = new C28292j(54014);
        jVar.mo33794h(1);
        coVar.f301030l = jVar;
        coVar.f301035q = aVar.mo26870b();
        this.f315883bS.add(coVar);
    }

    /* renamed from: ck */
    public final void mo101025ck(boolean z) {
        this.f315983s.mo96400m(z);
        OpaWebView opaWebView = this.f315824aH;
        if (opaWebView != null) {
            opaWebView.mo101229h();
        }
    }

    /* renamed from: cl */
    public final void mo100893cl(g gVar) {
        C114056dv dvVar = this.f315938ca;
        if (dvVar.f315758a) {
            dvVar.mo100968a();
        }
        C108457jk jkVar = new C108457jk(this.f315799I, C58836b.f156633a, 1, gVar);
        long j = gVar.d;
        if (j != 0) {
            jkVar.f301025B = j;
        }
        mo95430s(jkVar);
    }

    /* renamed from: cm */
    public final void mo101026cm() {
        this.f315990z.cancel();
        if (!this.f315989y.isStarted() && this.f315988x.isShown()) {
            this.f315989y.start();
        }
        if (this.f315835aS.f300678a) {
            this.f315803M.cancel();
            if (!this.f315802L.isStarted() && this.f315801K.f316068a.getTranslationY() == 0.0f) {
                this.f315802L.start();
            }
        }
    }

    /* renamed from: cn */
    public final void mo101027cn() {
        if (m188887en()) {
            this.f315989y.cancel();
            if (!this.f315990z.isStarted() && !this.f315988x.isShown()) {
                this.f315990z.start();
            }
        }
        if (this.f315835aS.f300678a) {
            this.f315802L.cancel();
            if (!this.f315803M.isStarted() && this.f315801K.f316068a.getTranslationY() != 0.0f) {
                this.f315803M.start();
            }
        }
    }

    /* renamed from: co */
    public final void mo101028co() {
        this.f315856an.f316352n.stopScroll();
        C0653fo foVar = this.f315856an.f316352n.mLayout;
        if (foVar != null) {
            foVar.scrollToPosition(this.f315857ao.mo101151a() + 1);
        }
    }

    /* renamed from: cp */
    public final void mo100894cp(String str) {
        C108473k kVar = this.f315853ak.f315519h;
        if (kVar != null) {
            ((TextView) kVar.f301710d.findViewById(R.id.search_in_app_text)).setText(kVar.f301707a.getString(R.string.app_search_text, new Object[]{str}));
            kVar.f301709c = str;
        }
    }

    /* renamed from: cq */
    public final void mo101029cq() {
        if (this.f315844ab && this.f315982r.mo79746e(C90029ch.f248194H) && !m188889ep()) {
            if (!C87566i.m142287ak(this.f315833aQ.getIntent().getExtras())) {
                int aI = mo100986aI(false);
                mo101040dt(aI, aI);
            } else if (this.f315982r.mo79746e(C90029ch.f248194H)) {
                int aI2 = mo100986aI(false);
                mo101040dt(aI2, aI2);
            } else {
                int aN = mo100990aN();
                mo101040dt(aN, aN);
            }
        }
    }

    /* renamed from: cr */
    public final void mo100895cr(int i) {
        if (this.f315940cc && mo101006bb() != null) {
            LogoView bb = mo101006bb();
            bb.getClass();
            if (bb.f63001h != i) {
                LogoView bb2 = mo101006bb();
                bb2.getClass();
                LogoView logoView = this.f315882bR;
                logoView.getClass();
                bb2.mo28225e(i, logoView.getVisibility() != 0);
            }
        }
    }

    /* renamed from: cs */
    public final void mo100896cs(boolean z) {
        if (this.f315940cc && mo101006bb() != null) {
            Boolean bool = (Boolean) this.f315957ct.f241687c.mo3842a();
            int i = 8;
            if (!z || bool == null || !bool.booleanValue()) {
                if (true == z) {
                    i = 0;
                }
                if (z) {
                    LogoView bb = mo101006bb();
                    bb.getClass();
                    if (bb.getVisibility() != 0) {
                        LogoView bb2 = mo101006bb();
                        bb2.getClass();
                        LogoView bb3 = mo101006bb();
                        bb3.getClass();
                        bb2.mo28225e(bb3.f63001h, true);
                    }
                }
                LogoView bb4 = mo101006bb();
                bb4.getClass();
                bb4.setVisibility(i);
                return;
            }
            LogoView bb5 = mo101006bb();
            bb5.getClass();
            bb5.setVisibility(8);
        }
    }

    /* renamed from: ct */
    public final void mo101030ct() {
        if (this.f315844ab && this.f315982r.mo79746e(C90029ch.f248194H) && m188889ep()) {
            mo101040dt(0, mo100986aI(false));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cu */
    public final void mo101031cu(ImageView imageView) {
        imageView.setImageResource(mo100987aJ());
        this.f315816Z.mo28211k(this.f315934cW.mo65443a(), "Verify Updates Center eligibility.", new C114008cr(this, imageView));
    }

    /* renamed from: cv */
    public final void mo100897cv(View.OnClickListener onClickListener) {
        LogoView bb = mo101006bb();
        bb.getClass();
        View findViewById = bb.findViewById(R.id.opa_drl_mic_btn);
        if (findViewById != null) {
            findViewById.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: cw */
    public final void mo100898cw(View.OnClickListener onClickListener) {
        this.f315834aR.setOnClickListener(onClickListener);
    }

    /* renamed from: cx */
    public final void mo100899cx(boolean z) {
        this.f315855am.f316156c = z;
    }

    /* renamed from: cy */
    public final void mo100919cy(C87546b bVar) {
        C114754h hVar = this.f315820aD;
        if (hVar != null) {
            hVar.mo101430t(bVar);
        }
    }

    /* renamed from: cz */
    public final void mo100920cz(C91097g gVar) {
        C114754h hVar = this.f315820aD;
        if (hVar != null) {
            hVar.mo101433w(gVar);
        }
    }

    /* renamed from: dA */
    public final void mo100900dA() {
    }

    /* renamed from: dB */
    public final void mo100901dB(int i) {
        int aI = mo100986aI(false);
        if (!mo101040dt(0, i)) {
            ((C59052c) ((C59052c) f315790j.mo56226d()).mo56372aa(28588)).mo56393w("#setDRLHeightCap - setting DRL height cap failed - prevHeightCap: %d, heightCap: %d", aI, i);
        }
    }

    /* renamed from: dC */
    public final void mo101032dC(boolean z) {
        this.f315929cR.mo101383a();
        mo100862bo(!z);
        C108232bc bcVar = null;
        if (z) {
            this.f315859aq.mo101133p(this.f315852aj);
            int e = this.f315859aq.mo101122e(C108230ba.f301020h) - 1;
            if (e >= 0) {
                bcVar = this.f315859aq.mo95352b(e);
            }
            C108232bc c = this.f315859aq.mo95353c();
            if ((bcVar == null || !bcVar.mo96610t()) && (c == null || !c.mo96610t())) {
                mo101040dt(0, mo100990aN());
            } else {
                mo101040dt(mo100990aN(), mo100990aN());
            }
            this.f315853ak.mo100787k();
            return;
        }
        int e2 = this.f315859aq.mo101122e(C108230ba.f301020h) - 1;
        if (e2 >= 0) {
            bcVar = this.f315859aq.mo95352b(e2);
        }
        this.f315859aq.mo101140w(this.f315852aj);
        bcVar.getClass();
        m188861dZ(bcVar);
        this.f315853ak.mo100797u();
        mo100999bI();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: dD */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101033dD(int r13, int r14) {
        /*
            r12 = this;
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r12.f315856an
            int r0 = r0.mo101172s()
            r1 = 0
            r2 = 472(0x1d8, float:6.61E-43)
            r3 = 4
            if (r0 != r3) goto L_0x0045
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.h r13 = r12.f315820aD
            if (r13 != 0) goto L_0x001e
            com.google.common.f.e r13 = f315790j
            com.google.common.f.x r13 = r13.mo56226d()
            java.lang.String r14 = "Zero State controller does not exist."
            r0 = 28550(0x6f86, float:4.0007E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r0)).mo56386p(r14)
            return
        L_0x001e:
            com.google.android.libraries.logging.k r13 = r13.mo101412b()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.h r0 = r12.f315820aD
            long r4 = r0.mo101417g()
            if (r13 != 0) goto L_0x0038
            com.google.common.f.e r13 = f315790j
            com.google.common.f.x r13 = r13.mo56226d()
            java.lang.String r14 = "Zero State VE tree does not exist."
            r0 = 28549(0x6f85, float:4.0006E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r0)).mo56386p(r14)
            return
        L_0x0038:
            com.google.common.o.oe r13 = com.google.android.libraries.logging.C28285c.m52875b(r13, r2)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.h r0 = r12.f315820aD
            if (r0 == 0) goto L_0x0051
            com.google.protos.ai.b.j r0 = r0.mo101420j()
            goto L_0x0052
        L_0x0045:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r12.f315856an
            android.view.ViewGroup r13 = r0.mo101168b(r13)
            com.google.common.o.oe r13 = com.google.android.libraries.logging.C28285c.m52874a(r13, r2)
            r4 = 0
        L_0x0051:
            r0 = r1
        L_0x0052:
            r5 = r4
            if (r13 == 0) goto L_0x01c7
            com.google.protobuf.cq r4 = r13.f163228c
            r11 = 0
            java.lang.Object r4 = r4.get(r11)
            com.google.common.o.aqs r4 = (com.google.common.p4552o.aqs) r4
            com.google.protobuf.bn r4 = r4.toBuilder()
            com.google.common.o.aqp r4 = (com.google.common.p4552o.aqp) r4
            com.google.protobuf.bt r7 = com.google.common.p4552o.ajg.f158866h
            com.google.common.o.ajg r8 = com.google.common.p4552o.ajg.f158865g
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.common.o.ajb r8 = (com.google.common.p4552o.ajb) r8
            int r9 = r14 + -1
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r10 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.UNKNOWN
            com.google.android.apps.gsa.search.shared.service.b.um r10 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
            com.google.assistant.s.a.j r10 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN
            if (r14 == 0) goto L_0x01c6
            r14 = 1
            r1 = 2
            if (r9 == r14) goto L_0x008a
            r10 = 3
            if (r9 == r1) goto L_0x008b
            if (r9 == r10) goto L_0x0088
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r9 = r12.f315856an
            r9.mo101172s()
            r10 = 1
            goto L_0x008b
        L_0x0088:
            r10 = 4
            goto L_0x008b
        L_0x008a:
            r10 = 2
        L_0x008b:
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.common.o.ajg r9 = (com.google.common.p4552o.ajg) r9
            int r10 = r10 + -1
            r9.f158869b = r10
            int r10 = r9.f158868a
            r10 = r10 | 16
            r9.f158868a = r10
            int r9 = r12.m188872eG()
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.common.o.ajg r10 = (com.google.common.p4552o.ajg) r10
            int r9 = r9 + -1
            r10.f158870c = r9
            int r9 = r10.f158868a
            r9 = r9 | 32
            r10.f158868a = r9
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.common.o.ajg r9 = (com.google.common.p4552o.ajg) r9
            r9.f158872e = r14
            int r14 = r9.f158868a
            r14 = r14 | 512(0x200, float:7.175E-43)
            r9.f158868a = r14
            com.google.protobuf.bv r14 = r8.build()
            com.google.common.o.ajg r14 = (com.google.common.p4552o.ajg) r14
            r4.mo58885m(r7, r14)
            com.google.protobuf.bv r14 = r4.build()
            com.google.common.o.aqs r14 = (com.google.common.p4552o.aqs) r14
            if (r0 == 0) goto L_0x00ec
            com.google.protobuf.bn r14 = r14.toBuilder()
            com.google.common.o.aqp r14 = (com.google.common.p4552o.aqp) r14
            r14.copyOnWrite()
            com.google.protobuf.bv r4 = r14.instance
            com.google.common.o.aqs r4 = (com.google.common.p4552o.aqs) r4
            r4.f159788g = r0
            int r0 = r4.f159782a
            r0 = r0 | 16
            r4.f159782a = r0
            com.google.protobuf.bv r14 = r14.build()
            com.google.common.o.aqs r14 = (com.google.common.p4552o.aqs) r14
        L_0x00ec:
            com.google.protobuf.bn r13 = r13.toBuilder()
            com.google.common.o.od r13 = (com.google.common.p4552o.C60320od) r13
            r13.mo57084d(r11, r14)
            com.google.common.o.aqm r14 = com.google.common.p4552o.aqm.f159760n
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.common.o.aql r14 = (com.google.common.p4552o.aql) r14
            r14.copyOnWrite()
            com.google.protobuf.bv r0 = r14.instance
            com.google.common.o.aqm r0 = (com.google.common.p4552o.aqm) r0
            int r4 = r0.f159762a
            r4 = r4 | r3
            r0.f159762a = r4
            r4 = 51627(0xc9ab, float:7.2345E-41)
            r0.f159765d = r4
            r13.copyOnWrite()
            com.google.protobuf.bv r0 = r13.instance
            com.google.common.o.oe r0 = (com.google.common.p4552o.C60321oe) r0
            com.google.protobuf.bv r14 = r14.build()
            com.google.common.o.aqm r14 = (com.google.common.p4552o.aqm) r14
            r14.getClass()
            r0.f163230e = r14
            int r14 = r0.f163226a
            r14 = r14 | 16
            r0.f163226a = r14
            com.google.protobuf.bv r13 = r13.build()
            com.google.common.o.oe r13 = (com.google.common.p4552o.C60321oe) r13
            com.google.common.o.uf r14 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.common.o.tz r14 = (com.google.common.p4552o.C60548tz) r14
            r14.copyOnWrite()
            com.google.protobuf.bv r0 = r14.instance
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
            int r4 = r0.f164093a
            r4 = r4 | r1
            r0.f164093a = r4
            r0.f164258m = r2
            com.google.common.o.a.u r0 = com.google.common.p4552o.p4553a.C59565u.f158051f
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.common.o.a.p r0 = (com.google.common.p4552o.p4553a.C59560p) r0
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.b r2 = r12.f315950cm
            com.google.android.apps.gsa.assistant.shared.l.e r2 = r2.f318448a
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.common.o.a.u r4 = (com.google.common.p4552o.p4553a.C59565u) r4
            int r2 = r2.ca
            r4.f158054b = r2
            int r2 = r4.f158053a
            r1 = r1 | r2
            r4.f158053a = r1
            r14.copyOnWrite()
            com.google.protobuf.bv r1 = r14.instance
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.common.o.a.u r0 = (com.google.common.p4552o.p4553a.C59565u) r0
            r0.getClass()
            r1.f164174bb = r0
            int r0 = r1.f164251f
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 | r2
            r1.f164251f = r0
            com.google.protobuf.bv r14 = r14.build()
            r9 = r14
            com.google.common.o.uf r9 = (com.google.common.p4552o.C60555uf) r9
            com.google.android.apps.gsa.staticplugins.opa.util.cr r4 = r12.f315849ag
            r7 = 0
            r10 = r13
            r4.mo100722b(r5, r7, r9, r10)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.w r14 = r12.f315821aE
            r14.f316465a = r11
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r14 = r12.f315856an
            int r14 = r14.mo101172s()
            if (r14 != r3) goto L_0x01c7
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.h r14 = r12.f315820aD
            if (r14 == 0) goto L_0x01c7
            com.google.android.apps.gsa.staticplugins.opa.zerostate.f.l r14 = r12.f315953cp
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.b r0 = r12.f315950cm
            java.lang.String r0 = r0.f318451d
            com.google.assistant.s.a.ih r0 = com.google.android.apps.gsa.search.shared.p6930h.C87571n.m142340d(r0)
            int r1 = r12.m188872eG()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.b r2 = r12.f315950cm
            com.google.android.apps.gsa.assistant.shared.l.e r2 = r2.f318448a
            r14.mo101572g(r0, r1, r2)
            dagger.a r14 = r12.f315954cq
            java.lang.Object r14 = r14.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.f.g r14 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114737g) r14
            com.google.common.o.l.r r13 = r13.f163227b
            if (r13 != 0) goto L_0x01b9
            com.google.common.o.l.r r13 = com.google.common.p4552o.p4566l.C60218r.f162925d
        L_0x01b9:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.h r0 = r12.f315820aD
            r0.getClass()
            android.view.ViewGroup r0 = r0.mo101411a()
            r14.mo101564c(r13, r0)
            return
        L_0x01c6:
            throw r1
        L_0x01c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.C114071eg.mo101033dD(int, int):void");
    }

    /* renamed from: dE */
    public final void mo101034dE(int i) {
        C89160q qVar;
        C89157n nVar = (C89157n) C89158o.f241716c.createBuilder();
        C113984c cVar = C113984c.UNKNOWN;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C53306j jVar = C53306j.UNKNOWNN;
        int i2 = i - 1;
        if (i2 == 1) {
            qVar = C89160q.HISTORY_STATE;
        } else if (i2 == 2) {
            qVar = C89160q.DEMAND_STATE;
        } else if (i2 != 3) {
            this.f315856an.mo101172s();
            qVar = C89160q.UNKNOWN;
        } else {
            qVar = C89160q.ZERO_STATE;
        }
        nVar.copyOnWrite();
        C89158o oVar = (C89158o) nVar.instance;
        oVar.f241719b = qVar.f241727f;
        oVar.f241718a |= 1;
        this.f315957ct.mo83143q((C89158o) nVar.build());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0120, code lost:
        if (r8.canScrollVertically(-1) != false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0144, code lost:
        if (r8.canScrollVertically(1) != false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01cf, code lost:
        if (r2 > r8) goto L_0x0159;
     */
    /* renamed from: dF */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo100902dF(android.view.MotionEvent r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.t r0 = r7.f315848af
            r1 = 0
            if (r0 == 0) goto L_0x01f3
            boolean r0 = r7.mo101038dk()
            if (r0 != 0) goto L_0x01f3
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.t r0 = r7.f315848af
            r0.getClass()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianDynamicResponseLayerView r2 = r0.f316435b
            r2.getClass()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.f316101b = r1
            if (r8 == 0) goto L_0x01f3
            if (r9 == 0) goto L_0x01f3
            boolean r2 = r0.f316453t
            if (r2 != 0) goto L_0x0043
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f316440g
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249385cY
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x01f3
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f316440g
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249383cW
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x01f3
            dagger.a r2 = r0.f316455v
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.q.da r2 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113197da) r2
            boolean r2 = r2.mo99910a()
            if (r2 == 0) goto L_0x01f3
        L_0x0043:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianDynamicResponseLayerView r2 = r0.f316435b
            if (r2 == 0) goto L_0x01f3
            boolean r3 = r2.mo101054b()
            if (r3 != 0) goto L_0x01f3
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L_0x0055
            goto L_0x01f3
        L_0x0055:
            int r2 = r0.f316450q
            r3 = 2
            r4 = 1
            if (r2 == r3) goto L_0x00a8
            int r2 = r8.getAction()
            if (r2 != 0) goto L_0x00a8
            boolean r2 = r0.f316446m
            if (r2 != 0) goto L_0x0066
            goto L_0x00a8
        L_0x0066:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianDynamicResponseLayerView r5 = r0.f316435b
            r5.getClass()
            r5.getGlobalVisibleRect(r2)
            float r5 = r8.getX()
            int r5 = (int) r5
            float r6 = r8.getY()
            int r6 = (int) r6
            boolean r2 = r2.contains(r5, r6)
            if (r2 == 0) goto L_0x00a4
            android.view.View r2 = r0.f316437d
            boolean r2 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114150t.m189358k(r8, r2)
            if (r2 != 0) goto L_0x00a4
            android.view.View r2 = r0.f316438e
            if (r2 != 0) goto L_0x009a
            android.view.View r2 = r0.f316441h
            r5 = 2131432555(0x7f0b146b, float:1.848687E38)
            android.view.View r2 = r2.findViewById(r5)
            r0.f316438e = r2
        L_0x009a:
            android.view.View r2 = r0.f316438e
            boolean r2 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114150t.m189358k(r8, r2)
            if (r2 != 0) goto L_0x00a4
            r2 = 1
            goto L_0x00a5
        L_0x00a4:
            r2 = 0
        L_0x00a5:
            r0.f316454u = r2
            goto L_0x00aa
        L_0x00a8:
            boolean r2 = r0.f316454u
        L_0x00aa:
            int r5 = r9.getActionMasked()
            r6 = 3
            if (r5 == r6) goto L_0x01d9
            int r5 = r9.getActionMasked()
            if (r5 != r4) goto L_0x00b9
            goto L_0x01d9
        L_0x00b9:
            if (r2 != 0) goto L_0x00bd
            goto L_0x01f3
        L_0x00bd:
            boolean r2 = r0.f316449p
            if (r2 == 0) goto L_0x00c3
            goto L_0x01f3
        L_0x00c3:
            float r2 = r9.getY()
            float r5 = r8.getY()
            float r2 = r2 - r5
            int r2 = (int) r2
            float r9 = r9.getX()
            float r8 = r8.getX()
            float r9 = r9 - r8
            int r8 = (int) r9
            boolean r9 = r0.f316446m
            if (r9 == 0) goto L_0x0101
            int r9 = java.lang.Math.abs(r8)
            int r5 = java.lang.Math.abs(r2)
            int r9 = r9 + r5
            int r5 = r0.f316443j
            if (r9 >= r5) goto L_0x00ea
            goto L_0x01f3
        L_0x00ea:
            r0.f316446m = r1
            int r8 = java.lang.Math.abs(r8)
            int r9 = java.lang.Math.abs(r2)
            if (r8 <= r9) goto L_0x0101
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianDynamicResponseLayerView r8 = r0.f316435b
            r8.getClass()
            r8.f316101b = r1
            r0.f316449p = r4
            goto L_0x01f3
        L_0x0101:
            int r8 = r0.f316450q
            if (r8 != 0) goto L_0x0126
            if (r2 <= 0) goto L_0x0126
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.h r8 = r0.f316442i
            boolean r8 = r8.mo100885cZ()
            if (r8 != 0) goto L_0x0122
            boolean r8 = r0.mo101201l()
            if (r8 != 0) goto L_0x0116
            goto L_0x0126
        L_0x0116:
            android.support.v7.widget.RecyclerView r8 = r0.f316439f
            r8.getClass()
            r9 = -1
            boolean r8 = r8.canScrollVertically(r9)
            if (r8 == 0) goto L_0x0126
        L_0x0122:
            r0.f316449p = r4
            goto L_0x01f3
        L_0x0126:
            int r8 = r0.f316450q
            if (r8 != 0) goto L_0x014a
            if (r2 >= 0) goto L_0x014a
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.h r8 = r0.f316442i
            boolean r8 = r8.mo100884cY()
            if (r8 != 0) goto L_0x0146
            boolean r8 = r0.mo101201l()
            if (r8 != 0) goto L_0x013b
            goto L_0x014a
        L_0x013b:
            android.support.v7.widget.RecyclerView r8 = r0.f316439f
            r8.getClass()
            boolean r8 = r8.canScrollVertically(r4)
            if (r8 == 0) goto L_0x014a
        L_0x0146:
            r0.f316449p = r4
            goto L_0x01f3
        L_0x014a:
            int r8 = r0.f316450q
            if (r8 != 0) goto L_0x015c
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianDynamicResponseLayerView r8 = r0.f316435b
            r8.getClass()
            boolean r8 = r8.f316100a
            if (r8 == 0) goto L_0x015c
            r0.f316449p = r4
        L_0x0159:
            r1 = 1
            goto L_0x01f3
        L_0x015c:
            r0.mo101195e()
            int r8 = -r2
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianDynamicResponseLayerView r9 = r0.f316435b
            r9.getClass()
            int r9 = r9.getHeight()
            int r2 = r0.f316448o
            int r2 = r2 + r8
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianDynamicResponseLayerView r5 = r0.f316435b
            int r5 = r5.f316102c
            r0.f316447n = r5
            if (r8 <= 0) goto L_0x01a1
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 30
            if (r5 < r6) goto L_0x019a
            boolean r5 = r0.mo101201l()
            if (r5 != 0) goto L_0x0181
            goto L_0x019a
        L_0x0181:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianDynamicResponseLayerView r5 = r0.f316435b
            r5.getClass()
            android.view.WindowInsets r5 = r5.getRootWindowInsets()
            int r5 = r5.getSystemWindowInsetBottom()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianDynamicResponseLayerView r6 = r0.f316435b
            android.view.WindowInsets r6 = r6.getRootWindowInsets()
            int r6 = r6.getStableInsetBottom()
            int r5 = r5 - r6
            goto L_0x019b
        L_0x019a:
            r5 = 0
        L_0x019b:
            int r5 = r5 + r9
            int r9 = r0.f316447n
            if (r5 < r9) goto L_0x01a1
            goto L_0x01f3
        L_0x01a1:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianDynamicResponseLayerView r9 = r0.f316435b
            r9.f316101b = r4
            if (r8 != 0) goto L_0x01a8
        L_0x01a7:
            goto L_0x0159
        L_0x01a8:
            r0.f316450q = r3
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianDynamicResponseLayerView r8 = r0.f316435b
            r8.getClass()
            r8.mo101053a(r1)
            com.google.android.apps.gsa.search.core.i.t r8 = r0.f316440g
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247785nh
            boolean r8 = r8.mo79746e(r9)
            if (r8 == 0) goto L_0x01d2
            int r8 = r0.f316448o
            int r9 = r0.f316451r
            int r8 = r8 + r9
            int r9 = r0.f316447n
            int r8 = java.lang.Math.min(r8, r9)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.h r9 = r0.f316442i
            boolean r9 = r9.mo100884cY()
            if (r9 != 0) goto L_0x01d2
            if (r2 <= r8) goto L_0x01d2
            goto L_0x01a7
        L_0x01d2:
            r0.mo101198h(r2)
            r0.mo101191a(r4)
            return r4
        L_0x01d9:
            boolean r8 = r0.f316452s
            if (r8 == 0) goto L_0x01ea
            r0.mo101197g()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianDynamicResponseLayerView r8 = r0.f316435b
            r8.getClass()
            r8.f316101b = r1
            r0.mo101191a(r1)
        L_0x01ea:
            r0.f316454u = r1
            r0.f316450q = r1
            r0.f316449p = r1
            r0.f316446m = r4
            r1 = r2
        L_0x01f3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.C114071eg.mo100902dF(android.view.MotionEvent, android.view.MotionEvent):boolean");
    }

    /* renamed from: dG */
    public final void mo100903dG(C109037fg fgVar) {
        this.f315911bu = fgVar;
        this.f315847ae.f316246f = fgVar;
        this.f315859aq.mo101121G(fgVar);
        this.f315857ao.f316256e = fgVar;
    }

    /* renamed from: da */
    public final boolean mo100904da() {
        OpaAppWidgetCard opaAppWidgetCard = (OpaAppWidgetCard) this.f315984t.findViewById(R.id.widget_card_ui);
        return opaAppWidgetCard != null && opaAppWidgetCard.mo96562e();
    }

    /* renamed from: db */
    public final boolean mo100905db() {
        return this.f315859aq.mo101122e(C108230ba.f301013a) != -1;
    }

    /* renamed from: dc */
    public final boolean mo100906dc() {
        if (!this.f315982r.mo79746e(C90014bt.f247793np)) {
            return false;
        }
        C107382f fVar = (C107382f) this.f315974dk.mo95995a().mo56111f();
        if (this.f315850ah.f301557d || !this.f315844ab || !this.f315940cc || !mo101037dg() || this.f315978n || this.f315824aH != null || fVar == C107382f.RENDERED || fVar == C107382f.READY_TO_RENDER || this.f315835aS.f300678a) {
            return false;
        }
        C109037fg fgVar = this.f315911bu;
        return fgVar == null || !fgVar.f303205a.f303262aV.mo95240v();
    }

    /* renamed from: dd */
    public final boolean mo101035dd(C108232bc bcVar) {
        C108232bc c;
        if (this.f315982r.mo79746e(C90029ch.f248194H) && m188888eo(bcVar)) {
            return true;
        }
        if (!this.f315844ab || !this.f315982r.mo79746e(C90029ch.f248212Z) || bcVar == null || (c = this.f315859aq.mo95353c()) == null || !c.f301043y || !bcVar.f301043y) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: de */
    public final boolean mo101036de(C108262cf cfVar) {
        if (cfVar == null || TextUtils.isEmpty(cfVar.f301174d) || cfVar.f301170K != 1 || cfVar.f301167H != ((int) this.f315982r.mo79743a(C90029ch.f248309x))) {
            return false;
        }
        return true;
    }

    /* renamed from: df */
    public final boolean mo100907df() {
        if (this.f315844ab) {
            return this.f315940cc || this.f315982r.mo79746e(C90029ch.f248302q);
        }
        return false;
    }

    /* renamed from: dg */
    public final boolean mo101037dg() {
        return this.f315986v.findViewById(R.id.valyrian_chat_ui_root) != null;
    }

    /* renamed from: dj */
    public final boolean mo100908dj() {
        return this.f315856an.mo101172s() == 3;
    }

    /* renamed from: dk */
    public final boolean mo101038dk() {
        return this.f315983s.mo96407t() && mo101039dm();
    }

    /* renamed from: dl */
    public final boolean mo100909dl() {
        return this.f315859aq.mo101122e(C108230ba.f301020h) != -1;
    }

    /* renamed from: dm */
    public final boolean mo101039dm() {
        return this.f315981q.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: dn */
    public final boolean mo100910dn() {
        return this.f315824aH != null || this.f315978n;
    }

    /* renamed from: dp */
    public final boolean mo100911dp() {
        return this.f315859aq.mo101122e(C108230ba.f301018f) == -1 && this.f315859aq.mo101122e(C108230ba.f301017e) == -1 && this.f315859aq.mo101122e(C108230ba.f301019g) == -1 && !mo100910dn();
    }

    /* renamed from: dq */
    public final boolean mo100912dq() {
        C108232bc c = this.f315859aq.mo95353c();
        return (c instanceof C108212aj) && ((C108212aj) c).f300977c == 11;
    }

    /* renamed from: dr */
    public final boolean mo100913dr() {
        return mo100995aY().getMinimumHeight() == mo100990aN();
    }

    /* renamed from: ds */
    public final boolean mo100914ds() {
        String str;
        String str2;
        if (this.f315856an.mo101172s() == 4) {
            if (this.f315977m || this.f315832aP) {
                return false;
            }
            if (this.f315856an.f316355q == 5 && !this.f315844ab) {
                mo101016cF(true);
            } else if (!this.f315844ab || !mo100911dp()) {
                mo101014cD(true, true);
            } else {
                C109037fg fgVar = this.f315911bu;
                fgVar.getClass();
                fgVar.f303205a.f303444i.mo95167z(C89849ae.OPA_ACTIVITY_DISMISS_BACK);
            }
            return true;
        } else if ((this.f315856an.mo101172s() == 3 || this.f315856an.mo101172s() == 2) && this.f315910bt == 4 && !this.f315976l) {
            if (this.f315982r.mo79746e(C90014bt.f247080aR)) {
                mo100864bq();
                this.f315983s.mo96397j();
            }
            this.f315856an.mo101170q();
            return true;
        } else if (!this.f315982r.mo79746e(C90029ch.f248290e) || this.f315921cJ.isEmpty()) {
            C28292j jVar = new C28292j(118058);
            jVar.mo33795i(5);
            C89949q.m146521e(C28285c.m52884k(jVar, 5, 0), false);
            return false;
        } else {
            C109037fg fgVar2 = this.f315911bu;
            fgVar2.getClass();
            fgVar2.f303205a.f303454s.mo96219b(new C88489j(C87739bu.OPA_CANCEL_CONVERSATION).mo82013a());
            if (mo101037dg()) {
                m188860dY();
            }
            C114095a aVar = this.f315859aq;
            aVar.mo101141x(aVar.mo95351a());
            boolean dk = mo101038dk();
            C114054dt dtVar = (C114054dt) C58557jl.m90131l(this.f315921cJ);
            if (this.f315814X.mo26870b() - dtVar.f315756h > f315784bD) {
                C28292j jVar2 = new C28292j(118058);
                jVar2.mo33795i(5);
                C89949q.m146521e(C28285c.m52884k(jVar2, 5, 0), false);
                return false;
            }
            long j = dtVar.f315754f;
            C63088z zVar = dtVar.f315755g;
            if (!(j == 0 || zVar == null)) {
                C88191sn snVar = (C88191sn) C88192so.f238403d.createBuilder();
                snVar.copyOnWrite();
                C88192so soVar = (C88192so) snVar.instance;
                soVar.f238405a = 2 | soVar.f238405a;
                soVar.f238407c = j;
                snVar.copyOnWrite();
                C88192so soVar2 = (C88192so) snVar.instance;
                soVar2.f238405a |= 1;
                soVar2.f238406b = zVar;
                this.f315904bn = (C88192so) snVar.build();
            }
            if (mo100907df()) {
                this.f315853ak.mo100793q(dtVar.f315749a.toString());
                str = dtVar.f315749a.toString();
            } else {
                str = null;
            }
            Iterator it = dtVar.f315750b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C108232bc bcVar = (C108232bc) it.next();
                if (!m188888eo(bcVar)) {
                    this.f315970dg = false;
                    this.f315853ak.mo100783g(true);
                }
                if (!(bcVar instanceof C108451je)) {
                    if (bcVar instanceof C108262cf) {
                        String str3 = ((C108262cf) bcVar).f301166G;
                        if (C82193a.m130503a(this.f315833aQ)) {
                            str2 = this.f315965db;
                        } else {
                            str2 = this.f315937cZ;
                        }
                        if (str3.equals(str2)) {
                            mo101029cq();
                            dk = true;
                        }
                    }
                    if (this.f315982r.mo79746e(C90029ch.f248292g) && (bcVar instanceof C108457jk) && !TextUtils.isEmpty(str)) {
                        C114095a aVar2 = this.f315859aq;
                        aVar2.mo101141x(aVar2.mo95351a());
                        ((C108457jk) bcVar).mo96898b();
                        break;
                    }
                } else {
                    str = ((C108451je) bcVar).mo96890c();
                }
                this.f315859aq.mo101133p(bcVar);
            }
            this.f315850ah.mo96863g();
            this.f315850ah.mo96861d(dtVar.f315751c);
            C108395hc hcVar = this.f315851ai;
            hcVar.mo96838d();
            hcVar.mo96839e();
            if (!dtVar.f315752d.isEmpty()) {
                mo95381W(C58485gu.m89842j(dtVar.f315752d));
            } else {
                this.f315853ak.mo100787k();
            }
            mo95433v(C58485gu.m89842j(dtVar.f315753e));
            if (!dk) {
                mo101030ct();
                ValyrianRecyclerView valyrianRecyclerView = this.f315866ax;
                valyrianRecyclerView.getClass();
                valyrianRecyclerView.getLayoutParams().height = -2;
            }
            List list = this.f315921cJ;
            list.remove(list.size() - 1);
            C28292j jVar3 = new C28292j(118059);
            jVar3.mo33795i(5);
            C89949q.m146521e(C28285c.m52884k(jVar3, 5, 0), false);
            return true;
        }
    }

    /* renamed from: dt */
    public final boolean mo101040dt(int i, int i2) {
        ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView;
        if (!this.f315844ab || (valyrianDynamicResponseLayerView = this.f315865aw) == null || valyrianDynamicResponseLayerView.getParent() == null || this.f315866ax == null) {
            return false;
        }
        ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView2 = this.f315865aw;
        valyrianDynamicResponseLayerView2.getClass();
        C58976aa aaVar = C58975e.f156826a;
        valyrianDynamicResponseLayerView2.f316102c = i2;
        valyrianDynamicResponseLayerView2.requestLayout();
        ValyrianRecyclerView valyrianRecyclerView = this.f315866ax;
        valyrianRecyclerView.getClass();
        valyrianRecyclerView.f316112b = i2;
        ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView3 = this.f315865aw;
        valyrianDynamicResponseLayerView3.getClass();
        valyrianDynamicResponseLayerView3.setMinimumHeight(i);
        ValyrianRecyclerView valyrianRecyclerView2 = this.f315866ax;
        valyrianRecyclerView2.getClass();
        valyrianRecyclerView2.setMinimumHeight(i);
        return true;
    }

    /* renamed from: du */
    public final boolean mo101041du() {
        boolean z = this.f315940cc && this.f315822aF == 1;
        Boolean bool = (Boolean) this.f315957ct.f241687c.mo3842a();
        return !z && !(this.f315940cc && bool != null && bool.booleanValue()) && !this.f315902bl;
    }

    /* renamed from: dv */
    public final boolean mo100915dv() {
        return this.f315856an.mo101172s() == 4;
    }

    /* renamed from: dw */
    public final boolean mo101042dw(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (Math.abs(motionEvent2.getY() - motionEvent.getY()) <= ((float) ViewConfiguration.get(this.f315981q).getScaledTouchSlop()) || !mo95399aj()) {
            return true;
        }
        if (this.f315824aH == null || !this.f315827aK) {
            return false;
        }
        return true;
    }

    /* renamed from: dx */
    public final boolean mo101043dx() {
        if (!this.f315844ab || this.f315983s.mo96407t() || ((int) this.f315982r.mo79743a(C90014bt.f247689lr)) != 1 || !((C113787bc) this.f315958cu.mo27525b()).mo100629i(false)) {
            return false;
        }
        return true;
    }

    /* renamed from: dy */
    public final void mo100916dy(int i) {
        if (this.f315906bp != 1) {
            if (i != 19) {
                if (i == 13) {
                    i = 13;
                } else {
                    return;
                }
            }
            this.f315906bp = i;
            return;
        }
        this.f315906bp = i;
    }

    /* renamed from: e */
    public final int mo95416e() {
        return this.f315912cA;
    }

    /* renamed from: f */
    public final int mo95417f() {
        return this.f315859aq.mo95351a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [int] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: fM */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19965fM(com.google.android.apps.gsa.search.shared.service.ServiceEventData r11) {
        /*
            r10 = this;
            com.google.android.apps.gsa.search.shared.service.b.uo r0 = r11.f236959a
            int r0 = r0.f238699b
            com.google.android.apps.gsa.search.shared.service.b.um r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.m142794a(r0)
            if (r0 != 0) goto L_0x000c
            com.google.android.apps.gsa.search.shared.service.b.um r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
        L_0x000c:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.UNKNOWN
            com.google.assistant.s.a.j r1 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN
            int r0 = r0.ordinal()
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x03d5
            r4 = 73
            if (r0 == r4) goto L_0x03b8
            r4 = 81
            if (r0 == r4) goto L_0x0378
            r4 = 93
            if (r0 == r4) goto L_0x01e7
            r4 = 112(0x70, float:1.57E-43)
            if (r0 == r4) goto L_0x00c2
            r2 = 152(0x98, float:2.13E-43)
            if (r0 == r2) goto L_0x00a0
            r2 = 185(0xb9, float:2.59E-43)
            if (r0 == r2) goto L_0x0033
            goto L_0x0552
        L_0x0033:
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88190sm.f238402a
            com.google.android.apps.gsa.search.shared.service.b.uo r2 = r11.f236959a
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r2.mo58887l(r0)
            com.google.protobuf.bf r2 = r2.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r2.mo58857o(r0)
            if (r0 != 0) goto L_0x0056
            com.google.common.f.e r11 = f315790j
            com.google.common.f.x r11 = r11.mo56226d()
            java.lang.String r0 = "handleQueryOpaqueTokenEvent missing queryOpaqueTokenEventData"
            r1 = 28532(0x6f74, float:3.9982E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x0056:
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88190sm.f238402a
            java.lang.Object r11 = r11.mo81918e(r0)
            com.google.android.apps.gsa.search.shared.service.b.so r11 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88192so) r11
            long r4 = r11.f238407c
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0552
            int r0 = r11.f238405a
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0552
            java.util.Queue r0 = r10.f315903bm
            com.google.android.apps.gsa.search.shared.service.b.so r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88192so.f238403d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.sn r2 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88191sn) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.android.apps.gsa.search.shared.service.b.so r6 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88192so) r6
            int r7 = r6.f238405a
            r1 = r1 | r7
            r6.f238405a = r1
            r6.f238407c = r4
            com.google.protobuf.z r11 = r11.f238406b
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.apps.gsa.search.shared.service.b.so r1 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88192so) r1
            r11.getClass()
            int r4 = r1.f238405a
            r3 = r3 | r4
            r1.f238405a = r3
            r1.f238406b = r11
            com.google.protobuf.bv r11 = r2.build()
            com.google.android.apps.gsa.search.shared.service.b.so r11 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88192so) r11
            r0.add(r11)
            return
        L_0x00a0:
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88099pc.f238189a
            com.google.android.apps.gsa.search.shared.service.b.uo r1 = r11.f236959a
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r1.mo58887l(r0)
            com.google.protobuf.bf r1 = r1.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 == 0) goto L_0x0552
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88099pc.f238189a
            java.lang.Object r11 = r11.mo81918e(r0)
            com.google.android.apps.gsa.search.shared.service.b.pe r11 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88101pe) r11
            boolean r11 = r11.f238193b
            r10.f315971dh = r11
            return
        L_0x00c2:
            com.google.android.apps.gsa.search.shared.service.b.uo r0 = r11.f236959a
            int r0 = r0.f238699b
            com.google.android.apps.gsa.search.shared.service.b.um r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.m142794a(r0)
            if (r0 != 0) goto L_0x00ce
            com.google.android.apps.gsa.search.shared.service.b.um r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
        L_0x00ce:
            com.google.protobuf.bt r1 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107505a.f299120a
            com.google.android.apps.gsa.search.shared.service.b.uo r4 = r11.f236959a
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r4.mo58887l(r1)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r1 = r1.f169971d
            boolean r1 = r4.mo58857o(r1)
            if (r1 != 0) goto L_0x00f1
            com.google.common.f.e r11 = f315790j
            com.google.common.f.x r11 = r11.mo56226d()
            java.lang.String r1 = "onServiceEvent: %s missing OpaSessionServiceEvent extension"
            r2 = 28580(0x6fa4, float:4.0049E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r2)).mo56389s(r1, r0)
            return
        L_0x00f1:
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107505a.f299120a
            java.lang.Object r11 = r11.mo81918e(r0)
            com.google.android.apps.gsa.staticplugins.opa.as.b.e r11 = (com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107556e) r11
            int r0 = r11.f299213b
            int r0 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107554c.m178398a(r0)
            if (r0 != 0) goto L_0x0102
            r0 = 1
        L_0x0102:
            int r0 = r0 + -1
            r1 = 9
            if (r0 == r1) goto L_0x01e4
            r1 = 12
            if (r0 == r1) goto L_0x01dd
            r1 = 14
            if (r0 == r1) goto L_0x019a
            r11 = 20
            if (r0 == r11) goto L_0x014c
            r11 = 22
            if (r0 == r11) goto L_0x011a
            goto L_0x0552
        L_0x011a:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r11 = r10.f315856an
            int r11 = r11.mo101172s()
            r0 = 4
            if (r11 == r0) goto L_0x0552
            android.view.ViewGroup r11 = r10.f315984t
            r0 = 2131437266(0x7f0b26d2, float:1.8496426E38)
            r11.findViewById(r0)
            com.google.android.apps.gsa.search.core.i.t r11 = r10.f315982r
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247080aR
            boolean r11 = r11.mo79746e(r0)
            if (r11 == 0) goto L_0x013d
            r10.mo100864bq()
            com.google.android.apps.gsa.staticplugins.opa.chatui.ax r11 = r10.f315983s
            r11.mo96397j()
        L_0x013d:
            com.google.android.apps.gsa.staticplugins.opa.fg r11 = r10.f315911bu
            if (r11 == 0) goto L_0x0552
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ax r0 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ax
            r0.<init>(r10)
            com.google.android.apps.gsa.staticplugins.opa.fj r11 = r11.f303205a
            r11.mo97416D(r0)
            return
        L_0x014c:
            com.google.android.apps.gsa.staticplugins.opa.fg r11 = r10.f315911bu
            if (r11 == 0) goto L_0x0552
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r11.f303205a
            boolean r0 = r0.mo97521bm()
            if (r0 == 0) goto L_0x0552
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r11.f303205a
            boolean r1 = r0.f303298bE
            if (r1 != 0) goto L_0x0552
            dagger.a r0 = r0.f303328bi
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0552
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r11.f303205a
            dagger.a r0 = r0.f303328bi
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.nga.api.bx r0 = (com.google.android.apps.gsa.nga.api.C74720bx) r0
            com.google.android.apps.gsa.nga.api.NgaState r0 = r0.mo71089f()
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0552
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r11.f303205a
            android.os.Bundle r0 = r0.f303442g
            boolean r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142254aB(r0)
            if (r0 != 0) goto L_0x0552
            com.google.android.apps.gsa.staticplugins.opa.fj r11 = r11.f303205a
            com.google.android.apps.gsa.staticplugins.opa.fl r11 = r11.f303444i
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_NGA_CANCEL_QUERY
            r11.mo95167z(r0)
            return
        L_0x019a:
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107524c.f299156a
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r11.mo58887l(r0)
            com.google.protobuf.bf r11 = r11.f169962ag
            com.google.protobuf.bs r1 = r0.f169971d
            java.lang.Object r11 = r11.mo58854l(r1)
            if (r11 != 0) goto L_0x01b0
            java.lang.Object r11 = r0.f169969b
            goto L_0x01b4
        L_0x01b0:
            java.lang.Object r11 = r0.mo58889c(r11)
        L_0x01b4:
            com.google.android.apps.gsa.staticplugins.opa.as.b.a.ap r11 = (com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107522ap) r11
            boolean r11 = r11.f299154b
            boolean r0 = r10.mo100907df()
            if (r0 != 0) goto L_0x01c1
            r10.mo100863bp(r11)
        L_0x01c1:
            boolean r0 = r10.mo101037dg()
            if (r0 == 0) goto L_0x0552
            boolean r0 = r10.mo100907df()
            if (r0 == 0) goto L_0x0552
            com.google.android.apps.gsa.staticplugins.opa.valyrian.aa r0 = r10.f315853ak
            boolean r1 = r10.f315970dg
            if (r1 != 0) goto L_0x01d6
            if (r11 == 0) goto L_0x01d6
            r2 = 1
        L_0x01d6:
            r0.mo100783g(r2)
            r10.mo101022ce()
            return
        L_0x01dd:
            r10.mo100864bq()
            r10.mo100866bu()
            return
        L_0x01e4:
            r10.f315978n = r3
            return
        L_0x01e7:
            com.google.android.apps.gsa.staticplugins.opa.fg r0 = r10.f315911bu
            if (r0 == 0) goto L_0x01f1
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r0.f303205a
            java.lang.CharSequence r0 = r0.f303383co
            r10.f315871bG = r0
        L_0x01f1:
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C87757cl.f237517a
            com.google.android.apps.gsa.search.shared.service.b.uo r1 = r11.f236959a
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r1.mo58887l(r0)
            com.google.protobuf.bf r1 = r1.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 != 0) goto L_0x0214
            com.google.common.f.e r11 = f315790j
            com.google.common.f.x r11 = r11.mo56226d()
            java.lang.String r0 = "handleConversationParamsReceivedEvent missing conversationParamsReceivedEventData"
            r1 = 28529(0x6f71, float:3.9978E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x0214:
            com.google.android.apps.gsa.staticplugins.opa.chatui.id r0 = r10.f315850ah
            boolean r0 = r0.f301562i
            if (r0 == 0) goto L_0x022a
            com.google.common.f.e r0 = f315790j
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "handleConversationParamsReceivedEvent clearSuggestions"
            r4 = 28528(0x6f70, float:3.9976E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r1)
            r10.mo100866bu()
        L_0x022a:
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C87757cl.f237517a     // Catch:{ ct -> 0x0369 }
            java.lang.Object r11 = r11.mo81918e(r0)     // Catch:{ ct -> 0x0369 }
            com.google.android.apps.gsa.search.shared.service.b.cn r11 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87759cn) r11     // Catch:{ ct -> 0x0369 }
            com.google.assistant.e.j.ex r11 = r11.f237521b     // Catch:{ ct -> 0x0369 }
            if (r11 != 0) goto L_0x0238
            com.google.assistant.e.j.ex r11 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b     // Catch:{ ct -> 0x0369 }
        L_0x0238:
            com.google.protobuf.cq r11 = r11.f136712a     // Catch:{ ct -> 0x0369 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ ct -> 0x0369 }
        L_0x023e:
            boolean r0 = r11.hasNext()     // Catch:{ ct -> 0x0369 }
            if (r0 == 0) goto L_0x0552
            java.lang.Object r0 = r11.next()     // Catch:{ ct -> 0x0369 }
            com.google.assistant.e.j.kc r0 = (com.google.assistant.p3897e.p3921j.C52232kc) r0     // Catch:{ ct -> 0x0369 }
            java.lang.String r1 = "asst.response.logging.params"
            java.lang.String r4 = r0.f137065b     // Catch:{ ct -> 0x0369 }
            boolean r1 = r1.equals(r4)     // Catch:{ ct -> 0x0369 }
            if (r1 == 0) goto L_0x0350
            java.lang.String r1 = "assistant.api.params.ResponseLoggingParams"
            com.google.assistant.e.j.ka r4 = r0.f137066c     // Catch:{ ct -> 0x0369 }
            if (r4 != 0) goto L_0x025c
            com.google.assistant.e.j.ka r4 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x0369 }
        L_0x025c:
            java.lang.String r4 = r4.f137060b     // Catch:{ ct -> 0x0369 }
            boolean r1 = r1.equals(r4)     // Catch:{ ct -> 0x0369 }
            if (r1 == 0) goto L_0x0350
            com.google.assistant.e.j.ka r0 = r0.f137066c     // Catch:{ ct -> 0x0369 }
            if (r0 != 0) goto L_0x026a
            com.google.assistant.e.j.ka r0 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x0369 }
        L_0x026a:
            com.google.protobuf.z r0 = r0.f137061c     // Catch:{ ct -> 0x0369 }
            com.google.assistant.e.i.a.lq r1 = com.google.assistant.p3897e.p3917i.p3918a.C51544lq.f134342j     // Catch:{ ct -> 0x0369 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r1, (com.google.protobuf.C63088z) r0)     // Catch:{ ct -> 0x0369 }
            com.google.assistant.e.i.a.lq r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51544lq) r0     // Catch:{ ct -> 0x0369 }
            com.google.common.f.e r1 = f315790j     // Catch:{ ct -> 0x0369 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ ct -> 0x0369 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ ct -> 0x0369 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ct -> 0x0369 }
            r1.mo56374ac(r3, r4)     // Catch:{ ct -> 0x0369 }
            r4 = 28527(0x6f6f, float:3.9975E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r4)     // Catch:{ ct -> 0x0369 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ ct -> 0x0369 }
            java.lang.String r4 = "CONVERSATION_PARAMS_RECEIVED vertical_name=%s feature_ve_id=%d"
            java.lang.String r5 = r0.f134348e     // Catch:{ ct -> 0x0369 }
            com.google.protobuf.ch r6 = r0.f134347d     // Catch:{ ct -> 0x0369 }
            int r6 = r6.size()     // Catch:{ ct -> 0x0369 }
            if (r6 <= 0) goto L_0x029c
            com.google.protobuf.ch r6 = r0.f134347d     // Catch:{ ct -> 0x0369 }
            int r6 = r6.mo58914d(r2)     // Catch:{ ct -> 0x0369 }
            goto L_0x029d
        L_0x029c:
            r6 = 0
        L_0x029d:
            r1.mo56352E(r4, r5, r6)     // Catch:{ ct -> 0x0369 }
            java.lang.String r1 = r0.f134348e     // Catch:{ ct -> 0x0369 }
            r10.f315963cz = r1     // Catch:{ ct -> 0x0369 }
            com.google.protobuf.ch r1 = r0.f134347d     // Catch:{ ct -> 0x0369 }
            int r1 = r1.size()     // Catch:{ ct -> 0x0369 }
            if (r1 <= 0) goto L_0x02b3
            com.google.protobuf.ch r1 = r0.f134347d     // Catch:{ ct -> 0x0369 }
            int r1 = r1.mo58914d(r2)     // Catch:{ ct -> 0x0369 }
            goto L_0x02b4
        L_0x02b3:
            r1 = 0
        L_0x02b4:
            r10.f315912cA = r1     // Catch:{ ct -> 0x0369 }
            com.google.protobuf.ch r1 = r0.f134347d     // Catch:{ ct -> 0x0369 }
            com.google.common.b.ij r1 = com.google.common.p4522b.C58528ij.m90006F(r1)     // Catch:{ ct -> 0x0369 }
            r10.f315913cB = r1     // Catch:{ ct -> 0x0369 }
            boolean r1 = r1.isEmpty()     // Catch:{ ct -> 0x0369 }
            if (r1 != 0) goto L_0x0341
            com.google.android.apps.gsa.shared.ag.e.a r1 = new com.google.android.apps.gsa.shared.ag.e.a     // Catch:{ ct -> 0x0369 }
            r1.<init>()     // Catch:{ ct -> 0x0369 }
            com.google.common.base.ax r4 = r10.f315972di     // Catch:{ ct -> 0x0369 }
            boolean r4 = r4.mo56113h()     // Catch:{ ct -> 0x0369 }
            if (r4 == 0) goto L_0x02e8
            com.google.common.base.ax r4 = r10.f315972di     // Catch:{ ct -> 0x0369 }
            java.lang.Object r4 = r4.mo56107c()     // Catch:{ ct -> 0x0369 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ ct -> 0x0369 }
            long r4 = r4.longValue()     // Catch:{ ct -> 0x0369 }
            java.lang.String r4 = com.google.android.libraries.search.logging.p3043f.C39191a.m68623b(r4)     // Catch:{ ct -> 0x0369 }
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)     // Catch:{ ct -> 0x0369 }
            r1.mo83115b(r4)     // Catch:{ ct -> 0x0369 }
        L_0x02e8:
            com.google.android.apps.gsa.shared.ag.e.o r4 = r10.f315935cX     // Catch:{ ct -> 0x0369 }
            com.google.android.apps.gsa.shared.ag.e.n r5 = com.google.android.apps.gsa.shared.p6976ag.p6982e.C89142n.f241658n     // Catch:{ ct -> 0x0369 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ ct -> 0x0369 }
            com.google.android.apps.gsa.shared.ag.e.g r5 = (com.google.android.apps.gsa.shared.p6976ag.p6982e.C89135g) r5     // Catch:{ ct -> 0x0369 }
            com.google.android.apps.gsa.shared.ag.e.f r6 = com.google.android.apps.gsa.shared.p6976ag.p6982e.C89134f.CONVERSATION_PARAMS_RECEIVED     // Catch:{ ct -> 0x0369 }
            r5.copyOnWrite()     // Catch:{ ct -> 0x0369 }
            com.google.protobuf.bv r7 = r5.instance     // Catch:{ ct -> 0x0369 }
            com.google.android.apps.gsa.shared.ag.e.n r7 = (com.google.android.apps.gsa.shared.p6976ag.p6982e.C89142n) r7     // Catch:{ ct -> 0x0369 }
            int r6 = r6.f241638y     // Catch:{ ct -> 0x0369 }
            r7.f241661b = r6     // Catch:{ ct -> 0x0369 }
            int r6 = r7.f241660a     // Catch:{ ct -> 0x0369 }
            r6 = r6 | r3
            r7.f241660a = r6     // Catch:{ ct -> 0x0369 }
            boolean r6 = r10.f315940cc     // Catch:{ ct -> 0x0369 }
            r5.copyOnWrite()     // Catch:{ ct -> 0x0369 }
            com.google.protobuf.bv r7 = r5.instance     // Catch:{ ct -> 0x0369 }
            com.google.android.apps.gsa.shared.ag.e.n r7 = (com.google.android.apps.gsa.shared.p6976ag.p6982e.C89142n) r7     // Catch:{ ct -> 0x0369 }
            int r8 = r7.f241660a     // Catch:{ ct -> 0x0369 }
            r8 = r8 | 128(0x80, float:1.794E-43)
            r7.f241660a = r8     // Catch:{ ct -> 0x0369 }
            r7.f241669j = r6     // Catch:{ ct -> 0x0369 }
            com.google.common.b.ij r6 = r10.f315913cB     // Catch:{ ct -> 0x0369 }
            r5.copyOnWrite()     // Catch:{ ct -> 0x0369 }
            com.google.protobuf.bv r7 = r5.instance     // Catch:{ ct -> 0x0369 }
            com.google.android.apps.gsa.shared.ag.e.n r7 = (com.google.android.apps.gsa.shared.p6976ag.p6982e.C89142n) r7     // Catch:{ ct -> 0x0369 }
            com.google.protobuf.ch r8 = r7.f241662c     // Catch:{ ct -> 0x0369 }
            boolean r9 = r8.mo58948c()     // Catch:{ ct -> 0x0369 }
            if (r9 != 0) goto L_0x032c
            com.google.protobuf.ch r8 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r8)     // Catch:{ ct -> 0x0369 }
            r7.f241662c = r8     // Catch:{ ct -> 0x0369 }
        L_0x032c:
            com.google.protobuf.ch r7 = r7.f241662c     // Catch:{ ct -> 0x0369 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r6, (java.util.List) r7)     // Catch:{ ct -> 0x0369 }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ ct -> 0x0369 }
            com.google.android.apps.gsa.shared.ag.e.n r5 = (com.google.android.apps.gsa.shared.p6976ag.p6982e.C89142n) r5     // Catch:{ ct -> 0x0369 }
            r1.mo83116c(r5)     // Catch:{ ct -> 0x0369 }
            com.google.android.apps.gsa.shared.ag.e.d r1 = r1.mo83114a()     // Catch:{ ct -> 0x0369 }
            r4.mo27606c(r1)     // Catch:{ ct -> 0x0369 }
        L_0x0341:
            com.google.common.b.ij r1 = r10.f315961cx     // Catch:{ ct -> 0x0369 }
            java.lang.String r0 = r0.f134348e     // Catch:{ ct -> 0x0369 }
            boolean r0 = r1.contains(r0)     // Catch:{ ct -> 0x0369 }
            if (r0 == 0) goto L_0x023e
            r10.m188885el(r3)     // Catch:{ ct -> 0x0369 }
            goto L_0x023e
        L_0x0350:
            java.lang.String r1 = "asst.drl.visual.treatment.params"
            java.lang.String r4 = r0.f137065b     // Catch:{ ct -> 0x0369 }
            boolean r1 = r1.equals(r4)     // Catch:{ ct -> 0x0369 }
            if (r1 == 0) goto L_0x023e
            java.lang.String r1 = "assistant.api.params.DrlVisualTreatmentParams"
            com.google.assistant.e.j.ka r0 = r0.f137066c     // Catch:{ ct -> 0x0369 }
            if (r0 != 0) goto L_0x0362
            com.google.assistant.e.j.ka r0 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x0369 }
        L_0x0362:
            java.lang.String r0 = r0.f137060b     // Catch:{ ct -> 0x0369 }
            r1.equals(r0)     // Catch:{ ct -> 0x0369 }
            goto L_0x023e
        L_0x0369:
            r11 = move-exception
            com.google.common.f.e r0 = f315790j
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "handleConversationParamsReceivedEvent"
            r2 = 28526(0x6f6e, float:3.9973E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r11)).mo56372aa(r2)).mo56386p(r1)
            return
        L_0x0378:
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88102pf.f238194a
            com.google.android.apps.gsa.search.shared.service.b.uo r1 = r11.f236959a
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r1.mo58887l(r0)
            com.google.protobuf.bf r1 = r1.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 == 0) goto L_0x03aa
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88102pf.f238194a
            java.lang.Object r11 = r11.mo81918e(r0)
            com.google.android.apps.gsa.search.shared.service.b.ph r11 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88104ph) r11
            com.google.protobuf.cq r11 = r11.f238197a
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0552
            com.google.android.apps.gsa.staticplugins.opa.chatui.cm r0 = r10.f315858ap
            r0.mo96723b(r11)
            com.google.android.apps.gsa.staticplugins.opa.chatui.dt r0 = r10.f315819aC
            if (r0 == 0) goto L_0x0552
            r0.mo96750m(r11, r2)
            return
        L_0x03aa:
            com.google.common.f.e r11 = f315790j
            com.google.common.f.x r11 = r11.mo56225c()
            java.lang.String r0 = "Event data doesn't have OpaDeleteHistoryEntriesEvent data"
            r1 = 28579(0x6fa3, float:4.0048E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x03b8:
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r0 = com.google.android.apps.gsa.shared.search.Query.class
            boolean r0 = r11.mo81913d(r0)
            if (r0 == 0) goto L_0x0552
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r0 = com.google.android.apps.gsa.shared.search.Query.class
            android.os.Parcelable r11 = r11.mo81912b(r0)
            com.google.android.apps.gsa.shared.search.Query r11 = (com.google.android.apps.gsa.shared.search.Query) r11
            long r0 = r11.f252749G
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90834k(r11)
            r10.f315972di = r11
            return
        L_0x03d5:
            com.google.android.apps.gsa.search.core.i.t r0 = r10.f315982r
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247677lf
            boolean r0 = r0.mo79746e(r4)
            if (r0 != 0) goto L_0x03e1
            goto L_0x0552
        L_0x03e1:
            java.lang.Class<com.google.android.apps.gsa.shared.util.DummyParcelable> r0 = com.google.android.apps.gsa.shared.util.DummyParcelable.class
            boolean r0 = r11.mo81913d(r0)
            if (r0 == 0) goto L_0x0552
            java.lang.Class<com.google.android.apps.gsa.shared.util.DummyParcelable> r0 = com.google.android.apps.gsa.shared.util.DummyParcelable.class
            android.os.Parcelable r11 = r11.mo81912b(r0)
            com.google.android.apps.gsa.shared.util.DummyParcelable r11 = (com.google.android.apps.gsa.shared.util.DummyParcelable) r11
            java.lang.Object r11 = r11.f253766a
            boolean r0 = r11 instanceof com.google.android.apps.gsa.staticplugins.opa.webview.OpaWebView
            if (r0 == 0) goto L_0x0552
            r10.f315969df = r3
            com.google.android.apps.gsa.staticplugins.opa.chatui.ax r0 = r10.f315983s
            boolean r0 = r0.mo96407t()
            if (r0 == 0) goto L_0x0406
            com.google.android.apps.gsa.staticplugins.opa.chatui.ax r0 = r10.f315983s
            r0.mo96395h()
        L_0x0406:
            r10.m188853dR()
            r10.m188860dY()
            boolean r0 = r10.m188868eC()
            if (r0 == 0) goto L_0x0415
            r10.mo101002bN(r3)
        L_0x0415:
            com.google.android.apps.gsa.staticplugins.opa.webview.OpaWebView r11 = (com.google.android.apps.gsa.staticplugins.opa.webview.OpaWebView) r11
            com.google.android.apps.gsa.staticplugins.opa.chatui.ax r0 = r10.f315983s
            r0.mo96399l()
            com.google.android.apps.gsa.search.core.i.t r0 = r10.f315982r
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247181cM
            boolean r0 = r0.mo79746e(r4)
            if (r0 != 0) goto L_0x047c
            r0 = 0
        L_0x0427:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r4 = r10.f315859aq
            int r4 = r4.mo95351a()
            if (r0 >= r4) goto L_0x047c
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r4 = r10.f315859aq
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r4 = r4.mo95352b(r0)
            boolean r5 = r4 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf
            if (r5 == 0) goto L_0x0455
            boolean r5 = r10.mo100907df()
            if (r5 == 0) goto L_0x044d
            r5 = r4
            com.google.android.apps.gsa.staticplugins.opa.chatui.cf r5 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf) r5
            r5.f301176f = r3
            r5.mo96712f()
            r5.f301177g = r3
            r5.mo96714u()
            goto L_0x0455
        L_0x044d:
            r5 = r4
            com.google.android.apps.gsa.staticplugins.opa.chatui.cf r5 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf) r5
            r5.f301176f = r2
            r5.mo96712f()
        L_0x0455:
            boolean r5 = r4 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je
            if (r5 == 0) goto L_0x0479
            com.google.android.apps.gsa.staticplugins.opa.chatui.je r4 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je) r4
            r4.mo96891f(r3)
            com.google.android.apps.gsa.search.core.i.t r5 = r10.f315982r
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247386gF
            boolean r5 = r5.mo79746e(r6)
            if (r5 == 0) goto L_0x0479
            r4.f301666h = r3
            com.google.android.apps.gsa.staticplugins.opa.chatui.bl r5 = r4.mo96603m()
            if (r5 == 0) goto L_0x0479
            com.google.android.apps.gsa.searchplate.widget.StreamingTextView r6 = r5.f301080g
            if (r6 == 0) goto L_0x0479
            r4.f301666h = r3
            com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je.m180273e(r5)
        L_0x0479:
            int r0 = r0 + 1
            goto L_0x0427
        L_0x047c:
            r10.mo101021cW(r11)
            r0 = 0
        L_0x0480:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r4 = r10.f315859aq
            int r4 = r4.mo95351a()
            if (r0 >= r4) goto L_0x0499
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r4 = r10.f315859aq
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r4 = r4.mo95352b(r0)
            boolean r5 = r4 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je
            if (r5 == 0) goto L_0x0496
            com.google.android.apps.gsa.staticplugins.opa.chatui.je r4 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je) r4
            r4.f301651E = r2
        L_0x0496:
            int r0 = r0 + 1
            goto L_0x0480
        L_0x0499:
            android.view.ViewGroup r0 = r10.mo100995aY()
            boolean r4 = r10.mo101037dg()
            if (r4 == 0) goto L_0x04cf
            com.google.android.apps.gsa.search.core.i.t r4 = r10.f315982r
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247389gI
            boolean r4 = r4.mo79746e(r5)
            if (r4 != 0) goto L_0x04cf
            android.content.Context r4 = r10.f315981q
            android.util.DisplayMetrics r4 = com.google.android.apps.gsa.staticplugins.opa.util.C113799bo.m188384a(r4)
            int r4 = r4.heightPixels
            double r4 = (double) r4
            com.google.android.apps.gsa.search.core.i.t r6 = r10.f315982r
            com.google.android.apps.gsa.shared.m.e r7 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247723mY
            double r6 = r6.mo79747m(r7)
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r6
            int r4 = (int) r4
            int r5 = r10.mo100986aI(r2)
            int r4 = java.lang.Math.min(r4, r5)
            r0.setMinimumHeight(r4)
        L_0x04cf:
            com.google.android.apps.gsa.staticplugins.opa.webview.OpaWebView r4 = r10.f315824aH
            if (r4 == 0) goto L_0x04d6
            r0.removeView(r4)
        L_0x04d6:
            r10.m188880eg(r2)
            android.view.ViewParent r4 = r11.getParent()
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x04e6
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r4.removeView(r11)
        L_0x04e6:
            r0.addView(r11, r2)
            r11.mo101228g(r0)
            boolean r0 = r10.mo101037dg()
            if (r0 == 0) goto L_0x04f8
            r11.setOverScrollMode(r1)
            r10.mo100862bo(r2)
        L_0x04f8:
            r10.mo100985aG()
            r10.f315824aH = r11
        L_0x04fd:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r0 = r10.f315859aq
            int r0 = r0.mo95351a()
            if (r2 >= r0) goto L_0x0513
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r0 = r10.f315859aq
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r0 = r0.mo95352b(r2)
            if (r0 == 0) goto L_0x0510
            r10.m188856dU(r0)
        L_0x0510:
            int r2 = r2 + 1
            goto L_0x04fd
        L_0x0513:
            r10.f315978n = r3
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ak r0 = r10.f315847ae
            r0.f316245e = r11
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ee r0 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ee
            r0.<init>(r10)
            r11.f316505n = r0
            com.google.android.apps.gsa.search.core.i.t r0 = r10.f315982r
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247346fS
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x052f
            androidx.core.j.o r0 = r10.f315949cl
            r11.mo101222b(r0)
        L_0x052f:
            androidx.core.j.o r0 = new androidx.core.j.o
            android.content.Context r1 = r10.f315981q
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ea r2 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ea
            r2.<init>(r10)
            r3 = 0
            r0.<init>(r1, r2, r3)
            r11.mo101222b(r0)
            boolean r11 = r10.mo101037dg()
            if (r11 == 0) goto L_0x0552
            com.google.android.apps.gsa.search.core.i.t r11 = r10.f315982r
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247411ge
            boolean r11 = r11.mo79746e(r0)
            if (r11 != 0) goto L_0x0552
            r10.m188883ej()
        L_0x0552:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.C114071eg.mo19965fM(com.google.android.apps.gsa.search.shared.service.ServiceEventData):void");
    }

    /* renamed from: g */
    public final ViewGroup mo95418g() {
        return mo100994aT();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ValyrianChatUiStates");
        fVar.mo85279c("mainViewInnerHeight").mo85276a(C90752i.m148230d(Integer.valueOf(this.f315985u.getHeight())));
        fVar.mo85279c("demandStatedRecyclerViewHeight").mo85276a(C90752i.m148230d(Integer.valueOf(mo100994aT().getMeasuredHeight())));
        fVar.mo85279c("isDynamicResponseLayerShown").mo85276a(C90752i.m148228b(Boolean.valueOf(mo101037dg())));
        fVar.mo85279c("isHeaderHiddenByWebView").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f315827aK)));
        fVar.mo85279c("isFooterHiddenByWebView").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f315828aL)));
        fVar.mo85279c("isRecognitionStateActive").mo85276a(C90752i.m148228b(Boolean.valueOf(m188864do(this.f315829aM))));
        fVar.mo85279c("ngaAllowsSuggestionsBeingVisible").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f315869bE)));
        fVar.mo85279c("topFinishSetupBarVisibility").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f315870bF)));
        fVar.mo85279c("isResponseEmpty").mo85276a(C90752i.m148228b(Boolean.valueOf(mo100911dp())));
        fVar.mo85279c("isFullScreen").mo85276a(C90752i.m148228b(Boolean.valueOf(mo95399aj())));
        fVar.mo85279c("isOpaWebviewShown").mo85276a(C90752i.m148228b(Boolean.valueOf(mo100910dn())));
        fVar.mo85279c("isChatUiShown").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f315986v.getVisibility() == 0)));
        fVar.mo85279c("isInConversationState").mo85276a(C90752i.m148228b(Boolean.valueOf(mo100908dj())));
        fVar.mo85279c("isResizing").mo85276a(C90752i.m148228b(Boolean.valueOf(mo95400ak())));
        fVar.mo85279c("isMovedOutOfZSByBackPress").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f315976l)));
        fVar.mo85279c("isStartWithZeroState").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f315977m)));
        fVar.mo85279c("isExpectingWebView").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f315978n)));
        fVar.mo85279c("isResizingLiveData").mo85276a(C90752i.m148231e(this.f315861as));
        fVar.mo85279c("isTactilePlate").mo85276a(C90752i.m148228b(Boolean.valueOf(m188897ex())));
        fVar.mo85279c("isInThirdPartyCommunication").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f315835aS.f300678a)));
        fVar.mo85279c("isOpaDarkModeEnabledInContext").mo85276a(C90752i.m148228b(Boolean.valueOf(C82193a.m130503a(this.f315833aQ))));
        fVar.mo85279c("isWebViewContainerFullScreen").mo85276a(C90752i.m148228b(Boolean.valueOf(mo100913dr())));
        fVar.mo85279c("opaNgaUiIntegrationEnabled").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f315940cc)));
        fVar.mo85279c("tbybGreetingMode").mo85276a(C90752i.m148231e(this.f315942ce));
        fVar.mo85279c("shouldKeepHidingSuggestions").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f315943cf)));
        fVar.mo85279c("shouldShowExploreIconInChatUi").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f315889bY)));
        fVar.mo85279c("isOpaExploreEligible").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f315917cF.v())));
    }

    /* renamed from: h */
    public final ViewGroup mo95419h() {
        return this.f315984t;
    }

    /* renamed from: i */
    public final FrameLayout mo95420i() {
        return this.f315985u;
    }

    /* renamed from: j */
    public final C108235bf mo95421j() {
        return this.f315859aq;
    }

    /* renamed from: k */
    public final C108237bh mo95422k() {
        return this.f315864av;
    }

    /* renamed from: l */
    public final C108339fa mo95423l() {
        int e = this.f315859aq.mo101122e(C108230ba.f301021i);
        if (e != -1) {
            return (C108339fa) this.f315859aq.mo95352b(e);
        }
        return null;
    }

    /* renamed from: m */
    public final C108423id mo95424m() {
        return this.f315859aq.mo101131n();
    }

    /* renamed from: n */
    public final C108436iq mo95425n() {
        return this.f315801K;
    }

    /* renamed from: o */
    public final C107623a mo95426o() {
        return this.f315877bM;
    }

    /* renamed from: p */
    public final C60321oe mo95427p(C58833ax axVar) {
        return this.f315859aq.mo101132o(axVar);
    }

    /* renamed from: q */
    public final C63088z mo95428q() {
        C88192so soVar = this.f315904bn;
        if (soVar == null || (soVar.f238405a & 1) == 0) {
            return null;
        }
        return soVar.f238406b;
    }

    /* renamed from: r */
    public final Set mo95429r() {
        return this.f315913cB;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0519, code lost:
        if (r0.f301664f != false) goto L_0x0550;
     */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x04bc  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0502  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x053b  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0556  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x05c9  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0645  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x0655  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x067a  */
    /* JADX WARNING: Removed duplicated region for block: B:403:? A[RETURN, SYNTHETIC] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95430s(com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc r12) {
        /*
            r11 = this;
            com.google.android.apps.gsa.search.core.i.t r0 = r11.f315982r
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248282bp
            boolean r0 = r0.mo79746e(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0029
            com.google.android.apps.gsa.staticplugins.opa.chatui.ax r0 = r11.f315983s
            boolean r0 = r0.mo96407t()
            if (r0 == 0) goto L_0x0029
            boolean r0 = r11.f315901bk
            if (r0 == 0) goto L_0x0029
            boolean r0 = r12 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je
            if (r0 != 0) goto L_0x0029
            java.lang.Class r0 = r12.getClass()
            r0.getSimpleName()
            r11.f315969df = r1
            com.google.android.apps.gsa.staticplugins.opa.chatui.ax r0 = r11.f315983s
            r0.mo96395h()
        L_0x0029:
            boolean r0 = r11.mo100907df()
            if (r0 == 0) goto L_0x006f
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r0 = r11.f315859aq
            int r0 = r0.mo95351a()
            if (r0 > 0) goto L_0x0047
            com.google.android.apps.gsa.staticplugins.opa.bk.b r0 = r11.f315835aS
            boolean r0 = r0.f300678a
            if (r0 != 0) goto L_0x0047
            com.google.android.apps.gsa.staticplugins.opa.valyrian.el r0 = r11.f315801K
            android.view.View r0 = r0.f316068a
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x006f
        L_0x0047:
            boolean r0 = m188890eq(r12)
            if (r0 != 0) goto L_0x0061
            boolean r0 = m188862dh(r12)
            if (r0 == 0) goto L_0x006f
            r0 = r12
            com.google.android.apps.gsa.staticplugins.opa.chatui.je r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je) r0
            java.lang.String r0 = r0.mo96890c()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0061
            goto L_0x006f
        L_0x0061:
            com.google.common.f.e r12 = f315790j
            com.google.common.f.x r12 = r12.mo56226d()
            java.lang.String r0 = "Empty bubble should only be added as the first element when 3rd party header is not visible"
            r1 = 28520(0x6f68, float:3.9965E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x006f:
            boolean r0 = r12 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj
            r2 = 0
            r3 = 10
            if (r0 == 0) goto L_0x007e
            r4 = r12
            com.google.android.apps.gsa.staticplugins.opa.chatui.aj r4 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj) r4
            int r4 = r4.f300977c
            if (r4 != r3) goto L_0x007e
            goto L_0x008a
        L_0x007e:
            boolean r4 = r12 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108192a
            if (r4 != 0) goto L_0x008a
            boolean r4 = r12 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf
            if (r4 != 0) goto L_0x008a
            com.google.android.apps.gsa.staticplugins.opa.bk.b r4 = r11.f315835aS
            r4.f300679b = r2
        L_0x008a:
            boolean r4 = r11.f315844ab
            if (r4 == 0) goto L_0x00ab
            com.google.android.apps.gsa.search.core.i.t r4 = r11.f315982r
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248290e
            boolean r4 = r4.mo79746e(r5)
            if (r4 == 0) goto L_0x00ab
            java.util.List r4 = r11.f315921cJ
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x00ab
            boolean r4 = m188893et(r12)
            if (r4 == 0) goto L_0x00ab
            java.util.List r4 = r11.f315921cJ
            r4.clear()
        L_0x00ab:
            boolean r4 = r11.f315844ab
            r5 = 2
            r6 = -1
            r7 = 0
            if (r4 == 0) goto L_0x00d1
            com.google.android.apps.gsa.search.core.i.t r4 = r11.f315982r
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248204R
            boolean r4 = r4.mo79746e(r8)
            if (r4 == 0) goto L_0x00d1
            com.google.android.apps.gsa.staticplugins.opa.bk.b r4 = r11.f315835aS
            boolean r4 = r4.f300678a
            if (r4 == 0) goto L_0x00d1
            boolean r4 = r12 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je
            if (r4 == 0) goto L_0x00d1
            r2 = r12
            com.google.android.apps.gsa.staticplugins.opa.chatui.je r2 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je) r2
            r2.f301043y = r1
            r2.f301026C = r5
            r2.f301656J = r5
            goto L_0x025d
        L_0x00d1:
            boolean r4 = r11.f315844ab
            if (r4 == 0) goto L_0x025d
            com.google.android.apps.gsa.search.core.i.t r4 = r11.f315982r
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248207U
            boolean r4 = r4.mo79746e(r8)
            if (r4 == 0) goto L_0x025d
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r4 = r11.f315859aq
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r4 = r4.mo95353c()
            com.google.android.apps.gsa.search.core.i.t r8 = r11.f315982r
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247793np
            boolean r8 = r8.mo79746e(r9)
            if (r8 == 0) goto L_0x0102
            boolean r8 = r4 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108397he
            if (r8 == 0) goto L_0x0102
            int r4 = r11.mo95417f()
            int r4 = r4 + -2
            if (r4 < 0) goto L_0x0103
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r2 = r11.f315859aq
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r2 = r2.mo95352b(r4)
            goto L_0x0103
        L_0x0102:
            r2 = r4
        L_0x0103:
            boolean r4 = r12 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je
            if (r4 != 0) goto L_0x010f
            java.lang.String r8 = r11.f315963cz
            r12.f301044z = r8
            int r8 = r11.f315912cA
            r12.f301024A = r8
        L_0x010f:
            if (r2 == 0) goto L_0x013b
            if (r4 == 0) goto L_0x013b
            r4 = r12
            com.google.android.apps.gsa.staticplugins.opa.chatui.je r4 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je) r4
            boolean r8 = r2.f301043y
            r4.f301043y = r8
            int r8 = r2.f301026C
            r4.f301026C = r8
            boolean r8 = r4.mo96575b()
            if (r8 == 0) goto L_0x025d
            boolean r2 = r2.f301043y
            if (r1 == r2) goto L_0x012a
            r2 = 1
            goto L_0x012b
        L_0x012a:
            r2 = 2
        L_0x012b:
            r4.f301656J = r2
            com.google.android.apps.gsa.search.core.i.t r2 = r11.f315982r
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248194H
            boolean r2 = r2.mo79746e(r8)
            if (r2 == 0) goto L_0x025d
            r4.f301656J = r1
            goto L_0x025d
        L_0x013b:
            if (r4 != 0) goto L_0x017d
            boolean r8 = r2 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je
            if (r8 == 0) goto L_0x017d
            r8 = r2
            com.google.android.apps.gsa.staticplugins.opa.chatui.je r8 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je) r8
            boolean r9 = r8.mo96575b()
            if (r9 == 0) goto L_0x017d
            boolean r9 = r2.mo96610t()
            boolean r10 = r12.mo96610t()
            if (r9 == r10) goto L_0x017d
            boolean r9 = r2.f301043y
            boolean r10 = r12.f301043y
            if (r9 == r10) goto L_0x017d
            com.google.android.apps.gsa.search.core.i.t r9 = r11.f315982r
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248194H
            boolean r9 = r9.mo79746e(r10)
            if (r9 != 0) goto L_0x017d
            boolean r2 = r12.f301043y
            r8.f301043y = r2
            int r2 = r12.f301026C
            r8.f301026C = r2
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r2 = r11.f315859aq
            int r2 = r2.mo95351a()
            int r2 = r2 + r6
            r11.mo101011bt(r2)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r2 = r11.f315859aq
            r2.mo95354d(r7)
            goto L_0x025d
        L_0x017d:
            com.google.android.apps.gsa.search.core.i.t r8 = r11.f315982r
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248194H
            boolean r8 = r8.mo79746e(r9)
            if (r8 == 0) goto L_0x025d
            if (r4 != 0) goto L_0x025d
            com.google.common.b.ij r4 = r11.f315926cO
            java.lang.String r8 = r12.f301044z
            java.lang.String r8 = com.google.common.base.C58837ba.m90858g(r8)
            boolean r4 = r4.contains(r8)
            if (r4 == 0) goto L_0x0224
            com.google.common.b.ij r4 = r11.f315927cP
            int r8 = r12.f301024A
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r4 = r4.contains(r8)
            if (r4 != 0) goto L_0x0224
            boolean r2 = r12 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf
            if (r2 == 0) goto L_0x01cb
            r2 = r12
            com.google.android.apps.gsa.staticplugins.opa.chatui.cf r2 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf) r2
            com.google.android.apps.gsa.search.core.i.t r4 = r11.f315982r
            com.google.android.apps.gsa.shared.m.f r8 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248309x
            long r8 = r4.mo79743a(r8)
            int r4 = (int) r8
            r2.f301167H = r4
            com.google.android.apps.gsa.search.core.i.t r4 = r11.f315982r
            r2.f301041w = r4
            com.google.android.apps.gsa.staticplugins.nga.ui.b.a r4 = r11.f315973dj
            boolean r4 = r4.mo93970a()
            r2.f301042x = r4
            java.lang.String r4 = r11.m188849dN(r1)
            r2.f301166G = r4
            r2.f301171L = r1
        L_0x01cb:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r2 = r11.f315859aq
            com.google.common.base.bc r4 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba.f301013a
            int r2 = r2.mo101122e(r4)
            if (r2 <= 0) goto L_0x025d
            int r2 = r2 + r6
        L_0x01d6:
            if (r2 < 0) goto L_0x025d
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r4 = r11.f315859aq
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r4 = r4.mo95352b(r2)
            r4.getClass()
            boolean r8 = r4 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf
            if (r8 == 0) goto L_0x021c
            java.lang.String r8 = r4.f301044z
            java.lang.String r8 = com.google.common.base.C58837ba.m90858g(r8)
            java.lang.String r9 = r12.f301044z
            java.lang.String r9 = com.google.common.base.C58837ba.m90858g(r9)
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x021c
            int r8 = r4.f301024A
            int r9 = r12.f301024A
            if (r8 != r9) goto L_0x021c
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r8 = r11.f315859aq
            r8.mo101140w(r4)
            r8 = r4
            com.google.android.apps.gsa.staticplugins.opa.chatui.cf r8 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf) r8
            com.google.android.apps.gsa.search.core.i.t r9 = r11.f315982r
            com.google.android.apps.gsa.shared.m.f r10 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248187A
            long r9 = r9.mo79743a(r10)
            int r10 = (int) r9
            r8.f301167H = r10
            java.lang.String r9 = r11.m188849dN(r7)
            r8.f301166G = r9
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r8 = r11.f315859aq
            r8.mo101134q(r4, r2)
            goto L_0x0221
        L_0x021c:
            boolean r4 = r4 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je
            if (r4 == 0) goto L_0x0221
            goto L_0x025d
        L_0x0221:
            int r2 = r2 + -1
            goto L_0x01d6
        L_0x0224:
            boolean r4 = r2 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je
            if (r4 == 0) goto L_0x025d
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r4 = r11.f315859aq
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r4 = r4.mo101128k()
            if (r4 == 0) goto L_0x025d
            com.google.common.b.ij r8 = r11.f315926cO
            java.lang.String r4 = r4.f301044z
            java.lang.String r4 = com.google.common.base.C58837ba.m90858g(r4)
            boolean r4 = r8.contains(r4)
            if (r4 == 0) goto L_0x025d
            com.google.android.apps.gsa.staticplugins.opa.chatui.je r4 = new com.google.android.apps.gsa.staticplugins.opa.chatui.je
            r4.<init>()
            com.google.android.apps.gsa.staticplugins.opa.chatui.je r2 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je) r2
            java.lang.String r2 = r2.mo96890c()
            if (r2 == 0) goto L_0x024d
            r4.f301663e = r2
        L_0x024d:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r2 = r11.f315859aq
            r2.mo101142y()
            r11.mo100864bq()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r2 = r11.f315859aq
            r2.mo101133p(r4)
            r11.mo101005bS(r4)
        L_0x025d:
            r11.m188861dZ(r12)
            boolean r2 = m188898ey(r12)
            if (r2 == 0) goto L_0x0269
            com.google.android.apps.gsa.staticplugins.opa.chatui.az r2 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108228az.IS_THINKING
            goto L_0x026b
        L_0x0269:
            com.google.android.apps.gsa.staticplugins.opa.chatui.az r2 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108228az.IS_NOT_THINKING
        L_0x026b:
            androidx.lifecycle.ag r4 = r11.f315862at
            r4.mo5708l(r2)
            boolean r2 = m188898ey(r12)
            if (r2 == 0) goto L_0x0280
            boolean r2 = r11.f315830aN
            if (r2 == 0) goto L_0x0280
            r11.mo100864bq()
            r11.mo101014cD(r7, r1)
        L_0x0280:
            boolean r2 = m188898ey(r12)
            if (r2 != 0) goto L_0x02a5
            boolean r2 = m188893et(r12)
            if (r2 != 0) goto L_0x02a5
            int r2 = r12.mo95830h()
            r4 = 5
            if (r2 == r4) goto L_0x02a5
            int r2 = r12.mo95830h()
            if (r2 == 0) goto L_0x02a5
            int r2 = r12.mo95830h()
            r4 = 17
            if (r2 == r4) goto L_0x02a5
            boolean r2 = r11.f315830aN
            if (r2 == 0) goto L_0x02b5
        L_0x02a5:
            boolean r2 = m188862dh(r12)
            if (r2 == 0) goto L_0x02b8
            com.google.android.apps.gsa.search.core.i.t r2 = r11.f315982r
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247353fZ
            boolean r2 = r2.mo79746e(r4)
            if (r2 == 0) goto L_0x02b8
        L_0x02b5:
            r11.mo101014cD(r7, r1)
        L_0x02b8:
            int r2 = r11.f315909bs
            if (r2 != r5) goto L_0x02c5
            int r2 = r12.mo95830h()
            if (r2 != r1) goto L_0x02c5
            r11.mo101014cD(r7, r1)
        L_0x02c5:
            boolean r2 = r12 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je
            if (r2 == 0) goto L_0x0313
            r4 = r12
            com.google.android.apps.gsa.staticplugins.opa.chatui.je r4 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je) r4
            boolean r5 = r4.mo96575b()
            if (r5 == 0) goto L_0x0313
            r4.f301651E = r1
            boolean r3 = r11.f315844ab
            if (r3 == 0) goto L_0x03ad
            com.google.android.apps.gsa.search.core.i.t r3 = r11.f315982r
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248288c
            boolean r3 = r3.mo79746e(r5)
            if (r3 == 0) goto L_0x03ad
            com.google.common.b.ij r3 = r11.f315961cx
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x03ad
            boolean r3 = r11.f315940cc
            if (r3 != 0) goto L_0x03ad
            boolean r3 = r4.mo96894x()
            if (r3 != 0) goto L_0x030f
            com.google.android.apps.gsa.staticplugins.opa.bk.b r3 = r11.f315835aS
            boolean r3 = r3.f300678a
            if (r3 != 0) goto L_0x030f
            com.google.common.b.ij r3 = r11.f315962cy
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.b r5 = r11.f315950cm
            com.google.android.apps.gsa.assistant.shared.l.e r5 = r5.f318448a
            java.lang.String r5 = r5.name()
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L_0x030b
            goto L_0x030f
        L_0x030b:
            r4.f301650D = r1
            goto L_0x03ad
        L_0x030f:
            r4.f301650D = r7
            goto L_0x03ad
        L_0x0313:
            boolean r4 = r12 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf
            if (r4 == 0) goto L_0x0328
            r3 = r12
            com.google.android.apps.gsa.staticplugins.opa.chatui.cf r3 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf) r3
            r11.m188876ec(r3)
            com.google.android.apps.gsa.staticplugins.opa.webview.OpaWebView r4 = r11.f315824aH
            if (r4 == 0) goto L_0x03ad
            r3.f301176f = r7
            r3.mo96712f()
            goto L_0x03ad
        L_0x0328:
            if (r0 == 0) goto L_0x0373
            boolean r4 = r11.m188867eB()
            if (r4 == 0) goto L_0x033a
            boolean r4 = r11.mo95399aj()
            if (r4 != 0) goto L_0x033a
            r11.mo101002bN(r7)
            goto L_0x0359
        L_0x033a:
            boolean r4 = r11.f315844ab
            if (r4 == 0) goto L_0x0359
            com.google.android.apps.gsa.search.core.i.t r4 = r11.f315982r
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248288c
            boolean r4 = r4.mo79746e(r5)
            if (r4 == 0) goto L_0x0359
            boolean r4 = r11.f315940cc
            if (r4 != 0) goto L_0x0359
            r4 = r12
            com.google.android.apps.gsa.staticplugins.opa.chatui.aj r4 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj) r4
            int r4 = r4.f300977c
            if (r4 == r1) goto L_0x0356
            r5 = 3
            if (r4 != r5) goto L_0x0359
        L_0x0356:
            r11.m188885el(r7)
        L_0x0359:
            r4 = r12
            com.google.android.apps.gsa.staticplugins.opa.chatui.aj r4 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj) r4
            int r5 = r4.f300977c
            if (r5 != r3) goto L_0x03ad
            android.view.View r3 = r4.f300976b
            com.google.android.apps.gsa.staticplugins.opa.chatui.OpaAppWidgetCard r3 = (com.google.android.apps.gsa.staticplugins.opa.chatui.OpaAppWidgetCard) r3
            android.graphics.drawable.Drawable r4 = r3.mo96559b()
            if (r4 == 0) goto L_0x03ad
            com.google.android.apps.gsa.staticplugins.opa.bk.b r4 = r11.f315835aS
            android.graphics.drawable.Drawable r3 = r3.mo96559b()
            r4.f300679b = r3
            goto L_0x03ad
        L_0x0373:
            boolean r3 = r12 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108457jk
            if (r3 == 0) goto L_0x038d
            boolean r3 = r11.f315844ab
            if (r3 == 0) goto L_0x038d
            com.google.android.apps.gsa.search.core.i.t r3 = r11.f315982r
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248206T
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x038d
            boolean r3 = r11.f315940cc
            if (r3 != 0) goto L_0x038d
            r11.m188885el(r7)
            goto L_0x03ad
        L_0x038d:
            boolean r3 = r12 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108474ka
            if (r3 == 0) goto L_0x03ad
            r3 = r12
            com.google.android.apps.gsa.staticplugins.opa.chatui.ka r3 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108474ka) r3
            boolean r3 = r3.f301721e
            if (r3 == 0) goto L_0x03ad
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r3 = r11.f315859aq
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r3 = r3.mo95353c()
            boolean r4 = r3 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108474ka
            if (r4 == 0) goto L_0x03ad
            com.google.android.apps.gsa.staticplugins.opa.chatui.ka r3 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108474ka) r3
            boolean r3 = r3.f301721e
            if (r3 == 0) goto L_0x03ad
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r3 = r11.f315859aq
            r3.mo101142y()
        L_0x03ad:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.dv r3 = r11.f315938ca
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r4 = r3.f315759b
            boolean r4 = r4.mo101035dd(r12)
            if (r4 == 0) goto L_0x03ba
            r3.f315758a = r1
            goto L_0x03e8
        L_0x03ba:
            boolean r4 = m188862dh(r12)
            if (r4 == 0) goto L_0x03e8
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r4 = r3.f315759b
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r4 = r4.f315859aq
            com.google.android.apps.gsa.staticplugins.opa.valyrian.du r5 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.du
            r5.<init>(r3)
            int r4 = r4.mo101122e(r5)
            if (r4 != r6) goto L_0x03d7
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r4 = r3.f315759b
            com.google.android.apps.gsa.staticplugins.opa.webview.OpaWebView r4 = r4.f315824aH
            if (r4 != 0) goto L_0x03d7
            r4 = 1
            goto L_0x03d8
        L_0x03d7:
            r4 = 0
        L_0x03d8:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r5 = r3.f315759b
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r5 = r5.f315859aq
            com.google.common.base.bc r8 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba.f301013a
            int r5 = r5.mo101122e(r8)
            if (r4 == 0) goto L_0x03e8
            if (r5 < 0) goto L_0x03e8
            r3.f315758a = r1
        L_0x03e8:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.dv r3 = r11.f315938ca
            boolean r3 = r3.f315758a
            if (r3 != 0) goto L_0x045f
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eb r3 = r11.f315805O
            int r3 = r3.f315775b
            if (r3 == r1) goto L_0x03f5
            goto L_0x045f
        L_0x03f5:
            boolean r3 = m188862dh(r12)
            if (r3 == 0) goto L_0x0445
            boolean r3 = r11.m188868eC()
            com.google.android.apps.gsa.search.core.i.t r4 = r11.f315982r
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248291f
            boolean r4 = r4.mo79746e(r5)
            if (r4 != 0) goto L_0x043f
            java.util.List r4 = r11.f315922cK
            r4.clear()
            java.util.List r4 = r11.f315923cL
            r4.clear()
            java.util.List r4 = r11.f315924cM
            r4.clear()
            java.util.List r4 = r11.f315922cK
            com.google.android.apps.gsa.staticplugins.opa.chatui.id r5 = r11.f315850ah
            java.util.List r5 = r5.f301554a
            java.util.List r5 = java.util.Collections.unmodifiableList(r5)
            r4.addAll(r5)
            java.util.List r4 = r11.f315923cL
            com.google.android.apps.gsa.staticplugins.opa.chatui.hc r5 = r11.f315851ai
            java.util.List r5 = r5.f301488a
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89842j(r5)
            r4.addAll(r5)
            java.util.List r4 = r11.f315924cM
            com.google.android.apps.gsa.staticplugins.opa.chatui.hc r5 = r11.f315851ai
            java.util.List r5 = r5.f301489b
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89842j(r5)
            r4.addAll(r5)
        L_0x043f:
            if (r3 != 0) goto L_0x045f
            r11.mo100864bq()
            goto L_0x045f
        L_0x0445:
            int r3 = r12.mo95830h()
            if (r3 != r1) goto L_0x0456
            r3 = r12
            com.google.android.apps.gsa.staticplugins.opa.chatui.cf r3 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf) r3
            boolean r3 = r3.f301163D
            if (r3 == 0) goto L_0x0456
            r11.mo100864bq()
            goto L_0x045f
        L_0x0456:
            boolean r3 = m188895ev(r12)
            if (r3 == 0) goto L_0x045f
            r11.mo101010br()
        L_0x045f:
            boolean r3 = r11.f315947cj
            if (r3 == 0) goto L_0x0468
            r11.f315947cj = r7
            r11.mo100864bq()
        L_0x0468:
            r11.m188854dS(r12)
            com.google.android.apps.gsa.search.core.i.t r3 = r11.f315982r
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247206cl
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x04bc
            boolean r3 = r11.mo101037dg()
            if (r3 == 0) goto L_0x04bc
            boolean r0 = m188895ev(r12)
            if (r0 == 0) goto L_0x0484
            r11.mo100866bu()
        L_0x0484:
            boolean r0 = m188862dh(r12)
            if (r0 == 0) goto L_0x04e1
            com.google.android.apps.gsa.staticplugins.opa.chatui.id r0 = r11.f315850ah
            boolean r3 = r0.f301563j
            if (r3 == 0) goto L_0x0498
            int r3 = r0.mo96859b()
            if (r3 <= 0) goto L_0x0498
            r3 = 1
            goto L_0x0499
        L_0x0498:
            r3 = 0
        L_0x0499:
            r0.mo96867m(r3)
            com.google.common.f.e r0 = f315790j
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r3 = 28516(0x6f64, float:3.996E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r3)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.android.apps.gsa.staticplugins.opa.chatui.id r3 = r11.f315850ah
            int r3 = r3.mo96859b()
            com.google.android.apps.gsa.staticplugins.opa.chatui.id r4 = r11.f315850ah
            boolean r4 = r4.f301562i
            java.lang.String r5 = "add FinalUserBubble SuggestionCount=%s shouldClearPreviousSuggestions=%s"
            r0.mo56396z(r5, r3, r4)
            goto L_0x04e1
        L_0x04bc:
            boolean r3 = m188891er(r12)
            if (r3 != 0) goto L_0x04e1
            if (r0 == 0) goto L_0x04cc
            r0 = r12
            com.google.android.apps.gsa.staticplugins.opa.chatui.aj r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj) r0
            int r0 = r0.f300977c
            r3 = 6
            if (r0 == r3) goto L_0x04e1
        L_0x04cc:
            int r0 = r12.mo95830h()
            r3 = 18
            if (r0 == r3) goto L_0x04e1
            boolean r0 = m188894eu(r12)
            if (r0 != 0) goto L_0x04e1
            boolean r0 = r12 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108387gv
            if (r0 != 0) goto L_0x04e1
            r11.mo100866bu()
        L_0x04e1:
            if (r2 != 0) goto L_0x0550
            boolean r0 = m188898ey(r12)
            if (r0 != 0) goto L_0x0550
            boolean r0 = m188863di(r12)
            if (r0 != 0) goto L_0x0550
            java.lang.CharSequence r0 = r11.f315871bG
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0550
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r0 = r11.f315859aq
            com.google.common.base.bc r3 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba.f301014b
            int r0 = r0.mo101122e(r3)
            if (r0 != r6) goto L_0x0502
            goto L_0x051c
        L_0x0502:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r3 = r11.f315859aq
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r0 = r3.mo95352b(r0)
            com.google.android.apps.gsa.staticplugins.opa.chatui.je r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je) r0
            r0.getClass()
            java.lang.String r3 = r0.mo96890c()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x051c
            boolean r0 = r0.f301664f
            if (r0 == 0) goto L_0x051c
            goto L_0x0550
        L_0x051c:
            com.google.android.apps.gsa.staticplugins.opa.chatui.je r0 = new com.google.android.apps.gsa.staticplugins.opa.chatui.je
            r0.<init>()
            java.lang.CharSequence r3 = r11.f315871bG
            r0.f301663e = r3
            com.google.android.apps.gsa.shared.util.BitFlags r3 = r0.f301029k
            r4 = 0
            r8 = 4
            r3.mo85049c(r4, r8)
            r11.mo95430s(r0)
            java.lang.String r3 = ""
            r11.f315871bG = r3
            boolean r3 = r11.mo100907df()
            if (r3 == 0) goto L_0x0550
            com.google.android.apps.gsa.staticplugins.opa.valyrian.aa r3 = r11.f315853ak
            java.lang.String r0 = r0.mo96890c()
            r0.getClass()
            r3.mo100793q(r0)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.aa r0 = r11.f315853ak
            java.lang.CharSequence r0 = r0.f315537z
            r11.f315905bo = r0
            r11.mo100997bF()
        L_0x0550:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.dv r0 = r11.f315938ca
            boolean r3 = r0.f315758a
            if (r3 == 0) goto L_0x05c9
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r1 = r0.f315759b
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r1 = r1.f315859aq
            com.google.common.base.bc r3 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba.f301013a
            int r1 = r1.mo101122e(r3)
            boolean r3 = r0.f315758a
            if (r3 == 0) goto L_0x0577
            boolean r3 = r0.mo100969b(r12)
            if (r3 == 0) goto L_0x0577
            if (r1 < 0) goto L_0x0577
            r0.mo100968a()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r0.f315759b
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r0 = r0.f315859aq
            r0.mo101133p(r12)
            goto L_0x05e4
        L_0x0577:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r1 = r0.f315759b
            com.google.android.apps.gsa.search.core.i.t r1 = r1.f315982r
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247181cM
            boolean r1 = r1.mo79746e(r3)
            if (r1 != 0) goto L_0x05bc
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r1 = r0.f315759b
            com.google.android.apps.gsa.search.core.i.t r1 = r1.f315982r
            boolean r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f.m188692c(r1)
            if (r1 == 0) goto L_0x05bc
            if (r2 == 0) goto L_0x05a4
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r1 = r0.f315759b
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r1 = r1.f315859aq
            com.google.common.base.bc r2 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba.f301014b
            int r1 = r1.mo101122e(r2)
            if (r1 < 0) goto L_0x05bc
            r1 = r12
            com.google.android.apps.gsa.staticplugins.opa.chatui.je r1 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je) r1
            r1.f301665g = r7
            r1.mo96893w()
            goto L_0x05bc
        L_0x05a4:
            boolean r1 = r12 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf
            if (r1 == 0) goto L_0x05bc
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r1 = r0.f315759b
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r1 = r1.f315859aq
            com.google.common.base.bc r2 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba.f301017e
            int r1 = r1.mo101122e(r2)
            if (r1 < 0) goto L_0x05bc
            r1 = r12
            com.google.android.apps.gsa.staticplugins.opa.chatui.cf r1 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf) r1
            r1.f301176f = r7
            r1.mo96712f()
        L_0x05bc:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r1 = r0.f315759b
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r1 = r1.f315859aq
            r1.mo101133p(r12)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r0.f315759b
            r0.mo101012by()
            goto L_0x05e4
        L_0x05c9:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r0 = r11.f315859aq
            r0.mo101133p(r12)
            int r0 = r12.mo95830h()
            if (r0 != r1) goto L_0x05db
            com.google.android.apps.gsa.staticplugins.opa.bk.b r0 = r11.f315835aS
            boolean r0 = r0.f300678a
            if (r0 == 0) goto L_0x05db
            goto L_0x05e1
        L_0x05db:
            boolean r0 = m188898ey(r12)
            if (r0 == 0) goto L_0x05e4
        L_0x05e1:
            r11.mo101012by()
        L_0x05e4:
            com.google.android.apps.gsa.search.core.i.t r0 = r11.f315982r
            boolean r0 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f.m188692c(r0)
            if (r0 == 0) goto L_0x05fe
            com.google.android.apps.gsa.staticplugins.opa.bk.b r0 = r11.f315835aS
            boolean r0 = r0.f300678a
            if (r0 == 0) goto L_0x05fe
            boolean r0 = r12 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf
            if (r0 == 0) goto L_0x05fe
            r0 = r12
            com.google.android.apps.gsa.staticplugins.opa.chatui.cf r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf) r0
            r0.f301176f = r7
            r0.mo96712f()
        L_0x05fe:
            com.google.android.apps.gsa.search.core.i.t r0 = r11.f315982r
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247779nb
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x062f
            com.google.android.apps.gsa.search.core.i.t r0 = r11.f315982r
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248204R
            boolean r0 = r0.mo79746e(r1)
            if (r0 != 0) goto L_0x062f
            boolean r0 = r11.m188868eC()
            if (r0 == 0) goto L_0x062f
            com.google.android.apps.gsa.staticplugins.opa.bk.b r0 = r11.f315835aS
            boolean r0 = r0.f300678a
            if (r0 == 0) goto L_0x062f
            boolean r0 = r12 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf
            if (r0 == 0) goto L_0x062f
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r0 = r11.f315859aq
            com.google.common.base.bc r1 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba.f301014b
            int r0 = r0.mo101122e(r1)
            if (r0 <= 0) goto L_0x062f
            r11.mo101011bt(r0)
        L_0x062f:
            boolean r0 = r11.f315830aN
            if (r0 == 0) goto L_0x0641
            int r0 = r12.mo95830h()
            if (r0 == 0) goto L_0x063f
            boolean r0 = m188898ey(r12)
            if (r0 == 0) goto L_0x0641
        L_0x063f:
            r11.f315830aN = r7
        L_0x0641:
            com.google.android.apps.gsa.staticplugins.opa.webview.OpaWebView r0 = r11.f315824aH
            if (r0 == 0) goto L_0x064b
            r11.mo101021cW(r0)
            r11.m188856dU(r12)
        L_0x064b:
            com.google.android.apps.gsa.search.core.i.t r0 = r11.f315982r
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247181cM
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x0658
            r11.mo101018cR()
        L_0x0658:
            com.google.android.apps.gsa.search.core.i.t r0 = r11.f315982r
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248230aQ
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x06d6
            boolean r12 = m188862dh(r12)
            if (r12 == 0) goto L_0x06d6
            boolean r12 = r11.f315844ab
            if (r12 == 0) goto L_0x06d6
            com.google.android.apps.gsa.staticplugins.opa.chatui.ax r12 = r11.f315983s
            boolean r12 = r12.mo96405r()
            if (r12 == 0) goto L_0x06d6
            com.google.android.apps.gsa.staticplugins.opa.bk.b r12 = r11.f315835aS
            boolean r12 = r12.f300678a
            if (r12 != 0) goto L_0x06d6
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.a r12 = r11.f315859aq
            int r0 = r12.mo95351a()
            int r0 = r0 + r6
        L_0x0681:
            if (r0 < 0) goto L_0x0696
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r1 = r12.mo95352b(r0)
            boolean r2 = r1 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj
            if (r2 == 0) goto L_0x0693
            com.google.android.apps.gsa.staticplugins.opa.chatui.aj r1 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj) r1
            int r1 = r1.f300977c
            r2 = 8
            if (r1 == r2) goto L_0x06d6
        L_0x0693:
            int r0 = r0 + -1
            goto L_0x0681
        L_0x0696:
            boolean r12 = r11.f315971dh
            if (r12 != 0) goto L_0x06d6
            com.google.common.base.ax r12 = r11.f315888bX
            boolean r12 = r12.mo56113h()
            if (r12 == 0) goto L_0x06b6
            com.google.common.base.ax r12 = r11.f315888bX
            java.lang.Object r12 = r12.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.ah.l r12 = (com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106171l) r12
            com.google.android.apps.gsa.search.core.aj.aa r12 = r12.f296304b
            android.app.KeyguardManager r12 = r12.f230023b
            boolean r12 = r12.isDeviceLocked()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r12 != 0) goto L_0x06d6
        L_0x06b6:
            r11.m188853dR()
            com.google.android.libraries.gsa.k.g r12 = r11.f315815Y
            boolean r0 = r11.f315901bk
            if (r0 == 0) goto L_0x06c8
            com.google.android.apps.gsa.search.core.i.t r0 = r11.f315982r
            com.google.android.apps.gsa.shared.m.f r1 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248232aS
            long r0 = r0.mo79743a(r1)
            int r7 = (int) r0
        L_0x06c8:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ck r0 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ck
            r0.<init>(r11)
            java.lang.String r1 = "onStatusIndicatorDelayedShow"
            long r2 = (long) r7
            com.google.common.util.concurrent.cx r12 = r12.mo28208h(r1, r2, r0)
            r11.f315899bi = r12
        L_0x06d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.C114071eg.mo95430s(com.google.android.apps.gsa.staticplugins.opa.chatui.bc):void");
    }

    /* renamed from: t */
    public final void mo95431t(C108232bc bcVar) {
        this.f315859aq.mo101135r(bcVar);
    }

    /* renamed from: u */
    public final void mo95432u(C108430ik ikVar) {
        mo95408as(Collections.singletonList(ikVar));
    }

    /* renamed from: v */
    public final void mo95433v(C58485gu guVar) {
        if (mo100906dc()) {
            this.f315851ai.mo96839e();
            C108395hc hcVar = this.f315851ai;
            hcVar.f301489b.addAll(hcVar.f301489b.size(), guVar);
            hcVar.f301490c.mo96404q();
        }
    }

    /* renamed from: w */
    public final void mo95434w(int i) {
        m188853dR();
        BitFlags bitFlags = new BitFlags(C108234be.class, "FLAG_", (long) i);
        C108232bc c = this.f315859aq.mo95353c();
        while (c != null && c.mo96576jz(bitFlags) == 2) {
            this.f315859aq.mo101120F(c);
            c = this.f315859aq.mo95353c();
        }
        if (this.f315982r.mo79746e(C90014bt.f247181cM)) {
            mo101018cR();
        }
    }

    /* renamed from: x */
    public final void mo95435x() {
    }

    /* renamed from: y */
    public final void mo95436y() {
    }

    /* renamed from: z */
    public final void mo95437z(Intent intent, C91096f fVar) {
        C109037fg fgVar = this.f315911bu;
        if (fgVar != null) {
            fgVar.f303205a.mo97416D(new C113947av(this, intent, fVar));
        }
    }

    /* renamed from: eh */
    private final void m188881eh() {
        View view = this.f315794D;
        if (view == null) {
            if (this.f315983s.mo96407t()) {
                this.f315794D = ((ViewStub) this.f315853ak.f315515d.findViewById(R.id.opa_titan_legal_notice_view_stub)).inflate();
            } else {
                View inflate = this.f315876bL.inflate(R.layout.opa_halfshelf_legal_notice, this.f315984t, false);
                this.f315794D = inflate;
                this.f315984t.addView(inflate);
            }
            TextView textView = (TextView) this.f315794D.findViewById(R.id.opa_halfshelf_legal_notice);
            textView.setMovementMethod(new LinkMovementMethod());
            if (this.f315973dj.mo93970a()) {
                View view2 = this.f315794D;
                view2.getClass();
                ((GradientDrawable) view2.getBackground()).setColor(C28505a.m53283a(R.dimen.gm3_sys_elevation_level2, this.f315968de));
                textView.setTextColor(C19391a.m36980a(this.f315968de, R.attr.colorOnSurface));
            }
            view = this.f315794D;
            view.getClass();
        }
        view.setVisibility(0);
    }
}
