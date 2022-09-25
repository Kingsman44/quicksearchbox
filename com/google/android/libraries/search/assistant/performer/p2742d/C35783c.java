package com.google.android.libraries.search.assistant.performer.p2742d;

import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.android.libraries.search.p2476a.p2483e.C32221c;
import com.google.assistant.p3897e.p3921j.C51773cz;
import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52390pz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.assistant.performer.d.c */
/* compiled from: PG */
public final class C35783c implements C35472h {

    /* renamed from: a */
    public static final C51785da f93740a;

    /* renamed from: b */
    public static final C59071e f93741b = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.d.c");

    /* renamed from: c */
    public final C32221c f93742c;

    static {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "credential.UPDATE";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 2;
        f93740a = (C51785da) czVar.build();
    }

    public C35783c(C32221c cVar) {
        this.f93742c = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        if ("credential.UPDATE".equals(dyVar.f135936b)) {
            return C36183e.m64583a(dyVar, "credential_args", C52390pz.f137470c.getParserForType(), new C35781a(this));
        }
        ((C59052c) ((C59052c) f93741b.mo56226d()).mo56372aa(52072)).mo56386p("Invalid credential.UPDATE client op");
        return C60856cj.m92900i(C36180b.f94545b);
    }
}
