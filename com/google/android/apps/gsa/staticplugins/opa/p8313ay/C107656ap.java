package com.google.android.apps.gsa.staticplugins.opa.p8313ay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.C1878d;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.LiveData;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.assistant.shared.p.f;
import com.google.android.apps.gsa.assistant.shared.p.h;
import com.google.android.apps.gsa.assistant.shared.p.k;
import com.google.android.apps.gsa.assistant.shared.p5826p.C73898d;
import com.google.android.apps.gsa.assistant.shared.p5827q.C73904j;
import com.google.android.apps.gsa.assistant.shared.q.a;
import com.google.android.apps.gsa.assistant.shared.q.m;
import com.google.android.apps.gsa.binaries.satin.app.atu;
import com.google.android.apps.gsa.nga.api.C74714bo;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6370a.C81517a;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6405b.C82193a;
import com.google.android.apps.gsa.opa.C83578ai;
import com.google.android.apps.gsa.opa.C83579aj;
import com.google.android.apps.gsa.opa.C83607e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87564g;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.p6941ui.C88523c;
import com.google.android.apps.gsa.search.shared.service.C87681ai;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87984kw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87985kx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87986ky;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88111po;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88112pp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88115ps;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.C88649e;
import com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.C88687j;
import com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.querybuilderv2.C88667a;
import com.google.android.apps.gsa.searchbox.p6960ui.C88691a;
import com.google.android.apps.gsa.searchbox.p6960ui.C88701b;
import com.google.android.apps.gsa.searchbox.p6960ui.C88705f;
import com.google.android.apps.gsa.searchbox.p6960ui.C88707h;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.C88714o;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88692a;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88695d;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88760ae;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88787u;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88829m;
import com.google.android.apps.gsa.searchbox.shared.C88688a;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7064i.C89922b;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89202g;
import com.google.android.apps.gsa.shared.p7066m.C89997bc;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.p7066m.C90060dl;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7148ui.SuggestionGridLayout;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.C90735as;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.C108790dx;
import com.google.android.apps.gsa.staticplugins.opa.C108797ea;
import com.google.android.apps.gsa.staticplugins.opa.C109026ey;
import com.google.android.apps.gsa.staticplugins.opa.C109040fj;
import com.google.android.apps.gsa.staticplugins.opa.C109711mp;
import com.google.android.apps.gsa.staticplugins.opa.C109712mq;
import com.google.android.apps.gsa.staticplugins.opa.audio.C107619d;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108228az;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108237bh;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108321ej;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108434io;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108435ip;
import com.google.android.apps.gsa.staticplugins.opa.chatui.ComboBoxBackgroundColorSpan;
import com.google.android.apps.gsa.staticplugins.opa.p8183ag.C106158g;
import com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106171l;
import com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107378b;
import com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107379c;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107759j;
import com.google.android.apps.gsa.staticplugins.opa.p8344bk.C108093b;
import com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.p8370a.C109212a;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.C113720h;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.C113721i;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.OpaEditText;
import com.google.android.apps.gsa.staticplugins.opa.p8595v.C113916t;
import com.google.android.apps.gsa.staticplugins.opa.p8621x.C114524l;
import com.google.android.apps.gsa.staticplugins.opa.searchbox.C110427b;
import com.google.android.apps.gsa.staticplugins.opa.searchbox.C110428c;
import com.google.android.apps.gsa.staticplugins.opa.searchbox.C110429d;
import com.google.android.apps.gsa.staticplugins.opa.searchbox.C110430e;
import com.google.android.apps.gsa.staticplugins.opa.searchbox.C110431f;
import com.google.android.apps.gsa.staticplugins.opa.searchbox.C110432g;
import com.google.android.apps.gsa.staticplugins.opa.searchbox.C110433h;
import com.google.android.apps.gsa.staticplugins.opa.searchbox.C110434i;
import com.google.android.apps.gsa.staticplugins.opa.searchbox.C110437l;
import com.google.android.apps.gsa.staticplugins.opa.searchbox.C110438m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8525e.p8529c.C111772f;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8544h.C112070f;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8544h.C112071g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8545i.C112076a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8545i.C112077b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8545i.C112078c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113191cv;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113197da;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113583z;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113388b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113389c;
import com.google.android.apps.gsa.staticplugins.opa.util.C113788bd;
import com.google.android.apps.gsa.staticplugins.opa.util.C113791bg;
import com.google.android.apps.gsa.staticplugins.opa.util.C113793bi;
import com.google.android.apps.gsa.staticplugins.opa.util.C113854ci;
import com.google.android.apps.gsa.staticplugins.opa.util.C113855cj;
import com.google.android.apps.gsa.staticplugins.opa.util.C113858cm;
import com.google.android.apps.gsa.staticplugins.opa.util.C113884o;
import com.google.android.apps.gsa.staticplugins.opa.util.C113889t;
import com.google.android.apps.gsa.staticplugins.opa.util.C113890u;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113982a;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11300h;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.lens.view.p2162s.C27683a;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.performance.primes.metrics.p2414h.C31499r;
import com.google.android.libraries.searchbox.p3203ui.p3204a.C41703c;
import com.google.android.libraries.searchbox.shared.p3200a.C41641b;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.assistant.p3745ab.C48247bd;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.assistant.p3897e.p3912f.C51211f;
import com.google.assistant.p3897e.p3917i.p3918a.C51305cu;
import com.google.assistant.p3897e.p3921j.alf;
import com.google.assistant.p3897e.p3921j.p3922a.C51655m;
import com.google.assistant.p3897e.p3921j.p3922a.C51656n;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58879cp;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60456qs;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.aod;
import com.google.common.p4552o.p4553a.C59450aa;
import com.google.common.p4552o.p4553a.C59529cz;
import com.google.common.p4552o.p4553a.C59568x;
import com.google.common.p4552o.p4553a.C59569y;
import com.google.protobuf.C62940bt;
import com.google.protobuf.contrib.android.ProtoParsers;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.OptionalInt;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ay.ap */
/* compiled from: PG */
public final class C107656ap implements C107659as {

    /* renamed from: a */
    public static final C59071e f299490a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ay.ap");

    /* renamed from: b */
    public static String[] f299491b = new String[0];

    /* renamed from: A */
    public FrameLayout f299492A;

    /* renamed from: B */
    public View f299493B;

    /* renamed from: C */
    public Query f299494C;

    /* renamed from: D */
    SuggestionGridLayout f299495D;

    /* renamed from: E */
    public boolean f299496E;

    /* renamed from: F */
    public boolean f299497F;

    /* renamed from: G */
    C41703c f299498G;

    /* renamed from: H */
    public boolean f299499H;

    /* renamed from: I */
    boolean f299500I = true;

    /* renamed from: J */
    final C83578ai f299501J;

    /* renamed from: K */
    public final boolean f299502K;

    /* renamed from: L */
    public final boolean f299503L;

    /* renamed from: M */
    public final C2332ag f299504M;

    /* renamed from: N */
    public final C114524l f299505N;

    /* renamed from: O */
    public final C68214a f299506O;

    /* renamed from: P */
    boolean f299507P = false;

    /* renamed from: Q */
    public String f299508Q;

    /* renamed from: R */
    public C48247bd f299509R;

    /* renamed from: S */
    h f299510S;

    /* renamed from: T */
    public final C68214a f299511T;

    /* renamed from: U */
    public ImageView f299512U;

    /* renamed from: V */
    public Bundle f299513V;

    /* renamed from: W */
    public boolean f299514W;

    /* renamed from: X */
    public final C68214a f299515X;

    /* renamed from: Y */
    com.google.android.apps.gsa.assistant.shared.q.h f299516Y;

    /* renamed from: Z */
    public C51656n f299517Z;

    /* renamed from: aA */
    private final View f299518aA;

    /* renamed from: aB */
    private C113721i f299519aB;

    /* renamed from: aC */
    private FrameLayout f299520aC;

    /* renamed from: aD */
    private FrameLayout f299521aD;

    /* renamed from: aE */
    private C110434i f299522aE;

    /* renamed from: aF */
    private final C21370a f299523aF;

    /* renamed from: aG */
    private final C2332ag f299524aG = new C2332ag(0);

    /* renamed from: aH */
    private final boolean f299525aH;

    /* renamed from: aI */
    private ViewGroup f299526aI;

    /* renamed from: aJ */
    private FrameLayout f299527aJ;

    /* renamed from: aK */
    private LinearLayout f299528aK;

    /* renamed from: aL */
    private boolean f299529aL;

    /* renamed from: aM */
    private final boolean f299530aM;

    /* renamed from: aN */
    private final boolean f299531aN;

    /* renamed from: aO */
    private final boolean f299532aO;

    /* renamed from: aP */
    private final boolean f299533aP;

    /* renamed from: aQ */
    private final boolean f299534aQ;

    /* renamed from: aR */
    private final boolean f299535aR;

    /* renamed from: aS */
    private int f299536aS = 0;

    /* renamed from: aT */
    private boolean f299537aT = false;

    /* renamed from: aU */
    private final C108093b f299538aU;

    /* renamed from: aV */
    private C108237bh f299539aV;

    /* renamed from: aW */
    private final C68214a f299540aW;

    /* renamed from: aX */
    private final C2332ag f299541aX = new C2332ag(C83607e.UNDEFINED);

    /* renamed from: aY */
    private final ImageView f299542aY;

    /* renamed from: aZ */
    private ImageView f299543aZ;

    /* renamed from: aa */
    public C90735as f299544aa;

    /* renamed from: ab */
    public C88523c f299545ab;

    /* renamed from: ac */
    private final boolean f299546ac;

    /* renamed from: ad */
    private final C107710u f299547ad;

    /* renamed from: ae */
    private final C87681ai f299548ae;

    /* renamed from: af */
    private final C90931ca f299549af;

    /* renamed from: ag */
    private final C22871g f299550ag;

    /* renamed from: ah */
    private final C68214a f299551ah;

    /* renamed from: ai */
    private final C58833ax f299552ai;

    /* renamed from: aj */
    private final C58833ax f299553aj;

    /* renamed from: ak */
    private final C107619d f299554ak;

    /* renamed from: al */
    private final C58833ax f299555al;

    /* renamed from: am */
    private final C58833ax f299556am;

    /* renamed from: an */
    private final C68214a f299557an;

    /* renamed from: ao */
    private final C68214a f299558ao;

    /* renamed from: ap */
    private final C91097g f299559ap;

    /* renamed from: aq */
    private final C2391v f299560aq;

    /* renamed from: ar */
    private final C58833ax f299561ar;

    /* renamed from: as */
    private final C68214a f299562as;

    /* renamed from: at */
    private C73898d f299563at;

    /* renamed from: au */
    private final C58833ax f299564au;

    /* renamed from: av */
    private final C68214a f299565av;

    /* renamed from: aw */
    private View.OnClickListener f299566aw;

    /* renamed from: ax */
    private ImageButton f299567ax;

    /* renamed from: ay */
    private boolean f299568ay;

    /* renamed from: az */
    private View f299569az;

    /* renamed from: ba */
    private boolean f299570ba;

    /* renamed from: bb */
    private final C91142g f299571bb;

    /* renamed from: bc */
    private final m f299572bc;

    /* renamed from: bd */
    private final C58833ax f299573bd;

    /* renamed from: be */
    private final boolean f299574be;

    /* renamed from: bf */
    private SpannableStringBuilder f299575bf;

    /* renamed from: bg */
    private final C108321ej f299576bg;

    /* renamed from: bh */
    private com.google.android.apps.gsa.assistant.shared.q.h f299577bh;

    /* renamed from: bi */
    private final C104149a f299578bi;

    /* renamed from: bj */
    private final C109712mq f299579bj;

    /* renamed from: c */
    public final Context f299580c;

    /* renamed from: d */
    public final SharedPreferences f299581d;

    /* renamed from: e */
    public final C86124t f299582e;

    /* renamed from: f */
    public final C107698i f299583f;

    /* renamed from: g */
    public final C22871g f299584g;

    /* renamed from: h */
    public final InputMethodManager f299585h;

    /* renamed from: i */
    final ViewGroup f299586i;

    /* renamed from: j */
    final View f299587j;

    /* renamed from: k */
    public C83579aj f299588k;

    /* renamed from: l */
    public final C113916t f299589l;

    /* renamed from: m */
    public final C68214a f299590m;

    /* renamed from: n */
    public final C68214a f299591n;

    /* renamed from: o */
    public final C68214a f299592o;

    /* renamed from: p */
    public final C68214a f299593p;

    /* renamed from: q */
    public final C68214a f299594q;

    /* renamed from: r */
    public C107658ar f299595r;

    /* renamed from: s */
    View f299596s;

    /* renamed from: t */
    public final ImageView f299597t;

    /* renamed from: u */
    public LogoView f299598u;

    /* renamed from: v */
    public ImageButton f299599v;

    /* renamed from: w */
    public ImageButton f299600w;

    /* renamed from: x */
    FrameLayout f299601x;

    /* renamed from: y */
    public Boolean f299602y;

    /* renamed from: z */
    public View f299603z;

