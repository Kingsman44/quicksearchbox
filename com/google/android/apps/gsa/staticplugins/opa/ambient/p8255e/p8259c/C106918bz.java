package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g.C107076p;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14626qe;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.assistant.p3886c.C50690ab;
import com.google.assistant.p3886c.C50706ar;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Objects;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.bz */
/* compiled from: PG */
public final class C106918bz implements C106879an {

    /* renamed from: a */
    public static final C58485gu f297826a = C58485gu.m89848p(C50690ab.MEDIA_SESSION, C50690ab.MBS, C50690ab.POTTER);

    /* renamed from: b */
    public final Context f297827b;

    /* renamed from: c */
    public final C39141kp f297828c;

    /* renamed from: d */
    public final C58974d f297829d;

    /* renamed from: e */
    public final C90021c f297830e;

    /* renamed from: f */
    public final C107076p f297831f;

    /* renamed from: g */
    private final C60888db f297832g;

    /* renamed from: h */
    private final C106878am f297833h;

    /* renamed from: i */
    private final C106869ad f297834i;

    /* renamed from: j */
    private final C106949dc f297835j;

    /* renamed from: k */
    private final C106966t f297836k;

    /* renamed from: l */
    private final C106962p f297837l;

    public C106918bz(Context context, C90021c cVar, C60888db dbVar, C107076p pVar, C106878am amVar, C106869ad adVar, C106949dc dcVar, C106966t tVar, C106962p pVar2, C39141kp kpVar, C83564a aVar) {
        this.f297827b = context;
        this.f297830e = cVar;
        this.f297832g = dbVar;
        this.f297831f = pVar;
        this.f297833h = amVar;
        this.f297834i = adVar;
        this.f297835j = dcVar;
        this.f297836k = tVar;
        this.f297837l = pVar2;
        this.f297828c = kpVar;
        this.f297829d = aVar.mo76900a("MediaPayloadProc");
    }

