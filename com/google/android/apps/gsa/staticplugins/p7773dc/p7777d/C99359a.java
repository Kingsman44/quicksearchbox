package com.google.android.apps.gsa.staticplugins.p7773dc.p7777d;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.dc.d.a */
/* compiled from: PG */
public final /* synthetic */ class C99359a implements C60931s {
    public final C60870cx apply(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            return C60856cj.m92900i(axVar.mo56107c());
        }
        return C60856cj.m92899h(new C90452a(new IllegalStateException("The SearchFetcher did not return a result."), 211, C89885b.INTERNAL_ERROR_SEE_STACK_TRACE_VALUE));
    }
}
