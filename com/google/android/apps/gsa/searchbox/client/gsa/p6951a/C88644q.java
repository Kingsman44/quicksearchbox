package com.google.android.apps.gsa.searchbox.client.gsa.p6951a;

import android.content.SharedPreferences;
import android.util.Base64;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.shared.p6990an.C89208aa;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.MessageLite;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.a.q */
/* compiled from: PG */
public final class C88644q {

    /* renamed from: a */
    public static final C58485gu f239637a = C58485gu.m89848p(C89208aa.ALL_APPS, C89208aa.OPA, C89208aa.SUGGEST);

    /* renamed from: d */
    private static final C59071e f239638d = C59071e.m91332i("com.google.android.apps.gsa.searchbox.client.gsa.a.q");

    /* renamed from: b */
    public final C58881cr f239639b;

    /* renamed from: c */
    public final C58881cr f239640c;

    /* renamed from: e */
    private final SharedPreferences f239641e;

    /* renamed from: f */
    private final C86124t f239642f;

    public C88644q(SharedPreferences sharedPreferences, C86124t tVar, C118827a aVar) {
        this.f239641e = sharedPreferences;
        this.f239642f = tVar;
        this.f239639b = C58886cw.m90973a(new C88642o(aVar));
        this.f239640c = C58886cw.m90973a(new C88643p(aVar));
    }

