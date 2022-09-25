package com.google.android.libraries.lens.view;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.libraries.lens.view.ab */
/* compiled from: PG */
public final class C24967ab {

    /* renamed from: a */
    public static final C58974d f68083a = C58974d.m91135i("StartTimeProviderImpl");

    /* renamed from: b */
    public final AtomicLong f68084b = new AtomicLong();

    /* renamed from: c */
    private final C21370a f68085c;

    /* renamed from: d */
    private final C28224z f68086d;

    /* renamed from: e */
    private int f68087e = -1;

    public C24967ab(C21370a aVar, C28224z zVar) {
        this.f68085c = aVar;
        this.f68086d = zVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30191a() {
        if (((C24946a) this.f68086d.f76836b).f68076b != this.f68087e) {
            this.f68084b.set(this.f68085c.mo26873e());
            this.f68087e = ((C24946a) this.f68086d.f76836b).f68076b;
            this.f68084b.get();
        }
    }
}
