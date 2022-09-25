package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import com.google.android.libraries.search.assistant.invocation.p2641k.C33914a;
import com.google.android.libraries.search.p3055n.C39274ax;
import com.google.android.libraries.search.p3055n.C39356be;
import com.google.android.libraries.search.p3055n.C39357bf;
import com.google.android.libraries.search.p3055n.C39767h;
import com.google.apps.tiktok.account.AccountId;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.m */
/* compiled from: PG */
public final class C34646m {

    /* renamed from: a */
    public final C39767h f91993a;

    /* renamed from: b */
    public final AccountId f91994b;

    public C34646m(C39767h hVar, AccountId accountId) {
        C69664n.m101061g(hVar, "config");
        C69664n.m101061g(accountId, "accountId");
        this.f91993a = hVar;
        this.f91994b = accountId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34646m)) {
            return false;
        }
        C34646m mVar = (C34646m) obj;
        return C69664n.m101066l(this.f91993a, mVar.f91993a) && C69664n.m101066l(this.f91994b, mVar.f91994b);
    }

    public final int hashCode() {
        return (this.f91993a.hashCode() * 31) + this.f91994b.hashCode();
    }

    public final String toString() {
        C39357bf bfVar = this.f91993a.f104599c;
        if (bfVar == null) {
            bfVar = C39357bf.f103644d;
        }
        C39356be a = C39356be.m68761a(bfVar.f103647b);
        if (a == null) {
            a = C39356be.DEFAULT_PERSONAL;
        }
        String name = a.name();
        C39274ax axVar = this.f91993a.f104598b;
        if (axVar == null) {
            axVar = C39274ax.f103452c;
        }
        String str = axVar.f103455b;
        C69664n.m101060f(str, "config.localeConfig.locale");
        String a2 = C33914a.m62566a(this);
        return "(@" + a2 + ", mode=" + name + ", locale=" + str + ")";
    }
}
