package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83774q;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83775r;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83776s;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83777t;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83778u;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83779v;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83780w;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83781x;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n.p9982a.C131440f;
import com.google.android.gms.appdatasearch.C142787ac;
import com.google.android.gms.appdatasearch.Section;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.search.queries.C145948p;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p3339v.C43205e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import p3186j$.time.Instant;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.ad */
/* compiled from: PG */
public final class C131444ad implements C131496by {

    /* renamed from: a */
    public final C58974d f359264a;

    /* renamed from: b */
    public final C131440f f359265b;

    /* renamed from: c */
    public final C131454an f359266c;

    /* renamed from: d */
    public final boolean f359267d;

    /* renamed from: e */
    public final boolean f359268e;

    /* renamed from: f */
    public final C60887da f359269f;

    /* renamed from: g */
    public final C60887da f359270g;

    /* renamed from: h */
    private final Context f359271h;

    /* renamed from: i */
    private final C145948p f359272i;

    public C131444ad(C130603a aVar, C131440f fVar, C131454an anVar, boolean z, boolean z2, C60887da daVar, C60887da daVar2, Context context, C145948p pVar) {
        this.f359264a = aVar.mo109740b(this);
        this.f359265b = fVar;
        this.f359266c = anVar;
        this.f359267d = z;
        this.f359268e = z2;
        this.f359269f = daVar;
        this.f359270g = daVar2;
        this.f359271h = context;
        this.f359272i = pVar;
    }

    /* renamed from: a */
    public static C83778u m213891a(C83778u uVar, String str, Instant instant, String str2) {
        C83777t tVar = (C83777t) uVar.toBuilder();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setPackage("com.google.android.keep");
        String uri = intent.toUri(1);
        tVar.copyOnWrite();
        C83778u uVar2 = (C83778u) tVar.instance;
        uri.getClass();
        uVar2.f228341a |= 64;
        uVar2.f228348h = uri;
        tVar.copyOnWrite();
        C83778u uVar3 = (C83778u) tVar.instance;
        str2.getClass();
        uVar3.f228341a |= 16;
        uVar3.f228346f = str2;
        long epochMilli = instant.toEpochMilli();
        tVar.copyOnWrite();
        C83778u uVar4 = (C83778u) tVar.instance;
        uVar4.f228341a |= 128;
        uVar4.f228349i = epochMilli;
        C83775r rVar = (C83775r) C83776s.f228333e.createBuilder();
        rVar.copyOnWrite();
        C83776s sVar = (C83776s) rVar.instance;
        sVar.f228335a |= 1;
        sVar.f228336b = "com.google.android.keep";
        tVar.copyOnWrite();
        C83778u uVar5 = (C83778u) tVar.instance;
        C83776s sVar2 = (C83776s) rVar.build();
        sVar2.getClass();
        uVar5.f228350j = sVar2;
        uVar5.f228341a |= 256;
        return (C83778u) tVar.build();
    }

    /* renamed from: b */
    public final C83781x mo110175b(C83778u uVar) {
        Optional optional;
        C83774q qVar = (C83774q) C83781x.f228356c.createBuilder();
        qVar.copyOnWrite();
        C83781x xVar = (C83781x) qVar.instance;
        uVar.getClass();
        xVar.mo77099a();
        xVar.f228358a.add(uVar);
        Intent putExtra = new Intent("com.google.android.gms.actions.CREATE_ITEM_LIST").setPackage("com.google.android.keep").putExtra("com.google.android.gms.actions.EXTRA_LIST_NAME", this.f359271h.getString(R.string.assistant_shopping_list_sign_up_card_header)).putExtra("skipUi", false);
        if (putExtra.resolveActivity(this.f359271h.getPackageManager()) == null) {
            ((C58970a) ((C58970a) this.f359264a.mo56226d()).mo56372aa(39269)).mo56386p("Cannot resolve sign-up intent.");
            optional = Optional.empty();
        } else {
            C83779v vVar = (C83779v) C83780w.f228351d.createBuilder();
            String uri = putExtra.toUri(1);
            vVar.copyOnWrite();
            C83780w wVar = (C83780w) vVar.instance;
            uri.getClass();
            wVar.f228353a |= 1;
            wVar.f228354b = uri;
            C83775r rVar = (C83775r) C83776s.f228333e.createBuilder();
            rVar.copyOnWrite();
            C83776s sVar = (C83776s) rVar.instance;
            sVar.f228335a = 1 | sVar.f228335a;
            sVar.f228336b = "com.google.android.keep";
            vVar.copyOnWrite();
            C83780w wVar2 = (C83780w) vVar.instance;
            C83776s sVar2 = (C83776s) rVar.build();
            sVar2.getClass();
            wVar2.f228355c = sVar2;
            wVar2.f228353a |= 8;
            optional = Optional.m71637of((C83780w) vVar.build());
        }
        Objects.requireNonNull(qVar);
        optional.ifPresent(new C131507k(qVar));
        return (C83781x) qVar.build();
    }

    /* renamed from: c */
    public final C60870cx mo110176c() {
        C60870cx cxVar;
        try {
            this.f359271h.getPackageManager().getApplicationInfo("com.google.android.keep", 0);
            ((C58970a) ((C58970a) this.f359264a.mo56224b()).mo56372aa(39266)).mo56386p("Keep is INSTALLED.");
            C142787ac acVar = new C142787ac();
            acVar.mo117690b(new Section("name", false, 0));
            acVar.mo117690b(new Section("thing_proto", false, 0));
            Class<C143842n> cls = C143842n.class;
            cxVar = C47633f.m84733g(C43205e.m76192b(this.f359272i.mo122337a(BuildConfig.FLAVOR, "com.google.android.keep", new String[]{"internal.3p:NoteDigitalDocument"}, 0, 1000, acVar.mo117689a()))).mo51513e(cls, new C131508l(this), this.f359269f).mo51516i(new C131509m(this), this.f359269f);
        } catch (PackageManager.NameNotFoundException unused) {
            ((C58970a) ((C58970a) this.f359264a.mo56224b()).mo56372aa(39267)).mo56386p("Keep is not installed.");
            cxVar = C60856cj.m92900i(Optional.empty());
        }
        C131442ab abVar = new C131442ab(this);
        C60856cj.m92911t(cxVar, C47810es.m84974n(abVar), this.f359269f);
        return cxVar;
    }
}
