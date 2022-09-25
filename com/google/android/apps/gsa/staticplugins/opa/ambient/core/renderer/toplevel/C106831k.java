package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50704ap;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.k */
/* compiled from: PG */
public final /* synthetic */ class C106831k implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ TopLevelRendererHelper f297703a;

    /* renamed from: b */
    public final /* synthetic */ C50704ap f297704b;

    public /* synthetic */ C106831k(TopLevelRendererHelper topLevelRendererHelper, C50704ap apVar) {
        this.f297703a = topLevelRendererHelper;
        this.f297704b = apVar;
    }

    public final Object apply(Object obj) {
        TopLevelRendererHelper topLevelRendererHelper = this.f297703a;
        C50704ap apVar = this.f297704b;
        if (((Boolean) obj).booleanValue()) {
            return Optional.m71637of(apVar);
        }
        C58970a aVar = (C58970a) ((C58970a) topLevelRendererHelper.f297684a.mo56226d()).mo56372aa(23320);
        C50701am a = C50701am.m85887a(apVar.f131957b);
        if (a == null) {
            a = C50701am.UNKNOWN;
        }
        aVar.mo56389s("filtering out child use case %s since it is not enabled", a);
        return Optional.empty();
    }
}
