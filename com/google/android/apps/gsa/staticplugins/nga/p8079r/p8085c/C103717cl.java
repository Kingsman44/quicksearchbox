package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80143bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6737i.C85494a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.android.libraries.mdi.download.C28804cs;
import com.google.android.libraries.mdi.download.C28805ct;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29663j;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p590as.p593b.p594a.p595a.C10781a;
import com.google.android.libraries.p590as.p593b.p594a.p595a.C10782b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.speech.p5218j.C67007hp;
import com.google.speech.p5218j.C67010hs;
import com.google.speech.p5218j.C67013hv;
import com.google.speech.p5218j.C67014hw;
import com.google.speech.p5218j.C67017hz;
import com.google.speech.p5218j.p5219a.C66710an;
import com.google.speech.p5218j.p5219a.C66711ao;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.cl */
/* compiled from: PG */
public final class C103717cl implements C103651a {

    /* renamed from: a */
    public static final Duration f288851a = Duration.ofSeconds(15);

    /* renamed from: b */
    public final C21370a f288852b;

    /* renamed from: c */
    private final C86054o f288853c;

    /* renamed from: d */
    private final C85494a f288854d;

    /* renamed from: e */
    private final C10782b f288855e;

    public C103717cl(C21370a aVar, C86054o oVar, C85494a aVar2, C10782b bVar) {
        this.f288852b = aVar;
        this.f288853c = oVar;
        this.f288854d = aVar2;
        this.f288855e = bVar;
    }

    /* renamed from: b */
    public static C80275dd m171685b(String str) {
        C67010hs hsVar = (C67010hs) C67017hz.f182174c.createBuilder();
        C67013hv hvVar = (C67013hv) C67014hw.f182165c.createBuilder();
        hvVar.copyOnWrite();
        C67014hw hwVar = (C67014hw) hvVar.instance;
        hwVar.f182167a |= 1;
        hwVar.f182168b = str;
        hsVar.copyOnWrite();
        C67017hz hzVar = (C67017hz) hsVar.instance;
        C67014hw hwVar2 = (C67014hw) hvVar.build();
        hwVar2.getClass();
        hzVar.f182177b = hwVar2;
        hzVar.f182176a = 1;
        return m171686c((C67017hz) hsVar.build());
    }

    /* renamed from: c */
    public static C80275dd m171686c(C67017hz hzVar) {
        C80143bu buVar = (C80143bu) C80275dd.f220288c.createBuilder();
        buVar.copyOnWrite();
        C80275dd ddVar = (C80275dd) buVar.instance;
        hzVar.getClass();
        ddVar.f220291b = hzVar;
        ddVar.f220290a = 16;
        return (C80275dd) buVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        C67007hp hpVar;
        if (bnVar.f219917a == 27) {
            hpVar = (C67007hp) bnVar.f219918b;
        } else {
            hpVar = C67007hp.f182153c;
        }
        int i = hpVar.f182155a;
        int i2 = (i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 4 : 3 : 2 : 1) - 1;
        if (i2 == 1) {
            Account a = this.f288853c.mo79668a();
            if (a == null) {
                return C60856cj.m92900i(m171685b("Failed to get account."));
            }
            return C60922j.m93044g(this.f288853c.mo79671e("oauth2:https://www.googleapis.com/auth/googlenow", a, new C91032p()), new C103714ci(this), C60826bg.f164896a);
        } else if (i2 == 2) {
            return C60922j.m93044g(this.f288854d.mo79016a(Query.f252741b.mo84245H(1, true, (QueryTriggerType) null).mo84264aA("SODA", new Bundle())), C103716ck.f288850a, C60826bg.f164896a);
        } else {
            if (i2 != 3) {
                return C60856cj.m92900i(m171685b("Unknown SODA request type"));
            }
            C10782b bVar = this.f288855e;
            C28804cs f = C28805ct.m53747f();
            ((C29663j) f).f80313a = "speech-contextual-models";
            return C60922j.m93044g(C60922j.m93044g(((C29409fd) bVar.f35795c.mo27525b()).mo34717f(f.mo34447a()), C47810es.m84963c(new C10781a(bVar, (C66710an) C66711ao.f181474d.createBuilder())), (Executor) bVar.f35794b.mo27525b()), C103715cj.f288849a, C60826bg.f164896a);
        }
    }
}
