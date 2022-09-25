package com.google.android.libraries.appactions.serviceengine.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.util.LruCache;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.appactions.serviceengine.api.C147875h;
import com.google.android.libraries.appactions.serviceengine.api.C147877j;
import com.google.android.libraries.appactions.serviceengine.api.C147881n;
import com.google.android.libraries.appactions.serviceengine.p11037a.C147863a;
import com.google.android.libraries.appactions.serviceengine.p11037a.C147867e;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3944g.p3948b.p3949a.C52933ad;
import com.google.assistant.p3944g.p3948b.p3949a.C52934ae;
import com.google.assistant.p3944g.p3948b.p3949a.C52940e;
import com.google.assistant.p3944g.p3948b.p3949a.C52941f;
import com.google.assistant.p3944g.p3948b.p3949a.C52943h;
import com.google.assistant.p3944g.p3948b.p3949a.C52945j;
import com.google.assistant.p3944g.p3948b.p3949a.C52946k;
import com.google.assistant.p3944g.p3948b.p3949a.C52950o;
import com.google.assistant.p3944g.p3948b.p3949a.C52951p;
import com.google.assistant.p3944g.p3948b.p3949a.C52956u;
import com.google.assistant.p3944g.p3948b.p3949a.C52957v;
import com.google.assistant.p3944g.p3948b.p3949a.C52958w;
import com.google.assistant.p3944g.p3948b.p3949a.C52960y;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.IntStream;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71090ei;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.ao */
/* compiled from: PG */
public final class C147906ao implements C147875h {

    /* renamed from: i */
    private static final C59071e f398970i = C59071e.m91332i("com.google.android.libraries.appactions.serviceengine.impl.ao");

    /* renamed from: a */
    public final Context f398971a;

    /* renamed from: b */
    public final C147867e f398972b;

    /* renamed from: c */
    public final Duration f398973c;

    /* renamed from: d */
    public final LruCache f398974d;

    /* renamed from: e */
    public Optional f398975e = Optional.empty();

    /* renamed from: f */
    public Map f398976f = new HashMap();

    /* renamed from: g */
    public final C147914g f398977g;

    /* renamed from: h */
    public final C147913f f398978h;

    /* renamed from: j */
    private final Executor f398979j;

    /* renamed from: k */
    private final String f398980k;

    /* renamed from: l */
    private final boolean f398981l;

    public C147906ao(Context context, Executor executor, C147914g gVar, C147867e eVar, String str, boolean z, long j, C62910ar arVar, C147913f fVar) {
        this.f398971a = context;
        this.f398979j = executor;
        this.f398977g = gVar;
        this.f398972b = eVar;
        this.f398980k = str;
        this.f398981l = z;
        this.f398973c = C62950b.m95473d(arVar);
        this.f398978h = fVar;
        this.f398974d = new LruCache((int) j);
    }

    /* renamed from: e */
    public static Intent m241044e(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setFlags(268435456);
        return intent;
    }

    /* renamed from: i */
    private final C60870cx m241045i(C147881n nVar) {
        if (this.f398981l) {
            C52933ad adVar = (C52933ad) C52934ae.f138786b.createBuilder();
            C52956u uVar = (C52956u) C52957v.f138849e.createBuilder();
            C52958w wVar = (C52958w) C52960y.f138856c.createBuilder();
            wVar.copyOnWrite();
            C52960y yVar = (C52960y) wVar.instance;
            yVar.f138859b = 1;
            yVar.f138858a |= 1;
            uVar.copyOnWrite();
            C52957v vVar = (C52957v) uVar.instance;
            C52960y yVar2 = (C52960y) wVar.build();
            yVar2.getClass();
            vVar.f138852b = yVar2;
            vVar.f138851a |= 1;
            C52945j jVar = (C52945j) C52946k.f138824d.createBuilder();
            String str = this.f398980k;
            jVar.copyOnWrite();
            C52946k kVar = (C52946k) jVar.instance;
            str.getClass();
            kVar.f138826a = 1 | kVar.f138826a;
            kVar.f138827b = str;
            uVar.copyOnWrite();
            C52957v vVar2 = (C52957v) uVar.instance;
            C52946k kVar2 = (C52946k) jVar.build();
            kVar2.getClass();
            vVar2.f138853c = kVar2;
            vVar2.f138851a |= 4;
            adVar.copyOnWrite();
            C52934ae aeVar = (C52934ae) adVar.instance;
            C52957v vVar3 = (C52957v) uVar.build();
            vVar3.getClass();
            aeVar.mo53949a();
            aeVar.f138788a.add(vVar3);
            return C60856cj.m92900i((C52934ae) adVar.build());
        }
        C52933ad adVar2 = (C52933ad) C52934ae.f138786b.createBuilder();
        Optional flatMap = nVar.mo124548c().flatMap(new C147903al(this, nVar));
        Objects.requireNonNull(adVar2);
        flatMap.ifPresent(new C147904am(adVar2));
        String str2 = (String) nVar.mo124550e().orElseThrow(C147905an.f398969a);
        if ("com.starbucks.mobilecard".equals(str2)) {
            C52956u uVar2 = (C52956u) C52957v.f138849e.createBuilder();
            C52958w wVar2 = (C52958w) C52960y.f138856c.createBuilder();
            wVar2.copyOnWrite();
            C52960y yVar3 = (C52960y) wVar2.instance;
            yVar3.f138859b = 1;
            yVar3.f138858a |= 1;
            uVar2.copyOnWrite();
            C52957v vVar4 = (C52957v) uVar2.instance;
            C52960y yVar4 = (C52960y) wVar2.build();
            yVar4.getClass();
            vVar4.f138852b = yVar4;
            vVar4.f138851a |= 1;
            C52945j jVar2 = (C52945j) C52946k.f138824d.createBuilder();
            jVar2.copyOnWrite();
            C52946k kVar3 = (C52946k) jVar2.instance;
            kVar3.f138826a |= 1;
            kVar3.f138827b = "Starbucks";
            uVar2.copyOnWrite();
            C52957v vVar5 = (C52957v) uVar2.instance;
            C52946k kVar4 = (C52946k) jVar2.build();
            kVar4.getClass();
            vVar5.f138853c = kVar4;
            vVar5.f138851a |= 4;
            C52950o oVar = (C52950o) C52951p.f138834f.createBuilder();
            C52940e eVar = (C52940e) C52941f.f138810d.createBuilder();
            eVar.copyOnWrite();
            C52941f fVar = (C52941f) eVar.instance;
            fVar.f138812a = 1 | fVar.f138812a;
            fVar.f138813b = "com.starbucks.mobilecard";
            eVar.copyOnWrite();
            C52941f fVar2 = (C52941f) eVar.instance;
            fVar2.f138812a |= 2;
            fVar2.f138814c = "actions.intent.OPEN_APP_FEATURE";
            oVar.copyOnWrite();
            C52951p pVar = (C52951p) oVar.instance;
            C52941f fVar3 = (C52941f) eVar.build();
            fVar3.getClass();
            pVar.f138838c = fVar3;
            pVar.f138836a |= 2;
            oVar.mo53953a(C52943h.EXECUTION_MODE_BUILT_IN_INTENT);
            uVar2.copyOnWrite();
            C52957v vVar6 = (C52957v) uVar2.instance;
            C52951p pVar2 = (C52951p) oVar.build();
            pVar2.getClass();
            vVar6.f138854d = pVar2;
            vVar6.f138851a |= 8;
            adVar2.mo53948a((C52957v) uVar2.build());
        }
        if ("com.instacart.client".equals(str2)) {
            Optional flatMap2 = nVar.mo124557j().flatMap(new C147917j(this, nVar));
            Objects.requireNonNull(adVar2);
            flatMap2.ifPresent(new C147904am(adVar2));
        }
        return C60856cj.m92900i((C52934ae) adVar2.build());
    }

