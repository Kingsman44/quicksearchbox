package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8083c;

import android.content.Context;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92513g;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.micro.GoogleEndpointerData;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.c.e */
/* compiled from: PG */
public final /* synthetic */ class C103543e implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C58833ax f288491a;

    /* renamed from: b */
    public final /* synthetic */ Context f288492b;

    public /* synthetic */ C103543e(C58833ax axVar, Context context) {
        this.f288491a = axVar;
        this.f288492b = context;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C58833ax axVar = this.f288491a;
        Context context = this.f288492b;
        if (axVar.mo56113h()) {
            int f = ((C103560v) axVar.mo56107c()).f288522a.mo87195f();
            byte[] h = C92513g.m152179h(context, "endpointer.data");
            if (h != null) {
                return C58833ax.m90834k(new GoogleEndpointerData(h, f));
            }
            C59104x b = C103546h.f288495a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MicroEndpointerProdMod");
            ((C59052c) ((C59052c) b).mo56372aa(21601)).mo56386p("Failed creating google endpointer data, endpointer model is null");
            return C58836b.f156633a;
        }
        C59104x b2 = C103546h.f288495a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "MicroEndpointerProdMod");
        ((C59052c) ((C59052c) b2).mo56372aa(21600)).mo56386p("Failed creating google endpointer data, missing voice input data");
        return C58836b.f156633a;
    }
}
