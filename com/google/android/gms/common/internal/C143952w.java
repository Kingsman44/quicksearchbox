package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.w */
/* compiled from: PG */
public final class C143952w extends C143954y {

    /* renamed from: a */
    final /* synthetic */ Intent f390179a;

    /* renamed from: b */
    final /* synthetic */ Activity f390180b;

    /* renamed from: c */
    final /* synthetic */ int f390181c;

    public C143952w(Intent intent, Activity activity, int i) {
        this.f390179a = intent;
        this.f390180b = activity;
        this.f390181c = i;
    }

    /* renamed from: a */
    public final void mo119482a() {
        Intent intent = this.f390179a;
        if (intent != null) {
            this.f390180b.startActivityForResult(intent, this.f390181c);
        }
    }
}
