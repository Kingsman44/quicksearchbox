package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.content.Context;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.w */
/* compiled from: PG */
public final class C30779w extends C30746bq {

    /* renamed from: j */
    private C30753bx f83074j;

    public C30779w(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36444a() {
        this.f83074j.mo36452i(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo36445g() {
        C30753bx bxVar = this.f83074j;
        bxVar.f83001g.setAlpha(1.0f);
        bxVar.f83001g.setVisibility(0);
        this.f83074j.mo36452i(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo36446h() {
        return C30746bq.m57427n(this.f82984f) || m57427n(this.f83074j.findViewById(R.id.scroll_view));
    }

    public final void setContentView(View view) {
        if (view instanceof C30753bx) {
            C30753bx bxVar = (C30753bx) view;
            this.f83074j = bxVar;
            bxVar.mo36452i(false);
            super.setContentView(view);
            return;
        }
        throw new IllegalStateException("Content view must be StandAloneAccountMenuView");
    }
}
