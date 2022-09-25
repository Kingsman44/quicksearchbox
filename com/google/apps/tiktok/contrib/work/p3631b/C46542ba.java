package com.google.apps.tiktok.contrib.work.p3631b;

import androidx.p060c.C0979i;
import androidx.work.WorkerParameters;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58800sl;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: com.google.apps.tiktok.contrib.work.b.ba */
/* compiled from: PG */
public final class C46542ba {

    /* renamed from: a */
    static final Pattern f121700a = Pattern.compile("^(tiktok_account_work$|unique_|account_id_).*");

    /* renamed from: b */
    static final Pattern f121701b = Pattern.compile("^(TikTokWorker#|tiktok_).*");

    /* renamed from: a */
    static C58528ij m82975a(Set set) {
        C0979i iVar = new C0979i(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("TikTokWorker#")) {
                iVar.add(str.substring(13));
            }
        }
        return C58528ij.m90006F(iVar);
    }

    /* renamed from: b */
    public static String m82976b(String str) {
        return "TikTokWorker#".concat(String.valueOf(str));
    }

    /* renamed from: c */
    public static String m82977c(WorkerParameters workerParameters) {
        return (String) C58557jl.m90133n(m82975a(workerParameters.f13990c));
    }

    /* renamed from: d */
    public static String m82978d(C46586t tVar) {
        return (String) C58557jl.m90133n(m82975a(tVar.mo50572h()));
    }

    /* renamed from: e */
    static void m82979e(C46586t tVar) {
        C58800sl lA = tVar.mo50572h().iterator();
        while (lA.hasNext()) {
            String str = (String) lA.next();
            if (f121700a.matcher(str).matches()) {
                throw new C46548g("Tag " + str + " is reserved by AccountWorkManager.");
            }
        }
        C58800sl lA2 = tVar.mo50572h().iterator();
        while (lA2.hasNext()) {
            String str2 = (String) lA2.next();
            if (f121701b.matcher(str2).matches()) {
                throw new C46548g("Tag " + str2 + " is reserved by TikTokWorkManager.");
            }
        }
    }
}
