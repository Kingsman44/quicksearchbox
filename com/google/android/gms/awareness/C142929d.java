package com.google.android.gms.awareness;

import android.accounts.Account;
import com.google.android.gms.common.api.C143721f;
import com.google.android.gms.common.api.C143723h;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.C143919bh;
import java.util.Arrays;

/* renamed from: com.google.android.gms.awareness.d */
/* compiled from: PG */
public final class C142929d implements C143721f, C143723h {

    /* renamed from: a */
    public final String f387832a;

    /* renamed from: b */
    public final int f387833b = 1;

    /* renamed from: c */
    public final Account f387834c;

    /* renamed from: d */
    public String f387835d;

    public C142929d(String str, Account account) {
        C143919bh.m233971n(str, "moduleId must not be null");
        this.f387832a = str;
        this.f387834c = account;
    }

    /* renamed from: a */
    public static C142929d m231886a(String str, Account account) {
        C143919bh.m233969l(str);
        return new C142929d(str, account);
    }

    /* renamed from: b */
    public final void mo117820b(String str) {
        if (this.f387835d == null) {
            this.f387835d = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C142929d dVar = (C142929d) obj;
            return C143912ba.m233950b(this.f387832a, dVar.f387832a) && C143912ba.m233950b((Object) null, (Object) null) && C143912ba.m233950b((Object) null, (Object) null) && C143912ba.m233950b(this.f387834c, dVar.f387834c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f387832a, 1, null, null, -1, this.f387834c});
    }
}
