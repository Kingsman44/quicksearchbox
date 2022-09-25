package com.google.android.apps.gsa.shared.speech.dumper;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.common.base.C58817ah;
import com.google.common.p4552o.C60673yp;
import com.google.common.p4552o.C60675yr;
import com.google.common.p4552o.C60681yx;

/* renamed from: com.google.android.apps.gsa.shared.speech.dumper.o */
/* compiled from: PG */
public final /* synthetic */ class C90562o implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C60681yx f253161a;

    public /* synthetic */ C90562o(C60681yx yxVar) {
        this.f253161a = yxVar;
    }

    public final Object apply(Object obj) {
        C60681yx yxVar = this.f253161a;
        C60673yp ypVar = (C60673yp) ((C60675yr) obj).toBuilder();
        ypVar.copyOnWrite();
        C60675yr yrVar = (C60675yr) ypVar.instance;
        yxVar.getClass();
        yrVar.f164615s = yxVar;
        yrVar.f164597a |= C89885b.S3REQUEST_VALUE;
        return (C60675yr) ypVar.build();
    }
}
