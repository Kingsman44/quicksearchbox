package com.google.common.p4522b;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.google.common.b.ge */
/* compiled from: PG */
public class C58469ge extends C58470gf {

    /* renamed from: a */
    Object[] f156094a;

    /* renamed from: b */
    int f156095b = 0;

    /* renamed from: c */
    boolean f156096c;

    public C58469ge(int i) {
        C58371co.m89408c(i, "initialCapacity");
        this.f156094a = new Object[i];
    }

    /* renamed from: f */
    private final void m89785f(int i) {
        Object[] objArr = this.f156094a;
        int length = objArr.length;
        if (length < i) {
            this.f156094a = Arrays.copyOf(objArr, m89790e(length, i));
            this.f156096c = false;
        } else if (this.f156096c) {
            this.f156094a = (Object[]) objArr.clone();
            this.f156096c = false;
        }
    }

    /* renamed from: a */
    public final void mo55371a(Object[] objArr, int i) {
        C58704ox.m90451d(objArr, i);
        m89785f(this.f156095b + i);
        System.arraycopy(objArr, 0, this.f156094a, this.f156095b, i);
        this.f156095b += i;
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo55373c(Object obj) {
        throw null;
    }

    /* renamed from: d */
    public final void mo55374d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            m89785f(this.f156095b + collection.size());
            if (collection instanceof C58471gg) {
                this.f156095b = ((C58471gg) collection).mo55383w(this.f156094a, this.f156095b);
                return;
            }
        }
        super.mo55374d(iterable);
    }

    /* renamed from: b */
    public final void mo55372b(Object obj) {
        obj.getClass();
        m89785f(this.f156095b + 1);
        Object[] objArr = this.f156094a;
        int i = this.f156095b;
        this.f156095b = i + 1;
        objArr[i] = obj;
    }
}
