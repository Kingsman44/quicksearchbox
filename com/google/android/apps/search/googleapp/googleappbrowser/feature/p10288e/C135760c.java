package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.e.c */
/* compiled from: PG */
public final /* synthetic */ class C135760c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C135766i f369786a;

    public /* synthetic */ C135760c(C135766i iVar) {
        this.f369786a = iVar;
    }

    public final Object apply(Object obj) {
        C135766i iVar = this.f369786a;
        C59052c cVar = (C59052c) C135766i.f369797a.mo56226d();
        cVar.mo56378ag(C38505d.f101863a, Integer.valueOf(C89885b.GOOGLE_APP_BROWSER_GOOGLE_ON_CONTENT_XUIKIT_LOAD_FAILED_VALUE));
        ((C59052c) ((C59052c) cVar.mo56382g((Exception) obj)).mo56372aa(40612)).mo56386p("Error while loading XUiKit library.");
        return C46688af.m83205b(Optional.empty(), iVar.f369799c.mo26871c());
    }
}
