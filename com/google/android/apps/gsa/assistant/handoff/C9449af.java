package com.google.android.apps.gsa.assistant.handoff;

import android.content.Intent;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.af */
/* compiled from: PG */
public final class C9449af {

    /* renamed from: a */
    public C58833ax f32868a = C58836b.f156633a;

    /* renamed from: b */
    public String f32869b = "result_message";

    /* renamed from: c */
    public boolean f32870c = false;

    /* renamed from: a */
    public final void mo17695a(Intent intent) {
        this.f32868a = C58833ax.m90833j(intent.getStringExtra("uri"));
        this.f32869b = intent.hasExtra("result_message_param") ? intent.getStringExtra("result_message_param") : "result_message";
        this.f32870c = intent.getBooleanExtra("assistant_handoff_display_result_message_toast", false);
    }
}
