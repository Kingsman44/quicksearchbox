package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119299u;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125112cm;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126292aa;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.cy */
/* compiled from: PG */
public final class C126087cy {

    /* renamed from: a */
    public final C126292aa f347490a;

    /* renamed from: b */
    public final C60870cx f347491b;

    /* renamed from: c */
    public final boolean f347492c;

    /* renamed from: d */
    public final C126084cv f347493d;

    /* renamed from: e */
    public final C125112cm f347494e;

    /* renamed from: f */
    public final int f347495f;

    /* renamed from: g */
    public final C125065at f347496g;

    /* renamed from: h */
    public final boolean f347497h;

    /* renamed from: i */
    public final C126083cu f347498i;

    /* renamed from: j */
    public final C58485gu f347499j;

    public C126087cy() {
        this((byte[]) null);
    }

    public C126087cy(C126292aa aaVar, C60870cx cxVar, boolean z, C126084cv cvVar, C125112cm cmVar, int i, C125065at atVar, boolean z2, C126083cu cuVar, C58485gu guVar) {
        C69664n.m101061g(cxVar, "directActions");
        C69664n.m101061g(cvVar, "inputFieldState");
        C69664n.m101061g(atVar, "utteranceFinalText");
        C69664n.m101061g(cuVar, "emojiContext");
        C69664n.m101061g(guVar, "currentSuggestions");
        this.f347490a = aaVar;
        this.f347491b = cxVar;
        this.f347492c = z;
        this.f347493d = cvVar;
        this.f347494e = cmVar;
        this.f347495f = i;
        this.f347496g = atVar;
        this.f347497h = z2;
        this.f347498i = cuVar;
        this.f347499j = guVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C126087cy(byte[] r12) {
        /*
            r11 = this;
            com.google.common.b.gu r12 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92900i(r12)
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.cv r4 = new com.google.android.apps.search.assistant.surfaces.dictation.service.n.cv
            r12 = 0
            r4.<init>(r12, r12, r12, r12)
            com.google.android.apps.search.assistant.surfaces.dictation.a.at r7 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at.f345040b
            java.lang.String r12 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r12)
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.cu r9 = new com.google.android.apps.search.assistant.surfaces.dictation.service.n.cu
            r12 = 0
            r9.<init>(r12)
            com.google.common.b.gu r10 = com.google.common.p4522b.C58485gu.m89845m()
            java.lang.String r12 = "of()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r12)
            r1 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126087cy.<init>(byte[]):void");
    }

    /* renamed from: e */
    public static /* synthetic */ C126087cy m206173e(C126087cy cyVar, C126292aa aaVar, C60870cx cxVar, boolean z, C126084cv cvVar, C125112cm cmVar, int i, C125065at atVar, boolean z2, C126083cu cuVar, C58485gu guVar, int i2) {
        C126087cy cyVar2 = cyVar;
        int i3 = i2;
        C126292aa aaVar2 = (i3 & 1) != 0 ? cyVar2.f347490a : aaVar;
        C60870cx cxVar2 = (i3 & 2) != 0 ? cyVar2.f347491b : cxVar;
        boolean z3 = (i3 & 4) != 0 ? cyVar2.f347492c : z;
        C126084cv cvVar2 = (i3 & 8) != 0 ? cyVar2.f347493d : cvVar;
        C125112cm cmVar2 = (i3 & 16) != 0 ? cyVar2.f347494e : cmVar;
        int i4 = (i3 & 32) != 0 ? cyVar2.f347495f : i;
        C125065at atVar2 = (i3 & 64) != 0 ? cyVar2.f347496g : atVar;
        boolean z4 = (i3 & 128) != 0 ? cyVar2.f347497h : z2;
        C126083cu cuVar2 = (i3 & 256) != 0 ? cyVar2.f347498i : cuVar;
        C58485gu guVar2 = (i3 & 512) != 0 ? cyVar2.f347499j : guVar;
        C69664n.m101061g(cxVar2, "directActions");
        C69664n.m101061g(cvVar2, "inputFieldState");
        C69664n.m101061g(atVar2, "utteranceFinalText");
        C69664n.m101061g(cuVar2, "emojiContext");
        C69664n.m101061g(guVar2, "currentSuggestions");
        return new C126087cy(aaVar2, cxVar2, z3, cvVar2, cmVar2, i4, atVar2, z4, cuVar2, guVar2);
    }

    /* renamed from: a */
    public final C119299u mo107326a() {
        C126292aa aaVar = this.f347490a;
        C119299u c = aaVar != null ? aaVar.mo107510c() : null;
        return c == null ? C119299u.DEFAULT : c;
    }

    /* renamed from: b */
    public final String mo107327b() {
        Object collect = Collection.EL.stream(this.f347496g.f345042a).filter(C126085cw.f347488a).map(C126086cx.f347489a).collect(Collectors.joining());
        C69664n.m101060f(collect, "utteranceFinalText.spans…      .collect(joining())");
        return (String) collect;
    }

    /* renamed from: c */
    public final boolean mo107328c() {
        return !this.f347493d.f347485b;
    }

    /* renamed from: d */
    public final boolean mo107329d() {
        return this.f347490a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C126087cy)) {
            return false;
        }
        C126087cy cyVar = (C126087cy) obj;
        return C69664n.m101066l(this.f347490a, cyVar.f347490a) && C69664n.m101066l(this.f347491b, cyVar.f347491b) && this.f347492c == cyVar.f347492c && C69664n.m101066l(this.f347493d, cyVar.f347493d) && this.f347494e == cyVar.f347494e && this.f347495f == cyVar.f347495f && C69664n.m101066l(this.f347496g, cyVar.f347496g) && this.f347497h == cyVar.f347497h && C69664n.m101066l(this.f347498i, cyVar.f347498i) && C69664n.m101066l(this.f347499j, cyVar.f347499j);
    }

    public final int hashCode() {
        C126292aa aaVar = this.f347490a;
        int i = 0;
        int hashCode = (((((((aaVar == null ? 0 : aaVar.hashCode()) * 31) + this.f347491b.hashCode()) * 31) + (this.f347492c ? 1 : 0)) * 31) + this.f347493d.hashCode()) * 31;
        C125112cm cmVar = this.f347494e;
        if (cmVar != null) {
            i = cmVar.hashCode();
        }
        return ((((((((((hashCode + i) * 31) + this.f347495f) * 31) + this.f347496g.hashCode()) * 31) + (this.f347497h ? 1 : 0)) * 31) + this.f347498i.hashCode()) * 31) + this.f347499j.hashCode();
    }

    public final String toString() {
        C126292aa aaVar = this.f347490a;
        C60870cx cxVar = this.f347491b;
        boolean z = this.f347492c;
        C126084cv cvVar = this.f347493d;
        C125112cm cmVar = this.f347494e;
        int i = this.f347495f;
        C125065at atVar = this.f347496g;
        boolean z2 = this.f347497h;
        C126083cu cuVar = this.f347498i;
        C58485gu guVar = this.f347499j;
        return "Snapshot(dictationParams=" + aaVar + ", directActions=" + cxVar + ", orationHasCommand=" + z + ", inputFieldState=" + cvVar + ", keyboardInteraction=" + cmVar + ", orationNumber=" + i + ", utteranceFinalText=" + atVar + ", isUtteranceDone=" + z2 + ", emojiContext=" + cuVar + ", currentSuggestions=" + guVar + ")";
    }
}
