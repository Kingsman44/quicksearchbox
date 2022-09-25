package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60916ec;
import java.util.Map;
import java.util.concurrent.Callable;
import p3186j$.nio.charset.StandardCharsets;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.activity.v */
/* compiled from: PG */
public final /* synthetic */ class C106427v implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C106428w f296863a;

    /* renamed from: b */
    public final /* synthetic */ String f296864b;

    /* renamed from: c */
    public final /* synthetic */ Bitmap f296865c;

    /* renamed from: d */
    public final /* synthetic */ Map f296866d;

    /* renamed from: e */
    public final /* synthetic */ Optional f296867e;

    /* renamed from: f */
    public final /* synthetic */ C60870cx f296868f;

    /* renamed from: g */
    public final /* synthetic */ C60870cx f296869g;

    /* renamed from: h */
    public final /* synthetic */ C60870cx f296870h;

    /* renamed from: i */
    public final /* synthetic */ boolean f296871i;

    /* renamed from: j */
    public final /* synthetic */ C60870cx f296872j;

    /* renamed from: k */
    public final /* synthetic */ Context f296873k;

    public /* synthetic */ C106427v(C106428w wVar, String str, Bitmap bitmap, Map map, Optional optional, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, boolean z, C60870cx cxVar4, Context context) {
        this.f296863a = wVar;
        this.f296864b = str;
        this.f296865c = bitmap;
        this.f296866d = map;
        this.f296867e = optional;
        this.f296868f = cxVar;
        this.f296869g = cxVar2;
        this.f296870h = cxVar3;
        this.f296871i = z;
        this.f296872j = cxVar4;
        this.f296873k = context;
    }

    public final Object call() {
        C106428w wVar = this.f296863a;
        String str = this.f296864b;
        Bitmap bitmap = this.f296865c;
        Map map = this.f296866d;
        Optional optional = this.f296867e;
        C60870cx cxVar = this.f296868f;
        C60870cx cxVar2 = this.f296869g;
        C60870cx cxVar3 = this.f296870h;
        boolean z = this.f296871i;
        C60870cx cxVar4 = this.f296872j;
        Context context = this.f296873k;
        C90461c cVar = new C90461c();
        cVar.f252699k = false;
        cVar.f252693e = "com.google.android.googlequicksearchbox.AA_FEEDBACK_CATEGORY";
        cVar.f252713y = str;
        if (bitmap != null) {
            cVar.mo84203iI(C58485gu.m89846n(bitmap));
        }
        cVar.mo84200d("Smartspace feedback", Boolean.toString(true));
        String x = wVar.f296874a.mo79758x(C90017bw.f247984bt);
        if (!C58837ba.m90859h(x)) {
            cVar.mo84200d("Smartspace population", x);
        }
        for (Map.Entry entry : ((C58495hd) map).entrySet()) {
            cVar.mo84200d("Smartspace ".concat(String.valueOf((String) entry.getKey())), (String) entry.getValue());
        }
        if (optional.isPresent()) {
            try {
                cVar.mo84200d("Smartspace encrypted location trace", (String) C60856cj.m92910s(cxVar));
            } catch (C60916ec e) {
                Throwable cause = e.getCause();
                if (((cause instanceof IllegalStateException) || (cause instanceof IllegalArgumentException)) && cause.getMessage() != null) {
                    cVar.mo84200d("Smartspace encrypted location trace", cause.getMessage());
                } else {
                    throw e;
                }
            }
        }
        if (cxVar2.isDone()) {
            cVar.mo84199c("Smartspace TNG logs", new String((byte[]) C60856cj.m92909r(cxVar2), StandardCharsets.UTF_8));
        }
        if (cxVar3.isDone()) {
            cVar.mo84199c("Smartspace logs", new String((byte[]) C60856cj.m92909r(cxVar3), StandardCharsets.UTF_8));
        }
        if (z && cxVar4.isDone()) {
            cVar.mo84200d("Smartspace encrypted personalization data", (String) C60856cj.m92909r(cxVar4));
        }
        wVar.f296875b.mo84210a(context).mo84209b(cVar, 1);
        return true;
    }
}
