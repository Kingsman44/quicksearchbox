package com.google.android.libraries.lens.view.gallery.p2111d;

import com.bumptech.glide.load.C5637a;

/* renamed from: com.google.android.libraries.lens.view.gallery.d.al */
/* compiled from: PG */
public final /* synthetic */ class C26350al implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26353ao f71628a;

    /* renamed from: b */
    public final /* synthetic */ C5637a f71629b;

    public /* synthetic */ C26350al(C26353ao aoVar, C5637a aVar) {
        this.f71628a = aoVar;
        this.f71629b = aVar;
    }

    public final void run() {
        C26353ao aoVar = this.f71628a;
        C5637a aVar = this.f71629b;
        if (!aoVar.f71635d) {
            aoVar.f71637f++;
            C5637a aVar2 = C5637a.LOCAL;
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                aoVar.f71641j++;
            } else if (ordinal == 2) {
                aoVar.f71639h++;
            } else if (ordinal == 3) {
                aoVar.f71640i++;
            } else if (ordinal == 4) {
                aoVar.f71638g++;
            }
            aoVar.mo31546a();
        }
    }
}
