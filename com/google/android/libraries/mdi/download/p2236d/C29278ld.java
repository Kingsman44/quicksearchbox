package com.google.android.libraries.mdi.download.p2236d;

import android.net.Uri;
import com.google.android.libraries.mdi.download.C29390en;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29401ey;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.ld */
/* compiled from: PG */
public final /* synthetic */ class C29278ld implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29290lp f79337a;

    /* renamed from: b */
    public final /* synthetic */ C29401ey f79338b;

    /* renamed from: c */
    public final /* synthetic */ C29398ev f79339c;

    public /* synthetic */ C29278ld(C29290lp lpVar, C29401ey eyVar, C29398ev evVar) {
        this.f79337a = lpVar;
        this.f79338b = eyVar;
        this.f79339c = evVar;
    }

    public final C60870cx apply(Object obj) {
        C29290lp lpVar = this.f79337a;
        C29401ey eyVar = this.f79338b;
        C29398ev evVar = this.f79339c;
        Uri uri = (Uri) obj;
        C29390en enVar = C29390en.DOWNLOAD_IN_PROGRESS;
        eyVar.copyOnWrite();
        C29402ez ezVar = (C29402ez) eyVar.instance;
        C29402ez ezVar2 = C29402ez.f79711h;
        ezVar.f79715c = enVar.f79678h;
        ezVar.f79713a |= 2;
        return lpVar.f79387c.mo34622g(evVar, (C29402ez) eyVar.build());
    }
}
