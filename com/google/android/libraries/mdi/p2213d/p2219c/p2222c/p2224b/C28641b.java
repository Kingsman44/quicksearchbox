package com.google.android.libraries.mdi.p2213d.p2219c.p2222c.p2224b;

import android.net.Uri;
import com.google.android.libraries.mdi.p2213d.p2219c.p2222c.C28637ai;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.d.c.c.b.b */
/* compiled from: PG */
public final class C28641b {

    /* renamed from: a */
    public final C42813k f77890a;

    /* renamed from: b */
    private final Executor f77891b;

    public C28641b(Executor executor, C42813k kVar) {
        this.f77891b = executor;
        this.f77890a = kVar;
    }

    /* renamed from: a */
    public final C60870cx mo34309a(C28637ai aiVar, int i) {
        Uri uri;
        if (i == 0) {
            uri = Uri.parse(aiVar.f77876a);
        } else if (i == 1) {
            uri = Uri.parse(aiVar.f77877b);
        } else if (i != 2) {
            uri = Uri.parse(aiVar.f77879d);
        } else {
            uri = Uri.parse(aiVar.f77878c);
        }
        return C60856cj.m92905n(new C28640a(this, uri), this.f77891b);
    }
}
