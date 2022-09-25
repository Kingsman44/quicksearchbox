package com.google.android.apps.search.podcasts.language;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.search.podcasts.language.p10577a.C140517b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C44565p;
import com.google.android.material.p3515l.C44779j;
import com.google.apps.tiktok.tracing.C47591co;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.language.h */
/* compiled from: PG */
final class C140543h implements DialogInterface.OnShowListener {

    /* renamed from: a */
    final /* synthetic */ C140539e f381713a;

    public C140543h(C140539e eVar) {
        this.f381713a = eVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C69664n.m101059e(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        C44565p pVar = (C44565p) dialogInterface;
        View e = pVar.mo1197b().mo1177e(R.id.coordinator);
        C69664n.m101058d(e);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) e;
        Dialog dialog = (Dialog) dialogInterface;
        View e2 = C140539e.m228248e(dialog);
        e2.getLayoutParams().height = -1;
        int i = 0;
        View inflate = pVar.getLayoutInflater().inflate(R.layout.podcasts_language_dialog_save_button, coordinatorLayout, false);
        inflate.setElevation(e2.getElevation());
        inflate.setBackground(C44779j.m79382O(inflate.getContext(), e2.getElevation()));
        coordinatorLayout.addView(inflate);
        View findViewById = dialog.findViewById(R.id.podcasts_save_languages_button);
        C69664n.m101058d(findViewById);
        C140539e eVar = this.f381713a;
        findViewById.setOnClickListener(new C47591co(eVar.f381704f, "Clicks on save languages button", new C140541f(eVar, dialogInterface)));
        C140517b bVar = eVar.f381705g;
        findViewById.setEnabled(bVar != null && bVar.f381654b);
        BottomSheetBehavior C = BottomSheetBehavior.m78767C(e2);
        C140539e eVar2 = this.f381713a;
        C.mo47506D(new C140542g(eVar2, inflate));
        if (eVar2.f381700b.requireContext().getResources().getConfiguration().orientation == 2) {
            C.mo47519v(3);
            C.f115860C = true;
        }
        C69664n.m101060f(C, "from(containerLayout).ap…            }\n          }");
        C140539e eVar3 = this.f381713a;
        if (C.f115862E == 3) {
            i = 4;
        }
        eVar3.mo115724d(i);
    }
}
