package com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c;

import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.common.base.C58838bb;
import com.google.protos.youtube.elements.C66192df;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.c.p */
/* compiled from: PG */
public final /* synthetic */ class C40051p implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C40058w f105227a;

    /* renamed from: b */
    public final /* synthetic */ C66192df f105228b;

    public /* synthetic */ C40051p(C40058w wVar, C66192df dfVar) {
        this.f105227a = wVar;
        this.f105228b = dfVar;
    }

    public final Object call() {
        C28439i iVar;
        C40058w wVar = this.f105227a;
        C66192df dfVar = this.f105228b;
        C58838bb.m90884s(!wVar.f105256m, "GilElementsInteractionLogger was cleaned up");
        int i = dfVar.f180000c;
        synchronized (wVar.f105251h) {
            iVar = (C28439i) wVar.f105254k.get(Integer.valueOf(i));
        }
        C58838bb.m90867b(iVar, "There is no ClientVisualElement associated with LoggingNode %s", dfVar);
        return wVar.f105247d.mo33851a(iVar);
    }
}
