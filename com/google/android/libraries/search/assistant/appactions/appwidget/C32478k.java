package com.google.android.libraries.search.assistant.appactions.appwidget;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2384o;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.appactions.appwidget.k */
/* compiled from: PG */
public final class C32478k {

    /* renamed from: a */
    public final C2384o f87034a;

    /* renamed from: b */
    public final Fragment f87035b;

    /* renamed from: c */
    public final Context f87036c;

    /* renamed from: d */
    public final Executor f87037d;

    public C32478k(C2384o oVar, Executor executor, Fragment fragment) {
        this.f87036c = fragment.requireContext();
        this.f87034a = oVar;
        this.f87035b = fragment;
        this.f87037d = executor;
    }
}
