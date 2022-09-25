package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import com.google.android.libraries.assistant.p1363c.p1371b.p1377e.C17095a;
import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.base.C58817ah;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.n */
/* compiled from: PG */
public final /* synthetic */ class C122327n implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C122327n f339196a = new C122327n();

    private /* synthetic */ C122327n() {
    }

    public final Object apply(Object obj) {
        Optional empty = Optional.empty();
        boolean z = false;
        for (Optional optional : (List) obj) {
            if (!optional.isEmpty()) {
                C29690f fVar = (C29690f) optional.get();
                C29689e a = C29689e.m54781a(fVar.f80415f);
                if (a == null) {
                    a = C29689e.UNSPECIFIED;
                }
                if (!a.equals(C29689e.PENDING)) {
                    C29689e a2 = C29689e.m54781a(fVar.f80415f);
                    if (a2 == null) {
                        a2 = C29689e.UNSPECIFIED;
                    }
                    if (a2.equals(C29689e.DOWNLOADED)) {
                        z = true;
                    }
                } else if (!empty.isPresent()) {
                    empty = Optional.m71637of(Long.valueOf(Collection.EL.stream(fVar.f80416g).mapToLong(C122376v.f339287a).sum()));
                } else {
                    throw new IllegalStateException("Multiple pending groups found, currently not supported");
                }
            }
        }
        return new C17095a(empty, z);
    }
}
