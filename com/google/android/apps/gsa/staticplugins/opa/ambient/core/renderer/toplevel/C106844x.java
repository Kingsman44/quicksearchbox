package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import android.util.Pair;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106745c;
import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50704ap;
import com.google.assistant.p3886c.C50706ar;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.x */
/* compiled from: PG */
public final /* synthetic */ class C106844x implements Function {

    /* renamed from: a */
    public final /* synthetic */ TopLevelRendererHelper f297719a;

    public /* synthetic */ C106844x(TopLevelRendererHelper topLevelRendererHelper) {
        this.f297719a = topLevelRendererHelper;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Optional optional;
        TopLevelRendererHelper topLevelRendererHelper = this.f297719a;
        C50704ap apVar = (C50704ap) obj;
        Map map = topLevelRendererHelper.f297687d;
        C50701am a = C50701am.m85887a(apVar.f131957b);
        if (a == null) {
            a = C50701am.UNKNOWN;
        }
        C106745c cVar = (C106745c) map.get(Integer.valueOf(a.f131953N));
        if ((apVar.f131956a & 2) != 0) {
            C50706ar arVar = apVar.f131958c;
            if (arVar == null) {
                arVar = C50706ar.f131960a;
            }
            optional = Optional.m71637of(arVar);
        } else {
            optional = Optional.empty();
        }
        C58970a aVar = (C58970a) ((C58970a) topLevelRendererHelper.f297684a.mo56224b()).mo56372aa(23316);
        C50701am a2 = C50701am.m85887a(apVar.f131957b);
        if (a2 == null) {
            a2 = C50701am.UNKNOWN;
        }
        aVar.mo56359L("returning child type: [%d] renderer [%s] with payload [%s]", Integer.valueOf(a2.f131953N), cVar, optional);
        cVar.getClass();
        return Pair.create(cVar, optional);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
