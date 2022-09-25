package com.p232a.p233a;

import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.a.a.e */
/* compiled from: PG */
public final class C4758e {

    /* renamed from: a */
    public List f15072a = null;

    /* renamed from: a */
    public final void mo9667a(C4758e eVar) {
        List list = eVar.f15072a;
        if (list != null) {
            if (this.f15072a == null) {
                this.f15072a = new ArrayList(list.size());
            }
            for (C4757d add : eVar.f15072a) {
                this.f15072a.add(add);
            }
        }
    }

    public final String toString() {
        if (this.f15072a == null) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        for (C4757d dVar : this.f15072a) {
            sb.append(dVar.toString());
            sb.append(10);
        }
        return sb.toString();
    }
}
