package com.google.android.libraries.search.location.p3029a;

import com.google.android.libraries.search.location.p3029a.p3030a.C38574c;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.location.a.bf */
/* compiled from: PG */
public final /* synthetic */ class C38614bf implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C38614bf f102050a = new C38614bf();

    private /* synthetic */ C38614bf() {
    }

    public final C60870cx apply(Object obj) {
        Integer num = (Integer) obj;
        ((C59052c) ((C59052c) C38622bn.f102053a.mo56224b()).mo56372aa(53161)).mo56389s("asr: %d", num);
        if (num.intValue() == 1) {
            return C47633f.m84733g(C60856cj.m92900i(C38574c.CAPABILITY_RESULT_CAPABILITY_IS_PRESENT));
        }
        if (num.intValue() == 2) {
            return C47633f.m84733g(C60856cj.m92900i(C38574c.CAPABILITY_RESULT_CAPABILITY_IS_NOT_PRESENT));
        }
        return C47633f.m84733g(C60856cj.m92899h(new C38617bi(num.intValue())));
    }
}
