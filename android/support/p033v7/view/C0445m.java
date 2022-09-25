package android.support.p033v7.view;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* renamed from: android.support.v7.view.m */
/* compiled from: PG */
public final class C0445m {
    /* renamed from: a */
    public static ActionMode m1451a(Window.Callback callback, ActionMode.Callback callback2, int i) {
        return callback.onWindowStartingActionMode(callback2, i);
    }

    /* renamed from: b */
    static boolean m1452b(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }
}
