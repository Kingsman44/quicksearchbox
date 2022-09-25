package androidx.core.p098j;

import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

/* renamed from: androidx.core.j.cq */
/* compiled from: PG */
class C2083cq extends C2087cu {

    /* renamed from: a */
    protected final Window f5995a;

    public C2083cq(Window window) {
        this.f5995a = window;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5249a(int i) {
        View decorView = this.f5995a.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo5250b(int i) {
        View decorView = this.f5995a.getDecorView();
        decorView.setSystemUiVisibility((i ^ -1) & decorView.getSystemUiVisibility());
    }

    /* renamed from: c */
    public final void mo5251c() {
        for (int i = 1; i <= 256; i += i) {
            if ((i & 8) != 0) {
                if (i == 1) {
                    mo5249a(4);
                } else if (i == 2) {
                    mo5249a(2);
                } else if (i == 8) {
                    ((InputMethodManager) this.f5995a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f5995a.getDecorView().getWindowToken(), 0);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo5252d() {
        this.f5995a.addFlags(LinearLayoutManager.INVALID_OFFSET);
    }
}
