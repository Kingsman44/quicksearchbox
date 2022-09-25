package com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1411a.p1412a;

import com.evernote.android.state.BuildConfig;
import com.google.protos.p4934ay.p4938c.C64278b;

/* renamed from: com.google.android.libraries.assistant.c.g.g.a.a.a.r */
/* compiled from: PG */
public final class C17400r extends Exception {

    /* renamed from: a */
    private final C64278b f50294a;

    public C17400r(C64278b bVar) {
        this.f50294a = bVar;
    }

    public final String getMessage() {
        String str;
        String str2;
        C64278b bVar = this.f50294a;
        int i = bVar.f173803a & 2;
        String str3 = BuildConfig.FLAVOR;
        if (i != 0) {
            str = "Error code: " + bVar.f173804b + ". ";
        } else {
            str = str3;
        }
        C64278b bVar2 = this.f50294a;
        if ((bVar2.f173803a & 4) != 0) {
            str2 = "Error message: " + bVar2.f173805c + ". ";
        } else {
            str2 = str3;
        }
        C64278b bVar3 = this.f50294a;
        if ((bVar3.f173803a & 8) != 0) {
            C64278b bVar4 = bVar3.f173806d;
            if (bVar4 == null) {
                bVar4 = C64278b.f173801e;
            }
            str3 = "Sub Res: " + new C17400r(bVar4).getMessage() + ".";
        }
        return "S3 Response DONE_ERROR. " + str + str2 + str3;
    }
}
