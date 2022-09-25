package com.google.android.apps.gsa.assistant.settings.features.p540ae.p541a;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C50282rh;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.a.aa */
/* compiled from: PG */
public final class C9860aa implements C68220f {
    /* renamed from: a */
    public static C50282rh m24621a(Context context) {
        try {
            C50282rh rhVar = (C50282rh) C62942bv.parseFrom((C62942bv) C50282rh.f130762c, context.getResources().openRawResource(R.raw.main_page_categorization_pb), C62921ba.m95368a());
            C68225k.m98532d(rhVar);
            return rhVar;
        } catch (IOException e) {
            throw new IllegalStateException("Failed to read main_page_categorization.", e);
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
