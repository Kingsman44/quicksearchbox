package com.google.android.libraries.mdi.p2213d.p2219c.p2222c;

import com.google.android.libraries.mdi.p2213d.p2219c.C28680i;
import com.google.android.libraries.mdi.p2213d.p2219c.p2220a.C28623a;
import com.google.android.libraries.mdi.p2213d.p2219c.p2222c.p2226d.C28651a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.InputStream;

/* renamed from: com.google.android.libraries.mdi.d.c.c.h */
/* compiled from: PG */
public final /* synthetic */ class C28655h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C28671x f77904a;

    /* renamed from: b */
    public final /* synthetic */ C28638aj f77905b;

    /* renamed from: c */
    public final /* synthetic */ C28680i f77906c;

    /* renamed from: d */
    public final /* synthetic */ int f77907d;

    public /* synthetic */ C28655h(C28671x xVar, C28638aj ajVar, C28680i iVar, int i) {
        this.f77904a = xVar;
        this.f77905b = ajVar;
        this.f77906c = iVar;
        this.f77907d = i;
    }

    public final C60870cx apply(Object obj) {
        C28671x xVar = this.f77904a;
        C28638aj ajVar = this.f77905b;
        C28680i iVar = this.f77906c;
        int i = this.f77907d;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return xVar.mo34323h(iVar, i);
        }
        if (C28671x.m53541n(ajVar, iVar)) {
            return C60856cj.m92900i((InputStream) axVar.mo56107c());
        }
        C28651a.m53538a((InputStream) axVar.mo56107c());
        return C60856cj.m92899h(new C28623a());
    }
}
