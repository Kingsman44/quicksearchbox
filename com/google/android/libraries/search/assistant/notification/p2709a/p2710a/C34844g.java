package com.google.android.libraries.search.assistant.notification.p2709a.p2710a;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import androidx.core.app.C1787ad;
import androidx.core.app.C1788ae;
import androidx.core.app.C1803at;
import com.google.android.libraries.search.assistant.notification.p2711b.C34855c;
import com.google.android.libraries.search.assistant.notification.p2711b.C34856d;
import com.google.android.libraries.search.assistant.notification.p2711b.C34858f;
import com.google.android.libraries.search.assistant.notification.p2711b.C34859g;
import com.google.android.libraries.search.assistant.notification.p2711b.C34860h;
import com.google.android.libraries.search.assistant.notification.p2711b.C34861i;
import com.google.android.libraries.search.assistant.notification.p2711b.C34866n;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.notification.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C34844g implements Function {

    /* renamed from: a */
    public final /* synthetic */ C34851n f92415a;

    /* renamed from: b */
    public final /* synthetic */ String f92416b;

    public /* synthetic */ C34844g(C34851n nVar, String str) {
        this.f92415a = nVar;
        this.f92416b = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C34851n nVar = this.f92415a;
        String str = this.f92416b;
        StatusBarNotification statusBarNotification = (StatusBarNotification) obj;
        if (C1788ae.m4919g(statusBarNotification.getNotification()) != null) {
            C34861i iVar = nVar.f92425c;
            C34859g gVar = "com.whatsapp".equals(statusBarNotification.getPackageName()) ? C34846i.f92418a : C34847j.f92419a;
            Context context = (Context) iVar.f92455a.mo17428b();
            context.getClass();
            C34866n nVar2 = (C34866n) iVar.f92456b.mo17428b();
            nVar2.getClass();
            Executor executor = (Executor) iVar.f92457c.mo17428b();
            executor.getClass();
            str.getClass();
            C34860h hVar = new C34860h(context, nVar2, executor, gVar, str);
            C1788ae g = C1788ae.m4919g(statusBarNotification.getNotification());
            g.getClass();
            List<C1787ad> list = g.f5574a;
            ArrayList arrayList = new ArrayList();
            for (C1787ad adVar : list) {
                C1803at atVar = adVar.f5570c;
                if (atVar != null) {
                    Optional ofNullable = Optional.ofNullable(atVar.f5630a);
                    if (!ofNullable.isPresent()) {
                        cxVar2 = C60856cj.m92900i(Optional.empty());
                    } else {
                        cxVar2 = hVar.f92451c.mo39536c(((CharSequence) ofNullable.get()).toString(), hVar.f92454f);
                    }
                    arrayList.add(C60922j.m93045h(C60922j.m93045h(cxVar2, C47810es.m84966f(new C34855c(hVar, g)), hVar.f92452d), C47810es.m84966f(new C34856d(hVar, g, adVar, statusBarNotification)), hVar.f92452d));
                }
            }
            cxVar = C60922j.m93044g(C47638k.m84752c(arrayList).mo51520a(new C34858f(arrayList), hVar.f92452d), C47810es.m84963c(C34848k.f92420a), nVar.f92426d);
        } else {
            cxVar = C60856cj.m92900i(Optional.empty());
        }
        return C60846c.m92878g(cxVar, Exception.class, C47810es.m84963c(C34842e.f92413a), nVar.f92426d);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
