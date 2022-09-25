package com.google.android.libraries.assistant.pcp.p1541b;

import com.google.android.libraries.assistant.pcp.p1546d.C18573a;
import com.google.android.libraries.assistant.pcp.p1546d.C18574b;
import com.google.android.libraries.assistant.pcp.p1546d.C18575c;
import com.google.android.libraries.assistant.pcp.p1546d.C18579g;
import com.google.assistant.p3803ag.p3809c.C49046el;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.b.d */
/* compiled from: PG */
public final /* synthetic */ class C18533d implements Function {

    /* renamed from: a */
    public final /* synthetic */ C18579g f52514a;

    /* renamed from: b */
    public final /* synthetic */ Optional f52515b;

    /* renamed from: c */
    public final /* synthetic */ Optional f52516c;

    public /* synthetic */ C18533d(C18579g gVar, Optional optional, Optional optional2) {
        this.f52514a = gVar;
        this.f52515b = optional;
        this.f52516c = optional2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C49046el elVar;
        C18579g gVar = this.f52514a;
        Optional optional = this.f52515b;
        Optional optional2 = this.f52516c;
        C49046el elVar2 = (C49046el) obj;
        C18573a aVar = new C18573a();
        aVar.f52593a = new C18575c(0);
        aVar.mo24060a(C49046el.f126849c);
        aVar.mo24061b(Optional.empty());
        aVar.mo24062c(Optional.empty());
        if (gVar != null) {
            aVar.f52593a = gVar;
            aVar.mo24060a(elVar2);
            aVar.mo24061b(optional);
            aVar.mo24062c(optional2);
            C18579g gVar2 = aVar.f52593a;
            if (gVar2 != null && (elVar = aVar.f52594b) != null) {
                return C60856cj.m92900i(new C18574b(gVar2, elVar, aVar.f52595c, aVar.f52596d));
            }
            StringBuilder sb = new StringBuilder();
            if (aVar.f52593a == null) {
                sb.append(" featureType");
            }
            if (aVar.f52594b == null) {
                sb.append(" featureConfig");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        throw new NullPointerException("Null featureType");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
