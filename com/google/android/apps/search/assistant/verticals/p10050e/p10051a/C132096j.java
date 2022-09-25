package com.google.android.apps.search.assistant.verticals.p10050e.p10051a;

import com.google.android.libraries.storage.p3315b.C42845bd;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.assistant.p3863av.p3876g.p3877a.p3878a.C50582d;

/* renamed from: com.google.android.apps.search.assistant.verticals.e.a.j */
/* compiled from: PG */
public final /* synthetic */ class C132096j implements C42846be {

    /* renamed from: a */
    public final /* synthetic */ int f360480a;

    /* renamed from: b */
    public final /* synthetic */ C50582d[] f360481b;

    public /* synthetic */ C132096j(int i, C50582d[] dVarArr) {
        this.f360480a = i;
        this.f360481b = dVarArr;
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        int i = this.f360480a;
        C50582d[] dVarArr = this.f360481b;
        C42845bd e = bfVar.mo45933e("INSERT OR IGNORE INTO deeplinks (query, data) VALUES (?, ?)");
        int i2 = 0;
        while (i2 < i) {
            try {
                C50582d dVar = dVarArr[i2];
                if (!dVar.f131629b.isEmpty()) {
                    e.mo45925c(1, dVar.f131629b);
                    e.mo45923a(2, dVar.toByteArray());
                    e.mo45927d();
                }
                if (!dVar.f131630c.isEmpty() && !dVar.f131631d.isEmpty()) {
                    e.mo45925c(1, C132091e.m214545a(dVar.f131630c, dVar.f131631d));
                    e.mo45923a(2, dVar.toByteArray());
                    e.mo45927d();
                }
                i2++;
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        }
        e.close();
        return;
        throw th;
    }
}
