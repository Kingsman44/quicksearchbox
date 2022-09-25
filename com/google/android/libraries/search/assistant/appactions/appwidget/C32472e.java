package com.google.android.libraries.search.assistant.appactions.appwidget;

import android.content.ComponentName;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.appactions.appwidget.e */
/* compiled from: PG */
public abstract class C32472e {
    /* renamed from: a */
    public abstract C32473f mo38087a();

    /* renamed from: b */
    public final C32473f mo38088b() {
        if (mo38089c().isPresent()) {
            mo38092f(((ComponentName) mo38089c().get()).getPackageName());
        }
        if (!mo38090d().isEmpty()) {
            return mo38087a();
        }
        throw new IllegalStateException("Either packageName or componentName should be specified");
    }

    /* renamed from: c */
    public abstract Optional mo38089c();

    /* renamed from: d */
    public abstract String mo38090d();

    /* renamed from: e */
    public abstract void mo38091e(ComponentName componentName);

    /* renamed from: f */
    public abstract void mo38092f(String str);
}
