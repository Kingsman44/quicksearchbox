package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.p828a.p829a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p797c.p798a.C12396b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.C12692e;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a.a.ab */
/* compiled from: PG */
public final class C12630ab extends C68247h {

    /* renamed from: a */
    private final C68283d f39621a;

    /* renamed from: c */
    private final C68283d f39622c;

    /* renamed from: d */
    private final C68283d f39623d;

    /* renamed from: e */
    private final C68283d f39624e;

    public C12630ab(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C12630ab.class), aVar);
        this.f39621a = C68236af.m98549d(dVar);
        this.f39622c = C68236af.m98549d(dVar2);
        this.f39623d = C68236af.m98549d(dVar3);
        this.f39624e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68283d dVar = this.f39621a;
        C68283d dVar2 = this.f39622c;
        C12692e eVar = (C12692e) list.get(0);
        Long l = (Long) list.get(1);
        C60870cx gq = dVar.mo60297gq();
        if (gq != null) {
            C60870cx gq2 = dVar2.mo60297gq();
            if (gq2 != null) {
                C58833ax e = eVar.mo20724e();
                if (e != null) {
                    return C60856cj.m92900i(new C12396b(gq, gq2, e, C58833ax.m90834k(l)));
                }
                throw new NullPointerException("Null hotwordTrigger");
            }
            throw new NullPointerException("Null audioInputParams");
        }
        throw new NullPointerException("Null audioStreamChunkSource");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39623d.mo60297gq(), this.f39624e.mo60297gq());
    }
}
