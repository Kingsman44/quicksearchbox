package com.google.android.gms.wallet;

import android.accounts.Account;
import com.google.android.gms.common.api.C143719d;
import com.google.android.gms.common.internal.C143912ba;
import java.util.Arrays;

/* renamed from: com.google.android.gms.wallet.s */
/* compiled from: PG */
public final class C146378s implements C143719d {

    /* renamed from: a */
    public final int f395392a;

    /* renamed from: b */
    public final int f395393b;

    /* renamed from: c */
    public final Account f395394c;

    /* renamed from: d */
    final boolean f395395d;

    public C146378s() {
        this(new C146377r());
    }

    public C146378s(C146377r rVar) {
        this.f395392a = rVar.f395391a;
        this.f395393b = 1;
        this.f395395d = true;
        this.f395394c = null;
    }

    /* renamed from: a */
    public final Account mo119108a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C146378s) {
            C146378s sVar = (C146378s) obj;
            if (C143912ba.m233950b(Integer.valueOf(this.f395392a), Integer.valueOf(sVar.f395392a))) {
                int i = sVar.f395393b;
                if (C143912ba.m233950b(1, 1)) {
                    Account account = sVar.f395394c;
                    if (C143912ba.m233950b((Object) null, (Object) null)) {
                        boolean z = sVar.f395395d;
                        if (C143912ba.m233950b(true, true)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f395392a), 1, null, true});
    }
}
