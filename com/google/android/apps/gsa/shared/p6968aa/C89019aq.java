package com.google.android.apps.gsa.shared.p6968aa;

import android.text.TextUtils;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.aa.aq */
/* compiled from: PG */
public final class C89019aq {

    /* renamed from: a */
    public String f241235a;

    /* renamed from: b */
    public URL f241236b = null;

    /* renamed from: c */
    public String f241237c = null;

    /* renamed from: d */
    public List f241238d = new ArrayList();

    /* renamed from: e */
    public boolean f241239e = true;

    /* renamed from: f */
    public boolean f241240f = false;

    /* renamed from: g */
    public boolean f241241g = true;

    /* renamed from: h */
    public boolean f241242h = false;

    /* renamed from: i */
    public boolean f241243i = true;

    /* renamed from: j */
    public boolean f241244j = true;

    /* renamed from: k */
    public int f241245k = -1;

    /* renamed from: l */
    public int f241246l = -1;

    /* renamed from: m */
    public int f241247m = -1;

    /* renamed from: n */
    public int f241248n = -1;

    /* renamed from: o */
    public int f241249o = 3;

    /* renamed from: p */
    public C89042bm f241250p = C89042bm.f241318b;

    /* renamed from: q */
    public StackTraceElement[] f241251q;

    public C89019aq() {
    }

    /* renamed from: a */
    public final C89020ar mo82989a() {
        if (this.f241240f) {
            if (!this.f241244j) {
                for (C89014al alVar : this.f241238d) {
                    if (!C89020ar.f241256e.contains(alVar.f241218a.toLowerCase(Locale.US))) {
                        throw new IllegalStateException("Requests allowing insecure redirects can only contain allowlisted headers.");
                    }
                }
            } else {
                throw new IllegalStateException("Requests that allow insecure redirects cannot handle cookies.");
            }
        }
        return new C89020ar(this);
    }

    /* renamed from: c */
    public final void mo82991c(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            mo82990b((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* renamed from: d */
    public final void mo82992d(String str) {
        C58838bb.m90868c(C89020ar.f241253b.contains(str));
        this.f241235a = str;
    }

    /* renamed from: f */
    public final void mo82994f(String str) {
        this.f241236b = new URL(str);
    }

    /* renamed from: g */
    public final void mo82995g(String str) {
        C58838bb.m90868c(!TextUtils.isEmpty(str));
        this.f241237c = str;
    }

    public C89019aq(C89020ar arVar, List list) {
        this.f241236b = arVar.f241257f;
        this.f241235a = arVar.f241258g;
        this.f241237c = arVar.f241259h;
        this.f241238d = new ArrayList(list);
        this.f241239e = arVar.f241262k;
        this.f241240f = arVar.f241263l;
        this.f241241g = arVar.f241264m;
        this.f241242h = arVar.f241265n;
        this.f241243i = arVar.f241266o;
        this.f241244j = arVar.f241261j;
        this.f241245k = arVar.f241267p;
        this.f241246l = arVar.f241268q;
        this.f241247m = arVar.f241269r;
        this.f241248n = arVar.f241270s;
        this.f241249o = arVar.f241271t;
        this.f241250p = arVar.f241273v;
        this.f241251q = arVar.f241274w;
    }

    /* renamed from: e */
    public final void mo82993e(String str, String str2) {
        str.getClass();
        str2.getClass();
        int size = this.f241238d.size();
        while (true) {
            size--;
            if (size < 0) {
                this.f241238d.add(new C89014al(str, str2));
                return;
            } else if (((C89014al) this.f241238d.get(size)).f241218a.equalsIgnoreCase(str)) {
                this.f241238d.remove(size);
            }
        }
    }

    /* renamed from: b */
    public final void mo82990b(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (C89020ar.f241255d.contains(str.toLowerCase(Locale.US))) {
            for (C89014al alVar : this.f241238d) {
                if (alVar.f241218a.equalsIgnoreCase(str)) {
                    ((C59052c) ((C59052c) C89020ar.f241252a.mo56226d()).mo56372aa(10637)).mo56389s("Header %s already set!", str);
                    throw new IllegalStateException();
                }
            }
        }
        this.f241238d.add(new C89014al(str, str2));
    }
}
