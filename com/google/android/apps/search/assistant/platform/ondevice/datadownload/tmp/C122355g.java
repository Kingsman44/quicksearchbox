package com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp;

import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.C17030b;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17046am;
import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.g */
/* compiled from: PG */
public final /* synthetic */ class C122355g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C17030b f339242a;

    public /* synthetic */ C122355g(C17030b bVar) {
        this.f339242a = bVar;
    }

    public final Object apply(Object obj) {
        C17030b bVar = this.f339242a;
        C29690f fVar = ((C17046am) obj).f49658b;
        if (fVar == null) {
            fVar = C29690f.f80408m;
        }
        C29689e a = C29689e.m54781a(fVar.f80415f);
        if (a == null) {
            a = C29689e.UNSPECIFIED;
        }
        if (!a.equals(C29689e.DOWNLOADED)) {
            return Optional.m71637of(bVar);
        }
        return Optional.empty();
    }
}
