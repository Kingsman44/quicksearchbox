package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.p8688a;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.recently.p8678a.C116018a;
import com.google.android.apps.gsa.staticplugins.recently.p8678a.C116019b;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116214f;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.a.k */
/* compiled from: PG */
public abstract class C116145k implements C116018a {

    /* renamed from: a */
    private View f322067a;

    /* renamed from: b */
    private boolean f322068b;

    /* renamed from: d */
    public void mo102411d(float f, View view) {
        View view2 = this.f322067a;
        if (view2 != null) {
            int i = 4;
            if (!this.f322068b && f < 1.0f) {
                i = 0;
            }
            view2.setVisibility(i);
        }
    }

    /* renamed from: f */
    public void mo102413f(View view, C116019b bVar, C116226r rVar, C116214f fVar) {
        this.f322067a = view.findViewById(R.id.entry_fake_shadow);
        this.f322068b = fVar.f322256e == rVar.f322282c.size() + -1;
    }
}
