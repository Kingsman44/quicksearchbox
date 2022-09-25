package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29390en;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.cm */
/* compiled from: PG */
public final /* synthetic */ class C28948cm implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78631a;

    /* renamed from: b */
    public final /* synthetic */ C29328dl f78632b;

    /* renamed from: c */
    public final /* synthetic */ C29334dr f78633c;

    /* renamed from: d */
    public final /* synthetic */ boolean f78634d;

    /* renamed from: e */
    public final /* synthetic */ boolean f78635e;

    /* renamed from: f */
    public final /* synthetic */ int f78636f;

    /* renamed from: g */
    public final /* synthetic */ int f78637g;

    public /* synthetic */ C28948cm(C29117fe feVar, C29328dl dlVar, C29334dr drVar, boolean z, boolean z2, int i, int i2) {
        this.f78631a = feVar;
        this.f78632b = dlVar;
        this.f78633c = drVar;
        this.f78634d = z;
        this.f78635e = z2;
        this.f78636f = i;
        this.f78637g = i2;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78631a;
        C29328dl dlVar = this.f78632b;
        C29334dr drVar = this.f78633c;
        boolean z = this.f78634d;
        boolean z2 = this.f78635e;
        int i = this.f78636f;
        int i2 = this.f78637g;
        C29390en enVar = (C29390en) obj;
        if (enVar == C29390en.DOWNLOAD_COMPLETE) {
            C29045l.m53932d("%s: File %s downloaded for group: %s", "FileGroupManager", dlVar.f79473b, drVar.f79501c);
            return feVar.mo34584g(drVar, z, z2, i + 1, i2);
        } else if (enVar == C29390en.SUBSCRIBED || enVar == C29390en.DOWNLOAD_IN_PROGRESS) {
            C29045l.m53932d("%s: File %s not downloaded for group: %s", "FileGroupManager", dlVar.f79473b, drVar.f79501c);
            return feVar.mo34584g(drVar, z, true, i + 1, i2);
        } else {
            C29045l.m53932d("%s: File %s not downloaded for group: %s", "FileGroupManager", dlVar.f79473b, drVar.f79501c);
            return feVar.mo34584g(drVar, true, z2, i + 1, i2);
        }
    }
}
