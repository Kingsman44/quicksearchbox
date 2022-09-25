package com.google.android.libraries.onegoogle.accountmenu.features.p2359a.p2360a;

import android.view.View;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.a.a.b */
/* compiled from: PG */
public final class C30498b extends C30497a {

    /* renamed from: b */
    private final View.OnClickListener f82368b;

    /* renamed from: c */
    private final View.OnClickListener f82369c;

    public C30498b(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        this.f82368b = onClickListener;
        this.f82369c = onClickListener2;
    }

    /* renamed from: a */
    public final View.OnClickListener mo36140a() {
        return this.f82369c;
    }

    /* renamed from: b */
    public final View.OnClickListener mo36141b() {
        return this.f82368b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30497a) {
            C30497a aVar = (C30497a) obj;
            return this.f82368b.equals(aVar.mo36141b()) && this.f82369c.equals(aVar.mo36140a());
        }
    }

    public final int hashCode() {
        return ((this.f82368b.hashCode() ^ 1000003) * 1000003) ^ this.f82369c.hashCode();
    }

    public final String toString() {
        String obj = this.f82368b.toString();
        String obj2 = this.f82369c.toString();
        return "AccountData{searchHistoryClickListener=" + obj + ", deleteSearchHistoryClickListener=" + obj2 + "}";
    }
}
