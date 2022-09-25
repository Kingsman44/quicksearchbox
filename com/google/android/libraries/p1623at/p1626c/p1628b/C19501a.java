package com.google.android.libraries.p1623at.p1626c.p1628b;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.C3983ai;
import com.google.android.libraries.p1623at.p1626c.C19491ar;
import com.google.android.libraries.p1623at.p1626c.p1629c.C19528h;

/* renamed from: com.google.android.libraries.at.c.b.a */
/* compiled from: PG */
public abstract class C19501a extends C3983ai {

    /* renamed from: e */
    protected final C19491ar f54439e = new C19491ar();

    public void onActivityCreated(Bundle bundle) {
        this.f54439e.mo24713a(bundle);
        super.onActivityCreated(bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f54439e.mo24727J();
    }

    public void onAttach(Activity activity) {
        this.f54439e.mo24719j();
        super.onAttach(activity);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.f54439e.mo24728K();
        super.onConfigurationChanged(configuration);
    }

    public final boolean onContextItemSelected(MenuItem menuItem) {
        if (this.f54439e.mo24729L()) {
            return true;
        }
        return super.onContextItemSelected(menuItem);
    }

    public void onCreate(Bundle bundle) {
        this.f54439e.mo24735x(bundle);
        super.onCreate(bundle);
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f54439e.mo24730M();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.f54439e.mo24731N()) {
            setHasOptionsMenu(true);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f54439e.mo24717g(bundle);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.f54439e.mo24685d();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f54439e.mo24714b();
        super.onDestroyView();
    }

    public void onDetach() {
        this.f54439e.mo24715c();
        super.onDetach();
    }

    public final void onLowMemory() {
        this.f54439e.mo24736y();
        super.onLowMemory();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.f54439e.mo24732O();
    }

    public void onPause() {
        this.f54439e.mo24687f();
        super.onPause();
    }

    public final void onPrepareOptionsMenu(Menu menu) {
        if (this.f54439e.mo24733P()) {
            setHasOptionsMenu(true);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f54439e.mo24734Q();
    }

    public void onResume() {
        C19528h.m37267a(getChildFragmentManager());
        this.f54439e.mo24737z();
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f54439e.mo24721A(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        C19528h.m37267a(getChildFragmentManager());
        this.f54439e.mo24722B();
        super.onStart();
    }

    public void onStop() {
        this.f54439e.mo24723C();
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.f54439e.mo24720k(bundle);
        super.onViewCreated(view, bundle);
    }

    public final void setUserVisibleHint(boolean z) {
        this.f54439e.mo24718h(z);
        super.setUserVisibleHint(z);
    }
}
