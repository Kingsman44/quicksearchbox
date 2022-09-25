package com.google.android.apps.gsa.search.core.service;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6513aj.p6514a.C84515a;
import com.google.android.apps.gsa.shared.p6997as.p6998a.C89288b;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.libraries.p1646ay.C19601c;

/* renamed from: com.google.android.apps.gsa.search.core.service.bf */
/* compiled from: PG */
public final class C86639bf {

    /* renamed from: a */
    public final C84515a f234066a;

    public C86639bf(C84515a aVar) {
        this.f234066a = aVar;
    }

    /* renamed from: a */
    public static void m139563a(Intent intent, long j, boolean z) {
        intent.addFlags(67108864);
        if (z) {
            C89429a.m145452j(intent);
        }
        intent.putExtra("handover-session-id", j);
        intent.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION", 2);
        if (C19601c.m37398e(intent)) {
            Intent b = C19601c.m37395b(intent);
            if (b.getData() == null) {
                b.setData(C89288b.m145219a(j));
            }
        } else if (intent.getData() == null) {
            intent.setData(C89288b.m145219a(j));
        } else {
            intent.setData(intent.getData().buildUpon().appendQueryParameter("id", Long.toString(j)).build());
        }
    }
}
