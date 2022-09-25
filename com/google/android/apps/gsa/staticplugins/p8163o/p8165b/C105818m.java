package com.google.android.apps.gsa.staticplugins.p8163o.p8165b;

import android.os.Handler;
import androidx.media3.p132b.C2495an;
import androidx.media3.p132b.C2505i;
import androidx.media3.p132b.C2510n;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.b.m */
/* compiled from: PG */
final class C105818m extends C105822q {

    /* renamed from: a */
    final /* synthetic */ C105823r f295202a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105818m(C105823r rVar, C58833ax axVar) {
        super(axVar);
        this.f295202a = rVar;
    }

    /* renamed from: b */
    public final void mo5924b(C2505i iVar, C2510n nVar, boolean z) {
        C58833ax axVar = this.f295206b;
        if (axVar.mo56113h()) {
            ((C2495an) axVar.mo56107c()).mo5924b(iVar, nVar, z);
        }
        C105823r rVar = this.f295202a;
        rVar.f295213g.mo95074c();
        if (rVar.f295215i.mo56113h()) {
            for (int i = 1; i < 3; i++) {
                ((Handler) rVar.f295215i.mo56107c()).postDelayed(new C105817l(rVar), (long) (i * SimpleSnackbar.LENGTH_SHORT));
            }
        }
    }
}
