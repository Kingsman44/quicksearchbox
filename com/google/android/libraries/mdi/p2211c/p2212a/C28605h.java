package com.google.android.libraries.mdi.p2211c.p2212a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.search.p10865b.C145861a;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.mdi.c.a.h */
/* compiled from: PG */
final class C28605h extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C28607j f77823a;

    public C28605h(C28607j jVar) {
        this.f77823a = jVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.icing.PROPAGATE_DELETE".equals(intent.getAction())) {
            ArrayList<Integer> integerArrayListExtra = intent.getIntegerArrayListExtra("com.google.android.gms.icing.extra.document_ids");
            if (integerArrayListExtra != null) {
                int size = integerArrayListExtra.size();
                for (int i = 0; i < size; i++) {
                    this.f77823a.f77831h.add(new C145861a(integerArrayListExtra.get(i).intValue()));
                }
                this.f77823a.mo34283d(true);
                C28607j jVar = this.f77823a;
                if (jVar.f77832i == 2) {
                    jVar.mo34282c();
                    return;
                }
                return;
            }
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.android.gms.icing.extra.cache_names");
            if (stringArrayListExtra != null && stringArrayListExtra.contains(this.f77823a.f77825b)) {
                this.f77823a.mo34282c();
            } else if (intent.hasExtra("com.google.android.gms.icing.extra.invalidate_all_caches")) {
                this.f77823a.mo34282c();
            }
        }
    }
}
