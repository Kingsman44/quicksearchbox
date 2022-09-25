package com.google.android.gms.p10793f;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* renamed from: com.google.android.gms.f.c */
/* compiled from: PG */
public final class C144158c implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Context f390470a;

    /* renamed from: b */
    final /* synthetic */ Intent f390471b;

    public C144158c(Context context, Intent intent) {
        this.f390470a = context;
        this.f390471b = intent;
    }

    public final void onClick(View view) {
        try {
            this.f390470a.startActivity(this.f390471b);
        } catch (ActivityNotFoundException e) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
