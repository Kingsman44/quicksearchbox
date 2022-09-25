package com.google.android.apps.gsa.search.core.p6809l;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.knowledge.p4671b.C61781a;
import com.google.knowledge.p4671b.C61808b;
import com.google.knowledge.p4671b.C61817j;
import com.google.knowledge.p4671b.C61818k;
import com.google.protobuf.C63088z;
import p5591n.p5592a.p5593a.C71851b;

/* renamed from: com.google.android.apps.gsa.search.core.l.a */
/* compiled from: PG */
public final class C86152a {

    /* renamed from: a */
    public static final C59071e f232819a = C59071e.m91332i("com.google.android.apps.gsa.search.core.l.a");

    /* renamed from: b */
    public final C86161j f232820b;

    /* renamed from: c */
    private final PackageManager f232821c;

    /* renamed from: d */
    private final C84413ad f232822d;

    public C86152a(Context context, C84413ad adVar, C86161j jVar) {
        this.f232820b = jVar;
        this.f232821c = context.getPackageManager();
        adVar.getClass();
        this.f232822d = adVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076 A[Catch:{ ct -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0090 A[Catch:{ ct -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4 A[Catch:{ ct -> 0x00d2 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.knowledge.p4671b.C61790ai m138561c(java.lang.String r4, android.os.Bundle r5, long r6) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x00e0
            com.google.knowledge.b.g r1 = com.google.knowledge.p4671b.C61814g.f166984j     // Catch:{ ct -> 0x00d2 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ ct -> 0x00d2 }
            com.google.knowledge.b.e r1 = (com.google.knowledge.p4671b.C61812e) r1     // Catch:{ ct -> 0x00d2 }
            r1.copyOnWrite()     // Catch:{ ct -> 0x00d2 }
            com.google.protobuf.bv r2 = r1.instance     // Catch:{ ct -> 0x00d2 }
            com.google.knowledge.b.g r2 = (com.google.knowledge.p4671b.C61814g) r2     // Catch:{ ct -> 0x00d2 }
            int r3 = r2.f166986a     // Catch:{ ct -> 0x00d2 }
            r3 = r3 | 1
            r2.f166986a = r3     // Catch:{ ct -> 0x00d2 }
            r2.f166987b = r4     // Catch:{ ct -> 0x00d2 }
            com.google.knowledge.b.ai r4 = com.google.knowledge.p4671b.C61790ai.f166898o     // Catch:{ ct -> 0x00d2 }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ ct -> 0x00d2 }
            com.google.knowledge.b.ah r4 = (com.google.knowledge.p4671b.C61789ah) r4     // Catch:{ ct -> 0x00d2 }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r2
            r4.copyOnWrite()     // Catch:{ ct -> 0x00d2 }
            com.google.protobuf.bv r2 = r4.instance     // Catch:{ ct -> 0x00d2 }
            com.google.knowledge.b.ai r2 = (com.google.knowledge.p4671b.C61790ai) r2     // Catch:{ ct -> 0x00d2 }
            int r3 = r2.f166900a     // Catch:{ ct -> 0x00d2 }
            r3 = r3 | 2
            r2.f166900a = r3     // Catch:{ ct -> 0x00d2 }
            r2.f166901b = r6     // Catch:{ ct -> 0x00d2 }
            if (r5 == 0) goto L_0x00b3
            java.lang.String r6 = "com.google.search.assist.SIMULATED_QUERY"
            java.lang.String r6 = r5.getString(r6)     // Catch:{ ct -> 0x00d2 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ ct -> 0x00d2 }
            if (r7 != 0) goto L_0x0055
            r1.copyOnWrite()     // Catch:{ ct -> 0x00d2 }
            com.google.protobuf.bv r7 = r1.instance     // Catch:{ ct -> 0x00d2 }
            com.google.knowledge.b.g r7 = (com.google.knowledge.p4671b.C61814g) r7     // Catch:{ ct -> 0x00d2 }
            r6.getClass()     // Catch:{ ct -> 0x00d2 }
            int r2 = r7.f166986a     // Catch:{ ct -> 0x00d2 }
            r2 = r2 | 32
            r7.f166986a = r2     // Catch:{ ct -> 0x00d2 }
            r7.f166992g = r6     // Catch:{ ct -> 0x00d2 }
        L_0x0055:
            java.lang.String r6 = "com.google.search.assist.URI"
            java.lang.Object r6 = r5.get(r6)     // Catch:{ ct -> 0x00d2 }
            if (r6 != 0) goto L_0x005f
        L_0x005d:
            r6 = r0
            goto L_0x0070
        L_0x005f:
            boolean r7 = r6 instanceof java.lang.String     // Catch:{ ct -> 0x00d2 }
            if (r7 == 0) goto L_0x0066
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ ct -> 0x00d2 }
            goto L_0x0070
        L_0x0066:
            boolean r7 = r6 instanceof android.net.Uri     // Catch:{ ct -> 0x00d2 }
            if (r7 == 0) goto L_0x005d
            android.net.Uri r6 = (android.net.Uri) r6     // Catch:{ ct -> 0x00d2 }
            java.lang.String r6 = r6.toString()     // Catch:{ ct -> 0x00d2 }
        L_0x0070:
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ ct -> 0x00d2 }
            if (r7 != 0) goto L_0x0088
            r4.copyOnWrite()     // Catch:{ ct -> 0x00d2 }
            com.google.protobuf.bv r7 = r4.instance     // Catch:{ ct -> 0x00d2 }
            com.google.knowledge.b.ai r7 = (com.google.knowledge.p4671b.C61790ai) r7     // Catch:{ ct -> 0x00d2 }
            r6.getClass()     // Catch:{ ct -> 0x00d2 }
            int r2 = r7.f166900a     // Catch:{ ct -> 0x00d2 }
            r2 = r2 | 128(0x80, float:1.794E-43)
            r7.f166900a = r2     // Catch:{ ct -> 0x00d2 }
            r7.f166906g = r6     // Catch:{ ct -> 0x00d2 }
        L_0x0088:
            java.lang.String r6 = "com.google.search.assist.DETAILS_PAGE"
            byte[] r5 = r5.getByteArray(r6)     // Catch:{ ct -> 0x00d2 }
            if (r5 == 0) goto L_0x00a1
            int r6 = r5.length     // Catch:{ ct -> 0x00d2 }
            if (r6 != 0) goto L_0x0094
            goto L_0x00a1
        L_0x0094:
            com.google.protobuf.ba r6 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x00d2 }
            com.google.knowledge.b.ag r7 = com.google.knowledge.p4671b.C61788ag.f166893c     // Catch:{ ct -> 0x00d2 }
            com.google.protobuf.bv r5 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r7, (byte[]) r5, (com.google.protobuf.C62921ba) r6)     // Catch:{ ct -> 0x00d2 }
            com.google.knowledge.b.ag r5 = (com.google.knowledge.p4671b.C61788ag) r5     // Catch:{ ct -> 0x00d2 }
            goto L_0x00a2
        L_0x00a1:
            r5 = r0
        L_0x00a2:
            if (r5 == 0) goto L_0x00b3
            r4.copyOnWrite()     // Catch:{ ct -> 0x00d2 }
            com.google.protobuf.bv r6 = r4.instance     // Catch:{ ct -> 0x00d2 }
            com.google.knowledge.b.ai r6 = (com.google.knowledge.p4671b.C61790ai) r6     // Catch:{ ct -> 0x00d2 }
            r6.f166902c = r5     // Catch:{ ct -> 0x00d2 }
            int r5 = r6.f166900a     // Catch:{ ct -> 0x00d2 }
            r5 = r5 | 8
            r6.f166900a = r5     // Catch:{ ct -> 0x00d2 }
        L_0x00b3:
            r4.copyOnWrite()     // Catch:{ ct -> 0x00d2 }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ ct -> 0x00d2 }
            com.google.knowledge.b.ai r5 = (com.google.knowledge.p4671b.C61790ai) r5     // Catch:{ ct -> 0x00d2 }
            com.google.protobuf.bv r6 = r1.build()     // Catch:{ ct -> 0x00d2 }
            com.google.knowledge.b.g r6 = (com.google.knowledge.p4671b.C61814g) r6     // Catch:{ ct -> 0x00d2 }
            r6.getClass()     // Catch:{ ct -> 0x00d2 }
            r5.f166903d = r6     // Catch:{ ct -> 0x00d2 }
            int r6 = r5.f166900a     // Catch:{ ct -> 0x00d2 }
            r6 = r6 | 16
            r5.f166900a = r6     // Catch:{ ct -> 0x00d2 }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ ct -> 0x00d2 }
            com.google.knowledge.b.ai r4 = (com.google.knowledge.p4671b.C61790ai) r4     // Catch:{ ct -> 0x00d2 }
            return r4
        L_0x00d2:
            r4 = move-exception
            com.google.common.f.e r5 = f232819a
            com.google.common.f.x r5 = r5.mo56225c()
            java.lang.String r6 = "Could not read proto"
            r7 = 7624(0x1dc8, float:1.0683E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r4)).mo56372aa(r7)).mo56386p(r6)
        L_0x00e0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6809l.C86152a.m138561c(java.lang.String, android.os.Bundle, long):com.google.knowledge.b.ai");
    }

