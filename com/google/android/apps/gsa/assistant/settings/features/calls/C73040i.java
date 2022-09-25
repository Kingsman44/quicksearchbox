package com.google.android.apps.gsa.assistant.settings.features.calls;

import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.assistant.p3861at.C50013hi;
import com.google.assistant.p3861at.C50129lq;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.calls.i */
/* compiled from: PG */
public final class C73040i {

    /* renamed from: a */
    public static final C59071e f193697a = null;

    /* renamed from: b */
    public final l f193698b;

    /* renamed from: c */
    public final C90021c f193699c;

    /* renamed from: d */
    private final h f193700d;

    public C73040i(l lVar, h hVar, C90021c cVar) {
        this.f193698b = lVar;
        this.f193700d = hVar;
        this.f193699c = cVar;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.calls.i.c(com.google.assistant.at.acx):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: c */
    private final void m107718c(com.google.assistant.p3861at.acx r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.calls.i.c(com.google.assistant.at.acx):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.features.calls.C73040i.m107718c(com.google.assistant.at.acx):void");
    }

    /* renamed from: a */
    public final void mo64660a(C50013hi hiVar) {
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        hiVar.getClass();
        acx.f128977E = hiVar;
        acx.f128985b |= C89885b.HTTP_VALUE;
        m107718c((acx) acw.build());
    }

    /* renamed from: b */
    public final void mo64661b(C50129lq lqVar) {
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        lqVar.getClass();
        acx.f128976D = lqVar;
        acx.f128985b |= C89885b.S3REQUEST_VALUE;
        m107718c((acx) acw.build());
    }
}
