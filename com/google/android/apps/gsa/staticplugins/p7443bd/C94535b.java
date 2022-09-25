package com.google.android.apps.gsa.staticplugins.p7443bd;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.bd.b */
/* compiled from: PG */
final class C94535b implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C94541h f264421a;

    public C94535b(C94541h hVar) {
        this.f264421a = hVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Exception exc = (Exception) obj;
        ((C89911f) this.f264421a.f264429b.mo27525b()).mo83756b(new C90452a(211, C89885b.GWS_HALLMONITOR_RESPONSE_TIMEOUT_VALUE)).mo83721a();
        return BuildConfig.FLAVOR;
    }
}
