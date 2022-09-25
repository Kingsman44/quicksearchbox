package com.google.android.libraries.assistant.auto.tng.p1112p.p1113a.p1114a.p1115a;

import com.evernote.android.state.BuildConfig;
import com.google.protos.p4934ay.p4938c.C64278b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.p.a.a.a.w */
/* compiled from: PG */
public final class C15528w extends Exception {

    /* renamed from: a */
    private final C64278b f46505a;

    public C15528w(C64278b bVar) {
        this.f46505a = bVar;
    }

    public final String getMessage() {
        String str;
        String str2;
        C64278b bVar = this.f46505a;
        int i = bVar.f173803a & 2;
        String str3 = BuildConfig.FLAVOR;
        if (i != 0) {
            str = "Error code: " + bVar.f173804b + ". ";
        } else {
            str = str3;
        }
        C64278b bVar2 = this.f46505a;
        if ((bVar2.f173803a & 4) != 0) {
            str2 = "Error message: " + bVar2.f173805c + ". ";
        } else {
            str2 = str3;
        }
        C64278b bVar3 = this.f46505a;
        if ((bVar3.f173803a & 8) != 0) {
            C64278b bVar4 = bVar3.f173806d;
            if (bVar4 == null) {
                bVar4 = C64278b.f173801e;
            }
            str3 = "Sub Res: " + new C15528w(bVar4).getMessage() + ".";
        }
        return "S3 Response DONE_ERROR. " + str + str2 + str3;
    }
}
