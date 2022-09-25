package com.google.android.libraries.search.rendering.xuikit.p3097a;

import com.google.protos.youtube.elements.p5168d.p5169a.C66186d;
import java.util.Set;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.k */
/* compiled from: PG */
final class C40071k extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C40073m f105285a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40071k(C40073m mVar) {
        super(1);
        this.f105285a = mVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        Set set = this.f105285a.f105289c;
        String str = ((C66186d) obj).f179973b;
        C69664n.m101060f(str, "it.identifier");
        return Boolean.valueOf(set.add(str));
    }
}
