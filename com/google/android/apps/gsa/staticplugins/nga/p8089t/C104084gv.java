package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80624s;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29676p;
import com.google.android.libraries.mdi.download.p2248h.C29628y;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29554bg;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.gv */
/* compiled from: PG */
public final /* synthetic */ class C104084gv implements C29554bg {

    /* renamed from: a */
    public final /* synthetic */ C68214a f289591a;

    /* renamed from: b */
    public final /* synthetic */ Executor f289592b;

    /* renamed from: c */
    public final /* synthetic */ C86054o f289593c;

    /* renamed from: d */
    public final /* synthetic */ ae f289594d;

    /* renamed from: e */
    public final /* synthetic */ C29628y f289595e;

    public /* synthetic */ C104084gv(C68214a aVar, Executor executor, C86054o oVar, ae aeVar, C29628y yVar) {
        this.f289591a = aVar;
        this.f289592b = executor;
        this.f289593c = oVar;
        this.f289594d = aeVar;
        this.f289595e = yVar;
    }

    /* renamed from: a */
    public final C60870cx mo33117a(C58833ax axVar) {
        C68214a aVar = this.f289591a;
        Executor executor = this.f289592b;
        C86054o oVar = this.f289593c;
        ae aeVar = this.f289594d;
        C29628y yVar = this.f289595e;
        C29676p pVar = new C29676p();
        pVar.mo34785b(C80624s.WEBREF_MODEL_NGA.f221333y);
        pVar.f80357a = axVar;
        return C60922j.m93044g(C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(((C29409fd) aVar.mo27525b()).mo34721j(pVar.mo34784a())), C104081gs.f289586a, executor), Exception.class, C104082gt.f289587a, executor), new C104083gu(oVar, aeVar, yVar), executor);
    }
}
