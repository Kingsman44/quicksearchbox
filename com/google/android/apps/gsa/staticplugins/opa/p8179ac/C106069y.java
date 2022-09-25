package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.assistant.p3897e.p3899b.p3901b.C50888o;
import com.google.assistant.p3897e.p3921j.p3926e.C51843bd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.p386ak.C8401q;
import com.google.protobuf.C63061fz;
import com.google.protobuf.C63063ga;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.y */
/* compiled from: PG */
public final /* synthetic */ class C106069y implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C8401q f296110a;

    public /* synthetic */ C106069y(C8401q qVar) {
        this.f296110a = qVar;
    }

    public final void accept(Object obj, Object obj2) {
        C8401q qVar = this.f296110a;
        String str = (String) obj;
        C50888o oVar = (C50888o) obj2;
        if ((oVar.f132490a & 2) != 0) {
            C63063ga gaVar = oVar.f132491b;
            if (gaVar == null) {
                gaVar = C63063ga.f170179c;
            }
            C51843bd bdVar = C51843bd.APPLICATION_URL;
            C88244um umVar = C88244um.ATTACH_WEBVIEW;
            int i = gaVar.f170181a;
            int b = C63061fz.m96003b(i);
            int i2 = b - 1;
            if (b == 0) {
                throw null;
            } else if (i2 == 1) {
                qVar.mo17170i(str, Double.valueOf(i == 2 ? ((Double) gaVar.f170182b).doubleValue() : C59203do.f157270a));
            } else if (i2 == 2) {
                qVar.mo17171j(str, i == 3 ? (String) gaVar.f170182b : BuildConfig.FLAVOR);
            } else if (i2 != 3) {
                C59104x d = C106025ax.f295983a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
                C59052c cVar = (C59052c) ((C59052c) d).mo56372aa(24683);
                int b2 = C63061fz.m96003b(gaVar.f170181a);
                String a = C63061fz.m96002a(b2);
                if (b2 != 0) {
                    cVar.mo56389s("Cannot convert IntentParameterValue.resolved with type %s", a);
                    return;
                }
                throw null;
            } else {
                qVar.mo17167c(str, Boolean.valueOf(i == 4 ? ((Boolean) gaVar.f170182b).booleanValue() : false));
            }
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
