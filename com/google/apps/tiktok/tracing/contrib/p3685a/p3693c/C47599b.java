package com.google.apps.tiktok.tracing.contrib.p3685a.p3693c;

import android.transition.Transition;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.tracing.contrib.a.c.b */
/* compiled from: PG */
public final class C47599b implements Transition.TransitionListener {

    /* renamed from: a */
    final /* synthetic */ Transition.TransitionListener f123519a;

    /* renamed from: b */
    final /* synthetic */ String f123520b;

    /* renamed from: c */
    final /* synthetic */ C47600c f123521c;

    public C47599b(C47600c cVar, Transition.TransitionListener transitionListener, String str) {
        this.f123521c = cVar;
        this.f123519a = transitionListener;
        this.f123520b = str;
    }

    public final void onTransitionCancel(Transition transition) {
        if (C47831fm.m85027v()) {
            this.f123519a.onTransitionCancel(transition);
            return;
        }
        C47538ax c = this.f123521c.f123522a.mo51613c(this.f123520b);
        try {
            this.f123519a.onTransitionCancel(transition);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47598a.m84695a(th, th);
        }
        throw th;
    }

    public final void onTransitionEnd(Transition transition) {
        if (C47831fm.m85027v()) {
            this.f123519a.onTransitionEnd(transition);
            return;
        }
        C47538ax c = this.f123521c.f123522a.mo51613c(this.f123520b);
        try {
            this.f123519a.onTransitionEnd(transition);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47598a.m84695a(th, th);
        }
        throw th;
    }

    public final void onTransitionPause(Transition transition) {
        if (C47831fm.m85027v()) {
            this.f123519a.onTransitionPause(transition);
            return;
        }
        C47538ax c = this.f123521c.f123522a.mo51613c(this.f123520b);
        try {
            this.f123519a.onTransitionPause(transition);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47598a.m84695a(th, th);
        }
        throw th;
    }

    public final void onTransitionResume(Transition transition) {
        if (C47831fm.m85027v()) {
            this.f123519a.onTransitionResume(transition);
            return;
        }
        C47538ax c = this.f123521c.f123522a.mo51613c(this.f123520b);
        try {
            this.f123519a.onTransitionResume(transition);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47598a.m84695a(th, th);
        }
        throw th;
    }

    public final void onTransitionStart(Transition transition) {
        if (C47831fm.m85027v()) {
            this.f123519a.onTransitionStart(transition);
            return;
        }
        C47538ax c = this.f123521c.f123522a.mo51613c(this.f123520b);
        try {
            this.f123519a.onTransitionStart(transition);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47598a.m84695a(th, th);
        }
        throw th;
    }
}
