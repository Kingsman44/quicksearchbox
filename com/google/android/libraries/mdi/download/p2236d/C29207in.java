package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.in */
/* compiled from: PG */
public final /* synthetic */ class C29207in implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29211ir f79186a;

    public /* synthetic */ C29207in(C29211ir irVar) {
        this.f79186a = irVar;
    }

    public final C60870cx apply(Object obj) {
        C29211ir irVar = this.f79186a;
        if (((Boolean) obj).booleanValue()) {
            return C60866ct.f164955a;
        }
        C29045l.m53943o("%s Clearing MDD since FileManager failed or needs migration.", "MDDManager");
        return irVar.mo34627c();
    }
}
