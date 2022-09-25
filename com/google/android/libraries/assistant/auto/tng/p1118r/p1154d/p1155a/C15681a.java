package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1155a;

import android.content.Context;
import androidx.work.C4634o;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1162f.C15750l;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46165aq;
import com.google.apps.tiktok.account.data.C46217l;
import com.google.apps.tiktok.account.data.C46319n;
import com.google.apps.tiktok.contrib.work.C46506a;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46583q;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.a.a */
/* compiled from: PG */
public final class C15681a implements C46319n {

    /* renamed from: a */
    private final Context f46812a;

    /* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.a.a$a */
    /* compiled from: PG */
    public interface C15682a {
        /* renamed from: gO */
        C46506a mo22505gO();
    }

    public C15681a(Context context) {
        this.f46812a = context;
    }

    /* renamed from: a */
    public final C60870cx mo22504a(C46217l lVar) {
        C46165aq aqVar = (C46165aq) lVar;
        C46506a gO = ((C15682a) C47245e.m84045a(this.f46812a, C15682a.class, aqVar.f121090a)).mo22505gO();
        AccountId accountId = aqVar.f121090a;
        Duration ofDays = Duration.ofDays(1);
        C46582p j = C46586t.m83063j(C15750l.class);
        C46570d dVar = (C46570d) j;
        dVar.f121756e = C58833ax.m90834k(C46583q.m83055c(new C46573g(ofDays.toMillis(), TimeUnit.MILLISECONDS)));
        dVar.f121757f = C58833ax.m90834k(new C46574h("periodic_update_recognition_context_worker", C4634o.KEEP));
        return gO.mo50518b(accountId, j.mo50561a());
    }
}
