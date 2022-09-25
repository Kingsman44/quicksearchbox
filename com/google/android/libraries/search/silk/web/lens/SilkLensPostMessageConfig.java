package com.google.android.libraries.search.silk.web.lens;

import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.silk.p3238b.p3239a.C41745c;
import com.google.android.libraries.web.p3408h.p3409a.p3410a.C43775a;
import com.google.android.libraries.web.postmessage.PostMessageConfig;
import com.google.common.p4522b.C58485gu;
import org.json.JSONObject;
import p3186j$.util.Optional;

/* compiled from: PG */
public abstract class SilkLensPostMessageConfig implements PostMessageConfig {
    /* renamed from: a */
    public final C43775a mo42598a() {
        return SilkLensMessageHandler.f106982a;
    }

    /* renamed from: b */
    public final C58485gu mo42599b() {
        return C41745c.f109096a;
    }

    /* renamed from: c */
    public final Optional mo42600c() {
        return Optional.m71637of(C41743a.f109087a);
    }

    /* renamed from: d */
    public final Optional mo42601d(JSONObject jSONObject) {
        return Optional.m71637of(C41743a.m73207h(jSONObject, "Lens", SilkLensMessageHandler.f106983b, C58485gu.m89845m()));
    }

    /* renamed from: e */
    public final boolean mo42602e() {
        return true;
    }
}
