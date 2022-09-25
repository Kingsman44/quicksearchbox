package com.google.android.apps.gsa.plugins.p6468a.p6470b;

import android.text.TextUtils;
import androidx.p060c.C0984n;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21454b;
import com.google.common.base.C58837ba;
import com.google.common.base.C58879cp;
import com.google.common.p4522b.C58485gu;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58146d;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.plugins.a.b.b */
/* compiled from: PG */
public final class C84057b {

    /* renamed from: a */
    public final C0984n f228947a;

    /* renamed from: b */
    public final String f228948b;

    /* renamed from: c */
    private final C0984n f228949c;

    /* renamed from: d */
    private final C0984n f228950d;

    /* renamed from: e */
    private final C0984n f228951e;

    /* renamed from: f */
    private final C0984n f228952f;

    public C84057b() {
        this(BuildConfig.FLAVOR);
    }

    /* renamed from: c */
    public static C84057b m133953c(C58148f fVar) {
        C84057b bVar = new C84057b(fVar.f155456c);
        for (C58146d dVar : fVar.f155457d) {
            if (!dVar.f155447c.isEmpty()) {
                bVar.f228949c.put(dVar.f155446b, dVar.f155447c);
            } else if (!dVar.f155448d.isEmpty()) {
                bVar.f228950d.put(dVar.f155446b, dVar.f155448d);
            } else if (!dVar.f155449e.isEmpty()) {
                bVar.f228951e.put(dVar.f155446b, dVar.f155449e);
            } else if (!dVar.f155450f.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (C58148f c : dVar.f155450f) {
                    arrayList.add(m133953c(c));
                }
                bVar.f228947a.put(dVar.f155446b, arrayList);
            } else if ((dVar.f155445a & 2) != 0) {
                bVar.f228952f.put(dVar.f155446b, dVar.f155451g.mo59174N());
            }
        }
        return bVar;
    }

    /* renamed from: f */
    public static C84057b m133954f(C21454b bVar) {
        C58148f g = m133955g(bVar);
        if (g != null) {
            return m133953c(g);
        }
        return new C84057b(C58837ba.m90858g(bVar.f59905a.mo117713i()));
    }

    /* renamed from: g */
    public static C58148f m133955g(C21454b bVar) {
        ByteBuffer j = bVar.f59905a.mo117714j();
        if (j != null && j.hasRemaining()) {
            try {
                byte[] bArr = new byte[j.remaining()];
                j.get(bArr);
                return (C58148f) C62942bv.parseFrom((C62942bv) C58148f.f155452f, bArr);
            } catch (C62974ct unused) {
            }
        }
        return null;
    }

    /* renamed from: h */
    private static Object m133956h(C0984n nVar, String str) {
        List list = (List) nVar.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: i */
    private final Object m133957i(String str, int i) {
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            int i2 = i - 1;
            if (i2 == 1) {
                return m133956h(this.f228950d, str);
            }
            if (i2 == 2) {
                return m133956h(this.f228951e, str);
            }
            if (i2 == 4) {
                return m133956h(this.f228947a, str);
            }
            throw new RuntimeException("Not supported data type ".concat(i != 2 ? i != 3 ? i != 4 ? "THING" : "BYTE_ARRAY" : "STRING" : "LONG"));
        }
        C84057b b = mo77511b(C58879cp.m90961c(str, 0, indexOf));
        if (b == null) {
            return null;
        }
        return b.m133957i(C58879cp.m90960b(str, indexOf + 1), i);
    }

    /* renamed from: a */
    public final long mo77510a(String... strArr) {
        for (String i : strArr) {
            Object i2 = m133957i(i, 2);
            if (i2 instanceof Long) {
                return ((Long) i2).longValue();
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final C84057b mo77511b(String... strArr) {
        for (int i = 0; i <= 0; i++) {
            Object i2 = m133957i(strArr[i], 5);
            if (i2 instanceof C84057b) {
                return (C84057b) i2;
            }
        }
        return new C84057b(BuildConfig.FLAVOR);
    }

    /* renamed from: d */
    public final String mo77512d(String... strArr) {
        for (String i : strArr) {
            Object i2 = m133957i(i, 3);
            if (i2 instanceof String) {
                String str = (String) i2;
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
            }
        }
        return BuildConfig.FLAVOR;
    }

    /* renamed from: e */
    public final List mo77513e(C0984n nVar, String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            C84057b b = mo77511b(C58879cp.m90961c(str, 0, indexOf));
            if (b == null) {
                return C58485gu.m89845m();
            }
            return b.mo77513e(nVar, C58879cp.m90960b(str, indexOf + 1));
        } else if (nVar.containsKey(str)) {
            return (List) nVar.get(str);
        } else {
            return C58485gu.m89845m();
        }
    }

    public C84057b(String str) {
        this.f228949c = new C0984n(0);
        this.f228950d = new C0984n(0);
        this.f228951e = new C0984n(0);
        this.f228947a = new C0984n(0);
        this.f228952f = new C0984n(0);
        this.f228948b = str;
    }
}
