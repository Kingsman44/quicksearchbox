package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions;

import android.app.DirectAction;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.k */
/* compiled from: PG */
final class C125356k extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C58485gu f345741a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125356k(C58485gu guVar) {
        super(0);
        this.f345741a = guVar;
    }

    /* renamed from: a */
    public final Object mo5672a() {
        C58485gu<DirectAction> guVar = this.f345741a;
        C69664n.m101060f(guVar, "newDirectActions");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(guVar, 10));
        for (DirectAction id : guVar) {
            arrayList.add(id.getId());
        }
        return arrayList;
    }
}
