package com.google.firebase.p4610c;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.firebase.c.c */
/* compiled from: PG */
public final /* synthetic */ class C61129c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C61133g f165449a;

    public /* synthetic */ C61129c(C61133g gVar) {
        this.f165449a = gVar;
    }

    public final Object call() {
        String encodeToString;
        C61133g gVar = this.f165449a;
        synchronized (gVar) {
            C61138l lVar = (C61138l) gVar.f165455a.mo57687a();
            List a = lVar.mo57701a();
            lVar.mo57702b();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < a.size(); i++) {
                C61139m mVar = (C61139m) a.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", mVar.mo57690a());
                jSONObject.put("date", mVar.mo57691b());
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(jSONObject2.toString().getBytes());
            gZIPOutputStream.close();
            encodeToString = Base64.encodeToString(byteArrayOutputStream.toString("UTF-8").getBytes(), 11);
        }
        return encodeToString;
    }
}
