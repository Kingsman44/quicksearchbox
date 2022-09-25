package com.android.p275j.p276a;

import com.android.p275j.C5190b;
import com.android.p275j.C5202n;
import com.android.p275j.C5204p;
import com.android.p275j.C5210v;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.C31787a;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.C31824b;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.android.j.a.l */
/* compiled from: PG */
public class C5182l extends C5183m {
    public C5182l(String str, C31787a aVar, C31824b bVar) {
        super(str, aVar, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C5210v mo10267a(C5202n nVar) {
        C5190b bVar;
        long j;
        long j2;
        boolean z;
        long j3;
        long j4;
        C5202n nVar2 = nVar;
        try {
            byte[] bArr = nVar2.f16506b;
            Map map = nVar2.f16507c;
            String str = "utf-8";
            int i = 0;
            if (map != null) {
                String str2 = (String) map.get("Content-Type");
                if (str2 != null) {
                    String[] split = str2.split(";", 0);
                    int i2 = 1;
                    while (true) {
                        if (i2 >= split.length) {
                            break;
                        }
                        String[] split2 = split[i2].trim().split("=", 0);
                        if (split2.length == 2 && split2[0].equals("charset")) {
                            str = split2[1];
                            break;
                        }
                        i2++;
                    }
                }
            }
            JSONObject jSONObject = new JSONObject(new String(bArr, str));
            long currentTimeMillis = System.currentTimeMillis();
            Map map2 = nVar2.f16507c;
            if (map2 != null) {
                String str3 = (String) map2.get("Date");
                long j5 = 0;
                long a = str3 != null ? C5178h.m14136a(str3) : 0;
                String str4 = (String) map2.get("Cache-Control");
                if (str4 != null) {
                    String[] split3 = str4.split(",", 0);
                    j2 = 0;
                    j = 0;
                    int i3 = 0;
                    while (i < split3.length) {
                        String trim = split3[i].trim();
                        if (!trim.equals("no-cache")) {
                            if (!trim.equals("no-store")) {
                                if (trim.startsWith("max-age=")) {
                                    try {
                                        j2 = Long.parseLong(trim.substring(8));
                                    } catch (Exception unused) {
                                    }
                                } else if (trim.startsWith("stale-while-revalidate=")) {
                                    j = Long.parseLong(trim.substring(23));
                                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                                    i3 = 1;
                                }
                                i++;
                            }
                        }
                    }
                    i = i3;
                    z = true;
                } else {
                    j2 = 0;
                    j = 0;
                    z = false;
                }
                String str5 = (String) map2.get("Expires");
                long a2 = str5 != null ? C5178h.m14136a(str5) : 0;
                String str6 = (String) map2.get("Last-Modified");
                long a3 = str6 != null ? C5178h.m14136a(str6) : 0;
                String str7 = (String) map2.get("ETag");
                if (z) {
                    j5 = currentTimeMillis + (j2 * 1000);
                    if (i != 0) {
                        j4 = j5;
                    } else {
                        Long.signum(j);
                        j4 = j5 + (j * 1000);
                    }
                    j3 = j4;
                } else {
                    if (a > 0 && a2 >= a) {
                        j5 = currentTimeMillis + (a2 - a);
                    }
                    j3 = j5;
                }
                bVar = new C5190b();
                bVar.f16474a = nVar2.f16506b;
                bVar.f16475b = str7;
                bVar.f16479f = j5;
                bVar.f16478e = j3;
                bVar.f16476c = a;
                bVar.f16477d = a3;
                bVar.f16480g = map2;
                bVar.f16481h = nVar2.f16508d;
                return new C5210v(jSONObject, bVar);
            }
            bVar = null;
            return new C5210v(jSONObject, bVar);
        } catch (UnsupportedEncodingException e) {
            return new C5210v(new C5204p(e));
        } catch (JSONException e2) {
            return new C5210v(new C5204p(e2));
        }
    }
}
