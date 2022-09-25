package com.google.android.apps.search.lens.p10547a;

import android.content.Context;
import android.content.Intent;
import android.support.p031v4.app.Fragment;
import com.google.android.libraries.lens.view.p2051ab.C24970c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p3025k.C38561o;
import com.google.common.base.C58838bb;
import com.google.lens.p4707j.C62433bj;
import com.google.lens.p4707j.C62471cu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.lens.a.a */
/* compiled from: PG */
public final class C139916a extends C38561o {

    /* renamed from: a */
    private final C139921f f380352a;

    /* renamed from: b */
    private final C21370a f380353b;

    /* renamed from: c */
    private final boolean f380354c;

    public C139916a(Optional optional, boolean z, Fragment fragment, C21370a aVar) {
        super(optional, fragment, 3);
        this.f380353b = aVar;
        Context context = fragment.getContext();
        context.getClass();
        this.f380352a = new C139921f(context);
        this.f380354c = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Intent mo41488a(Object obj) {
        C139918c cVar = (C139918c) obj;
        C62433bj a = C62433bj.m94774a(cVar.f380358b);
        if (a == null) {
            a = C62433bj.UNKNOWN;
        }
        C58838bb.m90869d(a != C62433bj.UNKNOWN, "LensIntentType option is required");
        C24970c cVar2 = new C24970c();
        cVar2.f68102j = "com.google.android.googlequicksearchbox";
        cVar2.f68118z = Long.valueOf(this.f380353b.mo26872d());
        C62433bj a2 = C62433bj.m94774a(cVar.f380358b);
        if (a2 == null) {
            a2 = C62433bj.UNKNOWN;
        }
        cVar2.f68105m = a2.f168594ao;
        cVar2.f68093a = true;
        cVar2.f68114v = this.f380354c;
        C62471cu cuVar = cVar.f380359c;
        if (cuVar == null) {
            cuVar = C62471cu.f168676c;
        }
        cVar2.f68094b = cuVar;
        return this.f380352a.mo115337a(cVar2.mo30192a());
    }
}
