package com.google.android.apps.gsa.staticplugins.avocado;

import android.media.SoundPool;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.df */
/* compiled from: PG */
final class C94254df implements SoundPool.OnLoadCompleteListener {

    /* renamed from: a */
    final /* synthetic */ C94256dh f263376a;

    public C94254df(C94256dh dhVar) {
        this.f263376a = dhVar;
    }

    public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
        C94256dh dhVar = this.f263376a;
        if (i == dhVar.f263405t) {
            dhVar.f263403r = true;
        } else if (i == dhVar.f263406u) {
            dhVar.f263404s = true;
        }
    }
}
