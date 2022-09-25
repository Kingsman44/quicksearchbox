package com.google.android.libraries.assistant.auto.tng.p1272t.p1276b;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.libraries.assistant.auto.tng.gmm.p996d.C13587a;
import com.google.android.libraries.assistant.auto.tng.p1272t.p1277c.C16458a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60930r;
import com.google.p343ac.p346b.p348b.p349a.p350a.p351a.C6638a;
import com.google.p343ac.p346b.p348b.p349a.p350a.p351a.C6640c;
import com.google.p343ac.p358e.p359a.p360a.C6665b;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.libraries.assistant.auto.tng.t.b.c */
/* compiled from: PG */
public final class C16455c {
    /* renamed from: a */
    public static C60930r m33409a(String str, C60887da daVar, Context context) {
        C6638a aVar = (C6638a) C6640c.f19864e.createBuilder();
        C6665b a = C16458a.m33411a(str);
        aVar.copyOnWrite();
        C6640c cVar = (C6640c) aVar.instance;
        a.getClass();
        cVar.f19867b = a;
        cVar.f19866a |= 1;
        aVar.copyOnWrite();
        C6640c cVar2 = (C6640c) aVar.instance;
        str.getClass();
        cVar2.f19866a |= 2;
        cVar2.f19868c = str;
        PackageManager packageManager = context.getPackageManager();
        C58485gu guVar = C13587a.f41597a;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            String str2 = (String) guVar.get(i2);
            try {
                String str3 = packageManager.getPackageInfo(str2, 0).versionName;
                if (!(str3 == null || C16458a.m33411a(str3) == null)) {
                    C6665b a2 = C16458a.m33411a(str3);
                    str2.getClass();
                    a2.getClass();
                    aVar.copyOnWrite();
                    C6640c cVar3 = (C6640c) aVar.instance;
                    C62995dn dnVar = cVar3.f19869d;
                    if (!dnVar.f170058b) {
                        cVar3.f19869d = dnVar.mo58980a();
                    }
                    cVar3.f19869d.put(str2, a2);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return new C16454b(aVar, daVar);
    }
}