    /* renamed from: d */
    static String m143297d(C89208aa aaVar) {
        C89208aa aaVar2 = C89208aa.NONE;
        int ordinal = aaVar.ordinal();
        if (ordinal == 2) {
            return "OPA_";
        }
        if (ordinal != 3) {
            return ordinal != 4 ? BuildConfig.FLAVOR : "TAPAS_";
        }
        return "ALL_APPS_";
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:16|15|17|18|14|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x006e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair mo82297a(com.google.android.apps.gsa.shared.p6990an.C89208aa r18, com.google.protobuf.MessageLite r19) {
        /*
            r17 = this;
            r0 = r17
            java.lang.String r1 = "rp"
            java.lang.String r2 = m143297d(r18)
            android.content.SharedPreferences r3 = r0.f239641e
            java.lang.String r4 = "zero_query_web_results"
            java.lang.String r5 = r2.concat(r4)
            r6 = 0
            java.lang.String r3 = r3.getString(r5, r6)
            android.content.SharedPreferences r5 = r0.f239641e
            java.lang.String r7 = "zero_prefix_last_update_timestamp"
            java.lang.String r8 = r2.concat(r7)
            r9 = 0
            long r13 = r5.getLong(r8, r9)
            android.content.SharedPreferences r5 = r0.f239641e
            java.lang.String r8 = "location_data_last_update_timestamp"
            java.lang.String r2 = r2.concat(r8)
            long r15 = r5.getLong(r2, r9)
            boolean r2 = com.google.common.base.C58837ba.m90859h(r3)
            if (r2 != 0) goto L_0x00be
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00be }
            r2.<init>(r3)     // Catch:{ JSONException -> 0x00be }
            java.lang.String r3 = "a"
            java.lang.String r3 = r2.getString(r3)     // Catch:{ JSONException -> 0x00be }
            java.lang.String r5 = "ver"
            r11 = 0
            int r5 = r2.optInt(r5, r11)     // Catch:{ JSONException -> 0x00be }
            boolean r12 = r2.has(r1)     // Catch:{ JSONException -> 0x00be }
            if (r12 == 0) goto L_0x00b1
            java.lang.String r1 = r2.getString(r1)     // Catch:{ JSONException -> 0x00be }
            if (r5 <= 0) goto L_0x005a
            r2 = 10
            byte[] r2 = android.util.Base64.decode(r1, r2)     // Catch:{ Exception -> 0x006d }
            goto L_0x005e
        L_0x005a:
            byte[] r2 = android.util.Base64.decode(r1, r11)     // Catch:{ Exception -> 0x006d }
        L_0x005e:
            com.google.protobuf.eb r11 = r19.getParserForType()     // Catch:{ Exception -> 0x006d }
            java.lang.Object r2 = r11.mo59010i(r2)     // Catch:{ Exception -> 0x006d }
            com.google.protobuf.MessageLite r2 = (com.google.protobuf.MessageLite) r2     // Catch:{ Exception -> 0x006d }
            r18.name()     // Catch:{ Exception -> 0x006e }
        L_0x006b:
            r12 = r2
            goto L_0x00b2
        L_0x006d:
            r2 = r6
        L_0x006e:
            java.lang.String r11 = m143297d(r18)     // Catch:{ JSONException -> 0x00be }
            android.content.SharedPreferences r12 = r0.f239641e     // Catch:{ JSONException -> 0x00be }
            android.content.SharedPreferences$Editor r12 = r12.edit()     // Catch:{ JSONException -> 0x00be }
            java.lang.String r4 = r11.concat(r4)     // Catch:{ JSONException -> 0x00be }
            android.content.SharedPreferences$Editor r4 = r12.putString(r4, r6)     // Catch:{ JSONException -> 0x00be }
            java.lang.String r7 = r11.concat(r7)     // Catch:{ JSONException -> 0x00be }
            android.content.SharedPreferences$Editor r4 = r4.putLong(r7, r9)     // Catch:{ JSONException -> 0x00be }
            java.lang.String r7 = r11.concat(r8)     // Catch:{ JSONException -> 0x00be }
            android.content.SharedPreferences$Editor r4 = r4.putLong(r7, r9)     // Catch:{ JSONException -> 0x00be }
            r4.apply()     // Catch:{ JSONException -> 0x00be }
            com.google.common.f.e r4 = f239638d     // Catch:{ JSONException -> 0x00be }
            com.google.common.f.x r4 = r4.mo56225c()     // Catch:{ JSONException -> 0x00be }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ JSONException -> 0x00be }
            r7 = 9841(0x2671, float:1.379E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r7)     // Catch:{ JSONException -> 0x00be }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ JSONException -> 0x00be }
            java.lang.String r7 = "#loadFromSettings - Error decoding in cacheMode %s with zp version: %d. Proto string: %s"
            java.lang.String r8 = r18.name()     // Catch:{ JSONException -> 0x00be }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x00be }
            r4.mo56359L(r7, r8, r5, r1)     // Catch:{ JSONException -> 0x00be }
            goto L_0x006b
        L_0x00b1:
            r12 = r6
        L_0x00b2:
            com.google.android.apps.gsa.searchbox.client.gsa.a.l r1 = new com.google.android.apps.gsa.searchbox.client.gsa.a.l     // Catch:{ JSONException -> 0x00be }
            r11 = r1
            r11.<init>(r12, r13, r15)     // Catch:{ JSONException -> 0x00be }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ JSONException -> 0x00be }
            r2.<init>(r3, r1)     // Catch:{ JSONException -> 0x00be }
            return r2
        L_0x00be:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.client.gsa.p6951a.C88644q.mo82297a(com.google.android.apps.gsa.shared.an.aa, com.google.protobuf.MessageLite):android.util.Pair");
    }

    /* renamed from: c */
    public final C89208aa mo82298c(C88616t tVar) {
        if (!tVar.f239556a.mo84405cl() || this.f239642f.mo79758x(C90085ej.f250233k).equals(this.f239642f.mo79758x(C90120fr.f250845l))) {
            return m143296b(tVar.f239557b);
        }
        return C89208aa.ALL_APPS;
    }

    /* renamed from: e */
    public final void mo82299e(C89208aa aaVar, String str, MessageLite messageLite, long j, long j2) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("a", str);
            if (messageLite != null) {
                jSONObject.put("rp", Base64.encodeToString(messageLite.toByteArray(), 10));
                jSONObject.put("ver", 1);
            }
            str2 = jSONObject.toString();
        } catch (JSONException unused) {
            str2 = null;
        }
        String d = m143297d(aaVar);
        this.f239641e.edit().putString(d.concat("zero_query_web_results"), str2).putLong(d.concat("zero_prefix_last_update_timestamp"), j).putLong(d.concat("location_data_last_update_timestamp"), j2).apply();
    }

    /* renamed from: b */
    public static C89208aa m143296b(int i) {
        if (i == 1) {
            return C89208aa.SUGGEST;
        }
        if (i != 7) {
            return C89208aa.NONE;
        }
        return C89208aa.OPA;
    }
}
