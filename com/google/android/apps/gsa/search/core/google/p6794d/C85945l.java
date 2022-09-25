package com.google.android.apps.gsa.search.core.google.p6794d;

import com.google.common.base.C58838bb;
import com.google.p395al.p417d.p418a.C8523ac;
import com.google.protobuf.MessageLite;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.search.core.google.d.l */
/* compiled from: PG */
public final class C85945l {

    /* renamed from: a */
    public final String f232393a;

    /* renamed from: b */
    public final boolean f232394b;

    /* renamed from: c */
    public final MessageLite f232395c;

    /* renamed from: d */
    public final int f232396d;

    public C85945l(String str, boolean z, MessageLite messageLite, int i) {
        C58838bb.m90868c(i >= 0);
        this.f232393a = str;
        this.f232394b = z;
        this.f232395c = messageLite;
        this.f232396d = i;
    }

    /* renamed from: a */
    public final C8523ac mo79592a() {
        MessageLite messageLite = this.f232395c;
        if (messageLite instanceof C8523ac) {
            return (C8523ac) messageLite;
        }
        return null;
    }

    public final String toString() {
        return String.format(Locale.US, "Pellet[mUrl=%s, mSize=%d, mPellet=%s]", new Object[]{this.f232393a, Integer.valueOf(this.f232396d), this.f232395c});
    }
}
