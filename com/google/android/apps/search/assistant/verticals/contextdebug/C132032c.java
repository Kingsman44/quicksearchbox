package com.google.android.apps.search.assistant.verticals.contextdebug;

import android.content.Intent;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50540h;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.contrib.android.ProtoParsers;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.assistant.verticals.contextdebug.c */
/* compiled from: PG */
public final /* synthetic */ class C132032c implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C132035f f360393a;

    public /* synthetic */ C132032c(C132035f fVar) {
        this.f360393a = fVar;
    }

    public final Object get() {
        Intent intent = this.f360393a.f360397b.getIntent();
        if (intent == null || !intent.hasExtra("data")) {
            return Optional.empty();
        }
        try {
            return Optional.ofNullable((C50540h) ProtoParsers.m95519b(intent, "data", C50540h.f131534h, C62921ba.m95368a()));
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) C132035f.f360396a.mo56225c()).mo56382g(e)).mo56372aa(39501)).mo56386p("Error parsing proto.");
            return Optional.empty();
        }
    }
}
