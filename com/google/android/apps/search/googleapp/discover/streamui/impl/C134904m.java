package com.google.android.apps.search.googleapp.discover.streamui.impl;

import android.graphics.Rect;
import android.os.Looper;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.FragmentManager;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0658ft;
import android.view.View;
import androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager;
import com.evernote.android.state.BuildConfig;
import com.facebook.litho.C6403m;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.C6474cf;
import com.google.android.apps.gsa.binaries.satin.app.C74173nf;
import com.google.android.apps.gsa.h.a.b;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.sidekick.main.p7214j.p7215a.C91445b;
import com.google.android.apps.search.googleapp.discover.feedback.FeedbackLauncher;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134268c;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134284d;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134286f;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134291k;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134296p;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134297q;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134270b;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134279k;
import com.google.android.apps.search.googleapp.discover.loggingsignals.C134467e;
import com.google.android.apps.search.googleapp.discover.loggingsignals.C134468f;
import com.google.android.apps.search.googleapp.discover.loggingsignals.FeedVisibilityDistributor;
import com.google.android.apps.search.googleapp.discover.p10166a.p10167a.C133938d;
import com.google.android.apps.search.googleapp.discover.p10166a.p10171c.C133984g;
import com.google.android.apps.search.googleapp.discover.p10173aa.C134074r;
import com.google.android.apps.search.googleapp.discover.p10175ab.p10177b.C134094c;
import com.google.android.apps.search.googleapp.discover.p10179c.C134103a;
import com.google.android.apps.search.googleapp.discover.p10181d.C134198ac;
import com.google.android.apps.search.googleapp.discover.p10181d.C134199ad;
import com.google.android.apps.search.googleapp.discover.p10181d.C134206ak;
import com.google.android.apps.search.googleapp.discover.p10181d.C134211ap;
import com.google.android.apps.search.googleapp.discover.p10181d.C134212aq;
import com.google.android.apps.search.googleapp.discover.p10181d.C134221j;
import com.google.android.apps.search.googleapp.discover.p10181d.C134223l;
import com.google.android.apps.search.googleapp.discover.p10181d.C134228q;
import com.google.android.apps.search.googleapp.discover.p10189g.C134345p;
import com.google.android.apps.search.googleapp.discover.p10195j.p10197b.C134429a;
import com.google.android.apps.search.googleapp.discover.p10200l.C134462f;
import com.google.android.apps.search.googleapp.discover.p10201m.C134470a;
import com.google.android.apps.search.googleapp.discover.p10203o.C134475d;
import com.google.android.apps.search.googleapp.discover.p10204p.p10205a.C134480a;
import com.google.android.apps.search.googleapp.discover.p10212r.C134534b;
import com.google.android.apps.search.googleapp.discover.p10238u.C134992bx;
import com.google.android.apps.search.googleapp.discover.p10238u.C135012cn;
import com.google.android.apps.search.googleapp.discover.p10238u.C135016cr;
import com.google.android.apps.search.googleapp.discover.p10238u.C135034dh;
import com.google.android.apps.search.googleapp.discover.p10238u.C135050dx;
import com.google.android.apps.search.googleapp.discover.p10238u.C135057ed;
import com.google.android.apps.search.googleapp.discover.p10238u.C135059ef;
import com.google.android.apps.search.googleapp.discover.p10238u.C135061eh;
import com.google.android.apps.search.googleapp.discover.p10238u.C135062ei;
import com.google.android.apps.search.googleapp.discover.p10238u.C135063ej;
import com.google.android.apps.search.googleapp.discover.p10238u.C135065el;
import com.google.android.apps.search.googleapp.discover.p10238u.C135067en;
import com.google.android.apps.search.googleapp.discover.p10238u.C135073et;
import com.google.android.apps.search.googleapp.discover.p10238u.C135075ev;
import com.google.android.apps.search.googleapp.discover.p10238u.C135077ex;
import com.google.android.apps.search.googleapp.discover.p10238u.C135086ff;
import com.google.android.apps.search.googleapp.discover.p10238u.C135090fj;
import com.google.android.apps.search.googleapp.discover.p10238u.p10239a.p10240a.C134939a;
import com.google.android.apps.search.googleapp.discover.p10238u.p10241b.C134968b;
import com.google.android.apps.search.googleapp.discover.p10244v.C135200t;
import com.google.android.apps.search.googleapp.discover.p10245w.p10246a.C135209c;
import com.google.android.apps.search.googleapp.discover.p10248y.C135214ab;
import com.google.android.apps.search.googleapp.discover.p10248y.C135216ad;
import com.google.android.apps.search.googleapp.discover.p10248y.C135222aj;
import com.google.android.apps.search.googleapp.discover.p10248y.C135241bb;
import com.google.android.apps.search.googleapp.discover.p10248y.C135242bc;
import com.google.android.apps.search.googleapp.discover.p10248y.C135243bd;
import com.google.android.apps.search.googleapp.discover.p10248y.C135244be;
import com.google.android.apps.search.googleapp.discover.p10248y.C135250bk;
import com.google.android.apps.search.googleapp.discover.p10248y.C135251bl;
import com.google.android.apps.search.googleapp.discover.p10248y.C135253d;
import com.google.android.apps.search.googleapp.discover.p10248y.C135254e;
import com.google.android.apps.search.googleapp.discover.p10248y.C135255f;
import com.google.android.apps.search.googleapp.discover.p10248y.C135258i;
import com.google.android.apps.search.googleapp.discover.p10248y.C135261l;
import com.google.android.apps.search.googleapp.discover.p10248y.C135269t;
import com.google.android.apps.search.googleapp.discover.p10248y.C135270u;
import com.google.android.apps.search.googleapp.discover.p10249z.C135314au;
import com.google.android.apps.search.googleapp.discover.p10249z.C135359p;
import com.google.android.apps.search.googleapp.discover.scrolllock.LauncherHorizontalScrollLocker;
import com.google.android.apps.search.googleapp.discover.streamui.C134720e;
import com.google.android.apps.search.googleapp.discover.streamui.C134744f;
import com.google.android.apps.search.googleapp.discover.streamui.C134747g;
import com.google.android.apps.search.googleapp.discover.streamui.C134749h;
import com.google.android.apps.search.googleapp.discover.streamui.FeedRenderingStateUpdater;
import com.google.android.apps.search.googleapp.discover.streamui.RecoverableErrorIntentHandler;
import com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134867aa;
import com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134874f;
import com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134888t;
import com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.ContentDisposableManager;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10235b.C134835b;
import com.google.android.apps.search.googleapp.discover.streamui.p10225a.C134698d;
import com.google.android.apps.search.googleapp.discover.streamui.p10228d.C134715a;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134722b;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134725e;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134726f;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134727g;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134730j;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134734n;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134736p;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134737q;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134743w;
import com.google.android.apps.search.googleapp.discover.streamui.p10231g.C134748a;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134757h;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134759j;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134760k;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134761l;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134762m;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134763n;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134764o;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134765p;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import com.google.android.apps.search.googleapp.discover.streamui.p10233i.C134777j;
import com.google.android.apps.search.googleapp.discover.streamui.p10233i.C134778k;
import com.google.android.apps.search.googleapp.discover.streamui.viewmodel.DiscoverViewModel;
import com.google.android.apps.search.googleapp.notificationsurvey.C136813d;
import com.google.android.apps.search.googleapp.p10310h.C136123d;
import com.google.android.apps.search.googleapp.p10310h.C136131l;
import com.google.android.apps.search.googleapp.p10516t.p10519c.C139695b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3132a.C40305b;
import com.google.android.libraries.search.video.p3191a.C41448g;
import com.google.android.libraries.search.video.p3191a.C41449h;
import com.google.android.libraries.search.video.p3191a.C41450i;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.C46764ch;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47718i;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47722m;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60866ct;
import com.google.frameworks.client.data.android.C61367ai;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4283bv.p4354e.C57528m;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57097l;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57252bg;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import dagger.hilt.android.internal.managers.C68324h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5574b.C71571du;
import kotlinx.coroutines.p5578d.C71663i;
import org.chromium.net.NetworkException;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentMap;
import p5462h.C69677g;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69499ap;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69731k;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.m */
/* compiled from: PG */
public final class C134904m implements C134744f, C134270b {

    /* renamed from: a */
    public static final C59071e f367250a = C59071e.m91331h();

