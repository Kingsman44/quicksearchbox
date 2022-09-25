package com.android.p275j;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.C31824b;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.android.j.r */
/* compiled from: PG */
public abstract class C5206r implements Comparable {

    /* renamed from: a */
    public final C5187aa f16513a;

    /* renamed from: b */
    public final String f16514b;

    /* renamed from: c */
    public final int f16515c;

    /* renamed from: d */
    public final Object f16516d;

    /* renamed from: e */
    public Integer f16517e;

    /* renamed from: f */
    public C5209u f16518f;

    /* renamed from: g */
    public final boolean f16519g;

    /* renamed from: h */
    public boolean f16520h;

    /* renamed from: i */
    public boolean f16521i;

    /* renamed from: j */
    public C5190b f16522j;

    /* renamed from: k */
    public C31824b f16523k;

    /* renamed from: l */
    public final C5195g f16524l;

    /* renamed from: m */
    public C5189ac f16525m;

    public C5206r(String str, C31824b bVar) {
        Uri parse;
        String host;
        this.f16513a = C5187aa.f16464a ? new C5187aa() : null;
        this.f16516d = new Object();
        this.f16519g = true;
        int i = 0;
        this.f16520h = false;
        this.f16521i = false;
        this.f16522j = null;
        this.f16514b = str;
        this.f16523k = bVar;
        this.f16524l = new C5195g();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i = host.hashCode();
        }
        this.f16515c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C5210v mo10267a(C5202n nVar);

    /* renamed from: b */
    public Map mo10292b() {
        return Collections.emptyMap();
    }

    /* renamed from: c */
    public final void mo10293c(String str) {
        if (C5187aa.f16464a) {
            this.f16513a.mo10274a(str, Thread.currentThread().getId());
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f16517e.intValue() - ((C5206r) obj).f16517e.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo10268d(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo10295e(String str) {
        C5209u uVar = this.f16518f;
        if (uVar != null) {
            synchronized (uVar.f16527b) {
                uVar.f16527b.remove(this);
            }
            synchronized (uVar.f16533h) {
                for (C5208t a : uVar.f16533h) {
                    a.mo10303a();
                }
            }
            uVar.mo10304a();
        }
        if (C5187aa.f16464a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new C5205q(this, str, id));
                return;
            }
            this.f16513a.mo10274a(str, id);
            this.f16513a.mo10275b(toString());
        }
    }

    /* renamed from: f */
    public final void mo10296f() {
        synchronized (this.f16516d) {
            this.f16521i = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo10297g() {
        C5189ac acVar;
        synchronized (this.f16516d) {
            acVar = this.f16525m;
        }
        if (acVar != null) {
            acVar.mo10277a(this);
        }
    }

    /* renamed from: h */
    public final boolean mo10298h() {
        boolean z;
        synchronized (this.f16516d) {
            z = this.f16520h;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo10299i(C5189ac acVar) {
        synchronized (this.f16516d) {
            this.f16525m = acVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo10300j() {
        C5209u uVar = this.f16518f;
        if (uVar != null) {
            uVar.mo10304a();
        }
    }

    public final String toString() {
        String concat = "0x".concat(String.valueOf(Integer.toHexString(this.f16515c)));
        String str = true != mo10298h() ? "[ ] " : "[X] ";
        String str2 = this.f16514b;
        Integer num = this.f16517e;
        return str + str2 + " " + concat + " NORMAL " + num;
    }
}
