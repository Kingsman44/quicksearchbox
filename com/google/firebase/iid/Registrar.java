package com.google.firebase.iid;

import com.google.firebase.C61204g;
import com.google.firebase.components.C61150d;
import com.google.firebase.components.C61151e;
import com.google.firebase.components.C61152f;
import com.google.firebase.components.C61156j;
import com.google.firebase.components.C61166t;
import com.google.firebase.iid.p4614a.C61209b;
import com.google.firebase.installations.C61256h;
import com.google.firebase.p4610c.C61137k;
import com.google.firebase.p4613f.C61202h;
import com.google.firebase.p4613f.C61203i;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public final class Registrar implements C61156j {
    static /* synthetic */ FirebaseInstanceId lambda$getComponents$0(C61152f fVar) {
        return new FirebaseInstanceId((C61204g) fVar.mo57710a(C61204g.class), fVar.mo57713c(C61203i.class), fVar.mo57713c(C61137k.class), (C61256h) fVar.mo57710a(C61256h.class));
    }

    static /* synthetic */ C61209b lambda$getComponents$1(C61152f fVar) {
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) fVar.mo57710a(FirebaseInstanceId.class);
        return new C61223o();
    }

    public List getComponents() {
        C61150d a = C61151e.m93514a(FirebaseInstanceId.class);
        a.mo57716b(C61166t.m93534b(C61204g.class));
        a.mo57716b(C61166t.m93533a(C61203i.class));
        a.mo57716b(C61166t.m93533a(C61137k.class));
        a.mo57716b(C61166t.m93534b(C61256h.class));
        a.mo57717c(C61221m.f165607a);
        a.mo57718d(1);
        C61151e a2 = a.mo57715a();
        C61150d a3 = C61151e.m93514a(C61209b.class);
        a3.mo57716b(C61166t.m93534b(FirebaseInstanceId.class));
        a3.mo57717c(C61222n.f165608a);
        return Arrays.asList(new C61151e[]{a2, a3.mo57715a(), C61202h.m93574a("fire-iid", "21.1.1")});
    }
}
