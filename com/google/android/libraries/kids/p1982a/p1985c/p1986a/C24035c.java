package com.google.android.libraries.kids.p1982a.p1985c.p1986a;

import android.net.Uri;
import com.google.android.gms.auth.TokenData;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.kids.a.c.a.c */
/* compiled from: PG */
public final /* synthetic */ class C24035c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ TokenData f65682a;

    public /* synthetic */ C24035c(TokenData tokenData) {
        this.f65682a = tokenData;
    }

    public final Object apply(Object obj) {
        Void voidR = (Void) obj;
        return Uri.parse(this.f65682a.f387646b).buildUpon().authority("accounts.google.com").build().toString();
    }
}
