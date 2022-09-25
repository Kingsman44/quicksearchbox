package com.google.android.libraries.home.p1940a.p1943c.p1944a;

import com.google.android.libraries.home.p1940a.p1943c.C23542dp;
import com.google.android.libraries.home.p1940a.p1943c.C23568eo;
import com.google.protobuf.C63037fb;
import com.google.protobuf.C63063ga;
import java.util.Collections;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.a.z */
/* compiled from: PG */
public final class C23397z extends C23568eo {

    /* renamed from: a */
    public static final C23396y f63960a = new C23396y();

    /* renamed from: c */
    public static final C23397z f63961c;

    static {
        C63037fb fbVar = C63037fb.f170144b;
        C69664n.m101060f(fbVar, "getDefaultInstance()");
        f63961c = new C23397z(fbVar, false);
    }

    public C23397z(C63037fb fbVar, boolean z) {
        super(C23542dp.CAMERA_STREAM_HOST, fbVar, z, false, (String) null, (String) null);
        C63063ga gaVar = (C63063ga) Collections.unmodifiableMap(this.f64499b.f170146a).get("nexustalk");
        if (gaVar != null && gaVar.f170181a == 3) {
            String str = (String) gaVar.f170182b;
        }
        C63063ga gaVar2 = (C63063ga) Collections.unmodifiableMap(this.f64499b.f170146a).get("hlsmaster");
        if (gaVar2 != null && gaVar2.f170181a == 3) {
            String str2 = (String) gaVar2.f170182b;
        }
        C63063ga gaVar3 = (C63063ga) Collections.unmodifiableMap(this.f64499b.f170146a).get("mpegdash");
        if (gaVar3 != null && gaVar3.f170181a == 3) {
            String str3 = (String) gaVar3.f170182b;
        }
    }
}
