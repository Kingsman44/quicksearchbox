package com.google.android.apps.search.googleapp.stampviewer.p10497i.p10498a;

import android.content.Context;
import com.google.firebase.C61204g;
import com.google.firebase.C61268m;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.i.a.a */
/* compiled from: PG */
public final class C139419a {

    /* renamed from: a */
    private final Context f379093a;

    /* renamed from: b */
    private final String f379094b;

    /* renamed from: c */
    private final String f379095c;

    /* renamed from: d */
    private final String f379096d;

    public C139419a(Context context, String str, String str2, String str3) {
        this.f379093a = context;
        this.f379094b = str;
        this.f379095c = str2;
        this.f379096d = str3;
    }

    /* renamed from: a */
    public final C61204g mo114955a() {
        try {
            return C61204g.m93578b("StorytimeFirebaseApp");
        } catch (IllegalStateException unused) {
            C61268m mVar = new C61268m();
            mVar.f165710b = this.f379094b;
            mVar.mo57879c(this.f379095c);
            mVar.mo57878b(this.f379096d);
            return C61204g.m93579c(this.f379093a, mVar.mo57877a(), "StorytimeFirebaseApp");
        }
    }
}
