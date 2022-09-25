package com.google.android.libraries.glide.fife;

import android.accounts.Account;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.glide.fife.a */
/* compiled from: PG */
public final class C22011a {

    /* renamed from: a */
    private final C58833ax f60721a;

    /* renamed from: b */
    private final C58833ax f60722b;

    public C22011a() {
        this.f60721a = C58836b.f156633a;
        this.f60722b = C58833ax.m90834k(-1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22011a) {
            C22011a aVar = (C22011a) obj;
            if (!this.f60721a.equals(aVar.f60721a) || !this.f60722b.equals(aVar.f60722b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f60721a, this.f60722b});
    }

    public final String toString() {
        C58833ax axVar = this.f60721a;
        if (axVar.mo56113h()) {
            return axVar.toString();
        }
        return ((Integer) this.f60722b.mo56107c()).toString();
    }

    public C22011a(Account account) {
        this.f60721a = C58833ax.m90834k(account);
        this.f60722b = C58836b.f156633a;
    }
}
