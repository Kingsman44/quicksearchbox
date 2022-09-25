package com.google.android.apps.gsa.nga.engine.education.pie.p6022d;

import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.d.c */
/* compiled from: PG */
public final class C75865c extends C75863a {

    /* renamed from: c */
    private final C58485gu f210506c;

    public C75865c(C79359i iVar, C76092h hVar, C91142g gVar, C58485gu guVar) {
        super(iVar, hVar, gVar);
        this.f210506c = guVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C60870cx mo71202h() {
        ArrayList arrayList = new ArrayList();
        C58485gu guVar = this.f210506c;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((C75864b) guVar.get(i)).mo71906gH());
        }
        return C118826c.m197212b(arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C60870cx mo71203i() {
        C58485gu guVar = this.f210506c;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            ((C75864b) guVar.get(i)).mo71907gI();
        }
        return C118826c.f331423b;
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "PieLifecycleHandler";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 15;
    }
}
