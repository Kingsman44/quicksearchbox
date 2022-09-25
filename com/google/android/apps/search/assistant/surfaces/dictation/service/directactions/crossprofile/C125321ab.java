package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile;

import android.os.Bundle;
import com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125314ab;
import com.google.android.enterprise.connectedapps.C142553am;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.internal.C142577b;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile.ab */
/* compiled from: PG */
public final class C125321ab implements C142553am {

    /* renamed from: a */
    private final C125346x f345697a;

    /* renamed from: b */
    private final Bundler f345698b;

    public C125321ab(C125346x xVar, Bundler bundler) {
        this.f345697a = xVar;
        this.f345698b = bundler;
    }

    /* renamed from: a */
    public final void mo106921a(Bundle bundle) {
        ((C59052c) ((C59052c) ((C59052c) C125314ab.f345687b.mo56226d()).mo56382g(C142577b.m231205a(bundle))).mo56372aa(36550)).mo56386p("Error while subscribing to direct actions invalidation results. [SD]");
    }

    /* renamed from: b */
    public final void mo106922b(int i, Bundle bundle) {
        if (i == 0) {
            this.f345697a.mo106912a((String) this.f345698b.mo86969a(bundle, "activityId", BundlerType.m231188a("java.lang.String")));
        } else if (i == 1) {
            this.f345697a.mo106913b((String) this.f345698b.mo86969a(bundle, "errorMessage", BundlerType.m231188a("java.lang.String")));
        } else if (i == 2) {
            this.f345697a.mo106914c();
        }
    }
}
