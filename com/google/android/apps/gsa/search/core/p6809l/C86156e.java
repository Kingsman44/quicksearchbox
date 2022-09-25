package com.google.android.apps.gsa.search.core.p6809l;

import com.google.android.apps.gsa.assist.p501a.C9318f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82460g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4671b.C61818k;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.search.core.l.e */
/* compiled from: PG */
public final /* synthetic */ class C86156e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C86159h f232824a;

    /* renamed from: b */
    public final /* synthetic */ List f232825b;

    /* renamed from: c */
    public final /* synthetic */ C9318f f232826c;

    public /* synthetic */ C86156e(C86159h hVar, List list, C9318f fVar) {
        this.f232824a = hVar;
        this.f232825b = list;
        this.f232826c = fVar;
    }

    public final Object call() {
        C86159h hVar = this.f232824a;
        List list = this.f232825b;
        C9318f fVar = this.f232826c;
        int i = 0;
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            i += ((C61818k) C60856cj.m92909r((C60870cx) G.next())).getSerializedSize();
        }
        C83305i iVar = (C83305i) hVar.f232836e.get();
        String name = fVar.name();
        if (name != null) {
            iVar.mo75579d(new C82460g("ASSIST_DATA_C_D_C_SIZE", Double.valueOf((double) i), name));
            return null;
        }
        throw new NullPointerException("Null assistDataType");
    }
}
