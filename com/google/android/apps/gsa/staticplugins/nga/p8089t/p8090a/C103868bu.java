package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80617l;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6973ad.C89085a;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.nga.p8087s.C103799g;
import com.google.android.apps.gsa.staticplugins.nga.p8089t.C103943bp;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.download.C28806cu;
import com.google.android.libraries.mdi.download.C28807cv;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.phenotype.client.C31652ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58571jz;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Queue;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collector;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.bu */
/* compiled from: PG */
public final class C103868bu implements C90991b, C89085a {

    /* renamed from: a */
    public static final C58974d f289129a = C58974d.m91136j();

    /* renamed from: b */
    public static final Comparator f289130b;

    /* renamed from: c */
    public final Context f289131c;

    /* renamed from: d */
    public final C86124t f289132d;

    /* renamed from: e */
    public final C31652ah f289133e;

    /* renamed from: f */
    public final C22871g f289134f;

    /* renamed from: g */
    public final C22871g f289135g;

    /* renamed from: h */
    public final C60950i f289136h;

    /* renamed from: i */
    public final C103799g f289137i;

    /* renamed from: j */
    public final C58495hd f289138j;

    /* renamed from: k */
    public final C80617l f289139k;

    /* renamed from: l */
    public final Queue f289140l;

    /* renamed from: m */
    public final C60836bq f289141m;

    /* renamed from: n */
    public Optional f289142n = Optional.empty();

    /* renamed from: o */
    private final C68214a f289143o;

    /* renamed from: p */
    private final C103943bp f289144p;

    /* renamed from: q */
    private final C58485gu f289145q;

    /* renamed from: r */
    private final C68214a f289146r;

    static {
        C103851bd bdVar = C103851bd.f289105a;
        Comparator naturalOrder = Comparator.CC.naturalOrder();
        naturalOrder.getClass();
        f289130b = Comparator.CC.comparing(bdVar, new C58571jz(naturalOrder));
    }

    public C103868bu(Context context, C68214a aVar, C103943bp bpVar, C86124t tVar, C31652ah ahVar, C22871g gVar, C22871g gVar2, C60950i iVar, C103799g gVar3, C103885k kVar, C91022f fVar, C80617l lVar, C68214a aVar2) {
        C22871g gVar4 = gVar;
        C22871g gVar5 = gVar2;
        C103885k kVar2 = kVar;
        C68214a aVar3 = aVar2;
        C58425eo eoVar = new C58425eo(100);
        this.f289140l = eoVar;
        C60836bq bqVar = new C60836bq();
        this.f289141m = bqVar;
        this.f289131c = context;
        this.f289143o = aVar;
        this.f289144p = bpVar;
        this.f289132d = tVar;
        this.f289133e = ahVar;
        this.f289134f = gVar4;
        this.f289135g = gVar5;
        this.f289136h = iVar;
        this.f289137i = gVar3;
        C58485gu r = C58485gu.m89850r(kVar2.mo93876b(C90126fx.f251007ag, "data_sync_configuration_sources"), kVar2.mo93875a(C90126fx.f251738oV, "use_canary_sot_filegroups"), kVar2.mo93875a(C90126fx.f251742oZ, "use_head_sot_filegroups"), kVar2.mo93875a(C90126fx.f251049bV, "enable_automatic_download_of_initial_data"), kVar2.mo93876b(C90126fx.f251605lv, "mdd_configuration_mode"));
        this.f289145q = r;
        C58480gp e = C58485gu.m89837e();
        e.mo55396h(r);
        e.mo55395g(kVar2.mo93875a(C90126fx.f251771pb, "use_sot_filegroup_populator [irrelevant for app versions > 12.5]"));
        this.f289138j = (C58495hd) Collection.EL.stream(e.mo55394f()).collect(C58370cn.m89403c(C103836ap.f289088a, C103837aq.f289089a, C103838ar.f289090a));
        this.f289139k = lVar;
        this.f289146r = aVar3;
        bqVar.mo57304a(new C103830aj(context, eoVar), new C103831ak(gVar5));
        gVar5.mo28212l("[NGA] NgaSyncDumper.refreshBreakdown", new C103850bc(this, gVar4, aVar3));
        fVar.mo85301a(this);
    }

    /* renamed from: f */
    public static File m171814f(Context context) {
        return new File(context.getCacheDir(), "sync_events");
    }

    /* renamed from: g */
    public static String m171815g(C103876cb cbVar) {
        return (String) Collection.EL.stream(Collections.unmodifiableMap(cbVar.f289163a).entrySet()).map(C103826af.f289076a).sorted().collect(Collectors.joining(", ", "{", "}"));
    }

    /* renamed from: j */
    private final Collector m171816j(Function function, Function function2) {
        return Collectors.collectingAndThen(Collectors.toMap(new C103827ag(this, function), function2, C103828ah.f289079a), C103829ai.f289080a);
    }

