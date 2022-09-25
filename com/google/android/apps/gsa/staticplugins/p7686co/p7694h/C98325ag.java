package com.google.android.apps.gsa.staticplugins.p7686co.p7694h;

import com.google.android.apps.gsa.proactive.C84179o;
import com.google.android.apps.p489g.C9136d;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4537i.C59277b;
import com.google.common.p4537i.C59294s;
import com.google.common.p4541l.C59326i;
import com.google.common.p4575r.C60761r;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7704gw;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.h.ag */
/* compiled from: PG */
public final class C98325ag {

    /* renamed from: a */
    public static final String f274465a = "0_7";

    /* renamed from: b */
    public static final String f274466b = "0_16";

    /* renamed from: c */
    public static final String f274467c = "0_19";

    /* renamed from: d */
    public static final String f274468d = "0_14";

    /* renamed from: e */
    public static final String f274469e = "0_17";

    /* renamed from: f */
    public static final String f274470f = "0_20";

    /* renamed from: g */
    public static final String f274471g = "0_18";

    /* renamed from: h */
    public static final String f274472h = "0_21";

    /* renamed from: i */
    public static final String f274473i = "0_6";

    /* renamed from: j */
    public static final String f274474j = "0_10";

    /* renamed from: k */
    public static final String f274475k = "0_12";

    /* renamed from: l */
    public static final String f274476l = "0_3";

    /* renamed from: m */
    private static final C58528ij f274477m = C58528ij.m90015O(f274465a, f274466b, f274467c, f274468d, f274469e, f274470f, f274471g, f274472h, f274473i, f274474j, f274475k, f274476l);

    /* renamed from: a */
    public static String m162876a(C9136d dVar) {
        C7669fo foVar = dVar.f31451b;
        if (foVar == null) {
            foVar = C7669fo.f26633e;
        }
        byte[] byteArray = foVar.toByteArray();
        String nVar = ((C59277b) C59294s.m92133c()).mo56761d(byteArray, byteArray.length).toString();
        return nVar + "_5";
    }

    /* renamed from: b */
    public static String m162877b(C7704gw gwVar) {
        String l = C59326i.f157519g.mo56825e().mo56837l(C60761r.m92760f(gwVar.f26887b), 8);
        return l + "_4";
    }

    /* renamed from: c */
    public static String m162878c(byte[] bArr) {
        String nVar = ((C59277b) C59294s.m92133c()).mo56761d(bArr, bArr.length).toString();
        return nVar + "_1";
    }

    /* renamed from: d */
    static String m162879d(C84179o oVar) {
        byte[] byteArray = oVar.toByteArray();
        String nVar = ((C59277b) C59294s.m92133c()).mo56761d(byteArray, byteArray.length).toString();
        return nVar + "_11";
    }

    /* renamed from: e */
    static boolean m162880e(String str) {
        return f274477m.contains(str) || m162881f(str, 6) || m162881f(str, 5) || m162881f(str, 2) || m162881f(str, 12);
    }

    /* renamed from: f */
    public static boolean m162881f(String str, int i) {
        String ch = Character.toString('_');
        StringBuilder sb = new StringBuilder();
        sb.append(ch);
        sb.append(i - 1);
        return str.endsWith(sb.toString());
    }
}
