package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.at */
/* compiled from: PG */
public final /* synthetic */ class C27863at implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C27877bg f75943a;

    public /* synthetic */ C27863at(C27877bg bgVar) {
        this.f75943a = bgVar;
    }

    public final C60870cx apply(Object obj) {
        C27877bg bgVar = this.f75943a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C60856cj.m92899h(new IllegalStateException("No default hybrid translate cascade configuration found."));
        }
        return C47633f.m84733g(bgVar.f75976b.mo30020b(((C27891h) axVar.mo56107c()).mo33347d(), ((C27891h) axVar.mo56107c()).mo33345b())).mo51515h(C27862as.f75942a, C60826bg.f164896a);
    }
}
