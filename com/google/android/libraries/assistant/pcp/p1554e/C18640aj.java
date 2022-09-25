package com.google.android.libraries.assistant.pcp.p1554e;

import com.google.android.libraries.assistant.pcp.p1546d.C18575c;
import com.google.assistant.p3803ag.p3809c.C49140j;
import com.google.assistant.p3803ag.p3809c.C49141k;
import com.google.assistant.p3803ag.p3809c.C49143m;
import java.util.Set;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.pcp.e.aj */
/* compiled from: PG */
public final /* synthetic */ class C18640aj implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Set f52666a;

    public /* synthetic */ C18640aj(Set set) {
        this.f52666a = set;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final void accept(Object obj) {
        Set set = this.f52666a;
        C49141k kVar = (C49141k) obj;
        int a = C49140j.m85368a(kVar.f127079c);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            C49143m mVar = kVar.f127078b;
            if (mVar == null) {
                mVar = C49143m.f127081b;
            }
            set.add(new C18575c(mVar.f127083a));
        } else if (i == 2) {
            C49143m mVar2 = kVar.f127078b;
            if (mVar2 == null) {
                mVar2 = C49143m.f127081b;
            }
            set.remove(new C18575c(mVar2.f127083a));
        }
    }
}
