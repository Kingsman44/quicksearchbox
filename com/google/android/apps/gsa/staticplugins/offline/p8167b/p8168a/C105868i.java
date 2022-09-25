package com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a;

import com.google.android.apps.gsa.g.e.e;
import com.google.android.libraries.mdi.download.C28804cs;
import com.google.android.libraries.mdi.download.C28805ct;
import com.google.android.libraries.mdi.download.C29663j;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.b.a.i */
/* compiled from: PG */
public final /* synthetic */ class C105868i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C105871l f295493a;

    /* renamed from: b */
    public final /* synthetic */ Map f295494b;

    public /* synthetic */ C105868i(C105871l lVar, Map map) {
        this.f295493a = lVar;
        this.f295494b = map;
    }

    public final C60870cx apply(Object obj) {
        C105871l lVar = this.f295493a;
        Map map = this.f295494b;
        for (String str : Collections.unmodifiableMap(((e) obj).a).keySet()) {
            String str2 = (String) map.get(str);
            if (str2 != null) {
                C28804cs f = C28805ct.m53747f();
                ((C29663j) f).f80313a = str2;
                return C60922j.m93044g(lVar.f295496a.mo34717f(f.mo34447a()), new C105869j(lVar), C60826bg.f164896a);
            }
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }
}
