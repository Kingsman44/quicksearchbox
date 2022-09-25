package com.google.android.libraries.p1623at.p1626c.p1627a;

import android.app.assist.AssistContent;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0395p;
import android.support.p033v7.view.C0435c;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.libraries.p1623at.p1626c.C19517bp;
import com.google.android.libraries.p1623at.p1626c.p1629c.C19525e;
import com.google.android.libraries.p1623at.p1626c.p1629c.C19526f;
import com.google.android.libraries.p1623at.p1626c.p1629c.C19527g;
import com.google.android.libraries.p1623at.p1626c.p1629c.C19528h;
import java.util.function.Consumer;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.at.c.a.a */
/* compiled from: PG */
public class C19473a extends C0395p {

    /* renamed from: O */
    protected final C19527g f54414O = new C19527g();

    /* renamed from: Zk */
    private int f54415Zk;

    /* renamed from: fR */
    private final void m37157fR() {
        this.f54415Zk--;
    }

    /* renamed from: fS */
    private final void m37158fS() {
        int i = this.f54415Zk;
        this.f54415Zk = i + 1;
        if (i == 0) {
            this.f54414O.mo24704w();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f54414O.mo24694m() || super.dispatchKeyEvent(keyEvent);
    }

    public void finish() {
        this.f54414O.mo24682a();
        super.finish();
    }

    public final void finishAfterTransition() {
        this.f54414O.mo24683b();
        super.finishAfterTransition();
    }

    /* renamed from: h */
    public final void mo543h() {
        this.f54414O.mo24782R();
    }

    /* renamed from: hS */
    public final void mo544hS(Fragment fragment, Intent intent) {
        m37158fS();
        fragment.startActivityForResult(intent, 66, (Bundle) null);
        m37157fR();
    }

    /* renamed from: l */
    public final void mo1204l(C0435c cVar) {
        C19527g gVar = this.f54414O;
        if (cVar != null) {
            for (int i = 0; i < gVar.f54432a.size(); i++) {
                C19517bp bpVar = (C19517bp) gVar.f54432a.get(i);
                if (bpVar instanceof C19525e) {
                    ((C19525e) bpVar).mo24780a();
                }
            }
        }
    }

    public final void onActivityReenter(int i, Intent intent) {
        this.f54414O.mo24695n();
        super.onActivityReenter(i, intent);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f54414O.mo24727J();
    }

    public void onAttachedToWindow() {
        this.f54414O.mo24684c();
        super.onAttachedToWindow();
    }

    public void onBackPressed() {
        if (!this.f54414O.mo24693l()) {
            this.f2707h.mo3340c();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f54414O.mo24728K();
        super.onConfigurationChanged(configuration);
    }

    public final boolean onContextItemSelected(MenuItem menuItem) {
        return this.f54414O.mo24729L() || super.onContextItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f54414O.mo24735x(bundle);
        super.onCreate(bundle);
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f54414O.mo24730M();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return this.f54414O.mo24731N() || super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f54414O.mo24685d();
        super.onDestroy();
    }

    public void onDetachedFromWindow() {
        this.f54414O.mo24686e();
        super.onDetachedFromWindow();
    }

    public final /* synthetic */ void onGetDirectActions(CancellationSignal cancellationSignal, Consumer consumer) {
        this.f54414O.mo24696o(Consumer.VivifiedWrapper.convert(consumer));
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f54414O.mo24697p() || super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.f54414O.mo24698q() || super.onKeyUp(i, keyEvent);
    }

    public final void onLowMemory() {
        this.f54414O.mo24736y();
        super.onLowMemory();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f54414O.mo24699r();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.f54414O.mo24732O() || super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        this.f54414O.mo24687f();
        super.onPause();
    }

    public final /* synthetic */ void onPerformDirectAction(String str, Bundle bundle, CancellationSignal cancellationSignal, java.util.function.Consumer consumer) {
        Consumer.VivifiedWrapper.convert(consumer);
        this.f54414O.mo24700s();
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        this.f54414O.mo24688g(bundle);
        super.onPostCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        this.f54414O.mo24689h();
        super.onPostResume();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return this.f54414O.mo24733P() || super.onPrepareOptionsMenu(menu);
    }

    public void onProvideAssistContent(AssistContent assistContent) {
        this.f54414O.mo24701t();
        super.onProvideAssistContent(assistContent);
    }

    public void onProvideAssistData(Bundle bundle) {
        this.f54414O.mo24702u();
        super.onProvideAssistData(bundle);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f54414O.mo24734Q();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        this.f54414O.mo24690i(bundle);
        super.onRestoreInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        C19528h.m37267a(mo545jw());
        this.f54414O.mo24737z();
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f54414O.mo24721A(bundle);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        C19528h.m37267a(mo545jw());
        this.f54414O.mo24722B();
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        this.f54414O.mo24723C();
        super.onStop();
    }

    public void onTopResumedActivityChanged(boolean z) {
        this.f54414O.mo24724D(z);
        super.onTopResumedActivityChanged(z);
    }

    public void onUserInteraction() {
        this.f54414O.mo24691j();
        super.onUserInteraction();
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        this.f54414O.mo24692k();
        super.onUserLeaveHint();
    }

    public void onWindowFocusChanged(boolean z) {
        this.f54414O.mo24703v();
        super.onWindowFocusChanged(z);
    }

    /* renamed from: r */
    public final void mo1208r() {
        C19527g gVar = this.f54414O;
        for (int i = 0; i < gVar.f54432a.size(); i++) {
            C19517bp bpVar = (C19517bp) gVar.f54432a.get(i);
            if (bpVar instanceof C19526f) {
                ((C19526f) bpVar).mo24781a();
            }
        }
    }

    public void startActivity(Intent intent) {
        m37158fS();
        super.startActivity(intent);
        m37157fR();
    }

    public final void startActivityForResult(Intent intent, int i) {
        m37158fS();
        super.startActivityForResult(intent, i);
        m37157fR();
    }

    public final void startActivityFromFragment(android.app.Fragment fragment, Intent intent, int i, Bundle bundle) {
        m37158fS();
        super.startActivityFromFragment(fragment, intent, i, bundle);
        m37157fR();
    }

    public void startActivity(Intent intent, Bundle bundle) {
        m37158fS();
        super.startActivity(intent, bundle);
        m37157fR();
    }

    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        m37158fS();
        super.startActivityForResult(intent, i, bundle);
        m37157fR();
    }
}
