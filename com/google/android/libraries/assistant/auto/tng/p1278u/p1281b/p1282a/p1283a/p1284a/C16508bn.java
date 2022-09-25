package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a;

import android.content.Intent;
import com.google.android.libraries.assistant.auto.tng.common.p933q.C13318b;
import com.google.android.libraries.assistant.auto.tng.common.p933q.C13319c;
import com.google.android.libraries.assistant.auto.tng.common.p933q.C13320d;
import com.google.android.libraries.assistant.auto.tng.common.p933q.C13321e;
import com.google.android.libraries.assistant.auto.tng.common.p933q.C13325i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.bn */
/* compiled from: PG */
public final class C16508bn extends C68247h {

    /* renamed from: a */
    private final C68283d f48482a;

    public C16508bn(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C16508bn.class), aVar);
        this.f48482a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C13325i iVar = (C13325i) obj;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        C13319c cVar = new C13319c(iVar, intent);
        C47633f e = C47633f.m84733g(C60856cj.m92904m(C47810es.m84978r(cVar), iVar.f41052d)).mo51515h(C13320d.f41043a, iVar.f41051c).mo51513e(RuntimeException.class, new C13321e(intent), iVar.f41051c);
        C60870cx a = iVar.mo21026a();
        return C47638k.m84751b(e, a).mo51520a(new C13318b(e, a), iVar.f41051c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f48482a.mo60297gq();
    }
}
