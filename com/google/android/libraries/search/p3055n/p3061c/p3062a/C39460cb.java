package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39526i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.libraries.search.n.c.a.cb */
/* compiled from: PG */
public final /* synthetic */ class C39460cb implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C39479cu f103885a;

    /* renamed from: b */
    public final /* synthetic */ C37252a f103886b;

    /* renamed from: c */
    public final /* synthetic */ C39389ae f103887c;

    /* renamed from: d */
    public final /* synthetic */ String f103888d;

    public /* synthetic */ C39460cb(C39479cu cuVar, C37252a aVar, C39389ae aeVar, String str) {
        this.f103885a = cuVar;
        this.f103886b = aVar;
        this.f103887c = aeVar;
        this.f103888d = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C39479cu cuVar = this.f103885a;
        C37252a aVar = this.f103886b;
        C39389ae aeVar = this.f103887c;
        String str = this.f103888d;
        String str2 = (String) obj;
        if (str2 == null) {
            C59104x d = C39479cu.f103938a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            ((C59052c) ((C59052c) d).mo56372aa(53623)).mo56389s("%s. The appFlowLoggingTagAfterHotwordDetected tag is null", str);
        } else if (aVar != null) {
            C39526i iVar = cuVar.f103970u;
            C39636r rVar = new C39636r();
            rVar.mo41791b(aeVar);
            rVar.f104346a = str2;
            iVar.mo41870d(aVar, rVar.mo41790a());
        }
        C59104x b = C39479cu.f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53624)).mo56386p("Inside appFlowLoggingTagAfterHotwordDetected return. Tag reset to null.");
        return null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
