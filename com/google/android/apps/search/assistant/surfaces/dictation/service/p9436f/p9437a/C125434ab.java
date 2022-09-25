package com.google.android.apps.search.assistant.surfaces.dictation.service.p9436f.p9437a;

import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119297s;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125082bj;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125083bk;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125422z;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.p9477a.C126186a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9481b.C126319a;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64723b;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.f.a.ab */
/* compiled from: PG */
public final class C125434ab implements C35472h {

    /* renamed from: a */
    private static final C59071e f345919a = C59071e.m91331h();

    /* renamed from: b */
    private static final C125083bk f345920b;

    /* renamed from: c */
    private final C70862aj f345921c;

    /* renamed from: d */
    private final C125422z f345922d;

    static {
        C125082bj bjVar = (C125082bj) C125083bk.f345071c.createBuilder();
        bjVar.copyOnWrite();
        ((C125083bk) bjVar.instance).f345073a = 67;
        C62942bv build = bjVar.build();
        C69664n.m101060f(build, "newBuilder().setKeyCode(…vent.KEYCODE_DEL).build()");
        f345920b = (C125083bk) build;
    }

    public C125434ab(C70862aj ajVar, C125422z zVar) {
        C69664n.m101061g(ajVar, "requests");
        C69664n.m101061g(zVar, "dictationController");
        this.f345921c = ajVar;
        this.f345922d = zVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        int i;
        C69664n.m101061g(dyVar, "clientOp");
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        if (dwVar.f135932a.size() == 0) {
            C59052c cVar = (C59052c) f345919a.mo56226d();
            cVar.mo56379ah(new C59094n(36576));
            cVar.mo56386p("No action arguments provided. [SD]");
            return C60856cj.m92900i(C36180b.f94544a);
        }
        C64723b bVar = (C64723b) C126319a.m206551f(dyVar, "action_args", C64723b.f175443b.getParserForType());
        if (bVar == null) {
            C59052c cVar2 = (C59052c) f345919a.mo56226d();
            cVar2.mo56379ah(new C59094n(36575));
            cVar2.mo56386p("Action Argument is null. [SD]");
            return C60856cj.m92900i(C36180b.f94544a);
        }
        switch (bVar.f175445a) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            case 12:
                i = 14;
                break;
            case 13:
                i = 15;
                break;
            case 14:
                i = 16;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            i = 1;
        }
        switch (i - 2) {
            case 0:
                C59052c cVar3 = (C59052c) f345919a.mo56226d();
                cVar3.mo56379ah(new C59094n(36573));
                cVar3.mo56386p("Tried to perform an undefined action. [SD]");
                break;
            case 1:
                C126186a.m206399b(8, this.f345921c);
                break;
            case 2:
                C126186a.m206399b(7, this.f345921c);
                break;
            case 3:
                C126186a.m206399b(5, this.f345921c);
                break;
            case 4:
                C126186a.m206399b(6, this.f345921c);
                break;
            case 5:
                C59052c cVar4 = (C59052c) f345919a.mo56226d();
                cVar4.mo56379ah(new C59094n(36572));
                cVar4.mo56386p("No support for PASTE Action. [SD]");
                break;
            case 6:
                C126186a.m206399b(12, this.f345921c);
                break;
            case 7:
                return C126309ar.m206527f(this.f345922d.mo106967a(C119297s.REQUESTER_DICTATION_VOICE_COMMAND), C36180b.f94544a);
            case 8:
                C126186a.m206399b(16, this.f345921c);
                break;
            case 9:
                C126186a.m206399b(10, this.f345921c);
                break;
            case 10:
                C126186a.m206399b(11, this.f345921c);
                break;
            case 11:
                C126186a.m206398a(f345920b, this.f345921c);
                break;
            case 12:
                C126186a.m206399b(15, this.f345921c);
                break;
            case 13:
                C126186a.m206399b(17, this.f345921c);
                break;
            case 14:
                C126186a.m206399b(18, this.f345921c);
                break;
            default:
                C59052c cVar5 = (C59052c) f345919a.mo56226d();
                cVar5.mo56379ah(new C59094n(36574));
                cVar5.mo56386p("Tried to perform an unrecognized action. [SD]");
                break;
        }
        return C60856cj.m92900i(C36180b.f94544a);
    }
}
