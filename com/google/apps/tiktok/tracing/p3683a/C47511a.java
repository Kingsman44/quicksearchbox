package com.google.apps.tiktok.tracing.p3683a;

import android.util.JsonWriter;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46669g;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.apps.tiktok.tracing.C47556bg;
import com.google.apps.tiktok.tracing.C47814ew;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C63088z;
import java.io.StringWriter;
import java.util.Collection;

/* renamed from: com.google.apps.tiktok.tracing.a.a */
/* compiled from: PG */
public final /* synthetic */ class C47511a implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C47512b f123346a;

    /* renamed from: b */
    public final /* synthetic */ C46677o f123347b;

    public /* synthetic */ C47511a(C47512b bVar, C46677o oVar) {
        this.f123346a = bVar;
        this.f123347b = oVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C46669g gVar;
        C58485gu j;
        Integer num;
        C47512b bVar = this.f123346a;
        C58485gu b = this.f123347b.mo50698b();
        int size = b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                gVar = C47512b.f121943k;
                break;
            }
            int i2 = i + 1;
            if (((C46667e) b.get(i)) == C46667e.TEXT) {
                Collection values = bVar.f123348a.mo51404a().values();
                synchronized (bVar.f123349b) {
                    j = C58485gu.m89842j(bVar.f123349b);
                }
                C58431eu<C47814ew> c = C58431eu.m89653c(j, values);
                StringWriter stringWriter = new StringWriter();
                try {
                    JsonWriter jsonWriter = new JsonWriter(stringWriter);
                    jsonWriter.setIndent("  ");
                    jsonWriter.beginObject();
                    jsonWriter.name("format");
                    jsonWriter.value(1);
                    jsonWriter.name("traces");
                    jsonWriter.beginArray();
                    for (C47814ew ewVar : c) {
                        jsonWriter.beginArray();
                        for (C47556bg bgVar : ewVar.f123835d) {
                            jsonWriter.beginArray();
                            jsonWriter.value((long) bgVar.f123408c);
                            jsonWriter.value(bgVar.f123407b);
                            jsonWriter.value(bgVar.f123410e);
                            jsonWriter.value(bgVar.f123410e + bgVar.f123411f);
                            int i3 = bgVar.f123409d;
                            if (i3 == -1) {
                                num = null;
                            } else {
                                num = Integer.valueOf(i3);
                            }
                            jsonWriter.value(num);
                            jsonWriter.endArray();
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endArray();
                    jsonWriter.endObject();
                    jsonWriter.flush();
                    String stringWriter2 = stringWriter.toString();
                    stringWriter.close();
                    C46663a aVar = new C46663a();
                    aVar.mo50684b(false);
                    aVar.mo50686d(C46667e.TEXT);
                    aVar.f121916a = C63088z.m96143E(stringWriter2);
                    gVar = aVar.mo50683a();
                } catch (Throwable th) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                    } catch (Exception unused) {
                    }
                }
            } else {
                i = i2;
            }
        }
        return C60856cj.m92900i(gVar);
        throw th;
    }
}
