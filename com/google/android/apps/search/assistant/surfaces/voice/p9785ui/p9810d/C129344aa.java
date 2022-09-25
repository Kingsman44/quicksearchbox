package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9810d;

import android.content.Context;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126988i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126994o;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.d.aa */
/* compiled from: PG */
public final /* synthetic */ class C129344aa implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ Context f355235a;

    public /* synthetic */ C129344aa(Context context) {
        this.f355235a = context;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C126994o oVar;
        Context context = this.f355235a;
        AccountId accountId = (AccountId) obj;
        C126988i iVar = (C126988i) obj2;
        if (iVar.f349672b == 5) {
            oVar = C126994o.m207730a(((Integer) iVar.f349673c).intValue());
            if (oVar == null) {
                oVar = C126994o.NETWORK_UNKNOWN_REASON;
            }
        } else {
            oVar = C126994o.NETWORK_UNKNOWN_REASON;
        }
        C129374p b = C129349af.m211170b(oVar, context);
        C129378t tVar = new C129378t();
        C68324h.m98669f(tVar);
        C47247a.m84047b(tVar, accountId);
        C47243l.m84039a(tVar, b);
        return tVar;
    }
}
