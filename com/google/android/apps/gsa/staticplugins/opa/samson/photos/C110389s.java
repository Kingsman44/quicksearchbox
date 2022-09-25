package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.net.Uri;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.s */
/* compiled from: PG */
public final /* synthetic */ class C110389s implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C110318ad f307665a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f307666b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f307667c;

    public /* synthetic */ C110389s(C110318ad adVar, C58833ax axVar, C58833ax axVar2) {
        this.f307665a = adVar;
        this.f307666b = axVar;
        this.f307667c = axVar2;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C110318ad adVar = this.f307665a;
        C58833ax axVar = this.f307666b;
        C58833ax axVar2 = this.f307667c;
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(8, 2);
            boolean z = true;
            if (!axVar.mo56113h()) {
                if (!axVar2.mo56113h()) {
                    z = false;
                }
            }
            jSONArray.put(6, z);
            if (axVar.mo56113h()) {
                jSONArray.put(5, axVar.mo56107c());
            }
            if (axVar2.mo56113h()) {
                jSONArray.put(12, axVar2.mo56107c());
            }
        } catch (JSONException e) {
            C59104x c = C110318ad.f307474a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BDClient");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25828)).mo56386p("json exception");
        }
        Uri build = Uri.parse(adVar.f307475b.mo79758x(C90014bt.f247056U)).buildUpon().appendEncodedPath("photo-album-metadata").appendQueryParameter("f.req", jSONArray.toString()).appendQueryParameter("rt", "b").build();
        C58976aa aaVar = C58975e.f156826a;
        return adVar.f307479f.mo28209i(adVar.mo98569b(build), "parse response", C110393w.f307672a);
    }
}
