package com.google.android.libraries.p2460r.p2469c;

import android.text.Html;
import com.google.android.libraries.p2460r.p2464b.p2466b.C32054a;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32059b;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57491fh;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57492fi;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.r.c.am */
/* compiled from: PG */
public final class C32082am {
    /* renamed from: b */
    private static final String m59775b(C32059b bVar, C57492fi fiVar) {
        String str;
        if ((fiVar.f153572a & 1) == 0) {
            C32054a.m59731b(5, "ParameterizedTextEvalua", (Throwable) null, "Got templated string with no display string", new Object[0]);
            return fiVar.f153573b;
        } else if (fiVar.f153575d.size() == 0) {
            return fiVar.f153573b;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C57491fh fhVar : fiVar.f153575d) {
                if (fhVar.f153568a == 1) {
                    str = bVar.f86111b.mo37847a(System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(fhVar.f153568a == 1 ? ((Long) fhVar.f153569b).longValue() : 0));
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "(invalid param)";
                }
                arrayList.add(str);
            }
            String str2 = fiVar.f153573b;
            try {
                return String.format(str2, arrayList.toArray(new String[arrayList.size()]));
            } catch (IllegalFormatException e) {
                C32054a.m59731b(6, "ParameterizedTextEvalua", e, "Error formatting display string \"%s\"", str2);
                return str2;
            }
        }
    }

    /* renamed from: a */
    public static final CharSequence m59774a(C32059b bVar, C57492fi fiVar) {
        if ((fiVar.f153572a & 1) != 0) {
            String b = m59775b(bVar, fiVar);
            return fiVar.f153574c ? Html.fromHtml(b, 0) : b;
        }
        C32054a.m59731b(5, "ParameterizedTextEvalua", (Throwable) null, "Got templated string with no display string", new Object[0]);
        return fiVar.f153573b;
    }
}
