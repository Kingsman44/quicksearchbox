package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.bj */
/* compiled from: PG */
final class C61900bj implements C61901bk {

    /* renamed from: a */
    public final C58817ah f167373a;

    /* renamed from: b */
    private final C58881cr f167374b;

    /* renamed from: c */
    private final C58881cr f167375c;

    public C61900bj(C58817ah ahVar, C58881cr crVar, C58881cr crVar2) {
        this.f167373a = ahVar;
        this.f167374b = crVar;
        this.f167375c = crVar2;
    }

    /* renamed from: a */
    public final C58833ax mo58336a() {
        return ((C61931cn) this.f167375c).f167408a.mo58306f();
    }

    /* renamed from: b */
    public final String mo58337b(CharSequence charSequence) {
        return (String) ((C61930cm) this.f167374b).f167407a.mo58305e().mo56106b(new C61899bi(this, charSequence)).mo56109e(BuildConfig.FLAVOR);
    }
}
