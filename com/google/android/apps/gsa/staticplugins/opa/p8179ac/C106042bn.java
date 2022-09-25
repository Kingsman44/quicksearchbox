package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.google.assistant.p3814ai.p3815a.p3816a.C49179m;
import com.google.assistant.p3897e.p3917i.p3918a.C51572mr;
import com.google.assistant.p3897e.p3917i.p3918a.C51573ms;
import com.google.assistant.p3897e.p3917i.p3918a.C51574mt;
import com.google.assistant.p3897e.p3917i.p3918a.C51575mu;
import com.google.protobuf.C63060fy;
import com.google.protobuf.C63063ga;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.bn */
/* compiled from: PG */
public final /* synthetic */ class C106042bn implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C51572mr f296062a;

    public /* synthetic */ C106042bn(C51572mr mrVar) {
        this.f296062a = mrVar;
    }

    public final void accept(Object obj) {
        C51572mr mrVar = this.f296062a;
        C49179m mVar = (C49179m) obj;
        C51573ms msVar = (C51573ms) C51574mt.f134414c.createBuilder();
        C63060fy fyVar = (C63060fy) C63063ga.f170179c.createBuilder();
        String str = mVar.f127161a;
        fyVar.copyOnWrite();
        C63063ga gaVar = (C63063ga) fyVar.instance;
        str.getClass();
        gaVar.f170181a = 3;
        gaVar.f170182b = str;
        msVar.copyOnWrite();
        C63063ga gaVar2 = (C63063ga) fyVar.build();
        gaVar2.getClass();
        ((C51574mt) msVar.instance).f134416a = gaVar2;
        msVar.mo53641a(mVar.f127162b);
        mrVar.copyOnWrite();
        C51575mu muVar = (C51575mu) mrVar.instance;
        C51574mt mtVar = (C51574mt) msVar.build();
        C51575mu muVar2 = C51575mu.f134418e;
        mtVar.getClass();
        muVar.mo53643a();
        muVar.f134423d.add(mtVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
