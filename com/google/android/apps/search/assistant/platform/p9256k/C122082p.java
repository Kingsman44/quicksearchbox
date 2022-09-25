package com.google.android.apps.search.assistant.platform.p9256k;

import com.google.android.apps.search.assistant.libraries.p8979j.C119414b;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9488c.C126438g;
import com.google.android.libraries.assistant.p1533o.C18473bi;
import com.google.common.p4526f.C59071e;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71552db;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71598y;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.k.p */
/* compiled from: PG */
public final class C122082p extends C18473bi {

    /* renamed from: a */
    public static final C59071e f338700a = C59071e.m91331h();

    /* renamed from: b */
    public final C126438g f338701b;

    /* renamed from: c */
    public final List f338702c;

    /* renamed from: d */
    private final C119414b f338703d;

    /* renamed from: e */
    private final C119414b f338704e;

    /* renamed from: f */
    private final C119414b f338705f;

    /* renamed from: g */
    private final C69585o f338706g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C122082p(C119414b bVar, C119414b bVar2, C119414b bVar3, C71422aw awVar, C69585o oVar, C126438g gVar) {
        super(oVar);
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(oVar, "lightweightContext");
        this.f338703d = bVar;
        this.f338704e = bVar2;
        this.f338705f = bVar3;
        this.f338706g = oVar;
        this.f338701b = gVar;
        this.f338702c = C69540x.m100947e(bVar, bVar2, bVar3);
    }

    /* renamed from: b */
    public final C71587n mo23998b(C71587n nVar) {
        C69664n.m101061g(nVar, "requests");
        return C71598y.m104524d(new C71552db(new C122081o(this, nVar, (C69577g) null)), this.f338706g);
    }
}
