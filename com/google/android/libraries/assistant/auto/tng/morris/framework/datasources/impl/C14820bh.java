package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.content.ComponentName;
import android.support.p031v4.media.MediaBrowserCompat;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14781a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14220bd;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14309el;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14336fl;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14337fm;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14338fn;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15346t;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3745ab.C48258bo;
import com.google.assistant.p3745ab.C48260bq;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59710cy;
import com.google.common.p4552o.C59711cz;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.bh */
/* compiled from: PG */
public final class C14820bh implements C14781a {

    /* renamed from: a */
    public static final C59071e f44628a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.bh");

    /* renamed from: b */
    public MediaBrowserCompat f44629b;

    /* renamed from: c */
    public ComponentName f44630c;

    /* renamed from: d */
    public String f44631d;

    /* renamed from: e */
    public final C14828bp f44632e;

    /* renamed from: f */
    public final C46428ao f44633f;

    /* renamed from: g */
    public final C15346t f44634g;

    /* renamed from: h */
    public final AtomicReference f44635h = new AtomicReference(new ArrayList());

    /* renamed from: i */
    private String f44636i;

    /* renamed from: j */
    private final C60888db f44637j;

    /* renamed from: k */
    private final C86124t f44638k;

    /* renamed from: l */
    private final C37215b f44639l;

    /* renamed from: m */
    private C60870cx f44640m;

    /* renamed from: n */
    private final long f44641n;

    public C14820bh(C14828bp bpVar, C60888db dbVar, C46428ao aoVar, C86124t tVar, C37215b bVar, C15346t tVar2) {
        this.f44632e = bpVar;
        this.f44637j = dbVar;
        this.f44633f = aoVar;
        this.f44641n = tVar.mo79743a(C90051dc.f248877bf);
        this.f44638k = tVar;
        this.f44639l = bVar;
        this.f44634g = tVar2;
    }

