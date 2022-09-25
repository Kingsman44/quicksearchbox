package com.google.android.apps.gsa.staticplugins.p7714cv.p7722f;

import com.google.android.apps.gsa.assistant.shared.k;
import com.google.android.apps.gsa.shared.speech.C90603k;
import com.google.android.apps.gsa.shared.speech.C90604l;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.speech.p7269b.C92216a;
import com.google.android.apps.gsa.speech.p7269b.C92217b;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7723g.C98769p;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7724h.C98774a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.speech.p5208h.C66610ch;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.f.f */
/* compiled from: PG */
public final class C98751f implements C92217b {

    /* renamed from: a */
    private static final C59071e f275861a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.f.f");

    /* renamed from: b */
    private final Map f275862b = new HashMap();

    /* renamed from: c */
    private final C92216a f275863c;

    /* renamed from: d */
    private final boolean f275864d;

    /* renamed from: e */
    private final AtomicBoolean f275865e = new AtomicBoolean(false);

    public C98751f(C92216a aVar, boolean z) {
        this.f275863c = aVar;
        this.f275864d = z;
    }

    /* renamed from: f */
    private final synchronized void m163589f(Class cls, C90603k kVar) {
        C98769p pVar = (C98769p) this.f275862b.get(cls);
        if (pVar != null) {
            pVar.mo91292a((C90603k) cls.cast(kVar));
        } else {
            ((C59052c) ((C59052c) f275861a.mo56226d()).mo56372aa(31075)).mo56354G("No RecognitionResponseProcessor found to handle response: %s, %s", cls, kVar);
        }
    }

    /* renamed from: g */
    private final synchronized void m163590g(C90603k kVar) {
        m163589f(kVar.getClass(), kVar);
    }

    /* renamed from: a */
    public final synchronized void mo70939a(C90528t tVar) {
        if (!this.f275865e.get()) {
            this.f275863c.mo70939a(tVar);
        }
    }

    /* renamed from: b */
    public final synchronized void mo70940b(C90528t tVar) {
        if (!this.f275865e.get()) {
            this.f275863c.mo70940b(tVar);
        }
    }

    /* renamed from: c */
    public final synchronized void mo70941c(C90603k kVar) {
        if (kVar.getClass() == C98774a.class) {
            if (k.c(((C98774a) kVar).f275926a)) {
                m163590g(kVar);
                return;
            }
        }
        if (this.f275865e.get()) {
            if (kVar instanceof C90604l) {
                C66610ch a = C66610ch.m97260a(((C90604l) kVar).f253275a.f181209b);
                if (a == null) {
                    a = C66610ch.IN_PROGRESS;
                }
                if (a != C66610ch.DONE_SUCCESS) {
                    return;
                }
            } else {
                return;
            }
        }
        m163589f(kVar.getClass(), kVar);
    }

    /* renamed from: d */
    public final void mo86897d() {
        if (this.f275864d) {
            this.f275865e.set(true);
        }
    }

    /* renamed from: e */
    public final synchronized void mo91291e(Class cls, C98769p pVar) {
        if (!this.f275862b.containsKey(cls)) {
            this.f275862b.put(cls, pVar);
        } else {
            throw new IllegalStateException("Already have a RecognitionResponseProcessor for ".concat(String.valueOf(cls.getCanonicalName())));
        }
    }
}
