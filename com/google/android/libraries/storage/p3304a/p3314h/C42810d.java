package com.google.android.libraries.storage.p3304a.p3314h;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42742c;
import com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42747h;
import com.google.common.base.C58827ar;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.p4433bz.p4437b.C57897b;
import com.google.p4433bz.p4437b.C57900e;
import com.google.p4433bz.p4437b.C57901f;
import com.google.p4433bz.p4437b.C57903h;
import com.google.p4433bz.p4437b.C57905j;
import com.google.p4433bz.p4437b.C57906k;
import com.google.p4433bz.p4437b.C57907l;
import com.google.p4433bz.p4437b.C57909n;
import com.google.p4433bz.p4437b.C57911p;
import java.io.UnsupportedEncodingException;
import p3186j$.net.URLEncoder;

/* renamed from: com.google.android.libraries.storage.a.h.d */
/* compiled from: PG */
public final class C42810d {

    /* renamed from: a */
    public static final C57907l f112073a;

    static {
        C57906k kVar = (C57906k) C57907l.f154887c.createBuilder();
        C57897b bVar = C57897b.f154867a;
        kVar.copyOnWrite();
        C57907l lVar = (C57907l) kVar.instance;
        bVar.getClass();
        lVar.f154890b = bVar;
        lVar.f154889a = 1;
        C57907l lVar2 = (C57907l) kVar.build();
        C57906k kVar2 = (C57906k) C57907l.f154887c.createBuilder();
        C57903h hVar = C57903h.f154879c;
        kVar2.copyOnWrite();
        C57907l lVar3 = (C57907l) kVar2.instance;
        hVar.getClass();
        lVar3.f154890b = hVar;
        lVar3.f154889a = 2;
        f112073a = (C57907l) kVar2.build();
        C57906k kVar3 = (C57906k) C57907l.f154887c.createBuilder();
        C57905j jVar = C57905j.f154883c;
        kVar3.copyOnWrite();
        C57907l lVar4 = (C57907l) kVar3.instance;
        jVar.getClass();
        lVar4.f154890b = jVar;
        lVar4.f154889a = 3;
        C57907l lVar5 = (C57907l) kVar3.build();
    }

    /* renamed from: a */
    public static String m75633a(C57909n nVar) {
        C58480gp e = C58485gu.m89837e();
        for (C57907l b : nVar.f154893a) {
            e.mo55395g(m75634b(b));
        }
        return C42747h.m75525b(e.mo55394f());
    }

    /* renamed from: c */
    private static final String m75635c(String str) {
        try {
            return URLEncoder.encode(str, C42742c.f112003a.displayName());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    public static String m75634b(C57907l lVar) {
        C57903h hVar;
        C57905j jVar;
        C57911p pVar;
        C57901f fVar;
        String str;
        int i = lVar.f154889a;
        boolean z = false;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            return "compress";
        } else {
            if (i3 == 1) {
                if (i == 2) {
                    hVar = (C57903h) lVar.f154890b;
                } else {
                    hVar = C57903h.f154879c;
                }
                if (hVar.f154881a != 1) {
                    return "encrypt";
                }
                return "encrypt(aes_gcm_key=" + m75635c((String) hVar.f154882b) + ")";
            } else if (i3 == 2) {
                if (i == 3) {
                    jVar = (C57905j) lVar.f154890b;
                } else {
                    jVar = C57905j.f154883c;
                }
                if (jVar.f154885a != 1) {
                    return "integrity";
                }
                return "integrity(sha256=" + m75635c((String) jVar.f154886b) + ")";
            } else if (i3 == 3) {
                if (i == 4) {
                    pVar = (C57911p) lVar.f154890b;
                } else {
                    pVar = C57911p.f154894c;
                }
                if (1 == (pVar.f154896a & 1)) {
                    z = true;
                }
                C58838bb.m90868c(z);
                return "zip(target=" + m75635c(pVar.f154897b) + ")";
            } else if (i3 == 4) {
                if (i == 5) {
                    fVar = (C57901f) lVar.f154890b;
                } else {
                    fVar = C57901f.f154874c;
                }
                if (fVar.f154877b.size() > 0) {
                    C58480gp e = C58485gu.m89837e();
                    for (C57900e eVar : fVar.f154877b) {
                        C58838bb.m90868c(1 == (eVar.f154871a & 1));
                        if ((eVar.f154871a & 2) != 0) {
                            e.mo55395g(eVar.f154872b + "=" + m75635c(eVar.f154873c));
                        } else {
                            e.mo55395g(eVar.f154872b);
                        }
                    }
                    str = "(" + new C58827ar(",").mo56097d(e.mo55394f()) + ")";
                } else {
                    str = BuildConfig.FLAVOR;
                }
                return String.valueOf(fVar.f154876a).concat(str);
            } else {
                throw new IllegalArgumentException("No transform specified");
            }
        }
    }
}
