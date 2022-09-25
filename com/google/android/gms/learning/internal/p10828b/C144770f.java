package com.google.android.gms.learning.internal.p10828b;

import android.content.Context;
import com.google.android.apps.gsa.staticplugins.fedass.initialization.C100944a;
import com.google.android.apps.gsa.staticplugins.fedass.initialization.FatBrellaInitializer;
import com.google.android.gms.learning.C144454a;
import com.google.android.gms.learning.C144827n;
import com.google.android.gms.learning.dynamite.C144655s;
import com.google.android.libraries.micore.learning.base.C29711c;
import com.google.android.libraries.search.p3028l.C38569b;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.gms.learning.internal.b.f */
/* compiled from: PG */
final class C144770f implements C144765a {
    public C144770f(Context context) {
        C144655s.m235152a();
        C29711c b = C29711c.m54796b(context);
        try {
            ((C144827n) b.mo34852c(C144827n.class)).mo120055g(806);
            if (b != null) {
                b.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C144769e.m235292a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo120200a(Context context) {
        C100944a a = C144454a.m234716a();
        if (a != null) {
            Context context2 = a.f281993a.getContext();
            if (context2 != null) {
                ((C59052c) ((C59052c) FatBrellaInitializer.f281992a.mo56224b()).mo56372aa(19582)).mo56389s("Loading %s...", "fedora_tensorflow_jni");
                C38569b.m67851a(context2, "fedora_tensorflow_jni");
                ((C59052c) ((C59052c) FatBrellaInitializer.f281992a.mo56224b()).mo56372aa(19583)).mo56389s("Loaded %s", "fedora_tensorflow_jni");
                C29711c b = C29711c.m54796b(context);
                try {
                    ((C144827n) b.mo34852c(C144827n.class)).mo120055g(807);
                    if (b != null) {
                        b.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    C144769e.m235292a(th, th);
                }
            } else {
                throw new UnsatisfiedLinkError("Unable to get context");
            }
        } else {
            throw new C144766b("BrellaInit.setFatSdkConfig(...) must be called in Application#onCreate");
        }
        throw th;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.IInterface mo120201b(java.lang.String r6, com.google.android.gms.learning.internal.p10828b.C144767c r7) {
        /*
            r5 = this;
            com.google.android.apps.gsa.staticplugins.fedass.initialization.a r0 = com.google.android.gms.learning.C144454a.m234716a()
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = "brella.FatDynamiteLdr"
            r1 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r1)
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "Loading: "
            java.lang.String r2 = r2.concat(r6)
            android.util.Log.d(r0, r2)
        L_0x0018:
            int r0 = r6.hashCode()
            r2 = 4
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1192512253: goto L_0x004b;
                case -487058244: goto L_0x0041;
                case 1142080332: goto L_0x0037;
                case 1556299985: goto L_0x002d;
                case 2016770690: goto L_0x0023;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x0055
        L_0x0023:
            java.lang.String r0 = "com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0055
            r0 = 1
            goto L_0x0056
        L_0x002d:
            java.lang.String r0 = "com.google.android.gms.learning.dynamite.training.InAppJobServiceImpl"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0055
            r0 = 0
            goto L_0x0056
        L_0x0037:
            java.lang.String r0 = "com.google.android.gms.learning.dynamite.proxy.InAppExampleStoreProxyImpl"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0055
            r0 = 4
            goto L_0x0056
        L_0x0041:
            java.lang.String r0 = "com.google.android.gms.learning.dynamite.training.InAppTrainerImpl"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0055
            r0 = 2
            goto L_0x0056
        L_0x004b:
            java.lang.String r0 = "com.google.android.gms.learning.dynamite.training.InAppTrainerCancellerImpl"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0055
            r0 = 3
            goto L_0x0056
        L_0x0055:
            r0 = -1
        L_0x0056:
            if (r0 == 0) goto L_0x0084
            if (r0 == r4) goto L_0x007e
            if (r0 == r3) goto L_0x0078
            if (r0 == r1) goto L_0x0072
            if (r0 != r2) goto L_0x0066
            com.google.android.gms.learning.dynamite.proxy.InAppExampleStoreProxyImpl r0 = new com.google.android.gms.learning.dynamite.proxy.InAppExampleStoreProxyImpl
            r0.<init>()
            goto L_0x0089
        L_0x0066:
            com.google.android.gms.learning.internal.b.b r7 = new com.google.android.gms.learning.internal.b.b
            java.lang.String r0 = "no impl found for "
            java.lang.String r6 = r0.concat(r6)
            r7.<init>(r6)
            throw r7
        L_0x0072:
            com.google.android.gms.learning.dynamite.training.InAppTrainerCancellerImpl r0 = new com.google.android.gms.learning.dynamite.training.InAppTrainerCancellerImpl
            r0.<init>()
            goto L_0x0089
        L_0x0078:
            com.google.android.gms.learning.dynamite.training.InAppTrainerImpl r0 = new com.google.android.gms.learning.dynamite.training.InAppTrainerImpl
            r0.<init>()
            goto L_0x0089
        L_0x007e:
            com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl r0 = new com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl
            r0.<init>()
            goto L_0x0089
        L_0x0084:
            com.google.android.gms.learning.dynamite.training.InAppJobServiceImpl r0 = new com.google.android.gms.learning.dynamite.training.InAppJobServiceImpl
            r0.<init>()
        L_0x0089:
            android.os.IInterface r7 = r7.mo120174a(r0)
            if (r7 == 0) goto L_0x0090
            return r7
        L_0x0090:
            com.google.android.gms.learning.internal.b.b r7 = new com.google.android.gms.learning.internal.b.b
            java.lang.String r0 = "null impl for "
            java.lang.String r6 = r0.concat(r6)
            r7.<init>(r6)
            throw r7
        L_0x009c:
            com.google.android.gms.learning.internal.b.b r6 = new com.google.android.gms.learning.internal.b.b
            java.lang.String r7 = "BrellaInit.setFatSdkConfig(...) must be called in Application#onCreate"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.internal.p10828b.C144770f.mo120201b(java.lang.String, com.google.android.gms.learning.internal.b.c):android.os.IInterface");
    }
}
