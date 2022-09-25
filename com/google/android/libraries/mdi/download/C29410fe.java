package com.google.android.libraries.mdi.download;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.phenotype.C145738p;
import com.google.android.libraries.mdi.download.p2229b.C28722a;
import com.google.android.libraries.p3339v.C43205e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.mdi.download.fe */
/* compiled from: PG */
public final /* synthetic */ class C29410fe implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C29413fh f79730a;

    public /* synthetic */ C29410fe(C29413fh fhVar) {
        this.f79730a = fhVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        String str;
        C28722a aVar = (C28722a) this.f79730a.f79742l.mo56107c();
        Context context = aVar.f78023a;
        if (context.getPackageName().equals("com.google.android.gms")) {
            str = "com.google.android.gms.icing.mdd";
        } else {
            str = "com.google.android.gms.icing.mdd#".concat(String.valueOf(context.getPackageName()));
        }
        return C43205e.m76192b(C145738p.m237003b(aVar.f78023a).mo121902b(str, BuildConfig.FLAVOR));
    }
}
