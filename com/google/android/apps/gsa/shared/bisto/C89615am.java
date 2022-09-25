package com.google.android.apps.gsa.shared.bisto;

import android.net.Uri;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42791o;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.shared.bisto.am */
/* compiled from: PG */
public final /* synthetic */ class C89615am implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C89618ap f242678a;

    /* renamed from: b */
    public final /* synthetic */ String f242679b;

    public /* synthetic */ C89615am(C89618ap apVar, String str) {
        this.f242678a = apVar;
        this.f242679b = str;
    }

    public final Object apply(Object obj) {
        C89618ap apVar = this.f242678a;
        String str = this.f242679b;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            C59104x c = C89618ap.f242682a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HotwordModelMapsAccessor");
            ((C59052c) ((C59052c) c).mo56372aa(10264)).mo56389s("Missing client file group %s", "apa_bisto_hotword_models");
            return Optional.empty();
        }
        C29690f fVar = (C29690f) optional.get();
        C42813k kVar = apVar.f242683b;
        try {
            for (C28595b bVar : fVar.f80416g) {
                if (bVar.f77798b.equals(str)) {
                    C59104x b = C89618ap.f242682a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "HotwordModelMapsAccessor");
                    ((C59052c) ((C59052c) b).mo56372aa(10265)).mo56352E("Loading %s from MDD with version=%d", str, fVar.f80414e);
                    return Optional.m71637of((String) kVar.mo45889c(Uri.parse(bVar.f77799c), new C42791o()));
                }
            }
            C59104x c2 = C89618ap.f242682a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "HotwordModelMapsAccessor");
            ((C59052c) ((C59052c) c2).mo56372aa(10267)).mo56389s("Hotword model maps %s file not found.", str);
            return Optional.empty();
        } catch (IOException e) {
            C59104x c3 = C89618ap.f242682a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "HotwordModelMapsAccessor");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e)).mo56372aa(10266)).mo56354G("Error opening MDD file %s with exception %s.", str, e);
            return Optional.empty();
        }
    }
}
