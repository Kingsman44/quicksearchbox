package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.download.d.az */
/* compiled from: PG */
public final /* synthetic */ class C28843az implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78351a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f78352b;

    public /* synthetic */ C28843az(C29117fe feVar, C29392ep epVar) {
        this.f78351a = feVar;
        this.f78352b = epVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78351a;
        C29392ep epVar = this.f78352b;
        if (!((Boolean) obj).booleanValue()) {
            C29045l.m53937i("%s: Failed to remove pending version for group: '%s'; account: '%s'", "FileGroupManager", epVar.f79682b, epVar.f79684d);
            feVar.f78973b.mo34543h(1036);
            return C60856cj.m92899h(new IOException("Failed to remove pending group: ".concat(String.valueOf(epVar.f79682b))));
        }
        C28736bn bnVar = new C28736bn();
        bnVar.f78062a = C28737bo.CUSTOM_FILEGROUP_VALIDATION_FAILED;
        bnVar.f78063b = C28737bo.CUSTOM_FILEGROUP_VALIDATION_FAILED.name();
        return C60856cj.m92899h(bnVar.mo34334a());
    }
}
