package com.google.android.apps.gsa.staticplugins.p7648ce;

import android.accounts.Account;
import android.accounts.AccountsException;
import android.app.ActivityManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Parcel;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewDebug;
import androidx.core.app.C1839z;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b.C9684l;
import com.google.android.apps.gsa.configuration.C74464a;
import com.google.android.apps.gsa.contacts.C74482ch;
import com.google.android.apps.gsa.contacts.aj;
import com.google.android.apps.gsa.contacts.by;
import com.google.android.apps.gsa.contacts.ci;
import com.google.android.apps.gsa.contacts.cp;
import com.google.android.apps.gsa.eventlogger.j;
import com.google.android.apps.gsa.eventlogger.m;
import com.google.android.apps.gsa.gcm.a.e;
import com.google.android.apps.gsa.handsfree.a;
import com.google.android.apps.gsa.n.b;
import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.opa.p6443g.p6444a.C83681b;
import com.google.android.apps.gsa.opa.p6451j.C83714b;
import com.google.android.apps.gsa.p5836c.p5838d.C74451c;
import com.google.android.apps.gsa.p6484r.C84249d;
import com.google.android.apps.gsa.p6484r.C84250e;
import com.google.android.apps.gsa.p6484r.C84251f;
import com.google.android.apps.gsa.p8885y.p8887b.C118835b;
import com.google.android.apps.gsa.p8889z.p8890a.C118843f;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a;
import com.google.android.apps.gsa.proactive.p6476c.C84167b;
import com.google.android.apps.gsa.search.core.C85637av;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.C86085h;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84425ag;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84434ap;
import com.google.android.apps.gsa.search.core.p6805i.C86110f;
import com.google.android.apps.gsa.search.core.p6805i.C86111g;
import com.google.android.apps.gsa.search.core.p6805i.C86112h;
import com.google.android.apps.gsa.search.core.p6805i.C86113i;
import com.google.android.apps.gsa.search.core.p6805i.C86114j;
import com.google.android.apps.gsa.search.core.p6805i.C86115k;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.p6819q.C86349b;
import com.google.android.apps.gsa.search.core.p6819q.C86351d;
import com.google.android.apps.gsa.search.core.p6841s.C86589h;
import com.google.android.apps.gsa.search.core.p6841s.C86590i;
import com.google.android.apps.gsa.search.core.preferences.C86318i;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86341u;
import com.google.android.apps.gsa.search.core.preferences.C86346z;
import com.google.android.apps.gsa.search.shared.media.p6932a.C87577a;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87773da;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87774db;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87775dc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87776dd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87777de;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87778df;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.logger.C89947o;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.C89950r;
import com.google.android.apps.gsa.shared.logger.C89955w;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89851ag;
import com.google.android.apps.gsa.shared.logger.p7064i.C89926f;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89016an;
import com.google.android.apps.gsa.shared.p6968aa.C89046bq;
import com.google.android.apps.gsa.shared.p6976ag.C89104a;
import com.google.android.apps.gsa.shared.p6986aj.C89182a;
import com.google.android.apps.gsa.shared.p6986aj.C89185d;
import com.google.android.apps.gsa.shared.p6986aj.C89186e;
import com.google.android.apps.gsa.shared.p7020bd.C89410c;
import com.google.android.apps.gsa.shared.p7020bd.C89411d;
import com.google.android.apps.gsa.shared.p7020bd.C89412e;
import com.google.android.apps.gsa.shared.p7066m.C90008bn;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.shared.p7066m.C90075e;
import com.google.android.apps.gsa.shared.p7066m.C90102f;
import com.google.android.apps.gsa.shared.p7066m.C90112fj;
import com.google.android.apps.gsa.shared.p7066m.C90128g;
import com.google.android.apps.gsa.shared.p7066m.C90129h;
import com.google.android.apps.gsa.shared.p7066m.C90130i;
import com.google.android.apps.gsa.shared.p7066m.C90131j;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.C91025i;
import com.google.android.apps.gsa.shared.util.debug.C91026j;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90892az;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90934cd;
import com.google.android.apps.gsa.sidekick.main.entry.C91320ay;
import com.google.android.apps.gsa.sidekick.main.p7199b.C91272l;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91374d;
import com.google.android.apps.gsa.sidekick.main.trigger.C91632i;
import com.google.android.apps.gsa.sidekick.shared.training.InterestLauncherHelper;
import com.google.android.apps.gsa.speech.audio.C92185e;
import com.google.android.apps.gsa.speech.audio.C92195f;
import com.google.android.apps.gsa.speech.audio.C92196g;
import com.google.android.apps.gsa.speech.p7270c.C92223f;
import com.google.android.apps.gsa.speech.p7311n.C92541i;
import com.google.android.apps.gsa.staticplugins.p7684cn.C98043e;
import com.google.android.apps.gsa.staticplugins.p7884dz.C100321a;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118475aj;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.apps.search.googleapp.p10370p.C136856aw;
import com.google.android.gms.lockbox.C144983e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gcoreclient.p1792r.p1793a.C21631c;
import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.gsa.p1864f.p1865a.C22804a;
import com.google.android.libraries.gsa.p1864f.p1865a.C22811d;
import com.google.android.libraries.gsa.p1864f.p1865a.C22813f;
import com.google.android.libraries.gsa.p1864f.p1865a.p1866a.C22806b;
import com.google.android.libraries.gsa.p1864f.p1865a.p1866a.C22807c;
import com.google.android.libraries.gsa.p1864f.p1865a.p1866a.C22808d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p11029ao.p11031b.C147799a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.search.assistant.p2497ab.C32376ar;
import com.google.android.libraries.search.assistant.p2497ab.C32389bd;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.nowdev.C45005a;
import com.google.android.nowdev.C45008d;
import com.google.android.nowdev.C45009e;
import com.google.android.play.core.p3538g.C45187v;
import com.google.android.play.core.p3538g.C45188w;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59315ac;
import com.google.common.p4541l.C59317ae;
import com.google.common.p4541l.C59336s;
import com.google.common.p4552o.C59794fv;
import com.google.common.p4552o.C59796fx;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4575r.C60747d;
import com.google.common.p4575r.C60757n;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p375ai.p378b.C7661fg;
import com.google.p375ai.p378b.C7744ii;
import com.google.p375ai.p378b.C7880nj;
import com.google.p375ai.p378b.C7885no;
import com.google.p375ai.p378b.C7887nq;
import com.google.p375ai.p378b.C7891nu;
import com.google.p375ai.p378b.C8142xb;
import com.google.p395al.p408c.p414c.p416b.C8512v;
import com.google.p395al.p408c.p414c.p416b.C8513w;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65819cw;
import dagger.C68214a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ce.ax */
/* compiled from: PG */
public final class C97565ax extends C45005a {

    /* renamed from: a */
    public static final C58974d f272500a = C58974d.m91134h("TrustedTestService");

    /* renamed from: i */
    private static final String[] f272501i = new String[0];

    /* renamed from: j */
    private static final String[] f272502j = {"unavailable"};

    /* renamed from: A */
    private final C68214a f272503A;

    /* renamed from: B */
    private final C68214a f272504B;

    /* renamed from: C */
    private final C68214a f272505C;

    /* renamed from: D */
    private final C68214a f272506D;

    /* renamed from: E */
    private final C68214a f272507E;

    /* renamed from: F */
    private final C68214a f272508F;

    /* renamed from: G */
    private final C68214a f272509G;

    /* renamed from: H */
    private final C69464a f272510H;

    /* renamed from: I */
    private final C68214a f272511I;

    /* renamed from: J */
    private final C68214a f272512J;

    /* renamed from: K */
    private final C68214a f272513K;

    /* renamed from: L */
    private final C90479a f272514L;

    /* renamed from: M */
    private final C22871g f272515M;

    /* renamed from: N */
    private final C22871g f272516N;

    /* renamed from: O */
    private final C22871g f272517O;

    /* renamed from: P */
    private final C22871g f272518P;

    /* renamed from: Q */
    private final C68214a f272519Q;

    /* renamed from: R */
    private final C68214a f272520R;

    /* renamed from: S */
    private final C92196g f272521S;

    /* renamed from: T */
    private final C68214a f272522T;

    /* renamed from: U */
    private final C68214a f272523U;

    /* renamed from: V */
    private final C68214a f272524V;

    /* renamed from: W */
    private final C68214a f272525W;

    /* renamed from: X */
    private final C68214a f272526X;

    /* renamed from: Y */
    private final C68214a f272527Y;

    /* renamed from: Z */
    private final C68214a f272528Z;

    /* renamed from: aa */
    private final C42876ab f272529aa;

    /* renamed from: ab */
    private final C68214a f272530ab;

    /* renamed from: ac */
    private final C68214a f272531ac;

    /* renamed from: ad */
    private final C68214a f272532ad;

    /* renamed from: ae */
    private final C68214a f272533ae;

    /* renamed from: af */
    private final u f272534af;

    /* renamed from: ag */
    private final C68214a f272535ag;

    /* renamed from: ah */
    private final C68214a f272536ah;

    /* renamed from: ai */
    private final C58881cr f272537ai = C58886cw.m90973a(C97586u.f272605a);

    /* renamed from: aj */
    private final Object f272538aj = new Object();

    /* renamed from: ak */
    private C97576k f272539ak;

    /* renamed from: al */
    private C89950r f272540al;

    /* renamed from: b */
    public final C90929bz f272541b;

    /* renamed from: c */
    public final Service f272542c;

    /* renamed from: d */
    public final C68214a f272543d;

    /* renamed from: e */
    public final C68214a f272544e;

    /* renamed from: f */
    public final ConcurrentLinkedQueue f272545f = new ConcurrentLinkedQueue();

    /* renamed from: g */
    public final ConcurrentLinkedQueue f272546g = new ConcurrentLinkedQueue();

    /* renamed from: h */
    public SettableFuture f272547h = new SettableFuture();

    /* renamed from: k */
    private final Context f272548k;

    /* renamed from: l */
    private final C86124t f272549l;

    /* renamed from: m */
    private final C21370a f272550m;

    /* renamed from: n */
    private final C85637av f272551n;

    /* renamed from: o */
    private final C86127w f272552o;

    /* renamed from: p */
    private final C86318i f272553p;

    /* renamed from: q */
    private final C90991b f272554q;

    /* renamed from: r */
    private final C68214a f272555r;

    /* renamed from: s */
    private final C68214a f272556s;

    /* renamed from: t */
    private final C68214a f272557t;

    /* renamed from: u */
    private final C68214a f272558u;

    /* renamed from: v */
    private final C68214a f272559v;

    /* renamed from: w */
    private final C68214a f272560w;

    /* renamed from: x */
    private final C68214a f272561x;

    /* renamed from: y */
    private final C68214a f272562y;

    /* renamed from: z */
    private final C68214a f272563z;

    public C97565ax(Service service, Context context, C86127w wVar, C86318i iVar, C86124t tVar, C90929bz bzVar, C21370a aVar, C85637av avVar, C91022f fVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C68214a aVar11, C68214a aVar12, C68214a aVar13, C68214a aVar14, C68214a aVar15, C68214a aVar16, C68214a aVar17, C68214a aVar18, C68214a aVar19, C69464a aVar20, C68214a aVar21, C68214a aVar22, C68214a aVar23, C90479a aVar24, C22871g gVar, C22871g gVar2, C22871g gVar3, C22871g gVar4, C68214a aVar25, C68214a aVar26, C92196g gVar5, C68214a aVar27, C68214a aVar28, C68214a aVar29, C68214a aVar30, C68214a aVar31, C68214a aVar32, C68214a aVar33, C42876ab abVar, C68214a aVar34, C68214a aVar35, C68214a aVar36, C68214a aVar37, u uVar, C68214a aVar38, C68214a aVar39) {
        this.f272542c = service;
        this.f272548k = context;
        this.f272552o = wVar;
        this.f272553p = iVar;
        this.f272549l = tVar;
        this.f272551n = avVar;
        this.f272541b = bzVar;
        this.f272550m = aVar;
        this.f272554q = fVar;
        this.f272555r = aVar2;
        this.f272556s = aVar3;
        this.f272557t = aVar4;
        this.f272558u = aVar5;
        this.f272559v = aVar6;
        this.f272560w = aVar7;
        this.f272561x = aVar8;
        this.f272562y = aVar9;
        this.f272544e = aVar10;
        this.f272563z = aVar11;
        this.f272503A = aVar12;
        this.f272504B = aVar13;
        this.f272543d = aVar14;
        this.f272505C = aVar15;
        this.f272506D = aVar16;
        this.f272507E = aVar17;
        this.f272508F = aVar18;
        this.f272509G = aVar19;
        this.f272510H = aVar20;
        this.f272511I = aVar21;
        this.f272512J = aVar22;
        this.f272513K = aVar23;
        this.f272514L = aVar24;
        this.f272515M = gVar;
        this.f272516N = gVar2;
        this.f272517O = gVar3;
        this.f272518P = gVar4;
        this.f272519Q = aVar25;
        this.f272520R = aVar26;
        this.f272521S = gVar5;
        this.f272522T = aVar27;
        this.f272523U = aVar28;
        this.f272524V = aVar29;
        this.f272525W = aVar30;
        this.f272526X = aVar31;
        this.f272527Y = aVar32;
        this.f272528Z = aVar33;
        this.f272529aa = abVar;
        this.f272530ab = aVar34;
        this.f272531ac = aVar35;
        this.f272532ad = aVar36;
        this.f272533ae = aVar37;
        this.f272534af = uVar;
        this.f272535ag = aVar38;
        this.f272536ah = aVar39;
    }

    /* renamed from: ao */
    static void m161515ao(C86110f fVar, C86113i iVar) {
        fVar.copyOnWrite();
        ((C86111g) fVar.instance).f232744b = C86111g.emptyProtobufList();
        fVar.mo79730b((List) Collection.EL.stream(Collections.unmodifiableList(((C86111g) fVar.instance).f232744b)).filter(new C97546ae(iVar)).collect(C58370cn.f155946a));
        fVar.copyOnWrite();
        C86111g gVar = (C86111g) fVar.instance;
        iVar.getClass();
        gVar.mo79732a();
        gVar.f232744b.add(iVar);
    }

    /* renamed from: cp */
    private final Account m161516cp() {
        if (((C86054o) this.f272560w.mo27525b()).mo79668a() == null) {
            ((C86054o) this.f272560w.mo27525b()).mo79680n();
        }
        Account a = ((C86054o) this.f272560w.mo27525b()).mo79668a();
        C58838bb.m90866a(a, "No account in device");
        return a;
    }

