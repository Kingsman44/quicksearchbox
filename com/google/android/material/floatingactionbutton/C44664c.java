package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.google.android.material.p3504a.C44498c;
import com.google.android.material.p3504a.C44502g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.material.floatingactionbutton.c */
/* compiled from: PG */
abstract class C44664c implements C44661ad {

    /* renamed from: a */
    public final ExtendedFloatingActionButton f116425a;

    /* renamed from: b */
    public final C44657a f116426b;

    /* renamed from: c */
    public C44502g f116427c;

    /* renamed from: d */
    private final Context f116428d;

    /* renamed from: e */
    private final ArrayList f116429e = new ArrayList();

    /* renamed from: f */
    private C44502g f116430f;

    public C44664c(ExtendedFloatingActionButton extendedFloatingActionButton, C44657a aVar) {
        this.f116425a = extendedFloatingActionButton;
        this.f116428d = extendedFloatingActionButton.getContext();
        this.f116426b = aVar;
    }

    /* renamed from: a */
    public AnimatorSet mo47937a() {
        return mo47948b(mo47949c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final AnimatorSet mo47948b(C44502g gVar) {
        ArrayList arrayList = new ArrayList();
        if (gVar.mo47380e("opacity")) {
            arrayList.add(gVar.mo47378a("opacity", this.f116425a, View.ALPHA));
        }
        if (gVar.mo47380e("scale")) {
            arrayList.add(gVar.mo47378a("scale", this.f116425a, View.SCALE_Y));
            arrayList.add(gVar.mo47378a("scale", this.f116425a, View.SCALE_X));
        }
        if (gVar.mo47380e("width")) {
            arrayList.add(gVar.mo47378a("width", this.f116425a, ExtendedFloatingActionButton.f116345h));
        }
        if (gVar.mo47380e("height")) {
            arrayList.add(gVar.mo47378a("height", this.f116425a, ExtendedFloatingActionButton.f116346i));
        }
        if (gVar.mo47380e("paddingStart")) {
            arrayList.add(gVar.mo47378a("paddingStart", this.f116425a, ExtendedFloatingActionButton.f116347j));
        }
        if (gVar.mo47380e("paddingEnd")) {
            arrayList.add(gVar.mo47378a("paddingEnd", this.f116425a, ExtendedFloatingActionButton.f116348k));
        }
        if (gVar.mo47380e("labelOpacity")) {
            arrayList.add(gVar.mo47378a("labelOpacity", this.f116425a, new C44663b(this, Float.class)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C44498c.m78600a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: c */
    public final C44502g mo47949c() {
        C44502g gVar = this.f116427c;
        if (gVar != null) {
            return gVar;
        }
        if (this.f116430f == null) {
            this.f116430f = C44502g.m78604c(this.f116428d, mo47942h());
        }
        C44502g gVar2 = this.f116430f;
        gVar2.getClass();
        return gVar2;
    }

    /* renamed from: d */
    public final List mo47938d() {
        return this.f116429e;
    }

    /* renamed from: e */
    public void mo47939e() {
        this.f116426b.f116382a = null;
    }

    /* renamed from: f */
    public void mo47940f() {
        throw null;
    }

    /* renamed from: g */
    public void mo47941g(Animator animator) {
        throw null;
    }
}
