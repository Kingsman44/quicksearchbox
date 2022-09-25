package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2256k.C29667b;
import com.google.android.libraries.mdi.p2213d.p2218b.C28620a;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.dp */
/* compiled from: PG */
public final /* synthetic */ class C28999dp implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78738a;

    /* renamed from: b */
    public final /* synthetic */ C29334dr f78739b;

    /* renamed from: c */
    public final /* synthetic */ C29392ep f78740c;

    public /* synthetic */ C28999dp(C29117fe feVar, C29334dr drVar, C29392ep epVar) {
        this.f78738a = feVar;
        this.f78739b = drVar;
        this.f78740c = epVar;
    }

    public final C60870cx apply(Object obj) {
        int a;
        C29117fe feVar = this.f78738a;
        C29334dr drVar = this.f78739b;
        C29392ep epVar = this.f78740c;
        Void voidR = (Void) obj;
        if (!feVar.f78982k.mo56113h() || (a = C29667b.m54713a(drVar.f79515q)) == 0 || a == 1) {
            return C60856cj.m92900i(true);
        }
        int i = drVar.f79515q;
        String str = epVar.f79682b;
        return ((C28620a) ((C58881cr) feVar.f78982k.mo56107c()).mo6453a()).mo34294b();
    }
}
