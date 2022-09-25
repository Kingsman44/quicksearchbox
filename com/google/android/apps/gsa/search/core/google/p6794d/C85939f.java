package com.google.android.apps.gsa.search.core.google.p6794d;

import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p6968aa.C89022at;
import com.google.android.apps.gsa.shared.p6968aa.C89033bd;
import com.google.android.apps.gsa.shared.util.C90723ag;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.search.core.google.d.f */
/* compiled from: PG */
public final class C85939f implements C90723ag {

    /* renamed from: d */
    private static final C59071e f232359d = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.d.f");

    /* renamed from: a */
    public final InputStream f232360a;

    /* renamed from: b */
    public final int f232361b;

    /* renamed from: c */
    public final String f232362c;

    /* renamed from: e */
    private final boolean f232363e;

    public C85939f(C89022at atVar, InputStream inputStream, C68214a aVar) {
        atVar.getClass();
        inputStream.getClass();
        this.f232360a = inputStream;
        String a = atVar.mo83000a("Content-Type", (String) null);
        this.f232362c = a;
        boolean equals = "1".equals(atVar.mo83000a("X-Protobuffer-Response-Type", (String) null));
        this.f232363e = equals;
        int a2 = C85938e.m138129a(C89033bd.m144788a(a));
        if (a2 == 2) {
            ((C89911f) aVar.mo27525b()).mo83755a((Throwable) null, 112547344, 29).mo83721a();
            a2 = 2;
        }
        if (a2 == 0) {
            ((C59052c) ((C59052c) f232359d.mo56226d()).mo56372aa(8081)).mo56389s("Defaulting to %s", C85938e.m138130b(3));
            this.f232361b = 3;
        } else if (a2 != 3 || !equals) {
            if (a2 != 3) {
                ((C59052c) ((C59052c) f232359d.mo56226d()).mo56372aa(8079)).mo56354G("Type mismatch. Expected %s, actual %s", C85938e.m138130b(3), C85938e.m138130b(a2));
                if (a2 == 1) {
                    ((C89911f) aVar.mo27525b()).mo83755a((Throwable) null, 14595777, 29).mo83721a();
                } else {
                    ((C89911f) aVar.mo27525b()).mo83755a((Throwable) null, 14989204, 29).mo83721a();
                }
            }
            this.f232361b = a2;
        } else {
            this.f232361b = 6;
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo79589b() {
        return this;
    }
}
