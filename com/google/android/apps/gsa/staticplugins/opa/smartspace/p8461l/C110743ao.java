package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58817ah;
import java.util.ArrayList;
import java.util.Map;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.ao */
/* compiled from: PG */
public final /* synthetic */ class C110743ao implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Map f308554a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f308555b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f308556c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f308557d;

    /* renamed from: e */
    public final /* synthetic */ C91006f f308558e;

    /* renamed from: f */
    public final /* synthetic */ String f308559f;

    public /* synthetic */ C110743ao(Map map, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, C91006f fVar, String str) {
        this.f308554a = map;
        this.f308555b = arrayList;
        this.f308556c = arrayList2;
        this.f308557d = arrayList3;
        this.f308558e = fVar;
        this.f308559f = str;
    }

    public final Object apply(Object obj) {
        Map map = this.f308554a;
        ArrayList arrayList = this.f308555b;
        ArrayList arrayList2 = this.f308556c;
        ArrayList arrayList3 = this.f308557d;
        C91006f fVar = this.f308558e;
        String str = this.f308559f;
        Map.EL.forEach(map, new C110763bh((java.util.Map) obj, arrayList, arrayList2, arrayList3));
        if (!arrayList3.isEmpty()) {
            fVar.mo85279c(str.concat(" Calendar card Provider IDs still consistent with the Content Provider")).mo85276a(C90752i.m148231e(arrayList3));
        }
        if (!arrayList2.isEmpty()) {
            fVar.mo85279c(str.concat(" Calendar card Provider IDs with multiple or different titles from Content Provider")).mo85276a(C90752i.m148231e(arrayList2));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        fVar.mo85279c(str.concat(" Calendar card Provider IDs no longer in the Content Provider")).mo85276a(C90752i.m148231e(arrayList));
        return null;
    }
}
