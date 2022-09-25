package com.google.android.libraries.search.logging.p3034a;

import android.content.Context;
import com.google.android.gms.clearcut.C143658k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.logging.a.aj */
/* compiled from: PG */
public final /* synthetic */ class C38747aj implements C38728a {

    /* renamed from: a */
    public final /* synthetic */ Context f102299a;

    /* renamed from: b */
    public final /* synthetic */ String f102300b;

    /* renamed from: c */
    public final /* synthetic */ String f102301c;

    public /* synthetic */ C38747aj(Context context, String str, String str2) {
        this.f102299a = context;
        this.f102300b = str;
        this.f102301c = str2;
    }

    /* renamed from: a */
    public final C60870cx mo41585a(boolean z) {
        Context context = this.f102299a;
        String str = this.f102300b;
        String str2 = this.f102301c;
        int i = 1;
        if (true != z) {
            str = str2;
        }
        C143658k a = C143658k.m233374c(context, str).mo118952a();
        if (true == z) {
            i = 4;
        }
        a.f389489p = i;
        return C60856cj.m92900i(a);
    }
}
