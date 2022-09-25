package com.google.android.gms.car;

import android.os.RemoteException;
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
import com.google.android.gms.car.p10760f.C143268bb;
import com.google.android.gms.car.p10764h.C143316a;

/* renamed from: com.google.android.gms.car.di */
/* compiled from: PG */
public final class C143182di implements Window.Callback {

    /* renamed from: a */
    private final C143193dj f388282a;

    /* renamed from: b */
    private final Window f388283b;

    public C143182di(C143193dj djVar) {
        this.f388282a = djVar;
        Window window = ((C143268bb) djVar).f388464m.getWindow();
        window.getClass();
        this.f388283b = window;
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f388283b.superDispatchGenericMotionEvent(motionEvent);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.car.dj, android.view.KeyEvent$Callback, java.lang.Object] */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean superDispatchKeyEvent = this.f388283b.superDispatchKeyEvent(keyEvent);
        int keyCode = keyEvent.getKeyCode();
        if (!superDispatchKeyEvent) {
            ? r0 = this.f388282a;
            C143268bb bbVar = r0;
            superDispatchKeyEvent = bbVar.f388461j != null && keyEvent.dispatch(r0, bbVar.f388443K, r0);
        }
        C143193dj djVar = this.f388282a;
        try {
            C143150cf cfVar = ((C143268bb) djVar).f388447O;
            if (cfVar != null) {
                cfVar.mo118110f(superDispatchKeyEvent);
            }
        } catch (RemoteException unused) {
            ((C143268bb) djVar).mo118322r();
        }
        switch (keyCode) {
            case 19:
            case 20:
            case 21:
            case 22:
                return true;
            default:
                return superDispatchKeyEvent;
        }
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f388283b.superDispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f388283b.superDispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f388283b.superDispatchGenericMotionEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
    }

    public final void onActionModeStarted(ActionMode actionMode) {
    }

    public final void onAttachedToWindow() {
        C143179df dfVar = ((C143268bb) this.f388282a).f388464m;
        if (dfVar != null) {
            dfVar.mo118155l(true);
        }
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
        C143179df dfVar = ((C143268bb) this.f388282a).f388464m;
        if (dfVar != null) {
            dfVar.mo118155l(false);
        }
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return false;
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        return false;
    }

    public final void onPanelClosed(int i, Menu menu) {
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        return false;
    }

    public final boolean onSearchRequested() {
        return false;
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return false;
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        C143268bb bbVar = (C143268bb) this.f388282a;
        C143179df dfVar = bbVar.f388464m;
        if (dfVar != null) {
            dfVar.mo118157n((layoutParams.flags & 1024) != 0);
        }
        bbVar.mo118309i(layoutParams);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (C143316a.m232515e("GH.ProjectionWindowCB", 3)) {
            C143316a.m232514d(3, "GH.ProjectionWindowCB", (Throwable) null, "onWindowFocusChanged(hasFocus:%b)", Boolean.valueOf(z));
        }
        C143179df dfVar = ((C143268bb) this.f388282a).f388464m;
        if (dfVar == null) {
            C143316a.m232514d(5, "GH.ProjectionWindowCB", (Throwable) null, "Host presentation was null during window focus change", new Object[0]);
            return;
        }
        boolean z2 = dfVar.f388263k;
        if (z2 == z) {
            if (C143316a.m232515e("CAR.PROJECTION.PRES", 2)) {
                C143316a.m232514d(2, "CAR.PROJECTION.PRES", (Throwable) null, "%s onWindowFocusChangeReached(hasWindowFocus:%b) [windowHasFocus:%b]", dfVar.f388260h, Boolean.valueOf(z), Boolean.valueOf(dfVar.f388266n));
            }
            dfVar.f388266n = z;
            dfVar.mo118149g();
            if (this.f388282a.mo118218d() != z) {
                this.f388282a.mo118217c(z, dfVar.f388264l);
            } else if (C143316a.m232515e("GH.ProjectionWindowCB", 3)) {
                C143316a.m232514d(3, "GH.ProjectionWindowCB", (Throwable) null, "onWindowFocusChanged() Host focus already matches window focus: %b", Boolean.valueOf(z));
            }
        } else {
            C143316a.m232514d(5, "GH.ProjectionWindowCB", (Throwable) null, "Host presentation did not match window focus changed callback. Presentation focus: %b, callback focus: %b", Boolean.valueOf(z2), Boolean.valueOf(z));
        }
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return null;
    }
}
