package com.google.android.libraries.search.assistant.p2780q.p2781a;

import android.os.Build;
import com.google.protobuf.C62971cq;
import com.google.protos.p4985f.p4988b.p4992c.C64754b;
import com.google.protos.p5124m.p5125a.C65603f;

/* renamed from: com.google.android.libraries.search.assistant.q.a.a */
/* compiled from: PG */
public final class C36373a {

    /* renamed from: a */
    public C64754b f94985a = C64754b.POCKET_DISABLED_DEVICE_MODEL;

    public C36373a(boolean z, boolean z2, C65603f fVar) {
        if (z) {
            this.f94985a = C64754b.POCKET_ENABLED;
        } else if (!z2) {
            C62971cq<String> cqVar = fVar.f178307a;
            String str = Build.MODEL;
            for (String str2 : cqVar) {
                if (str2.equals(str) || (str2.endsWith("*") && str.startsWith(str2.substring(0, str2.length() - 1)))) {
                    this.f94985a = C64754b.POCKET_ENABLED;
                    return;
                }
            }
        } else {
            this.f94985a = C64754b.POCKET_DISABLED_DEVICE_MODEL;
        }
    }
}
