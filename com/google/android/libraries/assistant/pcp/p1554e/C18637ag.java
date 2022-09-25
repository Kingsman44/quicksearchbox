package com.google.android.libraries.assistant.pcp.p1554e;

import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3803ag.p3809c.C49099gk;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.pcp.e.ag */
/* compiled from: PG */
public final /* synthetic */ class C18637ag implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C18650at f52663a;

    public /* synthetic */ C18637ag(C18650at atVar) {
        this.f52663a = atVar;
    }

    public final Object call() {
        return (C49099gk) C62942bv.parseFrom((C62942bv) C49099gk.f126983g, this.f52663a.f52677a.getResources().openRawResource(R.raw.proactive_config_binarypb), C62921ba.m95368a());
    }
}
