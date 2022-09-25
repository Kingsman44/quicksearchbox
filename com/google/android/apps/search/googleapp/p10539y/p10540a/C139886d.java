package com.google.android.apps.search.googleapp.p10539y.p10540a;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.p046a.C0809b;
import com.google.android.apps.search.googleapp.saves.savefeature.C137281b;
import com.google.android.apps.search.googleapp.saves.savefeature.C137300h;
import com.google.android.apps.search.googleapp.saves.savefeature.p10397b.C137282a;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.contrib.android.ProtoParsers;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.y.a.d */
/* compiled from: PG */
final class C139886d extends C0809b {

    /* renamed from: a */
    final /* synthetic */ C139887e f380288a;

    public C139886d(C139887e eVar) {
        this.f380288a = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Intent mo613a(Context context, Object obj) {
        return C137282a.m223047a((C137300h) obj, this.f380288a.f380289a);
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo614b(int i, Intent intent) {
        if (intent == null) {
            return Optional.empty();
        }
        if (intent.getParcelableExtra("SAVE_FEATURE_ACTIVITY_RESULT") == null) {
            return Optional.empty();
        }
        try {
            return Optional.m71637of((C137281b) ProtoParsers.m95519b(intent, "SAVE_FEATURE_ACTIVITY_RESULT", C137281b.f373475c, C62921ba.m95368a()));
        } catch (C62974ct unused) {
            return Optional.empty();
        }
    }
}
