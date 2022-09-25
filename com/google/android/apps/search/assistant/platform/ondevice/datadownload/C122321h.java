package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C28738bp;
import com.google.android.libraries.mdi.download.C28740br;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.h */
/* compiled from: PG */
public final /* synthetic */ class C122321h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C122165am f339183a;

    /* renamed from: b */
    public final /* synthetic */ Locale f339184b;

    /* renamed from: c */
    public final /* synthetic */ C28740br f339185c;

    public /* synthetic */ C122321h(C122165am amVar, Locale locale, C28740br brVar) {
        this.f339183a = amVar;
        this.f339184b = locale;
        this.f339185c = brVar;
    }

    public final Object apply(Object obj) {
        String str;
        C122165am amVar = this.f339183a;
        Locale locale = this.f339184b;
        C28740br brVar = this.f339185c;
        Exception exc = (Exception) obj;
        C122150a aVar = amVar.f338841f;
        String i = brVar.mo34350i();
        boolean h = brVar.mo34344c().mo56113h();
        C39141kp kpVar = aVar.f338818a;
        String str2 = aVar.f338819b;
        String a = C122150a.m201694a(locale);
        if (exc instanceof C28738bp) {
            str = C28737bo.GROUP_NOT_FOUND_ERROR.equals(((C28738bp) exc).f78134a) ? "ERROR_GROUP_NOT_FOUND" : "ERROR_DOWNLOAD_FAILED";
        } else if (exc instanceof C122171as) {
            str = "ERROR_GROUP_TOO_BIG";
        } else if (exc instanceof C122172at) {
            str = "DOWNLOAD_COMPLETELY_DISABLED";
        } else {
            str = exc instanceof C122173au ? "SPECIFIC_GROUP_DOWNLOAD_BANNED" : "ERROR_OTHER";
        }
        ((C19567d) kpVar.f102805P.mo6453a()).mo24822a(1, str2, a, i, Boolean.valueOf(h), str);
        ((C58970a) ((C58970a) ((C58970a) C122165am.f338836a.mo56226d()).mo56382g(exc)).mo56372aa(34715)).mo56389s("Failed to download group %s", brVar.mo34350i());
        return Optional.empty();
    }
}
