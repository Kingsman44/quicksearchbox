package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.content.Context;
import android.net.Uri;
import android.provider.Telephony;
import com.google.android.apps.gsa.search.shared.actions.modular.C87467f;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.common.p4535g.C59203do;
import com.google.common.p4538j.C59302a;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55136he;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.modular.arguments.m */
/* compiled from: PG */
public final class C87449m {

    /* renamed from: a */
    private final Context f236220a;

    public C87449m(Context context) {
        this.f236220a = context;
    }

    /* renamed from: b */
    private final C87429c m141940b(C55134hc hcVar, C87448l lVar) {
        int i = hcVar.f145121a;
        if ((i & 2) == 0 && (i & 1) == 0) {
            return (i & 4) != 0 ? new C87429c(hcVar.f145124d) : C87429c.f236122a;
        }
        if ((i & 1) != 0) {
            return lVar.mo81213T(this, hcVar, this.f236220a);
        }
        C55133hb a = C55133hb.m87600a(hcVar.f145123c);
        if (a == null) {
            a = C55133hb.NONE;
        }
        if (a == C55133hb.CONSTANT_DEFAULT_SMS_APP_PACKAGE) {
            return new C87429c(Telephony.Sms.getDefaultSmsPackage(this.f236220a));
        }
        return lVar.mo81214U(hcVar);
    }

    /* renamed from: a */
    public final C87429c mo81378a(C55136he heVar, C87448l lVar, boolean z) {
        C87429c cVar;
        C55136he heVar2 = heVar;
        C87448l lVar2 = lVar;
        int size = heVar2.f145138g.size();
        if (heVar2.f145139h.size() != 0 && !lVar2.mo81228ah(heVar2.f145139h)) {
            return C87429c.f236122a;
        }
        if ((heVar2.f145132a & 1) != 0) {
            if (size == 0) {
                return new C87429c(heVar2.f145133b);
            }
            int size2 = heVar2.f145138g.size();
            Object[] objArr = new Object[size2];
            HashMap hashMap = new HashMap();
            for (int i = 0; i < size2; i++) {
                C87429c b = m141940b((C55134hc) heVar2.f145138g.get(i), lVar2);
                if (!b.mo81247f()) {
                    return C87429c.f236122a;
                }
                Object c = b.mo81244c();
                if ((c instanceof String) && z) {
                    objArr[i] = C59302a.f157435a.mo56216a((String) c);
                } else if (c != null) {
                    objArr[i] = c;
                }
                C55133hb a = C55133hb.m87600a(((C55134hc) heVar2.f145138g.get(i)).f145123c);
                if (a == null) {
                    a = C55133hb.NONE;
                }
                if (a == C55133hb.ENTITY_VALUE_WITH_AUDIO_URI_FOR_TTS) {
                    String format = String.format(Locale.US, "%%%d\\$s", new Object[]{Integer.valueOf(i + 1)});
                    hashMap.put(format, objArr[i]);
                    objArr[i] = format;
                }
            }
            String format2 = String.format(heVar2.f145133b, objArr);
            if (hashMap.isEmpty()) {
                cVar = new C87429c(format2);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(format2);
                for (String quote : hashMap.keySet()) {
                    String format3 = String.format("((?<=%1$s)|(?=%1$s))", new Object[]{Pattern.quote(quote)});
                    ArrayList arrayList2 = new ArrayList();
                    int size3 = arrayList.size();
                    for (int i2 = 0; i2 < size3; i2++) {
                        arrayList2.addAll(Arrays.asList(((String) arrayList.get(i2)).split(format3)));
                    }
                    arrayList = arrayList2;
                }
                ArrayList arrayList3 = new ArrayList();
                int size4 = arrayList.size();
                for (int i3 = 0; i3 < size4; i3++) {
                    String str = (String) arrayList.get(i3);
                    if (hashMap.containsKey(str)) {
                        Object obj = hashMap.get(str);
                        if (obj instanceof String) {
                            arrayList3.add(new C87429c((String) obj));
                        } else if (obj instanceof Uri) {
                            arrayList3.add(new C87429c((Uri) obj));
                        } else {
                            throw new UnsupportedOperationException(String.format("Class %s is unsupported", new Object[]{obj.getClass()}));
                        }
                    } else {
                        arrayList3.add(new C87429c(str));
                    }
                }
                cVar = new C87429c((Collection) arrayList3);
            }
            return cVar;
        } else if (heVar2.f145134c.size() != 0) {
            return new C87429c(7, (String) null, (String[]) heVar2.f145134c.toArray(new String[0]), (Uri) null, 0, 0, false, C59203do.f157270a, (ArrayList) null, (byte[]) null, (Collection) null);
        } else {
            int i4 = heVar2.f145132a;
            if ((i4 & 8) != 0) {
                return new C87429c(heVar2.f145136e);
            }
            if ((i4 & 4) != 0) {
                return new C87429c(heVar2.f145135d);
            }
            if ((i4 & 16) != 0) {
                return new C87429c(8, (String) null, (String[]) null, (Uri) null, 0, 0, false, heVar2.f145137f, (ArrayList) null, (byte[]) null, (Collection) null);
            }
            if ((i4 & 64) != 0) {
                return new C87429c(12, (String) null, (String[]) null, (Uri) null, 0, 0, false, C59203do.f157270a, (ArrayList) null, heVar2.f145140i.mo59174N(), (Collection) null);
            }
            if (size == 0) {
                return C87429c.f236122a;
            }
            if (size != 1) {
                C87467f Q = lVar.mo81210Q();
                int size5 = heVar2.f145138g.size();
                Q.mo81395a("No format string but " + size5 + " values; picking first", heVar2, (Throwable) null);
            }
            return m141940b((C55134hc) heVar2.f145138g.get(0), lVar2);
        }
    }
}
