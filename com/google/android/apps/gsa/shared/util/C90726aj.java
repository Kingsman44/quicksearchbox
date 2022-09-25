package com.google.android.apps.gsa.shared.util;

import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.util.aj */
/* compiled from: PG */
public final class C90726aj {

    /* renamed from: a */
    private static final C59071e f253807a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.aj");

    /* renamed from: b */
    private final String f253808b;

    /* renamed from: c */
    private final String f253809c;

    public C90726aj(String str, String str2) {
        this.f253808b = str;
        this.f253809c = str2;
    }

    /* renamed from: a */
    public final C58495hd mo85085a(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.split(this.f253808b)) {
            if (!str2.isEmpty()) {
                String[] split = str2.split(this.f253809c, -1);
                if (split.length == 2) {
                    String str3 = split[0];
                    if (hashMap.containsKey(str3) && !((String) hashMap.get(str3)).equals(split[1])) {
                        C59104x b = f253807a.mo56224b();
                        b.mo56378ag(C58975e.f156826a, "MapSplitter");
                        ((C59052c) ((C59052c) b).mo56372aa(11318)).mo56359L("Duplicate key %s found in map with values %s and %s", str3, hashMap.get(str3), split[1]);
                    }
                    hashMap.put(split[0], split[1]);
                } else {
                    throw new IllegalArgumentException(String.format(Locale.US, "Bad input '%s' in '%s' (entry separator: '%s'; key-value separator: '%s')", new Object[]{str2, str, this.f253808b, this.f253809c}));
                }
            }
        }
        return C58495hd.m89898l(hashMap);
    }

    /* renamed from: b */
    public final C58495hd mo85086b(String str) {
        C58490gz gzVar = new C58490gz(4);
        for (String str2 : str.split(this.f253808b)) {
            if (!str2.isEmpty()) {
                String[] split = str2.split(this.f253809c);
                if (split.length == 2) {
                    gzVar.mo55429h(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
                } else {
                    throw new IllegalArgumentException(String.format(Locale.US, "Bad input '%s' in '%s' (entry separator: '%s'; key-value separator: '%s')", new Object[]{str2, str, this.f253808b, this.f253809c}));
                }
            }
        }
        return gzVar.mo55427f(false);
    }
}
