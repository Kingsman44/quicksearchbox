package com.google.firebase.dynamiclinks.internal;

import com.google.firebase.C61204g;
import com.google.firebase.analytics.connector.C61117a;
import com.google.firebase.components.C61150d;
import com.google.firebase.components.C61151e;
import com.google.firebase.components.C61152f;
import com.google.firebase.components.C61156j;
import com.google.firebase.components.C61166t;
import com.google.firebase.dynamiclinks.C61177c;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public final class FirebaseDynamicLinkRegistrar implements C61156j {
    static /* synthetic */ C61177c lambda$getComponents$0(C61152f fVar) {
        return new C61186i((C61204g) fVar.mo57710a(C61204g.class), fVar.mo57713c(C61117a.class));
    }

    public List getComponents() {
        C61150d a = C61151e.m93514a(C61177c.class);
        a.mo57716b(C61166t.m93534b(C61204g.class));
        a.mo57716b(C61166t.m93533a(C61117a.class));
        a.mo57717c(C61182e.f165532a);
        return Arrays.asList(new C61151e[]{a.mo57715a()});
    }
}
