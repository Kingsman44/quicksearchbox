package com.google.android.apps.search.podcasts.player.p10592a;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.android.apps.search.podcasts.p10550b.p10556f.C140097al;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10588n.C140673b;
import com.google.android.apps.search.podcasts.p10601r.C140968d;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.player.a.n */
/* compiled from: PG */
final class C140766n extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140770r f382239a;

    /* renamed from: b */
    final /* synthetic */ C97920j f382240b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140766n(C140770r rVar, C97920j jVar) {
        super(1);
        this.f382239a = rVar;
        this.f382240b = jVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        List list;
        C140673b bVar = (C140673b) obj;
        C69664n.m101061g(bVar, "episodeResult");
        C140641b bVar2 = bVar.f382069b;
        C97920j a = bVar2 != null ? C140968d.m228923a(bVar2) : null;
        C140097al alVar = this.f382239a.f382246a;
        if (a == null || C69664n.m101066l(this.f382240b, a)) {
            list = C69540x.m100944b(this.f382240b);
        } else {
            list = C69540x.m100947e(this.f382240b, a);
        }
        return alVar.mo115461d(list);
    }
}
