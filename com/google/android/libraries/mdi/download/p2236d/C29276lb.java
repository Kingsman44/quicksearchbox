package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.lb */
/* compiled from: PG */
public final /* synthetic */ class C29276lb implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29398ev f79335a;

    public /* synthetic */ C29276lb(C29398ev evVar) {
        this.f79335a = evVar;
    }

    public final C60870cx apply(Object obj) {
        C29398ev evVar = this.f79335a;
        if (((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(true);
        }
        C29045l.m53936h("%s: Unable to write back subscription for file entry with %s", "SharedFileManager", evVar);
        return C60856cj.m92900i(false);
    }
}
