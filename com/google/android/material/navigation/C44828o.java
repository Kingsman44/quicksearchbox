package com.google.android.material.navigation;

import android.app.Activity;
import android.graphics.Color;
import android.view.ViewTreeObserver;
import com.google.android.material.internal.C44714am;
import com.google.android.material.internal.C44748h;

/* renamed from: com.google.android.material.navigation.o */
/* compiled from: PG */
final class C44828o implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ NavigationView f116959a;

    public C44828o(NavigationView navigationView) {
        this.f116959a = navigationView;
    }

    public final void onGlobalLayout() {
        NavigationView navigationView = this.f116959a;
        navigationView.getLocationOnScreen(navigationView.f116876h);
        NavigationView navigationView2 = this.f116959a;
        boolean z = true;
        boolean z2 = navigationView2.f116876h[1] == 0;
        C44714am amVar = navigationView2.f116874f;
        if (amVar.f116562v != z2) {
            amVar.f116562v = z2;
            amVar.mo48023q();
        }
        NavigationView navigationView3 = this.f116959a;
        navigationView3.f116576c = z2 && navigationView3.f116877i;
        Activity a = C44748h.m79352a(navigationView3.getContext());
        if (a != null) {
            int height = a.findViewById(16908290).getHeight();
            int height2 = this.f116959a.getHeight();
            int alpha = Color.alpha(a.getWindow().getNavigationBarColor());
            NavigationView navigationView4 = this.f116959a;
            if (height != height2 || alpha == 0 || !navigationView4.f116878j) {
                z = false;
            }
            navigationView4.f116577d = z;
        }
    }
}
