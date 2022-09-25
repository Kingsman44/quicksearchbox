package com.google.android.libraries.p10923ac.p10925b.p10943j;

import android.content.pm.PackageManager;
import com.evernote.android.state.BuildConfig;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.ac.b.j.q */
/* compiled from: PG */
public final /* synthetic */ class C147120q implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C147123t f397212a;

    public /* synthetic */ C147120q(C147123t tVar) {
        this.f397212a = tVar;
    }

    public final C60870cx apply(Object obj) {
        C147123t tVar = this.f397212a;
        List<C147112i> list = (List) obj;
        for (C147112i h : list) {
            String h2 = h.mo123930h();
            try {
                if (!BuildConfig.FLAVOR.equals(h2) && (!C147123t.m239889c(h2, tVar.f397219d) || C147123t.m239890d(h2, tVar.f397219d))) {
                    tVar.f397218c.mo123936d(h2, C147114k.SUBSCRIPTION_CLEANUP);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                tVar.f397218c.mo123936d(h2, C147114k.SUBSCRIPTION_CLEANUP);
            }
        }
        return tVar.mo123944b(list);
    }
}
