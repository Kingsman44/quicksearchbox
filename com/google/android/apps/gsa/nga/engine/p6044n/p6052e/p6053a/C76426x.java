package com.google.android.apps.gsa.nga.engine.p6044n.p6052e.p6053a;

import com.google.android.apps.gsa.nga.engine.p6044n.p6052e.C76402a;
import com.google.android.apps.gsa.nga.engine.p6044n.p6052e.C76438k;
import com.google.android.apps.gsa.nga.engine.p6056o.C77426t;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.protos.p4850an.C63397bo;
import java.nio.charset.CharacterCodingException;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.e.a.x */
/* compiled from: PG */
public final class C76426x implements C76402a {

    /* renamed from: a */
    private static final C58974d f211570a = C58974d.m91136j();

    /* renamed from: a */
    public final boolean mo72188a(C76590bg bgVar, C77426t tVar, C76438k kVar) {
        C63397bo boVar;
        int i = -1;
        for (C61746h hVar : bgVar.f211837a.f166812c) {
            if (hVar.f166794b == 4) {
                if (i == -1) {
                    try {
                        String r = tVar.mo72525b().mo73746a().mo71164r();
                        int length = r.length();
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < length) {
                            char charAt = r.charAt(i2);
                            if (charAt < 2048) {
                                i3 += (127 - charAt) >>> 31;
                            } else {
                                i3 += 2;
                                if (charAt >= 55296 && charAt <= 57343) {
                                    if (Character.codePointAt(r, i2) != charAt) {
                                        i2++;
                                    } else {
                                        throw new CharacterCodingException();
                                    }
                                }
                            }
                            i2++;
                        }
                        i = i3;
                    } catch (CharacterCodingException e) {
                        ((C58970a) ((C58970a) ((C58970a) f211570a.mo56226d()).mo56382g(e)).mo56372aa(3558)).mo56386p("Incorrectly encoded query");
                        return false;
                    }
                }
                if (hVar.f166794b == 4) {
                    boVar = (C63397bo) hVar.f166795c;
                } else {
                    boVar = C63397bo.f171329c;
                }
                if (boVar.f171331a == 0 && boVar.f171332b == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo72189b(C76438k kVar) {
        return true;
    }
}
