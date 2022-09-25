package com.google.android.libraries.search.assistant.performer.deviceactions;

import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35825an;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35830as;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35934c;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35935d;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2728a.C35473i;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60887da;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.aw */
/* compiled from: PG */
public final class C35894aw implements C35472h {

    /* renamed from: a */
    public static final C59071e f94025a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.aw");

    /* renamed from: b */
    public final C35473i f94026b;

    /* renamed from: c */
    public final C35825an f94027c;

    /* renamed from: d */
    public final Map f94028d;

    /* renamed from: e */
    public final C35934c f94029e;

    /* renamed from: f */
    private final C60887da f94030f;

    /* renamed from: g */
    private final C35830as f94031g;

    /* renamed from: h */
    private final C35896ay f94032h;

    public C35894aw(C60887da daVar, C35825an anVar, C35830as asVar, C35935d dVar, Map map, C35473i iVar, C35896ay ayVar) {
        this.f94027c = anVar;
        this.f94031g = asVar;
        this.f94030f = daVar;
        this.f94029e = dVar.mo39899a("device.MODIFY_SETTING");
        this.f94028d = map;
        this.f94026b = iVar;
        this.f94032h = ayVar;
    }

    /* renamed from: b */
    public static boolean m64288b(C52070ec ecVar) {
        C52236kg kgVar = ecVar.f136654b;
        if (kgVar == null) {
            kgVar = C52236kg.f137089d;
        }
        C52235kf a = C52235kf.m86549a(kgVar.f137092b);
        if (a == null) {
            a = C52235kf.OK;
        }
        return a == C52235kf.OK;
    }

