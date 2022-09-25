package android.support.p033v7.view.menu;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* renamed from: android.support.v7.view.menu.r */
/* compiled from: PG */
final class C0478r implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C0451ae {

    /* renamed from: a */
    public final C0477q f1675a;

    /* renamed from: b */
    public C0392m f1676b;

    /* renamed from: c */
    C0473m f1677c;

    public C0478r(C0477q qVar) {
        this.f1675a = qVar;
    }

    /* renamed from: a */
    public final void mo1121a(C0477q qVar, boolean z) {
        C0392m mVar;
        if ((z || qVar == this.f1675a) && (mVar = this.f1676b) != null) {
            mVar.dismiss();
        }
    }

    /* renamed from: b */
    public final boolean mo1122b(C0477q qVar) {
        return false;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1675a.mo1680z(((C0472l) this.f1677c.mo1629k()).getItem(i), (C0452af) null, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f1677c.mo1543d(this.f1675a, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i != 82) {
            if (i == 4) {
                i = 4;
            }
            return this.f1675a.performShortcut(i, keyEvent, 0);
        }
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            Window window2 = this.f1676b.getWindow();
            if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                keyDispatcherState2.startTracking(keyEvent, this);
                return true;
            }
            return this.f1675a.performShortcut(i, keyEvent, 0);
        }
        if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1676b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
            this.f1675a.mo1657g(true);
            dialogInterface.dismiss();
            return true;
        }
        return this.f1675a.performShortcut(i, keyEvent, 0);
    }
}
