package com.google.android.apps.search.assistant.libraries.p8979j.p8983c;

import android.util.Base64;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4541l.C59332o;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58131b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/* renamed from: com.google.android.apps.search.assistant.libraries.j.c.b */
/* compiled from: PG */
public final class C119436b {

    /* renamed from: a */
    private static final C58974d f332954a = C58974d.m91136j();

    /* renamed from: a */
    public static C58131b m198169a(String str) {
        if (str == null) {
            return null;
        }
        return m198170b(Base64.decode(str, 10));
    }

    /* renamed from: b */
    public static C58131b m198170b(byte[] bArr) {
        C63088z zVar;
        C63087y v;
        if (bArr == null) {
            return null;
        }
        try {
            C58131b bVar = (C58131b) C62942bv.parseFrom((C62942bv) C58131b.f155403h, bArr, C62921ba.m95368a());
            if ((bVar.f155405a & 1) == 0) {
                return bVar;
            }
            C63088z zVar2 = bVar.f155406b;
            if (zVar2.mo59173M()) {
                zVar = C63088z.f170246b;
            } else {
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(zVar2.mo59041m());
                    try {
                        v = C63088z.m96150v();
                        C59332o.m92211b(gZIPInputStream, v);
                        C63088z b = v.mo59165b();
                        v.close();
                        gZIPInputStream.close();
                        zVar = b;
                    } catch (Throwable th) {
                        gZIPInputStream.close();
                        throw th;
                    }
                } catch (IOException e) {
                    ((C58970a) ((C58970a) ((C58970a) f332954a.mo56226d()).mo56382g(e)).mo56372aa(34423)).mo56386p("Failed to decompress ClientDataHeader value.");
                    zVar = C63088z.f170246b;
                } catch (Throwable th2) {
                    C119435a.m198168a(th, th2);
                }
            }
            return m198170b(zVar.mo59174N());
        } catch (C62974ct e2) {
            ((C58970a) ((C58970a) ((C58970a) f332954a.mo56226d()).mo56382g(e2)).mo56372aa(34424)).mo56386p("Failed to parse ClientDataHeader value.");
            return null;
        }
        throw th;
    }
}
