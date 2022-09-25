package com.google.android.apps.gsa.nga.shared.p6334b;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.l.e;

/* renamed from: com.google.android.apps.gsa.nga.shared.b.a */
/* compiled from: PG */
public final class C81015a {

    /* renamed from: a */
    public final Intent f222056a = new Intent();

    /* renamed from: b */
    private int f222057b = 0;

    /* renamed from: a */
    public final Bundle mo74793a() {
        int i = this.f222057b | 8;
        this.f222057b = i;
        this.f222056a.putExtra("InteractorSessionFlags", i);
        this.f222056a.putExtra("nga_programmatic_context_request", true);
        this.f222056a.putExtra("extra_dismiss_current_session_ui", true);
        Bundle bundle = new Bundle();
        bundle.putParcelable("voice_intent", this.f222056a);
        return bundle;
    }

    /* renamed from: b */
    public final void mo74794b(Bundle bundle, int i) {
        this.f222056a.putExtra("reissue_on_show_bundle", bundle).putExtra("reissue_on_show_flags", i);
    }

    /* renamed from: c */
    public final void mo74795c() {
        this.f222057b |= 1;
    }

    /* renamed from: d */
    public final void mo74796d() {
        this.f222056a.putExtra("extra_keep_system_dialogs", true);
    }

    /* renamed from: e */
    public final void mo74797e(e eVar) {
        this.f222056a.putExtra("nga_triggered_by", eVar.ca);
    }

    /* renamed from: f */
    public final void mo74798f() {
        this.f222057b |= 2;
    }

    /* renamed from: g */
    public final void mo74799g(String str) {
        this.f222056a.putExtra("utterance_id", str);
    }
}
