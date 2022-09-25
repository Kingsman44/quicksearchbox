package com.google.android.libraries.places.api.model;

import android.text.TextUtils;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58714pg;
import java.util.List;

/* renamed from: com.google.android.libraries.places.api.model.y */
/* compiled from: PG */
public abstract class C31892y {
    /* renamed from: a */
    public abstract Place mo37598a();

    /* renamed from: b */
    public abstract void mo37599b(List list);

    /* renamed from: c */
    public abstract void mo37600c(List list);

    /* renamed from: d */
    public abstract void mo37601d(List list);

    /* renamed from: e */
    public final Place mo37632e() {
        Place a = mo37598a();
        List<String> r = a.mo37521r();
        if (r != null) {
            for (String isEmpty : r) {
                C58838bb.m90884s(!TextUtils.isEmpty(isEmpty), "Attributions must not contain null or empty values.");
            }
        }
        Integer j = a.mo37513j();
        if (j != null) {
            C58838bb.m90891z(C58714pg.m90504g(0, 4).mo5941a(j), "Price Level must not be out-of-range: %s to %s, but was: %s.", 0, 4, j);
        }
        Double h = a.mo37510h();
        if (h != null) {
            Double valueOf = Double.valueOf(1.0d);
            Double valueOf2 = Double.valueOf(5.0d);
            C58838bb.m90891z(C58714pg.m90504g(valueOf, valueOf2).mo5941a(h), "Rating must not be out-of-range: %s to %s, but was: %s.", valueOf, valueOf2, h);
        }
        Integer k = a.mo37514k();
        if (k != null) {
            C58838bb.m90887v(C58714pg.m90502e(0).mo5941a(k), "User Ratings Total must not be < 0, but was: %s.", k);
        }
        if (r != null) {
            mo37599b(C58485gu.m89842j(r));
        }
        List s = a.mo37522s();
        if (s != null) {
            mo37600c(C58485gu.m89842j(s));
        }
        List t = a.mo37523t();
        if (t != null) {
            mo37601d(C58485gu.m89842j(t));
        }
        return mo37598a();
    }
}
