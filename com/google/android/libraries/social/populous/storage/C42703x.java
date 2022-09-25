package com.google.android.libraries.social.populous.storage;

import android.content.Context;
import androidx.p182p.C3918aa;
import androidx.p182p.C3919ab;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.android.libraries.social.populous.p3296e.p3301e.C42513b;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.social.populous.storage.x */
/* compiled from: PG */
public final class C42703x {
    /* renamed from: a */
    public static C3919ab m75423a(Context context, String str, C42591z zVar, Executor executor) {
        C3919ab abVar;
        C42604ae aeVar = new C42604ae(zVar, new C42683dc(new C42513b(Locale.getDefault())));
        if (str == null) {
            abVar = C3918aa.m11219b(context, RoomDatabaseManager.class);
        } else {
            abVar = C3918aa.m11218a(context, RoomDatabaseManager.class, str);
        }
        if (executor != null) {
            abVar.mo8160f(executor);
            abVar.mo8161g(executor);
        }
        abVar.mo8157c(new C42704y(aeVar), new C42705z(aeVar), new C42600aa(aeVar), new C42601ab(aeVar), new C42603ad(aeVar));
        abVar.mo8159e(1, 2, 3, 4);
        abVar.f12536e = true;
        abVar.f12537f = true;
        abVar.mo8156b(new C42702w(zVar));
        return abVar;
    }

    /* renamed from: b */
    public static RoomDatabaseManager m75424b(Context context, String str, C42591z zVar, Executor executor) {
        return (RoomDatabaseManager) m75423a(context, str, zVar, executor).mo8155a();
    }
}
