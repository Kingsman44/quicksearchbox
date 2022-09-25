package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.shared.p7004aw.p7005a.C89316t;
import com.google.android.apps.gsa.shared.p7004aw.p7005a.C89317u;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52583xc;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.cl */
/* compiled from: PG */
public final /* synthetic */ class C115269cl implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C115314ec f319838a;

    public /* synthetic */ C115269cl(C115314ec ecVar) {
        this.f319838a = ecVar;
    }

    public final Object apply(Object obj) {
        C52583xc xcVar;
        C115314ec ecVar = this.f319838a;
        C84275o oVar = (C84275o) obj;
        C89316t tVar = (C89316t) C89317u.f242144e.createBuilder();
        boolean t = oVar.mo77814t();
        tVar.copyOnWrite();
        ((C89317u) tVar.instance).f242146a = t;
        long e = oVar.mo77799e();
        tVar.copyOnWrite();
        ((C89317u) tVar.instance).f242147b = e;
        long h = oVar.mo77802h();
        tVar.copyOnWrite();
        ((C89317u) tVar.instance).f242148c = h;
        C52568wo woVar = ecVar.mo101947a().f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        if (woVar.f137996c == 26) {
            xcVar = (C52583xc) woVar.f137997d;
        } else {
            xcVar = C52583xc.f138063o;
        }
        int i = xcVar.f138067c;
        tVar.copyOnWrite();
        ((C89317u) tVar.instance).f242149d = i;
        return (C89317u) tVar.build();
    }
}
