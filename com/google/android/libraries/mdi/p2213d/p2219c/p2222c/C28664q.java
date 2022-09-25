package com.google.android.libraries.mdi.p2213d.p2219c.p2222c;

import com.google.common.base.C58887cx;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.d.c.c.q */
/* compiled from: PG */
public final /* synthetic */ class C28664q implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C28671x f77918a;

    public /* synthetic */ C28664q(C28671x xVar) {
        this.f77918a = xVar;
    }

    public final C60870cx apply(Object obj) {
        C28671x xVar = this.f77918a;
        IOException iOException = (IOException) obj;
        if (C58887cx.m90977d(iOException) instanceof FileNotFoundException) {
            return xVar.mo34324i();
        }
        throw iOException;
    }
}
