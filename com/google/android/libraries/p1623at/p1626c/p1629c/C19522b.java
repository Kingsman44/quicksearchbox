package com.google.android.libraries.p1623at.p1626c.p1629c;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.p1623at.p1626c.C19491ar;

/* renamed from: com.google.android.libraries.at.c.c.b */
/* compiled from: PG */
public class C19522b extends Fragment {

    /* renamed from: o */
    protected final C19491ar f54442o = new C19491ar();

    public void onActivityCreated(Bundle bundle) {
        this.f54442o.mo24713a(bundle);
        super.onActivityCreated(bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f54442o.mo24727J();
    }

    public void onAttach(Activity activity) {
        this.f54442o.mo24719j();
        super.onAttach(activity);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f54442o.mo24728K();
        super.onConfigurationChanged(configuration);
    }

    public final boolean onContextItemSelected(MenuItem menuItem) {
        return this.f54442o.mo24729L() || super.onContextItemSelected(menuItem);
    }

    public void onCreate(Bundle bundle) {
        this.f54442o.mo24735x(bundle);
        super.onCreate(bundle);
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f54442o.mo24730M();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.f54442o.mo24731N()) {
            setHasOptionsMenu(true);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f54442o.mo24717g(bundle);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.f54442o.mo24685d();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f54442o.mo24714b();
        super.onDestroyView();
    }

    public void onDetach() {
        this.f54442o.mo24715c();
        super.onDetach();
    }

    public final void onLowMemory() {
        this.f54442o.mo24736y();
        super.onLowMemory();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.f54442o.mo24732O();
    }

    public void onPause() {
        this.f54442o.mo24687f();
        super.onPause();
    }

    public final void onPrepareOptionsMenu(Menu menu) {
        if (this.f54442o.mo24733P()) {
            setHasOptionsMenu(true);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f54442o.mo24734Q();
    }

    public void onResume() {
        this.f54442o.mo24737z();
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f54442o.mo24721A(bundle);
    }

    public void onStart() {
        this.f54442o.mo24722B();
        super.onStart();
    }

    public void onStop() {
        this.f54442o.mo24723C();
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.f54442o.mo24720k(bundle);
    }

    public final void setUserVisibleHint(boolean z) {
        this.f54442o.mo24718h(z);
        super.setUserVisibleHint(z);
    }
}
