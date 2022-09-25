package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8160b.p8161a;

import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.b.a.k */
/* compiled from: PG */
public final /* synthetic */ class C105732k implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C105733l f295079a;

    public /* synthetic */ C105732k(C105733l lVar) {
        this.f295079a = lVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C105733l lVar = this.f295079a;
        Integer num = (Integer) obj;
        if (num.intValue() == -1) {
            num = Integer.valueOf(lVar.f295080a.getResources().getDimensionPixelOffset(R.dimen.default_spacer_space));
        } else {
            boolean z = false;
            if (num.intValue() == -3) {
                num = 0;
            } else if (num.intValue() == -2 || num.intValue() == -4) {
                if (num.intValue() == -4) {
                    z = true;
                }
                if (lVar.f295082c == null) {
                    lVar.f295082c = new C105731j(lVar, z);
                    lVar.f295083d.mo83994a(lVar.f295082c);
                    return;
                }
                return;
            }
        }
        lVar.f295081b.setLayoutParams(new FrameLayout.LayoutParams(-1, num.intValue()));
    }
}