    /* renamed from: a */
    public final C60870cx mo95712a(C123746bm bmVar, C106596h hVar) {
        boolean z;
        C123746bm bmVar2 = bmVar;
        C106949dc dcVar = this.f297835j;
        C106950dd ddVar = new C106950dd((Context) dcVar.f297898a.mo17428b(), (C106964r) dcVar.f297900c.mo17428b(), (C83564a) dcVar.f297899b.mo17428b(), (C14626qe) Collection.EL.stream(bmVar2.f341820a).flatMap(C106943cx.f297891a).filter(C106944cy.f297892a).map(C106945cz.f297893a).filter(C106947da.f297896a).map(C106948db.f297897a).findFirst().orElse(C14626qe.STATUS_UNKNOWN));
        C106869ad adVar = this.f297834i;
        C106966t tVar = this.f297836k;
        Context context = (Context) tVar.f297948a.mo17428b();
        C90021c cVar = (C90021c) tVar.f297949b.mo17428b();
        C106964r rVar = (C106964r) tVar.f297951d.mo17428b();
        C83564a aVar = (C83564a) tVar.f297950c.mo17428b();
        try {
            ((Context) tVar.f297948a.mo17428b()).getPackageManager().getPackageInfo("com.google.android.apps.podcasts", 0);
            z = true;
        } catch (PackageManager.NameNotFoundException unused) {
            z = false;
        }
        C58495hd r = C58495hd.m89904r("com.google.android.apps.youtube.music", ddVar, "com.pandora.android", adVar, "com.spotify.music", adVar, "com.google.android.googlequicksearchbox", new C106967u(context, cVar, rVar, aVar, z), "deezer.android.app", this.f297837l);
        boolean e = this.f297830e.mo79746e(C90017bw.f248023cw);
        if (Collection.EL.stream(bmVar2.f341820a).flatMap(C106908bp.f297813a).mapToLong(C106909bq.f297814a).sum() == 0) {
            if (e) {
                ((C58970a) ((C58970a) this.f297829d.mo56224b()).mo56372aa(23392)).mo56386p("#getValidMediaItemWrappers: No Potter items.");
            }
            e = false;
        }
        C58480gp e2 = C58485gu.m89837e();
        HashSet hashSet = new HashSet();
        for (C106868ac acVar : (C58485gu) Collection.EL.stream(bmVar2.f341820a).filter(new C106886au(e)).flatMap(new C106887av(this, r)).filter(C106888aw.f297786a).map(C106889ax.f297787a).collect(C58370cn.f155946a)) {
            if (acVar.mo95701a().mo56113h()) {
                String str = (String) acVar.mo95701a().mo56107c();
                if (hashSet.add(str)) {
                    e2.mo55395g(acVar);
                } else {
                    ((C58970a) ((C58970a) this.f297829d.mo56224b()).mo56372aa(23382)).mo56389s("Deduping %s", str);
                }
            }
        }
        C58485gu f = e2.mo55394f();
        C58485gu guVar = (C58485gu) Collection.EL.stream(f).filter(new C106896bd((C58528ij) Collection.EL.stream(((Map) Collection.EL.stream(f).collect(Collectors.groupingBy(C106882aq.f297779a, Collectors.counting()))).entrySet()).peek(new C106893ba(this)).filter(new C106894bb(this)).map(C106895bc.f297795a).collect(C58370cn.f155947b))).collect(C58370cn.f155946a);
        if (!guVar.isEmpty()) {
            ((C58970a) ((C58970a) this.f297829d.mo56224b()).mo56372aa(23383)).mo56386p("#rankMediaApps: Initial ranking");
            C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).filter(C106881ap.f297778a).map(C106882aq.f297779a).distinct().peek(new C106883ar(this)).collect(C58370cn.f155946a);
            if (!this.f297830e.mo79746e(C90017bw.f247991c)) {
                C58528ij ijVar = (C58528ij) Collection.EL.stream(guVar).filter(C106884as.f297781a).map(C106882aq.f297779a).collect(C58370cn.f155947b);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int size = guVar2.size();
                for (int i = 0; i < size; i++) {
                    String str2 = (String) guVar2.get(i);
                    if (ijVar.contains(str2)) {
                        arrayList.add(str2);
                    } else {
                        arrayList2.add(str2);
                    }
                }
                ((C58970a) ((C58970a) this.f297829d.mo56224b()).mo56372aa(23384)).mo56386p("#rankMediaApps: Ranked with resumable media");
                guVar2 = (C58485gu) Stream.CC.concat(Collection.EL.stream(arrayList), Collection.EL.stream(arrayList2)).peek(new C106885at(this)).collect(C58370cn.f155946a);
            }
            if (!guVar2.isEmpty()) {
                C58485gu<C106868ac> guVar3 = (C58485gu) Collection.EL.stream(guVar).filter(new C106912bt((String) guVar2.get(0))).collect(C58370cn.f155946a);
                for (C106868ac acVar2 : guVar3) {
                    if (acVar2.mo95702c().equals(C50690ab.UNSPECIFIED)) {
                        C58970a aVar2 = (C58970a) ((C58970a) this.f297829d.mo56226d()).mo56372aa(23385);
                        String j = acVar2.mo95709j();
                        C52568wo woVar = acVar2.mo95703d().f137950f;
                        if (woVar == null) {
                            woVar = C52568wo.f137992v;
                        }
                        aVar2.mo56354G("Unspecified source found in media items: { app:%s, title: %s }", j, woVar.f137998e);
                    }
                }
                C58485gu guVar4 = (C58485gu) Collection.EL.stream(C58485gu.m89836F(Comparator.CC.comparing(C106916bx.f297824a, C106917by.f297825a), guVar3)).limit(this.f297830e.mo79743a(C90017bw.f247981bq) + 6).collect(C58370cn.f155946a);
                ((C58970a) ((C58970a) this.f297829d.mo56224b()).mo56372aa(23386)).mo56387q("#process: Loading %d images.", guVar4.size());
                C58495hd hdVar = (C58495hd) Collection.EL.stream(guVar4).map(C106899bg.f297801a).filter(C106900bh.f297802a).map(C106901bi.f297803a).distinct().collect(C58370cn.m89403c(C106903bk.f297806a, new C106904bl(this), C106905bm.f297808a));
                C47633f h = C47636i.m84745d(hdVar.values()).mo51519b(new C106906bn(this, hdVar), this.f297832g).mo51515h(new C106907bo(this, guVar4), this.f297832g);
                C106878am amVar = this.f297833h;
                Objects.requireNonNull(amVar);
                return h.mo51515h(new C106913bu(amVar), this.f297832g).mo51515h(C106914bv.f297821a, this.f297832g).mo51515h(new C106915bw(this, hVar), this.f297832g);
            }
            throw new AssertionError("Should always be a valid app.");
        }
        ((C58970a) ((C58970a) this.f297829d.mo56224b()).mo56372aa(23387)).mo56386p("#process: No apps has enough recommendations. Returning empty.");
        return C47633f.m84733g(C60856cj.m92900i(C50706ar.f131960a));
    }

    /* renamed from: b */
    public final C58833ax mo95714b(C52560wg wgVar, C50690ab abVar, C58495hd hdVar) {
        C51058ev evVar;
        C51098gh ghVar = wgVar.f137949e;
        if (ghVar == null) {
            ghVar = C51098gh.f133009e;
        }
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        String str = evVar.f132944b;
        C106869ad adVar = (C106869ad) hdVar.get(str);
        if (adVar != null) {
            return adVar.mo95711a(wgVar, abVar);
        }
        ((C58970a) ((C58970a) this.f297829d.mo56225c()).mo56372aa(23381)).mo56389s("#createMediaItemWrapperIfValid: Unsupported app: %s, using default wrapper", str);
        return this.f297834i.mo95711a(wgVar, abVar);
    }
}
