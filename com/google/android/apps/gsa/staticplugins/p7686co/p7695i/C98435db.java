package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91388r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.db */
/* compiled from: PG */
public final class C98435db {

    /* renamed from: a */
    public static final C59071e f274813a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.co.i.db");

    /* renamed from: b */
    public final C98434da f274814b;

    /* renamed from: c */
    public final Map f274815c = new HashMap();

    /* renamed from: d */
    public int f274816d;

    /* renamed from: e */
    public int f274817e;

    /* renamed from: f */
    private final Random f274818f;

    /* renamed from: g */
    private final C91388r f274819g;

    /* renamed from: h */
    private final int f274820h;

    /* renamed from: i */
    private final int f274821i;

    /* renamed from: j */
    private final int f274822j;

    /* renamed from: k */
    private final C86124t f274823k;

    public C98435db(C86124t tVar, Random random, C91388r rVar) {
        this.f274820h = (int) tVar.mo79743a(C90120fr.f250775O);
        this.f274821i = (int) tVar.mo79743a(C90120fr.f250774N);
        this.f274822j = (int) tVar.mo79743a(C90010bp.f246942aK);
        this.f274814b = new C98434da("[main]", (int) tVar.mo79743a(C90120fr.f250776P), (int) tVar.mo79743a(C90120fr.f250777Q));
        this.f274818f = random;
        this.f274819g = rVar;
        this.f274823k = tVar;
    }

    /* renamed from: a */
    public final int mo91098a() {
        return this.f274818f.nextInt(this.f274822j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo91099b(C98418cl clVar, int i) {
        int i2;
        if (!clVar.f274766e) {
            int e = m163009e(clVar, i);
            if ((clVar.f274762a & 2) != 0 && (i2 = clVar.f274764c) > e) {
                e = i2;
            }
            if (this.f274823k.mo79746e(C90010bp.f246956aY) && this.f274819g.mo85710b() && this.f274819g.mo85709a() > e) {
                e = this.f274819g.mo85709a();
            }
            int i3 = this.f274817e;
            if (i3 > e) {
                e = i3;
            }
            if (mo91101d(clVar, i)) {
                return Integer.MAX_VALUE;
            }
            return e;
        } else if ((clVar.f274762a & 1) != 0) {
            return Integer.MAX_VALUE;
        } else {
            return i;
        }
    }

    /* renamed from: c */
    public final void mo91100c(boolean z, int i) {
        if (z) {
            this.f274816d = 0;
            this.f274817e = 0;
        } else if (i >= this.f274817e) {
            int min = i + Math.min(this.f274820h << this.f274816d, this.f274821i);
            this.f274817e = min;
            this.f274817e = min + mo91098a();
            this.f274816d++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo91101d(C98418cl clVar, int i) {
        if (clVar.f274766e) {
            return (clVar.f274762a & 1) != 0;
        }
        int e = m163009e(clVar, i);
        if ((clVar.f274762a & 1) == 0) {
            return clVar.f274765d < e - i;
        }
        int i2 = clVar.f274763b;
        int i3 = clVar.f274765d;
        return i3 < e - i2 || i3 == 0;
    }

    /* renamed from: e */
    private final int m163009e(C98418cl clVar, int i) {
        int i2;
        if (clVar.f274768g) {
            i2 = i;
        } else {
            i2 = this.f274814b.mo91093a(i);
        }
        for (String str : clVar.f274767f) {
            C98434da daVar = (C98434da) this.f274815c.get(str);
            if (daVar == null) {
                C59104x d = f274813a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "Throttler");
                ((C59052c) ((C59052c) d).mo56372aa(30686)).mo56389s("Ignoring unknown bucket: %s", str);
            } else {
                i2 = Math.max(i2, daVar.mo91093a(i));
            }
        }
        return i2;
    }
}
