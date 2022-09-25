package com.google.common.p4538j.p4539a;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.common.j.a.c */
/* compiled from: PG */
public final class C59305c {

    /* renamed from: a */
    public final String f157465a;

    static {
        new C59305c(BuildConfig.FLAVOR);
        new C59305c("<br>");
        new C59305c("<!DOCTYPE html>");
    }

    public C59305c(String str) {
        str.getClass();
        this.f157465a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C59305c)) {
            return false;
        }
        return this.f157465a.equals(((C59305c) obj).f157465a);
    }

    public final int hashCode() {
        return this.f157465a.hashCode() ^ 867184553;
    }

    public final String toString() {
        return "SafeHtml{" + this.f157465a + "}";
    }
}
