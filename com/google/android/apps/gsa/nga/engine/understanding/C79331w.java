package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.shared.util.C90762bf;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4522b.C58485gu;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.w */
/* compiled from: PG */
final class C79331w implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C74965n f217839a;

    /* renamed from: b */
    final /* synthetic */ C90762bf f217840b;

    /* renamed from: c */
    final /* synthetic */ C79332x f217841c;

    public C79331w(C79332x xVar, C74965n nVar, C90762bf bfVar) {
        this.f217841c = xVar;
        this.f217839a = nVar;
        this.f217840b = bfVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        if (th instanceof CancellationException) {
            C79332x xVar = this.f217841c;
            xVar.f217845d.mo74237c(xVar.f217843b, this.f217839a.mo71336k());
            String str = this.f217839a.mo71336k().f227135b;
            this.f217840b.mo85102a();
            return;
        }
        C79332x xVar2 = this.f217841c;
        xVar2.f217845d.mo74237c(xVar2.f217844c, this.f217839a.mo71336k());
        String str2 = this.f217839a.mo71336k().f227135b;
        this.f217840b.mo85102a();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        C79332x xVar = this.f217841c;
        xVar.f217845d.mo74237c(xVar.f217842a, this.f217839a.mo71336k());
        String str = this.f217839a.mo71336k().f227135b;
        this.f217840b.mo85102a();
    }
}
