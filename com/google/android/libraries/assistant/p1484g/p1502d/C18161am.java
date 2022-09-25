package com.google.android.libraries.assistant.p1484g.p1502d;

import android.app.DirectAction;
import androidx.p104d.p105a.C2164c;
import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52805g;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.g.d.am */
/* compiled from: PG */
final class C18161am extends C18151ac {

    /* renamed from: a */
    final /* synthetic */ C2164c f51645a;

    /* renamed from: b */
    final /* synthetic */ C18164ap f51646b;

    public C18161am(C18164ap apVar, C2164c cVar) {
        this.f51646b = apVar;
        this.f51645a = cVar;
    }

    /* renamed from: a */
    public final void mo20095a(List list) {
        Optional optional;
        C2164c cVar = this.f51645a;
        C18164ap apVar = this.f51646b;
        C58480gp e = C58485gu.m89837e();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            DirectAction directAction = (DirectAction) it.next();
            if (!"__METADATA__".equals(directAction.getId())) {
                optional = Optional.empty();
            } else {
                optional = Optional.m71637of(C52805g.m86712b(directAction.getExtras()));
            }
            if (optional.isPresent()) {
                z |= ((C52805g) optional.get()).mo53915a();
            } else {
                e.mo55395g(new C18163ao(apVar, directAction));
            }
        }
        cVar.mo5437b(C18187x.m35408c(e.mo55394f(), z));
    }
}
