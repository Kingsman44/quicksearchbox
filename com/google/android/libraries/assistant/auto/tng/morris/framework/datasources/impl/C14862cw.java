package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.apps.tiktok.dataservice.C46783d;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.cw */
/* compiled from: PG */
final class C14862cw extends C46783d {

    /* renamed from: a */
    final /* synthetic */ C14986h f44736a;

    /* renamed from: b */
    final /* synthetic */ C60888db f44737b;

    /* renamed from: c */
    final /* synthetic */ C14863cx f44738c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14862cw(C14863cx cxVar, C47770dh dhVar, Executor executor, C14986h hVar, C60888db dbVar) {
        super(dhVar, "Recent Call Log Async Observer", executor);
        this.f44738c = cxVar;
        this.f44736a = hVar;
        this.f44737b = dbVar;
    }

    /* renamed from: a */
    public final void mo21781a(boolean z) {
        synchronized (this.f44738c.f44742c) {
            C60870cx cxVar = this.f44738c.f44744e;
            if (cxVar != null) {
                cxVar.cancel(true);
                this.f44738c.f44744e = null;
            }
        }
        C60870cx j = this.f44738c.mo21783j();
        C14861cv cvVar = new C14861cv(this);
        C60856cj.m92911t(j, C47810es.m84974n(cvVar), this.f44737b);
    }
}
