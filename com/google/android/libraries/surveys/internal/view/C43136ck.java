package com.google.android.libraries.surveys.internal.view;

import android.support.p031v4.app.C0204bw;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import com.google.android.libraries.surveys.C43027d;
import com.google.android.libraries.surveys.internal.p3328e.C43054c;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.p4281bu.p4282a.C56493ad;
import com.google.p4281bu.p4282a.C56532bp;
import com.google.p4281bu.p4282a.C56545cb;
import com.google.p4281bu.p4282a.C56546cc;
import java.util.ArrayList;
import java.util.List;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68353ab;

/* renamed from: com.google.android.libraries.surveys.internal.view.ck */
/* compiled from: PG */
public final class C43136ck extends C0204bw {

    /* renamed from: c */
    public final List f112817c;

    /* renamed from: d */
    public final C43027d f112818d;

    /* renamed from: e */
    private final Integer f112819e;

    /* renamed from: f */
    private C58495hd f112820f;

    public C43136ck(FragmentManager fragmentManager, C56532bp bpVar, Integer num, boolean z, boolean z2, C43027d dVar, int i) {
        super(fragmentManager);
        ArrayList<C43131cf> arrayList = new ArrayList<>(bpVar.f150969e.size());
        for (C56546cc ccVar : bpVar.f150969e) {
            int a = C56545cb.m88209a(ccVar.f150999g);
            int i2 = (a == 0 ? 1 : a) - 2;
            if (i2 == 1) {
                arrayList.add(new C43112bn(ccVar));
            } else if (i2 == 2) {
                arrayList.add(new C43125c(ccVar));
            } else if (i2 == 3) {
                arrayList.add(new C43094aw(ccVar));
            } else if (i2 == 4) {
                arrayList.add(new C43159q(ccVar));
            }
        }
        if (!C43054c.m75960c(C68353ab.m98708c(C43054c.f112610b))) {
            C56493ad adVar = bpVar.f150966b;
            arrayList.add(new C43142cq(adVar == null ? C56493ad.f150888f : adVar));
        } else if (dVar == C43027d.CARD) {
            C56493ad adVar2 = bpVar.f150966b;
            arrayList.add(new C43142cq(adVar2 == null ? C56493ad.f150888f : adVar2));
        }
        this.f112817c = arrayList;
        int i3 = 0;
        if (z && !arrayList.isEmpty()) {
            arrayList.remove(0);
            i--;
        }
        if (C43054c.m75958a() && i > 0) {
            arrayList.subList(0, i).clear();
        }
        if (z2 && !arrayList.isEmpty()) {
            arrayList.subList(0, arrayList.size() - 1).clear();
        }
        C58490gz gzVar = new C58490gz(4);
        for (C43131cf cfVar : arrayList) {
            int i4 = cfVar.f112810b;
            if (i4 == 0) {
                throw null;
            } else if (i4 != 5) {
                gzVar.mo55429h(Integer.valueOf(cfVar.f112809a.f150995c - 1), Integer.valueOf(i3));
                i3++;
            }
        }
        this.f112820f = gzVar.mo55427f(true);
        if (!this.f112817c.isEmpty()) {
            this.f112819e = num;
            this.f112818d = dVar;
            return;
        }
        throw new NullPointerException("Questions were missing!");
    }

    /* renamed from: o */
    public static int m76111o(Fragment fragment) {
        return fragment.getArguments().getInt("QuestionIndex", -1);
    }

    /* renamed from: b */
    public final Fragment mo645b(int i) {
        Fragment a = ((C43131cf) this.f112817c.get(i)).mo46158a(this.f112819e, i);
        a.getArguments().putInt("QuestionIndex", i);
        return a;
    }

    /* renamed from: k */
    public final int mo9175k() {
        return this.f112817c.size();
    }

    /* renamed from: p */
    public final int mo46200p(int i) {
        return ((Integer) this.f112820f.get(Integer.valueOf(i))).intValue();
    }

    /* renamed from: q */
    public final C56546cc mo46201q(int i) {
        return ((C43131cf) this.f112817c.get(i)).f112809a;
    }
}
