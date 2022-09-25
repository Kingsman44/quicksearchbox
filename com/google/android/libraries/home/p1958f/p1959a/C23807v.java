package com.google.android.libraries.home.p1958f.p1959a;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2877e.C37185a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.assistant.p3861at.C50181no;
import com.google.common.base.C58817ah;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.f.a.v */
/* compiled from: PG */
final class C23807v implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C23782ah f65221a;

    /* renamed from: b */
    final /* synthetic */ C50181no f65222b;

    public C23807v(C23782ah ahVar, C50181no noVar) {
        this.f65221a = ahVar;
        this.f65222b = noVar;
    }

    public final /* synthetic */ Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        C69664n.m101061g(th, "it");
        C62722b bVar = th instanceof CancellationException ? C62722b.CANCELLED : C62722b.UNAVAILABLE;
        C37215b n = this.f65221a.mo29128n();
        C37252a i = C37185a.f98333d.mo40815i(bVar);
        C23774a.m44277a(i, this.f65222b);
        n.mo19974a(i);
        C37215b n2 = this.f65221a.mo29128n();
        C37252a c = C37185a.f98335f.mo40805c(bVar);
        C23774a.m44277a(c, this.f65222b);
        n2.mo19974a(c);
        throw th;
    }
}
