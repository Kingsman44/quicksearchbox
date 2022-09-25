package com.google.common.p4522b;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.b.ja */
/* compiled from: PG */
public abstract class C58546ja extends C58328az implements Serializable {
    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: x */
    static C58784rw m90096x(Object obj, Object obj2, Object obj3) {
        C58838bb.m90866a(obj, "rowKey");
        C58838bb.m90866a(obj2, "columnKey");
        C58838bb.m90866a(obj3, "value");
        return new C58787rz(obj, obj2, obj3);
    }

    @Deprecated
    /* renamed from: b */
    public final Object mo55010b(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Iterator mo55013e() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: f */
    public final Iterator mo55015f() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: g */
    public final /* synthetic */ Set mo55016g() {
        return (C58528ij) super.mo55016g();
    }

    @Deprecated
    /* renamed from: i */
    public final void mo55019i() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public final boolean mo55021k(Object obj, Object obj2) {
        return mo55009a(obj, BuildConfig.FLAVOR) != null;
    }

    /* renamed from: l */
    public final boolean mo55022l(Object obj) {
        return ((C58471gg) super.mo55012d()).contains(obj);
    }

    /* renamed from: o */
    public abstract C58495hd mo55197o();

    /* renamed from: p */
    public abstract C58495hd mo55198p();

    /* renamed from: q */
    public abstract C58544iz mo55199q();

    /* renamed from: t */
    public /* bridge */ /* synthetic */ Map mo55202t() {
        throw null;
    }

    /* renamed from: u */
    public final C58471gg mo55542u() {
        return (C58471gg) super.mo55012d();
    }

    /* renamed from: v */
    public final C58495hd mo55543v(Object obj) {
        C58838bb.m90866a(obj, "rowKey");
        return (C58495hd) C58831av.m90830c((C58495hd) mo55198p().get(obj), C58729pv.f156485a);
    }

    /* renamed from: w */
    public final C58528ij mo55544w() {
        return (C58528ij) super.mo55016g();
    }

    /* access modifiers changed from: package-private */
    public final Object writeReplace() {
        return mo55199q();
    }
}
