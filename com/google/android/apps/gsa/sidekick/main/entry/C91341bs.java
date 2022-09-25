package com.google.android.apps.gsa.sidekick.main.entry;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90952r;
import com.google.android.apps.gsa.sidekick.main.notifications.C91528bm;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60934v;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;
import dagger.C68214a;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.bs */
/* compiled from: PG */
public final class C91341bs implements C91351g {

    /* renamed from: a */
    private final C68214a f254893a;

    /* renamed from: b */
    private final C68214a f254894b;

    /* renamed from: c */
    private final C68214a f254895c;

    public C91341bs(C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f254894b = aVar2;
        this.f254893a = aVar;
        this.f254895c = aVar3;
    }

    /* renamed from: a */
    public final C60870cx mo85660a(C7718hj hjVar, boolean z) {
        ArrayList arrayList = new ArrayList(3);
        C60870cx e = ((C91306ak) this.f254894b.mo27525b()).mo85592e(new C58759qy(hjVar));
        ((C90929bz) this.f254893a.mo27525b()).mo85142g(e, new C90952r("SearchEntryDismisser", "handleDismissedEntries", "failure"));
        arrayList.add(e);
        if (z) {
            arrayList.add(((C91528bm) this.f254895c.mo27525b()).mo85868c(hjVar, C7681g.DISMISS));
        }
        return C60856cj.m92892a(arrayList).mo57334a(new C60934v(C118826c.f331422a), C60826bg.f164896a);
    }
}
