package com.google.android.libraries.lens.view.infopanel.p2140b;

import android.app.Dialog;
import android.support.p031v4.app.C0260w;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28456a;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28459d;
import com.google.apps.tiktok.account.p3603a.C45954d;

/* renamed from: com.google.android.libraries.lens.view.infopanel.b.k */
/* compiled from: PG */
public final /* synthetic */ class C27023k implements C28456a {

    /* renamed from: a */
    public final /* synthetic */ C27024l f73661a;

    public /* synthetic */ C27023k(C27024l lVar) {
        this.f73661a = lVar;
    }

    /* renamed from: a */
    public final void mo18181a(Dialog dialog, View view) {
        ImageButton imageButton;
        C27024l lVar = this.f73661a;
        C28306ab abVar = lVar.f73666e;
        C28313c a = lVar.f73668g.mo33805a(C28427h.m53115a(126260));
        a.mo33859g(C45954d.m82060a(lVar.f73667f.f69824a));
        abVar.mo33801b(view, a);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.interstitial_toolbar);
        int i = 0;
        while (true) {
            if (i >= viewGroup.getChildCount()) {
                imageButton = null;
                break;
            } else if (viewGroup.getChildAt(i) instanceof ImageButton) {
                imageButton = (ImageButton) viewGroup.getChildAt(i);
                break;
            } else {
                i++;
            }
        }
        if (imageButton != null) {
            lVar.f73666e.mo33801b(imageButton, lVar.f73668g.mo33805a(C28427h.m53115a(127514)));
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18182b(C0260w wVar) {
        C28459d.m53188c(wVar);
    }
}
