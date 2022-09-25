package com.google.android.apps.gsa.shared.p7195y;

import com.google.common.base.C58832aw;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.shared.y.as */
/* compiled from: PG */
final class C91187as extends C91182an {

    /* renamed from: b */
    private final String f254563b;

    public C91187as(String str) {
        this.f254563b = str;
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        messageDigest.update((byte) 1);
        messageDigest.update(this.f254563b.getBytes(Charset.forName("UTF-8")));
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == C91187as.class && C58832aw.m90831a(this.f254563b, ((C91187as) obj).f254563b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{1, this.f254563b});
    }
}
