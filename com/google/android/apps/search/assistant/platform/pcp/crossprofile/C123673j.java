package com.google.android.apps.search.assistant.platform.pcp.crossprofile;

import com.google.android.apps.search.assistant.platform.pcp.featuredata.C123991o;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.crossprofile.j */
/* compiled from: PG */
public final /* synthetic */ class C123673j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123674k f341642a;

    /* renamed from: b */
    public final /* synthetic */ List f341643b;

    public /* synthetic */ C123673j(C123674k kVar, List list) {
        this.f341642a = kVar;
        this.f341643b = list;
    }

    public final C60870cx apply(Object obj) {
        C123674k kVar = this.f341642a;
        List list = this.f341643b;
        List list2 = (List) obj;
        if (list2.isEmpty()) {
            return C60866ct.f164955a;
        }
        return ((C123991o.C123992a) C47245e.m84045a(kVar.f341644a, C123991o.C123992a.class, ((C46108a) list2.get(0)).mo50209a())).mo106226S().mo106224a(list);
    }
}
