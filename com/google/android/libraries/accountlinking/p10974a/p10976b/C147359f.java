package com.google.android.libraries.accountlinking.p10974a.p10976b;

import android.net.Uri;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.accountlinking.a.b.f */
/* compiled from: PG */
public final /* synthetic */ class C147359f implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C147359f f397770a = new C147359f();

    private /* synthetic */ C147359f() {
    }

    public final Object apply(Object obj) {
        return Uri.parse((String) obj).buildUpon().appendQueryParameter("result_channel", C147361h.f397774f).build().toString();
    }
}
