package androidx.work.impl.utils;

import androidx.work.C4380ad;
import androidx.work.C4636q;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C4542a;
import androidx.work.impl.p207b.C4471af;
import androidx.work.impl.utils.p210b.C4595b;

/* renamed from: androidx.work.impl.utils.ai */
/* compiled from: PG */
public final class C4588ai implements C4636q {

    /* renamed from: a */
    final C4542a f14472a;

    /* renamed from: b */
    final C4471af f14473b;

    /* renamed from: c */
    public final C4595b f14474c;

    static {
        C4380ad.m12561i("WMFgUpdater");
    }

    public C4588ai(WorkDatabase workDatabase, C4542a aVar, C4595b bVar) {
        this.f14472a = aVar;
        this.f14474c = bVar;
        this.f14473b = workDatabase.mo9364F();
    }
}
