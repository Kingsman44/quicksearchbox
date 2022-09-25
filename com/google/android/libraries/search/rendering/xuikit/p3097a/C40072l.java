package com.google.android.libraries.search.rendering.xuikit.p3097a;

import com.google.android.libraries.elements.interfaces.ResourceEntry;
import com.google.android.libraries.elements.interfaces.ResourceMetadata;
import com.google.android.libraries.elements.interfaces.ResourceType;
import com.google.protobuf.C63070h;
import com.google.protos.youtube.elements.p5168d.p5169a.C66186d;
import java.util.ArrayList;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.l */
/* compiled from: PG */
final class C40072l extends C69665o implements C69626l {

    /* renamed from: a */
    public static final C40072l f105286a = new C40072l();

    public C40072l() {
        super(1);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C66186d dVar = (C66186d) obj;
        ResourceMetadata resourceMetadata = new ResourceMetadata(dVar.f179973b, ResourceType.EML_TEMPLATE, (dVar.f179972a & 4) != 0 ? Long.valueOf(dVar.f179976e) : null, new ArrayList(dVar.f179975d), (String) null);
        C63070h hVar = dVar.f179974c;
        if (hVar == null) {
            hVar = C63070h.f170215c;
        }
        return new ResourceEntry(resourceMetadata, hVar.f170218b.mo59174N());
    }
}
