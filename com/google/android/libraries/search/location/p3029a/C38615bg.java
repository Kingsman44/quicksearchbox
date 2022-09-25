package com.google.android.libraries.search.location.p3029a;

import com.google.android.libraries.search.location.p3029a.p3030a.C38574c;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.p4624a.p4625a.C61284a;
import com.google.frameworks.client.p4624a.p4625a.C61301b;

/* renamed from: com.google.android.libraries.search.location.a.bg */
/* compiled from: PG */
public final /* synthetic */ class C38615bg implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C38615bg f102051a = new C38615bg();

    private /* synthetic */ C38615bg() {
    }

    public final C60870cx apply(Object obj) {
        String str;
        C38616bh bhVar = (C38616bh) obj;
        C61284a aVar = C61284a.NO_USER_DATA;
        if (bhVar instanceof C38617bi) {
            int i = ((C38617bi) bhVar).f102052a;
            if (i == -1) {
                str = "REQUEST_FAILED";
            } else if (i == 0) {
                str = "DEFAULT_INT_VALUE";
            } else if (i == 3) {
                str = "ERROR";
            } else if (i == 4) {
                str = "NOT_PERMITTED";
            } else if (i == 5) {
                str = "UNKNOWN_CAPABILITY";
            } else if (i != 6) {
                str = "UNKNOWN_CODE: " + i;
            } else {
                str = "FAILED_TO_SYNC";
            }
        } else {
            str = bhVar instanceof C38619bk ? "TIMEOUT" : bhVar instanceof C38618bj ? "RETRY_FAILED" : bhVar instanceof C38621bm ? "UNKNOWN_EXCEPTION" : "UNKNOWN_FAILURE";
        }
        ((C59052c) ((C59052c) ((C59052c) C38622bn.f102053a.mo56226d()).mo56382g(bhVar)).mo56372aa(53169)).mo56389s("Capability failure: %s", new C61301b(aVar, str));
        return C47633f.m84733g(C60856cj.m92900i(C38574c.CAPABILITY_RESULT_UNABLE_TO_GET_CAPABILITY));
    }
}
