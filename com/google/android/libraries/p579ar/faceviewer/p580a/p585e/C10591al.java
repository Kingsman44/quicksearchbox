package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import androidx.core.p094f.C1894g;
import androidx.core.p094f.C1897j;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p363ad.p364a.C6668a;
import com.google.p363ad.p364a.C6681e;
import com.google.p363ad.p364a.C6682f;
import java.io.File;
import java.util.Locale;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.al */
/* compiled from: PG */
public final /* synthetic */ class C10591al implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C10600au f35419a;

    public /* synthetic */ C10591al(C10600au auVar) {
        this.f35419a = auVar;
    }

    public final C60870cx apply(Object obj) {
        C10600au auVar = this.f35419a;
        Boolean bool = (Boolean) obj;
        File file = new File(auVar.f35435e.getCacheDir(), "faceviewer");
        file.mkdir();
        String absolutePath = file.getAbsolutePath();
        Locale locale = C1897j.m5167d(C1894g.m5157a(auVar.f35435e.getResources().getConfiguration())).f5774b.f5775a.get(0);
        C10619t tVar = auVar.f35442l;
        C6668a aVar = (C6668a) C6682f.f19956c.createBuilder();
        C6681e eVar = C6681e.f19954a;
        aVar.copyOnWrite();
        C6682f fVar = (C6682f) aVar.instance;
        eVar.getClass();
        fVar.f19959b = eVar;
        fVar.f19958a = 1;
        return C2169h.m6027a(new C10625z(tVar, absolutePath, (C6682f) aVar.build(), locale));
    }
}
