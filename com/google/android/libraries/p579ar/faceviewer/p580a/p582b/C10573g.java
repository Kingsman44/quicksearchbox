package com.google.android.libraries.p579ar.faceviewer.p580a.p582b;

import android.content.Context;
import androidx.p104d.p105a.C2169h;
import com.google.android.play.core.p3538g.C45187v;
import com.google.android.play.core.p3538g.C45188w;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.b.g */
/* compiled from: PG */
public final /* synthetic */ class C10573g implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ String f35370a;

    /* renamed from: b */
    public final /* synthetic */ Context f35371b;

    public /* synthetic */ C10573g(String str, Context context) {
        this.f35370a = str;
        this.f35371b = context;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        String str = this.f35370a;
        Context context = this.f35371b;
        if (str == null) {
            str = C10575i.f35373a;
        }
        if (C10575i.m25551b(str)) {
            return C60856cj.m92900i(true);
        }
        C45187v a = C45188w.m80459a(context);
        if (a.mo49000g().contains("faceviewer_split")) {
            return C60856cj.m92900i(Boolean.valueOf(C10575i.m25551b(C10575i.f35373a)));
        }
        return C2169h.m6027a(new C10574h(a));
    }
}
