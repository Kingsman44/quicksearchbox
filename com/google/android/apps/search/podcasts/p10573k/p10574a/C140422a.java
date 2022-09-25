package com.google.android.apps.search.podcasts.p10573k.p10574a;

import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.google.android.apps.search.podcasts.p10573k.C140421a;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.podcasts.k.a.a */
/* compiled from: PG */
public final class C140422a implements C140421a {

    /* renamed from: a */
    private final C140433l f381435a;

    /* renamed from: b */
    private String f381436b = null;

    /* renamed from: c */
    private Set f381437c = new HashSet();

    public C140422a(C140433l lVar) {
        this.f381435a = lVar;
    }

    /* renamed from: a */
    public final void mo115660a(String str, Set set) {
        ResolveInfo resolveService = this.f381435a.f381466h.resolveService(C140433l.f381461c, 128);
        if (resolveService != null && resolveService.serviceInfo != null && resolveService.serviceInfo.enabled && resolveService.serviceInfo.metaData.getInt("com.google.android.apps.podcasts.NOTIFICATION_SERVICE_VERSION", 0) > 0) {
            C58976aa aaVar = C58975e.f156826a;
            if (!TextUtils.equals(this.f381436b, str)) {
                C140433l lVar = this.f381435a;
                lVar.mo115671c(new C140426e(lVar, str, set, this.f381436b));
            } else if (!TextUtils.isEmpty(str) && !Objects.equals(this.f381437c, set)) {
                this.f381435a.mo115672d(str, new ArrayList(C58758qx.m90645c(set, this.f381437c)), new ArrayList(C58758qx.m90645c(this.f381437c, set)));
            }
            this.f381436b = str;
            this.f381437c = set;
        }
    }
}
