package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9769h;

import android.os.Build;
import android.support.p031v4.app.Fragment;
import android.view.Display;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.h.c */
/* compiled from: PG */
public final class C128905c {

    /* renamed from: a */
    public Animation f354246a;

    /* renamed from: b */
    public C128920q f354247b;

    /* renamed from: c */
    private final C47215a f354248c;

    public C128905c(C47215a aVar) {
        C69664n.m101061g(aVar, "fragmentHost");
        this.f354248c = aVar;
    }

    /* renamed from: d */
    private final int m210390d() {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                Display display = this.f354248c.mo51121p().getDisplay();
                if (display != null) {
                    return display.getState();
                }
                return 0;
            } catch (UnsupportedOperationException unused) {
            }
        }
        return this.f354248c.mo51123r().getWindowManager().getDefaultDisplay().getState();
    }

    /* renamed from: a */
    public final Animation mo108739a(Fragment fragment, int i, boolean z) {
        if (i == 0) {
            mo108740b(z);
            return null;
        } else if (m210390d() != 2) {
            mo108740b(z);
            return null;
        } else {
            Animation loadAnimation = AnimationUtils.loadAnimation(fragment.requireContext(), i);
            this.f354246a = loadAnimation;
            if (loadAnimation != null) {
                loadAnimation.setAnimationListener(C47810es.m84962b(new C128904b(this, z)));
            }
            return this.f354246a;
        }
    }

    /* renamed from: b */
    public final void mo108740b(boolean z) {
        if (!z) {
            C128920q qVar = this.f354247b;
            if (qVar != null) {
                C59071e eVar = C128914l.f354267a;
                C128913k.m210424a(qVar.f354291a);
            }
            this.f354247b = null;
        }
    }

    /* renamed from: c */
    public final void mo108741c() {
        Animation animation;
        Animation animation2 = this.f354246a;
        if (animation2 != null && !animation2.hasEnded() && (animation = this.f354246a) != null) {
            animation.cancel();
        }
    }
}
