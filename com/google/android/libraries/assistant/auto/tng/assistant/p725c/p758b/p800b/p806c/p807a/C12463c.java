package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p806c.p807a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p806c.C12479e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p960b.C13428n;
import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35608aa;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Map;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.c.a.c */
/* compiled from: PG */
public final /* synthetic */ class C12463c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C12468h f39346a;

    /* renamed from: b */
    public final /* synthetic */ C12479e f39347b;

    public /* synthetic */ C12463c(C12468h hVar, C12479e eVar) {
        this.f39346a = hVar;
        this.f39347b = eVar;
    }

    public final C60870cx apply(Object obj) {
        C12468h hVar = this.f39346a;
        C12479e eVar = this.f39347b;
        BundledMessageNotification bundledMessageNotification = (BundledMessageNotification) obj;
        Map map = hVar.f39356b;
        C12989g a = C12989g.m29225a(eVar.mo20623c().f40385d);
        if (a == null) {
            a = C12989g.UNKNOWN;
        }
        Map map2 = (Map) map.get(a);
        map2.getClass();
        C35608aa aaVar = (C35608aa) map2.get(C13428n.UNREAD);
        aaVar.getClass();
        C58976aa aaVar2 = C58975e.f156826a;
        return aaVar.mo21083c(C58485gu.m89846n(bundledMessageNotification));
    }
}
