package com.google.android.apps.search.faceviewer;

import android.content.Context;
import android.content.DialogInterface;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p579ar.sceneviewer.common.C10678R;
import com.google.android.material.p3506c.C44581b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.faceviewer.b */
/* compiled from: PG */
final class C132676b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Context f362055a;

    public C132676b(Context context) {
        this.f362055a = context;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) C132678c.f362061a.mo56225c()).mo56372aa(39788)).mo56386p("Failed to get device compatibility info.");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            C44581b bVar = new C44581b(this.f362055a, C10678R.style.ThemeOverlay_GoogleMaterial_MaterialAlertDialog_Centered);
            bVar.mo47602u("Close", (DialogInterface.OnClickListener) null);
            bVar.mo47605x(" ");
            bVar.f1347a.f1326g = "This experience doesn't work on your phone yet.";
            bVar.f1347a.f1323d = this.f362055a.getResources().getDrawable(R.drawable.quantum_gm_ic_perm_device_information_gm_blue_24);
            bVar.create().show();
        }
    }
}
