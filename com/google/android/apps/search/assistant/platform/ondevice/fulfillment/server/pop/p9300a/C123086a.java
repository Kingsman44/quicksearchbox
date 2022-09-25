package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a;

import com.google.android.googlequicksearchbox.R;
import com.google.nlp.p4730a.C62798r;
import com.google.nlp.p4730a.C62799s;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.a */
/* compiled from: PG */
public final /* synthetic */ class C123086a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C123114d f340679a;

    public /* synthetic */ C123086a(C123114d dVar) {
        this.f340679a = dVar;
    }

    public final Object call() {
        C123114d dVar = this.f340679a;
        String str = dVar.f340753b;
        C62798r rVar = (C62798r) ((C62799s) C62942bv.parseFrom((C62942bv) C62799s.f169588g, dVar.f340752a.getResources().openRawResource(R.raw.five_minute_timer_created_genx_request), C62921ba.m95368a())).toBuilder();
        rVar.copyOnWrite();
        C62799s sVar = (C62799s) rVar.instance;
        sVar.f169590a |= 1;
        sVar.f169591b = str;
        return (C62799s) rVar.build();
    }
}
