package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.z */
/* compiled from: PG */
public final /* synthetic */ class C18911z implements Function {

    /* renamed from: a */
    public final /* synthetic */ C18820at f53198a;

    /* renamed from: b */
    public final /* synthetic */ ComponentName f53199b;

    public /* synthetic */ C18911z(C18820at atVar, ComponentName componentName) {
        this.f53198a = atVar;
        this.f53199b = componentName;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C18820at atVar = this.f53198a;
        C0320v vVar = (C0320v) obj;
        if (!this.f53199b.getPackageName().equals("com.spotify.music") || !((Boolean) atVar.f52987p.mo17428b()).booleanValue()) {
            return Optional.empty();
        }
        PlaybackStateCompat f = vVar.mo1038f();
        if (f == null) {
            return Optional.empty();
        }
        return Optional.m71637of(f);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
