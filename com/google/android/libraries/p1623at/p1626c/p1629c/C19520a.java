package com.google.android.libraries.p1623at.p1626c.p1629c;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.p1623at.p1626c.C19491ar;

/* renamed from: com.google.android.libraries.at.c.c.a */
/* compiled from: PG */
public class C19520a extends C0260w {

    /* renamed from: b */
    protected final C19491ar f54440b = new C19491ar();

    public void dismiss() {
        this.f54440b.mo24716e();
        super.dismiss();
    }

    public final void dismissAllowingStateLoss() {
        this.f54440b.mo24716e();
        super.dismissAllowingStateLoss();
    }

    public void onActivityCreated(Bundle bundle) {
        this.f54440b.mo24713a(bundle);
        super.onActivityCreated(bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f54440b.mo24727J();
    }

    public void onAttach(Activity activity) {
        this.f54440b.mo24719j();
        super.onAttach(activity);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.f54440b.mo24728K();
        super.onConfigurationChanged(configuration);
    }

    public final boolean onContextItemSelected(MenuItem menuItem) {
        return this.f54440b.mo24729L() || super.onContextItemSelected(menuItem);
    }

    public void onCreate(Bundle bundle) {
        this.f54440b.mo24735x(bundle);
        super.onCreate(bundle);
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f54440b.mo24730M();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.f54440b.mo24731N()) {
            setHasOptionsMenu(true);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f54440b.mo24717g(bundle);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.f54440b.mo24685d();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f54440b.mo24714b();
        super.onDestroyView();
    }

    public void onDetach() {
        this.f54440b.mo24715c();
        super.onDetach();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f54440b.mo24716e();
        super.onDismiss(dialogInterface);
    }

    public final void onLowMemory() {
        this.f54440b.mo24736y();
        super.onLowMemory();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.f54440b.mo24732O();
    }

    public void onPause() {
        this.f54440b.mo24687f();
        super.onPause();
    }

    public final void onPrepareOptionsMenu(Menu menu) {
        if (this.f54440b.mo24733P()) {
            setHasOptionsMenu(true);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f54440b.mo24734Q();
    }

    public void onResume() {
        C19528h.m37267a(getChildFragmentManager());
        this.f54440b.mo24737z();
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f54440b.mo24721A(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        C19528h.m37267a(getChildFragmentManager());
        this.f54440b.mo24722B();
        super.onStart();
    }

    public void onStop() {
        this.f54440b.mo24723C();
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.f54440b.mo24720k(bundle);
    }

    public final void setUserVisibleHint(boolean z) {
        this.f54440b.mo24718h(z);
        super.setUserVisibleHint(z);
    }
}