    /* renamed from: d */
    public static String m138562d(UsageInfo usageInfo) {
        Account account;
        DocumentContents documentContents = usageInfo.f387566e;
        if (documentContents == null || (account = documentContents.f387433d) == null || !"com.google".equals(account.type)) {
            return null;
        }
        String str = account.name;
        return account.name;
    }

    /* renamed from: e */
    public static void m138563e(C71851b bVar, C61817j jVar) {
        C52091ex exVar = ((C61818k) jVar.instance).f167015o;
        if (exVar == null) {
            exVar = C52091ex.f136710b;
        }
        C52090ew ewVar = (C52090ew) exVar.toBuilder();
        int i = 0;
        while (true) {
            if (i >= ((C52091ex) ewVar.instance).f136712a.size()) {
                C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
                kbVar.copyOnWrite();
                C52232kc kcVar = (C52232kc) kbVar.instance;
                kcVar.f137064a |= 1;
                kcVar.f137065b = "com.google.android.deskclock";
                C52230ka g = m138565g(bVar);
                kbVar.copyOnWrite();
                C52232kc kcVar2 = (C52232kc) kbVar.instance;
                g.getClass();
                kcVar2.f137066c = g;
                kcVar2.f137064a |= 2;
                ewVar.mo53792e((C52232kc) kbVar.build());
                break;
            }
            C52232kc b = ewVar.mo53789b(i);
            if ((b.f137064a & 1) != 0 && b.f137065b.equals("com.google.android.deskclock")) {
                C52231kb kbVar2 = (C52231kb) b.toBuilder();
                C52230ka g2 = m138565g(bVar);
                kbVar2.copyOnWrite();
                C52232kc kcVar3 = (C52232kc) kbVar2.instance;
                g2.getClass();
                kcVar3.f137066c = g2;
                kcVar3.f137064a |= 2;
                ewVar.mo53794g(i, kbVar2);
                break;
            }
            i++;
        }
        jVar.copyOnWrite();
        C61818k kVar = (C61818k) jVar.instance;
        C52091ex exVar2 = (C52091ex) ewVar.build();
        exVar2.getClass();
        kVar.f167015o = exVar2;
        kVar.f167001a |= C89885b.HTTP_VALUE;
    }

