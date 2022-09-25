package com.google.android.libraries.notifications.data;

import com.google.p4160bf.p4164b.p4165a.p4166a.C55586v;
import com.google.p4160bf.p4167c.p4168a.p4169a.p4170a.p4171a.C55688b;
import com.google.protobuf.C63070h;
import java.util.List;

/* renamed from: com.google.android.libraries.notifications.data.g */
/* compiled from: PG */
public final class C29793g {

    /* renamed from: a */
    public Long f80763a;

    /* renamed from: b */
    public Long f80764b;

    /* renamed from: c */
    public List f80765c;

    /* renamed from: d */
    public Long f80766d;

    /* renamed from: e */
    public String f80767e;

    /* renamed from: f */
    public C63070h f80768f;

    /* renamed from: g */
    public String f80769g;

    /* renamed from: h */
    public String f80770h;

    /* renamed from: i */
    public Long f80771i;

    /* renamed from: j */
    public Long f80772j;

    /* renamed from: k */
    public C55688b f80773k;

    /* renamed from: l */
    public List f80774l;

    /* renamed from: m */
    private String f80775m;

    /* renamed from: n */
    private C55586v f80776n;

    /* renamed from: o */
    private int f80777o;

    /* renamed from: p */
    private int f80778p;

    /* renamed from: q */
    private int f80779q;

    /* renamed from: r */
    private int f80780r;

    /* renamed from: s */
    private int f80781s;

    public C29793g() {
    }

    public C29793g(C29827r rVar) {
        C29794h hVar = (C29794h) rVar;
        this.f80775m = hVar.f80782a;
        this.f80777o = hVar.f80796o;
        this.f80778p = hVar.f80797p;
        this.f80779q = hVar.f80798q;
        this.f80780r = hVar.f80799r;
        this.f80763a = hVar.f80783b;
        this.f80764b = hVar.f80784c;
        this.f80776n = hVar.f80785d;
        this.f80765c = hVar.f80786e;
        this.f80766d = hVar.f80787f;
        this.f80767e = hVar.f80788g;
        this.f80768f = hVar.f80789h;
        this.f80769g = hVar.f80790i;
        this.f80770h = hVar.f80791j;
        this.f80771i = hVar.f80792k;
        this.f80772j = hVar.f80793l;
        this.f80781s = hVar.f80800s;
        this.f80773k = hVar.f80794m;
        this.f80774l = hVar.f80795n;
    }

    /* renamed from: a */
    public final C29827r mo35042a() {
        int i;
        int i2;
        int i3;
        int i4;
        Long l;
        Long l2;
        C55586v vVar;
        List list;
        Long l3;
        String str;
        Long l4;
        Long l5;
        int i5;
        List list2;
        String str2 = this.f80775m;
        if (str2 == null || (i = this.f80777o) == 0 || (i2 = this.f80778p) == 0 || (i3 = this.f80779q) == 0 || (i4 = this.f80780r) == 0 || (l = this.f80763a) == null || (l2 = this.f80764b) == null || (vVar = this.f80776n) == null || (list = this.f80765c) == null || (l3 = this.f80766d) == null || (str = this.f80770h) == null || (l4 = this.f80771i) == null || (l5 = this.f80772j) == null || (i5 = this.f80781s) == 0 || (list2 = this.f80774l) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f80775m == null) {
                sb.append(" id");
            }
            if (this.f80777o == 0) {
                sb.append(" readState");
            }
            if (this.f80778p == 0) {
                sb.append(" deletionStatus");
            }
            if (this.f80779q == 0) {
                sb.append(" countBehavior");
            }
            if (this.f80780r == 0) {
                sb.append(" systemTrayBehavior");
            }
            if (this.f80763a == null) {
                sb.append(" lastUpdatedVersion");
            }
            if (this.f80764b == null) {
                sb.append(" lastNotificationVersion");
            }
            if (this.f80776n == null) {
                sb.append(" androidSdkMessage");
            }
            if (this.f80765c == null) {
                sb.append(" notificationMetadataList");
            }
            if (this.f80766d == null) {
                sb.append(" creationId");
            }
            if (this.f80770h == null) {
                sb.append(" groupId");
            }
            if (this.f80771i == null) {
                sb.append(" expirationTimestampUsec");
            }
            if (this.f80772j == null) {
                sb.append(" insertionTimeMs");
            }
            if (this.f80781s == 0) {
                sb.append(" storageMode");
            }
            if (this.f80774l == null) {
                sb.append(" actionList");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new C29794h(str2, i, i2, i3, i4, l, l2, vVar, list, l3, this.f80767e, this.f80768f, this.f80769g, str, l4, l5, i5, this.f80773k, list2);
    }

    /* renamed from: b */
    public final void mo35043b(C55586v vVar) {
        if (vVar != null) {
            this.f80776n = vVar;
            return;
        }
        throw new NullPointerException("Null androidSdkMessage");
    }

    /* renamed from: c */
    public final void mo35044c(String str) {
        if (str != null) {
            this.f80770h = str;
            return;
        }
        throw new NullPointerException("Null groupId");
    }

    /* renamed from: d */
    public final void mo35045d(String str) {
        if (str != null) {
            this.f80775m = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    /* renamed from: e */
    public final void mo35046e(List list) {
        if (list != null) {
            this.f80765c = list;
            return;
        }
        throw new NullPointerException("Null notificationMetadataList");
    }

    /* renamed from: f */
    public final void mo35047f(int i) {
        if (i != 0) {
            this.f80779q = i;
            return;
        }
        throw new NullPointerException("Null countBehavior");
    }

    /* renamed from: g */
    public final void mo35048g(int i) {
        if (i != 0) {
            this.f80778p = i;
            return;
        }
        throw new NullPointerException("Null deletionStatus");
    }

    /* renamed from: h */
    public final void mo35049h(int i) {
        if (i != 0) {
            this.f80777o = i;
            return;
        }
        throw new NullPointerException("Null readState");
    }

    /* renamed from: i */
    public final void mo35050i(int i) {
        if (i != 0) {
            this.f80781s = i;
            return;
        }
        throw new NullPointerException("Null storageMode");
    }

    /* renamed from: j */
    public final void mo35051j(int i) {
        if (i != 0) {
            this.f80780r = i;
            return;
        }
        throw new NullPointerException("Null systemTrayBehavior");
    }
}
