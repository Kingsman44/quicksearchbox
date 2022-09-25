package com.google.android.apps.gsa.projection;

import android.content.pm.PackageManager;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.auto.p450a.p451a.C8855a;
import com.google.android.apps.auto.p450a.p451a.C8882b;
import com.google.android.apps.gsa.search.core.carassistant.AutoValue_CarAssistantSessionManager_Config;
import com.google.android.apps.gsa.search.core.carassistant.C85684b;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.gearhead.sdk.assistant.C142658d;
import com.google.android.gearhead.sdk.assistant.C142660f;
import com.google.android.gearhead.sdk.assistant.C142661g;
import com.google.android.gearhead.sdk.assistant.ClientRegistrationConfig;
import com.google.android.gearhead.sdk.assistant.SupportedVersionInfo;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.amo;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.projection.b */
/* compiled from: PG */
final class C84185b extends C142661g {

    /* renamed from: a */
    final /* synthetic */ CarAssistantService f229170a;

    public C84185b(CarAssistantService carAssistantService) {
        this.f229170a = carAssistantService;
    }

    /* renamed from: d */
    private final C142658d m134216d(C142660f fVar, ClientRegistrationConfig clientRegistrationConfig) {
        String str;
        String str2;
        amo amo;
        String str3;
        amo amo2;
        String str4;
        C58485gu guVar;
        C58485gu guVar2;
        ClientRegistrationConfig clientRegistrationConfig2 = clientRegistrationConfig;
        int i = clientRegistrationConfig2.f387098a;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1530;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        C58838bb.m90866a(fVar, "Client callback is null");
        if (i < 0 || i > 5) {
            ((C59052c) ((C59052c) CarAssistantService.f229136a.mo56225c()).mo56372aa(7078)).mo56387q("Unsupported API version: %d", i);
            return null;
        }
        C84188c cVar = this.f229170a.f229140d;
        int i2 = clientRegistrationConfig2.f387099b;
        if (i2 == 1) {
            amo = amo.ANDROID_AUTO_PHONE;
            str2 = "and.gsa.gearhead.phone";
            str = "AndroidAutoPhoneScreen/";
        } else if (i2 != 2) {
            amo = amo.ANDROID_AUTO;
            str = "AndroidAuto/";
            str2 = "gearhead";
        } else {
            amo = amo.ANDROID_AUTO_PROJECTED;
            str2 = "and.gsa.gearhead.projected";
            str = "AndroidAutoCarScreen/";
        }
        C85684b bVar = new C85684b();
        bVar.mo79311a(amo.ANDROID_AUTO);
        byte b = bVar.f231708g;
        bVar.f231703b = "gearhead";
        bVar.f231704c = null;
        bVar.f231707f = true;
        bVar.f231708g = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (b | 1)) | 4)) | 2)) | 8)) | 16)) | 32)) | 64)) | 128);
        bVar.mo79311a(amo);
        bVar.f231703b = str2;
        String str5 = clientRegistrationConfig2.f387102e;
        String str6 = clientRegistrationConfig2.f387103f;
        String x = cVar.f229174c.mo79758x(C90086ek.f250498ek);
        if (x.isEmpty()) {
            String[] strArr = C90721ae.f253793b;
            int length = strArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    ((C59052c) ((C59052c) C84188c.f229172a.mo56226d()).mo56372aa(7086)).mo56389s("Gearhead package not found in packages: %s", Arrays.toString(C90721ae.f253793b));
                    x = null;
                    break;
                }
                try {
                    x = cVar.f229173b.getPackageInfo(strArr[i3], 0).versionName;
                    break;
                } catch (PackageManager.NameNotFoundException unused) {
                    i3++;
                }
            }
        }
        if (x == null) {
            str3 = null;
        } else {
            StringBuilder sb = new StringBuilder(str);
            sb.append(x);
            if (str5 != null) {
                sb.append(" ");
                sb.append(str5);
            }
            if (str6 != null) {
                sb.append(" ");
                sb.append(str6);
            }
            str3 = sb.toString();
        }
        bVar.f231704c = str3;
        bVar.f231705d = clientRegistrationConfig2.f387102e;
        bVar.f231706e = clientRegistrationConfig2.f387103f;
        if (bVar.f231708g != -1 || (amo2 = bVar.f231702a) == null || (str4 = bVar.f231703b) == null) {
            StringBuilder sb2 = new StringBuilder();
            if (bVar.f231702a == null) {
                sb2.append(" searchClientId");
            }
            if ((bVar.f231708g & 1) == 0) {
                sb2.append(" sessionHandoverId");
            }
            if (bVar.f231703b == null) {
                sb2.append(" source");
            }
            if ((bVar.f231708g & 2) == 0) {
                sb2.append(" isEmbedded");
            }
            if ((bVar.f231708g & 4) == 0) {
                sb2.append(" notificationAccessMissing");
            }
            if ((bVar.f231708g & 8) == 0) {
                sb2.append(" fallbackAssistantEnabled");
            }
            if ((bVar.f231708g & 16) == 0) {
                sb2.append(" instrumentTestQuery");
            }
            if ((bVar.f231708g & 32) == 0) {
                sb2.append(" audioSessionId");
            }
            if ((bVar.f231708g & 64) == 0) {
                sb2.append(" queryRequestId");
            }
            if ((bVar.f231708g & 128) == 0) {
                sb2.append(" interactionSessionStartTime");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
        }
        AutoValue_CarAssistantSessionManager_Config autoValue_CarAssistantSessionManager_Config = new AutoValue_CarAssistantSessionManager_Config(amo2, 0, str4, bVar.f231704c, bVar.f231705d, bVar.f231706e, false, false, bVar.f231707f, (StatusBarNotification) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 0, 0, (HotwordDetectedEventData) null, 0);
        ArrayList arrayList = clientRegistrationConfig2.f387100c;
        if (arrayList == null) {
            guVar = C58485gu.m89845m();
        } else {
            guVar = C58485gu.m89842j(arrayList);
        }
        C58485gu guVar3 = guVar;
        ArrayList arrayList2 = clientRegistrationConfig2.f387101d;
        if (arrayList2 == null) {
            guVar2 = C58485gu.m89845m();
        } else {
            guVar2 = C58485gu.m89842j(arrayList2);
        }
        try {
            return (C142658d) C90877ak.m148472f(this.f229170a.f229139c.mo28201a("Create and initialize car assistant", new C84183a(this, fVar, autoValue_CarAssistantSessionManager_Config, guVar3, i, guVar2)));
        } catch (InterruptedException | ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) CarAssistantService.f229136a.mo56225c()).mo56382g(e)).mo56372aa(7079)).mo56386p("Error creating or initializing car assistant");
            return null;
        }
    }

    /* renamed from: a */
    public final C142658d mo77652a(C142660f fVar, ClientRegistrationConfig clientRegistrationConfig) {
        C58838bb.m90866a(clientRegistrationConfig, "Client registration config is null");
        ((C59052c) ((C59052c) CarAssistantService.f229136a.mo56224b()).mo56372aa(7076)).mo56359L("registerAssistantClient(): apiVersion: %d, uiMode: %d, appWhitelist: %s", Integer.valueOf(clientRegistrationConfig.f387098a), Integer.valueOf(clientRegistrationConfig.f387099b), clientRegistrationConfig.f387100c);
        return m134216d(fVar, clientRegistrationConfig);
    }

    @Deprecated
    /* renamed from: b */
    public final C142658d mo77653b(C142660f fVar, int i) {
        ((C59052c) ((C59052c) CarAssistantService.f229136a.mo56224b()).mo56372aa(7077)).mo56387q("registerClient(): API version: %d, UI mode: 0", i);
        ClientRegistrationConfig clientRegistrationConfig = new ClientRegistrationConfig();
        clientRegistrationConfig.f387098a = i;
        clientRegistrationConfig.f387099b = 0;
        clientRegistrationConfig.f387100c = new ArrayList();
        clientRegistrationConfig.f387101d = new ArrayList();
        return m134216d(fVar, clientRegistrationConfig);
    }

    /* renamed from: c */
    public final SupportedVersionInfo mo77654c() {
        SupportedVersionInfo supportedVersionInfo = new SupportedVersionInfo();
        supportedVersionInfo.f387127a = 0;
        supportedVersionInfo.f387128b = 5;
        C8855a aVar = (C8855a) C8882b.f30834g.createBuilder();
        boolean a = this.f229170a.f229152p.mo19977a(2);
        aVar.copyOnWrite();
        C8882b bVar = (C8882b) aVar.instance;
        bVar.f30836a |= 1;
        bVar.f30837b = a;
        boolean booleanValue = ((Boolean) this.f229170a.f229147k.mo17428b()).booleanValue();
        aVar.copyOnWrite();
        C8882b bVar2 = (C8882b) aVar.instance;
        bVar2.f30836a = 2 | bVar2.f30836a;
        bVar2.f30838c = booleanValue;
        boolean a2 = this.f229170a.f229152p.mo19977a(3);
        aVar.copyOnWrite();
        C8882b bVar3 = (C8882b) aVar.instance;
        bVar3.f30836a |= 4;
        bVar3.f30839d = a2;
        boolean booleanValue2 = ((Boolean) this.f229170a.f229148l.mo17428b()).booleanValue();
        aVar.copyOnWrite();
        C8882b bVar4 = (C8882b) aVar.instance;
        bVar4.f30836a |= 8;
        bVar4.f30840e = booleanValue2;
        boolean booleanValue3 = ((Boolean) this.f229170a.f229149m.mo17428b()).booleanValue();
        aVar.copyOnWrite();
        C8882b bVar5 = (C8882b) aVar.instance;
        bVar5.f30836a |= 16;
        bVar5.f30841f = booleanValue3;
        supportedVersionInfo.f387129c = (C8882b) aVar.build();
        return supportedVersionInfo;
    }
}
