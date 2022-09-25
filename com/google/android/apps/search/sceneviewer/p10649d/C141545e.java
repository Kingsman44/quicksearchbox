package com.google.android.apps.search.sceneviewer.p10649d;

import android.app.Activity;
import android.content.Context;
import com.google.android.libraries.surveys.C43171l;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import p3186j$.util.Collection;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.sceneviewer.d.e */
/* compiled from: PG */
public final class C141545e implements C141541a {

    /* renamed from: a */
    public static final C59071e f384186a = C59071e.m91332i("com.google.android.apps.search.sceneviewer.d.e");

    /* renamed from: b */
    public final String f384187b;

    /* renamed from: c */
    public final String f384188c;

    /* renamed from: d */
    public final boolean f384189d;

    /* renamed from: e */
    private final Executor f384190e;

    /* renamed from: f */
    private final C60870cx f384191f;

    /* renamed from: g */
    private final boolean f384192g;

    public C141545e(Context context, AccountId accountId, C69464a aVar, C46128f fVar, Executor executor, String str, String str2, boolean z, boolean z2) {
        C43171l.m76145c(context, (CronetEngine) aVar.mo17428b());
        this.f384187b = str;
        this.f384188c = str2;
        this.f384189d = z;
        this.f384192g = z2;
        this.f384191f = fVar.mo50214a(accountId);
        this.f384190e = executor;
    }

    /* renamed from: a */
    public final void mo116554a(Activity activity, List list) {
        if (!C58837ba.m90859h(this.f384188c)) {
            ((C59052c) ((C59052c) f384186a.mo56224b()).mo56372aa(41730)).mo56389s("Preparing to present HaTS survey with trigger id %s", this.f384188c);
            if (!this.f384192g) {
                Collection.EL.removeIf(list, C141542b.f384179a);
            }
            C60870cx cxVar = this.f384191f;
            C141543c cVar = new C141543c(this, activity, list);
            C60922j.m93045h(cxVar, C47810es.m84966f(cVar), this.f384190e);
        }
    }
}
