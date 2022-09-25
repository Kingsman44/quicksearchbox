package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4522b.C58557jl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.da */
/* compiled from: PG */
final class C98434da {

    /* renamed from: a */
    public final String f274809a;

    /* renamed from: b */
    public int f274810b;

    /* renamed from: c */
    public int f274811c;

    /* renamed from: d */
    public final List f274812d = new ArrayList(5);

    public C98434da(String str, int i, int i2) {
        this.f274809a = str;
        this.f274810b = i;
        this.f274811c = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo91093a(int i) {
        mo91097e(i);
        if (this.f274810b == 0) {
            return Integer.MAX_VALUE;
        }
        if (this.f274812d.size() < this.f274810b) {
            return i;
        }
        List list = this.f274812d;
        return Math.max(((Integer) list.get(list.size() - this.f274810b)).intValue() + this.f274811c, i);
    }

    /* renamed from: b */
    public final void mo91094b(C91006f fVar, int i) {
        fVar.mo85291r(this.f274809a);
        fVar.mo85279c("quota").mo85276a(C90752i.m148230d(Integer.valueOf(this.f274810b)));
        fVar.mo85279c("windowSecs").mo85276a(C90752i.m148230d(Integer.valueOf(this.f274811c)));
        for (Integer intValue : this.f274812d) {
            fVar.mo85279c("recentRequest").mo85276a(C90752i.m148232f(new Date(TimeUnit.SECONDS.toMillis((long) intValue.intValue()))));
        }
        fVar.mo85279c("next").mo85276a(C90752i.m148232f(new Date(TimeUnit.SECONDS.toMillis((long) mo91093a(i)))));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo91095c(int i) {
        mo91097e(i);
        List list = this.f274812d;
        Integer valueOf = Integer.valueOf(i);
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 1);
        }
        this.f274812d.add(binarySearch, valueOf);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo91096d(List list) {
        this.f274812d.clear();
        this.f274812d.addAll(list);
        Collections.sort(this.f274812d);
    }

    /* renamed from: e */
    public final void mo91097e(int i) {
        C58557jl.m90145z(this.f274812d, new C98432cz(this, i));
    }
}
