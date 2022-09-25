package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Context;
import com.google.android.libraries.search.assistant.performer.permissions.C36196a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.da */
/* compiled from: PG */
public final class C35666da {

    /* renamed from: a */
    public static final C59071e f93543a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.communication.da");

    /* renamed from: c */
    private static final String[] f93544c = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};

    /* renamed from: d */
    private static final String[] f93545d = {"android.permission.ACCESS_BACKGROUND_LOCATION"};

    /* renamed from: b */
    public final Executor f93546b;

    /* renamed from: e */
    private final Context f93547e;

    public C35666da(Context context, Executor executor) {
        this.f93547e = context;
        this.f93546b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo39784a(C35597cz czVar) {
        C60870cx cxVar;
        ArrayList arrayList = new ArrayList();
        String[] strArr = f93544c;
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            if (!C36196a.m64596a(str, this.f93547e)) {
                arrayList.add(str);
            }
        }
        String str2 = f93545d[0];
        if (!C36196a.m64596a(str2, this.f93547e)) {
            arrayList.add(str2);
        }
        if (arrayList.isEmpty()) {
            cxVar = C60856cj.m92900i(true);
        } else {
            cxVar = czVar.mo39729c().mo20788a(czVar.mo39728b(), (String[]) arrayList.toArray(new String[0]));
        }
        C35594cw cwVar = new C35594cw(this, czVar);
        return C60922j.m93045h(cxVar, C47810es.m84966f(cwVar), this.f93546b);
    }
}
