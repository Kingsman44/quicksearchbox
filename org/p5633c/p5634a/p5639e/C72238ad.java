package org.p5633c.p5634a.p5639e;

import com.evernote.android.state.BuildConfig;
import org.p5633c.p5634a.C72144ab;
import org.p5633c.p5634a.C72152aj;

/* renamed from: org.c.a.e.ad */
/* compiled from: PG */
final class C72238ad implements C72244aj, C72243ai {

    /* renamed from: a */
    static final C72238ad f192218a = new C72238ad(BuildConfig.FLAVOR);

    /* renamed from: b */
    private final String f192219b;

    public C72238ad(String str) {
        this.f192219b = str;
    }

    /* renamed from: a */
    public final int mo63582a(C72152aj ajVar) {
        return this.f192219b.length();
    }

    /* renamed from: b */
    public final int mo63583b(C72152aj ajVar, int i) {
        return 0;
    }

    /* renamed from: c */
    public final int mo63584c(C72144ab abVar, String str, int i) {
        String str2 = this.f192219b;
        return str.regionMatches(true, i, str2, 0, str2.length()) ? i + this.f192219b.length() : i ^ -1;
    }

    /* renamed from: d */
    public final void mo63585d(StringBuffer stringBuffer, C72152aj ajVar) {
        stringBuffer.append(this.f192219b);
    }
}
