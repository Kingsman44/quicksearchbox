package com.google.android.libraries.assistant.auto.tng.common.p933q;

import android.text.TextUtils;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.q.b */
/* compiled from: PG */
public final /* synthetic */ class C13318b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f41039a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f41040b;

    public /* synthetic */ C13318b(C60870cx cxVar, C60870cx cxVar2) {
        this.f41039a = cxVar;
        this.f41040b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f41039a;
        C60870cx cxVar2 = this.f41040b;
        String str = (String) C60856cj.m92909r(cxVar);
        String str2 = (String) C60856cj.m92909r(cxVar2);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Boolean.valueOf(str.equals(str2));
    }
}
