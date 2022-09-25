package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a;

import com.google.android.apps.gsa.nga.shared.p6274a.C80058d;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.common.p4526f.C59052c;
import com.google.p4242bp.p4266g.C56359i;
import com.google.p4242bp.p4266g.C56361k;
import com.google.p4242bp.p4266g.C56364n;
import com.google.protos.p4985f.p5048z.p5051b.p5052a.C65402d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.a.n */
/* compiled from: PG */
public final /* synthetic */ class C122603n implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C122603n f339774a = new C122603n();

    private /* synthetic */ C122603n() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C80058d dVar = (C80058d) obj;
        C56359i iVar = (C56359i) C122589ai.m202002c(dVar.f219692a).toBuilder();
        if (!dVar.f219693b.isEmpty()) {
            String str = dVar.f219693b;
            iVar.copyOnWrite();
            C56364n nVar = (C56364n) iVar.instance;
            str.getClass();
            nVar.f150312a |= C89885b.HTTP_VALUE;
            nVar.f150318g = str;
            int a = C56361k.m87978a(dVar.f219694c);
            if (a == 0) {
                ((C59052c) ((C59052c) C122589ai.f339760c.mo56226d()).mo56372aa(34916)).mo56387q("RecognitionAlternateSource unknown proto enum value %s.", dVar.f219694c);
                iVar.copyOnWrite();
                C56364n nVar2 = (C56364n) iVar.instance;
                nVar2.f150316e = 0;
                nVar2.f150312a |= 16384;
            } else {
                iVar.copyOnWrite();
                C56364n nVar3 = (C56364n) iVar.instance;
                nVar3.f150316e = a - 1;
                nVar3.f150312a |= 16384;
                C65402d dVar2 = dVar.f219695d;
                if (dVar2 == null) {
                    dVar2 = C65402d.f177817a;
                }
                iVar.copyOnWrite();
                C56364n nVar4 = (C56364n) iVar.instance;
                dVar2.getClass();
                nVar4.f150317f = dVar2;
                nVar4.f150312a |= 32768;
            }
        }
        return (C56364n) iVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
