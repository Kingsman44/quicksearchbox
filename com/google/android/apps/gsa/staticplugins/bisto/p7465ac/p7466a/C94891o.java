package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import android.content.BroadcastReceiver;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.o */
/* compiled from: PG */
final class C94891o extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C94892p f265415a;

    public C94891o(C94892p pVar) {
        this.f265415a = pVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.google.android.apps.gsa.binaries.satin.app.fz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.google.android.apps.gsa.binaries.satin.app.fz} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r7, android.content.Intent r8) {
        /*
            r6 = this;
            if (r8 != 0) goto L_0x0005
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return
        L_0x0005:
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.getAction()
            java.lang.String r7 = "com.google.android.apps.gsa.bisto.GACS_DEVICE_COMMAND"
            java.lang.String r0 = r8.getAction()
            boolean r7 = r7.equals(r0)
            java.lang.String r0 = "BistoBleConnManager"
            if (r7 == 0) goto L_0x00fe
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.p r7 = r6.f265415a
            java.lang.String r1 = "extra_device_id"
            java.lang.String r1 = r8.getStringExtra(r1)
            java.lang.String r2 = "command"
            r3 = -1
            int r2 = r8.getIntExtra(r2, r3)
            java.lang.String r3 = "text"
            java.lang.String r8 = r8.getStringExtra(r3)
            com.google.assistant.a.a.y r3 = com.google.assistant.p3739a.p3740a.C48128y.m85188a(r2)
            if (r3 != 0) goto L_0x0046
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94892p.f265416a
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r8, r0)
            java.lang.String r8 = "Unknown command: %d"
            r0 = 17347(0x43c3, float:2.4308E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r0)).mo56387q(r8, r2)
            return
        L_0x0046:
            android.content.Context r2 = r7.f265417b
            boolean r2 = com.google.android.apps.gsa.shared.util.permissions.C91076c.m148792a(r2)
            r4 = 0
            if (r2 != 0) goto L_0x0051
            goto L_0x00db
        L_0x0051:
            if (r1 == 0) goto L_0x0095
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r2 = r1.toUpperCase(r2)
            boolean r5 = android.bluetooth.BluetoothAdapter.checkBluetoothAddress(r2)
            if (r5 != 0) goto L_0x0072
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94892p.f265416a
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r2, r0)
            java.lang.String r2 = "Bad device ID: %s"
            r5 = 17335(0x43b7, float:2.4292E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r5)).mo56389s(r2, r1)
            goto L_0x00db
        L_0x0072:
            android.bluetooth.BluetoothAdapter r1 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            if (r1 != 0) goto L_0x008b
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94892p.f265416a
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r1, r0)
            java.lang.String r1 = "No adapter"
            r2 = 17334(0x43b6, float:2.429E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r2)).mo56386p(r1)
            goto L_0x00db
        L_0x008b:
            java.util.Map r7 = r7.f265422g
            java.lang.Object r7 = r7.get(r2)
            r4 = r7
            com.google.android.apps.gsa.binaries.satin.app.fz r4 = (com.google.android.apps.gsa.binaries.satin.app.fz) r4
            goto L_0x00db
        L_0x0095:
            java.util.Map r1 = r7.f265422g
            int r1 = r1.size()
            r2 = 1
            if (r1 == r2) goto L_0x00b1
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94892p.f265416a
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r1, r0)
            java.lang.String r1 = "Not 1 connected device"
            r2 = 17333(0x43b5, float:2.4289E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r2)).mo56386p(r1)
            goto L_0x00db
        L_0x00b1:
            java.util.Map r7 = r7.f265422g
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
            boolean r1 = r7.hasNext()
            if (r1 != 0) goto L_0x00d4
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94892p.f265416a
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r1, r0)
            java.lang.String r1 = "No device"
            r2 = 17332(0x43b4, float:2.4287E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r2)).mo56386p(r1)
            goto L_0x00db
        L_0x00d4:
            java.lang.Object r7 = r7.next()
            r4 = r7
            com.google.android.apps.gsa.binaries.satin.app.fz r4 = (com.google.android.apps.gsa.binaries.satin.app.fz) r4
        L_0x00db:
            if (r4 != 0) goto L_0x00de
            goto L_0x00fd
        L_0x00de:
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.as r7 = r4.b()
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.e r7 = r7.mo88655a()
            if (r7 == 0) goto L_0x00fd
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94892p.f265416a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r0)
            java.lang.String r0 = "Sending command %s"
            r2 = 17346(0x43c2, float:2.4307E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56389s(r0, r3)
            r7.mo88806h(r3, r8)
        L_0x00fd:
            return
        L_0x00fe:
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94892p.f265416a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r8, r0)
            java.lang.String r8 = "Unknown action"
            r0 = 17330(0x43b2, float:2.4285E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r0)).mo56386p(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94891o.onReceive(android.content.Context, android.content.Intent):void");
    }
}
