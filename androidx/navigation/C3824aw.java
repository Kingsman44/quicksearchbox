package androidx.navigation;

import android.os.Bundle;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.aw */
/* compiled from: PG */
public final class C3824aw implements Comparable {

    /* renamed from: a */
    public final C3825ax f12347a;

    /* renamed from: b */
    public final Bundle f12348b;

    /* renamed from: c */
    private final boolean f12349c;

    /* renamed from: d */
    private final boolean f12350d;

    /* renamed from: e */
    private final int f12351e;

    public C3824aw(C3825ax axVar, Bundle bundle, boolean z, boolean z2, int i) {
        this.f12347a = axVar;
        this.f12348b = bundle;
        this.f12349c = z;
        this.f12350d = z2;
        this.f12351e = i;
    }

    /* renamed from: a */
    public final int compareTo(C3824aw awVar) {
        C69664n.m101061g(awVar, "other");
        if (this.f12349c) {
            if (!awVar.f12349c) {
                return 1;
            }
        } else if (awVar.f12349c) {
            return -1;
        }
        Bundle bundle = this.f12348b;
        if (bundle != null && awVar.f12348b == null) {
            return 1;
        }
        if (bundle == null && awVar.f12348b != null) {
            return -1;
        }
        if (bundle != null) {
            int size = bundle.size();
            Bundle bundle2 = awVar.f12348b;
            C69664n.m101058d(bundle2);
            int size2 = size - bundle2.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        if (this.f12350d) {
            if (!awVar.f12350d) {
                return 1;
            }
        } else if (awVar.f12350d) {
            return -1;
        }
        return this.f12351e - awVar.f12351e;
    }
}
