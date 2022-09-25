package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m;
import com.google.common.util.concurrent.C60845bz;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.download.d.fc */
/* compiled from: PG */
final class C29115fc implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C29334dr f78966a;

    /* renamed from: b */
    final /* synthetic */ C29117fe f78967b;

    public C29115fc(C29117fe feVar, C29334dr drVar) {
        this.f78967b = feVar;
        this.f78966a = drVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C29045l.m53933e(th, "%s: Unable to create symlink structure, cleaning up symlinks...", "FileGroupManager");
        try {
            C29117fe feVar = this.f78967b;
            C29099m.m54010f(feVar.f78972a, feVar.f78981j, this.f78966a, feVar.f78978g);
        } catch (IOException e) {
            C29045l.m53933e(e, "%s: Unable to clean up symlink structure after failure", "FileGroupManager");
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
    }
}
