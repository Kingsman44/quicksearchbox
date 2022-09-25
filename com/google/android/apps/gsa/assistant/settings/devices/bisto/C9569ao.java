package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.content.Intent;
import android.os.Bundle;
import androidx.preference.CheckBoxPreference;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.google.android.apps.gsa.assistant.settings.devices.shared.C9730c;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124519a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.ao */
/* compiled from: PG */
public final class C9569ao extends C9730c {

    /* renamed from: i */
    public static final C59071e f33144i = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.devices.bisto.ao");

    /* renamed from: j */
    static final C58495hd f33145j;

    /* renamed from: k */
    public final C68214a f33146k;

    /* renamed from: l */
    public final String f33147l;

    /* renamed from: m */
    public EditTextPreference f33148m;

    /* renamed from: n */
    public EditTextPreference f33149n;

    /* renamed from: o */
    public EditTextPreference f33150o;

    /* renamed from: p */
    public CheckBoxPreference f33151p;

    /* renamed from: q */
    private final C91142g f33152q;

    /* renamed from: r */
    private final C68214a f33153r;

    /* renamed from: s */
    private final C22871g f33154s;

    /* renamed from: t */
    private Preference f33155t;

    /* renamed from: u */
    private Preference f33156u;

    /* renamed from: v */
    private Preference f33157v;

    /* renamed from: w */
    private Preference f33158w;

    /* renamed from: x */
    private Preference f33159x;

    /* renamed from: y */
    private Preference f33160y;