    /* renamed from: cq */
    private final C86111g m161517cq() {
        try {
            byte[] e = ((C86346z) this.f272552o.f232790a.mo79723b()).mo80079e(C90507o.f253018h, (byte[]) null);
            if (e != null) {
                return (C86111g) C62942bv.parseFrom((C62942bv) C86111g.f232741g, e, C62921ba.m95368a());
            }
        } catch (C62974ct e2) {
            ((C58970a) ((C58970a) ((C58970a) f272500a.mo56225c()).mo56382g(e2)).mo56372aa(22136)).mo56386p("putGsaConfigFlagOverride(): bad GsaExperiments bytes");
        }
        return C86111g.f232741g;
    }

    /* renamed from: cr */
    private final C86337q m161518cr(String str) {
        return new C86341u(m161519cs(C86127w.m138509b(str)));
    }

    /* renamed from: cs */
    private final C86346z m161519cs(boolean z) {
        if (z) {
            return (C86346z) this.f272552o.f232790a.mo79723b();
        }
        return (C86346z) this.f272552o.f232790a.mo79722a();
    }

    /* renamed from: ct */
    private final void m161520ct(C86113i iVar) {
        C86110f fVar = (C86110f) m161517cq().toBuilder();
        m161515ao(fVar, iVar);
        m161523cw((C86111g) fVar.build());
    }

    /* renamed from: cu */
    private final void m161521cu(ClientEventData clientEventData) {
        this.f272515M.mo28212l("TrustedTestBinder sends client event", new C97544ac(this, clientEventData));
    }

    /* renamed from: cv */
    private static void m161522cv(Bundle bundle, boolean z, String str) {
        if (z) {
            bundle.putInt("status", 0);
            return;
        }
        bundle.putInt("status", 1);
        bundle.putString("errorMessage", str);
    }

    /* renamed from: cw */
    private final void m161523cw(C86111g gVar) {
        C86341u uVar = new C86341u((C86346z) this.f272552o.f232790a.mo79723b());
        uVar.mo80068c(C90507o.f253018h, gVar.toByteArray());
        uVar.mo80086l(true);
        this.f272549l.mo79741l();
    }

    /* renamed from: cy */
    private final void m161525cy(String str, int i, boolean z) {
        C90875ai.m148465b(C97577l.f272594a, this.f272534af.c(str, C65753ak.m96797b(i), z), this.f272516N, "TrustedTestBinder#removeGellerCorpus").mo85223a(C97588w.f272607a);
    }

