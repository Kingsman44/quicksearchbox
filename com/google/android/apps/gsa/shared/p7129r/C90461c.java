package com.google.android.apps.gsa.shared.p7129r;

import android.accounts.Account;
import android.net.Uri;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4552o.C59796fx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.r.c */
/* compiled from: PG */
public class C90461c {

    /* renamed from: a */
    public View f252689a;

    /* renamed from: b */
    public String f252690b;

    /* renamed from: c */
    public Account f252691c;

    /* renamed from: d */
    public Uri f252692d;

    /* renamed from: e */
    public String f252693e;

    /* renamed from: f */
    protected String f252694f;

    /* renamed from: g */
    protected String f252695g;

    /* renamed from: h */
    protected C59796fx f252696h;

    /* renamed from: i */
    public String f252697i;

    /* renamed from: j */
    public boolean f252698j;

    /* renamed from: k */
    public boolean f252699k;

    /* renamed from: l */
    public boolean f252700l;

    /* renamed from: m */
    public boolean f252701m;

    /* renamed from: n */
    protected final boolean f252702n;

    /* renamed from: o */
    protected final boolean f252703o;

    /* renamed from: p */
    protected final boolean f252704p;

    /* renamed from: q */
    public int f252705q;

    /* renamed from: r */
    public boolean f252706r;

    /* renamed from: s */
    public int f252707s;

    /* renamed from: t */
    public int f252708t;

    /* renamed from: u */
    protected final List f252709u;

    /* renamed from: v */
    protected final Map f252710v;

    /* renamed from: w */
    protected final Map f252711w;

    /* renamed from: x */
    public final Map f252712x;

    /* renamed from: y */
    public String f252713y;

    public C90461c() {
        this.f252705q = -1;
        this.f252708t = 0;
        this.f252699k = true;
        this.f252702n = false;
        this.f252703o = false;
        this.f252704p = false;
        this.f252700l = false;
        this.f252701m = false;
        this.f252709u = new ArrayList();
        this.f252710v = new LinkedHashMap();
        this.f252711w = new LinkedHashMap();
        this.f252712x = new LinkedHashMap();
        this.f252713y = BuildConfig.FLAVOR;
    }

    /* renamed from: b */
    public final void mo84198b(String str, String str2) {
        this.f252712x.put(str, str2);
    }

    /* renamed from: c */
    public final void mo84199c(String str, String str2) {
        this.f252711w.put(str, str2);
    }

    /* renamed from: d */
    public final void mo84200d(String str, String str2) {
        this.f252710v.put(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C90461c)) {
            return false;
        }
        C90461c cVar = (C90461c) obj;
        if (this.f252698j != cVar.f252698j || this.f252699k != cVar.f252699k) {
            return false;
        }
        boolean z = cVar.f252702n;
        boolean z2 = cVar.f252703o;
        boolean z3 = cVar.f252704p;
        if (this.f252700l != cVar.f252700l || this.f252701m != cVar.f252701m || this.f252705q != cVar.f252705q || this.f252706r != cVar.f252706r || this.f252707s != cVar.f252707s || this.f252708t != cVar.f252708t) {
            return false;
        }
        View view = this.f252689a;
        if (view == null ? cVar.f252689a != null : !view.equals(cVar.f252689a)) {
            return false;
        }
        String str = this.f252690b;
        if (str == null ? cVar.f252690b != null : !str.equals(cVar.f252690b)) {
            return false;
        }
        Account account = this.f252691c;
        if (account == null ? cVar.f252691c != null : !account.equals(cVar.f252691c)) {
            return false;
        }
        Uri uri = this.f252692d;
        if (uri == null ? cVar.f252692d != null : !uri.equals(cVar.f252692d)) {
            return false;
        }
        String str2 = this.f252693e;
        if (str2 == null ? cVar.f252693e != null : !str2.equals(cVar.f252693e)) {
            return false;
        }
        String str3 = this.f252694f;
        if (str3 == null ? cVar.f252694f != null : !str3.equals(cVar.f252694f)) {
            return false;
        }
        String str4 = this.f252695g;
        if (str4 == null ? cVar.f252695g != null : !str4.equals(cVar.f252695g)) {
            return false;
        }
        C59796fx fxVar = cVar.f252696h;
        if (!this.f252709u.equals(cVar.f252709u) || !this.f252710v.equals(cVar.f252710v) || !this.f252711w.equals(cVar.f252711w) || !this.f252712x.equals(cVar.f252712x)) {
            return false;
        }
        String str5 = cVar.f252697i;
        return this.f252713y.equals(cVar.f252713y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f252689a, this.f252690b, this.f252691c, this.f252692d, this.f252693e, this.f252694f, this.f252695g, null, null, Boolean.valueOf(this.f252698j), Boolean.valueOf(this.f252699k), false, false, false, Boolean.valueOf(this.f252700l), Boolean.valueOf(this.f252701m), Integer.valueOf(this.f252705q), Boolean.valueOf(this.f252706r), Integer.valueOf(this.f252707s), Integer.valueOf(this.f252708t), this.f252709u, this.f252710v, this.f252711w, this.f252712x, this.f252713y});
    }

    /* renamed from: iI */
    public final void mo84203iI(List list) {
        this.f252709u.addAll(list);
    }

    protected C90461c(C90461c cVar) {
        this.f252705q = -1;
        this.f252708t = 0;
        this.f252689a = cVar.f252689a;
        this.f252705q = cVar.f252705q;
        this.f252690b = cVar.f252690b;
        this.f252691c = cVar.f252691c;
        this.f252692d = cVar.f252692d;
        this.f252712x = cVar.f252712x;
        this.f252694f = cVar.f252694f;
        this.f252695g = cVar.f252695g;
        C59796fx fxVar = cVar.f252696h;
        this.f252696h = null;
        String str = cVar.f252697i;
        this.f252697i = null;
        this.f252698j = cVar.f252698j;
        this.f252699k = cVar.f252699k;
        boolean z = cVar.f252702n;
        this.f252702n = false;
        boolean z2 = cVar.f252703o;
        this.f252703o = false;
        boolean z3 = cVar.f252704p;
        this.f252704p = false;
        this.f252700l = cVar.f252700l;
        this.f252706r = cVar.f252706r;
        this.f252709u = cVar.f252709u;
        this.f252701m = cVar.f252701m;
        this.f252710v = cVar.f252710v;
        this.f252711w = cVar.f252711w;
        this.f252707s = cVar.f252707s;
        this.f252693e = cVar.f252693e;
        this.f252708t = cVar.f252708t;
        this.f252713y = cVar.f252713y;
    }
}
