package com.google.android.apps.search.assistant.platform.pcp.crossprofile;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124081bi;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.inject.C47245e;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.crossprofile.g */
/* compiled from: PG */
public final /* synthetic */ class C123670g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123674k f341633a;

    /* renamed from: b */
    public final /* synthetic */ int f341634b;

    /* renamed from: c */
    public final /* synthetic */ Set f341635c;

    /* renamed from: d */
    public final /* synthetic */ boolean f341636d;

    /* renamed from: e */
    public final /* synthetic */ C123755bv f341637e;

    /* renamed from: f */
    public final /* synthetic */ C123777f f341638f;

    /* renamed from: g */
    public final /* synthetic */ boolean f341639g;

    public /* synthetic */ C123670g(C123674k kVar, int i, Set set, boolean z, C123755bv bvVar, C123777f fVar, boolean z2) {
        this.f341633a = kVar;
        this.f341634b = i;
        this.f341635c = set;
        this.f341636d = z;
        this.f341637e = bvVar;
        this.f341638f = fVar;
        this.f341639g = z2;
    }

    public final C60870cx apply(Object obj) {
        C123674k kVar = this.f341633a;
        int i = this.f341634b;
        Set set = this.f341635c;
        boolean z = this.f341636d;
        C123755bv bvVar = this.f341637e;
        C123777f fVar = this.f341638f;
        boolean z2 = this.f341639g;
        List list = (List) obj;
        if (list.isEmpty()) {
            return C60856cj.m92900i(C123746bm.f341818b);
        }
        return ((C124081bi.C124082a) C47245e.m84045a(kVar.f341644a, C124081bi.C124082a.class, ((C46108a) list.get(0)).mo50209a())).mo106278ac().mo106275f(C53306j.m86809a(i), set, z, bvVar, fVar, z2);
    }
}