    /* renamed from: a */
    public final C60870cx mo124559a(C147881n nVar) {
        if (this.f398975e.isPresent() && nVar.mo124565l().isPresent() && nVar.mo124550e().isPresent()) {
            ((C37215b) this.f398975e.get()).mo19974a(C37182a.f98181hp.mo40812e(C71090ei.f189599d, C147863a.m240981a((String) nVar.mo124565l().get(), (String) nVar.mo124550e().get())));
        }
        C60870cx i = m241045i(nVar);
        C147902ak akVar = new C147902ak(this, nVar);
        return C60922j.m93044g(i, C47810es.m84963c(akVar), this.f398979j);
    }

    /* renamed from: b */
    public final C60870cx mo124560b(C147881n nVar) {
        if (this.f398975e.isPresent() && nVar.mo124565l().isPresent() && nVar.mo124550e().isPresent()) {
            ((C37215b) this.f398975e.get()).mo19974a(C37182a.f98179hn.mo40812e(C71090ei.f189599d, C147863a.m240981a((String) nVar.mo124565l().get(), (String) nVar.mo124550e().get())));
        }
        C60870cx i = m241045i(nVar);
        C147900ai aiVar = new C147900ai(this, nVar);
        return C60922j.m93044g(i, C47810es.m84963c(aiVar), this.f398979j);
    }

    /* renamed from: c */
    public final C60870cx mo124561c(C147877j jVar) {
        C147930w wVar = new C147930w(this, jVar);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(wVar), this.f398979j);
        C147931x xVar = new C147931x(this);
        return C60922j.m93044g(m, C47810es.m84963c(xVar), this.f398979j);
    }

    /* renamed from: d */
    public final void mo124562d(C37215b bVar) {
        this.f398975e = Optional.ofNullable(bVar);
    }

    /* renamed from: f */
    public final void mo124569f() {
        if (this.f398976f.isEmpty()) {
            try {
                String[] stringArray = this.f398971a.getResources().getStringArray(R.array.instacart_eligible_url_pattern_map);
                this.f398976f = (Map) IntStream.CC.range(0, stringArray.length >> 1).boxed().collect(Collectors.toMap(new C147894ac(stringArray), new C147895ad(stringArray), C147897af.f398958a, C147898ag.f398959a));
            } catch (Resources.NotFoundException e) {
                ((C59052c) ((C59052c) ((C59052c) f398970i.mo56226d()).mo56382g(e)).mo56372aa(42274)).mo56386p("Cannot initialize url pattern matching");
            }
        }
    }

    /* renamed from: g */
    public final boolean mo124570g(Intent intent, String str) {
        return ((Boolean) Optional.ofNullable(this.f398971a.getPackageManager()).map(new C147918k(intent)).map(C147919l.f398997a).map(C147920m.f398998a).map(new C147921n(str)).orElse(false)).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo124571h(String str) {
        return ((Boolean) Optional.ofNullable(this.f398971a.getPackageManager()).flatMap(new C147928u(str)).map(C147929v.f399007a).orElse(false)).booleanValue();
    }
}
