package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90035cn;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.common.base.C58869cf;
import com.google.common.base.C58911u;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.ak */
/* compiled from: PG */
public final class C113126ak {

    /* renamed from: a */
    public static final C58869cf f313427a = C58869cf.m90936b(C58911u.f156751b).mo56151a();

    /* renamed from: b */
    public final C86124t f313428b;

    /* renamed from: c */
    private final C113159bq f313429c;

    public C113126ak(C86124t tVar, C113159bq bqVar) {
        this.f313428b = tVar;
        this.f313429c = bqVar;
    }

    /* renamed from: d */
    private static double m187137d(String str, Stream stream) {
        return ((Double) stream.map(new C113124ai(str)).reduce(Double.valueOf(1.0d), C113125aj.f313426a)).doubleValue();
    }

    /* renamed from: a */
    public final double mo99887a(String str, Stream stream, int i) {
        double d;
        String str2 = str;
        Stream stream2 = stream;
        if (this.f313428b.mo79746e(C90063do.f249335bb)) {
            double a = (double) this.f313429c.mo99892a(C58485gu.m89842j(C113159bq.f313474a.mo56155i(str2)), (C58485gu) stream2.collect(C58370cn.f155946a), i);
            if (a > this.f313428b.mo79747m(C90063do.f249552fg)) {
                return a;
            }
            return C59203do.f157270a;
        }
        double m = this.f313428b.mo79747m(C90063do.f249635k);
        double m2 = this.f313428b.mo79747m(C90063do.f249307b);
        C58485gu guVar = (C58485gu) stream2.collect(C58370cn.f155946a);
        if (guVar.isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
            d = 0.0d;
        } else {
            d = 1.0d;
            for (String d2 : f313427a.mo56153g(str2)) {
                double d3 = m187137d(d2, Collection.EL.stream(guVar));
                d = d3 < m ? d * (1.0d - d3) : d * m2;
            }
        }
        if (d > this.f313428b.mo79747m(C90063do.f249635k)) {
            return d;
        }
        return C59203do.f157270a;
    }

    /* renamed from: b */
    public final double mo99888b(String str, Stream stream, int i) {
        if (this.f313428b.mo79746e(C90063do.f249335bb) || this.f313428b.mo79746e(C90063do.f249351br)) {
            return (double) this.f313429c.mo99892a((C58485gu) stream.collect(C58370cn.f155946a), C58485gu.m89846n(str), i);
        }
        double d = m187137d(str, stream);
        C58976aa aaVar = C58975e.f156826a;
        return d <= this.f313428b.mo79747m(C90063do.f249635k) ? 1.0d - d : C59203do.f157270a;
    }

    /* renamed from: c */
    public final double mo99889c(C113405ep epVar, String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return C59203do.f157270a;
        }
        String lowerCase = str2.trim().toLowerCase(Locale.getDefault());
        String lowerCase2 = str.trim().toLowerCase(Locale.getDefault());
        if (f313427a.mo56155i(lowerCase).size() <= 1 && (!this.f313428b.mo79746e(C90035cn.f248379d) || (epVar.mo100024h() != C48674ai.GEMINI && epVar.mo100024h() != C48674ai.INTENT_LAUNCHER))) {
            return mo99888b(lowerCase2, Stream.CC.m71935of(lowerCase), epVar.mo100022f().f53684l);
        }
        int indexOf = lowerCase2.indexOf(lowerCase);
        if (indexOf < 0) {
            return C59203do.f157270a;
        }
        if (!this.f313428b.mo79746e(C90063do.f249386cZ)) {
            double length = (double) lowerCase.length();
            double length2 = (double) lowerCase2.length();
            Double.isNaN(length);
            Double.isNaN(length2);
            return length / length2;
        } else if (indexOf <= 0 || Character.isWhitespace(lowerCase2.charAt(indexOf - 1))) {
            int length3 = lowerCase.length() + indexOf;
            while (length3 < lowerCase2.length() && !Character.isWhitespace(lowerCase2.charAt(length3))) {
                length3++;
            }
            double length4 = (double) lowerCase.length();
            double d = (double) (length3 - indexOf);
            Double.isNaN(length4);
            Double.isNaN(d);
            return length4 / d;
        } else {
            C58976aa aaVar = C58975e.f156826a;
            return C59203do.f157270a;
        }
    }
}
