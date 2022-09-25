package com.google.android.libraries.mdi.download.p2236d.p2241e;

import com.google.android.libraries.mdi.download.C29383eg;
import com.google.android.libraries.mdi.download.C29384eh;
import com.google.android.libraries.mdi.download.C29391eo;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.C29395es;
import com.google.android.libraries.mdi.download.C29396et;
import com.google.android.libraries.storage.protostore.C42937ce;
import com.google.android.libraries.storage.protostore.C42938cf;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.base.C58869cf;
import com.google.common.p4522b.C58800sl;
import com.google.protobuf.MessageLite;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.mdi.download.d.e.am */
/* compiled from: PG */
public final class C29024am implements C42937ce {
    /* renamed from: b */
    private static String m53897b(String str, String str2) {
        return str + "|" + str2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MessageLite mo34548a(C42938cf cfVar, MessageLite messageLite) {
        C42938cf cfVar2 = cfVar;
        C29396et etVar = (C29396et) messageLite;
        if (etVar.f79696d) {
            return etVar;
        }
        HashSet hashSet = new HashSet();
        C29395es esVar = (C29395es) etVar.toBuilder();
        esVar.copyOnWrite();
        C29396et etVar2 = (C29396et) esVar.instance;
        int i = 2;
        etVar2.f79693a |= 2;
        etVar2.f79696d = true;
        C58800sl lA = cfVar.mo46010a().entrySet().iterator();
        while (lA.hasNext()) {
            List i2 = C58869cf.m90938d("|").mo56155i((CharSequence) ((Map.Entry) lA.next()).getKey());
            if (i2.size() >= 4) {
                String str = (String) i2.get(0);
                String str2 = (String) i2.get(1);
                int parseInt = Integer.parseInt((String) i2.get(i));
                String str3 = str + "|" + str2 + "|" + parseInt;
                if (!hashSet.contains(str3)) {
                    hashSet.add(str3);
                    String b = m53897b(str3, "w");
                    String b2 = m53897b(str3, C45240c.f118157a);
                    long c = cfVar2.mo46012c(b);
                    long c2 = cfVar2.mo46012c(b2);
                    C29383eg egVar = (C29383eg) C29384eh.f79653h.createBuilder();
                    C29391eo eoVar = (C29391eo) C29392ep.f79679g.createBuilder();
                    eoVar.copyOnWrite();
                    C29392ep epVar = (C29392ep) eoVar.instance;
                    str2.getClass();
                    epVar.f79681a |= 1;
                    epVar.f79682b = str2;
                    eoVar.copyOnWrite();
                    C29392ep epVar2 = (C29392ep) eoVar.instance;
                    str.getClass();
                    epVar2.f79681a |= 2;
                    epVar2.f79683c = str;
                    egVar.copyOnWrite();
                    C29384eh ehVar = (C29384eh) egVar.instance;
                    C29392ep epVar3 = (C29392ep) eoVar.build();
                    epVar3.getClass();
                    ehVar.f79656b = epVar3;
                    ehVar.f79655a |= 1;
                    egVar.copyOnWrite();
                    C29384eh ehVar2 = (C29384eh) egVar.instance;
                    ehVar2.f79655a |= 8;
                    ehVar2.f79659e = parseInt;
                    egVar.copyOnWrite();
                    C29384eh ehVar3 = (C29384eh) egVar.instance;
                    ehVar3.f79655a |= 16;
                    ehVar3.f79660f = c2;
                    egVar.copyOnWrite();
                    C29384eh ehVar4 = (C29384eh) egVar.instance;
                    ehVar4.f79655a |= 32;
                    ehVar4.f79661g = c;
                    esVar.copyOnWrite();
                    C29396et etVar3 = (C29396et) esVar.instance;
                    C29384eh ehVar5 = (C29384eh) egVar.build();
                    ehVar5.getClass();
                    etVar3.mo34703a();
                    etVar3.f79695c.add(ehVar5);
                    i = 2;
                }
            }
        }
        return (C29396et) esVar.build();
    }
}
