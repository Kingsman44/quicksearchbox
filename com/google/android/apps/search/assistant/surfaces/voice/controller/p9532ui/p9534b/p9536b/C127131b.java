package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9536b;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126985f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126987h;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126988i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126996q;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129566ah;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129660g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.b.b */
/* compiled from: PG */
public final class C127131b {

    /* renamed from: a */
    private static final C59071e f350044a = C59071e.m91331h();

    /* renamed from: a */
    public static final void m207924a(C126988i iVar, C129566ah ahVar, C127118j jVar, Context context) {
        C126996q qVar;
        C69664n.m101061g(iVar, "error");
        C69664n.m101061g(ahVar, "navigator");
        C69664n.m101061g(jVar, "uiActions");
        int i = iVar.f349674d;
        int a = C126987h.m207729a(i);
        int i2 = a - 1;
        if (a == 0) {
            throw null;
        } else if (i2 == 0) {
            jVar.mo107933i();
        } else if (i2 == 1) {
            C59052c cVar = (C59052c) f350044a.mo56224b();
            cVar.mo56379ah(new C59094n(37400));
            cVar.mo56386p("Navigate to DRL.");
            C129662i iVar2 = C129662i.RESPONSE;
            C129660g gVar = (C129660g) C129676j.f355890c.createBuilder();
            gVar.copyOnWrite();
            C129676j jVar2 = (C129676j) gVar.instance;
            jVar2.f355893b = iVar2.f355866l;
            jVar2.f355892a |= 1;
            C62942bv build = gVar.build();
            C69664n.m101060f(build, "newBuilder().setType(navigateTo).build()");
            ahVar.mo109105a((C129676j) build);
        } else if (i2 == 2) {
            if (i == 8) {
                qVar = (C126996q) iVar.f349675e;
            } else {
                qVar = C126996q.f349705c;
            }
            Toast.makeText(context, qVar.f349708b, 1).show();
        } else if (i2 == 3) {
            C59052c cVar2 = (C59052c) f350044a.mo56224b();
            cVar2.mo56379ah(new C59094n(37401));
            cVar2.mo56386p("OAuth error. Navigate to ACCOUNT_FIX.");
            C129662i iVar3 = C129662i.ACCOUNT_FIX;
            C129660g gVar2 = (C129660g) C129676j.f355890c.createBuilder();
            gVar2.copyOnWrite();
            C129676j jVar3 = (C129676j) gVar2.instance;
            jVar3.f355893b = iVar3.f355866l;
            jVar3.f355892a |= 1;
            C62942bv build2 = gVar2.build();
            C69664n.m101060f(build2, "newBuilder().setType(navigateTo).build()");
            ahVar.mo109105a((C129676j) build2);
        } else if (i2 != 4) {
            C126985f a2 = C126985f.m207727a(iVar.f349676f);
            if (a2 == null) {
                a2 = C126985f.ERROR_UNKNOWN;
            }
            throw new IllegalArgumentException("Handling strategy not set for ".concat(String.valueOf(a2.name())));
        } else {
            C59052c cVar3 = (C59052c) f350044a.mo56224b();
            cVar3.mo56379ah(new C59094n(37402));
            cVar3.mo56386p("Received WarmerWelcome error. Handled by fragments.");
        }
    }
}
