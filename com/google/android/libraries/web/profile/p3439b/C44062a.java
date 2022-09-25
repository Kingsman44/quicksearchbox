package com.google.android.libraries.web.profile.p3439b;

import android.text.TextUtils;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61363ae;
import com.google.frameworks.client.data.android.C61365ag;

/* renamed from: com.google.android.libraries.web.profile.b.a */
/* compiled from: PG */
public final /* synthetic */ class C44062a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C44064c f114723a;

    /* renamed from: b */
    public final /* synthetic */ C61363ae f114724b;

    /* renamed from: c */
    public final /* synthetic */ String f114725c;

    public /* synthetic */ C44062a(C44064c cVar, C61363ae aeVar, String str) {
        this.f114723a = cVar;
        this.f114724b = aeVar;
        this.f114725c = str;
    }

    public final C60870cx apply(Object obj) {
        C44064c cVar = this.f114723a;
        C61363ae aeVar = this.f114724b;
        String str = this.f114725c;
        String str2 = (String) obj;
        if (!TextUtils.isEmpty(str2)) {
            aeVar.mo57932a(C61362ad.m93870b("Cookie"), str2);
        }
        str.getClass();
        aeVar.f165930a = str;
        aeVar.f165933d = false;
        return cVar.f114728a.mo42484a(new C61365ag(aeVar));
    }
}