    /* renamed from: k */
    private final void m31175k() {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx cxVar = this.f44640m;
        if (cxVar != null) {
            if (!cxVar.isDone()) {
                this.f44640m.cancel(true);
                this.f44639l.mo19974a(C37182a.f97968do.mo40805c(C62722b.CANCELLED));
                this.f44633f.post(new C14810ay(this));
            }
            this.f44640m = null;
        }
        this.f44636i = null;
        ((List) this.f44635h.get()).clear();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo21503c() {
    }

    /* renamed from: d */
    public final void mo21504d() {
        m31175k();
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: f */
    public final void mo21755f(C14309el elVar) {
        C37215b bVar = this.f44639l;
        C37252a c = C37182a.f97966dm.mo40779c();
        C62940bt btVar = C59711cz.f160208s;
        C59710cy cyVar = (C59710cy) C59711cz.f160207r.createBuilder();
        C48258bo boVar = (C48258bo) C48260bq.f124825o.createBuilder();
        boVar.copyOnWrite();
        C48260bq bqVar = (C48260bq) boVar.instance;
        bqVar.f124836j = elVar.getNumber();
        bqVar.f124827a |= 256;
        cyVar.copyOnWrite();
        C59711cz czVar = (C59711cz) cyVar.instance;
        C48260bq bqVar2 = (C48260bq) boVar.build();
        bqVar2.getClass();
        czVar.f160214e = bqVar2;
        czVar.f160210a |= 32;
        ((C37253b) c).mo40792p(btVar, (C59711cz) cyVar.build());
        bVar.mo19974a(c);
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* renamed from: h */
    public final C14221be mo21727h(C14219bc bcVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (C14218bb.m30579a(bcVar.f43038a) != C14218bb.MEDIA_TREE_BROWSE_REQUEST) {
            C59104x d = f44628a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.MedBTDataSrc");
            ((C59052c) ((C59052c) d).mo56372aa(45558)).mo56389s("MediaBrowseTreeDataSource can not handle this request (%s).", C14218bb.m30579a(bcVar.f43038a));
            return C14221be.f43041c;
        } else if (C14218bb.m30579a(bcVar.f43038a).ordinal() != 9) {
            return C14221be.f43041c;
        } else {
            ((List) this.f44635h.get()).size();
            C14337fm fmVar = (C14337fm) C14338fn.f43382b.createBuilder();
            Iterable iterable = (Iterable) this.f44635h.get();
            fmVar.copyOnWrite();
            C14338fn fnVar = (C14338fn) fmVar.instance;
            C62971cq cqVar = fnVar.f43384a;
            if (!cqVar.mo58948c()) {
                fnVar.f43384a = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll(iterable, (List) fnVar.f43384a);
            C14338fn fnVar2 = (C14338fn) fmVar.build();
            C14220bd bdVar = (C14220bd) C14221be.f43041c.createBuilder();
            bdVar.copyOnWrite();
            C14221be beVar = (C14221be) bdVar.instance;
            fnVar2.getClass();
            beVar.f43044b = fnVar2;
            beVar.f43043a = 4;
            C14221be beVar2 = (C14221be) bdVar.build();
            m31175k();
            return beVar2;
        }
    }

    /* renamed from: i */
    public final C60870cx mo21728i(C14219bc bcVar) {
        C14336fl flVar;
        C14336fl flVar2;
        C14336fl flVar3;
        C58976aa aaVar = C58975e.f156826a;
        C14218bb bbVar = C14218bb.MEDIA_UI_DATA_REQUEST;
        if (C14218bb.m30579a(bcVar.f43038a).ordinal() != 9) {
            return C60856cj.m92900i(C14782b.ERROR);
        }
        if (bcVar.f43038a == 23) {
            flVar = (C14336fl) bcVar.f43039b;
        } else {
            flVar = C14336fl.f43377d;
        }
        String str = flVar.f43379a;
        if (this.f44640m != null && !str.equals(this.f44636i)) {
            this.f44640m.cancel(true);
            this.f44639l.mo19974a(C37182a.f97968do.mo40805c(C62722b.CANCELLED));
            this.f44640m = null;
        }
        int i = bcVar.f43038a;
        if (i == 23) {
            flVar2 = (C14336fl) bcVar.f43039b;
        } else {
            flVar2 = C14336fl.f43377d;
        }
        String str2 = flVar2.f43380b;
        if (i == 23) {
            flVar3 = (C14336fl) bcVar.f43039b;
        } else {
            flVar3 = C14336fl.f43377d;
        }
        ComponentName componentName = new ComponentName(str2, flVar3.f43381c);
        if (this.f44640m == null) {
            C14816bd bdVar = new C14816bd(this, componentName);
            Class<Throwable> cls = Throwable.class;
            Class<Throwable> cls2 = Throwable.class;
            this.f44640m = C47633f.m84733g(C47633f.m84733g(C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(bdVar), new C14809ax(this))).mo51515h(C14817be.f44622a, C60826bg.f164896a).mo51513e(cls, C14818bf.f44623a, C60826bg.f164896a)).mo51516i(new C14808aw(this, str, componentName), new C14809ax(this)).mo51517j(this.f44641n, TimeUnit.MILLISECONDS, this.f44637j)).mo51515h(new C14811az(this), new C14809ax(this)).mo51513e(cls2, new C14813ba(this), new C14809ax(this));
            this.f44636i = str;
        }
        return this.f44640m;
    }

    /* renamed from: j */
    public final void mo21756j() {
        String str;
        C59104x b = f44628a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.MedBTDataSrc");
        ((C59052c) ((C59052c) b).mo56372aa(45566)).mo56389s("#maybeUnsubscribeAndClearMediaBrowser, unsubscribe node (%s)", this.f44631d);
        MediaBrowserCompat mediaBrowserCompat = this.f44629b;
        if (!(mediaBrowserCompat == null || !mediaBrowserCompat.mo805i() || (str = this.f44631d) == null)) {
            this.f44629b.mo804h(str);
            this.f44631d = null;
        }
        if (this.f44630c != null) {
            C58485gu c = this.f44638k.mo79745c(C90051dc.f248876be);
            ComponentName componentName = this.f44630c;
            componentName.getClass();
            if (c.contains(componentName.getPackageName())) {
                MediaBrowserCompat mediaBrowserCompat2 = this.f44629b;
                if (mediaBrowserCompat2 != null) {
                    mediaBrowserCompat2.mo801e();
                }
                C14828bp bpVar = this.f44632e;
                ComponentName componentName2 = this.f44630c;
                componentName2.getClass();
                if (bpVar.f44660f.containsKey(componentName2)) {
                    ((C14827bo) bpVar.f44660f.get(componentName2)).mo1010i();
                }
            }
        }
        this.f44630c = null;
        this.f44629b = null;
    }

    /* renamed from: t */
    public final void mo21729t(C14219bc bcVar, C14324f fVar, C14499lm lmVar) {
        C58976aa aaVar = C58975e.f156826a;
        C14218bb bbVar = C14218bb.MEDIA_UI_DATA_REQUEST;
        if (C14218bb.m30579a(bcVar.f43038a).ordinal() == 10) {
            m31175k();
        }
    }
}
