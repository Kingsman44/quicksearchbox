package com.google.android.libraries.gsa.p1859d.p1861b;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p033v7.widget.LinearLayoutManager;
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
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashSet;

/* renamed from: com.google.android.libraries.gsa.d.b.d */
/* compiled from: PG */
public class C22758d extends ContextThemeWrapper implements Window.Callback, KeyEvent.Callback, C22763i {

    /* renamed from: a */
    private final HashSet f62638a = new HashSet();

    /* renamed from: aa */
    public final Window f62639aa;

    /* renamed from: ab */
    protected View f62640ab;

    /* renamed from: ac */
    protected WindowManager f62641ac;

    public C22758d(Context context, int i, int i2) {
        super(context, i);
        Window window = new Dialog(context, i2).getWindow();
        this.f62639aa = window;
        window.setCallback(this);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.addFlags(LinearLayoutManager.INVALID_OFFSET);
    }

    /* renamed from: T */
    public final void mo27986T() {
        if (!this.f62638a.isEmpty()) {
            HashSet hashSet = this.f62638a;
            Dialog[] dialogArr = (Dialog[]) hashSet.toArray(new Dialog[hashSet.size()]);
            this.f62638a.clear();
            for (Dialog dismiss : dialogArr) {
                dismiss.dismiss();
            }
        }
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f62639aa.superDispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f62639aa.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View view = this.f62640ab;
        return keyEvent.dispatch(this, view != null ? view.getKeyDispatcherState() : null, this);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f62639aa.superDispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f62639aa.superDispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f62639aa.superDispatchTrackballEvent(motionEvent);
    }

    /* renamed from: m */
    public void mo27993m() {
    }

    public final void onActionModeFinished(ActionMode actionMode) {
    }

    public final void onActionModeStarted(ActionMode actionMode) {
    }

    public final void onAttachedToWindow() {
        C58976aa aaVar = C58975e.f156826a;
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
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f62638a.remove(dialogInterface);
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
        mo27993m();
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
        this.f62638a.add(dialogInterface);
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        View view = this.f62640ab;
        if (view != null) {
            this.f62641ac.updateViewLayout(view, layoutParams);
        }
    }

    public void onWindowFocusChanged(boolean z) {
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
}