    /* renamed from: k */
    private final void m171817k(String str, Optional optional) {
        C22871g gVar = this.f289134f;
        C60870cx a = this.f289135g.mo28201a("[NGA] NgaSyncDumper.buildEvent.getPhDataFileGroups", new C103856bi(this));
        C28806cu h = C28807cv.m53759h();
        h.mo34460d(true);
        C60870cx g = ((C29409fd) this.f289143o.mo27525b()).mo34718g(h.mo34462f());
        C60870cx c = this.f289144p.mo93890c();
        C60870cx f = C80905at.m128762f(this.f289145q, C103857bj.f289111a);
        gVar.mo28211k(C60856cj.m92895d(g, c, a, f).mo57334a(new C103859bl(this, a, c, g, f, optional, str), new C103860bm(this)), "[NGA] NgaSyncDumper.addEvent", new C103867bt(this, str));
    }

    /* renamed from: a */
    public final void mo83057a(String str) {
        m171817k(str, Optional.empty());
        mo93873h();
    }

    /* renamed from: b */
    public final void mo83058b(String str, Throwable th) {
        m171817k(str, Optional.m71637of(th));
    }

    /* renamed from: c */
    public final Collector mo93871c() {
        return m171816j(C103864bq.f289124a, C103865br.f289125a);
    }

    /* renamed from: e */
    public final Collector mo93872e() {
        return m171816j(C103839as.f289091a, C103840at.f289092a);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C58485gu lD;
        C58974d dVar = f289129a;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(21792)).mo56386p("Dumping NgaSync's state.");
        synchronized (this.f289140l) {
            lD = C58485gu.m89842j(this.f289140l).mo55401lD();
        }
        m171817k("DUMP_TASK", Optional.empty());
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(21794)).mo56386p("Dumping Data Usage breakdown");
        Optional optional = this.f289142n;
        fVar.mo85291r("Nga Mdd Breakdown Info");
        String str = true != optional.isPresent() ? "Not available" : "Available";
        fVar.mo85278b("Breakdown Status").mo85276a(C90752i.m148229c(str));
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(21795)).mo56389s("Breakdown status: %s", str);
        if (!optional.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            C103878d dVar2 = (C103878d) optional.get();
            fVar.mo85279c("Total Size").mo85276a(C90752i.m148229c(Formatter.formatFileSize(this.f289131c, dVar2.f289181b)));
            String format = String.format(Locale.ENGLISH, "Total Size: %d", new Object[]{Long.valueOf(dVar2.f289181b)});
            sb.append(format);
            sb.append(10);
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(21796)).mo56389s("%s", format);
            for (C103874c cVar : dVar2.f289182c) {
                C91006f e = fVar.mo85281e((Object) null);
                e.mo85291r("MDD Group");
                e.mo85279c("Group Name").mo85276a(C90752i.m148229c(cVar.f289156b));
                e.mo85279c("Version").mo85276a(C90752i.m148229c(TextUtils.join(", ", cVar.f289157c)));
                e.mo85279c("Size (including shared files)").mo85276a(C90752i.m148229c(Formatter.formatFileSize(this.f289131c, cVar.f289158d)));
                e.mo85279c("Shared Files Size").mo85276a(C90752i.m148229c(Formatter.formatFileSize(this.f289131c, cVar.f289159e)));
                sb.append(String.format(Locale.ENGLISH, "Group: %s, Versions: %s, Size: %d, Shared Size: %d", new Object[]{cVar.f289156b, TextUtils.join(", ", cVar.f289157c), Long.valueOf(cVar.f289158d), Long.valueOf(cVar.f289159e)}));
                sb.append(10);
            }
            ((C58970a) ((C58970a) f289129a.mo56224b()).mo56372aa(21797)).mo56386p("Attaching breakdown to feedback data");
            fVar.mo85284k("Nga Mdd Breakdown Info", sb.toString());
        }
        ((C58970a) ((C58970a) f289129a.mo56224b()).mo56372aa(21793)).mo56386p("Dumping NgaSync events");
        fVar.mo85283j("Nga Sync Info", (String) Collection.EL.stream(lD).map(new C103852be(this)).collect(Collectors.joining("\n", "\n", BuildConfig.FLAVOR)), false);
    }

    /* renamed from: h */
    public final void mo93873h() {
        mo93874i(this.f289134f, (C103823ac) this.f289146r.mo27525b());
    }

    /* renamed from: i */
    public final void mo93874i(C22871g gVar, C103823ac acVar) {
        new C90873ag(acVar.mo93864a(), gVar, "[NGA] NgaSyncDumper.calculateBreakdown()", new C103866bs(this)).mo85223a(C103825ae.f289075a);
    }
}
