package com.google.android.libraries.mdi.download.p2236d;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.mdi.download.C29332dp;
import com.google.android.libraries.mdi.download.C29390en;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29090d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.km */
/* compiled from: PG */
public final /* synthetic */ class C29260km implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29290lp f79275a;

    /* renamed from: b */
    public final /* synthetic */ C29398ev f79276b;

    public /* synthetic */ C29260km(C29290lp lpVar, C29398ev evVar) {
        this.f79275a = lpVar;
        this.f79276b = evVar;
    }

    public final C60870cx apply(Object obj) {
        C29290lp lpVar = this.f79275a;
        C29398ev evVar = this.f79276b;
        C29402ez ezVar = (C29402ez) obj;
        if (ezVar == null) {
            C29045l.m53935g("%s: Unable to read sharedFile from shared preferences.", "SharedFileManager");
            return C60856cj.m92899h(new C29291lq());
        }
        C29390en a = C29390en.m54308a(ezVar.f79715c);
        if (a == null) {
            a = C29390en.NONE;
        }
        if (a != C29390en.DOWNLOAD_COMPLETE) {
            Context context = lpVar.f79385a;
            int a2 = C29332dp.m54217a(evVar.f79704e);
            Uri e = C29090d.m53984e(context, a2 == 0 ? 1 : a2, ezVar.f79714b, evVar.f79703d, lpVar.f79386b, lpVar.f79394j, false);
            if (e != null) {
                lpVar.f79388d.mo34511d(e);
            }
        }
        return C60866ct.f164955a;
    }
}
