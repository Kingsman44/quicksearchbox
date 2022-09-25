package androidx.work.impl;

import android.content.Context;
import androidx.work.C4406bc;
import androidx.work.C4409e;
import androidx.work.impl.foreground.C4542a;
import androidx.work.impl.p207b.C4470ae;
import androidx.work.impl.utils.p210b.C4595b;
import java.util.List;

/* renamed from: androidx.work.impl.aq */
/* compiled from: PG */
public final class C4462aq {

    /* renamed from: a */
    final Context f14175a;

    /* renamed from: b */
    final C4542a f14176b;

    /* renamed from: c */
    final C4409e f14177c;

    /* renamed from: d */
    final WorkDatabase f14178d;

    /* renamed from: e */
    final C4470ae f14179e;

    /* renamed from: f */
    List f14180f;

    /* renamed from: g */
    public final List f14181g;

    /* renamed from: h */
    final C4595b f14182h;

    public C4462aq(Context context, C4409e eVar, C4595b bVar, C4542a aVar, WorkDatabase workDatabase, C4470ae aeVar, List list) {
        new C4406bc();
        this.f14175a = context.getApplicationContext();
        this.f14182h = bVar;
        this.f14176b = aVar;
        this.f14177c = eVar;
        this.f14178d = workDatabase;
        this.f14179e = aeVar;
        this.f14181g = list;
    }
}
