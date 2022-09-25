package com.google.android.libraries.search.rendering.xuikit.p3097a;

import com.google.android.libraries.search.rendering.xuikit.p3131d.p3142k.C40463g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4399b.C57711j;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.y */
/* compiled from: PG */
public final class C40085y {

    /* renamed from: a */
    public static final AtomicInteger f105303a = new AtomicInteger(1);

    /* renamed from: b */
    public static final C59071e f105304b = C59071e.m91332i("com.google.android.libraries.search.rendering.xuikit.a.y");

    /* renamed from: c */
    public final Map f105305c = new HashMap();

    /* renamed from: d */
    public final C40463g f105306d;

    public C40085y(C40463g gVar) {
        this.f105306d = gVar;
    }

    /* renamed from: a */
    public static int m69608a(C57711j jVar, C60870cx cxVar) {
        if (!cxVar.isDone()) {
            return 4;
        }
        try {
            C60856cj.m92909r(cxVar);
            return 3;
        } catch (CancellationException | ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) f105304b.mo56226d()).mo56382g(e)).mo56372aa(53295)).mo56389s("Resource %s not available due to failure", jVar.f154183b);
            return 5;
        }
    }
}
