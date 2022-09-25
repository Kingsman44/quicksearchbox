package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1094e;

import android.transition.Fade;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14128bb;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14615pu;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.e.al */
/* compiled from: PG */
public final class C15284al {

    /* renamed from: a */
    public final C14986h f45894a;

    /* renamed from: b */
    public final C15352z f45895b;

    /* renamed from: c */
    public final C86124t f45896c;

    /* renamed from: d */
    public C14615pu f45897d;

    /* renamed from: e */
    public ViewGroup f45898e;

    /* renamed from: f */
    public int f45899f = 1;

    /* renamed from: g */
    private final C14132bf f45900g;

    public C15284al(C14986h hVar, C14132bf bfVar, C15352z zVar, C86124t tVar) {
        this.f45894a = hVar;
        this.f45900g = bfVar;
        this.f45895b = zVar;
        this.f45896c = tVar;
    }

    /* renamed from: a */
    public final void mo22167a(View view) {
        if (this.f45896c.mo79746e(C90051dc.f248924u)) {
            this.f45900g.mo21444a(view, 153110);
            return;
        }
        int i = this.f45899f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            this.f45900g.mo21444a(view, 119950);
        } else if (i2 == 2 || i2 == 3) {
            this.f45900g.mo21444a(view, 124803);
        }
    }

    /* renamed from: b */
    public final void mo22168b(int i, View view) {
        view.setOnClickListener(new C14128bb(this.f45900g, new C15281ai(this, i)));
    }

    /* renamed from: c */
    public final void mo22169c(int i, ViewGroup viewGroup, View view, ContextThemeWrapper contextThemeWrapper) {
        Scene scene = new Scene(viewGroup, view);
        Fade fade = new Fade();
        fade.setDuration((long) contextThemeWrapper.getResources().getInteger(R.integer.motion_fast02));
        fade.setInterpolator(new LinearInterpolator());
        TransitionManager.go(scene, fade);
        mo22168b(i, view.findViewById(R.id.message_tile));
        mo22167a(view.findViewById(R.id.message_tile));
    }
}