    /* renamed from: cz */
    private final View m161526cz() {
        SettableFuture settableFuture = new SettableFuture();
        C84251f.f229273b.add(new C97558aq(this, settableFuture));
        Intent component = new Intent("android.intent.action.ASSIST").addFlags(268435456).setComponent(new ComponentName(this.f272548k, "com.google.android.apps.gsa.searchnow.SearchNowActivity"));
        if (component != null) {
            this.f272542c.startActivity(component);
        } else {
            ((C58970a) ((C58970a) f272500a.mo56225c()).mo56372aa(22134)).mo56386p("Could not get Intent VIEW_ID_NOW_CLIENT_CARDS_VIEW");
        }
        try {
            return (View) C90877ak.m148473g(settableFuture, 30, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((C58970a) ((C58970a) ((C58970a) f272500a.mo56225c()).mo56382g(e)).mo56372aa(22135)).mo56386p("Failed to get view");
            return null;
        }
    }

    /* renamed from: h */
    public static View m161527h(int i) {
        View b;
        for (C84250e eVar : C84251f.f229272a) {
            if (eVar.mo77734e() && (b = eVar.mo77731b(i)) != null) {
                while (b.findViewWithTag(C84250e.f229271a) != null) {
                    try {
                        C84249d dVar = C84250e.f229271a;
                        synchronized (dVar.f229269a) {
                            while (!dVar.f229270b) {
                                dVar.f229269a.wait();
                            }
                        }
                    } catch (InterruptedException e) {
                        ((C58970a) ((C58970a) ((C58970a) f272500a.mo56225c()).mo56382g(e)).mo56372aa(22133)).mo56386p("Error while waiting for View animation to fully load.");
                    }
                }
                return b;
            }
        }
        return null;
    }

    /* renamed from: A */
    public final List mo48678A() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[][] bArr = (byte[][]) this.f272546g.poll();
            if (bArr == null) {
                return arrayList;
            }
            arrayList.add(bArr);
        }
    }

    /* renamed from: B */
    public final Map mo48679B() {
        return new HashMap();
    }

    /* renamed from: C */
    public final Map mo48680C() {
        File a = C91026j.m148686a(this.f272542c);
        HashMap hashMap = new HashMap();
        if (a.isDirectory()) {
            HashMap hashMap2 = new HashMap();
            File[] listFiles = a.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    String[] split = file.getName().split("_", 2);
                    if (split.length == 2 && split[0].equals("response")) {
                        hashMap2.put(split[1], file);
                    }
                }
                for (File file2 : listFiles) {
                    if (file2.isFile()) {
                        String[] split2 = file2.getName().split("_", 2);
                        if (split2.length == 2 && split2[0].equals("request") && hashMap2.containsKey(split2[1])) {
                            try {
                                File file3 = (File) hashMap2.get(split2[1]);
                                if (file3 != null) {
                                    hashMap.put(C60747d.m92720b(new C59315ac(file2).mo56803a()), C60747d.m92720b(new C59315ac(file3).mo56803a()));
                                }
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: D */
    public final Map mo48681D() {
        Map c = C28295m.m52917c();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : c.entrySet()) {
            int i = ((C60214n) ((C28292j) entry.getValue()).f76973a.instance).f162918c;
            View view = (View) entry.getKey();
            hashMap.put(Integer.valueOf(i), view.getResources().getResourceName(view.getId()));
        }
        return hashMap;
    }

    /* renamed from: E */
    public final void mo48682E() {
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22138)).mo56386p("Acknowledge Opt In");
        ((C85651bb) this.f272561x.mo27525b()).mo79158u();
    }

    /* renamed from: F */
    public final void mo48683F(int i, String str, String str2, Map map) {
        synchronized (this.f272538aj) {
            if (this.f272539ak == null) {
                this.f272539ak = new C97576k();
            }
            this.f272539ak.mo90754c(i, str, str2, map);
            ((C89012aj) this.f272557t.mo27525b()).mo27500k(this.f272539ak);
        }
    }

    /* renamed from: G */
    public final void mo48684G(String str) {
        if (((C58833ax) this.f272506D.mo27525b()).mo56113h()) {
            C98043e eVar = (C98043e) ((C58833ax) this.f272506D.mo27525b()).mo56107c();
            C31167ax.m58112a().f84035a.mo36898c(C31164au.m58092b(str));
        }
    }

    /* renamed from: H */
    public final void mo48685H(String str) {
        C86341u uVar = new C86341u(m161519cs(false));
        uVar.mo80073h("actions_ve_logging_dump_uri", str);
        uVar.mo80086l(true);
    }

    /* renamed from: I */
    public final void mo48686I(String str, String str2, boolean z) {
        SharedPreferences.Editor edit = this.f272548k.getSharedPreferences(str, 0).edit();
        edit.putBoolean(str2, z);
        edit.commit();
    }

    /* renamed from: J */
    public final void mo48687J() {
        C92195f a = this.f272521S.mo86868a(C92185e.f257010a);
        C58838bb.m90883r(a.f257044d == C92185e.f257010a);
        File c = a.mo86856c();
        File[] listFiles = c.listFiles();
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
        c.delete();
        a.mo86859f().delete();
    }

    /* renamed from: K */
    public final void mo48688K() {
        C85651bb bbVar = (C85651bb) this.f272561x.mo27525b();
        C58976aa aaVar = C58975e.f156826a;
        for (Account account : ((C86054o) bbVar.f231495f.mo27525b()).mo79684r()) {
            bbVar.f231490a.mo79167e(account.name, (C7661fg) null);
        }
    }

    /* renamed from: L */
    public final void mo48689L() {
        C85651bb bbVar = (C85651bb) this.f272561x.mo27525b();
        C58976aa aaVar = C58975e.f156826a;
        for (Account account : ((C86054o) bbVar.f231495f.mo27525b()).mo79684r()) {
            C86337q b = bbVar.f231491b.mo80076b();
            b.mo80075j(C90507o.f253031u.concat(String.valueOf(account.name)));
            b.apply();
        }
    }

    /* renamed from: M */
    public final void mo48690M(int i) {
        this.f272529aa.mo46039a(new C97582q(i), C60826bg.f164896a);
    }

    /* renamed from: N */
    public final void mo48691N() {
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22139)).mo56386p("Clearing training mode data");
        this.f272541b.mo85139d(new C97555an(this));
    }

    /* renamed from: O */
    public final void mo48692O() {
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22140)).mo56386p("Clearing trigger log");
        synchronized (C91632i.class) {
        }
    }

    /* renamed from: P */
    public final void mo90749P() {
        C91026j.m148687b(this.f272548k, "tmp.txt");
    }

    /* renamed from: Q */
    public final void mo48693Q() {
        m161521cu(new C88489j(C87739bu.DEBUG_DEADLOCK_EVENTBUS).mo82013a());
    }

    /* renamed from: R */
    public final void mo48694R(boolean z, String[] strArr) {
        C86341u uVar = new C86341u(m161519cs(z));
        for (String j : strArr) {
            uVar.mo80075j(j);
        }
        uVar.mo80086l(true);
    }

    /* renamed from: S */
    public final void mo48695S() {
        C118919a.f331656a.set(true);
    }

    /* renamed from: T */
    public final void mo48696T() {
        C89926f.f246364a = true;
    }

    /* renamed from: U */
    public final void mo48697U() {
        C86341u uVar;
        C86346z cs = m161519cs(false);
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22141)).mo56386p("Starting downloadAndCommitGsaConfigFlags.");
        try {
            long j = cs.getLong("gsa_config_last_commit_time", 0);
            C86341u uVar2 = new C86341u(cs);
            uVar2.mo80085k("debug_commit_config_flags_immediately", true);
            uVar2.mo80086l(true);
            ((C74464a) this.f272508F.mo27525b()).mo70780a();
            int i = 0;
            while (true) {
                if (i >= 150) {
                    uVar = new C86341u(cs);
                    break;
                } else if (cs.getLong("gsa_config_last_commit_time", 0) > j) {
                    ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22143)).mo56386p("Downloaded and committed GSA config flags.");
                    uVar = new C86341u(cs);
                    break;
                } else {
                    Thread.sleep(200);
                    i++;
                }
            }
        } catch (InterruptedException e) {
            ((C58970a) ((C58970a) ((C58970a) f272500a.mo56225c()).mo56382g(e)).mo56372aa(22142)).mo56386p("Exception in downloadAndCommitGsaConfigFlags.");
            uVar = new C86341u(cs);
        } catch (Throwable th) {
            C86341u uVar3 = new C86341u(cs);
            uVar3.mo80075j("debug_commit_config_flags_immediately");
            uVar3.mo80086l(false);
            throw th;
        }
        uVar.mo80075j("debug_commit_config_flags_immediately");
        uVar.mo80086l(false);
    }

    /* renamed from: V */
    public final void mo48698V(boolean z, byte[] bArr) {
        try {
            C86341u uVar = new C86341u(m161519cs(z));
            uVar.mo80087m((C89185d) C62942bv.parseFrom((C62942bv) C89185d.f241801b, bArr));
            uVar.mo80086l(true);
        } catch (C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) f272500a.mo56226d()).mo56382g(e)).mo56372aa(22144)).mo56386p("editSharedPrefs(): bad SharedPreferencesData bytes");
        }
    }

    /* renamed from: W */
    public final void mo48699W() {
        try {
            ((C74451c) this.f272527Y.mo27525b()).mo70769a();
        } catch (Exception e) {
            ((C58970a) ((C58970a) ((C58970a) f272500a.mo56225c()).mo56382g(e)).mo56372aa(22145)).mo56386p("Exception enabling emulated microphone.");
        }
    }

    /* renamed from: X */
    public final void mo48700X() {
        C89016an anVar = (C89016an) this.f272504B.mo27525b();
        synchronized (anVar.f241222b) {
            anVar.f241230j = true;
        }
    }

    /* renamed from: Y */
    public final void mo48701Y() {
        if (Build.TAGS.contains(BuildConfig.BUILD_TYPE)) {
            try {
                C90877ak.m148472f(this.f272541b.mo85146k(new C97561at()));
            } catch (InterruptedException | ExecutionException e) {
                ((C58970a) ((C58970a) ((C58970a) f272500a.mo56225c()).mo56382g(e)).mo56372aa(22146)).mo56386p("Task to enable web view debugging was interrupted.");
            }
        }
    }

    /* renamed from: Z */
    public final void mo48702Z() {
        Account a = ((C86054o) this.f272560w.mo27525b()).mo79668a();
        if (a != null) {
            ((e) this.f272522T.mo27525b()).d(a);
            ((C118561t) this.f272563z.mo27525b()).mo103751b(C118522by.NOW_UPDATE_GCM_REGISTRATION, C118472ag.f328819i);
            ((C118561t) this.f272563z.mo27525b()).mo103752c(C118522by.CHIME_REGISTRATION);
            ((C118561t) this.f272563z.mo27525b()).mo103754e(C118522by.CHIME_REGISTRATION, C118472ag.f328819i);
        }
    }

    /* renamed from: a */
    public final int mo48703a() {
        return 8;
    }

    /* renamed from: aA */
    public final void mo48704aA(String str, int[] iArr) {
        C86337q cr = m161518cr(str);
        cr.mo80071f(str, iArr);
        ((C86341u) cr).mo80086l(true);
    }

    /* renamed from: aB */
    public final void mo48705aB(String str, long j) {
        C86341u uVar = (C86341u) m161518cr(str);
        uVar.mo80085k(str, Long.valueOf(j));
        uVar.mo80086l(true);
    }

    /* renamed from: aC */
    public final void mo48706aC(String str, String str2) {
        C86337q cr = m161518cr(str);
        cr.mo80073h(str, str2);
        ((C86341u) cr).mo80086l(true);
    }

    /* renamed from: aD */
    public final void mo48707aD(String str, String[] strArr) {
        HashSet hashSet = new HashSet(r1);
        for (String add : strArr) {
            hashSet.add(add);
        }
        C86337q cr = m161518cr(str);
        cr.mo80074i(str, hashSet);
        ((C86341u) cr).mo80086l(true);
    }

    /* renamed from: aE */
    public final void mo48708aE(String str) {
        if (((C58833ax) this.f272506D.mo27525b()).mo56113h()) {
            ((C98043e) ((C58833ax) this.f272506D.mo27525b()).mo56107c()).f273769a.mo36917i(C31164au.m58092b(str));
        }
    }

    /* renamed from: aF */
    public final void mo48709aF() {
        ((by) this.f272532ad.mo27525b()).g();
        Optional b = ((by) this.f272532ad.mo27525b()).b();
        C74482ch chVar = (C74482ch) this.f272533ae.mo27525b();
        Objects.requireNonNull(chVar);
        b.ifPresent(new C97579n(chVar));
    }

    /* renamed from: aG */
    public final void mo48710aG() {
        ((C89994f) this.f272503A.mo27525b()).mo83897aq();
        a aVar = new a((C89994f) this.f272503A.mo27525b(), this.f272550m);
        aVar.a.mo83899as("read-message", 0);
        aVar.a.mo83899as("reply", 0);
        C88483e.m142828c(this.f272542c, new C88489j(C87739bu.REFRESH_SERVICE_STATE).mo82013a());
    }

    /* renamed from: aH */
    public final void mo48711aH() {
        C89016an anVar = (C89016an) this.f272504B.mo27525b();
        synchronized (anVar.f241222b) {
            anVar.f241221a.clear();
            anVar.f241224d.clear();
            anVar.f241228h.clear();
            anVar.f241225e.clear();
            anVar.f241229i.clear();
            anVar.f241227g.clear();
            anVar.f241226f.clear();
        }
    }

    /* renamed from: aI */
    public final void mo48712aI() {
        synchronized (this.f272538aj) {
            this.f272539ak = null;
            ((C89012aj) this.f272557t.mo27525b()).mo27500k((C89046bq) null);
        }
    }

    /* renamed from: aJ */
    public final void mo48713aJ(String str, int i) {
        C118522by byVar;
        try {
            byVar = C118522by.m196757a(str);
        } catch (IllegalArgumentException unused) {
            byVar = null;
        }
        if (byVar != null) {
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328821a |= 1;
            agVar.f328822b = (long) i;
            ((C118561t) this.f272563z.mo27525b()).mo103751b(byVar, (C118472ag) afVar.build());
        }
    }

    /* renamed from: aK */
    public final void mo48714aK(String str, byte[] bArr) {
        C118522by byVar;
        try {
            byVar = C118522by.m196757a(str);
        } catch (IllegalArgumentException unused) {
            byVar = null;
        }
        if (byVar == null) {
            ((C58970a) ((C58970a) f272500a.mo56225c()).mo56372aa(22157)).mo56389s("scheduleExclusiveBackgroundTask: unknown background task name: %s", str);
            return;
        }
        try {
            ((C118561t) this.f272563z.mo27525b()).mo103754e(byVar, (C118472ag) C62942bv.parseFrom((C62942bv) C118472ag.f328819i, bArr, C62921ba.m95368a()));
        } catch (C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) f272500a.mo56225c()).mo56382g(e)).mo56372aa(22156)).mo56386p("scheduleExclusiveBackgroundTask: bad OneOffTaskSpec bytes");
        }
    }

    /* renamed from: aL */
    public final void mo48715aL(Intent intent) {
        this.f272542c.sendBroadcast(intent);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.util.zip.ZipOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: aM */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48716aM() {
        /*
            r11 = this;
            com.google.android.apps.gsa.speech.audio.g r0 = r11.f272521S
            com.google.android.apps.gsa.speech.audio.e r1 = com.google.android.apps.gsa.speech.audio.C92185e.f257010a
            com.google.android.apps.gsa.speech.audio.f r0 = r0.mo86868a(r1)
            com.google.android.apps.gsa.speech.audio.e r1 = r0.f257044d
            com.google.android.apps.gsa.speech.audio.e r2 = com.google.android.apps.gsa.speech.audio.C92185e.f257010a
            r3 = 0
            if (r1 != r2) goto L_0x0011
            r1 = 1
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            com.google.common.base.C58838bb.m90883r(r1)
            java.io.File r1 = r0.mo86859f()
            java.io.File r2 = r0.mo86856c()
            java.io.File[] r2 = r2.listFiles()
            if (r2 == 0) goto L_0x00aa
            int r4 = r2.length
            if (r4 != 0) goto L_0x0028
            goto L_0x00aa
        L_0x0028:
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]
            r6 = 0
            java.util.zip.ZipOutputStream r7 = new java.util.zip.ZipOutputStream     // Catch:{ IOException -> 0x00a3, all -> 0x009a }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00a3, all -> 0x009a }
            r8.<init>(r1)     // Catch:{ IOException -> 0x00a3, all -> 0x009a }
            r7.<init>(r8)     // Catch:{ IOException -> 0x00a3, all -> 0x009a }
            r8 = 0
        L_0x0038:
            if (r8 >= r4) goto L_0x0063
            r9 = r2[r8]     // Catch:{ IOException -> 0x0097, all -> 0x0093 }
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0097, all -> 0x0093 }
            r10.<init>(r9)     // Catch:{ IOException -> 0x0097, all -> 0x0093 }
            java.util.zip.ZipEntry r6 = new java.util.zip.ZipEntry     // Catch:{ IOException -> 0x0098, all -> 0x0061 }
            java.lang.String r9 = r9.getName()     // Catch:{ IOException -> 0x0098, all -> 0x0061 }
            r6.<init>(r9)     // Catch:{ IOException -> 0x0098, all -> 0x0061 }
            r7.putNextEntry(r6)     // Catch:{ IOException -> 0x0098, all -> 0x0061 }
        L_0x004d:
            int r6 = r10.read(r5)     // Catch:{ IOException -> 0x0098, all -> 0x0061 }
            if (r6 <= 0) goto L_0x0057
            r7.write(r5, r3, r6)     // Catch:{ IOException -> 0x0098, all -> 0x0061 }
            goto L_0x004d
        L_0x0057:
            r7.closeEntry()     // Catch:{ IOException -> 0x0098, all -> 0x0061 }
            r10.close()     // Catch:{ IOException -> 0x0098, all -> 0x0061 }
            int r8 = r8 + 1
            r6 = r10
            goto L_0x0038
        L_0x0061:
            r0 = move-exception
            goto L_0x0095
        L_0x0063:
            r7.close()     // Catch:{ IOException -> 0x0097, all -> 0x0093 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ IOException -> 0x0097, all -> 0x0093 }
            java.lang.String r3 = "android.intent.action.SEND"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0097, all -> 0x0093 }
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r3)     // Catch:{ IOException -> 0x0097, all -> 0x0093 }
            java.lang.String r3 = "text/plain"
            r2.setType(r3)     // Catch:{ IOException -> 0x0097, all -> 0x0093 }
            java.lang.String r3 = "android.intent.extra.SUBJECT"
            java.lang.String r4 = "Debug logged audio."
            r2.putExtra(r3, r4)     // Catch:{ IOException -> 0x0097, all -> 0x0093 }
            java.lang.String r3 = "android.intent.extra.STREAM"
            android.net.Uri r1 = android.net.Uri.fromFile(r1)     // Catch:{ IOException -> 0x0097, all -> 0x0093 }
            r2.putExtra(r3, r1)     // Catch:{ IOException -> 0x0097, all -> 0x0093 }
            android.content.Context r0 = r0.f257042b     // Catch:{ IOException -> 0x0097, all -> 0x0093 }
            r0.startActivity(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0093 }
            com.google.common.p4541l.C59317ae.m92163a(r7)
            com.google.common.p4541l.C59337t.m92221a(r6)
            return
        L_0x0093:
            r0 = move-exception
            r10 = r6
        L_0x0095:
            r6 = r7
            goto L_0x009c
        L_0x0097:
            r10 = r6
        L_0x0098:
            r6 = r7
            goto L_0x00a4
        L_0x009a:
            r0 = move-exception
            r10 = r6
        L_0x009c:
            com.google.common.p4541l.C59317ae.m92163a(r6)
            com.google.common.p4541l.C59337t.m92221a(r10)
            throw r0
        L_0x00a3:
            r10 = r6
        L_0x00a4:
            com.google.common.p4541l.C59317ae.m92163a(r6)
            com.google.common.p4541l.C59337t.m92221a(r10)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7648ce.C97565ax.mo48716aM():void");
    }

    /* renamed from: aN */
    public final void mo48717aN(byte[] bArr) {
        try {
            C86351d dVar = (C86351d) C62942bv.parseFrom((C62942bv) C86351d.f233463g, bArr);
            Intent intent = new Intent("com.google.android.c2dm.intent.RECEIVE");
            intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.gcm.GcmBroadcastReceiver");
            intent.putExtra("from", dVar.f233468d);
            boolean z = true;
            if ((dVar.f233465a & 1) != 0) {
                intent.putExtra("rawData", dVar.f233466b.mo59174N());
            }
            int i = dVar.f233465a & 2;
            if (i != 0) {
                if (i == 0) {
                    z = false;
                }
                intent.putExtra("rawDataBase64", z);
            }
            this.f272542c.sendBroadcast(intent);
        } catch (C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) f272500a.mo56225c()).mo56382g(e)).mo56372aa(22158)).mo56386p("Invalid proto");
        }
    }

    /* renamed from: aO */
    public final void mo48718aO(int[] iArr, int[] iArr2) {
        C86110f fVar = (C86110f) m161517cq().toBuilder();
        fVar.copyOnWrite();
        ((C86111g) fVar.instance).f232746d = C86111g.emptyIntList();
        fVar.mo79729a(C60757n.m92749j(iArr));
        fVar.copyOnWrite();
        ((C86111g) fVar.instance).f232747e = C86111g.emptyIntList();
        fVar.mo79731c(C60757n.m92749j(iArr2));
        m161523cw((C86111g) fVar.build());
    }

    /* renamed from: aP */
    public final void mo48719aP(String str) {
        C86346z cs = m161519cs(false);
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22159)).mo56389s("Setting X-Client-Instance-Id override: %s", str);
        C86341u uVar = new C86341u(cs);
        uVar.mo80073h("debug_client_instance_id", str);
        uVar.mo80086l(true);
    }

    /* renamed from: aQ */
    public final void mo48720aQ(boolean z) {
        mo48744ap(C90008bn.f246893g.f248757a, z);
        if (z) {
            ((C89012aj) this.f272557t.mo27525b()).mo27499j();
            return;
        }
        Context context = this.f272548k;
        File b = C91026j.m148687b(context, ((DateFormat) this.f272537ai.mo6453a()).format(new Date()));
        b.getParentFile().getClass();
        C58838bb.m90873h(b.getParentFile().getName().equals("dump"), "File %s is not located in /dump directory", b.getPath());
        ((C89012aj) this.f272557t.mo27525b()).mo27498i(b);
        C91025i.m148685a("cronet-netlog.json", context, b);
    }

    /* renamed from: aR */
    public final void mo48721aR(String str) {
        C86346z cs = m161519cs(false);
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22160)).mo56389s("Setting extra query params: %s", str);
        C86341u uVar = new C86341u(cs);
        uVar.mo80073h("extra_query_params", str);
        uVar.mo80086l(true);
    }

    /* renamed from: aS */
    public final void mo48722aS(String[] strArr) {
        C89182a aVar = (C89182a) C89185d.f241801b.createBuilder();
        if (strArr == null) {
            strArr = new String[0];
        }
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            try {
                Integer.parseInt(str);
                i++;
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException("Invalid experimentId: ".concat(String.valueOf(str)));
            }
        }
        aVar.mo83149a(C89186e.m145056a("now_opted_in_experiments", new HashSet(Arrays.asList(strArr))));
        C86341u uVar = new C86341u(m161519cs(true));
        uVar.mo80087m((C89185d) aVar.build());
        uVar.mo80086l(false);
    }

    /* renamed from: aT */
    public final void mo48723aT(int i) {
        C58974d dVar = f272500a;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(22161)).mo56387q("setNowOptInVersion() : %d", i);
        Account cp = m161516cp();
        C85651bb bbVar = (C85651bb) this.f272561x.mo27525b();
        int g = bbVar.mo79146g();
        if (i <= 0 && g <= 0) {
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(22166)).mo56386p("setNowOptInVersion() : Already opted out");
        } else if (g == i) {
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(22165)).mo56386p("setNowOptInVersion() : Already opted into the same version");
        } else if (g > 0 && i < g) {
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(22164)).mo56386p("setNowOptInVersion() : Opted in: need to opt out");
            bbVar.mo79153p(cp.name);
        } else if (g <= 0) {
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(22163)).mo56386p("setNowOptInVersion() : Opted out: need to opt in");
            C7885no noVar = (C7885no) C7887nq.f27680c.createBuilder();
            noVar.copyOnWrite();
            C7887nq nqVar = (C7887nq) noVar.instance;
            nqVar.f27682a |= 1;
            nqVar.f27683b = 7;
            this.f272551n.mo79117c(cp, i, 4, C7880nj.ACCEPT, C7891nu.SETTINGS_MASTER_SWITCH, Collections.singletonList((C7887nq) noVar.build()), (List) null, false);
        } else {
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(22162)).mo56386p("setNowOptInVersion() : Opted in: need to upgrade");
            bbVar.mo79152o(cp.name, i, false);
        }
    }

    /* renamed from: aU */
    public final void mo48724aU(String str) {
        C86341u uVar = new C86341u(m161519cs(true));
        if (TextUtils.isEmpty(str)) {
            uVar.mo80075j("sidekick_server_override");
        } else {
            uVar.mo80073h("sidekick_server_override", str);
        }
        uVar.mo80086l(false);
    }

    /* renamed from: aV */
    public final void mo48725aV(boolean z) {
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22167)).mo56389s("setOptedIntoAudioHistory() : %s", Boolean.valueOf(z));
        ((C86590i) this.f272562y.mo27525b()).mo80208d(m161516cp(), C86589h.AUDIO, z);
    }

    /* renamed from: aW */
    public final void mo48726aW(boolean z) {
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22168)).mo56389s("setOptedIntoDeviceInformation() : %s", Boolean.valueOf(z));
        Account cp = m161516cp();
        C144983e eVar = new C144983e();
        eVar.mo120483a(z);
        ((C91272l) this.f272559v.mo27525b()).mo85552f(cp, C21631c.m40753a(eVar));
    }

    /* renamed from: aX */
    public final void mo48727aX(boolean z) {
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22169)).mo56389s("setOptedIntoWebAndAppHistory() : %s", Boolean.valueOf(z));
        Account cp = m161516cp();
        C144983e eVar = new C144983e();
        eVar.mo120484b(z);
        ((C91272l) this.f272559v.mo27525b()).mo85552f(cp, C21631c.m40753a(eVar));
    }

    /* renamed from: aY */
    public final void mo48728aY(boolean z) {
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22170)).mo56389s("setOptedIntoWebHistory() : %s", Boolean.valueOf(z));
        ((C86590i) this.f272562y.mo27525b()).mo80208d(m161516cp(), C86589h.WEB, z);
    }

    /* renamed from: aZ */
    public final void mo48729aZ(boolean z) {
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22171)).mo56389s("setPersonalResultsBit() : %s", Boolean.valueOf(z));
        ((C9684l) this.f272535ag.mo27525b()).mo17957f(m161516cp(), true);
    }

    /* renamed from: aa */
    public final void mo48730aa(String str) {
        mo48713aJ(str, 0);
    }

    /* renamed from: ab */
    public final void mo48731ab() {
        ((j) this.f272519Q.mo27525b()).a();
    }

    /* renamed from: ac */
    public final void mo48732ac() {
        for (Account account : ((C86054o) this.f272560w.mo27525b()).mo79684r()) {
            C85651bb bbVar = (C85651bb) this.f272561x.mo27525b();
            if (account != null) {
                bbVar.mo79156s(account.name, -1);
            }
        }
    }

    /* renamed from: ad */
    public final void mo48733ad() {
        for (Account account : ((C86054o) this.f272560w.mo27525b()).mo79684r()) {
            C85651bb bbVar = (C85651bb) this.f272561x.mo27525b();
            if (account != null) {
                bbVar.mo79157t(account.name, -1);
                String str = account.name;
                C86337q b = bbVar.f231491b.mo80076b();
                b.mo80075j(C90507o.f253023m.concat(String.valueOf(str)));
                b.mo80075j(C90507o.f253022l.concat(String.valueOf(str)));
                b.mo80075j(C90507o.f253024n.concat(String.valueOf(str)));
                b.mo80075j(C90507o.f253032v.concat(String.valueOf(str)));
                b.apply();
            }
        }
    }

    /* renamed from: ae */
    public final void mo48734ae(String str) {
        if ("dump".equals(str)) {
            ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22148)).mo56386p("Dumping training mode data");
            this.f272541b.mo85139d(new C97556ao(this));
            return;
        }
        ((C58970a) ((C58970a) f272500a.mo56226d()).mo56372aa(22147)).mo56389s("Unrecognized training mode action: %s", str);
    }

    /* renamed from: af */
    public final void mo48735af(int i) {
        Process.killProcess(i);
    }

    /* renamed from: ag */
    public final void mo48736ag() {
        Context context = this.f272548k;
        InterestLauncherHelper.Options options = new InterestLauncherHelper.Options();
        C90476a aVar = C91018d.f254254a;
        context.startActivity(InterestLauncherHelper.m150800a(options));
    }

    /* renamed from: ah */
    public final void mo48737ah(Uri uri, Bundle bundle) {
        Intent intent = new Intent("android.intent.action.MAIN", uri);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.setComponent(new ComponentName(this.f272548k, "com.google.android.apps.gsa.velour.dynamichosts.VelvetDynamicHostActivity"));
        intent.setFlags(268435456);
        this.f272548k.startActivity(intent);
    }

    /* renamed from: ai */
    public final void mo48738ai() {
        C89104a.f241538a = true;
    }

    /* renamed from: aj */
    public final void mo48739aj(String str) {
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22152)).mo56389s("Overriding S3 sandbox with: %s", str);
        C86341u uVar = new C86341u(m161519cs(false));
        uVar.mo80073h("s3SandboxOverride", str);
        uVar.mo80086l(true);
    }

    /* renamed from: ak */
    public final void mo48740ak(String str) {
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22153)).mo56389s("Overriding S3 server with: %s", str);
        C86341u uVar = new C86341u(m161519cs(false));
        uVar.mo80073h("debugS3Server", str);
        uVar.mo80086l(true);
    }

    /* renamed from: al */
    public final void mo48741al(String str) {
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22154)).mo56389s("Overriding search domain with: %s", str);
        C86341u uVar = new C86341u(m161519cs(false));
        uVar.mo80073h("debug_search_domain_override", str);
        uVar.mo80086l(true);
    }

    /* renamed from: am */
    public final void mo48742am(String str) {
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22155)).mo56389s("Overriding search scheme with: %s", str);
        C86341u uVar = new C86341u(m161519cs(false));
        uVar.mo80073h("debug_search_scheme_override", str);
        uVar.mo80086l(true);
    }

    /* renamed from: an */
    public final void mo48743an() {
        this.f272518P.mo28212l("push-icing-flags", new C84434ap((C84425ag) this.f272558u.mo27525b(), this.f272549l));
    }

    /* renamed from: ap */
    public final void mo48744ap(int i, boolean z) {
        C86112h hVar = (C86112h) C86113i.f232749f.createBuilder();
        hVar.copyOnWrite();
        C86113i iVar = (C86113i) hVar.instance;
        iVar.f232751a |= 2;
        iVar.f232755e = i;
        hVar.copyOnWrite();
        C86113i iVar2 = (C86113i) hVar.instance;
        iVar2.f232752b = 2;
        iVar2.f232753c = Boolean.valueOf(z);
        m161520ct((C86113i) hVar.build());
    }

    /* renamed from: aq */
    public final void mo48745aq(int i, byte[] bArr) {
        C86112h hVar = (C86112h) C86113i.f232749f.createBuilder();
        hVar.copyOnWrite();
        C86113i iVar = (C86113i) hVar.instance;
        iVar.f232751a |= 2;
        iVar.f232755e = i;
        C63088z A = C63088z.m96139A(bArr);
        hVar.copyOnWrite();
        C86113i iVar2 = (C86113i) hVar.instance;
        iVar2.f232752b = 6;
        iVar2.f232753c = A;
        m161520ct((C86113i) hVar.build());
    }

    /* renamed from: ar */
    public final void mo48746ar(int i, double d) {
        C86112h hVar = (C86112h) C86113i.f232749f.createBuilder();
        hVar.copyOnWrite();
        C86113i iVar = (C86113i) hVar.instance;
        iVar.f232751a |= 2;
        iVar.f232755e = i;
        hVar.copyOnWrite();
        C86113i iVar2 = (C86113i) hVar.instance;
        iVar2.f232752b = 7;
        iVar2.f232753c = Double.valueOf(d);
        m161520ct((C86113i) hVar.build());
    }

    /* renamed from: as */
    public final void mo48747as(int i, int i2) {
        C86112h hVar = (C86112h) C86113i.f232749f.createBuilder();
        hVar.copyOnWrite();
        C86113i iVar = (C86113i) hVar.instance;
        iVar.f232751a |= 2;
        iVar.f232755e = i;
        hVar.copyOnWrite();
        C86113i iVar2 = (C86113i) hVar.instance;
        iVar2.f232752b = 4;
        iVar2.f232753c = Long.valueOf((long) i2);
        m161520ct((C86113i) hVar.build());
    }

    /* renamed from: at */
    public final void mo48748at(int i, String str) {
        C86112h hVar = (C86112h) C86113i.f232749f.createBuilder();
        hVar.copyOnWrite();
        C86113i iVar = (C86113i) hVar.instance;
        iVar.f232751a |= 2;
        iVar.f232755e = i;
        hVar.copyOnWrite();
        C86113i iVar2 = (C86113i) hVar.instance;
        str.getClass();
        iVar2.f232752b = 3;
        iVar2.f232753c = str;
        m161520ct((C86113i) hVar.build());
    }

    /* renamed from: au */
    public final void mo48749au(int i, String[] strArr) {
        String join = TextUtils.join(",", strArr);
        C86112h hVar = (C86112h) C86113i.f232749f.createBuilder();
        hVar.copyOnWrite();
        C86113i iVar = (C86113i) hVar.instance;
        iVar.f232751a |= 2;
        iVar.f232755e = i;
        hVar.copyOnWrite();
        C86113i iVar2 = (C86113i) hVar.instance;
        join.getClass();
        iVar2.f232752b = 3;
        iVar2.f232753c = join;
        m161520ct((C86113i) hVar.build());
    }

    /* renamed from: aw */
    public final void mo48751aw(String str, boolean z) {
        C86341u uVar = (C86341u) m161518cr(str);
        uVar.mo80085k(str, Boolean.valueOf(z));
        uVar.mo80086l(true);
    }

    /* renamed from: ax */
    public final void mo48752ax(String str, byte[] bArr) {
        C86337q cr = m161518cr(str);
        cr.mo80068c(str, bArr);
        ((C86341u) cr).mo80086l(true);
    }

    /* renamed from: ay */
    public final void mo48753ay(String str, float f) {
        C86341u uVar = (C86341u) m161518cr(str);
        uVar.mo80085k(str, Float.valueOf(f));
        uVar.mo80086l(true);
    }

    /* renamed from: az */
    public final void mo48754az(String str, int i) {
        C86341u uVar = (C86341u) m161518cr(str);
        uVar.mo80085k(str, Integer.valueOf(i));
        uVar.mo80086l(true);
    }

    /* renamed from: b */
    public final int mo48755b() {
        return ((C118843f) this.f272507E.mo27525b()).mo71746g().ordinal();
    }

    /* renamed from: bA */
    public final boolean mo48756bA() {
        C91006f g = C91006f.m148646g(0);
        for (C84250e e : C84251f.f229272a) {
            e.mo77734e();
        }
        String i = g.mo85282i();
        if (TextUtils.isEmpty(i)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(268435456);
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", "SYSDUMP");
        intent.putExtra("android.intent.extra.TEXT", i);
        this.f272542c.startActivity(intent);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: bB */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo48757bB(android.net.Uri r7) {
        /*
            r6 = this;
            r0 = 0
            com.google.android.apps.gsa.shared.util.debug.a.f r0 = com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f.m148646g(r0)
            com.google.android.apps.gsa.shared.util.debug.a.b r1 = r6.f272554q
            r0.mo85286m(r1)
            long r1 = android.os.Binder.clearCallingIdentity()
            r3 = 0
            java.io.PrintWriter r4 = new java.io.PrintWriter     // Catch:{ FileNotFoundException -> 0x0039 }
            android.content.Context r5 = r6.f272548k     // Catch:{ FileNotFoundException -> 0x0039 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0039 }
            java.io.OutputStream r7 = r5.openOutputStream(r7)     // Catch:{ FileNotFoundException -> 0x0039 }
            r4.<init>(r7)     // Catch:{ FileNotFoundException -> 0x0039 }
            java.lang.String r7 = r0.mo85282i()     // Catch:{ FileNotFoundException -> 0x0034, all -> 0x0031 }
            r4.write(r7)     // Catch:{ FileNotFoundException -> 0x0034, all -> 0x0031 }
            r4.flush()     // Catch:{ FileNotFoundException -> 0x0034, all -> 0x0031 }
            android.os.Binder.restoreCallingIdentity(r1)
            r4.close()
            r7 = 1
            return r7
        L_0x0031:
            r7 = move-exception
            r3 = r4
            goto L_0x005f
        L_0x0034:
            r7 = move-exception
            r3 = r4
            goto L_0x003a
        L_0x0037:
            r7 = move-exception
            goto L_0x005f
        L_0x0039:
            r7 = move-exception
        L_0x003a:
            com.google.common.f.a.d r0 = f272500a     // Catch:{ all -> 0x0037 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0037 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0037 }
            com.google.common.f.x r7 = r0.mo56382g(r7)     // Catch:{ all -> 0x0037 }
            com.google.common.f.a.a r7 = (com.google.common.p4526f.p4527a.C58970a) r7     // Catch:{ all -> 0x0037 }
            r0 = 22182(0x56a6, float:3.1084E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r0)     // Catch:{ all -> 0x0037 }
            com.google.common.f.a.a r7 = (com.google.common.p4526f.p4527a.C58970a) r7     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = "dumpGsaState: invalid uri"
            r7.mo56386p(r0)     // Catch:{ all -> 0x0037 }
            android.os.Binder.restoreCallingIdentity(r1)
            if (r3 == 0) goto L_0x005d
            r3.close()
        L_0x005d:
            r7 = 0
            return r7
        L_0x005f:
            android.os.Binder.restoreCallingIdentity(r1)
            if (r3 == 0) goto L_0x0067
            r3.close()
        L_0x0067:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7648ce.C97565ax.mo48757bB(android.net.Uri):boolean");
    }

    /* renamed from: bC */
    public final boolean mo48758bC(Uri uri) {
        C91006f g = C91006f.m148646g(0);
        g.mo85286m(this.f272554q);
        long clearCallingIdentity = Binder.clearCallingIdentity();
        OutputStream outputStream = null;
        try {
            outputStream = this.f272548k.getContentResolver().openOutputStream(uri);
            ((C59796fx) g.f254236a.build()).writeTo(outputStream);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            C59317ae.m92163a(outputStream);
            return true;
        } catch (FileNotFoundException e) {
            ((C58970a) ((C58970a) ((C58970a) f272500a.mo56225c()).mo56382g(e)).mo56372aa(22183)).mo56389s("dumpGsaStateProto: invalid uri: %s", uri);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            C59317ae.m92163a(outputStream);
            return false;
        } catch (IOException e2) {
            ((C58970a) ((C58970a) ((C58970a) f272500a.mo56225c()).mo56382g(e2)).mo56372aa(22184)).mo56386p("dumpGsaStateProto: fail to convert proto to byte array");
            Binder.restoreCallingIdentity(clearCallingIdentity);
            C59317ae.m92163a(outputStream);
            return false;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            C59317ae.m92163a(outputStream);
            throw th;
        }
    }

    /* renamed from: bD */
    public final boolean mo48759bD(Uri uri) {
        File file = null;
        String path = uri != null ? uri.getPath() : null;
        try {
            C58974d dVar = f272500a;
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(22185)).mo56389s("Start dumping memory to %s.", path);
            Runtime.getRuntime().gc();
            System.runFinalization();
            Runtime.getRuntime().gc();
            if (path == null) {
                file = C91026j.m148687b(this.f272548k, new SimpleDateFormat("'agsadump-'y_MM_dd_HH_mm_ss'.hprof'", Locale.US).format(new Date()));
                path = file.getPath();
            }
            Debug.dumpHprofData(path);
            if (file != null) {
                C91026j.m148689d(this.f272548k, "Heap Dump", file);
            }
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(22186)).mo56389s("Successfully dumped memory to %s.", path);
            return true;
        } catch (IOException e) {
            ((C58970a) ((C58970a) ((C58970a) f272500a.mo56225c()).mo56382g(e)).mo56372aa(22187)).mo56389s("Fail to dump memory heap to %s.", path);
            return false;
        }
    }

    /* renamed from: bE */
    public final boolean mo48760bE() {
        Reader c;
        for (C84250e eVar : C84251f.f229272a) {
            if (eVar.mo77734e() && (c = eVar.mo77732c()) != null) {
                Service service = this.f272542c;
                File b = C91026j.m148687b(service, "srp.html");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(b);
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                    C59336s.m92219b(c, outputStreamWriter);
                    outputStreamWriter.close();
                    fileOutputStream.close();
                    C91026j.m148689d(service, BuildConfig.FLAVOR, b);
                    return true;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return false;
    }

    /* renamed from: bF */
    public final boolean mo48761bF(int i, Uri uri) {
        Throwable th;
        Throwable e;
        View g = mo90750g(i);
        if (g == null) {
            ((C58970a) ((C58970a) f272500a.mo56225c()).mo56372aa(22189)).mo56387q("Invalid view Id: %s", i);
            return false;
        }
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22188)).mo56386p("dumpViewHierarchy: dumping...");
        OutputStream outputStream = null;
        try {
            OutputStream openOutputStream = this.f272548k.getContentResolver().openOutputStream(uri);
            try {
                Method declaredMethod = ViewDebug.class.getDeclaredMethod("dump", new Class[]{View.class, Boolean.TYPE, Boolean.TYPE, OutputStream.class});
                declaredMethod.setAccessible(true);
                ((C59052c) ((C59052c) C97566ay.f272564a.mo56224b()).mo56372aa(22215)).mo56386p("dumpViewHierarchy start ViewDebug.dump");
                declaredMethod.invoke((Object) null, new Object[]{g, false, true, openOutputStream});
                ((C59052c) ((C59052c) C97566ay.f272564a.mo56224b()).mo56372aa(22216)).mo56386p("dumpViewHierarchy successfully");
                C59317ae.m92163a(openOutputStream);
                return true;
            } catch (IOException e2) {
                e = e2;
                outputStream = openOutputStream;
                ((C59052c) ((C59052c) ((C59052c) C97566ay.f272564a.mo56225c()).mo56382g(e)).mo56372aa(22217)).mo56389s("dumpViewHierarchy: Failed to write to uri %s", uri);
                C59317ae.m92163a(outputStream);
                return false;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                e = e3;
                outputStream = openOutputStream;
                ((C59052c) ((C59052c) ((C59052c) C97566ay.f272564a.mo56225c()).mo56382g(e)).mo56372aa(22218)).mo56386p("dumpViewHierarchy: Failed to access ViewDebug.dump method.");
                C59317ae.m92163a(outputStream);
                return false;
            } catch (Throwable th2) {
                th = th2;
                outputStream = openOutputStream;
                C59317ae.m92163a(outputStream);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            ((C59052c) ((C59052c) ((C59052c) C97566ay.f272564a.mo56225c()).mo56382g(e)).mo56372aa(22217)).mo56389s("dumpViewHierarchy: Failed to write to uri %s", uri);
            C59317ae.m92163a(outputStream);
            return false;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e5) {
            e = e5;
            ((C59052c) ((C59052c) ((C59052c) C97566ay.f272564a.mo56225c()).mo56382g(e)).mo56372aa(22218)).mo56386p("dumpViewHierarchy: Failed to access ViewDebug.dump method.");
            C59317ae.m92163a(outputStream);
            return false;
        } catch (Throwable th3) {
            th = th3;
            C59317ae.m92163a(outputStream);
            throw th;
        }
    }

    /* renamed from: bG */
    public final boolean mo48762bG() {
        if (((C58833ax) this.f272506D.mo27525b()).mo56113h()) {
            return ((C98043e) ((C58833ax) this.f272506D.mo27525b()).mo56107c()).f273770b.get();
        }
        return false;
    }

    /* renamed from: bH */
    public final boolean mo48763bH(String str, String str2) {
        C58976aa aaVar = C58975e.f156826a;
        C87774db dbVar = (C87774db) C87775dc.f237545d.createBuilder();
        dbVar.copyOnWrite();
        C87775dc dcVar = (C87775dc) dbVar.instance;
        str.getClass();
        dcVar.f237547a |= 1;
        dcVar.f237548b = str;
        dbVar.copyOnWrite();
        C87775dc dcVar2 = (C87775dc) dbVar.instance;
        str2.getClass();
        dcVar2.f237547a |= 2;
        dcVar2.f237549c = str2;
        C88489j jVar = new C88489j(C87739bu.DEBUG_SET_COOKIE);
        jVar.mo82014b(C87773da.f237544a, (C87775dc) dbVar.build());
        m161521cu(jVar.mo82013a());
        return true;
    }

    /* renamed from: bI */
    public final boolean mo48764bI() {
        Iterator it = this.f272549l.f232787g.f232744b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C86113i iVar = (C86113i) it.next();
            if (iVar.f232755e == C90008bn.f246893g.f248757a) {
                if (iVar.f232752b == 2) {
                    return ((Boolean) iVar.f232753c).booleanValue();
                }
            }
        }
        return false;
    }

    /* renamed from: bJ */
    public final boolean mo48765bJ() {
        C45187v a = C45188w.m80459a(this.f272548k);
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22191)).mo56389s("splitInstallManager: %s", a.mo49000g());
        return a.mo49000g().contains("nga_native_feature_module");
    }

    /* renamed from: bK */
    public final boolean mo48766bK() {
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22192)).mo56386p("isOptedIntoAudioHistory()");
        Account a = ((C86054o) this.f272560w.mo27525b()).mo79668a();
        if (a == null) {
            return false;
        }
        return ((C86590i) this.f272562y.mo27525b()).mo80206b(a, C86589h.AUDIO);
    }

    /* renamed from: bL */
    public final boolean mo48767bL() {
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22193)).mo56386p("isOptedIntoDeviceInformation()");
        C86085h a = ((C91272l) this.f272559v.mo27525b()).mo85548a(((C86054o) this.f272560w.mo27525b()).mo79668a(), true);
        if (a == null || !a.mo79717a()) {
            return false;
        }
        return true;
    }

    /* renamed from: bM */
    public final boolean mo48768bM() {
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22194)).mo56386p("isOptedIntoWebAndAppHistory()");
        C86085h a = ((C91272l) this.f272559v.mo27525b()).mo85548a(((C86054o) this.f272560w.mo27525b()).mo79668a(), true);
        if (a == null || !a.mo79718b()) {
            return false;
        }
        return true;
    }

    /* renamed from: bN */
    public final boolean mo48769bN() {
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22195)).mo56386p("isOptedIntoWebHistory()");
        Account a = ((C86054o) this.f272560w.mo27525b()).mo79668a();
        if (a == null) {
            return false;
        }
        return ((C86590i) this.f272562y.mo27525b()).mo80206b(a, C86589h.WEB);
    }

    /* renamed from: bO */
    public final boolean mo48770bO() {
        for (C84250e eVar : C84251f.f229272a) {
            if (eVar.mo77734e() && eVar.mo77733d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: bP */
    public final boolean mo48771bP(int i) {
        if (i == 0) {
            this.f272515M.mo28212l("TrustedTestService", new C97590y(this));
            return true;
        } else if (i == 2) {
            this.f272516N.mo28212l("TrustedTestService", new C97591z(this));
            return true;
        } else if (i == 3) {
            this.f272517O.mo28212l("TrustedTestService", new C97542aa(this));
            return true;
        } else if (i != 4) {
            return false;
        } else {
            this.f272518P.mo28212l("TrustedTestService", new C97543ab(this));
            return true;
        }
    }

    /* renamed from: bQ */
    public final boolean mo48772bQ(String str, int i) {
        m161525cy(str, i, false);
        return true;
    }

    /* renamed from: bR */
    public final boolean mo48773bR(String str) {
        try {
            ((C86054o) this.f272560w.mo27525b()).mo79680n();
            ((C86054o) this.f272560w.mo27525b()).mo79686t(str);
            return true;
        } catch (AccountsException unused) {
            return false;
        }
    }

    /* renamed from: bS */
    public final boolean mo48774bS(boolean z) {
        String str = true != z ? ".txt" : ".binarypb";
        Context context = this.f272548k;
        File b = C91026j.m148687b(context, "gsa-statedump".concat(str));
        b.getParentFile().getClass();
        C58838bb.m90873h(b.getParentFile().getName().equals("dump"), "File %s is not located in /dump directory", b.getPath());
        Uri fromFile = Uri.fromFile(b);
        if (!(z ? mo48758bC(fromFile) : mo48757bB(fromFile))) {
            return false;
        }
        C91025i.m148685a("AGSA state dump", context, b);
        return true;
    }

    /* renamed from: bT */
    public final boolean mo48775bT(String[] strArr) {
        C97570e a = C97570e.m161702a();
        strArr.getClass();
        synchronized (C97570e.class) {
            if (a.f272578c == null) {
                try {
                    a.f272579d = new ArrayList(Arrays.asList(strArr));
                    a.f272579d.add("seconds time elapsed");
                    Runtime runtime = a.f272577b;
                    StringBuilder sb = new StringBuilder();
                    sb.append("perf stat -p " + Process.myPid());
                    for (String valueOf : strArr) {
                        sb.append(" -e ".concat(String.valueOf(valueOf)));
                    }
                    sb.append(" /system/bin/sh -c read ");
                    a.f272578c = runtime.exec(sb.toString());
                } catch (IOException e) {
                    a.mo90751b("Exception when starting perf event counter.", e);
                }
                if (a.f272578c != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: bU */
    public final boolean mo48776bU(Intent intent) {
        return this.f272542c.stopService(intent);
    }

    /* renamed from: bV */
    public final boolean mo48777bV(int i, Uri uri, int i2) {
        View g = mo90750g(i);
        if (g == null) {
            ((C58970a) ((C58970a) f272500a.mo56225c()).mo56372aa(22198)).mo56387q("Invalid view Id: %s", i);
            return false;
        } else if (g.isShown()) {
            return m161524cx(g, uri, i2);
        } else {
            ((C58970a) ((C58970a) f272500a.mo56225c()).mo56372aa(22197)).mo56387q("View is not shown: %s", i);
            return false;
        }
    }

    /* renamed from: bW */
    public final boolean mo48778bW(String str, ProtoLiteParcelable protoLiteParcelable) {
        try {
            C65819cw cwVar = (C65819cw) protoLiteParcelable.mo84191d(C65819cw.f178926i.getParserForType());
            if (cwVar == null) {
                ((C58970a) ((C58970a) f272500a.mo56225c()).mo56372aa(22204)).mo56386p("no SyncResponse proto passed");
                return false;
            }
            Geller a = ((b) this.f272530ab.mo27525b()).a();
            if (a == null) {
                ((C58970a) ((C58970a) f272500a.mo56225c()).mo56372aa(22203)).mo56386p("Geller is null");
                return false;
            }
            C90875ai.m148465b(C97547af.f272481a, a.mo27185l(str, cwVar), this.f272516N, "TrustedTestBind#updateGeller").mo85223a(C97548ag.f272482a);
            return true;
        } catch (IllegalArgumentException e) {
            ((C58970a) ((C58970a) ((C58970a) f272500a.mo56225c()).mo56382g(e)).mo56372aa(22205)).mo56386p("passed SyncResponse proto is invalid");
            return false;
        }
    }

    /* renamed from: bX */
    public final byte[] mo48779bX() {
        HashMap hashMap = new HashMap(this.f272549l.f232785e);
        C86114j jVar = (C86114j) C86115k.f232756b.createBuilder();
        for (C90130i iVar : C90131j.m146672a().values()) {
            hashMap.remove(Integer.valueOf(iVar.f251804a));
            if (!(iVar.f251805b instanceof C90128g)) {
                C86112h hVar = (C86112h) C86113i.f232749f.createBuilder();
                int i = iVar.f251804a;
                hVar.copyOnWrite();
                C86113i iVar2 = (C86113i) hVar.instance;
                iVar2.f232751a |= 2;
                iVar2.f232755e = i;
                String valueOf = String.valueOf(iVar.f251804a);
                hVar.copyOnWrite();
                C86113i iVar3 = (C86113i) hVar.instance;
                valueOf.getClass();
                iVar3.f232751a |= 1;
                iVar3.f232754d = valueOf;
                Object obj = iVar.f251805b;
                if (obj instanceof C90048d) {
                    boolean z = ((C90048d) obj).f248758b;
                    hVar.copyOnWrite();
                    C86113i iVar4 = (C86113i) hVar.instance;
                    iVar4.f232752b = 2;
                    iVar4.f232753c = Boolean.valueOf(z);
                } else if (obj instanceof C90102f) {
                    long j = ((C90102f) obj).f250557b;
                    hVar.copyOnWrite();
                    C86113i iVar5 = (C86113i) hVar.instance;
                    iVar5.f232752b = 4;
                    iVar5.f232753c = Long.valueOf(j);
                } else if (obj instanceof C90075e) {
                    double d = ((C90075e) obj).f249779b;
                    hVar.copyOnWrite();
                    C86113i iVar6 = (C86113i) hVar.instance;
                    iVar6.f232752b = 7;
                    iVar6.f232753c = Double.valueOf(d);
                } else if (obj instanceof C90129h) {
                    String str = ((C90129h) obj).f251803b;
                    hVar.copyOnWrite();
                    C86113i iVar7 = (C86113i) hVar.instance;
                    iVar7.f232752b = 3;
                    iVar7.f232753c = str;
                }
                jVar.mo79733a(hVar);
            }
        }
        for (C86113i iVar8 : hashMap.values()) {
            C86112h hVar2 = (C86112h) iVar8.toBuilder();
            String valueOf2 = String.valueOf(iVar8.f232755e);
            hVar2.copyOnWrite();
            C86113i iVar9 = (C86113i) hVar2.instance;
            valueOf2.getClass();
            iVar9.f232751a |= 1;
            iVar9.f232754d = valueOf2;
            jVar.mo79733a(hVar2);
        }
        return ((C86115k) jVar.build()).toByteArray();
    }

    /* renamed from: bY */
    public final byte[] mo48780bY() {
        C91006f g = C91006f.m148646g(0);
        g.mo85286m((C90991b) this.f272504B.mo27525b());
        return ((C59796fx) g.f254236a.build()).toByteArray();
    }

    /* renamed from: bZ */
    public final byte[] mo48781bZ() {
        return C86349b.f233460a.toByteArray();
    }

    /* renamed from: ba */
    public final void mo48782ba(boolean z) {
        ((C91374d) this.f272512J.mo27525b()).mo85693n(z);
    }

    /* renamed from: bb */
    public final void mo48783bb() {
        C118522by byVar = C118522by.AWARE_TIP_WORKER_PROCESS_TIPS;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        C118475aj ajVar = (C118475aj) C118476ak.f328838a.createBuilder();
        C62940bt btVar = C89412e.f242397a;
        C89410c cVar = (C89410c) C89411d.f242393c.createBuilder();
        cVar.copyOnWrite();
        C89411d dVar = (C89411d) cVar.instance;
        dVar.f242395a |= 1;
        dVar.f242396b = true;
        ajVar.mo58885m(btVar, (C89411d) cVar.build());
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        C118476ak akVar = (C118476ak) ajVar.build();
        akVar.getClass();
        agVar.f328827g = akVar;
        agVar.f328821a |= 32;
        ((C118561t) this.f272563z.mo27525b()).mo103751b(byVar, (C118472ag) afVar.build());
    }

    /* renamed from: bc */
    public final void mo48784bc() {
        Service service = this.f272542c;
        File file = new File(service.getFilesDir().getParentFile(), "databases/launcher.db");
        File b = C91026j.m148687b(service, file.getName());
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(b);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    fileOutputStream.close();
                    C91026j.m148689d(service, BuildConfig.FLAVOR, b);
                    return;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: bd */
    public final void mo48785bd() {
        File b = C91026j.m148687b(this.f272548k, "recordedgcmpush.txt");
        if (b.exists()) {
            File b2 = C91026j.m148687b(this.f272548k, String.format("recordedgcmpush_%s.txt", new Object[]{new SimpleDateFormat("yyyy_MM_dd_hh_mm").format(new Date(System.currentTimeMillis())).replace(' ', '_')}));
            if (true == b.renameTo(b2)) {
                b = b2;
            }
            C91026j.m148689d(this.f272548k, "Push Notifications", b);
            return;
        }
        ((C58970a) ((C58970a) f272500a.mo56226d()).mo56372aa(22172)).mo56386p("There is no file to share. Ensure recording is enabled.");
    }

    /* renamed from: be */
    public final void mo48786be() {
        Intent className = new Intent().setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.searchnow.SearchNowActivity");
        C1839z zVar = new C1839z(this.f272548k, (String) null);
        zVar.f5679J.icon = R.drawable.quantum_ic_google_white_24;
        zVar.f5685e = C1839z.m5037c(this.f272549l.mo79758x(C90112fj.f250723a));
        zVar.f5686f = C1839z.m5037c(this.f272549l.mo79758x(C90112fj.f250724b));
        zVar.f5687g = PendingIntent.getBroadcast(this.f272548k, 0, className, 67108864);
        zVar.mo5015d(16, true);
        ((NotificationManager) this.f272548k.getSystemService("notification")).notify(1337, zVar.mo5013a());
    }

    /* renamed from: bf */
    public final void mo48787bf(Intent intent) {
        this.f272542c.startActivity(intent);
    }

    /* renamed from: bg */
    public final void mo48788bg() {
        C97569d dVar = (C97569d) this.f272513K.mo27525b();
        ((C59052c) ((C59052c) C97569d.f272567a.mo56224b()).mo56372aa(22120)).mo56386p("startMonitoring");
        synchronized (dVar.f272569c) {
            dVar.f272569c.clear();
        }
        synchronized (dVar.f272570d) {
            dVar.f272570d.clear();
        }
        synchronized (dVar.f272571e) {
            dVar.f272571e.clear();
        }
        dVar.f272568b = true;
        dVar.f272572f.mo83704a(dVar.f272573g);
    }

    /* renamed from: bh */
    public final void mo48789bh() {
        synchronized (this.f272538aj) {
            if (this.f272540al == null) {
                m mVar = C89947o.f246445a.f246454d;
                if (mVar == null) {
                    mVar = m.a();
                }
                this.f272540al = mVar;
                C89949q.m146528m(new C97564aw(this, mVar));
            }
        }
    }

    /* renamed from: bi */
    public final void mo48790bi() {
        Debug.startMethodTracing();
    }

    /* renamed from: bj */
    public final void mo48791bj(String str) {
        if (((C58833ax) this.f272506D.mo27525b()).mo56113h()) {
            C98043e eVar = (C98043e) ((C58833ax) this.f272506D.mo27525b()).mo56107c();
            C31167ax.m58112a().f84035a.mo36903h(C31164au.m58092b(str));
        }
    }

    /* renamed from: bk */
    public final void mo48792bk() {
        if (((C58833ax) this.f272505C.mo27525b()).mo56113h()) {
            ((C98043e) ((C58833ax) this.f272505C.mo27525b()).mo56107c()).mo90897a();
        }
    }

    /* renamed from: bl */
    public final void mo48793bl(Intent intent) {
        this.f272542c.startService(intent);
    }

    /* renamed from: bm */
    public final void mo48794bm() {
        C97569d dVar = (C97569d) this.f272513K.mo27525b();
        ((C59052c) ((C59052c) C97569d.f272567a.mo56224b()).mo56372aa(22121)).mo56386p("stopMonitoring");
        dVar.f272568b = false;
        dVar.f272572f.mo83707e(dVar.f272573g);
    }

    /* renamed from: bn */
    public final void mo48795bn() {
        synchronized (this.f272538aj) {
            C89950r rVar = this.f272540al;
            if (rVar != null) {
                C89949q.m146528m(rVar);
                this.f272540al = null;
                this.f272545f.clear();
            }
        }
    }

    /* renamed from: bo */
    public final void mo48796bo() {
        Debug.stopMethodTracing();
    }

    /* renamed from: bp */
    public final void mo48797bp(String str) {
        if (((C58833ax) this.f272506D.mo27525b()).mo56113h()) {
            C98043e eVar = (C98043e) ((C58833ax) this.f272506D.mo27525b()).mo56107c();
            C31167ax.m58112a().f84035a.mo36907l(C31164au.m58092b(str));
        }
    }

    /* renamed from: bq */
    public final void mo48798bq(boolean z, String str) {
        if (z) {
            this.f272541b.mo85151p(new C97562au(str));
        } else {
            this.f272541b.mo85139d(new C97563av(str));
        }
    }

    /* renamed from: br */
    public final void mo48799br(int i) {
        this.f272541b.mo85151p(new C90892az("TrustedTestBinder.onTrimMemory", new C97581p(this, i)));
        C87777de deVar = (C87777de) C87778df.f237551c.createBuilder();
        deVar.copyOnWrite();
        C87778df dfVar = (C87778df) deVar.instance;
        dfVar.f237553a |= 1;
        dfVar.f237554b = i;
        C88489j jVar = new C88489j(C87739bu.DEBUG_TRIM_MEMORY);
        jVar.mo82014b(C87776dd.f237550a, (C87778df) deVar.build());
        m161521cu(jVar.mo82013a());
    }

    /* renamed from: bs */
    public final void mo48800bs(String str) {
        C118522by byVar;
        try {
            byVar = C118522by.m196757a(str);
        } catch (IllegalArgumentException unused) {
            byVar = null;
        }
        if (byVar == null) {
            ((C58970a) ((C58970a) f272500a.mo56225c()).mo56372aa(22173)).mo56389s("unscheduleExclusiveOneOffTask: unknown background task name: %s", str);
        } else {
            ((C118561t) this.f272563z.mo27525b()).mo103752c(byVar);
        }
    }

    /* renamed from: bt */
    public final void mo48801bt(String str, String str2) {
        mo48706aC(str, str2);
    }

    /* renamed from: bu */
    public final void mo48802bu() {
        m161521cu(new C88489j(C87739bu.DEBUG_REFRESH_COOKIES).mo82013a());
    }

    /* renamed from: bv */
    public final void mo48803bv() {
        this.f272549l.mo79741l();
    }

    /* renamed from: bw */
    public final void mo48804bw(String str, int i, ProtoLiteParcelable protoLiteParcelable) {
        try {
            C65768az azVar = (C65768az) protoLiteParcelable.mo84191d(C65768az.f178793f.getParserForType());
            if (azVar == null) {
                ((C58970a) ((C58970a) f272500a.mo56225c()).mo56372aa(22174)).mo56386p("no Element proto passed");
                return;
            }
            C90875ai.m148465b(C97583r.f272602a, this.f272534af.d(str, C65753ak.m96797b(i), azVar, false), this.f272516N, "logging Geller write status").mo85223a(C97584s.f272603a);
        } catch (IllegalArgumentException e) {
            ((C58970a) ((C58970a) ((C58970a) f272500a.mo56225c()).mo56382g(e)).mo56372aa(22175)).mo56386p("passed Element proto is invalid");
        }
    }

    /* renamed from: bx */
    public final void mo48805bx(byte[] bArr) {
        C8512v vVar = (C8512v) C8513w.f29529p.createBuilder();
        vVar.copyOnWrite();
        C8513w wVar = (C8513w) vVar.instance;
        wVar.f29531a |= 1;
        wVar.f29532b = BuildConfig.FLAVOR;
        try {
            vVar.mergeFrom(bArr, C62921ba.m95368a());
            C92541i iVar = (C92541i) this.f272520R.mo27525b();
            C8513w wVar2 = (C8513w) vVar.build();
            C58976aa aaVar = C58975e.f156826a;
            synchronized (iVar.f258269b) {
                iVar.f258271d = wVar2;
                iVar.mo87318d();
                iVar.mo87319e();
            }
        } catch (C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) f272500a.mo56225c()).mo56382g(e)).mo56372aa(22176)).mo56386p("Bad voice GStatic configuration.");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: java.io.BufferedInputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0075=Splitter:B:17:0x0075, B:24:0x009b=Splitter:B:24:0x009b} */
    /* renamed from: by */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo48806by(android.net.Uri r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f272548k
            com.google.common.base.cr r1 = r6.f272537ai
            java.lang.Object r1 = r1.mo6453a()
            java.text.DateFormat r1 = (java.text.DateFormat) r1
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            java.lang.String r1 = r1.format(r2)
            java.io.File r0 = com.google.android.apps.gsa.shared.util.debug.C91026j.m148687b(r0, r1)
            java.io.File r1 = r0.getParentFile()
            r1.getClass()
            java.io.File r1 = r0.getParentFile()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "dump"
            boolean r1 = r1.equals(r2)
            java.lang.String r2 = "File %s is not located in /dump directory"
            java.lang.String r3 = r0.getPath()
            com.google.common.base.C58838bb.m90873h(r1, r2, r3)
            dagger.a r1 = r6.f272557t
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.aa.aj r1 = (com.google.android.apps.gsa.shared.p6968aa.C89012aj) r1
            r1.mo27498i(r0)
            r1 = 0
            r2 = 0
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0099, IOException -> 0x0073, all -> 0x0070 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0099, IOException -> 0x0073, all -> 0x0070 }
            r4.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0099, IOException -> 0x0073, all -> 0x0070 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0099, IOException -> 0x0073, all -> 0x0070 }
            android.content.Context r0 = r6.f272548k     // Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0066, all -> 0x0061 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0066, all -> 0x0061 }
            java.io.OutputStream r2 = r0.openOutputStream(r7)     // Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0066, all -> 0x0061 }
            com.google.common.p4541l.C59332o.m92211b(r3, r2)     // Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0066, all -> 0x0061 }
            com.google.common.p4541l.C59337t.m92221a(r3)
            com.google.common.p4541l.C59317ae.m92163a(r2)
            r7 = 1
            return r7
        L_0x0061:
            r7 = move-exception
            r5 = r3
            r3 = r2
            r2 = r5
            goto L_0x00b7
        L_0x0066:
            r0 = move-exception
            r5 = r3
            r3 = r2
            r2 = r5
            goto L_0x0075
        L_0x006b:
            r0 = move-exception
            r5 = r3
            r3 = r2
            r2 = r5
            goto L_0x009b
        L_0x0070:
            r7 = move-exception
            r3 = r2
            goto L_0x00b7
        L_0x0073:
            r0 = move-exception
            r3 = r2
        L_0x0075:
            com.google.common.f.a.d r4 = f272500a     // Catch:{ all -> 0x0097 }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ all -> 0x0097 }
            com.google.common.f.a.a r4 = (com.google.common.p4526f.p4527a.C58970a) r4     // Catch:{ all -> 0x0097 }
            com.google.common.f.x r0 = r4.mo56382g(r0)     // Catch:{ all -> 0x0097 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0097 }
            r4 = 22178(0x56a2, float:3.1078E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r4)     // Catch:{ all -> 0x0097 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0097 }
            java.lang.String r4 = "captureCronetNetLog: failed to copy netlog file: %s"
            r0.mo56389s(r4, r7)     // Catch:{ all -> 0x0097 }
        L_0x0090:
            com.google.common.p4541l.C59337t.m92221a(r2)
            com.google.common.p4541l.C59317ae.m92163a(r3)
            return r1
        L_0x0097:
            r7 = move-exception
            goto L_0x00b7
        L_0x0099:
            r0 = move-exception
            r3 = r2
        L_0x009b:
            com.google.common.f.a.d r4 = f272500a     // Catch:{ all -> 0x0097 }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ all -> 0x0097 }
            com.google.common.f.a.a r4 = (com.google.common.p4526f.p4527a.C58970a) r4     // Catch:{ all -> 0x0097 }
            com.google.common.f.x r0 = r4.mo56382g(r0)     // Catch:{ all -> 0x0097 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0097 }
            r4 = 22177(0x56a1, float:3.1077E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r4)     // Catch:{ all -> 0x0097 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0097 }
            java.lang.String r4 = "captureCronetNetLog: invalid uri: %s"
            r0.mo56389s(r4, r7)     // Catch:{ all -> 0x0097 }
            goto L_0x0090
        L_0x00b7:
            com.google.common.p4541l.C59337t.m92221a(r2)
            com.google.common.p4541l.C59317ae.m92163a(r3)
            goto L_0x00bf
        L_0x00be:
            throw r7
        L_0x00bf:
            goto L_0x00be
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7648ce.C97565ax.mo48806by(android.net.Uri):boolean");
    }

    /* renamed from: bz */
    public final boolean mo48807bz() {
        for (C84250e e : C84251f.f229272a) {
            e.mo77734e();
        }
        return false;
    }

    /* renamed from: c */
    public final int mo48808c() {
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22127)).mo56386p("getNowOptInVersion()");
        return Math.max(((C85651bb) this.f272561x.mo27525b()).mo79146g(), 0);
    }

    /* renamed from: ca */
    public final byte[] mo48809ca() {
        return this.f272549l.mo79748n().toByteArray();
    }

    /* renamed from: cb */
    public final byte[] mo48810cb(String str, String str2, String[] strArr) {
        return ((C86346z) this.f272553p.mo80039a(str, str2)).mo80101g(strArr).toByteArray();
    }

    /* renamed from: cc */
    public final byte[] mo48811cc(boolean z, String[] strArr) {
        return m161519cs(z).mo80101g(strArr).toByteArray();
    }

    /* renamed from: cd */
    public final byte[] mo48812cd() {
        return ((C92541i) this.f272520R.mo27525b()).mo87316a().toByteArray();
    }

    /* renamed from: ce */
    public final byte[] mo48813ce(boolean z, String[] strArr) {
        C86346z cs = m161519cs(z);
        HashSet hashSet = new HashSet();
        for (String a : strArr) {
            hashSet.addAll(cs.mo79999a(a).keySet());
        }
        return cs.mo80101g((String[]) hashSet.toArray(new String[hashSet.size()])).toByteArray();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r9 = com.google.android.apps.gsa.staticplugins.p7648ce.C97570e.f272574a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0077 */
    /* renamed from: cf */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double[] mo48814cf() {
        /*
            r13 = this;
            com.google.android.apps.gsa.staticplugins.ce.e r0 = com.google.android.apps.gsa.staticplugins.p7648ce.C97570e.m161702a()
            r1 = 0
            double[] r2 = new double[r1]
            java.lang.Class<com.google.android.apps.gsa.staticplugins.ce.e> r3 = com.google.android.apps.gsa.staticplugins.p7648ce.C97570e.class
            monitor-enter(r3)
            java.lang.Process r4 = r0.f272578c     // Catch:{ all -> 0x00c5 }
            if (r4 == 0) goto L_0x00bd
            java.io.OutputStream r4 = r4.getOutputStream()     // Catch:{ all -> 0x00c5 }
            java.lang.Process r5 = r0.f272578c     // Catch:{ all -> 0x00c5 }
            java.io.InputStream r5 = r5.getErrorStream()     // Catch:{ all -> 0x00c5 }
            if (r4 == 0) goto L_0x00b5
            java.lang.String r6 = "\n"
            java.lang.String r7 = "UTF-8"
            byte[] r6 = r6.getBytes(r7)     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            r4.write(r6)     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            if (r5 == 0) goto L_0x00b5
            java.util.List r4 = r0.f272579d     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            if (r4 == 0) goto L_0x00b5
            int r6 = r4.size()     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            double[] r6 = new double[r6]     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            r8.<init>(r5)     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            r8 = 0
        L_0x003c:
            int r9 = r4.size()     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            if (r8 >= r9) goto L_0x0081
            java.lang.String r9 = r7.readLine()     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            if (r9 == 0) goto L_0x0081
            java.lang.String r9 = r9.trim()     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            boolean r10 = r9.isEmpty()     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            if (r10 != 0) goto L_0x003c
            java.lang.Object r10 = r4.get(r8)     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            boolean r10 = r9.endsWith(r10)     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            if (r10 == 0) goto L_0x003c
            java.lang.Object r10 = r4.get(r8)     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            int r10 = r9.indexOf(r10)     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            java.lang.String r9 = r9.substring(r1, r10)     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            int r10 = r8 + 1
            double r11 = java.lang.Double.parseDouble(r9)     // Catch:{ NumberFormatException -> 0x0077 }
            java.lang.Double r9 = java.lang.Double.valueOf(r11)     // Catch:{ NumberFormatException -> 0x0077 }
            goto L_0x0079
        L_0x0077:
            java.lang.Double r9 = com.google.android.apps.gsa.staticplugins.p7648ce.C97570e.f272574a     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
        L_0x0079:
            double r11 = r9.doubleValue()     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            r6[r8] = r11     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            r8 = r10
            goto L_0x003c
        L_0x0081:
            r7.close()     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            int r4 = r4.size()     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            if (r8 != r4) goto L_0x008c
            r2 = r6
            goto L_0x00b5
        L_0x008c:
            double[] r2 = new double[r1]     // Catch:{ IOException -> 0x00a0, Exception -> 0x0091 }
            goto L_0x00b5
        L_0x008f:
            r1 = move-exception
            goto L_0x00ac
        L_0x0091:
            r1 = move-exception
            java.lang.String r4 = "Unchecked exception when stopping perf event tool"
            r0.mo90751b(r4, r1)     // Catch:{ all -> 0x008f }
            if (r5 == 0) goto L_0x009c
            com.google.common.p4541l.C59337t.m92221a(r5)     // Catch:{ all -> 0x00c5 }
        L_0x009c:
            r0.mo90752c()     // Catch:{ all -> 0x00c5 }
            goto L_0x00bb
        L_0x00a0:
            r1 = move-exception
            java.lang.String r4 = "Fail at stopping perf event or fail at collecting stats"
            r0.mo90751b(r4, r1)     // Catch:{ all -> 0x008f }
            if (r5 == 0) goto L_0x009c
            com.google.common.p4541l.C59337t.m92221a(r5)     // Catch:{ all -> 0x00c5 }
            goto L_0x009c
        L_0x00ac:
            if (r5 == 0) goto L_0x00b1
            com.google.common.p4541l.C59337t.m92221a(r5)     // Catch:{ all -> 0x00c5 }
        L_0x00b1:
            r0.mo90752c()     // Catch:{ all -> 0x00c5 }
            throw r1     // Catch:{ all -> 0x00c5 }
        L_0x00b5:
            if (r5 == 0) goto L_0x009c
            com.google.common.p4541l.C59337t.m92221a(r5)     // Catch:{ all -> 0x00c5 }
            goto L_0x009c
        L_0x00bb:
            monitor-exit(r3)     // Catch:{ all -> 0x00c5 }
            return r2
        L_0x00bd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "Can't stop perf event counter while it is not started yet."
            r0.<init>(r1)     // Catch:{ all -> 0x00c5 }
            throw r0     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00c5 }
            goto L_0x00c9
        L_0x00c8:
            throw r0
        L_0x00c9:
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7648ce.C97565ax.mo48814cf():double[]");
    }

    /* renamed from: cg */
    public final String[] mo48815cg() {
        return this.f272514L.mo84236k();
    }

    /* renamed from: ch */
    public final String[] mo48816ch(String str) {
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22208)).mo56389s("getTopContactNames(%s)", str);
        C92223f fVar = (C92223f) ((Map) this.f272555r.mo27525b()).get(aj.a(str.toUpperCase(Locale.US)));
        List a = fVar != null ? fVar.mo70789a() : null;
        return (a == null || a.isEmpty()) ? new String[0] : (String[]) a.toArray(new String[a.size()]);
    }

    /* renamed from: ci */
    public final String[] mo48817ci(String str) {
        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22209)).mo56389s("getTopContactNamesByAffinityType(%s)", str);
        List list = (List) Collection.EL.stream(((cp) this.f272528Z.mo27525b()).a(ci.a(str.toUpperCase(Locale.US)))).sorted(Comparator.EL.reversed(Comparator.CC.comparingDouble(C97587v.f272606a))).map(C97589x.f272608a).collect(C58370cn.f155946a);
        return (list == null || list.isEmpty()) ? new String[0] : (String[]) list.toArray(new String[list.size()]);
    }

    /* renamed from: cj */
    public final String[] mo48818cj(String str) {
        C58485gu guVar;
        C58974d dVar = f272500a;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(22210)).mo56389s("getTopContactNamesByAffinityTypeTng(%s)", str);
        ci a = ci.a(str.toUpperCase(Locale.US));
        try {
            C32376ar arVar = (C32376ar) ((C32389bd) this.f272536ah.mo27525b()).mo38053b(BuildConfig.FLAVOR).get();
            if (a == ci.b) {
                C62971cq cqVar = arVar.f86798a;
                ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(22214)).mo56387q("TopCallContactsList size: (%d)", cqVar.size());
                guVar = (C58485gu) Collection.EL.stream(cqVar).sorted(Comparator.EL.reversed(Comparator.CC.comparingDouble(C97549ah.f272483a))).map(C97550ai.f272484a).collect(C58370cn.f155946a);
            } else if (a == ci.c) {
                C62971cq cqVar2 = arVar.f86799b;
                ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(22213)).mo56387q("TopTextContactsList size: (%d)", cqVar2.size());
                guVar = (C58485gu) Collection.EL.stream(cqVar2).sorted(Comparator.EL.reversed(Comparator.CC.comparingDouble(C97551aj.f272485a))).map(C97552ak.f272486a).collect(C58370cn.f155946a);
            } else {
                C62971cq cqVar3 = arVar.f86800c;
                ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(22211)).mo56387q("TopAggregateContactsList size: (%d)", cqVar3.size());
                guVar = (C58485gu) Collection.EL.stream(cqVar3).sorted(Comparator.EL.reversed(Comparator.CC.comparingDouble(C97553al.f272487a))).map(C97578m.f272595a).collect(C58370cn.f155946a);
            }
            if (guVar != null) {
                if (!guVar.isEmpty()) {
                    return (String[]) guVar.toArray(new String[0]);
                }
            }
            return new String[0];
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22212)).mo56386p("Unable to get top contacts.");
            return new String[0];
        }
    }

    /* renamed from: ck */
    public final String[] mo48819ck() {
        C58833ax axVar = (C58833ax) this.f272509G.mo27525b();
        if (!axVar.mo56113h()) {
            return f272502j;
        }
        C91006f g = C91006f.m148646g(0);
        ((C100321a) axVar.mo56107c()).mo91878b().mo17602gS(g);
        String i = g.mo85282i();
        if (i.isEmpty()) {
            return f272501i;
        }
        return i.split("\n");
    }

    /* renamed from: cl */
    public final void mo48820cl() {
        C58833ax axVar = (C58833ax) this.f272509G.mo27525b();
        if (axVar.mo56113h()) {
            C100321a aVar = (C100321a) axVar.mo56107c();
            aVar.f280539a = true;
            synchronized (aVar) {
                for (Map.Entry entry : aVar.f280540b.entrySet()) {
                    MutableContextWrapper mutableContextWrapper = (MutableContextWrapper) entry.getValue();
                    mutableContextWrapper.setBaseContext(aVar.mo91877a(mutableContextWrapper.getBaseContext(), (String) entry.getKey()));
                }
            }
        }
    }

    /* renamed from: cm */
    public final void mo48821cm() {
        m161525cy(mo48836r(), 14, true);
    }

    /* renamed from: cn */
    public final Bundle mo48822cn(Uri uri) {
        return mo48826f(uri);
    }

    /* renamed from: d */
    public final long mo48824d() {
        return ((cp) this.f272528Z.mo27525b()).a;
    }

    /* renamed from: e */
    public final Bundle mo48825e(Uri uri) {
        boolean z;
        String str;
        View g = mo90750g(7);
        if (g == null) {
            g = m161526cz();
        }
        if (g != null) {
            z = m161524cx(g, uri, 2);
            str = !z ? "Can't take (or write) screenshot" : BuildConfig.FLAVOR;
        } else {
            str = "Can't get stream view";
            z = false;
        }
        Bundle bundle = new Bundle();
        m161522cv(bundle, z, str);
        return bundle;
    }

    /* renamed from: f */
    public final Bundle mo48826f(Uri uri) {
        boolean z;
        File parentFile;
        Bundle bundle = new Bundle();
        C7744ii iiVar = (C7744ii) ((C58833ax) C60856cj.m92910s(((C91320ay) this.f272556s.mo27525b()).mo85614c(false, C8142xb.UNKNOWN_SURFACE))).mo56111f();
        if (iiVar == null) {
            m161522cv(bundle, false, "Entry tree not found");
            return bundle;
        }
        ContentResolver contentResolver = this.f272548k.getContentResolver();
        try {
            if (uri.getScheme().equals("file") && (parentFile = new File(uri.getPath()).getParentFile()) != null && !parentFile.exists()) {
                if (!parentFile.mkdirs()) {
                    throw new IOException("Can't create parent dir");
                }
            }
            OutputStream openOutputStream = contentResolver.openOutputStream(uri);
            if (openOutputStream != null) {
                iiVar.writeTo(openOutputStream);
                openOutputStream.flush();
                openOutputStream.close();
            }
            C59317ae.m92163a(openOutputStream);
            z = true;
        } catch (IOException e) {
            ((C58970a) ((C58970a) ((C58970a) f272500a.mo56225c()).mo56382g(e)).mo56372aa(22207)).mo56386p("Exception writing entry tree");
            C59317ae.m92163a((Closeable) null);
            z = false;
        } catch (Throwable th) {
            C59317ae.m92163a((Closeable) null);
            throw th;
        }
        m161522cv(bundle, z, true != z ? "Error writing to contentUri." : BuildConfig.FLAVOR);
        int i = bundle.getInt("status", 0);
        if (i != 0) {
            ((C58970a) ((C58970a) f272500a.mo56225c()).mo56372aa(22132)).mo56395y("Status: %s, error: %s", i, bundle.getString("errorMessage"));
        }
        return bundle;
    }

    /* renamed from: g */
    public final View mo90750g(int i) {
        if (C90934cd.m148548a()) {
            return m161527h(i);
        }
        C60870cx j = this.f272541b.mo85145j(new C97559ar(i));
        C91018d.m148680c();
        return (View) C60856cj.m92910s(j);
    }

    /* renamed from: i */
    public final com.google.android.apps.gsa.i.a.b mo48827i() {
        return (com.google.android.apps.gsa.i.a.b) ((C58833ax) this.f272525W.mo27525b()).mo56111f();
    }

    /* renamed from: j */
    public final com.google.android.apps.gsa.nga.e.b mo48828j() {
        return (com.google.android.apps.gsa.nga.e.b) ((C58833ax) this.f272524V.mo27525b()).mo56111f();
    }

    /* renamed from: k */
    public final C83681b mo48829k() {
        return (C83681b) ((C58833ax) this.f272526X.mo27525b()).mo56111f();
    }

    /* renamed from: l */
    public final C83714b mo48830l() {
        return (C83714b) ((C58833ax) this.f272523U.mo27525b()).mo56111f();
    }

    /* renamed from: m */
    public final C84167b mo48831m() {
        return (C84167b) ((C58833ax) this.f272510H.mo17428b()).mo56111f();
    }

    /* renamed from: n */
    public final ProtoLiteParcelable mo48832n(int i) {
        C60870cx g = C60922j.m93044g(this.f272529aa.mo46042d(), new C97545ad(i), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        try {
            return (ProtoLiteParcelable) C60856cj.m92910s(g);
        } catch (Exception unused) {
            return new ProtoLiteParcelable((MessageLite) C136856aw.f372499e);
        }
    }

    /* renamed from: o */
    public final ProtoLiteParcelable mo48833o(int i) {
        C22806b bVar;
        C97569d dVar = (C97569d) this.f272513K.mo27525b();
        C89851ag a = C89851ag.m146284a(i);
        C58838bb.m90871f(a != null, "Passed flowType (%s) is invalid", i);
        synchronized (dVar.f272570d) {
            Optional findFirst = Collection.EL.stream(dVar.f272570d).map(C97541a.f272474a).filter(new C97567b(i)).findFirst();
            if (findFirst.isPresent()) {
                ((C59052c) ((C59052c) C97569d.f272567a.mo56224b()).mo56372aa(22119)).mo56389s("Found AppFlow for Flow type:%s", a);
                bVar = (C22806b) findFirst.get();
            } else {
                ((C59052c) ((C59052c) C97569d.f272567a.mo56224b()).mo56372aa(22118)).mo56389s("Didn't find any AppFlow event for flowType: %s", a);
                bVar = null;
            }
        }
        return new ProtoLiteParcelable((MessageLite) bVar);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        PackageInfo[] packageInfoArr;
        if (C147799a.m240899a(this.f272548k.getPackageManager(), Binder.getCallingUid(), Process.myUid()) != 0) {
            PackageManager packageManager = this.f272548k.getPackageManager();
            String[] packagesForUid = packageManager.getPackagesForUid(Binder.getCallingUid());
            if (packagesForUid == null) {
                packageInfoArr = new PackageInfo[0];
            } else {
                PackageInfo[] packageInfoArr2 = new PackageInfo[packagesForUid.length];
                for (int i3 = 0; i3 < packagesForUid.length; i3++) {
                    try {
                        packageInfoArr2[i3] = packageManager.getPackageInfo(packagesForUid[i3], 64);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                packageInfoArr = packageInfoArr2;
            }
            int length = packageInfoArr.length;
            int i4 = 0;
            while (i4 < length) {
                PackageInfo packageInfo = packageInfoArr[i4];
                if (packageInfo != null) {
                    C45008d dVar = (C45008d) C45009e.f117617c.get(packageInfo.packageName);
                    C45008d dVar2 = null;
                    if (dVar == null) {
                        C58800sl lA = C45009e.f117617c.values().iterator();
                        while (true) {
                            if (!lA.hasNext()) {
                                dVar = null;
                                break;
                            }
                            C45008d dVar3 = (C45008d) lA.next();
                            if (dVar3.f117613c && packageInfo.packageName.startsWith(dVar3.f117611a.concat("."))) {
                                dVar = dVar3;
                                break;
                            }
                        }
                    }
                    if (dVar != null && packageInfo.signatures.length == 1 && dVar.f117612b.equals(packageInfo.signatures[0])) {
                        dVar2 = dVar;
                    }
                    if (dVar2 != null) {
                        if (dVar2 != C45009e.f117616b) {
                            if (dVar2.f117614d.contains(Integer.valueOf(i))) {
                            }
                        }
                        ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22180)).mo56352E("%s has access for transaction %s", packageInfo.packageName, i);
                    }
                }
                if (!(i == 1598968902 || i == 1598311760)) {
                    ((C58970a) ((C58970a) f272500a.mo56226d()).mo56372aa(22181)).mo56352E("%s does not have permission for transaction %s", packageInfo != null ? packageInfo.packageName : "(null)", i);
                    i4++;
                }
                ((C58970a) ((C58970a) f272500a.mo56224b()).mo56372aa(22180)).mo56352E("%s has access for transaction %s", packageInfo.packageName, i);
            }
            ((C58970a) ((C58970a) f272500a.mo56226d()).mo56372aa(22179)).mo56386p("No packages of the calling user id have access, rejecting call.");
            return false;
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    /* renamed from: p */
    public final ProtoLiteParcelable mo48834p(int i) {
        C22811d dVar;
        C97569d dVar2 = (C97569d) this.f272513K.mo27525b();
        C58838bb.m90871f(C89849ae.m146281a(i) != null, "Passed appFlowEventId (%s) is invalid", i);
        synchronized (dVar2.f272569c) {
            Iterator it = dVar2.f272569c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dVar = null;
                    break;
                }
                C22804a aVar = (C22804a) it.next();
                if (aVar.f62786a.f245884YW == i) {
                    dVar = C22813f.m42628a(aVar);
                    break;
                }
            }
        }
        return new ProtoLiteParcelable((MessageLite) dVar);
    }

    /* renamed from: q */
    public final ProtoLiteParcelable mo48835q() {
        C97569d dVar = (C97569d) this.f272513K.mo27525b();
        C22807c cVar = (C22807c) C22808d.f62799d.createBuilder();
        synchronized (dVar.f272569c) {
            for (C22804a a : dVar.f272569c) {
                C22811d a2 = C22813f.m42628a(a);
                cVar.copyOnWrite();
                C22808d dVar2 = (C22808d) cVar.instance;
                a2.getClass();
                C62971cq cqVar = dVar2.f62801a;
                if (!cqVar.mo58948c()) {
                    dVar2.f62801a = C62942bv.mutableCopy(cqVar);
                }
                dVar2.f62801a.add(a2);
            }
        }
        synchronized (dVar.f272571e) {
            for (NavigableSet a3 : dVar.f272571e) {
                C22806b a4 = C97569d.m161701a(a3);
                cVar.copyOnWrite();
                C22808d dVar3 = (C22808d) cVar.instance;
                a4.getClass();
                C62971cq cqVar2 = dVar3.f62803c;
                if (!cqVar2.mo58948c()) {
                    dVar3.f62803c = C62942bv.mutableCopy(cqVar2);
                }
                dVar3.f62803c.add(a4);
            }
        }
        synchronized (dVar.f272570d) {
            for (NavigableSet a5 : dVar.f272570d) {
                C22806b a6 = C97569d.m161701a(a5);
                cVar.copyOnWrite();
                C22808d dVar4 = (C22808d) cVar.instance;
                a6.getClass();
                C62971cq cqVar3 = dVar4.f62802b;
                if (!cqVar3.mo58948c()) {
                    dVar4.f62802b = C62942bv.mutableCopy(cqVar3);
                }
                dVar4.f62802b.add(a6);
            }
        }
        return new ProtoLiteParcelable((MessageLite) (C22808d) cVar.build());
    }

    /* renamed from: r */
    public final String mo48836r() {
        Account a = ((C86054o) this.f272560w.mo27525b()).mo79668a();
        if (a == null || a.name == null) {
            ((C86054o) this.f272560w.mo27525b()).mo79680n();
            a = ((C86054o) this.f272560w.mo27525b()).mo79668a();
        }
        return (a == null || a.name == null) ? BuildConfig.FLAVOR : a.name;
    }

    /* renamed from: s */
    public final String mo48837s() {
        return C87577a.f236619a;
    }

    /* renamed from: t */
    public final List mo48838t() {
        SettableFuture settableFuture;
        ArrayList arrayList = new ArrayList();
        for (C118522by name : ((Map) this.f272511I.mo27525b()).keySet()) {
            arrayList.add(name.name());
        }
        this.f272515M.mo28212l("TrustedTestBinder registers callback for FETCH_SEARCH_SERVICE_BACKGROUND_TASK_NAMES_RESULT service event", new C97580o(this, new C97554am(this)));
        m161521cu(new C88489j(C87739bu.FETCH_SEARCH_SERVICE_BACKGROUND_TASK_NAMES).mo82013a());
        try {
            arrayList.addAll((java.util.Collection) C90877ak.m148472f(this.f272547h));
            settableFuture = new SettableFuture();
        } catch (InterruptedException | ExecutionException e) {
            ((C58970a) ((C58970a) ((C58970a) f272500a.mo56225c()).mo56382g(e)).mo56372aa(22137)).mo56386p("Error while getting SearchServiceScope background task names");
            settableFuture = new SettableFuture();
        } catch (Throwable th) {
            this.f272547h = new SettableFuture();
            throw th;
        }
        this.f272547h = settableFuture;
        Collections.sort(arrayList);
        return C58485gu.m89842j(arrayList);
    }

    /* renamed from: u */
    public final List mo48839u() {
        C58480gp e = C58485gu.m89837e();
        for (C59794fv protoLiteParcelable : ((C118835b) this.f272531ac.mo27525b()).mo104027a()) {
            e.mo55395g(new ProtoLiteParcelable((MessageLite) protoLiteParcelable));
        }
        return e.mo55394f();
    }

    /* renamed from: v */
    public final List mo48840v() {
        return new ArrayList();
    }

    /* renamed from: w */
    public final List mo48841w() {
        return ((ActivityManager) this.f272548k.getSystemService("activity")).getRunningAppProcesses();
    }

    /* renamed from: x */
    public final List mo48842x() {
        return (List) Collection.EL.stream(Arrays.asList(ci.values())).map(C97585t.f272604a).collect(C58370cn.f155946a);
    }

    /* renamed from: y */
    public final List mo48843y(int i) {
        Bundle a;
        ArrayList arrayList = new ArrayList();
        for (C84250e eVar : C84251f.f229272a) {
            if (eVar.mo77734e() && (a = eVar.mo77730a(i)) != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: z */
    public final List mo48844z() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            C60555uf ufVar = (C60555uf) this.f272545f.poll();
            if (ufVar == null) {
                return arrayList;
            }
            arrayList.add(new ProtoLiteParcelable((MessageLite) ufVar));
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: cx */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m161524cx(android.view.View r7, android.net.Uri r8, int r9) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            if (r9 == r0) goto L_0x001e
            r2 = 2
            if (r9 == r2) goto L_0x001b
            r2 = 3
            if (r9 == r2) goto L_0x0018
            com.google.common.f.a.d r7 = f272500a
            com.google.common.f.x r7 = r7.mo56225c()
            java.lang.String r8 = "Invalid image format: %s"
            r0 = 22199(0x56b7, float:3.1107E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r7).mo56372aa(r0)).mo56387q(r8, r9)
            return r1
        L_0x0018:
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.WEBP
            goto L_0x0020
        L_0x001b:
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.PNG
            goto L_0x0020
        L_0x001e:
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.JPEG
        L_0x0020:
            com.google.android.apps.gsa.staticplugins.ce.i r2 = new com.google.android.apps.gsa.staticplugins.ce.i
            r2.<init>(r7)
            com.google.android.apps.gsa.shared.util.c.bz r7 = r6.f272541b
            r7.mo85151p(r2)
            com.google.common.util.concurrent.SettableFuture r7 = r2.f272587a
            java.lang.Object r7 = com.google.common.util.concurrent.C60856cj.m92910s(r7)
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            if (r7 != 0) goto L_0x0035
            return r1
        L_0x0035:
            android.content.Context r2 = r6.f272548k     // Catch:{ CancellationException -> 0x00be, ec -> 0x00af, bh -> 0x00a0 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ CancellationException -> 0x00be, ec -> 0x00af, bh -> 0x00a0 }
            com.google.android.apps.gsa.shared.s.a.a r3 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a     // Catch:{ CancellationException -> 0x00be, ec -> 0x00af, bh -> 0x00a0 }
            java.io.File r3 = new java.io.File     // Catch:{ CancellationException -> 0x00be, ec -> 0x00af, bh -> 0x00a0 }
            java.lang.String r4 = r8.toString()     // Catch:{ CancellationException -> 0x00be, ec -> 0x00af, bh -> 0x00a0 }
            java.net.URI r4 = java.net.URI.create(r4)     // Catch:{ CancellationException -> 0x00be, ec -> 0x00af, bh -> 0x00a0 }
            r3.<init>(r4)     // Catch:{ CancellationException -> 0x00be, ec -> 0x00af, bh -> 0x00a0 }
            java.io.File r3 = r3.getParentFile()     // Catch:{ CancellationException -> 0x00be, ec -> 0x00af, bh -> 0x00a0 }
            r4 = 0
            if (r3 == 0) goto L_0x0066
            boolean r5 = r3.exists()     // Catch:{ IOException -> 0x007b }
            if (r5 != 0) goto L_0x0066
            boolean r3 = r3.mkdirs()     // Catch:{ IOException -> 0x007b }
            if (r3 == 0) goto L_0x005e
            goto L_0x0066
        L_0x005e:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ IOException -> 0x007b }
            java.lang.String r8 = "Can't create parent dir"
            r7.<init>(r8)     // Catch:{ IOException -> 0x007b }
            throw r7     // Catch:{ IOException -> 0x007b }
        L_0x0066:
            java.io.OutputStream r4 = r2.openOutputStream(r8)     // Catch:{ IOException -> 0x007b }
            r8 = 90
            r7.compress(r9, r8, r4)     // Catch:{ IOException -> 0x007b }
            r4.flush()     // Catch:{ IOException -> 0x007b }
            r4.close()     // Catch:{ IOException -> 0x007b }
            com.google.common.p4541l.C59317ae.m92163a(r4)     // Catch:{ CancellationException -> 0x00be, ec -> 0x00af, bh -> 0x00a0 }
            goto L_0x009b
        L_0x0079:
            r7 = move-exception
            goto L_0x009c
        L_0x007b:
            r7 = move-exception
            com.google.common.f.e r8 = com.google.android.apps.gsa.staticplugins.p7648ce.C97571f.f272580a     // Catch:{ all -> 0x0079 }
            com.google.common.f.x r8 = r8.mo56225c()     // Catch:{ all -> 0x0079 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x0079 }
            com.google.common.f.x r7 = r8.mo56382g(r7)     // Catch:{ all -> 0x0079 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0079 }
            r8 = 22124(0x566c, float:3.1002E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r8)     // Catch:{ all -> 0x0079 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0079 }
            java.lang.String r8 = "Exception writing compressed"
            r7.mo56386p(r8)     // Catch:{ all -> 0x0079 }
            com.google.common.p4541l.C59317ae.m92163a(r4)     // Catch:{ CancellationException -> 0x00be, ec -> 0x00af, bh -> 0x00a0 }
            r0 = 0
        L_0x009b:
            return r0
        L_0x009c:
            com.google.common.p4541l.C59317ae.m92163a(r4)     // Catch:{ CancellationException -> 0x00be, ec -> 0x00af, bh -> 0x00a0 }
            throw r7     // Catch:{ CancellationException -> 0x00be, ec -> 0x00af, bh -> 0x00a0 }
        L_0x00a0:
            r7 = move-exception
            com.google.common.f.a.d r8 = f272500a
            com.google.common.f.x r8 = r8.mo56225c()
            java.lang.String r9 = "Error occurred while taking screenshot"
            r0 = 22202(0x56ba, float:3.1112E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r8).mo56382g(r7)).mo56372aa(r0)).mo56386p(r9)
            goto L_0x00cc
        L_0x00af:
            r7 = move-exception
            com.google.common.f.a.d r8 = f272500a
            com.google.common.f.x r8 = r8.mo56225c()
            java.lang.String r9 = "Exception was thrown while taking screenshot"
            r0 = 22201(0x56b9, float:3.111E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r8).mo56382g(r7)).mo56372aa(r0)).mo56386p(r9)
            goto L_0x00cc
        L_0x00be:
            r7 = move-exception
            com.google.common.f.a.d r8 = f272500a
            com.google.common.f.x r8 = r8.mo56225c()
            java.lang.String r9 = "Screenshot taking is cancelled"
            r0 = 22200(0x56b8, float:3.1109E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r8).mo56382g(r7)).mo56372aa(r0)).mo56386p(r9)
        L_0x00cc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7648ce.C97565ax.m161524cx(android.view.View, android.net.Uri, int):boolean");
    }

    @Deprecated
    /* renamed from: co */
    public final void mo48823co(C89955w wVar) {
        wVar.getClass();
        C97560as asVar = new C97560as(wVar);
        synchronized (C89947o.f246445a.f246459i) {
            C89947o.f246445a.f246459i.add(asVar);
        }
    }

    /* renamed from: av */
    public final void mo48750av(ProtoLiteParcelable protoLiteParcelable) {
        protoLiteParcelable.getClass();
        C86115k kVar = (C86115k) protoLiteParcelable.mo84191d(C86115k.f232756b.getParserForType());
        if (kVar != null) {
            C86110f fVar = (C86110f) m161517cq().toBuilder();
            for (C86113i ao : kVar.f232758a) {
                m161515ao(fVar, ao);
            }
            m161523cw((C86111g) fVar.build());
        }
    }
}
