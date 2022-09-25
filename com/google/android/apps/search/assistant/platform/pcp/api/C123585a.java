package com.google.android.apps.search.assistant.platform.pcp.api;

import android.content.Intent;
import android.os.Build;
import com.google.apps.tiktok.p3643g.C47102r;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.api.a */
/* compiled from: PG */
public final class C123585a implements C47102r {

    /* renamed from: a */
    private final C123604t f341474a;

    public C123585a(C123604t tVar) {
        this.f341474a = tVar;
    }

    /* renamed from: b */
    public final C60870cx mo20087b(Intent intent, int i) {
        C53306j a;
        if (!Build.TYPE.equals("userdebug")) {
            return C60866ct.f164955a;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (!"com.google.android.googlequicksearchbox.PCP_SEND_NOTIFICATION".equals(intent.getAction()) || (a = C53306j.m86809a(intent.getIntExtra("client_type", 0))) == C53306j.UNKNOWNN) {
            return C60866ct.f164955a;
        }
        return this.f341474a.mo106055b(C58485gu.m89846n(a), 1, (Instant) null);
    }
}
