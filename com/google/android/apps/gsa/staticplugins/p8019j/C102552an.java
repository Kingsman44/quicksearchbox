package com.google.android.apps.gsa.staticplugins.p8019j;

import android.text.TextUtils;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90065dq;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a;
import com.google.android.apps.gsa.staticplugins.p8019j.C102560av;
import com.google.android.libraries.assistant.p1533o.C18443af;
import com.google.android.libraries.assistant.p1533o.C18493k;
import com.google.android.libraries.assistant.p1533o.C18494l;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.assistant.p3897e.p3917i.p3918a.C51421hb;
import com.google.assistant.p3897e.p3917i.p3918a.C51422hc;
import com.google.common.base.C58833ax;
import com.google.speech.p5208h.C66566aw;
import com.google.speech.p5208h.C66567ax;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.an */
/* compiled from: PG */
public final /* synthetic */ class C102552an implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C102560av f286227a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f286228b;

    /* renamed from: c */
    public final /* synthetic */ AccountId f286229c;

    /* renamed from: d */
    public final /* synthetic */ Query f286230d;

    public /* synthetic */ C102552an(C102560av avVar, C58833ax axVar, AccountId accountId, Query query) {
        this.f286227a = avVar;
        this.f286228b = axVar;
        this.f286229c = accountId;
        this.f286230d = query;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C102560av avVar = this.f286227a;
        C58833ax axVar = this.f286228b;
        AccountId accountId = this.f286229c;
        Query query = this.f286230d;
        C51421hb hbVar = (C51421hb) ((C51422hc) axVar.mo56109e(C51422hc.f133938f)).toBuilder();
        C66566aw awVar = (C66566aw) C66567ax.f181069f.createBuilder();
        C18443af eK = ((C102560av.C102561a) C47245e.m84045a(avVar.f286248d, C102560av.C102561a.class, accountId)).mo93338eK();
        long a = ((C86124t) avVar.f286246b.mo27525b()).mo79743a(C90065dq.f249656c);
        if (a >= 0) {
            eK = (C18443af) eK.mo62575n(a, TimeUnit.MILLISECONDS);
        }
        C18493k kVar = (C18493k) C18494l.f52434c.createBuilder();
        kVar.copyOnWrite();
        ((C18494l) kVar.instance).f52436a = true;
        String packageName = avVar.f286248d.getPackageName();
        String bf = query.mo84347bf("android.opa.extra.FOREGROUND_APP_TRIGGERED_ON");
        if (TextUtils.isEmpty(bf)) {
            bf = avVar.f286252h.mo56113h() ? ((C108100a) avVar.f286252h.mo56107c()).mo96439d() : BuildConfig.FLAVOR;
        }
        boolean equals = packageName.equals(bf);
        kVar.copyOnWrite();
        ((C18494l) kVar.instance).f52437b = equals;
        eK.mo23988b((C18494l) kVar.build(), new C102559au(awVar, cVar, axVar, hbVar));
        return "ASH GwsRequestParams filled.";
    }
}
