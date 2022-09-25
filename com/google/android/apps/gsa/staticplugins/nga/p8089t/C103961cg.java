package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.nga.shared.p6309ag.C80617l;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.staticplugins.nga.p8087s.C103799g;
import com.google.common.base.C58869cf;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.base.C58903m;
import com.google.common.base.C58911u;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.cg */
/* compiled from: PG */
public final class C103961cg {

    /* renamed from: a */
    public static final C58974d f289333a = C58974d.m91136j();

    /* renamed from: b */
    public final C58881cr f289334b = C58886cw.m90973a(C103959ce.f289332a);

    /* renamed from: c */
    private final C80617l f289335c;

    /* renamed from: d */
    private final C103799g f289336d;

    public C103961cg(C103799g gVar, C80617l lVar) {
        this.f289335c = lVar;
        this.f289336d = gVar;
    }

    /* renamed from: a */
    public final C58528ij mo93899a(String str) {
        C58485gu guVar;
        Locale b = this.f289336d.mo93859b();
        C58480gp e = C58485gu.m89837e();
        if (str.isEmpty()) {
            guVar = C58485gu.m89845m();
        } else {
            for (String str2 : C58869cf.m90936b(new C58903m(';')).mo56153g(str)) {
                String[] split = str2.split("=", -1);
                if (split.length == 2) {
                    String str3 = split[0];
                    List i = C58869cf.m90936b(new C58903m('+')).mo56152f(C58911u.f156751b).mo56151a().mo56155i(str3);
                    if (!i.isEmpty()) {
                        String str4 = (String) i.get(0);
                        C58485gu j = C58485gu.m89842j(i.subList(1, i.size()));
                        String str5 = split[1];
                        Stream stream = Collection.EL.stream(C89988b.m146551d(str5));
                        C80617l lVar = this.f289335c;
                        Objects.requireNonNull(lVar);
                        C58528ij ijVar = (C58528ij) stream.map(new C103952by(lVar)).collect(C58370cn.f155947b);
                        if (ijVar.contains(C80627v.UNRECOGNIZED)) {
                            throw new IllegalArgumentException(String.format("Unrecognized group encountered in config value %s", new Object[]{str5}));
                        } else if (str4 == null) {
                            throw new NullPointerException("Null languageRange");
                        } else if (j == null) {
                            throw new NullPointerException("Null deviceModels");
                        } else if (ijVar == null) {
                            throw new NullPointerException("Null requiredGroups");
                        } else if (str3 != null) {
                            e.mo55395g(new C104125v(str3, str4, j, ijVar));
                        } else {
                            throw new NullPointerException("Null rawKey");
                        }
                    } else {
                        throw new IllegalArgumentException(String.format(Locale.US, "Could not parse %s, not a valid key=value pair.", new Object[]{str2}));
                    }
                } else {
                    throw new IllegalArgumentException(String.format(Locale.US, "Could not parse %s, not a valid key=value pair.", new Object[]{str2}));
                }
            }
            guVar = e.mo55394f().mo55401lD();
        }
        return (C58528ij) Collection.EL.stream(guVar).filter(new C103953bz(b)).peek(C103955ca.f289328a).filter(new C103956cb(this)).peek(C103957cc.f289330a).map(C103958cd.f289331a).findFirst().orElse(C58733pz.f156496a);
    }
}
