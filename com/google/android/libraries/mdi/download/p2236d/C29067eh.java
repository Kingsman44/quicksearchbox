package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29035b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.download.d.eh */
/* compiled from: PG */
public final /* synthetic */ class C29067eh implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78888a;

    /* renamed from: b */
    public final /* synthetic */ boolean f78889b;

    /* renamed from: c */
    public final /* synthetic */ C29334dr f78890c;

    public /* synthetic */ C29067eh(C29117fe feVar, boolean z, C29334dr drVar) {
        this.f78888a = feVar;
        this.f78889b = z;
        this.f78890c = drVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78888a;
        boolean z = this.f78889b;
        C29334dr drVar = this.f78890c;
        if (!((Boolean) obj).booleanValue()) {
            feVar.f78973b.mo34543h(1036);
            return C60856cj.m92899h(new IOException("Unable to update file group metadata"));
        }
        if (z) {
            C29035b.m53908a(feVar.f78973b).mo34556c(drVar);
        }
        return C60856cj.m92900i(drVar);
    }
}
