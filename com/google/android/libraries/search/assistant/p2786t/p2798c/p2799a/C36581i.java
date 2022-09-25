package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a;

import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36608k;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36609l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.i */
/* compiled from: PG */
public final /* synthetic */ class C36581i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36591s f95393a;

    /* renamed from: b */
    public final /* synthetic */ C36608k f95394b;

    /* renamed from: c */
    public final /* synthetic */ C36557ac f95395c;

    public /* synthetic */ C36581i(C36591s sVar, C36608k kVar, C36557ac acVar) {
        this.f95393a = sVar;
        this.f95394b = kVar;
        this.f95395c = acVar;
    }

    public final C60870cx apply(Object obj) {
        C36591s sVar = this.f95393a;
        C36608k kVar = this.f95394b;
        C36557ac acVar = this.f95395c;
        Boolean bool = (Boolean) obj;
        C36609l a = C36609l.m65137a(kVar.f95443b);
        if (a == null) {
            a = C36609l.UNRECOGNIZED;
        }
        a.getNumber();
        if (bool.booleanValue()) {
            return C60866ct.f164955a;
        }
        return C60856cj.m92908q(C2169h.m6027a(new C36586n(sVar, acVar)), C36591s.f95416b, TimeUnit.MILLISECONDS, sVar.f95420f);
    }
}
