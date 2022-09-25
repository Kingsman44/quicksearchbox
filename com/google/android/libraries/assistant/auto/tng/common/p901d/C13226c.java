package com.google.android.libraries.assistant.auto.tng.common.p901d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1704e.C20675a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.d.c */
/* compiled from: PG */
public final /* synthetic */ class C13226c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13231h f40877a;

    public /* synthetic */ C13226c(C13231h hVar) {
        this.f40877a = hVar;
    }

    public final C60870cx apply(Object obj) {
        String str;
        C13231h hVar = this.f40877a;
        try {
            str = C20675a.m38858a((String) ((C58833ax) obj).mo56111f(), hVar.f40882a);
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) C13232i.f40888a.mo56225c()).mo56382g(e)).mo56372aa(44702)).mo56386p("Client instance id calculation failed.");
            str = null;
        }
        if (str == null) {
            return C60856cj.m92900i(BuildConfig.FLAVOR);
        }
        return C47638k.m84751b(hVar.f40887f.mo46039a(new C13228e(str), hVar.f40886e)).mo51521b(new C13230g(str), hVar.f40886e);
    }
}
