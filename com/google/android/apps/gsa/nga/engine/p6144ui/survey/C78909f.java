package com.google.android.apps.gsa.nga.engine.p6144ui.survey;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.survey.f */
/* compiled from: PG */
public final class C78909f {
    /* renamed from: a */
    public static C62942bv m126789a(Bundle bundle, String str, C63010eb ebVar) {
        ProtoParcelable protoParcelable = (ProtoParcelable) bundle.getParcelable(str);
        if (protoParcelable == null) {
            return null;
        }
        return C23245b.m43557b(protoParcelable, ebVar, C62921ba.m95368a(), true);
    }
}
