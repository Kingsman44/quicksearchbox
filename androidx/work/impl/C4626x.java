package androidx.work.impl;

import android.text.TextUtils;
import androidx.work.C4380ad;
import androidx.work.C4388al;
import androidx.work.C4393aq;
import androidx.work.C4400ax;
import androidx.work.impl.utils.C4600g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.work.impl.x */
/* compiled from: PG */
public final class C4626x extends C4393aq {

    /* renamed from: g */
    private static final String f14532g = C4380ad.m12561i("WorkContinuationImpl");

    /* renamed from: a */
    public final C4452ag f14533a;

    /* renamed from: b */
    public final String f14534b;

    /* renamed from: c */
    public final List f14535c;

    /* renamed from: d */
    public final List f14536d;

    /* renamed from: e */
    public boolean f14537e;

    /* renamed from: f */
    public final int f14538f;

    /* renamed from: h */
    private final List f14539h = new ArrayList();

    /* renamed from: i */
    private C4388al f14540i;

    public C4626x(C4452ag agVar, String str, int i, List list) {
        this.f14533a = agVar;
        this.f14534b = str;
        this.f14538f = i;
        this.f14535c = list;
        this.f14536d = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            String a = ((C4400ax) list.get(i2)).mo9342a();
            this.f14536d.add(a);
            this.f14539h.add(a);
        }
    }

    /* renamed from: b */
    public static Set m13021b() {
        return new HashSet();
    }

    /* renamed from: a */
    public final C4388al mo9566a() {
        if (!this.f14537e) {
            C4600g gVar = new C4600g(this, new C4558n());
            this.f14533a.f14151m.f14486a.execute(gVar);
            this.f14540i = gVar.f14496a;
        } else {
            C4380ad h = C4380ad.m12560h();
            String str = f14532g;
            h.mo9314f(str, "Already enqueued work ids (" + TextUtils.join(", ", this.f14536d) + ")");
        }
        return this.f14540i;
    }
}
