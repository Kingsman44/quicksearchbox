package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90941g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60887da;
import dagger.C68214a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Deprecated
/* renamed from: com.google.android.apps.gsa.shared.util.c.a.b */
/* compiled from: PG */
public final class C90808b implements C90941g {

    /* renamed from: a */
    private final C21370a f253933a;

    /* renamed from: b */
    private final C68214a f253934b;

    public C90808b(C21370a aVar, C68214a aVar2) {
        this.f253933a = aVar;
        this.f253934b = aVar2;
    }

    /* renamed from: a */
    public final C60887da mo85131a(String str) {
        C21370a aVar = this.f253933a;
        C58838bb.m90868c(!TextUtils.isEmpty(str));
        aVar.getClass();
        C90476a aVar2 = C91018d.f254254a;
        String str2 = str;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, TimeUnit.MINUTES.toSeconds(5), TimeUnit.SECONDS, new LinkedBlockingQueue(), new C90853m(str2, 0));
        C90844d dVar = new C90844d(threadPoolExecutor, new C90815bg(str2, 1, new C90816bh(threadPoolExecutor), false, aVar, true, 10));
        C68214a aVar3 = this.f253934b;
        if (aVar3 != null) {
            ((C91022f) aVar3.mo27525b()).mo85301a(dVar);
        }
        return dVar;
    }
}
