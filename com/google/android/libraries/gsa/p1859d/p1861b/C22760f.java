package com.google.android.libraries.gsa.p1859d.p1861b;

import android.app.FragmentManager;
import android.content.res.Configuration;
import android.support.p033v7.app.C0395p;
import android.view.View;
import android.view.Window;

/* renamed from: com.google.android.libraries.gsa.d.b.f */
/* compiled from: PG */
public class C22760f extends C0395p {

    /* renamed from: j */
    protected final C22768n f62642j;

    /* renamed from: k */
    private final int f62643k;

    public C22760f(C22768n nVar) {
        this.f62642j = nVar;
        int i = nVar.getResources().getConfiguration().uiMode & 48;
        this.f62643k = i;
        attachBaseContext(nVar);
        Configuration configuration = nVar.getResources().getConfiguration();
        configuration.uiMode &= -49;
        configuration.uiMode = i | configuration.uiMode;
    }

    public final View findViewById(int i) {
        return this.f62642j.f62639aa.findViewById(i);
    }

    public final FragmentManager getFragmentManager() {
        return null;
    }

    public final Window getWindow() {
        return this.f62642j.f62639aa;
    }

    /* renamed from: jw */
    public android.support.p031v4.app.FragmentManager mo545jw() {
        return null;
    }

    public void onDestroy() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onStop() {
    }
}
