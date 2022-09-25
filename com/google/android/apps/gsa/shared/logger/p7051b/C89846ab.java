package com.google.android.apps.gsa.shared.logger.p7051b;

import com.google.android.libraries.gsa.p1864f.p1865a.C22804a;
import com.google.common.base.C58839bc;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.gsa.shared.logger.b.ab */
/* compiled from: PG */
public final /* synthetic */ class C89846ab implements C58839bc {

    /* renamed from: a */
    public final /* synthetic */ C22804a f243178a;

    /* renamed from: b */
    public final /* synthetic */ C58528ij f243179b;

    public /* synthetic */ C89846ab(C22804a aVar, C58528ij ijVar) {
        this.f243178a = aVar;
        this.f243179b = ijVar;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        C22804a aVar = this.f243178a;
        C58528ij ijVar = this.f243179b;
        C22804a aVar2 = (C22804a) obj;
        if (!aVar2.mo28153d(aVar.f62789d)) {
            return false;
        }
        C89849ae aeVar = aVar.f62786a;
        C89849ae aeVar2 = aVar2.f62786a;
        return aeVar == aeVar2 || ijVar.contains(aeVar2);
    }
}
