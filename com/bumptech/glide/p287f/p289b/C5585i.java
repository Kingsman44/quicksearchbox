package com.bumptech.glide.p287f.p289b;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.p1728g.C21190r;
import com.google.android.libraries.elements.p1728g.C21193u;

/* renamed from: com.bumptech.glide.f.b.i */
/* compiled from: PG */
public final class C5585i implements C5582f {
    /* renamed from: a */
    public final boolean mo12028a(Object obj, C5581e eVar) {
        if (eVar.mo12029m() == null) {
            return false;
        }
        View m = eVar.mo12029m();
        int i = C21193u.f59456a;
        m.clearAnimation();
        Animation loadAnimation = AnimationUtils.loadAnimation(m.getContext(), R.anim.fade_in_elements);
        loadAnimation.setAnimationListener(new C21190r(m));
        m.startAnimation(loadAnimation);
        return false;
    }
}
