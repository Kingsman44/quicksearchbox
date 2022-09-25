package com.google.android.libraries.search.assistant.p2786t.p2790b.p2791a;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.t.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C36467a implements PendingIntent.OnFinished {

    /* renamed from: a */
    public final /* synthetic */ C2164c f95208a;

    public /* synthetic */ C36467a(C2164c cVar) {
        this.f95208a = cVar;
    }

    public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
        C2164c cVar = this.f95208a;
        if (i != 0) {
            ((C59052c) ((C59052c) C36469c.f95212a.mo56226d()).mo56372aa(51492)).mo56387q("Initial code has been overwritten with: %d", i);
            cVar.mo5439d(new RuntimeException("Received a non-zero resultCode"));
            return;
        }
        cVar.mo5437b((Object) null);
    }
}
