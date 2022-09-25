package com.google.android.apps.gsa.speech.hotword.p7285c.p7288c;

import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89052h;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;
import com.google.android.apps.gsa.shared.p7045k.p7047b.C89800c;
import com.google.android.apps.gsa.shared.p7045k.p7047b.C89805h;
import com.google.android.apps.gsa.shared.p7045k.p7047b.C89806i;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.speech.hotword.p7285c.p7287b.C92361a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.net.URL;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.speech.hotword.c.c.f */
/* compiled from: PG */
public final class C92368f {

    /* renamed from: a */
    public static final C92367e f257545a;

    /* renamed from: b */
    private static final C59071e f257546b = C59071e.m91332i("com.google.android.apps.gsa.speech.hotword.c.c.f");

    /* renamed from: c */
    private final C68214a f257547c;

    /* renamed from: d */
    private final C68214a f257548d;

    /* renamed from: e */
    private final C89052h f257549e;

    static {
        C92366d g = C92367e.m151678g();
        ((C92363a) g).f257524d = C58833ax.m90834k("Corrupted message");
        f257545a = g.mo87006a();
    }

    public C92368f(C68214a aVar, C68214a aVar2, C89052h hVar) {
        this.f257547c = aVar;
        this.f257548d = aVar2;
        this.f257549e = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x009b A[Catch:{ JSONException -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a0 A[Catch:{ JSONException -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ae A[Catch:{ JSONException -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00af A[Catch:{ JSONException -> 0x00ef }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.apps.gsa.speech.hotword.p7285c.p7288c.C92367e m151685a(com.google.android.apps.gsa.shared.p6968aa.C89057m r10) {
        /*
            java.lang.String r0 = "retryable"
            java.lang.String r1 = "error"
            java.lang.String r2 = "error_code"
            java.lang.String r3 = "can_enroll"
            java.lang.String r4 = "ready"
            java.lang.String r5 = "Something went wrong!"
            com.google.android.apps.gsa.shared.aa.i r10 = r10.mo83034a()     // Catch:{ IOException -> 0x0020 }
            java.nio.ByteBuffer r10 = r10.mo83032c()     // Catch:{ IOException -> 0x0020 }
            java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x0020 }
            byte[] r10 = r10.array()     // Catch:{ IOException -> 0x0020 }
            java.nio.charset.Charset r7 = p3186j$.nio.charset.StandardCharsets.UTF_8     // Catch:{ IOException -> 0x0020 }
            r6.<init>(r10, r7)     // Catch:{ IOException -> 0x0020 }
            goto L_0x002f
        L_0x0020:
            r10 = move-exception
            com.google.common.f.e r6 = f257546b
            com.google.common.f.x r6 = r6.mo56225c()
            java.lang.String r7 = "Parsing HttpResponse."
            r8 = 12593(0x3131, float:1.7647E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r10)).mo56372aa(r8)).mo56386p(r7)
            r6 = r5
        L_0x002f:
            boolean r10 = r6.equals(r5)
            if (r10 != 0) goto L_0x0100
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ef }
            r10.<init>(r6)     // Catch:{ JSONException -> 0x00ef }
            boolean r5 = r10.has(r4)     // Catch:{ JSONException -> 0x00ef }
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x004a
            boolean r4 = r10.getBoolean(r4)     // Catch:{ JSONException -> 0x00ef }
            if (r4 == 0) goto L_0x004a
            r4 = 1
            goto L_0x004b
        L_0x004a:
            r4 = 0
        L_0x004b:
            boolean r5 = r10.has(r3)     // Catch:{ JSONException -> 0x00ef }
            if (r5 == 0) goto L_0x0059
            boolean r3 = r10.getBoolean(r3)     // Catch:{ JSONException -> 0x00ef }
            if (r3 == 0) goto L_0x0059
            r3 = 1
            goto L_0x005a
        L_0x0059:
            r3 = 0
        L_0x005a:
            com.google.android.apps.gsa.speech.hotword.c.c.c[] r5 = com.google.android.apps.gsa.speech.hotword.p7285c.p7288c.C92365c.values()     // Catch:{ JSONException -> 0x00ef }
            boolean r8 = r10.has(r2)     // Catch:{ JSONException -> 0x00ef }
            if (r8 == 0) goto L_0x0069
            int r2 = r10.getInt(r2)     // Catch:{ JSONException -> 0x00ef }
            goto L_0x006f
        L_0x0069:
            com.google.android.apps.gsa.speech.hotword.c.c.c r2 = com.google.android.apps.gsa.speech.hotword.p7285c.p7288c.C92365c.NO_ERROR     // Catch:{ JSONException -> 0x00ef }
            int r2 = r2.ordinal()     // Catch:{ JSONException -> 0x00ef }
        L_0x006f:
            r2 = r5[r2]     // Catch:{ JSONException -> 0x00ef }
            if (r3 != 0) goto L_0x0094
            com.google.common.f.e r5 = f257546b     // Catch:{ JSONException -> 0x00ef }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ JSONException -> 0x00ef }
            java.lang.String r8 = "#getCanEnrollState errorCode: %s"
            r9 = 12588(0x312c, float:1.764E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r9)).mo56389s(r8, r2)     // Catch:{ JSONException -> 0x00ef }
            int r5 = r2.ordinal()     // Catch:{ JSONException -> 0x00ef }
            if (r5 == 0) goto L_0x0094
            r8 = 8
            if (r5 == r8) goto L_0x0092
            r8 = 9
            if (r5 == r8) goto L_0x0090
            r5 = 0
            goto L_0x0095
        L_0x0090:
            r5 = 2
            goto L_0x0095
        L_0x0092:
            r5 = 4
            goto L_0x0095
        L_0x0094:
            r5 = 1
        L_0x0095:
            boolean r8 = r10.has(r1)     // Catch:{ JSONException -> 0x00ef }
            if (r8 == 0) goto L_0x00a0
            java.lang.String r1 = r10.getString(r1)     // Catch:{ JSONException -> 0x00ef }
            goto L_0x00a2
        L_0x00a0:
            java.lang.String r1 = ""
        L_0x00a2:
            boolean r8 = r10.has(r0)     // Catch:{ JSONException -> 0x00ef }
            if (r8 == 0) goto L_0x00af
            boolean r10 = r10.getBoolean(r0)     // Catch:{ JSONException -> 0x00ef }
            if (r10 == 0) goto L_0x00af
            goto L_0x00b0
        L_0x00af:
            r6 = 0
        L_0x00b0:
            com.google.android.apps.gsa.speech.hotword.c.c.d r10 = com.google.android.apps.gsa.speech.hotword.p7285c.p7288c.C92367e.m151678g()     // Catch:{ JSONException -> 0x00ef }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ JSONException -> 0x00ef }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ JSONException -> 0x00ef }
            r4 = r10
            com.google.android.apps.gsa.speech.hotword.c.c.a r4 = (com.google.android.apps.gsa.speech.hotword.p7285c.p7288c.C92363a) r4     // Catch:{ JSONException -> 0x00ef }
            r4.f257521a = r0     // Catch:{ JSONException -> 0x00ef }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ JSONException -> 0x00ef }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ JSONException -> 0x00ef }
            r3 = r10
            com.google.android.apps.gsa.speech.hotword.c.c.a r3 = (com.google.android.apps.gsa.speech.hotword.p7285c.p7288c.C92363a) r3     // Catch:{ JSONException -> 0x00ef }
            r3.f257522b = r0     // Catch:{ JSONException -> 0x00ef }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ JSONException -> 0x00ef }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ JSONException -> 0x00ef }
            r3 = r10
            com.google.android.apps.gsa.speech.hotword.c.c.a r3 = (com.google.android.apps.gsa.speech.hotword.p7285c.p7288c.C92363a) r3     // Catch:{ JSONException -> 0x00ef }
            r3.f257523c = r0     // Catch:{ JSONException -> 0x00ef }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r1)     // Catch:{ JSONException -> 0x00ef }
            r1 = r10
            com.google.android.apps.gsa.speech.hotword.c.c.a r1 = (com.google.android.apps.gsa.speech.hotword.p7285c.p7288c.C92363a) r1     // Catch:{ JSONException -> 0x00ef }
            r1.f257524d = r0     // Catch:{ JSONException -> 0x00ef }
            r10.mo87007b(r5)     // Catch:{ JSONException -> 0x00ef }
            r10.mo87008c(r2)     // Catch:{ JSONException -> 0x00ef }
            com.google.android.apps.gsa.speech.hotword.c.c.e r10 = r10.mo87006a()     // Catch:{ JSONException -> 0x00ef }
            return r10
        L_0x00ef:
            r10 = move-exception
            com.google.common.f.e r0 = f257546b
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "JSONException parsing CheckReadyStatus response."
            r2 = 12591(0x312f, float:1.7644E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r10)).mo56372aa(r2)).mo56386p(r1)
            com.google.android.apps.gsa.speech.hotword.c.c.e r10 = f257545a
            return r10
        L_0x0100:
            com.google.android.apps.gsa.speech.hotword.c.c.e r10 = f257545a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.hotword.p7285c.p7288c.C92368f.m151685a(com.google.android.apps.gsa.shared.aa.m):com.google.android.apps.gsa.speech.hotword.c.c.e");
    }

    /* renamed from: c */
    private static String m151686c(C92361a aVar, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("user_id", str);
        jSONObject.put("play_ready_message", false);
        if (aVar == C92361a.ENROLL_CLOUD) {
            jSONObject.put("fetch_enrollment", true);
            jSONObject.put("fetch_token", "token");
        } else if (aVar == C92361a.IS_SPEAKER_ID_SUPPORTED_CHECK) {
            jSONObject.put("check_can_enroll", true);
        }
        if (str2 != null) {
            jSONObject.put("version_info", str2);
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public final C60870cx mo87018b(boolean z, URL url, C92361a aVar, String str, String str2) {
        if (z) {
            C89806i iVar = new C89806i();
            iVar.f243089b.put("Content-Type", "application/json");
            iVar.f243089b.put("Origin", "https://www.google.com");
            return ((C89805h) this.f257548d.mo27525b()).mo83661a(iVar, url, true, new C89800c(m151686c(aVar, str, str2), "application/json"), 29);
        }
        C89019aq d = C89020ar.m144759d();
        d.f241236b = url;
        d.mo82990b("Content-Type", "application/json");
        d.mo82990b("Origin", "https://www.google.com");
        d.f241245k = 29;
        C89020ar.m144761h(5000);
        d.f241246l = 5000;
        C89020ar.m144761h(5000);
        d.f241247m = 5000;
        C89020ar a = d.mo82989a();
        C89068x a2 = C89009ag.m144715a(ByteBuffer.wrap(m151686c(aVar, str, str2).getBytes(C90772bp.f253863a)), this.f257549e);
        C89012aj ajVar = (C89012aj) this.f257547c.mo27525b();
        return ajVar.mo27495f(a, a2, ajVar.mo27510b(C89066v.f241382a));
    }
}
