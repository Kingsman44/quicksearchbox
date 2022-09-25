package com.google.android.libraries.componentview.services.application;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.componentview.services.application.ai */
/* compiled from: PG */
public final /* synthetic */ class C20555ai implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f57728a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f57729b;

    /* renamed from: c */
    public final /* synthetic */ String f57730c;

    /* renamed from: d */
    public final /* synthetic */ String f57731d;

    /* renamed from: e */
    public final /* synthetic */ String f57732e;

    /* renamed from: f */
    public final /* synthetic */ Map f57733f;

    public /* synthetic */ C20555ai(C60870cx cxVar, C60870cx cxVar2, String str, String str2, String str3, Map map) {
        this.f57728a = cxVar;
        this.f57729b = cxVar2;
        this.f57730c = str;
        this.f57731d = str2;
        this.f57732e = str3;
        this.f57733f = map;
    }

    public final Object call() {
        C60870cx cxVar = this.f57728a;
        C60870cx cxVar2 = this.f57729b;
        String str = this.f57730c;
        String str2 = this.f57731d;
        String str3 = this.f57732e;
        Map map = this.f57733f;
        Uri.Builder builder = new Uri.Builder();
        builder.scheme((String) C60856cj.m92909r(cxVar)).authority((String) C60856cj.m92909r(cxVar2)).appendPath("gen_204");
        builder.appendQueryParameter("atyp", "i");
        if (!TextUtils.isEmpty(str)) {
            builder.appendQueryParameter("ved", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter("vet", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            builder.appendQueryParameter("ei", str3);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return builder.build();
    }
}
