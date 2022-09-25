package com.google.android.libraries.lens.view.gallery;

import android.view.View;
import androidx.lifecycle.C2333ah;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.gallery.p2112e.C26408a;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.libraries.lens.view.gallery.o */
/* compiled from: PG */
public final /* synthetic */ class C26428o implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C26299ac f71916a;

    public /* synthetic */ C26428o(C26299ac acVar) {
        this.f71916a = acVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C26299ac acVar = this.f71916a;
        C58528ij ijVar = (C58528ij) obj;
        C26408a aVar = acVar.f71477I;
        aVar.getClass();
        boolean contains = ijVar.contains("android.permission.CAMERA");
        if (contains != aVar.f71848c) {
            aVar.f71848c = contains;
            aVar.invalidateSelf();
        }
        if (acVar.f71502j) {
            boolean contains2 = ijVar.contains(acVar.f71503k.mo30532b());
            int i = 0;
            acVar.f71495c.requireView().findViewById(R.id.lens_camera_cutout_text).setVisibility(true != contains2 ? 4 : 0);
            View findViewById = acVar.f71495c.requireView().findViewById(R.id.lens_gallery_floating_permission_button);
            if (acVar.f71501i && findViewById != null) {
                if (true == contains2) {
                    i = 8;
                }
                findViewById.setVisibility(i);
            }
        }
    }
}