    /* renamed from: c */
    private final void m64289c(C62722b bVar) {
        this.f94029e.mo39898f("SETTING_UNSPECIFIED", bVar);
        this.f94029e.mo39895c("SETTING_UNSPECIFIED", bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010f, code lost:
        if (r0.f136762h.equals("content://com.android.settings.slices/action/bluetooth") != false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011e, code lost:
        if (r0.f136756b.equals("bluetooth_toggle_key") != false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0120, code lost:
        if (r1 == false) goto L_0x0122;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20766a(com.google.assistant.p3897e.p3921j.C51809dy r8) {
        /*
            r7 = this;
            com.google.common.f.e r0 = f94025a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Enter TNG modifySettingPerformer."
            r2 = 51844(0xca84, float:7.2649E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            java.lang.String r0 = r8.f135936b
            java.lang.String r1 = "device.MODIFY_SETTING"
            boolean r0 = r0.equals(r1)
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0224
            java.lang.String r0 = "modify_setting_args"
            com.google.assistant.e.j.fu r1 = com.google.assistant.p3897e.p3921j.C52115fu.f136753n     // Catch:{ g -> 0x0218, ct -> 0x0216, RuntimeException -> 0x020f }
            com.google.protobuf.eb r1 = r1.getParserForType()     // Catch:{ g -> 0x0218, ct -> 0x0216, RuntimeException -> 0x020f }
            com.google.protobuf.MessageLite r0 = com.google.android.libraries.search.assistant.performer.p2767j.C36183e.m64584b(r8, r0, r1)     // Catch:{ g -> 0x0218, ct -> 0x0216, RuntimeException -> 0x020f }
            com.google.assistant.e.j.fu r0 = (com.google.assistant.p3897e.p3921j.C52115fu) r0     // Catch:{ g -> 0x0218, ct -> 0x0216, RuntimeException -> 0x020f }
            java.lang.String r1 = "modify_dependent_setting_args"
            com.google.assistant.e.j.fu r5 = com.google.assistant.p3897e.p3921j.C52115fu.f136753n     // Catch:{ g -> 0x0218, ct -> 0x0216, RuntimeException -> 0x020f }
            com.google.protobuf.eb r5 = r5.getParserForType()     // Catch:{ g -> 0x0218, ct -> 0x0216, RuntimeException -> 0x020f }
            j$.util.Optional r8 = com.google.android.libraries.search.assistant.performer.p2767j.C36183e.m64585c(r8, r1, r5)     // Catch:{ g -> 0x0218, ct -> 0x0216, RuntimeException -> 0x020f }
            int r1 = r0.f136755a     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r5 = r1 & 64
            if (r5 == 0) goto L_0x003c
            goto L_0x0045
        L_0x003c:
            r5 = r1 & 1
            if (r5 == 0) goto L_0x0041
            goto L_0x0045
        L_0x0041:
            r1 = r1 & 16
            if (r1 == 0) goto L_0x01e4
        L_0x0045:
            com.google.android.libraries.search.assistant.performer.deviceactions.c.c r1 = r7.f94029e     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r5 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35845bg.m64246f(r0)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.net.a.a.b r6 = com.google.net.p4726a.p4727a.C62722b.OK     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r1.mo39898f(r5, r6)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            int r1 = r0.f136755a     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x00c4
            java.lang.String r1 = r0.f136760f     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r5 = "DO_NOT_DISTURB"
            boolean r1 = r1.equals(r5)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            if (r1 == 0) goto L_0x00c4
            int r1 = r0.f136757c     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            int r1 = com.google.assistant.p3897e.p3921j.C52112fr.m86508b(r1)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            if (r1 != 0) goto L_0x0069
            goto L_0x00c4
        L_0x0069:
            if (r1 != r3) goto L_0x00c4
            long r1 = r0.f136763i     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            j$.time.Duration r8 = p3186j$.time.Duration.ofMillis(r1)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            long r1 = r8.toMinutes()     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            int r8 = (int) r1     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r1.<init>()     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r2 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35787a.f93749e     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            android.content.Intent r1 = r1.setAction(r2)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r2 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35787a.f93748d     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            android.content.Intent r1 = r1.addCategory(r2)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r2 = "com.android.settings"
            android.content.Intent r1 = r1.setPackage(r2)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r2 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35787a.f93750f     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            android.content.Intent r1 = r1.putExtra(r2, r4)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r2 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35787a.f93747c     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r3 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            android.content.Intent r1 = r1.putExtra(r2, r3)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r2 = "IsVoiceQuery"
            android.content.Intent r1 = r1.putExtra(r2, r4)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r2 = "NoUiQuery"
            android.content.Intent r1 = r1.putExtra(r2, r4)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r2 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35787a.f93751g     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            android.content.Intent r8 = r1.putExtra(r2, r8)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.android.libraries.search.assistant.performer.a.i r1 = r7.f94026b     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.common.util.concurrent.cx r1 = r1.mo20099a(r8)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.android.libraries.search.assistant.performer.deviceactions.au r2 = new com.google.android.libraries.search.assistant.performer.deviceactions.au     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r2.<init>(r8)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.common.util.concurrent.bg r8 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.common.base.ah r2 = com.google.apps.tiktok.tracing.C47810es.m84963c(r2)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60922j.m93044g(r1, r2, r8)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            goto L_0x01d5
        L_0x00c4:
            com.google.android.libraries.search.assistant.performer.deviceactions.ay r1 = r7.f94032h     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.Boolean r1 = r1.mo39876a()     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            boolean r1 = r1.booleanValue()     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            int r3 = r0.f136755a     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r3 = r3 & 16
            if (r3 == 0) goto L_0x00e0
            java.lang.String r3 = r0.f136760f     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r5 = "FLASHLIGHT"
            boolean r3 = r3.equals(r5)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            if (r3 == 0) goto L_0x00e0
            goto L_0x0198
        L_0x00e0:
            int r3 = r0.f136755a     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r3 = r3 & 64
            if (r3 == 0) goto L_0x00f0
            java.lang.String r3 = r0.f136762h     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r5 = "content://com.android.settings.slices/action/flashlight"
            boolean r3 = r3.equals(r5)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            if (r3 != 0) goto L_0x0198
        L_0x00f0:
            int r3 = r0.f136755a     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r3 = r3 & 16
            if (r3 == 0) goto L_0x0101
            java.lang.String r3 = r0.f136760f     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r5 = "BLUETOOTH"
            boolean r3 = r3.equals(r5)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            if (r3 == 0) goto L_0x0101
            goto L_0x0120
        L_0x0101:
            int r3 = r0.f136755a     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r3 = r3 & 64
            if (r3 == 0) goto L_0x0111
            java.lang.String r3 = r0.f136762h     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r5 = "content://com.android.settings.slices/action/bluetooth"
            boolean r3 = r3.equals(r5)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            if (r3 != 0) goto L_0x0120
        L_0x0111:
            int r3 = r0.f136755a     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0122
            java.lang.String r3 = r0.f136756b     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r5 = "bluetooth_toggle_key"
            boolean r3 = r3.equals(r5)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            if (r3 == 0) goto L_0x0122
        L_0x0120:
            if (r1 != 0) goto L_0x0198
        L_0x0122:
            int r1 = r0.f136755a     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r1 = r1 & 64
            if (r1 == 0) goto L_0x018a
            java.lang.String r1 = r0.f136762h     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            boolean r1 = r1.isEmpty()     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            if (r1 == 0) goto L_0x0131
            goto L_0x018a
        L_0x0131:
            com.google.android.libraries.search.assistant.performer.deviceactions.a.a.as r1 = r7.f94031g     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r2 = r0.f136762h     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.android.libraries.search.assistant.performer.deviceactions.c.c r3 = r1.f93898f     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r4 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35845bg.m64246f(r0)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35932a.m64318c(r3, r4)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.android.libraries.search.assistant.performer.deviceactions.a.a.bd r3 = r1.f93894b     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.android.libraries.search.assistant.performer.deviceactions.a.a.bc r4 = new com.google.android.libraries.search.assistant.performer.deviceactions.a.a.bc     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            g.a.a r5 = r3.f93928a     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.Object r5 = r5.mo17428b()     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            android.content.Context r5 = (android.content.Context) r5     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r5.getClass()     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            g.a.a r6 = r3.f93929b     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.Object r6 = r6.mo17428b()     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.common.util.concurrent.da r6 = (com.google.common.util.concurrent.C60887da) r6     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r6.getClass()     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            g.a.a r3 = r3.f93930c     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.Object r3 = r3.mo17428b()     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            androidx.slice.m r3 = (androidx.slice.C4114m) r3     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r3.getClass()     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r2.getClass()     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r4.<init>(r5, r6, r3, r2)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            int[] r3 = r1.f93897e     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.common.util.concurrent.cx r3 = r1.mo39858a(r4, r3)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.apps.tiktok.tracing.contrib.b.f r3 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r3)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.android.libraries.search.assistant.performer.deviceactions.a.a.aq r5 = new com.google.android.libraries.search.assistant.performer.deviceactions.a.a.aq     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r5.<init>(r1, r4, r0, r2)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.common.util.concurrent.bg r4 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.apps.tiktok.tracing.contrib.b.f r3 = r3.mo51515h(r5, r4)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.android.libraries.search.assistant.performer.deviceactions.a.a.ar r4 = new com.google.android.libraries.search.assistant.performer.deviceactions.a.a.ar     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r4.<init>(r1, r0, r2)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.apps.tiktok.tracing.contrib.b.f r1 = r3.mo51515h(r4, r1)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            goto L_0x01b0
        L_0x018a:
            com.google.common.f.e r1 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35830as.f93893a     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r3 = "No slice uri provided, skip slice api flow"
            r5 = 51953(0xcaf1, float:7.2802E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r5)).mo56386p(r3)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
        L_0x0198:
            java.lang.String r1 = "Setting %s not supported by Slice API."
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r4 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35845bg.m64246f(r0)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r3[r2] = r4     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r1 = java.lang.String.format(r1, r3)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.assistant.e.j.kf r2 = com.google.assistant.p3897e.p3921j.C52235kf.UNAVAILABLE     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r2, r1)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
        L_0x01b0:
            com.google.apps.tiktok.tracing.contrib.b.f r1 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r1)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.android.libraries.search.assistant.performer.deviceactions.ar r2 = new com.google.android.libraries.search.assistant.performer.deviceactions.ar     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r2.<init>(r7, r0, r8)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.common.util.concurrent.da r8 = r7.f94030f     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.apps.tiktok.tracing.contrib.b.f r8 = r1.mo51516i(r2, r8)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.android.libraries.search.assistant.performer.deviceactions.as r1 = new com.google.android.libraries.search.assistant.performer.deviceactions.as     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r1.<init>(r7, r0)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.common.util.concurrent.da r2 = r7.f94030f     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.apps.tiktok.tracing.contrib.b.f r8 = r8.mo51516i(r1, r2)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.android.libraries.search.assistant.performer.deviceactions.at r1 = new com.google.android.libraries.search.assistant.performer.deviceactions.at     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r1.<init>(r0)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.common.util.concurrent.da r2 = r7.f94030f     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.apps.tiktok.tracing.contrib.b.f r8 = r8.mo51515h(r1, r2)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
        L_0x01d5:
            com.google.android.libraries.search.assistant.performer.deviceactions.av r1 = new com.google.android.libraries.search.assistant.performer.deviceactions.av     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r1.<init>(r7, r0)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.common.util.concurrent.bz r1 = com.google.apps.tiktok.tracing.C47810es.m84974n(r1)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.common.util.concurrent.C60856cj.m92911t(r8, r1, r2)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            return r8
        L_0x01e4:
            com.google.android.libraries.search.assistant.performer.deviceactions.c.c r8 = r7.f94029e     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r1 = "SETTING_UNSPECIFIED"
            com.google.net.a.a.b r2 = com.google.net.p4726a.p4727a.C62722b.INVALID_ARGUMENT     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            r8.mo39898f(r1, r2)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            com.google.android.libraries.search.assistant.performer.a.g r8 = new com.google.android.libraries.search.assistant.performer.a.g     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            java.lang.String r1 = "No slice setting uri or setting uri or setting id provided."
            r8.<init>((java.lang.String) r1)     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
            throw r8     // Catch:{ g -> 0x0202, RuntimeException -> 0x01f5 }
        L_0x01f5:
            r8 = move-exception
            com.google.android.libraries.search.assistant.performer.deviceactions.c.c r1 = r7.f94029e
            java.lang.String r0 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35845bg.m64246f(r0)
            com.google.net.a.a.b r2 = com.google.net.p4726a.p4727a.C62722b.INTERNAL
            r1.mo39895c(r0, r2)
            throw r8
        L_0x0202:
            r8 = move-exception
            com.google.android.libraries.search.assistant.performer.deviceactions.c.c r1 = r7.f94029e
            java.lang.String r0 = com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35845bg.m64246f(r0)
            com.google.net.a.a.b r2 = com.google.net.p4726a.p4727a.C62722b.INVALID_ARGUMENT
            r1.mo39895c(r0, r2)
            throw r8
        L_0x020f:
            r8 = move-exception
            com.google.net.a.a.b r0 = com.google.net.p4726a.p4727a.C62722b.INTERNAL
            r7.m64289c(r0)
            throw r8
        L_0x0216:
            r8 = move-exception
            goto L_0x0219
        L_0x0218:
            r8 = move-exception
        L_0x0219:
            com.google.net.a.a.b r0 = com.google.net.p4726a.p4727a.C62722b.INVALID_ARGUMENT
            r7.m64289c(r0)
            com.google.android.libraries.search.assistant.performer.a.g r0 = new com.google.android.libraries.search.assistant.performer.a.g
            r0.<init>((java.lang.Throwable) r8)
            throw r0
        L_0x0224:
            com.google.net.a.a.b r0 = com.google.net.p4726a.p4727a.C62722b.INVALID_ARGUMENT
            r7.m64289c(r0)
            com.google.android.libraries.search.assistant.performer.a.g r0 = new com.google.android.libraries.search.assistant.performer.a.g
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r1
            java.lang.String r8 = r8.f135936b
            r3[r4] = r8
            java.lang.String r8 = "ClientOp name is incorrect. Expected %1$s but instead got %2$s"
            java.lang.String r8 = java.lang.String.format(r8, r3)
            r0.<init>((java.lang.String) r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.deviceactions.C35894aw.mo20766a(com.google.assistant.e.j.dy):com.google.common.util.concurrent.cx");
    }
}
