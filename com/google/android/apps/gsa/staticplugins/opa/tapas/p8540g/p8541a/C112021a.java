package com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.p8541a;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113159bq;
import com.google.assistant.p3781ad.p3789d.p3791b.C48711bs;
import com.google.assistant.p3781ad.p3789d.p3791b.C48712bt;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.g.a.a */
/* compiled from: PG */
public final class C112021a {

    /* renamed from: a */
    private final C113159bq f311195a;

    public C112021a(C113159bq bqVar) {
        this.f311195a = bqVar;
    }

    /* renamed from: a */
    public final C48712bt mo99338a(String str, String str2, String str3, boolean z) {
        double d;
        int i;
        String str4 = str;
        if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2)) {
            return C48712bt.f126024f;
        }
        C58485gu m = TextUtils.isEmpty(str2) ? C58485gu.m89845m() : C58485gu.m89846n(str2);
        C58485gu m2 = TextUtils.isEmpty(str3) ? C58485gu.m89845m() : C58485gu.m89846n(str3);
        int i2 = 0;
        double d2 = C59203do.f157270a;
        if (z) {
            C48712bt btVar = C48712bt.f126024f;
            if (m2.isEmpty()) {
                if (m.isEmpty()) {
                    return C48712bt.f126024f;
                }
                int i3 = ((C58724pq) m).f156474d;
                while (i2 < i3) {
                    C48712bt c = C113159bq.m187172c(str4, (String) m.get(i2), BuildConfig.FLAVOR);
                    double d3 = c.f126027b;
                    if (d3 > d2) {
                        btVar = c;
                    }
                    if (d3 > d2) {
                        d2 = d3;
                    }
                    i2++;
                }
            } else if (m.isEmpty()) {
                int i4 = ((C58724pq) m2).f156474d;
                while (i2 < i4) {
                    C48712bt c2 = C113159bq.m187172c(str4, BuildConfig.FLAVOR, (String) m2.get(i2));
                    double d4 = c2.f126027b;
                    if (d4 > d2) {
                        btVar = c2;
                    }
                    if (d4 > d2) {
                        d2 = d4;
                    }
                    i2++;
                }
            } else {
                int i5 = ((C58724pq) m2).f156474d;
                int i6 = 0;
                while (i6 < i5) {
                    String str5 = (String) m2.get(i6);
                    int i7 = ((C58724pq) m).f156474d;
                    int i8 = 0;
                    while (true) {
                        i = i6 + 1;
                        if (i8 >= i7) {
                            break;
                        }
                        C48712bt c3 = C113159bq.m187172c(str4, (String) m.get(i8), str5);
                        double d5 = c3.f126027b;
                        if (d5 > d2) {
                            btVar = c3;
                        }
                        if (d5 > d2) {
                            d2 = d5;
                        }
                        i8++;
                    }
                    i6 = i;
                }
            }
            return btVar;
        }
        C48711bs bsVar = (C48711bs) C48712bt.f126024f.createBuilder();
        C58485gu j = C58485gu.m89842j(C113159bq.f313474a.mo56155i(str4));
        if (!m.isEmpty()) {
            double a = (double) this.f311195a.mo99892a(j, m, 1);
            Double.isNaN(a);
            d = a + C59203do.f157270a;
            bsVar.copyOnWrite();
            C48712bt btVar2 = (C48712bt) bsVar.instance;
            btVar2.f126026a |= 2;
            btVar2.f126028c = a;
            i2 = 1;
        } else {
            bsVar.copyOnWrite();
            C48712bt btVar3 = (C48712bt) bsVar.instance;
            btVar3.f126026a |= 2;
            btVar3.f126028c = C59203do.f157270a;
            d = 0.0d;
        }
        if (!m2.isEmpty()) {
            double a2 = (double) this.f311195a.mo99892a(j, m2, 1);
            Double.isNaN(a2);
            d += a2;
            i2++;
            bsVar.copyOnWrite();
            C48712bt btVar4 = (C48712bt) bsVar.instance;
            btVar4.f126026a |= 4;
            btVar4.f126029d = a2;
        } else {
            bsVar.copyOnWrite();
            C48712bt btVar5 = (C48712bt) bsVar.instance;
            btVar5.f126026a |= 4;
            btVar5.f126029d = C59203do.f157270a;
        }
        if (i2 == 0) {
            bsVar.copyOnWrite();
            C48712bt btVar6 = (C48712bt) bsVar.instance;
            btVar6.f126026a |= 1;
            btVar6.f126027b = C59203do.f157270a;
        } else {
            bsVar.copyOnWrite();
            C48712bt btVar7 = (C48712bt) bsVar.instance;
            btVar7.f126026a |= 1;
            double d6 = (double) i2;
            Double.isNaN(d6);
            btVar7.f126027b = d / d6;
        }
        return (C48712bt) bsVar.build();
    }
}
