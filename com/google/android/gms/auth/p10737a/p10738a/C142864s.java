package com.google.android.gms.auth.p10737a.p10738a;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.C142901c;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143722g;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143845q;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.tasks.C146006ab;

/* renamed from: com.google.android.gms.auth.a.a.s */
/* compiled from: PG */
public final class C142864s extends C143847s implements C142840a {

    /* renamed from: a */
    private static final C143840l f387663a;

    /* renamed from: b */
    private static final C143707a f387664b;

    /* renamed from: c */
    private static final C143841m f387665c;

    static {
        C143840l lVar = new C143840l();
        f387663a = lVar;
        C142863r rVar = new C142863r();
        f387664b = rVar;
        f387665c = new C143841m("AccountDataService.API", rVar, lVar);
    }

    public C142864s(Context context) {
        super(context, (Activity) null, f387665c, C143722g.f389627f, new C143845q().mo119288a());
    }

    /* renamed from: a */
    public final C146006ab mo117773a(String str) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389862c = new Feature[]{C142901c.f387740f};
        dcVar.f389860a = new C142861p(str);
        dcVar.f389863d = 1649;
        return super.mo119290u(1, dcVar.mo119260a());
    }
}
