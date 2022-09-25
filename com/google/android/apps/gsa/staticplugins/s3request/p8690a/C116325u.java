package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66615cm;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.u */
/* compiled from: PG */
public final class C116325u extends C68247h {

    /* renamed from: a */
    private final C68283d f322494a;

    /* renamed from: c */
    private final C68283d f322495c;

    public C116325u(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C116325u.class), aVar);
        this.f322494a = C68236af.m98549d(dVar);
        this.f322495c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.S3_HEADER_REQUEST_USER_INFO_COMPLETE;
        ((C89859i) list.get(1)).mo74236a(fVar.mo83699a());
        return C60856cj.m92900i(new C118928k(C58833ax.m90834k((C66615cm) list.get(0)), C66615cm.f181221k));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f322494a.mo60297gq(), this.f322495c.mo60297gq());
    }
}
