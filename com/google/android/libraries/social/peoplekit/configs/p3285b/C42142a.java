package com.google.android.libraries.social.peoplekit.configs.p3285b;

import com.google.android.libraries.social.populous.core.C42262ao;
import com.google.android.libraries.social.populous.core.C42266as;
import com.google.android.libraries.social.populous.core.C42269av;
import com.google.android.libraries.social.populous.core.C42275ba;
import com.google.android.libraries.social.populous.core.C42337di;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientId;
import com.google.android.libraries.social.populous.p3288b.C42195a;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.p4431a.C57877c;
import dagger.p5294a.C68220f;

/* renamed from: com.google.android.libraries.social.peoplekit.configs.b.a */
/* compiled from: PG */
public final class C42142a implements C68220f {
    /* renamed from: a */
    public static C42266as[] m73965a() {
        C42269av a = C42195a.m74146a();
        C58528ij K = C58528ij.m90011K(C42262ao.EMAIL, C42262ao.PHONE_NUMBER);
        K.getClass();
        a.f110871c = K;
        a.f110874f = C42337di.m74561a(952, 950, 954, 951, 949, 953);
        ClientId clientId = ClientId.f110761u;
        clientId.getClass();
        a.f110869a = clientId;
        C42269av a2 = C42195a.m74146a();
        a2.f110871c = new C58759qy(C42262ao.EMAIL);
        a2.f110874f = C42337di.m74561a(946, 944, 948, 945, 943, 947);
        ClientId clientId2 = ClientId.f110760t;
        clientId2.getClass();
        a2.f110869a = clientId2;
        C42269av c = ClientConfigInternal.m74302c();
        c.mo45229e();
        ClientId clientId3 = ClientId.f110762v;
        clientId3.getClass();
        c.f110869a = clientId3;
        C58528ij K2 = C58528ij.m90011K(C42262ao.EMAIL, C42262ao.PHONE_NUMBER);
        K2.getClass();
        c.f110871c = K2;
        C42275ba baVar = C42275ba.CONTACT_PREFERRED;
        baVar.getClass();
        c.f110878j = baVar;
        c.f110881m = 3;
        c.f110882n = 3;
        C57877c cVar = C57877c.HOUSEHOLD_CONTACTS_PICKER_AFFINITY;
        cVar.getClass();
        c.f110870b = cVar;
        c.f110879k = 185;
        c.f110880l = 906;
        c.f110874f = C42337di.m74561a(982, 980, 984, 981, 979, 983);
        c.mo45228d();
        c.f110876h = false;
        c.f110883o = 46;
        return new C42266as[]{a.mo45225a(), a2.mo45225a(), c.mo45225a()};
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
