package com.google.android.libraries.lens.view.p2178x;

import android.graphics.PointF;
import com.google.android.libraries.lens.view.gleam.C26460as;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.x.g */
/* compiled from: PG */
public final /* synthetic */ class C28213g implements C28209c {

    /* renamed from: a */
    public static final /* synthetic */ C28213g f76824a = new C28213g();

    private /* synthetic */ C28213g() {
    }

    /* renamed from: a */
    public final void mo33723a(List list) {
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            PointF pointF = ((C26460as) G.next()).f72056b;
            pointF.x *= 0.5f;
            pointF.y *= 0.5f;
        }
    }
}
