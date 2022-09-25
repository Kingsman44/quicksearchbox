package com.google.android.apps.gsa.search.core.google;

import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.core.google.ay */
/* compiled from: PG */
final class C85867ay extends C90904ba {

    /* renamed from: a */
    final /* synthetic */ Set f232171a;

    /* renamed from: b */
    final /* synthetic */ boolean f232172b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85867ay(Set set, boolean z) {
        super("Notify observers");
        this.f232171a = set;
        this.f232172b = z;
    }

    public final void run() {
        for (C85880bc a : this.f232171a) {
            a.mo79518a(this.f232172b);
        }
    }
}
