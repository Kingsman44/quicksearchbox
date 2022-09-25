package com.google.frameworks.client.p4624a.p4625a.p4626a.p4627a;

import android.util.Log;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.p1975k.p1980e.C24006d;
import com.google.android.libraries.p3339v.C43205e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58819aj;
import com.google.common.p4552o.p4566l.C60110ab;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.p4624a.p4625a.C61302c;
import com.google.frameworks.client.p4624a.p4629b.C61312i;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58149a;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58150b;
import p228c.p229a.p230a.p231a.C4690a;

/* renamed from: com.google.frameworks.client.a.a.a.a.e */
/* compiled from: PG */
final class C61290e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C61291f f165773a;

    public C61290e(C61291f fVar) {
        this.f165773a = fVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        Log.e("ClientLoggingBackend", "Error while logging.", th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        String str = (String) obj;
        C61291f fVar = this.f165773a;
        C61292g gVar = fVar.f165776c;
        C61312i iVar = fVar.f165775b;
        C60110ab abVar = iVar.f165823f;
        if (abVar == null) {
            abVar = C60110ab.f162553j;
        }
        int a = C61302c.m93813a(abVar.f162562h);
        C143657j e = new C143658k(gVar.f165779a, "CLIENT_LOGGING_PROD", str).mo119000e(iVar, C24006d.m44596b(gVar.f165779a, new C4690a()));
        C58149a aVar = e.f389461c;
        aVar.copyOnWrite();
        C58150b bVar = (C58150b) aVar.instance;
        C58150b bVar2 = C58150b.f155459k;
        bVar.f155461a |= 16;
        bVar.f155464d = a;
        C60870cx g = C60922j.m93044g(C43205e.m76191a(e.mo118992a()), new C58819aj((Object) null), C60826bg.f164896a);
        g.mo4106b(new C61287b(g), C60826bg.f164896a);
        C60846c.m92878g(g, Exception.class, C47810es.m84963c(C61288c.f165767a), C60826bg.f164896a);
    }
}
