package com.google.android.apps.gsa.staticplugins.p7453bi;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.common.base.C58817ah;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bi.h */
/* compiled from: PG */
public final /* synthetic */ class C94616h implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C94616h f264623a = new C94616h();

    private /* synthetic */ C94616h() {
    }

    public final Object apply(Object obj) {
        return new C89057m(new C90457d((Throwable) (TimeoutException) obj, (int) C89885b.HTTP_SEARCH_SERVICE_TIMEOUT_VALUE));
    }
}
