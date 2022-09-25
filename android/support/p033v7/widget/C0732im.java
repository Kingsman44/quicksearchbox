package android.support.p033v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;

/* renamed from: android.support.v7.widget.im */
/* compiled from: PG */
public final class C0732im extends ContextWrapper {
    /* renamed from: a */
    public static void m2470a(Context context) {
        if (!(context instanceof C0732im) && !(context.getResources() instanceof C0734io)) {
            context.getResources();
        }
    }

    public final AssetManager getAssets() {
        throw null;
    }

    public final Resources getResources() {
        throw null;
    }

    public final Resources.Theme getTheme() {
        throw null;
    }

    public final void setTheme(int i) {
        throw null;
    }
}
