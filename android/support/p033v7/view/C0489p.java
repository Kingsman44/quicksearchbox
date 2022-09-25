package android.support.p033v7.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: android.support.v7.view.p */
/* compiled from: PG */
public class C0489p implements Window.Callback {

    /* renamed from: e */
    public final Window.Callback f1718e;

    public C0489p(Window.Callback callback) {
        if (callback != null) {
            this.f1718e = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f1718e.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f1718e.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f1718e.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f1718e.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f1718e.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f1718e.dispatchTrackballEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.f1718e.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.f1718e.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.f1718e.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f1718e.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f1718e.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f1718e.onCreatePanelView(i);
    }

    public final void onDetachedFromWindow() {
        this.f1718e.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f1718e.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f1718e.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f1718e.onPanelClosed(i, menu);
    }

    public final void onPointerCaptureChanged(boolean z) {
        C0488o.m1665a(this.f1718e, z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f1718e.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        C0487n.m1664a(this.f1718e, list, menu, i);
    }

    public final boolean onSearchRequested() {
        return this.f1718e.onSearchRequested();
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f1718e.onWindowAttributesChanged(layoutParams);
    }

    public final void onWindowFocusChanged(boolean z) {
        this.f1718e.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f1718e.onWindowStartingActionMode(callback);
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return C0445m.m1452b(this.f1718e, searchEvent);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return C0445m.m1451a(this.f1718e, callback, i);
    }
}
