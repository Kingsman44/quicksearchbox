package com.google.android.apps.gsa.staticplugins.p7686co.p7689c;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.staticplugins.p7686co.p7688b.C98215f;
import com.google.android.libraries.storage.protostore.C43007j;
import com.google.android.libraries.storage.protostore.C43008k;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.c.g */
/* compiled from: PG */
final class C98262g extends C43007j {

    /* renamed from: a */
    final /* synthetic */ C118827a f274365a;

    public C98262g(C118827a aVar) {
        this.f274365a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo45985a(IOException iOException, C43008k kVar) {
        ((C59052c) ((C59052c) ((C59052c) C98264i.f274366a.mo56225c()).mo56382g(iOException)).mo56372aa(30582)).mo56386p("Error reading EuaLossTrackingData");
        this.f274365a.mo77944g(C118569b.EUA_SEQUENCE_ID_PERSIST_FAILURE, C118575h.EXECUTED_USER_ACTION_LOGGING).mo104025g(1);
        return kVar.mo45996a(C60856cj.m92900i(C98215f.f274236b));
    }
}
