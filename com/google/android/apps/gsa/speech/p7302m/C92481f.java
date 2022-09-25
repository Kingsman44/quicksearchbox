package com.google.android.apps.gsa.speech.p7302m;

import android.accounts.Account;
import android.os.Build;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p6487s3.producers.C84310i;
import com.google.android.apps.gsa.p6487s3.producers.MutatableS3HeaderProducer;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92439c;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92443g;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92444a;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92452i;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import com.google.speech.p5208h.C66549af;
import com.google.speech.p5208h.C66550ag;
import com.google.speech.p5208h.C66595bu;
import com.google.speech.p5208h.C66598bx;
import com.google.speech.p5208h.C66599by;

/* renamed from: com.google.android.apps.gsa.speech.m.f */
/* compiled from: PG */
final class C92481f implements C92439c {

    /* renamed from: a */
    private final C90931ca f258068a;

    /* renamed from: b */
    private final C92302a f258069b;

    /* renamed from: c */
    private final C89994f f258070c;

    /* renamed from: d */
    private final C86124t f258071d;

    /* renamed from: e */
    private final String f258072e;

    /* renamed from: f */
    private final String f258073f;

    /* renamed from: g */
    private final C84310i f258074g;

    /* renamed from: h */
    private final boolean f258075h;

    /* renamed from: i */
    private final Account f258076i;

    /* renamed from: j */
    private final C66595bu f258077j;

    public C92481f(C90931ca caVar, C92302a aVar, C89994f fVar, C86124t tVar, C92480e eVar, C92485j jVar, C84310i iVar, Account account, C66595bu buVar) {
        this.f258068a = caVar;
        this.f258069b = aVar;
        this.f258070c = fVar;
        this.f258071d = tVar;
        this.f258074g = iVar;
        this.f258076i = account;
        this.f258077j = buVar;
        int ordinal = jVar.ordinal();
        String str = BuildConfig.FLAVOR;
        boolean z = true;
        this.f258072e = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? str : "audio-logging" : "enrollment-fetcher" : "arbiter";
        int ordinal2 = jVar.ordinal();
        if (ordinal2 == 0) {
            str = eVar.f258064c;
        } else if (ordinal2 == 1) {
            str = eVar.f258063b;
        } else if (ordinal2 == 2) {
            str = eVar.f258065d;
        }
        this.f258073f = str;
        this.f258075h = jVar != C92485j.ENROLLMENT_UTTERANCE_SENDER_REQUEST ? false : z;
    }

    /* renamed from: a */
    public final C57981b mo87118a() {
        C90931ca caVar = this.f258068a;
        C66598bx bxVar = (C66598bx) C66599by.f181159p.createBuilder();
        bxVar.copyOnWrite();
        C66599by byVar = (C66599by) bxVar.instance;
        byVar.f181162a |= 1;
        byVar.f181163b = BuildConfig.FLAVOR;
        bxVar.copyOnWrite();
        C66599by byVar2 = (C66599by) bxVar.instance;
        byVar2.f181162a |= 4;
        byVar2.f181167f = "Android";
        String str = Build.DISPLAY;
        bxVar.copyOnWrite();
        C66599by byVar3 = (C66599by) bxVar.instance;
        str.getClass();
        byVar3.f181162a |= 8;
        byVar3.f181168g = str;
        String str2 = this.f258073f;
        bxVar.copyOnWrite();
        C66599by byVar4 = (C66599by) bxVar.instance;
        str2.getClass();
        byVar4.f181162a |= 16;
        byVar4.f181169h = str2;
        String str3 = Build.MODEL;
        bxVar.copyOnWrite();
        C66599by byVar5 = (C66599by) bxVar.instance;
        str3.getClass();
        byVar5.f181162a |= 64;
        byVar5.f181171j = str3;
        C60870cx i = C60856cj.m92900i((C66599by) bxVar.build());
        C92444a aVar = new C92444a();
        aVar.f257829j = C58833ax.m90833j(this.f258076i);
        aVar.f257830k = C58833ax.m90833j(this.f258077j);
        aVar.f257820a = this.f258069b;
        aVar.f257821b = this.f258070c;
        C60870cx c = this.f258068a.mo85138c(new C92452i(aVar.mo87125a()));
        C66549af afVar = (C66549af) C66550ag.f180992c.createBuilder();
        boolean z = this.f258075h;
        afVar.copyOnWrite();
        C66550ag agVar = (C66550ag) afVar.instance;
        agVar.f180995a = 1 | agVar.f180995a;
        agVar.f180996b = z;
        return new C92443g(caVar, new MutatableS3HeaderProducer(i, c, (C66550ag) afVar.build(), C90719ac.f253778a.f253779b.nextLong(), this.f258072e, this.f258074g, this.f258071d));
    }

    /* renamed from: b */
    public final void mo87119b() {
    }

    /* renamed from: c */
    public final void mo87120c() {
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo87121d() {
        return false;
    }
}
