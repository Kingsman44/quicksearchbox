package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.t */
/* compiled from: PG */
final class C30776t extends LinearLayoutManager {

    /* renamed from: a */
    final /* synthetic */ AccountMenuBodyView f83073a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30776t(AccountMenuBodyView accountMenuBodyView, Context context) {
        super(context);
        this.f83073a = accountMenuBodyView;
    }

    public final boolean canScrollVertically() {
        return this.f83073a.f82881c && super.canScrollVertically();
    }
}
