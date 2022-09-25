package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8744l;

import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.l.d */
/* compiled from: PG */
final class C116984d extends C90880an {

    /* renamed from: a */
    final /* synthetic */ C41642a f324763a;

    /* renamed from: b */
    final /* synthetic */ C116985e f324764b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116984d(C116985e eVar, C41642a aVar) {
        super("sb.r.PixelSugSrc", "fetchingLauncherAppsSuggestions", 0);
        this.f324764b = eVar;
        this.f324763a = aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r12 = com.google.common.p4526f.p4527a.C58975e.f156826a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00bc */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c1 A[Catch:{ Exception -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0149 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r15 = this;
            java.lang.String r0 = "suggest_icon_1"
            com.google.android.apps.gsa.staticplugins.searchboxroot.features.l.e r1 = r15.f324764b
            com.google.android.libraries.searchbox.shared.b.a r2 = r15.f324763a
            com.google.android.apps.gsa.searchbox.c.t r2 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r2
            com.google.android.apps.gsa.shared.search.Query r2 = r2.f239556a
            java.lang.String r2 = r2.mo84352bk()
            com.google.android.apps.gsa.staticplugins.searchboxroot.g r3 = r1.f324766b
            com.google.android.apps.gsa.search.shared.service.b.rr r3 = r3.mo103106b()
            com.google.android.apps.gsa.staticplugins.searchboxroot.g r4 = r1.f324766b
            android.os.Bundle r4 = r4.mo103105a()
            r3.getClass()
            r4.getClass()
            java.lang.String r3 = "content://com.google.android.apps.nexuslauncher.appssearch/"
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.net.Uri$Builder r3 = r3.buildUpon()
            android.net.Uri$Builder r2 = r3.appendPath(r2)
            android.net.Uri r4 = r2.build()
            r2 = 0
            android.content.ContentResolver r3 = r1.f324767c     // Catch:{ Exception -> 0x0117, all -> 0x0115 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0117, all -> 0x0115 }
            if (r3 != 0) goto L_0x0045
            com.google.common.p4541l.C59317ae.m92163a(r2)
        L_0x0042:
            r5 = r2
            goto L_0x013b
        L_0x0045:
            int r4 = r3.getCount()     // Catch:{ Exception -> 0x0112 }
            if (r4 != 0) goto L_0x004f
            com.google.common.p4541l.C59317ae.m92163a(r3)
            goto L_0x0042
        L_0x004f:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0112 }
            r5.<init>()     // Catch:{ Exception -> 0x0112 }
            r6 = 0
            r7 = 0
        L_0x0056:
            if (r7 >= r4) goto L_0x010e
            r3.moveToPosition(r7)     // Catch:{ Exception -> 0x010c }
            java.lang.String r8 = "suggest_text_1"
            int r8 = r3.getColumnIndex(r8)     // Catch:{ Exception -> 0x010c }
            int r9 = r3.getColumnIndex(r0)     // Catch:{ Exception -> 0x010c }
            java.lang.String r10 = "suggest_intent_data"
            int r10 = r3.getColumnIndex(r10)     // Catch:{ Exception -> 0x010c }
            java.lang.String r11 = "suggest_intent_action"
            int r11 = r3.getColumnIndex(r11)     // Catch:{ Exception -> 0x010c }
            java.lang.String r9 = r3.getString(r9)     // Catch:{ Exception -> 0x010c }
            java.lang.String r10 = r3.getString(r10)     // Catch:{ Exception -> 0x010c }
            java.lang.String r11 = r3.getString(r11)     // Catch:{ Exception -> 0x010c }
            android.content.Intent r12 = new android.content.Intent     // Catch:{ Exception -> 0x010c }
            r12.<init>(r11)     // Catch:{ Exception -> 0x010c }
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch:{ Exception -> 0x010c }
            android.content.Intent r10 = r12.setData(r10)     // Catch:{ Exception -> 0x010c }
            android.net.Uri r11 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x010c }
            java.util.HashMap r12 = r1.f324768d     // Catch:{ Exception -> 0x010c }
            boolean r12 = r12.containsKey(r9)     // Catch:{ Exception -> 0x010c }
            if (r12 == 0) goto L_0x009f
            java.util.HashMap r12 = r1.f324768d     // Catch:{ Exception -> 0x010c }
            java.lang.Object r12 = r12.get(r9)     // Catch:{ Exception -> 0x010c }
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12     // Catch:{ Exception -> 0x010c }
            goto L_0x00f1
        L_0x009f:
            android.content.ContentResolver r12 = r1.f324767c     // Catch:{ Exception -> 0x00bc }
            java.lang.String r13 = "loadIcon"
            java.lang.String r14 = r11.toString()     // Catch:{ Exception -> 0x00bc }
            android.os.Bundle r12 = r12.call(r11, r13, r14, r2)     // Catch:{ Exception -> 0x00bc }
            if (r12 == 0) goto L_0x00be
            android.os.Parcelable r13 = r12.getParcelable(r0)     // Catch:{ Exception -> 0x00bc }
            boolean r13 = r13 instanceof android.graphics.Bitmap     // Catch:{ Exception -> 0x00bc }
            if (r13 == 0) goto L_0x00be
            android.os.Parcelable r12 = r12.getParcelable(r0)     // Catch:{ Exception -> 0x00bc }
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12     // Catch:{ Exception -> 0x00bc }
            goto L_0x00bf
        L_0x00bc:
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x010c }
        L_0x00be:
            r12 = r2
        L_0x00bf:
            if (r12 != 0) goto L_0x00d5
            android.content.ContentResolver r12 = r1.f324767c     // Catch:{ Exception -> 0x010c }
            java.lang.String r13 = "r"
            android.os.ParcelFileDescriptor r12 = r12.openFileDescriptor(r11, r13)     // Catch:{ Exception -> 0x010c }
            java.io.FileDescriptor r13 = r12.getFileDescriptor()     // Catch:{ Exception -> 0x010c }
            android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeFileDescriptor(r13)     // Catch:{ Exception -> 0x010c }
            r12.close()     // Catch:{ Exception -> 0x010c }
            r12 = r13
        L_0x00d5:
            int r13 = r12.getByteCount()     // Catch:{ Exception -> 0x010c }
            java.nio.ByteBuffer r13 = java.nio.ByteBuffer.allocate(r13)     // Catch:{ Exception -> 0x010c }
            r12.copyPixelsToBuffer(r13)     // Catch:{ Exception -> 0x010c }
            r13.rewind()     // Catch:{ Exception -> 0x010c }
            java.util.HashMap r14 = r1.f324769e     // Catch:{ Exception -> 0x010c }
            com.google.protobuf.z r13 = com.google.protobuf.C63088z.m96153z(r13)     // Catch:{ Exception -> 0x010c }
            r14.put(r9, r13)     // Catch:{ Exception -> 0x010c }
            java.util.HashMap r13 = r1.f324768d     // Catch:{ Exception -> 0x010c }
            r13.put(r9, r12)     // Catch:{ Exception -> 0x010c }
        L_0x00f1:
            java.lang.String r8 = r3.getString(r8)     // Catch:{ Exception -> 0x010c }
            java.util.HashMap r13 = r1.f324769e     // Catch:{ Exception -> 0x010c }
            java.lang.Object r9 = r13.get(r9)     // Catch:{ Exception -> 0x010c }
            com.google.protobuf.z r9 = (com.google.protobuf.C63088z) r9     // Catch:{ Exception -> 0x010c }
            java.lang.String r10 = r10.toUri(r6)     // Catch:{ Exception -> 0x010c }
            com.google.android.libraries.searchbox.root.RootSuggestion r8 = com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8744l.C116985e.m194404a(r8, r12, r9, r11, r10)     // Catch:{ Exception -> 0x010c }
            r5.add(r8)     // Catch:{ Exception -> 0x010c }
            int r7 = r7 + 1
            goto L_0x0056
        L_0x010c:
            r0 = move-exception
            goto L_0x011a
        L_0x010e:
            com.google.common.p4541l.C59317ae.m92163a(r3)
            goto L_0x013b
        L_0x0112:
            r0 = move-exception
            r5 = r2
            goto L_0x011a
        L_0x0115:
            r0 = move-exception
            goto L_0x014c
        L_0x0117:
            r0 = move-exception
            r3 = r2
            r5 = r3
        L_0x011a:
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8744l.C116985e.f324765a     // Catch:{ all -> 0x014a }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x014a }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x014a }
            java.lang.String r6 = "sb.r.PixelSugSrc"
            r1.mo56378ag(r4, r6)     // Catch:{ all -> 0x014a }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x014a }
            r4 = 32546(0x7f22, float:4.5607E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r4)     // Catch:{ all -> 0x014a }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x014a }
            java.lang.String r4 = "Error creating prefix suggestions %s"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x014a }
            r1.mo56389s(r4, r0)     // Catch:{ all -> 0x014a }
            goto L_0x010e
        L_0x013b:
            if (r5 == 0) goto L_0x0149
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0149
            com.google.android.libraries.searchbox.root.a r0 = new com.google.android.libraries.searchbox.root.a
            r0.<init>(r5)
            return r0
        L_0x0149:
            return r2
        L_0x014a:
            r0 = move-exception
            r2 = r3
        L_0x014c:
            com.google.common.p4541l.C59317ae.m92163a(r2)
            goto L_0x0151
        L_0x0150:
            throw r0
        L_0x0151:
            goto L_0x0150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8744l.C116984d.call():java.lang.Object");
    }
}
