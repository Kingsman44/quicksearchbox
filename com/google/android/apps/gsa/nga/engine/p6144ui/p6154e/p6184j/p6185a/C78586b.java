package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6184j.p6185a;

import com.google.common.base.C58869cf;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p5238v.p5239a.C67486a;
import com.google.p5238v.p5239a.C67545c;
import com.google.p5238v.p5239a.C67637h;
import com.google.p5238v.p5239a.C67906v;
import com.google.p5238v.p5239a.p5240a.C67487a;
import com.google.protobuf.C63088z;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.j.a.b */
/* compiled from: PG */
public final class C78586b {

    /* renamed from: a */
    public static final C58881cr f216379a = C58886cw.m90973a(C78582a.f216339a);

    /* renamed from: b */
    private static final C59071e f216380b = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.e.j.a.b");

    /* renamed from: c */
    private static final C67906v f216381c = new C67637h(new ByteArrayInputStream("{\"primaryKeyId\": 515279322,\n\"key\": [{\n\"keyData\": {\n\"typeUrl\": \"type.googleapis.com/google.crypto.tink.AesGcmKey\",\n\"keyMaterialType\": \"SYMMETRIC\",\n\"value\": \"GhCS/1+ejWpx68NfGt6ziYHd\"\n},\n\"outputPrefixType\": \"TINK\",\n\"keyId\": 515279322,\n\"status\": \"ENABLED\"\n}]}\n".getBytes(C67637h.f183584a)));

    /* renamed from: d */
    private static final C63088z f216382d = C63088z.m96139A(new byte[]{1, 30, -74, -119, -38, -115, -101, 83, -112, 54, 20, -91, 69, -4, 77, 43, -2, 37, 34, 48, 118, 72, -33, 102, -123, -100, 94, 22, 49, 83, 91, 2, 54, -58, -50, 83, -119, 76, -10, 58, -45, -91, -108, 84, -126, 52, -31, -30, 119, 29, -96, 121, 87, -18, -124, 51, 69, -95, -113, 25, -51, -119, -127, 110, 18, -87, -122, 99, 56, -53, -38, 85, -101, -54, 83, 56, -24, -22, 126, -71, Byte.MAX_VALUE, -119, -15, 102, -66, -91, -33, 60, -38, -45, 61, 56, -111, -113, 95, 79, 60, -64, -61, -93, 54, -6, -89, 80, -113, 16, -124, -70, -2, -99, 3, -21, -71, -39, 31, 60, -74, 40, 87, -4, 50, -113, -42, 20, 0, -15, 41, 99, 125, -84, 97, -27, 21, -80, -109, 12, -70, 51, 2, -53, -87, -38, -52, -103, 14, 80, -121, Byte.MIN_VALUE});

    /* renamed from: a */
    public static C58528ij m126272a() {
        try {
            C67487a.m97483a();
            return C58528ij.m90005E(C58869cf.m90936b(new C58903m(10)).mo56153g(new String(((C67486a) C67545c.m97647a(f216381c).mo60041c(C67486a.class)).mo59877a(f216382d.mo59174N(), new byte[0]), StandardCharsets.UTF_8)));
        } catch (IOException | GeneralSecurityException e) {
            C59104x c = f216380b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AvsAllowlist");
            ((C59052c) ((C59052c) c).mo56372aa(5219)).mo56389s("Allowlist decryption error: %s", e.getMessage());
            return C58733pz.f156496a;
        }
    }
}
