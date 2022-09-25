package com.google.android.libraries.search.assistant.performer.p2766i;

import android.os.Bundle;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3924c.C51747r;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.ab */
/* compiled from: PG */
public final class C36123ab implements C35472h {

    /* renamed from: a */
    private final C60887da f94461a;

    public C36123ab(C60887da daVar) {
        this.f94461a = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C36183e.m64586d(dyVar, "calendar.FORCE_SYNC_CALENDAR");
        Bundle bundle = new Bundle(3);
        bundle.putBoolean("ignore_settings", true);
        bundle.putBoolean("expedited", true);
        bundle.putBoolean("ignore_backoff", true);
        C36122aa aaVar = new C36122aa((C51747r) C36183e.m64584b(dyVar, "force_sync_calendar_args", C51747r.f135758b.getParserForType()), bundle);
        return C60856cj.m92904m(C47810es.m84978r(aaVar), this.f94461a);
    }
}
