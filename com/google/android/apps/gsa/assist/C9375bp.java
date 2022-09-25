package com.google.android.apps.gsa.assist;

import android.widget.Toast;
import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assist.bp */
/* compiled from: PG */
final class C9375bp extends C90904ba {

    /* renamed from: a */
    final /* synthetic */ C9397cb f32535a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9375bp(C9397cb cbVar) {
        super("SHOW_MIC_UNAVAILABLE_MESSAGE");
        this.f32535a = cbVar;
    }

    public final void run() {
        Toast.makeText(this.f32535a.f32606c, R.string.toast_mic_muted_info_message, 1).show();
    }
}
