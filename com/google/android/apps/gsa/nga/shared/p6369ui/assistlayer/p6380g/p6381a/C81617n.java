package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6380g.p6381a;

import android.content.res.ColorStateList;
import android.widget.ImageView;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80736dk;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80760eh;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81966ac;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6406c.C82194a;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.g.a.n */
/* compiled from: PG */
public final /* synthetic */ class C81617n implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81603ae f223268a;

    /* renamed from: b */
    public final /* synthetic */ ImageView f223269b;

    public /* synthetic */ C81617n(C81603ae aeVar, ImageView imageView) {
        this.f223268a = aeVar;
        this.f223269b = imageView;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        int i;
        C81603ae aeVar = this.f223268a;
        ImageView imageView = this.f223269b;
        C80760eh ehVar = (C80760eh) obj;
        if (ehVar.equals(C80760eh.f221668f)) {
            C81603ae.m129746j(aeVar.mo75202b(imageView), 0.0f, aeVar.mo75204f(C81603ae.f223223c));
        } else {
            C81603ae.m129746j(aeVar.mo75202b(imageView), 1.0f, aeVar.mo75204f(C81603ae.f223222b));
            imageView.setContentDescription(ehVar.f221674e);
            imageView.setOnClickListener(new C81622s(aeVar, imageView, ehVar));
        }
        C80736dk dkVar = ehVar.f221672c;
        if (dkVar == null) {
            dkVar = C80736dk.f221621c;
        }
        if (dkVar.f221624b != 0) {
            if (aeVar.f223234n.mo93971b()) {
                C82194a.m130507f(imageView, 1);
            } else {
                C82194a.m130507f(imageView, 2);
            }
            i = dkVar.f221624b;
        } else {
            imageView.setImageTintList((ColorStateList) null);
            i = dkVar.f221623a;
        }
        ImageView imageView2 = (ImageView) imageView.findViewById(R.id.nga_input_plate_right_icon);
        aeVar.f223233m.ifPresent(new C81621r(C81966ac.m130206a(imageView2, i), imageView2));
    }
}
