package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.apps.gsa.shared.bisto.p7029b.C89643n;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124526g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.mb */
/* compiled from: PG */
public final /* synthetic */ class C96395mb implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C96397md f269679a;

    /* renamed from: b */
    public final /* synthetic */ String f269680b;

    /* renamed from: c */
    public final /* synthetic */ C124548d f269681c;

    public /* synthetic */ C96395mb(C96397md mdVar, String str, C124548d dVar) {
        this.f269679a = mdVar;
        this.f269680b = str;
        this.f269681c = dVar;
    }

    public final C60870cx apply(Object obj) {
        C96397md mdVar = this.f269679a;
        String str = this.f269680b;
        C124548d dVar = this.f269681c;
        Integer num = (Integer) obj;
        C58976aa aaVar = C58975e.f156826a;
        if (C89643n.m145921f(num.intValue())) {
            mdVar.f269687e = 2;
        } else {
            mdVar.f269684b.mo90176d(str, false);
            int i = 4;
            if (num.intValue() == 6 && C124526g.m203993a(dVar)) {
                i = 3;
            }
            mdVar.f269687e = i;
        }
        return C60866ct.f164955a;
    }
}
