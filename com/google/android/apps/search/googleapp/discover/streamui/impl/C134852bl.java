package com.google.android.apps.search.googleapp.discover.streamui.impl;

import android.content.Context;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.bl */
/* compiled from: PG */
class C134852bl extends RecyclerView implements C68288b {

    /* renamed from: a */
    private C47252b f367115a;

    /* renamed from: b */
    private boolean f367116b;

    public C134852bl(Context context) {
        super(context);
        mo112032d();
    }

    /* renamed from: b */
    public final C47252b mo112031b() {
        if (this.f367115a == null) {
            this.f367115a = new C47252b(this, false);
        }
        return this.f367115a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo112032d() {
        if (!this.f367116b) {
            this.f367116b = true;
            DiscoverRecyclerView discoverRecyclerView = (DiscoverRecyclerView) this;
            ((C134900i) mo112031b().mo17653jN()).mo112055ao();
        }
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo112031b().mo17653jN();
    }

    public C134852bl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo112032d();
    }

    public C134852bl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo112032d();
    }
}
