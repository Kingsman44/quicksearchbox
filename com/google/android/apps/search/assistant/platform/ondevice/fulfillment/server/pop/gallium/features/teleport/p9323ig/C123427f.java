package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.f */
/* compiled from: PG */
abstract class C123427f {
    /* renamed from: b */
    static C123427f m202783b(C123427f fVar, C123427f fVar2) {
        C58480gp e = C58485gu.m89837e();
        e.mo55396h(fVar.mo105927h());
        e.mo55396h((Iterable) Collection.EL.stream(fVar2.mo105927h()).map(new C123400e(fVar)).collect(C58370cn.f155946a));
        return m202785d(String.valueOf(fVar.mo105929i()).concat(String.valueOf(fVar2.mo105929i())), e.mo55394f());
    }

    /* renamed from: c */
    static C123427f m202784c(C123427f fVar, String str) {
        return m202785d(String.valueOf(fVar.mo105929i()).concat(str), fVar.mo105927h());
    }

    /* renamed from: d */
    static C123427f m202785d(String str, List list) {
        return new C123304al(str, C58485gu.m89842j(list));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C80047aa mo106005a(int i) {
        return (C80047aa) mo105927h().get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C123427f mo106006e() {
        C123427f d = m202785d(mo105929i(), mo105927h());
        int i = 0;
        while (true) {
            C123304al alVar = (C123304al) d;
            if (i >= alVar.f341042a.length()) {
                return d;
            }
            if (alVar.f341042a.charAt(i) == ' ') {
                int i2 = i + 1;
                while (i2 < alVar.f341042a.length() && alVar.f341042a.charAt(i2) == ' ') {
                    i2++;
                }
                if (i == 0) {
                    i = 0;
                } else if (i2 != alVar.f341042a.length()) {
                    if (i2 - i > 1) {
                        d = d.mo106007f(C123454g.m202802c(i, i2), " ");
                    }
                }
                d = d.mo106007f(C123454g.m202802c(i, i2), BuildConfig.FLAVOR);
            }
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C123427f mo106007f(C123454g gVar, String str) {
        C123305am amVar = (C123305am) gVar;
        if (amVar.f341044a != amVar.f341045b || !str.isEmpty()) {
            return m202783b(m202784c(mo106008g(C123454g.m202802c(0, amVar.f341044a)), str), mo106008g(C123454g.m202802c(amVar.f341045b, mo105929i().length())));
        }
        return m202785d(mo105929i(), mo105927h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C123427f mo106008g(C123454g gVar) {
        C123305am amVar = (C123305am) gVar;
        return m202785d(mo105929i().substring(amVar.f341044a, amVar.f341045b), (C58485gu) Collection.EL.stream(mo105927h()).filter(new C123346c(gVar)).map(new C123373d(gVar)).collect(C58370cn.f155946a));
    }

    /* renamed from: h */
    public abstract C58485gu mo105927h();

    /* renamed from: i */
    public abstract String mo105929i();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo106009j() {
        return !mo105927h().isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo106010k() {
        return mo105929i().isEmpty() && !mo106009j();
    }
}
