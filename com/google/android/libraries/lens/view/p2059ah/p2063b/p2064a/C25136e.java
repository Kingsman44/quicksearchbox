package com.google.android.libraries.lens.view.p2059ah.p2063b.p2064a;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24450e;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24454i;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24459n;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24460o;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24461p;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24464s;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24466u;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24467v;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24470y;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24471z;
import com.google.android.libraries.lens.view.filters.translation.C26217r;
import com.google.android.libraries.lens.view.filters.translation.p2106a.C26034j;
import com.google.android.libraries.lens.view.p2059ah.p2063b.C25131a;
import com.google.android.libraries.lens.view.p2059ah.p2063b.C25138b;
import com.google.android.libraries.lens.view.p2069am.C25327c;
import com.google.android.libraries.lens.view.p2159q.C27590ak;
import com.google.android.libraries.lens.view.p2159q.C27600au;
import com.google.android.libraries.lens.view.p2159q.C27603ax;
import com.google.android.libraries.lens.view.p2159q.C27608bb;
import com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl.OfflineDownloadManagerImpl;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.lens.view.ah.b.a.e */
/* compiled from: PG */
public final class C25136e implements C25138b {

    /* renamed from: a */
    public static final C59071e f68442a = C59071e.m91332i("com.google.android.libraries.lens.view.ah.b.a.e");

    /* renamed from: b */
    public final C26034j f68443b;

    /* renamed from: c */
    final C24450e f68444c = new C25135d(this);

    /* renamed from: d */
    public WeakReference f68445d;

    /* renamed from: e */
    private final C27608bb f68446e;

    /* renamed from: f */
    private final Executor f68447f;

    /* renamed from: g */
    private final C60888db f68448g;

    /* renamed from: h */
    private final C26217r f68449h;

    /* renamed from: i */
    private final Context f68450i;

    public C25136e(C27608bb bbVar, C60888db dbVar, Executor executor, C26217r rVar, Context context, C26034j jVar) {
        this.f68446e = bbVar;
        this.f68447f = executor;
        this.f68443b = jVar;
        this.f68448g = dbVar;
        this.f68449h = rVar;
        this.f68450i = context;
    }

    /* renamed from: a */
    public final C60870cx mo30277a() {
        ArrayList arrayList = new ArrayList();
        Map.EL.forEach(this.f68443b.mo31240b(), new C25133b(arrayList));
        C60870cx a = this.f68446e.mo29905a(arrayList);
        C25132a aVar = new C25132a(this);
        return C60922j.m93044g(a, C47810es.m84963c(aVar), this.f68448g);
    }

    /* renamed from: b */
    public final void mo30278b(String str, C25131a aVar) {
        char c;
        C59104x b = f68442a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MddWrapperTranslateModelsManager");
        ((C59052c) ((C59052c) b).mo56372aa(49825)).mo56389s("Cancel translate model download for %s", str);
        C24460o oVar = (C24460o) C24461p.f66956c.createBuilder();
        C24464s sVar = (C24464s) C24465t.f66964f.createBuilder();
        String str2 = (String) this.f68443b.mo31240b().getOrDefault(str, BuildConfig.FLAVOR);
        sVar.copyOnWrite();
        C24465t tVar = (C24465t) sVar.instance;
        str2.getClass();
        tVar.f66966a |= 1;
        tVar.f66967b = str2;
        sVar.copyOnWrite();
        C24465t tVar2 = (C24465t) sVar.instance;
        str.getClass();
        tVar2.f66966a |= 4;
        tVar2.f66969d = str;
        C24465t tVar3 = (C24465t) sVar.build();
        oVar.copyOnWrite();
        C24461p pVar = (C24461p) oVar.instance;
        tVar3.getClass();
        pVar.f66959b = tVar3;
        pVar.f66958a |= 1;
        java.util.Map map = this.f68446e.f75439o;
        C24465t tVar4 = ((C24461p) oVar.build()).f66959b;
        if (tVar4 == null) {
            tVar4 = C24465t.f66964f;
        }
        Future future = (Future) map.get(tVar4.f66967b);
        if (future == null) {
            c = 2;
        } else if (future.isCancelled()) {
            c = 3;
        } else {
            c = true != future.cancel(false) ? (char) 5 : 4;
        }
        if (c == 2) {
            aVar.mo30275g(str, 5, "Download event not found.");
        } else if (c == 3 || c == 4) {
            OfflineDownloadManagerImpl offlineDownloadManagerImpl = (OfflineDownloadManagerImpl) aVar;
            offlineDownloadManagerImpl.f76166m.mo30247b(2, str, 2, offlineDownloadManagerImpl.mo33452y(Locale.forLanguageTag(str)), false);
            offlineDownloadManagerImpl.mo33449v(Locale.forLanguageTag(str), C25327c.DOWNLOADABLE);
        } else {
            aVar.mo30275g(str, 4, "Cancellation did not complete.");
        }
    }

