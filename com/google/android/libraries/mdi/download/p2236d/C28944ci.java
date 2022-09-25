package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.ci */
/* compiled from: PG */
public final /* synthetic */ class C28944ci implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78618a;

    /* renamed from: b */
    public final /* synthetic */ C29334dr f78619b;

    /* renamed from: c */
    public final /* synthetic */ int f78620c;

    /* renamed from: d */
    public final /* synthetic */ int f78621d;

    public /* synthetic */ C28944ci(C29117fe feVar, C29334dr drVar, int i, int i2) {
        this.f78618a = feVar;
        this.f78619b = drVar;
        this.f78620c = i;
        this.f78621d = i2;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78618a;
        C29334dr drVar = this.f78619b;
        int i = this.f78620c;
        int i2 = this.f78621d;
        if (((Boolean) obj).booleanValue()) {
            return feVar.mo34590m(drVar, i + 1, i2);
        }
        C29045l.m53936h("%s: Subscribing to file failed for group: %s", "FileGroupManager", drVar.f79501c);
        return C60856cj.m92900i(false);
    }
}
