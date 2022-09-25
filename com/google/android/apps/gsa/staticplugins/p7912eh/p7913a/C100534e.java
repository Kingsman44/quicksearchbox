package com.google.android.apps.gsa.staticplugins.p7912eh.p7913a;

import androidx.mediarouter.p175a.C3665aa;
import androidx.mediarouter.p175a.C3685au;
import com.google.android.apps.gsa.search.shared.media.C87597u;
import com.google.android.libraries.gcoreclient.cast.GcoreCastDevice;
import com.google.android.libraries.gcoreclient.cast.impl.BaseGcoreCastDeviceImpl;
import com.google.android.libraries.gcoreclient.cast.impl.C21480a;

/* renamed from: com.google.android.apps.gsa.staticplugins.eh.a.e */
/* compiled from: PG */
final class C100534e extends C3665aa {

    /* renamed from: a */
    final /* synthetic */ C100535f f281077a;

    public C100534e(C100535f fVar) {
        this.f281077a = fVar;
    }

    /* renamed from: d */
    public final void mo7712d(C3685au auVar) {
        GcoreCastDevice a = C21480a.m40590a(auVar.f11876p);
        this.f281077a.f281081d.mo91960b(true);
        C100535f fVar = this.f281077a;
        fVar.f281086i = true;
        C100537h hVar = fVar.f281087j;
        if (hVar != null) {
            BaseGcoreCastDeviceImpl baseGcoreCastDeviceImpl = (BaseGcoreCastDeviceImpl) a;
            C87597u uVar = new C87597u(baseGcoreCastDeviceImpl.f59914a.mo118383c(), baseGcoreCastDeviceImpl.f59914a.f388602d);
            hVar.f281093e.add(uVar);
            if (uVar.f236667b.equals(hVar.f281092d)) {
                hVar.f281091c.mo91958a();
                hVar.f281090b.countDown();
            }
        }
    }
}
