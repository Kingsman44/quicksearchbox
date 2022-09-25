package com.google.android.libraries.onegoogle.owners.mdi;

import com.google.android.libraries.onegoogle.owners.C30974i;
import com.google.android.libraries.onegoogle.owners.C30976k;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.onegoogle.owners.mdi.u */
/* compiled from: PG */
public final /* synthetic */ class C31006u implements Callable {

    /* renamed from: a */
    public final /* synthetic */ MdiOwnersLoader f83503a;

    /* renamed from: b */
    public final /* synthetic */ String f83504b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f83505c;

    public /* synthetic */ C31006u(MdiOwnersLoader mdiOwnersLoader, String str, C60870cx cxVar) {
        this.f83503a = mdiOwnersLoader;
        this.f83504b = str;
        this.f83505c = cxVar;
    }

    public final Object call() {
        MdiOwnersLoader mdiOwnersLoader = this.f83503a;
        String str = this.f83504b;
        C60870cx cxVar = this.f83505c;
        C30974i m = C30976k.m57823m();
        m.mo36618b(str);
        mdiOwnersLoader.mo36673b(m, cxVar);
        return m.mo36617a();
    }
}
