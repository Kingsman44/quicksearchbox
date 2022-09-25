package com.google.android.libraries.gsa.p1929o.p1930a;

import android.text.TextUtils;
import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;
import com.google.speech.recognizer.p5233a.C67468p;
import com.google.speech.recognizer.p5233a.C67474v;
import com.google.speech.recognizer.p5233a.C67476x;

/* renamed from: com.google.android.libraries.gsa.o.a.a */
/* compiled from: PG */
public final class C23319a {

    /* renamed from: a */
    public final StringBuilder f63816a = new StringBuilder();

    /* renamed from: b */
    public boolean f63817b = false;

    /* renamed from: a */
    public final Pair mo28812a(C67438ag agVar) {
        StringBuilder sb;
        String str;
        if ((agVar.f183258a & 4) != 0) {
            C67442ak akVar = agVar.f183261d;
            if (akVar == null) {
                akVar = C67442ak.f183276i;
            }
            if (akVar.f183281d.size() > 0) {
                C67468p pVar = (C67468p) akVar.f183281d.get(0);
                if ((pVar.f183366a & 1) != 0) {
                    this.f63816a.append(pVar.f183367b);
                }
            }
        }
        StringBuilder sb2 = null;
        if ((agVar.f183258a & 8) != 0) {
            C67476x xVar = agVar.f183262e;
            if (xVar == null) {
                xVar = C67476x.f183390i;
            }
            int size = xVar.f183393b.size();
            StringBuilder sb3 = null;
            boolean z = false;
            for (int i = 0; i < size; i++) {
                C67474v vVar = (C67474v) xVar.f183393b.get(i);
                int i2 = vVar.f183386a;
                if ((i2 & 1) != 0) {
                    if (z || (i2 & 2) == 0 || vVar.f183388c < 0.9d) {
                        if (sb2 == null) {
                            sb2 = new StringBuilder();
                        }
                        sb2.append(vVar.f183387b);
                        z = true;
                    } else {
                        if (sb3 == null) {
                            sb3 = new StringBuilder(this.f63816a);
                        }
                        sb3.append(vVar.f183387b);
                        z = false;
                    }
                }
            }
            sb = sb2;
            sb2 = sb3;
        } else {
            sb = null;
        }
        if (sb2 == null) {
            str = this.f63816a.toString();
        } else {
            str = sb2.toString();
        }
        return Pair.create(str, sb == null ? BuildConfig.FLAVOR : sb.toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4522b.C58485gu mo28813b(com.google.speech.recognizer.p5233a.C67442ak r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0007
            com.google.common.b.gu r6 = com.google.common.p4522b.C58485gu.m89845m()
            return r6
        L_0x0007:
            com.google.common.b.gp r0 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.protobuf.cq r6 = r6.f183281d
            java.util.Iterator r6 = r6.iterator()
        L_0x0011:
            boolean r1 = r6.hasNext()
            java.lang.String r2 = ""
            r3 = 1
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r6.next()
            com.google.speech.recognizer.a.p r1 = (com.google.speech.recognizer.p5233a.C67468p) r1
            int r4 = r1.f183366a
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0027
            java.lang.String r2 = r1.f183367b
        L_0x0027:
            r0.mo55395g(r2)
            goto L_0x0011
        L_0x002b:
            com.google.common.b.gu r6 = r0.mo55394f()
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0037
            goto L_0x003e
        L_0x0037:
            java.lang.Object r0 = r6.get(r1)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x003e:
            r5.f63817b = r3
            java.lang.StringBuilder r0 = r5.f63816a
            int r3 = r0.length()
            r0.delete(r1, r3)
            java.lang.StringBuilder r0 = r5.f63816a
            r0.append(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.p1929o.p1930a.C23319a.mo28813b(com.google.speech.recognizer.a.ak):com.google.common.b.gu");
    }

    /* renamed from: c */
    public final boolean mo28814c() {
        return this.f63817b && TextUtils.isEmpty(this.f63816a.toString());
    }
}
