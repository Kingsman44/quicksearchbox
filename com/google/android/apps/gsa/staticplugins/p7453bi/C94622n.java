package com.google.android.apps.gsa.staticplugins.p7453bi;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.common.base.C58817ah;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bi.n */
/* compiled from: PG */
public final /* synthetic */ class C94622n implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C94622n f264630a = new C94622n();

    private /* synthetic */ C94622n() {
    }

    public final Object apply(Object obj) {
        return new C89057m(new C90457d((Throwable) (TimeoutException) obj, (int) C89885b.HTTP_SEARCH_SERVICE_TIMEOUT_VALUE));
    }
}
