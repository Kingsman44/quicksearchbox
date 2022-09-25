package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import android.content.Context;
import androidx.slice.C4114m;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35932a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52098fd;
import com.google.assistant.p3897e.p3921j.C52099fe;
import com.google.assistant.p3897e.p3921j.C52103fi;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.ah */
/* compiled from: PG */
public final /* synthetic */ class C35819ah implements Function {

    /* renamed from: a */
    public final /* synthetic */ C35823al f93847a;

    /* renamed from: b */
    public final /* synthetic */ String f93848b;

    /* renamed from: c */
    public final /* synthetic */ C52098fd f93849c;

    public /* synthetic */ C35819ah(C35823al alVar, String str, C52098fd fdVar) {
        this.f93847a = alVar;
        this.f93848b = str;
        this.f93849c = fdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C35823al alVar = this.f93847a;
        String str = this.f93848b;
        C52098fd fdVar = this.f93849c;
        String str2 = (String) obj;
        C35836ay ayVar = alVar.f93865b;
        Context context = (Context) ayVar.f93912a.mo17428b();
        context.getClass();
        C60887da daVar = (C60887da) ayVar.f93913b.mo17428b();
        daVar.getClass();
        C4114m mVar = (C4114m) ayVar.f93914c.mo17428b();
        mVar.getClass();
        str2.getClass();
        C35835ax axVar = new C35835ax(context, daVar, mVar, str2);
        C35932a.m64318c(alVar.f93868e, str);
        C60870cx a = alVar.mo39856a(axVar, str2);
        C35821aj ajVar = new C35821aj(alVar, str2, str, axVar, (C52099fe) C52103fi.f136729i.createBuilder(), fdVar);
        return C60922j.m93044g(a, C47810es.m84963c(ajVar), C60826bg.f164896a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
