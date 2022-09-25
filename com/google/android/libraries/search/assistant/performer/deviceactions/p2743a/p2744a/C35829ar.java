package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.ar */
/* compiled from: PG */
public final /* synthetic */ class C35829ar implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C35830as f93890a;

    /* renamed from: b */
    public final /* synthetic */ C52115fu f93891b;

    /* renamed from: c */
    public final /* synthetic */ String f93892c;

    public /* synthetic */ C35829ar(C35830as asVar, C52115fu fuVar, String str) {
        this.f93890a = asVar;
        this.f93891b = fuVar;
        this.f93892c = str;
    }

    public final Object apply(Object obj) {
        C35830as asVar = this.f93890a;
        C52115fu fuVar = this.f93891b;
        String str = this.f93892c;
        if (((Boolean) obj).booleanValue()) {
            asVar.f93898f.mo39897e(C35845bg.m64246f(fuVar), C62722b.OK);
            return C36180b.f94544a;
        }
        asVar.f93898f.mo39897e(C35845bg.m64246f(fuVar), C62722b.UNAVAILABLE);
        return C36180b.m64579c(C52235kf.UNAVAILABLE, String.format("Setting %s is not modified by Slice API.", new Object[]{str}));
    }
}
