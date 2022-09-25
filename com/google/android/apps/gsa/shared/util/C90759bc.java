package com.google.android.apps.gsa.shared.util;

import com.google.android.libraries.gsa.util.C23341f;
import com.google.common.base.C58838bb;
import java.util.Iterator;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.shared.util.bc */
/* compiled from: PG */
public final class C90759bc implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    private final CharSequence f253834a;

    /* renamed from: b */
    private final int f253835b;

    /* renamed from: c */
    private final boolean f253836c;

    /* renamed from: d */
    private int f253837d;

    /* renamed from: e */
    private int f253838e;

    /* renamed from: f */
    private int f253839f;

    protected C90759bc(CharSequence charSequence, int i, boolean z) {
        this.f253834a = charSequence;
        this.f253835b = i;
        this.f253836c = z;
        m148250e();
    }

    /* renamed from: a */
    public static C90759bc m148247a(CharSequence charSequence, char c) {
        return new C90759bc(charSequence, c, false);
    }

    /* renamed from: b */
    public static C90759bc m148248b(CharSequence charSequence, char c) {
        return new C90759bc(charSequence, c, true);
    }

    /* renamed from: c */
    public static C90759bc m148249c(CharSequence charSequence) {
        return new C90759bc(charSequence, -1, false);
    }

    /* renamed from: e */
    private final void m148250e() {
        int i;
        int i2;
        C58838bb.m90883r(this.f253837d != -1);
        int i3 = this.f253835b;
        if (i3 != -1) {
            int length = this.f253834a.length();
            do {
                i = this.f253839f;
                if (i != -1) {
                    i2 = i;
                    while (i2 != length && this.f253834a.charAt(i2) != i3) {
                        i2++;
                    }
                    this.f253839f = i2 == length ? -1 : i2 + 1;
                    if (this.f253836c) {
                        int a = C23341f.m43774a(this.f253834a, i, i2);
                        if (a == -1) {
                            i = i2;
                            continue;
                        } else {
                            this.f253837d = a;
                            this.f253838e = C23341f.m43775b(this.f253834a, a, i2) + 1;
                            return;
                        }
                    }
                } else {
                    this.f253837d = -1;
                    return;
                }
            } while (i == i2);
            this.f253837d = i;
            this.f253838e = i2;
        } else if (this.f253839f == -1) {
            this.f253837d = -1;
        } else {
            int length2 = this.f253834a.length();
            int a2 = C23341f.m43774a(this.f253834a, this.f253839f, length2);
            this.f253837d = a2;
            if (a2 != -1) {
                CharSequence charSequence = this.f253834a;
                int i4 = a2 + 1;
                while (true) {
                    if (i4 < length2) {
                        if (Character.isWhitespace(charSequence.charAt(i4))) {
                            break;
                        }
                        i4++;
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                this.f253838e = i4;
                if (i4 != -1) {
                    this.f253839f = i4 + 1;
                    return;
                }
                this.f253838e = length2;
                this.f253839f = -1;
            }
        }
    }

    /* renamed from: d */
    public final String next() {
        String obj = this.f253834a.subSequence(this.f253837d, this.f253838e).toString();
        m148250e();
        return obj;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f253837d != -1;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
