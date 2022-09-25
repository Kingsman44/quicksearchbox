package com.google.android.libraries.p1623at.p1626c.p1629c.p1630a;

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
import com.google.android.libraries.p1623at.p1626c.C19491ar;
import com.google.android.libraries.p1623at.p1626c.p1629c.C19528h;
import com.google.android.material.bottomsheet.C44566q;

/* renamed from: com.google.android.libraries.at.c.c.a.a */
/* compiled from: PG */
public class C19521a extends C44566q {

    /* renamed from: a */
    protected final C19491ar f54441a = new C19491ar();

    public void onActivityCreated(Bundle bundle) {
        this.f54441a.mo24713a(bundle);
        super.onActivityCreated(bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f54441a.mo24727J();
        super.onActivityResult(i, i2, intent);
    }

    public void onAttach(Activity activity) {
        this.f54441a.mo24719j();
        super.onAttach(activity);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.f54441a.mo24728K();
        super.onConfigurationChanged(configuration);
    }

    public final boolean onContextItemSelected(MenuItem menuItem) {
        if (this.f54441a.mo24729L()) {
            return true;
        }
        return super.onContextItemSelected(menuItem);
    }

    public void onCreate(Bundle bundle) {
        this.f54441a.mo24735x(bundle);
        super.onCreate(bundle);
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f54441a.mo24730M();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.f54441a.mo24731N()) {
            setHasOptionsMenu(true);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f54441a.mo24717g(bundle);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.f54441a.mo24685d();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f54441a.mo24714b();
        super.onDestroyView();
    }

    public void onDetach() {
        this.f54441a.mo24715c();
        super.onDetach();
    }

    public final void onLowMemory() {
        this.f54441a.mo24736y();
        super.onLowMemory();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.f54441a.mo24732O();
    }

    public void onPause() {
        this.f54441a.mo24687f();
        super.onPause();
    }

    public final void onPrepareOptionsMenu(Menu menu) {
        if (this.f54441a.mo24733P()) {
            setHasOptionsMenu(true);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f54441a.mo24734Q();
    }

    public void onResume() {
        C19528h.m37267a(getChildFragmentManager());
        this.f54441a.mo24737z();
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f54441a.mo24721A(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        C19528h.m37267a(getChildFragmentManager());
        this.f54441a.mo24722B();
        super.onStart();
    }

    public void onStop() {
        this.f54441a.mo24723C();
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.f54441a.mo24720k(bundle);
    }

    public final void setUserVisibleHint(boolean z) {
        this.f54441a.mo24718h(z);
        super.setUserVisibleHint(z);
    }
}
