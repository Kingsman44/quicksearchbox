package com.google.android.libraries.assistant.p1363c.p1371b.p1379f;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17036ac;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17037ad;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.b.f.u */
/* compiled from: PG */
public final class C17158u {

    /* renamed from: a */
    private static final C58974d f49865a = C58974d.m91136j();

    /* renamed from: a */
    public static Optional m34308a(C17036ac acVar) {
        Object obj;
        if ((acVar.f49642a & 1) == 0) {
            C62940bt r0 = C62942bv.checkIsLite(C17037ad.f49646a);
            acVar.mo58887l(r0);
            if (!acVar.f169962ag.mo58857o(r0.f169971d)) {
                return Optional.empty();
            }
            C62940bt r02 = C62942bv.checkIsLite(C17037ad.f49646a);
            acVar.mo58887l(r02);
            Object l = acVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            return Optional.m71637of((String) obj);
        }
        ((C58970a) ((C58970a) f49865a.mo56226d()).mo56372aa(42626)).mo56389s("Reading the file group name of %s from the deprecated field.", acVar.f49643b);
        return Optional.m71637of(acVar.f49643b);
    }
}
