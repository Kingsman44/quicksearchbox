package com.google.android.apps.gsa.velvet.p8863ui.settings.p8864a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.a.h */
/* compiled from: PG */
public final /* synthetic */ class C118632h implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C118633i f330960a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f330961b;

    public /* synthetic */ C118632h(C118633i iVar, C60870cx cxVar) {
        this.f330960a = iVar;
        this.f330961b = cxVar;
    }

    public final Object call() {
        C118633i iVar = this.f330960a;
        C60870cx cxVar = this.f330961b;
        HashMap hashMap = new HashMap();
        if (C90877ak.m148480n(cxVar)) {
            hashMap.put(iVar.f330962a.getString(R.string.location_setting_preference), Boolean.valueOf(((Intent) C60856cj.m92909r(cxVar)).getBooleanExtra("IS_VISIBLE", true)));
        }
        return C58495hd.m89898l(hashMap);
    }
}
