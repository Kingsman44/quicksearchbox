package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9182e;

import android.text.TextUtils;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.C121211d;
import com.google.android.apps.search.assistant.platform.p9171i.p9227d.p9228a.C121481e;
import com.google.android.apps.search.assistant.platform.p9171i.p9227d.p9229b.C121484b;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62963cj;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.e.f */
/* compiled from: PG */
public final class C121268f extends C68247h {

    /* renamed from: a */
    private final C68283d f336834a;

    /* renamed from: c */
    private final C68283d f336835c;

    /* renamed from: d */
    private final C68283d f336836d;

    public C121268f(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C121268f.class), aVar);
        this.f336834a = C68236af.m98549d(dVar);
        this.f336835c = C68236af.m98549d(dVar2);
        this.f336836d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C58485gu guVar;
        List list = (List) obj;
        C121481e eVar = (C121481e) list.get(0);
        Map map = (Map) list.get(1);
        C121211d dVar = (C121211d) list.get(2);
        C19167ba baVar = eVar.mo105172d().f53697e;
        if (baVar == null) {
            baVar = C19167ba.f53673s;
        }
        if (TextUtils.isEmpty(C121484b.m200740a(eVar.mo105172d().f53694b))) {
            guVar = C58485gu.m89842j(new C62963cj(baVar.f53676b, C19167ba.f53671c));
        } else {
            guVar = C58485gu.m89842j(new C62963cj(baVar.f53677d, C19167ba.f53672e));
        }
        C60870cx o = C60856cj.m92906o((C58485gu) Collection.EL.stream(guVar).flatMap(new C121265c(map)).collect(C58370cn.f155946a));
        C121266d dVar2 = C121266d.f336832a;
        return C60922j.m93044g(o, C47810es.m84963c(dVar2), C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f336834a.mo60297gq(), this.f336835c.mo60297gq(), this.f336836d.mo60297gq());
    }
}
