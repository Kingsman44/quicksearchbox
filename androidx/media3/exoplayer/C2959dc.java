package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: androidx.media3.exoplayer.dc */
/* compiled from: PG */
final class C2959dc extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C2960dd f8501a;

    public C2959dc(C2960dd ddVar) {
        this.f8501a = ddVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C2960dd ddVar = this.f8501a;
        ddVar.f8503b.post(new C2958db(ddVar));
    }
}
