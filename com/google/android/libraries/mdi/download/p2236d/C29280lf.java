package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.lf */
/* compiled from: PG */
public final /* synthetic */ class C29280lf implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29398ev f79350a;

    public /* synthetic */ C29280lf(C29398ev evVar) {
        this.f79350a = evVar;
    }

    public final C60870cx apply(Object obj) {
        C29398ev evVar = this.f79350a;
        C29402ez ezVar = (C29402ez) obj;
        if (ezVar != null) {
            return C60856cj.m92900i(ezVar);
        }
        C29045l.m53936h("%s: getSharedFile called on file that doesn't exists! Key = %s", "SharedFileManager", evVar);
        return C60856cj.m92899h(new C29291lq());
    }
}
