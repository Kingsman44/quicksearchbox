package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96505y;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124628au;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124649bo;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.bu */
/* compiled from: PG */
public final class C96562bu extends C96558bq {

    /* renamed from: a */
    private static final C59071e f270151a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.w.bu");

    /* renamed from: b */
    private final C96614q f270152b;

    /* renamed from: c */
    private final C96618u f270153c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96562bu(C22871g gVar, C96525ak akVar, C68214a aVar, C96614q qVar, C96618u uVar, C96534at atVar, C96533as asVar, C95355bf bfVar) {
        super(gVar, akVar, aVar, atVar, asVar, uVar, bfVar);
        this.f270152b = qVar;
        this.f270153c = uVar;
    }

    /* renamed from: m */
    private final void m160001m() {
        C96614q qVar = this.f270152b;
        for (C124650bp bpVar : this.f270133k.f343828o) {
            if (bpVar.f343899h != 16) {
                if ((bpVar.f343892a & 8) != 0 && qVar.f270290d.mo26870b() - bpVar.f343900i >= C96614q.f270288b && bpVar.f343899h != 8) {
                    C59104x b = C96614q.f270287a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "OtaDownloader");
                    ((C59052c) ((C59052c) b).mo56372aa(16567)).mo56387q("OTA download timed out for device #%d", bpVar.f343893b);
                }
            }
            C59104x c = f270151a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OtaStateDownloading");
            ((C59052c) ((C59052c) c).mo56372aa(16653)).mo56386p("Download failed.");
            mo90240o(C124625ar.UNKNOWN_INTERNAL_OTA_STATE);
            return;
        }
        for (C124650bp bpVar2 : this.f270133k.f343828o) {
            if ((bpVar2.f343892a & 8) != 0 && bpVar2.f343899h != 8) {
                return;
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f270138p.mo89270k();
        mo90240o(C124625ar.READY_TO_UPLOAD_TO_HEADSET);
    }

    /* renamed from: a */
    public final C124625ar mo90224a() {
        return C124625ar.DOWNLOAD_SCHEDULED;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0180  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90228e(com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av r17, com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d r18) {
        /*
            r16 = this;
            r0 = r16
            java.lang.String r1 = "OtaDownloader"
            super.mo90228e(r17, r18)
            boolean r2 = r16.mo90246v()
            if (r2 == 0) goto L_0x0012
            com.google.android.apps.gsa.staticplugins.bisto.w.u r2 = r0.f270153c
            r2.mo90276a()
        L_0x0012:
            com.google.android.apps.search.assistant.surfaces.bisto.d.av r2 = r0.f270133k
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.android.apps.search.assistant.surfaces.bisto.d.au r2 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124628au) r2
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.av r3 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av) r3
            com.google.protobuf.cq r3 = r3.f343828o
            int r3 = r3.size()
            r5 = 0
        L_0x0025:
            if (r5 >= r3) goto L_0x0230
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r6 = r2.mo106566a(r5)
            int r7 = r6.f343892a
            r8 = r7 & 32
            if (r8 == 0) goto L_0x0033
            goto L_0x022c
        L_0x0033:
            r7 = r7 & 8
            if (r7 == 0) goto L_0x022c
            com.google.android.apps.gsa.staticplugins.bisto.w.q r7 = r0.f270152b
            com.google.android.apps.search.assistant.surfaces.bisto.d.av r8 = r0.f270133k
            int r8 = r8.f343818e
            int r8 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124640bf.m204304a(r8)
            r9 = 2
            r10 = 1
            if (r8 != 0) goto L_0x0046
            goto L_0x0049
        L_0x0046:
            if (r8 != r9) goto L_0x0049
            goto L_0x0066
        L_0x0049:
            com.google.android.apps.search.assistant.surfaces.bisto.d.q r8 = r18.mo106513k()
            com.google.android.apps.search.assistant.surfaces.bisto.d.q r11 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q.CAR_ACCESSORY
            if (r8 == r11) goto L_0x0066
            int r8 = r6.f343906o
            com.google.android.apps.search.assistant.surfaces.bisto.d.at r8 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at.m204292a(r8)
            if (r8 != 0) goto L_0x005b
            com.google.android.apps.search.assistant.surfaces.bisto.d.at r8 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at.UNKNOWN_OTA_TYPE
        L_0x005b:
            com.google.android.apps.search.assistant.surfaces.bisto.d.at r11 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at.HOTWORD_MODEL_ONLY_OTA_TYPE
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r8 = 0
            goto L_0x0067
        L_0x0066:
            r8 = 1
        L_0x0067:
            com.google.android.apps.search.assistant.surfaces.bisto.d.av r11 = r0.f270133k
            int r11 = r11.f343818e
            int r11 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124640bf.m204304a(r11)
            if (r11 != 0) goto L_0x0072
            goto L_0x0075
        L_0x0072:
            if (r11 != r9) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r10 = 0
        L_0x0076:
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.android.apps.search.assistant.surfaces.bisto.d.bo r6 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124649bo) r6
            com.google.android.libraries.f.a r9 = r7.f270290d
            long r11 = r9.mo26870b()
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r9 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r9
            int r13 = r9.f343892a
            r13 = r13 | 128(0x80, float:1.794E-43)
            r9.f343892a = r13
            r9.f343900i = r11
            r11 = 16
            r13 = -1
            java.io.File r9 = new java.io.File     // Catch:{ IOException -> 0x01f9 }
            com.google.android.apps.search.assistant.surfaces.bisto.c.f.a r15 = r7.f270291e     // Catch:{ IOException -> 0x01f9 }
            java.io.File r15 = r15.mo106558b()     // Catch:{ IOException -> 0x01f9 }
            java.lang.String r4 = "bisto-ota"
            r9.<init>(r15, r4)     // Catch:{ IOException -> 0x01f9 }
            boolean r4 = r9.exists()
            if (r4 == 0) goto L_0x00ae
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.getAbsolutePath()
            goto L_0x00b3
        L_0x00ae:
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mkdirs()
        L_0x00b3:
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r4
            java.lang.String r4 = r4.f343896e
            boolean r4 = android.webkit.URLUtil.isValidUrl(r4)
            if (r4 != 0) goto L_0x0180
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r4
            java.lang.String r4 = r4.f343896e
            java.io.File r7 = new java.io.File
            r7.<init>(r4)
            r7.exists()
            r7.canRead()
            r7.isDirectory()
            r7.isFile()
            boolean r4 = r7.exists()
            if (r4 == 0) goto L_0x0128
            boolean r4 = r7.canRead()
            if (r4 == 0) goto L_0x0128
            boolean r4 = r7.isDirectory()
            if (r4 != 0) goto L_0x0128
            boolean r4 = r7.isFile()
            if (r4 == 0) goto L_0x0128
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r4
            java.lang.String r4 = r4.f343896e
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r7 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r7
            r4.getClass()
            int r8 = r7.f343892a
            r8 = r8 | 16
            r7.f343892a = r8
            r7.f343897f = r4
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r4
            int r7 = r4.f343892a
            r7 = r7 | 32
            r4.f343892a = r7
            r4.f343898g = r13
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r4
            int r7 = r4.f343892a
            r7 = r7 | 64
            r4.f343892a = r7
            r7 = 8
            r4.f343899h = r7
            goto L_0x0229
        L_0x0128:
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96614q.f270287a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r7, r1)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r7 = 16564(0x40b4, float:2.3211E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r7)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r7 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r7
            java.lang.String r7 = r7.f343896e
            java.lang.String r8 = "Unreadable file URL: %s"
            r4.mo56389s(r8, r7)
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r4
            java.lang.String r4 = r4.f343896e
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r7 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r7
            r4.getClass()
            int r8 = r7.f343892a
            r8 = r8 | 16
            r7.f343892a = r8
            r7.f343897f = r4
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r4
            int r7 = r4.f343892a
            r7 = r7 | 32
            r4.f343892a = r7
            r4.f343898g = r13
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r4
            int r7 = r4.f343892a
            r7 = r7 | 64
            r4.f343892a = r7
            r4.f343899h = r11
            goto L_0x0229
        L_0x0180:
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            java.io.File r15 = new java.io.File
            r15.<init>(r9, r4)
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r4
            java.lang.String r4 = r4.f343896e
            android.content.Context r7 = r7.f270289c
            android.net.Uri r4 = android.net.Uri.parse(r4)
            java.lang.Long r4 = com.google.android.apps.gsa.staticplugins.bisto.util.C96505y.m159888b(r7, r4, r15, r8, r10)
            if (r4 == 0) goto L_0x01da
            long r7 = r4.longValue()
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r4
            int r9 = r4.f343892a
            r9 = r9 | 32
            r4.f343892a = r9
            r4.f343898g = r7
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r4
            int r7 = r4.f343892a
            r7 = r7 & -65
            r4.f343892a = r7
            r7 = 0
            r4.f343899h = r7
            java.lang.String r4 = r15.getAbsolutePath()
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r7 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r7
            r4.getClass()
            int r8 = r7.f343892a
            r8 = r8 | 16
            r7.f343892a = r8
            r7.f343897f = r4
            goto L_0x0229
        L_0x01da:
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r4
            int r7 = r4.f343892a
            r7 = r7 | 32
            r4.f343892a = r7
            r4.f343898g = r13
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r4
            int r7 = r4.f343892a
            r7 = r7 | 64
            r4.f343892a = r7
            r4.f343899h = r11
            goto L_0x0229
        L_0x01f9:
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96614q.f270287a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r7, r1)
            java.lang.String r7 = "Failed to open directory for downloads"
            r8 = 16566(0x40b6, float:2.3214E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r8)).mo56386p(r7)
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r4
            int r7 = r4.f343892a
            r7 = r7 | 32
            r4.f343892a = r7
            r4.f343898g = r13
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r4 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp) r4
            int r7 = r4.f343892a
            r7 = r7 | 64
            r4.f343892a = r7
            r4.f343899h = r11
        L_0x0229:
            r2.mo106568c(r5, r6)
        L_0x022c:
            int r5 = r5 + 1
            goto L_0x0025
        L_0x0230:
            r0.mo90243r(r2)
            r16.m160001m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96562bu.mo90228e(com.google.android.apps.search.assistant.surfaces.bisto.d.av, com.google.android.apps.search.assistant.surfaces.bisto.c.b.d):void");
    }

    /* renamed from: f */
    public final void mo90229f() {
        super.mo90229f();
        m160001m();
    }

    /* renamed from: g */
    public final void mo90230g(long j) {
        C124628au auVar;
        C58976aa aaVar = C58975e.f156826a;
        C96614q qVar = this.f270152b;
        String k = this.f270138p.mo89270k();
        C124629av avVar = this.f270133k;
        Integer a = C96505y.m159887a(qVar.f270289c, j);
        C59104x b = C96614q.f270287a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OtaDownloader");
        ((C59052c) ((C59052c) b).mo56372aa(16557)).mo56351D("notifyDownloadComplete %d - status %d", j, a);
        int size = avVar.f343828o.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                C59104x d = C96614q.f270287a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "OtaDownloader");
                ((C59052c) ((C59052c) d).mo56372aa(16558)).mo56353F("Download result received for %s, when there's no record of %d download scheduled", k, j);
                auVar = (C124628au) avVar.toBuilder();
                break;
            }
            C124650bp bpVar = (C124650bp) avVar.f343828o.get(i);
            if (bpVar.f343898g != j) {
                i++;
            } else {
                auVar = (C124628au) avVar.toBuilder();
                if (a != null) {
                    C124649bo boVar = (C124649bo) bpVar.toBuilder();
                    int intValue = a.intValue();
                    boVar.copyOnWrite();
                    C124650bp bpVar2 = (C124650bp) boVar.instance;
                    bpVar2.f343892a |= 64;
                    bpVar2.f343899h = (long) intValue;
                    auVar.mo106568c(i, boVar);
                } else {
                    C59104x c = C96614q.f270287a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "OtaDownloader");
                    ((C59052c) ((C59052c) c).mo56372aa(16559)).mo56353F("Unknown status for device %s and downloadId %d", k, j);
                    C124649bo boVar2 = (C124649bo) bpVar.toBuilder();
                    boVar2.copyOnWrite();
                    C124650bp bpVar3 = (C124650bp) boVar2.instance;
                    bpVar3.f343892a |= 64;
                    bpVar3.f343899h = 16;
                    auVar.mo106568c(i, boVar2);
                }
            }
        }
        mo90243r(auVar);
        m160001m();
    }

    /* renamed from: k */
    public final String mo90237k() {
        return "OtaStateDownloading";
    }
}
