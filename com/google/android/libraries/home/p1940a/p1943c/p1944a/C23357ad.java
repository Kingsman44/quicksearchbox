package com.google.android.libraries.home.p1940a.p1943c.p1944a;

import com.google.android.libraries.home.p1940a.p1943c.C23542dp;
import com.google.android.libraries.home.p1940a.p1943c.C23568eo;
import com.google.protobuf.C63037fb;
import com.google.protobuf.C63063ga;
import java.util.Collections;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.a.ad */
/* compiled from: PG */
public final class C23357ad extends C23568eo {

    /* renamed from: a */
    public static final C23356ac f63886a = new C23356ac();

    /* renamed from: c */
    public static final C23357ad f63887c;

    static {
        C63037fb fbVar = C63037fb.f170144b;
        C69664n.m101060f(fbVar, "getDefaultInstance()");
        f63887c = new C23357ad(fbVar, false);
    }

    public C23357ad(C63037fb fbVar, boolean z) {
        super(C23542dp.CAMERA_STREAM_PLACEHOLDER_IMAGE, fbVar, z, false, (String) null, (String) null);
        C63063ga gaVar = (C63063ga) Collections.unmodifiableMap(fbVar.f170146a).get("imageUrl");
        if (gaVar != null && gaVar.f170181a == 3) {
            String str = (String) gaVar.f170182b;
        }
        C63063ga gaVar2 = (C63063ga) Collections.unmodifiableMap(fbVar.f170146a).get("timestampSeconds");
        if (gaVar2 != null && gaVar2.f170181a == 2) {
            ((Double) gaVar2.f170182b).doubleValue();
        }
        C63063ga gaVar3 = (C63063ga) Collections.unmodifiableMap(fbVar.f170146a).get("width");
        if (gaVar3 != null && gaVar3.f170181a == 2) {
            ((Double) gaVar3.f170182b).doubleValue();
        }
        C63063ga gaVar4 = (C63063ga) Collections.unmodifiableMap(fbVar.f170146a).get("height");
        if (gaVar4 != null && gaVar4.f170181a == 2) {
            ((Double) gaVar4.f170182b).doubleValue();
        }
    }
}
