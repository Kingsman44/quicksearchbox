package com.google.android.libraries.onegoogle.account.disc;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.account.p2345a.C30163h;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.am */
/* compiled from: PG */
public final /* synthetic */ class C30185am implements C30180ah {

    /* renamed from: a */
    public final /* synthetic */ C30187ao f81620a;

    /* renamed from: b */
    public final /* synthetic */ C30158c f81621b;

    public /* synthetic */ C30185am(C30187ao aoVar, C30158c cVar) {
        this.f81620a = aoVar;
        this.f81621b = cVar;
    }

    /* renamed from: a */
    public final C30178af mo35633a(Object obj) {
        C30187ao aoVar = this.f81620a;
        C30163h b = this.f81621b.mo35551b(obj);
        C30175ac acVar = null;
        if (b != null && b.mo35563a()) {
            if (C30187ao.f81623a == null) {
                C30187ao.f81623a = new C30212l(C30186an.f81622a, (C30194av) null, aoVar.f81624b.getString(R.string.og_google_one_account_a11y), 0);
            }
            C30210j jVar = new C30210j();
            jVar.f81672b = C58833ax.m90834k(C30187ao.f81623a);
            acVar = jVar.mo35622a();
        }
        return new C30178af(acVar);
    }
}
