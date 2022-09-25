package com.google.android.apps.search.assistant.verticals.p9880a.p9884c;

import com.google.assistant.p3931f.p3939c.C52829f;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.c.d */
/* compiled from: PG */
final class C130354d extends C130336a {

    /* renamed from: a */
    private C52829f f357261a;

    /* renamed from: b */
    private Optional f357262b = Optional.empty();

    /* renamed from: c */
    private Optional f357263c = Optional.empty();

    /* renamed from: d */
    private Optional f357264d = Optional.empty();

    /* renamed from: a */
    public final C130348b mo109666a() {
        C52829f fVar = this.f357261a;
        if (fVar != null) {
            return new C130355e(fVar, this.f357262b, this.f357263c, this.f357264d);
        }
        throw new IllegalStateException("Missing required properties: appActionsContext");
    }

    /* renamed from: b */
    public final void mo109667b(Optional optional) {
        if (optional != null) {
            this.f357263c = optional;
            return;
        }
        throw new NullPointerException("Null activityClassName");
    }

    /* renamed from: c */
    public final void mo109668c(C52829f fVar) {
        if (fVar != null) {
            this.f357261a = fVar;
            return;
        }
        throw new NullPointerException("Null appActionsContext");
    }

    /* renamed from: d */
    public final void mo109669d(Optional optional) {
        if (optional != null) {
            this.f357262b = optional;
            return;
        }
        throw new NullPointerException("Null appPackageName");
    }

    /* renamed from: e */
    public final void mo109670e(Optional optional) {
        if (optional != null) {
            this.f357264d = optional;
            return;
        }
        throw new NullPointerException("Null directAction");
    }
}
