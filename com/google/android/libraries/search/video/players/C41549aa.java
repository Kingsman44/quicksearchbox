package com.google.android.libraries.search.video.players;

import android.support.p031v4.app.Fragment;
import android.view.ViewGroup;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139336r;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139341w;
import com.google.android.apps.search.googleapp.stampviewer.preview.C139445ab;
import com.google.android.apps.search.googleapp.stampviewer.preview.C139446ac;
import com.google.android.libraries.search.video.p3191a.C41452k;
import com.google.android.libraries.search.video.p3193c.C41471a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57128al;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57143b;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57174e;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57175f;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57193x;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57194y;
import dagger.p5294a.C68221g;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.video.players.aa */
/* compiled from: PG */
public final class C41549aa implements C41593x, C41548a {

    /* renamed from: b */
    private static final C59071e f108619b = C59071e.m91332i("com.google.android.libraries.search.video.players.aa");

    /* renamed from: a */
    public final C41471a f108620a;

    /* renamed from: c */
    private final C41552ad f108621c;

    /* renamed from: d */
    private final C41582m f108622d;

    /* renamed from: e */
    private final C41579j f108623e;

    /* renamed from: f */
    private final C58833ax f108624f;

    /* renamed from: g */
    private final PlayerWrapperImpl f108625g;

    public C41549aa(C41579j jVar, C41582m mVar, C41552ad adVar, PlayerWrapperImpl playerWrapperImpl, C58833ax axVar, C41471a aVar) {
        this.f108623e = jVar;
        this.f108622d = mVar;
        this.f108621c = adVar;
        this.f108625g = playerWrapperImpl;
        this.f108620a = aVar;
        this.f108624f = axVar;
    }

    /* renamed from: a */
    public final C41592w mo44075a(ViewGroup viewGroup, C57128al alVar, C57143b bVar) {
        C57174e eVar;
        C57174e eVar2;
        Optional optional;
        C57174e eVar3;
        ViewGroup viewGroup2 = viewGroup;
        C57128al alVar2 = alVar;
        int i = alVar2.f152497a;
        C139445ab abVar = null;
        if (i == 2) {
            C57175f fVar = (C57175f) alVar2.f152498b;
            C57194y yVar = fVar.f152642c;
            if (yVar == null) {
                yVar = C57194y.f152692i;
            }
            C57194y yVar2 = yVar;
            if (yVar2.f152695b == 1) {
                abVar = this.f108621c.mo44099a((C57193x) yVar2.f152696c, true, Duration.ofMillis(yVar2.f152698e), bVar, viewGroup);
            }
            if (yVar2.f152695b == 2) {
                C41582m mVar = this.f108622d;
                C41587r rVar = (C41587r) mVar.f108701a.mo17428b();
                rVar.getClass();
                viewGroup.getClass();
                fVar.getClass();
                C41452k kVar = (C41452k) mVar.f108702b.mo17428b();
                kVar.getClass();
                C57194y yVar3 = fVar.f152642c;
                if (yVar3 == null) {
                    yVar3 = C57194y.f152692i;
                }
                C57194y yVar4 = yVar3;
                Duration duration = Duration.ZERO;
                if (fVar.f152640a == 2) {
                    eVar = (C57174e) fVar.f152641b;
                } else {
                    eVar = C57174e.f152633d;
                }
                String str = eVar.f152637c;
                int i2 = fVar.f152640a;
                if (i2 == 2) {
                    eVar2 = (C57174e) fVar.f152641b;
                } else {
                    eVar2 = C57174e.f152633d;
                }
                if ((eVar2.f152635a & 1) != 0) {
                    if (i2 == 2) {
                        eVar3 = (C57174e) fVar.f152641b;
                    } else {
                        eVar3 = C57174e.f152633d;
                    }
                    optional = Optional.m71637of(Duration.ofMillis(eVar3.f152636b));
                } else {
                    optional = Optional.empty();
                }
                abVar = new C41581l(rVar, viewGroup, yVar4, duration, kVar, true, str, optional);
            }
            if (yVar2.f152695b == 3) {
                abVar = this.f108623e.mo44132a(viewGroup2, yVar2);
            }
            if (yVar2.f152695b == 11) {
                if (this.f108624f.mo56113h()) {
                    C139446ac acVar = (C139446ac) this.f108624f.mo56107c();
                    Fragment fragment = (Fragment) ((C68221g) acVar.f379185a).f184583a;
                    fragment.getClass();
                    AccountId accountId = (AccountId) acVar.f379186b.mo17428b();
                    accountId.getClass();
                    C47215a aVar = (C47215a) acVar.f379187c.mo17428b();
                    aVar.getClass();
                    C139341w wVar = (C139341w) acVar.f379188d.mo17428b();
                    wVar.getClass();
                    Boolean bool = (Boolean) acVar.f379189e.mo17428b();
                    bool.getClass();
                    boolean booleanValue = bool.booleanValue();
                    C139336r rVar2 = (C139336r) acVar.f379190f.mo17428b();
                    rVar2.getClass();
                    viewGroup.getClass();
                    yVar2.getClass();
                    abVar = new C139445ab(fragment, accountId, aVar, wVar, booleanValue, rVar2, viewGroup, yVar2);
                } else {
                    ((C59052c) ((C59052c) f108619b.mo56226d()).mo56372aa(53905)).mo56386p("StampWebPlayerFactoryImpl not provided.");
                }
            }
            return this.f108625g.mo44064a(abVar, new C41595z(this, fVar));
        } else if (i == 1) {
            return mo44076b(viewGroup2, (C57194y) alVar2.f152498b, bVar);
        } else {
            return null;
        }
    }

    /* renamed from: c */
    public final C41592w mo44077c(ViewGroup viewGroup, C57128al alVar) {
        return mo44075a(viewGroup, alVar, (C57143b) null);
    }

    /* renamed from: d */
    public final C41592w mo44078d(ViewGroup viewGroup, C57194y yVar) {
        return mo44076b(viewGroup, yVar, (C57143b) null);
    }

    /* renamed from: b */
    public final C41592w mo44076b(ViewGroup viewGroup, C57194y yVar, C57143b bVar) {
        C41592w wVar;
        int i = yVar.f152695b;
        if (i == 1) {
            wVar = this.f108621c.mo44099a((C57193x) yVar.f152696c, false, Duration.ofMillis(yVar.f152698e), bVar, viewGroup);
        } else if (i == 2) {
            C41582m mVar = this.f108622d;
            Duration ofMillis = Duration.ofMillis(yVar.f152698e);
            C41587r rVar = (C41587r) mVar.f108703c.mo17428b();
            rVar.getClass();
            viewGroup.getClass();
            yVar.getClass();
            ofMillis.getClass();
            C41452k kVar = (C41452k) mVar.f108702b.mo17428b();
            kVar.getClass();
            wVar = new C41581l(rVar, viewGroup, yVar, ofMillis, kVar, false, BuildConfig.FLAVOR, Optional.empty());
        } else {
            wVar = i == 3 ? this.f108623e.mo44132a(viewGroup, yVar) : null;
        }
        return this.f108625g.mo44064a(wVar, new C41594y(this, yVar));
    }
}
