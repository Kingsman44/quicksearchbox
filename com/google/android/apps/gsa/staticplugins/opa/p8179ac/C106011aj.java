package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import android.webkit.ValueCallback;
import com.google.android.apps.gsa.shared.p7066m.C90041ct;
import com.google.android.libraries.assistant.p1528m.p1529a.C18422g;
import com.google.android.libraries.assistant.p1528m.p1529a.C18423h;
import com.google.android.libraries.assistant.p1528m.p1529a.C18431p;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3745ab.p3746a.C48188l;
import com.google.assistant.p3745ab.p3746a.C48189m;
import com.google.assistant.p3745ab.p3746a.C48190n;
import com.google.assistant.p3897e.p3921j.p3926e.C51842bc;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C63034ez;
import com.google.protobuf.C63037fb;
import com.google.protobuf.C63063ga;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.aj */
/* compiled from: PG */
public final /* synthetic */ class C106011aj implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C106023av f295957a;

    /* renamed from: b */
    public final /* synthetic */ String f295958b;

    public /* synthetic */ C106011aj(C106023av avVar, String str) {
        this.f295957a = avVar;
        this.f295958b = str;
    }

    public final void run() {
        C18423h hVar;
        C63063ga gaVar;
        C106023av avVar = this.f295957a;
        String str = this.f295958b;
        if (avVar.f295980a.f295987D) {
            hVar = C18423h.BLOCKED;
        } else if (str.isEmpty()) {
            hVar = C18423h.INVALID_ARGUMENT;
        } else {
            C63034ez ezVar = avVar.f295980a.f295989F;
            str.getClass();
            if (Collections.unmodifiableMap(((C63037fb) ezVar.instance).f170146a).containsKey(str)) {
                hVar = C18423h.OK;
            } else {
                hVar = C18423h.KEY_NOT_FOUND;
            }
        }
        if (Collections.unmodifiableMap(Collections.unmodifiableMap(((C63037fb) avVar.f295980a.f295989F.instance).f170146a)).containsKey(str)) {
            C63034ez ezVar2 = avVar.f295980a.f295989F;
            str.getClass();
            Map unmodifiableMap = Collections.unmodifiableMap(((C63037fb) ezVar2.instance).f170146a);
            if (unmodifiableMap.containsKey(str)) {
                gaVar = (C63063ga) unmodifiableMap.get(str);
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            gaVar = null;
        }
        if (avVar.f295980a.f296013k.mo79746e(C90041ct.f248695h)) {
            C51842bc bcVar = avVar.f295980a.f296024v;
            C48189m mVar = (C48189m) C48190n.f124701e.createBuilder();
            C48188l a = C106030bb.f296035b.apply(hVar);
            mVar.copyOnWrite();
            C48190n nVar = (C48190n) mVar.instance;
            nVar.f124705c = Integer.valueOf(a.f124700k);
            nVar.f124704b = 2;
            C106030bb.m176635c((C48190n) mVar.build(), bcVar);
        }
        C18431p pVar = (C18431p) avVar.f295980a.f296005c.mo56107c();
        Object x = avVar.f295980a.mo95242x(gaVar);
        if (pVar.f52320l.mo23950a() != C18422g.LOADED) {
            ((C59052c) ((C59052c) C18431p.f52308a.mo56225c()).mo56372aa(47311)).mo56386p("Page content not loaded.");
            return;
        }
        if (x instanceof String) {
            x = C18431p.m35890d((String) x);
        }
        pVar.f52310b.evaluateJavascript(pVar.mo23953c("sendGetUserParamStatus", C18431p.m35890d(hVar.name()), C18431p.m35890d(str), x), (ValueCallback) null);
    }
}
