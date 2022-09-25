package com.google.android.gms.learning.dynamite.training;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143773bu;
import com.google.android.libraries.micore.learning.base.C29719k;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.gms.learning.dynamite.training.bl */
/* compiled from: PG */
final class C144696bl {
    /* renamed from: a */
    public static void m235202a(C143773bu buVar, Status status, C29719k kVar) {
        try {
            buVar.mo117762a(status);
        } catch (RemoteException e) {
            kVar.mo34868j(e, "Unexpected RemoteException");
        }
    }

    /* renamed from: b */
    static void m235203b(C144692bh bhVar, C143773bu buVar, Executor executor, C29719k kVar, Context context) {
        Context applicationContext = context.getApplicationContext();
        Objects.requireNonNull(bhVar);
        C60856cj.m92911t(C60856cj.m92905n(new C144693bi(bhVar), executor), new C144695bk(buVar, kVar, executor, applicationContext), executor);
    }
}
