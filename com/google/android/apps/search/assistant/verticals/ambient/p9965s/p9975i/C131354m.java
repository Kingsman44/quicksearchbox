package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9975i;

import android.accounts.Account;
import com.google.android.gms.pay.C145620r;
import com.google.android.gms.pay.GetPassesRequest;
import com.google.android.gms.pay.PassType;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4543n.p4546c.C59401i;
import com.google.common.p4543n.p4546c.C59405m;
import com.google.common.p4543n.p4546c.C59407o;
import com.google.common.p4543n.p4546c.C59417y;
import java.util.Collection;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.i.m */
/* compiled from: PG */
public final /* synthetic */ class C131354m implements Function {

    /* renamed from: a */
    public final /* synthetic */ C131358q f359082a;

    /* renamed from: b */
    public final /* synthetic */ Optional f359083b;

    /* renamed from: c */
    public final /* synthetic */ Collection f359084c;

    public /* synthetic */ C131354m(C131358q qVar, Optional optional, Collection collection) {
        this.f359082a = qVar;
        this.f359083b = optional;
        this.f359084c = collection;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C131358q qVar = this.f359082a;
        Optional optional = this.f359083b;
        Collection collection = this.f359084c;
        C145620r rVar = new C145620r();
        PassType passType = new PassType();
        passType.f393670a = 5;
        rVar.f393784a.f393650a = new PassType[]{passType};
        optional.ifPresent(new C131349h(rVar));
        GetPassesRequest getPassesRequest = new GetPassesRequest();
        getPassesRequest.f393629a = (Account) obj;
        getPassesRequest.f393630b = 0;
        getPassesRequest.f393631c = 0;
        getPassesRequest.f393632d = rVar.f393784a;
        return C47633f.m84733g(C59417y.m92319e(new C131350i(qVar, getPassesRequest), new C59405m(new C59401i(C59407o.m92308d(Duration.ofMillis(500)), 2.0d, 5), 0.5d), C131351j.f359078a, qVar.f359092c)).mo51513e(Exception.class, new C131352k(qVar), qVar.f359092c).mo51515h(new C131353l(qVar, collection), qVar.f359092c);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
