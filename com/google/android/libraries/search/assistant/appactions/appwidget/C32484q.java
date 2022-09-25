package com.google.android.libraries.search.assistant.appactions.appwidget;

import android.content.ComponentName;
import com.google.assistant.p3931f.p3939c.C52846w;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.appactions.appwidget.q */
/* compiled from: PG */
public final class C32484q extends C32472e {

    /* renamed from: a */
    public String f87050a;

    /* renamed from: b */
    public ComponentName f87051b;

    /* renamed from: c */
    public C52846w f87052c;

    /* renamed from: d */
    public Consumer f87053d;

    public C32484q() {
    }

    public C32484q(C32473f fVar) {
        C32485r rVar = (C32485r) fVar;
        this.f87050a = rVar.f87054a;
        this.f87051b = rVar.f87055b;
        this.f87052c = rVar.f87056c;
        this.f87053d = rVar.f87057d;
    }

    /* renamed from: a */
    public final C32473f mo38087a() {
        String str = this.f87050a;
        if (str != null) {
            return new C32485r(str, this.f87051b, this.f87052c, this.f87053d);
        }
        throw new IllegalStateException("Missing required properties: packageName");
    }

    /* renamed from: c */
    public final Optional mo38089c() {
        ComponentName componentName = this.f87051b;
        if (componentName == null) {
            return Optional.empty();
        }
        return Optional.m71637of(componentName);
    }

    /* renamed from: d */
    public final String mo38090d() {
        String str = this.f87050a;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"packageName\" has not been set");
    }

    /* renamed from: e */
    public final void mo38091e(ComponentName componentName) {
        this.f87051b = componentName;
    }

    /* renamed from: f */
    public final void mo38092f(String str) {
        if (str != null) {
            this.f87050a = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }
}
