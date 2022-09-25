package com.google.android.gms.semanticlocation;

import android.accounts.Account;
import com.google.android.gms.common.api.C143721f;
import com.google.android.gms.common.internal.C143912ba;
import java.util.Arrays;

/* renamed from: com.google.android.gms.semanticlocation.y */
/* compiled from: PG */
public final class C145987y implements C143721f {

    /* renamed from: a */
    public final Account f394663a;

    /* renamed from: b */
    public final String f394664b;

    public C145987y(Account account, String str) {
        this.f394663a = account;
        this.f394664b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C145987y) {
            C145987y yVar = (C145987y) obj;
            if (!C143912ba.m233950b(this.f394664b, yVar.f394664b) || !C143912ba.m233950b(this.f394663a, yVar.f394663a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f394664b, this.f394663a});
    }
}
