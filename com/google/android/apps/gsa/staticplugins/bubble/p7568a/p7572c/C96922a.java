package com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7572c;

import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a.C96981d;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58528ij;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.a.c.a */
/* compiled from: PG */
public final /* synthetic */ class C96922a implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C96943d f270926a;

    /* renamed from: b */
    public final /* synthetic */ C96981d f270927b;

    /* renamed from: c */
    public final /* synthetic */ boolean f270928c;

    public /* synthetic */ C96922a(C96943d dVar, C96981d dVar2, boolean z) {
        this.f270926a = dVar;
        this.f270927b = dVar2;
        this.f270928c = z;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C96943d dVar = this.f270926a;
        C96981d dVar2 = this.f270927b;
        boolean z = this.f270928c;
        HashSet hashSet = new HashSet(C58528ij.m90006F((C58528ij) obj));
        if (z) {
            hashSet.add(dVar2);
        } else {
            hashSet.remove(dVar2);
        }
        return dVar.f270958b.mo90375b(C58528ij.m90006F(hashSet));
    }
}
