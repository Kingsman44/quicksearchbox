package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* renamed from: com.google.common.util.concurrent.bl */
/* compiled from: PG */
final class C60831bl implements C60930r {

    /* renamed from: a */
    final /* synthetic */ Callable f164909a;

    public C60831bl(Callable callable) {
        this.f164909a = callable;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        return C60856cj.m92900i(this.f164909a.call());
    }

    public final String toString() {
        return this.f164909a.toString();
    }
}
