package com.google.android.libraries.search.assistant.performer.communication;

import com.google.android.libraries.search.assistant.performer.communication.p2732a.C35490a;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.m */
/* compiled from: PG */
public final /* synthetic */ class C35767m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C35778x f93703a;

    public /* synthetic */ C35767m(C35778x xVar) {
        this.f93703a = xVar;
    }

    public final Object apply(Object obj) {
        C35778x xVar = this.f93703a;
        Exception exc = (Exception) obj;
        if (xVar.f93725g.isPresent() && xVar.mo39836e()) {
            ((C35490a) xVar.f93725g.get()).mo39666a();
        }
        if (exc.getClass().getSimpleName().equals("CancellationException")) {
            return xVar.mo39832a(C62722b.CANCELLED, C52235kf.CANCELLED);
        }
        return xVar.mo39832a(C62722b.INTERNAL, C52235kf.INTERNAL);
    }
}
