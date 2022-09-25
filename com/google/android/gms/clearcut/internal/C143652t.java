package com.google.android.gms.clearcut.internal;

import androidx.core.p097i.C1970e;
import androidx.p060c.C0977g;
import androidx.p060c.C0984n;
import com.google.common.p4575r.C60757n;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.gms.clearcut.internal.t */
/* compiled from: PG */
final class C143652t {

    /* renamed from: a */
    private static C143652t f389449a;

    /* renamed from: b */
    private final Map f389450b = new C0977g();

    /* renamed from: c */
    private int f389451c = 0;

    private C143652t() {
    }

    /* renamed from: b */
    static synchronized C143652t m233362b() {
        C143652t tVar;
        synchronized (C143652t.class) {
            if (f389449a == null) {
                f389449a = new C143652t();
            }
            tVar = f389449a;
        }
        return tVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized BatchedLogErrorParcelable mo118986a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f389450b.values());
        int i = this.f389451c;
        if (i > 0) {
            arrayList.add(new LogErrorParcelable("UNKNOWN", 1002, i));
            this.f389451c = 0;
        }
        this.f389450b.clear();
        return new BatchedLogErrorParcelable(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo118987c(LogErrorParcelable logErrorParcelable) {
        C1970e eVar = new C1970e(logErrorParcelable.f389427a, Integer.valueOf(logErrorParcelable.f389428b));
        LogErrorParcelable logErrorParcelable2 = (LogErrorParcelable) this.f389450b.get(eVar);
        if (logErrorParcelable2 != null) {
            logErrorParcelable2.f389429c = C60757n.m92748i(((long) logErrorParcelable2.f389429c) + ((long) logErrorParcelable.f389429c));
            return;
        }
        Map map = this.f389450b;
        if (((C0984n) map).f3122d >= 100) {
            this.f389451c = C60757n.m92748i(((long) this.f389451c) + ((long) logErrorParcelable.f389429c));
        } else {
            map.put(eVar, logErrorParcelable);
        }
    }
}
