package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9210j.p9212b;

import android.content.pm.ApplicationInfo;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121220ae;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121241e;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121244h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.j.b.a */
/* compiled from: PG */
public final /* synthetic */ class C121386a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C121391f f337018a;

    public /* synthetic */ C121386a(C121391f fVar) {
        this.f337018a = fVar;
    }

    public final C60870cx apply(Object obj) {
        C121244h hVar;
        C60870cx cxVar;
        C121391f fVar = this.f337018a;
        C121220ae aeVar = (C121220ae) obj;
        if (aeVar.f336744b == 6) {
            hVar = (C121244h) aeVar.f336745c;
        } else {
            hVar = C121244h.f336790b;
        }
        HashMap hashMap = new HashMap(Collections.unmodifiableMap(hVar.f336792a));
        hashMap.size();
        List<ApplicationInfo> installedApplications = fVar.f337024b.getPackageManager().getInstalledApplications(0);
        installedApplications.size();
        HashSet hashSet = new HashSet(hashMap.keySet());
        ArrayList arrayList = new ArrayList();
        Iterator<ApplicationInfo> it = installedApplications.iterator();
        while (it.hasNext()) {
            ApplicationInfo next = it.next();
            if ((next != null && next.enabled && (next.flags & 129) == 0 && !C58837ba.m90859h(next.packageName)) && !hashSet.remove(next.packageName)) {
                arrayList.add(C60856cj.m92904m(C47810es.m84978r(new C121389d(fVar, next)), fVar.f337025c));
            }
        }
        if (!arrayList.isEmpty() || !hashSet.isEmpty()) {
            hashMap.keySet().removeAll(hashSet);
            for (Map.Entry value : hashMap.entrySet()) {
                arrayList.add(C60856cj.m92900i((C121241e) value.getValue()));
            }
            cxVar = C60856cj.m92906o(arrayList);
        } else {
            cxVar = C60856cj.m92900i(new ArrayList(hashMap.values()));
        }
        return C60922j.m93044g(cxVar, C47810es.m84963c(new C121388c(fVar)), C60826bg.f164896a);
    }
}
