package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas;

import android.content.Context;
import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126985f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126988i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.base.C58852bp;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.m */
/* compiled from: PG */
public final /* synthetic */ class C129793m implements C58852bp {

    /* renamed from: a */
    public final /* synthetic */ C129739aa f356133a;

    public /* synthetic */ C129793m(C129739aa aaVar) {
        this.f356133a = aaVar;
    }

    /* renamed from: a */
    public final void mo40846a(Object obj) {
        C34822b bVar;
        C129739aa aaVar = this.f356133a;
        C126988i iVar = (C126988i) obj;
        if (!iVar.equals(C126988i.f349669h)) {
            C126985f a = C126985f.m207727a(iVar.f349676f);
            if (a == null) {
                a = C126985f.ERROR_UNKNOWN;
            }
            if (a != C126985f.ERROR_TIMEOUT) {
                C59052c cVar = (C59052c) ((C59052c) C129739aa.f356023a.mo56226d()).mo56372aa(38418);
                C126985f a2 = C126985f.m207727a(iVar.f349676f);
                if (a2 == null) {
                    a2 = C126985f.ERROR_UNKNOWN;
                }
                int i = a2.f349668l;
                if (iVar.f349672b == 2) {
                    bVar = (C34822b) iVar.f349673c;
                } else {
                    bVar = C34822b.f92358d;
                }
                C34834b bVar2 = bVar.f92362c;
                if (bVar2 == null) {
                    bVar2 = C34834b.f92401c;
                }
                cVar.mo56393w("Error encountered in ImmersiveCanvas, %d, %d", i, bVar2.f92404b);
                if (aaVar.f356025b.getView() != null) {
                    View view = aaVar.f356025b.getView();
                    view.getClass();
                    Snackbar.m79661q((Context) null, view, aaVar.f356025b.getResources().getString(R.string.assistant_canvas_snack_bar_error), 0).mo48343h();
                }
            }
        }
    }
}
