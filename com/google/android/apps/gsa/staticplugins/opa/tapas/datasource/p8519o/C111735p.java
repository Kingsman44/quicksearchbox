package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.p */
/* compiled from: PG */
public final /* synthetic */ class C111735p implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111739t f310582a;

    public /* synthetic */ C111735p(C111739t tVar) {
        this.f310582a = tVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C111739t tVar = this.f310582a;
        Exception exc = (Exception) obj;
        if (exc instanceof TimeoutException) {
            ((C59052c) ((C59052c) C111739t.f310591a.mo56225c()).mo56372aa(27291)).mo56386p("#fetchResponseWithZpCacheFallback: Timeout getting response from Tapas Server.");
        } else {
            ((C59052c) ((C59052c) ((C59052c) C111739t.f310591a.mo56225c()).mo56382g(exc)).mo56372aa(27289)).mo56386p("#fetchResponseWithZpCacheFallback: Error getting response from Tapas Server.");
        }
        C58833ax c = ((C111708as) tVar.f310593b.mo27525b()).mo99211c(BuildConfig.FLAVOR);
        if (c.mo56113h()) {
            return (C60870cx) c.mo56107c();
        }
        throw exc;
    }
}
