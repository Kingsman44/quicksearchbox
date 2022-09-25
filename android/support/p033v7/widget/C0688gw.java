package android.support.p033v7.widget;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: android.support.v7.widget.gw */
/* compiled from: PG */
final class C0688gw implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ SearchView f2521a;

    public C0688gw(SearchView searchView) {
        this.f2521a = searchView;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f2521a.onTextChanged(charSequence);
    }
}
