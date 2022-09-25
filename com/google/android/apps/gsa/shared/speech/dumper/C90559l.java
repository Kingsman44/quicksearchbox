package com.google.android.apps.gsa.shared.speech.dumper;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.common.base.C58817ah;
import com.google.common.p4552o.C60673yp;
import com.google.common.p4552o.C60675yr;
import com.google.common.p4552o.C60677yt;

/* renamed from: com.google.android.apps.gsa.shared.speech.dumper.l */
/* compiled from: PG */
public final /* synthetic */ class C90559l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C60677yt f253158a;

    public /* synthetic */ C90559l(C60677yt ytVar) {
        this.f253158a = ytVar;
    }

    public final Object apply(Object obj) {
        C60677yt ytVar = this.f253158a;
        C60673yp ypVar = (C60673yp) ((C60675yr) obj).toBuilder();
        ypVar.copyOnWrite();
        C60675yr yrVar = (C60675yr) ypVar.instance;
        ytVar.getClass();
        yrVar.f164616t = ytVar;
        yrVar.f164597a |= C89885b.HTTP_VALUE;
        return (C60675yr) ypVar.build();
    }
}
