package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a;

import com.google.android.apps.gsa.nga.shared.p6274a.C80058d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4242bp.p4266g.C56357g;
import com.google.p4242bp.p4266g.C56358h;
import com.google.p4242bp.p4266g.C56361k;
import com.google.protos.p4985f.p5048z.p5051b.p5052a.C65402d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.a.m */
/* compiled from: PG */
public final /* synthetic */ class C122602m implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C122602m f339773a = new C122602m();

    private /* synthetic */ C122602m() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C80058d dVar = (C80058d) obj;
        C56357g gVar = (C56357g) C56358h.f150302e.createBuilder();
        String str = dVar.f219693b;
        gVar.copyOnWrite();
        C56358h hVar = (C56358h) gVar.instance;
        str.getClass();
        hVar.f150304a |= 1;
        hVar.f150305b = str;
        int a = C56361k.m87978a(dVar.f219694c);
        if (a == 0) {
            C59104x d = C122604o.f339775a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ATFCAC");
            ((C59052c) ((C59052c) d).mo56372aa(34914)).mo56387q("RecognitionAlternateSource unknown proto enum value %s.", dVar.f219694c);
            gVar.copyOnWrite();
            C56358h hVar2 = (C56358h) gVar.instance;
            hVar2.f150306c = 0;
            hVar2.f150304a |= 2;
        } else {
            gVar.copyOnWrite();
            C56358h hVar3 = (C56358h) gVar.instance;
            hVar3.f150306c = a - 1;
            hVar3.f150304a |= 2;
            C65402d dVar2 = dVar.f219695d;
            if (dVar2 == null) {
                dVar2 = C65402d.f177817a;
            }
            gVar.copyOnWrite();
            C56358h hVar4 = (C56358h) gVar.instance;
            dVar2.getClass();
            hVar4.f150307d = dVar2;
            hVar4.f150304a |= 4;
        }
        return (C56358h) gVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
