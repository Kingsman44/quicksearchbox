package com.google.android.libraries.mdi.download.p2236d;

import android.content.Context;
import com.google.android.libraries.mdi.download.C29332dp;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29090d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.ko */
/* compiled from: PG */
public final /* synthetic */ class C29262ko implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29290lp f79280a;

    /* renamed from: b */
    public final /* synthetic */ C29398ev f79281b;

    public /* synthetic */ C29262ko(C29290lp lpVar, C29398ev evVar) {
        this.f79280a = lpVar;
        this.f79281b = evVar;
    }

    public final C60870cx apply(Object obj) {
        C29290lp lpVar = this.f79280a;
        C29398ev evVar = this.f79281b;
        C29402ez ezVar = (C29402ez) obj;
        if (ezVar == null) {
            C29045l.m53936h("%s: getOnDeviceUri called on file that doesn't exists. Key = %s!", "SharedFileManager", evVar);
            return C60856cj.m92899h(new C29291lq());
        }
        Context context = lpVar.f79385a;
        int a = C29332dp.m54217a(evVar.f79704e);
        if (a == 0) {
            a = 1;
        }
        return C60856cj.m92900i(C29090d.m53984e(context, a, ezVar.f79714b, ezVar.f79718f, lpVar.f79386b, lpVar.f79394j, ezVar.f79716d));
    }
}
