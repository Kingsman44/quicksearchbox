package com.google.android.apps.gsa.staticplugins.smartspace;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.smartspace.C92033ac;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.assistant.p3886c.C50785ci;
import com.google.assistant.p3886c.C50792cp;
import com.google.assistant.p3886c.C50819dp;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.q */
/* compiled from: PG */
public final class C117436q implements C92033ac {

    /* renamed from: a */
    public static final C59071e f325966a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.smartspace.q");

    /* renamed from: b */
    private final Context f325967b;

    /* renamed from: c */
    private final C86127w f325968c;

    /* renamed from: d */
    private final C117382e f325969d;

    /* renamed from: e */
    private final C86124t f325970e;

    /* renamed from: f */
    private final C91189au f325971f;

    public C117436q(Context context, C86127w wVar, C86124t tVar, C117382e eVar, C91189au auVar) {
        this.f325967b = context;
        this.f325968c = wVar;
        this.f325970e = tVar;
        this.f325969d = eVar;
        this.f325971f = auVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        throw r7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00e5 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Bundle m195181d(java.lang.String r7, com.google.common.base.C58833ax r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = "SmartspaceUpdateOEMInte"
            java.lang.String r1 = "CHIP_"
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            boolean r3 = r8.mo56113h()
            if (r3 == 0) goto L_0x0110
            java.lang.Object r3 = r8.mo56107c()
            com.google.android.apps.gsa.opa.smartspace.r r3 = (com.google.android.apps.gsa.opa.smartspace.C83802r) r3
            com.google.common.base.ax r3 = r3.mo77094d()
            boolean r3 = r3.mo56113h()
            if (r3 != 0) goto L_0x0021
            goto L_0x0110
        L_0x0021:
            java.lang.Object r3 = r8.mo56107c()
            com.google.android.apps.gsa.opa.smartspace.r r3 = (com.google.android.apps.gsa.opa.smartspace.C83802r) r3
            com.google.common.base.ax r3 = r3.mo77094d()
            java.lang.Object r3 = r3.mo56107c()
            com.google.assistant.c.bc r3 = (com.google.assistant.p3886c.C50738bc) r3
            java.lang.String r3 = r3.f132037d
            java.lang.String r4 = "com.google.android.apps.nexuslauncher.extra.SMARTSPACE_CHIP_TITLE_EXTRA"
            r2.putString(r4, r3)
            java.lang.Object r3 = r8.mo56107c()
            com.google.android.apps.gsa.opa.smartspace.r r3 = (com.google.android.apps.gsa.opa.smartspace.C83802r) r3
            com.google.common.base.ax r3 = r3.mo77093c()
            boolean r4 = r3.mo56113h()
            if (r4 == 0) goto L_0x0053
            java.lang.Object r3 = r3.mo56107c()
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            java.lang.String r4 = "com.google.android.apps.nexuslauncher.extra.SMARTSPACE_CHIP_PENDING_INTENT_EXTRA"
            r2.putParcelable(r4, r3)
        L_0x0053:
            java.lang.Object r8 = r8.mo56107c()
            com.google.android.apps.gsa.opa.smartspace.r r8 = (com.google.android.apps.gsa.opa.smartspace.C83802r) r8
            android.graphics.Bitmap r8 = r8.mo77091a()
            if (r8 == 0) goto L_0x010f
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            r3.<init>()     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            r5 = 100
            r8.compress(r4, r5, r3)     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            byte[] r8 = r3.toByteArray()     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            android.content.Context r4 = r6.f325967b     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            java.io.File r4 = r4.getFilesDir()     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            java.lang.String r5 = "smartspace"
            r3.<init>(r4, r5)     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            boolean r4 = r3.exists()     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            if (r4 != 0) goto L_0x0087
            r3.mkdir()     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
        L_0x0087:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            r4.<init>(r1)     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            r4.append(r9)     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            java.lang.String r9 = "_ICON.PNG"
            r4.append(r9)     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            java.lang.String r9 = r4.toString()     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            r1.<init>(r3, r9)     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            r9.<init>(r1)     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            r3.<init>(r9)     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            r9 = 1
            r3.write(r8)     // Catch:{ all -> 0x00c9 }
            r3.close()     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            android.content.Context r8 = r6.f325967b     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.smartspace.smartspacefileprovider"
            androidx.core.content.j r8 = androidx.core.content.FileProvider.m5057a(r8, r3)     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            android.net.Uri r8 = r8.mo5044a(r1)     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            java.lang.String r1 = "com.google.android.apps.nexuslauncher.extra.SMARTSPACE_CHIP_ICON_URI_EXTRA"
            java.lang.String r3 = r8.toString()     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            r2.putString(r1, r3)     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            android.content.Context r1 = r6.f325967b     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            r1.grantUriPermission(r7, r8, r9)     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
            goto L_0x010f
        L_0x00c9:
            r7 = move-exception
            r3.close()     // Catch:{ all -> 0x00ce }
            goto L_0x00e5
        L_0x00ce:
            r8 = move-exception
            java.lang.Class[] r1 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x00e5 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r4 = 0
            r1[r4] = r3     // Catch:{ Exception -> 0x00e5 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r1 = r3.getDeclaredMethod(r5, r1)     // Catch:{ Exception -> 0x00e5 }
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00e5 }
            r9[r4] = r8     // Catch:{ Exception -> 0x00e5 }
            r1.invoke(r7, r9)     // Catch:{ Exception -> 0x00e5 }
        L_0x00e5:
            throw r7     // Catch:{ IOException -> 0x00fb, IllegalArgumentException -> 0x00e6 }
        L_0x00e6:
            r7 = move-exception
            com.google.common.f.e r8 = f325966a
            com.google.common.f.x r8 = r8.mo56225c()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r9, r0)
            java.lang.String r9 = "Could not retrieve iconUri"
            r0 = 33002(0x80ea, float:4.6246E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56382g(r7)).mo56372aa(r0)).mo56386p(r9)
            goto L_0x010f
        L_0x00fb:
            r7 = move-exception
            com.google.common.f.e r8 = f325966a
            com.google.common.f.x r8 = r8.mo56225c()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r9, r0)
            java.lang.String r9 = "Could not save bitmap into file"
            r0 = 33001(0x80e9, float:4.6244E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56382g(r7)).mo56372aa(r0)).mo56386p(r9)
        L_0x010f:
            return r2
        L_0x0110:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.smartspace.C117436q.m195181d(java.lang.String, com.google.common.base.ax, int):android.os.Bundle");
    }

    /* renamed from: e */
    private final void m195182e(C92113i iVar, String str, C58833ax axVar) {
        if (iVar != null || axVar.mo56113h()) {
            Intent intent = new Intent();
            intent.setPackage(str);
            intent.setAction("com.google.android.apps.nexuslauncher.UPDATE_SMARTSPACE");
            intent.addFlags(268435456);
            C58833ax k = axVar.mo56113h() ? C58833ax.m90834k((C83802r) ((List) axVar.mo56107c()).get(0)) : C58836b.f156633a;
            C58833ax k2 = (!axVar.mo56113h() || ((List) axVar.mo56107c()).size() <= 1) ? C58836b.f156633a : C58833ax.m90834k((C83802r) ((List) axVar.mo56107c()).get(1));
            Bundle d = m195181d(str, k, 0);
            if (d != null) {
                intent.putExtra("com.google.android.apps.nexuslauncher.extra.FIRST_SMARTSPACE_CHIP", d);
            }
            Bundle d2 = m195181d(str, k2, 1);
            if (d2 != null) {
                intent.putExtra("com.google.android.apps.nexuslauncher.extra.SECOND_SMARTSPACE_CHIP", d2);
            }
            if (iVar != null) {
                C50785ci ciVar = (C50785ci) C50819dp.f132330b.createBuilder();
                ciVar.mo53458c(iVar.f256820a);
                intent.putExtra("com.google.android.apps.nexuslauncher.extra.SMARTSPACE_CARD", ((C50819dp) ciVar.build()).toByteArray());
                Bitmap bitmap = iVar.f256821b;
                if (bitmap != null) {
                    intent.putExtra("com.google.android.apps.nexuslauncher.extra.SMARTSPACE_ICON", bitmap);
                } else {
                    C50792cp a = C50792cp.m85936a(iVar.f256820a.f132306c);
                    if (a == null) {
                        a = C50792cp.PRIORITY_UNDEFINED;
                    }
                    if (a == C50792cp.SECONDARY && (iVar.f256820a.f132304a & 512) != 0) {
                        C58976aa aaVar = C58975e.f156826a;
                        C50729n nVar = iVar.f256820a.f132314k;
                        if (nVar == null) {
                            nVar = C50729n.f132007g;
                        }
                        if (!nVar.f132011c.isEmpty()) {
                            C91189au auVar = this.f325971f;
                            auVar.mo85428r(auVar.mo85418e(Uri.parse(nVar.f132011c), 7), "SmartspaceUpdateOEMInte", new C117435p(this, intent));
                            return;
                        }
                    }
                }
            }
            C58976aa aaVar2 = C58975e.f156826a;
            mo103299c(intent);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
        if (r2.mo103287a(r5, 4) != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ee, code lost:
        if (r2.mo103287a(r5, 5) != false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0130, code lost:
        if (r8.mo103287a(r1, 3) != false) goto L_0x0132;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x011b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo86686a(com.google.android.apps.gsa.smartspace.C92113i[] r8, com.google.common.base.C58833ax r9) {
        /*
            r7 = this;
            int r0 = r8.length
            r1 = 0
            r2 = 0
        L_0x0003:
            r3 = 0
            if (r2 >= r0) goto L_0x0010
            r4 = r8[r2]
            boolean r5 = r4.f256822c
            if (r5 == 0) goto L_0x000d
            goto L_0x002b
        L_0x000d:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x0010:
            int r0 = r8.length
            r2 = 0
        L_0x0012:
            if (r2 >= r0) goto L_0x002a
            r4 = r8[r2]
            com.google.assistant.c.do r5 = r4.f256820a
            int r5 = r5.f132315l
            com.google.assistant.c.cr r5 = com.google.assistant.p3886c.C50794cr.m85938a(r5)
            if (r5 != 0) goto L_0x0022
            com.google.assistant.c.cr r5 = com.google.assistant.p3886c.C50794cr.UNDEFINED
        L_0x0022:
            com.google.assistant.c.cr r6 = com.google.assistant.p3886c.C50794cr.WEATHER
            if (r5 != r6) goto L_0x0027
            goto L_0x002b
        L_0x0027:
            int r2 = r2 + 1
            goto L_0x0012
        L_0x002a:
            r4 = r3
        L_0x002b:
            boolean r8 = r9.mo56113h()
            if (r8 != 0) goto L_0x004c
            if (r4 == 0) goto L_0x0034
            goto L_0x004c
        L_0x0034:
            com.google.common.f.e r8 = f325966a
            com.google.common.f.x r8 = r8.mo56225c()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "SmartspaceUpdateOEMInte"
            r8.mo56378ag(r9, r0)
            java.lang.String r9 = "Unable to find the right card to send or chip, abort"
            r0 = 33003(0x80eb, float:4.6247E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r0)).mo56386p(r9)
            com.google.common.util.concurrent.cx r8 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            return r8
        L_0x004c:
            com.google.android.apps.gsa.search.core.i.t r8 = r7.f325970e
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90017bw.f247861C
            boolean r8 = r8.mo79746e(r0)
            if (r8 == 0) goto L_0x0060
            com.google.android.apps.gsa.search.core.i.t r8 = r7.f325970e
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90017bw.f247873O
            boolean r8 = r8.mo79746e(r0)
            if (r8 != 0) goto L_0x0062
        L_0x0060:
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
        L_0x0062:
            com.google.android.apps.gsa.search.core.i.w r8 = r7.f325968c
            com.google.android.apps.gsa.search.core.i.aa r8 = r8.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r8 = r8.mo79722a()
            java.lang.String r0 = "com.google.android.apps.oemsmartspace.HIDE_PERSONAL_NOTIFICATION"
            boolean r8 = r8.getBoolean(r0, r1)
            if (r4 == 0) goto L_0x0084
            com.google.assistant.c.do r0 = r4.f256820a
            int r0 = r0.f132315l
            com.google.assistant.c.cr r0 = com.google.assistant.p3886c.C50794cr.m85938a(r0)
            if (r0 != 0) goto L_0x007e
            com.google.assistant.c.cr r0 = com.google.assistant.p3886c.C50794cr.UNDEFINED
        L_0x007e:
            com.google.assistant.c.cr r2 = com.google.assistant.p3886c.C50794cr.TIPS
            if (r0 != r2) goto L_0x0084
            r0 = 1
            goto L_0x0085
        L_0x0084:
            r0 = 0
        L_0x0085:
            com.google.android.apps.gsa.search.core.i.w r2 = r7.f325968c
            com.google.android.apps.gsa.search.core.i.aa r2 = r2.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r2 = r2.mo79722a()
            java.lang.String r5 = "smartspace_oem_sysui_enabled"
            boolean r2 = r2.getBoolean(r5, r1)
            if (r2 == 0) goto L_0x00c9
            if (r4 == 0) goto L_0x00ac
            com.google.android.apps.gsa.staticplugins.smartspace.e r2 = r7.f325969d
            com.google.assistant.c.do r5 = r4.f256820a
            int r5 = r5.f132315l
            com.google.assistant.c.cr r5 = com.google.assistant.p3886c.C50794cr.m85938a(r5)
            if (r5 != 0) goto L_0x00a5
            com.google.assistant.c.cr r5 = com.google.assistant.p3886c.C50794cr.UNDEFINED
        L_0x00a5:
            r6 = 4
            boolean r2 = r2.mo103287a(r5, r6)
            if (r2 == 0) goto L_0x00c9
        L_0x00ac:
            com.google.android.apps.gsa.search.core.i.w r2 = r7.f325968c
            com.google.android.apps.gsa.search.core.i.aa r2 = r2.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r2 = r2.mo79722a()
            java.lang.String r5 = "smartspace_oem_sysui_package_name"
            java.lang.String r6 = "com.android.systemui"
            java.lang.String r2 = r2.getString(r5, r6)
            if (r0 != 0) goto L_0x00c9
            if (r2 == 0) goto L_0x00c9
            if (r8 == 0) goto L_0x00c5
            com.google.common.base.b r5 = com.google.common.base.C58836b.f156633a
            goto L_0x00c6
        L_0x00c5:
            r5 = r9
        L_0x00c6:
            r7.m195182e(r4, r2, r5)
        L_0x00c9:
            com.google.android.apps.gsa.search.core.i.w r2 = r7.f325968c
            com.google.android.apps.gsa.search.core.i.aa r2 = r2.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r2 = r2.mo79722a()
            java.lang.String r5 = "smartspace_oem_aod_enabled"
            boolean r2 = r2.getBoolean(r5, r1)
            if (r2 == 0) goto L_0x010b
            if (r4 == 0) goto L_0x00f0
            com.google.android.apps.gsa.staticplugins.smartspace.e r2 = r7.f325969d
            com.google.assistant.c.do r5 = r4.f256820a
            int r5 = r5.f132315l
            com.google.assistant.c.cr r5 = com.google.assistant.p3886c.C50794cr.m85938a(r5)
            if (r5 != 0) goto L_0x00e9
            com.google.assistant.c.cr r5 = com.google.assistant.p3886c.C50794cr.UNDEFINED
        L_0x00e9:
            r6 = 5
            boolean r2 = r2.mo103287a(r5, r6)
            if (r2 == 0) goto L_0x010b
        L_0x00f0:
            com.google.android.apps.gsa.search.core.i.w r2 = r7.f325968c
            com.google.android.apps.gsa.search.core.i.aa r2 = r2.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r2 = r2.mo79722a()
            java.lang.String r5 = "smartspace_oem_aod_package_name"
            java.lang.String r2 = r2.getString(r5, r3)
            if (r0 != 0) goto L_0x010b
            if (r2 == 0) goto L_0x010b
            if (r8 == 0) goto L_0x0107
            com.google.common.base.b r8 = com.google.common.base.C58836b.f156633a
            goto L_0x0108
        L_0x0107:
            r8 = r9
        L_0x0108:
            r7.m195182e(r4, r2, r8)
        L_0x010b:
            com.google.android.apps.gsa.search.core.i.w r8 = r7.f325968c
            com.google.android.apps.gsa.search.core.i.aa r8 = r8.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r8 = r8.mo79722a()
            java.lang.String r2 = "smartspace_oem_launcher_enabled"
            boolean r8 = r8.getBoolean(r2, r1)
            if (r8 == 0) goto L_0x0147
            if (r4 == 0) goto L_0x0132
            com.google.android.apps.gsa.staticplugins.smartspace.e r8 = r7.f325969d
            com.google.assistant.c.do r1 = r4.f256820a
            int r1 = r1.f132315l
            com.google.assistant.c.cr r1 = com.google.assistant.p3886c.C50794cr.m85938a(r1)
            if (r1 != 0) goto L_0x012b
            com.google.assistant.c.cr r1 = com.google.assistant.p3886c.C50794cr.UNDEFINED
        L_0x012b:
            r2 = 3
            boolean r8 = r8.mo103287a(r1, r2)
            if (r8 == 0) goto L_0x0147
        L_0x0132:
            com.google.android.apps.gsa.search.core.i.w r8 = r7.f325968c
            com.google.android.apps.gsa.search.core.i.aa r8 = r8.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r8 = r8.mo79722a()
            java.lang.String r1 = "smartspace_oem_launcher_package_name"
            java.lang.String r8 = r8.getString(r1, r3)
            if (r0 != 0) goto L_0x0147
            if (r8 == 0) goto L_0x0147
            r7.m195182e(r4, r8, r9)
        L_0x0147:
            com.google.common.util.concurrent.cx r8 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.smartspace.C117436q.mo86686a(com.google.android.apps.gsa.smartspace.i[], com.google.common.base.ax):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final C60870cx mo86687b(C92113i[] iVarArr) {
        return mo86686a(iVarArr, C58836b.f156633a);
    }

    /* renamed from: c */
    public final void mo103299c(Intent intent) {
        int i = this.f325968c.f232790a.mo79722a().getInt("com.google.android.apps.oemsmartspace.JAR_LIB_VERSION_KEY", 0);
        if (i == 1) {
            this.f325967b.sendBroadcast(intent);
        } else if (i > 1) {
            this.f325967b.sendBroadcast(intent, "com.google.android.googlequicksearchbox.permission.REGISTER_SMARTSPACE");
        }
    }
}
