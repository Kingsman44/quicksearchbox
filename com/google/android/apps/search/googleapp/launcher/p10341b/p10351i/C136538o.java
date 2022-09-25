package com.google.android.apps.search.googleapp.launcher.p10341b.p10351i;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.search.googleapp.launcher.p10341b.C136435ag;
import com.google.android.apps.search.googleapp.launcher.p10341b.C136439ak;
import com.google.android.apps.search.googleapp.launcher.p10341b.C136486h;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.i.o */
/* compiled from: PG */
public final class C136538o extends ContextThemeWrapper implements Window.Callback, DialogInterface.OnDismissListener, DialogInterface.OnShowListener, KeyEvent.Callback {

    /* renamed from: a */
    public final Window f371746a;

    /* renamed from: b */
    public View f371747b;

    /* renamed from: c */
    public WindowManager f371748c;

    /* renamed from: d */
    public C136435ag f371749d;

    /* renamed from: e */
    private final Set f371750e = new HashSet();

    public C136538o(Context context, Window window) {
        this.f371746a = window;
        attachBaseContext(context);
        window.setCallback(this);
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f371746a.superDispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f371746a.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View view = this.f371747b;
        return keyEvent.dispatch(this, view != null ? view.getKeyDispatcherState() : null, this);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f371746a.superDispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f371746a.superDispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f371746a.superDispatchTrackballEvent(motionEvent);
    }

    public final Object getSystemService(String str) {
        WindowManager windowManager;
        if (!"window".equals(str) || (windowManager = this.f371748c) == null) {
            return super.getSystemService(str);
        }
        return windowManager;
    }

    public final void onActionModeFinished(ActionMode actionMode) {
    }

    public final void onActionModeStarted(ActionMode actionMode) {
    }

    public final void onAttachedToWindow() {
    }

    public final void onContentChanged() {
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        return false;
    }

    public final View onCreatePanelView(int i) {
        return null;
    }

    public final void onDetachedFromWindow() {
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f371750e.remove(dialogInterface);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.isCanceled() || !keyEvent.isTracking()) {
            return false;
        }
        C136435ag agVar = this.f371749d;
        if (agVar == null) {
            return true;
        }
        C136439ak akVar = agVar.f371438a;
        akVar.f371455j.mo113057a("onBackPressed");
        akVar.mo113037a(new C136486h(2, 0));
        return true;
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return false;
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        return true;
    }

    public final void onPanelClosed(int i, Menu menu) {
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        return true;
    }

    public final boolean onSearchRequested() {
        return false;
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return false;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.f371750e.add(dialogInterface);
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        View view;
        WindowManager windowManager = this.f371748c;
        if (windowManager != null && (view = this.f371747b) != null) {
            windowManager.updateViewLayout(view, layoutParams);
        }
    }

    public final void onWindowFocusChanged(boolean z) {
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return null;
    }

    public final void startActivity(Intent intent) {
        super.startActivity(intent.addFlags(268435456));
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        super.startActivity(intent.addFlags(268435456), bundle);
    }

    public C136538o(Context context, Window window, byte[] bArr) {
        super(context, 2132150848);
        this.f371746a = window;
        window.setCallback(this);
    }
}
