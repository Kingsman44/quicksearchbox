package com.google.p3728as.p3737c.p3738a;

import android.content.Context;
import android.media.soundtrigger.SoundTriggerManager;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.as.c.a.a */
/* compiled from: PG */
public final class C48034a {

    /* renamed from: a */
    private static final C59071e f124320a = C59071e.m91332i("com.google.as.c.a.a");

    /* renamed from: b */
    private final SoundTriggerManager f124321b;

    /* renamed from: c */
    private C48037d f124322c;

    public C48034a(Context context) {
        this.f124321b = (SoundTriggerManager) context.getSystemService(SoundTriggerManager.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p3728as.p3737c.p3738a.C48037d mo53132a() {
        /*
            r5 = this;
            r0 = 0
            boolean r1 = androidx.core.p094f.C1888a.m5148b()     // Catch:{ NullPointerException -> 0x0025 }
            if (r1 == 0) goto L_0x000e
            android.media.soundtrigger.SoundTriggerManager r1 = r5.f124321b     // Catch:{ NullPointerException -> 0x0025 }
            android.hardware.soundtrigger.SoundTrigger$ModuleProperties r1 = r1.getModuleProperties()     // Catch:{ NullPointerException -> 0x0025 }
            goto L_0x0035
        L_0x000e:
            com.google.common.f.e r1 = f124320a     // Catch:{ NullPointerException -> 0x0025 }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ NullPointerException -> 0x0025 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ NullPointerException -> 0x0025 }
            r2 = 54894(0xd66e, float:7.6923E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ NullPointerException -> 0x0025 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ NullPointerException -> 0x0025 }
            java.lang.String r2 = "getModuleProperties: SDK does not support retrieving properties"
            r1.mo56386p(r2)     // Catch:{ NullPointerException -> 0x0025 }
            goto L_0x0034
        L_0x0025:
            r1 = move-exception
            com.google.common.f.e r2 = f124320a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "caught expected NullPointerException when device SoundTrigger.ModuleProperties is null"
            r4 = 54896(0xd670, float:7.6926E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r4)).mo56386p(r3)
        L_0x0034:
            r1 = r0
        L_0x0035:
            if (r1 != 0) goto L_0x0046
            com.google.common.f.e r1 = f124320a
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "getModuleProperties: device does not support SoundTrigger recognition"
            r3 = 54895(0xd66f, float:7.6924E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            return r0
        L_0x0046:
            com.google.as.c.a.d r0 = new com.google.as.c.a.d
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p3728as.p3737c.p3738a.C48034a.mo53132a():com.google.as.c.a.d");
    }

    /* renamed from: b */
    public final synchronized C48037d mo53133b() {
        C48037d dVar = this.f124322c;
        if (dVar != null) {
            return dVar;
        }
        C48037d a = mo53132a();
        this.f124322c = a;
        return a;
    }
}
