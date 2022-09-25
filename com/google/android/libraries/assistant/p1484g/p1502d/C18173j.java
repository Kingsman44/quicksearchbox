package com.google.android.libraries.assistant.p1484g.p1502d;

import android.os.Bundle;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18102c;
import com.google.android.libraries.assistant.p1484g.p1490c.p1496c.C18104a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.g.d.j */
/* compiled from: PG */
public final class C18173j extends C18184u {

    /* renamed from: a */
    public static final C58974d f51666a = C58974d.m91136j();

    /* renamed from: b */
    public final String f51667b;

    /* renamed from: c */
    public final C18104a f51668c;

    public C18173j(Optional optional, String str, C18104a aVar) {
        super(optional);
        this.f51668c = aVar;
        this.f51667b = str;
    }

    /* renamed from: b */
    public final C60870cx mo23641b(C18102c cVar, Bundle bundle) {
        if (!this.f51667b.equals(cVar.mo23598d())) {
            return C60856cj.m92899h(new C18175l(6, "Action does not belong to this activity.", (Throwable) null));
        }
        if (!(cVar instanceof C18172i)) {
            return C60856cj.m92899h(new IllegalArgumentException("Action is not for O."));
        }
        mo23649g();
        return C2169h.m6027a(new C18165b(this, cVar, bundle));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C60870cx mo23642f() {
        return C2169h.m6027a(new C18166c(this));
    }
}
