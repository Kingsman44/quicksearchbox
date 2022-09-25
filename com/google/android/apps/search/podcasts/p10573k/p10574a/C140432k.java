package com.google.android.apps.search.podcasts.p10573k.p10574a;

import android.os.Bundle;
import com.google.android.apps.p484e.p485a.C9051a;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.search.podcasts.k.a.k */
/* compiled from: PG */
final class C140432k extends C9051a {

    /* renamed from: a */
    final /* synthetic */ C140433l f381456a;

    /* renamed from: b */
    private final String f381457b;

    /* renamed from: c */
    private final Set f381458c;

    public C140432k(C140433l lVar, String str, Set set) {
        this.f381456a = lVar;
        this.f381457b = str;
        this.f381458c = set;
    }

    /* renamed from: a */
    public final void mo17328a(Bundle bundle) {
        C59071e eVar = C140433l.f381459a;
        C58976aa aaVar = C58975e.f156826a;
        HashSet hashSet = new HashSet();
        if (bundle.containsKey("topic_list")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("topic_list");
            stringArrayList.getClass();
            hashSet.addAll(stringArrayList);
        }
        this.f381456a.mo115672d(this.f381457b, new ArrayList(C58758qx.m90645c(this.f381458c, hashSet)), new ArrayList(C58758qx.m90645c(hashSet, this.f381458c)));
    }
}
