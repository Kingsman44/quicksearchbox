package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9302c.p9303a.p9304a;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.C122872ec;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protos.p4985f.p5030q.p5033c.C65108b;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.c.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C123145d implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ Context f340817a;

    public /* synthetic */ C123145d(Context context) {
        this.f340817a = context;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        try {
            C65108b bVar = (C65108b) C62942bv.parseFrom((C62942bv) C65108b.f176264c, this.f340817a.getResources().openRawResource(R.raw.min_tested_nga_data_release_binarypb), C62921ba.m95368a());
            if ((bVar.f176266a & 1) != 0) {
                return C60856cj.m92900i(Long.valueOf(bVar.f176267b));
            }
            throw new C122872ec("PopTestedResourcesInfoImpl", "No minimum tested resource version found in binary.");
        } catch (Exception e) {
            throw new C122872ec("PopTestedResourcesInfoImpl", "Unable to load proto with oldest tested resource version.", e);
        }
    }
}
