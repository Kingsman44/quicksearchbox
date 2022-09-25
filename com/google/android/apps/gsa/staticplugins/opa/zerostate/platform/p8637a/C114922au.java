package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.util.p7162d.C90962a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.au */
/* compiled from: PG */
public final class C114922au {

    /* renamed from: a */
    public final ViewGroup f318858a;

    /* renamed from: b */
    public final C28293k f318859b;

    public C114922au(Context context, C114948z zVar, C114919ar arVar, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(new ContextThemeWrapper(context, 2132148450)).inflate(R.layout.zero_state_speed_dial_layout, viewGroup, false);
        this.f318858a = viewGroup2;
        FloatingActionButton floatingActionButton = (FloatingActionButton) viewGroup2.findViewById(R.id.zero_state_fab);
        if (C90962a.m148577a(arVar.f318856a)) {
            floatingActionButton.getClass();
            floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(C1878d.m5128a(context, R.color.zero_state_fab_button_dark_color)));
        }
        C28292j jVar = new C28292j(81091);
        jVar.mo33795i(5);
        floatingActionButton.getClass();
        C28295m.m52919e(floatingActionButton, jVar);
        C28293k e = C28293k.m52908e(jVar, new C28293k[0]);
        this.f318859b = e;
        zVar.f318944b = e;
        floatingActionButton.setOnClickListener(new C89943l(new C114921at(zVar)));
    }
}
