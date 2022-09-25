package androidx.core.p098j;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: androidx.core.j.cv */
/* compiled from: PG */
public final class C2088cv {

    /* renamed from: a */
    public final C2087cu f5998a;

    public C2088cv(Window window, View view) {
        this.f5998a = Build.VERSION.SDK_INT >= 30 ? new C2086ct(window) : new C2085cs(window);
    }

    @Deprecated
    public C2088cv(WindowInsetsController windowInsetsController) {
        this.f5998a = new C2086ct(windowInsetsController);
    }
}
