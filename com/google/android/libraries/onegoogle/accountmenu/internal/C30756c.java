package com.google.android.libraries.onegoogle.accountmenu.internal;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.c */
/* compiled from: PG */
public final /* synthetic */ class C30756c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30772p f83014a;

    /* renamed from: b */
    public final /* synthetic */ boolean f83015b;

    /* renamed from: c */
    public final /* synthetic */ C30769m f83016c;

    public /* synthetic */ C30756c(C30772p pVar, boolean z, C30769m mVar) {
        this.f83014a = pVar;
        this.f83015b = z;
        this.f83016c = mVar;
    }

    public final void run() {
        C30772p pVar = this.f83014a;
        boolean z = this.f83015b;
        C30769m mVar = this.f83016c;
        if (z) {
            if (!pVar.f83048d.contains(mVar)) {
                int indexOf = pVar.f83047c.indexOf(mVar);
                int i = 0;
                for (int i2 = 0; i2 < indexOf; i2++) {
                    if (C30772p.m57467c((C30769m) pVar.f83047c.get(i2))) {
                        i++;
                    }
                }
                pVar.f83048d.add(i, mVar);
                pVar.notifyItemInserted(i);
            }
        } else if (pVar.f83048d.contains(mVar)) {
            int indexOf2 = pVar.f83048d.indexOf(mVar);
            pVar.f83048d.remove(indexOf2);
            pVar.notifyItemRemoved(indexOf2);
        }
    }
}
