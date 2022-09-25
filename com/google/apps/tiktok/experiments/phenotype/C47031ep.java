package com.google.apps.tiktok.experiments.phenotype;

import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45977ao;
import com.google.apps.tiktok.account.api.controller.C46009bt;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63088z;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.ep */
/* compiled from: PG */
final class C47031ep implements C60930r {

    /* renamed from: a */
    final /* synthetic */ C47023ei f122598a;

    /* renamed from: b */
    final /* synthetic */ String f122599b;

    /* renamed from: c */
    final /* synthetic */ AccountId f122600c;

    /* renamed from: d */
    final /* synthetic */ String f122601d;

    /* renamed from: e */
    final /* synthetic */ C63088z f122602e;

    public C47031ep(C47023ei eiVar, String str, AccountId accountId, String str2, C63088z zVar) {
        this.f122598a = eiVar;
        this.f122599b = str;
        this.f122600c = accountId;
        this.f122601d = str2;
        this.f122602e = zVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        Object b = this.f122598a.f122571b.mo17428b();
        C69664n.m101060f(b, "selector.get()");
        C58833ax axVar = (C58833ax) b;
        if (axVar.mo56113h()) {
            C60870cx a = ((C45977ao) axVar.mo56107c()).mo37983a(new C46009bt(new Intent()));
            C60931s f = C47810es.m84966f(new C47032eq(new C47030eo(this.f122598a, this.f122599b, this.f122600c, this.f122601d, this.f122602e)));
            return C60922j.m93045h(a, C47810es.m84966f(f), C60826bg.f164896a);
        }
        C47023ei eiVar = this.f122598a;
        return eiVar.mo50979b(eiVar.f122575f, this.f122599b, this.f122600c, this.f122601d, this.f122602e);
    }
}
