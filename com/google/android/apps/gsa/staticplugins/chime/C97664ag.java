package com.google.android.apps.gsa.staticplugins.chime;

import com.google.android.libraries.notifications.data.C29822m;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.ag */
/* compiled from: PG */
public final /* synthetic */ class C97664ag implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C97665ah f272749a;

    /* renamed from: b */
    public final /* synthetic */ String f272750b;

    /* renamed from: c */
    public final /* synthetic */ List f272751c;

    /* renamed from: d */
    public final /* synthetic */ C58833ax f272752d;

    public /* synthetic */ C97664ag(C97665ah ahVar, String str, List list, C58833ax axVar) {
        this.f272749a = ahVar;
        this.f272750b = str;
        this.f272751c = list;
        this.f272752d = axVar;
    }

    public final void run() {
        C97665ah ahVar = this.f272749a;
        String str = this.f272750b;
        try {
            C58485gu guVar = (C58485gu) Collection.EL.stream(ahVar.f272754b.mo35392a(str)).map(C97661ad.f272745a).filter(new C97662ae(this.f272751c, this.f272752d)).collect(C58370cn.f155946a);
            if (!guVar.isEmpty()) {
                ahVar.f272754b.mo35397f(str, guVar);
            }
        } catch (C29822m e) {
            ((C59052c) ((C59052c) ((C59052c) C97665ah.f272753a.mo56226d()).mo56382g(e)).mo56372aa(18967)).mo56386p("Attempted to remove notification when account doesn't exist");
        }
    }
}
