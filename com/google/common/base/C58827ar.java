package com.google.common.base;

import java.io.IOException;
import java.util.Iterator;
import p3186j$.util.Objects;

/* renamed from: com.google.common.base.ar */
/* compiled from: PG */
public class C58827ar {

    /* renamed from: c */
    public final String f156623c;

    public C58827ar(C58827ar arVar) {
        this.f156623c = arVar.f156623c;
    }

    public C58827ar(String str) {
        str.getClass();
        this.f156623c = str;
    }

    /* renamed from: c */
    public static C58827ar m90818c(char c) {
        return new C58827ar(String.valueOf(c));
    }

    /* renamed from: a */
    public CharSequence mo56091a(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    /* renamed from: d */
    public final String mo56097d(Iterable iterable) {
        return mo56098e(iterable.iterator());
    }

    /* renamed from: e */
    public final String mo56098e(Iterator it) {
        StringBuilder sb = new StringBuilder();
        mo56099f(sb, it);
        return sb.toString();
    }

    /* renamed from: f */
    public final void mo56099f(StringBuilder sb, Iterator it) {
        try {
            mo56092b(sb, it);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: g */
    public final void mo56100g(StringBuilder sb, Iterable iterable) {
        mo56099f(sb, iterable.iterator());
    }

    /* renamed from: b */
    public void mo56092b(Appendable appendable, Iterator it) {
        appendable.getClass();
        if (it.hasNext()) {
            appendable.append(mo56091a(it.next()));
            while (it.hasNext()) {
                appendable.append(this.f156623c);
                appendable.append(mo56091a(it.next()));
            }
        }
    }
}
