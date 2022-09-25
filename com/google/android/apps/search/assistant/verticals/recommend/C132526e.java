package com.google.android.apps.search.assistant.verticals.recommend;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.libraries.web.base.C43255f;
import com.google.android.libraries.web.base.C43257h;
import com.google.assistant.p3957l.p3961b.p3962a.p3963a.C52972b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.verticals.recommend.e */
/* compiled from: PG */
public final /* synthetic */ class C132526e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f361683a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f361684b;

    /* renamed from: c */
    public final /* synthetic */ String f361685c;

    public /* synthetic */ C132526e(C60870cx cxVar, C60870cx cxVar2, String str) {
        this.f361683a = cxVar;
        this.f361684b = cxVar2;
        this.f361685c = str;
    }

    public final Object call() {
        C60870cx cxVar = this.f361683a;
        C60870cx cxVar2 = this.f361684b;
        String str = this.f361685c;
        String str2 = (String) C60856cj.m92909r(cxVar);
        String encodeToString = Base64.encodeToString(((C52972b) C60856cj.m92909r(cxVar2)).toByteArray(), 2);
        C43255f m = C43257h.m76306m(str);
        m.f113051b.mo55429h("lcc", encodeToString);
        if (!TextUtils.isEmpty(str2)) {
            m.f113051b.mo55429h("X-Geo", str2);
        }
        return m.mo46365k();
    }
}
