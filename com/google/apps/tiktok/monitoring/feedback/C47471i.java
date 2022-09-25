package com.google.apps.tiktok.monitoring.feedback;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46674l;
import com.google.apps.tiktok.p3633d.p3634a.C46676n;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.monitoring.feedback.i */
/* compiled from: PG */
public final class C47471i {

    /* renamed from: a */
    private final Context f123274a;

    /* renamed from: b */
    private final C60888db f123275b;

    /* renamed from: c */
    private final C46674l f123276c;

    /* renamed from: d */
    private final C69464a f123277d;

    /* renamed from: e */
    private final C46128f f123278e;

    /* renamed from: f */
    private final C46175b f123279f;

    /* renamed from: com.google.apps.tiktok.monitoring.feedback.i$a */
    /* compiled from: PG */
    public interface C47472a {
        /* renamed from: jn */
        Map mo51331jn();
    }

    public C47471i(Context context, C60888db dbVar, C46674l lVar, C69464a aVar, C46128f fVar, C46175b bVar) {
        this.f123274a = context;
        this.f123275b = dbVar;
        this.f123276c = lVar;
        this.f123277d = aVar;
        this.f123278e = fVar;
        this.f123279f = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo51330a(C58833ax axVar, C47475l lVar, C47463aa aaVar) {
        Map map;
        C60870cx cxVar;
        C58833ax axVar2;
        C46674l lVar2 = this.f123276c;
        C46676n e = C46677o.m83168e();
        e.mo50705e(2000, TimeUnit.MILLISECONDS);
        e.mo50695c(true);
        e.mo50694b(C58485gu.m89847o(C46667e.TEXT, C46667e.KEY_VALUE));
        C46677o a = e.mo50693a();
        if (axVar.mo56113h()) {
            map = ((C47472a) C47245e.m84045a(this.f123274a, C47472a.class, (AccountId) axVar.mo56107c())).mo51331jn();
        } else {
            map = (Map) this.f123277d.mo17428b();
        }
        C60870cx a2 = lVar2.mo50704a(a, map, lVar.mo51313c());
        if (!axVar.mo56113h()) {
            cxVar = C60856cj.m92900i(C58836b.f156633a);
        } else {
            C60870cx c = this.f123279f.mo50246c((AccountId) axVar.mo56107c());
            C60870cx i = this.f123278e.mo50219i((AccountId) axVar.mo56107c());
            cxVar = C47638k.m84751b(c, i).mo51520a(new C47469g(c, i), this.f123275b);
        }
        if (!lVar.mo51315e()) {
            axVar2 = C58836b.f156633a;
        } else {
            Bitmap bitmap = (Bitmap) lVar.mo51311a().mo56111f();
            if (bitmap == null) {
                bitmap = aaVar.mo51300a();
            }
            axVar2 = C58833ax.m90833j(bitmap);
        }
        return C60856cj.m92895d(cxVar, a2).mo57334a(C47810es.m84978r(new C47470h(cxVar, a2, axVar2)), this.f123275b);
    }
}