    /* renamed from: b */
    public static final C46440f f367251b = new C46440f() {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            String str = (String) obj;
            C69664n.m101061g(str, "input");
            C59052c cVar = (C59052c) ((C59052c) C134904m.f367250a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(40466));
            cVar.mo56389s("Failed to update last shown time for %s.", str);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            String str = (String) obj;
            Void voidR = (Void) obj2;
            C69664n.m101061g(str, "input");
            C59052c cVar = (C59052c) C134904m.f367250a.mo56224b();
            cVar.mo56379ah(new C59094n(40467));
            cVar.mo56389s("Successfully updated last shown time for %s.", str);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: A */
    public final C46439e f367252A;

    /* renamed from: B */
    public final C134715a f367253B;

    /* renamed from: C */
    public final LauncherHorizontalScrollLocker f367254C;

    /* renamed from: D */
    public final C134468f f367255D;

    /* renamed from: E */
    public final C134199ad f367256E;

    /* renamed from: F */
    public final C134103a f367257F;

    /* renamed from: G */
    public final C6474cf f367258G;

    /* renamed from: H */
    public final C135086ff f367259H;

    /* renamed from: I */
    public final C46778cv f367260I;

    /* renamed from: J */
    public final C134901j f367261J;

    /* renamed from: K */
    public final C135200t f367262K;

    /* renamed from: L */
    public final C139695b f367263L;

    /* renamed from: M */
    public final C135250bk f367264M;

    /* renamed from: N */
    public final C134766q f367265N;

    /* renamed from: O */
    public final C134778k f367266O;

    /* renamed from: P */
    public final RecoverableErrorIntentHandler f367267P;

    /* renamed from: Q */
    public final C134470a f367268Q;

    /* renamed from: R */
    public final C134467e f367269R;

    /* renamed from: S */
    public final C134846bf f367270S;

    /* renamed from: T */
    public final C134847bg f367271T;

    /* renamed from: U */
    public final C133984g f367272U;

    /* renamed from: V */
    public final C134345p f367273V;

    /* renamed from: W */
    public final C134698d f367274W;

    /* renamed from: X */
    public final Optional f367275X;

    /* renamed from: Y */
    public final Optional f367276Y;

    /* renamed from: Z */
    public final C134480a f367277Z;

    /* renamed from: aA */
    private final FeedVisibilityDistributor f367278aA;

    /* renamed from: aB */
    private final C46801dp f367279aB;

    /* renamed from: aC */
    private final C134779a f367280aC;

    /* renamed from: aD */
    private final Rect f367281aD;

    /* renamed from: aE */
    private C135244be f367282aE;

    /* renamed from: aF */
    private int f367283aF;

    /* renamed from: aa */
    public Instant f367284aa;

    /* renamed from: ab */
    public final C0658ft f367285ab;

    /* renamed from: ac */
    public final C134845be f367286ac;

    /* renamed from: ad */
    public final C134911p f367287ad;

    /* renamed from: ae */
    public final C135050dx f367288ae;

    /* renamed from: af */
    public DiscoverViewModel f367289af;

    /* renamed from: ag */
    public C134912q f367290ag;

    /* renamed from: ah */
    public boolean f367291ah;

    /* renamed from: ai */
    public C135241bb f367292ai;

    /* renamed from: aj */
    public C57315dp f367293aj;

    /* renamed from: ak */
    public C134777j f367294ak;

    /* renamed from: al */
    public final C134906a f367295al;

    /* renamed from: am */
    public final C134907b f367296am;

    /* renamed from: an */
    public final C134908c f367297an;

    /* renamed from: ao */
    public final C91445b f367298ao;

    /* renamed from: ap */
    public final C134939a f367299ap;

    /* renamed from: aq */
    public final C133938d f367300aq;

    /* renamed from: ar */
    public final C74173nf f367301ar;

    /* renamed from: as */
    public final C134914s f367302as;

    /* renamed from: at */
    private final C40305b f367303at;

    /* renamed from: au */
    private final boolean f367304au;

    /* renamed from: av */
    private final boolean f367305av;

    /* renamed from: aw */
    private final long f367306aw;

    /* renamed from: ax */
    private final boolean f367307ax;

    /* renamed from: ay */
    private final boolean f367308ay;

    /* renamed from: az */
    private final Executor f367309az;

    /* renamed from: c */
    public C134749h f367310c;

    /* renamed from: d */
    public final boolean f367311d;

    /* renamed from: e */
    public final boolean f367312e;

    /* renamed from: f */
    public final long f367313f;

    /* renamed from: g */
    public final long f367314g;

    /* renamed from: h */
    public final long f367315h;

    /* renamed from: i */
    public final boolean f367316i;

    /* renamed from: j */
    public final boolean f367317j;

    /* renamed from: k */
    public final boolean f367318k;

    /* renamed from: l */
    public final C71422aw f367319l;

    /* renamed from: m */
    public final AccountId f367320m;

    /* renamed from: n */
    public final b f367321n;

    /* renamed from: o */
    public final C60950i f367322o;

    /* renamed from: p */
    public final C134888t f367323p;

    /* renamed from: q */
    public final C134279k f367324q;

    /* renamed from: r */
    public final C134722b f367325r;

    /* renamed from: s */
    public final C68214a f367326s;

    /* renamed from: t */
    public final C134903l f367327t;

    /* renamed from: u */
    public final C134835b f367328u;

    /* renamed from: v */
    public final C134462f f367329v;

    /* renamed from: w */
    public final C62921ba f367330w;

    /* renamed from: x */
    public final FeedRenderingStateUpdater f367331x;

    /* renamed from: y */
    public final C134074r f367332y;

    /* renamed from: z */
    public final FeedbackLauncher f367333z;

    /* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.m$a */
    /* compiled from: PG */
    final class C134906a implements C46440f {
        public C134906a() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            String str = (String) obj;
            C69664n.m101061g(str, "input");
            if (th instanceof CancellationException) {
                C59052c cVar = (C59052c) C134904m.f367250a.mo56224b();
                cVar.mo56379ah(new C59094n(40469));
                cVar.mo56386p("Cancelled token handling.");
                C134199ad adVar = C134904m.this.f367256E;
                UUID fromString = UUID.fromString(str);
                synchronized (adVar.f365549b) {
                    adVar.f365550c.remove(fromString);
                    adVar.f365551d.add(fromString);
                }
                return;
            }
            C59052c cVar2 = (C59052c) ((C59052c) C134904m.f367250a.mo56226d()).mo56382g(th);
            cVar2.mo56379ah(new C59094n(40468));
            cVar2.mo56386p("Failed to handle token.");
            C134199ad adVar2 = C134904m.this.f367256E;
            UUID fromString2 = UUID.fromString(str);
            synchronized (adVar2.f365549b) {
                if (adVar2.f365550c.containsKey(fromString2)) {
                    C134198ac acVar = (C134198ac) adVar2.f365550c.get(fromString2);
                    acVar.getClass();
                    C37252a c = C37182a.f98247q.mo40779c();
                    adVar2.mo111611e(c);
                    acVar.mo111606b(c);
                    C37252a c2 = C37182a.f98086g.mo40805c(C62722b.INTERNAL);
                    if (th instanceof C134968b) {
                        c2.mo40781e(C61367ai.m93875a(((C134968b) th).f367493a));
                    } else if (th.getCause() instanceof NetworkException) {
                        int errorCode = C89885b.CRONET_NATIVE_ERROR_VALUE - ((NetworkException) th.getCause()).getErrorCode();
                        if (errorCode <= 660000 || errorCode >= 662000) {
                            ((C59052c) ((C59052c) C134199ad.f365548a.mo56226d()).mo56372aa(40239)).mo56387q("Cronet error code for a native error out of range: %d", errorCode);
                            errorCode = C89885b.CRONET_ERROR_CODE_OUT_OF_RANGE_VALUE;
                        }
                        c2.mo40780d(errorCode, "GSA_ERRORS");
                    }
                    adVar2.mo111611e(c2);
                    acVar.mo111605a(c2);
                    adVar2.mo111610d(acVar);
                    adVar2.f365550c.remove(fromString2);
                }
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            String str = (String) obj;
            Void voidR = (Void) obj2;
            C69664n.m101061g(str, "input");
            C59052c cVar = (C59052c) C134904m.f367250a.mo56224b();
            cVar.mo56379ah(new C59094n(40470));
            cVar.mo56386p("successfully handled token.");
            C134199ad adVar = C134904m.this.f367256E;
            UUID fromString = UUID.fromString(str);
            synchronized (adVar.f365549b) {
                if (adVar.f365550c.containsKey(fromString)) {
                    C134198ac acVar = (C134198ac) adVar.f365550c.get(fromString);
                    acVar.getClass();
                    C37252a c = C37182a.f98246p.mo40779c();
                    adVar.mo111611e(c);
                    acVar.mo111606b(c);
                    C37252a c2 = C37182a.f98086g.mo40805c(C62722b.OK);
                    adVar.mo111611e(c2);
                    acVar.mo111605a(c2);
                    adVar.mo111610d(acVar);
                    adVar.f365550c.remove(fromString);
                }
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.m$c */
    /* compiled from: PG */
    final class C134908c implements C46792di.C46793a {

        /* renamed from: b */
        private boolean f367337b;

        public C134908c() {
        }

        /* renamed from: g */
        private final void m218791g(Throwable th) {
            C59052c cVar = (C59052c) ((C59052c) C134904m.f367250a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(40474));
            cVar.mo56386p("Background fetch error");
            C134904m.this.mo112063t();
            if (th instanceof C135258i) {
                DiscoverViewModel discoverViewModel = C134904m.this.f367289af;
                if (discoverViewModel == null) {
                    C69664n.m101065k("discoverViewModel");
                    discoverViewModel = null;
                }
                C135258i iVar = (C135258i) th;
                discoverViewModel.f367360a.f367362b = iVar;
                C135216ad adVar = iVar.f368482a;
                C69664n.m101060f(adVar, "t.failedRenderableStream");
                m218792h(adVar, C134827au.m218662a(adVar));
            } else if (th instanceof C46764ch) {
                ((C134212aq) C134904m.this.f367326s.mo27525b()).mo111643d(C89885b.FEED_LAUNCH_INFINITE_PENDING_STATE);
            } else {
                ((C134212aq) C134904m.this.f367326s.mo27525b()).mo111643d(C89885b.FEED_LAUNCH_UNKNOWN_DATASOURCE_ERROR);
                C59052c cVar2 = (C59052c) ((C59052c) C134904m.f367250a.mo56226d()).mo56382g(th);
                cVar2.mo56378ag(C38505d.f101864b, 149320745);
                cVar2.mo56379ah(new C59094n(40475));
                cVar2.mo56386p("Unknown error thrown by the DataSource in background fetch.");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:107:0x0228, code lost:
            if (r1.f367336a.f367291ah != false) goto L_0x022a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x021d A[Catch:{ all -> 0x02f0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x0224 A[Catch:{ all -> 0x02f0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x023d A[Catch:{ all -> 0x02f0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x0244 A[Catch:{ all -> 0x02f0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x0245 A[Catch:{ all -> 0x02f0 }] */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m218792h(com.google.android.apps.search.googleapp.discover.p10248y.C135216ad r17, com.google.android.apps.search.googleapp.discover.streamui.impl.C134828av r18) {
            /*
                r16 = this;
                r1 = r16
                r0 = r17
                com.google.android.apps.search.googleapp.discover.streamui.impl.m r2 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.this
                java.lang.String r3 = "handleNewRenderableStream"
                com.google.apps.tiktok.tracing.bi r3 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r3)
                java.util.List r4 = r17.mo112171c()     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.y.bg r5 = com.google.android.apps.search.googleapp.discover.p10248y.C135246bg.f368435a     // Catch:{ all -> 0x02f0 }
                boolean r4 = r4.contains(r5)     // Catch:{ all -> 0x02f0 }
                if (r4 == 0) goto L_0x003e
                com.google.apps.tiktok.concurrent.futuresmixin.e r4 = r2.f367252A     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.l.f r5 = r2.f367329v     // Catch:{ all -> 0x02f0 }
                com.google.android.libraries.storage.protostore.ab r6 = r5.f366205b     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.l.e r7 = new com.google.android.apps.search.googleapp.discover.l.e     // Catch:{ all -> 0x02f0 }
                r7.<init>(r5)     // Catch:{ all -> 0x02f0 }
                java.util.concurrent.Executor r5 = r5.f366206c     // Catch:{ all -> 0x02f0 }
                com.google.common.util.concurrent.cx r5 = r6.mo46039a(r7, r5)     // Catch:{ all -> 0x02f0 }
                java.lang.String r6 = "fun updateSignedOutShown…lightweightExecutor\n    )"
                p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)     // Catch:{ all -> 0x02f0 }
                com.google.apps.tiktok.concurrent.futuresmixin.d r5 = com.google.android.apps.search.googleapp.discover.p10245w.p10246a.C135209c.m219303b(r5)     // Catch:{ all -> 0x02f0 }
                java.lang.String r6 = "signed out error"
                com.google.apps.tiktok.concurrent.futuresmixin.b r7 = new com.google.apps.tiktok.concurrent.futuresmixin.b     // Catch:{ all -> 0x02f0 }
                r7.<init>(r6)     // Catch:{ all -> 0x02f0 }
                com.google.apps.tiktok.concurrent.futuresmixin.f r6 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.f367251b     // Catch:{ all -> 0x02f0 }
                r4.mo50445g(r5, r7, r6)     // Catch:{ all -> 0x02f0 }
            L_0x003e:
                com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.t r4 = r2.f367323p     // Catch:{ all -> 0x02f0 }
                java.lang.String r5 = "newRenderableStream"
                p5462h.p5473f.p5475b.C69664n.m101061g(r0, r5)     // Catch:{ all -> 0x02f0 }
                java.lang.String r5 = "RecyclerViewContentManager"
                com.google.apps.tiktok.tracing.bi r5 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r5)     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.y.ad r6 = r4.f367201j     // Catch:{ all -> 0x02e7 }
                boolean r7 = r0 instanceof com.google.android.apps.search.googleapp.discover.p10248y.C135215ac     // Catch:{ all -> 0x02e7 }
                if (r7 == 0) goto L_0x00b8
                r7 = r0
                com.google.android.apps.search.googleapp.discover.y.ac r7 = (com.google.android.apps.search.googleapp.discover.p10248y.C135215ac) r7     // Catch:{ all -> 0x02e7 }
                java.util.List r7 = r7.f368319g     // Catch:{ all -> 0x02e7 }
                java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x02e7 }
            L_0x005a:
                boolean r8 = r7.hasNext()     // Catch:{ all -> 0x02e7 }
                if (r8 == 0) goto L_0x00b8
                java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x02e7 }
                com.google.bv.e.b.b.b.ab r8 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57118ab) r8     // Catch:{ all -> 0x02e7 }
                com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.h r9 = r4.f367198g     // Catch:{ all -> 0x02e7 }
                com.google.bv.j.b.a.p r8 = r8.f152472a     // Catch:{ all -> 0x02e7 }
                if (r8 != 0) goto L_0x006e
                com.google.bv.j.b.a.p r8 = com.google.p4283bv.p4380j.p4385b.p4386a.C57784p.f154382f     // Catch:{ all -> 0x02e7 }
            L_0x006e:
                java.lang.String r10 = "ElementsInitializer#loadElementsRenderData"
                com.google.apps.tiktok.tracing.bi r10 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r10)     // Catch:{ all -> 0x02e7 }
                com.google.protos.youtube.elements.d.a.b r11 = r8.f154386c     // Catch:{ all -> 0x00ac }
                if (r11 != 0) goto L_0x007a
                com.google.protos.youtube.elements.d.a.b r11 = com.google.protos.youtube.elements.p5168d.p5169a.C66184b.f179967b     // Catch:{ all -> 0x00ac }
            L_0x007a:
                com.google.protobuf.cq r11 = r11.f179969a     // Catch:{ all -> 0x00ac }
                r11.size()     // Catch:{ all -> 0x00ac }
                com.google.bv.j.b.a.h r11 = r8.f154387d     // Catch:{ all -> 0x00ac }
                if (r11 != 0) goto L_0x0085
                com.google.bv.j.b.a.h r11 = com.google.p4283bv.p4380j.p4385b.p4386a.C57776h.f154365b     // Catch:{ all -> 0x00ac }
            L_0x0085:
                com.google.protobuf.cq r11 = r11.f154367a     // Catch:{ all -> 0x00ac }
                r11.size()     // Catch:{ all -> 0x00ac }
                com.google.android.libraries.search.rendering.xuikit.d.a.b r11 = r9.f367179a     // Catch:{ all -> 0x00ac }
                com.google.android.libraries.search.rendering.xuikit.a.f r11 = r11.mo32551j()     // Catch:{ all -> 0x00ac }
                com.google.protos.youtube.elements.d.a.b r12 = r8.f154386c     // Catch:{ all -> 0x00ac }
                if (r12 != 0) goto L_0x0096
                com.google.protos.youtube.elements.d.a.b r12 = com.google.protos.youtube.elements.p5168d.p5169a.C66184b.f179967b     // Catch:{ all -> 0x00ac }
            L_0x0096:
                r11.mo42169b(r12)     // Catch:{ all -> 0x00ac }
                com.google.android.libraries.search.rendering.xuikit.d.a.b r9 = r9.f367179a     // Catch:{ all -> 0x00ac }
                com.google.android.libraries.search.rendering.xuikit.a.d r9 = r9.mo32550i()     // Catch:{ all -> 0x00ac }
                com.google.bv.j.b.a.h r8 = r8.f154387d     // Catch:{ all -> 0x00ac }
                if (r8 != 0) goto L_0x00a5
                com.google.bv.j.b.a.h r8 = com.google.p4283bv.p4380j.p4385b.p4386a.C57776h.f154365b     // Catch:{ all -> 0x00ac }
            L_0x00a5:
                r9.mo42164a(r8)     // Catch:{ all -> 0x00ac }
                r10.close()     // Catch:{ all -> 0x02e7 }
                goto L_0x005a
            L_0x00ac:
                r0 = move-exception
                r2 = r0
                r10.close()     // Catch:{ all -> 0x00b2 }
                goto L_0x00b7
            L_0x00b2:
                r0 = move-exception
                r4 = r0
                com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134875g.m218717a(r2, r4)     // Catch:{ all -> 0x02e7 }
            L_0x00b7:
                throw r2     // Catch:{ all -> 0x02e7 }
            L_0x00b8:
                r7 = 2
                r8 = 1
                if (r6 != 0) goto L_0x00c1
                r4.mo112044b(r0)     // Catch:{ all -> 0x02e7 }
                r4 = 1
                goto L_0x0116
            L_0x00c1:
                com.google.android.apps.search.googleapp.discover.y.aa r9 = r6.mo112170b()     // Catch:{ all -> 0x02e7 }
                com.google.android.apps.search.googleapp.discover.y.aa r10 = r17.mo112170b()     // Catch:{ all -> 0x02e7 }
                boolean r9 = p5462h.p5473f.p5475b.C69664n.m101066l(r9, r10)     // Catch:{ all -> 0x02e7 }
                if (r9 == 0) goto L_0x0112
                com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.l r9 = new com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.l     // Catch:{ all -> 0x02e7 }
                r9.<init>(r6, r0)     // Catch:{ all -> 0x02e7 }
                android.support.v7.e.f r9 = android.support.p033v7.p040e.C0429k.m1383a(r9, r8)     // Catch:{ all -> 0x02e7 }
                com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.k r10 = new com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.k     // Catch:{ all -> 0x02e7 }
                r10.<init>(r4)     // Catch:{ all -> 0x02e7 }
                com.facebook.litho.widget.cn r11 = new com.facebook.litho.widget.cn     // Catch:{ all -> 0x02e7 }
                java.util.List r12 = r6.mo112171c()     // Catch:{ all -> 0x02e7 }
                java.util.List r13 = r17.mo112171c()     // Catch:{ all -> 0x02e7 }
                com.facebook.litho.widget.cf r14 = r4.f367195d     // Catch:{ all -> 0x02e7 }
                com.facebook.litho.widget.ci r15 = new com.facebook.litho.widget.ci     // Catch:{ all -> 0x02e7 }
                r15.<init>(r14)     // Catch:{ all -> 0x02e7 }
                r11.<init>(r12, r13, r10, r15)     // Catch:{ all -> 0x02e7 }
                com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.i r10 = new com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.i     // Catch:{ all -> 0x02e7 }
                java.util.List r6 = r6.mo112171c()     // Catch:{ all -> 0x02e7 }
                com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.ContentDisposableManager r12 = r4.f367194c     // Catch:{ all -> 0x02e7 }
                r10.<init>(r6, r12)     // Catch:{ all -> 0x02e7 }
                r9.mo1398a(r10)     // Catch:{ all -> 0x02e7 }
                r9.mo1398a(r11)     // Catch:{ all -> 0x02e7 }
                com.facebook.litho.u r6 = r4.f367197f     // Catch:{ all -> 0x02e7 }
                r11.mo13571e(r6)     // Catch:{ all -> 0x02e7 }
                com.facebook.litho.widget.cf r6 = r4.f367195d     // Catch:{ all -> 0x02e7 }
                com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.j r9 = com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134888t.f367192a     // Catch:{ all -> 0x02e7 }
                r6.mo13553D(r8, r9)     // Catch:{ all -> 0x02e7 }
                r4.f367201j = r0     // Catch:{ all -> 0x02e7 }
                r4 = 3
                goto L_0x0116
            L_0x0112:
                r4.mo112044b(r0)     // Catch:{ all -> 0x02e7 }
                r4 = 2
            L_0x0116:
                r6 = 0
                p5462h.p5472e.C69598b.m101013a(r5, r6)     // Catch:{ all -> 0x02f0 }
                boolean r5 = r0 instanceof com.google.android.apps.search.googleapp.discover.p10248y.C135215ac     // Catch:{ all -> 0x02f0 }
                if (r5 == 0) goto L_0x025f
                com.google.android.apps.search.googleapp.discover.y.ac r0 = (com.google.android.apps.search.googleapp.discover.p10248y.C135215ac) r0     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.streamui.impl.m r5 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.this     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.streamui.i.j r5 = r5.f367294ak     // Catch:{ all -> 0x02f0 }
                r9 = 0
                if (r5 == 0) goto L_0x0178
                com.google.android.apps.search.googleapp.discover.streamui.i.i r10 = r0.f368320h     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.streamui.i.i r11 = r5.mo112000a()     // Catch:{ all -> 0x02f0 }
                boolean r11 = r10.equals(r11)     // Catch:{ all -> 0x02f0 }
                if (r11 == 0) goto L_0x0134
                goto L_0x0178
            L_0x0134:
                com.google.apps.tiktok.account.AccountId r11 = r5.f366972b     // Catch:{ all -> 0x02f0 }
                boolean r12 = r10 instanceof com.google.android.apps.search.googleapp.discover.streamui.p10233i.C134775h     // Catch:{ all -> 0x02f0 }
                if (r12 == 0) goto L_0x013c
                r12 = r6
                goto L_0x0152
            L_0x013c:
                boolean r12 = r10 instanceof com.google.android.apps.search.googleapp.discover.streamui.p10233i.C134774g     // Catch:{ all -> 0x02f0 }
                if (r12 == 0) goto L_0x0172
                com.google.android.apps.search.googleapp.discover.streamui.i.g r10 = (com.google.android.apps.search.googleapp.discover.streamui.p10233i.C134774g) r10     // Catch:{ all -> 0x02f0 }
                com.google.bv.e.b.b.d.t r10 = r10.f366969a     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.streamui.i.b r12 = new com.google.android.apps.search.googleapp.discover.streamui.i.b     // Catch:{ all -> 0x02f0 }
                r12.<init>()     // Catch:{ all -> 0x02f0 }
                dagger.hilt.android.internal.managers.C68324h.m98669f(r12)     // Catch:{ all -> 0x02f0 }
                com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.m84047b(r12, r11)     // Catch:{ all -> 0x02f0 }
                com.google.apps.tiktok.inject.p3659d.C47243l.m84039a(r12, r10)     // Catch:{ all -> 0x02f0 }
            L_0x0152:
                if (r12 == 0) goto L_0x016e
                android.support.v4.app.Fragment r10 = r5.f366971a     // Catch:{ all -> 0x02f0 }
                android.support.v4.app.FragmentManager r10 = r10.getChildFragmentManager()     // Catch:{ all -> 0x02f0 }
                android.support.v4.app.a r11 = new android.support.v4.app.a     // Catch:{ all -> 0x02f0 }
                r11.<init>((android.support.p031v4.app.FragmentManager) r10)     // Catch:{ all -> 0x02f0 }
                r10 = 2131431516(0x7f0b105c, float:1.8484763E38)
                r11.mo689v(r10, r12, r6)     // Catch:{ all -> 0x02f0 }
                r11.mo509f()     // Catch:{ all -> 0x02f0 }
                android.view.View r5 = r5.f366973c     // Catch:{ all -> 0x02f0 }
                r5.setVisibility(r9)     // Catch:{ all -> 0x02f0 }
                goto L_0x0178
            L_0x016e:
                r5.mo112001b()     // Catch:{ all -> 0x02f0 }
                goto L_0x0178
            L_0x0172:
                h.g r0 = new h.g     // Catch:{ all -> 0x02f0 }
                r0.<init>()     // Catch:{ all -> 0x02f0 }
                throw r0     // Catch:{ all -> 0x02f0 }
            L_0x0178:
                com.google.android.apps.search.googleapp.discover.streamui.impl.m r5 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.this     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.loggingsignals.f r5 = r5.f367255D     // Catch:{ all -> 0x02f0 }
                com.google.common.o.l.r r10 = r0.f368315c     // Catch:{ all -> 0x02f0 }
                r5.mo111506q(r10)     // Catch:{ all -> 0x02f0 }
                if (r4 == r7) goto L_0x0185
                if (r4 != r8) goto L_0x018f
            L_0x0185:
                com.google.android.apps.search.googleapp.discover.streamui.impl.m r5 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.this     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.g.p r5 = r5.f367273V     // Catch:{ all -> 0x02f0 }
                r5.mo111749c()     // Catch:{ all -> 0x02f0 }
                r5.mo111748b()     // Catch:{ all -> 0x02f0 }
            L_0x018f:
                com.google.android.apps.search.googleapp.discover.y.w r5 = r0.f368318f     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.z.p r5 = r5.f368519a     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.streamui.impl.m r10 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.this     // Catch:{ all -> 0x02f0 }
                boolean r10 = r10.f367311d     // Catch:{ all -> 0x02f0 }
                if (r10 == 0) goto L_0x01cd
                if (r5 == 0) goto L_0x01cd
                com.google.android.apps.search.googleapp.discover.s.ak r10 = r5.f368799a     // Catch:{ all -> 0x02f0 }
                boolean r10 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134825as.m218660b(r10)     // Catch:{ all -> 0x02f0 }
                if (r10 == 0) goto L_0x01cd
                com.google.android.apps.search.googleapp.discover.streamui.impl.m r10 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.this     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.streamui.impl.b.b r11 = r10.f367328u     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.streamui.h.q r10 = r10.f367265N     // Catch:{ all -> 0x02f0 }
                com.google.bv.e.m r10 = r10.f366956e     // Catch:{ all -> 0x02f0 }
                java.lang.String r12 = "surface"
                p5462h.p5473f.p5475b.C69664n.m101061g(r10, r12)     // Catch:{ all -> 0x02f0 }
                int r12 = r11.f367075b     // Catch:{ all -> 0x02f0 }
                int r13 = r12 + -1
                if (r12 == 0) goto L_0x01cc
                if (r13 == 0) goto L_0x01c3
                if (r13 == r8) goto L_0x01bb
                goto L_0x01cd
            L_0x01bb:
                com.google.android.apps.search.googleapp.discover.streamui.impl.b.a r12 = new com.google.android.apps.search.googleapp.discover.streamui.impl.b.a     // Catch:{ all -> 0x02f0 }
                r12.<init>(r5, r10)     // Catch:{ all -> 0x02f0 }
                r11.f367074a = r12     // Catch:{ all -> 0x02f0 }
                goto L_0x01cd
            L_0x01c3:
                com.google.android.apps.search.googleapp.discover.streamui.impl.b.a r12 = new com.google.android.apps.search.googleapp.discover.streamui.impl.b.a     // Catch:{ all -> 0x02f0 }
                r12.<init>(r5, r10)     // Catch:{ all -> 0x02f0 }
                r11.mo112018a(r12)     // Catch:{ all -> 0x02f0 }
                goto L_0x01cd
            L_0x01cc:
                throw r6     // Catch:{ all -> 0x02f0 }
            L_0x01cd:
                com.google.android.apps.search.googleapp.discover.streamui.impl.m r5 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.this     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.streamui.impl.be r10 = r5.f367286ac     // Catch:{ all -> 0x02f0 }
                com.facebook.litho.widget.cf r5 = r5.f367258G     // Catch:{ all -> 0x02f0 }
                java.lang.String r11 = "recyclerBinder"
                p5462h.p5473f.p5475b.C69664n.m101061g(r5, r11)     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.streamui.impl.bd r11 = r10.f367104d     // Catch:{ all -> 0x02f0 }
                r12 = 6
                r13 = -1
                if (r11 != 0) goto L_0x01e0
            L_0x01de:
                r8 = 0
                goto L_0x0219
            L_0x01e0:
                int r14 = r11.f367098a     // Catch:{ all -> 0x02f0 }
                if (r14 != r13) goto L_0x01fd
                com.google.common.f.e r5 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134845be.f367102b     // Catch:{ all -> 0x02f0 }
                com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ all -> 0x02f0 }
                com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x02f0 }
                java.lang.String r8 = "Attempting to scroll to NO_POSITION, no-oping"
                com.google.common.f.n r10 = new com.google.common.f.n     // Catch:{ all -> 0x02f0 }
                r11 = 40515(0x9e43, float:5.6774E-41)
                r10.<init>(r11)     // Catch:{ all -> 0x02f0 }
                r5.mo56379ah(r10)     // Catch:{ all -> 0x02f0 }
                r5.mo56386p(r8)     // Catch:{ all -> 0x02f0 }
                goto L_0x01de
            L_0x01fd:
                boolean r15 = r11.f367100c     // Catch:{ all -> 0x02f0 }
                if (r15 == 0) goto L_0x0207
                int r11 = r11.f367099b     // Catch:{ all -> 0x02f0 }
                r5.mo13560M(r14, r11, r12)     // Catch:{ all -> 0x02f0 }
                goto L_0x0217
            L_0x0207:
                int r11 = r11.f367099b     // Catch:{ all -> 0x02f0 }
                android.support.v7.widget.RecyclerView r15 = r5.f19224q     // Catch:{ all -> 0x02f0 }
                if (r15 != 0) goto L_0x0212
                r5.f19225r = r14     // Catch:{ all -> 0x02f0 }
                r5.f19227t = r11     // Catch:{ all -> 0x02f0 }
                goto L_0x0217
            L_0x0212:
                com.facebook.litho.widget.am r5 = r5.f19210c     // Catch:{ all -> 0x02f0 }
                r5.mo13490l(r14, r11)     // Catch:{ all -> 0x02f0 }
            L_0x0217:
                r10.f367104d = r6     // Catch:{ all -> 0x02f0 }
            L_0x0219:
                boolean r5 = r0.f368323k     // Catch:{ all -> 0x02f0 }
                if (r8 != 0) goto L_0x0222
                if (r4 == r7) goto L_0x0220
                goto L_0x0222
            L_0x0220:
                r4 = 2
                goto L_0x022a
            L_0x0222:
                if (r5 == 0) goto L_0x0235
                com.google.android.apps.search.googleapp.discover.streamui.impl.m r8 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.this     // Catch:{ all -> 0x02f0 }
                boolean r8 = r8.f367291ah     // Catch:{ all -> 0x02f0 }
                if (r8 == 0) goto L_0x0235
            L_0x022a:
                com.google.android.apps.search.googleapp.discover.streamui.impl.m r8 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.this     // Catch:{ all -> 0x02f0 }
                com.facebook.litho.widget.cf r8 = r8.f367258G     // Catch:{ all -> 0x02f0 }
                r8.mo13560M(r9, r9, r12)     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.streamui.impl.m r8 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.this     // Catch:{ all -> 0x02f0 }
                r8.f367291ah = r9     // Catch:{ all -> 0x02f0 }
            L_0x0235:
                com.google.android.apps.search.googleapp.discover.streamui.impl.m r8 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.this     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.streamui.impl.SwipeRefreshView r8 = r8.mo112062s()     // Catch:{ all -> 0x02f0 }
                if (r8 == 0) goto L_0x0240
                r8.setEnabled(r5)     // Catch:{ all -> 0x02f0 }
            L_0x0240:
                com.google.android.apps.search.googleapp.discover.y.u r0 = r0.f368322j     // Catch:{ all -> 0x02f0 }
                if (r0 != 0) goto L_0x0245
                goto L_0x0259
            L_0x0245:
                int[] r5 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134913r.f367343a     // Catch:{ all -> 0x02f0 }
                int r8 = r0.ordinal()     // Catch:{ all -> 0x02f0 }
                r5 = r5[r8]     // Catch:{ all -> 0x02f0 }
                if (r5 == r13) goto L_0x0259
                com.google.android.apps.search.googleapp.discover.streamui.e.b r5 = r2.f367325r     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.d.j r0 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134825as.m218659a(r0)     // Catch:{ all -> 0x02f0 }
                r5.mo111910f(r0)     // Catch:{ all -> 0x02f0 }
                goto L_0x0281
            L_0x0259:
                com.google.android.apps.search.googleapp.discover.streamui.e.b r0 = r2.f367325r     // Catch:{ all -> 0x02f0 }
                r0.mo111909e()     // Catch:{ all -> 0x02f0 }
                goto L_0x0281
            L_0x025f:
                boolean r5 = r0 instanceof com.google.android.apps.search.googleapp.discover.p10248y.C135271v     // Catch:{ all -> 0x02f0 }
                if (r5 == 0) goto L_0x0269
                com.google.android.apps.search.googleapp.discover.streamui.e.b r0 = r2.f367325r     // Catch:{ all -> 0x02f0 }
                r0.mo111909e()     // Catch:{ all -> 0x02f0 }
                goto L_0x0281
            L_0x0269:
                boolean r5 = r0 instanceof com.google.android.apps.search.googleapp.discover.p10248y.C135214ab     // Catch:{ all -> 0x02f0 }
                if (r5 == 0) goto L_0x0281
                com.google.android.apps.search.googleapp.discover.streamui.e.b r5 = r2.f367325r     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.y.ab r0 = (com.google.android.apps.search.googleapp.discover.p10248y.C135214ab) r0     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.y.u r0 = r0.f368310a     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.d.j r0 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134825as.m218659a(r0)     // Catch:{ all -> 0x02f0 }
                r5.mo111910f(r0)     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.streamui.i.j r0 = r2.f367294ak     // Catch:{ all -> 0x02f0 }
                if (r0 == 0) goto L_0x0281
                r0.mo112001b()     // Catch:{ all -> 0x02f0 }
            L_0x0281:
                if (r4 != r7) goto L_0x02a5
                dagger.a r0 = r2.f367326s     // Catch:{ all -> 0x02f0 }
                java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.d.aq r0 = (com.google.android.apps.search.googleapp.discover.p10181d.C134212aq) r0     // Catch:{ all -> 0x02f0 }
                java.lang.Object r4 = r0.f365586d     // Catch:{ all -> 0x02f0 }
                monitor-enter(r4)     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.d.ak r0 = r0.f365587e     // Catch:{ all -> 0x02a2 }
                if (r0 != 0) goto L_0x0294
                monitor-exit(r4)     // Catch:{ all -> 0x02a2 }
                goto L_0x0298
            L_0x0294:
                r0.mo111631j()     // Catch:{ all -> 0x02a2 }
                monitor-exit(r4)     // Catch:{ all -> 0x02a2 }
            L_0x0298:
                com.google.android.apps.search.googleapp.discover.streamui.impl.b.b r0 = r2.f367328u     // Catch:{ all -> 0x02f0 }
                r0.f367074a = r6     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.loggingsignals.f r0 = r2.f367255D     // Catch:{ all -> 0x02f0 }
                r0.mo111502m()     // Catch:{ all -> 0x02f0 }
                goto L_0x02a5
            L_0x02a2:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x02a2 }
                throw r0     // Catch:{ all -> 0x02f0 }
            L_0x02a5:
                com.google.android.apps.search.googleapp.discover.streamui.impl.g r0 = r2.mo112061r()     // Catch:{ all -> 0x02f0 }
                if (r0 == 0) goto L_0x02e3
                com.google.android.apps.gsa.binaries.satin.app.nf r2 = r2.f367301ar     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.streamui.impl.ba r4 = new com.google.android.apps.search.googleapp.discover.streamui.impl.ba     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.gsa.binaries.satin.app.ni r5 = r2.f206648a     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.gsa.binaries.satin.app.aqy r5 = r5.a     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.gsa.binaries.satin.app.aso r5 = r5.d     // Catch:{ all -> 0x02f0 }
                g.a.a r5 = r5.f201623cc     // Catch:{ all -> 0x02f0 }
                java.lang.Object r5 = r5.mo17428b()     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.d.aq r5 = (com.google.android.apps.search.googleapp.discover.p10181d.C134212aq) r5     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.gsa.binaries.satin.app.ni r7 = r2.f206648a     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.gsa.binaries.satin.app.nj r7 = r7.c     // Catch:{ all -> 0x02f0 }
                g.a.a r7 = r7.f206704aa     // Catch:{ all -> 0x02f0 }
                java.lang.Object r7 = r7.mo17428b()     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.streamui.e.b r7 = (com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134722b) r7     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.gsa.binaries.satin.app.ni r2 = r2.f206648a     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.gsa.binaries.satin.app.nj r2 = r2.c     // Catch:{ all -> 0x02f0 }
                g.a.a r2 = r2.f206718ao     // Catch:{ all -> 0x02f0 }
                java.lang.Object r2 = r2.mo17428b()     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.streamui.impl.a r2 = (com.google.android.apps.search.googleapp.discover.streamui.impl.C134779a) r2     // Catch:{ all -> 0x02f0 }
                r8 = r18
                r4.<init>(r5, r7, r2, r8)     // Catch:{ all -> 0x02f0 }
                java.lang.Runnable r2 = com.google.apps.tiktok.tracing.C47810es.m84977q(r4)     // Catch:{ all -> 0x02f0 }
                com.google.android.apps.search.googleapp.discover.streamui.impl.DiscoverRecyclerView r0 = r0.f367234b     // Catch:{ all -> 0x02f0 }
                r0.post(r2)     // Catch:{ all -> 0x02f0 }
            L_0x02e3:
                p5462h.p5472e.C69598b.m101013a(r3, r6)
                return
            L_0x02e7:
                r0 = move-exception
                r2 = r0
                throw r2     // Catch:{ all -> 0x02ea }
            L_0x02ea:
                r0 = move-exception
                r4 = r0
                p5462h.p5472e.C69598b.m101013a(r5, r2)     // Catch:{ all -> 0x02f0 }
                throw r4     // Catch:{ all -> 0x02f0 }
            L_0x02f0:
                r0 = move-exception
                r2 = r0
                throw r2     // Catch:{ all -> 0x02f3 }
            L_0x02f3:
                r0 = move-exception
                r4 = r0
                p5462h.p5472e.C69598b.m101013a(r3, r2)
                goto L_0x02fa
            L_0x02f9:
                throw r4
            L_0x02fa:
                goto L_0x02f9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.C134908c.m218792h(com.google.android.apps.search.googleapp.discover.y.ad, com.google.android.apps.search.googleapp.discover.streamui.impl.av):void");
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C89885b bVar;
            C69664n.m101061g(th, C42181t.f110467a);
            C59052c cVar = (C59052c) ((C59052c) C134904m.f367250a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(40478));
            cVar.mo56386p("Failed RenderableStream callback; SubscriptionCallbacks#onError(Throwable) called.");
            if (this.f367337b) {
                C134904m.this.mo112063t();
                this.f367337b = false;
            }
            if (th instanceof C135258i) {
                C135216ad adVar = ((C135258i) th).f368482a;
                C69664n.m101060f(adVar, "t.failedRenderableStream");
                m218792h(adVar, C134827au.m218662a(adVar));
                return;
            }
            boolean z = th instanceof C46764ch;
            if (z) {
                bVar = C89885b.FEED_LAUNCH_INFINITE_PENDING_STATE;
            } else {
                bVar = C89885b.FEED_LAUNCH_UNKNOWN_DATASOURCE_ERROR;
            }
            if (!z) {
                C59052c cVar2 = (C59052c) ((C59052c) C134904m.f367250a.mo56226d()).mo56382g(th);
                cVar2.mo56378ag(C38505d.f101864b, 149320745);
                cVar2.mo56379ah(new C59094n(40479));
                cVar2.mo56386p("Unknown error thrown by the DataSource.");
            }
            C134904m mVar = C134904m.this;
            C135250bk bkVar = mVar.f367264M;
            int i = mVar.f367310c.f366917j;
            C69664n.m101061g(th, "cause");
            C58480gp e = C58485gu.m89837e();
            if (i != -1) {
                e.mo55395g(new C135261l(i));
            }
            Instant a = bkVar.f368450d.mo57444a();
            C69664n.m101060f(a, "timeSource.now()");
            e.mo55395g(new C135251bl(a, th));
            C135270u uVar = C135270u.UNKNOWN;
            C58485gu f = e.mo55394f();
            C69664n.m101060f(f, "listBuilder.build()");
            C135214ab b = C135269t.m219406b(uVar, f);
            C69664n.m101061g(bVar, "gsaErrorCode");
            m218792h(b, new C134829aw(bVar));
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x00a2  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00a6  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo18078b(java.lang.Object r7) {
            /*
                r6 = this;
                com.google.android.apps.search.googleapp.discover.y.ad r7 = (com.google.android.apps.search.googleapp.discover.p10248y.C135216ad) r7
                java.lang.String r0 = "renderableStream"
                p5462h.p5473f.p5475b.C69664n.m101061g(r7, r0)
                com.google.common.f.e r0 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.f367250a
                com.google.common.f.x r0 = r0.mo56224b()
                com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
                java.util.List r1 = r7.mo112171c()
                int r1 = r1.size()
                com.google.common.f.n r2 = new com.google.common.f.n
                r3 = 40480(0x9e20, float:5.6725E-41)
                r2.<init>(r3)
                r0.mo56379ah(r2)
                java.lang.String r2 = "StreamFragmentPeer#onNewData called, renderable slices %s"
                r0.mo56387q(r2, r1)
                com.google.android.apps.search.googleapp.discover.streamui.impl.m r0 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.this
                com.google.android.apps.search.googleapp.discover.streamui.viewmodel.DiscoverViewModel r0 = r0.f367289af
                java.lang.String r1 = "discoverViewModel"
                r2 = 0
                if (r0 != 0) goto L_0x0034
                p5462h.p5473f.p5475b.C69664n.m101065k(r1)
                r0 = r2
            L_0x0034:
                com.google.android.apps.search.googleapp.discover.streamui.viewmodel.a r0 = r0.f367360a
                com.google.android.apps.search.googleapp.discover.y.i r0 = r0.f367362b
                if (r0 == 0) goto L_0x006e
                com.google.android.apps.search.googleapp.discover.y.aa r3 = r7.mo112170b()
                com.google.android.apps.search.googleapp.discover.streamui.impl.m r4 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.this
                com.google.android.apps.search.googleapp.discover.streamui.viewmodel.DiscoverViewModel r4 = r4.f367289af
                if (r4 != 0) goto L_0x0048
                p5462h.p5473f.p5475b.C69664n.m101065k(r1)
                r4 = r2
            L_0x0048:
                com.google.android.apps.search.googleapp.discover.streamui.viewmodel.a r4 = r4.f367360a
                com.google.android.apps.search.googleapp.discover.y.aa r4 = r4.f367361a
                boolean r3 = p5462h.p5473f.p5475b.C69664n.m101066l(r3, r4)
                if (r3 == 0) goto L_0x006e
                com.google.common.f.e r3 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.f367250a
                com.google.common.f.x r3 = r3.mo56224b()
                com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
                com.google.common.f.n r4 = new com.google.common.f.n
                r5 = 40481(0x9e21, float:5.6726E-41)
                r4.<init>(r5)
                r3.mo56379ah(r4)
                java.lang.String r4 = "onNewData called after rotation when there was a background fetch error. Handling as a background fetch error to sync state to where we were before the rotation."
                r3.mo56386p(r4)
                r6.m218791g(r0)
                goto L_0x009c
            L_0x006e:
                com.google.android.apps.search.googleapp.discover.streamui.impl.m r0 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.this
                com.google.android.apps.search.googleapp.discover.streamui.viewmodel.DiscoverViewModel r0 = r0.f367289af
                if (r0 != 0) goto L_0x0078
                p5462h.p5473f.p5475b.C69664n.m101065k(r1)
                r0 = r2
            L_0x0078:
                com.google.android.apps.search.googleapp.discover.streamui.viewmodel.a r0 = r0.f367360a
                r0.f367362b = r2
                boolean r0 = r7 instanceof com.google.android.apps.search.googleapp.discover.p10248y.C135271v
                if (r0 == 0) goto L_0x0089
                com.google.android.apps.search.googleapp.discover.streamui.impl.m r0 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.this
                r0.mo112066w()
                r0 = 1
                r6.f367337b = r0
                goto L_0x0095
            L_0x0089:
                boolean r0 = r6.f367337b
                if (r0 == 0) goto L_0x0095
                com.google.android.apps.search.googleapp.discover.streamui.impl.m r0 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.this
                r0.mo112063t()
                r0 = 0
                r6.f367337b = r0
            L_0x0095:
                com.google.android.apps.search.googleapp.discover.streamui.impl.av r0 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134827au.m218662a(r7)
                r6.m218792h(r7, r0)
            L_0x009c:
                com.google.android.apps.search.googleapp.discover.streamui.impl.m r0 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.this
                com.google.android.apps.search.googleapp.discover.streamui.viewmodel.DiscoverViewModel r0 = r0.f367289af
                if (r0 != 0) goto L_0x00a6
                p5462h.p5473f.p5475b.C69664n.m101065k(r1)
                goto L_0x00a7
            L_0x00a6:
                r2 = r0
            L_0x00a7:
                com.google.android.apps.search.googleapp.discover.streamui.viewmodel.a r0 = r2.f367360a
                com.google.android.apps.search.googleapp.discover.y.aa r7 = r7.mo112170b()
                r0.f367361a = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.C134908c.mo18078b(java.lang.Object):void");
        }

        /* renamed from: c */
        public final void mo18079c() {
            C59052c cVar = (C59052c) C134904m.f367250a.mo56224b();
            cVar.mo56379ah(new C59094n(40482));
            cVar.mo56386p("StreamFragmentPeer#onPending");
            this.f367337b = true;
            C134904m.this.mo112066w();
            C134722b bVar = C134904m.this.f367325r;
            C134727g gVar = bVar.f366866b;
            C134766q qVar = bVar.f366865a;
            Object computeIfAbsent = ConcurrentMap.EL.computeIfAbsent(gVar.f366882a, qVar, new C134726f(qVar));
            C69664n.m101060f(computeIfAbsent, "surface: TngDiscoverSurf…erLaunchStatus(surface) }");
            C134725e eVar = (C134725e) computeIfAbsent;
            synchronized (eVar) {
                if (eVar.mo111917c()) {
                    bVar.f366867c.mo19974a(C37182a.f97751J);
                }
            }
        }

        /* renamed from: d */
        public final void mo50733d() {
            C59052c cVar = (C59052c) C134904m.f367250a.mo56224b();
            cVar.mo56379ah(new C59094n(40476));
            cVar.mo56386p("StreamFragmentPeer#onBackgroundFetch");
            C134904m.this.mo112066w();
        }

        /* renamed from: e */
        public final void mo50734e(Throwable th) {
            C69664n.m101061g(th, C42181t.f110467a);
            m218791g(th);
        }

        /* renamed from: f */
        public final void mo50735f() {
            C0653fo foVar;
            C59052c cVar = (C59052c) C134904m.f367250a.mo56224b();
            cVar.mo56379ah(new C59094n(40477));
            cVar.mo56386p("StreamFragmentPeer#onBackgroundFetchSucceeded");
            C134212aq aqVar = (C134212aq) C134904m.this.f367326s.mo27525b();
            synchronized (aqVar.f365586d) {
                C134206ak akVar = aqVar.f365587e;
                if (akVar != null) {
                    akVar.mo111625d();
                    if (aqVar.f365587e.mo111635n()) {
                        aqVar.mo111640a();
                    }
                }
            }
            C134904m.this.mo112063t();
            C134898g r = C134904m.this.mo112061r();
            if (r != null && r.f367235c && (foVar = r.f367234b.mLayout) != null) {
                ((DiscoverStaggeredGridLayoutManager) foVar).f12960k.mo8524d();
            }
        }
    }

    public C134904m(C134749h hVar, C40305b bVar, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, long j3, long j4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, C71422aw awVar, Executor executor, AccountId accountId, b bVar2, C60950i iVar, ContentDisposableManager contentDisposableManager, C134888t tVar, C134279k kVar, C91445b bVar3, C134722b bVar4, C68214a aVar, C134903l lVar, C134835b bVar5, C134462f fVar, C62921ba baVar, C134939a aVar2, FeedRenderingStateUpdater feedRenderingStateUpdater, C134074r rVar, FeedVisibilityDistributor feedVisibilityDistributor, FeedbackLauncher feedbackLauncher, C46439e eVar, C134715a aVar3, LauncherHorizontalScrollLocker launcherHorizontalScrollLocker, C134468f fVar2, C134199ad adVar, C134103a aVar4, C6474cf cfVar, C135086ff ffVar, C46778cv cvVar, C134901j jVar, C135200t tVar2, C139695b bVar6, C135250bk bkVar, C46801dp dpVar, C134766q qVar, C134778k kVar2, C133938d dVar, RecoverableErrorIntentHandler recoverableErrorIntentHandler, C134470a aVar5, C134467e eVar2, C134846bf bfVar, C134847bg bgVar, C133984g gVar, C134345p pVar, C134698d dVar2, C134779a aVar6, C74173nf nfVar, Optional optional, Optional optional2, C134480a aVar7, C47722m mVar, C134094c cVar, C41448g gVar2) {
        C135050dx dxVar;
        C40305b bVar7 = bVar;
        boolean z10 = z3;
        boolean z11 = z4;
        long j5 = j;
        boolean z12 = z7;
        boolean z13 = z8;
        C71422aw awVar2 = awVar;
        Executor executor2 = executor;
        AccountId accountId2 = accountId;
        C134888t tVar3 = tVar;
        C134279k kVar3 = kVar;
        C91445b bVar8 = bVar3;
        C134722b bVar9 = bVar4;
        C62921ba baVar2 = baVar;
        C134074r rVar2 = rVar;
        C69664n.m101061g(bVar7, "xUiKit");
        C69664n.m101061g(awVar2, "lightweightScope");
        C69664n.m101061g(executor2, "lightweightExecutor");
        C69664n.m101061g(accountId2, "accountId");
        C69664n.m101061g(iVar, "timeSource");
        C69664n.m101061g(contentDisposableManager, "contentDisposableManager");
        C69664n.m101061g(tVar3, "contentManager");
        C69664n.m101061g(kVar3, "discoverDebugDataProvider");
        C69664n.m101061g(bVar8, "discoverEnabledWriter");
        C69664n.m101061g(bVar9, "discoverInitialRenderTracker");
        C69664n.m101061g(aVar, "discoverStreamAppFlowLoggerLazy");
        C69664n.m101061g(bVar5, "eagerPaginationLoader");
        C69664n.m101061g(fVar, "signedOutErrorThrottlingManager");
        C69664n.m101061g(baVar2, "extensionRegistry");
        C69664n.m101061g(aVar2, "feedDebugParamsReader");
        C69664n.m101061g(feedRenderingStateUpdater, "feedRenderingStateUpdater");
        C69664n.m101061g(rVar, "feedSyncController");
        C69664n.m101061g(feedVisibilityDistributor, "feedVisibilityDistributor");
        C69664n.m101061g(feedbackLauncher, "feedbackLauncher");
        C69664n.m101061g(eVar, "futuresMixin");
        C69664n.m101061g(aVar3, "headerTouchListenable");
        C69664n.m101061g(launcherHorizontalScrollLocker, "launcherHorizontalScrollLocker");
        C69664n.m101061g(fVar2, "loggingSignalsDistributor");
        C69664n.m101061g(adVar, "nextPageAppFlowLogger");
        C69664n.m101061g(aVar4, "prerenderManager");
        C69664n.m101061g(cfVar, "recyclerBinder");
        C69664n.m101061g(ffVar, "requestConfigBuilder");
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(jVar, "scrollObservable");
        C69664n.m101061g(bVar6, "sourceReader");
        C69664n.m101061g(bkVar, "streamDataService");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(qVar, "tngDiscoverSurface");
        String str = "tngDiscoverSurface";
        C69664n.m101061g(aVar5, "discoverTooltipManager");
        C69664n.m101061g(eVar2, "viewLoggingScrollListener");
        C69664n.m101061g(bfVar, "recyclerBinderManager");
        C69664n.m101061g(bgVar, "snackbarManager");
        C69664n.m101061g(gVar, "viewActionsLogger");
        C69664n.m101061g(pVar, "bottomSheetManager");
        C69664n.m101061g(dVar2, "animateFeedLayoutManager");
        C69664n.m101061g(aVar6, "discoverInteractiveState");
        C69664n.m101061g(nfVar, "onNewDataLoggingRunnableFactory");
        C69664n.m101061g(optional, "attentionDebugViewOptional");
        C69664n.m101061g(optional2, "viewActionDebugViewOptional");
        C69664n.m101061g(mVar, "v7TraceCreation");
        C69664n.m101061g(gVar2, "videoInitializer");
        this.f367310c = hVar;
        this.f367303at = bVar7;
        this.f367311d = z;
        this.f367312e = z2;
        this.f367304au = z3;
        this.f367305av = z4;
        this.f367306aw = j;
        this.f367313f = j2;
        this.f367314g = j3;
        this.f367315h = j4;
        this.f367316i = z5;
        this.f367317j = z6;
        this.f367307ax = z7;
        this.f367308ay = z8;
        this.f367318k = z9;
        this.f367319l = awVar2;
        this.f367309az = executor2;
        this.f367320m = accountId2;
        this.f367321n = bVar2;
        this.f367322o = iVar;
        this.f367323p = tVar3;
        this.f367324q = kVar3;
        this.f367298ao = bVar8;
        this.f367325r = bVar9;
        this.f367326s = aVar;
        this.f367327t = lVar;
        this.f367328u = bVar5;
        this.f367329v = fVar;
        this.f367330w = baVar2;
        this.f367299ap = aVar2;
        this.f367331x = feedRenderingStateUpdater;
        this.f367332y = rVar;
        this.f367278aA = feedVisibilityDistributor;
        this.f367333z = feedbackLauncher;
        this.f367252A = eVar;
        this.f367253B = aVar3;
        this.f367254C = launcherHorizontalScrollLocker;
        this.f367255D = fVar2;
        this.f367256E = adVar;
        this.f367257F = aVar4;
        this.f367258G = cfVar;
        C135086ff ffVar2 = ffVar;
        this.f367259H = ffVar2;
        this.f367260I = cvVar;
        this.f367261J = jVar;
        this.f367262K = tVar2;
        this.f367263L = bVar6;
        this.f367264M = bkVar;
        this.f367279aB = dpVar;
        C134766q qVar2 = qVar;
        this.f367265N = qVar2;
        this.f367266O = kVar2;
        this.f367300aq = dVar;
        this.f367267P = recoverableErrorIntentHandler;
        this.f367268Q = aVar5;
        this.f367269R = eVar2;
        this.f367270S = bfVar;
        this.f367271T = bgVar;
        this.f367272U = gVar;
        this.f367273V = pVar;
        this.f367274W = dVar2;
        C134779a aVar8 = aVar6;
        this.f367280aC = aVar8;
        this.f367301ar = nfVar;
        this.f367275X = optional;
        this.f367276Y = optional2;
        this.f367277Z = aVar7;
        C41449h i = C41450i.m72445i();
        i.mo43958b(true);
        i.mo43959c((int) j);
        i.mo43964h(z4);
        i.mo43960d(z3);
        i.mo43961e(z7);
        i.mo43962f(z8);
        i.mo43963g(Optional.m71637of(cVar.mo111555a(qVar2)));
        gVar2.mo43980a(i.mo43957a());
        C134749h hVar2 = this.f367310c;
        int i2 = hVar2.f366908a & 256;
        if (i2 == 0 || hVar2.f366917j >= 0) {
            if (i2 == 0) {
                C134747g gVar3 = (C134747g) hVar2.toBuilder();
                gVar3.copyOnWrite();
                C134749h hVar3 = (C134749h) gVar3.instance;
                hVar3.f366908a |= 256;
                hVar3.f366917j = -1;
                C62942bv build = gVar3.build();
                C69664n.m101060f(build, "discoverStreamFragmentAr…erUtil.NO_HEADER).build()");
                this.f367310c = (C134749h) build;
            }
            C71571du duVar = aVar8.f366980b;
            this.f367285ab = new C47718i(mVar, new C134909n(this), "DiscoverStreamFragmentPeer: scroll");
            this.f367286ac = new C134845be();
            this.f367302as = new C134914s();
            this.f367281aD = new Rect();
            this.f367287ad = new C134911p();
            C57252bg bgVar2 = this.f367310c.f366914g;
            bgVar2 = bgVar2 == null ? C57252bg.f152831d : bgVar2;
            C69664n.m101060f(bgVar2, "discoverStreamFragmentArgs.feedEntryPointData");
            String str2 = this.f367310c.f366916i;
            C69664n.m101060f(str2, "discoverStreamFragmentArgs.ved");
            C69664n.m101061g(qVar2, str);
            C69664n.m101061g(bgVar2, "feedEntryPointData");
            C69664n.m101061g(str2, "ved");
            if ((qVar2 instanceof C134762m) || C69664n.m101066l(qVar2, C134763n.f366949a) || C69664n.m101066l(qVar2, C134761l.f366945a) || C69664n.m101066l(qVar2, C134760k.f366943a)) {
                C135090fj cnVar = (ffVar2.f367923h || C134992bx.m218910a()) ? new C135012cn(new C135065el(ffVar2, (C69577g) null)) : new C135016cr(new C135067en(ffVar2, (C69577g) null));
                C57259bn bnVar = C57259bn.MANUAL_REFRESH;
                C135063ej ejVar = C135063ej.f367828a;
                C135034dh dhVar = C135034dh.STANDARD;
                C37258g gVar4 = C37182a.f97814at;
                C69664n.m101060f(gVar4, "DISCOVER_INTERACTIVE_FEED_REQUEST_START");
                dxVar = new C135050dx(bnVar, bgVar2, str2, ejVar, dhVar, gVar4, cnVar, true);
            } else if (qVar2 instanceof C134757h) {
                C57315dp dpVar2 = ((C134757h) qVar2).f366939a;
                C69664n.m101061g(dpVar2, "token");
                C69664n.m101061g(bgVar2, "feedEntryPointData");
                C69664n.m101061g(str2, "ved");
                C135012cn cnVar2 = new C135012cn(new C135059ef(ffVar2, (C69577g) null));
                C57259bn bnVar2 = C57259bn.INTERACTIVE_CHANNEL;
                C135057ed edVar = new C135057ed(dpVar2);
                C135034dh dhVar2 = C135034dh.STANDARD;
                C37258g gVar5 = C37182a.f97837bP;
                C69664n.m101060f(gVar5, "DISCOVER_CHANNELS_FEED_REQUEST_START");
                dxVar = new C135050dx(bnVar2, bgVar2, str2, edVar, dhVar2, gVar5, cnVar2, !ffVar2.f367925j);
            } else if (qVar2 instanceof C134759j) {
                C57315dp dpVar3 = ((C134759j) qVar2).f366941a;
                C69664n.m101061g(dpVar3, "token");
                C69664n.m101061g(bgVar2, "feedEntryPointData");
                C135062ei eiVar = new C135062ei(dpVar3);
                C135016cr crVar = new C135016cr(new C135061eh(ffVar2, (C69577g) null));
                C57259bn bnVar3 = C57259bn.NEWS_FULL_COVERAGE;
                C135034dh dhVar3 = C135034dh.STANDARD;
                C37258g gVar6 = C37182a.f97838bQ;
                C69664n.m101060f(gVar6, "DISCOVER_FULL_COVERAGE_FEED_REQUEST_START");
                dxVar = new C135050dx(bnVar3, bgVar2, BuildConfig.FLAVOR, eiVar, dhVar3, gVar6, crVar, true);
            } else if (qVar2 instanceof C134765p) {
                C57315dp dpVar4 = ((C134765p) qVar2).f366951a;
                C69664n.m101061g(dpVar4, "token");
                C69664n.m101061g(bgVar2, "feedEntryPointData");
                C69664n.m101061g(str2, "ved");
                C135090fj cnVar3 = (ffVar2.f367924i || C134992bx.m218910a()) ? new C135012cn(new C135075ev(ffVar2, (C69577g) null)) : new C135016cr(new C135077ex(ffVar2, (C69577g) null));
                C57259bn bnVar4 = C57259bn.INTERACTIVE_CHANNEL;
                C135073et etVar = new C135073et(dpVar4);
                C135034dh dhVar4 = C135034dh.STANDARD;
                C37258g gVar7 = C37182a.f98124gl;
                C69664n.m101060f(gVar7, "DISCOVER_MORE_STORIES_FEED_REQUEST_START");
                dxVar = new C135050dx(bnVar4, bgVar2, str2, etVar, dhVar4, gVar7, cnVar3, true);
            } else if (qVar2 instanceof C134764o) {
                C134764o oVar = (C134764o) qVar2;
                throw null;
            } else {
                throw new C69677g();
            }
            this.f367288ae = dxVar;
            this.f367283aF = -1;
            this.f367295al = new C134906a();
            this.f367296am = new C134907b();
            this.f367297an = new C134908c();
            return;
        }
        throw new IllegalArgumentException("Initial header height cannot be negative");
    }

    /* renamed from: a */
    public final C134286f mo111669a() {
        Iterable iterable;
        String str;
        List<C134874f> list;
        List c;
        Iterable y;
        C134284d dVar = new C134284d();
        C135244be beVar = this.f367282aE;
        if (beVar == null) {
            List list2 = dVar.f365788a;
            C134296p pVar = C134296p.NOT_SENSITIVE_OR_PII;
            C69664n.m101061g(pVar, "sensitivity");
            ArrayList arrayList = new ArrayList();
            C134297q.m217880d("Last request", "null", pVar, arrayList);
            C69540x.m100811r(list2, arrayList);
        } else {
            C134286f a = beVar.mo111669a();
            C69664n.m101060f(a, "it.debuggableFeature");
            C134268c.m217847b(a, dVar);
        }
        List list3 = dVar.f365788a;
        C134296p pVar2 = C134296p.NOT_SENSITIVE_OR_PII;
        C69664n.m101061g(pVar2, "sensitivity");
        ArrayList arrayList2 = new ArrayList();
        C58528ij a2 = this.f367303at.mo32551j().mo42168a();
        C69664n.m101060f(a2, "xUiKit.emlParcelProcessor().loadedTemplateIds");
        C134297q.m217880d("Loaded templates", C69540x.m100851ag(C69540x.m100836R(a2), ", ", (CharSequence) null, (CharSequence) null, (C69626l) null, 62), pVar2, arrayList2);
        C69540x.m100811r(list3, arrayList2);
        C134268c.m217847b(this.f367323p.mo111669a(), dVar);
        C134898g r = mo112061r();
        if (r == null) {
            iterable = C69496am.f185918a;
        } else {
            C135216ad adVar = this.f367323p.f367201j;
            if (adVar == null || (c = adVar.mo112171c()) == null || (y = C69540x.m100855y(c)) == null) {
                list = C69496am.f185918a;
            } else {
                ArrayList<C69499ap> arrayList3 = new ArrayList<>();
                for (Object next : y) {
                    if (((C69499ap) next).f185922b instanceof C135254e) {
                        arrayList3.add(next);
                    }
                }
                list = new ArrayList<>(C69540x.m100804k(arrayList3, 10));
                for (C69499ap apVar : arrayList3) {
                    String str2 = ((C135254e) apVar.f185922b).f368466a.f366399e;
                    C69664n.m101060f(str2, "it.value.content.contentId");
                    list.add(new C134874f(str2, apVar.f185921a));
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (C134874f fVar : list) {
                String str3 = fVar.f367177a;
                View a3 = r.mo112049a(fVar.f367178b);
                C134910o oVar = a3 instanceof LithoView ? new C134910o((LithoView) a3, str3) : null;
                if (oVar != null) {
                    arrayList4.add(oVar);
                }
            }
            iterable = arrayList4;
        }
        List list4 = dVar.f365788a;
        ArrayList arrayList5 = new ArrayList(C69540x.m100804k(iterable, 10));
        for (Object next2 : iterable) {
            C134284d dVar2 = new C134284d();
            C134910o oVar2 = (C134910o) next2;
            List list5 = dVar2.f365788a;
            C134296p pVar3 = C134296p.NOT_SENSITIVE_OR_PII;
            C69664n.m101061g(pVar3, "sensitivity");
            ArrayList arrayList6 = new ArrayList();
            C134297q.m217880d("Content ID", oVar2.f367340b, pVar3, arrayList6);
            LithoView lithoView = oVar2.f367339a;
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                str = "Failed to collect debug info: walkViewTreeForDebugInfo() called on non-UI thread.";
            } else {
                try {
                    C6403m mVar = new C6403m();
                    mVar.mo13415c("Elements Debug Info Dump Start");
                    LithoView.m15699E(lithoView, mVar);
                    mVar.mo13415c("Elements Debug Info Dump End");
                    mVar.f18976b.flush();
                    str = mVar.f18975a.toString("UTF-8");
                } catch (IOException e) {
                    str = "Failed to collect debug info: ".concat(e.toString());
                }
            }
            C69664n.m101060f(str, "it.view.debugInfo");
            C134297q.m217880d("Debug info", str, pVar3, arrayList6);
            C69540x.m100811r(list5, arrayList6);
            arrayList5.add(dVar2.mo111674a());
        }
        list4.add(new C134291k("Litho views", arrayList5));
        return C134268c.m217846a("DiscoverStreamFragmentPeer", dVar);
    }

    /* renamed from: b */
    public final Instant mo111948b() {
        Instant instant = this.f367284aa;
        if (instant != null) {
            return instant;
        }
        C69664n.m101065k("fragmentCreationTime");
        return null;
    }

    /* renamed from: c */
    public final void mo111949c(C134748a aVar) {
        C69664n.m101061g(aVar, "onScrollListener");
        this.f367261J.mo112056a(aVar);
    }

    /* renamed from: d */
    public final void mo111950d() {
        this.f367333z.mo111667g((C57097l) null);
    }

    /* renamed from: e */
    public final void mo111951e(C57097l lVar) {
        C69664n.m101061g(lVar, "feedbackData");
        this.f367333z.mo111667g(lVar);
    }

    /* renamed from: f */
    public final void mo111952f(boolean z) {
        C134898g r = mo112061r();
        if (r != null) {
            r.f367234b.suppressLayout(z);
        }
    }

    /* renamed from: g */
    public final void mo111953g(boolean z) {
        C69731k d;
        C134898g r = mo112061r();
        if (r != null && (d = r.mo112052d()) != null) {
            Iterator a = d.mo5191a();
            while (a.hasNext()) {
                LithoView lithoView = (LithoView) a.next();
                if (lithoView.getLocalVisibleRect(this.f367281aD)) {
                    lithoView.mo12593v(this.f367281aD, z);
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo111954h() {
        C69731k d;
        mo111956j(C134720e.UNKNOWN);
        this.f367278aA.mo111496g();
        C134898g r = mo112061r();
        if (!(r == null || (d = r.mo112052d()) == null)) {
            Iterator a = d.mo5191a();
            while (a.hasNext()) {
                ((LithoView) a.next()).mo12735I(false);
            }
        }
        this.f367268Q.mo111793c();
        C46459k.m82829b(C71663i.m104692e(this.f367319l, (C71424ay) null, new C134919x(this.f367332y, (C69577g) null), 3), "Failed to enqueue the app close refresh worker.", new Object[0]);
    }

    /* renamed from: i */
    public final void mo111955i() {
        C134221j jVar;
        C69731k d;
        C134898g r = mo112061r();
        if (!(r == null || (d = r.mo112052d()) == null)) {
            Iterator a = d.mo5191a();
            while (a.hasNext()) {
                ((LithoView) a.next()).mo12735I(true);
            }
        }
        this.f367278aA.mo111497h();
        C134722b bVar = this.f367325r;
        C134727g gVar = bVar.f366866b;
        C134766q qVar = bVar.f366865a;
        Object computeIfAbsent = ConcurrentMap.EL.computeIfAbsent(gVar.f366882a, qVar, new C134726f(qVar));
        C69664n.m101060f(computeIfAbsent, "surface: TngDiscoverSurf…erLaunchStatus(surface) }");
        C134725e eVar = (C134725e) computeIfAbsent;
        synchronized (eVar) {
            C134736p pVar = eVar.f366878d;
            if (eVar.mo111917c()) {
                eVar.mo111916b(true);
                if (eVar.f366875a instanceof C134763n) {
                    bVar.f366867c.mo19974a(C37182a.f97940dM);
                    C134743w wVar = bVar.f366868d;
                    if (wVar != null) {
                        wVar.mo111946i();
                    }
                    if (pVar instanceof C134734n) {
                        jVar = ((C134734n) pVar).f366888a;
                    } else if ((eVar.f366879e instanceof C134737q) && (eVar.f366880f instanceof C134730j)) {
                        bVar.mo111911g(eVar);
                    }
                }
            } else if (pVar instanceof C134734n) {
                jVar = ((C134734n) pVar).f366888a;
            }
            bVar.mo111907c(eVar, jVar);
        }
        this.f367268Q.mo111796f();
    }

    /* renamed from: j */
    public final void mo111956j(C134720e eVar) {
        C69664n.m101061g(eVar, "hideReason");
        this.f367325r.mo111908d(eVar);
    }

    /* renamed from: k */
    public final void mo111957k() {
        mo112064u(C135243bd.m219380b((int) this.f367313f, mo111948b(), this.f367288ae));
        this.f367291ah = true;
    }

    /* renamed from: l */
    public final void mo111958l(View.OnTouchListener onTouchListener) {
        this.f367253B.f366835a = onTouchListener;
    }

    /* renamed from: m */
    public final void mo111959m(int i) {
        this.f367283aF = i;
        mo112068y();
    }

    /* renamed from: n */
    public final boolean mo111960n() {
        boolean z = false;
        if (this.f367265N.mo111990b()) {
            LauncherHorizontalScrollLocker launcherHorizontalScrollLocker = this.f367254C;
            launcherHorizontalScrollLocker.f366563d.isEmpty();
            if (!launcherHorizontalScrollLocker.f366563d.isEmpty()) {
                z = true;
            }
        }
        Thread.currentThread().getName();
        return z;
    }

    /* renamed from: o */
    public final View mo112058o() {
        View view = this.f367327t.getView();
        if (view != null) {
            return view.findViewById(R.id.googleapp_discover_bottom_fragment_overlay_container);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0040  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo112059p() {
        /*
            r5 = this;
            com.google.android.apps.search.googleapp.discover.streamui.impl.g r0 = r5.mo112061r()
            r1 = 0
            if (r0 == 0) goto L_0x0049
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.t r2 = r5.f367323p
            com.google.android.apps.search.googleapp.discover.y.ad r2 = r2.f367201j
            if (r2 == 0) goto L_0x003d
            java.util.List r2 = r2.mo112171c()
            if (r2 == 0) goto L_0x003d
            java.lang.Iterable r2 = p5462h.p5463a.C69540x.m100855y(r2)
            if (r2 == 0) goto L_0x003d
            java.util.Iterator r2 = r2.iterator()
        L_0x001d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0031
            java.lang.Object r3 = r2.next()
            r4 = r3
            h.a.ap r4 = (p5462h.p5463a.C69499ap) r4
            java.lang.Object r4 = r4.f185922b
            boolean r4 = r4 instanceof com.google.android.apps.search.googleapp.discover.p10248y.C135261l
            if (r4 == 0) goto L_0x001d
            goto L_0x0032
        L_0x0031:
            r3 = r1
        L_0x0032:
            h.a.ap r3 = (p5462h.p5463a.C69499ap) r3
            if (r3 == 0) goto L_0x003d
            int r2 = r3.f185921a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x003e
        L_0x003d:
            r2 = r1
        L_0x003e:
            if (r2 == 0) goto L_0x0049
            int r1 = r2.intValue()
            android.view.View r0 = r0.mo112049a(r1)
            return r0
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.mo112059p():android.view.View");
    }

    /* renamed from: q */
    public final DiscoverRecyclerView mo112060q() {
        View view = this.f367327t.getView();
        if (view != null) {
            return (DiscoverRecyclerView) view.findViewById(R.id.googleapp_discover_recycler_view);
        }
        return null;
    }

    /* renamed from: r */
    public final C134898g mo112061r() {
        DiscoverRecyclerView q = mo112060q();
        if (q != null) {
            return q.mo17754z();
        }
        return null;
    }

    /* renamed from: s */
    public final SwipeRefreshView mo112062s() {
        View view = this.f367327t.getView();
        if (view != null) {
            return (SwipeRefreshView) view.findViewById(R.id.googleapp_discover_swipe_refresh_layout);
        }
        return null;
    }

    /* renamed from: t */
    public final void mo112063t() {
        SwipeRefreshView s = mo112062s();
        if (s != null) {
            s.mo8794l(false, false);
        }
    }

    /* renamed from: u */
    public final void mo112064u(C135244be beVar) {
        C135244be beVar2 = beVar;
        if (this.f367291ah) {
            C59052c cVar = (C59052c) f367250a.mo56224b();
            cVar.mo56379ah(new C59094n(40494));
            cVar.mo56386p("makeRequest: awaiting scroll to top");
        } else if (!C69664n.m101066l(beVar2, this.f367282aE)) {
            this.f367282aE = beVar2;
            C59052c cVar2 = (C59052c) f367250a.mo56224b();
            cVar2.mo56379ah(new C59094n(40492));
            cVar2.mo56386p("makeRequest: subscribing to new source");
            C135250bk bkVar = this.f367264M;
            int i = this.f367310c.f366917j;
            C134766q qVar = this.f367265N;
            C134766q qVar2 = qVar;
            C40305b bVar = this.f367303at;
            C40305b bVar2 = bVar;
            C69664n.m101061g(qVar, "tngDiscoverSurface");
            C69664n.m101061g(bVar, "xUiKit");
            C135242bc bcVar = bkVar.f368448b;
            Boolean bool = (Boolean) bcVar.f368418a.mo17428b();
            bool.getClass();
            boolean booleanValue = bool.booleanValue();
            C21370a aVar = (C21370a) bcVar.f368419b.mo17428b();
            C21370a aVar2 = aVar;
            aVar.getClass();
            C135222aj ajVar = (C135222aj) bcVar.f368420c.mo17428b();
            C135222aj ajVar2 = ajVar;
            ajVar.getClass();
            C135314au auVar = (C135314au) bcVar.f368421d.mo17428b();
            C135314au auVar2 = auVar;
            auVar.getClass();
            C134212aq aqVar = (C134212aq) bcVar.f368422e.mo17428b();
            C134212aq aqVar2 = aqVar;
            aqVar.getClass();
            C46778cv cvVar = (C46778cv) bcVar.f368423f.mo17428b();
            C46778cv cvVar2 = cvVar;
            cvVar.getClass();
            C71422aw awVar = (C71422aw) bcVar.f368424g.mo17428b();
            C71422aw awVar2 = awVar;
            awVar.getClass();
            ((C69585o) bcVar.f368425h.mo17428b()).getClass();
            C134223l lVar = (C134223l) bcVar.f368426i.mo17428b();
            C134223l lVar2 = lVar;
            lVar.getClass();
            C134429a aVar3 = (C134429a) bcVar.f368427j.mo17428b();
            C134429a aVar4 = aVar3;
            aVar3.getClass();
            C134462f fVar = (C134462f) bcVar.f368428k.mo17428b();
            C135241bb bbVar = r1;
            C134462f fVar2 = fVar;
            fVar.getClass();
            C40305b bVar3 = bVar;
            C134475d dVar = (C134475d) bcVar.f368429l.mo17428b();
            C135242bc bcVar2 = bcVar;
            C134475d dVar2 = dVar;
            dVar.getClass();
            C135086ff ffVar = (C135086ff) bcVar2.f368430m.mo17428b();
            C135086ff ffVar2 = ffVar;
            ffVar.getClass();
            C134766q qVar3 = qVar;
            C135253d dVar3 = (C135253d) bcVar2.f368431n.mo17428b();
            C135253d dVar4 = dVar3;
            dVar3.getClass();
            C134534b bVar4 = (C134534b) bcVar2.f368432o.mo17428b();
            bVar4.getClass();
            qVar3.getClass();
            bVar3.getClass();
            C135241bb bbVar2 = new C135241bb(booleanValue, aVar2, ajVar2, auVar2, aqVar2, cvVar2, awVar2, lVar2, aVar4, fVar2, dVar2, ffVar2, dVar4, bVar4, i, beVar, qVar2, bVar2);
            C135241bb bbVar3 = bbVar;
            this.f367292ai = bbVar3;
            this.f367279aB.mo50709c(bbVar3, this.f367297an);
        }
    }

    /* renamed from: v */
    public final void mo112065v(C135359p pVar, UUID uuid) {
        if (this.f367327t.isStateSaved()) {
            C59052c cVar = (C59052c) f367250a.mo56226d();
            cVar.mo56379ah(new C59094n(40512));
            cVar.mo56386p("requestToken: called when fragment has already saved state.");
            return;
        }
        this.f367287ad.f367341a = 0;
        this.f367252A.mo50445g(C135209c.m219303b(C47633f.m84733g(C71663i.m104692e(this.f367319l, (C71424ay) null, new C134921z(this, pVar, uuid, (C69577g) null), 3)).mo51516i(C134807aa.f367050a, this.f367309az)), new C46436b(uuid.toString()), this.f367295al);
    }

    /* renamed from: w */
    public final void mo112066w() {
        SwipeRefreshView s = mo112062s();
        if (s != null) {
            s.mo8794l(true, false);
        }
    }

    /* renamed from: x */
    public final void mo112067x(C134228q qVar) {
        C59052c cVar = (C59052c) f367250a.mo56224b();
        String name = qVar.name();
        cVar.mo56379ah(new C59094n(40513));
        cVar.mo56389s("triggerRefresh(%s)", name);
        C134212aq aqVar = (C134212aq) this.f367326s.mo27525b();
        synchronized (aqVar.f365586d) {
            qVar.name();
            C134206ak akVar = aqVar.f365587e;
            if (akVar == null || (akVar instanceof C134211ap)) {
                if (akVar instanceof C134211ap) {
                    ((C59052c) ((C59052c) C134212aq.f365583a.mo56226d()).mo56372aa(40285)).mo56386p("onInteractiveRefresh - started before previous finished");
                }
                aqVar.mo111644e(new C134211ap(aqVar, qVar));
            } else {
                aqVar.mo111641b();
            }
        }
        C134199ad adVar = this.f367256E;
        C57528m a = C57528m.m88369a(this.f367310c.f366909b);
        if (a == null) {
            a = C57528m.UNKNOWN_SURFACE;
        }
        synchronized (adVar.f365549b) {
            ArrayList arrayList = new ArrayList();
            for (C134198ac acVar : adVar.f365550c.values()) {
                if (acVar.f365544b == a) {
                    C37252a c = C37182a.f98247q.mo40779c();
                    adVar.mo111611e(c);
                    acVar.mo111606b(c);
                    C37252a c2 = C37182a.f98086g.mo40805c(C62722b.CANCELLED);
                    adVar.mo111611e(c2);
                    acVar.mo111605a(c2);
                    adVar.mo111610d(acVar);
                    arrayList.add(acVar.f365545c);
                }
            }
            adVar.f365550c.keySet().removeAll(arrayList);
        }
        this.f367255D.mo111499j();
        this.f367260I.mo50788b(C71663i.m104692e(this.f367319l, (C71424ay) null, new C134810ad(this, (C69577g) null), 3), C135255f.m219392a(this.f367265N));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r1 = r0.getLayoutParams();
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112068y() {
        /*
            r4 = this;
            int r0 = r4.f367283aF
            r1 = -1
            if (r0 != r1) goto L_0x0006
            return
        L_0x0006:
            android.view.View r0 = r4.mo112059p()
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r2 = r1.height
            int r3 = r4.f367283aF
            if (r2 != r3) goto L_0x0018
            return
        L_0x0018:
            r1.height = r3
            r0.setLayoutParams(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.mo112068y():void");
    }

    /* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.m$b */
    /* compiled from: PG */
    final class C134907b implements C46440f {
        public C134907b() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59052c cVar = (C59052c) ((C59052c) C134904m.f367250a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(40472));
            cVar.mo56386p("Failed to handle pinned content token.");
            m218787d(false);
            C134847bg bgVar = C134904m.this.f367271T;
            View view = bgVar.f367108a.getView();
            if (view != null) {
                Snackbar snackbar = bgVar.f367109b;
                if (snackbar != null) {
                    snackbar.mo48340e(3);
                    snackbar.mo48351r().f117107a.setText(snackbar.f117088i.getText(R.string.disco_notification_fulfillment_error));
                } else {
                    snackbar = Snackbar.m79660p(view, R.string.disco_notification_fulfillment_error, 5000);
                }
                snackbar.mo48343h();
                bgVar.f367109b = snackbar;
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C59052c cVar = (C59052c) C134904m.f367250a.mo56224b();
            cVar.mo56379ah(new C59094n(40473));
            cVar.mo56386p("Successfully handled pinned content token.");
            C134904m mVar = C134904m.this;
            if (mVar.f367310c.f366917j != -1) {
                C134845be beVar = mVar.f367286ac;
                C134867aa aaVar = C134845be.f367101a;
                int i = aaVar.f367155b;
                int i2 = aaVar.f367156c;
                boolean z = beVar.f367103c;
                beVar.f367104d = new C134842bb(i, i2);
            }
            m218787d(true);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }

        /* renamed from: d */
        private final void m218787d(boolean z) {
            C134904m mVar = C134904m.this;
            C135241bb bbVar = mVar.f367292ai;
            if (bbVar != null) {
                bbVar.f368413p = false;
                if (z) {
                    C136123d dVar = mVar.f367310c.f366910c;
                    if (dVar == null) {
                        dVar = C136123d.f370743d;
                    }
                    C136131l lVar = dVar.f370747c;
                    if (lVar == null) {
                        lVar = C136131l.f370752d;
                    }
                    if ((lVar.f370754a & 1) != 0) {
                        C134904m mVar2 = C134904m.this;
                        FragmentManager childFragmentManager = mVar2.f367327t.getChildFragmentManager();
                        C69664n.m101060f(childFragmentManager, "discoverStreamFragment.childFragmentManager");
                        C0154a aVar = new C0154a(childFragmentManager);
                        AccountId accountId = mVar2.f367320m;
                        C136123d dVar2 = mVar2.f367310c.f366910c;
                        if (dVar2 == null) {
                            dVar2 = C136123d.f370743d;
                        }
                        C136131l lVar2 = dVar2.f370747c;
                        if (lVar2 == null) {
                            lVar2 = C136131l.f370752d;
                        }
                        C136813d dVar3 = new C136813d();
                        C68324h.m98669f(dVar3);
                        C47247a.m84047b(dVar3, accountId);
                        C47243l.m84039a(dVar3, lVar2);
                        aVar.mo689v(R.id.googleapp_discover_bottom_fragment_overlay_container, dVar3, "notificationSurvey");
                        aVar.mo509f();
                        View o = mVar2.mo112058o();
                        if (o != null) {
                            o.setVisibility(0);
                        }
                    }
                }
            } else {
                C59052c cVar = (C59052c) C134904m.f367250a.mo56225c();
                cVar.mo56379ah(new C59094n(40471));
                cVar.mo56386p("RenderableStreamDataSource is null in pinned content callback.");
                C134904m mVar3 = C134904m.this;
                mVar3.mo112064u(C135243bd.m219380b((int) mVar3.f367313f, mVar3.mo111948b(), C134904m.this.f367288ae));
            }
            C134212aq aqVar = (C134212aq) C134904m.this.f367326s.mo27525b();
            synchronized (aqVar.f365586d) {
                C134206ak akVar = aqVar.f365587e;
                if (akVar != null) {
                    akVar.mo111630i(z);
                }
            }
            C134904m.this.f367260I.mo50787a(C60866ct.f164955a, C135255f.f368471a);
        }
    }
}
