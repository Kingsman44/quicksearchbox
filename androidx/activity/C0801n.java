package androidx.activity;

import androidx.core.p094f.C1888a;
import androidx.core.p097i.C1967b;

/* renamed from: androidx.activity.n */
/* compiled from: PG */
public final /* synthetic */ class C0801n implements C1967b {

    /* renamed from: a */
    public final /* synthetic */ OnBackPressedDispatcher f2750a;

    public /* synthetic */ C0801n(OnBackPressedDispatcher onBackPressedDispatcher) {
        this.f2750a = onBackPressedDispatcher;
    }

    /* renamed from: a */
    public final void mo3353a(Object obj) {
        OnBackPressedDispatcher onBackPressedDispatcher = this.f2750a;
        Boolean bool = (Boolean) obj;
        if (C1888a.m5150d()) {
            onBackPressedDispatcher.mo3341d();
        }
    }
}
