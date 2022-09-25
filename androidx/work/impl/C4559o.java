package androidx.work.impl;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: androidx.work.impl.o */
/* compiled from: PG */
public final /* synthetic */ class C4559o implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C4562r f14389a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f14390b;

    /* renamed from: c */
    public final /* synthetic */ String f14391c;

    public /* synthetic */ C4559o(C4562r rVar, ArrayList arrayList, String str) {
        this.f14389a = rVar;
        this.f14390b = arrayList;
        this.f14391c = str;
    }

    public final Object call() {
        C4562r rVar = this.f14389a;
        ArrayList arrayList = this.f14390b;
        String str = this.f14391c;
        arrayList.addAll(rVar.f14400d.mo9365G().mo9446a(str));
        return rVar.f14400d.mo9364F().mo9422b(str);
    }
}
