package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.p3723ar.imp.view.C48004n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.measurement.internal.eg */
/* compiled from: PG */
public final class C145335eg {

    /* renamed from: a */
    public Bundle f392830a;

    /* renamed from: b */
    final /* synthetic */ C145339ek f392831b;

    /* renamed from: c */
    private final String f392832c = "default_event_parameters";

    /* renamed from: d */
    private final Bundle f392833d = new Bundle();

    public C145335eg(C145339ek ekVar) {
        this.f392831b = ekVar;
        C143919bh.m233969l("default_event_parameters");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:36|37|46) */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r11.f392831b.f393011w.mo120965ar().f392795c.mo120894a("Error reading value from SharedPreferences. Value dropped");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00a0 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0098 A[Catch:{ NumberFormatException | JSONException -> 0x00a0 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo120913a() {
        /*
            r11 = this;
            android.os.Bundle r0 = r11.f392830a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            com.google.android.gms.measurement.internal.ek r0 = r11.f392831b
            android.content.SharedPreferences r0 = r0.mo120921a()
            java.lang.String r1 = r11.f392832c
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L_0x00c5
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ JSONException -> 0x00b6 }
            r1.<init>()     // Catch:{ JSONException -> 0x00b6 }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00b6 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x00b6 }
            r0 = 0
            r3 = 0
        L_0x0020:
            int r4 = r2.length()     // Catch:{ JSONException -> 0x00b6 }
            if (r3 >= r4) goto L_0x00b3
            org.json.JSONObject r4 = r2.getJSONObject(r3)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            java.lang.String r5 = "n"
            java.lang.String r5 = r4.getString(r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            java.lang.String r6 = "t"
            java.lang.String r6 = r4.getString(r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            int r7 = r6.hashCode()     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            r8 = 100
            r9 = 2
            r10 = 1
            if (r7 == r8) goto L_0x005d
            r8 = 108(0x6c, float:1.51E-43)
            if (r7 == r8) goto L_0x0053
            r8 = 115(0x73, float:1.61E-43)
            if (r7 == r8) goto L_0x0049
            goto L_0x0067
        L_0x0049:
            java.lang.String r7 = "s"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0067
            r7 = 0
            goto L_0x0068
        L_0x0053:
            java.lang.String r7 = "l"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0067
            r7 = 2
            goto L_0x0068
        L_0x005d:
            java.lang.String r7 = "d"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0067
            r7 = 1
            goto L_0x0068
        L_0x0067:
            r7 = -1
        L_0x0068:
            java.lang.String r8 = "v"
            if (r7 == 0) goto L_0x0098
            if (r7 == r10) goto L_0x008c
            if (r7 == r9) goto L_0x0080
            com.google.android.gms.measurement.internal.ek r4 = r11.f392831b     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            com.google.android.gms.measurement.internal.ff r4 = r4.f393011w     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            com.google.android.gms.measurement.internal.dx r4 = r4.mo120965ar()     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            com.google.android.gms.measurement.internal.dv r4 = r4.f392795c     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            java.lang.String r5 = "Unrecognized persisted bundle type. Type"
            r4.mo120895b(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            goto L_0x00af
        L_0x0080:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            long r6 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            r1.putLong(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            goto L_0x00af
        L_0x008c:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            double r6 = java.lang.Double.parseDouble(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            r1.putDouble(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            goto L_0x00af
        L_0x0098:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            r1.putString(r5, r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a0 }
            goto L_0x00af
        L_0x00a0:
            com.google.android.gms.measurement.internal.ek r4 = r11.f392831b     // Catch:{ JSONException -> 0x00b6 }
            com.google.android.gms.measurement.internal.ff r4 = r4.f393011w     // Catch:{ JSONException -> 0x00b6 }
            com.google.android.gms.measurement.internal.dx r4 = r4.mo120965ar()     // Catch:{ JSONException -> 0x00b6 }
            com.google.android.gms.measurement.internal.dv r4 = r4.f392795c     // Catch:{ JSONException -> 0x00b6 }
            java.lang.String r5 = "Error reading value from SharedPreferences. Value dropped"
            r4.mo120894a(r5)     // Catch:{ JSONException -> 0x00b6 }
        L_0x00af:
            int r3 = r3 + 1
            goto L_0x0020
        L_0x00b3:
            r11.f392830a = r1     // Catch:{ JSONException -> 0x00b6 }
            goto L_0x00c5
        L_0x00b6:
            com.google.android.gms.measurement.internal.ek r0 = r11.f392831b
            com.google.android.gms.measurement.internal.ff r0 = r0.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            r0.mo120894a(r1)
        L_0x00c5:
            android.os.Bundle r0 = r11.f392830a
            if (r0 != 0) goto L_0x00cd
            android.os.Bundle r0 = r11.f392833d
            r11.f392830a = r0
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145335eg.mo120913a():void");
    }

    /* renamed from: b */
    public final void mo120914b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f392831b.mo120921a().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f392832c);
        } else {
            String str = this.f392832c;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(C48004n.f124238a, str2);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put(C42181t.f110467a, C59002s.f156871a);
                        } else if (obj instanceof Long) {
                            jSONObject.put(C42181t.f110467a, "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put(C42181t.f110467a, "d");
                        } else {
                            this.f392831b.f393011w.mo120965ar().f392795c.mo120895b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        this.f392831b.f393011w.mo120965ar().f392795c.mo120895b("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f392830a = bundle;
    }
}
