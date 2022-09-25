package com.google.android.libraries.assistant.pcp.p1557g.p1561c.p1562a;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.g.c.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C18720aa implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f52798a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f52799b;

    /* renamed from: c */
    public final /* synthetic */ LinkedHashSet f52800c;

    public /* synthetic */ C18720aa(C60870cx cxVar, C60870cx cxVar2, LinkedHashSet linkedHashSet) {
        this.f52798a = cxVar;
        this.f52799b = cxVar2;
        this.f52800c = linkedHashSet;
    }

    public final Object call() {
        C60870cx cxVar = this.f52798a;
        C60870cx cxVar2 = this.f52799b;
        LinkedHashSet linkedHashSet = this.f52800c;
        Optional optional = (Optional) C60856cj.m92909r(cxVar);
        Optional optional2 = (Optional) C60856cj.m92909r(cxVar2);
        if (!optional.isPresent() || !((Boolean) optional.get()).booleanValue() || !optional2.isPresent() || !((Boolean) optional2.get()).booleanValue()) {
            ((C59052c) ((C59052c) C18727ah.f52807a.mo56224b()).mo56372aa(47348)).mo56354G("Unable to provide first party recommendations. YT Premium: %s. Personal results enabled: %s.", optional, optional2);
            Collection.EL.removeIf(linkedHashSet, C18743q.f52848a);
        }
        return Optional.m71637of(linkedHashSet);
    }
}
