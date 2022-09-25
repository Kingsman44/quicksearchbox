package com.google.android.libraries.lens.view.weblrp;

import com.google.android.libraries.web.contrib.p3372e.C43503a;
import com.google.android.libraries.web.p3353c.C43358c;
import com.google.android.libraries.web.p3353c.C43362g;
import com.google.android.libraries.web.p3353c.C43363h;
import java.io.IOException;

/* renamed from: com.google.android.libraries.lens.view.weblrp.g */
/* compiled from: PG */
public final /* synthetic */ class C28192g implements C43503a {

    /* renamed from: a */
    public static final /* synthetic */ C28192g f76724a = new C28192g();

    private /* synthetic */ C28192g() {
    }

    /* renamed from: a */
    public final C43363h mo33710a(IOException iOException) {
        String str;
        C43358c cVar = (C43358c) C43363h.f113275f.createBuilder();
        C43362g gVar = C43362g.UNSPECIFIED;
        cVar.copyOnWrite();
        C43363h hVar = (C43363h) cVar.instance;
        hVar.f113278b = gVar.f113274h;
        hVar.f113277a |= 1;
        if (iOException.getCause() == null) {
            str = "null";
        } else {
            str = iOException.getCause().getClass().getName();
        }
        cVar.copyOnWrite();
        C43363h hVar2 = (C43363h) cVar.instance;
        hVar2.f113277a |= 2;
        hVar2.f113279c = "Exception caused by ".concat(String.valueOf(str));
        return (C43363h) cVar.build();
    }
}