    /* renamed from: c */
    public final void mo30279c(String str, C25131a aVar) {
        C59104x b = f68442a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MddWrapperTranslateModelsManager");
        ((C59052c) ((C59052c) b).mo56372aa(49826)).mo56389s("Translate model deletion requested for %s", str);
        C24466u uVar = (C24466u) C24467v.f66971c.createBuilder();
        C24464s sVar = (C24464s) C24465t.f66964f.createBuilder();
        String str2 = (String) this.f68443b.mo31240b().getOrDefault(str, BuildConfig.FLAVOR);
        sVar.copyOnWrite();
        C24465t tVar = (C24465t) sVar.instance;
        str2.getClass();
        tVar.f66966a |= 1;
        tVar.f66967b = str2;
        sVar.copyOnWrite();
        C24465t tVar2 = (C24465t) sVar.instance;
        str.getClass();
        tVar2.f66966a |= 4;
        tVar2.f66969d = str;
        C24465t tVar3 = (C24465t) sVar.build();
        uVar.copyOnWrite();
        C24467v vVar = (C24467v) uVar.instance;
        tVar3.getClass();
        vVar.f66974b = tVar3;
        vVar.f66973a |= 1;
        C27608bb bbVar = this.f68446e;
        C58485gu n = C58485gu.m89846n((C24467v) uVar.build());
        ArrayList arrayList = new ArrayList();
        C58801sm G = n.listIterator(0);
        while (G.hasNext()) {
            C24465t tVar4 = ((C24467v) G.next()).f66974b;
            if (tVar4 == null) {
                tVar4 = C24465t.f66964f;
            }
            if (bbVar.f75438n.mo31240b().values().contains(tVar4.f66967b)) {
                arrayList.add(bbVar.f75436l.mo46039a(new C27603ax((String) bbVar.f75438n.mo31240b().mo55367b().getOrDefault(tVar4.f66967b, BuildConfig.FLAVOR)), bbVar.f75433i));
            } else {
                arrayList.add(bbVar.f75437m.mo46039a(new C27590ak(tVar4.f66970e, tVar4.f66967b), bbVar.f75433i));
            }
        }
        C60856cj.m92911t(C60922j.m93045h(C60856cj.m92896e(arrayList), C47810es.m84966f(new C27600au(bbVar, n)), bbVar.f75433i), C47810es.m84974n(new C25134c(aVar, str)), this.f68447f);
    }

    /* renamed from: d */
    public final void mo30280d(String str, C25131a aVar, boolean z) {
        this.f68445d = new WeakReference(aVar);
        String string = this.f68450i.getResources().getString(R.string.lens_download_notification, new Object[]{this.f68449h.mo31434d(Locale.forLanguageTag(str))});
        C24454i iVar = (C24454i) C24459n.f66948g.createBuilder();
        iVar.copyOnWrite();
        C24459n nVar = (C24459n) iVar.instance;
        nVar.f66950a |= 1;
        nVar.f66951b = z;
        if (z) {
            iVar.copyOnWrite();
            C24459n nVar2 = (C24459n) iVar.instance;
            string.getClass();
            nVar2.f66950a |= 8;
            nVar2.f66954e = string;
            iVar.copyOnWrite();
            C24459n nVar3 = (C24459n) iVar.instance;
            nVar3.f66950a |= 16;
            nVar3.f66955f = " ";
        }
        C24470y yVar = (C24470y) C24471z.f66980d.createBuilder();
        C24459n nVar4 = (C24459n) iVar.build();
        yVar.copyOnWrite();
        C24471z zVar = (C24471z) yVar.instance;
        nVar4.getClass();
        zVar.f66984c = nVar4;
        zVar.f66982a |= 2;
        C24464s sVar = (C24464s) C24465t.f66964f.createBuilder();
        String str2 = (String) this.f68443b.mo31240b().getOrDefault(str, BuildConfig.FLAVOR);
        sVar.copyOnWrite();
        C24465t tVar = (C24465t) sVar.instance;
        str2.getClass();
        tVar.f66966a |= 1;
        tVar.f66967b = str2;
        sVar.copyOnWrite();
        C24465t tVar2 = (C24465t) sVar.instance;
        str.getClass();
        tVar2.f66966a |= 4;
        tVar2.f66969d = str;
        C24465t tVar3 = (C24465t) sVar.build();
        yVar.copyOnWrite();
        C24471z zVar2 = (C24471z) yVar.instance;
        tVar3.getClass();
        zVar2.f66983b = tVar3;
        zVar2.f66982a |= 1;
        this.f68446e.mo33131g(C58485gu.m89846n((C24471z) yVar.build()), this.f68444c);
    }
}
