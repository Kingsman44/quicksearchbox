package androidx.media3.exoplayer;

import androidx.media3.common.p136b.C2633u;

/* renamed from: androidx.media3.exoplayer.d */
/* compiled from: PG */
public final /* synthetic */ class C2898d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2963e f8206a;

    /* renamed from: b */
    public final /* synthetic */ int f8207b;

    public /* synthetic */ C2898d(C2963e eVar, int i) {
        this.f8206a = eVar;
        this.f8207b = i;
    }

    public final void run() {
        C2963e eVar = this.f8206a;
        int i = this.f8207b;
        C2997f fVar = eVar.f8518a;
        if (i == -3 || i == -2) {
            if (i == -2 || fVar.mo6927f()) {
                fVar.mo6924c(0);
                fVar.mo6926e(2);
                return;
            }
            fVar.mo6926e(3);
        } else if (i == -1) {
            fVar.mo6924c(-1);
            fVar.mo6923b();
        } else if (i != 1) {
            C2633u.m7050e("AudioFocusManager", "Unknown focus change type: " + i);
        } else {
            fVar.mo6926e(1);
            fVar.mo6924c(1);
        }
    }
}
