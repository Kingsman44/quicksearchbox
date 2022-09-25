package com.google.android.libraries.p10923ac.p10925b.p10927b;

import android.accounts.Account;
import com.google.protos.p4895aw.p4902b.C64098p;

/* renamed from: com.google.android.libraries.ac.b.b.b */
/* compiled from: PG */
public final class C146772b extends C146770a {

    /* renamed from: a */
    public final Account f396302a;

    /* renamed from: b */
    public final C64098p f396303b;

    public C146772b(Account account, C64098p pVar) {
        if (account != null) {
            this.f396302a = account;
            if (pVar != null) {
                this.f396303b = pVar;
                return;
            }
            throw new NullPointerException("Null channelId");
        }
        throw new NullPointerException("Null account");
    }

    /* renamed from: a */
    public final Account mo123623a() {
        return this.f396302a;
    }

    /* renamed from: b */
    public final C64098p mo123624b() {
        return this.f396303b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C146770a) {
            C146770a aVar = (C146770a) obj;
            return this.f396302a.equals(aVar.mo123623a()) && this.f396303b.equals(aVar.mo123624b());
        }
    }

    public final int hashCode() {
        return ((this.f396302a.hashCode() ^ 1000003) * 1000003) ^ this.f396303b.hashCode();
    }

    public final String toString() {
        String obj = this.f396302a.toString();
        String obj2 = this.f396303b.toString();
        return "AccountChannelIdKey{account=" + obj + ", channelId=" + obj2 + "}";
    }
}
