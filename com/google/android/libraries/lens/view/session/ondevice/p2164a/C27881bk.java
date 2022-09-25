package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24286d;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24288f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.bk */
/* compiled from: PG */
public final /* synthetic */ class C27881bk implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C27881bk f75986a = new C27881bk();

    private /* synthetic */ C27881bk() {
    }

    public final C60870cx apply(Object obj) {
        C58974d dVar = C27885bo.f75989a;
        C24286d j = ((C24288f) obj).mo29843j();
        if (j == null) {
            ((C58970a) ((C58970a) C27885bo.f75989a.mo56226d()).mo56372aa(50046)).mo56386p("No TranslateResult returned from engine");
            return C60856cj.m92899h(new Throwable("No TranslateResult returned from engine"));
        }
        C60870cx a = j.mo29848a();
        C27882bl blVar = C27882bl.f75987a;
        return C60922j.m93044g(a, C47810es.m84963c(blVar), C60826bg.f164896a);
    }
}
