package com.google.android.libraries.p1623at.p1626c.p1629c;

import android.app.assist.AssistContent;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.libraries.p1623at.p1626c.C19517bp;
import com.google.android.libraries.p1623at.p1626c.C19529d;
import com.google.android.libraries.p1623at.p1626c.C19530e;
import java.util.function.Consumer;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.at.c.c.c */
/* compiled from: PG */
public class C19523c extends C0167am {

    /* renamed from: j */
    private int f54443j;

    /* renamed from: k */
    protected final C19527g f54444k = new C19527g();

    /* renamed from: j */
    private final void mo22285j() {
        this.f54443j--;
    }

    /* renamed from: k */
    private final void mo22340k() {
        int i = this.f54443j;
        this.f54443j = i + 1;
        if (i == 0) {
            this.f54444k.mo24704w();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f54444k.mo24694m() || super.dispatchKeyEvent(keyEvent);
    }

    public final void finish() {
        this.f54444k.mo24682a();
        super.finish();
    }

    public final void finishAfterTransition() {
        this.f54444k.mo24683b();
        super.finishAfterTransition();
    }

    /* renamed from: h */
    public final void mo543h() {
        this.f54444k.mo24782R();
    }

    /* renamed from: hS */
    public final void mo544hS(Fragment fragment, Intent intent) {
        mo22340k();
        fragment.startActivityForResult(intent, 66, (Bundle) null);
        mo22285j();
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        C19527g gVar = this.f54444k;
        for (int i = 0; i < gVar.f54432a.size(); i++) {
            C19517bp bpVar = (C19517bp) gVar.f54432a.get(i);
            if (bpVar instanceof C19529d) {
                ((C19529d) bpVar).mo24783a();
            }
        }
        super.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        C19527g gVar = this.f54444k;
        for (int i = 0; i < gVar.f54432a.size(); i++) {
            C19517bp bpVar = (C19517bp) gVar.f54432a.get(i);
            if (bpVar instanceof C19530e) {
                ((C19530e) bpVar).mo24784a();
            }
        }
        super.onActionModeStarted(actionMode);
    }

    public final void onActivityReenter(int i, Intent intent) {
        this.f54444k.mo24695n();
        super.onActivityReenter(i, intent);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f54444k.mo24727J();
    }

    public final void onAttachedToWindow() {
        this.f54444k.mo24684c();
        super.onAttachedToWindow();
    }

    public void onBackPressed() {
        if (!this.f54444k.mo24693l()) {
            this.f2707h.mo3340c();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f54444k.mo24728K();
        super.onConfigurationChanged(configuration);
    }

    public final boolean onContextItemSelected(MenuItem menuItem) {
        return this.f54444k.mo24729L() || super.onContextItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f54444k.mo24735x(bundle);
        super.onCreate(bundle);
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f54444k.mo24730M();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        return this.f54444k.mo24731N() || super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f54444k.mo24685d();
        super.onDestroy();
    }

    public final void onDetachedFromWindow() {
        this.f54444k.mo24686e();
        super.onDetachedFromWindow();
    }

    public final /* synthetic */ void onGetDirectActions(CancellationSignal cancellationSignal, Consumer consumer) {
        this.f54444k.mo24696o(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f54444k.mo24697p() || super.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.f54444k.mo24698q() || super.onKeyUp(i, keyEvent);
    }

    public final void onLowMemory() {
        this.f54444k.mo24736y();
        super.onLowMemory();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f54444k.mo24699r();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.f54444k.mo24732O() || super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        this.f54444k.mo24687f();
        super.onPause();
    }

    public final /* synthetic */ void onPerformDirectAction(String str, Bundle bundle, CancellationSignal cancellationSignal, java.util.function.Consumer consumer) {
        Consumer.VivifiedWrapper.convert(consumer);
        this.f54444k.mo24700s();
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        this.f54444k.mo24688g(bundle);
        super.onPostCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        this.f54444k.mo24689h();
        super.onPostResume();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return this.f54444k.mo24733P() || super.onPrepareOptionsMenu(menu);
    }

    public final void onProvideAssistContent(AssistContent assistContent) {
        this.f54444k.mo24701t();
        super.onProvideAssistContent(assistContent);
    }

    public final void onProvideAssistData(Bundle bundle) {
        this.f54444k.mo24702u();
        super.onProvideAssistData(bundle);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f54444k.mo24734Q();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        this.f54444k.mo24690i(bundle);
        super.onRestoreInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        C19528h.m37267a(mo545jw());
        this.f54444k.mo24737z();
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f54444k.mo24721A(bundle);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        C19528h.m37267a(mo545jw());
        this.f54444k.mo24722B();
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        this.f54444k.mo24723C();
        super.onStop();
    }

    public final void onTopResumedActivityChanged(boolean z) {
        this.f54444k.mo24724D(z);
        super.onTopResumedActivityChanged(z);
    }

    public void onUserInteraction() {
        this.f54444k.mo24691j();
        super.onUserInteraction();
    }

    /* access modifiers changed from: protected */
    public final void onUserLeaveHint() {
        this.f54444k.mo24692k();
        super.onUserLeaveHint();
    }

    public void onWindowFocusChanged(boolean z) {
        this.f54444k.mo24703v();
        super.onWindowFocusChanged(z);
    }

    public void startActivity(Intent intent) {
        mo22340k();
        super.startActivity(intent);
        mo22285j();
    }

    public final void startActivityForResult(Intent intent, int i) {
        mo22340k();
        super.startActivityForResult(intent, i);
        mo22285j();
    }

    public final void startActivityFromFragment(android.app.Fragment fragment, Intent intent, int i, Bundle bundle) {
        mo22340k();
        super.startActivityFromFragment(fragment, intent, i, bundle);
        mo22285j();
    }

    public void startActivity(Intent intent, Bundle bundle) {
        mo22340k();
        super.startActivity(intent, bundle);
        mo22285j();
    }

    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        mo22340k();
        super.startActivityForResult(intent, i, bundle);
        mo22285j();
    }
}
