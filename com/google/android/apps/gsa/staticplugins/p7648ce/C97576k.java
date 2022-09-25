package com.google.android.apps.gsa.staticplugins.p7648ce;

import com.google.android.apps.gsa.shared.p6968aa.C89046bq;
import com.google.common.p4522b.C58729pv;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.ce.k */
/* compiled from: PG */
public final class C97576k implements C89046bq {

    /* renamed from: a */
    private final List f272593a = new ArrayList();

    /* renamed from: d */
    private final synchronized C97575j m161706d(int i, String str) {
        for (C97575j jVar : this.f272593a) {
            if (i == jVar.f272589a && jVar.f272590b.matcher(str).find()) {
                return jVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final String mo79629a(int i, String str) {
        C97575j d = m161706d(i, str);
        return (d == null || d.f272591c.isEmpty()) ? str : d.f272590b.matcher(str).replaceFirst(d.f272591c);
    }

    /* renamed from: b */
    public final Map mo79630b(int i, String str) {
        C97575j d = m161706d(i, str);
        return d != null ? d.f272592d : C58729pv.f156485a;
    }

    /* renamed from: c */
    public final synchronized void mo90754c(int i, String str, String str2, Map map) {
        this.f272593a.add(new C97575j(i, str, str2, map));
    }
}
