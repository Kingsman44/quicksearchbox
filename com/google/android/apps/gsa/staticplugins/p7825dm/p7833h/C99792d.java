package com.google.android.apps.gsa.staticplugins.p7825dm.p7833h;

import android.location.Location;
import com.google.android.apps.gsa.search.core.p6500ac.C84410n;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.h.d */
/* compiled from: PG */
public final /* synthetic */ class C99792d implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C84410n f279191a;

    public /* synthetic */ C99792d(C84410n nVar) {
        this.f279191a = nVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C84410n nVar = this.f279191a;
        Location location = (Location) obj;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("latitude", location.getLatitude());
            jSONObject2.put("longitude", location.getLongitude());
            jSONObject2.put("accuracy", (double) location.getAccuracy());
            jSONObject.put("coords", jSONObject2);
            jSONObject.put("timestamp", location.getTime());
            nVar.mo77962d(jSONObject.toString());
        } catch (JSONException e) {
            throw new AssertionError(e);
        } catch (JSONException e2) {
            throw new AssertionError(e2);
        }
    }
}
