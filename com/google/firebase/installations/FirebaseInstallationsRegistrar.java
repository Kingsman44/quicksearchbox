package com.google.firebase.installations;

import com.google.firebase.C61204g;
import com.google.firebase.components.C61150d;
import com.google.firebase.components.C61151e;
import com.google.firebase.components.C61152f;
import com.google.firebase.components.C61156j;
import com.google.firebase.components.C61166t;
import com.google.firebase.p4610c.C61134h;
import com.google.firebase.p4610c.C61135i;
import com.google.firebase.p4610c.C61136j;
import com.google.firebase.p4613f.C61202h;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class FirebaseInstallationsRegistrar implements C61156j {
    static /* synthetic */ C61256h lambda$getComponents$0(C61152f fVar) {
        return new C61255g((C61204g) fVar.mo57710a(C61204g.class), fVar.mo57713c(C61136j.class));
    }

    public List getComponents() {
        C61150d a = C61151e.m93514a(C61256h.class);
        a.mo57716b(C61166t.m93534b(C61204g.class));
        a.mo57716b(C61166t.m93533a(C61136j.class));
        a.mo57717c(C61258j.f165697a);
        return Arrays.asList(new C61151e[]{a.mo57715a(), C61151e.m93515b(new C61135i(), C61134h.class), C61202h.m93574a("fire-installations", "17.0.2_1p")});
    }
}
