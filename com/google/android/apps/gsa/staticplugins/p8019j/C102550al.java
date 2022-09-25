package com.google.android.apps.gsa.staticplugins.p8019j;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import androidx.core.app.C1793aj;
import androidx.core.app.C1800aq;
import com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b.C9684l;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.assistant.shared.C73800ac;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.android.apps.gsa.nga.api.C74715bp;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6370a.C81517a;
import com.google.android.apps.gsa.p5850f.C74523c;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.google.p6790a.C85813be;
import com.google.android.apps.gsa.search.core.p6491a.C84375u;
import com.google.android.apps.gsa.search.core.p6491a.p6492a.C84341b;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90364ac;
import com.google.android.apps.gsa.shared.p7066m.C89971aj;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.p7066m.C90040cs;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.gsa.shared.p7066m.C90061dm;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.p7066m.C90137p;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90729am;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.lens.view.p2162s.C27683a;
import com.google.android.libraries.search.assistant.proactive.C36337r;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51060ex;
import com.google.assistant.p3897e.p3902c.p3907c.C51061ey;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3902c.p3907c.C51099gi;
import com.google.assistant.p3897e.p3902c.p3907c.C51100gj;
import com.google.assistant.p3897e.p3902c.p3907c.C51133hp;
import com.google.assistant.p3897e.p3921j.C51690ar;
import com.google.assistant.p3897e.p3921j.C51691as;
import com.google.assistant.p3897e.p3921j.C51692at;
import com.google.assistant.p3897e.p3921j.C51693au;
import com.google.assistant.p3897e.p3921j.C51697ay;
import com.google.assistant.p3897e.p3921j.C51698az;
import com.google.assistant.p3897e.p3921j.C51703ba;
import com.google.assistant.p3897e.p3921j.C51704bb;
import com.google.assistant.p3897e.p3921j.C51705bc;
import com.google.assistant.p3897e.p3921j.C51707be;
import com.google.assistant.p3897e.p3921j.C51714bl;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C51719bq;
import com.google.assistant.p3897e.p3921j.C51720br;
import com.google.assistant.p3897e.p3921j.C51724bv;
import com.google.assistant.p3897e.p3921j.C51725bw;
import com.google.assistant.p3897e.p3921j.C51727by;
import com.google.assistant.p3897e.p3921j.C51749cb;
import com.google.assistant.p3897e.p3921j.C51750cc;
import com.google.assistant.p3897e.p3921j.C51751cd;
import com.google.assistant.p3897e.p3921j.C51752ce;
import com.google.assistant.p3897e.p3921j.C51753cf;
import com.google.assistant.p3897e.p3921j.C51754cg;
import com.google.assistant.p3897e.p3921j.C51758ck;
import com.google.assistant.p3897e.p3921j.C51761cn;
import com.google.assistant.p3897e.p3921j.C51763cp;
import com.google.assistant.p3897e.p3921j.C51764cq;
import com.google.assistant.p3897e.p3921j.C51765cr;
import com.google.assistant.p3897e.p3921j.C51766cs;
import com.google.assistant.p3897e.p3921j.C51767ct;
import com.google.assistant.p3897e.p3921j.C51768cu;
import com.google.assistant.p3897e.p3921j.C51771cx;
import com.google.assistant.p3897e.p3921j.C51772cy;
import com.google.assistant.p3897e.p3921j.C51773cz;
import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.assistant.p3897e.p3921j.C51786db;
import com.google.assistant.p3897e.p3921j.C51787dc;
import com.google.assistant.p3897e.p3921j.C51788dd;
import com.google.assistant.p3897e.p3921j.C51789de;
import com.google.assistant.p3897e.p3921j.C51790df;
import com.google.assistant.p3897e.p3921j.C51791dg;
import com.google.assistant.p3897e.p3921j.C51799do;
import com.google.assistant.p3897e.p3921j.C51800dp;
import com.google.assistant.p3897e.p3921j.C51802dr;
import com.google.assistant.p3897e.p3921j.C52239kj;
import com.google.assistant.p3897e.p3921j.C52240kk;
import com.google.assistant.p3897e.p3921j.C52241kl;
import com.google.assistant.p3897e.p3921j.C52242km;
import com.google.assistant.p3897e.p3921j.C52243kn;
import com.google.assistant.p3897e.p3921j.C52245kp;
import com.google.assistant.p3897e.p3921j.C52247kr;
import com.google.assistant.p3897e.p3921j.C52248ks;
import com.google.assistant.p3897e.p3921j.C52249kt;
import com.google.assistant.p3897e.p3921j.C52250ku;
import com.google.assistant.p3897e.p3921j.C52252kw;
import com.google.assistant.p3897e.p3921j.C52253kx;
import com.google.assistant.p3897e.p3921j.C52258lb;
import com.google.assistant.p3897e.p3921j.C52260ld;
import com.google.assistant.p3897e.p3921j.C52261le;
import com.google.assistant.p3897e.p3921j.C52262lf;
import com.google.assistant.p3897e.p3921j.C52263lg;
import com.google.assistant.p3897e.p3921j.C52264lh;
import com.google.assistant.p3897e.p3921j.C52265li;
import com.google.assistant.p3897e.p3921j.C52266lj;
import com.google.assistant.p3897e.p3921j.C52267lk;
import com.google.assistant.p3897e.p3921j.C52269lm;
import com.google.assistant.p3897e.p3921j.C52427ri;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.assistant.p3897e.p3921j.ame;
import com.google.assistant.p3897e.p3921j.amf;
import com.google.assistant.p3897e.p3921j.amg;
import com.google.assistant.p3897e.p3921j.amh;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.al */
/* compiled from: PG */
public final class C102550al implements C73800ac {

    /* renamed from: a */
    public static final C59071e f286195a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.j.al");

    /* renamed from: A */
    private final C68214a f286196A;

    /* renamed from: B */
    private final C22871g f286197B;

    /* renamed from: C */
    private final Random f286198C;

    /* renamed from: D */
    private final C58833ax f286199D;

    /* renamed from: E */
    private final C68214a f286200E;

    /* renamed from: F */
    private final boolean f286201F;

    /* renamed from: b */
    public final Context f286202b;

    /* renamed from: c */
    public final C68214a f286203c;

    /* renamed from: d */
    public final C58833ax f286204d;

    /* renamed from: e */
    public final C68214a f286205e;

    /* renamed from: f */
    public final C36337r f286206f;

    /* renamed from: g */
    public final C68214a f286207g;

    /* renamed from: h */
    public final C9684l f286208h;

    /* renamed from: i */
    public final C68214a f286209i;

    /* renamed from: j */
    public final C90476a f286210j;

    /* renamed from: k */
    public final C58833ax f286211k;

    /* renamed from: l */
    public final C118831d f286212l;

    /* renamed from: m */
    public final C118831d f286213m;

    /* renamed from: n */
    private final AudioManager f286214n;

    /* renamed from: o */
    private final C68214a f286215o;

    /* renamed from: p */
    private final C58833ax f286216p;

    /* renamed from: q */
    private final bm f286217q;

    /* renamed from: r */
    private final C68214a f286218r;

    /* renamed from: s */
    private final C86338r f286219s;

    /* renamed from: t */
    private final C68214a f286220t;

    /* renamed from: u */
    private final ae f286221u;

    /* renamed from: v */
    private final C68214a f286222v;

    /* renamed from: w */
    private final C58833ax f286223w;

    /* renamed from: x */
    private final C58833ax f286224x;

    /* renamed from: y */
    private final C58833ax f286225y;

    /* renamed from: z */
    private final C68214a f286226z;

    public C102550al(Context context, AudioManager audioManager, C68214a aVar, C58833ax axVar, C68214a aVar2, C68214a aVar3, C58833ax axVar2, bm bmVar, C68214a aVar4, C36337r rVar, C86338r rVar2, C68214a aVar5, ae aeVar, C68214a aVar6, C68214a aVar7, C58833ax axVar3, C58833ax axVar4, C9684l lVar, C58833ax axVar5, C118827a aVar8, C68214a aVar9, C22871g gVar, C68214a aVar10, C68214a aVar11, Random random, C90476a aVar12, C58833ax axVar6, C58833ax axVar7, C68214a aVar13, C58833ax axVar8) {
        C118827a aVar14 = aVar8;
        this.f286202b = context;
        this.f286214n = audioManager;
        this.f286203c = aVar;
        this.f286204d = axVar;
        this.f286205e = aVar2;
        this.f286215o = aVar3;
        this.f286216p = axVar2;
        this.f286217q = bmVar;
        this.f286218r = aVar4;
        this.f286206f = rVar;
        this.f286219s = rVar2;
        this.f286220t = aVar5;
        this.f286221u = aeVar;
        this.f286207g = aVar6;
        this.f286222v = aVar7;
        this.f286223w = axVar3;
        this.f286224x = axVar4;
        this.f286208h = lVar;
        this.f286225y = axVar5;
        this.f286196A = aVar9;
        this.f286197B = gVar;
        this.f286209i = aVar10;
        this.f286226z = aVar11;
        this.f286198C = random;
        this.f286212l = aVar14.mo77944g(C118569b.ASSISTANT_REQUEST_DEVICE_CAPABILITIES_BUILD_TIME_MS, C118575h.WORKER_ASSISTANT_REQUEST);
        this.f286213m = aVar14.mo77944g(C118569b.ASSISTANT_REQUEST_DEVICE_CAPABILITIES_SIZE_BYTES, C118575h.WORKER_ASSISTANT_REQUEST);
        this.f286210j = aVar12;
        this.f286199D = axVar6;
        this.f286211k = axVar7;
        this.f286200E = aVar13;
        boolean z = true;
        if ((!axVar8.mo56113h() || ((C81517a) axVar8.mo56107c()).mo75125b() != 2) && !((C86124t) aVar.mo27525b()).mo79746e(C90029ch.f248283bq)) {
            z = false;
        }
        this.f286201F = z;
    }

