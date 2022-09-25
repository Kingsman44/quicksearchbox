package com.google.android.apps.gsa.staticplugins.fedass.p7954l;

import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63088z;
import org.tensorflow.p5650a.C72642b;
import org.tensorflow.p5650a.C72646f;
import org.tensorflow.p5650a.C72654n;
import org.tensorflow.p5650a.C72660t;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.l.aa */
/* compiled from: PG */
final class C101120aa {

    /* renamed from: a */
    public static final C59071e f282316a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.l.aa");

    /* renamed from: a */
    public static String m167322a(C72660t tVar) {
        C72642b bVar;
        C72654n nVar = tVar.f193235a;
        if (nVar == null) {
            nVar = C72654n.f193226b;
        }
        C62995dn dnVar = nVar.f193228a;
        C72646f fVar = dnVar.containsKey("audio_path") ? (C72646f) dnVar.get("audio_path") : null;
        if (fVar == null || fVar.f193217a != 1 || ((C72642b) fVar.f193218b).f193211a.size() == 0) {
            return null;
        }
        if (fVar.f193217a == 1) {
            bVar = (C72642b) fVar.f193218b;
        } else {
            bVar = C72642b.f193209b;
        }
        return new String(((C63088z) bVar.f193211a.get(0)).mo59174N());
    }
}
