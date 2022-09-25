package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.slicecard.p9806a.p9807a;

import android.net.Uri;
import androidx.slice.Slice;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60866ct;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.slicecard.a.a.a */
/* compiled from: PG */
final class C129266a implements Function {

    /* renamed from: a */
    final /* synthetic */ C129271f f355052a;

    public C129266a(C129271f fVar) {
        this.f355052a = fVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Uri uri = (Uri) obj;
        C129271f fVar = this.f355052a;
        C69664n.m101060f(uri, "it");
        C129269d dVar = new C129269d(uri, fVar);
        try {
            fVar.f355064d.mo8628c(uri, dVar);
            Slice a = fVar.f355064d.mo8626a(uri);
            if (a != null) {
                fVar.f355066f.put(uri, a);
                fVar.f355065e.mo50787a(C60866ct.f164955a, C129271f.f355062b);
            }
            C59052c cVar = (C59052c) C129271f.f355061a.mo56224b();
            cVar.mo56379ah(new C59094n(38229));
            cVar.mo56389s("Successfully bind to slice %s", uri);
            return dVar;
        } catch (Exception e) {
            fVar.f355064d.mo8630e(uri, dVar);
            throw e;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
