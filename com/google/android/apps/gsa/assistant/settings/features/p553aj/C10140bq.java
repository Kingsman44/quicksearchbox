package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.view.View;
import com.google.android.apps.gsa.assistant.settings.features.av.ab;
import com.google.android.apps.gsa.assistant.settings.features.av.bm;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.bq */
/* compiled from: PG */
public final /* synthetic */ class C10140bq implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C10141br f34487a;

    public /* synthetic */ C10140bq(C10141br brVar) {
        this.f34487a = brVar;
    }

    public final void run() {
        C10141br brVar = this.f34487a;
        List k = brVar.f34489b.k(3);
        List j = brVar.f34489b.j((String) null, 3);
        int i = 0;
        boolean z = k.isEmpty() && j.isEmpty();
        brVar.f34493f.setVisibility(true != z ? 8 : 0);
        brVar.f34494g.setVisibility(true != z ? 0 : 8);
        brVar.f34491d.setAdapter(new bm(k));
        brVar.f34492e.setAdapter(new ab(j));
        View view = brVar.f34495h;
        if (true != brVar.f34489b.s(3)) {
            i = 8;
        }
        view.setVisibility(i);
    }
}
