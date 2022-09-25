package com.google.android.libraries.mdi.download.p2236d;

import android.util.Pair;
import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.bm */
/* compiled from: PG */
public final /* synthetic */ class C28898bm implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29392ep f78488a;

    /* renamed from: b */
    public final /* synthetic */ long f78489b;

    /* renamed from: c */
    public final /* synthetic */ String f78490c;

    public /* synthetic */ C28898bm(C29392ep epVar, long j, String str) {
        this.f78488a = epVar;
        this.f78489b = j;
        this.f78490c = str;
    }

    public final C60870cx apply(Object obj) {
        C29392ep epVar = this.f78488a;
        long j = this.f78489b;
        String str = this.f78490c;
        Pair pair = (Pair) obj;
        if (pair != null) {
            return C60856cj.m92900i(pair);
        }
        C29045l.m53937i("%s: importFiles for group name: %s, buildId: %d, variantId: %s, but no group was found", "FileGroupManager", epVar.f79682b, Long.valueOf(j), str);
        C28736bn bnVar = new C28736bn();
        bnVar.f78062a = C28737bo.GROUP_NOT_FOUND_ERROR;
        String str2 = epVar.f79682b;
        bnVar.f78063b = "file group: " + str2 + " not found! Make sure addFileGroup has been called.";
        return C60856cj.m92899h(bnVar.mo34334a());
    }
}
