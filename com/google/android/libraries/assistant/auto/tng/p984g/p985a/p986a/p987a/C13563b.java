package com.google.android.libraries.assistant.auto.tng.p984g.p985a.p986a.p987a;

import android.content.pm.PackageManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13042d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13044f;
import com.google.android.libraries.assistant.auto.tng.p984g.p985a.p986a.C13569c;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.auto.tng.g.a.a.a.b */
/* compiled from: PG */
public final class C13563b implements C13569c {

    /* renamed from: a */
    private static final C59071e f41546a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.g.a.a.a.b");

    /* renamed from: b */
    private static final C58528ij f41547b = C58528ij.m90011K("com.google.android.projection.bumblebee", "com.google.android.projection.gearhead");

    /* renamed from: c */
    private final PackageManager f41548c;

    /* renamed from: d */
    private final String f41549d;

    public C13563b(PackageManager packageManager, String str) {
        this.f41548c = packageManager;
        this.f41549d = str;
    }

    /* renamed from: a */
    public final String mo21170a(C12991i iVar) {
        String str;
        String str2;
        Object obj;
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        int i = 0;
        objArr[0] = this.f41549d;
        C58800sl lA = f41547b.iterator();
        while (true) {
            if (!lA.hasNext()) {
                C59104x c = f41546a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ProjectedUASuffix");
                ((C59052c) ((C59052c) c).mo56372aa(44899)).mo56386p("No Gearhead App found.");
                str = BuildConfig.FLAVOR;
                break;
            }
            try {
                str = this.f41548c.getPackageInfo((String) lA.next(), i).versionName;
                break;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        StringBuilder sb = new StringBuilder(str);
        C62940bt r4 = C62942bv.checkIsLite(C13042d.f40481n);
        iVar.mo58887l(r4);
        if (!iVar.f169962ag.mo58857o(r4.f169971d)) {
            str2 = sb.toString();
        } else {
            C62940bt r42 = C62942bv.checkIsLite(C13042d.f40481n);
            iVar.mo58887l(r42);
            Object l = iVar.f169962ag.mo58854l(r42.f169971d);
            if (l == null) {
                obj = r42.f169969b;
            } else {
                obj = r42.mo58889c(l);
            }
            C13042d dVar = (C13042d) obj;
            if ((dVar.f40483a & 4) != 0) {
                C13044f fVar = dVar.f40486d;
                if (fVar == null) {
                    fVar = C13044f.f40495e;
                }
                if ((fVar.f40497a & 1) != 0) {
                    sb.append(" ");
                    sb.append(fVar.f40498b);
                }
                if ((2 & fVar.f40497a) != 0) {
                    sb.append(" ");
                    sb.append(fVar.f40499c);
                }
                if ((fVar.f40497a & 4) != 0 && fVar.f40500d) {
                    sb.append(" IsEmbeddedCar");
                }
            }
            str2 = sb.toString();
        }
        objArr[1] = str2;
        return String.format(locale, "GSA/%s AndroidAutoCarScreen/%s", objArr);
    }
}
