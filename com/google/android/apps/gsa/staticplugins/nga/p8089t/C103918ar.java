package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80624s;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80903ar;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.ar */
/* compiled from: PG */
public final /* synthetic */ class C103918ar implements C80903ar {

    /* renamed from: a */
    public final /* synthetic */ C29690f f289242a;

    public /* synthetic */ C103918ar(C29690f fVar) {
        this.f289242a = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo71257a() {
        String str = this.f289242a.f80411b;
        return C60856cj.m92900i(Boolean.valueOf(str.endsWith("_ja") ? C80624s.m128250c(str.replaceAll("_ja$", BuildConfig.FLAVOR)).isPresent() : false));
    }
}
