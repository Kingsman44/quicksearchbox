package com.google.android.libraries.phenotype.client.stable;

import com.google.android.gms.phenotype.ExperimentTokens;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.phenotype.client.stable.m */
/* compiled from: PG */
public final class C31746m {

    /* renamed from: a */
    public final ExperimentTokens f85337a;

    /* renamed from: b */
    public final String f85338b;

    public C31746m(ExperimentTokens experimentTokens, String str) {
        C69664n.m101061g(str, "configPackageName");
        this.f85337a = experimentTokens;
        this.f85338b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31746m)) {
            return false;
        }
        C31746m mVar = (C31746m) obj;
        return C69664n.m101066l(this.f85337a, mVar.f85337a) && C69664n.m101066l(this.f85338b, mVar.f85338b);
    }

    public final int hashCode() {
        return (this.f85337a.hashCode() * 31) + this.f85338b.hashCode();
    }

    public final String toString() {
        ExperimentTokens experimentTokens = this.f85337a;
        String str = this.f85338b;
        return "ExperimentTokenData(experimentToken=" + experimentTokens + ", configPackageName=" + str + ")";
    }
}
