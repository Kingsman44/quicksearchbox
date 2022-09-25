package com.google.android.libraries.geller.p1818f.p1819a;

import android.content.pm.Signature;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59326i;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.libraries.geller.f.a.b */
/* compiled from: PG */
public final class C21787b {

    /* renamed from: a */
    public static final C59071e f60105a = C59071e.m91332i("com.google.android.libraries.geller.f.a.b");

    /* renamed from: a */
    public static C58833ax m40903a(Signature signature) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(signature.toByteArray());
            return C58833ax.m90833j(C59326i.f157519g.mo56825e().mo56837l(digest, digest.length));
        } catch (NoSuchAlgorithmException e) {
            ((C59052c) ((C59052c) ((C59052c) f60105a.mo56225c()).mo56382g(e)).mo56372aa(48021)).mo56386p("Failed to parse a signature");
            return C58836b.f156633a;
        }
    }
}
