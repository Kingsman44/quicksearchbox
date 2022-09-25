package com.google.android.libraries.assistant.p1484g.p1502d;

import android.os.Bundle;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18102c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.g.d.ap */
/* compiled from: PG */
public final class C18164ap extends C18184u {

    /* renamed from: c */
    private static final C58974d f51650c = C58974d.m91136j();

    /* renamed from: a */
    public final int f51651a;

    /* renamed from: b */
    public final C18155ag f51652b;

    public C18164ap(Optional optional, int i, C18155ag agVar) {
        super(optional);
        this.f51651a = i;
        this.f51652b = agVar;
    }

    /* renamed from: b */
    public final C60870cx mo23641b(C18102c cVar, Bundle bundle) {
        if (!Integer.valueOf(this.f51651a).equals(cVar.mo23598d())) {
            return C60856cj.m92899h(new C18175l(6, "Action does not belong to this activity.", (Throwable) null));
        }
        if (!(cVar instanceof C18163ao)) {
            ((C58970a) ((C58970a) f51650c.mo56225c()).mo56372aa(47072)).mo56389s("Action is not a system action: %s", cVar);
            return C60856cj.m92899h(new C18175l(6, "Action is not a system action.", (Throwable) null));
        }
        mo23649g();
        return C2169h.m6027a(new C18159ak(this, cVar, bundle));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C60870cx mo23642f() {
        return C2169h.m6027a(new C18160al(this));
    }
}
