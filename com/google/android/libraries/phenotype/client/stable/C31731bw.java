package com.google.android.libraries.phenotype.client.stable;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.directboot.C20674d;
import com.google.android.libraries.phenotype.client.C31760t;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63088z;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.phenotype.client.stable.bw */
/* compiled from: PG */
public final class C31731bw {

    /* renamed from: a */
    public final C31760t f85300a;

    /* renamed from: b */
    public final Uri f85301b;

    /* renamed from: c */
    public final String f85302c;

    /* renamed from: d */
    private final String f85303d;

    /* renamed from: e */
    private final boolean f85304e;

    public C31731bw(C31760t tVar, String str, String str2, boolean z) {
        this.f85300a = tVar;
        this.f85302c = str;
        this.f85303d = str2;
        this.f85304e = z;
        C42718e a = C42719f.m75461a(tVar.f85364a);
        C42719f.m75463c("phenotype");
        a.f111968c = "phenotype";
        a.mo45821b(str2 + "/" + str + ".pb");
        if (z) {
            int i = C20674d.f57955a;
            C42719f.m75462b("directboot-files");
            a.f111967b = "directboot-files";
        }
        this.f85301b = a.mo45820a();
    }

    /* renamed from: a */
    static C58495hd m59061a(C31733by byVar) {
        C63088z zVar;
        C58490gz j = C58495hd.m89896j(byVar.f85313g.size() + 3);
        Iterator it = byVar.f85313g.iterator();
        while (true) {
            boolean z = false;
            if (it.hasNext()) {
                C31736ca caVar = (C31736ca) it.next();
                int i = caVar.f85318b;
                int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                } else if (i3 == 0) {
                    j.mo55429h(caVar.f85320d, Long.valueOf(i == 2 ? ((Long) caVar.f85319c).longValue() : 0));
                } else if (i3 == 1) {
                    String str = caVar.f85320d;
                    if (i == 3) {
                        z = ((Boolean) caVar.f85319c).booleanValue();
                    }
                    j.mo55429h(str, Boolean.valueOf(z));
                } else if (i3 == 2) {
                    j.mo55429h(caVar.f85320d, Double.valueOf(i == 4 ? ((Double) caVar.f85319c).doubleValue() : C59203do.f157270a));
                } else if (i3 == 3) {
                    j.mo55429h(caVar.f85320d, i == 5 ? (String) caVar.f85319c : BuildConfig.FLAVOR);
                } else if (i3 == 4) {
                    String str2 = caVar.f85320d;
                    if (i == 6) {
                        zVar = (C63088z) caVar.f85319c;
                    } else {
                        zVar = C63088z.f170246b;
                    }
                    j.mo55429h(str2, zVar.mo59174N());
                }
            } else {
                j.mo55429h("__phenotype_server_token", byVar.f85310d);
                j.mo55429h("__phenotype_snapshot_token", byVar.f85308b);
                j.mo55429h("__phenotype_configuration_version", Long.valueOf(byVar.f85311e));
                return j.mo55427f(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo37347b(String str) {
        return C60922j.m93044g(this.f85300a.mo37365c().mo37292f(this.f85302c, str), C31730bv.f85299a, this.f85300a.mo37368h());
    }

    /* renamed from: c */
    public final C60870cx mo37348c(C31733by byVar) {
        return C60856cj.m92904m(new C31729bu(this, byVar), this.f85300a.mo37368h());
    }
}
