package com.google.common.p4522b;

import com.evernote.android.state.BuildConfig;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.b.rv */
/* compiled from: PG */
public final class C58783rv extends C58780rs implements C58785rx {
    public C58783rv(C58785rx rxVar) {
        super(rxVar, (Object) null);
    }

    /* renamed from: a */
    public final Object mo55009a(Object obj, Object obj2) {
        Object a;
        synchronized (this.f156562b) {
            a = ((C58785rx) this.f156561a).mo55009a(obj, BuildConfig.FLAVOR);
        }
        return a;
    }

    /* renamed from: b */
    public final Object mo55010b(Object obj, Object obj2, Object obj3) {
        Object b;
        synchronized (this.f156562b) {
            b = ((C58785rx) this.f156561a).mo55010b(obj, BuildConfig.FLAVOR, obj3);
        }
        return b;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f156562b) {
            equals = ((C58785rx) this.f156561a).equals(obj);
        }
        return equals;
    }

    /* renamed from: g */
    public final Set mo55016g() {
        C58782ru ruVar;
        synchronized (this.f156562b) {
            ruVar = new C58782ru(((C58785rx) this.f156561a).mo55016g(), this.f156562b);
        }
        return ruVar;
    }

    public final int hashCode() {
        int hashCode;
        synchronized (this.f156562b) {
            hashCode = ((C58785rx) this.f156561a).hashCode();
        }
        return hashCode;
    }

    /* renamed from: i */
    public final void mo55019i() {
        throw null;
    }

    /* renamed from: j */
    public final void mo55020j(C58785rx rxVar) {
        throw null;
    }

    /* renamed from: k */
    public final boolean mo55021k(Object obj, Object obj2) {
        boolean k;
        synchronized (this.f156562b) {
            k = ((C58785rx) this.f156561a).mo55021k(obj, BuildConfig.FLAVOR);
        }
        return k;
    }

    /* renamed from: n */
    public final int mo55196n() {
        throw null;
    }

    /* renamed from: t */
    public final Map mo55202t() {
        throw null;
    }
}
