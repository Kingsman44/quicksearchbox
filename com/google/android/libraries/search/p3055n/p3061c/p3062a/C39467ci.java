package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.libraries.search.n.c.a.ci */
/* compiled from: PG */
public final /* synthetic */ class C39467ci implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C39479cu f103908a;

    /* renamed from: b */
    public final /* synthetic */ C37252a f103909b;

    /* renamed from: c */
    public final /* synthetic */ C39389ae f103910c;

    /* renamed from: d */
    public final /* synthetic */ String f103911d;

    public /* synthetic */ C39467ci(C39479cu cuVar, C37252a aVar, C39389ae aeVar, String str) {
        this.f103908a = cuVar;
        this.f103909b = aVar;
        this.f103910c = aeVar;
        this.f103911d = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C39479cu cuVar = this.f103908a;
        C37252a aVar = this.f103909b;
        C39389ae aeVar = this.f103910c;
        String str = this.f103911d;
        C2164c cVar = (C2164c) obj;
        if (cVar != null) {
            C59104x b = C39479cu.f103938a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            ((C59052c) ((C59052c) b).mo56372aa(53563)).mo56386p("We were waiting for the disconnect signal, going to set the completer to end the wait.");
            DesugarAtomicReference.getAndUpdate(cuVar.f103967r, new C39460cb(cuVar, aVar, aeVar, str));
            cVar.mo5437b((Object) null);
            C59104x b2 = C39479cu.f103938a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            ((C59052c) ((C59052c) b2).mo56372aa(53564)).mo56389s("%s. After Completer set.", str);
        } else {
            C59104x d = C39479cu.f103938a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            ((C59052c) ((C59052c) d).mo56372aa(53562)).mo56389s("%s. Completer is null; It could be set earlier or we ware not waiting for the disconnect signal.", str);
        }
        return null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
