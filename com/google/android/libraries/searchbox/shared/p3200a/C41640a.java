package com.google.android.libraries.searchbox.shared.p3200a;

import android.util.ArrayMap;
import com.google.common.p4552o.anc;
import com.google.common.p4552o.ane;
import com.google.common.p4552o.anf;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.searchbox.shared.a.a */
/* compiled from: PG */
public final class C41640a {

    /* renamed from: a */
    public final Map f108852a = new ArrayMap();

    /* renamed from: b */
    public final Map f108853b = new ArrayMap();

    /* renamed from: c */
    private final Map f108854c = new EnumMap(ane.class);

    /* renamed from: d */
    private final Map f108855d = new EnumMap(ane.class);

    /* renamed from: a */
    public final void mo44226a(ane ane) {
        this.f108854c.remove(ane);
    }

    /* renamed from: b */
    public final void mo44227b(ane ane, int i) {
        this.f108854c.put(ane, Integer.valueOf(i));
    }

    /* renamed from: c */
    public final void mo44228c(ane ane, String str) {
        this.f108855d.put(ane, str);
    }

    /* renamed from: d */
    public final void mo44229d(ane ane, boolean z) {
        this.f108854c.put(ane, Integer.valueOf(z ? 1 : 0));
    }

    /* renamed from: e */
    public final anf[] mo44230e() {
        anf[] anfArr = new anf[(this.f108854c.size() + this.f108855d.size() + this.f108852a.size() + this.f108853b.size())];
        int i = 0;
        for (Map.Entry entry : this.f108854c.entrySet()) {
            anc anc = (anc) anf.f159355f.createBuilder();
            anc.copyOnWrite();
            anf anf = (anf) anc.instance;
            anf.f159358b = ((ane) entry.getKey()).f159354aE;
            anf.f159357a |= 1;
            int intValue = ((Integer) entry.getValue()).intValue();
            anc.copyOnWrite();
            anf anf2 = (anf) anc.instance;
            anf2.f159357a |= 8;
            anf2.f159361e = intValue;
            anfArr[i] = (anf) anc.build();
            i++;
        }
        for (Map.Entry entry2 : this.f108855d.entrySet()) {
            anc anc2 = (anc) anf.f159355f.createBuilder();
            anc2.copyOnWrite();
            anf anf3 = (anf) anc2.instance;
            anf3.f159358b = ((ane) entry2.getKey()).f159354aE;
            anf3.f159357a |= 1;
            String str = (String) entry2.getValue();
            anc2.copyOnWrite();
            anf anf4 = (anf) anc2.instance;
            str.getClass();
            anf4.f159357a |= 4;
            anf4.f159360d = str;
            anfArr[i] = (anf) anc2.build();
            i++;
        }
        for (Map.Entry entry3 : this.f108852a.entrySet()) {
            anc anc3 = (anc) anf.f159355f.createBuilder();
            int intValue2 = ((Integer) entry3.getKey()).intValue();
            anc3.copyOnWrite();
            anf anf5 = (anf) anc3.instance;
            anf5.f159357a |= 2;
            anf5.f159359c = intValue2;
            int intValue3 = ((Integer) entry3.getValue()).intValue();
            anc3.copyOnWrite();
            anf anf6 = (anf) anc3.instance;
            anf6.f159357a |= 8;
            anf6.f159361e = intValue3;
            anfArr[i] = (anf) anc3.build();
            i++;
        }
        for (Map.Entry entry4 : this.f108853b.entrySet()) {
            anc anc4 = (anc) anf.f159355f.createBuilder();
            int intValue4 = ((Integer) entry4.getKey()).intValue();
            anc4.copyOnWrite();
            anf anf7 = (anf) anc4.instance;
            anf7.f159357a |= 2;
            anf7.f159359c = intValue4;
            String str2 = (String) entry4.getValue();
            anc4.copyOnWrite();
            anf anf8 = (anf) anc4.instance;
            str2.getClass();
            anf8.f159357a |= 4;
            anf8.f159360d = str2;
            anfArr[i] = (anf) anc4.build();
            i++;
        }
        return anfArr;
    }
}
