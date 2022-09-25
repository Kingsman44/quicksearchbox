package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.actionsservice;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129228e;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32433a;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32441ah;
import com.google.assistant.p3897e.p3921j.aei;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.actionsservice.t */
/* compiled from: PG */
public final /* synthetic */ class C129087t implements Function {

    /* renamed from: a */
    public final /* synthetic */ C129088u f354619a;

    public /* synthetic */ C129087t(C129088u uVar) {
        this.f354619a = uVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C129088u uVar = this.f354619a;
        aei aei = (aei) obj;
        Fragment a = uVar.f354625d.mo109535a("ActionsServiceFragment");
        if (a != null) {
            C129076i iVar = uVar.f354624c;
            String str = ((C129078k) a).mo17754z().f354608d;
            C69664n.m101061g(str, "key");
            C69664n.m101061g(aei, "args");
            C32433a a2 = iVar.mo108834a(str);
            if (a2 == null) {
                C59052c cVar = (C59052c) C129076i.f354587a.mo56225c();
                cVar.mo56379ah(new C59094n(38089));
                cVar.mo56389s("updateActionsService: unable to find ActionsServiceSession with key %s", str);
            } else {
                a2.mo38064f(new C32441ah(aei));
            }
        } else {
            ((C59052c) ((C59052c) C129088u.f354620a.mo56226d()).mo56372aa(38091)).mo56386p("Cannot find ActionsServiceFragment to proceed.");
        }
        return C129228e.f354974b;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
