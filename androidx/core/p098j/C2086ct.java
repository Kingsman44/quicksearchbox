package androidx.core.p098j;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.p060c.C0984n;

/* renamed from: androidx.core.j.ct */
/* compiled from: PG */
final class C2086ct extends C2087cu {

    /* renamed from: a */
    final WindowInsetsController f5996a;

    /* renamed from: b */
    protected Window f5997b;

    public C2086ct(Window window) {
        this(window.getInsetsController());
        this.f5997b = window;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5256a(int i) {
        View decorView = this.f5997b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo5257b(int i) {
        View decorView = this.f5997b.getDecorView();
        decorView.setSystemUiVisibility((i ^ -1) & decorView.getSystemUiVisibility());
    }

    /* renamed from: c */
    public final void mo5251c() {
        this.f5996a.hide(8);
    }

    /* renamed from: e */
    public final void mo5253e(boolean z) {
        if (z) {
            if (this.f5997b != null) {
                mo5256a(8192);
            }
            this.f5996a.setSystemBarsAppearance(8, 8);
            return;
        }
        if (this.f5997b != null) {
            mo5257b(8192);
        }
        this.f5996a.setSystemBarsAppearance(0, 8);
    }

    /* renamed from: f */
    public final boolean mo5254f() {
        return (this.f5996a.getSystemBarsAppearance() & 8) != 0;
    }

    /* renamed from: g */
    public final void mo5255g(boolean z) {
        if (z) {
            if (this.f5997b != null) {
                mo5256a(16);
            }
            this.f5996a.setSystemBarsAppearance(16, 16);
            return;
        }
        if (this.f5997b != null) {
            mo5257b(16);
        }
        this.f5996a.setSystemBarsAppearance(0, 16);
    }

    public C2086ct(WindowInsetsController windowInsetsController) {
        new C0984n(0);
        this.f5996a = windowInsetsController;
    }
}
