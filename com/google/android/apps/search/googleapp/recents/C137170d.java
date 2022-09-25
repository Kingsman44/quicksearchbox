package com.google.android.apps.search.googleapp.recents;

import android.graphics.Bitmap;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Random;

/* renamed from: com.google.android.apps.search.googleapp.recents.d */
/* compiled from: PG */
public final /* synthetic */ class C137170d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C137177k f373242a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f373243b;

    /* renamed from: c */
    public final /* synthetic */ String f373244c;

    /* renamed from: d */
    public final /* synthetic */ String f373245d;

    /* renamed from: e */
    public final /* synthetic */ String f373246e;

    public /* synthetic */ C137170d(C137177k kVar, Bitmap bitmap, String str, String str2, String str3) {
        this.f373242a = kVar;
        this.f373243b = bitmap;
        this.f373244c = str;
        this.f373245d = str2;
        this.f373246e = str3;
    }

    public final C60870cx apply(Object obj) {
        C137177k kVar = this.f373242a;
        Bitmap bitmap = this.f373243b;
        String str = this.f373244c;
        String str2 = this.f373245d;
        String str3 = this.f373246e;
        if (!((Boolean) obj).booleanValue()) {
            return C60866ct.f164955a;
        }
        long nextLong = new Random().nextLong();
        C60870cx b = kVar.mo113581b(nextLong, bitmap);
        C137173g gVar = new C137173g(kVar, str, str2, str3, nextLong);
        return C60922j.m93045h(b, C47810es.m84966f(gVar), kVar.f373272f);
    }
}
