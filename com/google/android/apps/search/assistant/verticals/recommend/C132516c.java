package com.google.android.apps.search.assistant.verticals.recommend;

import android.text.TextUtils;
import com.google.android.libraries.web.base.C43255f;
import com.google.android.libraries.web.base.C43257h;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.verticals.recommend.c */
/* compiled from: PG */
public final /* synthetic */ class C132516c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f361667a;

    public /* synthetic */ C132516c(String str) {
        this.f361667a = str;
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        C43255f m = C43257h.m76306m(this.f361667a);
        if (!TextUtils.isEmpty(str)) {
            m.f113051b.mo55429h("X-Geo", str);
        }
        return m.mo46365k();
    }
}
