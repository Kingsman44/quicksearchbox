package com.google.android.apps.gsa.p8889z.p8893c.p8899f;

import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;
import com.google.speech.recognizer.p5233a.C67468p;
import com.google.speech.recognizer.p5233a.C67474v;
import com.google.speech.recognizer.p5233a.C67476x;

/* renamed from: com.google.android.apps.gsa.z.c.f.c */
/* compiled from: PG */
public final class C118897c {

    /* renamed from: a */
    public final StringBuilder f331596a = new StringBuilder();

    /* renamed from: a */
    public final Pair mo104065a(C67438ag agVar) {
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
                    this.f331596a.append(pVar.f183367b);
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
                    String str2 = vVar.f183387b;
                    double d = vVar.f183388c;
                    if (z || (i2 & 2) == 0 || d < 0.9d) {
                        if (sb2 == null) {
                            sb2 = new StringBuilder();
                        }
                        sb2.append(vVar.f183387b);
                        z = true;
                    } else {
                        if (sb3 == null) {
                            sb3 = new StringBuilder(this.f331596a);
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
            str = this.f331596a.toString();
        } else {
            str = sb2.toString();
        }
        return Pair.create(str, sb == null ? BuildConfig.FLAVOR : sb.toString());
    }
}
