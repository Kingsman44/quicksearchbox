package com.google.apps.tiktok.tracing.contrib.p3716l;

import com.google.android.libraries.search.rendering.xuikit.p3131d.p3143l.C40480q;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47562bm;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.C47864x;
import com.google.common.base.C58827ar;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Arrays;

/* renamed from: com.google.apps.tiktok.tracing.contrib.l.b */
/* compiled from: PG */
public final class C47749b implements C40480q {

    /* renamed from: a */
    private static final C58827ar f123719a = C58827ar.m90818c('.');

    /* renamed from: b */
    private static final C59071e f123720b = C59071e.m91332i("com.google.apps.tiktok.tracing.contrib.l.b");

    /* renamed from: c */
    private final C47770dh f123721c;

    public C47749b(C47770dh dhVar) {
        this.f123721c = dhVar;
    }

    /* renamed from: c */
    private final Object m84905c(C58881cr crVar, String str, String... strArr) {
        if (C47831fm.m85027v()) {
            return crVar.mo6453a();
        }
        C47538ax e = this.f123721c.mo51615e(m84906d(str, strArr), C47562bm.f123426a);
        try {
            Object a = crVar.mo6453a();
            if (e != null) {
                e.close();
            }
            return a;
        } catch (Throwable th) {
            C47748a.m84904a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    private static String m84906d(String str, String[] strArr) {
        if (strArr.length == 0) {
            return str;
        }
        String d = f123719a.mo56097d(Arrays.asList(strArr));
        return str + "." + d;
    }

    /* renamed from: e */
    private final void m84907e(Runnable runnable, String str, String... strArr) {
        if (C47831fm.m85027v()) {
            runnable.run();
            return;
        }
        C47538ax e = this.f123721c.mo51615e(m84906d(str, strArr), C47562bm.f123426a);
        try {
            runnable.run();
            if (e != null) {
                e.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47748a.m84904a(th, th);
        }
        throw th;
    }

    /* renamed from: f */
    private static final C47538ax m84908f() {
        if (!(C47831fm.m85009d() instanceof C47864x)) {
            return null;
        }
        ((C59052c) ((C59052c) f123720b.mo56226d()).mo56372aa(54786)).mo56386p("Temporarily overriding an ErrorTrace");
        return C47831fm.m85030y((C47538ax) null);
    }

    /* renamed from: a */
    public final Object mo42464a(C58881cr crVar, String str, String... strArr) {
        C47538ax f = m84908f();
        if (f == null) {
            return m84905c(crVar, str, strArr);
        }
        try {
            return m84905c(crVar, str, strArr);
        } finally {
            C47831fm.m85030y(f);
        }
    }

    /* renamed from: b */
    public final void mo42465b(Runnable runnable, String str, String... strArr) {
        C47538ax f = m84908f();
        if (f != null) {
            try {
                m84907e(runnable, str, strArr);
            } finally {
                C47831fm.m85030y(f);
            }
        } else {
            m84907e(runnable, str, strArr);
        }
    }
}
