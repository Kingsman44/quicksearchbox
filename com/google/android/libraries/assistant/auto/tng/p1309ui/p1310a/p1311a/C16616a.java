package com.google.android.libraries.assistant.auto.tng.p1309ui.p1310a.p1311a;

import android.graphics.Bitmap;
import com.bumptech.glide.C5997p;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.data.C5929d;
import com.bumptech.glide.load.data.C5930e;
import com.bumptech.glide.load.p293a.C5673ap;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1310a.C16615a;
import java.util.Collections;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.a.a.a */
/* compiled from: PG */
public final class C16616a implements C5930e {

    /* renamed from: a */
    private final C16615a f48699a;

    /* renamed from: b */
    private final C16620e f48700b;

    public C16616a(C16615a aVar, C16620e eVar) {
        this.f48699a = aVar;
        this.f48700b = eVar;
    }

    /* renamed from: a */
    public final C5637a mo11921a() {
        return C5637a.REMOTE;
    }

    /* renamed from: b */
    public final Class mo11922b() {
        return Bitmap.class;
    }

    /* renamed from: c */
    public final void mo11923c() {
    }

    /* renamed from: d */
    public final void mo11924d() {
    }

    /* renamed from: e */
    public final void mo11925e(C5997p pVar, C5929d dVar) {
        C16620e eVar = this.f48700b;
        Optional ofNullable = Optional.ofNullable((Bitmap) eVar.f48709a.get(this.f48699a));
        if (ofNullable == null || !ofNullable.isPresent()) {
            dVar.mo12184g(new C5673ap("Auto image not found", Collections.emptyList()));
        } else {
            dVar.mo12183f(ofNullable.get());
        }
        C16620e eVar2 = this.f48700b;
        eVar2.f48709a.remove(this.f48699a);
    }
}