    /* renamed from: z */
    private Preference f33161z;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C124625ar.UNKNOWN_INTERNAL_OTA_STATE, "Idle");
        gzVar.mo55429h(C124625ar.DOWNLOAD_SCHEDULED, "Downloading");
        gzVar.mo55429h(C124625ar.READY_TO_UPLOAD_TO_HEADSET, "Waiting for battery and connection");
        gzVar.mo55429h(C124625ar.UPLOADING_DFU_TO_HEADSET, "Uploading to Bisto device");
        gzVar.mo55429h(C124625ar.WAITING_FOR_APPLY_ACK_FROM_USER, "Waiting to apply");
        gzVar.mo55429h(C124625ar.WAITING_FOR_APPLY_ACK_FROM_USER_UNVERIFIED, "Waiting to apply - unverified");
        gzVar.mo55429h(C124625ar.NON_FORCE_APPLY_SENT, "Applying");
        f33145j = gzVar.mo55427f(false);
    }

    public C9569ao(C91142g gVar, C68214a aVar, C68214a aVar2, C22871g gVar2, String str) {
        this.f33152q = gVar;
        this.f33146k = aVar;
        this.f33153r = aVar2;
        this.f33154s = gVar2;
        this.f33147l = str;
    }

    /* renamed from: a */
    public final void mo17875a(Intent intent) {
        try {
            C124519a.m203974a(this.f32988d, intent);
        } catch (SecurityException e) {
            C59104x c = f33144i.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoOtaCtrl");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(366)).mo56386p("Forwarding intent. Service not found");
        }
    }

    /* renamed from: b */
    public final void mo17876b(C124548d dVar) {
        if (this.f33155t == null || this.f33156u == null || this.f33157v == null || this.f33158w == null || this.f33159x == null || this.f33160y == null || this.f33161z == null || this.f33148m == null || this.f33150o == null || this.f33149n == null || this.f33151p == null) {
            C59104x b = f33144i.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoOtaCtrl");
            ((C59052c) ((C59052c) b).mo56372aa(370)).mo56386p("OTA preferences not initialized");
            return;
        }
        C124629av q = dVar.mo106519q();
        C58495hd hdVar = f33145j;
        C124625ar a = C124625ar.m204290a(q.f343821h);
        if (a == null) {
            a = C124625ar.UNKNOWN_INTERNAL_OTA_STATE;
        }
        String str = (String) hdVar.get(a);
        if (str == null) {
            C124625ar a2 = C124625ar.m204290a(q.f343821h);
            if (a2 == null) {
                a2 = C124625ar.UNKNOWN_INTERNAL_OTA_STATE;
            }
            str = Integer.toString(a2.f343803i);
        }
        this.f33157v.mo8329n(str);
        this.f33156u.mo8329n(dVar.mo106478S());
        if (q.f343828o.size() == 0) {
            this.f33155t.mo8329n(dVar.mo106472M());
            this.f33158w.mo8329n(q.f343815b);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            long j = 0;
            long j2 = 0;
            for (C124650bp bpVar : q.f343828o) {
                j += bpVar.f343902k;
                j2 += bpVar.f343901j;
                arrayList.add(String.format(Locale.getDefault(), "%s (%d)", new Object[]{bpVar.f343894c, Integer.valueOf(bpVar.f343893b)}));
                if ((bpVar.f343892a & 4) != 0) {
                    arrayList2.add(String.format(Locale.getDefault(), "%s (%d)", new Object[]{bpVar.f343895d, Integer.valueOf(bpVar.f343893b)}));
                }
            }
            Preference preference = this.f33155t;
            String M = dVar.mo106472M();
            String d = new C58827ar("; ").mo56097d(arrayList2);
            preference.mo8329n(M + "; " + d);
            this.f33158w.mo8329n(new C58827ar("; ").mo56097d(arrayList));
            C124625ar a3 = C124625ar.m204290a(q.f343821h);
            if (a3 == null) {
                a3 = C124625ar.UNKNOWN_INTERNAL_OTA_STATE;
            }
            if (a3 == C124625ar.UPLOADING_DFU_TO_HEADSET && j != 0) {
                this.f33157v.mo8329n(String.format(Locale.US, "%s, %d%% of %d bytes", new Object[]{str, Long.valueOf((j2 * 100) / j), Long.valueOf(j)}));
            }
        }
        C124625ar arVar = C124625ar.UNKNOWN_INTERNAL_OTA_STATE;
        C124625ar a4 = C124625ar.m204290a(q.f343821h);
        if (a4 == null) {
            a4 = arVar;
        }
        boolean equals = arVar.equals(a4);
        this.f33158w.mo8348O(!equals);
        this.f33148m.mo8339F(equals);
        this.f33149n.mo8339F(equals);
        this.f33150o.mo8339F(equals);
        this.f33160y.mo8339F(equals);
        Preference preference2 = this.f33161z;
        C124625ar arVar2 = C124625ar.WAITING_FOR_APPLY_ACK_FROM_USER;
        C124625ar a5 = C124625ar.m204290a(q.f343821h);
        if (a5 == null) {
            a5 = C124625ar.UNKNOWN_INTERNAL_OTA_STATE;
        }
        preference2.mo8348O(arVar2.equals(a5));
        this.f33151p.mo8339F(equals);
    }

    /* renamed from: o */
    public final void mo17804o(Bundle bundle) {
        super.mo17994S(mo17792e());
        new C90873ag(((C89492cd) this.f33153r.mo27525b()).mo83408n(this.f33147l), this.f33154s, "getdeviceinfo", new C9560af(this)).mo85223a(new C9561ag(this));
        ((C89492cd) this.f33153r.mo27525b()).mo83360B(new C58759qy(8), new C9562ah(this));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17862F(androidx.preference.Preference r4) {
        /*
            r3 = this;
            java.lang.String r0 = r4.f12748t
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.hashCode()
            switch(r1) {
                case -2094984115: goto L_0x0076;
                case -1938042187: goto L_0x006b;
                case -1790734960: goto L_0x0061;
                case -1645987211: goto L_0x0057;
                case -1509169919: goto L_0x004d;
                case -1209373837: goto L_0x0043;
                case -878855185: goto L_0x0039;
                case -474758422: goto L_0x002f;
                case 387778418: goto L_0x0024;
                case 1203169797: goto L_0x001a;
                case 1949178576: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0080
        L_0x000e:
            java.lang.String r1 = "bistoOtaVersions"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0080
            r0 = 9
            goto L_0x0081
        L_0x001a:
            java.lang.String r1 = "bistoOtaCurrentBuildFirmware"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0080
            r0 = 1
            goto L_0x0081
        L_0x0024:
            java.lang.String r1 = "isZeroDayOta"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0080
            r0 = 10
            goto L_0x0081
        L_0x002f:
            java.lang.String r1 = "bistoOtaCurrentBuildLabel"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0080
            r0 = 0
            goto L_0x0081
        L_0x0039:
            java.lang.String r1 = "bistoOtaApplyingBuildLabel"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0080
            r0 = 3
            goto L_0x0081
        L_0x0043:
            java.lang.String r1 = "bistoAbortOta"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0080
            r0 = 4
            goto L_0x0081
        L_0x004d:
            java.lang.String r1 = "bistoStartOta"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0080
            r0 = 5
            goto L_0x0081
        L_0x0057:
            java.lang.String r1 = "bistoApplyOta"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0080
            r0 = 6
            goto L_0x0081
        L_0x0061:
            java.lang.String r1 = "bistoOtaSource"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0080
            r0 = 7
            goto L_0x0081
        L_0x006b:
            java.lang.String r1 = "bistoOtaDeviceIndexes"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0080
            r0 = 8
            goto L_0x0081
        L_0x0076:
            java.lang.String r1 = "bistoOtaCurrentState"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0080
            r0 = 2
            goto L_0x0081
        L_0x0080:
            r0 = -1
        L_0x0081:
            java.lang.String r1 = ""
            switch(r0) {
                case 0: goto L_0x010d;
                case 1: goto L_0x010a;
                case 2: goto L_0x0107;
                case 3: goto L_0x0104;
                case 4: goto L_0x00fa;
                case 5: goto L_0x00f0;
                case 6: goto L_0x00e6;
                case 7: goto L_0x00c8;
                case 8: goto L_0x00aa;
                case 9: goto L_0x008c;
                case 10: goto L_0x0087;
                default: goto L_0x0086;
            }
        L_0x0086:
            return
        L_0x0087:
            androidx.preference.CheckBoxPreference r4 = (androidx.preference.CheckBoxPreference) r4
            r3.f33151p = r4
            return
        L_0x008c:
            androidx.preference.EditTextPreference r4 = (androidx.preference.EditTextPreference) r4
            r3.f33150o = r4
            com.google.android.apps.gsa.assistant.settings.devices.bisto.an r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.an
            r0.<init>(r3)
            r4.f12742n = r0
            com.google.android.apps.gsa.shared.util.v.g r0 = r3.f33152q
            java.lang.String r2 = "bisto_ota_versions"
            java.lang.String r0 = r0.mo85402g(r2, r1)
            r4.mo8323j(r0)
            androidx.preference.EditTextPreference r4 = r3.f33150o
            java.lang.String r0 = r4.f12703g
            r4.mo8329n(r0)
            return
        L_0x00aa:
            androidx.preference.EditTextPreference r4 = (androidx.preference.EditTextPreference) r4
            r3.f33149n = r4
            com.google.android.apps.gsa.assistant.settings.devices.bisto.am r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.am
            r0.<init>(r3)
            r4.f12742n = r0
            com.google.android.apps.gsa.shared.util.v.g r0 = r3.f33152q
            java.lang.String r2 = "bisto_ota_device_indexes"
            java.lang.String r0 = r0.mo85402g(r2, r1)
            r4.mo8323j(r0)
            androidx.preference.EditTextPreference r4 = r3.f33149n
            java.lang.String r0 = r4.f12703g
            r4.mo8329n(r0)
            return
        L_0x00c8:
            androidx.preference.EditTextPreference r4 = (androidx.preference.EditTextPreference) r4
            r3.f33148m = r4
            com.google.android.apps.gsa.assistant.settings.devices.bisto.al r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.al
            r0.<init>(r3)
            r4.f12742n = r0
            com.google.android.apps.gsa.shared.util.v.g r0 = r3.f33152q
            java.lang.String r2 = "bisto_ota_file_url"
            java.lang.String r0 = r0.mo85402g(r2, r1)
            r4.mo8323j(r0)
            androidx.preference.EditTextPreference r4 = r3.f33148m
            java.lang.String r0 = r4.f12703g
            r4.mo8329n(r0)
            return
        L_0x00e6:
            r3.f33161z = r4
            com.google.android.apps.gsa.assistant.settings.devices.bisto.ak r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.ak
            r0.<init>(r3)
            r4.f12743o = r0
            return
        L_0x00f0:
            r3.f33160y = r4
            com.google.android.apps.gsa.assistant.settings.devices.bisto.aj r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.aj
            r0.<init>(r3)
            r4.f12743o = r0
            return
        L_0x00fa:
            r3.f33159x = r4
            com.google.android.apps.gsa.assistant.settings.devices.bisto.ai r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.ai
            r0.<init>(r3)
            r4.f12743o = r0
            return
        L_0x0104:
            r3.f33158w = r4
            return
        L_0x0107:
            r3.f33157v = r4
            return
        L_0x010a:
            r3.f33156u = r4
            return
        L_0x010d:
            r3.f33155t = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.devices.bisto.C9569ao.mo17862F(androidx.preference.Preference):void");
    }
}
