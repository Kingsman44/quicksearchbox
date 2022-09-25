package com.google.research.p5181a.p5182a;

import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.research.p5181a.C66396y;
import com.google.research.p5181a.p5183b.p5184a.C66307h;
import com.google.research.p5181a.p5186d.C66343o;
import java.util.List;

/* renamed from: com.google.research.a.a.n */
/* compiled from: PG */
public final class C66291n {
    /* renamed from: a */
    public static String m96855a(String str) {
        return str.contains("/") ? (String) C58869cf.m90936b(new C58903m('/')).mo56155i(str).get(0) : str;
    }

    /* renamed from: b */
    public static String m96856b(C66307h hVar, String str) {
        String j = hVar.mo59490j();
        if (str.equals("direct_share")) {
            String k = hVar.mo59491k();
            return k + "/" + j;
        } else if (!str.equals("share_app")) {
            return null;
        } else {
            String str2 = ((C66396y) hVar.f180316a.instance).f180551k;
            return str2 + "/" + j;
        }
    }

    /* renamed from: c */
    public static C66343o m96857c(List list, C66343o oVar) {
        C66343o oVar2 = oVar;
        int size = list.size();
        int length = oVar2.f180409c.length + 9;
        C66343o oVar3 = new C66343o(size, length);
        int i = 0;
        while (i < size) {
            C66307h hVar = (C66307h) list.get(i);
            float d = hVar.mo59484d();
            float f = hVar.mo59486f();
            float a = hVar.mo59481a();
            float c = hVar.mo59483c();
            float i2 = hVar.mo59489i();
            float h = hVar.mo59488h();
            int i3 = size;
            float[] fArr = {d, f, a, c, i2, hVar.mo59487g(), h, hVar.mo59485e(), hVar.mo59482b()};
            int length2 = oVar2.f180409c.length;
            float[] fArr2 = new float[(length2 + 9)];
            for (int i4 = 0; i4 < length2; i4++) {
                fArr2[i4] = (float) oVar2.f180409c[i4];
            }
            for (int i5 = 0; i5 < 9; i5++) {
                fArr2[i5 + length2] = fArr[i5];
            }
            for (int i6 = 0; i6 < length; i6++) {
                oVar3.mo59559k(i, i6, (double) fArr2[i6]);
            }
            i++;
            size = i3;
        }
        return oVar3;
    }
}
