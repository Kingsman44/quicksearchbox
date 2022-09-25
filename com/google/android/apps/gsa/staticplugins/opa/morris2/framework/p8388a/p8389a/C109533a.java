package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a.p8389a;

import com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a.p8389a.C109560n;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p960b.C13428n;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35608aa;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59071e;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C109533a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C13428n f305058a;

    public /* synthetic */ C109533a(C13428n nVar) {
        this.f305058a = nVar;
    }

    public final Object apply(Object obj) {
        C13428n nVar = this.f305058a;
        C109560n.C109561a aVar = (C109560n.C109561a) obj;
        C59071e eVar = C109560n.f305126a;
        if (aVar.mo97895jm().containsKey(C12989g.MORRIS) && ((Map) aVar.mo97895jm().get(C12989g.MORRIS)).containsKey(nVar)) {
            return (C35608aa) ((Map) aVar.mo97895jm().get(C12989g.MORRIS)).get(nVar);
        }
        throw new IllegalStateException("No MessagesSetter binding for Morris.");
    }
}
