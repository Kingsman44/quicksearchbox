package com.google.android.libraries.assistant.trainingcache.p1618c;

import com.google.android.libraries.assistant.trainingcache.bindings.EkhoEventReader;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.speech.p5228m.C67270aa;
import com.google.speech.p5228m.C67305bi;
import com.google.speech.p5228m.C67333cj;
import com.google.speech.p5228m.C67359w;

/* renamed from: com.google.android.libraries.assistant.trainingcache.c.f */
/* compiled from: PG */
public final class C19445f {

    /* renamed from: a */
    private static final C59071e f54376a = C59071e.m91332i("com.google.android.libraries.assistant.trainingcache.c.f");

    /* renamed from: a */
    public static C58485gu m37136a(C67270aa aaVar, C67305bi biVar, int i) {
        C58480gp e = C58485gu.m89837e();
        EkhoEventReader ekhoEventReader = new EkhoEventReader();
        try {
            ekhoEventReader.mo24633b(aaVar, biVar);
            for (C67359w wVar : ekhoEventReader.mo24632a(i)) {
                e.mo55395g((C67333cj) C62942bv.parseFrom((C62942bv) C67333cj.f183016c, wVar.f183091c, C62921ba.m95368a()));
            }
        } catch (C62974ct e2) {
            ((C59052c) ((C59052c) ((C59052c) f54376a.mo56226d()).mo56382g(e2)).mo56372aa(47864)).mo56386p("Failed to process speech learning scheduling result.");
        } catch (Throwable th) {
            try {
                ekhoEventReader.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th2});
                } catch (Exception unused) {
                }
            }
            throw th;
        }
        ekhoEventReader.close();
        return e.mo55394f();
    }
}