    /* renamed from: f */
    public static boolean m138564f(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return true;
        }
        return TextUtils.equals(str, str2);
    }

    /* renamed from: g */
    private static C52230ka m138565g(C71851b bVar) {
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "search.mdi.search.SchemaOrgProperty";
        C63088z byteString = bVar.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        return (C52230ka) jzVar.build();
    }

    /* renamed from: a */
    public final Bundle mo79789a() {
        String a = this.f232820b.mo79804a();
        if (a == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("android.intent.extra.ASSIST_PACKAGE", a);
        return bundle;
    }

    /* renamed from: b */
    public final C61808b mo79790b(String str) {
        try {
            PackageInfo packageInfo = this.f232821c.getPackageInfo(str, 0);
            boolean i = this.f232822d.mo77972i(str);
            C61781a aVar = (C61781a) C61808b.f166967h.createBuilder();
            aVar.copyOnWrite();
            C61808b bVar = (C61808b) aVar.instance;
            str.getClass();
            bVar.f166969a |= 1;
            bVar.f166970b = str;
            long j = (long) packageInfo.versionCode;
            aVar.copyOnWrite();
            C61808b bVar2 = (C61808b) aVar.instance;
            bVar2.f166969a |= 2;
            bVar2.f166971c = j;
            aVar.copyOnWrite();
            C61808b bVar3 = (C61808b) aVar.instance;
            bVar3.f166969a |= 4;
            bVar3.f166972d = i;
            return (C61808b) aVar.build();
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f232819a.mo56225c()).mo56382g(e)).mo56372aa(7621)).mo56386p("Could not find package");
            return null;
        }
    }
}
