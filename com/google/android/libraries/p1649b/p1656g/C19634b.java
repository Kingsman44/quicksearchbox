package com.google.android.libraries.p1649b.p1656g;

import android.util.Log;
import com.google.android.libraries.p1649b.p1651b.C19611a;
import com.google.android.libraries.p1649b.p1653d.C19624b;
import com.google.android.libraries.p1649b.p1654e.C19626a;
import com.google.android.libraries.p1649b.p1655f.C19628b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58672ns;
import com.google.common.p4522b.C58675nv;
import com.google.common.p4522b.C58685oe;
import com.google.common.p4522b.C58743qi;

/* renamed from: com.google.android.libraries.b.g.b */
/* compiled from: PG */
public final class C19634b {

    /* renamed from: b */
    public static final /* synthetic */ int f54623b = 0;

    /* renamed from: c */
    private static final String f54624c = "com.google.android.libraries.b.g.b";

    /* renamed from: a */
    public C19626a f54625a;

    /* renamed from: d */
    private final C58743qi f54626d = new C58685oe(new C58672ns().mo55745a(), new C58675nv());

    /* renamed from: a */
    public final synchronized void mo24960a(C19624b bVar, C19628b bVar2) {
        if (this.f54625a == null) {
            Log.e(f54624c, "Cannot dispatch event without executor.");
        } else {
            mo24961b(bVar, bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo24961b(C19624b bVar, C19628b bVar2) {
        for (C19611a aVar : this.f54626d.mo54986h(bVar)) {
            this.f54625a.mo24958a(C47810es.m84977q(new C19633a(aVar, bVar, bVar2)));
        }
    }

    /* renamed from: d */
    public final synchronized void mo24963d(C19624b bVar, C19611a aVar) {
        this.f54626d.mo54956I(bVar, aVar);
    }

    /* renamed from: c */
    public final synchronized void mo24962c(C19624b bVar, C19611a aVar) {
        aVar.getClass();
        this.f54626d.mo54920x(bVar, aVar);
    }
}
