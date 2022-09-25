package com.google.android.apps.gsa.nga.engine.screen.parser.impl;

import com.google.android.apps.gsa.assist.C9417g;
import com.google.android.apps.gsa.assist.C9418h;
import com.google.android.apps.gsa.assist.C9432v;
import com.google.android.apps.gsa.nga.d.a.x;
import com.google.android.apps.gsa.nga.d.a.y;
import com.google.android.apps.gsa.nga.engine.p6142u.C78007b;
import com.google.android.apps.gsa.nga.engine.screen.parser.impl.ScreenContentParserImpl;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.search.assistant.p2510c.C32506b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.nga.engine.screen.parser.impl.d */
/* compiled from: PG */
public final /* synthetic */ class C77951d implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ ScreenContentParserImpl f214699a;

    /* renamed from: b */
    public final /* synthetic */ long f214700b;

    public /* synthetic */ C77951d(ScreenContentParserImpl screenContentParserImpl, long j) {
        this.f214699a = screenContentParserImpl;
        this.f214700b = j;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        ScreenContentParserImpl screenContentParserImpl = this.f214699a;
        long j = this.f214700b;
        C78007b bVar = screenContentParserImpl.f214691c;
        x createBuilder = y.c.createBuilder();
        C9417g gVar = (C9417g) C9418h.f32714k.createBuilder();
        C9432v c = C32506b.m60317c((C58485gu) obj);
        gVar.copyOnWrite();
        C9418h hVar = (C9418h) gVar.instance;
        c.getClass();
        hVar.f32721f = c;
        hVar.f32716a |= 8;
        createBuilder.copyOnWrite();
        C9418h hVar2 = (C9418h) gVar.build();
        hVar2.getClass();
        createBuilder.instance.a = hVar2;
        return ScreenContentParserImpl.NativeScreenContentParser.m125114a(bVar, createBuilder.build(), j);
    }
}