    public C107656ap(C83578ai aiVar, C107710u uVar, C107698i iVar, C87681ai aiVar2, Activity activity, SharedPreferences sharedPreferences, C86124t tVar, C104149a aVar, C21370a aVar2, C90931ca caVar, C22871g gVar, C22871g gVar2, C109712mq mqVar, C68214a aVar3, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C107619d dVar, C68214a aVar4, C113916t tVar2, C114524l lVar, C68214a aVar5, C68214a aVar6, C58833ax axVar4, C107379c cVar, C2391v vVar, boolean z, C58833ax axVar5, boolean z2, C68214a aVar7, C91097g gVar3, C108093b bVar, C68214a aVar8, C68214a aVar9, C68214a aVar10, C58833ax axVar6, C68214a aVar11, C68214a aVar12, C68214a aVar13, C68214a aVar14, C68214a aVar15, C91142g gVar4, m mVar, C58833ax axVar7, C58833ax axVar8, C68214a aVar16, boolean z3, C108321ej ejVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C83578ai aiVar3 = aiVar;
        Activity activity2 = activity;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        C86124t tVar3 = tVar;
        C104149a aVar17 = aVar;
        C109712mq mqVar2 = mqVar;
        C107619d dVar2 = dVar;
        C2391v vVar2 = vVar;
        m mVar2 = mVar;
        this.f299580c = activity2;
        this.f299581d = sharedPreferences2;
        this.f299578bi = aVar17;
        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
        this.f299582e = tVar3;
        this.f299547ad = uVar;
        this.f299583f = iVar;
        this.f299548ae = aiVar2;
        this.f299523aF = aVar2;
        this.f299549af = caVar;
        this.f299550ag = gVar2;
        this.f299584g = gVar;
        this.f299551ah = aVar5;
        this.f299558ao = aVar6;
        this.f299585h = (InputMethodManager) activity2.getSystemService("input_method");
        this.f299579bj = mqVar2;
        this.f299556am = axVar2;
        this.f299552ai = axVar3;
        this.f299553aj = axVar4;
        this.f299506O = aVar7;
        this.f299538aU = bVar;
        this.f299511T = aVar8;
        this.f299564au = axVar6;
        this.f299540aW = aVar9;
        this.f299591n = aVar10;
        this.f299562as = aVar11;
        this.f299565av = aVar12;
        this.f299592o = aVar13;
        this.f299593p = aVar14;
        this.f299594q = aVar16;
        this.f299574be = z3;
        this.f299576bg = ejVar;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(C108435ip.m180256a(aVar17, activity2)).inflate(C113987f.m188690a(tVar) ? tVar3.mo79746e(C90029ch.f248210X) ? R.layout.opa_search_plate_v3 : R.layout.opa_search_plate_v2 : R.layout.opa_search_plate, (ViewGroup) null);
        this.f299586i = linearLayout;
        linearLayout.setTag("SEARCH_PLATE_CONTAINER");
        linearLayout.addOnLayoutChangeListener(new C107641aa(this));
        this.f299587j = linearLayout.findViewById(R.id.opa_search_plate_progress_bar);
        this.f299554ak = dVar2;
        this.f299557an = aVar4;
        this.f299501J = aiVar3;
        this.f299589l = tVar2;
        this.f299505N = lVar;
        this.f299525aH = C87566i.m142258aF(activity.getIntent().getExtras());
        this.f299590m = aVar3;
        this.f299555al = axVar;
        this.f299504M = new C2332ag();
        this.f299502K = tVar3.mo79746e(C90014bt.f247794nq);
        this.f299503L = tVar3.mo79746e(C90014bt.f247243dV);
        this.f299530aM = z;
        this.f299532aO = z2;
        this.f299559ap = gVar3;
        this.f299560aq = vVar2;
        this.f299561ar = axVar5;
        this.f299515X = aVar15;
        this.f299571bb = gVar4;
        this.f299572bc = mVar2;
        this.f299573bd = axVar7;
        this.f299531aN = (axVar8.mo56113h() && ((C81517a) axVar8.mo56107c()).mo75125b() == 2) || tVar3.mo79746e(C90029ch.f248283bq);
        this.f299533aP = tVar3.mo79746e(C90014bt.f247791nn);
        this.f299534aQ = tVar3.mo79746e(C90014bt.f247610kR);
        this.f299535aR = C87566i.m142265aM(activity.getIntent().getExtras());
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.keyboard_indicator);
        this.f299597t = imageView;
        C28292j jVar = new C28292j(33439);
        jVar.mo33795i(5);
        C28295m.m52919e(imageView, jVar);
        if (tVar3.mo79746e(C90014bt.f247760nI) && imageView != null) {
            m178576bi(imageView, 8388693);
            imageView.setImageDrawable(activity2.getDrawable(R.drawable.valyrian_icon_keyboard));
        }
        ImageView imageView2 = (ImageView) linearLayout.findViewById(R.id.center_keyboard_indicator);
        this.f299542aY = imageView2;
        View findViewById = linearLayout.findViewById(R.id.opa_search_plate_inner);
        this.f299518aA = findViewById;
        if (C113987f.m188690a(tVar) && tVar3.mo79746e(C90014bt.f247764nM) && findViewById != null) {
            C113720h hVar = new C113720h();
            hVar.f314945a = activity.getResources().getColor(R.color.search_plate_inner_shadow_color);
            hVar.f314947c = activity.getResources().getDimensionPixelSize(R.dimen.opa_search_plate_inner_shadow_y_offset);
            hVar.f314946b = activity.getResources().getDimensionPixelSize(R.dimen.opa_search_plate_inner_shadow_radius);
            C113721i iVar2 = new C113721i(hVar, activity.getResources().getColor(R.color.search_plate_inner_background_color), (float) activity.getResources().getDimensionPixelSize(R.dimen.opa_search_plate_inner_background_radius), (float) activity.getResources().getDimensionPixelSize(R.dimen.opa_search_plate_inner_background_radius));
            this.f299519aB = iVar2;
            findViewById.getClass();
            findViewById.setBackground(iVar2);
            if (aVar.mo93971b()) {
                findViewById.getClass();
                findViewById.setBackgroundColor(C19391a.m36980a(activity2, 16842801));
            }
            findViewById.getClass();
            findViewById.setElevation(0.0f);
            findViewById.getClass();
            findViewById.setLayerType(1, (Paint) null);
        }
        if (imageView != null) {
            if (m178584bq()) {
                a x = C73904j.m108523x();
                a aVar18 = x;
                aVar18.i = 2;
                x.g(10);
                x.d(11);
                aVar18.f = 1;
                aVar18.a = imageView;
                x.f(activity.getResources().getText(R.string.opa_keyboard_tooltip));
                this.f299516Y = mVar2.a(x.a());
            }
            imageView.setOnClickListener(new C89943l(new C107679q(this)));
        }
        if (imageView2 != null) {
            imageView2.setOnClickListener(new C89943l(new C107679q(this)));
        }
        if (!tVar3.mo79746e(C90014bt.f247146be)) {
            m178566aY();
        }
        this.f299520aC = (FrameLayout) linearLayout.findViewById(R.id.opa_search_plate_zero_state_brick_container);
        this.f299546ac = tVar3.mo79746e(C90014bt.f247719mU) || mo96130aC();
        C83579aj a = mqVar2.mo98043a(aiVar3);
        this.f299588k = a;
        a.mo76918f(dVar);
        ImageView imageView3 = (ImageView) linearLayout.findViewById(R.id.static_mic_indicator);
        this.f299543aZ = imageView3;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new C107683u(this));
        }
        if (!tVar3.mo79746e(C90014bt.f247147bf)) {
            mo96103B((C110428c) aVar3.mo27525b());
        }
        FrameLayout frameLayout = (FrameLayout) linearLayout.findViewById(R.id.extras_container);
        this.f299521aD = frameLayout;
        if (frameLayout != null) {
            if (tVar3.mo79746e(C90014bt.f247760nI)) {
                FrameLayout frameLayout2 = this.f299521aD;
                frameLayout2.getClass();
                m178576bi(frameLayout2, 8388691);
            }
            if (axVar.mo56113h()) {
                ViewGroup a2 = ((C106158g) axVar.mo56107c()).mo95328a();
                this.f299493B = a2;
                if (a2 != null) {
                    FrameLayout frameLayout3 = this.f299521aD;
                    frameLayout3.getClass();
                    frameLayout3.addView(a2);
                    m178567aZ();
                } else {
                    C58976aa aaVar = C58975e.f156826a;
                }
            }
        }
        C58833ax b = cVar.f298856a.mo56106b(C107378b.f298855a);
        if (b.mo56113h()) {
            ((LiveData) b.mo56107c()).mo5704e(vVar, new C107642ab(this));
        }
        if (tVar3.mo79746e(C90063do.f249440da) && Build.VERSION.SDK_INT >= 30) {
            C113793bi biVar = (C113793bi) aVar7.mo27525b();
            View decorView = biVar.f315156b.getWindow().getDecorView();
            View findViewById2 = decorView.findViewById(16908290);
            if (!(findViewById2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams()) == null)) {
                decorView.setWindowInsetsAnimationCallback(new C113791bg(biVar, marginLayoutParams, marginLayoutParams.bottomMargin, findViewById2, decorView));
                decorView.setOnApplyWindowInsetsListener(new C113788bd(biVar, marginLayoutParams, findViewById2));
            }
        }
        View findViewById3 = linearLayout.findViewById(R.id.opa_search_plate_inner_fab_container);
        if (findViewById3 != null) {
            a x2 = C73904j.m108523x();
            a aVar19 = x2;
            aVar19.i = 4;
            aVar19.a = findViewById3;
            x2.f(activity.getResources().getText(R.string.speedbump_prompt_text));
            this.f299577bh = mVar2.a(x2.a());
        }
    }

    /* renamed from: aV */
    private final C83607e m178563aV() {
        C83607e eVar = (C83607e) this.f299541aX.mo3842a();
        return eVar == null ? C83607e.UNDEFINED : eVar;
    }

    /* renamed from: aW */
    private final C48674ai m178564aW() {
        if (!((C113191cv) this.f299511T.mo27525b()).mo99905a() || !this.f299535aR) {
            return C48674ai.ASSISTANT;
        }
        return C48674ai.INTENT_LAUNCHER;
    }

    /* renamed from: aX */
    private final void m178565aX() {
        int e;
        View view;
        View view2 = this.f299493B;
        if (view2 != null) {
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            if (!(viewGroup == null || (view = this.f299493B) == null)) {
                viewGroup.removeView(view);
            }
            if (!mo96130aC() ? (e = mo96177e()) == 1 || e == 2 : m178563aV().equals(C83607e.EDIT_TEXT)) {
                if (!this.f299529aL) {
                    m178566aY();
                }
                FrameLayout frameLayout = this.f299492A;
                if (frameLayout != null) {
                    frameLayout.addView(view2);
                    return;
                }
                return;
            }
            FrameLayout frameLayout2 = this.f299521aD;
            if (frameLayout2 != null) {
                frameLayout2.addView(view2);
            }
        }
    }

    /* renamed from: aY */
    private final void m178566aY() {
        if (!this.f299529aL) {
            ((ViewStub) this.f299586i.findViewById(R.id.type_container_view_stub)).inflate();
            this.f299603z = this.f299586i.findViewById(R.id.type_container);
            OpaEditText opaEditText = (OpaEditText) this.f299586i.findViewById(R.id.input_text);
            opaEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) this.f299582e.mo79743a(C90014bt.f247633ko))});
            if (this.f299582e.mo79746e(C90063do.f249444de)) {
                opaEditText.setPrivateImeOptions("nm");
            }
            if (this.f299531aN && this.f299578bi.mo93970a()) {
                String privateImeOptions = opaEditText.getPrivateImeOptions();
                if (privateImeOptions == null) {
                    privateImeOptions = "com.google.android.inputmethod.latin.canary.darkMode,com.google.android.inputmethod.latin.darkMode";
                } else if (!privateImeOptions.contains("com.google.android.inputmethod.latin.canary.darkMode,com.google.android.inputmethod.latin.darkMode")) {
                    privateImeOptions = privateImeOptions.concat(",").concat("com.google.android.inputmethod.latin.canary.darkMode,com.google.android.inputmethod.latin.darkMode");
                }
                C58976aa aaVar = C58975e.f156826a;
                opaEditText.setPrivateImeOptions(privateImeOptions);
            }
            LogoView logoView = (LogoView) this.f299586i.findViewById(R.id.assistant_logo);
            this.f299598u = logoView;
            if (logoView != null) {
                C28292j jVar = new C28292j(33440);
                jVar.mo33795i(5);
                C28295m.m52919e(logoView, jVar);
                int integer = this.f299580c.getResources().getInteger(R.integer.keyboard_logoview_size);
                LogoView logoView2 = this.f299598u;
                logoView2.getClass();
                float f = (float) integer;
                logoView2.mo28223c(f, f);
                LogoView logoView3 = this.f299598u;
                logoView3.getClass();
                logoView3.mo28225e(7, true);
                C89943l lVar = new C89943l(new C107646af(this));
                this.f299566aw = lVar;
                LogoView logoView4 = this.f299598u;
                logoView4.getClass();
                logoView4.setOnClickListener(lVar);
                LogoView logoView5 = this.f299598u;
                logoView5.getClass();
                logoView5.setTransitionName("opa-logo-view-transition");
            }
            this.f299492A = (FrameLayout) this.f299586i.findViewById(R.id.extras_container_for_type);
            if (opaEditText != null) {
                C28292j jVar2 = new C28292j(33441);
                jVar2.mo33795i(5);
                C28295m.m52919e(opaEditText, jVar2);
                if (((C113884o) this.f299558ao.mo27525b()).mo100742a() || this.f299503L) {
                    opaEditText.setInputType(557057);
                } else {
                    opaEditText.setInputType(32769);
                }
                C107654an anVar = new C107654an(this, opaEditText);
                opaEditText.f314917a = anVar;
                opaEditText.setOnEditorActionListener(anVar);
                opaEditText.setOnClickListener(new C89943l(anVar));
                opaEditText.setOnTouchListener(anVar);
                opaEditText.setOnFocusChangeListener(anVar);
                opaEditText.addTextChangedListener(anVar);
            }
            ImageButton imageButton = (ImageButton) this.f299586i.findViewById(R.id.send_button);
            this.f299599v = imageButton;
            if (imageButton != null) {
                imageButton.setOnClickListener(new C107670h(this));
            }
            ImageButton imageButton2 = (ImageButton) this.f299586i.findViewById(R.id.clear_button);
            this.f299600w = imageButton2;
            if (imageButton2 != null) {
                imageButton2.setOnClickListener(new C107671i(this));
            }
            if (((C113191cv) this.f299511T.mo27525b()).mo99907c() && this.f299582e.mo79746e(C90063do.f249325bR)) {
                ImageButton imageButton3 = (ImageButton) this.f299586i.findViewById(R.id.feedback_button);
                this.f299567ax = imageButton3;
                if (imageButton3 != null) {
                    imageButton3.setVisibility(0);
                    this.f299567ax.setOnClickListener(new C107672j(this));
                    this.f299567ax.setOnLongClickListener(new C107673k(this));
                }
            }
            if (this.f299555al.mo56113h()) {
                ViewGroup a = ((C106158g) this.f299555al.mo56107c()).mo95328a();
                this.f299493B = a;
                if (a != null) {
                    Resources resources = this.f299580c.getResources();
                    int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.search_plate_icon_size);
                    int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.search_plate_button_padding);
                    LogoView logoView6 = this.f299598u;
                    if (logoView6 != null) {
                        logoView6.getLayoutParams().width = dimensionPixelSize;
                        LogoView logoView7 = this.f299598u;
                        logoView7.setPadding(dimensionPixelSize2, logoView7.getPaddingTop(), dimensionPixelSize2, this.f299598u.getPaddingBottom());
                    }
                } else {
                    C58976aa aaVar2 = C58975e.f156826a;
                }
            }
            this.f299529aL = true;
        }
    }

    /* renamed from: aZ */
    private static void m178567aZ() {
        C60321oe b = C28285c.m52875b(C28293k.m52907d(new C28292j(110369), C58485gu.m89845m()), 110380);
        if (b != null) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 472;
            C89949q.m146525j((C60555uf) tzVar.build(), b, (C63196b) null, (String) null);
        }
    }

    /* renamed from: ba */
    private static void m178568ba(h hVar, boolean z) {
        if (hVar != null) {
            hVar.c(z);
        }
    }

    /* renamed from: bb */
    private final void m178569bb() {
        FrameLayout frameLayout = (FrameLayout) this.f299586i.findViewById(R.id.opa_search_plate_explore_icon_container);
        if (this.f299520aC != null && frameLayout != null) {
            if (mo96177e() != 0 || this.f299582e.mo79746e(C90014bt.f247767nP)) {
                ((FrameLayout.LayoutParams) this.f299520aC.getLayoutParams()).gravity = 8388627;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).gravity = 8388629;
                return;
            }
            ((FrameLayout.LayoutParams) this.f299520aC.getLayoutParams()).gravity = 8388629;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).gravity = 8388627;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r0.getVisibility() == 0) goto L_0x000c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: bc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m178570bc() {
        /*
            r4 = this;
            android.widget.ImageView r0 = r4.f299597t
            r1 = 1
            if (r0 == 0) goto L_0x000e
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r2 = 1
            goto L_0x0024
        L_0x000e:
            android.widget.FrameLayout r0 = r4.f299521aD
            r2 = 0
            if (r0 == 0) goto L_0x0024
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0024
            android.view.View r0 = r4.f299493B
            if (r0 == 0) goto L_0x0024
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0024
            goto L_0x000c
        L_0x0024:
            android.view.View r0 = r4.f299518aA
            if (r0 == 0) goto L_0x0066
            com.google.android.apps.gsa.search.core.i.t r0 = r4.f299582e
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247764nM
            boolean r0 = r0.mo79746e(r3)
            if (r0 == 0) goto L_0x0035
            com.google.android.apps.gsa.staticplugins.opa.ui.i r0 = r4.f299519aB
            goto L_0x0042
        L_0x0035:
            android.content.Context r0 = r4.f299580c
            android.content.res.Resources r0 = r0.getResources()
            r3 = 2131235384(0x7f081238, float:1.808696E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r3)
        L_0x0042:
            android.view.View r3 = r4.f299518aA
            r3.getClass()
            if (r1 == r2) goto L_0x004a
            r0 = 0
        L_0x004a:
            r3.setBackground(r0)
            com.google.android.apps.gsa.staticplugins.nga.ui.b.a r0 = r4.f299578bi
            boolean r0 = r0.mo93971b()
            if (r0 == 0) goto L_0x0066
            android.view.View r0 = r4.f299518aA
            r0.getClass()
            android.content.Context r1 = r4.f299580c
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            int r1 = com.google.android.libraries.assistant.p1614t.C19391a.m36980a(r1, r2)
            r0.setBackgroundColor(r1)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107656ap.m178570bc():void");
    }

    /* renamed from: bd */
    private final void m178571bd() {
        if (!this.f299533aP && !((C113191cv) this.f299511T.mo27525b()).mo99907c()) {
            return;
        }
        if (mo96130aC()) {
            if (m178563aV().equals(C83607e.EDIT_TEXT)) {
                mo96102A();
            } else {
                mo96161am();
            }
        } else if (mo96177e() == 1) {
            mo96102A();
        } else {
            mo96161am();
        }
    }

    /* renamed from: be */
    private static void m178572be(ViewGroup viewGroup, String str, FrameLayout frameLayout, int i) {
        View findViewWithTag = viewGroup.findViewWithTag(str);
        if (findViewWithTag != null) {
            ViewParent parent = findViewWithTag.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(findViewWithTag);
            }
            findViewWithTag.getLayoutParams().height = i;
            frameLayout.addView(findViewWithTag);
        }
    }

    /* renamed from: bf */
    private final void m178573bf(int i) {
        C87985kx kxVar = (C87985kx) C87986ky.f237947d.createBuilder();
        kxVar.copyOnWrite();
        C87986ky kyVar = (C87986ky) kxVar.instance;
        kyVar.f237949a |= 1;
        kyVar.f237950b = 5;
        String str = "android.resource://" + this.f299580c.getPackageName() + "/" + i;
        kxVar.copyOnWrite();
        C87986ky kyVar2 = (C87986ky) kxVar.instance;
        kyVar2.f237949a |= 2;
        kyVar2.f237951c = str;
        C88489j jVar = new C88489j(C87739bu.EXECUTE_MEDIA);
        jVar.mo82014b(C87984kw.f237946a, (C87986ky) kxVar.build());
        this.f299584g.mo28212l("PlayMicChime", new C107688z(this, jVar.mo82013a()));
    }

    /* renamed from: bg */
    private static void m178574bg(SpannableStringBuilder spannableStringBuilder, int i, int i2, C51655m mVar) {
        spannableStringBuilder.setSpan(new ComboBoxBackgroundColorSpan(0, mVar), i, i2, 17);
    }

    /* renamed from: bh */
    private final void m178575bh(int i) {
        ((Activity) this.f299580c).getWindow().setStatusBarColor(i);
    }

    /* renamed from: bi */
    private static void m178576bi(View view, int i) {
        if (view.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity = i;
            view.requestLayout();
        }
    }

    /* renamed from: bj */
    private final void m178577bj(int i) {
        if (!this.f299556am.mo56113h()) {
            return;
        }
        if (i == 3 || i == 10) {
            ((C109212a) this.f299556am.mo56107c()).mo97675d();
        }
    }

    /* renamed from: bk */
    private final void m178578bk(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        View view = this.f299603z;
        int i = 8;
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        }
        this.f299588k.mo76917e(z2);
        ImageView imageView = this.f299543aZ;
        if (imageView != null) {
            imageView.setVisibility(true != z3 ? 8 : 0);
        }
        ImageView imageView2 = this.f299542aY;
        if (imageView2 != null) {
            imageView2.setVisibility(true != z4 ? 8 : 0);
        }
        ImageView imageView3 = this.f299597t;
        if (imageView3 != null) {
            if (true == z5) {
                i = 0;
            }
            imageView3.setVisibility(i);
        }
        mo96149aa(z6);
        mo96150ab(z7);
    }

    /* renamed from: bl */
    private final void m178579bl() {
        if (this.f299530aM && mo96180h() != null) {
            int i = 0;
            boolean z = this.f299532aO || mo96177e() == 1;
            View h = mo96180h();
            if (true != z) {
                i = 8;
            }
            h.setVisibility(i);
        }
    }

    /* renamed from: bm */
    private final boolean m178580bm() {
        return this.f299563at != null;
    }

    /* renamed from: bn */
    private final boolean m178581bn() {
        return this.f299582e.mo79746e(C90063do.f249271aQ) && !this.f299574be;
    }

    /* renamed from: bo */
    private final boolean m178582bo() {
        C51211f fVar;
        if (this.f299553aj.mo56113h()) {
            fVar = ((C108100a) this.f299553aj.mo56107c()).f300689c;
        } else {
            fVar = C51211f.UNKNOWN_SOURCE;
        }
        return fVar == C51211f.LONG_TAP || fVar == C51211f.SHORT_TAP || fVar == C51211f.EDIT_HINT || fVar == C51211f.UNDERLINE || fVar == C51211f.INVISIBLE_UNDERLINE;
    }

    /* renamed from: bp */
    private final boolean m178583bp() {
        if ((!mo96130aC() && mo96177e() == 0) || mo96133aF()) {
            return true;
        }
        if (!mo96130aC() || m178563aV().equals(C83607e.EDIT_TEXT)) {
            return false;
        }
        return true;
    }

    /* renamed from: bq */
    private final boolean m178584bq() {
        e a;
        if (!this.f299571bb.mo85405j(C90126fx.f251244fE)) {
            return false;
        }
        if ((this.f299573bd.mo56113h() && ((C74714bo) this.f299573bd.mo56107c()).mo71081c()) || (a = C87564g.m142223a(((Activity) this.f299580c).getIntent().getExtras())) == e.aU || a == e.f) {
            return false;
        }
        return true;
    }

    /* renamed from: br */
    private final void m178585br(String str, C90735as asVar, List list, int i, h hVar) {
        m178568ba(hVar, m178582bo());
        m178587bt(str, asVar, i, true);
        if (mo96137aJ()) {
            Response response = new Response(str, (List) Collection.EL.stream(list).filter(C107674l.f299672a).map(C107681s.f299679a).collect(Collectors.toList()), new Bundle(), 7, "web", this.f299523aF.mo26870b());
            mo96127Z(false);
            mo96194v(response, true);
        }
    }

    /* renamed from: bs */
    private final void m178586bs(String str, C90735as asVar, List list, int i, h hVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C58485gu guVar = (C58485gu) Collection.EL.stream(list).map(C107665c.f299662a).collect(C58370cn.f155946a);
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(list).map(C107666d.f299663a).collect(C58370cn.f155946a);
        C58485gu guVar3 = (C58485gu) Collection.EL.stream(list).map(C107667e.f299664a).collect(C58370cn.f155946a);
        for (int i2 = 0; i2 < guVar.size(); i2++) {
            if (guVar3.get(i2) != null && !((alf) guVar3.get(i2)).f135317b.isEmpty()) {
                arrayList.add(((alf) guVar3.get(i2)).f135317b);
                arrayList3.add((alf) guVar3.get(i2));
            } else if (!TextUtils.isEmpty((CharSequence) guVar.get(i2))) {
                arrayList.add((String) guVar.get(i2));
            }
            arrayList2.add(!TextUtils.isEmpty((CharSequence) guVar2.get(i2)) ? (String) guVar2.get(i2) : BuildConfig.FLAVOR);
        }
        if (this.f299500I) {
            if (this.f299582e.mo79746e(C90029ch.f248254ao)) {
                this.f299544aa = asVar;
            }
            if (!((C113191cv) this.f299511T.mo27525b()).mo99907c() || hVar == null) {
                m178585br(str, asVar, arrayList, i, hVar);
                return;
            }
            hVar.c(true);
            com.google.android.apps.gsa.assistant.shared.p.m l = mo96183l();
            if (l != null) {
                if (!this.f299582e.mo79746e(C90063do.f249278aX) || !list.isEmpty()) {
                    if (this.f299582e.mo79746e(C90029ch.f248215aB)) {
                        C107662av avVar = (C107662av) this.f299593p.mo27525b();
                        if (avVar.f299653a.mo79746e(C90029ch.f248215aB)) {
                            avVar.mo96205a(C89849ae.AGSA_TEXT_TAPAS_CORRECTIONS_START);
                            avVar.f299655c = true;
                        }
                        if (((C58833ax) this.f299594q.mo27525b()).mo56113h()) {
                            ((C113389c) ((C58833ax) this.f299594q.mo27525b()).mo56107c()).mo99634i();
                            ((C113389c) ((C58833ax) this.f299594q.mo27525b()).mo56107c()).mo99632g(list);
                        }
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("prefix", str);
                    bundle.putStringArrayList("corrections", (ArrayList) Collection.EL.stream(arrayList).collect(Collectors.toCollection(C107686x.f299684a)));
                    bundle.putStringArrayList("htmlCorrections", (ArrayList) Collection.EL.stream(arrayList2).collect(Collectors.toCollection(C107686x.f299684a)));
                    ProtoParsers.m95533p(bundle, "styledTextCorrections", (List) Collection.EL.stream(arrayList3).collect(Collectors.toCollection(C107686x.f299684a)));
                    bundle.putInt("highlightStart", asVar.f253812a);
                    bundle.putInt("highlightEnd", asVar.f253813b);
                    l.w(str, Optional.m71637of(bundle));
                } else {
                    ((C107662av) this.f299593p.mo27525b()).mo96210f(3);
                    if (mo96183l() != null && ((C58833ax) this.f299594q.mo27525b()).mo56113h()) {
                        ((C113389c) ((C58833ax) this.f299594q.mo27525b()).mo56107c()).mo99634i();
                    }
                    l.v(str);
                }
                m178587bt(str, asVar, i, true);
                return;
            }
            m178585br(str, asVar, arrayList, i, hVar);
        }
    }

    /* renamed from: bt */
    private final void m178587bt(String str, C90735as asVar, int i, boolean z) {
        int i2;
        SpannableStringBuilder spannableStringBuilder;
        SpannableStringBuilder spannableStringBuilder2;
        this.f299507P = z;
        this.f299508Q = str;
        OpaEditText m = mo96184m();
        this.f299514W = true;
        if (this.f299582e.mo79746e(C90029ch.f248255ap) || this.f299582e.mo79746e(C90029ch.f248253an)) {
            C51656n nVar = this.f299517Z;
            SpannableStringBuilder spannableStringBuilder3 = null;
            if (nVar == null) {
                this.f299575bf = null;
            } else if (!str.contentEquals(nVar.f134600b) || (spannableStringBuilder2 = this.f299575bf) == null || !str.contentEquals(spannableStringBuilder2.toString())) {
                if (nVar.f134601c.isEmpty()) {
                    this.f299575bf = null;
                } else if (str.contentEquals(nVar.f134600b)) {
                    this.f299575bf = new SpannableStringBuilder(nVar.f134600b);
                    for (C51655m mVar : nVar.f134601c) {
                        int i3 = mVar.f134591a;
                        if (!((i3 & 1) == 0 || (i3 & 2) == 0 || (spannableStringBuilder = this.f299575bf) == null)) {
                            int i4 = mVar.f134592b;
                            int min = Math.min(mVar.f134593c - 1, spannableStringBuilder.length());
                            if (!TextUtils.isEmpty(str)) {
                                if (min <= i4) {
                                    C59104x d = f299490a.mo56226d();
                                    d.mo56378ag(C58975e.f156826a, "OpaSearchPlateCtl");
                                    ((C59052c) ((C59052c) d).mo56372aa(26043)).mo56393w("#setHighlightSpan: Range is empty or negative. startPos: %s, endPos: %s", i4, min);
                                } else {
                                    boolean isWhitespace = Character.isWhitespace(str.charAt(i4));
                                    int i5 = i4 + 1;
                                    while (i5 < min) {
                                        if (isWhitespace != Character.isWhitespace(str.charAt(i5))) {
                                            m178574bg(spannableStringBuilder, i4, i5, mVar);
                                            isWhitespace = !isWhitespace;
                                            i4 = i5;
                                        }
                                        i5++;
                                    }
                                    if (i4 < i5) {
                                        m178574bg(spannableStringBuilder, i4, i5, mVar);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.f299575bf = null;
                }
                spannableStringBuilder3 = this.f299575bf;
            } else {
                spannableStringBuilder3 = this.f299575bf;
            }
            this.f299575bf = spannableStringBuilder3;
            C51656n nVar2 = this.f299517Z;
            OpaEditText m2 = mo96184m();
            if (spannableStringBuilder3 == null || nVar2 == null || !str.contentEquals(nVar2.f134600b) || !str.contentEquals(spannableStringBuilder3.toString())) {
                m2.setText(str);
            } else {
                m2.setText(spannableStringBuilder3);
                m2.setMovementMethod(new C108434io(this.f299576bg));
            }
        } else {
            m.setText(str);
        }
        this.f299514W = false;
        OpaEditText m3 = mo96184m();
        int i6 = asVar.f253812a;
        int i7 = asVar.f253813b;
        if (i6 >= 0 && i6 <= i7 && i7 <= str.length()) {
            m3.setSelection(i6, i7);
        }
        C83607e eVar = C83607e.UNDEFINED;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        int i8 = i - 1;
        if (i8 != 1) {
            i2 = 3;
            if (i8 != 2) {
                if (i8 != 3) {
                    i2 = 4;
                    if (i8 != 4) {
                        C59104x d2 = f299490a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "OpaSearchPlateCtl");
                        ((C59052c) ((C59052c) d2).mo56372aa(26017)).mo56386p("#getKeyboardInputType - should indicate valid input type");
                    }
                } else {
                    i2 = 2;
                }
            }
            mo96152ad(true, i2);
        }
        i2 = 1;
        mo96152ad(true, i2);
    }

    /* renamed from: A */
    public final void mo96102A() {
        View view = this.f299603z;
        if (view != null && this.f299520aC != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            this.f299520aC.setVisibility(8);
            if (!((C113191cv) this.f299511T.mo27525b()).mo99907c() || !mo96131aD() || this.f299512U == null) {
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.setMarginStart(0);
                View view2 = this.f299603z;
                view2.getClass();
                view2.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* renamed from: B */
    public final void mo96103B(C110428c cVar) {
        C88709j jVar;
        C110428c cVar2 = cVar;
        if (!((C113191cv) this.f299511T.mo27525b()).mo99907c() && !this.f299497F) {
            this.f299496E = true;
            if (mo96172ax() || this.f299503L) {
                Activity activity = (Activity) cVar2.f307830a.mo17428b();
                activity.getClass();
                C21370a aVar = (C21370a) cVar2.f307831b.mo17428b();
                aVar.getClass();
                C68214a a = C68219e.m98518a(((C68226l) cVar2.f307832c).f184585a);
                a.getClass();
                C90476a aVar2 = (C90476a) cVar2.f307833d.mo17428b();
                aVar2.getClass();
                C68214a a2 = C68219e.m98518a(((C68226l) cVar2.f307834e).f184585a);
                a2.getClass();
                C68214a a3 = C68219e.m98518a(((C68226l) cVar2.f307835f).f184585a);
                a3.getClass();
                C86124t tVar = (C86124t) cVar2.f307836g.mo17428b();
                tVar.getClass();
                this.f299522aE = new C110427b(activity, aVar, a, new C88649e(activity, aVar), new C88688a(), aVar2, a2, a3, tVar);
                this.f299495D = (SuggestionGridLayout) this.f299586i.findViewById(R.id.auto_complete_grid);
                if (mo96140aM()) {
                    SuggestionGridLayout suggestionGridLayout = this.f299495D;
                    if (suggestionGridLayout != null) {
                        this.f299586i.removeView(suggestionGridLayout);
                    }
                    LinearLayout linearLayout = (LinearLayout) this.f299586i.findViewById(R.id.extras_container_for_qsb_auto_complete_grid);
                    this.f299528aK = linearLayout;
                    if (linearLayout != null) {
                        SuggestionGridLayout suggestionGridLayout2 = this.f299495D;
                        if (suggestionGridLayout2 != null) {
                            ViewParent parent = suggestionGridLayout2.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(this.f299495D);
                            }
                            this.f299528aK.addView(this.f299495D);
                        }
                        this.f299528aK.setOnClickListener(new C107687y(this));
                        this.f299528aK.setVisibility(0);
                    }
                }
                SuggestionGridLayout suggestionGridLayout3 = this.f299495D;
                if (suggestionGridLayout3 != null) {
                    suggestionGridLayout3.mo84845g();
                    SuggestionGridLayout suggestionGridLayout4 = this.f299495D;
                    suggestionGridLayout4.setTag(Integer.valueOf(suggestionGridLayout4.getVisibility()));
                }
                C110434i iVar = this.f299522aE;
                iVar.getClass();
                if (mo96140aM()) {
                    long a4 = this.f299582e.mo79743a(C90014bt.f247789nl);
                    jVar = new C88709j();
                    C88787u uVar = new C88787u();
                    uVar.f240278D = (int) a4;
                    uVar.f240293g = 0.0f;
                    uVar.f240283I = false;
                    uVar.f240281G = false;
                    uVar.f240282H = false;
                    uVar.f240292f = 1;
                    uVar.f240287M = false;
                    uVar.f240289c = R.drawable.opa_suggestion_view_background_normal;
                    uVar.f240290d = R.dimen.opa_search_plate_suggestion_container_bg_margin;
                    jVar.f239875ae = 55;
                    jVar.f239870a = (long) ((int) this.f299582e.mo79743a(C90014bt.f247366fm));
                    jVar.f239879e = this.f299582e.mo79746e(C90014bt.f247783nf);
                    jVar.f239895u.mo44243b(C41669ai.f108954c.intValue(), uVar);
                    jVar.f239895u.mo44243b(C41669ai.f108956e.intValue(), uVar);
                } else {
                    jVar = new C88709j();
                    C88787u uVar2 = new C88787u();
                    uVar2.f240278D = 3;
                    uVar2.f240293g = 3.0f;
                    uVar2.f240283I = false;
                    uVar2.f240281G = false;
                    uVar2.f240282H = false;
                    uVar2.f240292f = 0;
                    uVar2.f240287M = false;
                    uVar2.f240289c = R.drawable.opa_suggestion_view_background_normal;
                    uVar2.f240290d = R.dimen.opa_search_plate_suggestion_container_bg_margin;
                    C88787u uVar3 = new C88787u();
                    uVar3.f240278D = 2;
                    uVar3.f240293g = 2.0f;
                    uVar3.f240283I = false;
                    uVar3.f240281G = false;
                    uVar3.f240282H = false;
                    uVar3.f240292f = 0;
                    uVar3.f240287M = false;
                    uVar3.f240289c = R.drawable.opa_suggestion_view_background_normal;
                    uVar3.f240290d = R.dimen.opa_search_plate_suggestion_container_bg_margin;
                    jVar.f239870a = (long) ((int) this.f299582e.mo79743a(C90014bt.f247366fm));
                    jVar.f239895u.mo44243b(C41669ai.f108954c.intValue(), uVar3);
                    jVar.f239895u.mo44243b(C41669ai.f108955d.intValue(), uVar2);
                    jVar.f239895u.mo44243b(C41669ai.f108952a.intValue(), uVar2);
                }
                C107648ah ahVar = new C107648ah(this);
                C107647ag agVar = new C107647ag(this);
                C90931ca caVar = this.f299549af;
                C22871g gVar = this.f299584g;
                C88687j jVar2 = new C88687j(this.f299523aF);
                C58976aa aaVar = C58975e.f156826a;
                C110427b bVar = (C110427b) iVar;
                bVar.f307825p = agVar;
                bVar.f307818i = jVar2;
                bVar.f307818i.mo82382c();
                C58485gu n = C58485gu.m89846n(bVar.f307818i);
                C88714o oVar = new C88714o();
                if (bVar.f307823n.mo79746e(C90014bt.f247794nq) || bVar.f307823n.mo79746e(C90014bt.f247243dV)) {
                    boolean e = bVar.f307823n.mo79746e(C90014bt.f247425gs);
                    Context context = bVar.f307810a;
                    C21370a aVar3 = bVar.f307811b;
                    C88649e eVar = bVar.f307813d;
                    C88705f fVar = bVar.f307812c;
                    C88691a aVar4 = new C88691a(context, aVar3, bVar.f307815f);
                    aVar4.setElections(oVar);
                    oVar.f239913h = (C88701b) iVar;
                    oVar.f239906a.mo55395g(iVar);
                    oVar.f239914i = eVar;
                    oVar.f239906a.mo55395g(eVar);
                    oVar.f239918m = fVar;
                    oVar.f239920o = ahVar;
                    oVar.f239906a.mo55395g(ahVar);
                    C88707h hVar = new C88707h();
                    oVar.f239921p = hVar;
                    oVar.f239906a.mo55395g(hVar);
                    C88695d dVar = new C88695d();
                    oVar.mo82441e(new C110430e(aVar4.f239805a, dVar, e));
                    C88692a aVar5 = new C88692a();
                    oVar.mo82441e(new C110433h(aVar4.f239805a, aVar5));
                    oVar.mo82441e(new C110432g(aVar4.f239805a, aVar5));
                    oVar.mo82441e(new C110429d(aVar4.f239805a));
                    oVar.mo82442f(new C88829m(aVar4.f239805a));
                    int i = ((C58724pq) n).f156474d;
                    for (int i2 = 0; i2 < i; i2++) {
                        oVar.mo82437a((C41641b) n.get(i2));
                    }
                    oVar.mo82437a(dVar);
                    oVar.mo82437a(aVar5);
                } else {
                    Context context2 = bVar.f307810a;
                    C21370a aVar6 = bVar.f307811b;
                    C88649e eVar2 = bVar.f307813d;
                    C88705f fVar2 = bVar.f307812c;
                    new C88691a(context2, aVar6, bVar.f307815f).setElections(oVar);
                    oVar.f239913h = (C88701b) iVar;
                    oVar.f239906a.mo55395g(iVar);
                    oVar.f239914i = eVar2;
                    oVar.f239906a.mo55395g(eVar2);
                    oVar.f239918m = fVar2;
                    oVar.f239920o = ahVar;
                    oVar.f239906a.mo55395g(ahVar);
                    oVar.mo82441e(new C110431f(context2));
                    C88667a aVar7 = new C88667a();
                    oVar.mo82441e(new C110438m(context2, aVar7));
                    oVar.mo82442f(new C110437l(context2));
                    int i3 = ((C58724pq) n).f156474d;
                    for (int i4 = 0; i4 < i3; i4++) {
                        oVar.mo82437a((C41641b) n.get(i4));
                    }
                    oVar.mo82437a(aVar7);
                }
                bVar.f307820k = new C89202g(new C88715p(oVar), bVar.f307814e, caVar, (C22871g) bVar.f307816g.mo27525b(), (C22871g) bVar.f307817h.mo27525b(), gVar);
                bVar.f307820k.mo83158d(jVar);
                bVar.f307818i.mo82384h();
                C110434i iVar2 = this.f299522aE;
                iVar2.getClass();
                ((C110427b) iVar2).f307813d.f239678b = this.f299548ae;
                C107644ad adVar = new C107644ad(this);
                this.f299547ad.mo96220c(adVar, C88244um.HANDLE_SUGGEST_RESPONSE);
                this.f299497F = true;
            }
        }
    }

    /* renamed from: C */
    public final void mo96104C(boolean z) {
        if (this.f299546ac && mo96177e() == 1) {
            mo96122U();
            mo96184m().setText(BuildConfig.FLAVOR);
            if (this.f299582e.mo79746e(C90014bt.f247743ms)) {
                ((C109711mp) this.f299588k).f305654d = true;
            }
            mo96163ao(0);
            C107658ar arVar = this.f299595r;
            if (arVar != null && z) {
                C108797ea eaVar = (C108797ea) arVar;
                C109040fj fjVar = eaVar.f302536a;
                if (fjVar.f303371cc && fjVar.f303275ai != C109026ey.MODE_CONVERSATION) {
                    C109040fj fjVar2 = eaVar.f302536a;
                    if (!fjVar2.f303298bE && !fjVar2.f303450o.mo95399aj()) {
                        eaVar.f302536a.f303444i.mo95167z(C89849ae.OPA_ACTIVITY_DISMISS_BACK);
                    }
                }
            }
        }
    }

    /* renamed from: D */
    public final void mo96105D(com.google.android.apps.gsa.assistant.shared.p.e eVar) {
        if (mo96131aD()) {
            mo96198z(eVar);
        }
    }

    /* renamed from: E */
    public final void mo96106E() {
        if (this.f299595r != null && this.f299582e.mo79746e(C90029ch.f248277bk)) {
            C107658ar arVar = this.f299595r;
            arVar.getClass();
            C108797ea eaVar = (C108797ea) arVar;
            if (C109040fj.m181378bx(eaVar.f302536a.f303450o)) {
                ((C113989h) ((C113988g) eaVar.f302536a.f303450o).mo100833bf().mo56107c()).mo100843bB();
            }
        }
    }

    /* renamed from: F */
    public final void mo96107F() {
        if (mo96177e() != 1) {
            return;
        }
        if (mo96130aC() && !m178563aV().equals(C83607e.EDIT_TEXT)) {
            return;
        }
        if (mo96133aF()) {
            com.google.android.apps.gsa.assistant.shared.p.m l = mo96183l();
            if (l != null) {
                l.j(com.google.android.apps.gsa.assistant.shared.p.e.j);
                return;
            }
            return;
        }
        ((C107662av) this.f299593p.mo27525b()).mo96209e(Optional.empty());
    }

    /* renamed from: G */
    public final void mo96108G() {
        if (this.f299598u != null) {
            Optional o = mo96186o();
            int i = 0;
            boolean z = this.f299534aQ && TextUtils.isEmpty(mo96184m().getText()) && (!o.isPresent() || ((C2332ag) o.get()).mo3842a() == k.a);
            LogoView logoView = this.f299598u;
            logoView.getClass();
            if (true != z) {
                i = 8;
            }
            logoView.setVisibility(i);
        }
    }

    /* renamed from: H */
    public final void mo96109H() {
        Editable text = mo96184m().getText();
        e eVar = mo96131aD() ? e.Q : e.S;
        C59568x xVar = (C59568x) C59569y.f158066g.createBuilder();
        int length = text.length();
        xVar.copyOnWrite();
        C59569y yVar = (C59569y) xVar.instance;
        yVar.f158068a |= 1;
        yVar.f158069b = length;
        xVar.copyOnWrite();
        C59569y yVar2 = (C59569y) xVar.instance;
        yVar2.f158068a |= 2;
        yVar2.f158070c = "LEGACY_OPA";
        if (mo96131aD()) {
            com.google.android.apps.gsa.assistant.shared.p.m l = mo96183l();
            if (l != null) {
                l.o(text.toString());
                C59450aa e = l.e();
                xVar.copyOnWrite();
                C59569y yVar3 = (C59569y) xVar.instance;
                e.getClass();
                yVar3.f158072e = e;
                yVar3.f158068a |= 32;
            }
        } else {
            ((C107662av) this.f299593p.mo27525b()).mo96206b(C89849ae.AGSA_TEXT_OPA_QUERY_SUBMIT, Optional.empty(), Optional.m71637of((C59569y) xVar.build()));
        }
        mo96110I(text, C58836b.f156633a, eVar, C58833ax.m90834k((C59569y) xVar.build()), C58836b.f156633a);
    }

    /* renamed from: I */
    public final void mo96110I(CharSequence charSequence, C58833ax axVar, e eVar, C58833ax axVar2, C58833ax axVar3) {
        m178577bj(0);
        C110434i iVar = this.f299522aE;
        C60456qs a = iVar != null ? iVar.mo98665a(aod.ENTER_KEY) : null;
        if (this.f299553aj.mo56113h()) {
            C108100a aVar = (C108100a) this.f299553aj.mo56107c();
            C48247bd bdVar = this.f299509R;
            if (bdVar == null) {
                bdVar = C48247bd.f124805e;
            }
            aVar.f300695i = bdVar;
            this.f299509R = null;
        }
        if (!C58879cp.m90962d(charSequence.toString()) && this.f299595r != null) {
            if (this.f299546ac) {
                mo96104C(false);
            } else if (this.f299582e.mo79746e(C90014bt.f247716mR)) {
                mo96152ad(false, 1);
            }
            if (((C108100a) this.f299553aj.mo56107c()).f300689c == C51211f.SUGGESTION_CHIP) {
                ((C108100a) this.f299553aj.mo56107c()).f300689c = C51211f.MANUAL;
            }
            mo96111J();
            C107658ar arVar = this.f299595r;
            arVar.getClass();
            C108797ea eaVar = (C108797ea) arVar;
            C109040fj fjVar = eaVar.f302536a;
            fjVar.f303282ap = true;
            fjVar.f303320ba.f315402l = eVar;
            C11300h hVar = fjVar.f303310bQ;
            if (hVar == null || !hVar.mo19704H(charSequence.toString(), (String) null)) {
                eaVar.f302536a.mo97543p(charSequence.toString(), true, true);
            } else {
                C58976aa aaVar = C58975e.f156826a;
            }
            C109040fj fjVar2 = eaVar.f302536a;
            fjVar2.f303344by = false;
            Bundle g = fjVar2.mo97535g();
            g.putInt("android.opa.extra.TRIGGERED_BY", eVar.ca);
            g.putInt("android.opa.extra.CLIENT_MODALITY_OVERRIDE", C51305cu.TYPING_MODALITY.f133565f);
            C113855cj k = C113858cm.m188476k();
            k.mo100705c(charSequence);
            k.mo100706d(QueryTriggerType.OPA_TEXT_EDITOR);
            C113890u uVar = (C113890u) k;
            uVar.f315323b = g;
            if (a != null) {
                uVar.f315325d = C58833ax.m90834k(a);
            }
            if (axVar.mo56113h()) {
                uVar.f315324c = C58833ax.m90834k(C113889t.m188535a((String) axVar.mo56107c()));
            }
            if (axVar2.mo56113h()) {
                uVar.f315327f = C58833ax.m90834k((C59569y) axVar2.mo56107c());
            }
            if (axVar3.mo56113h()) {
                uVar.f315328g = C58833ax.m90834k((C59529cz) axVar3.mo56107c());
            }
            eaVar.f302536a.mo97548u(k.mo100703a());
            eaVar.f302536a.mo97444aF(charSequence.toString());
            mo96195w();
            mo96122U();
        }
    }

    /* renamed from: J */
    public final void mo96111J() {
        if (mo96131aD()) {
            C107658ar arVar = this.f299595r;
            arVar.getClass();
            arVar.mo96199a();
        }
        mo96193u();
        h k = mo96182k();
        if (k != null) {
            k.b(com.google.android.apps.gsa.assistant.shared.p.e.f);
        }
    }

    /* renamed from: K */
    public final void mo96112K() {
        C58976aa aaVar = C58975e.f156826a;
        h k = mo96182k();
        if (k != null) {
            if (((C58833ax) this.f299592o.mo27525b()).mo56113h()) {
                ((C113388b) ((C58833ax) this.f299592o.mo27525b()).mo56107c()).mo99681p(4);
            }
            ((C107662av) this.f299593p.mo27525b()).mo96210f(6);
            k.c(true);
        }
    }

    /* renamed from: L */
    public final void mo96113L() {
        ((C109711mp) this.f299588k).f305657g = true;
    }

    /* renamed from: M */
    public final void mo96114M() {
        C58976aa aaVar = C58975e.f156826a;
        h k = mo96182k();
        if (k != null) {
            if (((C58833ax) this.f299592o.mo27525b()).mo56113h()) {
                ((C113388b) ((C58833ax) this.f299592o.mo27525b()).mo56107c()).mo99681p(5);
            }
            ((C107662av) this.f299593p.mo27525b()).mo96210f(5);
            k.c(true);
            if (mo96183l() != null && ((C58833ax) this.f299594q.mo27525b()).mo56113h()) {
                ((C113389c) ((C58833ax) this.f299594q.mo27525b()).mo56107c()).mo99634i();
            }
        }
        if (this.f299582e.mo79746e(C90014bt.f247743ms)) {
            ((C109711mp) this.f299588k).f305654d = true;
        }
    }

    /* renamed from: N */
    public final void mo96115N(boolean z) {
        this.f299588k.mo76916c(z);
    }

    /* renamed from: O */
    public final void mo96116O(boolean z) {
        h k = mo96182k();
        if (z && k != null) {
            k.c(false);
        }
    }

    /* renamed from: P */
    public final void mo96117P() {
        C88523c cVar = this.f299545ab;
        if (cVar != null) {
            cVar.mo82151g();
        }
    }

    /* renamed from: Q */
    public final void mo96118Q(String str, C51211f fVar) {
        mo96145aR(str, 2, fVar);
    }

    /* renamed from: R */
    public final void mo96119R(String str, C51211f fVar, C51656n nVar) {
        mo96147aT(str, new C90735as(-1, -1), C58836b.f156633a, 2, fVar, nVar);
    }

    /* renamed from: S */
    public final void mo96120S(String str, C90735as asVar, C58833ax axVar, C51211f fVar) {
        mo96147aT(str, asVar, axVar, 2, fVar, (C51656n) null);
    }

    /* renamed from: T */
    public final void mo96121T(String str, C90735as asVar, C58833ax axVar, C51211f fVar, C51656n nVar) {
        mo96147aT(str, asVar, axVar, 2, fVar, nVar);
    }

    /* renamed from: U */
    public final void mo96122U() {
        C41703c cVar = this.f299498G;
        if (cVar != null) {
            cVar.mo44285f();
        }
        this.f299499H = false;
        C110434i iVar = this.f299522aE;
        if (iVar != null) {
            C110427b bVar = (C110427b) iVar;
            if (bVar.mo98667c()) {
                C58976aa aaVar = C58975e.f156826a;
                if (!bVar.mo98667c() || bVar.f307819j == null) {
                    bVar.f307824o = true;
                } else {
                    bVar.mo98666b();
                }
            }
        }
    }

    /* renamed from: V */
    public final void mo96123V(String str) {
        com.google.android.apps.gsa.assistant.shared.p.m l = mo96183l();
        if (l != null) {
            l.q(str);
            mo96163ao(0);
        }
    }

    /* renamed from: W */
    public final void mo96124W(boolean z) {
        this.f299568ay = z;
    }

    /* renamed from: X */
    public final void mo96125X() {
        ((C109711mp) this.f299588k).f305660j.mo28225e(1, false);
    }

    /* renamed from: Y */
    public final void mo96126Y(C108237bh bhVar) {
        this.f299539aV = bhVar;
        View findViewById = this.f299586i.findViewById(R.id.opa_search_plate);
        if (findViewById != null) {
            if (this.f299578bi.mo93971b()) {
                findViewById.setBackgroundColor(C19391a.m36980a(this.f299580c, 16842801));
            } else {
                findViewById.setBackgroundColor(bhVar.mo96635H());
            }
        }
        mo96167as();
    }

    /* renamed from: Z */
    public final void mo96127Z(boolean z) {
        if (!((C113191cv) this.f299511T.mo27525b()).mo99907c()) {
            if ((!mo96137aJ() && !mo96172ax()) || mo96176c()) {
                return;
            }
            if (this.f299503L && !this.f299502K && !mo96137aJ()) {
                return;
            }
            if (!mo96140aM() || !z || this.f299582e.mo79746e(C90014bt.f247792no)) {
                C58976aa aaVar = C58975e.f156826a;
                ((C107662av) this.f299593p.mo27525b()).mo96205a(C89849ae.AGSA_TEXT_OPA_UI_DRAWN);
                SuggestionGridLayout suggestionGridLayout = this.f299495D;
                if (suggestionGridLayout != null) {
                    suggestionGridLayout.setVisibility(0);
                }
                C107658ar arVar = this.f299595r;
                if (arVar != null) {
                    arVar.mo96201c(true);
                }
                if (mo96140aM()) {
                    FrameLayout frameLayout = this.f299527aJ;
                    if (frameLayout != null) {
                        frameLayout.getLayoutParams().height = -1;
                    }
                    LinearLayout linearLayout = this.f299528aK;
                    if (linearLayout != null) {
                        linearLayout.getLayoutParams().height = -1;
                    }
                    m178575bh(C1878d.m5128a(this.f299580c, R.color.type_modal_autocomplete_dimmed_background));
                }
            }
        }
    }

    /* renamed from: aA */
    public final boolean mo96128aA() {
        return this.f299568ay;
    }

    /* renamed from: aB */
    public final boolean mo96129aB() {
        return mo96177e() == 0 || mo96177e() == 2;
    }

    /* renamed from: aC */
    public final boolean mo96130aC() {
        return this.f299542aY != null && this.f299543aZ != null && this.f299582e.mo79746e(C90063do.f249545fZ) && this.f299582e.mo79746e(C90014bt.f247716mR) && ((C113191cv) this.f299511T.mo27525b()).mo99907c() && !this.f299530aM;
    }

    /* renamed from: aD */
    public final boolean mo96131aD() {
        com.google.android.apps.gsa.assistant.shared.p.m l;
        if (m178580bm() && (l = mo96183l()) != null && l.y()) {
            return true;
        }
        return false;
    }

    /* renamed from: aE */
    public final boolean mo96132aE() {
        return ((C113191cv) this.f299511T.mo27525b()).mo99905a() && mo96182k() != null && m178564aW() == C48674ai.INTENT_LAUNCHER;
    }

    /* renamed from: aF */
    public final boolean mo96133aF() {
        Optional n = mo96185n();
        return n.isPresent() && !f.a.equals(((LiveData) n.get()).mo3842a());
    }

    /* renamed from: aG */
    public final boolean mo96134aG() {
        View view = this.f299603z;
        return view != null && this.f299529aL && view.getVisibility() == 0;
    }

    /* renamed from: aH */
    public final boolean mo96135aH() {
        C112078c k;
        C107658ar arVar;
        if (this.f299582e.mo79746e(C90063do.f249523fD) && ((C113191cv) this.f299511T.mo27525b()).mo99906b() && (k = mo96182k()) != null && !f.a.equals(k.f311251b.mo3842a()) && (arVar = this.f299595r) != null) {
            C108797ea eaVar = (C108797ea) arVar;
            if (!C109040fj.m181378bx(eaVar.f302536a.f303450o) || !((C113989h) ((C113988g) eaVar.f302536a.f303450o).mo100833bf().mo56107c()).mo100911dp()) {
                int inputType = mo96184m().getInputType();
                mo96184m().setInputType(0);
                this.f299584g.mo28213m("showSoftInput", this.f299582e.mo79743a(C90063do.f249599ga), new C107664b(this, inputType));
                return true;
            }
        }
        return false;
    }

    /* renamed from: aI */
    public final boolean mo96136aI() {
        return this.f299570ba;
    }

    /* renamed from: aJ */
    public final boolean mo96137aJ() {
        return this.f299507P && this.f299503L;
    }

    /* renamed from: aK */
    public final boolean mo96138aK() {
        return !mo96140aM() || this.f299582e.mo79746e(C90014bt.f247792no);
    }

    /* renamed from: aL */
    public final boolean mo96139aL(int i) {
        if (mo96177e() != i) {
            return true;
        }
        if (!mo96130aC() || i != 1 || m178563aV().equals(C83607e.EDIT_TEXT)) {
            return false;
        }
        return true;
    }

    /* renamed from: aM */
    public final boolean mo96140aM() {
        return this.f299502K || this.f299503L;
    }

    /* renamed from: aN */
    public final void mo96141aN(int i) {
        com.google.android.apps.gsa.assistant.shared.p.m l = mo96183l();
        if (l != null) {
            l.A(i);
        }
    }

    /* renamed from: aO */
    public final void mo96142aO() {
        this.f299499H = false;
    }

    /* renamed from: aP */
    public final void mo96143aP() {
    }

    /* renamed from: aQ */
    public final void mo96144aQ(int i) {
        C107698i iVar = this.f299583f;
        C88489j jVar = new C88489j(C87739bu.OPA_INPUT_MODE);
        C62940bt btVar = C88111po.f238214a;
        C88112pp ppVar = (C88112pp) C88115ps.f238216c.createBuilder();
        ppVar.copyOnWrite();
        C88115ps psVar = (C88115ps) ppVar.instance;
        psVar.f238219b = i - 1;
        psVar.f238218a |= 1;
        jVar.mo82014b(btVar, (C88115ps) ppVar.build());
        iVar.mo96219b(jVar.mo82013a());
    }

    /* renamed from: aR */
    public final void mo96145aR(String str, int i, C51211f fVar) {
        mo96147aT(str, new C90735as(-1, -1), C58836b.f156633a, i, fVar, (C51656n) null);
    }

    /* renamed from: aS */
    public final void mo96146aS(String str, C90735as asVar, C58833ax axVar, int i, C51211f fVar) {
        mo96147aT(str, asVar, axVar, i, fVar, (C51656n) null);
    }

    /* renamed from: aT */
    public final void mo96147aT(String str, C90735as asVar, C58833ax axVar, int i, C51211f fVar, C51656n nVar) {
        C88523c cVar;
        if (nVar != null) {
            this.f299517Z = nVar;
        }
        if (this.f299582e.mo79746e(C90029ch.f248304s) && (cVar = this.f299545ab) != null) {
            cVar.mo82145a();
        }
        ((C108100a) this.f299553aj.mo56107c()).f300689c = fVar;
        if (!mo96134aG()) {
            mo96163ao(1);
        }
        h k = mo96182k();
        if (axVar.mo56113h() && !((List) axVar.mo56107c()).isEmpty()) {
            m178586bs(str, asVar, (List) axVar.mo56107c(), i, k);
        } else if (!this.f299582e.mo79746e(C90063do.f249278aX) || !axVar.mo56113h() || !((List) axVar.mo56107c()).isEmpty()) {
            ((C107662av) this.f299593p.mo27525b()).mo96210f(3);
            if (mo96183l() != null && ((C58833ax) this.f299594q.mo27525b()).mo56113h()) {
                ((C113389c) ((C58833ax) this.f299594q.mo27525b()).mo56107c()).mo99634i();
            }
            m178568ba(k, m178582bo());
            m178587bt(str, asVar, i, false);
        } else {
            m178586bs(str, asVar, (List) axVar.mo56107c(), i, k);
        }
    }

    /* renamed from: aU */
    public final void mo96148aU(int i) {
        C58976aa aaVar = C58975e.f156826a;
        this.f299588k.mo76919g(i & -8193);
    }

    /* renamed from: aa */
    public final void mo96149aa(boolean z) {
        FrameLayout frameLayout = this.f299521aD;
        if (frameLayout != null) {
            frameLayout.setVisibility(true != z ? 8 : 0);
            m178570bc();
        }
    }

    /* renamed from: ab */
    public final void mo96150ab(boolean z) {
        View view = this.f299493B;
        if (view != null) {
            int i = 0;
            boolean z2 = z && view.getVisibility() != 0;
            View view2 = this.f299493B;
            if (true != z) {
                i = 8;
            }
            view2.setVisibility(i);
            if (z2) {
                m178567aZ();
            }
        }
        m178570bc();
    }

    /* renamed from: ac */
    public final void mo96151ac(boolean z) {
        mo96152ad(z, 1);
    }

    /* renamed from: ad */
    public final void mo96152ad(boolean z, int i) {
        this.f299505N.mo101383a();
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            if (this.f299582e.mo79746e(C90014bt.f247147bf)) {
                mo96103B((C110428c) this.f299590m.mo27525b());
            }
            this.f299570ba = true;
            OpaEditText m = mo96184m();
            m.requestFocus();
            m.setInputType(i);
            if (!mo96135aH()) {
                this.f299584g.mo28212l("showSoftInput", new C107668f(this, m));
            }
            if (mo96137aJ() || ((C113191cv) this.f299511T.mo27525b()).mo99907c()) {
                return;
            }
            if (!TextUtils.isEmpty(m.getText()) || mo96138aK()) {
                mo96162an();
                mo96127Z(TextUtils.isEmpty(m.getText()));
                return;
            }
            return;
        }
        this.f299570ba = false;
        if (this.f299529aL) {
            mo96184m().clearFocus();
        }
        this.f299585h.hideSoftInputFromWindow(this.f299586i.getWindowToken(), 0);
        mo96195w();
        mo96106E();
        mo96105D(com.google.android.apps.gsa.assistant.shared.p.e.h);
    }

    /* renamed from: ae */
    public final void mo96153ae(boolean z) {
        ImageView imageView = this.f299597t;
        if (imageView != null) {
            imageView.setVisibility(true != z ? 8 : 0);
            m178570bc();
            if (this.f299516Y != null && z && m178584bq()) {
                new C90873ag(this.f299516Y.f.a(), this.f299584g, "isThrottlingConditionMetFuture", new C107684v(this)).mo85223a(C107685w.f299683a);
            }
        }
    }

    /* renamed from: af */
    public final void mo96154af() {
        com.google.android.apps.gsa.assistant.shared.p.m l = mo96183l();
        if (l != null && !((C113191cv) this.f299511T.mo27525b()).mo99906b()) {
            l.s();
        }
    }

    /* renamed from: ag */
    public final void mo96155ag() {
        boolean z = false;
        this.f299568ay = false;
        if (!mo96130aC()) {
            if (mo96177e() == 0 && !this.f299525aH) {
                z = true;
            }
            mo96153ae(z);
            mo96149aa(z);
            mo96150ab(z);
        } else if (mo96177e() == 0) {
            mo96164ap(C83607e.CENTER_MIC_INPUT_CHIP);
        }
        mo96168at();
    }

    /* renamed from: ah */
    public final void mo96156ah() {
        this.f299568ay = true;
        mo96153ae(true);
        mo96150ab(true);
        mo96149aa(true);
        mo96168at();
    }

    /* renamed from: ai */
    public final void mo96157ai(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (!((C58833ax) this.f299562as.mo27525b()).mo56113h() || !((C113583z) ((C58833ax) this.f299562as.mo27525b()).mo56107c()).mo100316a() || mo96177e() != 1) {
            if (this.f299582e.mo79746e(C90060dl.f249192d)) {
                if (i == 2) {
                    m178573bf(R.raw.opa_searchplate_open_mic);
                } else if (i == 4 || i == 5) {
                    m178573bf(R.raw.opa_searchplate_close_mic);
                }
            }
            this.f299588k.mo76915b(i);
        } else {
            if (i == 1 || i == 2) {
                this.f299537aT = true;
                com.google.android.apps.gsa.assistant.shared.p.m l = mo96183l();
                if (l != null && l.y()) {
                    l.t();
                }
            } else if (i != 4) {
                if (i == 5 && this.f299537aT) {
                    this.f299537aT = false;
                    mo96141aN(2);
                }
            }
            this.f299588k.mo76915b(i);
        }
        m178577bj(i);
        if (i == 2 || i == 3 || i == 4 || i == 10) {
            C113854ci ciVar = (C113854ci) this.f299557an.mo27525b();
            ciVar.mo100700a(1, C89849ae.OPA_ANDROID_STARTUP_MIC_UI_OPEN);
            if (ciVar.f315273f.mo56113h()) {
                ((C89922b) ciVar.f315273f.mo56107c()).mo83760d();
                ciVar.f315274g.mo41634h();
                C31499r.f84816a.mo37197a((Activity) null);
            }
        }
    }

    /* renamed from: aj */
    public final void mo96158aj() {
        View view = this.f299596s;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: ak */
    public final void mo96159ak(EditText editText, int i) {
        if (mo96177e() != 0 && mo96134aG() && this.f299570ba && i <= 10) {
            boolean showSoftInput = this.f299585h.showSoftInput(editText, 1);
            C58976aa aaVar = C58975e.f156826a;
            if (!showSoftInput) {
                this.f299584g.mo28213m("showSoftInput", 200, new C107639a(this, editText, i));
            }
        }
    }

    /* renamed from: al */
    public final void mo96160al() {
        if (this.f299577bh != null && !m178584bq()) {
            this.f299577bh.b();
        }
    }

    /* renamed from: am */
    public final void mo96161am() {
        View view = this.f299603z;
        if (view != null && this.f299520aC != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            this.f299520aC.setVisibility(0);
            marginLayoutParams.leftMargin = this.f299580c.getResources().getDimensionPixelSize(R.dimen.type_container_margin_left);
            marginLayoutParams.setMarginStart(this.f299580c.getResources().getDimensionPixelSize(R.dimen.type_container_margin_left));
            View view2 = this.f299603z;
            view2.getClass();
            view2.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: an */
    public final void mo96162an() {
        com.google.android.apps.gsa.assistant.shared.p.m l = mo96183l();
        if ((mo96173ay() && (!this.f299530aM || l == null)) || mo96137aJ()) {
            return;
        }
        if (!this.f299503L || this.f299502K || l != null) {
            C58976aa aaVar = C58975e.f156826a;
            if (mo96172ax() || l != null) {
                String obj = mo96184m().getText().toString();
                this.f299499H = true;
                if (mo96172ax()) {
                    this.f299494C = Query.f252741b.mo84484m().mo84245H(0, false, (QueryTriggerType) null).mo84268aE(obj, false);
                    C107698i iVar = this.f299583f;
                    C88489j jVar = new C88489j(C87739bu.QUERY_EDIT);
                    jVar.mo82015c(this.f299494C);
                    iVar.mo96219b(jVar.mo82013a());
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r8v9, types: [com.google.android.libraries.gsa.logoview.am, com.google.android.apps.gsa.opa.aj] */
    /* renamed from: ao */
    public final void mo96163ao(int i) {
        View findViewById;
        int i2;
        View view;
        this.f299524aG.mo5708l(Integer.valueOf(i));
        if (i == 1) {
            if (!this.f299529aL) {
                m178566aY();
            }
            if (mo96130aC()) {
                mo96164ap(C83607e.EDIT_TEXT);
            } else {
                this.f299588k.mo76917e(false);
                View view2 = this.f299603z;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ImageView imageView = this.f299597t;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                m178565aX();
                mo96149aa(false);
            }
            LogoView logoView = this.f299598u;
            if (logoView != null) {
                logoView.setOnClickListener(this.f299566aw);
                mo96108G();
            }
            m178570bc();
            m178569bb();
            mo96144aQ(2);
        } else {
            ? r8 = this.f299588k;
            C109711mp mpVar = r8;
            LogoView logoView2 = mpVar.f305652b;
            if (logoView2 != null) {
                mpVar.mo76917e(false);
                mpVar.f305660j = logoView2;
                mpVar.f305660j.setOnClickListener(mpVar.f305653c);
                mpVar.f305660j.mo28224d(r8);
                LogoView logoView3 = mpVar.f305660j;
                logoView3.f63000g.mo28247c(mpVar.f305658h, 2);
                mpVar.mo76917e(true);
                if (mo96130aC()) {
                    mo96164ap(C83607e.CENTER_MIC_INPUT_CHIP);
                } else {
                    if (this.f299529aL && (view = this.f299603z) != null) {
                        view.setVisibility(8);
                    }
                    if (!this.f299525aH) {
                        ImageView imageView2 = this.f299597t;
                        if (imageView2 != null) {
                            imageView2.setVisibility(0);
                            mo96149aa(true);
                        }
                        if (((C113191cv) this.f299511T.mo27525b()).mo99907c()) {
                            mo96150ab(true);
                        }
                    }
                    m178565aX();
                }
                mo96152ad(false, 1);
                m178570bc();
                m178569bb();
                ((C109711mp) this.f299588k).f305660j.requestFocus();
                mo96144aQ(1);
            } else {
                throw new IllegalStateException("Can't switch to null logo view. logoViewFor=0");
            }
        }
        m178571bd();
        mo96170av();
        if (C113987f.m188690a(this.f299582e) && (findViewById = this.f299586i.findViewById(R.id.opa_search_plate)) != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (mo96177e() == 0) {
                i2 = this.f299580c.getResources().getDimensionPixelSize(R.dimen.opa_search_plate_height_v2);
            } else {
                i2 = this.f299580c.getResources().getDimensionPixelSize(R.dimen.opa_search_plate_height);
            }
            layoutParams.height = i2;
        }
        m178579bl();
        C107658ar arVar = this.f299595r;
        if (arVar != null) {
            int e = mo96177e();
            C108797ea eaVar = (C108797ea) arVar;
            if (C109040fj.m181378bx(eaVar.f302536a.f303450o)) {
                ((C113989h) ((C113988g) eaVar.f302536a.f303450o).mo100833bf().mo56107c()).mo100889cd(e);
            }
            C109040fj fjVar = eaVar.f302536a;
            if (fjVar.f303371cc) {
                if (e == 1) {
                    ((C107759j) fjVar.f303375cg.mo27525b()).mo96269e();
                    eaVar.f302536a.f303376ch.mo83139m(true);
                } else {
                    fjVar.f303376ch.mo83139m(false);
                }
                eaVar.f302536a.mo97511bc();
            }
            if (e == 1) {
                eaVar.f302536a.mo97490az(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ap */
    public final void mo96164ap(C83607e eVar) {
        if (mo96130aC() && !m178563aV().equals(eVar)) {
            this.f299541aX.mo5708l(eVar);
            m178571bd();
            mo96170av();
            m178565aX();
            C88244um umVar = C88244um.ATTACH_WEBVIEW;
            int ordinal = eVar.ordinal();
            if (ordinal == 1) {
                m178578bk(true, false, false, false, false, false, false);
            } else if (ordinal == 2) {
                if (this.f299582e.mo79746e(C90014bt.f247716mR)) {
                    mo96152ad(false, 1);
                }
                mo96171aw(true);
                m178578bk(false, true, false, false, false, false, false);
            } else if (ordinal == 3) {
                mo96171aw(false);
                m178578bk(false, false, true, true, false, true, true);
            } else if (ordinal == 4) {
                boolean z = !this.f299525aH;
                m178578bk(false, true, false, false, z, z, z);
            }
        }
    }

    /* renamed from: aq */
    public final void mo96165aq(boolean z) {
        C109711mp mpVar = (C109711mp) this.f299588k;
        if (mpVar.f305655e != z) {
            mpVar.f305655e = z;
            if (z) {
                mpVar.f305654d = true;
            }
            mpVar.mo98042h(mpVar.f305659i);
        }
    }

    /* renamed from: ar */
    public final void mo96166ar(String str, String str2) {
        com.google.android.apps.gsa.assistant.shared.p.m l = mo96183l();
        if (l != null) {
            l.u(str, str2);
        }
    }

    /* renamed from: as */
    public final void mo96167as() {
        this.f299603z = this.f299586i.findViewById(R.id.type_container);
        this.f299600w = (ImageButton) this.f299586i.findViewById(R.id.clear_button);
        boolean aF = mo96133aF();
        View view = this.f299603z;
        if (view != null) {
            int i = 0;
            if (!mo96132aE()) {
                if (mo96133aF() && !((C113191cv) this.f299511T.mo27525b()).mo99906b() && !((C113191cv) this.f299511T.mo27525b()).mo99909e()) {
                    i = C1878d.m5128a(this.f299580c, R.color.tapas_malaga_search_plate_color);
                } else if (this.f299578bi.mo93971b()) {
                    i = C19391a.m36980a(this.f299580c, 16842801);
                } else {
                    C108237bh bhVar = this.f299539aV;
                    if (bhVar != null) {
                        i = bhVar.mo96635H();
                    }
                }
            }
            view.setBackgroundColor(i);
        }
        ImageButton imageButton = this.f299600w;
        if (imageButton != null) {
            imageButton.setImageResource(true != aF ? R.drawable.quantum_ic_close_black_24 : R.drawable.quantum_ic_close_grey600_24);
        }
        mo96170av();
    }

    /* renamed from: at */
    public final void mo96168at() {
        Boolean bool = this.f299602y;
        if (bool == null) {
            C22871g gVar = this.f299550ag;
            C27683a aVar = (C27683a) this.f299551ah.mo27525b();
            Objects.requireNonNull(aVar);
            C90873ag agVar = new C90873ag(C90877ak.m148471e(gVar.mo28201a("check Lens capability", new C107675m(aVar)), this.f299582e.mo79743a(C89997bc.f246779B), TimeUnit.MILLISECONDS, this.f299550ag), this.f299584g, "set launcher icon visibility based on Lens capability", new C107676n(this));
            agVar.mo85224b(TimeoutException.class, C107677o.f299675a);
            agVar.mo85223a(C107678p.f299676a);
            return;
        }
        mo96169au(bool.booleanValue());
    }

    /* renamed from: au */
    public final void mo96169au(boolean z) {
        if (this.f299601x != null && !z) {
            int dimensionPixelSize = this.f299580c.getResources().getDimensionPixelSize(R.dimen.opa_search_plate_inner_fab_container_left_margin);
            FrameLayout frameLayout = this.f299601x;
            frameLayout.getClass();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            int i = 0;
            if (true == this.f299568ay) {
                dimensionPixelSize = 0;
            }
            layoutParams.leftMargin = dimensionPixelSize;
            layoutParams.gravity = true != this.f299568ay ? 8388691 : 81;
            FrameLayout frameLayout2 = this.f299601x;
            frameLayout2.getClass();
            frameLayout2.requestLayout();
            ImageView imageView = this.f299597t;
            if (imageView != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
                if (!this.f299568ay) {
                    i = this.f299580c.getResources().getDimensionPixelOffset(R.dimen.keyboard_toggle_icon_right_margin);
                }
                layoutParams2.rightMargin = i;
            }
        }
    }

    /* renamed from: av */
    public final void mo96170av() {
        View findViewById = this.f299586i.findViewById(R.id.search_plate_separator);
        View findViewById2 = this.f299586i.findViewById(R.id.search_plate_bottom_separator);
        if (findViewById != null) {
            if (m178583bp() || this.f299587j.getVisibility() == 0) {
                findViewById.setVisibility(8);
            } else {
                findViewById.setVisibility(0);
            }
        }
        if (findViewById2 == null) {
            return;
        }
        if (m178583bp()) {
            findViewById2.setVisibility(8);
        } else {
            findViewById2.setVisibility(0);
        }
    }

    /* renamed from: aw */
    public final void mo96171aw(boolean z) {
        C109711mp mpVar = (C109711mp) this.f299588k;
        if (mpVar.f305656f != z) {
            mpVar.f305656f = z;
            mpVar.mo98042h(mpVar.f305659i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ax */
    public final boolean mo96172ax() {
        return ((C113884o) this.f299558ao.mo27525b()).mo100742a() && this.f299496E && !this.f299538aU.f300678a;
    }

    /* renamed from: ay */
    public final boolean mo96173ay() {
        if (!this.f299552ai.mo56113h() || !((C106171l) this.f299552ai.mo56107c()).f296306d) {
            return false;
        }
        boolean isDeviceLocked = ((C106171l) this.f299552ai.mo56107c()).f296304b.f230023b.isDeviceLocked();
        C58976aa aaVar = C58975e.f156826a;
        return isDeviceLocked;
    }

    /* renamed from: az */
    public final boolean mo96174az() {
        ImageView imageView = this.f299597t;
        return imageView != null && imageView.getVisibility() == 0;
    }

    /* renamed from: b */
    public final boolean mo96175b(Intent intent) {
        String dataString = intent.getDataString();
        if (dataString == null || !dataString.startsWith("opa-android://launch_keyboard")) {
            return false;
        }
        Uri data = intent.getData();
        String queryParameter = data.getQueryParameter("query");
        String queryParameter2 = data.getQueryParameter("start");
        String queryParameter3 = data.getQueryParameter("end");
        if (queryParameter == null) {
            mo96145aR(BuildConfig.FLAVOR, 2, C51211f.SUGGESTION_CHIP);
            return true;
        } else if (queryParameter2 == null || queryParameter3 == null) {
            mo96145aR(queryParameter, 2, C51211f.SUGGESTION_CHIP);
            return true;
        } else {
            try {
                mo96147aT(queryParameter, new C90735as(Integer.parseInt(queryParameter2), Integer.parseInt(queryParameter3)), C58836b.f156633a, 2, C51211f.SUGGESTION_CHIP, (C51656n) null);
                return true;
            } catch (NumberFormatException unused) {
                C59104x c = f299490a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OpaSearchPlateCtl");
                ((C59052c) ((C59052c) c).mo56372aa(26042)).mo56386p("Keyboard intent query parameters malformed: start or end is not a number");
                return false;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo96176c() {
        SuggestionGridLayout suggestionGridLayout = this.f299495D;
        return suggestionGridLayout != null && suggestionGridLayout.getVisibility() == 0;
    }

    /* renamed from: e */
    public final int mo96177e() {
        Integer num = (Integer) this.f299524aG.mo3842a();
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: f */
    public final int mo96178f() {
        if (mo96132aE()) {
            return this.f299580c.getResources().getDimensionPixelOffset(R.dimen.intent_launcher_opa_icon_margin_start);
        }
        return this.f299580c.getResources().getDimensionPixelOffset(R.dimen.tapas_opa_icon_margin_start);
    }

    /* renamed from: g */
    public final int mo96179g() {
        if (mo96132aE()) {
            return this.f299580c.getResources().getDimensionPixelOffset(R.dimen.intent_launcher_opa_icon_size);
        }
        return this.f299580c.getResources().getDimensionPixelOffset(R.dimen.tapas_opa_icon_size);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("OpaSearchPlateCtl");
        fVar.mo85279c("IsTypeInputVisible").mo85276a(C90752i.m148228b(Boolean.valueOf(mo96134aG())));
        fVar.mo85279c("IsMicVisible").mo85276a(C90752i.m148228b(Boolean.valueOf(mo96129aB())));
        fVar.mo85279c("CurrentInputModality").mo85276a(C90752i.m148230d(Integer.valueOf(mo96177e())));
        fVar.mo85279c("IsAutoCompleteContainerShown").mo85276a(C90752i.m148228b(Boolean.valueOf(mo96176c())));
        fVar.mo85279c("IsEditingQuery").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f299499H)));
        fVar.mo85288o("QueryBeingEditing", this.f299494C);
        fVar.mo85286m(this.f299588k);
        com.google.android.apps.gsa.assistant.shared.p.m l = mo96183l();
        if (l != null) {
            fVar.mo85286m(l);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final View mo96180h() {
        if (this.f299569az == null) {
            this.f299569az = this.f299586i.findViewById(R.id.opa_search_plate);
        }
        return this.f299569az;
    }

    /* renamed from: hX */
    public final /* bridge */ /* synthetic */ void mo774hX(Object obj) {
        C108228az azVar = (C108228az) obj;
        if (this.f299582e.mo79746e(C90014bt.f247462hc)) {
            C108228az azVar2 = C108228az.IS_THINKING;
            int i = 8;
            this.f299587j.setVisibility(azVar != azVar2 ? 8 : 0);
            View view = this.f299596s;
            if (view != null) {
                if (azVar != azVar2) {
                    i = 0;
                }
                view.setVisibility(i);
            }
            mo96170av();
        }
        if (mo96130aC() && mo96177e() == 1) {
            if (azVar == C108228az.IS_THINKING && m178563aV().equals(C83607e.EDIT_TEXT)) {
                mo96164ap(C83607e.THINKING);
            }
            if (azVar == C108228az.IS_NOT_THINKING && m178563aV().equals(C83607e.THINKING)) {
                mo96164ap(C83607e.CENTER_KEYBOARD_INPUT_CHIP);
            }
        }
    }

    /* renamed from: i */
    public final ViewGroup mo96181i() {
        return this.f299586i;
    }

    /* renamed from: j */
    public final LiveData mo96082j() {
        return this.f299504M;
    }

    /* renamed from: k */
    public final h mo96182k() {
        if (!((C113191cv) this.f299511T.mo27525b()).mo99907c() || m178581bn()) {
            return null;
        }
        h hVar = this.f299510S;
        if (hVar != null) {
            return hVar;
        }
        this.f299510S = new C112078c(new C107650aj(this), this.f299560aq, this.f299582e, m178564aW());
        if (mo96130aC()) {
            C112078c cVar = this.f299510S;
            C2332ag agVar = this.f299541aX;
            C112078c cVar2 = cVar;
            cVar2.f311256g = agVar;
            agVar.mo5704e(cVar2.f311250a, new C112076a(cVar2));
        } else {
            C112078c cVar3 = this.f299510S;
            C2332ag agVar2 = this.f299524aG;
            C112078c cVar4 = cVar3;
            cVar4.f311255f = agVar2;
            agVar2.mo5704e(cVar4.f311250a, new C112077b(cVar4));
        }
        C107645ae aeVar = new C107645ae(this);
        this.f299547ad.mo96220c(aeVar, C88244um.NOTIFY_ASSISTANT_CONVERSATION_ONGOING);
        ((C113197da) this.f299540aW.mo27525b()).f313530a = Optional.m71637of(this.f299510S.f311251b);
        return this.f299510S;
    }

    /* renamed from: l */
    public final com.google.android.apps.gsa.assistant.shared.p.m mo96183l() {
        int i;
        if (!((C113191cv) this.f299511T.mo27525b()).mo99907c()) {
            C58976aa aaVar = C58975e.f156826a;
            return null;
        } else if (m178581bn()) {
            C58976aa aaVar2 = C58975e.f156826a;
            return null;
        } else {
            C112078c k = mo96182k();
            if (k == null) {
                C58976aa aaVar3 = C58975e.f156826a;
                return null;
            } else if (k.f311252c) {
                if (((C113191cv) this.f299511T.mo27525b()).mo99907c() && !m178580bm()) {
                    if (!this.f299561ar.mo56113h()) {
                        C59104x c = f299490a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "OpaSearchPlateCtl");
                        ((C59052c) ((C59052c) c).mo56372aa(26031)).mo56386p("Tapas entry point optional not available despite Tapas being available.");
                    } else {
                        C59104x b = f299490a.mo56224b();
                        b.mo56378ag(C58975e.f156826a, "OpaSearchPlateCtl");
                        ((C59052c) ((C59052c) b).mo56372aa(26030)).mo56386p("Starting to init Tapas");
                        if (((C58833ax) this.f299592o.mo27525b()).mo56113h()) {
                            ((C113388b) ((C58833ax) this.f299592o.mo27525b()).mo56107c()).mo99673h();
                        }
                        Context context = this.f299580c;
                        if (this.f299578bi.mo93970a()) {
                            i = 2132150871;
                        } else if (((C113191cv) this.f299511T.mo27525b()).mo99906b() || ((C113191cv) this.f299511T.mo27525b()).mo99909e()) {
                            i = (C82193a.m130503a(context) || !this.f299578bi.mo93971b()) ? 2132150873 : 2132150872;
                        } else {
                            i = 2132150870;
                        }
                        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
                        if (this.f299578bi.mo93970a()) {
                            Configuration configuration = new Configuration();
                            configuration.uiMode = (configuration.uiMode & -49) | 32;
                            contextThemeWrapper.applyOverrideConfiguration(configuration);
                        }
                        C107651ak akVar = new C107651ak(this);
                        C107655ao aoVar = new C107655ao(this);
                        C91097g gVar = this.f299559ap;
                        C2391v vVar = this.f299560aq;
                        C107698i iVar = this.f299583f;
                        C107710u uVar = this.f299547ad;
                        C113982a aVar = (C113982a) this.f299591n.mo27525b();
                        h k2 = mo96182k();
                        k2.getClass();
                        C107658ar arVar = this.f299595r;
                        C107649ai aiVar = new C107649ai(this);
                        C48674ai aW = m178564aW();
                        atu atu = (atu) ((C112071g) this.f299561ar.mo56107c()).f311246a.mo17428b();
                        atu.f204103a = akVar;
                        atu.f204104b = aoVar;
                        gVar.getClass();
                        atu.f204105c = gVar;
                        vVar.getClass();
                        atu.f204107e = vVar;
                        iVar.getClass();
                        atu.f204108f = iVar;
                        uVar.getClass();
                        atu.f204109g = uVar;
                        aVar.getClass();
                        atu.f204110h = aVar;
                        atu.f204111i = contextThemeWrapper;
                        atu.f204106d = k2;
                        atu.f204112j = arVar;
                        atu.f204113k = aiVar;
                        atu.mo68679b(aW);
                        C112070f a = atu.mo68678a();
                        this.f299563at = a;
                        a.mo65406a().p(this.f299513V);
                        SuggestionGridLayout suggestionGridLayout = (SuggestionGridLayout) this.f299586i.findViewById(R.id.auto_complete_grid);
                        this.f299495D = suggestionGridLayout;
                        this.f299586i.removeView(suggestionGridLayout);
                        this.f299536aS = this.f299580c.getResources().getDimensionPixelSize(R.dimen.opa_search_plate_height);
                        f299491b = ((C73841bf) this.f299565av.mo27525b()).mo65322a().getStringArray(R.array.opa_tapas_text_input_rotational_hints);
                        this.f299512U = (ImageView) this.f299586i.findViewById(R.id.search_plate_start_opa_icon_for_tapas);
                        mo96184m().setPadding(this.f299580c.getResources().getDimensionPixelOffset(R.dimen.tapas_type_container_padding_start), 0, 0, 0);
                        if (mo96132aE()) {
                            mo96184m().setTextSize(0, (float) this.f299580c.getResources().getDimensionPixelSize(R.dimen.intent_launcher_edit_text_size));
                            mo96184m().setTypeface(Typeface.create("google-sans-medium", 0));
                        }
                        if (this.f299582e.mo79746e(C90014bt.f247744mt)) {
                            Optional o = mo96186o();
                            if (o.isPresent()) {
                                ((C2332ag) o.get()).mo5704e(this.f299560aq, new C107669g(this));
                            }
                        }
                        C107658ar arVar2 = this.f299595r;
                        if (arVar2 != null) {
                            C108797ea eaVar = (C108797ea) arVar2;
                            if (C109040fj.m181378bx(eaVar.f302536a.f303450o) && ((C113191cv) eaVar.f302536a.f303380cl.mo27525b()).mo99907c()) {
                                C109040fj fjVar = eaVar.f302536a;
                                fjVar.f303384cp = fjVar.f303238X.mo96185n();
                                eaVar.f302536a.f303384cp.ifPresent(new C108790dx(eaVar));
                            }
                        }
                    }
                }
                if (m178580bm()) {
                    return this.f299563at.mo65406a();
                }
                C58976aa aaVar4 = C58975e.f156826a;
                return null;
            } else {
                C58976aa aaVar5 = C58975e.f156826a;
                return null;
            }
        }
    }

    /* renamed from: m */
    public final OpaEditText mo96184m() {
        if (!this.f299529aL) {
            m178566aY();
        }
        return (OpaEditText) this.f299586i.findViewById(R.id.input_text);
    }

    /* renamed from: n */
    public final Optional mo96185n() {
        return Optional.ofNullable(mo96182k()).map(C107682t.f299680a);
    }

    /* renamed from: o */
    public final Optional mo96186o() {
        return Optional.ofNullable(mo96183l()).map(C107680r.f299678a);
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals("inputMode")) {
            mo96163ao("typing".equals(this.f299581d.getString("inputMode", "voice")) ? 1 : 0);
        }
    }

    /* renamed from: p */
    public final OptionalInt mo96188p() {
        com.google.android.apps.gsa.assistant.shared.p.m l = mo96183l();
        if (l != null) {
            return OptionalInt.m71640of(l.a());
        }
        return OptionalInt.empty();
    }

    /* renamed from: q */
    public final void mo96189q(View view) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) this.f299580c.getResources().getDimension(R.dimen.search_plate_top_shadow_height));
        this.f299596s = view;
        this.f299586i.addView(view, 0, layoutParams);
    }

    /* renamed from: r */
    public final void mo96190r(ViewGroup viewGroup) {
        com.google.android.apps.gsa.assistant.shared.p.m l = mo96183l();
        if (l != null && viewGroup.findViewWithTag("TAPAS_VIEW_TAG") == null) {
            l.f(viewGroup, this.f299536aS);
            if (mo96132aE()) {
                ViewGroup viewGroup2 = this.f299526aI;
                ViewGroup viewGroup3 = (ViewGroup) l.b().findViewWithTag("SEARCH_PLATE_CONTAINER_IN_TAPAS");
                View findViewWithTag = viewGroup2.findViewWithTag("SEARCH_PLATE_CONTAINER");
                if (findViewWithTag != null) {
                    ViewParent parent = findViewWithTag.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(findViewWithTag);
                    }
                    if (viewGroup3 != null) {
                        viewGroup3.addView(findViewWithTag);
                    }
                }
                LogoView logoView = this.f299598u;
                if (logoView != null) {
                    logoView.setVisibility(8);
                }
                FrameLayout frameLayout = this.f299492A;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                ImageButton imageButton = this.f299599v;
                if (imageButton != null) {
                    imageButton.setVisibility(8);
                }
                View findViewById = this.f299586i.findViewById(R.id.opa_search_plate_explore_icon_container);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                mo96184m().setImeOptions(268435458);
            }
        }
    }

    /* renamed from: s */
    public final void mo96191s(ViewGroup viewGroup) {
        this.f299526aI = viewGroup;
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.opa_search_plate_container);
        this.f299527aJ = frameLayout;
        frameLayout.addView(this.f299586i);
        this.f299586i.requestLayout();
        if (C113987f.m188690a(this.f299582e)) {
            this.f299601x = (FrameLayout) viewGroup.findViewById(R.id.opa_search_plate_inner_fab_container);
            this.f299588k.mo76914a(viewGroup, R.id.opa_search_plate_inner_fab_container);
            int dimensionPixelSize = this.f299580c.getResources().getDimensionPixelSize(R.dimen.opa_search_plate_extras_icon_height);
            m178572be(viewGroup, "ZERO_STATE_BRICK_TAG", this.f299520aC, dimensionPixelSize);
            if (this.f299582e.mo79746e(C90014bt.f247767nP)) {
                ((FrameLayout.LayoutParams) this.f299520aC.getLayoutParams()).gravity = 8388627;
            }
            FrameLayout frameLayout2 = (FrameLayout) this.f299586i.findViewById(R.id.opa_search_plate_explore_icon_container);
            if (frameLayout2 != null) {
                m178572be(viewGroup, "EXPLORE_ICON_TAG", frameLayout2, dimensionPixelSize);
                if (this.f299582e.mo79746e(C90014bt.f247767nP)) {
                    ((FrameLayout.LayoutParams) frameLayout2.getLayoutParams()).gravity = 8388629;
                }
            }
        } else {
            ((C109711mp) this.f299588k).mo76914a(viewGroup, R.id.opa_fab_container);
        }
        m178579bl();
    }

    /* renamed from: t */
    public final void mo96192t() {
        C110434i iVar;
        C89202g gVar;
        if (mo96172ax() && (iVar = this.f299522aE) != null && (gVar = ((C110427b) iVar).f307820k) != null) {
            gVar.mo83155a();
        }
    }

    /* renamed from: u */
    public final void mo96193u() {
        this.f299514W = true;
        mo96184m().setText(BuildConfig.FLAVOR);
        this.f299514W = false;
    }

    /* renamed from: v */
    public final void mo96194v(Response response, boolean z) {
        if (!this.f299507P || z) {
            int i = true != mo96134aG() ? 0 : 7;
            SuggestionGridLayout suggestionGridLayout = this.f299495D;
            if (suggestionGridLayout != null) {
                C110434i iVar = this.f299522aE;
                iVar.getClass();
                C110427b bVar = (C110427b) iVar;
                if (bVar.mo98667c()) {
                    if (bVar.f307819j == suggestionGridLayout) {
                        C58976aa aaVar = C58975e.f156826a;
                        bVar.mo98668e(i);
                        bVar.f307813d.mo82320b();
                    } else {
                        bVar.f307818i.mo82381a();
                        if (!bVar.f307814e.mo82389d()) {
                            C58976aa aaVar2 = C58975e.f156826a;
                            bVar.f307814e.mo82388c();
                        }
                        if (bVar.f307824o) {
                            bVar.mo98666b();
                            bVar.f307824o = false;
                        }
                        C89202g gVar = bVar.f307820k;
                        if (gVar != null) {
                            gVar.mo83159e();
                        }
                        bVar.f307819j = suggestionGridLayout;
                        C88760ae aeVar = bVar.f307821l;
                        if (aeVar != null) {
                            aeVar.mo82492n(suggestionGridLayout);
                        }
                        C58976aa aaVar3 = C58975e.f156826a;
                        bVar.mo98668e(i);
                        bVar.f307818i.mo82383g();
                        bVar.f307813d.mo82320b();
                    }
                }
                SuggestionGridLayout suggestionGridLayout2 = this.f299495D;
                suggestionGridLayout2.getClass();
                suggestionGridLayout2.getViewTreeObserver().addOnPreDrawListener(new C107643ac(this, response));
            }
            C110434i iVar2 = this.f299522aE;
            iVar2.getClass();
            ((C110427b) iVar2).f307813d.mo44284c(response);
            if (this.f299582e.mo79746e(C90063do.f249493ea) && this.f299564au.mo56113h()) {
                ((C111772f) this.f299564au.mo56107c()).mo99227b(response.f108862b, response.f108861a);
            }
        }
    }

    /* renamed from: w */
    public final void mo96195w() {
        if ((mo96172ax() || this.f299503L) && mo96176c()) {
            C58976aa aaVar = C58975e.f156826a;
            this.f299507P = false;
            SuggestionGridLayout suggestionGridLayout = this.f299495D;
            if (suggestionGridLayout != null) {
                suggestionGridLayout.setVisibility(8);
            }
            C107658ar arVar = this.f299595r;
            if (arVar != null) {
                arVar.mo96201c(false);
            }
            if (mo96140aM()) {
                FrameLayout frameLayout = this.f299527aJ;
                if (frameLayout != null) {
                    frameLayout.getLayoutParams().height = -2;
                }
                LinearLayout linearLayout = this.f299528aK;
                if (linearLayout != null) {
                    linearLayout.getLayoutParams().height = -2;
                }
                m178575bh(0);
            }
        }
    }

    /* renamed from: x */
    public final void mo96196x() {
        this.f299586i.findViewById(R.id.opa_search_plate).setVisibility(8);
    }

    /* renamed from: y */
    public final void mo96197y() {
        View view = this.f299596s;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    /* renamed from: z */
    public final void mo96198z(com.google.android.apps.gsa.assistant.shared.p.e eVar) {
        h k = mo96182k();
        if (k != null) {
            k.b(eVar);
        }
    }
}
