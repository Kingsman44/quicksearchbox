package com.google.android.libraries.lens.view.onboarding;

import android.app.Dialog;
import android.support.p031v4.app.Fragment;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2078at.C25502ah;
import com.google.android.libraries.lens.view.sampleimages.C27701e;
import com.google.android.libraries.lens.view.sampleimages.C27707k;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.lens.view.onboarding.u */
/* compiled from: PG */
public final /* synthetic */ class C27523u implements C25502ah {

    /* renamed from: a */
    public final /* synthetic */ C27525w f75270a;

    /* renamed from: b */
    public final /* synthetic */ boolean f75271b;

    /* renamed from: c */
    public final /* synthetic */ int f75272c;

    public /* synthetic */ C27523u(C27525w wVar, boolean z, int i) {
        this.f75270a = wVar;
        this.f75271b = z;
        this.f75272c = i;
    }

    /* renamed from: a */
    public final void mo30529a(boolean z) {
        C27525w wVar = this.f75270a;
        boolean z2 = this.f75271b;
        int i = this.f75272c;
        wVar.f75294r = false;
        if (!z) {
            wVar.mo33064g();
            Fragment a = wVar.mo33059a();
            if (a instanceof C27701e) {
                C27707k a2 = ((C27701e) a).mo17754z();
                a2.f75651c = wVar.mo33073p(wVar.f75289m.mo30532b());
                Dialog dialog = a2.f75649a.getDialog();
                if (dialog != null) {
                    a2.mo33186a(dialog.findViewById(R.id.sample_images_post_result_dialog));
                }
            }
        } else if (wVar.f75289m.mo30536f("android.permission.CAMERA")) {
            wVar.mo33063f(C62722b.OK);
            wVar.mo33066i();
        } else if (z2) {
            wVar.mo33068k(false, false, i);
        } else {
            wVar.mo33064g();
        }
        wVar.mo33060c();
    }
}
