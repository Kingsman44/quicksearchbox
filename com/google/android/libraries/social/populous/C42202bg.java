package com.google.android.libraries.social.populous;

import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58495hd;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.social.populous.bg */
/* compiled from: PG */
public final class C42202bg {

    /* renamed from: a */
    public final C58495hd f110522a;

    /* renamed from: b */
    public final C58495hd f110523b;

    /* renamed from: c */
    public final C42199bd f110524c;

    public C42202bg(C58495hd hdVar, C58495hd hdVar2, C42199bd bdVar) {
        this.f110522a = hdVar;
        this.f110523b = hdVar2;
        this.f110524c = bdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42202bg) {
            C42202bg bgVar = (C42202bg) obj;
            return C58832aw.m90831a(this.f110522a, bgVar.f110522a) && C58832aw.m90831a(this.f110523b, bgVar.f110523b) && C58832aw.m90831a(this.f110524c, bgVar.f110524c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f110522a, this.f110523b, this.f110524c});
    }
}
