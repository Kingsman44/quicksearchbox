package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58880cq;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.x */
/* compiled from: PG */
public final class C79326x {

    /* renamed from: a */
    private final int f217834a;

    /* renamed from: b */
    private final Optional f217835b;

    /* renamed from: c */
    private final String f217836c;

    private C79326x(int i, String str, Optional optional) {
        this.f217834a = i;
        this.f217835b = optional;
        this.f217836c = str;
    }

    public C79326x(Optional optional) {
        this(0, " h:", optional);
    }

    /* renamed from: a */
    public final C79326x mo73900a(String str) {
        if (!this.f217835b.isPresent()) {
            return this;
        }
        String str2 = C58880cq.m90966b("-", (this.f217834a * 3) + 1) + (this.f217834a > 0 ? "+" : BuildConfig.FLAVOR) + " ";
        String str3 = this.f217836c;
        int abs = Math.abs(str.hashCode());
        String str4 = str3 + ((abs % 9000) + 1000);
        ((C58970a) ((C58970a) ((C58974d) this.f217835b.get()).mo56224b()).mo56372aa(5503)).mo56389s("%s", String.valueOf(str2.concat(String.valueOf(str)).replace("\n", str4 + "\n" + str2)).concat(str4));
        return new C79326x(this.f217834a + 1, str4, this.f217835b);
    }
}