    /* renamed from: f */
    public static void m170053f(StringBuilder sb, String str) {
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) != ';') {
            sb.append(";");
        }
        sb.append(str);
    }

    /* renamed from: k */
    public static void m170054k(C51714bl blVar) {
        C51772cy cyVar = ((C51715bm) blVar.instance).f135671h;
        if (cyVar == null) {
            cyVar = C51772cy.f135824p;
        }
        C51771cx cxVar = (C51771cx) cyVar.toBuilder();
        C51772cy cyVar2 = ((C51715bm) blVar.instance).f135671h;
        if (cyVar2 == null) {
            cyVar2 = C51772cy.f135824p;
        }
        C51768cu cuVar = cyVar2.f135835j;
        if (cuVar == null) {
            cuVar = C51768cu.f135816e;
        }
        C51767ct ctVar = (C51767ct) cuVar.toBuilder();
        ctVar.copyOnWrite();
        C51768cu cuVar2 = (C51768cu) ctVar.instance;
        cuVar2.f135818a |= 1;
        cuVar2.f135819b = true;
        cxVar.copyOnWrite();
        C51772cy cyVar3 = (C51772cy) cxVar.instance;
        C51768cu cuVar3 = (C51768cu) ctVar.build();
        cuVar3.getClass();
        cyVar3.f135835j = cuVar3;
        cyVar3.f135826a |= 256;
        C51772cy cyVar4 = (C51772cy) cxVar.build();
        blVar.copyOnWrite();
        C51715bm bmVar = (C51715bm) blVar.instance;
        cyVar4.getClass();
        bmVar.f135671h = cyVar4;
        bmVar.f135664a |= 128;
    }

    /* renamed from: m */
    public static void m170055m(C51714bl blVar, int i) {
        C51772cy cyVar = ((C51715bm) blVar.instance).f135671h;
        if (cyVar == null) {
            cyVar = C51772cy.f135824p;
        }
        C51771cx cxVar = (C51771cx) cyVar.toBuilder();
        C51786db dbVar = (C51786db) C51787dc.f135881c.createBuilder();
        dbVar.copyOnWrite();
        C51787dc dcVar = (C51787dc) dbVar.instance;
        dcVar.f135883a |= 1;
        dcVar.f135884b = i;
        cxVar.copyOnWrite();
        C51772cy cyVar2 = (C51772cy) cxVar.instance;
        C51787dc dcVar2 = (C51787dc) dbVar.build();
        dcVar2.getClass();
        cyVar2.f135833h = dcVar2;
        cyVar2.f135826a |= 64;
        C51772cy cyVar3 = (C51772cy) cxVar.build();
        blVar.copyOnWrite();
        C51715bm bmVar = (C51715bm) blVar.instance;
        cyVar3.getClass();
        bmVar.f135671h = cyVar3;
        bmVar.f135664a |= 128;
    }

    /* renamed from: o */
    public static void m170056o(C51714bl blVar) {
        C51772cy cyVar = ((C51715bm) blVar.instance).f135671h;
        if (cyVar == null) {
            cyVar = C51772cy.f135824p;
        }
        C52265li liVar = cyVar.f135828c;
        if (liVar == null) {
            liVar = C52265li.f137167I;
        }
        C52264lh lhVar = (C52264lh) liVar.toBuilder();
        lhVar.copyOnWrite();
        C52265li liVar2 = (C52265li) lhVar.instance;
        liVar2.f137178b |= 512;
        liVar2.f137169A = true;
        C52265li liVar3 = (C52265li) lhVar.build();
        C51772cy cyVar2 = ((C51715bm) blVar.instance).f135671h;
        if (cyVar2 == null) {
            cyVar2 = C51772cy.f135824p;
        }
        C51771cx cxVar = (C51771cx) cyVar2.toBuilder();
        cxVar.copyOnWrite();
        C51772cy cyVar3 = (C51772cy) cxVar.instance;
        liVar3.getClass();
        cyVar3.f135828c = liVar3;
        cyVar3.f135826a |= 1;
        C51772cy cyVar4 = (C51772cy) cxVar.build();
        blVar.copyOnWrite();
        C51715bm bmVar = (C51715bm) blVar.instance;
        cyVar4.getClass();
        bmVar.f135671h = cyVar4;
        bmVar.f135664a |= 128;
    }

    /* renamed from: p */
    private static int m170057p(Paint paint, String str) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return Math.max(rect.width(), rect.height());
    }

    /* renamed from: q */
    private final C60870cx m170058q(C102549ak akVar) {
        C58833ax axVar;
        C51727by byVar;
        C51714bl blVar = (C51714bl) C51715bm.f135662t.createBuilder();
        String e = mo93330e();
        blVar.copyOnWrite();
        C51715bm bmVar = (C51715bm) blVar.instance;
        bmVar.f135664a |= 2;
        bmVar.f135666c = e;
        if (((C86124t) this.f286203c.mo27525b()).mo79746e(C90014bt.f247382gB)) {
            blVar.copyOnWrite();
            C51715bm bmVar2 = (C51715bm) blVar.instance;
            bmVar2.f135682s = 1;
            bmVar2.f135664a |= 268435456;
        }
        m170062u(blVar, akVar.mo93323a());
        m170061t(blVar);
        C51761cn cnVar = (C51761cn) C51766cs.f135811e.createBuilder();
        C51764cq cqVar = (C51764cq) C51765cr.f135802g.createBuilder();
        if (this.f286216p.mo56113h()) {
            axVar = C58833ax.m90834k(((C108100a) this.f286216p.mo56107c()).mo96437b());
        } else {
            axVar = C58836b.f156633a;
        }
        if (!axVar.mo56113h() || ((Integer) ((Pair) axVar.mo56107c()).first).intValue() == 0 || ((Integer) ((Pair) axVar.mo56107c()).second).intValue() == 0) {
            C58976aa aaVar = C58975e.f156826a;
            DisplayMetrics displayMetrics = this.f286202b.getResources().getDisplayMetrics();
            int i = displayMetrics.widthPixels;
            cqVar.copyOnWrite();
            C51765cr crVar = (C51765cr) cqVar.instance;
            crVar.f135804a |= 1;
            crVar.f135805b = i;
            int i2 = displayMetrics.heightPixels;
            cqVar.copyOnWrite();
            C51765cr crVar2 = (C51765cr) cqVar.instance;
            crVar2.f135804a |= 2;
            crVar2.f135806c = i2;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            int intValue = ((Integer) ((Pair) axVar.mo56107c()).first).intValue();
            cqVar.copyOnWrite();
            C51765cr crVar3 = (C51765cr) cqVar.instance;
            crVar3.f135804a |= 1;
            crVar3.f135805b = intValue;
            int intValue2 = ((Integer) ((Pair) axVar.mo56107c()).second).intValue();
            cqVar.copyOnWrite();
            C51765cr crVar4 = (C51765cr) cqVar.instance;
            crVar4.f135804a |= 2;
            crVar4.f135806c = intValue2;
        }
        C51765cr crVar5 = (C51765cr) cqVar.instance;
        int i3 = crVar5.f135805b;
        int i4 = crVar5.f135806c;
        Paint paint = new Paint();
        int p = m170057p(paint, "M");
        cqVar.copyOnWrite();
        C51765cr crVar6 = (C51765cr) cqVar.instance;
        crVar6.f135804a |= 4;
        crVar6.f135807d = p;
        int p2 = m170057p(paint, "螚");
        cqVar.copyOnWrite();
        C51765cr crVar7 = (C51765cr) cqVar.instance;
        crVar7.f135804a |= 8;
        crVar7.f135808e = p2;
        int i5 = this.f286202b.getResources().getDisplayMetrics().densityDpi;
        cqVar.copyOnWrite();
        C51765cr crVar8 = (C51765cr) cqVar.instance;
        crVar8.f135804a |= 16;
        crVar8.f135809f = i5;
        cnVar.copyOnWrite();
        C51766cs csVar = (C51766cs) cnVar.instance;
        C51765cr crVar9 = (C51765cr) cqVar.build();
        crVar9.getClass();
        csVar.f135815d = crVar9;
        csVar.f135813a |= 1;
        if (this.f286202b.getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
            cnVar.mo53720a(C51763cp.f135799a);
        }
        blVar.copyOnWrite();
        C51715bm bmVar3 = (C51715bm) blVar.instance;
        C51766cs csVar2 = (C51766cs) cnVar.build();
        csVar2.getClass();
        bmVar3.f135670g = csVar2;
        bmVar3.f135664a |= 32;
        m170063v(blVar);
        C51771cx cxVar = (C51771cx) C51772cy.f135824p.createBuilder();
        C86124t tVar = (C86124t) this.f286203c.mo27525b();
        C52264lh lhVar = (C52264lh) C52265li.f137167I.createBuilder();
        C52239kj kjVar = (C52239kj) C52240kk.f137096j.createBuilder();
        kjVar.copyOnWrite();
        C52240kk kkVar = (C52240kk) kjVar.instance;
        kkVar.f137098a |= 1;
        kkVar.f137100c = false;
        kjVar.copyOnWrite();
        C52240kk kkVar2 = (C52240kk) kjVar.instance;
        kkVar2.f137098a |= 4;
        kkVar2.f137102e = false;
        kjVar.copyOnWrite();
        C52240kk kkVar3 = (C52240kk) kjVar.instance;
        kkVar3.f137098a |= 2;
        kkVar3.f137101d = false;
        kjVar.copyOnWrite();
        C52240kk kkVar4 = (C52240kk) kjVar.instance;
        kkVar4.f137098a |= 32;
        kkVar4.f137105h = true;
        kjVar.copyOnWrite();
        C52240kk kkVar5 = (C52240kk) kjVar.instance;
        kkVar5.f137098a |= 64;
        kkVar5.f137106i = true;
        C52240kk kkVar6 = (C52240kk) kjVar.build();
        lhVar.copyOnWrite();
        C52265li liVar = (C52265li) lhVar.instance;
        kkVar6.getClass();
        liVar.f137179c = kkVar6;
        liVar.f137177a |= 1;
        lhVar.copyOnWrite();
        C52265li liVar2 = (C52265li) lhVar.instance;
        liVar2.f137177a |= 8388608;
        liVar2.f137196t = false;
        lhVar.copyOnWrite();
        C52265li liVar3 = (C52265li) lhVar.instance;
        liVar3.f137177a |= 2;
        liVar3.f137180d = true;
        lhVar.copyOnWrite();
        C52265li liVar4 = (C52265li) lhVar.instance;
        liVar4.f137177a |= 4;
        liVar4.f137181e = true;
        lhVar.copyOnWrite();
        C52265li liVar5 = (C52265li) lhVar.instance;
        liVar5.f137177a |= 1024;
        liVar5.f137187k = false;
        lhVar.copyOnWrite();
        C52265li liVar6 = (C52265li) lhVar.instance;
        liVar6.f137177a |= 32;
        liVar6.f137184h = true;
        boolean a = ((C27683a) this.f286218r.mo27525b()).mo33174a();
        lhVar.copyOnWrite();
        C52265li liVar7 = (C52265li) lhVar.instance;
        liVar7.f137177a |= 4096;
        liVar7.f137189m = a;
        boolean v = this.f286217q.v();
        lhVar.copyOnWrite();
        C52265li liVar8 = (C52265li) lhVar.instance;
        liVar8.f137177a |= C89885b.HTTP_VALUE;
        liVar8.f137191o = v;
        C52258lb lbVar = C52258lb.OPA_ANDROID_LAUNCH_KEYBOARD_URI;
        lhVar.copyOnWrite();
        C52265li liVar9 = (C52265li) lhVar.instance;
        liVar9.f137197u = lbVar.f137142c;
        liVar9.f137177a |= 134217728;
        C52266lj ljVar = (C52266lj) C52267lk.f137203c.createBuilder();
        ljVar.copyOnWrite();
        C52267lk lkVar = (C52267lk) ljVar.instance;
        lkVar.f137205a |= 1;
        lkVar.f137206b = true;
        lhVar.copyOnWrite();
        C52265li liVar10 = (C52265li) lhVar.instance;
        C52267lk lkVar2 = (C52267lk) ljVar.build();
        lkVar2.getClass();
        liVar10.f137186j = lkVar2;
        liVar10.f137177a |= 128;
        C52250ku kuVar = (C52250ku) C52253kx.f137130c.createBuilder();
        C52252kw kwVar = C52252kw.DIALOG_STATE_PARAMS;
        kuVar.copyOnWrite();
        C52253kx kxVar = (C52253kx) kuVar.instance;
        kxVar.f137133b = kwVar.f137129c;
        kxVar.f137132a |= 1;
        lhVar.copyOnWrite();
        C52265li liVar11 = (C52265li) lhVar.instance;
        C52253kx kxVar2 = (C52253kx) kuVar.build();
        kxVar2.getClass();
        liVar11.f137199w = kxVar2;
        liVar11.f137177a |= 1073741824;
        C52269lm lmVar = C52269lm.TRANSACTIONS_V3;
        lhVar.copyOnWrite();
        C52265li liVar12 = (C52265li) lhVar.instance;
        liVar12.f137185i = lmVar.f137213e;
        liVar12.f137177a |= 64;
        byte[] e2 = this.f286219s.mo80079e("opa_discovered_duo_capabilities", (byte[]) null);
        if (e2 != null) {
            C63088z A = C63088z.m96139A(e2);
            lhVar.copyOnWrite();
            C52265li liVar13 = (C52265li) lhVar.instance;
            liVar13.f137177a |= 1048576;
            liVar13.f137193q = A;
        }
        if (tVar.mo79746e(C90019by.f248072f)) {
            C52241kl klVar = (C52241kl) C52242km.f137107c.createBuilder();
            klVar.copyOnWrite();
            C52242km kmVar = (C52242km) klVar.instance;
            kmVar.f137109a |= 1;
            kmVar.f137110b = true;
            lhVar.copyOnWrite();
            C52265li liVar14 = (C52265li) lhVar.instance;
            C52242km kmVar2 = (C52242km) klVar.build();
            kmVar2.getClass();
            liVar14.f137173E = kmVar2;
            liVar14.f137178b |= C89885b.HTTP_VALUE;
        }
        C52260ld ldVar = (C52260ld) C52263lg.f137151o.createBuilder();
        boolean e3 = ((C86124t) this.f286203c.mo27525b()).mo79746e(C90014bt.f247251dd);
        ldVar.copyOnWrite();
        C52263lg lgVar = (C52263lg) ldVar.instance;
        lgVar.f137153a |= 1;
        lgVar.f137154b = e3;
        boolean e4 = ((C86124t) this.f286203c.mo27525b()).mo79746e(C90014bt.f247250dc);
        ldVar.copyOnWrite();
        C52263lg lgVar2 = (C52263lg) ldVar.instance;
        lgVar2.f137153a |= 2;
        lgVar2.f137155c = e4;
        boolean e5 = ((C86124t) this.f286203c.mo27525b()).mo79746e(C90014bt.f247306ef);
        ldVar.copyOnWrite();
        C52263lg lgVar3 = (C52263lg) ldVar.instance;
        lgVar3.f137153a |= 512;
        lgVar3.f137162j = e5;
        boolean e6 = ((C86124t) this.f286203c.mo27525b()).mo79746e(C90061dm.f249195c);
        ldVar.copyOnWrite();
        C52263lg lgVar4 = (C52263lg) ldVar.instance;
        lgVar4.f137153a |= 1024;
        lgVar4.f137163k = e6;
        if (m170064w()) {
            ldVar.copyOnWrite();
            C52263lg lgVar5 = (C52263lg) ldVar.instance;
            lgVar5.f137153a |= 2;
            lgVar5.f137155c = true;
            ldVar.copyOnWrite();
            C52263lg lgVar6 = (C52263lg) ldVar.instance;
            lgVar6.f137153a |= 1;
            lgVar6.f137154b = true;
            C52247kr krVar = C52247kr.NGA_ESCAPE_HATCH;
            ldVar.copyOnWrite();
            C52263lg lgVar7 = (C52263lg) ldVar.instance;
            lgVar7.f137157e = krVar.f137120c;
            lgVar7.f137153a |= 8;
        }
        if (tVar.mo79746e(C90019by.f248090x)) {
            ldVar.copyOnWrite();
            C52263lg lgVar8 = (C52263lg) ldVar.instance;
            lgVar8.f137153a |= 4;
            lgVar8.f137156d = true;
        }
        ldVar.copyOnWrite();
        C52263lg lgVar9 = (C52263lg) ldVar.instance;
        lgVar9.f137153a |= 256;
        lgVar9.f137161i = true;
        if (tVar.mo79746e(C90014bt.f247317eq)) {
            ldVar.copyOnWrite();
            C52263lg lgVar10 = (C52263lg) ldVar.instance;
            lgVar10.f137153a |= 16;
            lgVar10.f137158f = true;
        }
        ldVar.copyOnWrite();
        C52263lg lgVar11 = (C52263lg) ldVar.instance;
        lgVar11.f137153a |= 32;
        lgVar11.f137159g = true;
        ldVar.copyOnWrite();
        C52263lg lgVar12 = (C52263lg) ldVar.instance;
        lgVar12.f137153a |= 128;
        lgVar12.f137160h = true;
        if (((C86124t) this.f286203c.mo27525b()).mo79746e(C90040cs.f248686y) || ((C86124t) this.f286203c.mo27525b()).mo79746e(C90040cs.f248678q) || ((C86124t) this.f286203c.mo27525b()).mo79746e(C90040cs.f248671j) || ((C86124t) this.f286203c.mo27525b()).mo79746e(C90014bt.f247793np)) {
            C52261le leVar = (C52261le) C52262lf.f137144f.createBuilder();
            C51133hp hpVar = C51133hp.DEFAULT;
            leVar.copyOnWrite();
            C52262lf lfVar = (C52262lf) leVar.instance;
            lfVar.f137147b = hpVar.f133102i;
            lfVar.f137146a |= 1;
            ldVar.mo53823a(leVar);
            if (tVar.mo79746e(C90040cs.f248671j)) {
                C52261le leVar2 = (C52261le) C52262lf.f137144f.createBuilder();
                C51133hp hpVar2 = C51133hp.TRY_SAYING;
                leVar2.copyOnWrite();
                C52262lf lfVar2 = (C52262lf) leVar2.instance;
                lfVar2.f137147b = hpVar2.f133102i;
                lfVar2.f137146a |= 1;
                ldVar.mo53823a(leVar2);
            }
            if (tVar.mo79746e(C90014bt.f247793np) && this.f286223w.mo56113h() && ((C74715bp) this.f286223w.mo56107c()).mo71084e()) {
                C52261le leVar3 = (C52261le) C52262lf.f137144f.createBuilder();
                C51133hp hpVar3 = C51133hp.RICH_SUGGESTIONS;
                leVar3.copyOnWrite();
                C52262lf lfVar3 = (C52262lf) leVar3.instance;
                lfVar3.f137147b = hpVar3.f133102i;
                lfVar3.f137146a |= 1;
                ldVar.mo53823a(leVar3);
            }
            C52261le leVar4 = (C52261le) C52262lf.f137144f.createBuilder();
            C51133hp hpVar4 = C51133hp.CONVERSATION_STARTERS;
            leVar4.copyOnWrite();
            C52262lf lfVar4 = (C52262lf) leVar4.instance;
            lfVar4.f137147b = hpVar4.f133102i;
            lfVar4.f137146a |= 1;
            leVar4.copyOnWrite();
            C52262lf lfVar5 = (C52262lf) leVar4.instance;
            lfVar5.f137146a |= 8;
            lfVar5.f137150e = true;
            C52262lf lfVar6 = (C52262lf) leVar4.build();
            ldVar.copyOnWrite();
            C52263lg lgVar13 = (C52263lg) ldVar.instance;
            lfVar6.getClass();
            lgVar13.mo53824a();
            lgVar13.f137165m.add(lfVar6);
            if (tVar.mo79746e(C90040cs.f248686y)) {
                C52261le leVar5 = (C52261le) C52262lf.f137144f.createBuilder();
                leVar5.copyOnWrite();
                C52262lf lfVar7 = (C52262lf) leVar5.instance;
                lfVar7.f137146a |= 2;
                lfVar7.f137148c = true;
                leVar5.copyOnWrite();
                C52262lf lfVar8 = (C52262lf) leVar5.instance;
                lfVar8.f137146a |= 4;
                lfVar8.f137149d = true;
                C51133hp hpVar5 = C51133hp.TACTILE_ASSISTANT_SUGGESTS;
                leVar5.copyOnWrite();
                C52262lf lfVar9 = (C52262lf) leVar5.instance;
                lfVar9.f137147b = hpVar5.f133102i;
                lfVar9.f137146a |= 1;
                ldVar.mo53823a(leVar5);
            }
            if (tVar.mo79746e(C90040cs.f248678q)) {
                C52261le leVar6 = (C52261le) C52262lf.f137144f.createBuilder();
                C51133hp hpVar6 = C51133hp.TACTILE_MY_ACTIONS;
                leVar6.copyOnWrite();
                C52262lf lfVar10 = (C52262lf) leVar6.instance;
                lfVar10.f137147b = hpVar6.f133102i;
                lfVar10.f137146a |= 1;
                ldVar.mo53823a(leVar6);
            }
        }
        if (tVar.mo79746e(C90029ch.f248243ad) || tVar.mo79746e(C90029ch.f248241ab)) {
            C52248ks ksVar = (C52248ks) C52249kt.f137121c.createBuilder();
            ksVar.copyOnWrite();
            C52249kt ktVar = (C52249kt) ksVar.instance;
            ktVar.f137123a |= 1;
            ktVar.f137124b = true;
            ldVar.copyOnWrite();
            C52263lg lgVar14 = (C52263lg) ldVar.instance;
            C52249kt ktVar2 = (C52249kt) ksVar.build();
            ktVar2.getClass();
            lgVar14.f137164l = ktVar2;
            lgVar14.f137153a |= 2048;
        }
        if (tVar.mo79746e(C90029ch.f248252am) && tVar.mo79746e(C90014bt.f247778na)) {
            ldVar.copyOnWrite();
            C52263lg lgVar15 = (C52263lg) ldVar.instance;
            lgVar15.f137153a |= 8192;
            lgVar15.f137166n = true;
        }
        C52263lg lgVar16 = (C52263lg) ldVar.build();
        lhVar.copyOnWrite();
        C52265li liVar15 = (C52265li) lhVar.instance;
        lgVar16.getClass();
        liVar15.f137198v = lgVar16;
        liVar15.f137177a = 268435456 | liVar15.f137177a;
        if (tVar.mo79746e(C90029ch.f248235aV) && !((C84486a) this.f286226z.mo27525b()).mo78207n()) {
            C52243kn knVar = (C52243kn) C52245kp.f137112c.createBuilder();
            knVar.copyOnWrite();
            C52245kp kpVar = (C52245kp) knVar.instance;
            kpVar.f137115b = 1;
            kpVar.f137114a |= 1;
            lhVar.copyOnWrite();
            C52265li liVar16 = (C52265li) lhVar.instance;
            C52245kp kpVar2 = (C52245kp) knVar.build();
            kpVar2.getClass();
            liVar16.f137170B = kpVar2;
            liVar16.f137178b |= 1024;
        }
        cxVar.copyOnWrite();
        C51772cy cyVar = (C51772cy) cxVar.instance;
        C52265li liVar17 = (C52265li) lhVar.build();
        liVar17.getClass();
        cyVar.f135828c = liVar17;
        cyVar.f135826a |= 1;
        C51788dd ddVar = (C51788dd) C51791dg.f135890d.createBuilder();
        ddVar.copyOnWrite();
        C51791dg dgVar = (C51791dg) ddVar.instance;
        dgVar.f135892a |= 2;
        dgVar.f135893b = true;
        C51789de deVar = (C51789de) C51790df.f135885d.createBuilder();
        boolean e7 = ((C86124t) this.f286203c.mo27525b()).mo79746e(C90137p.f251823d);
        deVar.copyOnWrite();
        C51790df dfVar = (C51790df) deVar.instance;
        dfVar.f135887a |= 2;
        dfVar.f135888b = e7;
        boolean e8 = ((C86124t) this.f286203c.mo27525b()).mo79746e(C90137p.f251822c);
        deVar.copyOnWrite();
        C51790df dfVar2 = (C51790df) deVar.instance;
        dfVar2.f135887a |= 4;
        dfVar2.f135889c = e8;
        ddVar.copyOnWrite();
        C51791dg dgVar2 = (C51791dg) ddVar.instance;
        C51790df dfVar3 = (C51790df) deVar.build();
        dfVar3.getClass();
        dgVar2.f135894c = dfVar3;
        dgVar2.f135892a |= 4;
        C51791dg dgVar3 = (C51791dg) ddVar.build();
        cxVar.copyOnWrite();
        C51772cy cyVar2 = (C51772cy) cxVar.instance;
        dgVar3.getClass();
        cyVar2.f135832g = dgVar3;
        cyVar2.f135826a |= 32;
        C51719bq bqVar = (C51719bq) C51720br.f135690d.createBuilder();
        bqVar.copyOnWrite();
        C51720br brVar = (C51720br) bqVar.instance;
        brVar.f135692a |= 4;
        brVar.f135694c = true;
        C51720br brVar2 = (C51720br) bqVar.build();
        cxVar.copyOnWrite();
        C51772cy cyVar3 = (C51772cy) cxVar.instance;
        brVar2.getClass();
        cyVar3.f135831f = brVar2;
        cyVar3.f135826a |= 16;
        if (m170064w()) {
            C51751cd cdVar = (C51751cd) C51752ce.f135774c.createBuilder();
            cdVar.copyOnWrite();
            C51752ce ceVar = (C51752ce) cdVar.instance;
            ceVar.f135776a |= 1;
            ceVar.f135777b = true;
            C51752ce ceVar2 = (C51752ce) cdVar.build();
            cxVar.copyOnWrite();
            C51772cy cyVar4 = (C51772cy) cxVar.instance;
            ceVar2.getClass();
            cyVar4.f135836k = ceVar2;
            cyVar4.f135826a |= 512;
            C51749cb cbVar = (C51749cb) C51750cc.f135769d.createBuilder();
            cbVar.copyOnWrite();
            C51750cc ccVar = (C51750cc) cbVar.instance;
            ccVar.f135771a |= 1;
            ccVar.f135772b = true;
            C51750cc ccVar2 = (C51750cc) cbVar.build();
            cxVar.copyOnWrite();
            C51772cy cyVar5 = (C51772cy) cxVar.instance;
            ccVar2.getClass();
            cyVar5.f135837l = ccVar2;
            cyVar5.f135826a |= 1024;
        }
        blVar.copyOnWrite();
        C51715bm bmVar4 = (C51715bm) blVar.instance;
        C51772cy cyVar6 = (C51772cy) cxVar.build();
        cyVar6.getClass();
        bmVar4.f135671h = cyVar6;
        bmVar4.f135664a |= 128;
        m170055m(blVar, (int) ((C86124t) this.f286203c.mo27525b()).mo79743a(C90014bt.f247728md));
        List c = this.f286221u.c();
        blVar.copyOnWrite();
        C51715bm bmVar5 = (C51715bm) blVar.instance;
        C62971cq cqVar2 = bmVar5.f135679p;
        if (!cqVar2.mo58948c()) {
            bmVar5.f135679p = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) c, (List) bmVar5.f135679p);
        if (C1793aj.m4937b(new C1800aq(this.f286202b).f5622a)) {
            byVar = C51727by.NOTIFICATIONS_ENABLED;
        } else {
            byVar = C51727by.NOTIFICATIONS_DISABLED;
        }
        blVar.copyOnWrite();
        C51715bm bmVar6 = (C51715bm) blVar.instance;
        bmVar6.f135674k = byVar.f135712d;
        bmVar6.f135664a |= 8192;
        C51753cf cfVar = (C51753cf) C51754cg.f135778e.createBuilder();
        C51802dr drVar = C51802dr.ALL_YOUTUBE_CONTENT;
        cfVar.copyOnWrite();
        C51754cg cgVar = (C51754cg) cfVar.instance;
        cgVar.f135782c = drVar.f135922c;
        cgVar.f135780a |= 2;
        C51758ck ckVar = C51758ck.ALL_PROACTIVE_NOTIFICATIONS;
        cfVar.copyOnWrite();
        C51754cg cgVar2 = (C51754cg) cfVar.instance;
        cgVar2.f135783d = ckVar.f135796d;
        cgVar2.f135780a |= 16;
        blVar.copyOnWrite();
        C51715bm bmVar7 = (C51715bm) blVar.instance;
        C51754cg cgVar3 = (C51754cg) cfVar.build();
        cgVar3.getClass();
        bmVar7.f135672i = cgVar3;
        bmVar7.f135664a |= 256;
        C60870cx h = C60922j.m93045h(m170060s(blVar), new C102544af(this, akVar), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return h;
    }

    /* renamed from: r */
    private final C60870cx m170059r(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C51714bl blVar = (C51714bl) C51715bm.f135662t.createBuilder();
        blVar.copyOnWrite();
        C51715bm bmVar = (C51715bm) blVar.instance;
        bmVar.f135664a |= 2;
        bmVar.f135666c = "OPA_ANDROID_SCREENLESS";
        m170062u(blVar, C51697ay.SURROUNDING_USERS);
        m170061t(blVar);
        m170063v(blVar);
        C60870cx i = C60856cj.m92900i(blVar);
        if (z6) {
            i = m170060s(blVar);
        }
        C60870cx h = C60922j.m93045h(i, new C102545ag(this, z3, z, z2, z4, z5, z7), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return h;
    }

    /* renamed from: s */
    private final C60870cx m170060s(C51714bl blVar) {
        C60870cx cxVar;
        C51754cg cgVar = ((C51715bm) blVar.instance).f135672i;
        if (cgVar == null) {
            cgVar = C51754cg.f135778e;
        }
        C51753cf cfVar = (C51753cf) cgVar.toBuilder();
        Account a = ((C86054o) this.f286207g.mo27525b()).mo79668a();
        if (a == null) {
            cxVar = C60856cj.m92900i(true);
            C58976aa aaVar = C58975e.f156826a;
        } else {
            cxVar = this.f286208h.mo17952a(a);
        }
        C60870cx h = C60922j.m93045h(cxVar, new C102541ac(cfVar, blVar), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return h;
    }

    /* renamed from: t */
    private static void m170061t(C51714bl blVar) {
        C51698az azVar = (C51698az) C51703ba.f135634d.createBuilder();
        C51707be beVar = C51707be.VOICE_QUALITY;
        azVar.copyOnWrite();
        C51703ba baVar = (C51703ba) azVar.instance;
        baVar.f135637b = beVar.f135649c;
        baVar.f135636a |= 1;
        C51697ay ayVar = C51697ay.AUTHENTICATED_USER_ONLY;
        azVar.copyOnWrite();
        C51703ba baVar2 = (C51703ba) azVar.instance;
        baVar2.f135638c = ayVar.f135627c;
        baVar2.f135636a |= 2;
        C51703ba baVar3 = (C51703ba) azVar.build();
        blVar.copyOnWrite();
        C51715bm bmVar = (C51715bm) blVar.instance;
        C51715bm bmVar2 = C51715bm.f135662t;
        baVar3.getClass();
        bmVar.f135669f = baVar3;
        bmVar.f135664a |= 16;
    }

    /* renamed from: u */
    private final void m170062u(C51714bl blVar, C51697ay ayVar) {
        C51704bb bbVar = (C51704bb) C51705bc.f135639e.createBuilder();
        C51707be beVar = C51707be.MUSIC_QUALITY;
        bbVar.copyOnWrite();
        C51705bc bcVar = (C51705bc) bbVar.instance;
        bcVar.f135642b = beVar.f135649c;
        bcVar.f135641a |= 1;
        bbVar.copyOnWrite();
        C51705bc bcVar2 = (C51705bc) bbVar.instance;
        bcVar2.f135643c = ayVar.f135627c;
        bcVar2.f135641a |= 2;
        C51799do doVar = (C51799do) C51800dp.f135913d.createBuilder();
        doVar.copyOnWrite();
        C51800dp dpVar = (C51800dp) doVar.instance;
        dpVar.f135915a |= 2;
        dpVar.f135917c = 1.0d;
        int streamMaxVolume = this.f286214n.getStreamMaxVolume(3);
        doVar.copyOnWrite();
        C51800dp dpVar2 = (C51800dp) doVar.instance;
        dpVar2.f135915a |= 1;
        dpVar2.f135916b = streamMaxVolume;
        C51800dp dpVar3 = (C51800dp) doVar.build();
        bbVar.copyOnWrite();
        C51705bc bcVar3 = (C51705bc) bbVar.instance;
        dpVar3.getClass();
        bcVar3.f135644d = dpVar3;
        bcVar3.f135641a |= 4;
        blVar.copyOnWrite();
        C51715bm bmVar = (C51715bm) blVar.instance;
        C51705bc bcVar4 = (C51705bc) bbVar.build();
        C51715bm bmVar2 = C51715bm.f135662t;
        bcVar4.getClass();
        bmVar.f135668e = bcVar4;
        bmVar.f135664a |= 8;
    }

    /* renamed from: v */
    private final void m170063v(C51714bl blVar) {
        C51724bv bvVar = (C51724bv) C51725bw.f135701e.createBuilder();
        String str = Build.VERSION.RELEASE;
        bvVar.copyOnWrite();
        C51725bw bwVar = (C51725bw) bvVar.instance;
        bwVar.f135703a |= 1;
        bwVar.f135704b = "Android ".concat(String.valueOf(str));
        String str2 = Build.MODEL;
        bvVar.copyOnWrite();
        C51725bw bwVar2 = (C51725bw) bvVar.instance;
        str2.getClass();
        bwVar2.f135703a |= 2;
        bwVar2.f135705c = str2;
        String str3 = (String) this.f286215o.mo27525b();
        bvVar.copyOnWrite();
        C51725bw bwVar3 = (C51725bw) bvVar.instance;
        str3.getClass();
        bwVar3.f135703a |= 4;
        bwVar3.f135706d = str3;
        C51725bw bwVar4 = (C51725bw) bvVar.build();
        blVar.copyOnWrite();
        C51715bm bmVar = (C51715bm) blVar.instance;
        C51715bm bmVar2 = C51715bm.f135662t;
        bwVar4.getClass();
        bmVar.f135673j = bwVar4;
        bmVar.f135664a |= 512;
    }

    /* renamed from: w */
    private final boolean m170064w() {
        return ((C86124t) this.f286203c.mo27525b()).mo79746e(C90014bt.f247444hK) && this.f286224x.mo56113h() && ((C74713bn) this.f286224x.mo56107c()).mo71078c();
    }

    /* renamed from: a */
    public final C60870cx mo65283a(Query query) {
        return mo93327b(query, C58836b.f156633a);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x042e, code lost:
        if (r1 != 4) goto L_0x0442;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x043f, code lost:
        if (((com.google.android.apps.gsa.search.core.p6805i.C86124t) r8.f286203c.mo27525b()).mo79746e(com.google.android.apps.gsa.shared.p7066m.C90086ek.f250470dj) == false) goto L_0x0442;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x03d6, code lost:
        if (((com.google.android.apps.gsa.search.core.p6805i.C86124t) r8.f286203c.mo27525b()).mo79746e(com.google.android.apps.gsa.shared.p7066m.C90086ek.f250273Y) != false) goto L_0x03d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x04d2  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x055c  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0574  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x058d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x03db A[ADDED_TO_REGION] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo93327b(com.google.android.apps.gsa.shared.search.Query r22, com.google.common.base.C58833ax r23) {
        /*
            r21 = this;
            r8 = r21
            r9 = r22
            r0 = r23
            boolean r1 = r22.mo84434dO()
            if (r1 == 0) goto L_0x08c7
            dagger.a r1 = r8.f286220t
            int r10 = com.google.android.apps.gsa.search.core.p6491a.C84376v.m134657a(r9, r1)
            java.lang.String r1 = "android.opa.extra.MINI_PLATE_ENABLED"
            boolean r2 = r9.mo84363bw(r1)
            r1 = 2
            if (r10 == r1) goto L_0x089d
            java.lang.String r3 = "OPA_ANDROID_AUTO"
            r4 = 8
            r5 = 1
            if (r10 == r4) goto L_0x0852
            r6 = 4
            if (r10 == r6) goto L_0x07c0
            java.lang.String r7 = ""
            r11 = 5
            r12 = 6
            if (r10 == r11) goto L_0x0120
            if (r10 == r12) goto L_0x0120
            java.lang.String r3 = "android.opa.extra.HANDOVER_FROM_APA"
            boolean r3 = r9.mo84363bw(r3)
            if (r3 == 0) goto L_0x00cb
            com.google.android.apps.gsa.staticplugins.j.aj r0 = com.google.android.apps.gsa.staticplugins.p8019j.C102549ak.m170048e()
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r22)
            r3 = r0
            com.google.android.apps.gsa.staticplugins.j.m r3 = (com.google.android.apps.gsa.staticplugins.p8019j.C102590m) r3
            r3.f286339a = r2
            com.google.android.apps.gsa.staticplugins.j.ak r0 = r0.mo93320a()
            com.google.assistant.e.j.bm r2 = com.google.assistant.p3897e.p3921j.C51715bm.f135662t
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.bl r2 = (com.google.assistant.p3897e.p3921j.C51714bl) r2
            com.google.android.apps.gsa.search.core.a.a.b r3 = com.google.android.apps.gsa.search.core.p6491a.p6492a.C84341b.f229550d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.gsa.search.core.a.a.a r3 = (com.google.android.apps.gsa.search.core.p6491a.p6492a.C84340a) r3
            java.lang.String r4 = r21.mo93330e()
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.apps.gsa.search.core.a.a.b r6 = (com.google.android.apps.gsa.search.core.p6491a.p6492a.C84341b) r6
            int r9 = r6.f229552a
            r5 = r5 | r9
            r6.f229552a = r5
            r6.f229553b = r4
            com.google.common.base.ax r4 = r0.mo93325c()
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x00b8
            com.google.common.base.ax r4 = r0.mo93325c()
            java.lang.Object r4 = r4.mo56107c()
            com.google.android.apps.gsa.shared.search.Query r4 = (com.google.android.apps.gsa.shared.search.Query) r4
            java.lang.String r5 = "android.opa.extra.LAUNCHED_ON"
            int r5 = r4.mo84263a(r5)
            r6 = 7
            if (r5 != r6) goto L_0x0098
            com.google.android.apps.gsa.assistant.shared.l.e r4 = com.google.android.apps.gsa.assistant.shared.l.e.aF
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.apps.gsa.search.core.a.a.b r5 = (com.google.android.apps.gsa.search.core.p6491a.p6492a.C84341b) r5
            int r4 = r4.ca
            r5.f229554c = r4
            int r4 = r5.f229552a
            r1 = r1 | r4
            r5.f229552a = r1
            goto L_0x00b8
        L_0x0098:
            java.lang.String r5 = "android.opa.extra.TRIGGERED_BY"
            int r4 = r4.mo84263a(r5)
            com.google.android.apps.gsa.assistant.shared.l.e r4 = com.google.android.apps.gsa.assistant.shared.l.e.a(r4)
            if (r4 == 0) goto L_0x00b8
            com.google.android.apps.gsa.assistant.shared.l.e r5 = com.google.android.apps.gsa.assistant.shared.l.e.a
            if (r4 == r5) goto L_0x00b8
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.apps.gsa.search.core.a.a.b r5 = (com.google.android.apps.gsa.search.core.p6491a.p6492a.C84341b) r5
            int r4 = r4.ca
            r5.f229554c = r4
            int r4 = r5.f229552a
            r1 = r1 | r4
            r5.f229552a = r1
        L_0x00b8:
            com.google.protobuf.bv r1 = r3.build()
            com.google.android.apps.gsa.search.core.a.a.b r1 = (com.google.android.apps.gsa.search.core.p6491a.p6492a.C84341b) r1
            java.lang.String r0 = r8.mo93329d(r0)
            r8.mo93335l(r1, r2, r0, r7)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r2)
            goto L_0x08b1
        L_0x00cb:
            boolean r1 = r22.mo84375cH()
            if (r1 == 0) goto L_0x00e9
            com.google.android.apps.gsa.staticplugins.j.aj r0 = com.google.android.apps.gsa.staticplugins.p8019j.C102549ak.m170048e()
            com.google.android.apps.gsa.staticplugins.j.ak r0 = r0.mo93320a()
            com.google.common.util.concurrent.cx r0 = r8.m170058q(r0)
            com.google.android.apps.gsa.staticplugins.j.z r1 = com.google.android.apps.gsa.staticplugins.p8019j.C102603z.f286364a
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r2)
            com.google.android.apps.gsa.shared.s.a.a r1 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            goto L_0x08b1
        L_0x00e9:
            if (r2 == 0) goto L_0x00fd
            boolean r1 = r22.mo84404ck()
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r7 = 0
            r0 = r21
            com.google.common.util.concurrent.cx r0 = r0.m170059r(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x08b1
        L_0x00fd:
            com.google.android.apps.gsa.staticplugins.j.aj r1 = com.google.android.apps.gsa.staticplugins.p8019j.C102549ak.m170048e()
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r22)
            r3 = r1
            com.google.android.apps.gsa.staticplugins.j.m r3 = (com.google.android.apps.gsa.staticplugins.p8019j.C102590m) r3
            r3.f286339a = r2
            if (r0 == 0) goto L_0x0118
            r3.f286340b = r0
            com.google.android.apps.gsa.staticplugins.j.ak r0 = r1.mo93320a()
            com.google.common.util.concurrent.cx r0 = r8.m170058q(r0)
            goto L_0x08b1
        L_0x0118:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null appsDelta"
            r0.<init>(r1)
            throw r0
        L_0x0120:
            com.google.android.apps.gsa.shared.s.a.a r0 = r8.f286210j
            boolean r0 = r0.mo84225b()
            if (r0 == 0) goto L_0x012d
            java.lang.String r0 = "buildDeviceCapabilityGearhead"
            android.os.Trace.beginSection(r0)
        L_0x012d:
            dagger.a r0 = r8.f286220t
            int r0 = com.google.android.apps.gsa.search.core.p6491a.C84376v.m134657a(r9, r0)
            com.google.common.o.amo r2 = r9.f252760R
            com.google.assistant.e.j.bm r13 = com.google.assistant.p3897e.p3921j.C51715bm.f135662t
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.assistant.e.j.bl r13 = (com.google.assistant.p3897e.p3921j.C51714bl) r13
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.assistant.e.j.bm r14 = (com.google.assistant.p3897e.p3921j.C51715bm) r14
            int r15 = r14.f135664a
            r15 = r15 | r1
            r14.f135664a = r15
            r14.f135666c = r3
            com.google.assistant.e.j.ay r14 = com.google.assistant.p3897e.p3921j.C51697ay.SURROUNDING_USERS
            r8.m170062u(r13, r14)
            m170061t(r13)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r5)
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60856cj.m92900i(r14)
            dagger.a r15 = r8.f286203c
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r15 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r15
            com.google.android.apps.gsa.shared.m.d r11 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250446dL
            boolean r11 = r15.mo79746e(r11)
            if (r11 == 0) goto L_0x05cb
            com.google.assistant.e.j.cy r11 = com.google.assistant.p3897e.p3921j.C51772cy.f135824p
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.e.j.cx r11 = (com.google.assistant.p3897e.p3921j.C51771cx) r11
            com.google.assistant.e.j.li r16 = com.google.assistant.p3897e.p3921j.C52265li.f137167I
            com.google.protobuf.bn r16 = r16.createBuilder()
            r4 = r16
            com.google.assistant.e.j.lh r4 = (com.google.assistant.p3897e.p3921j.C52264lh) r4
            com.google.assistant.e.j.kk r16 = com.google.assistant.p3897e.p3921j.C52240kk.f137096j
            com.google.protobuf.bn r16 = r16.createBuilder()
            r6 = r16
            com.google.assistant.e.j.kj r6 = (com.google.assistant.p3897e.p3921j.C52239kj) r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            dagger.a r15 = r8.f286203c
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r15 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r15
            com.google.android.apps.gsa.shared.m.h r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250449dO
            java.lang.String r5 = r15.mo79758x(r5)
            r1.<init>(r5)
            com.google.common.o.amo r5 = com.google.common.p4552o.amo.ANDROID_AUTO_PHONE
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x01b3
            dagger.a r5 = r8.f286203c
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r5 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r5
            com.google.android.apps.gsa.shared.m.h r15 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250451dQ
            java.lang.String r5 = r5.mo79758x(r15)
            r1.append(r5)
        L_0x01b3:
            if (r0 != r12) goto L_0x01c7
            dagger.a r0 = r8.f286203c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.h r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250450dP
            java.lang.String r0 = r0.mo79758x(r5)
            r1.append(r0)
            r0 = 6
        L_0x01c7:
            com.google.common.base.m r5 = new com.google.common.base.m
            r15 = 44
            r5.<init>(r15)
            com.google.common.base.cf r5 = com.google.common.base.C58869cf.m90936b(r5)
            com.google.common.base.cf r5 = r5.mo56151a()
            java.lang.String r1 = r1.toString()
            java.util.List r1 = r5.mo56155i(r1)
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.assistant.e.j.kk r5 = (com.google.assistant.p3897e.p3921j.C52240kk) r5
            com.google.protobuf.cq r15 = r5.f137099b
            boolean r20 = r15.mo58948c()
            if (r20 != 0) goto L_0x01f3
            com.google.protobuf.cq r15 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r15)
            r5.f137099b = r15
        L_0x01f3:
            com.google.protobuf.cq r5 = r5.f137099b
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r1, (java.util.List) r5)
            r6.copyOnWrite()
            com.google.protobuf.bv r1 = r6.instance
            com.google.assistant.e.j.kk r1 = (com.google.assistant.p3897e.p3921j.C52240kk) r1
            int r5 = r1.f137098a
            r15 = 1
            r5 = r5 | r15
            r1.f137098a = r5
            r5 = 0
            r1.f137100c = r5
            r6.copyOnWrite()
            com.google.protobuf.bv r1 = r6.instance
            com.google.assistant.e.j.kk r1 = (com.google.assistant.p3897e.p3921j.C52240kk) r1
            int r15 = r1.f137098a
            r16 = 2
            r15 = r15 | 2
            r1.f137098a = r15
            r1.f137101d = r5
            r6.copyOnWrite()
            com.google.protobuf.bv r1 = r6.instance
            com.google.assistant.e.j.kk r1 = (com.google.assistant.p3897e.p3921j.C52240kk) r1
            int r15 = r1.f137098a
            r18 = 4
            r15 = r15 | 4
            r1.f137098a = r15
            r1.f137102e = r5
            r6.copyOnWrite()
            com.google.protobuf.bv r1 = r6.instance
            com.google.assistant.e.j.kk r1 = (com.google.assistant.p3897e.p3921j.C52240kk) r1
            int r15 = r1.f137098a
            r17 = 8
            r15 = r15 | 8
            r1.f137098a = r15
            r1.f137103f = r5
            r6.copyOnWrite()
            com.google.protobuf.bv r1 = r6.instance
            com.google.assistant.e.j.kk r1 = (com.google.assistant.p3897e.p3921j.C52240kk) r1
            int r5 = r1.f137098a
            r5 = r5 | 16
            r1.f137098a = r5
            r5 = 1
            r1.f137104g = r5
            r6.copyOnWrite()
            com.google.protobuf.bv r1 = r6.instance
            com.google.assistant.e.j.kk r1 = (com.google.assistant.p3897e.p3921j.C52240kk) r1
            int r5 = r1.f137098a
            r5 = r5 | 32
            r1.f137098a = r5
            r5 = 0
            r1.f137105h = r5
            if (r0 == r12) goto L_0x0271
            dagger.a r1 = r8.f286203c
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250389cH
            boolean r1 = r1.mo79746e(r5)
            if (r1 == 0) goto L_0x0282
            r1 = 5
            if (r0 != r1) goto L_0x0282
            r0 = 5
        L_0x0271:
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.assistant.e.j.li r1 = (com.google.assistant.p3897e.p3921j.C52265li) r1
            int r5 = r1.f137177a
            r15 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 | r15
            r1.f137177a = r5
            r5 = 1
            r1.f137192p = r5
        L_0x0282:
            if (r0 != r12) goto L_0x02d7
            dagger.a r1 = r8.f286203c
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250510h
            boolean r1 = r1.mo79746e(r5)
            if (r1 == 0) goto L_0x02a6
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.assistant.e.j.li r1 = (com.google.assistant.p3897e.p3921j.C52265li) r1
            int r5 = r1.f137178b
            r15 = 8
            r5 = r5 | r15
            r1.f137178b = r5
            r5 = 1
            r1.f137202z = r5
            goto L_0x02a7
        L_0x02a6:
            r5 = 1
        L_0x02a7:
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.assistant.e.j.li r1 = (com.google.assistant.p3897e.p3921j.C52265li) r1
            int r15 = r1.f137178b
            r15 = r15 | 16384(0x4000, float:2.2959E-41)
            r1.f137178b = r15
            r1.f137172D = r5
            dagger.a r1 = r8.f286203c
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250249A
            boolean r1 = r1.mo79746e(r5)
            if (r1 == 0) goto L_0x02e9
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.assistant.e.j.li r1 = (com.google.assistant.p3897e.p3921j.C52265li) r1
            int r5 = r1.f137178b
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
            r1.f137178b = r5
            r5 = 1
            r1.f137171C = r5
            goto L_0x02e9
        L_0x02d7:
            r5 = 1
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.assistant.e.j.li r1 = (com.google.assistant.p3897e.p3921j.C52265li) r1
            int r15 = r1.f137177a
            r19 = 2097152(0x200000, float:2.938736E-39)
            r15 = r15 | r19
            r1.f137177a = r15
            r1.f137194r = r5
        L_0x02e9:
            if (r0 != r12) goto L_0x0327
            dagger.a r1 = r8.f286203c
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250294aS
            boolean r1 = r1.mo79746e(r5)
            if (r1 == 0) goto L_0x0327
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.assistant.e.j.li r1 = (com.google.assistant.p3897e.p3921j.C52265li) r1
            int r5 = r1.f137178b
            r15 = 2
            r5 = r5 | r15
            r1.f137178b = r5
            r5 = 1
            r1.f137201y = r5
            dagger.a r1 = r8.f286203c
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1
            com.google.android.apps.gsa.shared.m.d r15 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250299aX
            boolean r1 = r1.mo79746e(r15)
            r4.copyOnWrite()
            com.google.protobuf.bv r15 = r4.instance
            com.google.assistant.e.j.li r15 = (com.google.assistant.p3897e.p3921j.C52265li) r15
            int r12 = r15.f137178b
            r12 = r12 | r5
            r15.f137178b = r12
            r15.f137200x = r1
        L_0x0327:
            dagger.a r1 = r8.f286203c
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250334bF
            boolean r1 = r1.mo79746e(r5)
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.li r5 = (com.google.assistant.p3897e.p3921j.C52265li) r5
            int r12 = r5.f137177a
            r15 = 131072(0x20000, float:1.83671E-40)
            r12 = r12 | r15
            r5.f137177a = r12
            r5.f137190n = r1
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.assistant.e.j.li r1 = (com.google.assistant.p3897e.p3921j.C52265li) r1
            com.google.protobuf.bv r5 = r6.build()
            com.google.assistant.e.j.kk r5 = (com.google.assistant.p3897e.p3921j.C52240kk) r5
            r5.getClass()
            r1.f137179c = r5
            int r5 = r1.f137177a
            r6 = 1
            r5 = r5 | r6
            r1.f137177a = r5
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.assistant.e.j.li r1 = (com.google.assistant.p3897e.p3921j.C52265li) r1
            int r5 = r1.f137177a
            r6 = 2
            r5 = r5 | r6
            r1.f137177a = r5
            r5 = 0
            r1.f137180d = r5
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.assistant.e.j.li r1 = (com.google.assistant.p3897e.p3921j.C52265li) r1
            int r6 = r1.f137177a
            r12 = 4
            r6 = r6 | r12
            r1.f137177a = r6
            r1.f137181e = r5
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.assistant.e.j.li r1 = (com.google.assistant.p3897e.p3921j.C52265li) r1
            r5 = 3
            r1.f137182f = r5
            int r6 = r1.f137177a
            r12 = 8
            r6 = r6 | r12
            r1.f137177a = r6
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.assistant.e.j.li r1 = (com.google.assistant.p3897e.p3921j.C52265li) r1
            int r6 = r1.f137177a
            r6 = r6 | 16
            r1.f137177a = r6
            r6 = 0
            r1.f137183g = r6
            r11.copyOnWrite()
            com.google.protobuf.bv r1 = r11.instance
            com.google.assistant.e.j.cy r1 = (com.google.assistant.p3897e.p3921j.C51772cy) r1
            com.google.protobuf.bv r4 = r4.build()
            com.google.assistant.e.j.li r4 = (com.google.assistant.p3897e.p3921j.C52265li) r4
            r4.getClass()
            r1.f135828c = r4
            int r4 = r1.f135826a
            r6 = 1
            r4 = r4 | r6
            r1.f135826a = r4
            r1 = 6
            if (r0 != r1) goto L_0x03db
            dagger.a r1 = r8.f286203c
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250470dj
            boolean r1 = r1.mo79746e(r4)
            if (r1 == 0) goto L_0x0442
            dagger.a r1 = r8.f286203c
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250273Y
            boolean r1 = r1.mo79746e(r4)
            if (r1 == 0) goto L_0x0442
        L_0x03d8:
            r1 = 1
            goto L_0x0443
        L_0x03db:
            if (r9 == 0) goto L_0x0442
            java.lang.String r1 = r22.mo84355bn()
            if (r1 != 0) goto L_0x03e4
            goto L_0x0442
        L_0x03e4:
            java.lang.String r1 = r22.mo84355bn()
            int r4 = r1.hashCode()
            switch(r4) {
                case -1548646188: goto L_0x0418;
                case -1485354747: goto L_0x040e;
                case -948632674: goto L_0x0404;
                case -687176579: goto L_0x03fa;
                case 1339654381: goto L_0x03f0;
                default: goto L_0x03ef;
            }
        L_0x03ef:
            goto L_0x0422
        L_0x03f0:
            java.lang.String r4 = "and.gsa.fusion.mic"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0422
            r1 = 0
            goto L_0x0423
        L_0x03fa:
            java.lang.String r4 = "and.gsa.fusion.hotword"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0422
            r1 = 1
            goto L_0x0423
        L_0x0404:
            java.lang.String r4 = "and.gsa.fusion.hardware.button"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0422
            r1 = 2
            goto L_0x0423
        L_0x040e:
            java.lang.String r4 = "and.gsa.fusion.notification"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0422
            r1 = 4
            goto L_0x0423
        L_0x0418:
            java.lang.String r4 = "and.gsa.fusion.bluetooth"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0422
            r1 = 3
            goto L_0x0423
        L_0x0422:
            r1 = -1
        L_0x0423:
            if (r1 == 0) goto L_0x0431
            r4 = 1
            if (r1 == r4) goto L_0x0431
            r4 = 2
            if (r1 == r4) goto L_0x0431
            if (r1 == r5) goto L_0x0431
            r4 = 4
            if (r1 == r4) goto L_0x0431
            goto L_0x0442
        L_0x0431:
            dagger.a r1 = r8.f286203c
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250470dj
            boolean r1 = r1.mo79746e(r4)
            if (r1 == 0) goto L_0x0442
            goto L_0x03d8
        L_0x0442:
            r1 = 0
        L_0x0443:
            com.google.assistant.e.j.dg r4 = com.google.assistant.p3897e.p3921j.C51791dg.f135890d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.dd r4 = (com.google.assistant.p3897e.p3921j.C51788dd) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.dg r5 = (com.google.assistant.p3897e.p3921j.C51791dg) r5
            int r6 = r5.f135892a
            r12 = 2
            r6 = r6 | r12
            r5.f135892a = r6
            r5.f135893b = r1
            com.google.protobuf.bv r1 = r4.build()
            com.google.assistant.e.j.dg r1 = (com.google.assistant.p3897e.p3921j.C51791dg) r1
            r11.copyOnWrite()
            com.google.protobuf.bv r4 = r11.instance
            com.google.assistant.e.j.cy r4 = (com.google.assistant.p3897e.p3921j.C51772cy) r4
            r1.getClass()
            r4.f135832g = r1
            int r1 = r4.f135826a
            r1 = r1 | 32
            r4.f135826a = r1
            com.google.assistant.e.j.br r1 = com.google.assistant.p3897e.p3921j.C51720br.f135690d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.bq r1 = (com.google.assistant.p3897e.p3921j.C51719bq) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.assistant.e.j.br r4 = (com.google.assistant.p3897e.p3921j.C51720br) r4
            int r5 = r4.f135692a
            r6 = 1
            r5 = r5 | r6
            r4.f135692a = r5
            r5 = 0
            r4.f135693b = r5
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.br r1 = (com.google.assistant.p3897e.p3921j.C51720br) r1
            r11.copyOnWrite()
            com.google.protobuf.bv r4 = r11.instance
            com.google.assistant.e.j.cy r4 = (com.google.assistant.p3897e.p3921j.C51772cy) r4
            r1.getClass()
            r4.f135831f = r1
            int r1 = r4.f135826a
            r1 = r1 | 16
            r4.f135826a = r1
            r1 = 6
            if (r0 != r1) goto L_0x04b6
            dagger.a r1 = r8.f286203c
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250527y
            boolean r1 = r1.mo79746e(r4)
            if (r1 == 0) goto L_0x04b6
            goto L_0x04ba
        L_0x04b6:
            r1 = 5
            if (r0 == r1) goto L_0x04ba
            goto L_0x04ee
        L_0x04ba:
            dagger.a r1 = r8.f286207g
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r1 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r1
            android.accounts.Account r1 = r1.mo79668a()
            if (r1 != 0) goto L_0x04d2
            r4 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x04ee
        L_0x04d2:
            com.google.android.apps.gsa.assistant.settings.devices.c.b.l r4 = r8.f286208h
            com.google.common.util.concurrent.cx r1 = r4.mo17952a(r1)
            dagger.a r4 = r8.f286203c
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r4 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r4
            com.google.android.apps.gsa.shared.m.f r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250339bK
            long r4 = r4.mo79743a(r5)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.libraries.gsa.k.g r12 = r8.f286197B
            com.google.common.util.concurrent.cx r14 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148471e(r1, r4, r6, r12)
        L_0x04ee:
            r13.copyOnWrite()
            com.google.protobuf.bv r1 = r13.instance
            com.google.assistant.e.j.bm r1 = (com.google.assistant.p3897e.p3921j.C51715bm) r1
            com.google.protobuf.bv r4 = r11.build()
            com.google.assistant.e.j.cy r4 = (com.google.assistant.p3897e.p3921j.C51772cy) r4
            r4.getClass()
            r1.f135671h = r4
            int r4 = r1.f135664a
            r4 = r4 | 128(0x80, float:1.794E-43)
            r1.f135664a = r4
            dagger.a r1 = r8.f286203c
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1
            com.google.android.apps.gsa.shared.m.f r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250471dk
            long r4 = r1.mo79743a(r4)
            int r1 = (int) r4
            m170055m(r13, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            dagger.a r4 = r8.f286203c
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r4 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r4
            com.google.android.apps.gsa.shared.m.h r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250452dR
            java.lang.String r4 = r4.mo79758x(r5)
            r1.<init>(r4)
            r4 = 5
            if (r0 != r4) goto L_0x0559
            com.google.common.o.amo r4 = com.google.common.p4552o.amo.ANDROID_AUTO_PHONE
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0548
            dagger.a r4 = r8.f286203c
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r4 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r4
            com.google.android.apps.gsa.shared.m.h r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250456dV
            java.lang.String r4 = r4.mo79758x(r5)
            r1.append(r4)
            goto L_0x0559
        L_0x0548:
            dagger.a r4 = r8.f286203c
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r4 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r4
            com.google.android.apps.gsa.shared.m.h r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250455dU
            java.lang.String r4 = r4.mo79758x(r5)
            r1.append(r4)
        L_0x0559:
            r4 = 6
            if (r0 != r4) goto L_0x056e
            dagger.a r0 = r8.f286203c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.h r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250453dS
            java.lang.String r0 = r0.mo79758x(r4)
            r1.append(r0)
            r0 = 6
        L_0x056e:
            boolean r4 = r22.mo84332bQ()
            if (r4 == 0) goto L_0x0585
            dagger.a r4 = r8.f286203c
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r4 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r4
            com.google.android.apps.gsa.shared.m.h r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250454dT
            java.lang.String r4 = r4.mo79758x(r5)
            r1.append(r4)
        L_0x0585:
            com.google.common.o.amo r4 = com.google.common.p4552o.amo.ANDROID_AUTO_PROJECTED
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x059b
            dagger.a r2 = r8.f286203c
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r2 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r2
            com.google.android.apps.gsa.shared.m.h r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250317ap
            java.lang.String r7 = r2.mo79758x(r4)
        L_0x059b:
            com.google.android.apps.gsa.search.core.a.a.b r2 = com.google.android.apps.gsa.search.core.p6491a.p6492a.C84341b.f229550d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.gsa.search.core.a.a.a r2 = (com.google.android.apps.gsa.search.core.p6491a.p6492a.C84340a) r2
            com.google.protobuf.bv r4 = r13.instance
            com.google.assistant.e.j.bm r4 = (com.google.assistant.p3897e.p3921j.C51715bm) r4
            java.lang.String r4 = r4.f135666c
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.android.apps.gsa.search.core.a.a.b r5 = (com.google.android.apps.gsa.search.core.p6491a.p6492a.C84341b) r5
            r4.getClass()
            int r6 = r5.f229552a
            r9 = 1
            r6 = r6 | r9
            r5.f229552a = r6
            r5.f229553b = r4
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.apps.gsa.search.core.a.a.b r2 = (com.google.android.apps.gsa.search.core.p6491a.p6492a.C84341b) r2
            java.lang.String r1 = r1.toString()
            r8.mo93335l(r2, r13, r1, r7)
            r8.mo93336n(r13, r3)
        L_0x05cb:
            r4 = r14
            r1 = 6
            if (r0 != r1) goto L_0x05d2
            r11 = r0
            r0 = 1
            goto L_0x05fd
        L_0x05d2:
            r1 = 5
            if (r0 != r1) goto L_0x05fb
            dagger.a r0 = r8.f286203c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250389cH
            boolean r0 = r0.mo79746e(r2)
            if (r0 != 0) goto L_0x05f8
            dagger.a r0 = r8.f286203c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250379by
            boolean r0 = r0.mo79746e(r2)
            if (r0 == 0) goto L_0x05f6
            goto L_0x05f8
        L_0x05f6:
            r0 = 0
            goto L_0x05f9
        L_0x05f8:
            r0 = 1
        L_0x05f9:
            r11 = 5
            goto L_0x05fd
        L_0x05fb:
            r11 = r0
            r0 = 0
        L_0x05fd:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            r2 = 0
            r8.mo93332h(r13, r1, r0, r2)
            r0 = 6
            if (r11 != r0) goto L_0x069b
            com.google.protobuf.bv r0 = r13.instance
            com.google.assistant.e.j.bm r0 = (com.google.assistant.p3897e.p3921j.C51715bm) r0
            com.google.assistant.e.j.cy r0 = r0.f135671h
            if (r0 != 0) goto L_0x0610
            com.google.assistant.e.j.cy r0 = com.google.assistant.p3897e.p3921j.C51772cy.f135824p
        L_0x0610:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.j.cx r0 = (com.google.assistant.p3897e.p3921j.C51771cx) r0
            com.google.common.f.e r1 = f286195a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "DeviceCapHelper"
            r1.mo56378ag(r2, r3)
            java.lang.String r2 = "Setting setHasPhysicalRadio to true."
            r3 = 13985(0x36a1, float:1.9597E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.e.j.cy r1 = (com.google.assistant.p3897e.p3921j.C51772cy) r1
            com.google.assistant.e.j.li r1 = r1.f135828c
            if (r1 != 0) goto L_0x0634
            com.google.assistant.e.j.li r1 = com.google.assistant.p3897e.p3921j.C52265li.f137167I
        L_0x0634:
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.e.j.lh r1 = (com.google.assistant.p3897e.p3921j.C52264lh) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.li r2 = (com.google.assistant.p3897e.p3921j.C52265li) r2
            int r3 = r2.f137177a
            r5 = 4194304(0x400000, float:5.877472E-39)
            r3 = r3 | r5
            r2.f137177a = r3
            r3 = 1
            r2.f137195s = r3
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.cy r2 = (com.google.assistant.p3897e.p3921j.C51772cy) r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.li r1 = (com.google.assistant.p3897e.p3921j.C52265li) r1
            r1.getClass()
            r2.f135828c = r1
            int r1 = r2.f135826a
            r1 = r1 | r3
            r2.f135826a = r1
            com.google.common.base.ax r1 = r8.f286225y
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x0681
            com.google.common.base.ax r1 = r8.f286225y
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.libraries.assistant.auto.tng.media.c.a.a r1 = (com.google.android.libraries.assistant.auto.tng.media.p1051c.p1052a.C13988a) r1
            com.google.common.util.concurrent.cx r1 = r1.mo21380a()
            com.google.android.apps.gsa.staticplugins.j.ai r2 = new com.google.android.apps.gsa.staticplugins.j.ai
            r2.<init>(r0, r13)
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r1, r2, r0)
            goto L_0x0699
        L_0x0681:
            r13.copyOnWrite()
            com.google.protobuf.bv r1 = r13.instance
            com.google.assistant.e.j.bm r1 = (com.google.assistant.p3897e.p3921j.C51715bm) r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.cy r0 = (com.google.assistant.p3897e.p3921j.C51772cy) r0
            r0.getClass()
            r1.f135671h = r0
            int r0 = r1.f135664a
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.f135664a = r0
        L_0x0699:
            r5 = 6
            goto L_0x069c
        L_0x069b:
            r5 = r11
        L_0x069c:
            r13.copyOnWrite()
            com.google.protobuf.bv r0 = r13.instance
            com.google.assistant.e.j.bm r0 = (com.google.assistant.p3897e.p3921j.C51715bm) r0
            r1 = 1
            r0.f135677n = r1
            int r1 = r0.f135664a
            r2 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r2
            r0.f135664a = r1
            android.content.Context r0 = r8.f286202b
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            int r0 = androidx.core.content.C1882h.m5137c(r0, r1)
            dagger.a r1 = r8.f286220t
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.util.v r1 = (com.google.android.apps.gsa.shared.util.C91123v) r1
            boolean r1 = r1.mo85390b()
            if (r1 == 0) goto L_0x06e8
            if (r0 != 0) goto L_0x06e8
            android.content.Context r0 = r8.f286202b
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            int r0 = r0.getVoiceNetworkType()
            if (r0 == 0) goto L_0x06d7
            r0 = 1
            goto L_0x06d8
        L_0x06d7:
            r0 = 0
        L_0x06d8:
            r13.copyOnWrite()
            com.google.protobuf.bv r1 = r13.instance
            com.google.assistant.e.j.bm r1 = (com.google.assistant.p3897e.p3921j.C51715bm) r1
            int r2 = r1.f135664a
            r3 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 | r3
            r1.f135664a = r2
            r1.f135678o = r0
        L_0x06e8:
            r8.m170063v(r13)
            r8.mo93334j(r13)
            dagger.a r0 = r8.f286203c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250369bo
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x0740
            r0 = 6
            if (r5 == r0) goto L_0x0702
            goto L_0x0740
        L_0x0702:
            dagger.a r0 = r8.f286222v
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            boolean r0 = r0.mo56113h()
            if (r0 != 0) goto L_0x0717
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0746
        L_0x0717:
            dagger.a r0 = r8.f286222v
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.search.core.carassistant.a.a r0 = (com.google.android.apps.gsa.search.core.carassistant.p6777a.C85683a) r0
            com.google.common.util.concurrent.cx r0 = r0.mo79310a()
            dagger.a r1 = r8.f286203c
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1
            com.google.android.apps.gsa.shared.m.f r2 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250435dA
            long r1 = r1.mo79743a(r2)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.libraries.gsa.k.g r6 = r8.f286197B
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148471e(r0, r1, r3, r6)
            goto L_0x0746
        L_0x0740:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x0746:
            r2 = r0
            r0 = 6
            if (r5 != r0) goto L_0x079b
            com.google.common.base.ax r0 = r8.f286199D
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x079b
            dagger.a r0 = r8.f286203c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90069du.f249732j
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x079b
            com.google.common.base.ax r0 = r8.f286199D
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.d.a r0 = (com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a.p1288d.C16533a) r0
            java.lang.String r0 = "AUTO-Toy-ProjectedCar-2021"
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            com.google.android.apps.gsa.staticplugins.j.u r1 = com.google.android.apps.gsa.staticplugins.p8019j.C102598u.f286357a
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r3)
            com.google.android.apps.gsa.shared.s.a.a r1 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            dagger.a r1 = r8.f286203c
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250274Z
            long r6 = r1.mo79743a(r3)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.libraries.gsa.k.g r3 = r8.f286197B
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148471e(r0, r6, r1, r3)
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            com.google.android.apps.gsa.staticplugins.j.v r3 = com.google.android.apps.gsa.staticplugins.p8019j.C102599v.f286358a
            com.google.common.util.concurrent.bg r6 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60846c.m92878g(r0, r1, r3, r6)
            goto L_0x07a1
        L_0x079b:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x07a1:
            r6 = r0
            r0 = 2
            com.google.common.util.concurrent.cx[] r0 = new com.google.common.util.concurrent.C60870cx[r0]
            r1 = 0
            r0[r1] = r2
            r1 = 1
            r0[r1] = r6
            com.google.common.util.concurrent.cf r7 = com.google.common.util.concurrent.C60856cj.m92893b(r0)
            com.google.android.apps.gsa.staticplugins.j.ae r9 = new com.google.android.apps.gsa.staticplugins.j.ae
            r0 = r9
            r1 = r21
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = r7.mo57334a(r9, r0)
            goto L_0x08b1
        L_0x07c0:
            boolean r0 = r22.mo84411cr()
            if (r0 == 0) goto L_0x07ef
            dagger.a r0 = r8.f286203c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90122ft.f250877p
            boolean r7 = r0.mo79746e(r1)
            r1 = 0
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r21
            com.google.common.util.concurrent.cx r0 = r0.m170059r(r1, r2, r3, r4, r5, r6, r7)
            com.google.android.apps.gsa.staticplugins.j.ab r1 = new com.google.android.apps.gsa.staticplugins.j.ab
            r1.<init>(r9)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r0, r1, r2)
            com.google.android.apps.gsa.shared.s.a.a r1 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            goto L_0x08b1
        L_0x07ef:
            dagger.a r0 = r8.f286203c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251052bY
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x082a
            boolean r0 = r22.mo84337bV()
            if (r0 != 0) goto L_0x082a
            com.google.android.apps.gsa.staticplugins.j.aj r0 = com.google.android.apps.gsa.staticplugins.p8019j.C102549ak.m170048e()
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r22)
            r2 = r0
            com.google.android.apps.gsa.staticplugins.j.m r2 = (com.google.android.apps.gsa.staticplugins.p8019j.C102590m) r2
            r2.f286339a = r1
            com.google.assistant.e.j.ay r1 = com.google.assistant.p3897e.p3921j.C51697ay.AUTHENTICATED_USER_ONLY
            r0.mo93321b(r1)
            java.lang.String r1 = "sdk_actions.EXECUTE,1"
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89846n(r1)
            r0.mo93322c(r1)
            com.google.android.apps.gsa.staticplugins.j.ak r0 = r0.mo93320a()
            com.google.common.util.concurrent.cx r0 = r8.m170058q(r0)
            goto L_0x08b1
        L_0x082a:
            dagger.a r0 = r8.f286203c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90122ft.f250877p
            boolean r7 = r0.mo79746e(r1)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 0
            r0 = r21
            com.google.common.util.concurrent.cx r0 = r0.m170059r(r1, r2, r3, r4, r5, r6, r7)
            com.google.android.apps.gsa.staticplugins.j.q r1 = new com.google.android.apps.gsa.staticplugins.j.q
            r1.<init>(r8, r9)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r0, r1, r2)
            com.google.android.apps.gsa.shared.s.a.a r1 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            goto L_0x08b1
        L_0x0852:
            boolean r0 = r22.mo84404ck()
            com.google.assistant.e.j.bm r1 = com.google.assistant.p3897e.p3921j.C51715bm.f135662t
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.bl r1 = (com.google.assistant.p3897e.p3921j.C51714bl) r1
            dagger.a r2 = r8.f286203c
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r2 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r2
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248871bZ
            boolean r2 = r2.mo79746e(r4)
            r4 = 1
            if (r4 == r2) goto L_0x0871
            java.lang.String r3 = "OPA_ANDROID_SCREENLESS"
        L_0x0871:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.bm r2 = (com.google.assistant.p3897e.p3921j.C51715bm) r2
            int r4 = r2.f135664a
            r5 = 2
            r4 = r4 | r5
            r2.f135664a = r4
            r2.f135666c = r3
            com.google.assistant.e.j.ay r2 = com.google.assistant.p3897e.p3921j.C51697ay.SURROUNDING_USERS
            r8.m170062u(r1, r2)
            m170061t(r1)
            r8.m170063v(r1)
            com.google.common.util.concurrent.cx r1 = r8.m170060s(r1)
            com.google.android.apps.gsa.staticplugins.j.r r2 = new com.google.android.apps.gsa.staticplugins.j.r
            r2.<init>(r8, r0)
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r1, r2, r0)
            com.google.android.apps.gsa.shared.s.a.a r1 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            goto L_0x08b1
        L_0x089d:
            java.lang.String r0 = "android.opa.extra.TRIGGERED_BY_HEADSET"
            boolean r4 = r9.mo84363bw(r0)
            boolean r1 = r22.mo84404ck()
            r3 = 0
            r5 = 0
            r6 = 1
            r7 = 0
            r0 = r21
            com.google.common.util.concurrent.cx r0 = r0.m170059r(r1, r2, r3, r4, r5, r6, r7)
        L_0x08b1:
            com.google.common.base.ax r1 = r8.f286204d
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x08c8
            com.google.android.apps.gsa.staticplugins.j.s r1 = new com.google.android.apps.gsa.staticplugins.j.s
            r1.<init>(r8, r10)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r2)
            com.google.android.apps.gsa.shared.s.a.a r1 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            goto L_0x08c8
        L_0x08c7:
            r0 = 0
        L_0x08c8:
            if (r0 != 0) goto L_0x08d1
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x08d1:
            com.google.android.apps.gsa.staticplugins.j.t r1 = new com.google.android.apps.gsa.staticplugins.j.t
            r1.<init>(r8)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r2)
            com.google.android.apps.gsa.shared.s.a.a r1 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8019j.C102550al.mo93327b(com.google.android.apps.gsa.shared.search.Query, com.google.common.base.ax):com.google.common.util.concurrent.cx");
    }

    /* renamed from: c */
    public final C60870cx mo93328c(Query query, C58833ax axVar) {
        C60870cx g = C60922j.m93044g(mo93327b(query, axVar), new C102600w(this, this.f286212l.mo104019a()), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }

    /* renamed from: d */
    public final String mo93329d(C102549ak akVar) {
        StringBuilder sb = new StringBuilder(((C86124t) this.f286203c.mo27525b()).mo79758x(C90014bt.f247731mg));
        if (this.f286223w.mo56113h() && ((C74715bp) this.f286223w.mo56107c()).mo71084e()) {
            sb.append(((C86124t) this.f286203c.mo27525b()).mo79758x(C90126fx.f251761os));
        }
        C58485gu d = akVar.mo93326d();
        int size = d.size();
        for (int i = 0; i < size; i++) {
            m170053f(sb, (String) d.get(i));
        }
        if (this.f286201F && ((C86124t) this.f286203c.mo27525b()).mo79746e(C90029ch.f248282bp)) {
            m170053f(sb, "ui.DISMISS,3");
        }
        return sb.toString();
    }

    /* renamed from: e */
    public final String mo93330e() {
        return (!((C86124t) this.f286203c.mo27525b()).mo79746e(C90014bt.f247321eu) || !C90685b.m148054b(this.f286202b, (C90021c) this.f286203c.mo27525b())) ? "OPA_AGSA" : "OPA_ANDROID_TABLET";
    }

    /* renamed from: g */
    public final void mo93331g(C89849ae aeVar) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        ((C89859i) this.f286196A.mo27525b()).mo74236a(fVar.mo83699a());
    }

    /* renamed from: h */
    public final void mo93332h(C51714bl blVar, C58833ax axVar, boolean z, boolean z2) {
        List list;
        HashSet hashSet;
        int i;
        C51098gh a;
        C51714bl blVar2 = blVar;
        if (((C86054o) this.f286207g.mo27525b()).mo79668a() != null) {
            int i2 = 2;
            if (!z || !axVar.mo56113h()) {
                C58976aa aaVar = C58975e.f156826a;
                axVar.mo56113h();
            } else {
                C58976aa aaVar2 = C58975e.f156826a;
                C51772cy cyVar = ((C51715bm) blVar2.instance).f135671h;
                if (cyVar == null) {
                    cyVar = C51772cy.f135824p;
                }
                C51771cx cxVar = (C51771cx) cyVar.toBuilder();
                cxVar.copyOnWrite();
                ((C51772cy) cxVar.instance).f135829d = C51772cy.emptyProtobufList();
                cxVar.copyOnWrite();
                ((C51772cy) cxVar.instance).f135830e = C51772cy.emptyProtobufList();
                C58485gu a2 = ((C74523c) axVar.mo56107c()).mo70830a();
                cxVar.copyOnWrite();
                C51772cy cyVar2 = (C51772cy) cxVar.instance;
                cyVar2.mo53726c();
                C62947c.addAll((Iterable) a2, (List) cyVar2.f135830e);
                blVar.copyOnWrite();
                C51715bm bmVar = (C51715bm) blVar2.instance;
                C51772cy cyVar3 = (C51772cy) cxVar.build();
                cyVar3.getClass();
                bmVar.f135671h = cyVar3;
                bmVar.f135664a |= 128;
                if (this.f286198C.nextDouble() >= ((C86124t) this.f286203c.mo27525b()).mo79747m(C89971aj.f246525b)) {
                    return;
                }
                if (((C51772cy) cxVar.instance).f135830e.size() == 0) {
                    C51692at atVar = (C51692at) C51693au.f135615c.createBuilder();
                    C51099gi giVar = (C51099gi) C51100gj.f133015c.createBuilder();
                    C51060ex exVar = (C51060ex) C51061ey.f132958e.createBuilder();
                    exVar.copyOnWrite();
                    C51061ey eyVar = (C51061ey) exVar.instance;
                    eyVar.f132962c = 2;
                    eyVar.f132960a |= 2;
                    giVar.copyOnWrite();
                    C51100gj gjVar = (C51100gj) giVar.instance;
                    C51061ey eyVar2 = (C51061ey) exVar.build();
                    eyVar2.getClass();
                    gjVar.f133018b = eyVar2;
                    gjVar.f133017a = 1;
                    atVar.copyOnWrite();
                    C51693au auVar = (C51693au) atVar.instance;
                    C51100gj gjVar2 = (C51100gj) giVar.build();
                    gjVar2.getClass();
                    auVar.f135618b = gjVar2;
                    auVar.f135617a |= 1;
                    C51693au auVar2 = (C51693au) atVar.build();
                    cxVar.copyOnWrite();
                    C51772cy cyVar4 = (C51772cy) cxVar.instance;
                    auVar2.getClass();
                    cyVar4.mo53726c();
                    cyVar4.f135830e.add(auVar2);
                    blVar.copyOnWrite();
                    C51715bm bmVar2 = (C51715bm) blVar2.instance;
                    C51772cy cyVar5 = (C51772cy) cxVar.build();
                    cyVar5.getClass();
                    bmVar2.f135671h = cyVar5;
                    bmVar2.f135664a |= 128;
                }
            }
            if (z2) {
                list = new ArrayList();
                list.addAll(((C86124t) this.f286203c.mo27525b()).mo79745c(C90014bt.f247368fo));
                list.addAll(((C86124t) this.f286203c.mo27525b()).mo79745c(C90014bt.f247367fn));
                if (list.isEmpty()) {
                    list.addAll(((C90364ac) this.f286200E.mo27525b()).f252391c.keySet());
                }
                if (Telephony.Sms.getDefaultSmsPackage(this.f286202b) != null) {
                    list.add(Telephony.Sms.getDefaultSmsPackage(this.f286202b));
                }
            } else {
                list = ((C86124t) this.f286203c.mo27525b()).mo79745c(C90014bt.f247416gj);
            }
            if (z2) {
                hashSet = new HashSet(((C86124t) this.f286203c.mo27525b()).mo79745c(C90051dc.f248874bc));
            } else {
                hashSet = new HashSet();
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                try {
                    PackageInfo packageInfo = this.f286202b.getPackageManager().getPackageInfo(str, 0);
                    if (!(packageInfo.applicationInfo == null || !packageInfo.applicationInfo.enabled || (a = C85813be.m137887a(str, this.f286202b.getPackageManager())) == null)) {
                        C51690ar arVar = (C51690ar) C51691as.f135610d.createBuilder();
                        arVar.copyOnWrite();
                        C51691as asVar = (C51691as) arVar.instance;
                        asVar.f135613b = a;
                        asVar.f135612a |= 1;
                        if (hashSet.contains(str)) {
                            arVar.copyOnWrite();
                            C51691as asVar2 = (C51691as) arVar.instance;
                            asVar2.f135612a |= 128;
                            asVar2.f135614c = false;
                        }
                        arrayList.add((C51691as) arVar.build());
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
                intent.addCategory("android.intent.category.LAUNCHER");
                List<ResolveInfo> queryIntentActivities = this.f286202b.getPackageManager().queryIntentActivities(intent, 0);
                String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(this.f286202b);
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    String str2 = resolveInfo.activityInfo.applicationInfo.packageName;
                    if (!list.contains(str2)) {
                        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
                        esVar.copyOnWrite();
                        C51058ev evVar = (C51058ev) esVar.instance;
                        str2.getClass();
                        evVar.f132943a |= 1;
                        evVar.f132944b = str2;
                        if (defaultSmsPackage != null && defaultSmsPackage.equalsIgnoreCase(str2)) {
                            esVar.copyOnWrite();
                            C51058ev evVar2 = (C51058ev) esVar.instance;
                            evVar2.f132943a |= 4096;
                            evVar2.f132955m = true;
                        }
                        try {
                            PackageInfo packageInfo2 = this.f286202b.getPackageManager().getPackageInfo(str2, i);
                            if (packageInfo2.applicationInfo != null && packageInfo2.applicationInfo.enabled) {
                                int i3 = packageInfo2.versionCode;
                                esVar.copyOnWrite();
                                C51058ev evVar3 = (C51058ev) esVar.instance;
                                evVar3.f132943a |= i2;
                                evVar3.f132945c = i3;
                                long longVersionCode = packageInfo2.getLongVersionCode();
                                esVar.copyOnWrite();
                                C51058ev evVar4 = (C51058ev) esVar.instance;
                                evVar4.f132943a |= 4;
                                evVar4.f132946d = longVersionCode;
                                if (((C58759qy) C90729am.f253810a).f156534a.equals(str2)) {
                                    String str3 = packageInfo2.versionName;
                                    esVar.copyOnWrite();
                                    C51058ev evVar5 = (C51058ev) esVar.instance;
                                    str3.getClass();
                                    evVar5.f132943a |= 8;
                                    evVar5.f132947e = str3;
                                }
                                C51058ev evVar6 = (C51058ev) esVar.build();
                                C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
                                ggVar.copyOnWrite();
                                C51098gh ghVar = (C51098gh) ggVar.instance;
                                evVar6.getClass();
                                ghVar.f133013c = evVar6;
                                ghVar.f133012b = 1;
                                C51098gh ghVar2 = (C51098gh) ggVar.build();
                                C51690ar arVar2 = (C51690ar) C51691as.f135610d.createBuilder();
                                arVar2.copyOnWrite();
                                C51691as asVar3 = (C51691as) arVar2.instance;
                                ghVar2.getClass();
                                asVar3.f135613b = ghVar2;
                                asVar3.f135612a |= 1;
                                if (hashSet.contains(str2)) {
                                    arVar2.copyOnWrite();
                                    C51691as asVar4 = (C51691as) arVar2.instance;
                                    asVar4.f135612a |= 128;
                                    asVar4.f135614c = false;
                                }
                                arrayList2.add((C51691as) arVar2.build());
                                i2 = 2;
                                i = 0;
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                }
                arrayList.addAll(arrayList2);
            }
            if (!arrayList.isEmpty()) {
                C51772cy cyVar6 = ((C51715bm) blVar2.instance).f135671h;
                if (cyVar6 == null) {
                    cyVar6 = C51772cy.f135824p;
                }
                C51771cx cxVar2 = (C51771cx) cyVar6.toBuilder();
                cxVar2.copyOnWrite();
                ((C51772cy) cxVar2.instance).f135829d = C51772cy.emptyProtobufList();
                cxVar2.mo53722a(arrayList);
                C51772cy cyVar7 = (C51772cy) cxVar2.build();
                blVar.copyOnWrite();
                C51715bm bmVar3 = (C51715bm) blVar2.instance;
                cyVar7.getClass();
                bmVar3.f135671h = cyVar7;
                bmVar3.f135664a |= 128;
                return;
            }
            return;
        }
        C58976aa aaVar3 = C58975e.f156826a;
    }

    /* renamed from: i */
    public final void mo93333i(C51714bl blVar) {
        String b = ((C86106b) this.f286205e.mo27525b()).mo79727b();
        if (!TextUtils.isEmpty(b)) {
            C52427ri riVar = (C52427ri) C52428rj.f137558m.createBuilder();
            riVar.copyOnWrite();
            C52428rj rjVar = (C52428rj) riVar.instance;
            b.getClass();
            rjVar.f137560a |= 8;
            rjVar.f137563d = b;
            C52428rj rjVar2 = (C52428rj) riVar.build();
            blVar.copyOnWrite();
            C51715bm bmVar = (C51715bm) blVar.instance;
            C51715bm bmVar2 = C51715bm.f135662t;
            rjVar2.getClass();
            bmVar.f135665b = rjVar2;
            bmVar.f135664a |= 1;
        }
    }

    /* renamed from: j */
    public final void mo93334j(C51714bl blVar) {
        if (((C86124t) this.f286203c.mo27525b()).mo79746e(C90086ek.f250399cR) && ((C86054o) this.f286207g.mo27525b()).mo79668a() == null) {
            C51772cy cyVar = ((C51715bm) blVar.instance).f135671h;
            if (cyVar == null) {
                cyVar = C51772cy.f135824p;
            }
            C51771cx cxVar = (C51771cx) cyVar.toBuilder();
            C52265li liVar = ((C51772cy) cxVar.instance).f135828c;
            if (liVar == null) {
                liVar = C52265li.f137167I;
            }
            C52264lh lhVar = (C52264lh) liVar.toBuilder();
            lhVar.copyOnWrite();
            C52265li liVar2 = (C52265li) lhVar.instance;
            liVar2.f137182f = 4;
            liVar2.f137177a |= 8;
            cxVar.copyOnWrite();
            C51772cy cyVar2 = (C51772cy) cxVar.instance;
            C52265li liVar3 = (C52265li) lhVar.build();
            liVar3.getClass();
            cyVar2.f135828c = liVar3;
            cyVar2.f135826a |= 1;
            blVar.copyOnWrite();
            C51715bm bmVar = (C51715bm) blVar.instance;
            C51772cy cyVar3 = (C51772cy) cxVar.build();
            cyVar3.getClass();
            bmVar.f135671h = cyVar3;
            bmVar.f135664a |= 128;
        }
    }

    /* renamed from: l */
    public final void mo93335l(C84341b bVar, C51714bl blVar, String str, String str2) {
        if (this.f286204d.mo56113h()) {
            boolean z = this.f286201F && this.f286216p.mo56113h() && ((C108100a) this.f286216p.mo56107c()).mo96449n();
            HashSet hashSet = new HashSet(Arrays.asList(str2.split(";")));
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split(";");
                int length = split.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String str3 = split[i];
                    String[] split2 = str3.split(",");
                    if (split2.length != 2) {
                        C59104x d = f286195a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "DeviceCapHelper");
                        C59052c cVar = (C59052c) d;
                        cVar.mo56380ai(C58979ad.FULL);
                        ((C59052c) cVar.mo56372aa(13973)).mo56389s("Invalid client op format: %s", str3);
                        hashMap = new HashMap();
                        break;
                    }
                    String str4 = split2[0];
                    try {
                        int parseInt = Integer.parseInt(split2[1]);
                        Integer num = (Integer) hashMap.get(str4);
                        if (num == null || num.intValue() < parseInt) {
                            hashMap.put(str4, Integer.valueOf(parseInt));
                        }
                        i++;
                    } catch (NumberFormatException unused) {
                        C59104x d2 = f286195a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "DeviceCapHelper");
                        C59052c cVar2 = (C59052c) d2;
                        cVar2.mo56380ai(C58979ad.FULL);
                        ((C59052c) cVar2.mo56372aa(13972)).mo56389s("Invalid client op version: %s", str3);
                        hashMap = new HashMap();
                    }
                }
            }
            C51772cy cyVar = ((C51715bm) blVar.instance).f135671h;
            if (cyVar == null) {
                cyVar = C51772cy.f135824p;
            }
            C51771cx cxVar = (C51771cx) cyVar.toBuilder();
            cxVar.copyOnWrite();
            ((C51772cy) cxVar.instance).f135827b = C51772cy.emptyProtobufList();
            for (C51785da daVar : ((C84375u) this.f286204d.mo56107c()).mo77932a(bVar)) {
                if (hashSet.contains(daVar.f135878b)) {
                    C59104x b = f286195a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "DeviceCapHelper");
                    ((C59052c) ((C59052c) b).mo56372aa(13988)).mo56389s("Disable Client Ops: %s", daVar.f135878b);
                } else {
                    if (daVar.f135878b.equals("ui.SHOW_INTENT_PLATE")) {
                        C58976aa aaVar = C58975e.f156826a;
                        String str5 = daVar.f135878b;
                        if (z) {
                        }
                    }
                    Integer num2 = (Integer) hashMap.get(daVar.f135878b);
                    if (num2 != null) {
                        C51773cz czVar = (C51773cz) daVar.toBuilder();
                        if (num2.intValue() < ((C51785da) czVar.instance).f135879c) {
                            int intValue = num2.intValue();
                            czVar.copyOnWrite();
                            C51785da daVar2 = (C51785da) czVar.instance;
                            daVar2.f135877a |= 2;
                            daVar2.f135879c = intValue;
                        }
                        cxVar.copyOnWrite();
                        C51772cy cyVar2 = (C51772cy) cxVar.instance;
                        C51785da daVar3 = (C51785da) czVar.build();
                        daVar3.getClass();
                        cyVar2.mo53724a();
                        cyVar2.f135827b.add(daVar3);
                    }
                }
            }
            blVar.copyOnWrite();
            C51715bm bmVar = (C51715bm) blVar.instance;
            C51772cy cyVar3 = (C51772cy) cxVar.build();
            cyVar3.getClass();
            bmVar.f135671h = cyVar3;
            bmVar.f135664a |= 128;
        }
    }

    /* renamed from: n */
    public final void mo93336n(C51714bl blVar, String str) {
        ame ame = (ame) amf.f135365e.createBuilder();
        String b = ((C86106b) this.f286205e.mo27525b()).mo79727b();
        if (!TextUtils.isEmpty(b)) {
            C52427ri riVar = (C52427ri) C52428rj.f137558m.createBuilder();
            riVar.copyOnWrite();
            C52428rj rjVar = (C52428rj) riVar.instance;
            b.getClass();
            rjVar.f137560a |= 8;
            rjVar.f137563d = b;
            ame.copyOnWrite();
            amf amf = (amf) ame.instance;
            C52428rj rjVar2 = (C52428rj) riVar.build();
            rjVar2.getClass();
            amf.f135368b = rjVar2;
            amf.f135367a |= 1;
        }
        String[] split = ((String) this.f286215o.mo27525b()).split("\\.", -1);
        if (split.length >= 2) {
            ame.copyOnWrite();
            amf amf2 = (amf) ame.instance;
            amf2.f135367a |= 2;
            amf2.f135369c = str;
            amg amg = (amg) amh.f135371d.createBuilder();
            int parseInt = Integer.parseInt(split[0]);
            amg.copyOnWrite();
            amh amh = (amh) amg.instance;
            amh.f135373a |= 1;
            amh.f135374b = parseInt;
            int parseInt2 = Integer.parseInt(split[1]);
            amg.copyOnWrite();
            amh amh2 = (amh) amg.instance;
            amh2.f135373a = 2 | amh2.f135373a;
            amh2.f135375c = parseInt2;
            ame.copyOnWrite();
            amf amf3 = (amf) ame.instance;
            amh amh3 = (amh) amg.build();
            amh3.getClass();
            amf3.f135370d = amh3;
            amf3.f135367a |= 4;
            C59104x b2 = f286195a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "DeviceCapHelper");
            ((C59052c) ((C59052c) b2).mo56372aa(13989)).mo56389s("Adding surface identity to the device capabilities for surface %s.", str);
            blVar.copyOnWrite();
            C51715bm bmVar = (C51715bm) blVar.instance;
            amf amf4 = (amf) ame.build();
            C51715bm bmVar2 = C51715bm.f135662t;
            amf4.getClass();
            bmVar.f135667d = amf4;
            bmVar.f135664a |= 4;
        }
    }
}
