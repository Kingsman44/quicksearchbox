package com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import java.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.discover.feedback.a.c.g */
/* compiled from: PG */
public final /* synthetic */ class C134275g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Map.Entry f365777a;

    public /* synthetic */ C134275g(Map.Entry entry) {
        this.f365777a = entry;
    }

    public final Object apply(Object obj) {
        Map.Entry entry = this.f365777a;
        ((C59052c) ((C59052c) ((C59052c) C134279k.f365782a.mo56226d()).mo56382g((Exception) obj)).mo56372aa(40342)).mo56389s("Error while getting value of async debuggable with name %s", entry.getKey());
        return String.valueOf((String) entry.getKey()).concat(": [ERROR]");
    }
}
