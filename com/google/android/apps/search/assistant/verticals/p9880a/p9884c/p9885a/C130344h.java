package com.google.android.apps.search.assistant.verticals.p9880a.p9884c.p9885a;

import android.app.DirectAction;
import android.content.ComponentName;
import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.C130336a;
import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.C130348b;
import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.p9886b.C130352d;
import com.google.assistant.p3931f.p3939c.C52829f;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.c.a.h */
/* compiled from: PG */
public final /* synthetic */ class C130344h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130345i f357243a;

    public /* synthetic */ C130344h(C130345i iVar) {
        this.f357243a = iVar;
    }

    public final Object apply(Object obj) {
        Optional optional;
        C130345i iVar = this.f357243a;
        C58485gu guVar = (C58485gu) obj;
        if (guVar.isEmpty()) {
            ((C59052c) ((C59052c) C130346j.f357244a.mo56224b()).mo56372aa(39410)).mo56386p("No direct actions. Return default ConversationParamResult.");
            return C130348b.m212798a().mo109666a();
        }
        Optional c = C130352d.m212806c(guVar, "app_action");
        if (!c.isPresent()) {
            ((C59052c) ((C59052c) C130346j.f357244a.mo56224b()).mo56372aa(39409)).mo56386p("No app_action direct action. Return default ConversationParamResult.");
            return C130348b.m212798a().mo109666a();
        }
        Optional b = C130352d.m212805b((DirectAction) c.get());
        if (!b.isPresent()) {
            ((C59052c) ((C59052c) C130346j.f357244a.mo56224b()).mo56372aa(39408)).mo56386p("Fails to convert action to context. Return default ConversationParamResult.");
            return C130348b.m212798a().mo109666a();
        }
        C130336a a = C130348b.m212798a();
        a.mo109668c((C52829f) b.get());
        a.mo109670e(c);
        int e = iVar.mo109674e();
        if (e != 0) {
            if (e == 2) {
                a.mo109669d(Optional.m71637of(iVar.mo109673d()));
                a.mo109667b(Optional.m71637of(iVar.mo109671b()));
            } else {
                Optional c2 = C130352d.m212806c(guVar, "foreground_app");
                if (c2.isPresent()) {
                    optional = C130352d.m212807d((DirectAction) c2.get());
                } else {
                    optional = Optional.empty();
                }
                if (optional.isPresent()) {
                    a.mo109669d(Optional.m71637of(((ComponentName) optional.get()).getPackageName()));
                    a.mo109667b(Optional.m71637of(((ComponentName) optional.get()).getClassName()));
                }
            }
            return a.mo109666a();
        }
        throw null;
    }
}
