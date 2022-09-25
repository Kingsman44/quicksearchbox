package com.google.android.apps.gsa.staticplugins.customtabs.intent;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.intent.g */
/* compiled from: PG */
public final /* synthetic */ class C98676g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ int f275640a;

    public /* synthetic */ C98676g(int i) {
        this.f275640a = i;
    }

    public final Object apply(Object obj) {
        int i = this.f275640a;
        C59104x c = C98682m.f275646a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "CustomTabsInterceptor");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((TimeoutException) obj)).mo56372aa(19201)).mo56387q("CCT session was not available after %d ms", i);
        return false;
    }
}
