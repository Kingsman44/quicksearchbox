package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.aa */
/* compiled from: PG */
public final class C114096aa {

    /* renamed from: a */
    public static final LinearInterpolator f316179a = new LinearInterpolator();

    /* renamed from: b */
    public AnimatorSet f316180b;

    /* renamed from: c */
    public boolean f316181c;

    /* renamed from: d */
    public final C114095a f316182d;

    /* renamed from: e */
    public final ValyrianRecyclerView f316183e;

    /* renamed from: f */
    public final Collection f316184f = new ArrayList();

    /* renamed from: g */
    public C60870cx f316185g;

    /* renamed from: h */
    public final C22871g f316186h;

    public C114096aa(C114095a aVar, ValyrianRecyclerView valyrianRecyclerView, C22871g gVar) {
        this.f316182d = aVar;
        this.f316183e = valyrianRecyclerView;
        this.f316186h = gVar;
    }

    /* renamed from: a */
    public static int m189227a(View view, ViewGroup viewGroup) {
        if (view.getParent() == viewGroup) {
            return view.getLeft();
        }
        return view.getLeft() + m189227a((View) view.getParent(), viewGroup);
    }

    /* renamed from: b */
    public static int m189228b(View view, ViewGroup viewGroup) {
        if (view.getParent() == viewGroup) {
            return view.getTop();
        }
        return view.getTop() + m189228b((View) view.getParent(), viewGroup);
    }
}
